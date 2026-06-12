package com.pichillilorenzo.flutter_inappwebview_android.types;

import F4.o;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.HashMap;
import android.util.Log;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import android.webkit.WebResourceResponse;
import F4.p;
import m0.a;
import java.util.Iterator;
import F0.t;
import F0.s;
import F0.r;
import java.io.File;
import N.b;
import java.util.ArrayList;
import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import java.util.Map;
import F0.u;
import java.util.List;

public class WebViewAssetLoaderExt implements Disposable
{
    public List<PathHandlerExt> customPathHandlers;
    public u loader;
    
    public WebViewAssetLoaderExt(final u loader, final List<PathHandlerExt> customPathHandlers) {
        this.loader = loader;
        this.customPathHandlers = customPathHandlers;
    }
    
    public static WebViewAssetLoaderExt fromMap(final Map<String, Object> map, final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, final Context context) {
        if (map == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        final String s = (String)map.get((Object)"domain");
        final Boolean b = (Boolean)map.get((Object)"httpAllowed");
        final List list2 = (List)map.get((Object)"pathHandlers");
        final ArrayList list3 = new ArrayList();
        String s2;
        if (s != null && !s.isEmpty()) {
            s2 = s;
        }
        else {
            s2 = "appassets.androidplatform.net";
        }
        final boolean b2 = b != null && b;
        if (list2 != null) {
            for (final Map map2 : list2) {
                final String s3 = (String)map2.get((Object)"type");
                final String s4 = (String)map2.get((Object)"path");
                if (s3 != null) {
                    if (s4 == null) {
                        continue;
                    }
                    int n = -1;
                    switch (s3.hashCode()) {
                        case 1490480039: {
                            if (!s3.equals((Object)"InternalStoragePathHandler")) {
                                break;
                            }
                            n = 2;
                            break;
                        }
                        case -667829310: {
                            if (!s3.equals((Object)"AssetsPathHandler")) {
                                break;
                            }
                            n = 1;
                            break;
                        }
                        case -1506882528: {
                            if (!s3.equals((Object)"ResourcesPathHandler")) {
                                break;
                            }
                            n = 0;
                            break;
                        }
                    }
                    switch (n) {
                        default: {
                            final String s5 = (String)map2.get((Object)"id");
                            if (s5 == null) {
                                continue;
                            }
                            final PathHandlerExt pathHandlerExt = new PathHandlerExt(s5, inAppWebViewFlutterPlugin);
                            list.add((Object)new b((Object)s4, (Object)pathHandlerExt));
                            list3.add((Object)pathHandlerExt);
                            continue;
                        }
                        case 2: {
                            final String s6 = (String)map2.get((Object)"directory");
                            if (s6 == null) {
                                continue;
                            }
                            list.add((Object)new b((Object)s4, (Object)new r(context, new File(s6))));
                            continue;
                        }
                        case 1: {
                            list.add((Object)new b((Object)s4, (Object)new r(context, 0)));
                            continue;
                        }
                        case 0: {
                            list.add((Object)new b((Object)s4, (Object)new r(context, 1)));
                            continue;
                        }
                    }
                }
            }
        }
        final ArrayList list4 = new ArrayList();
        for (final b b3 : list) {
            list4.add((Object)new t(s2, (String)b3.a, b2, (s)b3.b));
        }
        return new WebViewAssetLoaderExt(new u(list4), (List<PathHandlerExt>)list3);
    }
    
    @Override
    public void dispose() {
        final Iterator iterator = this.customPathHandlers.iterator();
        while (iterator.hasNext()) {
            ((PathHandlerExt)iterator.next()).dispose();
        }
        this.customPathHandlers.clear();
    }
    
    public static class PathHandlerExt implements s, Disposable
    {
        protected static final String LOG_TAG = "PathHandlerExt";
        public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_custompathhandler_";
        public PathHandlerExtChannelDelegate channelDelegate;
        public String id;
        
        public PathHandlerExt(final String id, final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
            this.id = id;
            this.channelDelegate = new PathHandlerExtChannelDelegate(this, new p(inAppWebViewFlutterPlugin.messenger, a.f("com.pichillilorenzo/flutter_inappwebview_custompathhandler_", id)));
        }
        
        public void dispose() {
            final PathHandlerExtChannelDelegate channelDelegate = this.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.dispose();
                this.channelDelegate = null;
            }
        }
        
        public WebResourceResponse handle(final String s) {
            final PathHandlerExtChannelDelegate channelDelegate = this.channelDelegate;
            final InputStream inputStream = null;
            if (channelDelegate != null) {
                try {
                    final WebResourceResponseExt handle = channelDelegate.handle(s);
                    if (handle != null) {
                        final String contentType = handle.getContentType();
                        final String contentEncoding = handle.getContentEncoding();
                        final byte[] data = handle.getData();
                        final Map<String, String> headers = handle.getHeaders();
                        final Integer statusCode = handle.getStatusCode();
                        final String reasonPhrase = handle.getReasonPhrase();
                        Object o = inputStream;
                        if (data != null) {
                            o = new ByteArrayInputStream(data);
                        }
                        if (statusCode != null && reasonPhrase != null) {
                            return new WebResourceResponse(contentType, contentEncoding, (int)statusCode, reasonPhrase, (Map)headers, (InputStream)o);
                        }
                        return new WebResourceResponse(contentType, contentEncoding, (InputStream)o);
                    }
                }
                catch (final InterruptedException ex) {
                    Log.e("PathHandlerExt", "", (Throwable)ex);
                }
            }
            return null;
        }
    }
    
    public static class PathHandlerExtChannelDelegate extends ChannelDelegateImpl
    {
        private PathHandlerExt pathHandler;
        
        public PathHandlerExtChannelDelegate(final PathHandlerExt pathHandler, final p p2) {
            super(p2);
            this.pathHandler = pathHandler;
        }
        
        @Override
        public void dispose() {
            super.dispose();
            this.pathHandler = null;
        }
        
        public WebResourceResponseExt handle(final String s) {
            final p channel = this.getChannel();
            if (channel == null) {
                return null;
            }
            final SyncHandleCallback syncHandleCallback = new SyncHandleCallback();
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"path", (Object)s);
            return Util.invokeMethodAndWaitResult(channel, "handle", hashMap, (SyncBaseCallbackResultImpl<WebResourceResponseExt>)syncHandleCallback);
        }
        
        public void handle(final String s, final HandleCallback handleCallback) {
            final p channel = this.getChannel();
            if (channel == null) {
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"path", (Object)s);
            channel.a("handle", (Object)hashMap, (o)handleCallback);
        }
        
        public static class HandleCallback extends BaseCallbackResultImpl<WebResourceResponseExt>
        {
            @Override
            public WebResourceResponseExt decodeResult(final Object o) {
                return WebResourceResponseExt.fromMap((Map<String, Object>)o);
            }
        }
        
        public static class SyncHandleCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
        {
            @Override
            public WebResourceResponseExt decodeResult(final Object o) {
                return new HandleCallback().decodeResult(o);
            }
        }
    }
}

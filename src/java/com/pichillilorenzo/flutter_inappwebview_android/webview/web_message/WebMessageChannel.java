package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import G0.c;
import java.util.HashMap;
import java.util.Map;
import android.webkit.WebMessagePort$WebMessageCallback;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
import G0.E;
import java.util.Iterator;
import F0.n;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import android.webkit.ValueCallback;
import F0.d;
import android.net.Uri;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import G0.u;
import G0.z;
import F0.w;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import F4.p;
import m0.a;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import F0.o;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class WebMessageChannel implements Disposable
{
    protected static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<o> compatPorts;
    public String id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;
    
    public WebMessageChannel(final String id, final InAppWebViewInterface webView) {
        this.id = id;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new p(webView.getPlugin().messenger, a.f("com.pichillilorenzo/flutter_inappwebview_web_message_channel_", id)));
        if (webView instanceof InAppWebView) {
            final InAppWebView inAppWebView = (InAppWebView)webView;
            final Uri a = w.a;
            z.w.getClass();
            final android.webkit.WebMessagePort[] webMessageChannel = inAppWebView.createWebMessageChannel();
            Object[] array;
            if (webMessageChannel == null) {
                array = null;
            }
            else {
                array = new o[webMessageChannel.length];
                for (int i = 0; i < webMessageChannel.length; ++i) {
                    array[i] = new u(webMessageChannel[i]);
                }
            }
            this.compatPorts = (List<o>)new ArrayList((Collection)Arrays.asList(array));
            this.ports = (List<WebMessagePort>)new ArrayList();
        }
        else {
            this.ports = (List<WebMessagePort>)Arrays.asList((Object[])new WebMessagePort[] { new WebMessagePort("port1", this), new WebMessagePort("port2", this) });
            this.compatPorts = (List<o>)new ArrayList();
        }
        this.webView = webView;
    }
    
    public void closeForInAppWebView(final Integer n, final F4.o o) {
        if (this.webView != null && this.compatPorts.size() > 0 && d.a("WEB_MESSAGE_PORT_CLOSE")) {
            final o o2 = (o)this.compatPorts.get((int)n);
            try {
                final u u = (u)o2;
                u.getClass();
                z.t.getClass();
                u.d().close();
                o.success((Object)Boolean.TRUE);
            }
            catch (final Exception ex) {
                o.error("WebMessageChannel", ((Throwable)ex).getMessage(), (Object)null);
            }
        }
        else {
            o.success((Object)Boolean.TRUE);
        }
    }
    
    @Override
    public void dispose() {
        Label_0064: {
            if (!d.a("WEB_MESSAGE_PORT_CLOSE")) {
                break Label_0064;
            }
            Object o = this.compatPorts.iterator();
        Label_0082_Outer:
            while (true) {
                if (!((Iterator)o).hasNext()) {
                    break Label_0064;
                }
                final o o2 = (o)((Iterator)o).next();
                try {
                    final u u = (u)o2;
                    u.getClass();
                    z.t.getClass();
                    u.d().close();
                    continue Label_0082_Outer;
                    o = this.channelDelegate;
                    iftrue(Label_0082:)(o == null);
                    while (true) {
                        Block_5: {
                            break Block_5;
                            this.compatPorts.clear();
                            this.webView = null;
                            return;
                        }
                        ((WebMessageChannelChannelDelegate)o).dispose();
                        this.channelDelegate = null;
                        continue;
                    }
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public void initJsInstance(final InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript(x.a.b(new StringBuilder("(function() {window.flutter_inappwebview._webMessageChannels['"), this.id, "'] = new MessageChannel();})();"), null, (ValueCallback<String>)new ValueCallback<String>(this, valueCallback, this) {
                final WebMessageChannel this$0;
                final ValueCallback val$callback;
                final WebMessageChannel val$webMessageChannel;
                
                public void onReceiveValue(final String s) {
                    this.val$callback.onReceiveValue((Object)this.val$webMessageChannel);
                }
            });
        }
        else {
            valueCallback.onReceiveValue((Object)this);
        }
    }
    
    public void onMessage(final int n, final WebMessageCompatExt webMessageCompatExt) {
        final WebMessageChannelChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onMessage(n, webMessageCompatExt);
        }
    }
    
    public void postMessageForInAppWebView(final Integer n, final WebMessageCompatExt webMessageCompatExt, final F4.o o) {
        if (this.webView != null && this.compatPorts.size() > 0 && d.a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            final o o2 = (o)this.compatPorts.get((int)n);
            final ArrayList list = new ArrayList();
            final List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
            if (ports != null) {
                for (final WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                    final WebMessageChannel webMessageChannel = (WebMessageChannel)this.webView.getWebMessageChannels().get((Object)webMessagePortCompatExt.getWebMessageChannelId());
                    if (webMessageChannel != null) {
                        list.add((Object)webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                    }
                }
            }
            final Object data = webMessageCompatExt.getData();
            Label_0262: {
                Label_0250: {
                    try {
                        if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) {
                            o2.a(new n((byte[])data, (o[])list.toArray((Object[])new o[0])));
                            break Label_0250;
                        }
                    }
                    catch (final Exception ex) {
                        break Label_0262;
                    }
                    String string;
                    if (data != null) {
                        string = data.toString();
                    }
                    else {
                        string = null;
                    }
                    o2.a(new n(string, (o[])list.toArray((Object[])new o[0])));
                }
                o.success((Object)Boolean.TRUE);
                return;
            }
            final Exception ex;
            o.error("WebMessageChannel", ((Throwable)ex).getMessage(), (Object)null);
        }
        else {
            o.success((Object)Boolean.TRUE);
        }
    }
    
    public void setWebMessageCallbackForInAppWebView(final int n, final F4.o o) {
        if (this.webView != null && this.compatPorts.size() > 0 && d.a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            final o o2 = (o)this.compatPorts.get(n);
            try {
                final d d = new d(this, this, n) {
                    final WebMessageChannel this$0;
                    final int val$index;
                    final WebMessageChannel val$webMessageChannel;
                    
                    public void onMessage(final o o, final n n) {
                        final WebMessageChannel val$webMessageChannel = this.val$webMessageChannel;
                        final int val$index = this.val$index;
                        WebMessageCompatExt fromMapWebMessageCompat;
                        if (n != null) {
                            fromMapWebMessageCompat = WebMessageCompatExt.fromMapWebMessageCompat(n);
                        }
                        else {
                            fromMapWebMessageCompat = null;
                        }
                        val$webMessageChannel.onMessage(val$index, fromMapWebMessageCompat);
                    }
                };
                final u u = (u)o2;
                u.getClass();
                if (((c)z.v).b()) {
                    u.c().setWebMessageCallback((InvocationHandler)new J5.a((FeatureFlagHolderBoundaryInterface)new E((Object)d, 3)));
                }
                else {
                    u.d().setWebMessageCallback((WebMessagePort$WebMessageCallback)new G0.d((d)d));
                }
                o.success((Object)Boolean.TRUE);
            }
            catch (final Exception ex) {
                o.error("WebMessageChannel", ((Throwable)ex).getMessage(), (Object)null);
            }
        }
        else {
            o.success((Object)Boolean.TRUE);
        }
    }
    
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)this.id);
        return (Map<String, Object>)hashMap;
    }
}

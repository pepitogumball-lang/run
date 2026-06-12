package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import G0.E;
import F0.j;
import G0.z;
import F0.d;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl
{
    private ServiceWorkerManager serviceWorkerManager;
    
    public ServiceWorkerChannelDelegate(final ServiceWorkerManager serviceWorkerManager, final p p2) {
        super(p2);
        this.serviceWorkerManager = serviceWorkerManager;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        ServiceWorkerManager.init();
        final j serviceWorkerController = ServiceWorkerManager.serviceWorkerController;
        E c;
        if (serviceWorkerController != null) {
            c = ((G0.p)serviceWorkerController).c;
        }
        else {
            c = null;
        }
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 1694822198: {
                if (!a.equals((Object)"getBlockNetworkLoads")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1594928487: {
                if (!a.equals((Object)"setAllowFileAccess")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1203480182: {
                if (!a.equals((Object)"setAllowContentAccess")) {
                    break;
                }
                n = 6;
                break;
            }
            case 1083898794: {
                if (!a.equals((Object)"setBlockNetworkLoads")) {
                    break;
                }
                n = 5;
                break;
            }
            case 985595395: {
                if (!a.equals((Object)"setCacheMode")) {
                    break;
                }
                n = 4;
                break;
            }
            case 674894835: {
                if (!a.equals((Object)"getAllowFileAccess")) {
                    break;
                }
                n = 3;
                break;
            }
            case -563397233: {
                if (!a.equals((Object)"getCacheMode")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1165005700: {
                if (!a.equals((Object)"setServiceWorkerClient")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1332730774: {
                if (!a.equals((Object)"getAllowContentAccess")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                o.notImplemented();
                break;
            }
            case 8: {
                if (c != null && d.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    z.l.getClass();
                    o.success((Object)c.e().getBlockNetworkLoads());
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 7: {
                if (c != null && d.a("SERVICE_WORKER_FILE_ACCESS")) {
                    final boolean booleanValue = (boolean)m.a("allow");
                    z.k.getClass();
                    c.e().setAllowFileAccess(booleanValue);
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 6: {
                if (c != null && d.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    final boolean booleanValue2 = (boolean)m.a("allow");
                    z.j.getClass();
                    c.e().setAllowContentAccess(booleanValue2);
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 5: {
                if (c != null && d.a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    final boolean booleanValue3 = (boolean)m.a("flag");
                    z.l.getClass();
                    c.e().setBlockNetworkLoads(booleanValue3);
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 4: {
                if (c != null && d.a("SERVICE_WORKER_CACHE_MODE")) {
                    final int intValue = (int)m.a("mode");
                    z.i.getClass();
                    c.e().setCacheMode(intValue);
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 3: {
                if (c != null && d.a("SERVICE_WORKER_FILE_ACCESS")) {
                    z.k.getClass();
                    o.success((Object)c.e().getAllowFileAccess());
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 2: {
                if (c != null && d.a("SERVICE_WORKER_CACHE_MODE")) {
                    z.i.getClass();
                    o.success((Object)c.e().getCacheMode());
                    break;
                }
                o.success((Object)null);
                break;
            }
            case 1: {
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean)m.a("isNull"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                if (c != null && d.a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    z.j.getClass();
                    o.success((Object)c.e().getAllowContentAccess());
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
    
    public WebResourceResponseExt shouldInterceptRequest(final WebResourceRequestExt webResourceRequestExt) {
        final p channel = this.getChannel();
        if (channel == null) {
            return null;
        }
        return Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), (SyncBaseCallbackResultImpl<WebResourceResponseExt>)new SyncShouldInterceptRequestCallback());
    }
    
    public void shouldInterceptRequest(final WebResourceRequestExt webResourceRequestExt, final ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("shouldInterceptRequest", (Object)webResourceRequestExt.toMap(), (o)shouldInterceptRequestCallback);
    }
    
    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt>
    {
        @Override
        public WebResourceResponseExt decodeResult(final Object o) {
            return WebResourceResponseExt.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
    {
        @Override
        public WebResourceResponseExt decodeResult(final Object o) {
            return new ShouldInterceptRequestCallback().decodeResult(o);
        }
    }
}

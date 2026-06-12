package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import G0.z;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import java.io.InputStream;
import java.util.Map;
import java.io.ByteArrayInputStream;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import android.webkit.WebResourceResponse;
import android.webkit.WebResourceRequest;
import F0.i;
import F0.d;
import F0.h;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import F0.j;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class ServiceWorkerManager implements Disposable
{
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static j serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;
    
    public ServiceWorkerManager(final InAppWebViewFlutterPlugin plugin) {
        this.plugin = plugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller"));
    }
    
    private h dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }
    
    public static void init() {
        if (ServiceWorkerManager.serviceWorkerController == null && d.a("SERVICE_WORKER_BASIC_USAGE")) {
            ServiceWorkerManager.serviceWorkerController = (j)i.a;
        }
    }
    
    @Override
    public void dispose() {
        final ServiceWorkerChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
    
    public void setServiceWorkerClient(final Boolean b) {
        final j serviceWorkerController = ServiceWorkerManager.serviceWorkerController;
        if (serviceWorkerController != null) {
            h dummyServiceWorkerClientCompat;
            if (b) {
                dummyServiceWorkerClientCompat = this.dummyServiceWorkerClientCompat();
            }
            else {
                dummyServiceWorkerClientCompat = new h(this) {
                    final ServiceWorkerManager this$0;
                    
                    public WebResourceResponse shouldInterceptRequest(final WebResourceRequest webResourceRequest) {
                        final WebResourceRequestExt fromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                        final ServiceWorkerChannelDelegate channelDelegate = this.this$0.channelDelegate;
                        final InputStream inputStream = null;
                        WebResourceResponseExt shouldInterceptRequest = null;
                        Label_0042: {
                            if (channelDelegate != null) {
                                try {
                                    shouldInterceptRequest = channelDelegate.shouldInterceptRequest(fromWebResourceRequest);
                                    break Label_0042;
                                }
                                catch (final InterruptedException ex) {
                                    Log.e("ServiceWorkerManager", "", (Throwable)ex);
                                    return null;
                                }
                            }
                            shouldInterceptRequest = null;
                        }
                        if (shouldInterceptRequest == null) {
                            return null;
                        }
                        final String contentType = shouldInterceptRequest.getContentType();
                        final String contentEncoding = shouldInterceptRequest.getContentEncoding();
                        final byte[] data = shouldInterceptRequest.getData();
                        final Map<String, String> headers = shouldInterceptRequest.getHeaders();
                        final Integer statusCode = shouldInterceptRequest.getStatusCode();
                        final String reasonPhrase = shouldInterceptRequest.getReasonPhrase();
                        Object o = inputStream;
                        if (data != null) {
                            o = new ByteArrayInputStream(data);
                        }
                        if (statusCode != null && reasonPhrase != null) {
                            return new WebResourceResponse(contentType, contentEncoding, (int)statusCode, reasonPhrase, (Map)headers, (InputStream)o);
                        }
                        return new WebResourceResponse(contentType, contentEncoding, (InputStream)o);
                    }
                };
            }
            final G0.p p = (G0.p)serviceWorkerController;
            z.h.getClass();
            if (dummyServiceWorkerClientCompat == null) {
                if (p.a == null) {
                    p.a = ServiceWorkerController.getInstance();
                }
                p.a.setServiceWorkerClient((ServiceWorkerClient)null);
            }
            else {
                if (p.a == null) {
                    p.a = ServiceWorkerController.getInstance();
                }
                p.a.setServiceWorkerClient((ServiceWorkerClient)new G0.i(dummyServiceWorkerClientCompat));
            }
        }
    }
    
    public static final class DummyServiceWorkerClientCompat extends h
    {
        static final h INSTANCE;
        
        static {
            INSTANCE = new DummyServiceWorkerClientCompat();
        }
        
        private DummyServiceWorkerClientCompat() {
        }
        
        public WebResourceResponse shouldInterceptRequest(final WebResourceRequest webResourceRequest) {
            return null;
        }
    }
}

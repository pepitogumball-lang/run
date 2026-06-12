package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import com.google.android.gms.internal.measurement.L;
import v.e;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import F0.x;
import android.webkit.WebView;
import F0.d;

public class InAppWebViewRenderProcessClient extends d
{
    protected static final String LOG_TAG = "IAWRenderProcessClient";
    
    public void dispose() {
    }
    
    public void onRenderProcessResponsive(final WebView webView, final x x) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final WebViewChannelDelegate.RenderProcessResponsiveCallback renderProcessResponsiveCallback = new WebViewChannelDelegate.RenderProcessResponsiveCallback(this, x) {
            final InAppWebViewRenderProcessClient this$0;
            final x val$renderer;
            
            @Override
            public void defaultBehaviour(final Integer n) {
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWRenderProcessClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final Integer n) {
                if (this.val$renderer != null) {
                    if (n == 0) {
                        if (d.a("WEB_VIEW_RENDERER_TERMINATE")) {
                            this.val$renderer.a();
                        }
                    }
                    return false;
                }
                return true;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onRenderProcessResponsive(inAppWebView.getUrl(), (WebViewChannelDelegate.RenderProcessResponsiveCallback)renderProcessResponsiveCallback);
        }
        else {
            renderProcessResponsiveCallback.defaultBehaviour((Object)null);
        }
    }
    
    public void onRenderProcessUnresponsive(final WebView webView, final x x) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final WebViewChannelDelegate.RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback(this, x) {
            final InAppWebViewRenderProcessClient this$0;
            final x val$renderer;
            
            @Override
            public void defaultBehaviour(final Integer n) {
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWRenderProcessClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final Integer n) {
                if (this.val$renderer != null) {
                    if (n == 0) {
                        if (d.a("WEB_VIEW_RENDERER_TERMINATE")) {
                            this.val$renderer.a();
                        }
                    }
                    return false;
                }
                return true;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onRenderProcessUnresponsive(inAppWebView.getUrl(), (WebViewChannelDelegate.RenderProcessUnresponsiveCallback)renderProcessUnresponsiveCallback);
        }
        else {
            renderProcessUnresponsiveCallback.defaultBehaviour((Object)null);
        }
    }
}

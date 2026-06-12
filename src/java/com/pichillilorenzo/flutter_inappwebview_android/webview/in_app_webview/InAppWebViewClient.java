package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import android.view.View;
import G0.z;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import android.net.Uri;
import android.view.KeyEvent;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import android.webkit.RenderProcessGoneDetail;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase;
import android.webkit.WebResourceError;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.net.URISyntaxException;
import android.util.Log;
import java.net.URI;
import android.graphics.Bitmap;
import android.webkit.CookieManager;
import com.google.android.gms.internal.measurement.L;
import v.e;
import F0.d;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import android.os.Message;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.ClientCertRequest;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.HttpAuthHandler;
import java.util.Map;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import java.util.List;
import android.webkit.WebViewClient;

public class InAppWebViewClient extends WebViewClient
{
    protected static final String LOG_TAG = "IAWebViewClient";
    private static List<URLCredential> credentialsProposed;
    private static int previousAuthRequestFailureCount;
    private InAppBrowserDelegate inAppBrowserDelegate;
    
    public InAppWebViewClient(final InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }
    
    public static /* synthetic */ List access$100() {
        return InAppWebViewClient.credentialsProposed;
    }
    
    public static /* synthetic */ List access$102(final List credentialsProposed) {
        return InAppWebViewClient.credentialsProposed = (List<URLCredential>)credentialsProposed;
    }
    
    public static /* synthetic */ int access$202(final int previousAuthRequestFailureCount) {
        return InAppWebViewClient.previousAuthRequestFailureCount = previousAuthRequestFailureCount;
    }
    
    public static /* synthetic */ void access$301(final InAppWebViewClient inAppWebViewClient, final WebView webView, final HttpAuthHandler httpAuthHandler, final String s, final String s2) {
        inAppWebViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, s, s2);
    }
    
    public static /* synthetic */ void access$401(final InAppWebViewClient inAppWebViewClient, final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        inAppWebViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
    }
    
    public static /* synthetic */ void access$501(final InAppWebViewClient inAppWebViewClient, final WebView webView, final ClientCertRequest clientCertRequest) {
        inAppWebViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
    }
    
    public static /* synthetic */ void access$601(final InAppWebViewClient inAppWebViewClient, final WebView webView, final WebResourceRequest webResourceRequest, final int n, final SafeBrowsingResponse safeBrowsingResponse) {
        inAppWebViewClient.onSafeBrowsingHit(webView, webResourceRequest, n, safeBrowsingResponse);
    }
    
    public static /* synthetic */ void access$701(final InAppWebViewClient inAppWebViewClient, final WebView webView, final Message message, final Message message2) {
        inAppWebViewClient.onFormResubmission(webView, message, message2);
    }
    
    private void allowShouldOverrideUrlLoading(final WebView webView, final String s, final Map<String, String> map, final boolean b) {
        if (b) {
            webView.loadUrl(s, (Map)map);
        }
    }
    
    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }
    
    public void doUpdateVisitedHistory(final WebView webView, String url, final boolean b) {
        super.doUpdateVisitedHistory(webView, url, b);
        url = webView.getUrl();
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didUpdateVisitedHistory(url);
        }
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onUpdateVisitedHistory(url, b);
        }
    }
    
    public void loadCustomJavaScriptOnPageFinished(final WebView webView) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentEnd(), (ValueCallback)null);
    }
    
    public void loadCustomJavaScriptOnPageStarted(final WebView webView) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        if (!d.a("DOCUMENT_START_SCRIPT")) {
            inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentStart(), (ValueCallback)null);
        }
    }
    
    public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final WebViewChannelDelegate.FormResubmissionCallback formResubmissionCallback = new WebViewChannelDelegate.FormResubmissionCallback(this, message2, message, webView) {
            final InAppWebViewClient this$0;
            final Message val$dontResend;
            final Message val$resend;
            final WebView val$view;
            
            @Override
            public void defaultBehaviour(final Integer n) {
                InAppWebViewClient.access$701(this.this$0, this.val$view, this.val$dontResend, this.val$resend);
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWebViewClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final Integer n) {
                if (n != 0) {
                    this.val$dontResend.sendToTarget();
                }
                else {
                    this.val$resend.sendToTarget();
                }
                return false;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onFormResubmission(inAppWebView.getUrl(), (WebViewChannelDelegate.FormResubmissionCallback)formResubmissionCallback);
        }
        else {
            formResubmissionCallback.defaultBehaviour((Object)null);
        }
    }
    
    public void onPageCommitVisible(final WebView webView, final String s) {
        super.onPageCommitVisible(webView, s);
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onPageCommitVisible(s);
        }
    }
    
    public void onPageFinished(final WebView webView, final String s) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        inAppWebView.isLoading = false;
        this.loadCustomJavaScriptOnPageFinished(inAppWebView);
        InAppWebViewClient.previousAuthRequestFailureCount = 0;
        InAppWebViewClient.credentialsProposed = null;
        super.onPageFinished(webView, s);
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFinishNavigation(s);
        }
        CookieManager.getInstance().flush();
        inAppWebView.evaluateJavascript("(function() {  if ((window.top == null || window.top === window) && window.flutter_inappwebview != null && window.flutter_inappwebview._platformReady == null) {    window.dispatchEvent(new Event('flutterInAppWebViewPlatformReady'));    window.flutter_inappwebview._platformReady = true;  }})();", (ValueCallback)null);
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onLoadStop(s);
        }
    }
    
    public void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        this.loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, s, bitmap);
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didStartNavigation(s);
        }
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onLoadStart(s);
        }
    }
    
    public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
        final String url = webView.getUrl();
        final String host = clientCertRequest.getHost();
        final int port = clientCertRequest.getPort();
        while (true) {
            Label_0056: {
                if (url == null) {
                    break Label_0056;
                }
                String scheme = null;
                Label_0063: {
                    try {
                        scheme = new URI(url).getScheme();
                        break Label_0063;
                    }
                    catch (final URISyntaxException ex) {
                        Log.e("IAWebViewClient", "", (Throwable)ex);
                    }
                    break Label_0056;
                }
                final ClientCertChallenge clientCertChallenge = new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes());
                final InAppWebView inAppWebView = (InAppWebView)webView;
                final WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback = new WebViewChannelDelegate.ReceivedClientCertRequestCallback(this, inAppWebView, clientCertRequest, webView) {
                    final InAppWebViewClient this$0;
                    final ClientCertRequest val$request;
                    final WebView val$view;
                    final InAppWebView val$webView;
                    
                    @Override
                    public void defaultBehaviour(final ClientCertResponse clientCertResponse) {
                        InAppWebViewClient.access$501(this.this$0, this.val$view, this.val$request);
                    }
                    
                    @Override
                    public void error(final String s, String s2, final Object o) {
                        final StringBuilder c = e.c(s, ", ");
                        if (s2 == null) {
                            s2 = "";
                        }
                        L.u(c, s2, "IAWebViewClient");
                        this.defaultBehaviour(null);
                    }
                    
                    @Override
                    public boolean nonNullSuccess(final ClientCertResponse clientCertResponse) {
                        final Integer action = clientCertResponse.getAction();
                        if (action != null && this.val$webView.plugin != null) {
                            final int intValue = action;
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    this.val$request.cancel();
                                }
                                else {
                                    this.val$request.ignore();
                                }
                            }
                            else {
                                final Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(this.val$webView.plugin, clientCertResponse.getCertificatePath(), clientCertResponse.getCertificatePassword(), clientCertResponse.getKeyStoreType());
                                if (loadPrivateKeyAndCertificate != null) {
                                    this.val$request.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                                }
                                else {
                                    this.val$request.cancel();
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                };
                final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
                if (channelDelegate != null) {
                    channelDelegate.onReceivedClientCertRequest(clientCertChallenge, (WebViewChannelDelegate.ReceivedClientCertRequestCallback)receivedClientCertRequestCallback);
                }
                else {
                    receivedClientCertRequestCallback.defaultBehaviour((Object)null);
                }
                return;
            }
            String scheme = "https";
            continue;
        }
    }
    
    public void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        if (inAppWebView.customSettings.disableDefaultErrorPage) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.isLoading = false;
        InAppWebViewClient.previousAuthRequestFailureCount = 0;
        InAppWebViewClient.credentialsProposed = null;
        final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFailNavigation(s2, n, s);
        }
        final WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(s2, null, false, false, true, "GET");
        final WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(n, s);
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
        }
        super.onReceivedError(webView, n, s, s2);
    }
    
    public void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        if (webResourceRequest.isForMainFrame()) {
            if (inAppWebView.customSettings.disableDefaultErrorPage) {
                inAppWebView.stopLoading();
                inAppWebView.loadUrl("about:blank");
            }
            inAppWebView.isLoading = false;
            InAppWebViewClient.previousAuthRequestFailureCount = 0;
            InAppWebViewClient.credentialsProposed = null;
            final InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
            if (inAppBrowserDelegate != null) {
                inAppBrowserDelegate.didFailNavigation(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(webResourceError));
        }
    }
    
    public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String s, final String s2) {
        final String url = webView.getUrl();
        String scheme;
        final String s3 = scheme = "https";
        int port = 0;
        Label_0083: {
            if (url != null) {
                scheme = s3;
                try {
                    scheme = s3;
                    final URI uri = new URI(url);
                    scheme = s3;
                    final String s4 = scheme = uri.getScheme();
                    port = uri.getPort();
                    scheme = s4;
                    break Label_0083;
                }
                catch (final URISyntaxException ex) {
                    Log.e("IAWebViewClient", "", (Throwable)ex);
                }
            }
            port = 0;
        }
        ++InAppWebViewClient.previousAuthRequestFailureCount;
        if (InAppWebViewClient.credentialsProposed == null) {
            InAppWebViewClient.credentialsProposed = CredentialDatabase.getInstance(((View)webView).getContext()).getHttpAuthCredentials(s, scheme, s2, port);
        }
        final List<URLCredential> credentialsProposed = InAppWebViewClient.credentialsProposed;
        URLCredential urlCredential;
        if (credentialsProposed != null && credentialsProposed.size() > 0) {
            urlCredential = (URLCredential)InAppWebViewClient.credentialsProposed.get(0);
        }
        else {
            urlCredential = null;
        }
        final HttpAuthenticationChallenge httpAuthenticationChallenge = new HttpAuthenticationChallenge(new URLProtectionSpace(s, scheme, s2, port, webView.getCertificate(), null), InAppWebViewClient.previousAuthRequestFailureCount, urlCredential);
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback(this, webView, s, scheme, s2, port, httpAuthHandler) {
            final InAppWebViewClient this$0;
            final int val$finalPort;
            final String val$finalProtocol;
            final HttpAuthHandler val$handler;
            final String val$host;
            final String val$realm;
            final WebView val$view;
            
            @Override
            public void defaultBehaviour(final HttpAuthResponse httpAuthResponse) {
                InAppWebViewClient.access$301(this.this$0, this.val$view, this.val$handler, this.val$host, this.val$realm);
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWebViewClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final HttpAuthResponse httpAuthResponse) {
                final Integer action = httpAuthResponse.getAction();
                if (action != null) {
                    final int intValue = action;
                    if (intValue != 1) {
                        if (intValue != 2) {
                            InAppWebViewClient.access$102(null);
                            InAppWebViewClient.access$202(0);
                            this.val$handler.cancel();
                        }
                        else if (InAppWebViewClient.access$100().size() > 0) {
                            final URLCredential urlCredential = (URLCredential)InAppWebViewClient.access$100().remove(0);
                            this.val$handler.proceed(urlCredential.getUsername(), urlCredential.getPassword());
                        }
                        else {
                            this.val$handler.cancel();
                        }
                    }
                    else {
                        final String username = httpAuthResponse.getUsername();
                        final String password = httpAuthResponse.getPassword();
                        if (httpAuthResponse.isPermanentPersistence()) {
                            CredentialDatabase.getInstance(((View)this.val$view).getContext()).setHttpAuthCredential(this.val$host, this.val$finalProtocol, this.val$realm, this.val$finalPort, username, password);
                        }
                        this.val$handler.proceed(username, password);
                    }
                    return false;
                }
                return true;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedHttpAuthRequest(httpAuthenticationChallenge, (WebViewChannelDelegate.ReceivedHttpAuthRequestCallback)receivedHttpAuthRequestCallback);
        }
        else {
            receivedHttpAuthRequestCallback.defaultBehaviour((Object)null);
        }
    }
    
    public void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
        }
    }
    
    public void onReceivedLoginRequest(final WebView webView, final String s, final String s2, final String s3) {
        final WebViewChannelDelegate channelDelegate = ((InAppWebView)webView).channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedLoginRequest(s, s2, s3);
        }
    }
    
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        String scheme;
        String host;
        int port;
        while (true) {
            final String url = sslError.getUrl();
            scheme = "https";
            while (true) {
                try {
                    final URI uri = new URI(url);
                    host = uri.getHost();
                    try {
                        scheme = uri.getScheme();
                        port = uri.getPort();
                        scheme = scheme;
                    }
                    catch (final URISyntaxException ex) {}
                }
                catch (final URISyntaxException ex) {
                    host = "";
                }
                final URISyntaxException ex;
                Log.e("IAWebViewClient", "", (Throwable)ex);
                port = 0;
                continue;
            }
        }
        final ServerTrustChallenge serverTrustChallenge = new ServerTrustChallenge(new URLProtectionSpace(host, scheme, null, port, sslError.getCertificate(), sslError));
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback(this, sslErrorHandler, webView, sslError) {
            final InAppWebViewClient this$0;
            final SslErrorHandler val$handler;
            final SslError val$sslError;
            final WebView val$view;
            
            @Override
            public void defaultBehaviour(final ServerTrustAuthResponse serverTrustAuthResponse) {
                InAppWebViewClient.access$401(this.this$0, this.val$view, this.val$handler, this.val$sslError);
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWebViewClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final ServerTrustAuthResponse serverTrustAuthResponse) {
                final Integer action = serverTrustAuthResponse.getAction();
                if (action != null) {
                    if (action != 1) {
                        this.val$handler.cancel();
                    }
                    else {
                        this.val$handler.proceed();
                    }
                    return false;
                }
                return true;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onReceivedServerTrustAuthRequest(serverTrustChallenge, (WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback)receivedServerTrustAuthRequestCallback);
        }
        else {
            receivedServerTrustAuthRequestCallback.defaultBehaviour((Object)null);
        }
    }
    
    public boolean onRenderProcessGone(final WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        if (inAppWebView.customSettings.useOnRenderProcessGone && inAppWebView.channelDelegate != null) {
            inAppWebView.channelDelegate.onRenderProcessGone(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
            return true;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
    
    public void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int n, final SafeBrowsingResponse safeBrowsingResponse) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        final WebViewChannelDelegate.SafeBrowsingHitCallback safeBrowsingHitCallback = new WebViewChannelDelegate.SafeBrowsingHitCallback(this, safeBrowsingResponse, webView, webResourceRequest, n) {
            final InAppWebViewClient this$0;
            final SafeBrowsingResponse val$callback;
            final WebResourceRequest val$request;
            final int val$threatType;
            final WebView val$view;
            
            @Override
            public void defaultBehaviour(final com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse safeBrowsingResponse) {
                InAppWebViewClient.access$601(this.this$0, this.val$view, this.val$request, this.val$threatType, this.val$callback);
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWebViewClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse safeBrowsingResponse) {
                final Integer action = safeBrowsingResponse.getAction();
                if (action != null) {
                    final boolean report = safeBrowsingResponse.isReport();
                    final int intValue = action;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            G0.e.j(this.val$callback, report);
                        }
                        else {
                            G0.e.k(this.val$callback, report);
                        }
                    }
                    else {
                        G0.e.g(this.val$callback, report);
                    }
                    return false;
                }
                return true;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onSafeBrowsingHit(webResourceRequest.getUrl().toString(), n, (WebViewChannelDelegate.SafeBrowsingHitCallback)safeBrowsingHitCallback);
        }
        else {
            safeBrowsingHitCallback.defaultBehaviour((Object)null);
        }
    }
    
    public void onScaleChanged(final WebView webView, final float n, final float n2) {
        super.onScaleChanged(webView, n, n2);
        final InAppWebView inAppWebView = (InAppWebView)webView;
        inAppWebView.zoomScale = n2 / Util.getPixelDensity(((View)inAppWebView).getContext());
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onZoomScaleChanged(n, n2);
        }
    }
    
    public void onShouldOverrideUrlLoading(final InAppWebView inAppWebView, final String s, final String s2, final Map<String, String> map, final boolean b, final boolean b2, final boolean b3) {
        final NavigationAction navigationAction = new NavigationAction(new URLRequest(s, s2, null, map), b, b2, b3);
        final WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback(this, inAppWebView, s, map, b) {
            final InAppWebViewClient this$0;
            final Map val$headers;
            final boolean val$isForMainFrame;
            final String val$url;
            final InAppWebView val$webView;
            
            @Override
            public void defaultBehaviour(final NavigationActionPolicy navigationActionPolicy) {
                this.this$0.allowShouldOverrideUrlLoading(this.val$webView, this.val$url, (Map<String, String>)this.val$headers, this.val$isForMainFrame);
            }
            
            @Override
            public void error(final String s, String s2, final Object o) {
                final StringBuilder c = e.c(s, ", ");
                if (s2 == null) {
                    s2 = "";
                }
                L.u(c, s2, "IAWebViewClient");
                this.defaultBehaviour(null);
            }
            
            @Override
            public boolean nonNullSuccess(final NavigationActionPolicy navigationActionPolicy) {
                if (InAppWebViewClient$7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[navigationActionPolicy.ordinal()] == 1) {
                    this.this$0.allowShouldOverrideUrlLoading(this.val$webView, this.val$url, (Map<String, String>)this.val$headers, this.val$isForMainFrame);
                }
                return false;
            }
        };
        final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.shouldOverrideUrlLoading(navigationAction, (WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback)shouldOverrideUrlLoadingCallback);
        }
        else {
            shouldOverrideUrlLoadingCallback.defaultBehaviour((Object)null);
        }
    }
    
    public void onUnhandledKeyEvent(final WebView webView, final KeyEvent keyEvent) {
    }
    
    public WebResourceResponse shouldInterceptRequest(final WebView webView, final WebResourceRequest webResourceRequest) {
        return this.shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
    }
    
    public WebResourceResponse shouldInterceptRequest(WebView ex, WebResourceRequestExt checkUrl) {
        final InAppWebView inAppWebView = (InAppWebView)ex;
        final WebViewAssetLoaderExt webViewAssetLoaderExt = inAppWebView.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null && webViewAssetLoaderExt.loader != null) {
            try {
                final WebResourceResponse a = inAppWebView.webViewAssetLoaderExt.loader.a(Uri.parse(((WebResourceRequestExt)checkUrl).getUrl()));
                if (a != null) {
                    return a;
                }
            }
            catch (final Exception ex2) {
                Log.e("IAWebViewClient", "", (Throwable)ex2);
            }
        }
        final boolean booleanValue = inAppWebView.customSettings.useShouldInterceptRequest;
        final Exception ex3 = null;
        final InterruptedException ex4 = null;
        final InputStream inputStream = null;
        if (booleanValue) {
            final WebViewChannelDelegate channelDelegate = inAppWebView.channelDelegate;
            WebResourceResponseExt shouldInterceptRequest = null;
            Label_0118: {
                if (channelDelegate != null) {
                    try {
                        shouldInterceptRequest = channelDelegate.shouldInterceptRequest((WebResourceRequestExt)checkUrl);
                        break Label_0118;
                    }
                    catch (final InterruptedException ex5) {
                        Log.e("IAWebViewClient", "", (Throwable)ex5);
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
        else {
            ex = (InterruptedException)((WebResourceRequestExt)checkUrl).getUrl().split(":")[0].toLowerCase();
            while (true) {
                try {
                    ex = (InterruptedException)Uri.parse(((WebResourceRequestExt)checkUrl).getUrl()).getScheme();
                    final List<String> resourceCustomSchemes = inAppWebView.customSettings.resourceCustomSchemes;
                    if (resourceCustomSchemes != null && resourceCustomSchemes.contains((Object)ex)) {
                        ex = (InterruptedException)inAppWebView.channelDelegate;
                        Label_0310: {
                            if (ex != null) {
                                try {
                                    ex = (InterruptedException)((WebViewChannelDelegate)ex).onLoadResourceWithCustomScheme((WebResourceRequestExt)checkUrl);
                                    break Label_0310;
                                }
                                catch (final InterruptedException ex) {
                                    Log.e("IAWebViewClient", "", (Throwable)ex);
                                    return null;
                                }
                            }
                            ex = null;
                        }
                        if (ex != null) {
                            try {
                                checkUrl = (Exception)inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, (WebResourceRequestExt)checkUrl, ((CustomSchemeResponse)ex).getContentType());
                            }
                            catch (Exception checkUrl) {
                                Log.e("IAWebViewClient", "", (Throwable)checkUrl);
                                checkUrl = ex3;
                            }
                            if (checkUrl != null) {
                                return (WebResourceResponse)checkUrl;
                            }
                            return new WebResourceResponse(((CustomSchemeResponse)ex).getContentType(), ((CustomSchemeResponse)ex).getContentType(), (InputStream)new ByteArrayInputStream(((CustomSchemeResponse)ex).getData()));
                        }
                    }
                    ex = ex4;
                    if (inAppWebView.contentBlockerHandler.getRuleList().size() > 0) {
                        try {
                            ex = (InterruptedException)inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, (WebResourceRequestExt)checkUrl);
                        }
                        catch (Exception ex) {
                            Log.e("IAWebViewClient", "", (Throwable)ex);
                            ex = ex4;
                        }
                    }
                    return (WebResourceResponse)ex;
                }
                catch (final Exception ex6) {
                    continue;
                }
                break;
            }
        }
    }
    
    public WebResourceResponse shouldInterceptRequest(final WebView webView, final String s) {
        return this.shouldInterceptRequest(webView, new WebResourceRequestExt(s, null, false, false, true, "GET"));
    }
    
    public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        if (!inAppWebView.customSettings.useShouldOverrideUrlLoading) {
            return false;
        }
        boolean b;
        if (d.a("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
            z.m.getClass();
            b = webResourceRequest.isRedirect();
        }
        else {
            b = webResourceRequest.isRedirect();
        }
        this.onShouldOverrideUrlLoading(inAppWebView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), (Map<String, String>)webResourceRequest.getRequestHeaders(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), b);
        if (inAppWebView.regexToCancelSubFramesLoadingCompiled != null) {
            return webResourceRequest.isForMainFrame() || inAppWebView.regexToCancelSubFramesLoadingCompiled.matcher((CharSequence)webResourceRequest.getUrl().toString()).matches();
        }
        return webResourceRequest.isForMainFrame();
    }
    
    public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        final InAppWebView inAppWebView = (InAppWebView)webView;
        if (inAppWebView.customSettings.useShouldOverrideUrlLoading) {
            this.onShouldOverrideUrlLoading(inAppWebView, s, "GET", null, true, false, false);
            return true;
        }
        return false;
    }
}

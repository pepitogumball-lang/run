package P1;

import android.view.KeyEvent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.RenderProcessGoneDetail;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.HttpAuthHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.ClientCertRequest;
import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.ValueCallback;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import java.util.Locale;
import java.util.Map;
import com.google.android.gms.internal.ads.k8;
import com.google.android.gms.internal.ads.pd;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.Iv;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.D9;

public final class y extends D9
{
    public final WebView a;
    public final v b;
    public final Iv c;
    public WebViewClient d;
    
    public y(final WebView a, final v b, final pd c) {
        this.a = a;
        this.b = b;
        this.c = (Iv)c;
    }
    
    public static boolean b() {
        if (!(boolean)k8.a.p()) {
            return false;
        }
        final Map allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces != null && allStackTraces.containsKey((Object)Thread.currentThread())) {
            final StackTraceElement[] array = (StackTraceElement[])allStackTraces.get((Object)Thread.currentThread());
            final int length = array.length;
            int i = 0;
            int n2;
            int n = n2 = 0;
            while (i < length) {
                int n3;
                if (array[i].getClassName().contains((CharSequence)y.class.getName())) {
                    if (n != 0 && n2 != 0) {
                        return true;
                    }
                    n3 = 1;
                }
                else if ((n3 = n) != 0) {
                    n2 = 1;
                    n3 = n;
                }
                ++i;
                n = n3;
            }
            return false;
        }
        return true;
    }
    
    public final void a() {
        this.a.evaluateJavascript(String.format(Locale.getDefault(), (String)q.d.c.a(D7.y9), new Object[] { this.b.a() }), (ValueCallback)null);
    }
    
    public final void doUpdateVisitedHistory(final WebView webView, final String s, final boolean b) {
        if (b()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, s, b);
    }
    
    public final void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        if (b()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }
    
    public final void onLoadResource(final WebView webView, final String s) {
        if (b()) {
            return;
        }
        super.onLoadResource(webView, s);
    }
    
    public final void onPageCommitVisible(final WebView webView, final String s) {
        if (b()) {
            return;
        }
        super.onPageCommitVisible(webView, s);
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        if (b()) {
            return;
        }
        this.a();
        super.onPageFinished(webView, s);
    }
    
    public final void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
        if (b()) {
            return;
        }
        this.a();
        super.onPageStarted(webView, s, bitmap);
    }
    
    public final void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
        if (b()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }
    
    public final void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, n, s, s2);
    }
    
    public final void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        if (b()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
    
    public final void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String s, final String s2) {
        if (b()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, s, s2);
    }
    
    public final void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
        if (b()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
    
    public final void onReceivedLoginRequest(final WebView webView, final String s, final String s2, final String s3) {
        if (b()) {
            return;
        }
        super.onReceivedLoginRequest(webView, s, s2, s3);
    }
    
    public final void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        if (b()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }
    
    public final boolean onRenderProcessGone(final WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        return !b() && super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
    
    public final void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int n, final SafeBrowsingResponse safeBrowsingResponse) {
        if (b()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, n, safeBrowsingResponse);
    }
    
    public final void onScaleChanged(final WebView webView, final float n, final float n2) {
        if (b()) {
            return;
        }
        super.onScaleChanged(webView, n, n2);
    }
    
    public final void onTooManyRedirects(final WebView webView, final Message message, final Message message2) {
        if (b()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }
    
    public final void onUnhandledKeyEvent(final WebView webView, final KeyEvent keyEvent) {
        if (b()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }
    
    public final WebResourceResponse shouldInterceptRequest(final WebView webView, final WebResourceRequest webResourceRequest) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
    
    public final WebResourceResponse shouldInterceptRequest(final WebView webView, final String s) {
        if (b()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, s);
    }
    
    public final boolean shouldOverrideKeyEvent(final WebView webView, final KeyEvent keyEvent) {
        return !b() && super.shouldOverrideKeyEvent(webView, keyEvent);
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        return !b() && super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        return !b() && super.shouldOverrideUrlLoading(webView, s);
    }
}

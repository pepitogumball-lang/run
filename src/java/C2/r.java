package C2;

import android.webkit.WebResourceRequest;
import java.util.Locale;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class r extends WebViewClient
{
    public final s a;
    
    public final void onLoadResource(final WebView webView, final String s) {
        final s a = this.a;
        final int f = s.F;
        if (s != null && s.startsWith("consent://")) {
            a.D.f(s);
        }
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        final s a = this.a;
        if (!a.E) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            a.E = true;
        }
    }
    
    public final void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        final c d = this.a.D;
        d.getClass();
        final Locale us = Locale.US;
        final StringBuilder sb = new StringBuilder("WebResourceError(");
        sb.append(n);
        sb.append(", ");
        sb.append(s2);
        sb.append("): ");
        sb.append(s);
        final Z z = new Z(2, sb.toString());
        final k k = (k)((l)d.I).i.getAndSet((Object)null);
        if (k != null) {
            k.b(z.a());
        }
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        final String string = webResourceRequest.getUrl().toString();
        final s a = this.a;
        final int f = s.F;
        if (string != null && string.startsWith("consent://")) {
            a.D.f(string);
            return true;
        }
        return false;
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        final s a = this.a;
        final int f = s.F;
        if (s != null && s.startsWith("consent://")) {
            a.D.f(s);
            return true;
        }
        return false;
    }
}

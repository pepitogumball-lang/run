package Y4;

import io.flutter.plugins.urllauncher.WebViewActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class h extends WebViewClient
{
    public final i a;
    
    public h(final i a) {
        this.a = a;
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        ((WebViewActivity)this.a.b).E.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
    
    public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        ((WebViewActivity)this.a.b).E.loadUrl(s);
        return true;
    }
}

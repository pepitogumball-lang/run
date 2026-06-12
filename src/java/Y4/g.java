package Y4;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class g extends WebViewClient
{
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return false;
    }
    
    public boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        return super.shouldOverrideUrlLoading(webView, s);
    }
}

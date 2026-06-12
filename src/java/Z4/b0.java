package Z4;

import android.view.ViewParent;
import io.flutter.plugin.editing.i;
import v4.l;
import android.os.Build$VERSION;
import android.view.View;
import android.webkit.WebChromeClient;
import android.content.Context;
import android.webkit.WebViewClient;
import io.flutter.plugin.platform.f;
import android.webkit.WebView;

public final class b0 extends WebView implements f
{
    public static final int F = 0;
    public final r C;
    public WebViewClient D;
    public O E;
    
    public b0(final r c) {
        super((Context)c.a.G);
        this.C = c;
        this.D = new WebViewClient();
        this.E = (O)new WebChromeClient();
        this.setWebViewClient(this.D);
        this.setWebChromeClient(this.E);
    }
    
    public final void dispose() {
    }
    
    public View getView() {
        return (View)this;
    }
    
    public WebChromeClient getWebChromeClient() {
        return this.E;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C.a.getClass();
        if (Build$VERSION.SDK_INT >= 26) {
            b0 parent = this;
            while (true) {
                while (((ViewParent)parent).getParent() != null) {
                    final ViewParent viewParent = (ViewParent)(parent = (b0)((ViewParent)parent).getParent());
                    if (viewParent instanceof l) {
                        final l l = (l)viewParent;
                        if (l != null) {
                            i.r(l);
                        }
                        return;
                    }
                }
                final l l = null;
                continue;
            }
        }
    }
    
    public final void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        this.C.a.h((Runnable)new a0(this, n, n2, n3, n4));
    }
    
    public void setWebChromeClient(final WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof O) {
            final O e = (O)webChromeClient;
            this.E = e;
            e.a = this.D;
            return;
        }
        throw new AssertionError((Object)"Client must be a SecureWebChromeClient.");
    }
    
    public void setWebViewClient(final WebViewClient a) {
        super.setWebViewClient(a);
        this.D = a;
        this.E.a = a;
    }
}

package j;

import androidx.activity.n;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import f.b;

public final class i implements b
{
    public final InAppBrowserActivity a;
    
    public i(final InAppBrowserActivity a) {
        this.a = a;
    }
    
    public final void a(final n n) {
        final InAppBrowserActivity a = this.a;
        final o delegate = ((j)a).getDelegate();
        delegate.a();
        ((n)a).getSavedStateRegistry().a("androidx:appcompat");
        delegate.e();
    }
}

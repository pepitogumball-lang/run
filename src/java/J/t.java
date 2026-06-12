package j;

import androidx.activity.s;
import java.util.Objects;
import android.window.OnBackInvokedCallback;
import G0.g;
import android.window.OnBackInvokedDispatcher;
import android.app.Activity;

public abstract class t
{
    public static OnBackInvokedDispatcher a(final Activity activity) {
        return g.k(activity);
    }
    
    public static OnBackInvokedCallback b(final Object o, final y y) {
        Objects.requireNonNull((Object)y);
        final s s = new s((Object)y, 1);
        g.y(g.m(o), s);
        return (OnBackInvokedCallback)s;
    }
    
    public static void c(final Object o, final Object o2) {
        g.x(g.m(o), g.j(o2));
    }
}

package o;

import androidx.activity.s;
import java.util.Objects;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import android.view.View;

public abstract class g1
{
    public static OnBackInvokedDispatcher a(final View view) {
        return view.findOnBackInvokedDispatcher();
    }
    
    public static OnBackInvokedCallback b(final Runnable runnable) {
        Objects.requireNonNull((Object)runnable);
        return (OnBackInvokedCallback)new s((Object)runnable, 2);
    }
    
    public static void c(final Object o, final Object o2) {
        ((OnBackInvokedDispatcher)o).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)o2);
    }
    
    public static void d(final Object o, final Object o2) {
        ((OnBackInvokedDispatcher)o).unregisterOnBackInvokedCallback((OnBackInvokedCallback)o2);
    }
}

package O0;

import java.lang.ref.Reference;
import android.os.IBinder;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.view.ViewTreeObserver$OnDrawListener;
import io.flutter.plugin.platform.C;
import io.flutter.plugin.platform.B;
import io.flutter.plugin.platform.n;
import android.view.View;
import java.lang.ref.WeakReference;
import n5.h;
import android.app.Activity;
import android.view.View$OnAttachStateChangeListener;

public final class i implements View$OnAttachStateChangeListener
{
    public final int C;
    public final Object D;
    public final Object E;
    
    public i(final j d, final Activity activity) {
        this.C = 0;
        h.e("sidecarCompat", (Object)d);
        this.D = d;
        this.E = new WeakReference((Object)activity);
    }
    
    public i(final View d, final n e) {
        this.C = 1;
        this.D = d;
        this.E = e;
    }
    
    private final void a(final View view) {
    }
    
    public final void onViewAttachedToWindow(View view) {
        switch (this.C) {
            default: {
                final B b = new B((Object)this, 0);
                view = (View)this.D;
                view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)new C(view, b));
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                return;
            }
            case 0: {
                h.e("view", (Object)view);
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                final Activity activity = (Activity)((Reference)this.E).get();
                IBinder token = null;
                Label_0123: {
                    if (activity != null) {
                        final Window window = activity.getWindow();
                        if (window != null) {
                            final WindowManager$LayoutParams attributes = window.getAttributes();
                            if (attributes != null) {
                                token = attributes.token;
                                break Label_0123;
                            }
                        }
                    }
                    token = null;
                }
                if (activity != null) {
                    if (token != null) {
                        ((j)this.D).g(token, activity);
                    }
                }
            }
        }
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        switch (this.C) {
            default: {
                return;
            }
            case 0: {
                h.e("view", (Object)view);
            }
        }
    }
}

package Y3;

import android.view.ViewTreeObserver;
import n.f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import n.D;
import android.view.ViewTreeObserver$OnDrawListener;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class c implements View$OnAttachStateChangeListener
{
    public final int C;
    public final Object D;
    
    private final void a(final View view) {
    }
    
    private final void b(final View view) {
    }
    
    public final void onViewAttachedToWindow(final View view) {
        switch (this.C) {
            default: {
                return;
            }
            case 0: {
                view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)this.D);
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        }
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        switch (this.C) {
            default: {
                final D d = (D)this.D;
                final ViewTreeObserver q = d.Q;
                if (q != null) {
                    if (!q.isAlive()) {
                        d.Q = view.getViewTreeObserver();
                    }
                    d.Q.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)d.K);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                return;
            }
            case 1: {
                final f f = (f)this.D;
                final ViewTreeObserver z = f.Z;
                if (z != null) {
                    if (!z.isAlive()) {
                        f.Z = view.getViewTreeObserver();
                    }
                    f.Z.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)f.K);
                }
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                return;
            }
            case 0: {
                view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        }
    }
}

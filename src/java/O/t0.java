package o;

import android.view.ViewParent;
import android.view.View;
import android.view.MotionEvent;
import android.os.SystemClock;

public final class t0 implements Runnable
{
    public final int C;
    public final u0 D;
    
    public final void run() {
        switch (this.C) {
            default: {
                final u0 d = this.D;
                d.a();
                final View f = d.F;
                if (f.isEnabled()) {
                    if (!f.isLongClickable()) {
                        if (d.d()) {
                            f.getParent().requestDisallowInterceptTouchEvent(true);
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            f.onTouchEvent(obtain);
                            obtain.recycle();
                            d.I = true;
                        }
                    }
                }
                return;
            }
            case 0: {
                final ViewParent parent = this.D.F.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
    }
}

package E1;

import android.widget.PopupWindow;
import com.google.android.gms.internal.ads.V4;
import o.w;
import com.google.android.gms.ads.internal.zzu;
import o.C0;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

public final class l implements View$OnTouchListener
{
    public final int C;
    public final Object D;
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (this.C) {
            default: {
                final int action = motionEvent.getAction();
                final int n = (int)motionEvent.getX();
                final int n2 = (int)motionEvent.getY();
                final C0 c0 = (C0)this.D;
                if (action == 0) {
                    final w a0 = c0.a0;
                    if (a0 != null && ((PopupWindow)a0).isShowing() && n >= 0 && n < ((PopupWindow)c0.a0).getWidth() && n2 >= 0 && n2 < ((PopupWindow)c0.a0).getHeight()) {
                        c0.W.postDelayed((Runnable)c0.S, 250L);
                        return false;
                    }
                }
                if (action == 1) {
                    c0.W.removeCallbacks((Runnable)c0.S);
                }
                return false;
            }
            case 0: {
                final V4 j = ((zzu)this.D).J;
                if (j != null) {
                    j.b.a(motionEvent);
                }
                return false;
            }
        }
    }
}

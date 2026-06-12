package o;

import android.view.View;
import android.animation.Animator$AnimatorListener;
import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class b implements Runnable
{
    public final int C;
    public final ActionBarOverlayLayout D;
    
    public final void run() {
        switch (this.C) {
            default: {
                final ActionBarOverlayLayout d = this.D;
                d.b();
                d.b0 = ((View)d.F).animate().translationY((float)(-((View)d.F).getHeight())).setListener((Animator$AnimatorListener)d.c0);
                return;
            }
            case 0: {
                final ActionBarOverlayLayout d2 = this.D;
                d2.b();
                d2.b0 = ((View)d2.F).animate().translationY(0.0f).setListener((Animator$AnimatorListener)d2.c0);
            }
        }
    }
}

package t0;

import android.view.View;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class d extends AnimatorListenerAdapter
{
    public boolean a;
    public final f b;
    
    public d(final f b) {
        this.b = b;
        this.a = false;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        this.a = true;
    }
    
    public final void onAnimationEnd(final Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        final f b = this.b;
        if ((float)b.u.getAnimatedValue() == 0.0f) {
            b.e(b.v = 0);
        }
        else {
            b.v = 2;
            ((View)b.n).invalidate();
        }
    }
}

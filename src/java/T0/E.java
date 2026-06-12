package t0;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class e implements ValueAnimator$AnimatorUpdateListener
{
    public final f a;
    
    public e(final f a) {
        this.a = a;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final int n = (int)((float)valueAnimator.getAnimatedValue() * 255.0f);
        final f a = this.a;
        ((Drawable)a.b).setAlpha(n);
        a.c.setAlpha(n);
        ((View)a.n).invalidate();
    }
}

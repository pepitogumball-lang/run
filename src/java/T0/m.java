package t0;

import android.view.animation.Interpolator;

public final class m implements Interpolator
{
    public final float getInterpolation(float n) {
        --n;
        return n * n * n * n * n + 1.0f;
    }
}

package v4;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class d implements ViewTreeObserver$OnPreDrawListener
{
    public final l C;
    public final e D;
    
    public d(final e d, final l c) {
        this.D = d;
        this.C = c;
    }
    
    public final boolean onPreDraw() {
        final e d = this.D;
        if (d.h && d.f != null) {
            ((View)this.C).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            d.f = null;
        }
        return d.h;
    }
}

package o;

import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Canvas;
import androidx.appcompat.widget.ActionBarContainer;
import android.graphics.drawable.Drawable;

public final class a extends Drawable
{
    public final ActionBarContainer a;
    
    public a(final ActionBarContainer a) {
        this.a = a;
    }
    
    public final void draw(final Canvas canvas) {
        final ActionBarContainer a = this.a;
        if (a.I) {
            final Drawable h = a.H;
            if (h != null) {
                h.draw(canvas);
            }
        }
        else {
            final Drawable f = a.F;
            if (f != null) {
                f.draw(canvas);
            }
            final Drawable g = a.G;
            if (g != null && a.J) {
                g.draw(canvas);
            }
        }
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final void getOutline(final Outline outline) {
        final ActionBarContainer a = this.a;
        if (a.I) {
            if (a.H != null) {
                a.F.getOutline(outline);
            }
        }
        else {
            final Drawable f = a.F;
            if (f != null) {
                f.getOutline(outline);
            }
        }
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}

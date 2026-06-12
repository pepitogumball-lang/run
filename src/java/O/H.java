package o;

import android.graphics.drawable.Drawable;
import I.a;
import android.view.View$OnTouchListener;
import n.b;
import android.view.View;
import n3.u0;
import android.util.AttributeSet;
import android.content.Context;

public final class h extends u implements j
{
    public final i F;
    
    public h(final i f, final Context context) {
        this.F = f;
        super(context, null, 2130903073);
        ((View)this).setClickable(true);
        ((View)this).setFocusable(true);
        ((View)this).setVisibility(0);
        ((View)this).setEnabled(true);
        u0.v((View)this, ((View)this).getContentDescription());
        ((View)this).setOnTouchListener((View$OnTouchListener)new b(this, this));
    }
    
    public final boolean b() {
        return false;
    }
    
    public final boolean d() {
        return false;
    }
    
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        ((View)this).playSoundEffect(0);
        this.F.l();
        return true;
    }
    
    public final boolean setFrame(int n, int height, int paddingTop, int paddingBottom) {
        final boolean setFrame = super.setFrame(n, height, paddingTop, paddingBottom);
        final Drawable drawable = this.getDrawable();
        final Drawable background = ((View)this).getBackground();
        if (drawable != null && background != null) {
            final int width = ((View)this).getWidth();
            height = ((View)this).getHeight();
            n = Math.max(width, height) / 2;
            final int paddingLeft = ((View)this).getPaddingLeft();
            final int paddingRight = ((View)this).getPaddingRight();
            paddingTop = ((View)this).getPaddingTop();
            paddingBottom = ((View)this).getPaddingBottom();
            final int n2 = (width + (paddingLeft - paddingRight)) / 2;
            height = (height + (paddingTop - paddingBottom)) / 2;
            a.f(background, n2 - n, height - n, n2 + n, height + n);
        }
        return setFrame;
    }
}

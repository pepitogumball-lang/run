package o;

import android.widget.ProgressBar;
import android.graphics.Canvas;
import android.content.Context;
import I.b;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import O.V;
import android.content.res.TypedArray;
import w2.e;
import i.a;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class C extends x
{
    public final B e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff$Mode h;
    public boolean i;
    public boolean j;
    
    public C(final B e) {
        super((AbsSeekBar)e);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = e;
    }
    
    @Override
    public final void b(final AttributeSet set, final int n) {
        super.b(set, 2130903550);
        final B e = this.e;
        final Context context = ((View)e).getContext();
        final int[] g = i.a.g;
        final e h = w2.e.H(context, set, g, 2130903550);
        V.g((View)e, ((View)e).getContext(), g, set, (TypedArray)h.E, 2130903550);
        final Drawable b = h.B(0);
        if (b != null) {
            ((AbsSeekBar)e).setThumb(b);
        }
        final Drawable a = h.A(1);
        final Drawable f = this.f;
        if (f != null) {
            f.setCallback((Drawable$Callback)null);
        }
        if ((this.f = a) != null) {
            a.setCallback((Drawable$Callback)e);
            I.b.b(a, ((View)e).getLayoutDirection());
            if (a.isStateful()) {
                a.setState(((View)e).getDrawableState());
            }
            this.f();
        }
        ((View)e).invalidate();
        final TypedArray typedArray = (TypedArray)h.E;
        if (typedArray.hasValue(3)) {
            this.h = l0.c(typedArray.getInt(3, -1), this.h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = h.z(2);
            this.i = true;
        }
        h.K();
        this.f();
    }
    
    public final void f() {
        final Drawable f = this.f;
        if (f != null && (this.i || this.j)) {
            final Drawable mutate = f.mutate();
            this.f = mutate;
            if (this.i) {
                I.a.h(mutate, this.g);
            }
            if (this.j) {
                I.a.i(this.f, this.h);
            }
            if (this.f.isStateful()) {
                this.f.setState(((View)this.e).getDrawableState());
            }
        }
    }
    
    public final void g(final Canvas canvas) {
        if (this.f != null) {
            final B e = this.e;
            final int max = ((ProgressBar)e).getMax();
            int n = 1;
            if (max > 1) {
                final int intrinsicWidth = this.f.getIntrinsicWidth();
                final int intrinsicHeight = this.f.getIntrinsicHeight();
                int n2;
                if (intrinsicWidth >= 0) {
                    n2 = intrinsicWidth / 2;
                }
                else {
                    n2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    n = intrinsicHeight / 2;
                }
                this.f.setBounds(-n2, -n, n2, n);
                final float n3 = (((View)e).getWidth() - ((View)e).getPaddingLeft() - ((View)e).getPaddingRight()) / (float)max;
                final int save = canvas.save();
                canvas.translate((float)((View)e).getPaddingLeft(), (float)(((View)e).getHeight() / 2));
                for (int i = 0; i <= max; ++i) {
                    this.f.draw(canvas);
                    canvas.translate(n3, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}

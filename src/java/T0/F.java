package t0;

import android.view.View;
import android.animation.Animator;
import android.view.MotionEvent;
import java.util.WeakHashMap;
import O.V;
import java.util.ArrayList;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import g2.n;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public final class f
{
    public static final int[] x;
    public static final int[] y;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    public final int d;
    public final int e;
    public final StateListDrawable f;
    public final Drawable g;
    public final int h;
    public final int i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final RecyclerView n;
    public final boolean o;
    public final boolean p;
    public int q;
    public int r;
    public final int[] s;
    public final int[] t;
    public final ValueAnimator u;
    public int v;
    public final n w;
    
    static {
        x = new int[] { 16842919 };
        y = new int[0];
    }
    
    public f(RecyclerView n, final StateListDrawable b, final Drawable c, final StateListDrawable f, final Drawable g, final int n2, final int n3, final int a) {
        this.l = 0;
        this.m = 0;
        this.o = false;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = new int[2];
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        this.u = ofFloat;
        this.v = 0;
        final n w = new n((Object)this, 7);
        this.w = w;
        final Object o = new Object();
        this.b = b;
        this.c = c;
        this.f = f;
        this.g = g;
        this.d = Math.max(n2, ((Drawable)b).getIntrinsicWidth());
        this.e = Math.max(n2, c.getIntrinsicWidth());
        this.h = Math.max(n2, ((Drawable)f).getIntrinsicWidth());
        this.i = Math.max(n2, g.getIntrinsicWidth());
        this.a = a;
        ((Drawable)b).setAlpha(255);
        c.setAlpha(255);
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new d(this));
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new e(this));
        final RecyclerView n4 = this.n;
        if (n4 != n) {
            if (n4 != null) {
                final r k = n4.K;
                if (k != null) {
                    k.a("Cannot remove item decoration during a scroll  or layout");
                }
                final ArrayList l = n4.L;
                l.remove((Object)this);
                if (l.isEmpty()) {
                    ((View)n4).setWillNotDraw(((View)n4).getOverScrollMode() == 2);
                }
                n4.m();
                n4.requestLayout();
                final RecyclerView n5 = this.n;
                n5.M.remove((Object)this);
                if (n5.N == this) {
                    n5.N = null;
                }
                final ArrayList a2 = this.n.A0;
                if (a2 != null) {
                    a2.remove(o);
                }
                ((View)this.n).removeCallbacks((Runnable)w);
            }
            if ((this.n = n) != null) {
                final r i = n.K;
                if (i != null) {
                    i.a("Cannot add item decoration during a scroll  or layout");
                }
                final ArrayList j = n.L;
                if (j.isEmpty()) {
                    ((View)n).setWillNotDraw(false);
                }
                j.add((Object)this);
                n.m();
                n.requestLayout();
                this.n.M.add((Object)this);
                n = this.n;
                if (n.A0 == null) {
                    n.A0 = new ArrayList();
                }
                n.A0.add(o);
            }
        }
    }
    
    public static int d(float n, final float n2, final int[] array, int n3, int n4, int n5) {
        final int n6 = array[1] - array[0];
        if (n6 == 0) {
            return 0;
        }
        n = (n2 - n) / n6;
        n3 -= n5;
        n5 = (int)(n * n3);
        n4 += n5;
        if (n4 < n3 && n4 >= 0) {
            return n5;
        }
        return 0;
    }
    
    public final boolean a(final float n, final float n2) {
        return n2 >= this.m - this.h && n >= 0 - 0 / 2 && n <= 0 / 2 + 0;
    }
    
    public final boolean b(final float n, final float n2) {
        final boolean b = false;
        final RecyclerView n3 = this.n;
        final WeakHashMap a = V.a;
        final boolean b2 = ((View)n3).getLayoutDirection() == 1;
        final int d = this.d;
        if (b2) {
            final boolean b3 = b;
            if (n > d / 2) {
                return b3;
            }
        }
        else {
            final boolean b3 = b;
            if (n < this.l - d) {
                return b3;
            }
        }
        final int n4 = 0 / 2;
        boolean b3 = b;
        if (n2 >= 0 - n4) {
            b3 = b;
            if (n2 <= n4 + 0) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final boolean c(final MotionEvent motionEvent) {
        final int q = this.q;
        final boolean b = false;
        if (q == 1) {
            final boolean b2 = this.b(motionEvent.getX(), motionEvent.getY());
            final boolean a = this.a(motionEvent.getX(), motionEvent.getY());
            boolean b3 = b;
            if (motionEvent.getAction() != 0) {
                return b3;
            }
            if (!b2) {
                b3 = b;
                if (!a) {
                    return b3;
                }
            }
            if (a) {
                this.r = 1;
                this.k = (float)(int)motionEvent.getX();
            }
            else if (b2) {
                this.r = 2;
                this.j = (float)(int)motionEvent.getY();
            }
            this.e(2);
        }
        else {
            final boolean b3 = b;
            if (q != 2) {
                return b3;
            }
        }
        return true;
    }
    
    public final void e(final int q) {
        final n w = this.w;
        final StateListDrawable b = this.b;
        if (q == 2 && this.q != 2) {
            ((Drawable)b).setState(t0.f.x);
            ((View)this.n).removeCallbacks((Runnable)w);
        }
        if (q == 0) {
            ((View)this.n).invalidate();
        }
        else {
            this.f();
        }
        if (this.q == 2 && q != 2) {
            ((Drawable)b).setState(t0.f.y);
            ((View)this.n).removeCallbacks((Runnable)w);
            ((View)this.n).postDelayed((Runnable)w, (long)1200);
        }
        else if (q == 1) {
            ((View)this.n).removeCallbacks((Runnable)w);
            ((View)this.n).postDelayed((Runnable)w, (long)1500);
        }
        this.q = q;
    }
    
    public final void f() {
        final int v = this.v;
        final ValueAnimator u = this.u;
        if (v != 0) {
            if (v != 3) {
                return;
            }
            u.cancel();
        }
        this.v = 1;
        u.setFloatValues(new float[] { (float)u.getAnimatedValue(), 1.0f });
        u.setDuration(500L);
        u.setStartDelay(0L);
        u.start();
    }
}

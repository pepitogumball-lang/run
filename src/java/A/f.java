package A;

import x.d;
import android.view.View;
import x.h;
import android.view.ViewGroup;
import y.b;
import x.e;
import android.view.View$MeasureSpec;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class f
{
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ConstraintLayout h;
    
    public f(final ConstraintLayout h, final ConstraintLayout a) {
        this.h = h;
        this.a = a;
    }
    
    public static boolean a(int mode, int size, final int n) {
        if (mode == size) {
            return true;
        }
        final int mode2 = View$MeasureSpec.getMode(mode);
        View$MeasureSpec.getSize(mode);
        mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        return mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0) && n == size;
    }
    
    public final void b(final e e, final b b) {
        if (e == null) {
            return;
        }
        if (e.f0 == 8) {
            b.e = 0;
            b.f = 0;
            b.g = 0;
            return;
        }
        if (e.S == null) {
            return;
        }
        final int a = b.a;
        final int b2 = b.b;
        final int c = b.c;
        final int d = b.d;
        final int n = this.b + this.c;
        final int d2 = this.d;
        final View e2 = e.e0;
        final int d3 = v.e.d(a);
        final d j = e.J;
        final d h = e.H;
        int n2 = 0;
        Label_0338: {
            if (d3 != 0) {
                if (d3 != 1) {
                    if (d3 != 2) {
                        if (d3 != 3) {
                            n2 = 0;
                        }
                        else {
                            final int f = this.f;
                            int g;
                            if (h != null) {
                                g = h.g;
                            }
                            else {
                                g = 0;
                            }
                            int n3 = g;
                            if (j != null) {
                                n3 = g + j.g;
                            }
                            n2 = ViewGroup.getChildMeasureSpec(f, d2 + n3, -1);
                        }
                    }
                    else {
                        final int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, d2, -2);
                        final boolean b3 = e.r == 1;
                        final int i = b.j;
                        if (i != 1) {
                            n2 = childMeasureSpec;
                            if (i != 2) {
                                break Label_0338;
                            }
                        }
                        final boolean b4 = e2.getMeasuredHeight() == e.i();
                        if (b.j != 2 && b3 && (!b3 || !b4)) {
                            n2 = childMeasureSpec;
                            if (!e.y()) {
                                break Label_0338;
                            }
                        }
                        n2 = View$MeasureSpec.makeMeasureSpec(e.o(), 1073741824);
                    }
                }
                else {
                    n2 = ViewGroup.getChildMeasureSpec(this.f, d2, -2);
                }
            }
            else {
                n2 = View$MeasureSpec.makeMeasureSpec(c, 1073741824);
            }
        }
        final int d4 = v.e.d(b2);
        int n4 = 0;
        Label_0583: {
            if (d4 != 0) {
                if (d4 != 1) {
                    if (d4 != 2) {
                        if (d4 != 3) {
                            n4 = 0;
                        }
                        else {
                            final int g2 = this.g;
                            int g3;
                            if (h != null) {
                                g3 = e.I.g;
                            }
                            else {
                                g3 = 0;
                            }
                            int n5 = g3;
                            if (j != null) {
                                n5 = g3 + e.K.g;
                            }
                            n4 = ViewGroup.getChildMeasureSpec(g2, n + n5, -1);
                        }
                    }
                    else {
                        final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, n, -2);
                        final boolean b5 = e.s == 1;
                        final int k = b.j;
                        if (k != 1) {
                            n4 = childMeasureSpec2;
                            if (k != 2) {
                                break Label_0583;
                            }
                        }
                        final boolean b6 = e2.getMeasuredWidth() == e.o();
                        if (b.j != 2 && b5 && (!b5 || !b6)) {
                            n4 = childMeasureSpec2;
                            if (!e.z()) {
                                break Label_0583;
                            }
                        }
                        n4 = View$MeasureSpec.makeMeasureSpec(e.i(), 1073741824);
                    }
                }
                else {
                    n4 = ViewGroup.getChildMeasureSpec(this.g, n, -2);
                }
            }
            else {
                n4 = View$MeasureSpec.makeMeasureSpec(d, 1073741824);
            }
        }
        final x.f f2 = (x.f)e.S;
        final ConstraintLayout h2 = this.h;
        if (f2 != null && x.h.c(h2.K, 256) && e2.getMeasuredWidth() == e.o() && e2.getMeasuredWidth() < ((e)f2).o() && e2.getMeasuredHeight() == e.i() && e2.getMeasuredHeight() < ((e)f2).i() && e2.getBaseline() == e.Z && !e.x() && a(e.F, n2, e.o()) && a(e.G, n4, e.i())) {
            b.e = e.o();
            b.f = e.i();
            b.g = e.Z;
            return;
        }
        final boolean b7 = a == 3;
        final boolean b8 = b2 == 3;
        final boolean b9 = b2 == 4 || b2 == 1;
        final boolean b10 = a == 4 || a == 1;
        final boolean b11 = b7 && e.V > 0.0f;
        final boolean b12 = b8 && e.V > 0.0f;
        if (e2 == null) {
            return;
        }
        final A.e e3 = (A.e)e2.getLayoutParams();
        final int l = b.j;
        int measuredWidth;
        int baseline;
        int measuredHeight;
        if (l != 1 && l != 2 && b7 && e.r == 0 && b8 && e.s == 0) {
            measuredWidth = 0;
            baseline = 0;
            measuredHeight = 0;
        }
        else {
            e2.measure(n2, n4);
            e.F = n2;
            e.G = n4;
            e.g = false;
            final int measuredWidth2 = e2.getMeasuredWidth();
            final int measuredHeight2 = e2.getMeasuredHeight();
            final int baseline2 = e2.getBaseline();
            final int u = e.u;
            int max;
            if (u > 0) {
                max = Math.max(u, measuredWidth2);
            }
            else {
                max = measuredWidth2;
            }
            final int v = e.v;
            int min = max;
            if (v > 0) {
                min = Math.min(v, max);
            }
            final int x = e.x;
            int max2;
            if (x > 0) {
                max2 = Math.max(x, measuredHeight2);
            }
            else {
                max2 = measuredHeight2;
            }
            final int y = e.y;
            int min2 = max2;
            if (y > 0) {
                min2 = Math.min(y, max2);
            }
            int n6 = min;
            measuredHeight = min2;
            if (!x.h.c(h2.K, 1)) {
                if (b11 && b9) {
                    n6 = (int)(min2 * e.V + 0.5f);
                    measuredHeight = min2;
                }
                else {
                    n6 = min;
                    measuredHeight = min2;
                    if (b12) {
                        n6 = min;
                        measuredHeight = min2;
                        if (b10) {
                            measuredHeight = (int)(min / e.V + 0.5f);
                            n6 = min;
                        }
                    }
                }
            }
            if (measuredWidth2 == n6 && measuredHeight2 == measuredHeight) {
                baseline = baseline2;
                measuredWidth = n6;
            }
            else {
                if (measuredWidth2 != n6) {
                    n2 = View$MeasureSpec.makeMeasureSpec(n6, 1073741824);
                }
                if (measuredHeight2 != measuredHeight) {
                    n4 = View$MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                }
                e2.measure(n2, n4);
                e.F = n2;
                e.G = n4;
                e.g = false;
                measuredWidth = e2.getMeasuredWidth();
                measuredHeight = e2.getMeasuredHeight();
                baseline = e2.getBaseline();
            }
        }
        boolean m = false;
        boolean h3 = baseline != -1;
        if (measuredWidth != b.c || measuredHeight != b.d) {
            m = true;
        }
        b.i = m;
        if (e3.c0) {
            h3 = true;
        }
        if (h3 && baseline != -1 && e.Z != baseline) {
            b.i = true;
        }
        b.e = measuredWidth;
        b.f = measuredHeight;
        b.h = h3;
        b.g = baseline;
    }
}

package j;

import O.k0;
import android.view.Window$Callback;
import android.view.Menu;
import android.view.WindowInsets;
import android.content.Context;
import java.util.WeakHashMap;
import java.lang.reflect.Method;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarContextView;
import O.r0;
import O.H;
import H.c;
import O.h0;
import O.i0;
import O.j0;
import android.os.Build$VERSION;
import E.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import O.K;
import O.V;
import android.util.Log;
import o.t1;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import O.t0;
import android.view.View;
import n.l;
import n.x;
import O.w;

public final class q implements w, x
{
    public final y C;
    
    public void a(l l, final boolean b) {
        final l k = l.k();
        int i = 0;
        final boolean b2 = k != l;
        if (b2) {
            l = k;
        }
        final y c = this.C;
        final j.x[] n0 = c.n0;
        int length;
        if (n0 != null) {
            length = n0.length;
        }
        else {
            length = 0;
        }
        while (true) {
            while (i < length) {
                final j.x x = n0[i];
                if (x != null && x.h == l) {
                    final j.x x2 = x;
                    if (x2 != null) {
                        if (b2) {
                            c.r(x2.a, x2, k);
                            c.t(x2, true);
                        }
                        else {
                            c.t(x2, b);
                        }
                    }
                    return;
                }
                ++i;
            }
            final j.x x2 = null;
            continue;
        }
    }
    
    public t0 b(final View view, t0 b) {
        final r0 a = b.a;
        final int b2 = a.i().b;
        final y c = this.C;
        c.getClass();
        int b3 = a.i().b;
        final ActionBarContextView x = c.X;
        int n2;
        boolean b8;
        if (x != null && ((View)x).getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)((View)c.X).getLayoutParams();
            boolean b6;
            boolean b7;
            if (((View)c.X).isShown()) {
                if (c.E0 == null) {
                    c.E0 = new Rect();
                    c.F0 = new Rect();
                }
                final Rect e0 = c.E0;
                final Rect f0 = c.F0;
                e0.set(a.i().a, a.i().b, a.i().c, a.i().d);
                final ViewGroup c2 = c.c0;
                final Method a2 = t1.a;
                if (a2 != null) {
                    try {
                        a2.invoke((Object)c2, new Object[] { e0, f0 });
                    }
                    catch (final Exception ex) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)ex);
                    }
                }
                final int top = e0.top;
                final int left = e0.left;
                final int right = e0.right;
                final ViewGroup c3 = c.c0;
                final WeakHashMap a3 = V.a;
                final t0 a4 = K.a((View)c3);
                int a5;
                if (a4 == null) {
                    a5 = 0;
                }
                else {
                    a5 = a4.a.i().a;
                }
                int c4;
                if (a4 == null) {
                    c4 = 0;
                }
                else {
                    c4 = a4.a.i().c;
                }
                boolean b4;
                if (layoutParams.topMargin == top && layoutParams.leftMargin == left && layoutParams.rightMargin == right) {
                    b4 = false;
                }
                else {
                    layoutParams.topMargin = top;
                    layoutParams.leftMargin = left;
                    layoutParams.rightMargin = right;
                    b4 = true;
                }
                final Context m = c.M;
                if (top > 0 && c.e0 == null) {
                    (c.e0 = new View(m)).setVisibility(8);
                    final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                    frameLayout$LayoutParams.leftMargin = a5;
                    frameLayout$LayoutParams.rightMargin = c4;
                    c.c0.addView(c.e0, -1, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
                }
                else {
                    final View e2 = c.e0;
                    if (e2 != null) {
                        final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)e2.getLayoutParams();
                        final int height = layoutParams2.height;
                        final int topMargin = layoutParams.topMargin;
                        if (height != topMargin || layoutParams2.leftMargin != a5 || layoutParams2.rightMargin != c4) {
                            layoutParams2.height = topMargin;
                            layoutParams2.leftMargin = a5;
                            layoutParams2.rightMargin = c4;
                            c.e0.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                }
                final View e3 = c.e0;
                final boolean b5 = e3 != null;
                if (b5 && e3.getVisibility() != 0) {
                    final View e4 = c.e0;
                    int backgroundColor;
                    if ((e4.getWindowSystemUiVisibility() & 0x2000) != 0x0) {
                        backgroundColor = b.a(m, 2131034118);
                    }
                    else {
                        backgroundColor = b.a(m, 2131034117);
                    }
                    e4.setBackgroundColor(backgroundColor);
                }
                int n = b3;
                if (!c.j0) {
                    n = b3;
                    if (b5) {
                        n = 0;
                    }
                }
                b3 = n;
                b6 = b4;
                b7 = b5;
            }
            else if (layoutParams.topMargin != 0) {
                layoutParams.topMargin = 0;
                b7 = false;
                b6 = true;
            }
            else {
                b6 = false;
                b7 = false;
            }
            n2 = b3;
            b8 = b7;
            if (b6) {
                ((View)c.X).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                n2 = b3;
                b8 = b7;
            }
        }
        else {
            b8 = false;
            n2 = b3;
        }
        int visibility = 0;
        final View e5 = c.e0;
        if (e5 != null) {
            if (!b8) {
                visibility = 8;
            }
            e5.setVisibility(visibility);
        }
        if (b2 != n2) {
            final int a6 = a.i().a;
            final int c5 = a.i().c;
            final int d = a.i().d;
            final int sdk_INT = Build$VERSION.SDK_INT;
            Object o;
            if (sdk_INT >= 30) {
                o = new j0(b);
            }
            else if (sdk_INT >= 29) {
                o = new i0(b);
            }
            else {
                o = new h0(b);
            }
            ((k0)o).d(H.c.a(a6, n2, c5, d));
            b = ((k0)o).b();
        }
        final WeakHashMap a7 = V.a;
        final WindowInsets b9 = b.b();
        t0 c6 = b;
        if (b9 != null) {
            final WindowInsets b10 = H.b(view, b9);
            c6 = b;
            if (!b10.equals((Object)b9)) {
                c6 = t0.c(b10, view);
            }
        }
        return c6;
    }
    
    public boolean h(final l l) {
        if (l == l.k()) {
            final y c = this.C;
            if (c.h0) {
                final Window$Callback callback = c.N.getCallback();
                if (callback != null && !c.s0) {
                    callback.onMenuOpened(108, (Menu)l);
                }
            }
        }
        return true;
    }
}

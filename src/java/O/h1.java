package o;

import java.util.ArrayList;
import n.E;
import android.content.Context;
import android.view.ViewParent;
import m.c;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import n.n;
import n.l;
import n.y;

public final class h1 implements y
{
    public l C;
    public n D;
    public final Toolbar E;
    
    public h1(final Toolbar e) {
        this.E = e;
    }
    
    public final void a(final l l, final boolean b) {
    }
    
    public final void d() {
        if (this.D != null) {
            final l c = this.C;
            if (c != null) {
                for (int size = c.f.size(), i = 0; i < size; ++i) {
                    if (this.C.getItem(i) == this.D) {
                        return;
                    }
                }
            }
            this.k(this.D);
        }
    }
    
    public final boolean f(final n d) {
        final Toolbar e = this.E;
        e.c();
        final ViewParent parent = ((View)e.J).getParent();
        if (parent != e) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView((View)e.J);
            }
            ((ViewGroup)e).addView((View)e.J);
        }
        final View actionView = d.getActionView();
        e.K = actionView;
        this.D = d;
        final ViewParent parent2 = actionView.getParent();
        if (parent2 != e) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup)parent2).removeView(e.K);
            }
            final i1 h = Toolbar.h();
            h.a = ((e.P & 0x70) | 0x800003);
            h.b = 2;
            e.K.setLayoutParams((ViewGroup$LayoutParams)h);
            ((ViewGroup)e).addView(e.K);
        }
        for (int i = ((ViewGroup)e).getChildCount() - 1; i >= 0; --i) {
            final View child = ((ViewGroup)e).getChildAt(i);
            if (((i1)child.getLayoutParams()).b != 2 && child != e.C) {
                ((ViewGroup)e).removeViewAt(i);
                e.j0.add((Object)child);
            }
        }
        ((View)e).requestLayout();
        d.C = true;
        d.n.p(false);
        final View k = e.K;
        if (k instanceof c) {
            ((c)k).a();
        }
        e.w();
        return true;
    }
    
    public final void g(final Context context, final l c) {
        final l c2 = this.C;
        if (c2 != null) {
            final n d = this.D;
            if (d != null) {
                c2.d(d);
            }
        }
        this.C = c;
    }
    
    public final boolean h(final E e) {
        return false;
    }
    
    public final boolean i() {
        return false;
    }
    
    public final boolean k(final n n) {
        final Toolbar e = this.E;
        final View k = e.K;
        if (k instanceof c) {
            ((c)k).d();
        }
        ((ViewGroup)e).removeView(e.K);
        ((ViewGroup)e).removeView((View)e.J);
        e.K = null;
        final ArrayList j0 = e.j0;
        for (int i = j0.size() - 1; i >= 0; --i) {
            ((ViewGroup)e).addView((View)j0.get(i));
        }
        j0.clear();
        this.D = null;
        ((View)e).requestLayout();
        n.C = false;
        n.n.p(false);
        e.w();
        return true;
    }
}

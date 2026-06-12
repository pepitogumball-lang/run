package o;

import n.C;
import n.t;
import android.view.MenuItem;
import n.E;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import n.o;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import n.c;
import n.k;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import n.z;
import android.view.ViewGroup;
import android.view.View;
import n.n;
import X.a;
import android.util.SparseBooleanArray;
import android.graphics.drawable.Drawable;
import n.A;
import n.x;
import android.view.LayoutInflater;
import n.l;
import android.content.Context;
import n.y;

public final class i implements y
{
    public final Context C;
    public Context D;
    public l E;
    public final LayoutInflater F;
    public x G;
    public final int H;
    public final int I;
    public A J;
    public h K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final SparseBooleanArray T;
    public e U;
    public e V;
    public g W;
    public f X;
    public final a Y;
    
    public i(final Context c) {
        this.C = c;
        this.F = LayoutInflater.from(c);
        this.H = 2131427331;
        this.I = 2131427330;
        this.T = new SparseBooleanArray();
        this.Y = new a((Object)this, 15);
    }
    
    public final void a(final l l, final boolean b) {
        this.c();
        final e v = this.V;
        if (v != null && v.b()) {
            ((C)v.i).dismiss();
        }
        final x g = this.G;
        if (g != null) {
            g.a(l, b);
        }
    }
    
    public final View b(final n n, final View view, final ViewGroup viewGroup) {
        View actionView = n.getActionView();
        int visibility = 0;
        if (actionView == null || n.e()) {
            z z;
            if (view instanceof z) {
                z = (z)view;
            }
            else {
                z = (z)this.F.inflate(this.I, viewGroup, false);
            }
            z.a(n);
            final ActionMenuView itemInvoker = (ActionMenuView)this.J;
            final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)z;
            actionMenuItemView.setItemInvoker((k)itemInvoker);
            if (this.X == null) {
                this.X = new f(this);
            }
            actionMenuItemView.setPopupCallback((c)this.X);
            actionView = (View)z;
        }
        if (n.C) {
            visibility = 8;
        }
        actionView.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = actionView.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof o.k)) {
            actionView.setLayoutParams((ViewGroup$LayoutParams)ActionMenuView.l(layoutParams));
        }
        return actionView;
    }
    
    public final boolean c() {
        final g w = this.W;
        if (w != null) {
            final A j = this.J;
            if (j != null) {
                ((View)j).removeCallbacks((Runnable)w);
                this.W = null;
                return true;
            }
        }
        final e u = this.U;
        if (u != null) {
            if (u.b()) {
                ((C)u.i).dismiss();
            }
            return true;
        }
        return false;
    }
    
    public final void d() {
        final ViewGroup viewGroup = (ViewGroup)this.J;
        final ArrayList list = null;
        final boolean b = false;
        if (viewGroup != null) {
            final l e = this.E;
            int i;
            if (e != null) {
                e.i();
                final ArrayList l = this.E.l();
                final int size = l.size();
                int n = 0;
                int n2 = 0;
                while (true) {
                    i = n2;
                    if (n >= size) {
                        break;
                    }
                    final n n3 = (n)l.get(n);
                    int n4 = n2;
                    if (n3.f()) {
                        final View child = viewGroup.getChildAt(n2);
                        n itemData;
                        if (child instanceof z) {
                            itemData = ((z)child).getItemData();
                        }
                        else {
                            itemData = null;
                        }
                        final View b2 = this.b(n3, child, viewGroup);
                        if (n3 != itemData) {
                            b2.setPressed(false);
                            b2.jumpDrawablesToCurrentState();
                        }
                        if (b2 != child) {
                            final ViewGroup viewGroup2 = (ViewGroup)b2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b2);
                            }
                            ((ViewGroup)this.J).addView(b2, n2);
                        }
                        n4 = n2 + 1;
                    }
                    ++n;
                    n2 = n4;
                }
            }
            else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.K) {
                    ++i;
                }
                else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View)this.J).requestLayout();
        final l e2 = this.E;
        if (e2 != null) {
            e2.i();
            final ArrayList j = e2.i;
            for (int size2 = j.size(), k = 0; k < size2; ++k) {
                final o a = ((n)j.get(k)).A;
            }
        }
        final l e3 = this.E;
        ArrayList m = list;
        if (e3 != null) {
            e3.i();
            m = e3.j;
        }
        int n5 = b ? 1 : 0;
        if (this.N) {
            n5 = (b ? 1 : 0);
            if (m != null) {
                final int size3 = m.size();
                if (size3 == 1) {
                    n5 = ((((n)m.get(0)).C ^ true) ? 1 : 0);
                }
                else {
                    n5 = (b ? 1 : 0);
                    if (size3 > 0) {
                        n5 = 1;
                    }
                }
            }
        }
        if (n5 != 0) {
            if (this.K == null) {
                this.K = new h(this, this.C);
            }
            final ViewGroup viewGroup3 = (ViewGroup)((View)this.K).getParent();
            if (viewGroup3 != this.J) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView((View)this.K);
                }
                final ActionMenuView actionMenuView = (ActionMenuView)this.J;
                final h k2 = this.K;
                actionMenuView.getClass();
                final o.k k3 = ActionMenuView.k();
                k3.a = true;
                ((ViewGroup)actionMenuView).addView((View)k2, (ViewGroup$LayoutParams)k3);
            }
        }
        else {
            final h k4 = this.K;
            if (k4 != null) {
                final ViewParent parent = ((View)k4).getParent();
                final A j2 = this.J;
                if (parent == j2) {
                    ((ViewGroup)j2).removeView((View)this.K);
                }
            }
        }
        ((ActionMenuView)this.J).setOverflowReserved(this.N);
    }
    
    public final boolean e() {
        final e u = this.U;
        return u != null && u.b();
    }
    
    public final boolean f(final n n) {
        return false;
    }
    
    public final void g(final Context d, final l e) {
        LayoutInflater.from(this.D = d);
        this.E = e;
        final Resources resources = d.getResources();
        if (!this.O) {
            this.N = true;
        }
        final int widthPixels = d.getResources().getDisplayMetrics().widthPixels;
        int r = 2;
        this.P = widthPixels / 2;
        final Configuration configuration = d.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && screenWidthDp <= 600 && (screenWidthDp <= 960 || screenHeightDp <= 720) && (screenWidthDp <= 720 || screenHeightDp <= 960)) {
            if (screenWidthDp < 500 && (screenWidthDp <= 640 || screenHeightDp <= 480) && (screenWidthDp <= 480 || screenHeightDp <= 640)) {
                if (screenWidthDp >= 360) {
                    r = 3;
                }
            }
            else {
                r = 4;
            }
        }
        else {
            r = 5;
        }
        this.R = r;
        int p2 = this.P;
        if (this.N) {
            if (this.K == null) {
                final h k = new h(this, this.C);
                this.K = k;
                if (this.M) {
                    k.setImageDrawable(this.L);
                    this.L = null;
                    this.M = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                ((View)this.K).measure(measureSpec, measureSpec);
            }
            p2 -= ((View)this.K).getMeasuredWidth();
        }
        else {
            this.K = null;
        }
        this.Q = p2;
        final float density = resources.getDisplayMetrics().density;
    }
    
    public final boolean h(final E e) {
        if (!((l)e).hasVisibleItems()) {
            return false;
        }
        E e2 = e;
        while (true) {
            final l a = e2.A;
            if (a == this.E) {
                break;
            }
            e2 = (E)a;
        }
        final ViewGroup viewGroup = (ViewGroup)this.J;
        final View view = null;
        View child;
        if (viewGroup == null) {
            child = view;
        }
        else {
            final int childCount = viewGroup.getChildCount();
            int n = 0;
            while (true) {
                child = view;
                if (n >= childCount) {
                    break;
                }
                child = viewGroup.getChildAt(n);
                if (child instanceof z && ((z)child).getItemData() == e2.B) {
                    break;
                }
                ++n;
            }
        }
        if (child == null) {
            return false;
        }
        e.B.getClass();
        while (true) {
            for (int size = ((l)e).f.size(), i = 0; i < size; ++i) {
                final MenuItem item = ((l)e).getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    final boolean g = true;
                    final e v = new e(this, this.D, e, child);
                    this.V = v;
                    v.g = g;
                    final t j = v.i;
                    if (j != null) {
                        j.o(g);
                    }
                    final e v2 = this.V;
                    if (!v2.b()) {
                        if (v2.e == null) {
                            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                        }
                        v2.d(0, 0, false, false);
                    }
                    final x g2 = this.G;
                    if (g2 != null) {
                        g2.h((l)e);
                    }
                    return true;
                }
            }
            final boolean g = false;
            continue;
        }
    }
    
    public final boolean i() {
        final l e = this.E;
        ArrayList l;
        int size;
        if (e != null) {
            l = e.l();
            size = l.size();
        }
        else {
            size = 0;
            l = null;
        }
        final int r = this.R;
        final int q = this.Q;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)this.J;
        int i = 0;
        int n = 0;
        int n3;
        int n2 = n3 = n;
        int n4 = r;
        while (i < size) {
            final n n5 = (n)l.get(i);
            final int y = n5.y;
            if ((y & 0x2) == 0x2) {
                ++n3;
            }
            else if ((y & 0x1) == 0x1) {
                ++n2;
            }
            else {
                n = 1;
            }
            int n6 = n4;
            if (this.S) {
                n6 = n4;
                if (n5.C) {
                    n6 = 0;
                }
            }
            ++i;
            n4 = n6;
        }
        int n7 = n4;
        if (this.N && (n != 0 || n2 + n3 > (n7 = n4))) {
            n7 = n4 - 1;
        }
        int n8 = n7 - n3;
        final SparseBooleanArray t = this.T;
        t.clear();
        int j = 0;
        int n9 = 0;
        int n10 = q;
        while (j < size) {
            final n n11 = (n)l.get(j);
            final int y2 = n11.y;
            final boolean b = (y2 & 0x2) == 0x2;
            final int b2 = n11.b;
            int n12 = 0;
            Label_0588: {
                int n13;
                if (b) {
                    final View b3 = this.b(n11, null, viewGroup);
                    b3.measure(measureSpec, measureSpec);
                    final int measuredWidth = b3.getMeasuredWidth();
                    n12 = n10 - measuredWidth;
                    if ((n13 = n9) == 0) {
                        n13 = measuredWidth;
                    }
                    if (b2 != 0) {
                        t.put(b2, true);
                    }
                    n11.g(true);
                }
                else {
                    if ((y2 & 0x1) != 0x1) {
                        n11.g(false);
                        n12 = n10;
                        break Label_0588;
                    }
                    final boolean value = t.get(b2);
                    final boolean b4 = (n8 > 0 || value) && n10 > 0;
                    n12 = n10;
                    n13 = n9;
                    boolean b5 = b4;
                    if (b4) {
                        final View b6 = this.b(n11, null, viewGroup);
                        b6.measure(measureSpec, measureSpec);
                        final int measuredWidth2 = b6.getMeasuredWidth();
                        n12 = n10 - measuredWidth2;
                        if ((n13 = n9) == 0) {
                            n13 = measuredWidth2;
                        }
                        b5 = (b4 & n12 + n13 > 0);
                    }
                    int n14;
                    if (b5 && b2 != 0) {
                        t.put(b2, true);
                        n14 = n8;
                    }
                    else {
                        n14 = n8;
                        if (value) {
                            t.put(b2, false);
                            int n15 = 0;
                            while (true) {
                                n14 = n8;
                                if (n15 >= j) {
                                    break;
                                }
                                final n n16 = (n)l.get(n15);
                                int n17 = n8;
                                if (n16.b == b2) {
                                    n17 = n8;
                                    if (n16.f()) {
                                        n17 = n8 + 1;
                                    }
                                    n16.g(false);
                                }
                                ++n15;
                                n8 = n17;
                            }
                        }
                    }
                    n8 = n14;
                    if (b5) {
                        n8 = n14 - 1;
                    }
                    n11.g(b5);
                }
                n9 = n13;
            }
            ++j;
            n10 = n12;
        }
        return true;
    }
    
    public final void j(final x x) {
        throw null;
    }
    
    public final boolean k(final n n) {
        return false;
    }
    
    public final boolean l() {
        if (this.N && !this.e()) {
            final l e = this.E;
            if (e != null && this.J != null && this.W == null) {
                e.i();
                if (!e.j.isEmpty()) {
                    final g w = new g(this, new e(this, this.D, this.E, (View)this.K));
                    this.W = w;
                    ((View)this.J).post((Runnable)w);
                    return true;
                }
            }
        }
        return false;
    }
}

package n;

import android.widget.AdapterView;
import android.view.MenuItem;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;
import java.lang.reflect.Method;
import o.w;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.graphics.Rect;
import o.F0;
import android.util.Log;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import o.C0;
import android.view.LayoutInflater;
import android.view.KeyEvent;
import android.view.Gravity;
import o.r0;
import android.widget.ListAdapter;
import android.widget.HeaderViewListAdapter;
import java.util.Iterator;
import o.I0;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.transition.Transition;
import android.widget.PopupWindow;
import o.E0;
import android.content.res.Resources;
import java.util.WeakHashMap;
import O.V;
import android.view.ViewTreeObserver;
import android.view.View;
import V4.G;
import Y3.c;
import java.util.ArrayList;
import android.os.Handler;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnKeyListener;

public final class f extends t implements View$OnKeyListener, PopupWindow$OnDismissListener
{
    public final Context D;
    public final int E;
    public final int F;
    public final boolean G;
    public final Handler H;
    public final ArrayList I;
    public final ArrayList J;
    public final d K;
    public final c L;
    public final G M;
    public int N;
    public int O;
    public View P;
    public View Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public x Y;
    public ViewTreeObserver Z;
    public u a0;
    public boolean b0;
    
    public f(final Context d, final View p4, int n, final boolean g) {
        final int n2 = 1;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new d(this, 0);
        this.L = new c((Object)this, 1);
        this.M = new G((Object)this, 15);
        this.N = 0;
        this.O = 0;
        this.D = d;
        this.P = p4;
        this.F = n;
        this.G = g;
        this.W = false;
        final WeakHashMap a = O.V.a;
        n = n2;
        if (p4.getLayoutDirection() == 1) {
            n = 0;
        }
        this.R = n;
        final Resources resources = d.getResources();
        this.E = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131099671));
        this.H = new Handler();
    }
    
    public final void a(final l l, final boolean b) {
        final ArrayList j = this.J;
        final int size = j.size();
        int i = 0;
        while (true) {
            while (i < size) {
                if (l == ((e)j.get(i)).b) {
                    if (i < 0) {
                        return;
                    }
                    final int n = i + 1;
                    if (n < j.size()) {
                        ((e)j.get(n)).b.c(false);
                    }
                    final e e = (e)j.remove(i);
                    e.b.r(this);
                    final boolean b2 = this.b0;
                    final I0 a = e.a;
                    if (b2) {
                        E0.b((PopupWindow)((C0)a).a0, (Transition)null);
                        ((PopupWindow)((C0)a).a0).setAnimationStyle(0);
                    }
                    ((C0)a).dismiss();
                    final int size2 = j.size();
                    if (size2 > 0) {
                        this.R = ((e)j.get(size2 - 1)).c;
                    }
                    else {
                        final View p2 = this.P;
                        final WeakHashMap a2 = O.V.a;
                        this.R = ((p2.getLayoutDirection() != 1) ? 1 : 0);
                    }
                    if (size2 == 0) {
                        this.dismiss();
                        final x y = this.Y;
                        if (y != null) {
                            y.a(l, true);
                        }
                        final ViewTreeObserver z = this.Z;
                        if (z != null) {
                            if (z.isAlive()) {
                                this.Z.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.K);
                            }
                            this.Z = null;
                        }
                        this.Q.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.L);
                        this.a0.onDismiss();
                    }
                    else if (b) {
                        ((e)j.get(0)).b.c(false);
                    }
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public final boolean b() {
        final ArrayList j = this.J;
        final int size = j.size();
        boolean b = false;
        if (size > 0) {
            b = b;
            if (((PopupWindow)((C0)((e)j.get(0)).a).a0).isShowing()) {
                b = true;
            }
        }
        return b;
    }
    
    public final void c() {
        if (this.b()) {
            return;
        }
        final ArrayList i = this.I;
        final Iterator iterator = i.iterator();
        while (iterator.hasNext()) {
            this.v((l)iterator.next());
        }
        i.clear();
        final View p = this.P;
        if ((this.Q = p) != null) {
            final boolean b = this.Z == null;
            final ViewTreeObserver viewTreeObserver = p.getViewTreeObserver();
            this.Z = viewTreeObserver;
            if (b) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this.K);
            }
            this.Q.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.L);
        }
    }
    
    public final void d() {
        final Iterator iterator = this.J.iterator();
        while (iterator.hasNext()) {
            final ListAdapter adapter = ((ListView)((C0)((e)iterator.next()).a).E).getAdapter();
            i i;
            if (adapter instanceof HeaderViewListAdapter) {
                i = (i)((HeaderViewListAdapter)adapter).getWrappedAdapter();
            }
            else {
                i = (i)adapter;
            }
            i.notifyDataSetChanged();
        }
    }
    
    public final void dismiss() {
        final ArrayList j = this.J;
        int i = j.size();
        if (i > 0) {
            final e[] array = (e[])j.toArray((Object[])new e[i]);
            --i;
            while (i >= 0) {
                final e e = array[i];
                if (((PopupWindow)((C0)e.a).a0).isShowing()) {
                    ((C0)e.a).dismiss();
                }
                --i;
            }
        }
    }
    
    public final r0 e() {
        final ArrayList j = this.J;
        r0 e;
        if (j.isEmpty()) {
            e = null;
        }
        else {
            e = ((C0)((e)j.get(j.size() - 1)).a).E;
        }
        return e;
    }
    
    public final boolean h(final E e) {
        for (final e e2 : this.J) {
            if (e == e2.b) {
                ((View)((C0)e2.a).E).requestFocus();
                return true;
            }
        }
        if (e.hasVisibleItems()) {
            this.l(e);
            final x y = this.Y;
            if (y != null) {
                y.h((l)e);
            }
            return true;
        }
        return false;
    }
    
    public final boolean i() {
        return false;
    }
    
    public final void j(final x y) {
        this.Y = y;
    }
    
    @Override
    public final void l(final l l) {
        l.b(this, this.D);
        if (this.b()) {
            this.v(l);
        }
        else {
            this.I.add((Object)l);
        }
    }
    
    @Override
    public final void n(final View p) {
        if (this.P != p) {
            this.P = p;
            final int n = this.N;
            final WeakHashMap a = O.V.a;
            this.O = Gravity.getAbsoluteGravity(n, p.getLayoutDirection());
        }
    }
    
    @Override
    public final void o(final boolean w) {
        this.W = w;
    }
    
    public final void onDismiss() {
        final ArrayList j = this.J;
        while (true) {
            for (int size = j.size(), i = 0; i < size; ++i) {
                final e e = (e)j.get(i);
                if (!((PopupWindow)((C0)e.a).a0).isShowing()) {
                    if (e != null) {
                        e.b.c(false);
                    }
                    return;
                }
            }
            final e e = null;
            continue;
        }
    }
    
    public final boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }
    
    @Override
    public final void p(final int n) {
        if (this.N != n) {
            this.N = n;
            final View p = this.P;
            final WeakHashMap a = O.V.a;
            this.O = Gravity.getAbsoluteGravity(n, p.getLayoutDirection());
        }
    }
    
    @Override
    public final void q(final int u) {
        this.S = true;
        this.U = u;
    }
    
    @Override
    public final void r(final PopupWindow$OnDismissListener popupWindow$OnDismissListener) {
        this.a0 = (u)popupWindow$OnDismissListener;
    }
    
    @Override
    public final void s(final boolean x) {
        this.X = x;
    }
    
    @Override
    public final void t(final int v) {
        this.T = true;
        this.V = v;
    }
    
    public final void v(final l l) {
        final Context d = this.D;
        final LayoutInflater from = LayoutInflater.from(d);
        final i i = new i(l, from, this.G, 2131427339);
        if (!this.b() && this.W) {
            i.E = true;
        }
        else if (this.b()) {
            i.E = t.u(l);
        }
        int n = t.m((ListAdapter)i, d, this.E);
        final C0 c0 = new C0(d, (AttributeSet)null, this.F);
        ((I0)c0).d0 = this.M;
        c0.R = (AdapterView$OnItemClickListener)this;
        ((PopupWindow)c0.a0).setOnDismissListener((PopupWindow$OnDismissListener)this);
        c0.Q = this.P;
        c0.N = this.O;
        c0.Z = true;
        ((PopupWindow)c0.a0).setFocusable(true);
        ((PopupWindow)c0.a0).setInputMethodMode(2);
        c0.p((ListAdapter)i);
        c0.r(n);
        c0.N = this.O;
        final ArrayList j = this.J;
        e e2 = null;
        View q = null;
        Label_0471: {
            Label_0468: {
                if (j.size() > 0) {
                    final e e = (e)j.get(j.size() - 1);
                    final l b = e.b;
                    final int size = b.f.size();
                    int k = 0;
                    while (true) {
                        while (k < size) {
                            final Object item = b.getItem(k);
                            if (((MenuItem)item).hasSubMenu() && l == ((MenuItem)item).getSubMenu()) {
                                if (item == null) {
                                    final View view = null;
                                    e2 = e;
                                    q = view;
                                    break Label_0471;
                                }
                                final r0 e3 = ((C0)e.a).E;
                                final ListAdapter adapter = ((ListView)e3).getAdapter();
                                int headersCount;
                                i m;
                                if (adapter instanceof HeaderViewListAdapter) {
                                    final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                                    headersCount = headerViewListAdapter.getHeadersCount();
                                    m = (i)headerViewListAdapter.getWrappedAdapter();
                                }
                                else {
                                    m = (i)adapter;
                                    headersCount = 0;
                                }
                                final int count = m.getCount();
                                int n2 = 0;
                                while (true) {
                                    while (n2 < count) {
                                        if (item == m.b(n2)) {
                                            if (n2 == -1) {
                                                e2 = e;
                                                break Label_0468;
                                            }
                                            final int n3 = n2 + headersCount - ((AdapterView)e3).getFirstVisiblePosition();
                                            e2 = e;
                                            if (n3 < 0) {
                                                break Label_0468;
                                            }
                                            if (n3 >= ((ViewGroup)e3).getChildCount()) {
                                                e2 = e;
                                                break Label_0468;
                                            }
                                            final View child = ((ViewGroup)e3).getChildAt(n3);
                                            e2 = e;
                                            q = child;
                                            break Label_0471;
                                        }
                                        else {
                                            ++n2;
                                        }
                                    }
                                    n2 = -1;
                                    continue;
                                }
                            }
                            else {
                                ++k;
                            }
                        }
                        final Object item = null;
                        continue;
                    }
                }
                e2 = null;
            }
            q = null;
        }
        Label_0939: {
            if (q != null) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                final w a0 = c0.a0;
                if (sdk_INT <= 28) {
                    final Method e4 = I0.e0;
                    if (e4 != null) {
                        try {
                            e4.invoke((Object)a0, new Object[] { Boolean.FALSE });
                        }
                        catch (final Exception ex) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                }
                else {
                    F0.a((PopupWindow)a0, false);
                }
                E0.a((PopupWindow)c0.a0, (Transition)null);
                final r0 e5 = ((C0)((e)j.get(j.size() - 1)).a).E;
                final int[] array = new int[2];
                ((View)e5).getLocationOnScreen(array);
                final Rect rect = new Rect();
                this.Q.getWindowVisibleDisplayFrame(rect);
                while (true) {
                    Label_0643: {
                        if (this.R == 1) {
                            if (((View)e5).getWidth() + array[0] + n <= rect.right) {
                                break Label_0643;
                            }
                        }
                        else if (array[0] - n < 0) {
                            break Label_0643;
                        }
                        final int r = 0;
                        final boolean b2 = r == 1;
                        this.R = r;
                        int n4;
                        int n5;
                        if (Build$VERSION.SDK_INT >= 26) {
                            c0.Q = q;
                            n4 = 0;
                            n5 = 0;
                        }
                        else {
                            final int[] array2 = new int[2];
                            this.P.getLocationOnScreen(array2);
                            final int[] array3 = new int[2];
                            q.getLocationOnScreen(array3);
                            if ((this.O & 0x7) == 0x5) {
                                array2[0] += this.P.getWidth();
                                array3[0] += q.getWidth();
                            }
                            n5 = array3[0] - array2[0];
                            n4 = array3[1] - array2[1];
                        }
                        int h = 0;
                        Label_0845: {
                            if ((this.O & 0x5) == 0x5) {
                                if (b2) {
                                    h = n5 + n;
                                    break Label_0845;
                                }
                                n = q.getWidth();
                            }
                            else if (b2) {
                                h = n5 + q.getWidth();
                                break Label_0845;
                            }
                            h = n5 - n;
                        }
                        c0.H = h;
                        c0.M = true;
                        c0.L = true;
                        c0.i(n4);
                        break Label_0939;
                    }
                    final int r = 1;
                    continue;
                }
            }
            if (this.S) {
                c0.H = this.U;
            }
            if (this.T) {
                c0.i(this.V);
            }
            final Rect c2 = super.C;
            Rect y;
            if (c2 != null) {
                y = new Rect(c2);
            }
            else {
                y = null;
            }
            c0.Y = y;
        }
        j.add((Object)new e((I0)c0, l, this.R));
        c0.c();
        final r0 e6 = c0.E;
        ((View)e6).setOnKeyListener((View$OnKeyListener)this);
        if (e2 == null && this.X && l.m != null) {
            final FrameLayout frameLayout = (FrameLayout)from.inflate(2131427346, (ViewGroup)e6, false);
            final TextView textView = (TextView)((View)frameLayout).findViewById(16908310);
            ((View)frameLayout).setEnabled(false);
            textView.setText(l.m);
            ((ListView)e6).addHeaderView((View)frameLayout, (Object)null, false);
            c0.c();
        }
    }
}

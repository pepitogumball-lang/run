package j;

import java.lang.ref.Reference;
import o.i;
import android.view.MenuInflater;
import m.a;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import h1.m;
import n.l;
import android.content.Context;
import n.j;
import m.b;

public final class K extends b implements j
{
    public final Context E;
    public final l F;
    public m G;
    public WeakReference H;
    public final L I;
    
    public K(final L i, final Context e, final m g) {
        this.I = i;
        this.E = e;
        this.G = g;
        final l f = new l(e);
        f.l = 1;
        this.F = f;
        f.e = (j)this;
    }
    
    @Override
    public final void a() {
        final L i = this.I;
        if (i.i != this) {
            return;
        }
        final boolean p = i.p;
        final boolean q = i.q;
        if (!p && !q) {
            this.G.d(this);
        }
        else {
            i.j = this;
            i.k = this.G;
        }
        this.G = null;
        i.v(false);
        final ActionBarContextView f = i.f;
        if (f.M == null) {
            f.e();
        }
        i.c.setHideOnContentScrollEnabled(i.v);
        i.i = null;
    }
    
    @Override
    public final View b() {
        final WeakReference h = this.H;
        View view;
        if (h != null) {
            view = (View)((Reference)h).get();
        }
        else {
            view = null;
        }
        return view;
    }
    
    public final boolean c(final l l, final MenuItem menuItem) {
        final m g = this.G;
        return g != null && ((a)g.D).f((b)this, menuItem);
    }
    
    @Override
    public final l d() {
        return this.F;
    }
    
    @Override
    public final MenuInflater e() {
        return new m.j(this.E);
    }
    
    public final void f(final l l) {
        if (this.G == null) {
            return;
        }
        this.i();
        final i f = this.I.f.F;
        if (f != null) {
            f.l();
        }
    }
    
    @Override
    public final CharSequence g() {
        return this.I.f.getSubtitle();
    }
    
    @Override
    public final CharSequence h() {
        return this.I.f.getTitle();
    }
    
    @Override
    public final void i() {
        if (this.I.i != this) {
            return;
        }
        final l f = this.F;
        f.w();
        try {
            this.G.b(this, f);
        }
        finally {
            f.v();
        }
    }
    
    @Override
    public final boolean j() {
        return this.I.f.U;
    }
    
    @Override
    public final void k(final View customView) {
        this.I.f.setCustomView(customView);
        this.H = new WeakReference((Object)customView);
    }
    
    @Override
    public final void l(final int n) {
        this.m((CharSequence)this.I.a.getResources().getString(n));
    }
    
    @Override
    public final void m(final CharSequence subtitle) {
        this.I.f.setSubtitle(subtitle);
    }
    
    @Override
    public final void n(final int n) {
        this.o((CharSequence)this.I.a.getResources().getString(n));
    }
    
    @Override
    public final void o(final CharSequence title) {
        this.I.f.setTitle(title);
    }
    
    @Override
    public final void p(final boolean b) {
        super.D = b;
        this.I.f.setTitleOptional(b);
    }
}

package m;

import java.lang.ref.Reference;
import o.i;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import n.l;
import java.lang.ref.WeakReference;
import h1.m;
import androidx.appcompat.widget.ActionBarContextView;
import android.content.Context;
import n.j;

public final class f extends b implements j
{
    public Context E;
    public ActionBarContextView F;
    public m G;
    public WeakReference H;
    public boolean I;
    public l J;
    
    @Override
    public final void a() {
        if (this.I) {
            return;
        }
        this.I = true;
        this.G.d(this);
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
        return ((a)this.G.D).f((b)this, menuItem);
    }
    
    @Override
    public final l d() {
        return this.J;
    }
    
    @Override
    public final MenuInflater e() {
        return new m.j(((View)this.F).getContext());
    }
    
    public final void f(final l l) {
        this.i();
        final i f = this.F.F;
        if (f != null) {
            f.l();
        }
    }
    
    @Override
    public final CharSequence g() {
        return this.F.getSubtitle();
    }
    
    @Override
    public final CharSequence h() {
        return this.F.getTitle();
    }
    
    @Override
    public final void i() {
        this.G.b(this, this.J);
    }
    
    @Override
    public final boolean j() {
        return this.F.U;
    }
    
    @Override
    public final void k(final View customView) {
        this.F.setCustomView(customView);
        WeakReference h;
        if (customView != null) {
            h = new WeakReference((Object)customView);
        }
        else {
            h = null;
        }
        this.H = h;
    }
    
    @Override
    public final void l(final int n) {
        this.m((CharSequence)this.E.getString(n));
    }
    
    @Override
    public final void m(final CharSequence subtitle) {
        this.F.setSubtitle(subtitle);
    }
    
    @Override
    public final void n(final int n) {
        this.o((CharSequence)this.E.getString(n));
    }
    
    @Override
    public final void o(final CharSequence title) {
        this.F.setTitle(title);
    }
    
    @Override
    public final void p(final boolean b) {
        super.D = b;
        this.F.setTitleOptional(b);
    }
}

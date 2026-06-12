package n;

import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.content.DialogInterface$OnDismissListener;
import j.d;
import h1.w;
import android.content.ContextWrapper;
import androidx.appcompat.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

public final class h implements y, AdapterView$OnItemClickListener
{
    public Context C;
    public LayoutInflater D;
    public l E;
    public ExpandedMenuView F;
    public x G;
    public g H;
    
    public h(final ContextWrapper c) {
        this.C = (Context)c;
        this.D = LayoutInflater.from((Context)c);
    }
    
    @Override
    public final void a(final l l, final boolean b) {
        final x g = this.G;
        if (g != null) {
            g.a(l, b);
        }
    }
    
    @Override
    public final void d() {
        final g h = this.H;
        if (h != null) {
            h.notifyDataSetChanged();
        }
    }
    
    @Override
    public final boolean f(final n n) {
        return false;
    }
    
    @Override
    public final void g(final Context c, final l e) {
        if (this.C != null) {
            this.C = c;
            if (this.D == null) {
                this.D = LayoutInflater.from(c);
            }
        }
        this.E = e;
        final g h = this.H;
        if (h != null) {
            h.notifyDataSetChanged();
        }
    }
    
    @Override
    public final boolean h(final E c) {
        if (!c.hasVisibleItems()) {
            return false;
        }
        final Object o = new Object();
        ((m)o).C = c;
        final Context a = c.a;
        final w w = new w(a);
        final d d = (d)w.D;
        final h e = new h((ContextWrapper)d.a);
        ((m)o).E = e;
        e.G = (x)o;
        c.b(e, a);
        final h e2 = ((m)o).E;
        if (e2.H == null) {
            e2.H = new g(e2);
        }
        d.m = e2.H;
        d.n = (DialogInterface$OnClickListener)o;
        final View o2 = c.o;
        if (o2 != null) {
            d.e = o2;
        }
        else {
            d.c = c.n;
            d.d = c.m;
        }
        d.l = (m)o;
        ((Dialog)(((m)o).D = w.g())).setOnDismissListener((DialogInterface$OnDismissListener)o);
        final WindowManager$LayoutParams attributes = ((Dialog)((m)o).D).getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 0x20000;
        ((Dialog)((m)o).D).show();
        final x g = this.G;
        if (g != null) {
            g.h((l)c);
        }
        return true;
    }
    
    @Override
    public final boolean i() {
        return false;
    }
    
    @Override
    public final void j(final x x) {
        throw null;
    }
    
    @Override
    public final boolean k(final n n) {
        return false;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.E.q((MenuItem)this.H.b(n), this, 0);
    }
}

package n;

import o.i;
import o.e;
import o.f;
import o.h;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.view.View;
import o.u0;

public final class b extends u0
{
    public final int L;
    public final View M;
    
    public b(final ActionMenuItemView m) {
        this.L = 0;
        super(this.M = (View)m);
    }
    
    public b(final h m, final h h) {
        this.L = 1;
        this.M = (View)m;
        super((View)h);
    }
    
    @Override
    public final C b() {
        switch (this.L) {
            default: {
                final e u = ((h)this.M).F.U;
                C a;
                if (u == null) {
                    a = null;
                }
                else {
                    a = ((w)u).a();
                }
                return a;
            }
            case 0: {
                final c o = ((ActionMenuItemView)this.M).O;
                C a2 = null;
                if (o != null) {
                    final e v = ((f)o).a.V;
                    a2 = a2;
                    if (v != null) {
                        a2 = ((w)v).a();
                    }
                }
                return a2;
            }
        }
    }
    
    @Override
    public final boolean d() {
        switch (this.L) {
            default: {
                ((h)this.M).F.l();
                return true;
            }
            case 0: {
                final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)this.M;
                final k m = actionMenuItemView.M;
                boolean b2;
                final boolean b = b2 = false;
                if (m != null) {
                    b2 = b;
                    if (m.c(actionMenuItemView.J)) {
                        final C b3 = this.b();
                        b2 = b;
                        if (b3 != null) {
                            b2 = b;
                            if (b3.b()) {
                                b2 = true;
                            }
                        }
                    }
                }
                return b2;
            }
        }
    }
    
    @Override
    public boolean f() {
        switch (this.L) {
            default: {
                return super.f();
            }
            case 1: {
                final i f = ((h)this.M).F;
                boolean b;
                if (f.W != null) {
                    b = false;
                }
                else {
                    f.c();
                    b = true;
                }
                return b;
            }
        }
    }
}

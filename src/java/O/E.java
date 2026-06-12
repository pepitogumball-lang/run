package o;

import n.y;
import n.t;
import X.a;
import n.x;
import n.l;
import android.view.View;
import n.E;
import android.content.Context;
import n.w;

public final class e extends w
{
    public final int l;
    public final i m;
    
    public e(final i m, final Context context, final E e, final View view) {
        this.l = 0;
        this.m = m;
        super(2130903074, context, view, (l)e, false);
        if (!e.B.f()) {
            Object k;
            if ((k = m.K) == null) {
                k = m.J;
            }
            super.e = (View)k;
        }
        final a y = m.Y;
        super.h = (x)y;
        final t i = super.i;
        if (i != null) {
            ((y)i).j((x)y);
        }
    }
    
    public e(final i m, final Context context, final l l, final View view) {
        this.l = 1;
        this.m = m;
        super(2130903074, context, view, l, true);
        super.f = 8388613;
        final a y = m.Y;
        super.h = (x)y;
        final t i = super.i;
        if (i != null) {
            ((y)i).j((x)y);
        }
    }
    
    public final void c() {
        switch (this.l) {
            default: {
                final i m = this.m;
                final l e = m.E;
                if (e != null) {
                    e.c(true);
                }
                m.U = null;
                super.c();
                return;
            }
            case 0: {
                final i i = this.m;
                i.V = null;
                i.getClass();
                super.c();
            }
        }
    }
}

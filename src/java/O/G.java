package o;

import n.j;
import n.l;
import android.view.View;

public final class g implements Runnable
{
    public final e C;
    public final i D;
    
    public g(final i d, final e c) {
        this.D = d;
        this.C = c;
    }
    
    public final void run() {
        final i d = this.D;
        final l e = d.E;
        if (e != null) {
            final j e2 = e.e;
            if (e2 != null) {
                e2.f(e);
            }
        }
        final View view = (View)d.J;
        Label_0087: {
            if (view != null && view.getWindowToken() != null) {
                final e c = this.C;
                if (!c.b()) {
                    if (c.e == null) {
                        break Label_0087;
                    }
                    c.d(0, 0, false, false);
                }
                d.U = c;
            }
        }
        d.W = null;
    }
}

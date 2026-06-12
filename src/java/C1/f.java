package c1;

import J5.b;

public final class f extends b
{
    public final void G(final g g, final g b) {
        g.b = b;
    }
    
    public final void I(final g g, final Thread a) {
        g.a = a;
    }
    
    public final boolean d(final h h, final c c, final c d) {
        monitorenter(h);
        Label_0027: {
            try {
                if (h.D == c) {
                    h.D = d;
                    monitorexit(h);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(h);
                monitorexit(h);
                return false;
            }
        }
    }
    
    public final boolean f(final h h, final Object o, final Object c) {
        monitorenter(h);
        Label_0027: {
            try {
                if (h.C == o) {
                    h.C = c;
                    monitorexit(h);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(h);
                monitorexit(h);
                return false;
            }
        }
    }
    
    public final boolean h(final h h, final g g, final g e) {
        monitorenter(h);
        Label_0027: {
            try {
                if (h.E == g) {
                    h.E = e;
                    monitorexit(h);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(h);
                monitorexit(h);
                return false;
            }
        }
    }
}

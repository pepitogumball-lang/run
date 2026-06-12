package V2;

import J5.b;

public final class f extends b
{
    public final void F(final m m, final m b) {
        m.b = b;
    }
    
    public final void H(final m m, final Thread a) {
        m.a = a;
    }
    
    public final boolean c(final n n, final d d, final d d2) {
        monitorenter(n);
        Label_0027: {
            try {
                if (n.D == d) {
                    n.D = d2;
                    monitorexit(n);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(n);
                monitorexit(n);
                return false;
            }
        }
    }
    
    public final boolean e(final n n, final Object o, final Object c) {
        monitorenter(n);
        Label_0027: {
            try {
                if (n.C == o) {
                    n.C = c;
                    monitorexit(n);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(n);
                monitorexit(n);
                return false;
            }
        }
    }
    
    public final boolean g(final n n, final m m, final m e) {
        monitorenter(n);
        Label_0027: {
            try {
                if (n.E == m) {
                    n.E = e;
                    monitorexit(n);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(n);
                monitorexit(n);
                return false;
            }
        }
    }
    
    public final d y(final n n) {
        final d d = V2.d.d;
        synchronized (n) {
            final d d2 = n.D;
            if (d2 != d) {
                n.D = d;
            }
            return d2;
        }
    }
    
    public final m z(final n n) {
        final m c = m.c;
        synchronized (n) {
            final m e = n.E;
            if (e != c) {
                n.E = c;
            }
            return e;
        }
    }
}

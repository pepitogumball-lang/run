package u;

import com.google.android.gms.internal.auth.m;

public final class e extends m
{
    public final boolean c(final g g, final c c, final c d) {
        monitorenter(g);
        Label_0027: {
            try {
                if (g.D == c) {
                    g.D = d;
                    monitorexit(g);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(g);
                monitorexit(g);
                return false;
            }
        }
    }
    
    public final boolean d(final g g, final Object o, final Object c) {
        monitorenter(g);
        Label_0027: {
            try {
                if (g.C == o) {
                    g.C = c;
                    monitorexit(g);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(g);
                monitorexit(g);
                return false;
            }
        }
    }
    
    public final boolean e(final g g, final f f, final f e) {
        monitorenter(g);
        Label_0027: {
            try {
                if (g.E == f) {
                    g.E = e;
                    monitorexit(g);
                    return true;
                }
                break Label_0027;
            }
            finally {
                monitorexit(g);
                monitorexit(g);
                return false;
            }
        }
    }
    
    public final void t(final f f, final f b) {
        f.b = b;
    }
    
    public final void u(final f f, final Thread a) {
        f.a = a;
    }
}

package h2;

import f2.i;
import f2.h;
import java.util.Objects;

public final class n implements c, a, b
{
    public static n D;
    public static final o E;
    public Object C;
    
    static {
        E = new o(0, false, false, 0, 0);
    }
    
    public n(final d c) {
        Objects.requireNonNull((Object)c);
        this.C = c;
    }
    
    public static n b() {
        final Class<n> clazz;
        monitorenter(clazz = n.class);
        Label_0030: {
            try {
                if (n.D == null) {
                    n.D = (n)new Object();
                }
                break Label_0030;
            }
            finally {
                monitorexit(clazz);
                final n d = n.D;
                monitorexit(clazz);
                return d;
            }
        }
    }
    
    public void Q(final int n) {
        ((h)this.C).Q(n);
    }
    
    public void T() {
        ((h)this.C).T();
    }
    
    public void a(final e2.b b) {
        final boolean h = b.h();
        final d d = (d)this.C;
        if (h) {
            d.k((h2.h)null, d.l());
            return;
        }
        final b p = d.p;
        if (p != null) {
            p.e0(b);
        }
    }
    
    public void e0(final e2.b b) {
        ((i)this.C).e0(b);
    }
}

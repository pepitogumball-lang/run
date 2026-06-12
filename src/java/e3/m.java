package e3;

import L3.g;
import E3.a;
import Z4.J;
import E3.b;

public final class m implements b
{
    public static final J c;
    public static final L3.m d;
    public a a;
    public volatile b b;
    
    static {
        c = new J(23);
        d = new L3.m(6);
    }
    
    public m(final J a, final b b) {
        this.a = (a)a;
        this.b = b;
    }
    
    public final void a(final a a) {
        final b b = this.b;
        final L3.m d = m.d;
        if (b != d) {
            a.b(b);
            return;
        }
        synchronized (this) {
            final b b2 = this.b;
            b b3;
            if (b2 != d) {
                b3 = b2;
            }
            else {
                this.a = (a)new g((Object)this.a, 11, (Object)a);
                b3 = null;
            }
            monitorexit(this);
            if (b3 != null) {
                a.b(b2);
            }
        }
    }
    
    public final Object get() {
        return this.b.get();
    }
}

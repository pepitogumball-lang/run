package W;

import e5.d;
import m5.p;
import g5.h;

public final class s extends h implements p
{
    public Object G;
    public final I H;
    
    public s(final I h, final d d) {
        this.H = h;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((s)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object g) {
        final s s = new s(this.H, d);
        s.G = g;
        return (d)s;
    }
    
    public final Object l(final Object o) {
        com.google.android.gms.internal.auth.h.z(o);
        final I i = (I)this.G;
        final I h = this.H;
        final boolean b = h instanceof c;
        boolean b3;
        final boolean b2 = b3 = false;
        if (!b) {
            if (h instanceof i) {
                b3 = b2;
            }
            else {
                b3 = b2;
                if (i == h) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
}

package i4;

import Z.b;
import Z.d;
import m5.p;
import g5.h;

public final class m extends h implements p
{
    public Object G;
    public final Object H;
    public final d I;
    public final n J;
    
    public m(final Object h, final d i, final n j, final e5.d d) {
        this.H = h;
        this.I = i;
        this.J = j;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        final m m = (m)this.i((e5.d)o2, o);
        final c5.h a = c5.h.a;
        m.l(a);
        return a;
    }
    
    public final e5.d i(final e5.d d, final Object g) {
        final m m = new m(this.H, this.I, this.J, d);
        m.G = g;
        return (e5.d)m;
    }
    
    public final Object l(final Object o) {
        com.google.android.gms.internal.auth.h.z(o);
        final b b = (b)this.G;
        final d i = this.I;
        final Object h = this.H;
        if (h != null) {
            b.c(i, h);
        }
        else {
            b.getClass();
            n5.h.e("key", (Object)i);
            b.a();
            b.a.remove((Object)i);
        }
        n.a(this.J, b);
        return c5.h.a;
    }
}

package W;

import n5.n;
import X4.r;
import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class v extends h implements p
{
    public int G;
    public Object H;
    public final H I;
    
    public v(final H i, final d d) {
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((v)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object h) {
        final v v = new v(this.I, d);
        v.H = h;
        return (d)v;
    }
    
    public final Object l(final Object o) {
        final a c = a.C;
        final int g = this.G;
        final c5.h a = c5.h.a;
        if (g == 0) {
            com.google.android.gms.internal.auth.h.z(o);
            final z5.d d = (z5.d)this.H;
            final H i = this.I;
            final I j = (I)i.H.b();
            if (!(j instanceof c)) {
                i.J.s(new m(j));
            }
            final s s = new s(j, null);
            this.G = 1;
            i.H.e((z5.d)new r((n)new Object(), (z5.d)new u(d, 0), s), (d)this);
            return c;
        }
        if (g == 1) {
            com.google.android.gms.internal.auth.h.z(o);
            return a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package W;

import g5.c;
import n3.u0;
import f5.a;
import java.util.List;
import m5.p;
import g5.h;

public final class d extends h implements p
{
    public int G;
    public Object H;
    public final List I;
    
    public d(final List i, final e5.d d) {
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((d)this.i((e5.d)o2, o)).l(c5.h.a);
    }
    
    public final e5.d i(final e5.d d, final Object h) {
        final d d2 = new d(this.I, d);
        d2.H = h;
        return (e5.d)d2;
    }
    
    public final Object l(final Object o) {
        final a c = a.C;
        final int g = this.G;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(o);
        }
        else {
            com.google.android.gms.internal.auth.h.z(o);
            final z z = (z)this.H;
            this.G = 1;
            if (u0.b(this.I, z, (c)this) == c) {
                return c;
            }
        }
        return c5.h.a;
    }
}

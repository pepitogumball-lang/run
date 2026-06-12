package A5;

import g5.c;
import y5.n;
import e5.i;
import w5.u;
import f5.a;
import L3.v;
import m5.p;
import g5.h;

public final class d extends h implements p
{
    public int G;
    public Object H;
    public final z5.d I;
    public final v J;
    
    public d(final z5.d i, final v j, final e5.d d) {
        this.I = i;
        this.J = j;
        super(2, d);
    }
    
    @Override
    public final Object f(final Object o, final Object o2) {
        return ((d)this.i((e5.d)o2, o)).l(c5.h.a);
    }
    
    @Override
    public final e5.d i(final e5.d d, final Object h) {
        final d d2 = new d(this.I, this.J, d);
        d2.H = h;
        return d2;
    }
    
    @Override
    public final Object l(Object b) {
        final a c = a.C;
        final int g = this.G;
        final c5.h a = c5.h.a;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(b);
        }
        else {
            com.google.android.gms.internal.auth.h.z(b);
            final u u = (u)this.H;
            final v j = this.J;
            int e;
            if ((e = j.E) == -3) {
                e = -2;
            }
            b = new e(j, null);
            final n n = new n(w5.v.j(u, (i)j.D), y5.i.a(e, j.F, 4));
            ((w5.a)n).T(3, (w5.a)n, (p)b);
            this.G = 1;
            b = z5.p.b(this.I, n, true, (c)this);
            if (b != c) {
                b = a;
            }
            if (b == c) {
                return c;
            }
        }
        return a;
    }
}

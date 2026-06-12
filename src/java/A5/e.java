package A5;

import y5.o;
import f5.a;
import e5.d;
import L3.v;
import m5.p;
import g5.h;

public final class e extends h implements p
{
    public int G;
    public Object H;
    public final v I;
    
    public e(final v i, final d d) {
        this.I = i;
        super(2, d);
    }
    
    @Override
    public final Object f(final Object o, final Object o2) {
        return ((e)this.i((d)o2, o)).l(c5.h.a);
    }
    
    @Override
    public final d i(final d d, final Object h) {
        final e e = new e(this.I, d);
        e.H = h;
        return e;
    }
    
    @Override
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
            final o o2 = (o)this.H;
            this.G = 1;
            if (this.I.a(o2, (d)this) == c) {
                return c;
            }
        }
        return c5.h.a;
    }
}

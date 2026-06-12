package Z;

import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class c extends h implements p
{
    public int G;
    public Object H;
    public final h I;
    
    public c(final p p2, final d d) {
        this.I = (h)p2;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((c)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object h) {
        final c c = new c((p)this.I, d);
        c.H = h;
        return (d)c;
    }
    
    public final Object l(Object f) {
        final a c = a.C;
        final int g = this.G;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(f);
        }
        else {
            com.google.android.gms.internal.auth.h.z(f);
            final b b = (b)this.H;
            this.G = 1;
            if ((f = ((p)this.I).f((Object)b, (Object)this)) == c) {
                return c;
            }
        }
        final b b2 = (b)f;
        b2.b.set(true);
        return b2;
    }
}

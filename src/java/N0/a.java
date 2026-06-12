package n0;

import p0.b;
import m5.p;
import g5.h;

public final class a extends h implements p
{
    public int G;
    public final d H;
    
    public a(final d h, final e5.d d) {
        this.H = h;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((a)this.i((e5.d)o2, o)).l(c5.h.a);
    }
    
    public final e5.d i(final e5.d d, final Object o) {
        return (e5.d)new a(this.H, d);
    }
    
    public final Object l(Object b) {
        final f5.a c = f5.a.C;
        final int g = this.G;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(b);
        }
        else {
            com.google.android.gms.internal.auth.h.z(b);
            final b a = this.H.a;
            this.G = 1;
            if ((b = a.b((e5.d)this)) == c) {
                return c;
            }
        }
        return b;
    }
}

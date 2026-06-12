package o0;

import q0.f;
import e5.d;
import m5.p;
import g5.h;

public final class a extends h implements p
{
    public int G;
    public final b H;
    public final q0.a I;
    
    public a(final b h, final q0.a i, final d d) {
        this.H = h;
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((a)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new a(this.H, this.I, d);
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
            final f a = this.H.a;
            this.G = 1;
            if ((b = a.b(this.I, (d)this)) == c) {
                return c;
            }
        }
        return b;
    }
}

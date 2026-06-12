package X4;

import g5.c;
import f5.a;
import e5.d;
import java.util.List;
import m5.p;
import g5.h;

public final class l extends h implements p
{
    public int G;
    public final L H;
    public final List I;
    
    public l(final L h, final List i, final d d) {
        this.H = h;
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((l)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new l(this.H, this.I, d);
    }
    
    public final Object l(Object c) {
        final a c2 = a.C;
        final int g = this.G;
        if (g != 0) {
            if (g != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(c);
        }
        else {
            com.google.android.gms.internal.auth.h.z(c);
            this.G = 1;
            if ((c = L.c(this.H, this.I, (c)this)) == c2) {
                return c2;
            }
        }
        return c;
    }
}

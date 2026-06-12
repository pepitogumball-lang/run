package g4;

import com.google.android.gms.internal.auth.l;
import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class w extends h implements p
{
    public int G;
    public final F H;
    
    public w(final F h, final d d) {
        this.H = h;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((w)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new w(this.H, d);
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
            final F h = this.H;
            final l d = h.d;
            final J0.a a = new J0.a((Object)h, 1);
            this.G = 1;
            if (d.e((z5.d)a, (d)this) == c) {
                return c;
            }
        }
        return c5.h.a;
    }
}

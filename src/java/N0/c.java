package n0;

import p0.b;
import f5.a;
import android.net.Uri;
import m5.p;
import g5.h;

public final class c extends h implements p
{
    public int G;
    public final d H;
    public final Uri I;
    
    public c(final d h, final Uri i, final e5.d d) {
        this.H = h;
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((c)this.i((e5.d)o2, o)).l(c5.h.a);
    }
    
    public final e5.d i(final e5.d d, final Object o) {
        return (e5.d)new c(this.H, this.I, d);
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
            final b a = this.H.a;
            this.G = 1;
            if (a.d(this.I, (e5.d)this) == c) {
                return c;
            }
        }
        return c5.h.a;
    }
}

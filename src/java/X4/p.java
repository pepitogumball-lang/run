package X4;

import android.content.Context;
import z5.c;
import V4.G;
import W.H;
import n3.u0;
import f5.a;
import e5.d;
import n5.o;
import g5.h;

public final class p extends h implements m5.p
{
    public o G;
    public int H;
    public final String I;
    public final L J;
    public final o K;
    
    public p(final String i, final L j, final o k, final d d) {
        this.I = i;
        this.J = j;
        this.K = k;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((p)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new p(this.I, this.J, this.K, d);
    }
    
    public final Object l(final Object o) {
        final a c = a.C;
        final int h = this.H;
        o g;
        Object d;
        if (h != 0) {
            if (h != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g = this.G;
            com.google.android.gms.internal.auth.h.z(o);
            d = o;
        }
        else {
            com.google.android.gms.internal.auth.h.z(o);
            final Z.d e = u0.e(this.I);
            final Context c2 = this.J.C;
            if (c2 == null) {
                n5.h.h("context");
                throw null;
            }
            final X4.o o2 = new X4.o((c)((H)((G)M.a(c2)).D).E, e, 0);
            final o k = this.K;
            this.G = k;
            this.H = 1;
            d = z5.p.d((c)o2, (g5.c)this);
            if (d == c) {
                return c;
            }
            g = k;
        }
        g.C = d;
        return c5.h.a;
    }
}

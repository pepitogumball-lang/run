package X4;

import Z.b;
import c5.h;
import f5.a;
import z5.i;
import W.s;
import n5.n;
import z5.d;

public final class r implements d
{
    public final int C;
    public final d D;
    public final Object E;
    public final Object F;
    
    public r(final n e, final d d, final s f) {
        this.C = 1;
        this.E = e;
        this.D = d;
        this.F = f;
    }
    
    public r(final d d, final Z.d e, final L f) {
        this.C = 0;
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public final Object a(final Object g, final e5.d d) {
        switch (this.C) {
            default: {
                i k = null;
                Label_0075: {
                    if (d instanceof i) {
                        final i i = (i)d;
                        final int j = i.J;
                        if ((j & Integer.MIN_VALUE) != 0x0) {
                            i.J = j + Integer.MIN_VALUE;
                            k = i;
                            break Label_0075;
                        }
                    }
                    k = new i(this, d);
                }
                Object o = k.H;
                final a c = a.C;
                final int l = k.J;
                final h a = h.a;
                Object g2 = null;
                r f = null;
                Label_0257: {
                    if (l != 0) {
                        if (l != 1) {
                            if (l == 2) {
                                g2 = k.G;
                                f = k.F;
                                com.google.android.gms.internal.auth.h.z(o);
                                break Label_0257;
                            }
                            if (l != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        com.google.android.gms.internal.auth.h.z(o);
                    }
                    else {
                        com.google.android.gms.internal.auth.h.z(o);
                        if (((n)this.E).C) {
                            k.J = 1;
                            if (this.D.a(g, (e5.d)k) == c) {
                                return c;
                            }
                        }
                        else {
                            k.F = this;
                            k.G = g;
                            k.J = 2;
                            o = ((s)this.F).f(g, k);
                            if (o == c) {
                                return c;
                            }
                            g2 = g;
                            f = this;
                            break Label_0257;
                        }
                    }
                    return a;
                }
                if (o) {
                    return a;
                }
                ((n)f.E).C = true;
                k.F = null;
                k.G = null;
                k.J = 3;
                if (f.D.a(g2, (e5.d)k) != c) {
                    return a;
                }
                return c;
            }
            case 0: {
                q q2 = null;
                Label_0367: {
                    if (d instanceof q) {
                        final q q = (q)d;
                        final int g3 = q.G;
                        if ((g3 & Integer.MIN_VALUE) != 0x0) {
                            q.G = g3 + Integer.MIN_VALUE;
                            q2 = q;
                            break Label_0367;
                        }
                    }
                    q2 = new q(this, d);
                }
                final Object f2 = q2.F;
                final a c2 = a.C;
                final int g4 = q2.G;
                if (g4 != 0) {
                    if (g4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.android.gms.internal.auth.h.z(f2);
                }
                else {
                    com.google.android.gms.internal.auth.h.z(f2);
                    final Double n = (Double)M.c(((b)g).b((Z.d)this.E), ((L)this.F).E);
                    q2.G = 1;
                    if (this.D.a((Object)n, (e5.d)q2) == c2) {
                        return c2;
                    }
                }
                return h.a;
            }
        }
    }
}

package g2;

import android.os.Handler;
import e2.b;
import com.google.android.gms.common.api.Status;
import f2.c;
import h2.l;
import android.os.SystemClock;
import h2.n;
import O2.i;
import h2.I;
import O2.d;

public final class t implements d
{
    public final e C;
    public final int D;
    public final a E;
    public final long F;
    public final long G;
    
    public t(final e c, final int d, final a e, final long f, final long g) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
    }
    
    public static h2.e a(final o o, final h2.d d, final int n) {
        final I w = d.w;
        h2.e f;
        if (w == null) {
            f = null;
        }
        else {
            f = w.F;
        }
        if (f != null && f.D) {
            final int[] f2 = f.F;
            int i = 0;
            final int n2 = 0;
            Label_0102: {
                if (f2 != null) {
                    while (i < f2.length) {
                        if (f2[i] == n) {
                            break Label_0102;
                        }
                        ++i;
                    }
                    return null;
                }
                final int[] h = f.H;
                int j = n2;
                if (h != null) {
                    while (j < h.length) {
                        if (h[j] == n) {
                            return null;
                        }
                        ++j;
                    }
                }
            }
            if (o.N < f.G) {
                return f;
            }
            return null;
        }
        return null;
    }
    
    public final void l(final i i) {
        final e c = this.C;
        if (c.e()) {
            final h2.o o = (h2.o)n.b().C;
            if (o == null || o.D) {
                final o o2 = (o)c.L.get((Object)this.E);
                if (o2 != null) {
                    final c d = o2.D;
                    if (d instanceof h2.d) {
                        final h2.d d2 = (h2.d)d;
                        long f = this.F;
                        final long n = lcmp(f, 0L);
                        boolean b = true;
                        int c2 = 0;
                        boolean b2 = n > 0;
                        final int q = d2.q;
                        int c3;
                        int g2;
                        int n3;
                        if (o != null) {
                            final boolean b3 = b2 & o.E;
                            final int f2 = o.F;
                            final int g = o.G;
                            final int n2 = c3 = o.C;
                            g2 = g;
                            b2 = b3;
                            n3 = f2;
                            if (d2.w != null) {
                                c3 = n2;
                                g2 = g;
                                b2 = b3;
                                n3 = f2;
                                if (!d2.r()) {
                                    final h2.e a = a(o2, d2, this.D);
                                    if (a == null) {
                                        return;
                                    }
                                    if (!a.E || n <= 0) {
                                        b = false;
                                    }
                                    g2 = a.G;
                                    n3 = f2;
                                    b2 = b;
                                    c3 = n2;
                                }
                            }
                        }
                        else {
                            n3 = 5000;
                            c3 = 0;
                            g2 = 100;
                        }
                        int d3 = 0;
                        Label_0365: {
                            if (i.j()) {
                                d3 = 0;
                            }
                            else if (((O2.t)i).d) {
                                d3 = -1;
                                c2 = 100;
                            }
                            else {
                                final Exception f3 = i.f();
                                if (f3 instanceof f2.e) {
                                    final Status c4 = ((f2.e)f3).C;
                                    c2 = c4.C;
                                    final b f4 = c4.F;
                                    if (f4 != null) {
                                        d3 = f4.D;
                                        break Label_0365;
                                    }
                                }
                                else {
                                    c2 = 101;
                                }
                                d3 = -1;
                            }
                        }
                        long currentTimeMillis;
                        int n4;
                        if (b2) {
                            final long g3 = this.G;
                            currentTimeMillis = System.currentTimeMillis();
                            n4 = (int)(SystemClock.elapsedRealtime() - g3);
                        }
                        else {
                            n4 = -1;
                            f = 0L;
                            currentTimeMillis = 0L;
                        }
                        final u u = new u(new l(this.D, c2, d3, f, currentTimeMillis, (String)null, (String)null, q, n4), c3, n3, g2);
                        final A2.b p = c.P;
                        ((Handler)p).sendMessage(((Handler)p).obtainMessage(18, (Object)u));
                    }
                }
            }
        }
    }
}

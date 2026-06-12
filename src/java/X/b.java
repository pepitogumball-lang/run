package x;

import com.google.android.gms.internal.measurement.L;
import v.f;
import v.c;
import y.g;
import y.m;
import java.util.ArrayList;

public final class b extends e
{
    public e[] p0;
    public int q0;
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;
    
    public final void N(final int n, final ArrayList list, final m m) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.q0) {
                break;
            }
            final e e = this.p0[n3];
            final ArrayList a = m.a;
            if (!a.contains((Object)e)) {
                a.add((Object)e);
            }
            ++n3;
        }
        while (i < this.q0) {
            y.g.b(this.p0[i], n, list, m);
            ++i;
        }
    }
    
    public final boolean O() {
        int i = 0;
        int n = 1;
        int n2 = 0;
        int q0;
        while (true) {
            q0 = this.q0;
            if (n2 >= q0) {
                break;
            }
            final e e = this.p0[n2];
            int n3 = 0;
            Label_0105: {
                if (!this.s0 && !e.c()) {
                    n3 = n;
                }
                else {
                    final int r0 = this.r0;
                    if ((r0 != 0 && r0 != 1) || e.y()) {
                        final int r2 = this.r0;
                        if (r2 != 2) {
                            n3 = n;
                            if (r2 != 3) {
                                break Label_0105;
                            }
                        }
                        n3 = n;
                        if (e.z()) {
                            break Label_0105;
                        }
                    }
                    n3 = 0;
                }
            }
            ++n2;
            n = n3;
        }
        if (n != 0 && q0 > 0) {
            int n4 = 0;
            int n5 = 0;
            while (i < this.q0) {
                final e e2 = this.p0[i];
                if (this.s0 || e2.c()) {
                    int n6 = n4;
                    int n7;
                    if ((n7 = n5) == 0) {
                        final int r3 = this.r0;
                        if (r3 == 0) {
                            n4 = e2.g(2).c();
                        }
                        else if (r3 == 1) {
                            n4 = e2.g(4).c();
                        }
                        else if (r3 == 2) {
                            n4 = e2.g(3).c();
                        }
                        else if (r3 == 3) {
                            n4 = e2.g(5).c();
                        }
                        n7 = 1;
                        n6 = n4;
                    }
                    final int r4 = this.r0;
                    if (r4 == 0) {
                        n4 = Math.min(n6, e2.g(2).c());
                        n5 = n7;
                    }
                    else if (r4 == 1) {
                        n4 = Math.max(n6, e2.g(4).c());
                        n5 = n7;
                    }
                    else if (r4 == 2) {
                        n4 = Math.min(n6, e2.g(3).c());
                        n5 = n7;
                    }
                    else {
                        n4 = n6;
                        n5 = n7;
                        if (r4 == 3) {
                            n4 = Math.max(n6, e2.g(5).c());
                            n5 = n7;
                        }
                    }
                }
                ++i;
            }
            final int n8 = n4 + this.t0;
            final int r5 = this.r0;
            if (r5 != 0 && r5 != 1) {
                this.G(n8, n8);
            }
            else {
                this.F(n8, n8);
            }
            return this.u0 = true;
        }
        return false;
    }
    
    public final int P() {
        final int r0 = this.r0;
        if (r0 == 0 || r0 == 1) {
            return 0;
        }
        if (r0 != 2 && r0 != 3) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public final void b(final c c, final boolean b) {
        final d[] p2 = super.P;
        final d h = super.H;
        p2[0] = h;
        final d i = super.I;
        p2[2] = i;
        final d j = super.J;
        p2[1] = j;
        final d k = super.K;
        p2[3] = k;
        for (int l = 0; l < p2.length; ++l) {
            final d d = p2[l];
            d.i = c.k((Object)d);
        }
        final int r0 = this.r0;
        if (r0 >= 0 && r0 < 4) {
            final d d2 = p2[r0];
            if (!this.u0) {
                this.O();
            }
            if (this.u0) {
                this.u0 = false;
                final int r2 = this.r0;
                if (r2 != 0 && r2 != 1) {
                    if (r2 == 2 || r2 == 3) {
                        c.d(i.i, super.Y);
                        c.d(k.i, super.Y);
                    }
                }
                else {
                    c.d(h.i, super.X);
                    c.d(j.i, super.X);
                }
                return;
            }
            while (true) {
                for (int n = 0; n < this.q0; ++n) {
                    final e e = this.p0[n];
                    if (this.s0 || e.c()) {
                        final int r3 = this.r0;
                        if (((r3 == 0 || r3 == 1) && e.o0[0] == 3 && e.H.f != null && e.J.f != null) || ((r3 == 2 || r3 == 3) && e.o0[1] == 3 && e.I.f != null && e.K.f != null)) {
                            final boolean b2 = true;
                            final boolean b3 = h.e() || j.e();
                            final boolean b4 = i.e() || k.e();
                            int n2 = 0;
                            Label_0471: {
                                if (!b2) {
                                    final int r4 = this.r0;
                                    if ((r4 == 0 && b3) || (r4 == 2 && b4) || (r4 == 1 && b3) || (r4 == 3 && b4)) {
                                        n2 = 5;
                                        break Label_0471;
                                    }
                                }
                                n2 = 4;
                            }
                            for (int n3 = 0; n3 < this.q0; ++n3) {
                                final e e2 = this.p0[n3];
                                if (this.s0 || e2.c()) {
                                    final f m = c.k((Object)e2.P[this.r0]);
                                    final int r5 = this.r0;
                                    final d d3 = e2.P[r5];
                                    d3.i = m;
                                    final d f = d3.f;
                                    int g;
                                    if (f != null && f.d == this) {
                                        g = d3.g;
                                    }
                                    else {
                                        g = 0;
                                    }
                                    if (r5 != 0 && r5 != 2) {
                                        final f i2 = d2.i;
                                        final int t0 = this.t0;
                                        final v.b l2 = c.l();
                                        final f m2 = c.m();
                                        m2.F = 0;
                                        l2.b(i2, m, m2, t0 + g);
                                        c.c(l2);
                                    }
                                    else {
                                        final f i3 = d2.i;
                                        final int t2 = this.t0;
                                        final v.b l3 = c.l();
                                        final f m3 = c.m();
                                        m3.F = 0;
                                        l3.c(i3, m, m3, t2 - g);
                                        c.c(l3);
                                    }
                                    c.e(d2.i, m, this.t0 + g, n2);
                                }
                            }
                            final int r6 = this.r0;
                            if (r6 == 0) {
                                c.e(j.i, h.i, 0, 8);
                                c.e(h.i, super.S.J.i, 0, 4);
                                c.e(h.i, super.S.H.i, 0, 0);
                                return;
                            }
                            if (r6 == 1) {
                                c.e(h.i, j.i, 0, 8);
                                c.e(h.i, super.S.H.i, 0, 4);
                                c.e(h.i, super.S.J.i, 0, 0);
                                return;
                            }
                            if (r6 == 2) {
                                c.e(k.i, i.i, 0, 8);
                                c.e(i.i, super.S.K.i, 0, 4);
                                c.e(i.i, super.S.I.i, 0, 0);
                                return;
                            }
                            if (r6 == 3) {
                                c.e(i.i, k.i, 0, 8);
                                c.e(i.i, super.S.I.i, 0, 4);
                                c.e(i.i, super.S.K.i, 0, 0);
                            }
                            return;
                        }
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    @Override
    public final boolean c() {
        return true;
    }
    
    @Override
    public final String toString() {
        String s = x.a.b(new StringBuilder("[Barrier] "), super.g0, " {");
        for (int i = 0; i < this.q0; ++i) {
            final e e = this.p0[i];
            String j = s;
            if (i > 0) {
                j = com.google.android.gms.internal.measurement.L.i(s, ", ");
            }
            final StringBuilder b = v.e.b(j);
            b.append(e.g0);
            s = b.toString();
        }
        return com.google.android.gms.internal.measurement.L.i(s, "}");
    }
    
    @Override
    public final boolean y() {
        return this.u0;
    }
    
    @Override
    public final boolean z() {
        return this.u0;
    }
}

package x;

import v.b;
import java.util.ArrayList;
import v.c;

public final class g extends e
{
    public float p0;
    public int q0;
    public int r0;
    public d s0;
    public int t0;
    public boolean u0;
    
    public g() {
        this.p0 = -1.0f;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = super.I;
        int i = 0;
        this.t0 = 0;
        super.Q.clear();
        super.Q.add((Object)this.s0);
        while (i < super.P.length) {
            super.P[i] = this.s0;
            ++i;
        }
    }
    
    @Override
    public final void M(final c c, final boolean b) {
        if (super.S == null) {
            return;
        }
        final d s0 = this.s0;
        c.getClass();
        final int n = c.n((Object)s0);
        if (this.t0 == 1) {
            super.X = n;
            super.Y = 0;
            this.H(super.S.i());
            this.K(0);
        }
        else {
            super.X = 0;
            super.Y = n;
            this.K(super.S.o());
            this.H(0);
        }
    }
    
    public final void N(final int n) {
        this.s0.i(n);
        this.u0 = true;
    }
    
    public final void O(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        final ArrayList q = super.Q;
        q.clear();
        if (this.t0 == 1) {
            this.s0 = super.H;
        }
        else {
            this.s0 = super.I;
        }
        q.add((Object)this.s0);
        final d[] p = super.P;
        int length;
        for (length = p.length, i = 0; i < length; ++i) {
            p[i] = this.s0;
        }
    }
    
    @Override
    public final void b(final c c, final boolean b) {
        final f f = (f)super.S;
        if (f == null) {
            return;
        }
        d d = f.g(2);
        d d2 = f.g(4);
        final e s = super.S;
        final int n = 1;
        int n2;
        if (s != null && s.o0[0] == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.t0 == 0) {
            d = f.g(3);
            d2 = f.g(5);
            final e s2 = super.S;
            if (s2 != null && s2.o0[1] == 2) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        if (this.u0) {
            final d s3 = this.s0;
            if (s3.c) {
                final v.f k = c.k((Object)s3);
                c.d(k, this.s0.c());
                if (this.q0 != -1) {
                    if (n2 != 0) {
                        c.f(c.k((Object)d2), k, 0, 5);
                    }
                }
                else if (this.r0 != -1 && n2 != 0) {
                    final v.f i = c.k((Object)d2);
                    c.f(k, c.k((Object)d), 0, 5);
                    c.f(i, k, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            final v.f j = c.k((Object)this.s0);
            c.e(j, c.k((Object)d), this.q0, 8);
            if (n2 != 0) {
                c.f(c.k((Object)d2), j, 0, 5);
            }
        }
        else if (this.r0 != -1) {
            final v.f l = c.k((Object)this.s0);
            final v.f m = c.k((Object)d2);
            c.e(l, m, -this.r0, 8);
            if (n2 != 0) {
                c.f(l, c.k((Object)d), 0, 5);
                c.f(m, l, 0, 5);
            }
        }
        else if (this.p0 != -1.0f) {
            final v.f k2 = c.k((Object)this.s0);
            final v.f k3 = c.k((Object)d2);
            final float p2 = this.p0;
            final b l2 = c.l();
            l2.d.g(k2, -1.0f);
            l2.d.g(k3, p2);
            c.c(l2);
        }
    }
    
    @Override
    public final boolean c() {
        return true;
    }
    
    @Override
    public final d g(int d) {
        d = v.e.d(d);
        Label_0040: {
            if (d != 1) {
                if (d != 2) {
                    if (d == 3) {
                        break Label_0040;
                    }
                    if (d != 4) {
                        return null;
                    }
                }
                if (this.t0 == 0) {
                    return this.s0;
                }
                return null;
            }
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
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

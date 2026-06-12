package y;

import java.util.Iterator;
import x.b;

public final class i extends n
{
    @Override
    public final void a(final d d) {
        final b b = (b)super.b;
        final int r0 = b.r0;
        final e h = super.h;
        final Iterator iterator = h.l.iterator();
        int n = 0;
        int n2 = -1;
        while (iterator.hasNext()) {
            final int g = ((e)iterator.next()).g;
            int n3;
            if (n2 == -1 || g < (n3 = n2)) {
                n3 = g;
            }
            n2 = n3;
            if (n < g) {
                n = g;
                n2 = n3;
            }
        }
        if (r0 != 0 && r0 != 2) {
            h.d(n + b.t0);
        }
        else {
            h.d(n2 + b.t0);
        }
    }
    
    @Override
    public final void d() {
        final x.e b = super.b;
        if (b instanceof b) {
            final e h = super.h;
            h.b = true;
            final b b2 = (b)b;
            final int r0 = b2.r0;
            final boolean s0 = b2.s0;
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            int i = 0;
            if (r0 != 0) {
                if (r0 != 1) {
                    if (r0 != 2) {
                        if (r0 == 3) {
                            h.e = 7;
                            while (i < b2.q0) {
                                final x.e e = b2.p0[i];
                                if (s0 || e.f0 != 8) {
                                    final e j = e.e.i;
                                    j.k.add((Object)h);
                                    h.l.add((Object)j);
                                }
                                ++i;
                            }
                            this.m(super.b.e.h);
                            this.m(super.b.e.i);
                        }
                    }
                    else {
                        h.e = 6;
                        for (int k = n; k < b2.q0; ++k) {
                            final x.e e2 = b2.p0[k];
                            if (s0 || e2.f0 != 8) {
                                final e h2 = e2.e.h;
                                h2.k.add((Object)h);
                                h.l.add((Object)h2);
                            }
                        }
                        this.m(super.b.e.h);
                        this.m(super.b.e.i);
                    }
                }
                else {
                    h.e = 5;
                    for (int l = n2; l < b2.q0; ++l) {
                        final x.e e3 = b2.p0[l];
                        if (s0 || e3.f0 != 8) {
                            final e m = e3.d.i;
                            m.k.add((Object)h);
                            h.l.add((Object)m);
                        }
                    }
                    this.m(super.b.d.h);
                    this.m(super.b.d.i);
                }
            }
            else {
                h.e = 4;
                for (int n4 = n3; n4 < b2.q0; ++n4) {
                    final x.e e4 = b2.p0[n4];
                    if (s0 || e4.f0 != 8) {
                        final e h3 = e4.d.h;
                        h3.k.add((Object)h);
                        h.l.add((Object)h3);
                    }
                }
                this.m(super.b.d.h);
                this.m(super.b.d.i);
            }
        }
    }
    
    @Override
    public final void e() {
        final x.e b = super.b;
        if (b instanceof b) {
            final int r0 = ((b)b).r0;
            final e h = super.h;
            if (r0 != 0 && r0 != 1) {
                b.Y = h.g;
            }
            else {
                b.X = h.g;
            }
        }
    }
    
    @Override
    public final void f() {
        super.c = null;
        super.h.c();
    }
    
    @Override
    public final boolean k() {
        return false;
    }
    
    public final void m(final e e) {
        final e h = super.h;
        h.k.add((Object)e);
        e.l.add((Object)h);
    }
}

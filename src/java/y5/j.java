package y5;

import B5.w;
import m5.l;
import w5.v;
import A0.c;
import B5.a;
import n5.h;
import w5.l0;
import e5.i;
import java.util.concurrent.atomic.AtomicReferenceArray;
import B5.u;

public final class j extends u
{
    public final b G;
    public final AtomicReferenceArray H;
    
    public j(final long n, final j j, final b g, final int n2) {
        super(n, (u)j, n2);
        this.G = g;
        this.H = new AtomicReferenceArray(d.b * 2);
    }
    
    public final int f() {
        return d.b;
    }
    
    public final void g(final int n, final i i) {
        final int b = d.b;
        final boolean b2 = n >= b;
        int n2 = n;
        if (b2) {
            n2 = n - b;
        }
        final Object value = this.H.get(n2 * 2);
        while (true) {
            final Object k = this.k(n2);
            final boolean b3 = k instanceof l0;
            final b g = this.G;
            if (!b3 && !(k instanceof r)) {
                if (k == d.j || k == d.k) {
                    this.m(n2, null);
                    if (b2) {
                        h.b((Object)g);
                        final l d = g.D;
                        if (d != null) {
                            final c a = B5.a.a(d, value, (c)null);
                            if (a != null) {
                                v.f(i, (Throwable)a);
                            }
                        }
                    }
                    return;
                }
                if (k == d.g) {
                    continue;
                }
                if (k == d.f) {
                    continue;
                }
                if (k == d.i || k == d.d) {
                    return;
                }
                if (k == d.l) {
                    return;
                }
                final StringBuilder sb = new StringBuilder("unexpected state: ");
                sb.append(k);
                throw new IllegalStateException(sb.toString().toString());
            }
            else {
                w w;
                if (b2) {
                    w = d.j;
                }
                else {
                    w = d.k;
                }
                if (this.j(k, n2, w)) {
                    this.m(n2, null);
                    this.l(n2, b2 ^ true);
                    if (b2) {
                        h.b((Object)g);
                        final l d2 = g.D;
                        if (d2 != null) {
                            final c a2 = a.a(d2, value, (c)null);
                            if (a2 != null) {
                                v.f(i, (Throwable)a2);
                            }
                        }
                    }
                    return;
                }
                continue;
            }
        }
    }
    
    public final boolean j(final Object o, int n, final Object o2) {
        final AtomicReferenceArray h = this.H;
        boolean b = true;
        n = n * 2 + 1;
        while (!h.compareAndSet(n, o, o2)) {
            if (h.get(n) != o) {
                b = false;
                return b;
            }
        }
        return b;
    }
    
    public final Object k(final int n) {
        return this.H.get(n * 2 + 1);
    }
    
    public final void l(final int n, final boolean b) {
        if (b) {
            final b g = this.G;
            h.b((Object)g);
            g.z(super.E * d.b + n);
        }
        this.h();
    }
    
    public final void m(final int n, final Object o) {
        this.H.lazySet(n * 2, o);
    }
    
    public final void n(final int n, final w w) {
        this.H.set(n * 2 + 1, (Object)w);
    }
}

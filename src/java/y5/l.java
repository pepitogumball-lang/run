package y5;

import B5.w;
import B5.u;
import w5.l0;
import c5.h;
import Y3.a;
import n5.p;

public final class l extends b
{
    public final int N;
    
    public l(final int n, final int n2, final m5.l l) {
        super(n, l);
        this.N = n2;
        if (n2 == 1) {
            final StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
            sb.append(n5.p.a((Class)b.class).b());
            sb.append(" instead");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n >= 1) {
            return;
        }
        throw new IllegalArgumentException(a.j(n, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
    }
    
    @Override
    public final Object k(Object k) {
        final h a = h.a;
        Object o;
        if (this.N == 3) {
            k = super.k(k);
            if (k instanceof y5.h) {
                o = a;
                if (!(k instanceof g)) {
                    return o;
                }
            }
            o = k;
        }
        else {
            final w d = y5.d.d;
            Object o2 = b.I.get((Object)this);
            while (true) {
                final long andIncrement = b.E.getAndIncrement((Object)this);
                final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
                final boolean p = this.p(andIncrement, false);
                final int b = y5.d.b;
                final long n2 = b;
                final long n3 = n / n2;
                final int n4 = (int)(n % n2);
                j a2;
                if (((u)o2).E != n3) {
                    a2 = y5.b.a(this, n3, (j)o2);
                    if (a2 == null) {
                        if (p) {
                            o = new g(this.m());
                            break;
                        }
                        continue;
                    }
                }
                else {
                    a2 = (j)o2;
                }
                final int c = y5.b.c(this, a2, n4, k, n, d, p);
                if (c == 0) {
                    ((B5.d)a2).a();
                    o = a;
                    break;
                }
                o = a;
                if (c == 1) {
                    break;
                }
                if (c != 2) {
                    if (c == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (c == 4) {
                        if (n < y5.b.F.get((Object)this)) {
                            ((B5.d)a2).a();
                        }
                        o = new g(this.m());
                        break;
                    }
                    if (c == 5) {
                        ((B5.d)a2).a();
                    }
                    o2 = a2;
                }
                else {
                    if (p) {
                        a2.h();
                        o = new g(this.m());
                        break;
                    }
                    l0 l0;
                    if (d instanceof l0) {
                        l0 = (l0)d;
                    }
                    else {
                        l0 = null;
                    }
                    if (l0 != null) {
                        l0.a((u)a2, n4 + b);
                    }
                    this.g(a2.E * n2 + n4);
                    o = a;
                    break;
                }
            }
        }
        return o;
    }
    
    @Override
    public final boolean r() {
        return this.N == 2;
    }
}

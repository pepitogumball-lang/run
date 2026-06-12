package y5;

import e5.i;
import B5.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n5.h;
import m5.l;
import B5.p;
import n3.u0;
import B5.v;
import z5.e;
import B5.u;
import w5.f;
import w5.l0;

public final class a implements l0
{
    public Object C;
    public f D;
    public final b E;
    
    public a(final b e) {
        this.E = e;
        this.C = d.p;
    }
    
    public final void a(final u u, final int n) {
        final f d = this.D;
        if (d != null) {
            d.a(u, n);
        }
    }
    
    public final Object b(final e e) {
        final AtomicReferenceFieldUpdater j = b.J;
        final b e2 = this.E;
        Object o = j.get((Object)e2);
        Boolean b = null;
    Label_0568_Outer:
        while (true) {
            e2.getClass();
            if (e2.p(y5.b.E.get((Object)e2), true)) {
                this.C = d.l;
                final Throwable i = e2.j();
                if (i == null) {
                    b = Boolean.FALSE;
                    break;
                }
                final int a = v.a;
                throw i;
            }
            else {
                final long andIncrement = y5.b.F.getAndIncrement((Object)e2);
                final long n = d.b;
                final long n2 = andIncrement / n;
                final int n3 = (int)(andIncrement % n);
                Object k = o;
                if (((u)o).E != n2) {
                    k = e2.i(n2, (j)o);
                    if (k == null) {
                        continue;
                    }
                }
                Object c = e2.x((j)k, n3, andIncrement, null);
                Object m = d.m;
                if (c == m) {
                    throw new IllegalStateException("unreachable");
                }
                final w o2 = d.o;
                if (c == o2) {
                    o = k;
                    if (andIncrement >= e2.n()) {
                        continue;
                    }
                    ((B5.d)k).a();
                    o = k;
                }
                else {
                    if (c != d.n) {
                        ((B5.d)k).a();
                        this.C = c;
                        b = Boolean.TRUE;
                        break;
                    }
                    final b e3 = this.E;
                    final f e4 = w5.v.e(u0.o((e5.d)e));
                    try {
                        this.D = e4;
                    Label_0568:
                        while (true) {
                            Object x = null;
                            i g = null;
                            Label_0591: {
                                try {
                                    x = e3.x((j)k, n3, andIncrement, this);
                                    if (x == m) {
                                        this.a((u)k, n3);
                                        return e4.t();
                                    }
                                    m = null;
                                    g = e4.G;
                                    c = e3.D;
                                    if (x != o2) {
                                        break Label_0591;
                                    }
                                    if (andIncrement < e3.n()) {
                                        ((B5.d)k).a();
                                    }
                                }
                                finally {}
                                Object o3 = y5.b.J.get((Object)e3);
                                final w w = (w)c;
                                while (!e3.p(y5.b.E.get((Object)e3), true)) {
                                    final long andIncrement2 = y5.b.F.getAndIncrement((Object)e3);
                                    final long n4 = d.b;
                                    final long n5 = andIncrement2 / n4;
                                    final int n6 = (int)(andIncrement2 % n4);
                                    Object l = o3;
                                    if (((u)o3).E != n5) {
                                        l = e3.i(n5, (j)o3);
                                        if (l == null) {
                                            continue Label_0568_Outer;
                                        }
                                    }
                                    final Object x2 = e3.x((j)l, n6, andIncrement2, this);
                                    if (x2 == d.m) {
                                        this.a((u)l, n6);
                                        return e4.t();
                                    }
                                    if (x2 == d.o) {
                                        if (andIncrement2 < e3.n()) {
                                            ((B5.d)l).a();
                                        }
                                        o3 = l;
                                    }
                                    else {
                                        if (x2 == d.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ((B5.d)l).a();
                                        this.C = x2;
                                        this.D = null;
                                        Boolean b2 = Boolean.TRUE;
                                        Object o4 = m;
                                        if (w != null) {
                                            o4 = new p((l)w, x2, g);
                                            b2 = b2;
                                        }
                                        break Label_0568;
                                    }
                                }
                                final f d = this.D;
                                h.b((Object)d);
                                this.D = null;
                                this.C = y5.d.l;
                                final Throwable j2 = e2.j();
                                if (j2 == null) {
                                    d.h(Boolean.FALSE);
                                    return e4.t();
                                }
                                d.h(com.google.android.gms.internal.auth.h.k(j2));
                                return e4.t();
                                Boolean b2 = null;
                                Object o4 = null;
                                e4.j(b2, (l)o4);
                                return e4.t();
                            }
                            ((B5.d)k).a();
                            this.C = x;
                            this.D = null;
                            Boolean b2;
                            final Boolean b3 = b2 = Boolean.TRUE;
                            Object o4 = m;
                            if (c != null) {
                                o4 = new p((l)c, x, g);
                                b2 = b3;
                            }
                            continue Label_0568;
                        }
                    }
                    finally {}
                    e4.A();
                }
            }
        }
        return b;
    }
}

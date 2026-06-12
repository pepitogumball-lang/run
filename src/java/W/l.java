package W;

import w5.f;
import B5.w;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import e5.i;
import n3.u0;
import y5.j;
import B5.v;
import y5.b;
import w5.a0;
import w5.t;
import w5.u;
import w5.Q;
import java.util.concurrent.atomic.AtomicInteger;
import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class l extends h implements p
{
    public p G;
    public int H;
    public final Y0.h I;
    
    public l(final Y0.h i, final d d) {
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((l)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object o) {
        return (d)new l(this.I, d);
    }
    
    public final Object l(Object t) {
        final a c = a.C;
        final int h = this.H;
        Y0.h i = this.I;
        while (true) {
            Y0.h h2 = null;
            Label_0759: {
                Object g = null;
                Label_0729: {
                    if (h != 0) {
                        if (h == 1) {
                            g = this.G;
                            com.google.android.gms.internal.auth.h.z(t);
                            break Label_0729;
                        }
                        if (h == 2) {
                            com.google.android.gms.internal.auth.h.z(t);
                            h2 = i;
                            break Label_0759;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        com.google.android.gms.internal.auth.h.z(t);
                        if (((AtomicInteger)i.F).get() <= 0) {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                    final Q q = (Q)((u)i.C).g().i((e5.h)t.D);
                    if (q != null && !q.a()) {
                        throw ((a0)q).y();
                    }
                    final r g2 = (r)i.D;
                    this.G = (p)g2;
                    this.H = 1;
                    final b b = (b)i.E;
                    b.getClass();
                    final AtomicReferenceFieldUpdater j = y5.b.J;
                    Object o = j.get((Object)b);
                Label_0266_Outer:
                    while (true) {
                        final AtomicLongFieldUpdater e = y5.b.E;
                        if (b.p(e.get((Object)b), true)) {
                            final Throwable l = b.l();
                            final int a = v.a;
                            throw l;
                        }
                        final AtomicLongFieldUpdater f = y5.b.F;
                        final long andIncrement = f.getAndIncrement((Object)b);
                        final long n = y5.d.b;
                        final long n2 = andIncrement / n;
                        final int n3 = (int)(andIncrement % n);
                        Object k = null;
                        Object o2;
                        Object o3;
                        w o4;
                        while (true) {
                            Label_0272: {
                                if (((B5.u)o).E == n2) {
                                    k = o;
                                    break Label_0272;
                                }
                                if ((k = b.i(n2, (j)o)) == null) {
                                    continue Label_0266_Outer;
                                }
                                break Label_0272;
                                continue Label_0266_Outer;
                            }
                            o2 = b.x((j)k, n3, andIncrement, (Object)null);
                            o3 = y5.d.m;
                            if (o2 == o3) {
                                throw new IllegalStateException("unexpected");
                            }
                            o4 = y5.d.o;
                            if (o2 == o4) {
                                if (andIncrement < b.n()) {
                                    ((B5.d)k).a();
                                }
                                o = k;
                                continue;
                            }
                            break;
                        }
                        Label_0716: {
                            if (o2 == y5.d.n) {
                                final f e2 = w5.v.e(u0.o((d)this));
                                Label_0702: {
                                Label_0639:
                                    while (true) {
                                        m5.l d = null;
                                        Label_0662: {
                                            try {
                                                o2 = b.x((j)k, n3, andIncrement, (Object)e2);
                                                if (o2 == o3) {
                                                    e2.a((B5.u)k, n3);
                                                    break Label_0639;
                                                }
                                                d = b.D;
                                                o3 = e2.G;
                                                if (o2 != o4) {
                                                    break Label_0662;
                                                }
                                                if (andIncrement < b.n()) {
                                                    ((B5.d)k).a();
                                                }
                                            }
                                            finally {
                                                break Label_0702;
                                            }
                                            final j m = (j)j.get((Object)b);
                                            t = o3;
                                            Object o5 = m;
                                            while (!b.p(e.get((Object)b), true)) {
                                                final long andIncrement2 = f.getAndIncrement((Object)b);
                                                final long n4 = y5.d.b;
                                                final long n5 = andIncrement2 / n4;
                                                final int n6 = (int)(andIncrement2 % n4);
                                                Object i2 = o5;
                                                if (((B5.u)o5).E != n5) {
                                                    i2 = b.i(n5, (j)o5);
                                                    if (i2 == null) {
                                                        continue Label_0266_Outer;
                                                    }
                                                }
                                                final Object x = b.x((j)i2, n6, andIncrement2, (Object)e2);
                                                if (x == y5.d.m) {
                                                    e2.a((B5.u)i2, n6);
                                                    break Label_0639;
                                                }
                                                if (x == y5.d.o) {
                                                    if (andIncrement2 < b.n()) {
                                                        ((B5.d)i2).a();
                                                    }
                                                    o5 = i2;
                                                }
                                                else {
                                                    if (x == y5.d.n) {
                                                        t = new IllegalStateException("unexpected");
                                                        throw t;
                                                    }
                                                    ((B5.d)i2).a();
                                                    if (d != null) {
                                                        t = new B5.p(d, x, (i)t);
                                                        o2 = x;
                                                        break Label_0639;
                                                    }
                                                    t = null;
                                                    o2 = x;
                                                    break Label_0639;
                                                }
                                            }
                                            e2.h((Object)com.google.android.gms.internal.auth.h.k(b.l()));
                                            break Label_0639;
                                            e2.j(o2, (m5.l)t);
                                            break Label_0639;
                                        }
                                        final B5.d d2;
                                        d2.a();
                                        if (d != null) {
                                            t = new B5.p(d, o2, (i)o3);
                                            continue Label_0639;
                                        }
                                        t = null;
                                        continue Label_0639;
                                    }
                                    t = e2.t();
                                    break Label_0716;
                                }
                                e2.A();
                            }
                            else {
                                ((B5.d)k).a();
                                t = o2;
                            }
                        }
                        if (t == c) {
                            return c;
                        }
                        g = g2;
                        break;
                    }
                }
                this.G = null;
                this.H = 2;
                if (((p)g).f(t, (Object)this) == c) {
                    return c;
                }
                h2 = i;
            }
            if (((AtomicInteger)h2.F).decrementAndGet() == 0) {
                return c5.h.a;
            }
            i = h2;
            continue;
        }
    }
}

package W;

import w5.a0;
import B5.w;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import B5.u;
import w5.l0;
import y5.j;
import y5.d;
import y5.b;
import E5.g;
import w5.v;
import w5.n;
import w5.M;
import w5.y;
import java.util.concurrent.CancellationException;
import u.h;
import m5.l;
import n5.i;

public final class k extends i implements l
{
    public final int D;
    public final Object E;
    public final Object F;
    
    public final Object g(Object a) {
        switch (this.D) {
            default: {
                final Throwable t = (Throwable)a;
                final h h = (h)this.E;
                if (t != null) {
                    if (t instanceof CancellationException) {
                        h.d = true;
                        final u.j b = h.b;
                        if (b != null && ((u.g)b.D).cancel(true)) {
                            h.a = null;
                            h.b = null;
                            h.c = null;
                        }
                    }
                    else {
                        h.d = true;
                        final u.j b2 = h.b;
                        if (b2 != null && ((u.g)b2.D).l(t)) {
                            h.a = null;
                            h.b = null;
                            h.c = null;
                        }
                    }
                }
                else {
                    final Object c = ((a0)this.F).C();
                    if (c instanceof M) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (c instanceof n) {
                        throw ((n)c).a;
                    }
                    final Object o = v.o(c);
                    h.d = true;
                    final u.j b3 = h.b;
                    if (b3 != null && ((u.g)b3.D).k(o)) {
                        h.a = null;
                        h.b = null;
                        h.c = null;
                    }
                }
                return c5.h.a;
            }
            case 0: {
                final Throwable t2 = (Throwable)a;
                ((g)this.E).g((Object)t2);
                final Y0.h h2 = (Y0.h)this.F;
                ((b)h2.E).e(t2, false);
                c5.h h3;
                c5.h a2;
                do {
                    final b b4 = (b)h2.E;
                    b4.getClass();
                    final AtomicLongFieldUpdater f = b.F;
                    final long value = f.get((Object)b4);
                    final AtomicLongFieldUpdater e = b.E;
                    final long value2 = e.get((Object)b4);
                    if (b4.p(value2, true)) {
                        a = new y5.g(b4.j());
                    }
                    else {
                        a = y5.i.a;
                        Label_0373: {
                            if (value < (value2 & 0xFFFFFFFFFFFFFFFL)) {
                                final w k = d.k;
                                j j = (j)b.J.get((Object)b4);
                            Label_0479_Outer:
                                while (!b4.p(e.get((Object)b4), true)) {
                                    final long andIncrement = f.getAndIncrement((Object)b4);
                                    final long n = d.b;
                                    final long n2 = andIncrement / n;
                                    final int n3 = (int)(andIncrement % n);
                                    Object x;
                                    while (true) {
                                        Label_0489: {
                                            if (((u)j).E == n2) {
                                                break Label_0489;
                                            }
                                            final j i = b4.i(n2, j);
                                            if (i == null) {
                                                continue Label_0479_Outer;
                                            }
                                            j = i;
                                            break Label_0489;
                                            continue Label_0479_Outer;
                                        }
                                        x = b4.x(j, n3, andIncrement, (Object)k);
                                        if (x == d.m) {
                                            l0 l0;
                                            if (k instanceof l0) {
                                                l0 = (l0)k;
                                            }
                                            else {
                                                l0 = null;
                                            }
                                            if (l0 != null) {
                                                l0.a((u)j, n3);
                                            }
                                            b4.z(andIncrement);
                                            ((u)j).h();
                                            break Label_0373;
                                        }
                                        if (x == d.o) {
                                            if (andIncrement < b4.n()) {
                                                ((B5.d)j).a();
                                            }
                                            continue;
                                        }
                                        break;
                                    }
                                    if (x != d.n) {
                                        ((B5.d)j).a();
                                        a = x;
                                        break Label_0373;
                                    }
                                    throw new IllegalStateException("unexpected");
                                }
                                a = new y5.g(b4.j());
                            }
                        }
                    }
                    final boolean b5 = a instanceof y5.h;
                    final c5.h h4 = null;
                    if (b5) {
                        a = null;
                    }
                    a2 = c5.h.a;
                    if (a == null) {
                        h3 = h4;
                    }
                    else {
                        q.D.f(a, t2);
                        h3 = a2;
                    }
                } while (h3 != null);
                return a2;
            }
        }
    }
}

package E5;

import w5.e;
import B5.w;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m5.p;
import B5.u;
import B5.a;
import m5.l;
import c5.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class i
{
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicLongFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;
    public static final AtomicLongFieldUpdater e;
    public static final AtomicIntegerFieldUpdater f;
    private volatile int _availablePermits;
    public final g a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;
    
    static {
        b = AtomicReferenceFieldUpdater.newUpdater((Class)i.class, (Class)Object.class, "head");
        c = AtomicLongFieldUpdater.newUpdater((Class)i.class, "deqIdx");
        d = AtomicReferenceFieldUpdater.newUpdater((Class)i.class, (Class)Object.class, "tail");
        e = AtomicLongFieldUpdater.newUpdater((Class)i.class, "enqIdx");
        f = AtomicIntegerFieldUpdater.newUpdater((Class)i.class, "_availablePermits");
    }
    
    public i(final int n) {
        if (n >= 0 && n <= 1) {
            final k k = new k(0L, null, 2);
            this.head = k;
            this.tail = k;
            this._availablePermits = 1 - n;
            this.a = new g(this, 0);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }
    
    public final void a(final c c) {
    Label_0288:
        while (true) {
            final int andDecrement = i.f.getAndDecrement((Object)this);
            if (andDecrement <= 1) {
                final h a = h.a;
                final g a2 = this.a;
                if (andDecrement > 0) {
                    c.j(a, a2);
                    break;
                }
                final AtomicReferenceFieldUpdater d = i.d;
                final k k = (k)d.get((Object)this);
                final long andIncrement = i.e.getAndIncrement((Object)this);
                final f i = E5.f.K;
                final long n = andIncrement / j.f;
                Object b = null;
            Label_0197:
                while (true) {
                    b = B5.a.b(k, n, i);
                    if (B5.a.e(b)) {
                        break;
                    }
                    final u c2 = B5.a.c(b);
                Label_0102:
                    while (true) {
                        final u u = (u)d.get((Object)this);
                        if (u.E >= c2.E) {
                            break Label_0197;
                        }
                        if (!c2.i()) {
                            break;
                        }
                        while (!d.compareAndSet((Object)this, (Object)u, (Object)c2)) {
                            if (d.get((Object)this) != u) {
                                if (c2.e()) {
                                    c2.d();
                                }
                                continue Label_0102;
                            }
                        }
                        if (u.e()) {
                            u.d();
                            break Label_0197;
                        }
                        break Label_0197;
                    }
                }
                final k j = (k)B5.a.c(b);
                final int n2 = (int)(andIncrement % E5.j.f);
                final AtomicReferenceArray g = j.G;
                while (!g.compareAndSet(n2, (Object)null, (Object)c)) {
                    if (g.get(n2) != null) {
                        final w b2 = E5.j.b;
                        while (!g.compareAndSet(n2, (Object)b2, (Object)E5.j.c)) {
                            if (g.get(n2) != b2) {
                                continue Label_0288;
                            }
                        }
                        c.j(a, a2);
                        break Label_0288;
                    }
                }
                c.a(j, n2);
                break;
            }
        }
    }
    
    public final void b() {
        int i;
    Label_0404:
        do {
            final AtomicIntegerFieldUpdater f = E5.i.f;
            final int andIncrement = f.getAndIncrement((Object)this);
            final int n = 1;
            if (andIncrement >= 1) {
                int value;
                do {
                    value = f.get((Object)this);
                } while (value > 1 && !f.compareAndSet((Object)this, value, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            final AtomicReferenceFieldUpdater b = E5.i.b;
            final k k = (k)b.get((Object)this);
            final long andIncrement2 = E5.i.c.getAndIncrement((Object)this);
            final long n2 = andIncrement2 / j.f;
            final E5.h j = E5.h.K;
            Object b2 = null;
        Label_0184:
            while (true) {
                b2 = B5.a.b(k, n2, j);
                if (B5.a.e(b2)) {
                    break;
                }
                final u c = B5.a.c(b2);
            Label_0089:
                while (true) {
                    final u u = (u)b.get((Object)this);
                    if (u.E >= c.E) {
                        break Label_0184;
                    }
                    if (!c.i()) {
                        break;
                    }
                    while (!b.compareAndSet((Object)this, (Object)u, (Object)c)) {
                        if (b.get((Object)this) != u) {
                            if (c.e()) {
                                c.d();
                                continue Label_0089;
                            }
                            continue Label_0089;
                        }
                    }
                    if (u.e()) {
                        u.d();
                        break Label_0184;
                    }
                    break Label_0184;
                }
            }
            final k l = (k)B5.a.c(b2);
            l.a();
            final long e = l.E;
            final boolean b3 = false;
            if (e <= n2) {
                final int n3 = (int)(andIncrement2 % E5.j.f);
                final w b4 = E5.j.b;
                final AtomicReferenceArray g = l.G;
                final Object andSet = g.getAndSet(n3, (Object)b4);
                if (andSet == null) {
                    for (int a = E5.j.a, n4 = 0; n4 < a; ++n4) {
                        if (g.get(n3) == E5.j.c) {
                            i = n;
                            continue Label_0404;
                        }
                    }
                    final w b5 = E5.j.b;
                    while (true) {
                        while (!g.compareAndSet(n3, (Object)b5, (Object)E5.j.d)) {
                            if (g.get(n3) != b5) {
                                final boolean b6 = b3;
                                i = ((true ^ b6) ? 1 : 0);
                                continue Label_0404;
                            }
                        }
                        final boolean b6 = true;
                        continue;
                    }
                }
                if (andSet != E5.j.e) {
                    if (!(andSet instanceof e)) {
                        final StringBuilder sb = new StringBuilder("unexpected: ");
                        sb.append(andSet);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    final e e2 = (e)andSet;
                    final w d = e2.d(h.a, this.a);
                    if (d != null) {
                        e2.m(d);
                        i = n;
                        continue;
                    }
                }
            }
            i = 0;
        } while (i == 0);
    }
}

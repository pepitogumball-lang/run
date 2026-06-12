package y5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import com.google.android.gms.internal.measurement.L;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import n5.r;
import java.util.concurrent.CancellationException;
import w5.e;
import B5.w;
import w5.l0;
import m5.p;
import B5.u;
import Y3.a;
import n5.h;
import m5.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class b implements f
{
    public static final AtomicLongFieldUpdater E;
    public static final AtomicLongFieldUpdater F;
    public static final AtomicLongFieldUpdater G;
    public static final AtomicLongFieldUpdater H;
    public static final AtomicReferenceFieldUpdater I;
    public static final AtomicReferenceFieldUpdater J;
    public static final AtomicReferenceFieldUpdater K;
    public static final AtomicReferenceFieldUpdater L;
    public static final AtomicReferenceFieldUpdater M;
    public final int C;
    public final l D;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;
    
    static {
        E = AtomicLongFieldUpdater.newUpdater((Class)b.class, "sendersAndCloseStatus");
        F = AtomicLongFieldUpdater.newUpdater((Class)b.class, "receivers");
        G = AtomicLongFieldUpdater.newUpdater((Class)b.class, "bufferEnd");
        H = AtomicLongFieldUpdater.newUpdater((Class)b.class, "completedExpandBuffersAndPauseFlag");
        I = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "sendSegment");
        J = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "receiveSegment");
        K = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "bufferEndSegment");
        L = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "_closeCause");
        M = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "closeHandler");
    }
    
    public b(final int c, final l d) {
        this.C = c;
        this.D = d;
        if (c >= 0) {
            final j a = d.a;
            long bufferEnd;
            if (c != 0) {
                if (c != Integer.MAX_VALUE) {
                    bufferEnd = c;
                }
                else {
                    bufferEnd = Long.MAX_VALUE;
                }
            }
            else {
                bufferEnd = 0L;
            }
            this.bufferEnd = bufferEnd;
            this.completedExpandBuffersAndPauseFlag = b.G.get((Object)this);
            j a2 = new j(0L, null, this, 3);
            this.sendSegment = a2;
            this.receiveSegment = a2;
            if (this.s()) {
                a2 = d.a;
                h.c("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>", (Object)a2);
            }
            this.bufferEndSegment = a2;
            this._closeCause = d.s;
            return;
        }
        throw new IllegalArgumentException(a.j(c, "Invalid channel capacity: ", ", should be >=0").toString());
    }
    
    public static final j a(final b b, long value, j j) {
        b.getClass();
        final j a = d.a;
        final c k = c.K;
        Object b2 = null;
    Label_0139:
        while (true) {
            b2 = B5.a.b((u)j, value, (m5.p)k);
            if (B5.a.e(b2)) {
                break;
            }
            final u c = B5.a.c(b2);
        Label_0039:
            while (true) {
                final AtomicReferenceFieldUpdater i = b.I;
                final u u = (u)i.get((Object)b);
                if (u.E >= c.E) {
                    break Label_0139;
                }
                if (!c.i()) {
                    break;
                }
                while (!i.compareAndSet((Object)b, (Object)u, (Object)c)) {
                    if (i.get((Object)b) != u) {
                        if (c.e()) {
                            ((B5.d)c).d();
                            continue Label_0039;
                        }
                        continue Label_0039;
                    }
                }
                if (u.e()) {
                    ((B5.d)u).d();
                    break Label_0139;
                }
                break Label_0139;
            }
        }
        final boolean e = B5.a.e(b2);
        final j l = null;
        final AtomicLongFieldUpdater f = b.F;
        j m;
        if (e) {
            b.q();
            value = d.b;
            m = l;
            if (j.E * value < f.get((Object)b)) {
                ((B5.d)j).a();
                m = l;
            }
        }
        else {
            j = (j)B5.a.c(b2);
            final long e2 = j.E;
            if (e2 > value) {
                final long n = d.b;
                AtomicLongFieldUpdater e3;
                long n2;
                do {
                    e3 = b.E;
                    value = e3.get((Object)b);
                    n2 = (0xFFFFFFFFFFFFFFFL & value);
                    if (n2 >= n * e2) {
                        break;
                    }
                } while (!e3.compareAndSet((Object)b, value, n2 + ((long)(int)(value >> 60) << 60)));
                m = l;
                if (e2 * d.b < f.get((Object)b)) {
                    ((B5.d)j).a();
                    m = l;
                }
            }
            else {
                m = j;
            }
        }
        return m;
    }
    
    public static final int c(final b b, final j j, int n, final Object o, final long n2, final Object o2, final boolean b2) {
        b.getClass();
        j.m(n, o);
        if (b2) {
            n = b.y(j, n, o, n2, o2, b2);
        }
        else {
            final Object k = j.k(n);
            if (k == null) {
                if (b.d(n2)) {
                    if (j.j(null, n, d.d)) {
                        n = 1;
                        return n;
                    }
                }
                else {
                    if (o2 == null) {
                        n = 3;
                        return n;
                    }
                    if (j.j(null, n, o2)) {
                        n = 2;
                        return n;
                    }
                }
            }
            else if (k instanceof l0) {
                j.m(n, null);
                if (b.v(k, o)) {
                    j.n(n, d.i);
                    n = 0;
                    return n;
                }
                final w i = d.k;
                if (j.H.getAndSet(n * 2 + 1, (Object)i) != i) {
                    j.l(n, true);
                }
                n = 5;
                return n;
            }
            n = b.y(j, n, o, n2, o2, b2);
        }
        return n;
    }
    
    public static void o(final b b) {
        b.getClass();
        final AtomicLongFieldUpdater h = b.H;
        if ((h.addAndGet((Object)b, 1L) & 0x4000000000000000L) != 0x0L) {
            while ((h.get((Object)b) & 0x4000000000000000L) != 0x0L) {}
        }
    }
    
    public static boolean w(final Object o) {
        if (o instanceof e) {
            h.c("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>", o);
            return d.a((e)o, c5.h.a, null);
        }
        final StringBuilder sb = new StringBuilder("Unexpected waiter: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @Override
    public final void b(final CancellationException ex) {
        CancellationException ex2 = ex;
        if (ex == null) {
            ex2 = new CancellationException("Channel was cancelled");
        }
        this.e((Throwable)ex2, true);
    }
    
    public final boolean d(final long n) {
        return n < b.G.get((Object)this) || n < b.F.get((Object)this) + this.C;
    }
    
    public final boolean e(final Throwable t, final boolean b) {
        final AtomicLongFieldUpdater e = b.E;
        if (b) {
            long value;
            do {
                value = e.get((Object)this);
                if ((int)(value >> 60) != 0) {
                    break;
                }
                final j a = d.a;
            } while (!e.compareAndSet((Object)this, value, ((long)1 << 60) + (value & 0xFFFFFFFFFFFFFFFL)));
        }
        final w s = d.s;
        while (true) {
            AtomicReferenceFieldUpdater l;
            do {
                l = b.L;
                if (l.compareAndSet((Object)this, (Object)s, (Object)t)) {
                    final boolean b2 = true;
                    if (b) {
                        long value2;
                        do {
                            value2 = e.get((Object)this);
                        } while (!e.compareAndSet((Object)this, value2, ((long)3 << 60) + (value2 & 0xFFFFFFFFFFFFFFFL)));
                    }
                    else {
                        long value3;
                        long n2;
                        long n3;
                        do {
                            value3 = e.get((Object)this);
                            final int n = (int)(value3 >> 60);
                            if (n != 0) {
                                if (n != 1) {
                                    break;
                                }
                                n2 = (value3 & 0xFFFFFFFFFFFFFFFL);
                                n3 = 3;
                            }
                            else {
                                n2 = (value3 & 0xFFFFFFFFFFFFFFFL);
                                n3 = 2;
                            }
                        } while (!e.compareAndSet((Object)this, value3, (n3 << 60) + n2));
                    }
                    this.q();
                    if (b2) {
                        Object value4 = null;
                    Label_0220:
                        while (true) {
                            final AtomicReferenceFieldUpdater m = b.M;
                            value4 = m.get((Object)this);
                            w w;
                            if (value4 == null) {
                                w = d.q;
                            }
                            else {
                                w = d.r;
                            }
                            while (!m.compareAndSet((Object)this, value4, (Object)w)) {
                                if (m.get((Object)this) != value4) {
                                    continue Label_0220;
                                }
                            }
                            break;
                        }
                        if (value4 != null) {
                            r.a(1, value4);
                            ((l)value4).g((Object)this.j());
                        }
                    }
                    return b2;
                }
            } while (l.get((Object)this) == s);
            final boolean b2 = false;
            continue;
        }
    }
    
    public final j f(final long n) {
        final Object value = b.K.get((Object)this);
        final j j = (j)b.I.get((Object)this);
        Object o = value;
        if (j.E > ((j)value).E) {
            o = j;
        }
        final j i = (j)b.J.get((Object)this);
        Object o2 = o;
        if (i.E > ((j)o).E) {
            o2 = i;
        }
        B5.d d = (B5.d)o2;
        ArrayList list = null;
    Label_0154:
        while (true) {
            d.getClass();
            final Object value2 = B5.d.C.get((Object)d);
            final w b = B5.a.b;
            list = null;
            if (value2 == b) {
                break;
            }
            final B5.d d2 = (B5.d)value2;
            if (d2 == null) {
                AtomicReferenceFieldUpdater c;
                do {
                    c = B5.d.C;
                    if (c.compareAndSet((Object)d, (Object)null, (Object)b)) {
                        break Label_0154;
                    }
                } while (c.get((Object)d) == null);
            }
            else {
                d = d2;
            }
        }
        final j k = (j)d;
        Label_0326: {
            if (this.r()) {
                j l = k;
                while (true) {
                    do {
                        int n2 = y5.d.b - 1;
                    Label_0178:
                        while (-1 < n2) {
                            long n3 = l.E * y5.d.b + n2;
                            Label_0311: {
                                if (n3 >= b.F.get((Object)this)) {
                                    while (true) {
                                        Object m;
                                        do {
                                            m = l.k(n2);
                                            if (m != null && m != y5.d.e) {
                                                if (m == y5.d.d) {
                                                    break Label_0311;
                                                }
                                                --n2;
                                                continue Label_0178;
                                            }
                                        } while (!l.j(m, n2, y5.d.l));
                                        l.h();
                                        continue;
                                    }
                                }
                                n3 = -1L;
                            }
                            if (n3 != -1L) {
                                this.g(n3);
                            }
                            break Label_0326;
                        }
                    } while ((l = (j)B5.d.D.get((Object)l)) != null);
                    continue;
                }
            }
        }
        j j2 = k;
        Object o3 = list;
        Object o4 = null;
    Label_0548:
        while (true) {
            o4 = o3;
            if (j2 == null) {
                break;
            }
            Object o5;
            for (int n4 = y5.d.b - 1; -1 < n4; --n4, o3 = o5) {
                final long n5 = y5.d.b;
                o4 = o3;
                if (j2.E * n5 + n4 < n) {
                    break Label_0548;
                }
                while (true) {
                    final Object k2 = j2.k(n4);
                    if (k2 != null && k2 != y5.d.e) {
                        if (k2 instanceof y5.r) {
                            if (j2.j(k2, n4, y5.d.l)) {
                                o5 = B5.a.f(o3, (Object)((y5.r)k2).a);
                                j2.l(n4, true);
                                break;
                            }
                            continue;
                        }
                        else {
                            o5 = o3;
                            if (!(k2 instanceof l0)) {
                                break;
                            }
                            if (j2.j(k2, n4, y5.d.l)) {
                                o5 = B5.a.f(o3, k2);
                                j2.l(n4, true);
                                break;
                            }
                            continue;
                        }
                    }
                    else {
                        if (j2.j(k2, n4, y5.d.l)) {
                            j2.h();
                            o5 = o3;
                            break;
                        }
                        continue;
                    }
                }
            }
            j2 = (j)B5.d.D.get((Object)j2);
        }
        if (o4 != null) {
            if (!(o4 instanceof ArrayList)) {
                this.u((l0)o4, true);
            }
            else {
                final ArrayList list2 = (ArrayList)o4;
                for (int n6 = list2.size() - 1; -1 < n6; --n6) {
                    this.u((l0)list2.get(n6), true);
                }
            }
        }
        return k;
    }
    
    public final void g(final long n) {
        Object o = b.J.get((Object)this);
        while (true) {
            final AtomicLongFieldUpdater f = b.F;
            final long value = f.get((Object)this);
            if (n < Math.max(this.C + value, b.G.get((Object)this))) {
                return;
            }
            if (!f.compareAndSet((Object)this, value, value + 1L)) {
                continue;
            }
            final long n2 = d.b;
            final long n3 = value / n2;
            final int n4 = (int)(value % n2);
            Object i = o;
            if (((u)o).E != n3) {
                i = this.i(n3, (j)o);
                if (i == null) {
                    continue;
                }
            }
            final Object x = this.x((j)i, n4, value, null);
            if (x == d.o) {
                o = i;
                if (value >= this.n()) {
                    continue;
                }
                ((B5.d)i).a();
                o = i;
            }
            else {
                ((B5.d)i).a();
                final l d = this.D;
                o = i;
                if (d == null) {
                    continue;
                }
                final A0.c a = B5.a.a(d, x, (A0.c)null);
                if (a != null) {
                    throw a;
                }
                o = i;
            }
        }
    }
    
    public final void h() {
        if (this.s()) {
            return;
        }
        final AtomicReferenceFieldUpdater k = b.K;
        j j = (j)k.get((Object)this);
    Label_0715:
        while (true) {
            final long andIncrement = b.G.getAndIncrement((Object)this);
            final long n = andIncrement / d.b;
            if (this.n() <= andIncrement) {
                if (j.E < n && ((B5.d)j).b() != null) {
                    this.t(n, j);
                }
                o(this);
                return;
            }
            j i = j;
            if (j.E != n) {
                final c l = c.K;
                Object b = null;
            Label_0222:
                while (true) {
                    b = B5.a.b((u)j, n, (m5.p)l);
                    if (B5.a.e(b)) {
                        break;
                    }
                    final u c = B5.a.c(b);
                Label_0127:
                    while (true) {
                        final u u = (u)k.get((Object)this);
                        if (u.E >= c.E) {
                            break Label_0222;
                        }
                        if (!c.i()) {
                            break;
                        }
                        while (!k.compareAndSet((Object)this, (Object)u, (Object)c)) {
                            if (k.get((Object)this) != u) {
                                if (c.e()) {
                                    ((B5.d)c).d();
                                    continue Label_0127;
                                }
                                continue Label_0127;
                            }
                        }
                        if (u.e()) {
                            ((B5.d)u).d();
                            break Label_0222;
                        }
                        break Label_0222;
                    }
                }
                final boolean e = B5.a.e(b);
                final j m = null;
                if (e) {
                    this.q();
                    this.t(n, j);
                    o(this);
                    i = m;
                }
                else {
                    i = (j)B5.a.c(b);
                    final long e2 = i.E;
                    if (e2 > n) {
                        final long n2 = e2 * d.b;
                        if (y5.b.G.compareAndSet((Object)this, andIncrement + 1L, n2)) {
                            final AtomicLongFieldUpdater h = y5.b.H;
                            i = m;
                            if ((h.addAndGet((Object)this, n2 - andIncrement) & 0x4000000000000000L) != 0x0L) {
                                do {
                                    i = m;
                                } while ((h.get((Object)this) & 0x4000000000000000L) != 0x0L);
                            }
                        }
                        else {
                            o(this);
                            i = m;
                        }
                    }
                }
                if (i == null) {
                    continue;
                }
            }
            final int n3 = (int)(andIncrement % d.b);
            final Object k2 = i.k(n3);
            final boolean b2 = k2 instanceof l0;
            final AtomicLongFieldUpdater f = b.F;
            if (b2 && andIncrement >= f.get((Object)this) && i.j(k2, n3, d.g)) {
                if (w(k2)) {
                    i.n(n3, d.d);
                    break;
                }
                i.n(n3, d.j);
                i.h();
            }
            else {
                while (true) {
                    final Object k3 = i.k(n3);
                    if (k3 instanceof l0) {
                        if (andIncrement < f.get((Object)this)) {
                            if (i.j(k3, n3, new y5.r((l0)k3))) {
                                break Label_0715;
                            }
                            continue;
                        }
                        else {
                            if (!i.j(k3, n3, d.g)) {
                                continue;
                            }
                            if (w(k3)) {
                                i.n(n3, d.d);
                                break Label_0715;
                            }
                            i.n(n3, d.j);
                            i.h();
                            break;
                        }
                    }
                    else {
                        if (k3 == d.j) {
                            break;
                        }
                        if (k3 == null) {
                            if (i.j(k3, n3, d.e)) {
                                break Label_0715;
                            }
                            continue;
                        }
                        else {
                            if (k3 == d.d) {
                                break Label_0715;
                            }
                            if (k3 == d.h || k3 == d.i) {
                                break Label_0715;
                            }
                            if (k3 == d.k) {
                                break Label_0715;
                            }
                            if (k3 == d.l) {
                                break Label_0715;
                            }
                            if (k3 == d.f) {
                                continue;
                            }
                            final StringBuilder sb = new StringBuilder("Unexpected cell state: ");
                            sb.append(k3);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                    }
                }
            }
            o(this);
            j = i;
        }
        o(this);
    }
    
    public final j i(long n, j j) {
        final j a = d.a;
        final c k = c.K;
        Object b = null;
    Label_0134:
        while (true) {
            b = B5.a.b((u)j, n, (m5.p)k);
            if (B5.a.e(b)) {
                break;
            }
            final u c = B5.a.c(b);
        Label_0034:
            while (true) {
                final AtomicReferenceFieldUpdater i = y5.b.J;
                final u u = (u)i.get((Object)this);
                if (u.E >= c.E) {
                    break Label_0134;
                }
                if (!c.i()) {
                    break;
                }
                while (!i.compareAndSet((Object)this, (Object)u, (Object)c)) {
                    if (i.get((Object)this) != u) {
                        if (c.e()) {
                            ((B5.d)c).d();
                            continue Label_0034;
                        }
                        continue Label_0034;
                    }
                }
                if (u.e()) {
                    ((B5.d)u).d();
                    break Label_0134;
                }
                break Label_0134;
            }
        }
        final boolean e = B5.a.e(b);
        final j l = null;
        j m;
        if (e) {
            this.q();
            n = d.b;
            m = l;
            if (j.E * n < this.n()) {
                ((B5.d)j).a();
                m = l;
            }
        }
        else {
            j = (j)B5.a.c(b);
            final boolean s = this.s();
            final long e2 = j.E;
            if (!s && n <= y5.b.G.get((Object)this) / d.b) {
            Label_0231:
                while (true) {
                    final AtomicReferenceFieldUpdater k2 = y5.b.K;
                    final u u2 = (u)k2.get((Object)this);
                    if (u2.E >= e2 || !j.i()) {
                        break;
                    }
                    while (!k2.compareAndSet((Object)this, (Object)u2, (Object)j)) {
                        if (k2.get((Object)this) != u2) {
                            if (j.e()) {
                                ((B5.d)j).d();
                                continue Label_0231;
                            }
                            continue Label_0231;
                        }
                    }
                    if (u2.e()) {
                        ((B5.d)u2).d();
                        break;
                    }
                    break;
                }
            }
            if (e2 > n) {
                n = d.b * e2;
                AtomicLongFieldUpdater f;
                long value;
                do {
                    f = y5.b.F;
                    value = f.get((Object)this);
                    if (value >= n) {
                        break;
                    }
                } while (!f.compareAndSet((Object)this, value, n));
                m = l;
                if (e2 * d.b < this.n()) {
                    ((B5.d)j).a();
                    m = l;
                }
            }
            else {
                m = j;
            }
        }
        return m;
    }
    
    public final Throwable j() {
        return (Throwable)b.L.get((Object)this);
    }
    
    @Override
    public Object k(Object o) {
        final AtomicLongFieldUpdater e = b.E;
        final long value = e.get((Object)this);
        final boolean b = !this.p(value, false) && (this.d(value & 0xFFFFFFFFFFFFFFFL) ^ true);
        final y5.h a = i.a;
        if (b) {
            return a;
        }
        final w j = d.j;
        j i = (j)y5.b.I.get((Object)this);
        c5.h a3 = null;
        Label_0360: {
            while (true) {
                final long andIncrement = e.getAndIncrement((Object)this);
                final long n = andIncrement & 0xFFFFFFFFFFFFFFFL;
                final boolean p = this.p(andIncrement, false);
                final int b2 = d.b;
                final long n2 = b2;
                final long n3 = n / n2;
                final int n4 = (int)(n % n2);
                if (i.E != n3) {
                    final j a2 = a(this, n3, i);
                    if (a2 == null) {
                        if (p) {
                            o = new g(this.m());
                            return o;
                        }
                        continue;
                    }
                    else {
                        i = a2;
                    }
                }
                final int c = c(this, i, n4, o, n, j, p);
                a3 = c5.h.a;
                if (c == 0) {
                    break Label_0360;
                }
                if (c == 1) {
                    break;
                }
                if (c != 2) {
                    if (c == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (c == 4) {
                        if (n < y5.b.F.get((Object)this)) {
                            ((B5.d)i).a();
                        }
                        o = new g(this.m());
                        return o;
                    }
                    if (c != 5) {
                        continue;
                    }
                    ((B5.d)i).a();
                }
                else {
                    if (p) {
                        i.h();
                        o = new g(this.m());
                        return o;
                    }
                    l0 l0;
                    if (j instanceof l0) {
                        l0 = (l0)j;
                    }
                    else {
                        l0 = null;
                    }
                    if (l0 != null) {
                        l0.a((u)i, n4 + b2);
                    }
                    i.h();
                    o = a;
                    return o;
                }
            }
            o = a3;
            return o;
        }
        ((B5.d)i).a();
        return a3;
    }
    
    public final Throwable l() {
        Object j;
        if ((j = this.j()) == null) {
            j = new NoSuchElementException("Channel was closed");
        }
        return (Throwable)j;
    }
    
    public final Throwable m() {
        Object j;
        if ((j = this.j()) == null) {
            j = new IllegalStateException("Channel was closed");
        }
        return (Throwable)j;
    }
    
    public final long n() {
        return b.E.get((Object)this) & 0xFFFFFFFFFFFFFFFL;
    }
    
    public final boolean p(long n, final boolean b) {
        final int n2 = (int)(n >> 60);
        boolean b3;
        final boolean b2 = b3 = false;
        if (n2 != 0) {
            b3 = b2;
            if (n2 != 1) {
                final AtomicLongFieldUpdater f = b.F;
                Label_0530: {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            throw new IllegalStateException(com.google.android.gms.internal.measurement.L.h(n2, "unexpected close status: ").toString());
                        }
                        j f2 = this.f(n & 0xFFFFFFFFFFFFFFFL);
                        A0.c c = null;
                        Object o = null;
                        j j;
                        Object f3 = null;
                        A0.c c2 = null;
                    Label_0456:
                        do {
                            int n3 = d.b - 1;
                            f3 = o;
                            c2 = c;
                            while (-1 < n3) {
                                n = d.b;
                                n = f2.E * n + n3;
                                while (true) {
                                    final Object k = f2.k(n3);
                                    if (k != d.i) {
                                        final w d = y5.d.d;
                                        final AtomicReferenceArray h = f2.H;
                                        final l d2 = this.D;
                                        Label_0417: {
                                            if (k != d) {
                                                if (k != y5.d.e && k != null) {
                                                    if (!(k instanceof l0) && !(k instanceof y5.r)) {
                                                        final w g = y5.d.g;
                                                        if (k == g) {
                                                            break Label_0456;
                                                        }
                                                        if (k == y5.d.f) {
                                                            break Label_0456;
                                                        }
                                                        if (k != g) {
                                                            break Label_0417;
                                                        }
                                                        continue;
                                                    }
                                                    else {
                                                        if (n < f.get((Object)this)) {
                                                            break Label_0456;
                                                        }
                                                        l0 a;
                                                        if (k instanceof y5.r) {
                                                            a = ((y5.r)k).a;
                                                        }
                                                        else {
                                                            a = (l0)k;
                                                        }
                                                        if (f2.j(k, n3, y5.d.l)) {
                                                            A0.c a2 = c2;
                                                            if (d2 != null) {
                                                                a2 = B5.a.a(d2, h.get(n3 * 2), c2);
                                                            }
                                                            f3 = B5.a.f(f3, (Object)a);
                                                            f2.m(n3, null);
                                                            f2.h();
                                                            c2 = a2;
                                                            break Label_0417;
                                                        }
                                                        continue;
                                                    }
                                                }
                                                else {
                                                    if (f2.j(k, n3, y5.d.l)) {
                                                        f2.h();
                                                        break Label_0417;
                                                    }
                                                    continue;
                                                }
                                                continue;
                                            }
                                            if (n < f.get((Object)this)) {
                                                break Label_0456;
                                            }
                                            if (!f2.j(k, n3, y5.d.l)) {
                                                continue;
                                            }
                                            A0.c a3 = c2;
                                            if (d2 != null) {
                                                a3 = B5.a.a(d2, h.get(n3 * 2), c2);
                                            }
                                            f2.m(n3, null);
                                            f2.h();
                                            c2 = a3;
                                        }
                                        --n3;
                                        break;
                                    }
                                    break Label_0456;
                                }
                            }
                            j = (f2 = (j)B5.d.D.get((Object)f2));
                            c = c2;
                            o = f3;
                        } while (j != null);
                        if (f3 != null) {
                            if (!(f3 instanceof ArrayList)) {
                                this.u((l0)f3, false);
                            }
                            else {
                                final ArrayList list = (ArrayList)f3;
                                for (int n4 = list.size() - 1; -1 < n4; --n4) {
                                    this.u((l0)list.get(n4), false);
                                }
                            }
                        }
                        if (c2 != null) {
                            throw c2;
                        }
                    }
                    else {
                        this.f(n & 0xFFFFFFFFFFFFFFFL);
                        if (b) {
                            AtomicReferenceFieldUpdater i = null;
                            long n5;
                            do {
                                Label_0572: {
                                    i = b.J;
                                }
                                final j l = (j)i.get((Object)this);
                                final long value = f.get((Object)this);
                                if (this.n() <= value) {
                                    break;
                                }
                                n = d.b;
                                n5 = value / n;
                                j m = l;
                                if (l.E == n5 || (m = this.i(n5, l)) != null) {
                                    ((B5.d)m).a();
                                    final int n6 = (int)(value % n);
                                    while (true) {
                                        Object k2;
                                        do {
                                            k2 = m.k(n6);
                                            if (k2 != null && k2 != d.e) {
                                                if (k2 == d.d) {
                                                    return b2;
                                                }
                                                if (k2 != d.j) {
                                                    if (k2 != d.l) {
                                                        if (k2 != d.i) {
                                                            if (k2 != d.h) {
                                                                if (k2 == d.g) {
                                                                    return b2;
                                                                }
                                                                if (k2 != d.f) {
                                                                    if (value == f.get((Object)this)) {
                                                                        return b2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                b.F.compareAndSet((Object)this, value, value + 1L);
                                                continue Label_0572;
                                            }
                                        } while (!m.j(k2, n6, d.h));
                                        this.h();
                                        continue;
                                    }
                                }
                            } while (((j)i.get((Object)this)).E >= n5);
                            break Label_0530;
                            b3 = b2;
                            return b3;
                            b3 = b2;
                            return b3;
                            b3 = b2;
                            return b3;
                        }
                    }
                }
                b3 = true;
            }
        }
        return b3;
    }
    
    public final boolean q() {
        return this.p(b.E.get((Object)this), false);
    }
    
    public boolean r() {
        return false;
    }
    
    public final boolean s() {
        final long value = b.G.get((Object)this);
        return value == 0L || value == Long.MAX_VALUE;
    }
    
    public final void t(final long n, j j) {
        j i;
        while (true) {
            i = j;
            if (j.E >= n) {
                break;
            }
            final j k = (j)((B5.d)j).b();
            if (k == null) {
                i = j;
                break;
            }
            j = k;
        }
    Label_0135:
        while (true) {
            if (i.c()) {
                j = (j)((B5.d)i).b();
                if (j != null) {
                    i = j;
                    continue;
                }
            }
        Label_0068:
            while (true) {
                final AtomicReferenceFieldUpdater l = b.K;
                final u u = (u)l.get((Object)this);
                if (u.E >= i.E) {
                    break Label_0135;
                }
                if (!i.i()) {
                    break;
                }
                while (!l.compareAndSet((Object)this, (Object)u, (Object)i)) {
                    if (l.get((Object)this) != u) {
                        if (i.e()) {
                            ((B5.d)i).d();
                            continue Label_0068;
                        }
                        continue Label_0068;
                    }
                }
                if (u.e()) {
                    ((B5.d)u).d();
                    break Label_0135;
                }
                break Label_0135;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final int n = (int)(b.E.get((Object)this) >> 60);
        if (n != 2) {
            if (n == 3) {
                sb.append("cancelled,");
            }
        }
        else {
            sb.append("closed,");
        }
        final StringBuilder sb2 = new StringBuilder("capacity=");
        sb2.append(this.C);
        sb2.append(',');
        sb.append(sb2.toString());
        sb.append("data=[");
        final Iterable iterable = (Iterable)d5.e.D((Object[])new j[] { (j)b.J.get((Object)this), (j)b.I.get((Object)this), (j)b.K.get((Object)this) });
        final ArrayList list = new ArrayList();
        for (final Object next : iterable) {
            if (next != d.a) {
                list.add(next);
            }
        }
        final Iterator iterator2 = list.iterator();
        if (!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next2 = iterator2.next();
        Object o;
        if (!iterator2.hasNext()) {
            o = next2;
        }
        else {
            long e = ((j)next2).E;
            do {
                final Object next3 = iterator2.next();
                final long e2 = ((j)next3).E;
                o = next2;
                long n2 = e;
                if (e > e2) {
                    o = next3;
                    n2 = e2;
                }
                next2 = o;
                e = n2;
            } while (iterator2.hasNext());
        }
        j j = (j)o;
        final long value = b.F.get((Object)this);
        final long n3 = this.n();
    Label_0810:
        do {
            for (int b = d.b, i = 0; i < b; ++i) {
                final long n4 = j.E * d.b + i;
                final long n5 = lcmp(n4, n3);
                if (n5 >= 0 && n4 >= value) {
                    break Label_0810;
                }
                final Object k = j.k(i);
                final Object value2 = j.H.get(i * 2);
                String s;
                if (k instanceof e) {
                    final long n6 = lcmp(n4, value);
                    if (n6 < 0 && n5 >= 0) {
                        s = "receive";
                    }
                    else if (n5 < 0 && n6 >= 0) {
                        s = "send";
                    }
                    else {
                        s = "cont";
                    }
                }
                else if (k instanceof y5.r) {
                    final StringBuilder sb3 = new StringBuilder("EB(");
                    sb3.append(k);
                    sb3.append(')');
                    s = sb3.toString();
                }
                else if (h.a(k, (Object)d.f) || h.a(k, (Object)d.g)) {
                    s = "resuming_sender";
                }
                else {
                    if (k == null || k.equals(d.e) || h.a(k, (Object)d.i) || h.a(k, (Object)d.h) || h.a(k, (Object)d.k) || h.a(k, (Object)d.j) || h.a(k, (Object)d.l)) {
                        continue;
                    }
                    s = k.toString();
                }
                if (value2 != null) {
                    final StringBuilder sb4 = new StringBuilder("(");
                    sb4.append(s);
                    sb4.append(',');
                    sb4.append(value2);
                    sb4.append("),");
                    sb.append(sb4.toString());
                }
                else {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(s);
                    sb5.append(',');
                    sb.append(sb5.toString());
                }
            }
            j = (j)((B5.d)j).b();
        } while (j != null);
        if (sb.length() != 0) {
            if (sb.charAt(u5.i.R((CharSequence)sb)) == ',') {
                h.d("this.deleteCharAt(index)", (Object)sb.deleteCharAt(sb.length() - 1));
            }
            sb.append("]");
            return sb.toString();
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
    
    public final void u(final l0 l0, final boolean b) {
        if (l0 instanceof e) {
            final e5.d d = (e5.d)l0;
            Throwable t;
            if (b) {
                t = this.l();
            }
            else {
                t = this.m();
            }
            d.h((Object)com.google.android.gms.internal.auth.h.k(t));
        }
        else {
            if (!(l0 instanceof y5.a)) {
                final StringBuilder sb = new StringBuilder("Unexpected waiter: ");
                sb.append((Object)l0);
                throw new IllegalStateException(sb.toString().toString());
            }
            final y5.a a = (y5.a)l0;
            final w5.f d2 = a.D;
            h.b((Object)d2);
            a.D = null;
            a.C = d.l;
            final Throwable j = a.E.j();
            if (j == null) {
                d2.h(Boolean.FALSE);
            }
            else {
                d2.h(com.google.android.gms.internal.auth.h.k(j));
            }
        }
    }
    
    public final boolean v(final Object o, final Object c) {
        final boolean b = o instanceof y5.a;
        final l l = null;
        final l i = null;
        boolean b2;
        if (b) {
            h.c("null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>", o);
            final y5.a a = (y5.a)o;
            final w5.f d = a.D;
            h.b((Object)d);
            a.D = null;
            a.C = c;
            final Boolean true = Boolean.TRUE;
            final l d2 = a.E.D;
            Object o2 = i;
            if (d2 != null) {
                o2 = new B5.p(d2, c, d.G);
            }
            b2 = y5.d.a((e)d, true, (l)o2);
        }
        else {
            if (!(o instanceof e)) {
                final StringBuilder sb = new StringBuilder("Unexpected receiver type: ");
                sb.append(o);
                throw new IllegalStateException(sb.toString().toString());
            }
            h.c("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>", o);
            final e e = (e)o;
            final l d3 = this.D;
            Object o3 = l;
            if (d3 != null) {
                o3 = new B5.p(d3, c, ((e5.d)e).getContext());
            }
            b2 = d.a(e, c, (l)o3);
        }
        return b2;
    }
    
    public final Object x(final j j, final int n, final long n2, Object o) {
        final Object k = j.k(n);
        final AtomicReferenceArray h = j.H;
        final AtomicLongFieldUpdater e = b.E;
        if (k == null) {
            if (n2 >= (e.get((Object)this) & 0xFFFFFFFFFFFFFFFL)) {
                if (o == null) {
                    return d.n;
                }
                if (j.j(k, n, o)) {
                    this.h();
                    return d.m;
                }
            }
        }
        else if (k == d.d && j.j(k, n, d.i)) {
            this.h();
            o = h.get(n * 2);
            j.m(n, null);
            return o;
        }
        Object o2;
        while (true) {
            final Object i = j.k(n);
            if (i != null && i != d.e) {
                if (i == d.d) {
                    if (j.j(i, n, d.i)) {
                        this.h();
                        o = h.get(n * 2);
                        j.m(n, null);
                        o2 = o;
                        break;
                    }
                    continue;
                }
                else {
                    final w l = d.j;
                    if (i == l) {
                        o2 = d.o;
                        break;
                    }
                    if (i == d.h) {
                        o2 = d.o;
                        break;
                    }
                    if (i == d.l) {
                        this.h();
                        o2 = d.o;
                        break;
                    }
                    if (i == d.g || !j.j(i, n, d.f)) {
                        continue;
                    }
                    final boolean b = i instanceof y5.r;
                    o = i;
                    if (b) {
                        o = ((y5.r)i).a;
                    }
                    if (w(o)) {
                        j.n(n, d.i);
                        this.h();
                        o = h.get(n * 2);
                        j.m(n, null);
                        o2 = o;
                        break;
                    }
                    j.n(n, l);
                    j.h();
                    if (b) {
                        this.h();
                    }
                    o2 = d.o;
                    break;
                }
            }
            else if (n2 < (e.get((Object)this) & 0xFFFFFFFFFFFFFFFL)) {
                if (j.j(i, n, d.h)) {
                    this.h();
                    o2 = d.o;
                    break;
                }
                continue;
            }
            else {
                if (o == null) {
                    o2 = d.n;
                    break;
                }
                if (j.j(i, n, o)) {
                    this.h();
                    o2 = d.m;
                    break;
                }
                continue;
            }
        }
        return o2;
    }
    
    public final int y(final j j, final int n, final Object o, final long n2, Object a, final boolean b) {
        while (true) {
            final Object k = j.k(n);
            if (k == null) {
                if (this.d(n2) && !b) {
                    if (j.j(null, n, d.d)) {
                        return 1;
                    }
                    continue;
                }
                else if (b) {
                    if (j.j(null, n, d.j)) {
                        j.h();
                        return 4;
                    }
                    continue;
                }
                else {
                    if (a == null) {
                        return 3;
                    }
                    if (j.j(null, n, a)) {
                        return 2;
                    }
                    continue;
                }
            }
            else if (k == d.e) {
                if (j.j(k, n, d.d)) {
                    return 1;
                }
                continue;
            }
            else {
                final w i = d.k;
                final int n3 = 5;
                if (k == i) {
                    j.m(n, null);
                    return 5;
                }
                if (k == d.h) {
                    j.m(n, null);
                    return 5;
                }
                if (k == d.l) {
                    j.m(n, null);
                    this.q();
                    return 4;
                }
                j.m(n, null);
                a = k;
                if (k instanceof y5.r) {
                    a = ((y5.r)k).a;
                }
                int n4;
                if (this.v(a, o)) {
                    j.n(n, d.i);
                    n4 = 0;
                }
                else {
                    n4 = n3;
                    if (j.H.getAndSet(n * 2 + 1, (Object)i) != i) {
                        j.l(n, true);
                        n4 = n3;
                    }
                }
                return n4;
            }
        }
    }
    
    public final void z(long n) {
        if (this.s()) {
            return;
        }
        AtomicLongFieldUpdater g;
        do {
            g = b.G;
        } while (g.get((Object)this) <= n);
        final int c = d.c;
        int n2 = 0;
        AtomicLongFieldUpdater h;
        while (true) {
            h = b.H;
            if (n2 >= c) {
                break;
            }
            n = g.get((Object)this);
            if (n == (h.get((Object)this) & 0x3FFFFFFFFFFFFFFFL) && n == g.get((Object)this)) {
                return;
            }
            ++n2;
        }
        do {
            n = h.get((Object)this);
        } while (!h.compareAndSet((Object)this, n, 4611686018427387904L + (n & 0x3FFFFFFFFFFFFFFFL)));
        while (true) {
            final long value = g.get((Object)this);
            n = h.get((Object)this);
            final long n3 = n & 0x3FFFFFFFFFFFFFFFL;
            final boolean b = (n & 0x4000000000000000L) != 0x0L;
            if (value == n3 && value == g.get((Object)this)) {
                break;
            }
            if (b) {
                continue;
            }
            h.compareAndSet((Object)this, n, n3 + 4611686018427387904L);
        }
        do {
            n = h.get((Object)this);
        } while (!h.compareAndSet((Object)this, n, n & 0x3FFFFFFFFFFFFFFFL));
    }
}

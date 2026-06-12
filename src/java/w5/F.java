package w5;

import B5.u;
import B5.w;
import B5.a;
import B5.h;
import java.util.concurrent.CancellationException;
import m5.l;
import e5.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import g5.d;

public class f extends B implements e, d, l0
{
    public static final AtomicIntegerFieldUpdater H;
    public static final AtomicReferenceFieldUpdater I;
    public static final AtomicReferenceFieldUpdater J;
    public final e5.d F;
    public final i G;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    
    static {
        H = AtomicIntegerFieldUpdater.newUpdater((Class)f.class, "_decisionAndIndex");
        I = AtomicReferenceFieldUpdater.newUpdater((Class)f.class, (Class)Object.class, "_state");
        J = AtomicReferenceFieldUpdater.newUpdater((Class)f.class, (Class)Object.class, "_parentHandle");
    }
    
    public f(final int n, final e5.d f) {
        super(n);
        this.F = f;
        this.G = f.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.C;
    }
    
    public static Object C(final d0 d0, Object o, final int n, final l l) {
        if (!(o instanceof n)) {
            if (v.h(n)) {
                if (l != null || d0 instanceof E) {
                    E e;
                    if (d0 instanceof E) {
                        e = (E)d0;
                    }
                    else {
                        e = null;
                    }
                    o = new m(o, e, l, null, 16);
                }
            }
        }
        return o;
    }
    
    public static void y(final d0 d0, final Object o) {
        final StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append((Object)d0);
        sb.append(", already has ");
        sb.append(o);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final void A() {
        final e5.d f = this.F;
        final boolean b = f instanceof h;
        final Throwable t = null;
        h h;
        if (b) {
            h = (h)f;
        }
        else {
            h = null;
        }
        if (h != null) {
            Throwable t2 = null;
        Label_0030:
            while (true) {
                final AtomicReferenceFieldUpdater j = B5.h.J;
                final Object value = j.get((Object)h);
                final w d = a.d;
                if (value == d) {
                    while (!j.compareAndSet((Object)h, (Object)d, (Object)this)) {
                        if (j.get((Object)h) != d) {
                            continue Label_0030;
                        }
                    }
                    t2 = t;
                    break;
                }
                if (value instanceof Throwable) {
                    while (!j.compareAndSet((Object)h, value, (Object)null)) {
                        if (j.get((Object)h) == value) {
                            continue;
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    t2 = (Throwable)value;
                    break;
                }
                final StringBuilder sb = new StringBuilder("Inconsistent state ");
                sb.append(value);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (t2 != null) {
                this.q();
                this.p(t2);
            }
        }
    }
    
    public final void B(final Object o, final int n, final l l) {
    Label_0000:
        while (true) {
            final AtomicReferenceFieldUpdater i = f.I;
            final Object value = i.get((Object)this);
            if (value instanceof d0) {
                while (!i.compareAndSet((Object)this, value, C((d0)value, o, n, l))) {
                    if (i.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
                if (!this.x()) {
                    this.q();
                }
                this.r(n);
                return;
            }
            if (value instanceof g) {
                final g g = (g)value;
                g.getClass();
                if (w5.g.c.compareAndSet((Object)g, 0, 1)) {
                    if (l != null) {
                        this.n(l, g.a);
                    }
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder("Already resumed, but proposed with update ");
            sb.append(o);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
    
    public final void a(final u u, final int n) {
        AtomicIntegerFieldUpdater h;
        int value;
        do {
            h = f.H;
            value = h.get((Object)this);
            if ((value & 0x1FFFFFFF) == 0x1FFFFFFF) {
                continue;
            }
            throw new IllegalStateException("invokeOnCancellation should be called at most once");
        } while (!h.compareAndSet((Object)this, value, (value >> 29 << 29) + n));
        this.w((d0)u);
    }
    
    public final void b(Object o, final CancellationException ex) {
    Label_0000:
        while (true) {
            final AtomicReferenceFieldUpdater i = f.I;
            final Object value = i.get((Object)this);
            if (value instanceof d0) {
                throw new IllegalStateException("Not completed");
            }
            if (value instanceof n) {
                return;
            }
            if (!(value instanceof m)) {
                o = new m(value, null, null, ex, 14);
                while (!i.compareAndSet((Object)this, value, o)) {
                    if (i.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
                return;
            }
            final m m = (m)value;
            if (m.e == null) {
                while (!i.compareAndSet((Object)this, value, (Object)w5.m.a(m, null, ex, 15))) {
                    if (i.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
                final E b = m.b;
                if (b != null) {
                    this.l(b, (Throwable)ex);
                }
                final l c = m.c;
                if (c != null) {
                    this.n(c, (Throwable)ex);
                }
                return;
            }
            throw new IllegalStateException("Must be called at most once");
        }
    }
    
    public final e5.d c() {
        return this.F;
    }
    
    public final w d(final Object o, final l l) {
        w w = null;
    Label_0000:
        while (true) {
            final AtomicReferenceFieldUpdater i = f.I;
            final Object value = i.get((Object)this);
            final boolean b = value instanceof d0;
            final w a = v.a;
            if (!b) {
                final boolean b2 = value instanceof m;
                w = null;
                break;
            }
            while (!i.compareAndSet((Object)this, value, C((d0)value, o, super.E, l))) {
                if (i.get((Object)this) != value) {
                    continue Label_0000;
                }
            }
            w = a;
            if (!this.x()) {
                this.q();
                w = a;
                break;
            }
            break;
        }
        return w;
    }
    
    public final d e() {
        final e5.d f = this.F;
        d d;
        if (f instanceof d) {
            d = (d)f;
        }
        else {
            d = null;
        }
        return d;
    }
    
    public final Throwable f(final Object o) {
        Throwable f = super.f(o);
        if (f == null) {
            f = null;
        }
        return f;
    }
    
    public final Object g(final Object o) {
        Object a = o;
        if (o instanceof m) {
            a = ((m)o).a;
        }
        return a;
    }
    
    public final i getContext() {
        return this.G;
    }
    
    public final void h(Object o) {
        final Throwable a = c5.e.a(o);
        if (a != null) {
            o = new n(a, false);
        }
        this.B(o, super.E, null);
    }
    
    public final void j(final Object o, final l l) {
        this.B(o, super.E, l);
    }
    
    public final Object k() {
        return f.I.get((Object)this);
    }
    
    public final void l(final E e, final Throwable t) {
        try {
            e.a(t);
        }
        finally {
            final StringBuilder sb = new StringBuilder("Exception in invokeOnCancellation handler for ");
            sb.append((Object)this);
            v.f(this.G, (Throwable)new RuntimeException(sb.toString(), t));
        }
    }
    
    public final void m(final Object o) {
        this.r(super.E);
    }
    
    public final void n(final l l, final Throwable t) {
        try {
            l.g((Object)t);
        }
        finally {
            final StringBuilder sb = new StringBuilder("Exception in resume onCancellation handler for ");
            sb.append((Object)this);
            v.f(this.G, (Throwable)new RuntimeException(sb.toString(), t));
        }
    }
    
    public final void o(final u u, Throwable g) {
        g = (Throwable)this.G;
        final int n = f.H.get((Object)this) & 0x1FFFFFFF;
        if (n != 536870911) {
            try {
                u.g(n, (i)g);
            }
            finally {
                final StringBuilder sb = new StringBuilder("Exception in invokeOnCancellation handler for ");
                sb.append((Object)this);
                final Throwable t;
                v.f((i)g, (Throwable)new RuntimeException(sb.toString(), t));
            }
            return;
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }
    
    public final boolean p(final Throwable t) {
    Label_0000:
        while (true) {
            final AtomicReferenceFieldUpdater i = f.I;
            final Object value = i.get((Object)this);
            final boolean b = value instanceof d0;
            boolean b2 = false;
            if (!b) {
                return false;
            }
            if (value instanceof E || value instanceof u) {
                b2 = true;
            }
            while (!i.compareAndSet((Object)this, value, (Object)new g(this, t, b2))) {
                if (i.get((Object)this) != value) {
                    continue Label_0000;
                }
            }
            final d0 d0 = (d0)value;
            if (d0 instanceof E) {
                this.l((E)value, t);
            }
            else if (d0 instanceof u) {
                this.o((u)value, t);
            }
            if (!this.x()) {
                this.q();
            }
            this.r(super.E);
            return true;
        }
    }
    
    public final void q() {
        final AtomicReferenceFieldUpdater j = f.J;
        final D d = (D)j.get((Object)this);
        if (d == null) {
            return;
        }
        d.dispose();
        j.set((Object)this, (Object)c0.C);
    }
    
    public final void r(final int n) {
        AtomicIntegerFieldUpdater h;
        int value;
        do {
            h = f.H;
            value = h.get((Object)this);
            final int n2 = value >> 29;
            if (n2 != 0) {
                if (n2 == 1) {
                    final boolean b = n == 4;
                    final e5.d f = this.F;
                    if (!b && f instanceof h && v.h(n) == v.h(super.E)) {
                        final s f2 = ((h)f).F;
                        final i context = ((e5.d)((h)f).G).getContext();
                        if (f2.h()) {
                            f2.g(context, (Runnable)this);
                            return;
                        }
                        final I a = h0.a();
                        if (a.E >= 4294967296L) {
                            d5.b g;
                            if ((g = a.G) == null) {
                                g = new d5.b();
                                a.G = g;
                            }
                            g.addLast((Object)this);
                            return;
                        }
                        a.m(true);
                        try {
                            v.l(this, f, true);
                            while (a.o()) {}
                            a.j(true);
                            return;
                        }
                        finally {
                            try {
                                final Throwable t;
                                this.i(t, (Throwable)null);
                            }
                            finally {
                                a.j(true);
                            }
                        }
                    }
                    v.l(this, f, b);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!h.compareAndSet((Object)this, value, 1073741824 + (0x1FFFFFFF & value)));
    }
    
    public Throwable s(final a0 a0) {
        return (Throwable)a0.y();
    }
    
    public final Object t() {
        final boolean x = this.x();
        AtomicIntegerFieldUpdater h;
        int value;
        do {
            h = f.H;
            value = h.get((Object)this);
            final int n = value >> 29;
            if (n != 0) {
                if (n != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x) {
                    this.A();
                }
                final Object value2 = f.I.get((Object)this);
                if (!(value2 instanceof n)) {
                    if (v.h(super.E)) {
                        final Q q = (Q)this.G.i((e5.h)t.D);
                        if (q != null) {
                            if (!q.a()) {
                                final CancellationException y = ((a0)q).y();
                                this.b(value2, y);
                                throw y;
                            }
                        }
                    }
                    return this.g(value2);
                }
                throw ((n)value2).a;
            }
        } while (!h.compareAndSet((Object)this, value, 536870912 + (0x1FFFFFFF & value)));
        if (f.J.get((Object)this) == null) {
            this.v();
        }
        if (x) {
            this.A();
        }
        return f5.a.C;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.z());
        sb.append('(');
        sb.append(v.n(this.F));
        sb.append("){");
        final Object value = f.I.get((Object)this);
        String s;
        if (value instanceof d0) {
            s = "Active";
        }
        else if (value instanceof g) {
            s = "Cancelled";
        }
        else {
            s = "Completed";
        }
        sb.append(s);
        sb.append("}@");
        sb.append(v.d(this));
        return sb.toString();
    }
    
    public final void u() {
        final D v = this.v();
        if (v == null) {
            return;
        }
        if (!(f.I.get((Object)this) instanceof d0)) {
            v.dispose();
            f.J.set((Object)this, (Object)c0.C);
        }
    }
    
    public final D v() {
        final Q q = (Q)this.G.i((e5.h)t.D);
        if (q == null) {
            return null;
        }
        final D g = v.g(q, true, new w5.h(this), 2);
        AtomicReferenceFieldUpdater j;
        do {
            j = f.J;
            if (j.compareAndSet((Object)this, (Object)null, (Object)g)) {
                break;
            }
        } while (j.get((Object)this) == null);
        return g;
    }
    
    public final void w(final d0 d0) {
    Label_0000:
        while (true) {
            final AtomicReferenceFieldUpdater i = f.I;
            final Object value = i.get((Object)this);
            if (value instanceof b) {
                while (!i.compareAndSet((Object)this, value, (Object)d0)) {
                    if (i.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
                return;
            }
            final boolean b = value instanceof E || value instanceof u;
            Throwable a = null;
            if (b) {
                y(d0, value);
                throw null;
            }
            if (value instanceof n) {
                n n = (n)value;
                n.getClass();
                if (w5.n.b.compareAndSet((Object)n, 0, 1)) {
                    if (value instanceof g) {
                        if (!(value instanceof n)) {
                            n = null;
                        }
                        if (n != null) {
                            a = n.a;
                        }
                        if (d0 instanceof E) {
                            this.l((E)d0, a);
                        }
                        else {
                            n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>", (Object)d0);
                            this.o((u)d0, a);
                        }
                    }
                    return;
                }
                y(d0, value);
                throw null;
            }
            else if (value instanceof m) {
                final m m = (m)value;
                if (m.b != null) {
                    y(d0, value);
                    throw null;
                }
                if (d0 instanceof u) {
                    return;
                }
                n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler", (Object)d0);
                final E e = (E)d0;
                final Throwable e2 = m.e;
                if (e2 != null) {
                    this.l(e, e2);
                    return;
                }
                while (!i.compareAndSet((Object)this, value, (Object)w5.m.a(m, e, null, 29))) {
                    if (i.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
            }
            else {
                if (d0 instanceof u) {
                    return;
                }
                n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler", (Object)d0);
                while (!i.compareAndSet((Object)this, value, (Object)new m(value, (E)d0, null, null, 28))) {
                    if (i.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
            }
        }
    }
    
    public final boolean x() {
        if (super.E == 2) {
            final e5.d f = this.F;
            n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", (Object)f);
            if (h.J.get((Object)f) != null) {
                return true;
            }
        }
        return false;
    }
    
    public String z() {
        return "CancellableContinuation";
    }
}

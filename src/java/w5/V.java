package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n3.u0;
import java.util.concurrent.locks.LockSupport;
import g5.c;
import m5.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import e5.d;
import e5.j;
import m5.p;
import e5.h;
import B5.e;
import e5.i;
import B5.w;

public abstract class v
{
    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    public static final w f;
    public static final w g;
    public static final F h;
    public static final F i;
    
    public static final e a(i c) {
        if (c.i((h)t.D) == null) {
            c = c.c((i)new U(null));
        }
        return new e(c);
    }
    
    public static y b(final e e, final p p2) {
        final y y = new y(j((u)e, (i)j.C), true, 0);
        y.T(1, (a)y, p2);
        return y;
    }
    
    public static final i c(i f, final i i, final boolean b) {
        final Boolean false = Boolean.FALSE;
        final w5.p f2 = w5.p.F;
        final boolean booleanValue = (boolean)((i)f).f((Object)false, (p)f2);
        final boolean booleanValue2 = (boolean)i.f((Object)false, (p)f2);
        if (!booleanValue && !booleanValue2) {
            return ((i)f).c(i);
        }
        final j c = j.C;
        final i j = (i)((i)f).f((Object)c, (p)new w5.p(2, 2));
        f = i;
        if (booleanValue2) {
            f = i.f((Object)c, (p)w5.p.E);
        }
        return j.c((i)f);
    }
    
    public static final String d(final Object o) {
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static final f e(final d d) {
        if (!(d instanceof B5.h)) {
            return new f(1, d);
        }
        final B5.h h = (B5.h)d;
        f f = null;
        f f2 = null;
    Label_0023:
        while (true) {
            final AtomicReferenceFieldUpdater j = B5.h.J;
            final Object value = j.get((Object)h);
            final w d2 = B5.a.d;
            f = null;
            if (value == null) {
                j.set((Object)h, (Object)d2);
                f2 = null;
                break;
            }
            if (value instanceof f) {
                while (!j.compareAndSet((Object)h, value, (Object)d2)) {
                    if (j.get((Object)h) != value) {
                        continue Label_0023;
                    }
                }
                f2 = (f)value;
                break;
            }
            if (value == d2) {
                continue;
            }
            if (value instanceof Throwable) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("Inconsistent state ");
            sb.append(value);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (f2 != null) {
            final AtomicReferenceFieldUpdater i = w5.f.I;
            final Object value2 = i.get((Object)f2);
            if (value2 instanceof m && ((m)value2).d != null) {
                f2.q();
                f2 = f;
            }
            else {
                w5.f.H.set((Object)f2, 536870911);
                i.set((Object)f2, (Object)w5.b.C);
            }
            if (f2 != null) {
                return f2;
            }
        }
        return new f(2, d);
    }
    
    public static final void f(final i i, Throwable t) {
        try {
            final x5.b b = (x5.b)i.i((h)t.C);
            if (b != null) {
                b.g(i, t);
                return;
            }
            B5.a.d(i, t);
        }
        finally {
            final Throwable t2;
            if (t != t2) {
                final Object o = new RuntimeException("Exception while trying to handle coroutine exception", t2);
                a.a.a((Throwable)o, t);
                t = (Throwable)o;
            }
            B5.a.d(i, t);
        }
    }
    
    public static final boolean h(final int n) {
        boolean b = true;
        if (n != 1) {
            b = (n == 2 && b);
        }
        return b;
    }
    
    public static y i(final u u, final p p2) {
        final y y = new y(j(u, (i)j.C), true, 1);
        y.T(1, (a)y, p2);
        return y;
    }
    
    public static final i j(final u u, i c) {
        c = c(u.g(), c, true);
        final D5.d a = C.a;
        i c2 = c;
        if (c != a) {
            c2 = c;
            if (c.i((h)e5.e.C) == null) {
                c2 = c.c((i)a);
            }
        }
        return c2;
    }
    
    public static final Object k(final Object o) {
        Object k = o;
        if (o instanceof n) {
            k = com.google.android.gms.internal.auth.h.k(((n)o).a);
        }
        return k;
    }
    
    public static final void l(final f f, d p3, final boolean b) {
        final Object value = f.I.get((Object)f);
        final Throwable f2 = f.f(value);
        Object o;
        if (f2 != null) {
            o = com.google.android.gms.internal.auth.h.k(f2);
        }
        else {
            o = f.g(value);
        }
        if (b) {
            n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", p3);
            final B5.h h = (B5.h)p3;
            final c g = h.G;
            final i context = ((d)g).getContext();
            final Object m = B5.a.m(context, h.I);
            if (m != B5.a.f) {
                p3 = p((d)g, context, m);
            }
            else {
                p3 = null;
            }
            try {
                ((g5.a)g).h(o);
                return;
            }
            finally {
                if (p3 == null || ((j0)p3).U()) {
                    B5.a.g(context, m);
                }
            }
        }
        ((d)p3).h(o);
    }
    
    public static Object m(p g) {
        final j c = j.C;
        final Thread currentThread = Thread.currentThread();
        final e5.e c2 = e5.e.C;
        final I a = h0.a();
        final i c3 = c((i)c, (i)a, true);
        final D5.d a2 = C.a;
        i c4 = c3;
        if (c3 != a2) {
            c4 = c3;
            if (c3.i((h)c2) == null) {
                c4 = c3.c((i)a2);
            }
        }
        final w5.c c5 = new w5.c(c4, currentThread, a);
        c5.T(1, (a)c5, g);
        g = (p)c5.G;
        if (g != null) {
            final int h = I.H;
            ((I)g).m(false);
        }
        long n;
        int h2;
        InterruptedException ex;
        n n2;
        Object o;
        int h3;
        Label_0205_Outer:Block_10_Outer:Block_8_Outer:
        while (true) {
            Label_0139: {
                try {
                    if (Thread.interrupted()) {
                        break Label_0139;
                    }
                    if (g != null) {
                        n = ((I)g).n();
                        break Label_0139;
                    }
                    break Label_0139;
                }
                finally {
                    if (g != null) {
                        h2 = I.H;
                        ((I)g).j(false);
                    }
                    ex = new InterruptedException();
                    ((a0)c5).q((Object)ex);
                    throw ex;
                    Label_0203: {
                        n2 = null;
                    }
                Label_0176_Outer:
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    iftrue(Label_0212:)(n2 != null);
                                    return o;
                                    n = Long.MAX_VALUE;
                                    break Label_0139;
                                    n2 = (n)o;
                                    continue Block_10_Outer;
                                }
                                LockSupport.parkNanos((Object)c5, n);
                                continue Label_0205_Outer;
                                o = o(((a0)c5).C());
                                iftrue(Label_0203:)(!(o instanceof n));
                                continue Block_8_Outer;
                            }
                            Label_0163:
                            iftrue(Label_0176:)(g == null);
                            h3 = I.H;
                            ((I)g).j(false);
                            continue;
                        }
                        iftrue(Label_0163:)(!(((a0)c5).C() instanceof M));
                        continue Label_0176_Outer;
                    }
                    Label_0212:
                    throw n2.a;
                }
            }
            break;
        }
    }
    
    public static final String n(final d d) {
        String string;
        if (d instanceof B5.h) {
            string = d.toString();
        }
        else {
            Object o = null;
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)d);
                sb.append('@');
                sb.append(d(d));
                sb.toString();
            }
            finally {
                final Throwable t;
                o = com.google.android.gms.internal.auth.h.k(t);
            }
            if (c5.e.a(o) != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(d.getClass().getName());
                sb2.append('@');
                sb2.append(d(d));
                o = sb2.toString();
            }
            string = (String)o;
        }
        return string;
    }
    
    public static final Object o(final Object o) {
        N n;
        if (o instanceof N) {
            n = (N)o;
        }
        else {
            n = null;
        }
        Object a = o;
        if (n != null) {
            a = n.a;
            if (a == null) {
                a = o;
            }
        }
        return a;
    }
    
    public static final j0 p(final d d, final i i, final Object o) {
        final boolean b = d instanceof g5.d;
        j0 j0 = null;
        final j0 j2 = null;
        if (!b) {
            return null;
        }
        if (i.i((h)k0.C) != null) {
            g5.d d2 = (g5.d)d;
            while (true) {
                while (!(d2 instanceof A)) {
                    final g5.d e = d2.e();
                    j0 j3;
                    if (e == null) {
                        j3 = j2;
                    }
                    else {
                        d2 = e;
                        if (!(e instanceof j0)) {
                            continue;
                        }
                        j3 = (j0)e;
                    }
                    j0 = j3;
                    if (j3 != null) {
                        j3.V(i, o);
                        j0 = j3;
                        return j0;
                    }
                    return j0;
                }
                j0 j3 = j2;
                continue;
            }
        }
        return j0;
    }
    
    public static final Object q(i i, c m, final p p3) {
        final i context = ((d)m).getContext();
        if (!(boolean)i.f((Object)Boolean.FALSE, (p)w5.p.F)) {
            i = context.c(i);
        }
        else {
            i = c(context, i, false);
        }
        final Q q = (Q)i.i((h)t.D);
        if (q != null && !q.a()) {
            throw ((a0)q).y();
        }
        Object o = null;
        if (i == context) {
            final B5.t t = new B5.t((d)m, i);
            o = s2.a.l(t, t, p3);
        }
        else {
            final e5.e c = e5.e.C;
            if (n5.h.a((Object)i.i((h)c), (Object)context.i((h)c))) {
                final j0 j0 = new j0(i, m);
                final i e = ((a)j0).E;
                m = (c)B5.a.m(e, (Object)null);
                try {
                    s2.a.l((B5.t)j0, (B5.t)j0, p3);
                    return o;
                }
                finally {
                    B5.a.g(e, (Object)m);
                }
            }
            final B5.t t2 = new B5.t((d)m, i);
            u0.z(p3, (a)t2, (a)t2);
            AtomicIntegerFieldUpdater g;
            do {
                g = A.G;
                final int value = g.get((Object)t2);
                if (value != 0) {
                    if (value != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    o = o(((a0)t2).C());
                    if (!(o instanceof n)) {
                        return o;
                    }
                    throw ((n)o).a;
                }
            } while (!g.compareAndSet((Object)t2, 0, 1));
            o = f5.a.C;
        }
        return o;
    }
}

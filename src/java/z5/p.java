package z5;

import java.util.NoSuchElementException;
import n5.o;
import y5.b;
import B5.v;
import e5.i;
import java.util.concurrent.CancellationException;
import w5.Y;
import w5.n;
import w5.a0;
import w5.t;
import w5.Q;
import g4.C;
import com.google.android.gms.internal.auth.h;
import f5.a;
import java.io.Serializable;
import B5.w;

public abstract class p
{
    public static final w a;
    public static final w b;
    
    static {
        a = new w("NONE", 0);
        b = new w("PENDING", 0);
    }
    
    public static final Serializable a(final c c, d f, g5.c o) {
        Label_0050: {
            if (o instanceof g) {
                final g g = (g)o;
                final int h = g.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    g.H = h + Integer.MIN_VALUE;
                    o = g;
                    break Label_0050;
                }
            }
            o = new g5.c((e5.d)o);
        }
        Object g2 = ((g)o).G;
        final a c2 = f5.a.C;
        final int h2 = ((g)o).H;
        final Throwable t;
        Label_0172: {
            if (h2 != 0) {
                if (h2 == 1) {
                    f = (d)((g)o).F;
                    try {
                        h.z(g2);
                        return (Serializable)t;
                    }
                    finally {
                        break Label_0172;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h.z(g2);
            g2 = new Object();
            try {
                final C c3 = new C(f, g2, 1);
                ((g)o).F = (o)g2;
                ((g)o).H = 1;
                if (c.e((d)c3, (e5.d)o) == c2) {
                    return (Serializable)t;
                }
                return (Serializable)t;
            }
            finally {
                f = (d)g2;
            }
        }
        final Throwable t2 = (Throwable)((o)f).C;
        if (t2 == null || !t2.equals(t)) {
            final i d = ((g5.c)o).D;
            n5.h.b((Object)d);
            final Q q = (Q)d.i((e5.h)w5.t.D);
            if (q != null) {
                final a0 a0 = (a0)q;
                final Object c4 = a0.C();
                if (c4 instanceof n || (c4 instanceof Y && ((Y)c4).d())) {
                    if (a0.y().equals(t)) {
                        throw t;
                    }
                }
            }
            if (t2 == null) {
                return (Serializable)t;
            }
            if (t instanceof CancellationException) {
                a.a.a(t2, t);
                throw t2;
            }
            a.a.a(t, t2);
            throw t;
        }
        throw t;
    }
    
    public static final Object b(d f, y5.n g, boolean i, g5.c c) {
        Object o = null;
        Label_0051: {
            if (c instanceof e) {
                o = c;
                final int k = ((e)o).K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    ((e)o).K = k + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            o = new g5.c((e5.d)c);
        }
        Object o2 = ((e)o).J;
        final a c2 = f5.a.C;
        final int j = ((e)o).K;
        final CancellationException ex = null;
        Label_0204: {
            if (j == 0) {
                break Label_0204;
            }
            Label_0166: {
                if (j == 1) {
                    break Label_0166;
                }
                Label_0156: {
                    if (j != 2) {
                        break Label_0156;
                    }
                    boolean l = ((e)o).I;
                    y5.a h = ((e)o).H;
                    g = (y5.n)((e)o).G;
                    f = ((e)o).F;
                    c = (g5.c)g;
                    int n = l ? 1 : 0;
                    Label_0253: {
                        try {
                            com.google.android.gms.internal.auth.h.z(o2);
                            final d d = f;
                            final e e = (e)o;
                            Label_0134: {
                                final y5.a h2 = h;
                            }
                            final d f2 = d;
                            o = e;
                            i = l;
                            break Label_0253;
                        }
                        finally {
                            try {}
                            finally {
                                if (n != 0) {
                                    CancellationException ex2 = ex;
                                    final Throwable t;
                                    if (t instanceof CancellationException) {
                                        ex2 = (CancellationException)t;
                                    }
                                    CancellationException ex3;
                                    if ((ex3 = ex2) == null) {
                                        ex3 = new CancellationException("Channel was consumed, consumer had failed");
                                        ((Throwable)ex3).initCause(t);
                                    }
                                    ((y5.p)c).b(ex3);
                                }
                            }
                            return c2;
                            Label_0532: {
                                throw new IllegalStateException("`hasNext()` has not been invoked");
                            }
                            y5.a h3 = null;
                            Label_0502:
                            final Throwable m = h3.E.l();
                            final int a = v.a;
                            throw m;
                            Label_0559:
                            iftrue(Label_0570:)(!i);
                            d d;
                            e e;
                            y5.a h2;
                            d f2 = null;
                            b f3;
                            y5.a a2;
                            w p;
                            Object c3 = null;
                            y5.p g2 = null;
                            y5.a a3;
                            Label_0338:Block_10_Outer:
                            while (true) {
                                Block_12: {
                                    while (true) {
                                        while (true) {
                                            Block_14: {
                                                break Block_14;
                                                com.google.android.gms.internal.auth.h.z(o2);
                                                f3 = g.F;
                                                f3.getClass();
                                                a2 = new y5.a(f3);
                                                f2 = f;
                                                h2 = a2;
                                                break Label_0253;
                                                h3.C = p;
                                                iftrue(Label_0502:)(c3 == y5.d.l);
                                                break Block_12;
                                                ((e)o).F = f2;
                                                ((e)o).G = g;
                                                ((e)o).H = h2;
                                                ((e)o).I = i;
                                                ((e)o).K = 1;
                                                o2 = h2.b((e)o);
                                                iftrue(Label_0332:)(o2 != c2);
                                                return c2;
                                                i = ((e)o).I;
                                                h3 = ((e)o).H;
                                                g2 = ((e)o).G;
                                                f2 = ((e)o).F;
                                                com.google.android.gms.internal.auth.h.z(o2);
                                                break Label_0338;
                                            }
                                            g2.b(null);
                                            return c5.h.a;
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            c3 = h3.C;
                                            p = y5.d.p;
                                            iftrue(Label_0532:)(c3 == p);
                                            continue Block_10_Outer;
                                        }
                                        iftrue(Label_0559:)(!(boolean)o2);
                                        continue;
                                    }
                                }
                                ((e)o).F = f2;
                                ((e)o).G = g2;
                                ((e)o).H = h3;
                                ((e)o).I = i;
                                ((e)o).K = 2;
                                e = (e)o;
                                d = f2;
                                h = h3;
                                g = (y5.n)g2;
                                l = i;
                                c = (g5.c)g2;
                                n = (i ? 1 : 0);
                                iftrue(Label_0134:)(f2.a(c3, (e5.d)o) != c2);
                                return c2;
                                Label_0332:
                                a3 = h2;
                                g2 = g;
                                h3 = a3;
                                continue Label_0338;
                            }
                            Label_0570:
                            return c5.h.a;
                        }
                    }
                }
            }
        }
    }
    
    public static final Object c(c f, final g5.c c) {
        g5.c c2 = null;
        Label_0046: {
            if (c instanceof k) {
                final k k = (k)c;
                final int i = k.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    k.I = i + Integer.MIN_VALUE;
                    c2 = k;
                    break Label_0046;
                }
            }
            c2 = new g5.c((e5.d)c);
        }
        final Object h = ((k)c2).H;
        final a c3 = f5.a.C;
        final int j = ((k)c2).I;
        final w a = A5.h.a;
        Label_0195: {
            j g = null;
            Label_0187: {
                if (j != 0) {
                    if (j == 1) {
                        g = ((k)c2).G;
                        f = (c)((k)c2).F;
                        try {
                            com.google.android.gms.internal.auth.h.z(h);
                            break Label_0195;
                        }
                        catch (final A5.a a2) {
                            break Label_0187;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.auth.h.z(h);
                final Object f2 = new Object();
                ((o)f2).C = a;
                final j g2 = new j((o)f2, 0);
                try {
                    ((k)c2).F = (o)f2;
                    ((k)c2).G = g2;
                    ((k)c2).I = 1;
                    if (f.e((d)g2, (e5.d)c2) == c3) {
                        return c3;
                    }
                    f = (c)f2;
                    break Label_0195;
                }
                catch (final A5.a a2) {
                    f = (c)f2;
                    g = g2;
                }
            }
            final A5.a a2;
            if (a2.C != g) {
                throw a2;
            }
        }
        final Object c4 = ((o)f).C;
        if (c4 == a) {
            throw new NoSuchElementException("Expected at least one element");
        }
        return c4;
    }
    
    public static final Object d(c f, g5.c f2) {
        Object o = null;
        Label_0044: {
            if (f2 instanceof l) {
                o = f2;
                final int i = ((l)o).I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    ((l)o).I = i + Integer.MIN_VALUE;
                    break Label_0044;
                }
            }
            o = new g5.c((e5.d)f2);
        }
        final Object h = ((l)o).H;
        final a c = f5.a.C;
        final int j = ((l)o).I;
        j k = null;
        A5.a a = null;
        Label_0177: {
            if (j != 0) {
                if (j == 1) {
                    final j g = ((l)o).G;
                    f = (c)((l)o).F;
                    try {
                        com.google.android.gms.internal.auth.h.z(h);
                        return ((o)f).C;
                    }
                    catch (final A5.a a) {
                        k = g;
                        break Label_0177;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(h);
            f2 = (g5.c)new Object();
            final j g2 = new j((o)f2, 1);
            try {
                ((l)o).F = (o)f2;
                ((l)o).G = g2;
                ((l)o).I = 1;
                if (f.e((d)g2, (e5.d)o) == c) {
                    return c;
                }
                f = (c)f2;
                return ((o)f).C;
            }
            catch (final A5.a a2) {
                f = (c)f2;
                a = a2;
                k = g2;
            }
        }
        if (a.C != k) {
            throw a;
        }
        return ((o)f).C;
    }
}

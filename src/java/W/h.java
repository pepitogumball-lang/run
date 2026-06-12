package W;

import java.io.Serializable;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Closeable;
import java.io.FileInputStream;
import java.util.Iterator;
import java.io.File;
import w5.d0;
import w5.E;
import w5.P;
import w5.W;
import n3.u0;
import w5.M;
import c5.e;
import m5.p;
import g5.c;
import m5.l;
import w5.a0;
import w5.t;
import w5.Q;
import java.util.concurrent.atomic.AtomicInteger;
import y5.i;
import E5.g;
import e5.d;
import w5.u;
import java.util.List;
import z5.o;
import c5.f;
import X4.C;
import H0.a;
import java.util.LinkedHashSet;

public final class H implements h
{
    public static final LinkedHashSet K;
    public static final Object L;
    public final a C;
    public final b D;
    public final C E;
    public final String F;
    public final f G;
    public final o H;
    public List I;
    public final Y0.h J;
    
    static {
        K = new LinkedHashSet();
        L = new Object();
    }
    
    public H(final a c, final List list, final b d, final u c2) {
        this.C = c;
        this.D = d;
        this.E = new C(new v(this, null), 22);
        this.F = ".tmp";
        this.G = new f((m5.a)new a((Object)this, 2));
        this.H = new o((Object)W.J.a);
        this.I = d5.d.L((Iterable)list);
        final g g = new g((Object)this, 1);
        final r d2 = new r(this, null);
        final Object j = new Object();
        ((Y0.h)j).C = c2;
        ((Y0.h)j).D = d2;
        ((Y0.h)j).E = i.a(Integer.MAX_VALUE, 0, 6);
        ((Y0.h)j).F = new AtomicInteger(0);
        final Q q = (Q)c2.g().i((e5.h)t.D);
        if (q != null) {
            ((a0)q).G(false, true, (l)new k(g, 0, j));
        }
        this.J = (Y0.h)j;
    }
    
    public static final Object b(final H h, n d, c b) {
        h.getClass();
        Object i = null;
        Label_0054: {
            if (b instanceof w) {
                i = b;
                final int k = ((w)i).K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    ((w)i).K = k + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            i = new w(h, b);
        }
        final Object j = ((w)i).I;
        final f5.a c = f5.a.C;
        final int l = ((w)i).K;
        boolean b2 = true;
        Object g = null;
        Label_0537: {
            Label_0532: {
                while (true) {
                    Object o = null;
                    Object o2 = null;
                    Label_0399: {
                        if (l != 0) {
                            Object o3;
                            if (l != 1) {
                                if (l == 2) {
                                    final Object h2 = ((w)i).H;
                                    o = ((w)i).G;
                                    o2 = ((w)i).F;
                                    com.google.android.gms.internal.auth.h.z(j);
                                    d = (n)h2;
                                    break Label_0399;
                                }
                                if (l != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                o3 = ((w)i).F;
                            }
                            else {
                                o3 = ((w)i).F;
                            }
                            d = (n)o3;
                            try {
                                com.google.android.gms.internal.auth.h.z(j);
                                d = (n)o3;
                                break Label_0537;
                            }
                            finally {
                                break Label_0532;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.auth.h.z(j);
                        final Object m = b = (c)d.b;
                        Label_0292: {
                            while (true) {
                                try {
                                    o = h.H.b();
                                    b = (c)m;
                                    if (!(o instanceof W.c)) {
                                        break Label_0292;
                                    }
                                    b = (c)m;
                                    o = d.a;
                                    b = (c)m;
                                    d = (n)d.d;
                                    b = (c)m;
                                    ((w)i).F = m;
                                    b = (c)m;
                                    ((w)i).K = 1;
                                    b = (c)m;
                                    i = h.i((e5.i)d, (c)i, (p)o);
                                    d = (n)m;
                                    if (i == c) {
                                        return g;
                                    }
                                    break Label_0537;
                                    d = (n)b;
                                    break Label_0532;
                                }
                                finally {
                                    continue;
                                }
                                break;
                            }
                        }
                        if (!(o instanceof j)) {
                            b2 = (o instanceof J);
                        }
                        if (b2) {
                            if (o != d.c) {
                                throw ((j)o).a;
                            }
                            ((w)i).F = d;
                            ((w)i).G = (H)g;
                            ((w)i).H = (w5.l)m;
                            ((w)i).K = 2;
                            o = g;
                            o2 = d;
                            d = (n)m;
                            if (((H)g).e((c)i) == c) {
                                g = c;
                                return g;
                            }
                        }
                        else {
                            if (o instanceof W.i) {
                                throw ((W.i)o).a;
                            }
                            new RuntimeException();
                        }
                    }
                    final g5.h a = ((n)o2).a;
                    final e5.i d2 = ((n)o2).d;
                    ((w)i).F = d;
                    ((w)i).G = null;
                    ((w)i).H = null;
                    ((w)i).K = 3;
                    b = (c)d;
                    final Object m = ((H)o).i(d2, (c)i, (p)a);
                    if (m == c) {
                        g = c;
                        return g;
                    }
                    continue;
                }
            }
            g = com.google.android.gms.internal.auth.h.k((Throwable)g);
        }
        final Throwable a2 = e.a(g);
        final B5.w e = w5.v.e;
        final B5.w d3 = w5.v.d;
        final B5.w c2 = w5.v.c;
        if (a2 == null) {
            final w5.l l2 = (w5.l)d;
            Object q;
            do {
                q = ((a0)l2).Q(((a0)l2).C(), g);
                if (q == c2) {
                    break;
                }
                if (q == d3) {
                    break;
                }
            } while (q == e);
        }
        else {
            final w5.l l3 = (w5.l)d;
            l3.getClass();
            final w5.n n = new w5.n(a2, false);
            Object q2;
            do {
                q2 = ((a0)l3).Q(((a0)l3).C(), (Object)n);
                if (q2 == c2) {
                    break;
                }
                if (q2 == d3) {
                    break;
                }
            } while (q2 == e);
        }
        g = c5.h.a;
        return g;
    }
    
    public final Object a(final p p2, final c c) {
        final a0 a0 = new a0(true);
        a0.F((Q)null);
        this.J.s(new n(p2, (w5.l)a0, (I)this.H.b(), ((d)c).getContext()));
        Object c2;
        do {
            c2 = a0.C();
            if (!(c2 instanceof M)) {
                if (!(c2 instanceof w5.n)) {
                    return w5.v.o(c2);
                }
                throw ((w5.n)c2).a;
            }
        } while (a0.O(c2) < 0);
        final W w = new W(u0.o((d)c), (w5.l)a0);
        ((w5.f)w).u();
        ((w5.f)w).w((d0)new E(a0.G(false, true, (l)new P((Object)w, 1))));
        return ((w5.f)w).t();
    }
    
    public final File c() {
        return (File)this.G.a();
    }
    
    public final Object d(final c c) {
        c c2 = null;
        Label_0049: {
            if (c instanceof x) {
                c2 = c;
                final int n = ((x)c2).N;
                if ((n & Integer.MIN_VALUE) != 0x0) {
                    ((x)c2).N = n + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            c2 = new x(this, c);
        }
        Object c3 = ((x)c2).L;
        final f5.a c4 = f5.a.C;
        final int n2 = ((x)c2).N;
        int hashCode = 0;
        Label_0629: {
            Object g = null;
            Object o2 = null;
            H f = null;
            Object o4 = null;
        Label_0549:
            while (true) {
                Object o = null;
                Label_0374: {
                    Iterator k;
                    z j;
                    n5.o h2;
                    Object g2;
                    H f2;
                    if (n2 != 0) {
                        if (n2 == 1) {
                            o = ((x)c2).I;
                            g = ((x)c2).H;
                            o2 = ((x)c2).G;
                            f = ((x)c2).F;
                            com.google.android.gms.internal.auth.h.z(c3);
                            break Label_0374;
                        }
                        if (n2 != 2) {
                            if (n2 == 3) {
                                final Object h = ((x)c2).I;
                                final n5.n n3 = (n5.n)((x)c2).H;
                                final Object o3 = ((x)c2).G;
                                f = ((x)c2).F;
                                com.google.android.gms.internal.auth.h.z(c3);
                                o4 = n3;
                                break Label_0629;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            k = ((x)c2).K;
                            j = ((x)c2).J;
                            final n5.n n4 = (n5.n)((x)c2).I;
                            h2 = (n5.o)((x)c2).H;
                            g2 = ((x)c2).G;
                            f2 = ((x)c2).F;
                            com.google.android.gms.internal.auth.h.z(c3);
                            o4 = n4;
                        }
                    }
                    else {
                        com.google.android.gms.internal.auth.h.z(c3);
                        final o h3 = this.H;
                        if (!n5.h.a(h3.b(), (Object)W.J.a) && !(h3.b() instanceof j)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        o2 = new E5.d(false);
                        o = new Object();
                        ((x)c2).F = this;
                        ((x)c2).G = o2;
                        ((x)c2).H = (Serializable)o;
                        ((x)c2).I = o;
                        ((x)c2).N = 1;
                        c3 = this.h(c2);
                        if (c3 == c4) {
                            return c4;
                        }
                        f = this;
                        g = o;
                        break Label_0374;
                    }
                    while (k.hasNext()) {
                        final p p = (p)k.next();
                        ((x)c2).F = f2;
                        ((x)c2).G = g2;
                        ((x)c2).H = (Serializable)h2;
                        ((x)c2).I = o4;
                        ((x)c2).J = j;
                        ((x)c2).K = k;
                        ((x)c2).N = 2;
                        if (p.f((Object)j, (Object)c2) == c4) {
                            return c4;
                        }
                    }
                    final H h4 = f2;
                    o2 = g2;
                    g = h2;
                    f = h4;
                    break Label_0549;
                }
                ((n5.o)o).C = c3;
                o4 = new Object();
                z j = new z((E5.a)o2, (n5.n)o4, (n5.o)g, f);
                final List i = f.I;
                if (i != null) {
                    final Iterator k = ((Iterable)i).iterator();
                    final H h5 = f;
                    final n5.o h2 = (n5.o)g;
                    final Object g2 = o2;
                    final H f2 = h5;
                    continue;
                }
                break;
            }
            f.I = null;
            ((x)c2).F = f;
            ((x)c2).G = g;
            ((x)c2).H = (Serializable)o4;
            ((x)c2).I = o2;
            ((x)c2).J = null;
            ((x)c2).K = null;
            ((x)c2).N = 3;
            final E5.d d = (E5.d)o2;
            if (d.d(c2) == c4) {
                return c4;
            }
            final E5.d d2 = d;
            final Object o3 = g;
            Object h = d2;
            try {
                ((n5.n)o4).C = true;
                ((E5.d)h).e((Object)null);
                h = f.H;
                final Object c5 = ((n5.o)o3).C;
                if (c5 != null) {
                    hashCode = c5.hashCode();
                }
                ((o)h).c((Object)new W.c(c5, hashCode));
                return c5.h.a;
            }
            finally {
                ((E5.d)h).e((Object)null);
            }
        }
    }
    
    public final Object e(c c) {
        Label_0047: {
            if (c instanceof A) {
                final A a = (A)c;
                final int i = a.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    a.I = i + Integer.MIN_VALUE;
                    c = a;
                    break Label_0047;
                }
            }
            c = new A(this, c);
        }
        final Object g = ((A)c).G;
        final f5.a c2 = f5.a.C;
        final int j = ((A)c).I;
        Label_0126: {
            if (j != 0) {
                if (j == 1) {
                    c = (c)((A)c).F;
                    try {
                        com.google.android.gms.internal.auth.h.z(g);
                        break Label_0126;
                    }
                    finally {
                        break Label_0126;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(g);
            while (true) {
                try {
                    ((A)c).F = this;
                    ((A)c).I = 1;
                    c = (c)this.d(c);
                    if (c == c2) {
                        return c2;
                    }
                    return c5.h.a;
                    c = (c)this;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        final Throwable t;
        ((H)c).H.c((Object)new j(t));
    }
    
    public final Object f(c c) {
        Label_0047: {
            if (c instanceof B) {
                final B b = (B)c;
                final int i = b.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    b.I = i + Integer.MIN_VALUE;
                    c = b;
                    break Label_0047;
                }
            }
            c = new B(this, c);
        }
        final Object g = ((B)c).G;
        final f5.a c2 = f5.a.C;
        final int j = ((B)c).I;
        Label_0135: {
            if (j != 0) {
                if (j == 1) {
                    c = (c)((B)c).F;
                    try {
                        com.google.android.gms.internal.auth.h.z(g);
                        return c5.h.a;
                    }
                    finally {
                        break Label_0135;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(g);
            while (true) {
                try {
                    ((B)c).F = this;
                    ((B)c).I = 1;
                    c = (c)this.d(c);
                    if (c == c2) {
                        return c2;
                    }
                    return c5.h.a;
                    c = (c)this;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        final Throwable t;
        ((H)c).H.c((Object)new j(t));
        return c5.h.a;
    }
    
    public final Object g(c f) {
        Object a = null;
        Label_0045: {
            if (f instanceof W.C) {
                a = f;
                final int j = ((W.C)a).J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    ((W.C)a).J = j + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            a = new W.C(this, (c)f);
        }
        final Object h = ((W.C)a).H;
        Object o = f5.a.C;
        final int i = ((W.C)a).J;
        Label_0196: {
            if (i != 0) {
                if (i == 1) {
                    o = ((W.C)a).G;
                    f = (FileNotFoundException)((W.C)a).F;
                    try {
                        com.google.android.gms.internal.auth.h.z(h);
                    }
                    finally {
                        final W.C c = (W.C)a;
                        break Label_0196;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(h);
            try {
                f = (FileNotFoundException)new FileInputStream(this.c());
                while (true) {
                    try {
                        final Z.h a2 = Z.h.a;
                        ((W.C)a).F = this;
                        ((W.C)a).G = (FileInputStream)f;
                        ((W.C)a).J = 1;
                        a = a2.a((FileInputStream)f);
                        if (a == o) {
                            return o;
                        }
                        o = f;
                        f = (FileNotFoundException)a;
                        a = this;
                        try {
                            u2.f.d((Closeable)o, (Throwable)null);
                            return f;
                        }
                        catch (final FileNotFoundException f) {
                            break Label_0196;
                        }
                        o = f;
                        f = (FileNotFoundException)this;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
                try {
                    throw;
                }
                finally {
                    final W.C c;
                    u2.f.d((Closeable)o, (Throwable)c);
                }
            }
            catch (final FileNotFoundException f) {
                a = this;
            }
        }
        if (!((H)a).c().exists()) {
            return new Z.b(true);
        }
        throw f;
    }
    
    public final z5.c getData() {
        return (z5.c)this.E;
    }
    
    public final Object h(c c) {
        Object o = null;
        Label_0049: {
            if (c instanceof D) {
                o = c;
                final int j = ((D)o).J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    ((D)o).J = j + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o = new D(this, c);
        }
        Object g = ((D)o).H;
        final f5.a c2 = f5.a.C;
        final int i = ((D)o).J;
        Label_0272: {
            Label_0216: {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                final Object g2 = ((D)o).G;
                                c = (c)((D)o).F;
                                try {
                                    com.google.android.gms.internal.auth.h.z(g);
                                    c = (c)g2;
                                    return c;
                                }
                                catch (final IOException ex) {
                                    break Label_0272;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c = (c)((D)o).G;
                        final Object o2 = ((D)o).F;
                        com.google.android.gms.internal.auth.h.z(g);
                        break Label_0272;
                    }
                    else {
                        c = (c)((D)o).F;
                        try {
                            com.google.android.gms.internal.auth.h.z(g);
                            return g;
                        }
                        catch (final W.a g3) {
                            break Label_0216;
                        }
                    }
                }
                com.google.android.gms.internal.auth.h.z(g);
                while (true) {
                    try {
                        ((D)o).F = this;
                        ((D)o).J = 1;
                        if ((g = this.g((c)o)) == c2) {
                            return c2;
                        }
                        return g;
                        c = (c)this;
                    }
                    catch (final W.a g3) {
                        continue;
                    }
                    break;
                }
            }
            final b d = ((H)c).D;
            ((D)o).F = c;
            final W.a g3;
            ((D)o).G = g3;
            ((D)o).J = 2;
            final Object o3 = d.o(g3);
            if (o3 == c2) {
                return c2;
            }
            final c c3 = (c)g3;
            g = o3;
            final Object o2 = c;
            c = c3;
            try {
                ((D)o).F = c;
                ((D)o).G = g;
                ((D)o).J = 3;
                if (((H)o2).j(g, (c)o) == c2) {
                    return c2;
                }
                c = (c)g;
                return c;
            }
            catch (final IOException ex) {}
        }
        final IOException ex;
        a.a.a((Throwable)c, (Throwable)ex);
        throw c;
    }
    
    public final Object i(final e5.i i, final c c, final p p3) {
        c c2 = null;
        Label_0052: {
            if (c instanceof W.E) {
                c2 = c;
                final int k = ((W.E)c2).K;
                if ((k & Integer.MIN_VALUE) != 0x0) {
                    ((W.E)c2).K = k + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            c2 = new W.E(this, c);
        }
        final Object j = ((W.E)c2).I;
        final f5.a c3 = f5.a.C;
        final int l = ((W.E)c2).K;
        final int n = 0;
        Object g = null;
        H f = null;
        Label_0359: {
            Object h;
            H f2;
            Object q;
            W.c g2;
            if (l != 0) {
                if (l != 1) {
                    if (l == 2) {
                        g = ((W.E)c2).G;
                        f = ((W.E)c2).F;
                        com.google.android.gms.internal.auth.h.z(j);
                        break Label_0359;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    h = ((W.E)c2).H;
                    final W.c c4 = (W.c)((W.E)c2).G;
                    f2 = ((W.E)c2).F;
                    com.google.android.gms.internal.auth.h.z(j);
                    q = j;
                    g2 = c4;
                }
            }
            else {
                com.google.android.gms.internal.auth.h.z(j);
                g2 = (W.c)this.H.b();
                final Object a = g2.a;
                int hashCode;
                if (a != null) {
                    hashCode = a.hashCode();
                }
                else {
                    hashCode = 0;
                }
                if (hashCode != g2.b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                h = g2.a;
                final F f3 = new F(p3, h, null);
                ((W.E)c2).F = this;
                ((W.E)c2).G = g2;
                ((W.E)c2).H = h;
                ((W.E)c2).K = 1;
                q = w5.v.q(i, c2, (p)f3);
                if (q == c3) {
                    return c3;
                }
                f2 = this;
            }
            final Object a2 = g2.a;
            int hashCode2;
            if (a2 != null) {
                hashCode2 = a2.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            if (hashCode2 != g2.b) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (n5.h.a(h, q)) {
                g = h;
                return g;
            }
            ((W.E)c2).F = f2;
            ((W.E)c2).G = q;
            ((W.E)c2).H = null;
            ((W.E)c2).K = 2;
            if (f2.j(q, c2) == c3) {
                return c3;
            }
            f = f2;
            g = q;
        }
        final o h2 = f.H;
        int hashCode3 = n;
        if (g != null) {
            hashCode3 = g.hashCode();
        }
        h2.c((Object)new W.c(g, hashCode3));
        return g;
    }
    
    public final Object j(final Object p0, final c p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      LW/G;
        //     4: ifeq            38
        //     7: aload_2        
        //     8: checkcast       LW/G;
        //    11: astore          5
        //    13: aload           5
        //    15: getfield        W/G.L:I
        //    18: istore_3       
        //    19: iload_3        
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            38
        //    26: aload           5
        //    28: iload_3        
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        W/G.L:I
        //    35: goto            49
        //    38: new             LW/G;
        //    41: dup            
        //    42: aload_0        
        //    43: aload_2        
        //    44: invokespecial   W/G.<init>:(LW/H;Lg5/c;)V
        //    47: astore          5
        //    49: aload           5
        //    51: getfield        W/G.J:Ljava/lang/Object;
        //    54: astore          10
        //    56: getstatic       f5/a.C:Lf5/a;
        //    59: astore          7
        //    61: aload           5
        //    63: getfield        W/G.L:I
        //    66: istore_3       
        //    67: getstatic       c5/h.a:Lc5/h;
        //    70: astore          9
        //    72: iload_3        
        //    73: ifeq            151
        //    76: iload_3        
        //    77: iconst_1       
        //    78: if_icmpne       141
        //    81: aload           5
        //    83: getfield        W/G.I:Ljava/io/FileOutputStream;
        //    86: astore          8
        //    88: aload           5
        //    90: getfield        W/G.H:Ljava/io/FileOutputStream;
        //    93: astore          7
        //    95: aload           5
        //    97: getfield        W/G.G:Ljava/io/File;
        //   100: astore_1       
        //   101: aload           5
        //   103: getfield        W/G.F:LW/H;
        //   106: astore          6
        //   108: aload           7
        //   110: astore          4
        //   112: aload_1        
        //   113: astore_2       
        //   114: aload           10
        //   116: invokestatic    com/google/android/gms/internal/auth/h.z:(Ljava/lang/Object;)V
        //   119: aload           7
        //   121: astore          5
        //   123: aload           8
        //   125: astore          7
        //   127: goto            309
        //   130: astore          5
        //   132: aload           4
        //   134: astore_1       
        //   135: aload_2        
        //   136: astore          4
        //   138: goto            426
        //   141: new             Ljava/lang/IllegalStateException;
        //   144: dup            
        //   145: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   147: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   150: athrow         
        //   151: aload           10
        //   153: invokestatic    com/google/android/gms/internal/auth/h.z:(Ljava/lang/Object;)V
        //   156: aload_0        
        //   157: invokevirtual   W/H.c:()Ljava/io/File;
        //   160: astore          4
        //   162: aload           4
        //   164: invokevirtual   java/io/File.getCanonicalFile:()Ljava/io/File;
        //   167: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   170: astore_2       
        //   171: aload_2        
        //   172: ifnonnull       178
        //   175: goto            190
        //   178: aload_2        
        //   179: invokevirtual   java/io/File.mkdirs:()Z
        //   182: pop            
        //   183: aload_2        
        //   184: invokevirtual   java/io/File.isDirectory:()Z
        //   187: ifeq            460
        //   190: new             Ljava/io/File;
        //   193: dup            
        //   194: aload_0        
        //   195: invokevirtual   W/H.c:()Ljava/io/File;
        //   198: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   201: aload_0        
        //   202: getfield        W/H.F:Ljava/lang/String;
        //   205: invokestatic    n5/h.g:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   208: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   211: astore          4
        //   213: aload           4
        //   215: astore_2       
        //   216: new             Ljava/io/FileOutputStream;
        //   219: dup            
        //   220: aload           4
        //   222: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   225: astore          6
        //   227: getstatic       Z/h.a:LZ/h;
        //   230: astore          8
        //   232: new             LW/p;
        //   235: astore_2       
        //   236: aload_2        
        //   237: aload           6
        //   239: invokespecial   W/p.<init>:(Ljava/io/FileOutputStream;)V
        //   242: aload           5
        //   244: aload_0        
        //   245: putfield        W/G.F:LW/H;
        //   248: aload           5
        //   250: aload           4
        //   252: putfield        W/G.G:Ljava/io/File;
        //   255: aload           5
        //   257: aload           6
        //   259: putfield        W/G.H:Ljava/io/FileOutputStream;
        //   262: aload           5
        //   264: aload           6
        //   266: putfield        W/G.I:Ljava/io/FileOutputStream;
        //   269: aload           5
        //   271: iconst_1       
        //   272: putfield        W/G.L:I
        //   275: aload           8
        //   277: aload_1        
        //   278: aload_2        
        //   279: invokevirtual   Z/h.b:(Ljava/lang/Object;LW/p;)V
        //   282: aload           9
        //   284: aload           7
        //   286: if_acmpne       292
        //   289: aload           7
        //   291: areturn        
        //   292: aload_0        
        //   293: astore_2       
        //   294: aload           6
        //   296: astore_1       
        //   297: aload_1        
        //   298: astore          5
        //   300: aload_1        
        //   301: astore          7
        //   303: aload           4
        //   305: astore_1       
        //   306: aload_2        
        //   307: astore          6
        //   309: aload           5
        //   311: astore          4
        //   313: aload_1        
        //   314: astore_2       
        //   315: aload           7
        //   317: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //   320: invokevirtual   java/io/FileDescriptor.sync:()V
        //   323: aload_1        
        //   324: astore_2       
        //   325: aload           5
        //   327: aconst_null    
        //   328: invokestatic    u2/f.d:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   331: aload_1        
        //   332: astore_2       
        //   333: aload_1        
        //   334: aload           6
        //   336: invokevirtual   W/H.c:()Ljava/io/File;
        //   339: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   342: ifeq            348
        //   345: aload           9
        //   347: areturn        
        //   348: aload_1        
        //   349: astore_2       
        //   350: new             Ljava/io/IOException;
        //   353: astore          4
        //   355: aload_1        
        //   356: astore_2       
        //   357: new             Ljava/lang/StringBuilder;
        //   360: astore          5
        //   362: aload_1        
        //   363: astore_2       
        //   364: aload           5
        //   366: ldc_w           "Unable to rename "
        //   369: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   372: aload_1        
        //   373: astore_2       
        //   374: aload           5
        //   376: aload_1        
        //   377: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   380: pop            
        //   381: aload_1        
        //   382: astore_2       
        //   383: aload           5
        //   385: ldc_w           ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: pop            
        //   392: aload_1        
        //   393: astore_2       
        //   394: aload           4
        //   396: aload           5
        //   398: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   401: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   404: aload_1        
        //   405: astore_2       
        //   406: aload           4
        //   408: athrow         
        //   409: astore_1       
        //   410: goto            446
        //   413: aload           6
        //   415: astore_1       
        //   416: aload_2        
        //   417: astore          5
        //   419: goto            426
        //   422: astore_2       
        //   423: goto            413
        //   426: aload           5
        //   428: athrow         
        //   429: astore          6
        //   431: aload           4
        //   433: astore_2       
        //   434: aload_1        
        //   435: aload           5
        //   437: invokestatic    u2/f.d:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   440: aload           4
        //   442: astore_2       
        //   443: aload           6
        //   445: athrow         
        //   446: aload_2        
        //   447: invokevirtual   java/io/File.exists:()Z
        //   450: ifeq            458
        //   453: aload_2        
        //   454: invokevirtual   java/io/File.delete:()Z
        //   457: pop            
        //   458: aload_1        
        //   459: athrow         
        //   460: new             Ljava/io/IOException;
        //   463: dup            
        //   464: ldc_w           "Unable to create parent directories of "
        //   467: aload           4
        //   469: invokestatic    n5/h.g:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //   472: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   475: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  114    119    130    141    Any
        //  216    227    409    460    Ljava/io/IOException;
        //  227    282    422    426    Any
        //  315    323    130    141    Any
        //  325    331    409    460    Ljava/io/IOException;
        //  333    345    409    460    Ljava/io/IOException;
        //  350    355    409    460    Ljava/io/IOException;
        //  357    362    409    460    Ljava/io/IOException;
        //  364    372    409    460    Ljava/io/IOException;
        //  374    381    409    460    Ljava/io/IOException;
        //  383    392    409    460    Ljava/io/IOException;
        //  394    404    409    460    Ljava/io/IOException;
        //  406    409    409    460    Ljava/io/IOException;
        //  426    429    429    446    Any
        //  434    440    409    460    Ljava/io/IOException;
        //  443    446    409    460    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0292:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}

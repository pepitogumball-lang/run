package x;

import java.lang.ref.Reference;
import y.n;
import v.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import android.view.View;
import y.l;
import y.j;
import y.c;
import java.util.ArrayList;

public class e
{
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public int F;
    public int G;
    public final d H;
    public final d I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public e S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public c b;
    public int b0;
    public c c;
    public float c0;
    public j d;
    public float d0;
    public l e;
    public View e0;
    public final boolean[] f;
    public int f0;
    public boolean g;
    public String g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public String j;
    public final float[] j0;
    public boolean k;
    public final e[] k0;
    public boolean l;
    public final e[] l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    
    public e() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[] { true, true };
        this.g = true;
        this.h = -1;
        this.i = -1;
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
        this.D = 0.0f;
        this.E = false;
        this.F = 0;
        this.G = 0;
        final d h = new d(this, 2);
        this.H = h;
        final d i = new d(this, 3);
        this.I = i;
        final d j = new d(this, 4);
        this.J = j;
        final d k = new d(this, 5);
        this.K = k;
        final d l = new d(this, 6);
        this.L = l;
        final d m = new d(this, 8);
        this.M = m;
        final d n = new d(this, 9);
        this.N = n;
        final d o = new d(this, 7);
        this.O = o;
        this.P = new d[] { h, j, i, k, l, o };
        final ArrayList q = new ArrayList();
        this.Q = q;
        this.R = new boolean[2];
        this.o0 = new int[] { 1, 1 };
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[] { -1.0f, -1.0f };
        this.k0 = new e[] { null, null };
        this.l0 = new e[] { null, null };
        this.m0 = -1;
        this.n0 = -1;
        q.add((Object)h);
        q.add((Object)i);
        q.add((Object)j);
        q.add((Object)k);
        q.add((Object)m);
        q.add((Object)n);
        q.add((Object)o);
        q.add((Object)l);
    }
    
    public static void D(final int n, final int n2, final String s, final StringBuilder sb) {
        if (n == n2) {
            return;
        }
        sb.append(s);
        sb.append(" :   ");
        sb.append(n);
        sb.append(",\n");
    }
    
    public static void E(final StringBuilder sb, final String s, final float n, final float n2) {
        if (n == n2) {
            return;
        }
        sb.append(s);
        sb.append(" :   ");
        sb.append(n);
        sb.append(",\n");
    }
    
    public static void m(final StringBuilder sb, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        sb.append(s);
        sb.append(" :  {\n");
        D(n, 0, "      size", sb);
        D(n2, 0, "      min", sb);
        D(n3, Integer.MAX_VALUE, "      max", sb);
        D(n4, 0, "      matchMin", sb);
        D(n5, 0, "      matchDef", sb);
        E(sb, "      matchPercent", n6, 1.0f);
        sb.append("    },\n");
    }
    
    public static void n(final StringBuilder sb, final String s, final d d) {
        if (d.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(s);
        sb.append(" : [ '");
        sb.append((Object)d.f);
        sb.append("'");
        if (d.h != Integer.MIN_VALUE || d.g != 0) {
            sb.append(",");
            sb.append(d.g);
            if (d.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(d.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }
    
    public void A() {
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.S = null;
        this.D = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        final int[] o0 = this.o0;
        o0[o0[0] = 1] = 1;
        this.e0 = null;
        this.f0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        final float[] j0 = this.j0;
        j0[1] = (j0[0] = -1.0f);
        this.o = -1;
        this.p = -1;
        final int[] c = this.C;
        c[1] = (c[0] = Integer.MAX_VALUE);
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        final boolean[] f = this.f;
        f[1] = (f[0] = true);
        final boolean[] r = this.R;
        r[1] = (r[0] = false);
        this.g = true;
        final int[] t = this.t;
        t[1] = (t[0] = 0);
        this.h = -1;
        this.i = -1;
    }
    
    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        final ArrayList q = this.Q;
        for (int size = q.size(), i = 0; i < size; ++i) {
            final d d = (d)q.get(i);
            d.c = false;
            d.b = 0;
        }
    }
    
    public void C(final w2.e e) {
        this.H.h();
        this.I.h();
        this.J.h();
        this.K.h();
        this.L.h();
        this.O.h();
        this.M.h();
        this.N.h();
    }
    
    public final void F(final int x, final int n) {
        if (this.k) {
            return;
        }
        this.H.i(x);
        this.J.i(n);
        this.X = x;
        this.T = n - x;
        this.k = true;
    }
    
    public final void G(final int y, int z) {
        if (this.l) {
            return;
        }
        this.I.i(y);
        this.K.i(z);
        this.Y = y;
        this.U = z - y;
        if (this.E) {
            z = this.Z;
            this.L.i(y + z);
        }
        this.l = true;
    }
    
    public final void H(final int u) {
        this.U = u;
        final int b0 = this.b0;
        if (u < b0) {
            this.U = b0;
        }
    }
    
    public final void I(final int n) {
        this.o0[0] = n;
    }
    
    public final void J(final int n) {
        this.o0[1] = n;
    }
    
    public final void K(final int t) {
        this.T = t;
        final int a0 = this.a0;
        if (t < a0) {
            this.T = a0;
        }
    }
    
    public void L(final boolean b, final boolean b2) {
        final j d = this.d;
        final boolean b3 = b & d.g;
        final l e = this.e;
        final boolean b4 = b2 & e.g;
        int g = d.h.g;
        int g2 = e.h.g;
        int g3 = d.i.g;
        final int g4 = e.i.g;
        int n;
        if (g3 - g < 0 || g4 - g2 < 0 || g == Integer.MIN_VALUE || g == Integer.MAX_VALUE || g2 == Integer.MIN_VALUE || g2 == Integer.MAX_VALUE || g3 == Integer.MIN_VALUE || g3 == Integer.MAX_VALUE || g4 == Integer.MIN_VALUE || (n = g4) == Integer.MAX_VALUE) {
            g3 = 0;
            n = 0;
            g = (g2 = n);
        }
        final int n2 = g3 - g;
        final int n3 = n - g2;
        if (b3) {
            this.X = g;
        }
        if (b4) {
            this.Y = g2;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        final int[] o0 = this.o0;
        if (b3) {
            int t = n2;
            if (o0[0] == 1) {
                final int t2 = this.T;
                if ((t = n2) < t2) {
                    t = t2;
                }
            }
            this.T = t;
            final int a0 = this.a0;
            if (t < a0) {
                this.T = a0;
            }
        }
        if (b4) {
            int u = n3;
            if (o0[1] == 1) {
                final int u2 = this.U;
                if ((u = n3) < u2) {
                    u = u2;
                }
            }
            this.U = u;
            final int b5 = this.b0;
            if (u < b5) {
                this.U = b5;
            }
        }
    }
    
    public void M(final v.c c, final boolean b) {
        final d h = this.H;
        c.getClass();
        final int n = v.c.n((Object)h);
        final int n2 = v.c.n((Object)this.I);
        final int n3 = v.c.n((Object)this.J);
        final int n4 = v.c.n((Object)this.K);
        int g = n3;
        int g2 = n;
        if (b) {
            final j d = this.d;
            g = n3;
            g2 = n;
            if (d != null) {
                final y.e h2 = d.h;
                g = n3;
                g2 = n;
                if (h2.j) {
                    final y.e i = d.i;
                    g = n3;
                    g2 = n;
                    if (i.j) {
                        g2 = h2.g;
                        g = i.g;
                    }
                }
            }
        }
        int g3 = n2;
        int g4 = n4;
        if (b) {
            final l e = this.e;
            g3 = n2;
            g4 = n4;
            if (e != null) {
                final y.e h3 = e.h;
                g3 = n2;
                g4 = n4;
                if (h3.j) {
                    final y.e j = e.i;
                    g3 = n2;
                    g4 = n4;
                    if (j.j) {
                        g3 = h3.g;
                        g4 = j.g;
                    }
                }
            }
        }
        int n5 = 0;
        int n6 = 0;
        int x = 0;
        Label_0315: {
            if (g - g2 >= 0 && g4 - g3 >= 0 && g2 != Integer.MIN_VALUE && g2 != Integer.MAX_VALUE && g3 != Integer.MIN_VALUE && g3 != Integer.MAX_VALUE && g != Integer.MIN_VALUE && g != Integer.MAX_VALUE && g4 != Integer.MIN_VALUE) {
                n5 = g;
                n6 = g4;
                x = g2;
                if (g4 != Integer.MAX_VALUE) {
                    break Label_0315;
                }
            }
            x = 0;
            g3 = 0;
            n6 = (n5 = g3);
        }
        final int n7 = n5 - x;
        final int n8 = n6 - g3;
        this.X = x;
        this.Y = g3;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
        }
        else {
            final int[] o0 = this.o0;
            final int n9 = o0[0];
            int t = n7;
            if (n9 == 1) {
                final int t2 = this.T;
                if ((t = n7) < t2) {
                    t = t2;
                }
            }
            int u = n8;
            if (o0[1] == 1) {
                final int u2 = this.U;
                if ((u = n8) < u2) {
                    u = u2;
                }
            }
            this.T = t;
            this.U = u;
            final int b2 = this.b0;
            if (u < b2) {
                this.U = b2;
            }
            final int a0 = this.a0;
            if (t < a0) {
                this.T = a0;
            }
            final int v = this.v;
            if (v > 0 && n9 == 3) {
                this.T = Math.min(this.T, v);
            }
            final int y = this.y;
            if (y > 0 && o0[1] == 3) {
                this.U = Math.min(this.U, y);
            }
            final int t3 = this.T;
            if (t != t3) {
                this.h = t3;
            }
            final int u3 = this.U;
            if (u != u3) {
                this.i = u3;
            }
        }
    }
    
    public final void a(final f f, final v.c c, final HashSet set, final int n, final boolean b) {
        if (b) {
            if (!set.contains((Object)this)) {
                return;
            }
            x.h.b(f, c, this);
            set.remove((Object)this);
            this.b(c, f.S(64));
        }
        if (n == 0) {
            final HashSet a = this.H.a;
            if (a != null) {
                final Iterator iterator = a.iterator();
                while (iterator.hasNext()) {
                    ((d)iterator.next()).d.a(f, c, set, n, true);
                }
            }
            final HashSet a2 = this.J.a;
            if (a2 != null) {
                final Iterator iterator2 = a2.iterator();
                while (iterator2.hasNext()) {
                    ((d)iterator2.next()).d.a(f, c, set, n, true);
                }
            }
        }
        else {
            final HashSet a3 = this.I.a;
            if (a3 != null) {
                final Iterator iterator3 = a3.iterator();
                while (iterator3.hasNext()) {
                    ((d)iterator3.next()).d.a(f, c, set, n, true);
                }
            }
            final HashSet a4 = this.K.a;
            if (a4 != null) {
                final Iterator iterator4 = a4.iterator();
                while (iterator4.hasNext()) {
                    ((d)iterator4.next()).d.a(f, c, set, n, true);
                }
            }
            final HashSet a5 = this.L.a;
            if (a5 != null) {
                final Iterator iterator5 = a5.iterator();
                while (iterator5.hasNext()) {
                    ((d)iterator5.next()).d.a(f, c, set, n, true);
                }
            }
        }
    }
    
    public void b(final v.c c, final boolean b) {
        final d h = this.H;
        final v.f k = c.k((Object)h);
        final d j = this.J;
        final v.f i = c.k((Object)j);
        final d l = this.I;
        final v.f m = c.k((Object)l);
        final d k2 = this.K;
        final v.f k3 = c.k((Object)k2);
        final d l2 = this.L;
        final v.f k4 = c.k((Object)l2);
        final e s = this.S;
        boolean b5 = false;
        boolean b6 = false;
        Label_0188: {
            Label_0164: {
                if (s != null) {
                    final int[] o0 = s.o0;
                    final boolean b2 = o0[0] == 2;
                    final boolean b3 = o0[1] == 2;
                    final int q = this.q;
                    if (q == 1) {
                        final boolean b4 = false;
                        b5 = b2;
                        b6 = b4;
                        break Label_0188;
                    }
                    if (q == 2) {
                        b6 = b3;
                        break Label_0164;
                    }
                    if (q != 3) {
                        final boolean b7 = b3;
                        b5 = b2;
                        b6 = b7;
                        break Label_0188;
                    }
                }
                b6 = false;
            }
            b5 = false;
        }
        final int f0 = this.f0;
        final boolean[] r = this.R;
        Label_0285: {
            if (f0 == 8) {
                final ArrayList q2 = this.Q;
                for (int size = q2.size(), n = 0; n < size; ++n) {
                    final HashSet a = ((d)q2.get(n)).a;
                    if (a != null) {
                        if (a.size() > 0) {
                            break Label_0285;
                        }
                    }
                }
                if (!r[0] && !r[1]) {
                    return;
                }
            }
        }
        final boolean k5 = this.k;
        if (k5 || this.l) {
            if (k5) {
                c.d(k, this.X);
                c.d(i, this.X + this.T);
                if (b5) {
                    final e s2 = this.S;
                    if (s2 != null) {
                        final f f2 = (f)s2;
                        final WeakReference g0 = f2.G0;
                        if (g0 == null || ((Reference)g0).get() == null || h.c() > ((d)((Reference)f2.G0).get()).c()) {
                            f2.G0 = new WeakReference((Object)h);
                        }
                        final WeakReference i2 = f2.I0;
                        if (i2 == null || ((Reference)i2).get() == null || j.c() > ((d)((Reference)f2.I0).get()).c()) {
                            f2.I0 = new WeakReference((Object)j);
                        }
                    }
                }
            }
            if (this.l) {
                c.d(m, this.Y);
                c.d(k3, this.Y + this.U);
                final HashSet a2 = l2.a;
                if (a2 != null) {
                    if (a2.size() > 0) {
                        c.d(k4, this.Y + this.Z);
                    }
                }
                if (b6) {
                    final e s3 = this.S;
                    if (s3 != null) {
                        final f f3 = (f)s3;
                        final WeakReference f4 = f3.F0;
                        if (f4 == null || ((Reference)f4).get() == null || l.c() > ((d)((Reference)f3.F0).get()).c()) {
                            f3.F0 = new WeakReference((Object)l);
                        }
                        final WeakReference h2 = f3.H0;
                        if (h2 == null || ((Reference)h2).get() == null || k2.c() > ((d)((Reference)f3.H0).get()).c()) {
                            f3.H0 = new WeakReference((Object)k2);
                        }
                    }
                }
            }
            if (this.k && this.l) {
                this.k = false;
                this.l = false;
                return;
            }
        }
        final boolean[] f5 = this.f;
        if (b) {
            final j d = this.d;
            if (d != null) {
                final l e = this.e;
                if (e != null) {
                    final y.e h3 = d.h;
                    if (h3.j && d.i.j && e.h.j && e.i.j) {
                        c.d(k, h3.g);
                        c.d(i, this.d.i.g);
                        c.d(m, this.e.h.g);
                        c.d(k3, this.e.i.g);
                        c.d(k4, this.e.k.g);
                        if (this.S != null) {
                            if (b5 && f5[0] && !this.v()) {
                                c.f(c.k((Object)this.S.J), i, 0, 8);
                            }
                            if (b6 && f5[1] && !this.w()) {
                                c.f(c.k((Object)this.S.K), k3, 0, 8);
                            }
                        }
                        this.k = false;
                        this.l = false;
                        return;
                    }
                }
            }
        }
        while (true) {
            int n3;
            int n4;
            if (this.S != null) {
                int v;
                if (this.u(0)) {
                    ((f)this.S).N(this, 0);
                    v = 1;
                }
                else {
                    v = (this.v() ? 1 : 0);
                }
                int w;
                if (this.u(1)) {
                    ((f)this.S).N(this, 1);
                    w = 1;
                }
                else {
                    w = (this.w() ? 1 : 0);
                }
                if (v == 0 && b5 && this.f0 != 8 && h.f == null && j.f == null) {
                    c.f(c.k((Object)this.S.J), i, 0, 1);
                }
                if (w == 0 && b6 && this.f0 != 8 && l.f == null && k2.f == null && l2 == null) {
                    c.f(c.k((Object)this.S.K), k3, 0, 1);
                }
                final int n2 = w;
                n3 = v;
                n4 = n2;
            }
            else {
                n4 = 0;
                n3 = 0;
            }
            final int t = this.T;
            int a3 = this.a0;
            if (t >= a3) {
                a3 = t;
            }
            final int u = this.U;
            int b8 = this.b0;
            if (u >= b8) {
                b8 = u;
            }
            final int[] o2 = this.o0;
            final int n5 = o2[0];
            final boolean b9 = n5 != 3;
            final int n6 = o2[1];
            final boolean b10 = n6 != 3;
            final int w2 = this.W;
            this.A = w2;
            final float v2 = this.V;
            this.B = v2;
            final int r2 = this.r;
            final int s4 = this.s;
            int n8 = 0;
            boolean b11 = false;
            int n9 = 0;
            Label_1802: {
                if (v2 > 0.0f) {
                    if (this.f0 != 8) {
                        int n7 = r2;
                        if (n5 == 3 && (n7 = r2) == 0) {
                            n7 = 3;
                        }
                        n8 = s4;
                        if (n6 == 3 && (n8 = s4) == 0) {
                            n8 = 3;
                        }
                        if (n5 == 3 && n6 == 3 && n7 == 3 && n8 == 3) {
                            if (w2 == -1) {
                                if (b9 && !b10) {
                                    this.A = 0;
                                }
                                else if (!b9 && b10) {
                                    this.A = 1;
                                    if (w2 == -1) {
                                        this.B = 1.0f / v2;
                                    }
                                }
                            }
                            if (this.A == 0 && (!l.f() || !k2.f())) {
                                this.A = 1;
                            }
                            else if (this.A == 1 && (!h.f() || !j.f())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!l.f() || !k2.f() || !h.f() || !j.f())) {
                                if (l.f() && k2.f()) {
                                    this.A = 0;
                                }
                                else if (h.f() && j.f()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                final int u2 = this.u;
                                if (u2 > 0 && this.x == 0) {
                                    this.A = 0;
                                }
                                else if (u2 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                        }
                        else if (n5 == 3 && n7 == 3) {
                            this.A = 0;
                            a3 = (int)(v2 * u);
                            if (n6 != 3) {
                                b11 = false;
                                n9 = 4;
                                break Label_1802;
                            }
                        }
                        else if (n6 == 3 && n8 == 3) {
                            this.A = 1;
                            if (w2 == -1) {
                                this.B = 1.0f / v2;
                            }
                            b8 = (int)(this.B * t);
                            n9 = n7;
                            if (n5 != 3) {
                                b11 = false;
                                n8 = 4;
                                break Label_1802;
                            }
                        }
                        n9 = n7;
                        b11 = true;
                        break Label_1802;
                    }
                }
                b11 = false;
                n9 = r2;
                n8 = s4;
            }
            final int[] t2 = this.t;
            t2[0] = n9;
            t2[1] = n8;
            boolean b12 = false;
            Label_1851: {
                if (b11) {
                    final int a4 = this.A;
                    if (a4 == 0 || a4 == -1) {
                        b12 = true;
                        break Label_1851;
                    }
                }
                b12 = false;
            }
            boolean b13 = false;
            Label_1883: {
                if (b11) {
                    final int a5 = this.A;
                    if (a5 == 1 || a5 == -1) {
                        b13 = true;
                        break Label_1883;
                    }
                }
                b13 = false;
            }
            final boolean b14 = o2[0] == 2 && this instanceof f;
            if (b14) {
                a3 = 0;
            }
            final d o3 = this.O;
            final boolean b15 = o3.f() ^ true;
            final boolean b16 = r[0];
            final boolean b17 = r[1];
            final int o4 = this.o;
            final int[] c2 = this.C;
            final v.f f6 = null;
            Label_2094: {
                if (o4 != 2 && !this.k) {
                    if (b) {
                        final j d2 = this.d;
                        if (d2 != null) {
                            final y.e h4 = d2.h;
                            if (h4.j && d2.i.j) {
                                if (!b) {
                                    break Label_2094;
                                }
                                c.d(k, h4.g);
                                c.d(i, this.d.i.g);
                                if (this.S != null && b5 && f5[0] && !this.v()) {
                                    c.f(c.k((Object)this.S.J), i, 0, 8);
                                }
                                break Label_2094;
                            }
                        }
                    }
                    final e s5 = this.S;
                    v.f k6;
                    if (s5 != null) {
                        k6 = c.k((Object)s5.J);
                    }
                    else {
                        k6 = null;
                    }
                    final e s6 = this.S;
                    v.f k7;
                    if (s6 != null) {
                        k7 = c.k((Object)s6.H);
                    }
                    else {
                        k7 = null;
                    }
                    this.d(c, true, b5, b6, f5[0], k7, k6, o2[0], b14, this.H, this.J, this.X, a3, this.a0, c2[0], this.c0, b12, o2[1] == 3, (boolean)(n3 != 0), (boolean)(n4 != 0), b16, n9, n8, this.u, this.v, this.w, b15);
                }
            }
            boolean b18 = false;
            Label_2446: {
                if (b) {
                    final l e2 = this.e;
                    if (e2 != null) {
                        final y.e h5 = e2.h;
                        if (h5.j && e2.i.j) {
                            c.d(m, h5.g);
                            c.d(k3, this.e.i.g);
                            c.d(k4, this.e.k.g);
                            final e s7 = this.S;
                            if (s7 != null && n4 == 0 && b6) {
                                if (f5[1]) {
                                    c.f(c.k((Object)s7.K), k3, 0, 8);
                                }
                            }
                            b18 = false;
                            break Label_2446;
                        }
                    }
                }
                b18 = true;
            }
            if (this.p == 2) {
                b18 = false;
            }
            if (b18 && !this.l) {
                final boolean b19 = o2[1] == 2 && this instanceof f;
                if (b19) {
                    b8 = 0;
                }
                final e s8 = this.S;
                v.f k8;
                if (s8 != null) {
                    k8 = c.k((Object)s8.K);
                }
                else {
                    k8 = null;
                }
                final e s9 = this.S;
                v.f k9 = f6;
                if (s9 != null) {
                    k9 = c.k((Object)s9.I);
                }
                final int z = this.Z;
                boolean b20 = false;
                Label_2685: {
                    if (z > 0 || this.f0 == 8) {
                        if (l2.f != null) {
                            c.e(k4, m, z, 8);
                            c.e(k4, c.k((Object)l2.f), l2.d(), 8);
                            if (b6) {
                                c.f(k8, c.k((Object)k2), 0, 5);
                            }
                            b20 = false;
                            break Label_2685;
                        }
                        if (this.f0 == 8) {
                            c.e(k4, m, l2.d(), 8);
                        }
                        else {
                            c.e(k4, m, z, 8);
                        }
                    }
                    b20 = b15;
                }
                this.d(c, false, b6, b5, f5[1], k9, k8, o2[1], b19, this.I, this.K, this.Y, b8, this.b0, c2[1], this.d0, b13, o2[0] == 3, (boolean)(n4 != 0), (boolean)(n3 != 0), b17, n8, n9, this.x, this.y, this.z, b20);
            }
            if (b11) {
                if (this.A == 1) {
                    final float b21 = this.B;
                    final b l3 = c.l();
                    l3.d.g(k3, -1.0f);
                    l3.d.g(m, 1.0f);
                    l3.d.g(i, b21);
                    l3.d.g(k, -b21);
                    c.c(l3);
                }
                else {
                    final float b22 = this.B;
                    final b l4 = c.l();
                    l4.d.g(i, -1.0f);
                    l4.d.g(k, 1.0f);
                    l4.d.g(k3, b22);
                    l4.d.g(m, -b22);
                    c.c(l4);
                }
            }
            if (o3.f()) {
                final e d3 = o3.f.d;
                final float n10 = (float)Math.toRadians((double)(this.D + 90.0f));
                final int d4 = o3.d();
                final v.f k10 = c.k((Object)this.g(2));
                final v.f k11 = c.k((Object)this.g(3));
                final v.f k12 = c.k((Object)this.g(4));
                final v.f k13 = c.k((Object)this.g(5));
                final v.f k14 = c.k((Object)d3.g(2));
                final v.f k15 = c.k((Object)d3.g(3));
                final v.f k16 = c.k((Object)d3.g(4));
                final v.f k17 = c.k((Object)d3.g(5));
                final b l5 = c.l();
                final double n11 = n10;
                final double sin = Math.sin(n11);
                final double n12 = d4;
                final float n13 = (float)(sin * n12);
                l5.d.g(k15, 0.5f);
                l5.d.g(k17, 0.5f);
                l5.d.g(k11, -0.5f);
                l5.d.g(k13, -0.5f);
                l5.b = -n13;
                c.c(l5);
                final b l6 = c.l();
                final float n14 = (float)(Math.cos(n11) * n12);
                l6.d.g(k14, 0.5f);
                l6.d.g(k16, 0.5f);
                l6.d.g(k10, -0.5f);
                l6.d.g(k12, -0.5f);
                l6.b = -n14;
                c.c(l6);
            }
            this.k = false;
            this.l = false;
            return;
            continue;
        }
    }
    
    public boolean c() {
        return this.f0 != 8;
    }
    
    public final void d(final v.c c, final boolean b, final boolean b2, final boolean b3, boolean b4, v.f f, final v.f f2, int n, final boolean b5, final d d, final d d2, int n2, int n3, final int n4, int n5, final float n6, final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10, int n7, int n8, int n9, int n10, final float n11, final boolean b11) {
        final v.f k = c.k((Object)d);
        final v.f i = c.k((Object)d2);
        final v.f j = c.k((Object)d.f);
        final v.f l = c.k((Object)d2.f);
        final int f3 = d.f() ? 1 : 0;
        final boolean f4 = d2.f();
        final boolean f5 = this.O.f();
        int n12;
        if (f4) {
            n12 = f3 + 1;
        }
        else {
            n12 = f3;
        }
        int n13 = n12;
        if (f5) {
            n13 = n12 + 1;
        }
        int n14;
        if (b6) {
            n14 = 3;
        }
        else {
            n14 = n7;
        }
        n = v.e.d(n);
        if (n != 0 && n != 1 && n == 2 && n14 != 4) {
            n = 1;
        }
        else {
            n = 0;
        }
        n7 = this.h;
        if (n7 != -1 && b) {
            this.h = -1;
            n3 = 0;
            n = n7;
        }
        else {
            n7 = n3;
            n3 = n;
            n = n7;
        }
        n7 = this.i;
        if (n7 != -1 && !b) {
            this.i = -1;
            n3 = n7;
            n = 0;
        }
        else {
            n7 = n3;
            n3 = n;
            n = n7;
        }
        if (this.f0 == 8) {
            n3 = 0;
            n = 0;
        }
        if (b11) {
            if (f3 == 0 && !f4 && !f5) {
                c.d(k, n2);
            }
            else if (f3 != 0 && !f4) {
                c.e(k, j, d.d(), 8);
            }
        }
        Label_0906: {
            if (n == 0) {
                if (b5) {
                    c.e(i, k, 0, 3);
                    if (n4 > 0) {
                        c.f(i, k, n4, 8);
                    }
                    n3 = n9;
                    n2 = n10;
                    if (n5 < Integer.MAX_VALUE) {
                        c.g(i, k, n5, 8);
                        n3 = n9;
                        n2 = n10;
                    }
                }
                else {
                    c.e(i, k, n3, 8);
                    n2 = n10;
                    n3 = n9;
                }
            }
            else {
                if (n13 != 2 && !b6 && (n14 == 1 || n14 == 0)) {
                    n2 = (n = Math.max(n9, n3));
                    if (n10 > 0) {
                        n = Math.min(n10, n2);
                    }
                    c.e(i, k, n, 8);
                    n = 0;
                    n5 = n10;
                    n10 = n;
                    break Label_0906;
                }
                if ((n2 = n9) == -2) {
                    n2 = n3;
                }
                if ((n5 = n10) == -2) {
                    n5 = n3;
                }
                if ((n7 = n3) > 0) {
                    n7 = n3;
                    if (n14 != 1) {
                        n7 = 0;
                    }
                }
                n3 = n7;
                if (n2 > 0) {
                    c.f(i, k, n2, 8);
                    n3 = Math.max(n7, n2);
                }
                n7 = n3;
                if (n5 > 0) {
                    if (!b2 || n14 != 1) {
                        c.g(i, k, n5, 8);
                    }
                    n7 = Math.min(n3, n5);
                }
                if (n14 == 1) {
                    if (b2) {
                        c.e(i, k, n7, 8);
                        n3 = n2;
                        n2 = n5;
                    }
                    else if (b8) {
                        c.e(i, k, n7, 5);
                        c.g(i, k, n7, 8);
                        n3 = n2;
                        n2 = n5;
                    }
                    else {
                        c.e(i, k, n7, 5);
                        c.g(i, k, n7, 8);
                        n3 = n2;
                        n2 = n5;
                    }
                }
                else {
                    if (n14 == 2) {
                        n3 = d.e;
                        v.f f6;
                        v.f f7;
                        if (n3 == 3 || n3 == 5) {
                            f6 = c.k((Object)this.S.g(3));
                            f7 = c.k((Object)this.S.g(5));
                        }
                        else {
                            f6 = c.k((Object)this.S.g(2));
                            f7 = c.k((Object)this.S.g(4));
                        }
                        final b m = c.l();
                        m.d.g(i, -1.0f);
                        m.d.g(k, 1.0f);
                        m.d.g(f7, n11);
                        m.d.g(f6, -n11);
                        c.c(m);
                        if (b2) {
                            n = 0;
                        }
                        n9 = n2;
                        n10 = n;
                        break Label_0906;
                    }
                    b4 = true;
                    n10 = n;
                    n9 = n2;
                    break Label_0906;
                }
            }
            n5 = n2;
            n9 = n3;
            n10 = n;
        }
        if (b11 && !b8) {
            boolean b12 = false;
            Label_2333: {
                while (true) {
                    Label_2320: {
                        if (f3 == 0 && !f4 && !f5) {
                            f = l;
                        }
                        else {
                            if (f3 != 0 && !f4) {
                                final e d3 = d.f.d;
                                if (b2 && d3 instanceof x.b) {
                                    n = 8;
                                }
                                else {
                                    n = 5;
                                }
                                f = i;
                                f = l;
                                b12 = b2;
                                break Label_2333;
                            }
                            if (f3 == 0 && f4) {
                                n = -d2.d();
                                c.e(i, l, n, 8);
                                if (b2) {
                                    c.f(k, f, 0, 5);
                                    f = l;
                                    break Label_2320;
                                }
                            }
                            else if (f3 != 0 && f4) {
                                final e d4 = d.f.d;
                                final e d5 = d2.f.d;
                                final e s = this.S;
                                final int n15 = 6;
                                int n17 = 0;
                            Label_1694:
                                while (true) {
                                    Label_1585: {
                                        if (n10 != 0) {
                                            Label_1248: {
                                                if (n14 == 0) {
                                                    if (n5 == 0 && n9 == 0) {
                                                        if (j.H && l.H) {
                                                            c.e(k, j, d.d(), 8);
                                                            c.e(i, l, -d2.d(), 8);
                                                            return;
                                                        }
                                                        n3 = 8;
                                                        n = 0;
                                                        n2 = 1;
                                                        n5 = 0;
                                                        n7 = 8;
                                                    }
                                                    else {
                                                        n3 = 5;
                                                        n = 1;
                                                        n2 = 0;
                                                        n5 = 1;
                                                        n7 = 5;
                                                    }
                                                    if (d4 instanceof x.b || d5 instanceof x.b) {
                                                        n7 = 4;
                                                    }
                                                    final int n16 = n5;
                                                    n8 = n3;
                                                    n5 = n7;
                                                    n7 = n2;
                                                    n3 = n16;
                                                    n2 = n;
                                                    n = n8;
                                                }
                                                else {
                                                    if (n14 == 2) {
                                                        if (!(d4 instanceof x.b) && !(d5 instanceof x.b)) {
                                                            n = 5;
                                                            n2 = 1;
                                                            n3 = 1;
                                                            n7 = 0;
                                                            n5 = 5;
                                                            break Label_1248;
                                                        }
                                                        n = 5;
                                                    }
                                                    else if (n14 == 1) {
                                                        n = 8;
                                                    }
                                                    else {
                                                        if (n14 == 3) {
                                                            if (this.A == -1) {
                                                                if (b9) {
                                                                    n = 8;
                                                                    if (b2) {
                                                                        n7 = 5;
                                                                    }
                                                                    else {
                                                                        n7 = 4;
                                                                    }
                                                                }
                                                                else {
                                                                    n = 8;
                                                                    n7 = 8;
                                                                }
                                                            }
                                                            else {
                                                                if (b6) {
                                                                    if (n8 != 2 && n8 != 1) {
                                                                        n = 8;
                                                                        n2 = 5;
                                                                    }
                                                                    else {
                                                                        n = 5;
                                                                        n2 = 4;
                                                                    }
                                                                    n5 = n2;
                                                                    n2 = 1;
                                                                    n3 = (n7 = 1);
                                                                    break Label_1248;
                                                                }
                                                                if (n5 > 0) {
                                                                    n7 = 6;
                                                                    n = 5;
                                                                }
                                                                else {
                                                                    if (n5 != 0 || n9 != 0) {
                                                                        n17 = 1;
                                                                        n3 = (n8 = 1);
                                                                        n = 5;
                                                                        break Label_1553;
                                                                    }
                                                                    if (!b9) {
                                                                        n17 = 1;
                                                                        n3 = (n8 = 1);
                                                                        n7 = 6;
                                                                        n = 5;
                                                                        n2 = 8;
                                                                        break Label_1694;
                                                                    }
                                                                    if (d4 != s && d5 != s) {
                                                                        n = 4;
                                                                    }
                                                                    else {
                                                                        n = 5;
                                                                    }
                                                                    n17 = 1;
                                                                    n3 = (n8 = 1);
                                                                    break Label_1553;
                                                                }
                                                            }
                                                            n8 = 1;
                                                            n3 = 1;
                                                            n17 = 1;
                                                            n2 = 5;
                                                            break Label_1694;
                                                        }
                                                        n17 = 0;
                                                        n3 = 0;
                                                        break Label_1585;
                                                    }
                                                    n2 = 1;
                                                    n3 = 1;
                                                    n7 = 0;
                                                    n5 = 4;
                                                }
                                            }
                                            final int n18 = 6;
                                            n17 = n2;
                                            n8 = n7;
                                            n7 = n18;
                                            n2 = n5;
                                            break Label_1694;
                                        }
                                        if (j.H && l.H) {
                                            c.b(k, j, d.d(), n6, l, i, d2.d(), 8);
                                            if (b2 && b4) {
                                                if (d2.f != null) {
                                                    n = d2.d();
                                                }
                                                else {
                                                    n = 0;
                                                }
                                                if (l != f2) {
                                                    c.f(f2, i, n, 5);
                                                }
                                            }
                                            return;
                                        }
                                        n17 = 1;
                                        n3 = 1;
                                        break Label_1585;
                                        n7 = 6;
                                        n2 = 4;
                                        break Label_1694;
                                    }
                                    n = 5;
                                    n8 = 0;
                                    continue;
                                }
                                if (n3 != 0 && j == l && d4 != s) {
                                    n3 = 0;
                                    n5 = 0;
                                }
                                else {
                                    n5 = 1;
                                }
                                if (n17 != 0) {
                                    if (n10 == 0 && !b7 && !b9 && j == f && l == f2) {
                                        b12 = false;
                                        n = 8;
                                        n5 = 0;
                                        n7 = 8;
                                    }
                                    else {
                                        b12 = b2;
                                    }
                                    c.b(k, j, d.d(), n6, l, i, d2.d(), n7);
                                }
                                else {
                                    b12 = b2;
                                }
                                Label_1855: {
                                    if (this.f0 == 8) {
                                        final HashSet a = d2.a;
                                        if (a != null) {
                                            if (a.size() > 0) {
                                                break Label_1855;
                                            }
                                        }
                                        return;
                                    }
                                }
                                final v.f f8 = l;
                                if (n3 != 0) {
                                    n3 = n;
                                    Label_1916: {
                                        if (b12) {
                                            n3 = n;
                                            if (j != f8) {
                                                n3 = n;
                                                if (n10 == 0) {
                                                    if (!(d4 instanceof x.b)) {
                                                        n3 = n;
                                                        if (!(d5 instanceof x.b)) {
                                                            break Label_1916;
                                                        }
                                                    }
                                                    n3 = 6;
                                                }
                                            }
                                        }
                                    }
                                    c.f(k, j, d.d(), n3);
                                    c.g(i, f8, -d2.d(), n3);
                                }
                                else {
                                    n3 = n;
                                }
                                final v.f f9 = i;
                                if (b12 && b10 && !(d4 instanceof x.b) && !(d5 instanceof x.b) && d5 != s) {
                                    n3 = 6;
                                    n = 6;
                                    n5 = 1;
                                }
                                else {
                                    n = n2;
                                }
                                if (n5 != 0) {
                                    n2 = n;
                                    Label_2123: {
                                        if (n8 != 0) {
                                            if (b9) {
                                                n2 = n;
                                                if (!b3) {
                                                    break Label_2123;
                                                }
                                            }
                                            n2 = n15;
                                            if (d4 != s) {
                                                if (d5 == s) {
                                                    n2 = n15;
                                                }
                                                else {
                                                    n2 = n;
                                                }
                                            }
                                            if (d4 instanceof g || d5 instanceof g) {
                                                n2 = 5;
                                            }
                                            if (d4 instanceof x.b || d5 instanceof x.b) {
                                                n2 = 5;
                                            }
                                            if (b9) {
                                                n2 = 5;
                                            }
                                            n2 = Math.max(n2, n);
                                        }
                                    }
                                    n = n2;
                                    Label_2179: {
                                        if (b12) {
                                            n2 = (n = Math.min(n3, n2));
                                            if (b6) {
                                                n = n2;
                                                if (!b9) {
                                                    if (d4 != s) {
                                                        n = n2;
                                                        if (d5 != s) {
                                                            break Label_2179;
                                                        }
                                                    }
                                                    n = 4;
                                                }
                                            }
                                        }
                                    }
                                    c.e(k, j, d.d(), n);
                                    c.e(f9, f8, -d2.d(), n);
                                }
                                if (b12) {
                                    if (f == j) {
                                        n = d.d();
                                    }
                                    else {
                                        n = 0;
                                    }
                                    if (j != f) {
                                        c.f(k, f, n, 5);
                                    }
                                }
                                if (b12 && n10 != 0 && n4 == 0 && n9 == 0) {
                                    if (n10 != 0 && n14 == 3) {
                                        c.f(f9, k, 0, 8);
                                    }
                                    else {
                                        c.f(f9, k, 0, 5);
                                    }
                                }
                                break Label_2306;
                            }
                            f = l;
                        }
                        f = l;
                        break Label_2320;
                        f = l;
                        f = i;
                        n = 5;
                        break Label_2333;
                    }
                    f = l;
                    f = i;
                    b12 = b2;
                    continue;
                }
            }
            if (b12 && b4) {
                if (d2.f != null) {
                    n2 = d2.d();
                }
                else {
                    n2 = 0;
                }
                if (l != f2) {
                    c.f(f2, i, n2, n);
                }
            }
            return;
        }
        if (n13 < 2 && b2 && b4) {
            c.f(k, f, 0, 8);
            final d l2 = this.L;
            if (!b && l2.f != null) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            n = n2;
            Label_2512: {
                if (!b) {
                    final d f10 = l2.f;
                    n = n2;
                    if (f10 != null) {
                        final e d6 = f10.d;
                        if (d6.V != 0.0f) {
                            final int[] o0 = d6.o0;
                            if (o0[0] == 3 && o0[1] == 3) {
                                n = 1;
                                break Label_2512;
                            }
                        }
                        n = 0;
                    }
                }
            }
            if (n != 0) {
                c.f(f2, i, 0, 8);
            }
        }
    }
    
    public final void e(final v.c c) {
        c.k((Object)this.H);
        c.k((Object)this.I);
        c.k((Object)this.J);
        c.k((Object)this.K);
        if (this.Z > 0) {
            c.k((Object)this.L);
        }
    }
    
    public final void f() {
        if (this.d == null) {
            final n d = new n(this);
            d.h.e = 4;
            d.i.e = 5;
            d.f = 0;
            this.d = (j)d;
        }
        if (this.e == null) {
            final n e = new n(this);
            final y.e k = new y.e(e);
            ((l)e).k = k;
            ((l)e).l = null;
            e.h.e = 6;
            e.i.e = 7;
            k.e = 8;
            e.f = 1;
            this.e = (l)e;
        }
    }
    
    public d g(final int n) {
        switch (v.e.d(n)) {
            default: {
                throw new AssertionError((Object)x.a.c(n));
            }
            case 8: {
                return this.N;
            }
            case 7: {
                return this.M;
            }
            case 6: {
                return this.O;
            }
            case 5: {
                return this.L;
            }
            case 4: {
                return this.K;
            }
            case 3: {
                return this.J;
            }
            case 2: {
                return this.I;
            }
            case 1: {
                return this.H;
            }
            case 0: {
                return null;
            }
        }
    }
    
    public final int h(final int n) {
        final int[] o0 = this.o0;
        if (n == 0) {
            return o0[0];
        }
        if (n == 1) {
            return o0[1];
        }
        return 0;
    }
    
    public final int i() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.U;
    }
    
    public final e j(final int n) {
        if (n == 0) {
            final d j = this.J;
            final d f = j.f;
            if (f != null && f.f == j) {
                return f.d;
            }
        }
        else if (n == 1) {
            final d k = this.K;
            final d f2 = k.f;
            if (f2 != null && f2.f == k) {
                return f2.d;
            }
        }
        return null;
    }
    
    public final e k(final int n) {
        if (n == 0) {
            final d h = this.H;
            final d f = h.f;
            if (f != null && f.f == h) {
                return f.d;
            }
        }
        else if (n == 1) {
            final d i = this.I;
            final d f2 = i.f;
            if (f2 != null && f2.f == i) {
                return f2.d;
            }
        }
        return null;
    }
    
    public void l(final StringBuilder sb) {
        final StringBuilder sb2 = new StringBuilder("  ");
        sb2.append(this.j);
        sb2.append(":{\n");
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.T);
        sb.append(sb3.toString());
        sb.append("\n");
        final StringBuilder sb4 = new StringBuilder("    actualHeight:");
        sb4.append(this.U);
        sb.append(sb4.toString());
        sb.append("\n");
        final StringBuilder sb5 = new StringBuilder("    actualLeft:");
        sb5.append(this.X);
        sb.append(sb5.toString());
        sb.append("\n");
        final StringBuilder sb6 = new StringBuilder("    actualTop:");
        sb6.append(this.Y);
        sb.append(sb6.toString());
        sb.append("\n");
        n(sb, "left", this.H);
        n(sb, "top", this.I);
        n(sb, "right", this.J);
        n(sb, "bottom", this.K);
        n(sb, "baseline", this.L);
        n(sb, "centerX", this.M);
        n(sb, "centerY", this.N);
        final int t = this.T;
        final int a0 = this.a0;
        final int[] c = this.C;
        final int n = c[0];
        final int u = this.u;
        final int r = this.r;
        final float w = this.w;
        final float[] j0 = this.j0;
        final float n2 = j0[0];
        m(sb, "    width", t, a0, n, u, r, w);
        final int u2 = this.U;
        final int b0 = this.b0;
        final int n3 = c[1];
        final int x = this.x;
        final int s = this.s;
        final float z = this.z;
        final float n4 = j0[1];
        m(sb, "    height", u2, b0, n3, x, s, z);
        final float v = this.V;
        final int w2 = this.W;
        if (v != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(v);
            sb.append(",");
            sb.append(w2);
            sb.append("");
            sb.append("],\n");
        }
        E(sb, "    horizontalBias", this.c0, 0.5f);
        E(sb, "    verticalBias", this.d0, 0.5f);
        D(this.h0, 0, "    horizontalChainStyle", sb);
        D(this.i0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }
    
    public final int o() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.T;
    }
    
    public final int p() {
        final e s = this.S;
        if (s != null && s instanceof f) {
            return ((f)s).w0 + this.X;
        }
        return this.X;
    }
    
    public final int q() {
        final e s = this.S;
        if (s != null && s instanceof f) {
            return ((f)s).x0 + this.Y;
        }
        return this.Y;
    }
    
    public final boolean r(int n) {
        boolean b = false;
        final boolean b2 = false;
        if (n == 0) {
            if (this.H.f != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (this.J.f != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            boolean b3 = b2;
            if (n + n2 < 2) {
                b3 = true;
            }
            return b3;
        }
        if (this.I.f != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n3;
        if (this.K.f != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.L.f != null) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        if (n + n3 + n4 < 2) {
            b = true;
        }
        return b;
    }
    
    public final boolean s(int n, final int n2) {
        final boolean b = true;
        boolean b2 = true;
        if (n == 0) {
            final d h = this.H;
            final d f = h.f;
            if (f != null && f.c) {
                final d j = this.J;
                final d f2 = j.f;
                if (f2 != null && f2.c) {
                    final int c = f2.c();
                    n = j.d();
                    if (c - n - (h.d() + h.f.c()) < n2) {
                        b2 = false;
                    }
                    return b2;
                }
            }
        }
        else {
            final d i = this.I;
            final d f3 = i.f;
            if (f3 != null && f3.c) {
                final d k = this.K;
                final d f4 = k.f;
                if (f4 != null && f4.c) {
                    final int c2 = f4.c();
                    n = k.d();
                    return c2 - n - (i.d() + i.f.c()) >= n2 && b;
                }
            }
        }
        return false;
    }
    
    public final void t(final int n, final int n2, final int n3, final int n4, final e e) {
        this.g(n).a(e.g(n2), n3, n4);
    }
    
    @Override
    public String toString() {
        String b = "";
        final StringBuilder b2 = v.e.b("");
        if (this.g0 != null) {
            b = x.a.b(new StringBuilder("id: "), this.g0, " ");
        }
        b2.append(b);
        b2.append("(");
        b2.append(this.X);
        b2.append(", ");
        b2.append(this.Y);
        b2.append(") - (");
        b2.append(this.T);
        b2.append(" x ");
        return x.a.a(b2, this.U, ")");
    }
    
    public final boolean u(int n) {
        n *= 2;
        final d[] p = this.P;
        final d d = p[n];
        final d f = d.f;
        if (f != null && f.f != d) {
            final boolean b = true;
            final d d2 = p[n + 1];
            final d f2 = d2.f;
            if (f2 != null && f2.f == d2) {
                return b;
            }
        }
        return false;
    }
    
    public final boolean v() {
        final d h = this.H;
        final d f = h.f;
        if (f == null || f.f != h) {
            final d j = this.J;
            final d f2 = j.f;
            if (f2 == null || f2.f != j) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean w() {
        final d i = this.I;
        final d f = i.f;
        if (f == null || f.f != i) {
            final d k = this.K;
            final d f2 = k.f;
            if (f2 == null || f2.f != k) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean x() {
        return this.g && this.f0 != 8;
    }
    
    public boolean y() {
        return this.k || (this.H.c && this.J.c);
    }
    
    public boolean z() {
        return this.l || (this.I.c && this.K.c);
    }
}

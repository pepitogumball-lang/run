package x;

import v.b;
import java.util.ArrayList;
import v.c;

public abstract class h
{
    public static final boolean[] a;
    
    static {
        a = new boolean[3];
    }
    
    public static void a(final f f, final c c, final ArrayList list, final int n) {
        int n2;
        x.c[] array;
        int n3;
        if (n == 0) {
            n2 = f.y0;
            array = f.B0;
            n3 = 0;
        }
        else {
            n2 = f.z0;
            array = f.A0;
            n3 = 2;
        }
        int n9;
        for (int i = 0; i < n2; i = n9 + 1) {
            final x.c c2 = array[i];
            final boolean q = c2.q;
            final e a = c2.a;
            final v.f f2 = null;
            if (!q) {
                final int l = c2.l;
                final int n4 = l * 2;
                e e2;
                e e = e2 = a;
                int j = 0;
            Label_0503_Outer:
                while (j == 0) {
                    ++c2.i;
                    e.l0[l] = null;
                    e.k0[l] = null;
                    final int f3 = e.f0;
                    final d[] p4 = e.P;
                    if (f3 != 8) {
                        e.h(l);
                        p4[n4].d();
                        final int n5 = n4 + 1;
                        p4[n5].d();
                        p4[n4].d();
                        p4[n5].d();
                        if (c2.b == null) {
                            c2.b = e;
                        }
                        c2.d = e;
                        final int n6 = e.o0[l];
                        if (n6 == 3) {
                            final int n7 = e.t[l];
                            if (n7 == 0 || n7 == 3 || n7 == 2) {
                                ++c2.j;
                                final float n8 = e.j0[l];
                                if (n8 > 0.0f) {
                                    c2.k += n8;
                                }
                                if (e.f0 != 8 && n6 == 3 && (n7 == 0 || n7 == 3)) {
                                    if (n8 < 0.0f) {
                                        c2.n = true;
                                    }
                                    else {
                                        c2.o = true;
                                    }
                                    if (c2.h == null) {
                                        c2.h = new ArrayList();
                                    }
                                    c2.h.add((Object)e);
                                }
                                if (c2.f == null) {
                                    c2.f = e;
                                }
                                final e g = c2.g;
                                if (g != null) {
                                    g.k0[l] = e;
                                }
                                c2.g = e;
                            }
                            if (l == 0) {
                                if (e.r == 0) {
                                    if (e.u == 0) {
                                        final int v = e.v;
                                    }
                                }
                            }
                            else if (e.s == 0) {
                                if (e.x == 0) {
                                    final int y = e.y;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (e2 != e) {
                            e2.l0[l] = e;
                        }
                        final d f4 = p4[n4 + 1].f;
                        e d = null;
                        Label_0581: {
                            if (f4 != null) {
                                d = f4.d;
                                final d f5 = d.P[n4].f;
                                if (f5 != null && f5.d == e) {
                                    break Label_0581;
                                }
                            }
                            d = null;
                        }
                        if (d == null) {
                            d = e;
                            j = 1;
                        }
                        final e e3 = e;
                        e = d;
                        e2 = e3;
                        continue Label_0503_Outer;
                        continue;
                    }
                }
                final e b = c2.b;
                if (b != null) {
                    b.P[n4].d();
                }
                final e d2 = c2.d;
                if (d2 != null) {
                    d2.P[n4 + 1].d();
                }
                c2.c = e;
                if (l == 0 && c2.m) {
                    c2.e = e;
                }
                else {
                    c2.e = a;
                }
                c2.p = (c2.o && c2.n);
            }
            c2.q = true;
            if (list != null && !list.contains((Object)a)) {
                n9 = i;
            }
            else {
                final e c3 = c2.c;
                final e b2 = c2.b;
                final e d3 = c2.d;
                final e e4 = c2.e;
                float k = c2.k;
                final boolean b3 = f.o0[n] == 2;
                int n13;
                int n14;
                int n15;
                if (n == 0) {
                    final int h0 = e4.h0;
                    int n10;
                    if (h0 == 0) {
                        n10 = 1;
                    }
                    else {
                        n10 = 0;
                    }
                    int n11;
                    if (h0 == 1) {
                        n11 = 1;
                    }
                    else {
                        n11 = 0;
                    }
                    int n12;
                    if (h0 == 2) {
                        n12 = 1;
                    }
                    else {
                        n12 = 0;
                    }
                    n13 = n10;
                    n14 = n11;
                    n15 = n12;
                }
                else {
                    final int i2 = e4.i0;
                    int n16;
                    if (i2 == 0) {
                        n16 = 1;
                    }
                    else {
                        n16 = 0;
                    }
                    int n17;
                    if (i2 == 1) {
                        n17 = 1;
                    }
                    else {
                        n17 = 0;
                    }
                    int n18;
                    if (i2 == 2) {
                        n18 = 1;
                    }
                    else {
                        n18 = 0;
                    }
                    n15 = n18;
                    n14 = n17;
                    n13 = n16;
                }
                e e5 = a;
                int n19 = 0;
                final x.c c4 = c2;
                final e e6 = a;
                d[] p5;
                while (true) {
                    p5 = f.P;
                    if (n19 != 0) {
                        break;
                    }
                    final d d4 = e5.P[n3];
                    int n20;
                    if (n15 != 0) {
                        n20 = 1;
                    }
                    else {
                        n20 = 4;
                    }
                    final int d5 = d4.d();
                    final int[] o0 = e5.o0;
                    final boolean b4 = o0[n] == 3 && e5.t[n] == 0;
                    final d f6 = d4.f;
                    int n21 = d5;
                    if (f6 != null) {
                        n21 = d5;
                        if (e5 != e6) {
                            n21 = f6.d() + d5;
                        }
                    }
                    if (n15 != 0 && e5 != e6 && e5 != b2) {
                        n20 = 8;
                    }
                    final d f7 = d4.f;
                    if (f7 != null) {
                        if (e5 == b2) {
                            c.f(d4.i, f7.i, n21, 6);
                        }
                        else {
                            c.f(d4.i, f7.i, n21, 8);
                        }
                        int n22 = n20;
                        if (b4) {
                            n22 = n20;
                            if (n15 == 0) {
                                n22 = 5;
                            }
                        }
                        int n23;
                        if (e5 == b2 && n15 != 0 && e5.R[n]) {
                            n23 = 5;
                        }
                        else {
                            n23 = n22;
                        }
                        c.e(d4.i, d4.f.i, n21, n23);
                    }
                    final d[] p6 = e5.P;
                    if (b3) {
                        if (e5.f0 != 8 && o0[n] == 3) {
                            c.f(p6[n3 + 1].i, p6[n3].i, 0, 5);
                        }
                        c.f(p6[n3].i, p5[n3].i, 0, 8);
                    }
                    final d f8 = p6[n3 + 1].f;
                    e d6 = null;
                    Label_1376: {
                        if (f8 != null) {
                            d6 = f8.d;
                            final d f9 = d6.P[n3].f;
                            if (f9 != null && f9.d == e5) {
                                break Label_1376;
                            }
                        }
                        d6 = null;
                    }
                    if (d6 != null) {
                        e5 = d6;
                    }
                    else {
                        n19 = 1;
                    }
                }
                final int n24 = n2;
                final x.c[] array2 = array;
                if (d3 != null) {
                    final d[] p7 = c3.P;
                    final int n25 = n3 + 1;
                    if (p7[n25].f != null) {
                        final d d7 = d3.P[n25];
                        Label_1549: {
                            if (d3.o0[n] == 3 && d3.t[n] == 0 && n15 == 0) {
                                final d f10 = d7.f;
                                if (f10.d == f) {
                                    c.e(d7.i, f10.i, -d7.d(), 5);
                                    break Label_1549;
                                }
                            }
                            if (n15 != 0) {
                                final d f11 = d7.f;
                                if (f11.d == f) {
                                    c.e(d7.i, f11.i, -d7.d(), 4);
                                }
                            }
                        }
                        c.g(d7.i, c3.P[n25].f.i, -d7.d(), 6);
                    }
                }
                if (b3) {
                    final int n26 = n3 + 1;
                    final v.f m = p5[n26].i;
                    final d d8 = c3.P[n26];
                    c.f(m, d8.i, d8.d(), 8);
                }
                final ArrayList h2 = c4.h;
                if (h2 != null) {
                    final int size = h2.size();
                    if (size > 1) {
                        if (c4.n && !c4.p) {
                            k = (float)c4.j;
                        }
                        e e7 = null;
                        float n27 = 0.0f;
                        float n29;
                        for (int n28 = 0; n28 < size; ++n28, n27 = n29) {
                            final e e8 = (e)h2.get(n28);
                            n29 = e8.j0[n];
                            final d[] p8 = e8.P;
                            Label_1815: {
                                if (n29 < 0.0f) {
                                    if (c4.p) {
                                        c.e(p8[n3 + 1].i, p8[n3].i, 0, 4);
                                        break Label_1815;
                                    }
                                    n29 = 1.0f;
                                }
                                final float n30 = fcmpl(n29, 0.0f);
                                if (n30 != 0) {
                                    if (e7 != null) {
                                        final d[] p9 = e7.P;
                                        final v.f i3 = p9[n3].i;
                                        final int n31 = n3 + 1;
                                        final v.f i4 = p9[n31].i;
                                        final v.f i5 = p8[n3].i;
                                        final v.f i6 = p8[n31].i;
                                        final b l2 = c.l();
                                        l2.b = 0.0f;
                                        if (k == 0.0f || n27 == n29) {
                                            l2.d.g(i3, 1.0f);
                                            l2.d.g(i4, -1.0f);
                                            l2.d.g(i6, 1.0f);
                                            l2.d.g(i5, -1.0f);
                                        }
                                        else if (n27 == 0.0f) {
                                            l2.d.g(i3, 1.0f);
                                            l2.d.g(i4, -1.0f);
                                        }
                                        else if (n30 == 0) {
                                            l2.d.g(i5, 1.0f);
                                            l2.d.g(i6, -1.0f);
                                        }
                                        else {
                                            final float n32 = n27 / k / (n29 / k);
                                            l2.d.g(i3, 1.0f);
                                            l2.d.g(i4, -1.0f);
                                            l2.d.g(i6, n32);
                                            l2.d.g(i5, -n32);
                                        }
                                        c.c(l2);
                                    }
                                    e7 = e8;
                                    continue;
                                }
                                c.e(p8[n3 + 1].i, p8[n3].i, 0, 8);
                            }
                            n29 = n27;
                        }
                    }
                }
                if (b2 != null && (b2 == d3 || n15 != 0)) {
                    final d d9 = e6.P[n3];
                    final d[] p10 = c3.P;
                    final int n33 = n3 + 1;
                    d d10 = p10[n33];
                    final d f12 = d9.f;
                    v.f i7;
                    if (f12 != null) {
                        i7 = f12.i;
                    }
                    else {
                        i7 = null;
                    }
                    final d f13 = d10.f;
                    v.f i8;
                    if (f13 != null) {
                        i8 = f13.i;
                    }
                    else {
                        i8 = null;
                    }
                    final d d11 = b2.P[n3];
                    if (d3 != null) {
                        d10 = d3.P[n33];
                    }
                    if (i7 != null && i8 != null) {
                        float n34;
                        if (n == 0) {
                            n34 = e4.c0;
                        }
                        else {
                            n34 = e4.d0;
                        }
                        c.b(d11.i, i7, d11.d(), n34, i8, d10.i, d10.d(), 7);
                    }
                }
                else {
                    final int n35 = i;
                    if (n13 != 0 && b2 != null) {
                        final int j2 = c4.j;
                        final boolean b5 = j2 > 0 && c4.i == j2;
                        e e10;
                        e e11;
                        for (e e9 = e10 = b2; e10 != null; e10 = e11) {
                            for (e11 = e10.l0[n]; e11 != null && e11.f0 == 8; e11 = e11.l0[n]) {}
                            if (e11 != null || e10 == d3) {
                                final d[] p11 = e10.P;
                                final d d12 = p11[n3];
                                final v.f i9 = d12.i;
                                final d f14 = d12.f;
                                v.f f15;
                                if (f14 != null) {
                                    f15 = f14.i;
                                }
                                else {
                                    f15 = null;
                                }
                                if (e9 != e10) {
                                    f15 = e9.P[n3 + 1].i;
                                }
                                else if (e10 == b2) {
                                    final d f16 = e6.P[n3].f;
                                    if (f16 != null) {
                                        f15 = f16.i;
                                    }
                                    else {
                                        f15 = null;
                                    }
                                }
                                final int d13 = d12.d();
                                final int n36 = n3 + 1;
                                final int d14 = p11[n36].d();
                                d f17;
                                v.f f18;
                                if (e11 != null) {
                                    f17 = e11.P[n3];
                                    f18 = f17.i;
                                }
                                else {
                                    f17 = c3.P[n36].f;
                                    if (f17 != null) {
                                        f18 = f17.i;
                                    }
                                    else {
                                        f18 = null;
                                    }
                                }
                                final v.f i10 = p11[n36].i;
                                int d15 = d14;
                                if (f17 != null) {
                                    d15 = f17.d() + d14;
                                }
                                int d16 = e9.P[n36].d() + d13;
                                if (i9 != null && f15 != null && f18 != null && i10 != null) {
                                    if (e10 == b2) {
                                        d16 = b2.P[n3].d();
                                    }
                                    if (e10 == d3) {
                                        d15 = d3.P[n36].d();
                                    }
                                    int n37;
                                    if (b5) {
                                        n37 = 8;
                                    }
                                    else {
                                        n37 = 5;
                                    }
                                    c.b(i9, f15, d16, 0.5f, f18, i10, d15, n37);
                                }
                            }
                            if (e10.f0 != 8) {
                                e9 = e10;
                            }
                        }
                    }
                    else {
                        final int n38 = 8;
                        if (n14 != 0 && b2 != null) {
                            final int j3 = c4.j;
                            final boolean b6 = j3 > 0 && c4.i == j3;
                            e e13;
                            e e12 = e13 = b2;
                            final int n39 = n35;
                            int n40 = n38;
                            while (e13 != null) {
                                e e14;
                                for (e14 = e13.l0[n]; e14 != null && e14.f0 == n40; e14 = e14.l0[n]) {}
                                if (e13 != b2 && e13 != d3 && e14 != null) {
                                    if (e14 == d3) {
                                        e14 = null;
                                    }
                                    final d[] p12 = e13.P;
                                    final d d17 = p12[n3];
                                    final v.f i11 = d17.i;
                                    final d[] p13 = e12.P;
                                    final int n41 = n3 + 1;
                                    final v.f i12 = p13[n41].i;
                                    final int d18 = d17.d();
                                    int d19 = p12[n41].d();
                                    d d20;
                                    v.f i13;
                                    v.f i14;
                                    if (e14 != null) {
                                        d20 = e14.P[n3];
                                        i13 = d20.i;
                                        final d f19 = d20.f;
                                        if (f19 != null) {
                                            i14 = f19.i;
                                        }
                                        else {
                                            i14 = null;
                                        }
                                    }
                                    else {
                                        d20 = d3.P[n3];
                                        v.f i15;
                                        if (d20 != null) {
                                            i15 = d20.i;
                                        }
                                        else {
                                            i15 = null;
                                        }
                                        final v.f i16 = p12[n41].i;
                                        i13 = i15;
                                        i14 = i16;
                                    }
                                    if (d20 != null) {
                                        d19 += d20.d();
                                    }
                                    final int d21 = e12.P[n41].d();
                                    int n42;
                                    if (b6) {
                                        n42 = 8;
                                    }
                                    else {
                                        n42 = 4;
                                    }
                                    if (i11 != null && i12 != null && i13 != null && i14 != null) {
                                        c.b(i11, i12, d21 + d18, 0.5f, i13, i14, d19, n42);
                                    }
                                    n40 = 8;
                                }
                                if (e13.f0 != n40) {
                                    e12 = e13;
                                }
                                e13 = e14;
                            }
                            final int n43 = n39;
                            final d d22 = b2.P[n3];
                            final d f20 = e6.P[n3].f;
                            final d[] p14 = d3.P;
                            final int n44 = n3 + 1;
                            final d d23 = p14[n44];
                            final d f21 = c3.P[n44].f;
                            if (f20 != null) {
                                if (b2 != d3) {
                                    c.e(d22.i, f20.i, d22.d(), 5);
                                }
                                else if (f21 != null) {
                                    c.b(d22.i, f20.i, d22.d(), 0.5f, d23.i, f21.i, d23.d(), 5);
                                }
                            }
                            i = n43;
                            if (f21 != null) {
                                i = n43;
                                if (b2 != d3) {
                                    c.e(d23.i, f21.i, -d23.d(), 5);
                                    i = n43;
                                }
                            }
                        }
                    }
                }
                if (n13 == 0) {
                    n9 = i;
                    n2 = n24;
                    array = array2;
                    if (n14 == 0) {
                        continue;
                    }
                }
                n9 = i;
                n2 = n24;
                array = array2;
                if (b2 != null) {
                    n9 = i;
                    n2 = n24;
                    array = array2;
                    if (b2 != d3) {
                        final d[] p15 = b2.P;
                        final d d24 = p15[n3];
                        e e15;
                        if (d3 == null) {
                            e15 = b2;
                        }
                        else {
                            e15 = d3;
                        }
                        final int n45 = n3 + 1;
                        final d[] p16 = e15.P;
                        d d25 = p16[n45];
                        final d f22 = d24.f;
                        v.f i17;
                        if (f22 != null) {
                            i17 = f22.i;
                        }
                        else {
                            i17 = null;
                        }
                        final d f23 = d25.f;
                        v.f i18;
                        if (f23 != null) {
                            i18 = f23.i;
                        }
                        else {
                            i18 = null;
                        }
                        v.f f24 = i18;
                        if (c3 != e15) {
                            final d f25 = c3.P[n45].f;
                            v.f i19 = f2;
                            if (f25 != null) {
                                i19 = f25.i;
                            }
                            f24 = i19;
                        }
                        if (b2 == e15) {
                            d25 = p15[n45];
                        }
                        n9 = i;
                        n2 = n24;
                        array = array2;
                        if (i17 != null) {
                            n9 = i;
                            n2 = n24;
                            array = array2;
                            if (f24 != null) {
                                c.b(d24.i, i17, d24.d(), 0.5f, f24, d25.i, p16[n45].d(), 5);
                                array = array2;
                                n2 = n24;
                                n9 = i;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void b(final f f, final c c, final e e) {
        e.o = -1;
        e.p = -1;
        final int n = f.o0[0];
        final int[] o0 = e.o0;
        if (n != 2 && o0[0] == 4) {
            final d h = e.H;
            final int g = h.g;
            final int o2 = f.o();
            final d j = e.J;
            final int n2 = o2 - j.g;
            h.i = c.k((Object)h);
            j.i = c.k((Object)j);
            c.d(h.i, g);
            c.d(j.i, n2);
            e.o = 2;
            e.X = g;
            final int t = n2 - g;
            e.T = t;
            final int a0 = e.a0;
            if (t < a0) {
                e.T = a0;
            }
        }
        if (f.o0[1] != 2 && o0[1] == 4) {
            final d i = e.I;
            final int g2 = i.g;
            final int k = f.i();
            final d l = e.K;
            final int n3 = k - l.g;
            i.i = c.k((Object)i);
            l.i = c.k((Object)l);
            c.d(i.i, g2);
            c.d(l.i, n3);
            if (e.Z > 0 || e.f0 == 8) {
                final d m = e.L;
                c.d(m.i = c.k((Object)m), e.Z + g2);
            }
            e.p = 2;
            e.Y = g2;
            final int u = n3 - g2;
            e.U = u;
            final int b0 = e.b0;
            if (u < b0) {
                e.U = b0;
            }
        }
    }
    
    public static final boolean c(final int n, final int n2) {
        return (n & n2) == n2;
    }
}

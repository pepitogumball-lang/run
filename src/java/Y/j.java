package y;

import x.b;
import java.util.ArrayList;
import v.e;

public final class j extends n
{
    public static final int[] k;
    
    static {
        k = new int[2];
    }
    
    public static void m(final int[] array, int n, int n2, int n3, int n4, final float n5, final int n6) {
        n = n2 - n;
        n2 = n4 - n3;
        if (n6 != -1) {
            if (n6 != 0) {
                if (n6 == 1) {
                    n2 = (int)(n * n5 + 0.5f);
                    array[0] = n;
                    array[1] = n2;
                }
            }
            else {
                array[0] = (int)(n2 * n5 + 0.5f);
                array[1] = n2;
            }
        }
        else {
            n3 = (int)(n2 * n5 + 0.5f);
            n4 = (int)(n / n5 + 0.5f);
            if (n3 <= n) {
                array[0] = n3;
                array[1] = n2;
            }
            else if (n4 <= n2) {
                array[0] = n;
                array[1] = n4;
            }
        }
    }
    
    @Override
    public final void a(final d d) {
        if (v.e.d(super.j) != 3) {
            final f e = super.e;
            final boolean j = e.j;
            final y.e h = super.h;
            final y.e i = super.i;
            Label_1337: {
                if (!j && super.d == 3) {
                    final x.e b = super.b;
                    final int r = b.r;
                    if (r != 2) {
                        if (r == 3) {
                            final int s = b.s;
                            if (s != 0 && s != 3) {
                                final int w = b.W;
                                int n2 = 0;
                                Label_0203: {
                                    float n = 0.0f;
                                    Label_0149: {
                                        float n3;
                                        float n4;
                                        if (w != -1) {
                                            if (w == 0) {
                                                n = b.e.e.g / b.V;
                                                break Label_0149;
                                            }
                                            if (w != 1) {
                                                n2 = 0;
                                                break Label_0203;
                                            }
                                            n3 = (float)b.e.e.g;
                                            n4 = b.V;
                                        }
                                        else {
                                            n3 = (float)b.e.e.g;
                                            n4 = b.V;
                                        }
                                        n = n3 * n4;
                                    }
                                    n2 = (int)(n + 0.5f);
                                }
                                e.d(n2);
                            }
                            else {
                                final l e2 = b.e;
                                final y.e h2 = e2.h;
                                final y.e k = e2.i;
                                final boolean b2 = b.H.f != null;
                                final boolean b3 = b.I.f != null;
                                final boolean b4 = b.J.f != null;
                                final boolean b5 = b.K.f != null;
                                final int w2 = b.W;
                                if (b2 && b3 && b4 && b5) {
                                    final float v = b.V;
                                    final boolean l = h2.j;
                                    final int[] m = y.j.k;
                                    if (l && k.j) {
                                        if (h.c) {
                                            if (i.c) {
                                                m(m, ((y.e)h.l.get(0)).g + h.f, ((y.e)i.l.get(0)).g - i.f, h2.g + h2.f, k.g - k.f, v, w2);
                                                e.d(m[0]);
                                                super.b.e.e.d(m[1]);
                                            }
                                        }
                                        return;
                                    }
                                    final boolean j2 = h.j;
                                    final ArrayList l2 = h2.l;
                                    if (j2 && i.j) {
                                        if (!h2.c || !k.c) {
                                            return;
                                        }
                                        m(m, h.g + h.f, i.g - i.f, ((y.e)l2.get(0)).g + h2.f, ((y.e)k.l.get(0)).g - k.f, v, w2);
                                        e.d(m[0]);
                                        super.b.e.e.d(m[1]);
                                    }
                                    if (!h.c || !i.c || !h2.c || !k.c) {
                                        return;
                                    }
                                    m(m, ((y.e)h.l.get(0)).g + h.f, ((y.e)i.l.get(0)).g - i.f, ((y.e)l2.get(0)).g + h2.f, ((y.e)k.l.get(0)).g - k.f, v, w2);
                                    e.d(m[0]);
                                    super.b.e.e.d(m[1]);
                                }
                                else if (b2 && b4) {
                                    if (!h.c || !i.c) {
                                        return;
                                    }
                                    final float v2 = b.V;
                                    final int n5 = ((y.e)h.l.get(0)).g + h.f;
                                    final int n6 = ((y.e)i.l.get(0)).g - i.f;
                                    if (w2 != -1 && w2 != 0) {
                                        if (w2 == 1) {
                                            int g = this.g(n6 - n5, 0);
                                            final int n7 = (int)(g / v2 + 0.5f);
                                            final int g2 = this.g(n7, 1);
                                            if (n7 != g2) {
                                                g = (int)(g2 * v2 + 0.5f);
                                            }
                                            e.d(g);
                                            super.b.e.e.d(g2);
                                        }
                                    }
                                    else {
                                        int g3 = this.g(n6 - n5, 0);
                                        final int n8 = (int)(g3 * v2 + 0.5f);
                                        final int g4 = this.g(n8, 1);
                                        if (n8 != g4) {
                                            g3 = (int)(g4 / v2 + 0.5f);
                                        }
                                        e.d(g3);
                                        super.b.e.e.d(g4);
                                    }
                                }
                                else if (b3 && b5) {
                                    if (!h2.c || !k.c) {
                                        return;
                                    }
                                    final float v3 = b.V;
                                    final int n9 = ((y.e)h2.l.get(0)).g + h2.f;
                                    final int n10 = ((y.e)k.l.get(0)).g - k.f;
                                    if (w2 != -1) {
                                        if (w2 == 0) {
                                            int g5 = this.g(n10 - n9, 1);
                                            final int n11 = (int)(g5 * v3 + 0.5f);
                                            final int g6 = this.g(n11, 0);
                                            if (n11 != g6) {
                                                g5 = (int)(g6 / v3 + 0.5f);
                                            }
                                            e.d(g6);
                                            super.b.e.e.d(g5);
                                            break Label_1337;
                                        }
                                        if (w2 != 1) {
                                            break Label_1337;
                                        }
                                    }
                                    int g7 = this.g(n10 - n9, 1);
                                    final int n12 = (int)(g7 / v3 + 0.5f);
                                    final int g8 = this.g(n12, 0);
                                    if (n12 != g8) {
                                        g7 = (int)(g8 * v3 + 0.5f);
                                    }
                                    e.d(g8);
                                    super.b.e.e.d(g7);
                                }
                            }
                        }
                    }
                    else {
                        final x.e s2 = b.S;
                        if (s2 != null) {
                            final f e3 = s2.d.e;
                            if (e3.j) {
                                e.d((int)(e3.g * b.w + 0.5f));
                            }
                        }
                    }
                }
            }
            if (h.c) {
                if (i.c) {
                    if (h.j && i.j && e.j) {
                        return;
                    }
                    if (!e.j && super.d == 3) {
                        final x.e b6 = super.b;
                        if (b6.r == 0 && !b6.v()) {
                            final y.e e4 = (y.e)h.l.get(0);
                            final y.e e5 = (y.e)i.l.get(0);
                            final int n13 = e4.g + h.f;
                            final int n14 = e5.g + i.f;
                            h.d(n13);
                            i.d(n14);
                            e.d(n14 - n13);
                            return;
                        }
                    }
                    if (!e.j && super.d == 3 && super.a == 1 && h.l.size() > 0 && i.l.size() > 0) {
                        final int min = Math.min(((y.e)i.l.get(0)).g + i.f - (((y.e)h.l.get(0)).g + h.f), e.m);
                        final x.e b7 = super.b;
                        final int v4 = b7.v;
                        int n15 = Math.max(b7.u, min);
                        if (v4 > 0) {
                            n15 = Math.min(v4, n15);
                        }
                        e.d(n15);
                    }
                    if (!e.j) {
                        return;
                    }
                    final y.e e6 = (y.e)h.l.get(0);
                    final y.e e7 = (y.e)i.l.get(0);
                    int g9 = e6.g;
                    final int f = h.f;
                    int g10 = e7.g;
                    final int f2 = i.f;
                    float c0 = super.b.c0;
                    if (e6 == e7) {
                        c0 = 0.5f;
                    }
                    else {
                        g9 += f;
                        g10 += f2;
                    }
                    h.d((int)((g10 - g9 - e.g) * c0 + (g9 + 0.5f)));
                    i.d(h.g + e.g);
                }
            }
            return;
        }
        final x.e b8 = super.b;
        this.l(b8.H, b8.J, 0);
    }
    
    @Override
    public final void d() {
        final x.e b = super.b;
        final boolean a = b.a;
        final f e = super.e;
        if (a) {
            e.d(b.o());
        }
        final boolean j = e.j;
        final y.e i = super.i;
        final y.e h = super.h;
        if (!j) {
            final x.e b2 = super.b;
            final int d = b2.o0[0];
            if ((super.d = d) != 3) {
                if (d == 4) {
                    final x.e s = b2.S;
                    if (s != null) {
                        final int n = s.o0[0];
                        if (n == 1 || n == 4) {
                            final int o = s.o();
                            final int d2 = super.b.H.d();
                            final int d3 = super.b.J.d();
                            y.n.b(h, s.d.h, super.b.H.d());
                            y.n.b(i, s.d.i, -super.b.J.d());
                            e.d(o - d2 - d3);
                            return;
                        }
                    }
                }
                if (d == 1) {
                    e.d(b2.o());
                }
            }
        }
        else if (super.d == 4) {
            final x.e b3 = super.b;
            final x.e s2 = b3.S;
            if (s2 != null) {
                final int n2 = s2.o0[0];
                if (n2 == 1 || n2 == 4) {
                    n.b(h, s2.d.h, b3.H.d());
                    n.b(i, s2.d.i, -super.b.J.d());
                    return;
                }
            }
        }
        if (e.j) {
            final x.e b4 = super.b;
            if (b4.a) {
                final x.d[] p = b4.P;
                final x.d d4 = p[0];
                final x.d f = d4.f;
                if (f != null && p[1].f != null) {
                    if (b4.v()) {
                        h.f = super.b.P[0].d();
                        i.f = -super.b.P[1].d();
                        return;
                    }
                    final y.e h2 = n.h(super.b.P[0]);
                    if (h2 != null) {
                        n.b(h, h2, super.b.P[0].d());
                    }
                    final y.e h3 = n.h(super.b.P[1]);
                    if (h3 != null) {
                        n.b(i, h3, -super.b.P[1].d());
                    }
                    h.b = true;
                    i.b = true;
                    return;
                }
                else if (f != null) {
                    final y.e h4 = n.h(d4);
                    if (h4 != null) {
                        n.b(h, h4, super.b.P[0].d());
                        n.b(i, h, e.g);
                    }
                    return;
                }
                else {
                    final x.d d5 = p[1];
                    if (d5.f != null) {
                        final y.e h5 = n.h(d5);
                        if (h5 != null) {
                            n.b(i, h5, -super.b.P[1].d());
                            n.b(h, i, -e.g);
                        }
                        return;
                    }
                    else {
                        if (!(b4 instanceof b) && b4.S != null && b4.g(7).f == null) {
                            final x.e b5 = super.b;
                            n.b(h, b5.S.d.h, b5.p());
                            n.b(i, h, e.g);
                        }
                        return;
                    }
                }
            }
        }
        if (super.d == 3) {
            final x.e b6 = super.b;
            final int r = b6.r;
            if (r != 2) {
                if (r == 3) {
                    if (b6.s == 3) {
                        h.a = this;
                        i.a = this;
                        final l e2 = b6.e;
                        e2.h.a = this;
                        e2.i.a = this;
                        e.a = this;
                        if (b6.w()) {
                            e.l.add((Object)super.b.e.e);
                            super.b.e.e.k.add((Object)e);
                            final l e3 = super.b.e;
                            e3.e.a = this;
                            e.l.add((Object)e3.h);
                            e.l.add((Object)super.b.e.i);
                            super.b.e.h.k.add((Object)e);
                            super.b.e.i.k.add((Object)e);
                        }
                        else if (super.b.v()) {
                            super.b.e.e.l.add((Object)e);
                            e.k.add((Object)super.b.e.e);
                        }
                        else {
                            super.b.e.e.l.add((Object)e);
                        }
                    }
                    else {
                        final f e4 = b6.e.e;
                        e.l.add((Object)e4);
                        e4.k.add((Object)e);
                        super.b.e.h.k.add((Object)e);
                        super.b.e.i.k.add((Object)e);
                        e.b = true;
                        e.k.add((Object)h);
                        e.k.add((Object)i);
                        h.l.add((Object)e);
                        i.l.add((Object)e);
                    }
                }
            }
            else {
                final x.e s3 = b6.S;
                if (s3 != null) {
                    final f e5 = s3.e.e;
                    e.l.add((Object)e5);
                    e5.k.add((Object)e);
                    e.b = true;
                    e.k.add((Object)h);
                    e.k.add((Object)i);
                }
            }
        }
        final x.e b7 = super.b;
        final x.d[] p2 = b7.P;
        final x.d d6 = p2[0];
        final x.d f2 = d6.f;
        if (f2 != null && p2[1].f != null) {
            if (b7.v()) {
                h.f = super.b.P[0].d();
                i.f = -super.b.P[1].d();
            }
            else {
                final y.e h6 = n.h(super.b.P[0]);
                final y.e h7 = n.h(super.b.P[1]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                super.j = 4;
            }
        }
        else if (f2 != null) {
            final y.e h8 = n.h(d6);
            if (h8 != null) {
                n.b(h, h8, super.b.P[0].d());
                this.c(i, h, 1, e);
            }
        }
        else {
            final x.d d7 = p2[1];
            if (d7.f != null) {
                final y.e h9 = n.h(d7);
                if (h9 != null) {
                    n.b(i, h9, -super.b.P[1].d());
                    this.c(h, i, -1, e);
                }
            }
            else if (!(b7 instanceof b)) {
                final x.e s4 = b7.S;
                if (s4 != null) {
                    n.b(h, s4.d.h, b7.p());
                    this.c(i, h, 1, e);
                }
            }
        }
    }
    
    @Override
    public final void e() {
        final y.e h = super.h;
        if (h.j) {
            super.b.X = h.g;
        }
    }
    
    @Override
    public final void f() {
        super.c = null;
        super.h.c();
        super.i.c();
        super.e.c();
        super.g = false;
    }
    
    @Override
    public final boolean k() {
        return super.d != 3 || super.b.r == 0;
    }
    
    public final void n() {
        super.g = false;
        final y.e h = super.h;
        h.c();
        h.j = false;
        final y.e i = super.i;
        i.c();
        i.j = false;
        super.e.j = false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("HorizontalRun ");
        sb.append(super.b.g0);
        return sb.toString();
    }
}

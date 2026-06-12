package y;

import x.b;

public final class l extends n
{
    public e k;
    public a l;
    
    @Override
    public final void a(final d d) {
        if (v.e.d(super.j) != 3) {
            final f e = super.e;
            if (e.c && !e.j && super.d == 3) {
                final x.e b = super.b;
                final int s = b.s;
                if (s != 2) {
                    if (s == 3) {
                        final f e2 = b.d.e;
                        if (e2.j) {
                            final int w = b.W;
                            int n2 = 0;
                            Label_0173: {
                                float n = 0.0f;
                                Label_0131: {
                                    float n3;
                                    float n4;
                                    if (w != -1) {
                                        if (w == 0) {
                                            n = e2.g * b.V;
                                            break Label_0131;
                                        }
                                        if (w != 1) {
                                            n2 = 0;
                                            break Label_0173;
                                        }
                                        n3 = (float)e2.g;
                                        n4 = b.V;
                                    }
                                    else {
                                        n3 = (float)e2.g;
                                        n4 = b.V;
                                    }
                                    n = n3 / n4;
                                }
                                n2 = (int)(n + 0.5f);
                            }
                            e.d(n2);
                        }
                    }
                }
                else {
                    final x.e s2 = b.S;
                    if (s2 != null) {
                        final f e3 = s2.e.e;
                        if (e3.j) {
                            e.d((int)(e3.g * b.z + 0.5f));
                        }
                    }
                }
            }
            final e h = super.h;
            if (h.c) {
                final e i = super.i;
                if (i.c) {
                    if (h.j && i.j && e.j) {
                        return;
                    }
                    if (!e.j && super.d == 3) {
                        final x.e b2 = super.b;
                        if (b2.r == 0 && !b2.w()) {
                            final e e4 = (e)h.l.get(0);
                            final e e5 = (e)i.l.get(0);
                            final int n5 = e4.g + h.f;
                            final int n6 = e5.g + i.f;
                            h.d(n5);
                            i.d(n6);
                            e.d(n6 - n5);
                            return;
                        }
                    }
                    if (!e.j && super.d == 3 && super.a == 1 && h.l.size() > 0 && i.l.size() > 0) {
                        final int n7 = ((e)i.l.get(0)).g + i.f - (((e)h.l.get(0)).g + h.f);
                        final int m = e.m;
                        if (n7 < m) {
                            e.d(n7);
                        }
                        else {
                            e.d(m);
                        }
                    }
                    if (!e.j) {
                        return;
                    }
                    if (h.l.size() > 0 && i.l.size() > 0) {
                        final e e6 = (e)h.l.get(0);
                        final e e7 = (e)i.l.get(0);
                        int g = e6.g;
                        final int f = h.f;
                        int g2 = e7.g;
                        final int f2 = i.f;
                        float d2 = super.b.d0;
                        if (e6 == e7) {
                            d2 = 0.5f;
                        }
                        else {
                            g += f;
                            g2 += f2;
                        }
                        h.d((int)((g2 - g - e.g) * d2 + (g + 0.5f)));
                        i.d(h.g + e.g);
                    }
                }
            }
            return;
        }
        final x.e b3 = super.b;
        this.l(b3.I, b3.K, 1);
    }
    
    @Override
    public final void d() {
        final x.e b = super.b;
        final boolean a = b.a;
        final f e = super.e;
        if (a) {
            e.d(b.i());
        }
        final boolean j = e.j;
        final e i = super.i;
        final e h = super.h;
        if (!j) {
            final x.e b2 = super.b;
            super.d = b2.o0[1];
            if (b2.E) {
                this.l = (a)new f(this);
            }
            final int d = super.d;
            if (d != 3) {
                if (d == 4) {
                    final x.e s = super.b.S;
                    if (s != null && s.o0[1] == 1) {
                        final int k = s.i();
                        final int d2 = super.b.I.d();
                        final int d3 = super.b.K.d();
                        n.b(h, s.e.h, super.b.I.d());
                        n.b(i, s.e.i, -super.b.K.d());
                        e.d(k - d2 - d3);
                        return;
                    }
                }
                if (d == 1) {
                    e.d(super.b.i());
                }
            }
        }
        else if (super.d == 4) {
            final x.e b3 = super.b;
            final x.e s2 = b3.S;
            if (s2 != null && s2.o0[1] == 1) {
                n.b(h, s2.e.h, b3.I.d());
                n.b(i, s2.e.i, -super.b.K.d());
                return;
            }
        }
        final boolean l = e.j;
        final e m = this.k;
        if (l) {
            final x.e b4 = super.b;
            if (b4.a) {
                final x.d[] p = b4.P;
                final x.d d4 = p[2];
                final x.d f = d4.f;
                if (f != null && p[3].f != null) {
                    if (b4.w()) {
                        h.f = super.b.P[2].d();
                        i.f = -super.b.P[3].d();
                    }
                    else {
                        final e h2 = n.h(super.b.P[2]);
                        if (h2 != null) {
                            n.b(h, h2, super.b.P[2].d());
                        }
                        final e h3 = n.h(super.b.P[3]);
                        if (h3 != null) {
                            n.b(i, h3, -super.b.P[3].d());
                        }
                        h.b = true;
                        i.b = true;
                    }
                    final x.e b5 = super.b;
                    if (b5.E) {
                        n.b(m, h, b5.Z);
                    }
                    return;
                }
                else if (f != null) {
                    final e h4 = n.h(d4);
                    if (h4 == null) {
                        return;
                    }
                    n.b(h, h4, super.b.P[2].d());
                    n.b(i, h, e.g);
                    final x.e b6 = super.b;
                    if (b6.E) {
                        n.b(m, h, b6.Z);
                    }
                    return;
                }
                else {
                    final x.d d5 = p[3];
                    if (d5.f != null) {
                        final e h5 = n.h(d5);
                        if (h5 != null) {
                            n.b(i, h5, -super.b.P[3].d());
                            n.b(h, i, -e.g);
                        }
                        final x.e b7 = super.b;
                        if (b7.E) {
                            n.b(m, h, b7.Z);
                        }
                        return;
                    }
                    else {
                        final x.d d6 = p[4];
                        if (d6.f != null) {
                            final e h6 = n.h(d6);
                            if (h6 != null) {
                                n.b(m, h6, 0);
                                n.b(h, m, -super.b.Z);
                                n.b(i, h, e.g);
                            }
                            return;
                        }
                        else {
                            if (b4 instanceof b || b4.S == null || b4.g(7).f != null) {
                                return;
                            }
                            final x.e b8 = super.b;
                            n.b(h, b8.S.e.h, b8.q());
                            n.b(i, h, e.g);
                            final x.e b9 = super.b;
                            if (b9.E) {
                                n.b(m, h, b9.Z);
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (!l && super.d == 3) {
            final x.e b10 = super.b;
            final int s3 = b10.s;
            if (s3 != 2) {
                if (s3 == 3) {
                    if (!b10.w()) {
                        final x.e b11 = super.b;
                        if (b11.r != 3) {
                            final f e2 = b11.d.e;
                            e.l.add((Object)e2);
                            e2.k.add((Object)e);
                            e.b = true;
                            e.k.add((Object)h);
                            e.k.add((Object)i);
                        }
                    }
                }
            }
            else {
                final x.e s4 = b10.S;
                if (s4 != null) {
                    final f e3 = s4.e.e;
                    e.l.add((Object)e3);
                    e3.k.add((Object)e);
                    e.b = true;
                    e.k.add((Object)h);
                    e.k.add((Object)i);
                }
            }
        }
        else {
            e.b(this);
        }
        final x.e b12 = super.b;
        final x.d[] p2 = b12.P;
        final x.d d7 = p2[2];
        final x.d f2 = d7.f;
        if (f2 != null && p2[3].f != null) {
            if (b12.w()) {
                h.f = super.b.P[2].d();
                i.f = -super.b.P[3].d();
            }
            else {
                final e h7 = n.h(super.b.P[2]);
                final e h8 = n.h(super.b.P[3]);
                if (h7 != null) {
                    h7.b(this);
                }
                if (h8 != null) {
                    h8.b(this);
                }
                super.j = 4;
            }
            if (super.b.E) {
                this.c(m, h, 1, this.l);
            }
        }
        else if (f2 != null) {
            final e h9 = n.h(d7);
            if (h9 != null) {
                n.b(h, h9, super.b.P[2].d());
                this.c(i, h, 1, e);
                if (super.b.E) {
                    this.c(m, h, 1, this.l);
                }
                if (super.d == 3) {
                    final x.e b13 = super.b;
                    if (b13.V > 0.0f) {
                        final j d8 = b13.d;
                        if (d8.d == 3) {
                            d8.e.k.add((Object)e);
                            e.l.add((Object)super.b.d.e);
                            e.a = this;
                        }
                    }
                }
            }
        }
        else {
            final x.d d9 = p2[3];
            if (d9.f != null) {
                final e h10 = n.h(d9);
                if (h10 != null) {
                    n.b(i, h10, -super.b.P[3].d());
                    this.c(h, i, -1, e);
                    if (super.b.E) {
                        this.c(m, h, 1, this.l);
                    }
                }
            }
            else {
                final x.d d10 = p2[4];
                if (d10.f != null) {
                    final e h11 = n.h(d10);
                    if (h11 != null) {
                        n.b(m, h11, 0);
                        this.c(h, m, -1, this.l);
                        this.c(i, h, 1, e);
                    }
                }
                else if (!(b12 instanceof b)) {
                    final x.e s5 = b12.S;
                    if (s5 != null) {
                        n.b(h, s5.e.h, b12.q());
                        this.c(i, h, 1, e);
                        if (super.b.E) {
                            this.c(m, h, 1, this.l);
                        }
                        if (super.d == 3) {
                            final x.e b14 = super.b;
                            if (b14.V > 0.0f) {
                                final j d11 = b14.d;
                                if (d11.d == 3) {
                                    d11.e.k.add((Object)e);
                                    e.l.add((Object)super.b.d.e);
                                    e.a = this;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (e.l.size() == 0) {
            e.c = true;
        }
    }
    
    @Override
    public final void e() {
        final e h = super.h;
        if (h.j) {
            super.b.Y = h.g;
        }
    }
    
    @Override
    public final void f() {
        super.c = null;
        super.h.c();
        super.i.c();
        this.k.c();
        super.e.c();
        super.g = false;
    }
    
    @Override
    public final boolean k() {
        return super.d != 3 || super.b.s == 0;
    }
    
    public final void m() {
        super.g = false;
        final e h = super.h;
        h.c();
        h.j = false;
        final e i = super.i;
        i.c();
        i.j = false;
        final e k = this.k;
        k.c();
        k.j = false;
        super.e.j = false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VerticalRun ");
        sb.append(super.b.g0);
        return sb.toString();
    }
}

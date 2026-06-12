package y;

import x.e;

public abstract class n implements d
{
    public int a;
    public e b;
    public k c;
    public int d;
    public final f e;
    public int f;
    public boolean g;
    public final y.e h;
    public final y.e i;
    public int j;
    
    public n(final e b) {
        this.e = new f(this);
        this.f = 0;
        this.g = false;
        this.h = new y.e(this);
        this.i = new y.e(this);
        this.j = 1;
        this.b = b;
    }
    
    public static void b(final y.e e, final y.e e2, final int f) {
        e.l.add((Object)e2);
        e.f = f;
        e2.k.add((Object)e);
    }
    
    public static y.e h(final x.d d) {
        final x.d f = d.f;
        y.e e = null;
        if (f == null) {
            return null;
        }
        final int d2 = v.e.d(f.e);
        final e d3 = f.d;
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        if (d2 == 5) {
                            e = d3.e.k;
                        }
                    }
                    else {
                        e = d3.e.i;
                    }
                }
                else {
                    e = d3.d.i;
                }
            }
            else {
                e = d3.e.h;
            }
        }
        else {
            e = d3.d.h;
        }
        return e;
    }
    
    public static y.e i(final x.d d, int d2) {
        final x.d f = d.f;
        final y.e e = null;
        if (f == null) {
            return null;
        }
        final e d3 = f.d;
        n n;
        if (d2 == 0) {
            n = d3.d;
        }
        else {
            n = d3.e;
        }
        d2 = v.e.d(f.e);
        y.e e2;
        if (d2 != 1 && d2 != 2) {
            if (d2 != 3 && d2 != 4) {
                e2 = e;
            }
            else {
                e2 = n.i;
            }
        }
        else {
            e2 = n.h;
        }
        return e2;
    }
    
    public final void c(final y.e e, final y.e e2, final int h, final f i) {
        e.l.add((Object)e2);
        e.l.add((Object)this.e);
        e.h = h;
        e.i = i;
        e2.k.add((Object)e);
        i.k.add((Object)e);
    }
    
    public abstract void d();
    
    public abstract void e();
    
    public abstract void f();
    
    public final int g(final int n, int n2) {
        if (n2 == 0) {
            final e b = this.b;
            final int v = b.v;
            n2 = Math.max(b.u, n);
            if (v > 0) {
                n2 = Math.min(v, n);
            }
            final int n3;
            if (n2 == (n3 = n)) {
                return n3;
            }
        }
        else {
            final e b2 = this.b;
            final int y = b2.y;
            n2 = Math.max(b2.x, n);
            if (y > 0) {
                n2 = Math.min(y, n);
            }
            final int n3;
            if (n2 == (n3 = n)) {
                return n3;
            }
        }
        return n2;
    }
    
    public long j() {
        final f e = this.e;
        if (e.j) {
            return e.g;
        }
        return 0L;
    }
    
    public abstract boolean k();
    
    public final void l(final x.d d, final x.d d2, int g) {
        final y.e h = h(d);
        final y.e h2 = h(d2);
        if (h.j) {
            if (h2.j) {
                final int n = d.d() + h.g;
                final int n2 = h2.g - d2.d();
                final int n3 = n2 - n;
                final f e = this.e;
                Label_0370: {
                    if (!e.j && this.d == 3) {
                        final int a = this.a;
                        if (a != 0) {
                            if (a != 1) {
                                if (a != 2) {
                                    if (a == 3) {
                                        final e b = this.b;
                                        n n4 = b.d;
                                        if (n4.d == 3 && n4.a == 3) {
                                            final l e2 = b.e;
                                            if (e2.d == 3 && e2.a == 3) {
                                                break Label_0370;
                                            }
                                        }
                                        if (g == 0) {
                                            n4 = b.e;
                                        }
                                        final f e3 = n4.e;
                                        if (e3.j) {
                                            final float v = b.V;
                                            int n5;
                                            if (g == 1) {
                                                n5 = (int)(e3.g / v + 0.5f);
                                            }
                                            else {
                                                n5 = (int)(v * e3.g + 0.5f);
                                            }
                                            e.d(n5);
                                        }
                                    }
                                }
                                else {
                                    final e b2 = this.b;
                                    final e s = b2.S;
                                    if (s != null) {
                                        n n6;
                                        if (g == 0) {
                                            n6 = s.d;
                                        }
                                        else {
                                            n6 = s.e;
                                        }
                                        final f e4 = n6.e;
                                        if (e4.j) {
                                            float n7;
                                            if (g == 0) {
                                                n7 = b2.w;
                                            }
                                            else {
                                                n7 = b2.z;
                                            }
                                            e.d(this.g((int)(e4.g * n7 + 0.5f), g));
                                        }
                                    }
                                }
                            }
                            else {
                                e.d(Math.min(this.g(e.m, g), n3));
                            }
                        }
                        else {
                            e.d(this.g(n3, g));
                        }
                    }
                }
                if (!e.j) {
                    return;
                }
                final int g2 = e.g;
                final y.e i = this.i;
                final y.e h3 = this.h;
                if (g2 == n3) {
                    h3.d(n);
                    i.d(n2);
                    return;
                }
                final e b3 = this.b;
                float n8;
                if (g == 0) {
                    n8 = b3.c0;
                }
                else {
                    n8 = b3.d0;
                }
                int g3 = n2;
                g = n;
                if (h == h2) {
                    g = h.g;
                    g3 = h2.g;
                    n8 = 0.5f;
                }
                h3.d((int)((g3 - g - g2) * n8 + (g + 0.5f)));
                i.d(h3.g + e.g);
            }
        }
    }
}

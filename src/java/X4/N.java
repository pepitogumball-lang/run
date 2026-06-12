package X4;

import Z.b;
import com.google.android.gms.internal.auth.h;
import f5.a;
import z5.d;

public final class n implements d
{
    public final int C;
    public final d D;
    public final Z.d E;
    
    public final Object a(Object o, final e5.d d) {
        switch (this.C) {
            default: {
                A a2 = null;
                Label_0083: {
                    if (d instanceof A) {
                        final A a = (A)d;
                        final int g = a.G;
                        if ((g & Integer.MIN_VALUE) != 0x0) {
                            a.G = g + Integer.MIN_VALUE;
                            a2 = a;
                            break Label_0083;
                        }
                    }
                    a2 = new A(this, d);
                }
                final Object f = a2.F;
                final a c = a.C;
                final int g2 = a2.G;
                if (g2 != 0) {
                    if (g2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.z(f);
                }
                else {
                    h.z(f);
                    o = ((b)o).b(this.E);
                    a2.G = 1;
                    if (this.D.a(o, (e5.d)a2) == c) {
                        return c;
                    }
                }
                return c5.h.a;
            }
            case 2: {
                y y2 = null;
                Label_0227: {
                    if (d instanceof y) {
                        final y y = (y)d;
                        final int g3 = y.G;
                        if ((g3 & Integer.MIN_VALUE) != 0x0) {
                            y.G = g3 + Integer.MIN_VALUE;
                            y2 = y;
                            break Label_0227;
                        }
                    }
                    y2 = new y(this, d);
                }
                final Object f2 = y2.F;
                final a c2 = a.C;
                final int g4 = y2.G;
                if (g4 != 0) {
                    if (g4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.z(f2);
                }
                else {
                    h.z(f2);
                    o = ((b)o).b(this.E);
                    y2.G = 1;
                    if (this.D.a(o, (e5.d)y2) == c2) {
                        return c2;
                    }
                }
                return c5.h.a;
            }
            case 1: {
                t t2 = null;
                Label_0371: {
                    if (d instanceof t) {
                        final t t = (t)d;
                        final int g5 = t.G;
                        if ((g5 & Integer.MIN_VALUE) != 0x0) {
                            t.G = g5 + Integer.MIN_VALUE;
                            t2 = t;
                            break Label_0371;
                        }
                    }
                    t2 = new t(this, d);
                }
                final Object f3 = t2.F;
                final a c3 = a.C;
                final int g6 = t2.G;
                if (g6 != 0) {
                    if (g6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.z(f3);
                }
                else {
                    h.z(f3);
                    o = ((b)o).b(this.E);
                    t2.G = 1;
                    if (this.D.a(o, (e5.d)t2) == c3) {
                        return c3;
                    }
                }
                return c5.h.a;
            }
            case 0: {
                m i = null;
                Label_0515: {
                    if (d instanceof m) {
                        final m m = (m)d;
                        final int g7 = m.G;
                        if ((g7 & Integer.MIN_VALUE) != 0x0) {
                            m.G = g7 + Integer.MIN_VALUE;
                            i = m;
                            break Label_0515;
                        }
                    }
                    i = new m(this, d);
                }
                final Object f4 = i.F;
                final a c4 = a.C;
                final int g8 = i.G;
                if (g8 != 0) {
                    if (g8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h.z(f4);
                }
                else {
                    h.z(f4);
                    o = ((b)o).b(this.E);
                    i.G = 1;
                    if (this.D.a(o, (e5.d)i) == c4) {
                        return c4;
                    }
                }
                return c5.h.a;
            }
        }
    }
}

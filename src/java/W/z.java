package W;

import E5.d;
import m5.p;
import com.google.android.gms.internal.auth.h;
import g5.c;
import n5.o;
import n5.n;
import E5.a;

public final class z
{
    public final a a;
    public final n b;
    public final o c;
    public final H d;
    
    public z(final a a, final n b, final o c, final H d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(g g, c o) {
        Object o2 = null;
        Label_0049: {
            if (o instanceof y) {
                o2 = o;
                final int m = ((y)o2).M;
                if ((m & Integer.MIN_VALUE) != 0x0) {
                    ((y)o2).M = m + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o2 = new y(this, (c)o);
        }
        Object o3 = ((y)o2).K;
        final f5.a c = f5.a.C;
        final int i = ((y)o2).M;
        Label_0555: {
            Label_0415: {
                H j;
                o o7;
                n b;
                Object o8;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                final Object h = ((y)o2).H;
                                final Object o4 = ((y)o2).G;
                                g = (g)((y)o2).F;
                                try {
                                    com.google.android.gms.internal.auth.h.z(o3);
                                    o3 = h;
                                    break Label_0415;
                                }
                                finally {
                                    break Label_0555;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final H h2 = (H)((y)o2).H;
                        final o o5 = (o)((y)o2).G;
                        final Object o6 = ((y)o2).F;
                        try {
                            h.z(o3);
                            break Label_0415;
                        }
                        finally {
                            g = (g)o6;
                            break Label_0555;
                        }
                    }
                    j = ((y)o2).J;
                    o7 = ((y)o2).I;
                    b = (n)((y)o2).H;
                    o = ((y)o2).G;
                    final p p2 = (p)((y)o2).F;
                    h.z(o3);
                    o8 = p2;
                }
                else {
                    h.z(o3);
                    ((y)o2).F = g;
                    final a a = this.a;
                    ((y)o2).G = a;
                    b = this.b;
                    ((y)o2).H = b;
                    o7 = this.c;
                    ((y)o2).I = o7;
                    final H d = this.d;
                    ((y)o2).J = d;
                    ((y)o2).M = 1;
                    o = a;
                    if (((d)o).d((c)o2) == c) {
                        return c;
                    }
                    o8 = g;
                    j = d;
                }
                try {
                    if (!b.C) {
                        final Object c2 = o7.C;
                        ((y)o2).F = o;
                        ((y)o2).G = o7;
                        ((y)o2).H = j;
                        ((y)o2).I = null;
                        ((y)o2).J = null;
                        ((y)o2).M = 2;
                        o3 = ((p)o8).f(c2, o2);
                        if (o3 == c) {
                            return c;
                        }
                        final H h2 = j;
                        g = (g)o;
                        o = o7;
                        Object o4;
                        if (!n5.h.a(o3, ((o)o).C)) {
                            ((y)o2).F = g;
                            ((y)o2).G = o;
                            ((y)o2).H = o3;
                            ((y)o2).M = 3;
                            if (h2.j(o3, (c)o2) == c) {
                                return c;
                            }
                            o4 = o;
                            o = g;
                            ((o)o4).C = o3;
                        }
                        else {
                            o4 = o;
                            o = g;
                        }
                        final Object c3 = ((o)o4).C;
                        ((d)o).e((Object)null);
                        return c3;
                    }
                }
                finally {
                    g = (g)o;
                    break Label_0555;
                }
            }
            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
        }
        ((d)g).e((Object)null);
    }
}

package y5;

import E5.g;
import n3.u0;
import w5.t;
import f5.a;
import e5.d;
import g5.c;
import L0.j;
import m5.l;

public abstract class i
{
    public static final h a;
    
    static {
        a = (h)new Object();
    }
    
    public static b a(final int n, int n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n2 = 1;
        }
        b b;
        if (n != -2) {
            if (n != -1) {
                if (n != 0) {
                    if (n != Integer.MAX_VALUE) {
                        if (n2 == 1) {
                            b = new b(n, null);
                        }
                        else {
                            b = new y5.l(n, n2, null);
                        }
                    }
                    else {
                        b = new b(Integer.MAX_VALUE, null);
                    }
                }
                else if (n2 == 1) {
                    b = new b(0, null);
                }
                else {
                    b = new y5.l(1, n2, null);
                }
            }
            else {
                if (n2 != 1) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                }
                b = new y5.l(1, 2, null);
            }
        }
        else if (n2 == 1) {
            f.B.getClass();
            b = new b(e.b, null);
        }
        else {
            b = new y5.l(1, n2, null);
        }
        return b;
    }
    
    public static final Object b(final o o, final j f, c f2) {
        Object o2 = null;
        Label_0048: {
            if (f2 instanceof m) {
                o2 = f2;
                final int h = ((m)o2).H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    ((m)o2).H = h + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            o2 = new c((d)f2);
        }
        final Object g = ((m)o2).G;
        final a c = f5.a.C;
        final int h2 = ((m)o2).H;
        final j j;
        Label_0225: {
            if (h2 != 0) {
                if (h2 == 1) {
                    f2 = (c)((m)o2).F;
                    Label_0236: {
                        try {
                            com.google.android.gms.internal.auth.h.z(g);
                            break Label_0225;
                        }
                        finally {
                            break Label_0236;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ((m5.a)f2).b();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(g);
            final e5.i d = ((c)o2).D;
            n5.h.b((Object)d);
            if (d.i((e5.h)t.D) != o) {
                throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
            }
            ((m)o2).F = (m5.a)f;
            ((m)o2).H = 1;
            final w5.f f3 = new w5.f(1, u0.o((d)o2));
            f3.u();
            ((n)o).U(new g((Object)f3, 2));
            final Object t = f3.t();
            j = f;
            if (t == c) {
                return c;
            }
        }
        ((m5.a)j).b();
        return c5.h.a;
    }
}

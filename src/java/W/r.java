package W;

import f5.a;
import e5.d;
import m5.p;
import g5.h;

public final class r extends h implements p
{
    public int G;
    public Object H;
    public final H I;
    
    public r(final H i, final d d) {
        this.I = i;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((r)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object h) {
        final r r = new r(this.I, d);
        r.H = h;
        return (d)r;
    }
    
    public final Object l(Object o) {
        final a c = a.C;
        final int g = this.G;
        final c5.h a = c5.h.a;
        if (g != 0) {
            if (g != 1 && g != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.auth.h.z(o);
        }
        else {
            com.google.android.gms.internal.auth.h.z(o);
            final o o2 = (o)this.H;
            final boolean b = o2 instanceof m;
            final H i = this.I;
            if (b) {
                final m m = (m)o2;
                this.G = 1;
                final I j = (I)i.H.b();
                Label_0188: {
                    if (!(j instanceof c)) {
                        if (j instanceof j) {
                            if (j == m.a) {
                                o = i.f((g5.c)this);
                                if (o == c) {
                                    break Label_0188;
                                }
                            }
                        }
                        else if (n5.h.a((Object)j, (Object)J.a)) {
                            o = i.f((g5.c)this);
                            if (o == c) {
                                break Label_0188;
                            }
                        }
                        else if (j instanceof i) {
                            throw new IllegalStateException("Can't read in final state.");
                        }
                    }
                    while (true) {
                        o = a;
                        break Label_0188;
                        continue;
                    }
                }
                if (o == c) {
                    return c;
                }
            }
            else if (o2 instanceof n) {
                final n n = (n)o2;
                this.G = 2;
                if (W.H.b(i, n, (g5.c)this) == c) {
                    return c;
                }
            }
        }
        return a;
    }
}

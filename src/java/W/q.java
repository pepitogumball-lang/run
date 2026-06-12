package W;

import w5.a0;
import w5.l;
import w5.v;
import java.util.concurrent.CancellationException;
import n5.h;
import m5.p;
import n5.i;

public final class q extends i implements p
{
    public static final q D;
    
    static {
        D = (q)new i(2);
    }
    
    public final Object f(Object q, final Object o) {
        final o o2 = (o)q;
        final Throwable t = (Throwable)o;
        h.e("msg", (Object)o2);
        if (o2 instanceof n) {
            final n n = (n)o2;
            Object o3;
            if ((o3 = t) == null) {
                o3 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            final l b = n.b;
            final w5.n n2 = new w5.n((Throwable)o3, false);
            do {
                q = ((a0)b).Q(((a0)b).C(), (Object)n2);
                if (q == v.c) {
                    break;
                }
                if (q == v.d) {
                    break;
                }
            } while (q == v.e);
        }
        return c5.h.a;
    }
}

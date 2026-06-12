package n1;

import com.google.android.gms.internal.measurement.L;
import A3.a;
import A3.e;
import x3.d;

public final class c implements d
{
    public static final c a;
    public static final x3.c b;
    public static final x3.c c;
    
    static {
        a = (c)new Object();
        b = new x3.c("eventsDroppedCount", L.o(L.n((Class)e.class, new a(1))));
        c = new x3.c("reason", L.o(L.n((Class)e.class, new a(3))));
    }
    
    public final void a(final Object o, final Object o2) {
        final q1.d d = (q1.d)o;
        final x3.e e = (x3.e)o2;
        e.c(n1.c.b, d.a);
        e.g(n1.c.c, (Object)d.b);
    }
}

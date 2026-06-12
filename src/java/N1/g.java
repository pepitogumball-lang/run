package n1;

import com.google.android.gms.internal.measurement.L;
import A3.a;
import A3.e;
import x3.c;
import x3.d;

public final class g implements d
{
    public static final g a;
    public static final c b;
    public static final c c;
    
    static {
        a = (g)new Object();
        b = new c("startMs", L.o(L.n((Class)e.class, new a(1))));
        c = new c("endMs", L.o(L.n((Class)e.class, new a(2))));
    }
    
    public final void a(final Object o, final Object o2) {
        final q1.g g = (q1.g)o;
        final x3.e e = (x3.e)o2;
        e.c(n1.g.b, g.a);
        e.c(n1.g.c, g.b);
    }
}

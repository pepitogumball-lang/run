package n1;

import com.google.android.gms.internal.measurement.L;
import A3.e;
import x3.c;
import x3.d;

public final class a implements d
{
    public static final a a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    
    static {
        a = (a)new Object();
        b = new c("window", L.o(L.n((Class)e.class, new A3.a(1))));
        c = new c("logSourceMetrics", L.o(L.n((Class)e.class, new A3.a(2))));
        d = new c("globalMetrics", L.o(L.n((Class)e.class, new A3.a(3))));
        e = new c("appNamespace", L.o(L.n((Class)e.class, new A3.a(4))));
    }
    
    public final void a(final Object o, final Object o2) {
        final q1.a a = (q1.a)o;
        final x3.e e = (x3.e)o2;
        e.g(n1.a.b, (Object)a.a);
        e.g(n1.a.c, (Object)a.b);
        e.g(n1.a.d, (Object)a.c);
        e.g(n1.a.e, (Object)a.d);
    }
}

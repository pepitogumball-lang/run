package n1;

import com.google.android.gms.internal.measurement.L;
import A3.a;
import A3.e;
import x3.c;

public final class d implements x3.d
{
    public static final d a;
    public static final c b;
    public static final c c;
    
    static {
        a = (d)new Object();
        b = new c("logSource", L.o(L.n((Class)e.class, new a(1))));
        c = new c("logEventDropped", L.o(L.n((Class)e.class, new a(2))));
    }
    
    public final void a(final Object o, final Object o2) {
        final q1.e e = (q1.e)o;
        final x3.e e2 = (x3.e)o2;
        e2.g(d.b, (Object)e.a);
        e2.g(d.c, (Object)e.b);
    }
}

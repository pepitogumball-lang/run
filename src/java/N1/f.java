package n1;

import com.google.android.gms.internal.measurement.L;
import A3.a;
import A3.e;
import x3.c;
import x3.d;

public final class f implements d
{
    public static final f a;
    public static final c b;
    public static final c c;
    
    static {
        a = (f)new Object();
        b = new c("currentCacheSizeBytes", L.o(L.n((Class)e.class, new a(1))));
        c = new c("maxCacheSizeBytes", L.o(L.n((Class)e.class, new a(2))));
    }
    
    public final void a(final Object o, final Object o2) {
        final q1.f f = (q1.f)o;
        final x3.e e = (x3.e)o2;
        e.c(n1.f.b, f.a);
        e.c(n1.f.c, f.b);
    }
}

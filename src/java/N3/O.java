package n3;

import x3.e;
import x3.c;
import x3.d;

public final class o implements d
{
    public static final o a;
    public static final c b;
    public static final c c;
    public static final c d;
    
    static {
        a = (o)new Object();
        b = x3.c.a("name");
        c = x3.c.a("code");
        d = x3.c.a("address");
    }
    
    public final void a(final Object o, final Object o2) {
        final z0 z0 = (z0)o;
        final e e = (e)o2;
        final V v = (V)z0;
        e.g(o.b, (Object)v.a);
        e.g(o.c, (Object)v.b);
        e.c(o.d, v.c);
    }
}

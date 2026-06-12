package n3;

import x3.e;
import x3.c;
import x3.d;

public final class n implements d
{
    public static final n a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    
    static {
        a = (n)new Object();
        b = x3.c.a("type");
        c = x3.c.a("reason");
        d = x3.c.a("frames");
        e = x3.c.a("causedBy");
        f = x3.c.a("overflowCount");
    }
    
    public final void a(final Object o, final Object o2) {
        final y0 y0 = (y0)o;
        final e e = (e)o2;
        final U u = (U)y0;
        e.g(n.b, (Object)u.a);
        e.g(n.c, (Object)u.b);
        e.g(n.d, (Object)u.c);
        e.g(n.e, (Object)u.d);
        e.b(n.f, u.e);
    }
}

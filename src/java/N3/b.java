package n3;

import x3.e;
import x3.c;
import x3.d;

public final class b implements d
{
    public static final b a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    
    static {
        a = (b)new Object();
        b = x3.c.a("pid");
        c = x3.c.a("processName");
        d = x3.c.a("reasonCode");
        e = x3.c.a("importance");
        f = x3.c.a("pss");
        g = x3.c.a("rss");
        h = x3.c.a("timestamp");
        i = x3.c.a("traceFile");
        j = x3.c.a("buildIdMappingForArch");
    }
    
    public final void a(final Object o, final Object o2) {
        final q0 q0 = (q0)o;
        final e e = (e)o2;
        final D d = (D)q0;
        e.b(n3.b.b, d.a);
        e.g(n3.b.c, (Object)d.b);
        e.b(n3.b.d, d.c);
        e.b(n3.b.e, d.d);
        e.c(n3.b.f, d.e);
        e.c(n3.b.g, d.f);
        e.c(n3.b.h, d.g);
        e.g(n3.b.i, (Object)d.h);
        e.g(n3.b.j, (Object)d.i);
    }
}

package m1;

import x3.e;
import x3.c;
import x3.d;

public final class j implements d
{
    public static final j a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    
    static {
        a = (j)new Object();
        b = x3.c.a("requestTimeMs");
        c = x3.c.a("requestUptimeMs");
        d = x3.c.a("clientInfo");
        e = x3.c.a("logSource");
        f = x3.c.a("logSourceName");
        g = x3.c.a("logEvent");
        h = x3.c.a("qosTier");
    }
    
    public final void a(final Object o, final Object o2) {
        final F f = (F)o;
        final e e = (e)o2;
        final t t = (t)f;
        e.c(j.b, t.a);
        e.c(j.c, t.b);
        e.g(j.d, (Object)t.c);
        e.g(j.e, (Object)t.d);
        e.g(j.f, (Object)t.e);
        e.g(j.g, (Object)t.f);
        e.g(j.h, (Object)J.C);
    }
}

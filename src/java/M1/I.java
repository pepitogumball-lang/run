package m1;

import x3.e;
import x3.c;
import x3.d;

public final class i implements d
{
    public static final i a;
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
        a = (i)new Object();
        b = x3.c.a("eventTimeMs");
        c = x3.c.a("eventCode");
        d = x3.c.a("complianceData");
        e = x3.c.a("eventUptimeMs");
        f = x3.c.a("sourceExtension");
        g = x3.c.a("sourceExtensionJsonProto3");
        h = x3.c.a("timezoneOffsetSeconds");
        i = x3.c.a("networkConnectionInfo");
        j = x3.c.a("experimentIds");
    }
    
    public final void a(final Object o, final Object o2) {
        final E e = (E)o;
        final e e2 = (e)o2;
        final s s = (s)e;
        e2.c(m1.i.b, s.a);
        e2.g(m1.i.c, (Object)s.b);
        e2.g(m1.i.d, (Object)s.c);
        e2.c(m1.i.e, s.d);
        e2.g(m1.i.f, (Object)s.e);
        e2.g(m1.i.g, (Object)s.f);
        e2.c(m1.i.h, s.g);
        e2.g(m1.i.i, (Object)s.h);
        e2.g(m1.i.j, (Object)s.i);
    }
}

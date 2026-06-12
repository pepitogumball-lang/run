package g4;

import x3.e;
import x3.c;

public final class d implements x3.d
{
    public static final d a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    
    static {
        a = (d)new Object();
        b = x3.c.a("appId");
        c = x3.c.a("deviceModel");
        d = x3.c.a("sessionSdkVersion");
        e = x3.c.a("osVersion");
        f = x3.c.a("logEnvironment");
        g = x3.c.a("androidAppInfo");
    }
    
    public final void a(final Object o, final Object o2) {
        final b b = (b)o;
        final e e = (e)o2;
        e.g(g4.d.b, (Object)b.a);
        e.g(g4.d.c, (Object)b.b);
        e.g(g4.d.d, (Object)"2.0.7");
        e.g(g4.d.e, (Object)b.c);
        e.g(g4.d.f, (Object)s.D);
        e.g(g4.d.g, (Object)b.d);
    }
}

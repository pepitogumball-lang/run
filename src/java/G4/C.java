package g4;

import x3.e;
import x3.d;

public final class c implements d
{
    public static final c a;
    public static final x3.c b;
    public static final x3.c c;
    public static final x3.c d;
    public static final x3.c e;
    public static final x3.c f;
    public static final x3.c g;
    
    static {
        a = (c)new Object();
        b = x3.c.a("packageName");
        c = x3.c.a("versionName");
        d = x3.c.a("appBuildVersion");
        e = x3.c.a("deviceManufacturer");
        f = x3.c.a("currentProcessDetails");
        g = x3.c.a("appProcessDetails");
    }
    
    public final void a(final Object o, final Object o2) {
        final a a = (a)o;
        final e e = (e)o2;
        e.g(g4.c.b, (Object)a.a);
        e.g(g4.c.c, (Object)a.b);
        e.g(g4.c.d, (Object)a.c);
        e.g(g4.c.e, (Object)a.d);
        e.g(g4.c.f, (Object)a.e);
        e.g(g4.c.g, (Object)a.f);
    }
}

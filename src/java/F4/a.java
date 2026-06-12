package f4;

import x3.c;
import x3.d;

public final class a implements d
{
    public static final a a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    
    static {
        a = (a)new Object();
        b = x3.c.a("rolloutId");
        c = x3.c.a("variantId");
        d = x3.c.a("parameterKey");
        e = x3.c.a("parameterValue");
        f = x3.c.a("templateVersion");
    }
    
    public final void a(final Object o, final Object o2) {
        final e e = (e)o;
        final x3.e e2 = (x3.e)o2;
        final f4.c c = (f4.c)e;
        e2.g(f4.a.b, (Object)c.b);
        e2.g(f4.a.c, (Object)c.c);
        e2.g(f4.a.d, (Object)c.d);
        e2.g(f4.a.e, (Object)c.e);
        e2.c(f4.a.f, c.f);
    }
}

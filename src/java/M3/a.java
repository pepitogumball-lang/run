package m3;

import x3.e;
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
        c = x3.c.a("parameterKey");
        d = x3.c.a("parameterValue");
        e = x3.c.a("variantId");
        f = x3.c.a("templateVersion");
    }
    
    public final void a(final Object o, final Object o2) {
        final m m = (m)o;
        final e e = (e)o2;
        final b b = (b)m;
        e.g(m3.a.b, (Object)b.b);
        e.g(m3.a.c, (Object)b.c);
        e.g(m3.a.d, (Object)b.d);
        e.g(m3.a.e, (Object)b.e);
        e.c(m3.a.f, b.f);
    }
}

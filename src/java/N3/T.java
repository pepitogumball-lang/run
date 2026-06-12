package n3;

import x3.e;
import x3.c;
import x3.d;

public final class t implements d
{
    public static final t a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    
    static {
        a = (t)new Object();
        b = x3.c.a("timestamp");
        c = x3.c.a("type");
        d = x3.c.a("app");
        e = x3.c.a("device");
        f = x3.c.a("log");
        g = x3.c.a("rollouts");
    }
    
    public final void a(final Object o, final Object o2) {
        final K0 k0 = (K0)o;
        final e e = (e)o2;
        final P p2 = (P)k0;
        e.c(t.b, p2.a);
        e.g(t.c, (Object)p2.b);
        e.g(t.d, (Object)p2.c);
        e.g(t.e, (Object)p2.d);
        e.g(t.f, (Object)p2.e);
        e.g(t.g, (Object)p2.f);
    }
}

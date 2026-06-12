package n3;

import x3.e;
import x3.c;
import x3.d;

public final class s implements d
{
    public static final s a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    
    static {
        a = (s)new Object();
        b = x3.c.a("batteryLevel");
        c = x3.c.a("batteryVelocity");
        d = x3.c.a("proximityOn");
        e = x3.c.a("orientation");
        f = x3.c.a("ramUsed");
        g = x3.c.a("diskUsed");
    }
    
    public final void a(final Object o, final Object o2) {
        final F0 f0 = (F0)o;
        final e e = (e)o2;
        final c0 c0 = (c0)f0;
        e.g(s.b, (Object)c0.a);
        e.b(s.c, c0.b);
        e.f(s.d, c0.c);
        e.b(s.e, c0.d);
        e.c(s.f, c0.e);
        e.c(s.g, c0.f);
    }
}

package n3;

import x3.e;
import x3.c;
import x3.d;

public final class m implements d
{
    public static final m a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    
    static {
        a = (m)new Object();
        b = x3.c.a("threads");
        c = x3.c.a("exception");
        d = x3.c.a("appExitInfo");
        e = x3.c.a("signal");
        f = x3.c.a("binaries");
    }
    
    public final void a(final Object o, final Object o2) {
        final C0 c0 = (C0)o;
        final e e = (e)o2;
        final S s = (S)c0;
        e.g(m.b, (Object)s.a);
        e.g(m.c, (Object)s.b);
        e.g(m.d, (Object)s.c);
        e.g(m.e, (Object)s.d);
        e.g(m.f, (Object)s.e);
    }
}

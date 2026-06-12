package g4;

import x3.e;
import x3.c;
import x3.d;

public final class h implements d
{
    public static final h a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    
    static {
        a = (h)new Object();
        b = x3.c.a("sessionId");
        c = x3.c.a("firstSessionId");
        d = x3.c.a("sessionIndex");
        e = x3.c.a("eventTimestampUs");
        f = x3.c.a("dataCollectionStatus");
        g = x3.c.a("firebaseInstallationId");
        h = x3.c.a("firebaseAuthenticationToken");
    }
    
    public final void a(final Object o, final Object o2) {
        final P p2 = (P)o;
        final e e = (e)o2;
        e.g(g4.h.b, (Object)p2.a);
        e.g(g4.h.c, (Object)p2.b);
        e.b(g4.h.d, p2.c);
        e.c(g4.h.e, p2.d);
        e.g(g4.h.f, (Object)p2.e);
        e.g(g4.h.g, (Object)p2.f);
        e.g(g4.h.h, (Object)p2.g);
    }
}

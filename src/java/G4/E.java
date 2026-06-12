package g4;

import x3.c;
import x3.d;

public final class e implements d
{
    public static final e a;
    public static final c b;
    public static final c c;
    public static final c d;
    
    static {
        a = (e)new Object();
        b = x3.c.a("performance");
        c = x3.c.a("crashlytics");
        d = x3.c.a("sessionSamplingRate");
    }
    
    public final void a(final Object o, final Object o2) {
        final j j = (j)o;
        final x3.e e = (x3.e)o2;
        e.g(g4.e.b, (Object)j.a);
        e.g(g4.e.c, (Object)j.b);
        e.a(g4.e.d, j.c);
    }
}

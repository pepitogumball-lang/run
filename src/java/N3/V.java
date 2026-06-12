package n3;

import x3.e;
import x3.c;
import x3.d;

public final class v implements d
{
    public static final v a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    
    static {
        a = (v)new Object();
        b = x3.c.a("rolloutVariant");
        c = x3.c.a("parameterKey");
        d = x3.c.a("parameterValue");
        e = x3.c.a("templateVersion");
    }
    
    public final void a(final Object o, final Object o2) {
        final I0 i0 = (I0)o;
        final e e = (e)o2;
        final f0 f0 = (f0)i0;
        e.g(v.b, (Object)f0.a);
        e.g(v.c, (Object)f0.b);
        e.g(v.d, (Object)f0.c);
        e.c(v.e, f0.d);
    }
}

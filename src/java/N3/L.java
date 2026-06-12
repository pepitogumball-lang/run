package n3;

import x3.e;
import x3.c;
import x3.d;

public final class l implements d
{
    public static final l a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    
    static {
        a = (l)new Object();
        b = x3.c.a("baseAddress");
        c = x3.c.a("size");
        d = x3.c.a("name");
        e = x3.c.a("uuid");
    }
    
    public final void a(final Object o, final Object o2) {
        final x0 x0 = (x0)o;
        final e e = (e)o2;
        final T t = (T)x0;
        e.c(l.b, t.a);
        e.c(l.c, t.b);
        e.g(l.d, (Object)t.c);
        final String d = t.d;
        byte[] bytes;
        if (d != null) {
            bytes = d.getBytes(O0.a);
        }
        else {
            bytes = null;
        }
        e.g(l.e, (Object)bytes);
    }
}

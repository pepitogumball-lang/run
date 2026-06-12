package z3;

import x3.d;
import java.util.Date;
import java.util.HashMap;
import A3.f;
import y3.a;

public final class c implements a
{
    public static final f e;
    public static final z3.a f;
    public static final z3.a g;
    public static final b h;
    public final HashMap a;
    public final HashMap b;
    public final f c;
    public boolean d;
    
    static {
        e = new f(2);
        f = new z3.a(0);
        g = new z3.a(1);
        h = (b)new Object();
    }
    
    public c() {
        final HashMap a = new HashMap();
        this.a = a;
        final HashMap b = new HashMap();
        this.b = b;
        this.c = z3.c.e;
        this.d = false;
        b.put((Object)String.class, (Object)z3.c.f);
        a.remove((Object)String.class);
        b.put((Object)Boolean.class, (Object)z3.c.g);
        a.remove((Object)Boolean.class);
        b.put((Object)Date.class, (Object)z3.c.h);
        a.remove((Object)Date.class);
    }
    
    public final a a(final Class clazz, final d d) {
        this.a.put((Object)clazz, (Object)d);
        this.b.remove((Object)clazz);
        return (a)this;
    }
}

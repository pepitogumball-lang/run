package s1;

import n1.p;
import u1.d;
import o1.e;
import java.util.concurrent.Executor;
import t1.c;
import java.util.logging.Logger;

public final class a implements b
{
    public static final Logger f;
    public final c a;
    public final Executor b;
    public final e c;
    public final d d;
    public final v1.c e;
    
    static {
        f = Logger.getLogger(p.class.getName());
    }
    
    public a(final Executor b, final e c, final c a, final d d, final v1.c e) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
}

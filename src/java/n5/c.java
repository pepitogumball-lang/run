package n5;

import java.io.Serializable;
import s5.a;

public abstract class c implements a, Serializable
{
    public transient a C;
    public final Object D;
    public final Class E;
    public final String F;
    public final String G;
    public final boolean H;
    
    public c(final Object d, final Class e, final String f, final String g, final boolean h) {
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public abstract a a();
    
    public final d d() {
        final Class e = this.E;
        Object a;
        if (this.H) {
            p.a.getClass();
            a = new j(e);
        }
        else {
            a = p.a(e);
        }
        return (d)a;
    }
}

package c5;

import n5.h;
import m5.a;
import java.io.Serializable;

public final class f implements Serializable
{
    public a C;
    public volatile Object D;
    public final Object E;
    
    public f(final a c) {
        this.C = c;
        this.D = g.a;
        this.E = this;
    }
    
    public final Object a() {
        final Object d = this.D;
        final g a = g.a;
        if (d != a) {
            return d;
        }
        final Object e = this.E;
        synchronized (e) {
            Object d2 = this.D;
            if (d2 == a) {
                final a c = this.C;
                h.b((Object)c);
                d2 = c.b();
                this.D = d2;
                this.C = null;
            }
            return d2;
        }
    }
    
    @Override
    public final String toString() {
        String value;
        if (this.D != g.a) {
            value = String.valueOf(this.a());
        }
        else {
            value = "Lazy value not initialized yet.";
        }
        return value;
    }
}

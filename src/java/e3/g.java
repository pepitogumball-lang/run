package e3;

import x.a;
import com.google.android.gms.internal.measurement.L;
import J5.b;

public final class g
{
    public final o a;
    public final int b;
    public final int c;
    
    public g(final int n, final int n2, final Class clazz) {
        this(o.a(clazz), n, n2);
    }
    
    public g(final o a, final int b, final int c) {
        J5.b.k("Null dependency anInterface.", (Object)a);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static g a(final Class clazz) {
        return new g(0, 1, clazz);
    }
    
    public static g b(final o o) {
        return new g(o, 1, 0);
    }
    
    public static g c(final Class clazz) {
        return new g(1, 0, clazz);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof g;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final g g = (g)o;
            final o a = g.a;
            b3 = b2;
            if (this.a.equals(a)) {
                b3 = b2;
                if (this.b == g.b) {
                    b3 = b2;
                    if (this.c == g.c) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append((Object)this.a);
        sb.append(", type=");
        final int b = this.b;
        String s;
        if (b == 1) {
            s = "required";
        }
        else if (b == 0) {
            s = "optional";
        }
        else {
            s = "set";
        }
        sb.append(s);
        sb.append(", injection=");
        final int c = this.c;
        String s2;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    throw new AssertionError((Object)L.h(c, "Unsupported injection: "));
                }
                s2 = "deferred";
            }
            else {
                s2 = "provider";
            }
        }
        else {
            s2 = "direct";
        }
        return x.a.b(sb, s2, "}");
    }
}

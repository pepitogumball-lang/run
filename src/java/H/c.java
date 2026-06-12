package H;

import io.flutter.plugin.platform.p;
import android.graphics.Insets;

public final class c
{
    public static final c e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new c(0, 0, 0, 0);
    }
    
    public c(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static c a(final int n, final int n2, final int n3, final int n4) {
        if (n == 0 && n2 == 0 && n3 == 0 && n4 == 0) {
            return c.e;
        }
        return new c(n, n2, n3, n4);
    }
    
    public static c b(final Insets insets) {
        return a(p.a(insets), p.k(insets), p.m(insets), p.o(insets));
    }
    
    public final Insets c() {
        return H.b.a(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && c.class == o.getClass()) {
            final c c = (c)o;
            return this.d == c.d && this.a == c.a && this.c == c.c && this.b == c.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
}

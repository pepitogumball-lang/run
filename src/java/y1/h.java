package y1;

import com.google.android.gms.internal.measurement.L;
import m0.a;

public final class h
{
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    
    static {
        i = new h(320, "320x50_mb", 50);
        new h(468, "468x60_as", 60);
        new h(320, "320x100_as", 100);
        new h(728, "728x90_as", 90);
        new h(300, "300x250_as", 250);
        new h(160, "160x600_as", 600);
        j = new h(-1, "smart_banner", -2);
        k = new h(-3, "fluid", -4);
        l = new h(0, "invalid", 0);
        new h(50, "50x50_mb", 50);
        new h(-3, "search_v2", 0);
    }
    
    public h(final int n, final int n2) {
        String value;
        if (n == -1) {
            value = "FULL";
        }
        else {
            value = String.valueOf(n);
        }
        String value2;
        if (n2 == -2) {
            value2 = "AUTO";
        }
        else {
            value2 = String.valueOf(n2);
        }
        this(n, m0.a.h(value, "x", value2, "_as"), n2);
    }
    
    public h(final int a, final String c, final int b) {
        if (a < 0 && a != -1 && a != -3) {
            throw new IllegalArgumentException(L.h(a, "Invalid width for AdSize: "));
        }
        if (b < 0 && b != -2 && b != -4) {
            throw new IllegalArgumentException(L.h(b, "Invalid height for AdSize: "));
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return this.a == h.a && this.b == h.b && this.c.equals((Object)h.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}

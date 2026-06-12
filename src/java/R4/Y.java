package R4;

import com.google.android.gms.internal.measurement.L;
import v.e;
import D1.a;

public final class y
{
    public final x a;
    public final String b;
    public final Number c;
    
    public y(final a a) {
        final int d = e.d(a.a());
        if (d != 0) {
            if (d != 1) {
                final int a2 = a.a();
                String s;
                if (a2 != 1) {
                    if (a2 != 2) {
                        s = "null";
                    }
                    else {
                        s = "READY";
                    }
                }
                else {
                    s = "NOT_READY";
                }
                throw new IllegalArgumentException("Unable to handle state: ".concat(s));
            }
            this.a = x.D;
        }
        else {
            this.a = x.C;
        }
        this.b = a.getDescription();
        this.c = (Number)Integer.valueOf(a.b());
    }
    
    public y(final x a, final String b, final Number c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return this.a == y.a && this.b.equals((Object)y.b) && this.c.equals(y.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + L.g(this.a.hashCode() * 31, this.b, 31);
    }
}

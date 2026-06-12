package t1;

import java.util.Map;
import k1.d;
import java.util.HashMap;

public final class a
{
    public final w1.a a;
    public final HashMap b;
    
    public a(final w1.a a, final HashMap b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a(final d d, final long n, int n2) {
        final long i = this.a.i();
        final b b = (b)this.b.get((Object)d);
        final long a = b.a;
        --n2;
        long n3;
        if (a > 1L) {
            n3 = a;
        }
        else {
            n3 = 2L;
        }
        return Math.min(Math.max((long)(Math.pow(3.0, (double)n2) * a * Math.max(1.0, Math.log(10000.0) / Math.log((double)(n3 * n2)))), n - i), b.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (!this.a.equals(a.a) || !((Map)this.b).equals((Object)a.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ ((Map)this.b).hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append((Object)this.a);
        sb.append(", values=");
        sb.append((Object)this.b);
        sb.append("}");
        return sb.toString();
    }
}

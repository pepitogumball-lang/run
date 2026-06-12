package I1;

import h1.m;
import java.util.Arrays;
import h2.A;

public final class q
{
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;
    
    public q(final String a, final double c, final double b, final double d, final int e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        return A.l((Object)this.a, (Object)q.a) && this.b == q.b && this.c == q.c && this.e == q.e && Double.compare(this.d, q.d) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e });
    }
    
    @Override
    public final String toString() {
        final m m = new m((Object)this);
        m.h("name", (Object)this.a);
        m.h("minBound", (Object)this.c);
        m.h("maxBound", (Object)this.b);
        m.h("percent", (Object)this.d);
        m.h("count", (Object)this.e);
        return m.toString();
    }
}

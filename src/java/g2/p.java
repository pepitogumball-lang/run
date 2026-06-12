package g2;

import h1.m;
import java.util.Arrays;
import h2.A;
import e2.d;

public final class p
{
    public final a a = a;
    public final d b = b;
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof p) {
            final p p = (p)o;
            if (A.l((Object)this.a, (Object)p.a) && A.l((Object)this.b, (Object)p.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final m m = new m((Object)this);
        m.h("key", (Object)this.a);
        m.h("feature", (Object)this.b);
        return m.toString();
    }
}

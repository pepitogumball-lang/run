package R4;

import d2.m;
import java.util.Objects;
import y1.q;
import y1.l;

public final class g
{
    public final int a;
    public final String b;
    public final String c;
    public final i d;
    
    public g(final int a, final String b, final String c, final i d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public g(final l l) {
        this.a = ((m)l).b;
        this.b = (String)((m)l).d;
        this.c = (String)((m)l).c;
        final q i = l.i;
        if (i != null) {
            this.d = new i(i);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return this.a == g.a && this.b.equals((Object)g.b) && Objects.equals((Object)this.d, (Object)g.d) && this.c.equals((Object)g.c);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d });
    }
}

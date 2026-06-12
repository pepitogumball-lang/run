package R4;

import java.util.Objects;
import d2.m;

public final class e
{
    public final int a;
    public final String b;
    public final String c;
    
    public e(final int a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public e(final m m) {
        this.a = m.a();
        this.b = (String)m.d;
        this.c = (String)m.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.a == e.a && this.b.equals((Object)e.b) && this.c.equals((Object)e.c);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c });
    }
}

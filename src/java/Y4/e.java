package Y4;

import java.util.Objects;
import java.util.Map;

public final class e
{
    public Boolean a;
    public Boolean b;
    public Map c;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && e.class == o.getClass()) {
            final e e = (e)o;
            if (!this.a.equals((Object)e.a) || !this.b.equals((Object)e.b) || !this.c.equals((Object)e.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c });
    }
}

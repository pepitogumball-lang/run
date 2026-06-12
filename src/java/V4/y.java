package V4;

import java.util.Objects;
import java.util.List;

public final class y
{
    public l a;
    public List b;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && y.class == o.getClass()) {
            final y y = (y)o;
            if (!this.a.equals(y.a) || !this.b.equals((Object)y.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
}

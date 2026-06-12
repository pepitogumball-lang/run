package V4;

import java.util.Objects;

public final class z
{
    public String a;
    public t b;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && z.class == o.getClass()) {
            final z z = (z)o;
            if (!this.a.equals((Object)z.a) || !this.b.equals(z.b)) {
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

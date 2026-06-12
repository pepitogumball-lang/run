package T4;

import java.util.Objects;

public final class b
{
    public final Boolean a;
    public final a b;
    
    public b(final Boolean a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (!Objects.equals((Object)this.a, (Object)b2.a) || !Objects.equals((Object)this.b, (Object)b2.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
}

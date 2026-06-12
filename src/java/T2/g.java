package T2;

import java.util.Arrays;
import java.io.Serializable;

public final class g implements d, Serializable
{
    public final Object C;
    
    public g(final Object c) {
        this.C = c;
    }
    
    @Override
    public final boolean equals(Object c) {
        final boolean b = c instanceof g;
        boolean b2 = false;
        if (b) {
            final g g = (g)c;
            c = this.C;
            final Object c2 = g.C;
            if (c != c2) {
                b2 = b2;
                if (!c.equals(c2)) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final Object get() {
        return this.C;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
        sb.append(this.C);
        sb.append(")");
        return sb.toString();
    }
}

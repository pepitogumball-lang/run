package h2;

import java.util.Arrays;
import f2.b;

public final class q implements b
{
    public static final q D;
    public final String C = c;
    
    static {
        D = new q(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof q && A.l(this.C, ((q)o).C));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C });
    }
}

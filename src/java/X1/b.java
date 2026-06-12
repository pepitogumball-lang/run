package X1;

import java.util.Arrays;
import h2.A;
import com.google.android.gms.internal.auth.l;

public final class b implements f2.b
{
    public static final b E;
    public final boolean C;
    public final String D;
    
    static {
        final l l = new l(17, false);
        l.D = Boolean.FALSE;
        E = new b(l);
    }
    
    public b(final l l) {
        this.C = (boolean)l.D;
        this.D = (String)l.E;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        b.getClass();
        return A.l((Object)null, (Object)null) && this.C == b.C && A.l((Object)this.D, (Object)b.D);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { null, this.C, this.D });
    }
}

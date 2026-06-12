package g2;

import h2.A;
import java.util.Arrays;
import f2.b;
import f2.d;

public final class a
{
    public final int a;
    public final d b;
    public final b c;
    public final String d;
    
    public a(final d b, final b c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = Arrays.hashCode(new Object[] { b, c, d });
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return A.l((Object)this.b, (Object)a.b) && A.l((Object)this.c, (Object)a.c) && A.l((Object)this.d, (Object)a.d);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}

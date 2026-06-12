package n1;

import android.util.Base64;
import java.util.Arrays;
import c2.k;
import k1.d;

public final class j
{
    public final String a;
    public final byte[] b;
    public final d c;
    
    public j(final String a, final byte[] b, final d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static k a() {
        final k k = new k(20);
        k.F = d.C;
        return k;
    }
    
    public final j b(final d f) {
        final k a = a();
        a.D(this.a);
        if (f != null) {
            a.F = f;
            a.E = this.b;
            return a.d();
        }
        throw new NullPointerException("Null priority");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof j) {
            final j j = (j)o;
            if (!this.a.equals((Object)j.a) || !Arrays.equals(this.b, j.b) || !this.c.equals(j.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final byte[] b = this.b;
        String encodeToString;
        if (b == null) {
            encodeToString = "";
        }
        else {
            encodeToString = Base64.encodeToString(b, 2);
        }
        final StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append((Object)this.c);
        sb.append(", ");
        sb.append(encodeToString);
        sb.append(")");
        return sb.toString();
    }
}

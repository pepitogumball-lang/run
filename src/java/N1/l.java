package n1;

import java.util.Arrays;
import k1.c;

public final class l
{
    public final c a;
    public final byte[] b;
    
    public l(final c a, final byte[] b) {
        if (a == null) {
            throw new NullPointerException("encoding is null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("bytes is null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final l l = (l)o;
        return this.a.equals(l.a) && Arrays.equals(this.b, l.b);
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("EncodedPayload{encoding=");
        sb.append((Object)this.a);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}

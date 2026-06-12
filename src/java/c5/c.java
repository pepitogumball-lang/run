package c5;

import n5.h;
import java.io.Serializable;

public final class c implements Serializable
{
    public final Object C;
    public final Object D;
    
    public c(final Object c, final Object d) {
        this.C = c;
        this.D = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return h.a(this.C, c.C) && h.a(this.D, c.D);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Object c = this.C;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Object d = this.D;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(this.C);
        sb.append(", ");
        sb.append(this.D);
        sb.append(')');
        return sb.toString();
    }
}

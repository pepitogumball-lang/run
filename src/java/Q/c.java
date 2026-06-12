package q;

import java.util.Map$Entry;

public final class c implements Map$Entry
{
    public final Object C;
    public final Object D;
    public c E;
    public c F;
    
    public c(final Object c, final Object d) {
        this.C = c;
        this.D = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (!this.C.equals(c.C) || !this.D.equals(c.D)) {
            b = false;
        }
        return b;
    }
    
    public final Object getKey() {
        return this.C;
    }
    
    public final Object getValue() {
        return this.D;
    }
    
    @Override
    public final int hashCode() {
        return this.C.hashCode() ^ this.D.hashCode();
    }
    
    public final Object setValue(final Object o) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.C);
        sb.append("=");
        sb.append(this.D);
        return sb.toString();
    }
}

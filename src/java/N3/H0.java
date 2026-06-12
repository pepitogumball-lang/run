package n3;

import java.util.List;

public final class h0 extends J0
{
    public final List a;
    
    public h0(final List a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof J0 && this.a.equals((Object)((h0)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RolloutsState{rolloutAssignments=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}

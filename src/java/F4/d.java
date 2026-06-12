package f4;

import java.util.Set;
import java.util.HashSet;

public final class d
{
    public final HashSet a;
    
    public d(final HashSet a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof d && ((Set)this.a).equals((Object)((d)o).a));
    }
    
    @Override
    public final int hashCode() {
        return ((Set)this.a).hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RolloutsState{rolloutAssignments=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}

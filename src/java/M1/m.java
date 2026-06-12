package m1;

import java.util.ArrayList;

public final class m extends w
{
    public final ArrayList a;
    
    public m(final ArrayList a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof w && this.a.equals((Object)((m)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BatchedLogRequest{logRequests=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}

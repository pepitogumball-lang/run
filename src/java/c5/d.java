package c5;

import n5.h;
import java.io.Serializable;

public final class d implements Serializable
{
    public final Throwable C;
    
    public d(final Throwable c) {
        h.e("exception", (Object)c);
        this.C = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof d && h.a((Object)this.C, (Object)((d)o).C);
    }
    
    @Override
    public final int hashCode() {
        return this.C.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Failure(");
        sb.append((Object)this.C);
        sb.append(')');
        return sb.toString();
    }
}

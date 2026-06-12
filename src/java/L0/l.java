package L0;

import d5.d;
import java.util.Collection;
import java.util.List;

public final class l
{
    public final Object a;
    
    public l(final List a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && l.class.equals(o.getClass()) && this.a.equals(((l)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return d.I((Collection)this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", (m5.l)null, 56);
    }
}

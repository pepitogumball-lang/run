package q0;

import java.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import n5.h;
import java.util.List;
import java.util.AbstractCollection;

public final class b
{
    public final AbstractCollection a;
    
    public b(final List list) {
        h.e("topics", list);
        this.a = (AbstractCollection)list;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final AbstractCollection a = this.a;
        final int size = ((List)a).size();
        final b b = (b)o;
        return size == ((List)b.a).size() && new HashSet((Collection)a).equals(new HashSet((Collection)b.a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Topics=");
        sb.append((Object)this.a);
        return sb.toString();
    }
}

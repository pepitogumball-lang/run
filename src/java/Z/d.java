package Z;

import n5.h;

public final class d
{
    public final String a;
    
    public d(final String a) {
        h.e("name", (Object)a);
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof d && h.a((Object)this.a, (Object)((d)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}

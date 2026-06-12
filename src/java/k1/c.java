package k1;

import x.a;

public final class c
{
    public final String a;
    
    public c(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("name is null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && this.a.equals((Object)((c)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return x.a.b(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}

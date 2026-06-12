package n5;

public final class j implements d
{
    public final Class a;
    
    public j(final Class a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof j && h.a(this.a, ((j)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.a);
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}

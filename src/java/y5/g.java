package y5;

public final class g extends h
{
    public final Throwable a;
    
    public g(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof g && n5.h.a((Object)this.a, (Object)((g)o).a);
    }
    
    @Override
    public final int hashCode() {
        final Throwable a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Closed(");
        sb.append((Object)this.a);
        sb.append(')');
        return sb.toString();
    }
}

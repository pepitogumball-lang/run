package k1;

public final class b
{
    public final Integer a;
    
    public b(final Integer a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean equals = true;
        if (o == this) {
            return true;
        }
        if (o instanceof b) {
            final b b = (b)o;
            final Integer a = this.a;
            if (a == null) {
                if (b.a != null) {
                    equals = false;
                }
            }
            else {
                equals = a.equals((Object)b.a);
            }
            return equals;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProductData{productId=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}

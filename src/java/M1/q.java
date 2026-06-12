package m1;

public final class q extends C
{
    public final Integer a;
    
    public q(final Integer a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean equals = true;
        if (o == this) {
            return true;
        }
        if (o instanceof C) {
            final C c = (C)o;
            final Integer a = this.a;
            final q q = (q)c;
            if (a == null) {
                if (q.a != null) {
                    equals = false;
                }
            }
            else {
                equals = a.equals((Object)q.a);
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
        final StringBuilder sb = new StringBuilder("ExternalPRequestContext{originAssociatedProductId=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}

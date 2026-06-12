package m1;

public final class v extends I
{
    public final H a;
    public final G b;
    
    public v(final H a, final G b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof I) {
            final I i = (I)o;
            final H a = this.a;
            if (a == null) {
                if (((v)i).a != null) {
                    return false;
                }
            }
            else if (!a.equals(((v)i).a)) {
                return false;
            }
            final G b2 = this.b;
            if (b2 == null) {
                if (((v)i).b == null) {
                    return b;
                }
            }
            else if (b2.equals(((v)i).b)) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final H a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final G b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode ^ (hashCode2 ^ 0xF4243) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append((Object)this.a);
        sb.append(", mobileSubtype=");
        sb.append((Object)this.b);
        sb.append("}");
        return sb.toString();
    }
}

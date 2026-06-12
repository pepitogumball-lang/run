package m1;

public final class o extends A
{
    public final r a;
    
    public o(final r a) {
        final z c = z.C;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof A) {
            final A a = (A)o;
            if (this.a.equals(((o)a).a)) {
                final z c = z.C;
                ((o)a).getClass();
                if (c.equals(c)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ z.C.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ComplianceData{privacyContext=");
        sb.append((Object)this.a);
        sb.append(", productIdOrigin=");
        sb.append((Object)z.C);
        sb.append("}");
        return sb.toString();
    }
}

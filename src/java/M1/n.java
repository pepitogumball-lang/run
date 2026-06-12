package m1;

public final class n extends y
{
    public final l a;
    
    public n(final l a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof y) {
            final y y = (y)o;
            final x c = x.C;
            ((n)y).getClass();
            if (!c.equals(c) || !this.a.equals(((n)y).a)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (x.C.hashCode() ^ 0xF4243) * 1000003 ^ this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append((Object)x.C);
        sb.append(", androidClientInfo=");
        sb.append((Object)this.a);
        sb.append("}");
        return sb.toString();
    }
}

package n3;

public final class l0
{
    public final m0 a;
    public final o0 b;
    public final n0 c;
    
    public l0(final m0 a, final o0 b, final n0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof l0) {
            final l0 l0 = (l0)o;
            if (!this.a.equals(l0.a) || !this.b.equals(l0.b) || !this.c.equals(l0.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("StaticSessionData{appData=");
        sb.append((Object)this.a);
        sb.append(", osData=");
        sb.append((Object)this.b);
        sb.append(", deviceData=");
        sb.append((Object)this.c);
        sb.append("}");
        return sb.toString();
    }
}

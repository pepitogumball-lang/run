package n3;

public final class f0 extends I0
{
    public final g0 a;
    public final String b;
    public final String c;
    public final long d;
    
    public f0(final g0 a, final String b, final String c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof I0) {
            final f0 f0 = (f0)o;
            if (!this.a.equals(f0.a) || !this.b.equals((Object)f0.b) || !this.c.equals((Object)f0.c) || this.d != f0.d) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final long d = this.d;
        return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ (int)(d ^ d >>> 32);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append((Object)this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}

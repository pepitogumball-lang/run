package f4;

public final class c extends e
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    
    public c(final String b, final String c, final String d, final String e, final long f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            if (this.b.equals((Object)((c)e).b)) {
                final c c = (c)e;
                if (this.c.equals((Object)c.c) && this.d.equals((Object)c.d) && this.e.equals((Object)c.e) && this.f == c.f) {
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
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.e.hashCode();
        final long f = this.f;
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ (int)(f >>> 32 ^ f);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", variantId=");
        sb.append(this.c);
        sb.append(", parameterKey=");
        sb.append(this.d);
        sb.append(", parameterValue=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}

package m3;

public final class b extends m
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    
    public b(final String b, final String c, final String d, final String e, final long f) {
        if (b == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.c = c;
        if (d == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = d;
        if (e != null) {
            this.e = e;
            this.f = f;
            return;
        }
        throw new NullPointerException("Null variantId");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof m) {
            final m m = (m)o;
            if (this.b.equals((Object)((b)m).b)) {
                final b b2 = (b)m;
                if (this.c.equals((Object)b2.c) && this.d.equals((Object)b2.d) && this.e.equals((Object)b2.e) && this.f == b2.f) {
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
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}

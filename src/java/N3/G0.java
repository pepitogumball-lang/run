package n3;

import x.a;

public final class g0 extends H0
{
    public final String a;
    public final String b;
    
    public g0(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof H0) {
            final H0 h0 = (H0)o;
            if (!this.a.equals((Object)((g0)h0).a) || !this.b.equals((Object)((g0)h0).b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return x.a.b(sb, this.b, "}");
    }
}

package J1;

public final class i
{
    public final int a;
    public final int b;
    public final double c;
    public final boolean d;
    
    public i(final int a, final int b, final double c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (this.a == i.a && this.b == i.b && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(i.c) && this.d == i.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final double c = this.c;
        final long doubleToLongBits = Double.doubleToLongBits(c);
        final long doubleToLongBits2 = Double.doubleToLongBits(c);
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((int)(doubleToLongBits2 ^ doubleToLongBits >>> 32) ^ ((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PingStrategy{maxAttempts=");
        sb.append(this.a);
        sb.append(", initialBackoffMs=");
        sb.append(this.b);
        sb.append(", backoffMultiplier=");
        sb.append(this.c);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}

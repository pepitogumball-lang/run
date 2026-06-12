package n3;

public final class c0 extends F0
{
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;
    
    public c0(final Double a, final int b, final boolean c, final int d, final long e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof F0) {
            final F0 f0 = (F0)o;
            final Double a = this.a;
            if (a == null) {
                if (((c0)f0).a != null) {
                    return false;
                }
            }
            else if (!a.equals((Object)((c0)f0).a)) {
                return false;
            }
            if (this.b == ((c0)f0).b) {
                final c0 c0 = (c0)f0;
                if (this.c == c0.c && this.d == c0.d && this.e == c0.e && this.f == c0.f) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final Double a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int b = this.b;
        int n;
        if (this.c) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        final int d = this.d;
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        final long f = this.f;
        return (((((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ n) * 1000003 ^ d) * 1000003 ^ n2) * 1000003 ^ (int)(f ^ f >>> 32);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append((Object)this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}

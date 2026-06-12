package n3;

public final class a0 extends D0
{
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    
    public a0(final String a, final int b, final int c, final boolean d) {
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
        if (o instanceof D0) {
            final D0 d0 = (D0)o;
            if (this.a.equals((Object)((a0)d0).a)) {
                final a0 a0 = (a0)d0;
                if (this.b == a0.b && this.c == a0.c && this.d == a0.d) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final int c = this.c;
        int n;
        if (this.d) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ n;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}

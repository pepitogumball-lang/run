package t1;

import java.util.Set;

public final class b
{
    public final long a;
    public final long b;
    public final Set c;
    
    public b(final long a, final long b, final Set c) {
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
        if (o instanceof b) {
            final b b2 = (b)o;
            if (this.a != b2.a || this.b != b2.b || !this.c.equals((Object)b2.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        return ((n ^ 0xF4243) * 1000003 ^ (int)(b >>> 32 ^ b)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.a);
        sb.append(", maxAllowedDelay=");
        sb.append(this.b);
        sb.append(", flags=");
        sb.append((Object)this.c);
        sb.append("}");
        return sb.toString();
    }
}

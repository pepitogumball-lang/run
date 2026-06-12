package u1;

import n1.i;
import n1.j;

public final class b
{
    public final long a;
    public final j b;
    public final i c;
    
    public b(final long a, final j b, final i c) {
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
            if (this.a != b2.a || !this.b.equals((Object)b2.b) || !this.c.equals((Object)b2.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (((int)(a >>> 32 ^ a) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.a);
        sb.append(", transportContext=");
        sb.append((Object)this.b);
        sb.append(", event=");
        sb.append((Object)this.c);
        sb.append("}");
        return sb.toString();
    }
}

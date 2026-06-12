package u1;

public final class a
{
    public static final a f;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    
    static {
        f = new a(10485760L, 200, 10000, 604800000L, 81920);
    }
    
    public a(final long a, final int b, final int c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (this.a != a.a || this.b != a.b || this.c != a.c || this.d != a.d || this.e != a.e) {
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
        final int b = this.b;
        final int c = this.c;
        final long d = this.d;
        return ((((n ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return x.a.a(sb, this.e, "}");
    }
}

package k1;

public final class a
{
    public final Object a;
    public final d b;
    public final b c;
    
    public a(final Object a, final d b, final b c) {
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
        if (o instanceof a) {
            final a a = (a)o;
            a.getClass();
            if (this.a.equals(a.a) && this.b.equals(a.b)) {
                final b c = a.c;
                final b c2 = this.c;
                if (c2 == null) {
                    if (c == null) {
                        return b;
                    }
                }
                else if (c2.equals(c)) {
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
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final b c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (((1000003 * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Event{code=null, payload=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append((Object)this.b);
        sb.append(", productData=");
        sb.append((Object)this.c);
        sb.append(", eventContext=null}");
        return sb.toString();
    }
}

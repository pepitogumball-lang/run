package g4;

import n5.h;

public final class t
{
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    
    public t(final String a, final int b, final int c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t)) {
            return false;
        }
        final t t = (t)o;
        return h.a((Object)this.a, (Object)t.a) && this.b == t.b && this.c == t.c && this.d == t.d;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = Integer.hashCode(this.b);
        final int hashCode3 = Integer.hashCode(this.c);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}

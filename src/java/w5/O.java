package w5;

import n5.h;
import m5.l;

public final class o
{
    public final Object a;
    public final l b;
    
    public o(final Object a, final l b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (!(a instanceof o)) {
            return false;
        }
        final o o = (o)a;
        a = o.a;
        return h.a(this.a, a) && h.a((Object)this.b, (Object)o.b);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CompletedWithCancellation(result=");
        sb.append(this.a);
        sb.append(", onCancellation=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}

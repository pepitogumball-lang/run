package h4;

import n5.h;
import k3.j;
import E5.d;

public final class a
{
    public final d a;
    public j b;
    
    public a(final d a) {
        this.a = a;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.a.equals(a.a) && h.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final j b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Dependency(mutex=");
        sb.append((Object)this.a);
        sb.append(", subscriber=");
        sb.append((Object)this.b);
        sb.append(')');
        return sb.toString();
    }
}

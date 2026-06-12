package k3;

import n5.h;

public final class y
{
    public final String a;
    public final String b;
    
    public y(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return h.a((Object)this.a, (Object)y.a) && h.a((Object)this.b, (Object)y.b);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final String a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.a);
        sb.append(", authToken=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}

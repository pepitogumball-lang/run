package k3;

import x.a;

public final class b
{
    public final String a;
    public final String b;
    public final String c;
    
    public b(final String a, final String b, final String c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof b) {
            final b b2 = (b)o;
            if (this.a.equals((Object)b2.a)) {
                final String b3 = b2.b;
                final String b4 = this.b;
                if (b4 == null) {
                    if (b3 != null) {
                        return false;
                    }
                }
                else if (!b4.equals((Object)b3)) {
                    return false;
                }
                final String c = b2.c;
                final String c2 = this.c;
                if (c2 == null) {
                    if (c == null) {
                        return b;
                    }
                }
                else if (c2.equals((Object)c)) {
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
        int hashCode2 = 0;
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return x.a.b(sb, this.c, "}");
    }
}

package m1;

import java.util.ArrayList;

public final class t extends F
{
    public final long a;
    public final long b;
    public final n c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    
    public t(final long a, final long b, final n c, final Integer d, final String e, final ArrayList f) {
        final J c2 = J.C;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof F) {
            final t t = (t)o;
            if (this.a == t.a && this.b == t.b && this.c.equals(t.c)) {
                final Integer d = t.d;
                final Integer d2 = this.d;
                if (d2 == null) {
                    if (d != null) {
                        return false;
                    }
                }
                else if (!d2.equals((Object)d)) {
                    return false;
                }
                final String e = t.e;
                final String e2 = this.e;
                if (e2 == null) {
                    if (e != null) {
                        return false;
                    }
                }
                else if (!e2.equals((Object)e)) {
                    return false;
                }
                if (this.f.equals((Object)t.f)) {
                    final J c = J.C;
                    if (c.equals(c)) {
                        return b;
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final int hashCode = this.c.hashCode();
        int hashCode2 = 0;
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode) * 1000003 ^ hashCode3) * 1000003 ^ hashCode2) * 1000003 ^ this.f.hashCode()) * 1000003 ^ J.C.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.a);
        sb.append(", requestUptimeMs=");
        sb.append(this.b);
        sb.append(", clientInfo=");
        sb.append((Object)this.c);
        sb.append(", logSource=");
        sb.append((Object)this.d);
        sb.append(", logSourceName=");
        sb.append(this.e);
        sb.append(", logEvents=");
        sb.append((Object)this.f);
        sb.append(", qosTier=");
        sb.append((Object)J.C);
        sb.append("}");
        return sb.toString();
    }
}

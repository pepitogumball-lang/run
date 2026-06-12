package m1;

import java.util.Arrays;

public final class s extends E
{
    public final long a;
    public final Integer b;
    public final o c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final v h;
    public final p i;
    
    public s(final long a, final Integer b, final o c, final long d, final byte[] e, final String f, final long g, final v h, final p i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof E) {
            final E e = (E)o;
            final s s = (s)e;
            if (this.a == s.a) {
                final Integer b2 = this.b;
                if (b2 == null) {
                    if (s.b != null) {
                        return false;
                    }
                }
                else if (!b2.equals((Object)s.b)) {
                    return false;
                }
                final o c = this.c;
                if (c == null) {
                    if (s.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(s.c)) {
                    return false;
                }
                if (this.d == s.d) {
                    byte[] array;
                    if (e instanceof s) {
                        array = ((s)e).e;
                    }
                    else {
                        array = s.e;
                    }
                    if (Arrays.equals(this.e, array)) {
                        final String f = s.f;
                        final String f2 = this.f;
                        if (f2 == null) {
                            if (f != null) {
                                return false;
                            }
                        }
                        else if (!f2.equals((Object)f)) {
                            return false;
                        }
                        if (this.g == s.g) {
                            final v h = s.h;
                            final v h2 = this.h;
                            if (h2 == null) {
                                if (h != null) {
                                    return false;
                                }
                            }
                            else if (!h2.equals(h)) {
                                return false;
                            }
                            final p i = s.i;
                            final p j = this.i;
                            if (j == null) {
                                if (i == null) {
                                    return b;
                                }
                            }
                            else if (j.equals(i)) {
                                return b;
                            }
                        }
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
        int hashCode = 0;
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final o c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final long d = this.d;
        final int n2 = (int)(d ^ d >>> 32);
        final int hashCode4 = Arrays.hashCode(this.e);
        final String f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final long g = this.g;
        final int n3 = (int)(g ^ g >>> 32);
        final v h = this.h;
        int hashCode6;
        if (h == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = h.hashCode();
        }
        final p i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return ((((((((n ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ n3) * 1000003 ^ hashCode6) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.a);
        sb.append(", eventCode=");
        sb.append((Object)this.b);
        sb.append(", complianceData=");
        sb.append((Object)this.c);
        sb.append(", eventUptimeMs=");
        sb.append(this.d);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.e));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.f);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.g);
        sb.append(", networkConnectionInfo=");
        sb.append((Object)this.h);
        sb.append(", experimentIds=");
        sb.append((Object)this.i);
        sb.append("}");
        return sb.toString();
    }
}

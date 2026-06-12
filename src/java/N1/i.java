package n1;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public final class i
{
    public final String a;
    public final Integer b;
    public final l c;
    public final long d;
    public final long e;
    public final HashMap f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;
    
    public i(final String a, final Integer b, final l c, final long d, final long e, final HashMap f, final Integer g, final String h, final byte[] i, final byte[] j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final String a(String s) {
        if ((s = (String)this.f.get((Object)s)) == null) {
            s = "";
        }
        return s;
    }
    
    public final int b(String s) {
        s = (String)this.f.get((Object)s);
        int intValue;
        if (s == null) {
            intValue = 0;
        }
        else {
            intValue = Integer.valueOf(s);
        }
        return intValue;
    }
    
    public final h c() {
        final Object o = new Object();
        final String a = this.a;
        if (a == null) {
            throw new NullPointerException("Null transportName");
        }
        ((h)o).a = a;
        ((h)o).b = this.b;
        ((h)o).g = this.g;
        ((h)o).h = this.h;
        ((h)o).i = this.i;
        ((h)o).j = this.j;
        final l c = this.c;
        if (c != null) {
            ((h)o).c = c;
            ((h)o).d = this.d;
            ((h)o).e = this.e;
            ((h)o).f = new HashMap((Map)this.f);
            return (h)o;
        }
        throw new NullPointerException("Null encodedPayload");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (this.a.equals((Object)i.a)) {
                final Integer b2 = i.b;
                final Integer b3 = this.b;
                if (b3 == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b3.equals((Object)b2)) {
                    return false;
                }
                if (this.c.equals(i.c) && this.d == i.d && this.e == i.e && ((Map)this.f).equals((Object)i.f)) {
                    final Integer g = i.g;
                    final Integer g2 = this.g;
                    if (g2 == null) {
                        if (g != null) {
                            return false;
                        }
                    }
                    else if (!g2.equals((Object)g)) {
                        return false;
                    }
                    final String h = i.h;
                    final String h2 = this.h;
                    if (h2 == null) {
                        if (h != null) {
                            return false;
                        }
                    }
                    else if (!h2.equals((Object)h)) {
                        return false;
                    }
                    if (Arrays.equals(this.i, i.i) && Arrays.equals(this.j, i.j)) {
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
        final int hashCode = this.a.hashCode();
        int hashCode2 = 0;
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = this.c.hashCode();
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        final int hashCode5 = ((Map)this.f).hashCode();
        final Integer g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final String h = this.h;
        if (h != null) {
            hashCode2 = h.hashCode();
        }
        return (((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode2) * 1000003 ^ Arrays.hashCode(this.i)) * 1000003 ^ Arrays.hashCode(this.j);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append((Object)this.b);
        sb.append(", encodedPayload=");
        sb.append((Object)this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        sb.append((Object)this.f);
        sb.append(", productId=");
        sb.append((Object)this.g);
        sb.append(", pseudonymousId=");
        sb.append(this.h);
        sb.append(", experimentIdsClear=");
        sb.append(Arrays.toString(this.i));
        sb.append(", experimentIdsEncrypted=");
        sb.append(Arrays.toString(this.j));
        sb.append("}");
        return sb.toString();
    }
}

package i4;

import n5.h;

public final class f
{
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    
    public f(final Boolean a, final Double b, final Integer c, final Integer d, final Long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return h.a((Object)this.a, (Object)f.a) && h.a((Object)this.b, (Object)f.b) && h.a((Object)this.c, (Object)f.c) && h.a((Object)this.d, (Object)f.d) && h.a((Object)this.e, (Object)f.e);
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Boolean a = this.a;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Double b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Long e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SessionConfigs(sessionEnabled=");
        sb.append((Object)this.a);
        sb.append(", sessionSamplingRate=");
        sb.append((Object)this.b);
        sb.append(", sessionRestartTimeout=");
        sb.append((Object)this.c);
        sb.append(", cacheDuration=");
        sb.append((Object)this.d);
        sb.append(", cacheUpdatedTime=");
        sb.append((Object)this.e);
        sb.append(')');
        return sb.toString();
    }
}

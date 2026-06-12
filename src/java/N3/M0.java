package n3;

import h1.m;

public final class m0
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final m f;
    
    public m0(final String a, final String b, final String c, final String d, final int e, final m f) {
        if (a == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = c;
        if (d != null) {
            this.d = d;
            this.e = e;
            this.f = f;
            return;
        }
        throw new NullPointerException("Null installUuid");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof m0) {
            final m0 m0 = (m0)o;
            if (!this.a.equals((Object)m0.a) || !this.b.equals((Object)m0.b) || !this.c.equals((Object)m0.c) || !this.d.equals((Object)m0.d) || this.e != m0.e || !this.f.equals(m0.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AppData{appIdentifier=");
        sb.append(this.a);
        sb.append(", versionCode=");
        sb.append(this.b);
        sb.append(", versionName=");
        sb.append(this.c);
        sb.append(", installUuid=");
        sb.append(this.d);
        sb.append(", deliveryMechanism=");
        sb.append(this.e);
        sb.append(", developmentPlatformProvider=");
        sb.append((Object)this.f);
        sb.append("}");
        return sb.toString();
    }
}

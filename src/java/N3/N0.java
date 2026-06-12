package n3;

import x.a;

public final class n0
{
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    
    public n0(final int a, final String b, final int c, final long d, final long e, final boolean f, final int g, final String h, final String i) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null model");
        }
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (h == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.h = h;
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null modelClass");
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof n0) {
            final n0 n0 = (n0)o;
            if (this.a != n0.a || !this.b.equals((Object)n0.b) || this.c != n0.c || this.d != n0.d || this.e != n0.e || this.f != n0.f || this.g != n0.g || !this.h.equals((Object)n0.h) || !this.i.equals((Object)n0.i)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        int n3;
        if (this.f) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return x.a.b(sb, this.i, "}");
    }
}

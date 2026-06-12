package I0;

import java.math.BigInteger;
import n5.h;
import H0.a;
import c5.f;

public final class i implements Comparable
{
    public static final i H;
    public final int C;
    public final int D;
    public final int E;
    public final String F;
    public final f G;
    
    static {
        new i(0, 0, 0, "");
        H = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }
    
    public i(final int c, final int d, final int e, final String f) {
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = new f((m5.a)new a(this, 1));
    }
    
    public final int compareTo(Object a) {
        final i i = (i)a;
        h.e("other", (Object)i);
        final Object a2 = this.G.a();
        h.d("<get-bigInteger>(...)", a2);
        final BigInteger bigInteger = (BigInteger)a2;
        a = i.G.a();
        h.d("<get-bigInteger>(...)", a);
        return bigInteger.compareTo((BigInteger)a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof i;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final i i = (i)o;
        final int c = i.C;
        boolean b3 = b2;
        if (this.C == c) {
            b3 = b2;
            if (this.D == i.D) {
                b3 = b2;
                if (this.E == i.E) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return ((527 + this.C) * 31 + this.D) * 31 + this.E;
    }
    
    @Override
    public final String toString() {
        final String f = this.F;
        String f2;
        if (!u5.i.U((CharSequence)f)) {
            f2 = m0.a.f("-", f);
        }
        else {
            f2 = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.C);
        sb.append('.');
        sb.append(this.D);
        sb.append('.');
        return x.a.a(sb, this.E, f2);
    }
}

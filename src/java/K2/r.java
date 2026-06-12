package K2;

import h2.A;

public final class r
{
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;
    
    public r(final String s, final String s2, final long n) {
        this(s, s2, 0L, 0L, 0L, n, 0L, null, null, null, null);
    }
    
    public r(final String a, final String b, final long c, final long d, final long e, final long f, final long g, final Long h, final Long i, final Long j, final Boolean k) {
        A.e(a);
        A.e(b);
        final boolean b2 = false;
        A.b(c >= 0L);
        A.b(d >= 0L);
        A.b(e >= 0L);
        boolean b3 = b2;
        if (g >= 0L) {
            b3 = true;
        }
        A.b(b3);
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
        this.k = k;
    }
    
    public final r a(final long n) {
        return new r(this.a, this.b, this.c, this.d, this.e, n, this.g, this.h, this.i, this.j, this.k);
    }
    
    public final r b(final Long n, final Long n2, Boolean b) {
        if (b != null && !b) {
            b = null;
        }
        return new r(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, n, n2, b);
    }
}

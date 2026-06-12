package r5;

import java.util.Iterator;

public abstract class a implements Iterable, o5.a
{
    public final int C;
    public final int D;
    public final int E;
    
    public a(int c, int d, final int e) {
        if (e == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (e != Integer.MIN_VALUE) {
            this.C = c;
            if (e > 0) {
                if (c < d) {
                    int n = d % e;
                    if (n < 0) {
                        n += e;
                    }
                    c %= e;
                    if (c < 0) {
                        c += e;
                    }
                    c = (n - c) % e;
                    if (c < 0) {
                        c += e;
                    }
                    d -= c;
                }
            }
            else {
                if (e >= 0) {
                    throw new IllegalArgumentException("Step is zero.");
                }
                if (c > d) {
                    final int n2 = -e;
                    c %= n2;
                    if (c < 0) {
                        c += n2;
                    }
                    int n3 = d % n2;
                    if (n3 < 0) {
                        n3 += n2;
                    }
                    c = (c - n3) % n2;
                    if (c < 0) {
                        c += n2;
                    }
                    d += c;
                }
            }
            this.D = d;
            this.E = e;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    
    public final Iterator iterator() {
        return (Iterator)new b(this.C, this.D, this.E);
    }
}

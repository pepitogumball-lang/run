package A;

import java.util.Arrays;

public final class i
{
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;
    
    public final void a(final float n, final int n2) {
        final int f = this.f;
        final int[] d = this.d;
        if (f >= d.length) {
            this.d = Arrays.copyOf(d, d.length * 2);
            final float[] e = this.e;
            this.e = Arrays.copyOf(e, e.length * 2);
        }
        final int[] d2 = this.d;
        final int f2 = this.f;
        d2[f2] = n2;
        final float[] e2 = this.e;
        this.f = f2 + 1;
        e2[f2] = n;
    }
    
    public final void b(final int n, final int n2) {
        final int c = this.c;
        final int[] a = this.a;
        if (c >= a.length) {
            this.a = Arrays.copyOf(a, a.length * 2);
            final int[] b = this.b;
            this.b = Arrays.copyOf(b, b.length * 2);
        }
        final int[] a2 = this.a;
        final int c2 = this.c;
        a2[c2] = n;
        final int[] b2 = this.b;
        this.c = c2 + 1;
        b2[c2] = n2;
    }
    
    public final void c(final int n, final String s) {
        final int i = this.i;
        final int[] g = this.g;
        if (i >= g.length) {
            this.g = Arrays.copyOf(g, g.length * 2);
            final String[] h = this.h;
            this.h = (String[])Arrays.copyOf((Object[])h, h.length * 2);
        }
        final int[] g2 = this.g;
        final int j = this.i;
        g2[j] = n;
        final String[] h2 = this.h;
        this.i = j + 1;
        h2[j] = s;
    }
    
    public final void d(final int n, final boolean b) {
        final int l = this.l;
        final int[] j = this.j;
        if (l >= j.length) {
            this.j = Arrays.copyOf(j, j.length * 2);
            final boolean[] k = this.k;
            this.k = Arrays.copyOf(k, k.length * 2);
        }
        final int[] i = this.j;
        final int m = this.l;
        i[m] = n;
        final boolean[] k2 = this.k;
        this.l = m + 1;
        k2[m] = b;
    }
}

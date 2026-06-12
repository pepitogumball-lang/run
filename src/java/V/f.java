package v;

import java.util.Arrays;

public final class f implements Comparable
{
    public boolean C;
    public int D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public final float[] I;
    public final float[] J;
    public b[] K;
    public int L;
    public int M;
    public int N;
    
    public f(final int n) {
        this.D = -1;
        this.E = -1;
        this.F = 0;
        this.H = false;
        this.I = new float[9];
        this.J = new float[9];
        this.K = new b[16];
        this.L = 0;
        this.M = 0;
        this.N = n;
    }
    
    public final void a(final b b) {
        int n = 0;
        while (true) {
            final int l = this.L;
            if (n >= l) {
                final b[] k = this.K;
                if (l >= k.length) {
                    this.K = (b[])Arrays.copyOf((Object[])k, k.length * 2);
                }
                final b[] i = this.K;
                final int j = this.L;
                i[j] = b;
                this.L = j + 1;
                return;
            }
            if (this.K[n] == b) {
                return;
            }
            ++n;
        }
    }
    
    public final void b(final b b) {
        for (int l = this.L, i = 0; i < l; ++i) {
            if (this.K[i] == b) {
                while (i < l - 1) {
                    final b[] k = this.K;
                    final int n = i + 1;
                    k[i] = k[n];
                    i = n;
                }
                --this.L;
                return;
            }
        }
    }
    
    public final void c() {
        this.N = 5;
        this.F = 0;
        this.D = -1;
        this.E = -1;
        this.G = 0.0f;
        this.H = false;
        for (int l = this.L, i = 0; i < l; ++i) {
            this.K[i] = null;
        }
        this.L = 0;
        this.M = 0;
        this.C = false;
        Arrays.fill(this.J, 0.0f);
    }
    
    public final int compareTo(final Object o) {
        return this.D - ((f)o).D;
    }
    
    public final void d(final c c, final float g) {
        this.G = g;
        this.H = true;
        final int l = this.L;
        this.E = -1;
        for (int i = 0; i < l; ++i) {
            this.K[i].h(c, this, false);
        }
        this.L = 0;
    }
    
    public final void e(final c c, final b b) {
        for (int l = this.L, i = 0; i < l; ++i) {
            this.K[i].i(c, b, false);
        }
        this.L = 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(this.D);
        return sb.toString();
    }
}

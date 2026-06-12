package I5;

import java.util.Arrays;
import java.nio.charset.Charset;

public final class e extends b
{
    public final transient byte[][] H;
    public final transient int[] I;
    
    public e(final a a, final int n) {
        super(null);
        f.a(a.D, 0L, n);
        c c = a.C;
        final int n2 = 0;
        int i;
        int n3;
        int c2;
        int b;
        for (i = 0, n3 = 0; i < n; i += c2 - b, ++n3, c = c.f) {
            c2 = c.c;
            b = c.b;
            if (c2 == b) {
                throw new AssertionError((Object)"s.limit == s.pos");
            }
        }
        this.H = new byte[n3][];
        this.I = new int[n3 * 2];
        c c3 = a.C;
        int n4 = 0;
        int j = n2;
        while (j < n) {
            final byte[][] h = this.H;
            h[n4] = c3.a;
            final int c4 = c3.c;
            final int b2 = c3.b;
            j += c4 - b2;
            if (j > n) {
                j = n;
            }
            final int[] k = this.I;
            k[n4] = j;
            k[h.length + n4] = b2;
            c3.d = true;
            ++n4;
            c3 = c3.f;
        }
    }
    
    @Override
    public final byte c(final int n) {
        final byte[][] h = this.H;
        final int length = h.length;
        final int[] i = this.I;
        f.a(i[length - 1], n, 1L);
        final int j = this.i(n);
        int n2;
        if (j == 0) {
            n2 = 0;
        }
        else {
            n2 = i[j - 1];
        }
        return h[j][n - n2 + i[h.length + j]];
    }
    
    @Override
    public final String d() {
        return this.j().d();
    }
    
    @Override
    public final boolean e(int n, int n2, int i, final byte[] array) {
        if (n >= 0 && n <= this.f() - i && n2 >= 0 && n2 <= array.length - i) {
            final int j = this.i(n);
            int n3 = n;
            int[] k;
            int n4;
            int min;
            byte[][] h;
            int n5;
            byte[] array2;
            Charset a;
            int l;
            for (n = j; i > 0; i -= min, ++n) {
                k = this.I;
                if (n == 0) {
                    n4 = 0;
                }
                else {
                    n4 = k[n - 1];
                }
                min = Math.min(i, k[n] - n4 + n4 - n3);
                h = this.H;
                n5 = k[h.length + n];
                array2 = h[n];
                a = f.a;
                for (l = 0; l < min; ++l) {
                    if (array2[l + (n3 - n4 + n5)] != array[l + n2]) {
                        return false;
                    }
                }
                n3 += min;
                n2 += min;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof b) {
            final b b2 = (b)o;
            if (b2.f() == this.f()) {
                int f = this.f();
                if (this.f() - f >= 0) {
                    int i = this.i(0);
                    int n = 0;
                    int n2 = 0;
                    while (true) {
                        final boolean b3 = b;
                        if (f <= 0) {
                            return b3;
                        }
                        final int[] j = this.I;
                        int n3;
                        if (i == 0) {
                            n3 = 0;
                        }
                        else {
                            n3 = j[i - 1];
                        }
                        final int min = Math.min(f, j[i] - n3 + n3 - n);
                        final byte[][] h = this.H;
                        if (!b2.e(n2, n - n3 + j[h.length + i], min, h[i])) {
                            break;
                        }
                        n += min;
                        n2 += min;
                        f -= min;
                        ++i;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int f() {
        return this.I[this.H.length - 1];
    }
    
    @Override
    public final b g() {
        return this.j().g();
    }
    
    @Override
    public final String h() {
        return this.j().h();
    }
    
    @Override
    public final int hashCode() {
        final int d = super.D;
        if (d != 0) {
            return d;
        }
        final byte[][] h = this.H;
        final int length = h.length;
        int i = 0;
        int d2 = 1;
        int n = 0;
        while (i < length) {
            final byte[] array = h[i];
            final int[] j = this.I;
            final int n2 = j[length + i];
            final int n3 = j[i];
            for (int k = n2; k < n3 - n + n2; ++k) {
                d2 = d2 * 31 + array[k];
            }
            ++i;
            n = n3;
        }
        return super.D = d2;
    }
    
    public final int i(int binarySearch) {
        binarySearch = Arrays.binarySearch(this.I, 0, this.H.length, binarySearch + 1);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        return binarySearch;
    }
    
    public final b j() {
        final byte[][] h = this.H;
        final int length = h.length;
        final int[] i = this.I;
        final byte[] array = new byte[i[length - 1]];
        final int length2 = h.length;
        int j = 0;
        int n = 0;
        while (j < length2) {
            final int n2 = i[length2 + j];
            final int n3 = i[j];
            System.arraycopy((Object)h[j], n2, (Object)array, n, n3 - n);
            ++j;
            n = n3;
        }
        return new b(array);
    }
    
    @Override
    public final String toString() {
        return this.j().toString();
    }
}

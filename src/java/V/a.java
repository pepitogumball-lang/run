package v;

import com.google.android.gms.internal.measurement.L;
import java.util.Arrays;
import w2.e;

public final class a
{
    public int a;
    public final b b;
    public final e c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;
    
    public a(final b b, final e c) {
        this.a = 0;
        this.d = 8;
        this.e = new int[8];
        this.f = new int[8];
        this.g = new float[8];
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final f f, float n, final boolean b) {
        if (n > -0.001f && n < 0.001f) {
            return;
        }
        int h = this.h;
        final b b2 = this.b;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = f.D;
            this.f[0] = -1;
            ++f.M;
            f.a(b2);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int[] e = this.e;
                if (i >= e.length) {
                    this.j = true;
                    this.i = e.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (h != -1 && n2 < this.a) {
            final int n4 = this.e[h];
            final int d = f.D;
            if (n4 == d) {
                final float[] g = this.g;
                final float n5 = n += g[h];
                if (n5 > -0.001f) {
                    n = n5;
                    if (n5 < 0.001f) {
                        n = 0.0f;
                    }
                }
                g[h] = n;
                if (n == 0.0f) {
                    if (h == this.h) {
                        this.h = this.f[h];
                    }
                    else {
                        final int[] f2 = this.f;
                        f2[n3] = f2[h];
                    }
                    if (b) {
                        f.b(b2);
                    }
                    if (this.j) {
                        this.i = h;
                    }
                    --f.M;
                    --this.a;
                }
                return;
            }
            if (n4 < d) {
                n3 = h;
            }
            h = this.f[h];
            ++n2;
        }
        int n6 = this.i;
        if (this.j) {
            final int[] e2 = this.e;
            if (e2[n6] != -1) {
                n6 = e2.length;
            }
        }
        else {
            ++n6;
        }
        final int[] e3 = this.e;
        int n7 = n6;
        if (n6 >= e3.length) {
            n7 = n6;
            if (this.a < e3.length) {
                int n8 = 0;
                while (true) {
                    final int[] e4 = this.e;
                    n7 = n6;
                    if (n8 >= e4.length) {
                        break;
                    }
                    if (e4[n8] == -1) {
                        n7 = n8;
                        break;
                    }
                    ++n8;
                }
            }
        }
        final int[] e5 = this.e;
        int length;
        if ((length = n7) >= e5.length) {
            length = e5.length;
            final int d2 = this.d * 2;
            this.d = d2;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, d2);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = f.D;
        this.g[length] = n;
        if (n3 != -1) {
            final int[] f3 = this.f;
            f3[length] = f3[n3];
            f3[n3] = length;
        }
        else {
            this.f[length] = this.h;
            this.h = length;
        }
        ++f.M;
        f.a(b2);
        ++this.a;
        if (!this.j) {
            ++this.i;
        }
        final int j = this.i;
        final int[] e6 = this.e;
        if (j >= e6.length) {
            this.j = true;
            this.i = e6.length - 1;
        }
    }
    
    public final void b() {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final f f = ((f[])this.c.F)[this.e[h]];
            if (f != null) {
                f.b(this.b);
            }
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }
    
    public final float c(final f f) {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            if (this.e[h] == f.D) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    public final int d() {
        return this.a;
    }
    
    public final f e(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return ((f[])this.c.F)[this.e[h]];
            }
        }
        return null;
    }
    
    public final float f(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    public final void g(final f f, final float n) {
        if (n == 0.0f) {
            this.h(f, true);
            return;
        }
        int h = this.h;
        final b b = this.b;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = f.D;
            this.f[0] = -1;
            ++f.M;
            f.a(b);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int[] e = this.e;
                if (i >= e.length) {
                    this.j = true;
                    this.i = e.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (h != -1 && n2 < this.a) {
            final int n4 = this.e[h];
            final int d = f.D;
            if (n4 == d) {
                this.g[h] = n;
                return;
            }
            if (n4 < d) {
                n3 = h;
            }
            h = this.f[h];
            ++n2;
        }
        int n5 = this.i;
        if (this.j) {
            final int[] e2 = this.e;
            if (e2[n5] != -1) {
                n5 = e2.length;
            }
        }
        else {
            ++n5;
        }
        final int[] e3 = this.e;
        int n6 = n5;
        if (n5 >= e3.length) {
            n6 = n5;
            if (this.a < e3.length) {
                int n7 = 0;
                while (true) {
                    final int[] e4 = this.e;
                    n6 = n5;
                    if (n7 >= e4.length) {
                        break;
                    }
                    if (e4[n7] == -1) {
                        n6 = n7;
                        break;
                    }
                    ++n7;
                }
            }
        }
        final int[] e5 = this.e;
        int length;
        if ((length = n6) >= e5.length) {
            length = e5.length;
            final int d2 = this.d * 2;
            this.d = d2;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, d2);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = f.D;
        this.g[length] = n;
        if (n3 != -1) {
            final int[] f2 = this.f;
            f2[length] = f2[n3];
            f2[n3] = length;
        }
        else {
            this.f[length] = this.h;
            this.h = length;
        }
        ++f.M;
        f.a(b);
        final int a = this.a + 1;
        this.a = a;
        if (!this.j) {
            ++this.i;
        }
        final int[] e6 = this.e;
        if (a >= e6.length) {
            this.j = true;
        }
        if (this.i >= e6.length) {
            this.j = true;
            this.i = e6.length - 1;
        }
    }
    
    public final float h(final f f, final boolean b) {
        int h = this.h;
        if (h == -1) {
            return 0.0f;
        }
        int n = 0;
        int n2 = -1;
        while (h != -1 && n < this.a) {
            if (this.e[h] == f.D) {
                if (h == this.h) {
                    this.h = this.f[h];
                }
                else {
                    final int[] f2 = this.f;
                    f2[n2] = f2[h];
                }
                if (b) {
                    f.b(this.b);
                }
                --f.M;
                --this.a;
                this.e[h] = -1;
                if (this.j) {
                    this.i = h;
                }
                return this.g[h];
            }
            final int n3 = this.f[h];
            ++n;
            n2 = h;
            h = n3;
        }
        return 0.0f;
    }
    
    @Override
    public final String toString() {
        int h = this.h;
        String string = "";
        for (int n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final StringBuilder b = v.e.b(L.i(string, " -> "));
            b.append(this.g[h]);
            b.append(" : ");
            final StringBuilder b2 = v.e.b(b.toString());
            b2.append((Object)((f[])this.c.F)[this.e[h]]);
            string = b2.toString();
        }
        return string;
    }
}

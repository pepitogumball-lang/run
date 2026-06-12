package v;

import java.util.Comparator;
import K2.J0;
import java.util.Arrays;

public final class d extends b
{
    public f[] f;
    public f[] g;
    public int h;
    public f2.d i;
    
    @Override
    public final f d(final boolean[] array) {
        int i = 0;
        int n = -1;
        while (i < this.h) {
            final f[] f = this.f;
            final f d = f[i];
            int n2 = 0;
            Label_0186: {
                if (array[d.D]) {
                    n2 = n;
                }
                else {
                    final f2.d j = this.i;
                    j.D = d;
                    int n3 = 8;
                    if (n == -1) {
                        while (true) {
                            n2 = n;
                            if (n3 < 0) {
                                break Label_0186;
                            }
                            final float n4 = ((f)j.D).J[n3];
                            if (n4 > 0.0f) {
                                n2 = n;
                                break Label_0186;
                            }
                            if (n4 < 0.0f) {
                                break;
                            }
                            --n3;
                        }
                    }
                    else {
                        final f f2 = f[n];
                        while (true) {
                            n2 = n;
                            if (n3 < 0) {
                                break Label_0186;
                            }
                            final float n5 = f2.J[n3];
                            final float n6 = ((f)j.D).J[n3];
                            if (n6 == n5) {
                                --n3;
                            }
                            else {
                                n2 = n;
                                if (n6 < n5) {
                                    break;
                                }
                                break Label_0186;
                            }
                        }
                    }
                    n2 = i;
                }
            }
            ++i;
            n = n2;
        }
        if (n == -1) {
            return null;
        }
        return this.f[n];
    }
    
    @Override
    public final boolean e() {
        return this.h == 0;
    }
    
    @Override
    public final void i(final c c, final b b, final boolean b2) {
        final f a = b.a;
        if (a == null) {
            return;
        }
        final a d = b.d;
        for (int d2 = d.d(), i = 0; i < d2; ++i) {
            final f e = d.e(i);
            final float f = d.f(i);
            final f2.d j = this.i;
            j.D = e;
            final boolean c2 = e.C;
            final float[] k = a.J;
            if (c2) {
                boolean b3 = true;
                for (int l = 0; l < 9; ++l) {
                    final float[] m = ((f)j.D).J;
                    final float n = k[l] * f + m[l];
                    m[l] = n;
                    if (Math.abs(n) < 1.0E-4f) {
                        ((f)j.D).J[l] = 0.0f;
                    }
                    else {
                        b3 = false;
                    }
                }
                if (b3) {
                    ((d)j.E).k((f)j.D);
                }
            }
            else {
                for (int n2 = 0; n2 < 9; ++n2) {
                    final float n3 = k[n2];
                    if (n3 != 0.0f) {
                        float n4;
                        if (Math.abs(n4 = n3 * f) < 1.0E-4f) {
                            n4 = 0.0f;
                        }
                        ((f)j.D).J[n2] = n4;
                    }
                    else {
                        ((f)j.D).J[n2] = 0.0f;
                    }
                }
                this.j(e);
            }
            super.b += b.b * f;
        }
        this.k(a);
    }
    
    public final void j(final f f) {
        final int h = this.h;
        final f[] f2 = this.f;
        if (h + 1 > f2.length) {
            final f[] f3 = (f[])Arrays.copyOf((Object[])f2, f2.length * 2);
            this.f = f3;
            this.g = (f[])Arrays.copyOf((Object[])f3, f3.length * 2);
        }
        final f[] f4 = this.f;
        final int h2 = this.h;
        f4[h2] = f;
        final int h3 = h2 + 1;
        this.h = h3;
        if (h3 > 1 && f4[h2].D > f.D) {
            final int n = 0;
            int n2 = 0;
            int h4;
            while (true) {
                h4 = this.h;
                if (n2 >= h4) {
                    break;
                }
                this.g[n2] = this.f[n2];
                ++n2;
            }
            Arrays.sort((Object[])this.g, 0, h4, (Comparator)new J0(5));
            for (int i = n; i < this.h; ++i) {
                this.f[i] = this.g[i];
            }
        }
        f.C = true;
        f.a(this);
    }
    
    public final void k(final f f) {
        for (int i = 0; i < this.h; ++i) {
            if (this.f[i] == f) {
                int h;
                while (true) {
                    h = this.h;
                    if (i >= h - 1) {
                        break;
                    }
                    final f[] f2 = this.f;
                    final int n = i + 1;
                    f2[i] = f2[n];
                    i = n;
                }
                this.h = h - 1;
                f.C = false;
                return;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(" goal -> (");
        sb.append(super.b);
        sb.append(") : ");
        String s = sb.toString();
        for (int i = 0; i < this.h; ++i) {
            final f d = this.f[i];
            final f2.d j = this.i;
            j.D = d;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append((Object)j);
            sb2.append(" ");
            s = sb2.toString();
        }
        return s;
    }
}

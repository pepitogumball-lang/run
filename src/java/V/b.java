package v;

import com.google.android.gms.internal.measurement.L;
import w2.e;
import java.util.ArrayList;

public class b
{
    public f a;
    public float b;
    public final ArrayList c;
    public final a d;
    public boolean e;
    
    public b(final e e) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.e = false;
        this.d = new a(this, e);
    }
    
    public final void a(final c c, final int n) {
        this.d.g(c.j(n), 1.0f);
        this.d.g(c.j(n), -1.0f);
    }
    
    public final void b(final f f, final f f2, final f f3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.d.g(f, -1.0f);
            this.d.g(f2, 1.0f);
            this.d.g(f3, 1.0f);
        }
        else {
            this.d.g(f, 1.0f);
            this.d.g(f2, -1.0f);
            this.d.g(f3, -1.0f);
        }
    }
    
    public final void c(final f f, final f f2, final f f3, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.d.g(f, -1.0f);
            this.d.g(f2, 1.0f);
            this.d.g(f3, -1.0f);
        }
        else {
            this.d.g(f, 1.0f);
            this.d.g(f2, -1.0f);
            this.d.g(f3, 1.0f);
        }
    }
    
    public f d(final boolean[] array) {
        return this.f(array, null);
    }
    
    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }
    
    public final f f(final boolean[] array, final f f) {
        final int d = this.d.d();
        f f2 = null;
        int i = 0;
        float n = 0.0f;
        while (i < d) {
            final float f3 = this.d.f(i);
            f f4 = f2;
            float n2 = n;
            Label_0142: {
                if (f3 < 0.0f) {
                    final f e = this.d.e(i);
                    if (array != null) {
                        f4 = f2;
                        n2 = n;
                        if (array[e.D]) {
                            break Label_0142;
                        }
                    }
                    f4 = f2;
                    n2 = n;
                    if (e != f) {
                        final int n3 = e.N;
                        if (n3 != 3) {
                            f4 = f2;
                            n2 = n;
                            if (n3 != 4) {
                                break Label_0142;
                            }
                        }
                        f4 = f2;
                        n2 = n;
                        if (f3 < n) {
                            n2 = f3;
                            f4 = e;
                        }
                    }
                }
            }
            ++i;
            f2 = f4;
            n = n2;
        }
        return f2;
    }
    
    public final void g(final f a) {
        final f a2 = this.a;
        if (a2 != null) {
            this.d.g(a2, -1.0f);
            this.a.E = -1;
            this.a = null;
        }
        final float n = this.d.h(a, true) * -1.0f;
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        final a d = this.d;
        for (int h = d.h, n2 = 0; h != -1 && n2 < d.a; h = d.f[h], ++n2) {
            final float[] g = d.g;
            g[h] /= n;
        }
    }
    
    public final void h(final c c, final f f, final boolean b) {
        if (f != null) {
            if (f.H) {
                this.b += f.G * this.d.c(f);
                this.d.h(f, b);
                if (b) {
                    f.b(this);
                }
                if (this.d.d() == 0) {
                    this.e = true;
                    c.a = true;
                }
            }
        }
    }
    
    public void i(final c c, final b b, final boolean b2) {
        final a d = this.d;
        d.getClass();
        final float c2 = d.c(b.a);
        d.h(b.a, b2);
        final a d2 = b.d;
        for (int d3 = d2.d(), i = 0; i < d3; ++i) {
            final f e = d2.e(i);
            d.a(e, d2.c(e) * c2, b2);
        }
        this.b += b.b * c2;
        if (b2) {
            b.a.b(this);
        }
        if (this.a != null && this.d.d() == 0) {
            this.e = true;
            c.a = true;
        }
    }
    
    @Override
    public String toString() {
        String string;
        if (this.a == null) {
            string = "0";
        }
        else {
            final StringBuilder sb = new StringBuilder("");
            sb.append((Object)this.a);
            string = sb.toString();
        }
        String s = L.i(string, " = ");
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder b2 = v.e.b(s);
            b2.append(this.b);
            s = b2.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.d.d()) {
            final f e = this.d.e(i);
            if (e != null) {
                final float f = this.d.f(i);
                final float n2 = fcmpl(f, 0.0f);
                if (n2 != 0) {
                    final String string2 = e.toString();
                    String s2 = null;
                    float n3 = 0.0f;
                    Label_0225: {
                        if (n == 0) {
                            s2 = s;
                            n3 = f;
                            if (f >= 0.0f) {
                                break Label_0225;
                            }
                            s2 = L.i(s, "- ");
                        }
                        else {
                            if (n2 > 0) {
                                s2 = L.i(s, " + ");
                                n3 = f;
                                break Label_0225;
                            }
                            s2 = L.i(s, " - ");
                        }
                        n3 = f * -1.0f;
                    }
                    if (n3 == 1.0f) {
                        s = L.i(s2, string2);
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(s2);
                        sb2.append(n3);
                        sb2.append(" ");
                        sb2.append(string2);
                        s = sb2.toString();
                    }
                    n = 1;
                }
            }
            ++i;
        }
        String j = s;
        if (n == 0) {
            j = L.i(s, "0.0");
        }
        return j;
    }
}

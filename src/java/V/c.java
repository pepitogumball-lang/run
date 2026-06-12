package v;

import java.util.ArrayList;
import java.util.Arrays;
import w2.e;

public final class c
{
    public static boolean p = false;
    public static int q = 1000;
    public boolean a;
    public int b;
    public final d c;
    public int d;
    public int e;
    public b[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final e l;
    public f[] m;
    public int n;
    public b o;
    
    public c() {
        this.a = false;
        this.b = 0;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new f[v.c.q];
        this.n = 0;
        this.f = new b[32];
        this.s();
        final e l = new e(25, false);
        l.D = new N.c();
        l.E = new N.c();
        l.F = new f[32];
        this.l = l;
        final b c = new b(l);
        ((d)c).f = new f[128];
        ((d)c).g = new f[128];
        ((d)c).h = 0;
        ((d)c).i = new f2.d((d)c);
        this.c = (d)c;
        this.o = new b(l);
    }
    
    public static int n(final Object o) {
        final f i = ((x.d)o).i;
        if (i != null) {
            return (int)(i.G + 0.5f);
        }
        return 0;
    }
    
    public final f a(int n) {
        final N.c c = (N.c)this.l.E;
        int b = c.b;
        Object o = null;
        if (b > 0) {
            --b;
            final Object[] a = c.a;
            o = a[b];
            a[b] = null;
            c.b = b;
        }
        f f = (f)o;
        if (f == null) {
            f = new f(n);
            f.N = n;
        }
        else {
            f.c();
            f.N = n;
        }
        n = this.n;
        final int q = v.c.q;
        if (n >= q) {
            n = (v.c.q = q * 2);
            this.m = (f[])Arrays.copyOf((Object[])this.m, n);
        }
        final f[] m = this.m;
        n = this.n++;
        return m[n] = f;
    }
    
    public final void b(final f f, final f f2, final int n, final float n2, final f f3, final f f4, final int n3, final int n4) {
        final b l = this.l();
        if (f2 == f3) {
            l.d.g(f, 1.0f);
            l.d.g(f4, 1.0f);
            l.d.g(f2, -2.0f);
        }
        else if (n2 == 0.5f) {
            l.d.g(f, 1.0f);
            l.d.g(f2, -1.0f);
            l.d.g(f3, -1.0f);
            l.d.g(f4, 1.0f);
            if (n > 0 || n3 > 0) {
                l.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            l.d.g(f, -1.0f);
            l.d.g(f2, 1.0f);
            l.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            l.d.g(f4, -1.0f);
            l.d.g(f3, 1.0f);
            l.b = (float)(-n3);
        }
        else {
            final a d = l.d;
            final float n5 = 1.0f - n2;
            d.g(f, n5 * 1.0f);
            l.d.g(f2, n5 * -1.0f);
            l.d.g(f3, -1.0f * n2);
            l.d.g(f4, 1.0f * n2);
            if (n > 0 || n3 > 0) {
                l.b = n3 * n2 + -n * n5;
            }
        }
        if (n4 != 8) {
            l.a(this, n4);
        }
        this.c(l);
    }
    
    public final void c(final b b) {
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            this.o();
        }
        boolean b5 = false;
        Label_1107: {
            if (!b.e) {
                if (this.f.length != 0) {
                    int i = 0;
                    while (i == 0) {
                        final int d = b.d.d();
                        int n = 0;
                        ArrayList c;
                        while (true) {
                            c = b.c;
                            if (n >= d) {
                                break;
                            }
                            final f e = b.d.e(n);
                            if (e.E != -1 || e.H) {
                                c.add((Object)e);
                            }
                            ++n;
                        }
                        final int size = c.size();
                        if (size > 0) {
                            for (int j = 0; j < size; ++j) {
                                final f f = (f)c.get(j);
                                if (f.H) {
                                    b.h(this, f, true);
                                }
                                else {
                                    b.i(this, this.f[f.E], true);
                                }
                            }
                            c.clear();
                        }
                        else {
                            i = 1;
                        }
                    }
                    if (b.a != null && b.d.d() == 0) {
                        b.e = true;
                        this.a = true;
                    }
                }
                if (b.e()) {
                    return;
                }
                final float b2 = b.b;
                if (b2 < 0.0f) {
                    b.b = b2 * -1.0f;
                    final a d2 = b.d;
                    for (int h = d2.h, n2 = 0; h != -1 && n2 < d2.a; h = d2.f[h], ++n2) {
                        final float[] g = d2.g;
                        g[h] *= -1.0f;
                    }
                }
                final int d3 = b.d.d();
                float n3 = 0.0f;
                float n4 = 0.0f;
                f f2 = null;
                f f3 = null;
                int k = 0;
                int n5 = 0;
                int n6 = 0;
                while (k < d3) {
                    final float f4 = b.d.f(k);
                    final f e2 = b.d.e(k);
                    f f5 = null;
                    f f6 = null;
                    float n7 = 0.0f;
                    int n8 = 0;
                    float n9 = 0.0f;
                    int n10 = 0;
                    Label_0714: {
                        if (e2.N == 1) {
                            while (true) {
                                Label_0527: {
                                    if (f2 == null) {
                                        if (e2.M <= 1) {
                                            break Label_0527;
                                        }
                                    }
                                    else if (n3 > f4) {
                                        if (e2.M <= 1) {
                                            break Label_0527;
                                        }
                                    }
                                    else {
                                        f5 = f2;
                                        f6 = f3;
                                        n7 = n3;
                                        n8 = n5;
                                        n9 = n4;
                                        n10 = n6;
                                        if (n5 != 0) {
                                            break Label_0714;
                                        }
                                        f5 = f2;
                                        f6 = f3;
                                        n7 = n3;
                                        n8 = n5;
                                        n9 = n4;
                                        n10 = n6;
                                        if (e2.M <= 1) {
                                            break Label_0527;
                                        }
                                        break Label_0714;
                                    }
                                    final int n11 = 0;
                                    f5 = e2;
                                    n7 = f4;
                                    f6 = f3;
                                    n8 = n11;
                                    n9 = n4;
                                    n10 = n6;
                                    break Label_0714;
                                }
                                final int n11 = 1;
                                continue;
                            }
                        }
                        f5 = f2;
                        f6 = f3;
                        n7 = n3;
                        n8 = n5;
                        n9 = n4;
                        n10 = n6;
                        if (f2 == null) {
                            f5 = f2;
                            f6 = f3;
                            n7 = n3;
                            n8 = n5;
                            n9 = n4;
                            n10 = n6;
                            if (f4 < 0.0f) {
                                while (true) {
                                    Label_0708: {
                                        if (f3 == null) {
                                            if (e2.M <= 1) {
                                                break Label_0708;
                                            }
                                        }
                                        else if (n4 > f4) {
                                            if (e2.M <= 1) {
                                                break Label_0708;
                                            }
                                        }
                                        else {
                                            f5 = f2;
                                            f6 = f3;
                                            n7 = n3;
                                            n8 = n5;
                                            n9 = n4;
                                            if ((n10 = n6) != 0) {
                                                break Label_0714;
                                            }
                                            f5 = f2;
                                            f6 = f3;
                                            n7 = n3;
                                            n8 = n5;
                                            n9 = n4;
                                            n10 = n6;
                                            if (e2.M <= 1) {
                                                break Label_0708;
                                            }
                                            break Label_0714;
                                        }
                                        n10 = 0;
                                        n9 = f4;
                                        f5 = f2;
                                        f6 = e2;
                                        n7 = n3;
                                        n8 = n5;
                                        break Label_0714;
                                    }
                                    n10 = 1;
                                    continue;
                                }
                            }
                        }
                    }
                    ++k;
                    f2 = f5;
                    f3 = f6;
                    n3 = n7;
                    n5 = n8;
                    n4 = n9;
                    n6 = n10;
                }
                if (f2 == null) {
                    f2 = f3;
                }
                boolean b3;
                if (f2 == null) {
                    b3 = true;
                }
                else {
                    b.g(f2);
                    b3 = false;
                }
                if (b.d.d() == 0) {
                    b.e = true;
                }
                boolean b4 = false;
                Label_1063: {
                    if (b3) {
                        if (this.i + 1 >= this.e) {
                            this.o();
                        }
                        final f a = this.a(3);
                        final int n12 = this.b + 1;
                        this.b = n12;
                        ++this.i;
                        a.D = n12;
                        final e l = this.l;
                        ((f[])l.F)[n12] = a;
                        b.a = a;
                        final int m = this.j;
                        this.h(b);
                        if (this.j == m + 1) {
                            final b o = this.o;
                            o.a = null;
                            o.d.b();
                            for (int n13 = 0; n13 < b.d.d(); ++n13) {
                                o.d.a(b.d.e(n13), b.d.f(n13), true);
                            }
                            this.r(this.o);
                            if (a.E == -1) {
                                if (b.a == a) {
                                    final f f7 = b.f(null, a);
                                    if (f7 != null) {
                                        b.g(f7);
                                    }
                                }
                                if (!b.e) {
                                    b.a.e(this, b);
                                }
                                ((N.c)l.D).a(b);
                                --this.j;
                            }
                            b4 = true;
                            break Label_1063;
                        }
                    }
                    b4 = false;
                }
                final f a2 = b.a;
                if (a2 != null) {
                    b5 = b4;
                    if (a2.N == 1) {
                        break Label_1107;
                    }
                    if (b.b >= 0.0f) {
                        b5 = b4;
                        break Label_1107;
                    }
                }
                return;
            }
            else {
                b5 = false;
            }
        }
        if (!b5) {
            this.h(b);
        }
    }
    
    public final void d(f a, int i) {
        final int e = a.E;
        if (e == -1) {
            a.d(this, (float)i);
            for (i = 0; i < this.b + 1; ++i) {
                a = ((f[])this.l.F)[i];
            }
            return;
        }
        if (e != -1) {
            final b b = this.f[e];
            if (b.e) {
                b.b = (float)i;
            }
            else if (b.d.d() == 0) {
                b.e = true;
                b.b = (float)i;
            }
            else {
                final b l = this.l();
                if (i < 0) {
                    l.b = (float)(i * -1);
                    l.d.g(a, 1.0f);
                }
                else {
                    l.b = (float)i;
                    l.d.g(a, -1.0f);
                }
                this.c(l);
            }
        }
        else {
            final b j = this.l();
            j.a = a;
            final float n = (float)i;
            a.G = n;
            j.b = n;
            j.e = true;
            this.c(j);
        }
    }
    
    public final void e(final f f, final f f2, final int n, final int n2) {
        if (n2 == 8 && f2.H && f.E == -1) {
            f.d(this, f2.G + n);
            return;
        }
        final b l = this.l();
        int n3 = 0;
        final int n4 = 0;
        if (n != 0) {
            n3 = n4;
            int n5;
            if ((n5 = n) < 0) {
                n5 = n * -1;
                n3 = 1;
            }
            l.b = (float)n5;
        }
        if (n3 == 0) {
            l.d.g(f, -1.0f);
            l.d.g(f2, 1.0f);
        }
        else {
            l.d.g(f, 1.0f);
            l.d.g(f2, -1.0f);
        }
        if (n2 != 8) {
            l.a(this, n2);
        }
        this.c(l);
    }
    
    public final void f(f j, final f f, int n, final int n2) {
        final b l = this.l();
        final f m = this.m();
        m.F = 0;
        l.b(j, f, m, n);
        if (n2 != 8) {
            n = (int)(l.d.c(m) * -1.0f);
            j = this.j(n2);
            l.d.g(j, (float)n);
        }
        this.c(l);
    }
    
    public final void g(f j, final f f, int n, final int n2) {
        final b l = this.l();
        final f m = this.m();
        m.F = 0;
        l.c(j, f, m, n);
        if (n2 != 8) {
            n = (int)(l.d.c(m) * -1.0f);
            j = this.j(n2);
            l.d.g(j, (float)n);
        }
        this.c(l);
    }
    
    public final void h(b b) {
        if (b.e) {
            b.a.d(this, b.b);
        }
        else {
            final b[] f = this.f;
            final int j = this.j;
            f[j] = b;
            final f a = b.a;
            a.E = j;
            this.j = j + 1;
            a.e(this, b);
        }
        if (this.a) {
            int n;
            for (int i = 0; i < this.j; i = n + 1) {
                if (this.f[i] == null) {
                    System.out.println("WTF");
                }
                b = this.f[i];
                n = i;
                if (b != null) {
                    n = i;
                    if (b.e) {
                        b.a.d(this, b.b);
                        ((N.c)this.l.D).a(b);
                        this.f[i] = null;
                        int n3;
                        int n2 = n3 = i + 1;
                        int k;
                        while (true) {
                            k = this.j;
                            if (n2 >= k) {
                                break;
                            }
                            final b[] f2 = this.f;
                            final int e = n2 - 1;
                            final b b2 = f2[n2];
                            f2[e] = b2;
                            final f a2 = b2.a;
                            if (a2.E == n2) {
                                a2.E = e;
                            }
                            n3 = n2;
                            ++n2;
                        }
                        if (n3 < k) {
                            this.f[n3] = null;
                        }
                        this.j = k - 1;
                        n = i - 1;
                    }
                }
            }
            this.a = false;
        }
    }
    
    public final void i() {
        for (int i = 0; i < this.j; ++i) {
            final b b = this.f[i];
            b.a.G = b.b;
        }
    }
    
    public final f j(final int f) {
        if (this.i + 1 >= this.e) {
            this.o();
        }
        final f a = this.a(4);
        final int n = this.b + 1;
        this.b = n;
        ++this.i;
        a.D = n;
        a.F = f;
        ((f[])this.l.F)[n] = a;
        final d c = this.c;
        c.i.D = a;
        final float[] j = a.J;
        Arrays.fill(j, 0.0f);
        j[a.F] = 1.0f;
        c.j(a);
        return a;
    }
    
    public final f k(final Object o) {
        f f = null;
        if (o == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            this.o();
        }
        if (o instanceof x.d) {
            final x.d d = (x.d)o;
            f f2;
            if ((f2 = d.i) == null) {
                d.h();
                f2 = d.i;
            }
            final int d2 = f2.D;
            final e l = this.l;
            if (d2 != -1 && d2 <= this.b) {
                f = f2;
                if (((f[])l.F)[d2] != null) {
                    return f;
                }
            }
            if (d2 != -1) {
                f2.c();
            }
            final int n = this.b + 1;
            this.b = n;
            ++this.i;
            f2.D = n;
            f2.N = 1;
            ((f[])l.F)[n] = f2;
            f = f2;
        }
        return f;
    }
    
    public final b l() {
        final e l = this.l;
        final N.c c = (N.c)l.D;
        int b = c.b;
        Object o;
        if (b > 0) {
            --b;
            final Object[] a = c.a;
            o = a[b];
            a[b] = null;
            c.b = b;
        }
        else {
            o = null;
        }
        b b2 = (b)o;
        if (b2 == null) {
            b2 = new b(l);
        }
        else {
            b2.a = null;
            b2.d.b();
            b2.b = 0.0f;
            b2.e = false;
        }
        return b2;
    }
    
    public final f m() {
        if (this.i + 1 >= this.e) {
            this.o();
        }
        final f a = this.a(3);
        final int n = this.b + 1;
        this.b = n;
        ++this.i;
        a.D = n;
        return ((f[])this.l.F)[n] = a;
    }
    
    public final void o() {
        final int d = this.d * 2;
        this.d = d;
        this.f = (b[])Arrays.copyOf((Object[])this.f, d);
        final e l = this.l;
        l.F = Arrays.copyOf((Object[])l.F, this.d);
        final int d2 = this.d;
        this.h = new boolean[d2];
        this.e = d2;
        this.k = d2;
    }
    
    public final void p() {
        final d c = this.c;
        if (c.e()) {
            this.i();
            return;
        }
        if (this.g) {
            for (int i = 0; i < this.j; ++i) {
                if (!this.f[i].e) {
                    this.q(c);
                    return;
                }
            }
            this.i();
        }
        else {
            this.q(c);
        }
    }
    
    public final void q(final d d) {
        for (int i = 0; i < this.j; ++i) {
            final b b = this.f[i];
            if (b.a.N != 1) {
                if (b.b < 0.0f) {
                    int j = 0;
                    int n = 0;
                    while (j == 0) {
                        final int n2 = n + 1;
                        float n3 = Float.MAX_VALUE;
                        int e = -1;
                        int d2 = -1;
                        int k = 0;
                        int n4 = 0;
                        while (k < this.j) {
                            final b b2 = this.f[k];
                            float n5;
                            int n6;
                            int n7;
                            int n8;
                            if (b2.a.N == 1) {
                                n5 = n3;
                                n6 = e;
                                n7 = d2;
                                n8 = n4;
                            }
                            else if (b2.e) {
                                n5 = n3;
                                n6 = e;
                                n7 = d2;
                                n8 = n4;
                            }
                            else {
                                n5 = n3;
                                n6 = e;
                                n7 = d2;
                                n8 = n4;
                                if (b2.b < 0.0f) {
                                    final int d3 = b2.d.d();
                                    int n9 = 0;
                                    while (true) {
                                        n5 = n3;
                                        n6 = e;
                                        n7 = d2;
                                        n8 = n4;
                                        if (n9 >= d3) {
                                            break;
                                        }
                                        final f e2 = b2.d.e(n9);
                                        final float c = b2.d.c(e2);
                                        float n10;
                                        int n11;
                                        int n12;
                                        int n13;
                                        if (c <= 0.0f) {
                                            n10 = n3;
                                            n11 = e;
                                            n12 = d2;
                                            n13 = n4;
                                        }
                                        else {
                                            final int n14 = 0;
                                            int n15 = e;
                                            int n16 = n14;
                                            while (true) {
                                                n10 = n3;
                                                n11 = n15;
                                                n12 = d2;
                                                n13 = n4;
                                                if (n16 >= 9) {
                                                    break;
                                                }
                                                final float n17 = e2.I[n16] / c;
                                                int n18;
                                                if ((n17 < n3 && n16 == n4) || n16 > (n18 = n4)) {
                                                    d2 = e2.D;
                                                    n18 = n16;
                                                    n15 = k;
                                                    n3 = n17;
                                                }
                                                ++n16;
                                                n4 = n18;
                                            }
                                        }
                                        ++n9;
                                        n3 = n10;
                                        e = n11;
                                        d2 = n12;
                                        n4 = n13;
                                    }
                                }
                            }
                            ++k;
                            n3 = n5;
                            e = n6;
                            d2 = n7;
                            n4 = n8;
                        }
                        if (e != -1) {
                            final b b3 = this.f[e];
                            b3.a.E = -1;
                            b3.g(((f[])this.l.F)[d2]);
                            final f a = b3.a;
                            a.E = e;
                            a.e(this, b3);
                        }
                        else {
                            j = 1;
                        }
                        if (n2 > this.i / 2) {
                            j = 1;
                        }
                        n = n2;
                    }
                    break;
                }
            }
        }
        this.r(d);
        this.i();
    }
    
    public final void r(final b b) {
        for (int i = 0; i < this.i; ++i) {
            this.h[i] = false;
        }
        int j = 0;
        int n = 0;
        while (j == 0) {
            final int n2 = n + 1;
            if (n2 >= this.i * 2) {
                return;
            }
            final f a = b.a;
            if (a != null) {
                this.h[a.D] = true;
            }
            final f d = b.d(this.h);
            if (d != null) {
                final boolean[] h = this.h;
                final int d2 = d.D;
                if (h[d2]) {
                    return;
                }
                h[d2] = true;
            }
            int n8;
            if (d != null) {
                float n3 = Float.MAX_VALUE;
                int k = 0;
                int e = -1;
                while (k < this.j) {
                    final b b2 = this.f[k];
                    float n4;
                    int n5;
                    if (b2.a.N == 1) {
                        n4 = n3;
                        n5 = e;
                    }
                    else if (b2.e) {
                        n4 = n3;
                        n5 = e;
                    }
                    else {
                        final a d3 = b2.d;
                        int h2 = d3.h;
                        boolean b3 = false;
                        Label_0274: {
                            if (h2 != -1) {
                                for (int n6 = 0; h2 != -1 && n6 < d3.a; h2 = d3.f[h2], ++n6) {
                                    if (d3.e[h2] == d.D) {
                                        b3 = true;
                                        break Label_0274;
                                    }
                                }
                            }
                            b3 = false;
                        }
                        n4 = n3;
                        n5 = e;
                        if (b3) {
                            final float c = b2.d.c(d);
                            n4 = n3;
                            n5 = e;
                            if (c < 0.0f) {
                                final float n7 = -b2.b / c;
                                n4 = n3;
                                n5 = e;
                                if (n7 < n3) {
                                    n4 = n7;
                                    n5 = k;
                                }
                            }
                        }
                    }
                    ++k;
                    n3 = n4;
                    e = n5;
                }
                n8 = j;
                if (e > -1) {
                    final b b4 = this.f[e];
                    b4.a.E = -1;
                    b4.g(d);
                    final f a2 = b4.a;
                    a2.E = e;
                    a2.e(this, b4);
                    n8 = j;
                }
            }
            else {
                n8 = 1;
            }
            j = n8;
            n = n2;
        }
    }
    
    public final void s() {
        for (int i = 0; i < this.j; ++i) {
            final b b = this.f[i];
            if (b != null) {
                ((N.c)this.l.D).a(b);
            }
            this.f[i] = null;
        }
    }
    
    public final void t() {
        int n = 0;
        e l;
        while (true) {
            l = this.l;
            final f[] array = (f[])l.F;
            if (n >= array.length) {
                break;
            }
            final f f = array[n];
            if (f != null) {
                f.c();
            }
            ++n;
        }
        final N.c c = (N.c)l.E;
        final f[] m = this.m;
        final int n2 = this.n;
        c.getClass();
        int length;
        if ((length = n2) > m.length) {
            length = m.length;
        }
        for (final f f2 : m) {
            final int b = c.b;
            final Object[] a = c.a;
            if (b < a.length) {
                a[b] = f2;
                c.b = b + 1;
            }
        }
        this.n = 0;
        Arrays.fill((Object[])l.F, (Object)null);
        this.b = 0;
        final d c2 = this.c;
        c2.h = 0;
        c2.b = 0.0f;
        this.i = 1;
        for (int j = 0; j < this.j; ++j) {
            final b b2 = this.f[j];
        }
        this.s();
        this.j = 0;
        this.o = new b(l);
    }
}

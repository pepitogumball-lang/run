package y;

import java.util.Iterator;
import java.util.HashSet;
import x.d;
import java.util.ArrayList;
import x.f;
import x.e;

public abstract class g
{
    public static final b a;
    
    static {
        a = (b)new Object();
    }
    
    public static boolean a(final e e) {
        final int[] o0 = e.o0;
        final boolean b = false;
        final int n = o0[0];
        final int n2 = o0[1];
        final e s = e.S;
        f f;
        if (s != null) {
            f = (f)s;
        }
        else {
            f = null;
        }
        if (f != null) {
            final int n3 = f.o0[0];
        }
        if (f != null) {
            final int n4 = f.o0[1];
        }
        final boolean b2 = n == 1 || e.y() || n == 2 || (n == 3 && e.r == 0 && e.V == 0.0f && e.r(0)) || (n == 3 && e.r == 1 && e.s(0, e.o()));
        final boolean b3 = n2 == 1 || e.z() || n2 == 2 || (n2 == 3 && e.s == 0 && e.V == 0.0f && e.r(1)) || (n2 == 3 && e.s == 1 && e.s(1, e.i()));
        if (e.V > 0.0f && (b2 || b3)) {
            return true;
        }
        boolean b4 = b;
        if (b2) {
            b4 = b;
            if (b3) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public static m b(final e e, final int c, final ArrayList list, m m) {
        int n;
        if (c == 0) {
            n = e.m0;
        }
        else {
            n = e.n0;
        }
        final int n2 = 0;
        Object o;
        if (n != -1 && (m == null || n != m.b)) {
            int n3 = 0;
            while (true) {
                o = m;
                if (n3 >= list.size()) {
                    break;
                }
                o = list.get(n3);
                if (((m)o).b == n) {
                    if (m != null) {
                        m.c(c, (m)o);
                        list.remove((Object)m);
                    }
                    break;
                }
                ++n3;
            }
        }
        else {
            o = m;
            if (n != -1) {
                return m;
            }
        }
        if ((m = (m)o) == null) {
            m = (m)o;
            Label_0268: {
                if (e instanceof x.b) {
                    final x.b b = (x.b)e;
                    int i = 0;
                Label_0216:
                    while (true) {
                        while (i < b.q0) {
                            final e e2 = b.p0[i];
                            if (c == 0) {
                                final int m2 = e2.m0;
                                if (m2 != -1) {
                                    final int n4 = m2;
                                    break Label_0216;
                                }
                            }
                            if (c == 1) {
                                final int n5 = e2.n0;
                                if (n5 != -1) {
                                    final int n4 = n5;
                                    break Label_0216;
                                }
                            }
                            ++i;
                            continue;
                            m = (m)o;
                            int n4 = 0;
                            if (n4 == -1) {
                                break Label_0268;
                            }
                            int n6 = 0;
                            while (true) {
                                m = (m)o;
                                if (n6 >= list.size()) {
                                    break Label_0268;
                                }
                                m = (m)list.get(n6);
                                if (m.b == n4) {
                                    break Label_0268;
                                }
                                ++n6;
                            }
                        }
                        final int n4 = -1;
                        continue Label_0216;
                    }
                }
            }
            Object o2;
            if ((o2 = m) == null) {
                o2 = new Object();
                ((m)o2).a = new ArrayList();
                ((m)o2).d = null;
                ((m)o2).e = -1;
                final int f = m.f;
                m.f = f + 1;
                ((m)o2).b = f;
                ((m)o2).c = c;
            }
            list.add(o2);
            m = (m)o2;
        }
        final ArrayList a = m.a;
        if (!a.contains((Object)e)) {
            a.add((Object)e);
            if (e instanceof x.g) {
                final x.g g = (x.g)e;
                final d s0 = g.s0;
                int n7 = n2;
                if (g.t0 == 0) {
                    n7 = 1;
                }
                s0.b(n7, list, m);
            }
            final int b2 = m.b;
            if (c == 0) {
                e.m0 = b2;
                e.H.b(c, list, m);
                e.J.b(c, list, m);
            }
            else {
                e.n0 = b2;
                e.I.b(c, list, m);
                e.L.b(c, list, m);
                e.K.b(c, list, m);
            }
            e.O.b(c, list, m);
        }
        return m;
    }
    
    public static void c(final int n, final A.f f, final e e, final boolean b) {
        if (e.m) {
            return;
        }
        if (!(e instanceof f) && e.x() && a(e)) {
            f.R(e, f, (b)new Object());
        }
        final d g = e.g(2);
        final d g2 = e.g(4);
        final int c = g.c();
        final int c2 = g2.c();
        final HashSet a = g.a;
        if (a != null && g.c) {
            for (final d d : a) {
                final e d2 = d.d;
                final int n2 = n + 1;
                final boolean a2 = a(d2);
                if (d2.x() && a2) {
                    f.R(d2, f, (b)new Object());
                }
                final d h = d2.H;
                final d j = d2.J;
                boolean b2 = false;
                Label_0240: {
                    Label_0231: {
                        if (d == h) {
                            final d f2 = j.f;
                            if (f2 != null && f2.c) {
                                break Label_0231;
                            }
                        }
                        if (d == j) {
                            final d f3 = h.f;
                            if (f3 != null && f3.c) {
                                break Label_0231;
                            }
                        }
                        b2 = false;
                        break Label_0240;
                    }
                    b2 = true;
                }
                final int n3 = d2.o0[0];
                if (n3 == 3 && !a2) {
                    if (n3 != 3 || d2.v < 0 || d2.u < 0 || (d2.f0 != 8 && (d2.r != 0 || d2.V != 0.0f)) || d2.v() || !b2 || d2.v()) {
                        continue;
                    }
                    e(n2, e, f, d2, b);
                }
                else {
                    if (d2.x()) {
                        continue;
                    }
                    if (d == h && j.f == null) {
                        final int n4 = h.d() + c;
                        d2.F(n4, d2.o() + n4);
                        c(n2, f, d2, b);
                    }
                    else if (d == j && h.f == null) {
                        final int n5 = c - j.d();
                        d2.F(n5 - d2.o(), n5);
                        c(n2, f, d2, b);
                    }
                    else {
                        if (!b2 || d2.v()) {
                            continue;
                        }
                        d(n2, f, d2, b);
                    }
                }
            }
        }
        if (e instanceof x.g) {
            return;
        }
        final HashSet a3 = g2.a;
        if (a3 != null && g2.c) {
            for (final d d3 : a3) {
                final e d4 = d3.d;
                final int n6 = n + 1;
                final boolean a4 = a(d4);
                if (d4.x() && a4) {
                    f.R(d4, f, (b)new Object());
                }
                final d h2 = d4.H;
                final d i = d4.J;
                boolean b3 = false;
                Label_0666: {
                    Label_0657: {
                        if (d3 == h2) {
                            final d f4 = i.f;
                            if (f4 != null && f4.c) {
                                break Label_0657;
                            }
                        }
                        if (d3 == i) {
                            final d f5 = h2.f;
                            if (f5 != null && f5.c) {
                                break Label_0657;
                            }
                        }
                        b3 = false;
                        break Label_0666;
                    }
                    b3 = true;
                }
                final int n7 = d4.o0[0];
                if (n7 != 3 || a4) {
                    if (d4.x()) {
                        continue;
                    }
                    if (d3 == h2 && i.f == null) {
                        final int n8 = h2.d() + c2;
                        d4.F(n8, d4.o() + n8);
                        c(n6, f, d4, b);
                    }
                    else if (d3 == i && h2.f == null) {
                        final int n9 = c2 - i.d();
                        d4.F(n9 - d4.o(), n9);
                        c(n6, f, d4, b);
                    }
                    else {
                        if (!b3 || d4.v()) {
                            continue;
                        }
                        d(n6, f, d4, b);
                    }
                }
                else {
                    if (n7 != 3 || d4.v < 0 || d4.u < 0) {
                        continue;
                    }
                    if (d4.f0 != 8) {
                        if (d4.r != 0) {
                            continue;
                        }
                        if (d4.V != 0.0f) {
                            continue;
                        }
                    }
                    if (d4.v() || !b3 || d4.v()) {
                        continue;
                    }
                    e(n6, e, f, d4, b);
                }
            }
        }
        e.m = true;
    }
    
    public static void d(final int n, final A.f f, final e e, final boolean b) {
        float c0 = e.c0;
        final d h = e.H;
        int c2 = h.f.c();
        final d j = e.J;
        int c3 = j.f.c();
        final int d = h.d();
        final int d2 = j.d();
        if (c2 == c3) {
            c0 = 0.5f;
        }
        else {
            c2 += d;
            c3 -= d2;
        }
        final int o = e.o();
        int n2 = c3 - c2 - o;
        if (c2 > c3) {
            n2 = c2 - c3 - o;
        }
        float n3;
        if (n2 > 0) {
            n3 = c0 * n2 + 0.5f;
        }
        else {
            n3 = c0 * n2;
        }
        final int n4 = (int)n3 + c2;
        int n5 = n4 + o;
        if (c2 > c3) {
            n5 = n4 - o;
        }
        e.F(n4, n5);
        c(n + 1, f, e, b);
    }
    
    public static void e(final int n, final e e, final A.f f, final e e2, final boolean b) {
        final float c0 = e2.c0;
        final d h = e2.H;
        final int n2 = h.d() + h.f.c();
        final d j = e2.J;
        final int n3 = j.f.c() - j.d();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = e2.o();
            if (e2.f0 != 8) {
                final int r = e2.r;
                int n7;
                if (r == 2) {
                    int n6;
                    if (e instanceof f) {
                        n6 = e.o();
                    }
                    else {
                        n6 = e.S.o();
                    }
                    n7 = (int)(e2.c0 * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (r == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(e2.u, n7);
                final int v = e2.v;
                n5 = max;
                if (v > 0) {
                    n5 = Math.min(v, max);
                }
            }
            final int n8 = n2 + (int)(c0 * (n3 - n2 - n5) + 0.5f);
            e2.F(n8, n5 + n8);
            c(n + 1, f, e2, b);
        }
    }
    
    public static void f(final int n, final A.f f, final e e) {
        float d0 = e.d0;
        final d i = e.I;
        int c = i.f.c();
        final d k = e.K;
        int c2 = k.f.c();
        final int d2 = i.d();
        final int d3 = k.d();
        if (c == c2) {
            d0 = 0.5f;
        }
        else {
            c += d2;
            c2 -= d3;
        }
        final int j = e.i();
        int n2 = c2 - c - j;
        if (c > c2) {
            n2 = c - c2 - j;
        }
        float n3;
        if (n2 > 0) {
            n3 = d0 * n2 + 0.5f;
        }
        else {
            n3 = d0 * n2;
        }
        final int n4 = (int)n3;
        int n5 = c + n4;
        int n6 = n5 + j;
        if (c > c2) {
            n5 = c - n4;
            n6 = n5 - j;
        }
        e.G(n5, n6);
        i(n + 1, f, e);
    }
    
    public static void g(final int n, final e e, final A.f f, final e e2) {
        final float d0 = e2.d0;
        final d i = e2.I;
        final int n2 = i.d() + i.f.c();
        final d k = e2.K;
        final int n3 = k.f.c() - k.d();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = e2.i();
            if (e2.f0 != 8) {
                final int s = e2.s;
                int n7;
                if (s == 2) {
                    int n6;
                    if (e instanceof f) {
                        n6 = e.i();
                    }
                    else {
                        n6 = e.S.i();
                    }
                    n7 = (int)(d0 * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (s == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(e2.x, n7);
                final int y = e2.y;
                n5 = max;
                if (y > 0) {
                    n5 = Math.min(y, max);
                }
            }
            final int n8 = n2 + (int)(d0 * (n3 - n2 - n5) + 0.5f);
            e2.G(n8, n5 + n8);
            i(n + 1, f, e2);
        }
    }
    
    public static boolean h(int n, int n2, final int n3, final int n4) {
        if (n3 != 1 && n3 != 2 && (n3 != 4 || n == 2)) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (n4 != 1 && n4 != 2 && (n4 != 4 || n2 == 2)) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        return n != 0 || n2 != 0;
    }
    
    public static void i(final int n, final A.f f, final e e) {
        if (e.n) {
            return;
        }
        if (!(e instanceof f) && e.x() && a(e)) {
            f.R(e, f, (b)new Object());
        }
        final d g = e.g(3);
        final d g2 = e.g(5);
        final int c = g.c();
        final int c2 = g2.c();
        final HashSet a = g.a;
        if (a != null && g.c) {
            for (final d d : a) {
                final e d2 = d.d;
                final int n2 = n + 1;
                final boolean a2 = a(d2);
                if (d2.x() && a2) {
                    f.R(d2, f, (b)new Object());
                }
                final d i = d2.I;
                final d k = d2.K;
                boolean b = false;
                Label_0238: {
                    Label_0231: {
                        if (d == i) {
                            final d f2 = k.f;
                            if (f2 != null && f2.c) {
                                break Label_0231;
                            }
                        }
                        if (d == k) {
                            final d f3 = i.f;
                            if (f3 != null && f3.c) {
                                break Label_0231;
                            }
                        }
                        b = false;
                        break Label_0238;
                    }
                    b = true;
                }
                final int n3 = d2.o0[1];
                if (n3 == 3 && !a2) {
                    if (n3 != 3 || d2.y < 0 || d2.x < 0 || (d2.f0 != 8 && (d2.s != 0 || d2.V != 0.0f)) || d2.w() || !b || d2.w()) {
                        continue;
                    }
                    g(n2, e, f, d2);
                }
                else {
                    if (d2.x()) {
                        continue;
                    }
                    if (d == i && k.f == null) {
                        final int n4 = i.d() + c;
                        d2.G(n4, d2.i() + n4);
                        i(n2, f, d2);
                    }
                    else if (d == k && i.f == null) {
                        final int n5 = c - k.d();
                        d2.G(n5 - d2.i(), n5);
                        i(n2, f, d2);
                    }
                    else {
                        if (!b || d2.w()) {
                            continue;
                        }
                        f(n2, f, d2);
                    }
                }
            }
        }
        if (e instanceof x.g) {
            return;
        }
        final HashSet a3 = g2.a;
        if (a3 != null && g2.c) {
            for (final d d3 : a3) {
                final e d4 = d3.d;
                final int n6 = n + 1;
                final boolean a4 = a(d4);
                if (d4.x() && a4) {
                    f.R(d4, f, (b)new Object());
                }
                final d j = d4.I;
                final d l = d4.K;
                boolean b2 = false;
                Label_0650: {
                    Label_0643: {
                        if (d3 == j) {
                            final d f4 = l.f;
                            if (f4 != null && f4.c) {
                                break Label_0643;
                            }
                        }
                        if (d3 == l) {
                            final d f5 = j.f;
                            if (f5 != null && f5.c) {
                                break Label_0643;
                            }
                        }
                        b2 = false;
                        break Label_0650;
                    }
                    b2 = true;
                }
                final int n7 = d4.o0[1];
                if (n7 != 3 || a4) {
                    if (d4.x()) {
                        continue;
                    }
                    if (d3 == j && l.f == null) {
                        final int n8 = j.d() + c2;
                        d4.G(n8, d4.i() + n8);
                        i(n6, f, d4);
                    }
                    else if (d3 == l && j.f == null) {
                        final int n9 = c2 - l.d();
                        d4.G(n9 - d4.i(), n9);
                        i(n6, f, d4);
                    }
                    else {
                        if (!b2 || d4.w()) {
                            continue;
                        }
                        f(n6, f, d4);
                    }
                }
                else {
                    if (n7 != 3 || d4.y < 0 || d4.x < 0) {
                        continue;
                    }
                    if (d4.f0 != 8) {
                        if (d4.s != 0) {
                            continue;
                        }
                        if (d4.V != 0.0f) {
                            continue;
                        }
                    }
                    if (d4.w() || !b2 || d4.w()) {
                        continue;
                    }
                    g(n6, e, f, d4);
                }
            }
        }
        final d g3 = e.g(6);
        if (g3.a != null && g3.c) {
            final int c3 = g3.c();
            for (final d d5 : g3.a) {
                final e d6 = d5.d;
                final boolean a5 = a(d6);
                if (d6.x() && a5) {
                    f.R(d6, f, (b)new Object());
                }
                if (d6.o0[1] != 3 || a5) {
                    if (d6.x()) {
                        continue;
                    }
                    final d m = d6.L;
                    if (d5 != m) {
                        continue;
                    }
                    final int n10 = d5.d() + c3;
                    if (d6.E) {
                        final int y = n10 - d6.Z;
                        final int u = d6.U;
                        d6.Y = y;
                        d6.I.i(y);
                        d6.K.i(u + y);
                        m.i(n10);
                        d6.l = true;
                    }
                    i(n + 1, f, d6);
                }
            }
        }
        e.n = true;
    }
}

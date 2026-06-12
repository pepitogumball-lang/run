package x;

import java.lang.ref.Reference;
import java.io.PrintStream;
import y.m;
import y.n;
import java.util.Iterator;
import java.util.Arrays;
import k3.v;
import java.util.ArrayList;
import y.b;
import java.util.HashSet;
import java.lang.ref.WeakReference;

public final class f extends e
{
    public c[] A0;
    public c[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public HashSet J0;
    public b K0;
    public ArrayList p0;
    public w2.e q0;
    public v r0;
    public int s0;
    public A.f t0;
    public boolean u0;
    public v.c v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;
    
    public static void R(final e e, final A.f f, final b b) {
        if (f == null) {
            return;
        }
        if (e.f0 != 8 && !(e instanceof g) && !(e instanceof x.b)) {
            final int[] o0 = e.o0;
            b.a = o0[0];
            boolean e2 = true;
            b.b = o0[1];
            b.c = e.o();
            b.d = e.i();
            b.i = false;
            b.j = 0;
            final boolean b2 = b.a == 3;
            final boolean b3 = b.b == 3;
            final boolean b4 = b2 && e.V > 0.0f;
            final boolean b5 = b3 && e.V > 0.0f;
            int n;
            if ((n = (b2 ? 1 : 0)) != 0) {
                n = (b2 ? 1 : 0);
                if (e.r(0)) {
                    n = (b2 ? 1 : 0);
                    if (e.r == 0) {
                        n = (b2 ? 1 : 0);
                        if (!b4) {
                            b.a = 2;
                            if (b3 && e.s == 0) {
                                b.a = 1;
                            }
                            n = 0;
                        }
                    }
                }
            }
            boolean b6;
            if (b6 = b3) {
                b6 = b3;
                if (e.r(1)) {
                    b6 = b3;
                    if (e.s == 0) {
                        b6 = b3;
                        if (!b5) {
                            b.b = 2;
                            if (n != 0 && e.r == 0) {
                                b.b = 1;
                            }
                            b6 = false;
                        }
                    }
                }
            }
            if (e.y()) {
                b.a = 1;
                n = 0;
            }
            if (e.z()) {
                b.b = 1;
                b6 = false;
            }
            final int[] t = e.t;
            if (b4) {
                if (t[0] == 4) {
                    b.a = 1;
                }
                else if (!b6) {
                    int n2;
                    if (b.b == 1) {
                        n2 = b.d;
                    }
                    else {
                        b.a = 2;
                        f.b(e, b);
                        n2 = b.f;
                    }
                    b.a = 1;
                    b.c = (int)(e.V * n2);
                }
            }
            if (b5) {
                if (t[1] == 4) {
                    b.b = 1;
                }
                else if (n == 0) {
                    int n3;
                    if (b.a == 1) {
                        n3 = b.c;
                    }
                    else {
                        b.b = 2;
                        f.b(e, b);
                        n3 = b.e;
                    }
                    b.b = 1;
                    if (e.W == -1) {
                        b.d = (int)(n3 / e.V);
                    }
                    else {
                        b.d = (int)(e.V * n3);
                    }
                }
            }
            f.b(e, b);
            e.K(b.e);
            e.H(b.f);
            e.E = b.h;
            if ((e.Z = b.g) <= 0) {
                e2 = false;
            }
            e.E = e2;
            b.j = 0;
            return;
        }
        b.e = 0;
        b.f = 0;
    }
    
    @Override
    public final void A() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.A();
    }
    
    @Override
    public final void C(final w2.e e) {
        super.C(e);
        for (int size = this.p0.size(), i = 0; i < size; ++i) {
            ((e)this.p0.get(i)).C(e);
        }
    }
    
    @Override
    public final void L(final boolean b, final boolean b2) {
        super.L(b, b2);
        for (int size = this.p0.size(), i = 0; i < size; ++i) {
            ((e)this.p0.get(i)).L(b, b2);
        }
    }
    
    public final void N(final e e, int n) {
        if (n == 0) {
            n = this.y0;
            final c[] b0 = this.B0;
            if (n + 1 >= b0.length) {
                this.B0 = (c[])Arrays.copyOf((Object[])b0, b0.length * 2);
            }
            final c[] b2 = this.B0;
            n = this.y0;
            b2[n] = new c(e, 0, this.u0);
            this.y0 = n + 1;
        }
        else if (n == 1) {
            n = this.z0;
            final c[] a0 = this.A0;
            if (n + 1 >= a0.length) {
                this.A0 = (c[])Arrays.copyOf((Object[])a0, a0.length * 2);
            }
            final c[] a2 = this.A0;
            n = this.z0;
            a2[n] = new c(e, 1, this.u0);
            this.z0 = n + 1;
        }
    }
    
    public final void O(final v.c c) {
        final boolean s = this.S(64);
        this.b(c, s);
        final int size = this.p0.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final e e = (e)this.p0.get(i);
            final boolean[] r = e.R;
            r[1] = (r[0] = false);
            if (e instanceof x.b) {
                b = true;
            }
            ++i;
        }
        if (b) {
            for (int j = 0; j < size; ++j) {
                final e e2 = (e)this.p0.get(j);
                if (e2 instanceof x.b) {
                    final x.b b2 = (x.b)e2;
                    for (int k = 0; k < b2.q0; ++k) {
                        final e e3 = b2.p0[k];
                        if (b2.s0 || e3.c()) {
                            final int r2 = b2.r0;
                            if (r2 != 0 && r2 != 1) {
                                if (r2 == 2 || r2 == 3) {
                                    e3.R[1] = true;
                                }
                            }
                            else {
                                e3.R[0] = true;
                            }
                        }
                    }
                }
            }
        }
        final HashSet j2 = this.J0;
        j2.clear();
        for (int l = 0; l < size; ++l) {
            final e e4 = (e)this.p0.get(l);
            e4.getClass();
            if (e4 instanceof g) {
                e4.b(c, s);
            }
        }
        while (j2.size() > 0) {
            final int size2 = j2.size();
            final Iterator iterator = j2.iterator();
            if (iterator.hasNext()) {
                iterator.next().getClass();
                throw new ClassCastException();
            }
            if (size2 != j2.size()) {
                continue;
            }
            final Iterator iterator2 = j2.iterator();
            while (iterator2.hasNext()) {
                ((e)iterator2.next()).b(c, s);
            }
            j2.clear();
        }
        if (v.c.p) {
            final HashSet set = new HashSet();
            for (int n = 0; n < size; ++n) {
                final e e5 = (e)this.p0.get(n);
                e5.getClass();
                if (!(e5 instanceof g)) {
                    set.add((Object)e5);
                }
            }
            int n2;
            if (super.o0[0] == 2) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            this.a(this, c, set, n2, false);
            for (final e e6 : set) {
                x.h.b(this, c, e6);
                e6.b(c, s);
            }
        }
        else {
            for (int n3 = 0; n3 < size; ++n3) {
                final e e7 = (e)this.p0.get(n3);
                if (e7 instanceof f) {
                    final int[] o0 = e7.o0;
                    final int n4 = o0[0];
                    final int n5 = o0[1];
                    if (n4 == 2) {
                        e7.I(1);
                    }
                    if (n5 == 2) {
                        e7.J(1);
                    }
                    e7.b(c, s);
                    if (n4 == 2) {
                        e7.I(n4);
                    }
                    if (n5 == 2) {
                        e7.J(n5);
                    }
                }
                else {
                    x.h.b(this, c, e7);
                    if (!(e7 instanceof g)) {
                        e7.b(c, s);
                    }
                }
            }
        }
        if (this.y0 > 0) {
            x.h.a(this, c, null, 0);
        }
        if (this.z0 > 0) {
            x.h.a(this, c, null, 1);
        }
    }
    
    public final boolean P(final int n, final boolean b) {
        final v r0 = this.r0;
        final f f = (f)r0.c;
        final boolean b2 = false;
        final int h = f.h(0);
        final int h2 = f.h(1);
        final int p2 = f.p();
        final int q = f.q();
        final ArrayList list = (ArrayList)r0.e;
        Label_0225: {
            if (b && (h == 2 || h2 == 2)) {
                final Iterator iterator = list.iterator();
                while (true) {
                    n n2;
                    do {
                        final boolean b3 = b;
                        if (iterator.hasNext()) {
                            n2 = (n)iterator.next();
                        }
                        else if (n == 0) {
                            if (b3 && h == 2) {
                                f.I(1);
                                f.K(r0.d(f, 0));
                                f.d.e.d(f.o());
                            }
                            break Label_0225;
                        }
                        else {
                            if (b3 && h2 == 2) {
                                f.J(1);
                                f.H(r0.d(f, 1));
                                f.e.e.d(f.i());
                            }
                            break Label_0225;
                        }
                    } while (n2.f != n || n2.k());
                    final boolean b3 = false;
                    continue;
                }
            }
        }
        final int[] o0 = f.o0;
        boolean b4 = false;
        Label_0358: {
            Label_0313: {
                if (n == 0) {
                    final int n3 = o0[0];
                    if (n3 != 1 && n3 != 4) {
                        break Label_0313;
                    }
                    final int n4 = f.o() + p2;
                    f.d.i.d(n4);
                    f.d.e.d(n4 - p2);
                }
                else {
                    final int n5 = o0[1];
                    if (n5 != 1 && n5 != 4) {
                        break Label_0313;
                    }
                    final int n6 = f.i() + q;
                    f.e.i.d(n6);
                    f.e.e.d(n6 - q);
                }
                b4 = true;
                break Label_0358;
            }
            b4 = false;
        }
        r0.i();
        for (final n n7 : list) {
            if (n7.f != n) {
                continue;
            }
            if (n7.b == f && !n7.g) {
                continue;
            }
            n7.e();
        }
        while (true) {
            for (final n n8 : list) {
                if (n8.f != n) {
                    continue;
                }
                if (!b4 && n8.b == f) {
                    continue;
                }
                boolean b5;
                if (!n8.h.j) {
                    b5 = b2;
                }
                else if (!n8.i.j) {
                    b5 = b2;
                }
                else {
                    if (n8 instanceof y.c || n8.e.j) {
                        continue;
                    }
                    b5 = b2;
                }
                f.I(h);
                f.J(h2);
                return b5;
            }
            boolean b5 = true;
            continue;
        }
    }
    
    public final void Q() {
        int i = 0;
        super.X = 0;
        super.Y = 0;
        this.D0 = false;
        this.E0 = false;
        final int size = this.p0.size();
        final int max = Math.max(0, this.o());
        int n = Math.max(0, this.i());
        Object o = super.o0;
        final int n2 = o[1];
        int n3 = o[0];
        final int s0 = this.s0;
        d j = super.I;
        final d h = super.H;
        int[] array;
        Object o2;
        if (s0 == 0 && x.h.c(this.C0, 1)) {
            final A.f t0 = this.t0;
            final int n4 = o[0];
            final int n5 = o[1];
            this.B();
            final ArrayList p0 = this.p0;
            int size2;
            for (size2 = p0.size(); i < size2; ++i) {
                ((e)p0.get(i)).B();
            }
            final boolean u0 = this.u0;
            if (n4 == 1) {
                this.F(0, this.o());
            }
            else {
                h.i(0);
                super.X = 0;
            }
            int k = 0;
            int n6 = 0;
            int n7 = 0;
            while (k < size2) {
                final e e = (e)p0.get(k);
                int n8;
                int n9;
                if (e instanceof g) {
                    final g g = (g)e;
                    n8 = n6;
                    n9 = n7;
                    if (g.t0 == 1) {
                        final int q0 = g.q0;
                        if (q0 != -1) {
                            g.N(q0);
                        }
                        else if (g.r0 != -1 && this.y()) {
                            g.N(this.o() - g.r0);
                        }
                        else if (this.y()) {
                            g.N((int)(g.p0 * this.o() + 0.5f));
                        }
                        n8 = 1;
                        n9 = n7;
                    }
                }
                else {
                    n8 = n6;
                    n9 = n7;
                    if (e instanceof x.b) {
                        n8 = n6;
                        n9 = n7;
                        if (((x.b)e).P() == 0) {
                            n9 = 1;
                            n8 = n6;
                        }
                    }
                }
                ++k;
                n6 = n8;
                n7 = n9;
            }
            final int n10 = n;
            if (n6 != 0) {
                for (int l = 0; l < size2; ++l) {
                    final e e2 = (e)p0.get(l);
                    if (e2 instanceof g) {
                        final g g2 = (g)e2;
                        if (g2.t0 == 1) {
                            y.g.c(0, t0, g2, u0);
                        }
                    }
                }
            }
            y.g.c(0, t0, this, u0);
            if (n7 != 0) {
                for (int n11 = 0; n11 < size2; ++n11) {
                    final e e3 = (e)p0.get(n11);
                    if (e3 instanceof x.b) {
                        final x.b b = (x.b)e3;
                        if (b.P() == 0 && b.O()) {
                            y.g.c(1, t0, b, u0);
                        }
                    }
                }
            }
            if (n5 == 1) {
                this.G(0, this.i());
            }
            else {
                j.i(0);
                super.Y = 0;
            }
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            while (n12 < size2) {
                final e e4 = (e)p0.get(n12);
                int n15;
                int n16;
                if (e4 instanceof g) {
                    final g g3 = (g)e4;
                    n15 = n13;
                    n16 = n14;
                    if (g3.t0 == 0) {
                        final int q2 = g3.q0;
                        if (q2 != -1) {
                            g3.N(q2);
                        }
                        else if (g3.r0 != -1 && this.z()) {
                            g3.N(this.i() - g3.r0);
                        }
                        else if (this.z()) {
                            g3.N((int)(g3.p0 * this.i() + 0.5f));
                        }
                        n15 = 1;
                        n16 = n14;
                    }
                }
                else {
                    n15 = n13;
                    n16 = n14;
                    if (e4 instanceof x.b) {
                        n15 = n13;
                        n16 = n14;
                        if (((x.b)e4).P() == 1) {
                            n16 = 1;
                            n15 = n13;
                        }
                    }
                }
                ++n12;
                n13 = n15;
                n14 = n16;
            }
            if (n13 != 0) {
                for (int n17 = 0; n17 < size2; ++n17) {
                    final e e5 = (e)p0.get(n17);
                    if (e5 instanceof g) {
                        final g g4 = (g)e5;
                        if (g4.t0 == 0) {
                            y.g.i(1, t0, g4);
                        }
                    }
                }
            }
            y.g.i(0, t0, this);
            if (n14 != 0) {
                for (int n18 = 0; n18 < size2; ++n18) {
                    final e e6 = (e)p0.get(n18);
                    if (e6 instanceof x.b) {
                        final x.b b2 = (x.b)e6;
                        if (b2.P() == 1 && b2.O()) {
                            y.g.i(1, t0, b2);
                        }
                    }
                }
            }
            for (int n19 = 0; n19 < size2; ++n19) {
                final e e7 = (e)p0.get(n19);
                if (e7.x() && y.g.a(e7)) {
                    R(e7, t0, y.g.a);
                    if (e7 instanceof g) {
                        if (((g)e7).t0 == 0) {
                            y.g.i(0, t0, e7);
                        }
                        else {
                            y.g.c(0, t0, e7, u0);
                        }
                    }
                    else {
                        y.g.c(0, t0, e7, u0);
                        y.g.i(0, t0, e7);
                    }
                }
            }
            int n20 = 0;
            while (true) {
                n = n10;
                array = (int[])(Object)h;
                o2 = o;
                if (n20 >= size) {
                    break;
                }
                final e e8 = (e)this.p0.get(n20);
                if (e8.x() && !(e8 instanceof g) && !(e8 instanceof x.b)) {
                    final int h2 = e8.h(0);
                    final int h3 = e8.h(1);
                    if (h2 != 3 || e8.r == 1 || h3 != 3 || e8.s == 1) {
                        R(e8, this.t0, (b)new Object());
                    }
                }
                ++n20;
            }
        }
        else {
            o2 = o;
            array = (int[])(Object)h;
        }
        final v.c v0 = this.v0;
        int n45 = 0;
        int n46 = 0;
        int n47 = 0;
        int n48 = 0;
        int n49 = 0;
        int n50 = 0;
        d d2 = null;
        Label_3302: {
            int n24 = 0;
            int n28 = 0;
            int n29 = 0;
            Label_3275: {
                if (size > 2 && ((n3 == 2 || n2 == 2) && x.h.c(this.C0, 1024))) {
                    final A.f t2 = this.t0;
                    final ArrayList p2 = this.p0;
                    final int size3 = p2.size();
                    d d;
                    int n33;
                    int o4;
                    int n36;
                    int n37;
                    int n38;
                    while (true) {
                        for (int n21 = 0; n21 < size3; ++n21) {
                            final e e9 = (e)p2.get(n21);
                            final int n22 = o2[0];
                            final int n23 = o2[1];
                            final int[] o3 = e9.o0;
                            if (!y.g.h(n22, n23, o3[0], o3[1])) {
                                n24 = size;
                                final int n25 = n2;
                                final int n26 = max;
                                final int n27 = n3;
                                n28 = n25;
                                n29 = n26;
                                n3 = n27;
                                break Label_3275;
                            }
                        }
                        int n30 = 0;
                        ArrayList list = null;
                        final ArrayList list2 = null;
                        o = null;
                        ArrayList list3 = null;
                        ArrayList list4 = null;
                        ArrayList list5 = null;
                        d = j;
                        final int n31 = n3;
                        final int n32 = n2;
                        ArrayList list6 = list2;
                        n33 = size;
                        o4 = max;
                        while (n30 < size3) {
                            final e e10 = (e)p2.get(n30);
                            final int n34 = o2[0];
                            final int n35 = o2[1];
                            final int[] o5 = e10.o0;
                            if (!y.g.h(n34, n35, o5[0], o5[1])) {
                                R(e10, t2, this.K0);
                            }
                            final boolean b3 = e10 instanceof g;
                            ArrayList list7 = list;
                            ArrayList list8 = (ArrayList)o;
                            if (b3) {
                                final g g5 = (g)e10;
                                Object o6 = o;
                                if (g5.t0 == 0) {
                                    if ((o6 = o) == null) {
                                        o6 = new ArrayList();
                                    }
                                    ((ArrayList)o6).add((Object)g5);
                                }
                                list7 = list;
                                list8 = (ArrayList)o6;
                                if (g5.t0 == 1) {
                                    ArrayList list9;
                                    if ((list9 = list) == null) {
                                        list9 = new ArrayList();
                                    }
                                    list9.add((Object)g5);
                                    list8 = (ArrayList)o6;
                                    list7 = list9;
                                }
                            }
                            ArrayList list10 = list6;
                            ArrayList list11 = list3;
                            if (e10 instanceof x.b) {
                                if (e10 instanceof x.b) {
                                    final x.b b4 = (x.b)e10;
                                    ArrayList list12 = list6;
                                    if (b4.P() == 0) {
                                        if ((list12 = list6) == null) {
                                            list12 = new ArrayList();
                                        }
                                        list12.add((Object)b4);
                                    }
                                    list10 = list12;
                                    list11 = list3;
                                    if (b4.P() == 1) {
                                        if ((list11 = list3) == null) {
                                            list11 = new ArrayList();
                                        }
                                        list11.add((Object)b4);
                                        list10 = list12;
                                    }
                                }
                                else {
                                    final x.b b5 = (x.b)e10;
                                    if ((list10 = list6) == null) {
                                        list10 = new ArrayList();
                                    }
                                    list10.add((Object)b5);
                                    if ((list11 = list3) == null) {
                                        list11 = new ArrayList();
                                    }
                                    list11.add((Object)b5);
                                }
                            }
                            ArrayList list13 = list4;
                            if (e10.H.f == null) {
                                list13 = list4;
                                if (e10.J.f == null) {
                                    list13 = list4;
                                    if (!b3) {
                                        list13 = list4;
                                        if (!(e10 instanceof x.b)) {
                                            ArrayList list14;
                                            if ((list14 = list4) == null) {
                                                list14 = new ArrayList();
                                            }
                                            list14.add((Object)e10);
                                            list13 = list14;
                                        }
                                    }
                                }
                            }
                            ArrayList list15 = list5;
                            if (e10.I.f == null) {
                                list15 = list5;
                                if (e10.K.f == null) {
                                    list15 = list5;
                                    if (e10.L.f == null) {
                                        list15 = list5;
                                        if (!b3) {
                                            list15 = list5;
                                            if (!(e10 instanceof x.b)) {
                                                ArrayList list16;
                                                if ((list16 = list5) == null) {
                                                    list16 = new ArrayList();
                                                }
                                                list16.add((Object)e10);
                                                list15 = list16;
                                            }
                                        }
                                    }
                                }
                            }
                            ++n30;
                            list = list7;
                            list6 = list10;
                            o = list8;
                            list3 = list11;
                            list4 = list13;
                            list5 = list15;
                        }
                        n36 = o4;
                        n37 = n32;
                        n38 = n31;
                        final ArrayList list17 = new ArrayList();
                        if (list != null) {
                            final Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                                y.g.b((e)iterator.next(), 0, list17, null);
                            }
                        }
                        if (list6 != null) {
                            for (final x.b b6 : list6) {
                                final m b7 = y.g.b(b6, 0, list17, null);
                                b6.N(0, list17, b7);
                                b7.a(list17);
                            }
                        }
                        final HashSet a = this.g(2).a;
                        if (a != null) {
                            final Iterator iterator3 = a.iterator();
                            while (iterator3.hasNext()) {
                                y.g.b(((d)iterator3.next()).d, 0, list17, null);
                            }
                        }
                        final HashSet a2 = this.g(4).a;
                        if (a2 != null) {
                            final Iterator iterator4 = a2.iterator();
                            while (iterator4.hasNext()) {
                                y.g.b(((d)iterator4.next()).d, 0, list17, null);
                            }
                        }
                        final HashSet a3 = this.g(7).a;
                        if (a3 != null) {
                            final Iterator iterator5 = a3.iterator();
                            while (iterator5.hasNext()) {
                                y.g.b(((d)iterator5.next()).d, 0, list17, null);
                            }
                        }
                        if (list4 != null) {
                            final Iterator iterator6 = list4.iterator();
                            while (iterator6.hasNext()) {
                                y.g.b((e)iterator6.next(), 0, list17, null);
                            }
                        }
                        if (o != null) {
                            final Iterator iterator7 = ((ArrayList)o).iterator();
                            while (iterator7.hasNext()) {
                                y.g.b((e)iterator7.next(), 1, list17, null);
                            }
                        }
                        if (list3 != null) {
                            final Iterator iterator8 = list3.iterator();
                            while (iterator8.hasNext()) {
                                o = iterator8.next();
                                final m b8 = y.g.b((e)o, 1, list17, null);
                                ((x.b)o).N(1, list17, b8);
                                b8.a(list17);
                            }
                        }
                        final HashSet a4 = this.g(3).a;
                        if (a4 != null) {
                            final Iterator iterator9 = a4.iterator();
                            while (iterator9.hasNext()) {
                                y.g.b(((d)iterator9.next()).d, 1, list17, null);
                            }
                        }
                        final HashSet a5 = this.g(6).a;
                        if (a5 != null) {
                            final Iterator iterator10 = a5.iterator();
                            while (iterator10.hasNext()) {
                                y.g.b(((d)iterator10.next()).d, 1, list17, null);
                            }
                        }
                        final HashSet a6 = this.g(5).a;
                        if (a6 != null) {
                            final Iterator iterator11 = a6.iterator();
                            while (iterator11.hasNext()) {
                                y.g.b(((d)iterator11.next()).d, 1, list17, null);
                            }
                        }
                        final HashSet a7 = this.g(7).a;
                        if (a7 != null) {
                            final Iterator iterator12 = a7.iterator();
                            while (iterator12.hasNext()) {
                                y.g.b(((d)iterator12.next()).d, 1, list17, null);
                            }
                        }
                        if (list5 != null) {
                            final Iterator iterator13 = list5.iterator();
                            while (iterator13.hasNext()) {
                                y.g.b((e)iterator13.next(), 1, list17, null);
                            }
                        }
                    Label_2858:
                        for (int n39 = 0; n39 < size3; ++n39) {
                            final e e11 = (e)p2.get(n39);
                            final int[] o7 = e11.o0;
                            if (o7[0] == 3 && o7[1] == 3) {
                                final int m0 = e11.m0;
                                while (true) {
                                    for (int size4 = list17.size(), n40 = 0; n40 < size4; ++n40) {
                                        final m m2 = (m)list17.get(n40);
                                        if (m0 == m2.b) {
                                            final int n41 = e11.n0;
                                            final int size5 = list17.size();
                                            int n42 = 0;
                                            while (true) {
                                                while (n42 < size5) {
                                                    final m m3 = (m)list17.get(n42);
                                                    if (n41 == m3.b) {
                                                        if (m2 != null && m3 != null) {
                                                            m2.c(0, m3);
                                                            m3.c = 2;
                                                            list17.remove((Object)m2);
                                                        }
                                                        continue Label_2858;
                                                    }
                                                    else {
                                                        ++n42;
                                                    }
                                                }
                                                final m m3 = null;
                                                continue;
                                            }
                                        }
                                    }
                                    final m m2 = null;
                                    continue;
                                }
                            }
                        }
                        if (list17.size() <= 1) {
                            n24 = n33;
                            j = d;
                            final int n25 = n37;
                            final int n26 = n36;
                            final int n27 = n38;
                            continue;
                        }
                        m m6 = null;
                        Label_3004: {
                            if (o2[0] == 2) {
                                final Iterator iterator14 = list17.iterator();
                                int n43 = 0;
                                m m4 = null;
                                while (iterator14.hasNext()) {
                                    final m m5 = (m)iterator14.next();
                                    if (m5.c == 1) {
                                        continue;
                                    }
                                    final int b9 = m5.b(v0, 0);
                                    if (b9 <= n43) {
                                        continue;
                                    }
                                    m4 = m5;
                                    n43 = b9;
                                }
                                if (m4 != null) {
                                    this.I(1);
                                    this.K(n43);
                                    m6 = m4;
                                    break Label_3004;
                                }
                            }
                            m6 = null;
                        }
                        Label_3112: {
                            if (o2[1] == 2) {
                                final Iterator iterator15 = list17.iterator();
                                int n44 = 0;
                                Object o8 = null;
                                while (iterator15.hasNext()) {
                                    final m m7 = (m)iterator15.next();
                                    if (m7.c == 0) {
                                        continue;
                                    }
                                    final int b10 = m7.b(v0, 1);
                                    if (b10 <= n44) {
                                        continue;
                                    }
                                    o8 = m7;
                                    n44 = b10;
                                }
                                if (o8 != null) {
                                    this.J(1);
                                    this.H(n44);
                                    o = o8;
                                    break Label_3112;
                                }
                            }
                            o = null;
                        }
                        if (m6 == null) {
                            n24 = n33;
                            j = d;
                            final int n25 = n37;
                            final int n26 = n36;
                            final int n27 = n38;
                            if (o == null) {
                                continue;
                            }
                        }
                        break;
                    }
                    if (n38 == 2) {
                        if (n36 < this.o() && n36 > 0) {
                            this.K(n36);
                            this.D0 = true;
                        }
                        else {
                            o4 = this.o();
                        }
                    }
                    while (true) {
                        if (n37 == 2) {
                            if (n < this.i() && n > 0) {
                                this.H(n);
                                this.E0 = true;
                            }
                            else {
                                n = this.i();
                            }
                        }
                        n45 = n;
                        n46 = 1;
                        n47 = n38;
                        n48 = o4;
                        n49 = n37;
                        n50 = n33;
                        d2 = d;
                        break Label_3302;
                        continue;
                    }
                }
                else {
                    n24 = size;
                    n28 = n2;
                    n29 = max;
                }
            }
            final int n51 = 0;
            d2 = j;
            n50 = n24;
            n45 = n;
            n49 = n28;
            n48 = n29;
            n47 = n3;
            n46 = n51;
        }
        final boolean b11 = this.S(64) || this.S(128);
        v0.getClass();
        v0.g = false;
        if (this.C0 != 0 && b11) {
            v0.g = true;
        }
        final ArrayList p3 = this.p0;
        final boolean b12 = o2[0] == 2 || o2[1] == 2;
        this.y0 = 0;
        this.z0 = 0;
        for (int n52 = 0; n52 < n50; ++n52) {
            final e e12 = (e)this.p0.get(n52);
            if (e12 instanceof f) {
                ((f)e12).Q();
            }
        }
        final boolean s2 = this.S(64);
        int n53 = n46;
        int n54 = 0;
        int n55 = 1;
        Object o9 = array;
    Label_4038_Outer:
        while (n55 != 0) {
            final int n56 = n54 + 1;
            Label_4100: {
                Label_4060: {
                    Label_3534: {
                        try {
                            v0.t();
                            this.y0 = 0;
                            this.z0 = 0;
                            this.e(v0);
                            for (int n57 = 0; n57 < n50; ++n57) {
                                ((e)this.p0.get(n57)).e(v0);
                            }
                            break Label_3534;
                        }
                        catch (final Exception ex) {}
                        break Label_4060;
                    }
                    this.O(v0);
                    while (true) {
                        try {
                            o = this.F0;
                        Label_3640_Outer:
                            while (true) {
                            Label_3640:
                                while (true) {
                                    Block_178: {
                                        if (o != null) {
                                            break Block_178;
                                        }
                                        while (true) {
                                            Object o10 = o9;
                                            while (true) {
                                                try {
                                                    final WeakReference h4 = this.H0;
                                                    if (h4 != null) {
                                                        o10 = o9;
                                                        if (((Reference)h4).get() != null) {
                                                            o10 = o9;
                                                            final d d3 = (d)((Reference)this.H0).get();
                                                            o10 = o9;
                                                            final v.f k2 = v0.k((Object)super.K);
                                                            o10 = o9;
                                                            final v.c v2 = this.v0;
                                                            o10 = o9;
                                                            v2.f(k2, v2.k((Object)d3), 0, 5);
                                                            o10 = o9;
                                                            this.H0 = null;
                                                        }
                                                    }
                                                    o10 = o9;
                                                    final WeakReference g6 = this.G0;
                                                    o = o9;
                                                    if (g6 != null) {
                                                        o10 = o9;
                                                        o = o9;
                                                        if (((Reference)g6).get() != null) {
                                                            o10 = o9;
                                                            final d d4 = (d)((Reference)this.G0).get();
                                                            try {
                                                                final v.f k3 = v0.k(o9);
                                                                final v.c v3 = this.v0;
                                                                final v.f k4 = v3.k((Object)d4);
                                                                o10 = o9;
                                                                v3.f(k4, k3, 0, 5);
                                                                o10 = o9;
                                                                this.G0 = null;
                                                                o = o9;
                                                            }
                                                            catch (final Exception o) {
                                                                break Label_3640;
                                                            }
                                                        }
                                                    }
                                                    o10 = o;
                                                    o9 = this.I0;
                                                    if (o9 == null) {
                                                        break;
                                                    }
                                                    o10 = o;
                                                    if (((Reference)o9).get() == null) {
                                                        break;
                                                    }
                                                    o10 = o;
                                                    final d d5 = (d)((Reference)this.I0).get();
                                                    o10 = o;
                                                    o9 = v0.k((Object)super.J);
                                                    try {
                                                        final v.c v4 = this.v0;
                                                        final v.f k5 = v4.k((Object)d5);
                                                        try {
                                                            v4.f((v.f)o9, k5, 0, 5);
                                                            try {
                                                                this.I0 = null;
                                                                break;
                                                            }
                                                            catch (final Exception o10) {
                                                                o9 = o;
                                                            }
                                                            n55 = 1;
                                                            o = o10;
                                                        }
                                                        catch (final Exception o10) {
                                                            o9 = o;
                                                        }
                                                    }
                                                    catch (final Exception o10) {
                                                        o9 = o;
                                                    }
                                                }
                                                catch (final Exception o) {
                                                    o9 = o10;
                                                    o10 = o;
                                                }
                                                continue Label_4038_Outer;
                                            }
                                        }
                                        v0.p();
                                        n55 = 1;
                                        o9 = o;
                                        break Label_4100;
                                    }
                                    try {
                                        if (((Reference)o).get() != null) {
                                            final d d6 = (d)((Reference)this.F0).get();
                                            try {
                                                o = v0.k((Object)d2);
                                                final v.c v5 = this.v0;
                                                final v.f k6 = v5.k((Object)d6);
                                                v.f f = (v.f)o9;
                                                d d7 = d2;
                                                try {
                                                    v5.f(k6, (v.f)o, 0, 5);
                                                    f = (v.f)o9;
                                                    d7 = d2;
                                                    this.F0 = null;
                                                    continue Label_3640_Outer;
                                                }
                                                catch (final Exception o) {
                                                    d2 = d7;
                                                    o9 = f;
                                                }
                                                n55 = 1;
                                            }
                                            catch (final Exception o) {}
                                        }
                                    }
                                    catch (final Exception o) {
                                        continue Label_3640;
                                    }
                                    break;
                                }
                                continue Label_3640_Outer;
                            }
                        }
                        catch (final Exception o10) {
                            continue;
                        }
                        break;
                    }
                }
                ((Throwable)o).printStackTrace();
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder("EXCEPTION : ");
                sb.append(o);
                out.println(sb.toString());
            }
            o = x.h.a;
            boolean b13;
            if (n55 != 0) {
                o[2] = false;
                final boolean s3 = this.S(64);
                this.M(v0, s3);
                final int size6 = this.p0.size();
                int n58 = 0;
                b13 = false;
                while (n58 < size6) {
                    final e e13 = (e)this.p0.get(n58);
                    e13.M(v0, s3);
                    if (e13.h != -1 || e13.i != -1) {
                        b13 = true;
                    }
                    ++n58;
                }
            }
            else {
                this.M(v0, s2);
                for (int n59 = 0; n59 < n50; ++n59) {
                    ((e)this.p0.get(n59)).M(v0, s2);
                }
                b13 = false;
            }
            int n60 = b13 ? 1 : 0;
            int n61 = n53;
            if (b12) {
                n60 = (b13 ? 1 : 0);
                n61 = n53;
                if (n56 < 8) {
                    n60 = (b13 ? 1 : 0);
                    n61 = n53;
                    if (o[2]) {
                        int n62 = 0;
                        int max2 = 0;
                        int max3 = 0;
                        while (n62 < n50) {
                            o = this.p0.get(n62);
                            max2 = Math.max(max2, ((e)o).o() + ((e)o).X);
                            max3 = Math.max(max3, ((e)o).i() + ((e)o).Y);
                            ++n62;
                        }
                        final int max4 = Math.max(super.a0, max2);
                        final int max5 = Math.max(super.b0, max3);
                        int n63 = b13 ? 1 : 0;
                        int n64 = n53;
                        if (n47 == 2) {
                            n63 = (b13 ? 1 : 0);
                            n64 = n53;
                            if (this.o() < max4) {
                                this.K(max4);
                                o2[0] = 2;
                                n63 = 1;
                                n64 = 1;
                            }
                        }
                        n60 = n63;
                        n61 = n64;
                        if (n49 == 2) {
                            n60 = n63;
                            n61 = n64;
                            if (this.i() < max5) {
                                this.H(max5);
                                o2[1] = 2;
                                n60 = 1;
                                n61 = 1;
                            }
                        }
                    }
                }
            }
            final int max6 = Math.max(super.a0, this.o());
            if (max6 > this.o()) {
                this.K(max6);
                o2[0] = true;
                n55 = 1;
                n61 = 1;
            }
            else {
                n55 = n60;
            }
            final int max7 = Math.max(super.b0, this.i());
            int n65;
            if (max7 > this.i()) {
                this.H(max7);
                o2[1] = true;
                n65 = 1;
                n55 = 1;
            }
            else {
                n65 = n61;
            }
            Label_4664: {
                if (n65 == 0) {
                    int n66 = n65;
                    int n67 = n55;
                    if (o2[0] == 2) {
                        n66 = n65;
                        n67 = n55;
                        if (n48 > 0) {
                            n66 = n65;
                            n67 = n55;
                            if (this.o() > n48) {
                                o2[0] = (this.D0 = true);
                                this.K(n48);
                                n66 = 1;
                                n67 = 1;
                            }
                        }
                    }
                    n65 = n66;
                    n55 = n67;
                    if (o2[1] == 2) {
                        n65 = n66;
                        n55 = n67;
                        if (n45 > 0) {
                            n65 = n66;
                            n55 = n67;
                            if (this.i() > n45) {
                                o2[1] = (this.E0 = true);
                                this.H(n45);
                                n53 = 1;
                                n55 = 1;
                                break Label_4664;
                            }
                        }
                    }
                }
                n53 = n65;
            }
            if (n56 > 8) {
                n55 = 0;
            }
            n54 = n56;
        }
        this.p0 = p3;
        if (n53 != 0) {
            o2[0] = n47;
            o2[1] = n49;
        }
        this.C(v0.l);
    }
    
    public final boolean S(final int n) {
        return (this.C0 & n) == n;
    }
    
    @Override
    public final void l(final StringBuilder sb) {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(super.j);
        sb2.append(":{\n");
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(super.T);
        sb.append(sb3.toString());
        sb.append("\n");
        final StringBuilder sb4 = new StringBuilder("  actualHeight:");
        sb4.append(super.U);
        sb.append(sb4.toString());
        sb.append("\n");
        final Iterator iterator = this.p0.iterator();
        while (iterator.hasNext()) {
            ((e)iterator.next()).l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}

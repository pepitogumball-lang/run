package y;

import java.util.Iterator;
import x.f;
import x.e;
import java.util.ArrayList;

public final class c extends n
{
    public final ArrayList k;
    public int l;
    
    public c(e k, int n) {
        super(k);
        this.k = new ArrayList();
        super.f = n;
        e b = super.b;
        e i;
        for (k = b.k(n); k != null; k = i) {
            i = k.k(super.f);
            b = k;
        }
        super.b = b;
        n = super.f;
        n n2;
        if (n == 0) {
            n2 = b.d;
        }
        else if (n == 1) {
            n2 = b.e;
        }
        else {
            n2 = null;
        }
        final ArrayList j = this.k;
        j.add((Object)n2);
        for (e e = b.j(super.f); e != null; e = e.j(super.f)) {
            n = super.f;
            n n3;
            if (n == 0) {
                n3 = e.d;
            }
            else if (n == 1) {
                n3 = e.e;
            }
            else {
                n3 = null;
            }
            j.add((Object)n3);
        }
        for (final n n4 : j) {
            n = super.f;
            if (n == 0) {
                n4.b.b = this;
            }
            else {
                if (n != 1) {
                    continue;
                }
                n4.b.c = this;
            }
        }
        if (super.f == 0 && ((f)super.b.S).u0 && j.size() > 1) {
            super.b = ((n)j.get(j.size() - 1)).b;
        }
        if (super.f == 0) {
            n = super.b.h0;
        }
        else {
            n = super.b.i0;
        }
        this.l = n;
    }
    
    @Override
    public final void a(final d d) {
        final y.e h = super.h;
        if (h.j) {
            final y.e i = super.i;
            if (i.j) {
                final e s = super.b.S;
                final boolean b = s instanceof f && ((f)s).u0;
                final int n = i.g - h.g;
                final ArrayList k = this.k;
                final int size = k.size();
                int n2 = 0;
                int n3;
                int n4;
                while (true) {
                    n3 = -1;
                    if (n2 >= size) {
                        n4 = -1;
                        break;
                    }
                    n4 = n2;
                    if (((n)k.get(n2)).b.f0 != 8) {
                        break;
                    }
                    ++n2;
                }
                int n6;
                final int n5 = n6 = size - 1;
                int n7;
                while (true) {
                    n7 = n3;
                    if (n6 < 0) {
                        break;
                    }
                    if (((n)k.get(n6)).b.f0 != 8) {
                        n7 = n6;
                        break;
                    }
                    --n6;
                }
                int j = 0;
                while (true) {
                    while (j < 2) {
                        int l = 0;
                        int n8 = 0;
                        int n9 = 0;
                        int n10 = 0;
                        float n11 = 0.0f;
                        while (l < size) {
                            final n n12 = (n)k.get(l);
                            final e b2 = n12.b;
                            int n13;
                            if (b2.f0 == 8) {
                                n13 = n9;
                            }
                            else {
                                final int n14 = n10 + 1;
                                int n15 = n8;
                                if (l > 0) {
                                    n15 = n8;
                                    if (l >= n4) {
                                        n15 = n8 + n12.h.f;
                                    }
                                }
                                final y.f e = n12.e;
                                int g = e.g;
                                int n16;
                                if (n12.d != 3) {
                                    n16 = 1;
                                }
                                else {
                                    n16 = 0;
                                }
                                Label_0424: {
                                    if (n16 != 0) {
                                        final int f = super.f;
                                        if (f == 0 && !b2.d.e.j) {
                                            return;
                                        }
                                        if (f == 1 && !b2.e.e.j) {
                                            return;
                                        }
                                    }
                                    else {
                                        int m;
                                        if (n12.a == 1 && j == 0) {
                                            m = e.m;
                                            ++n9;
                                        }
                                        else {
                                            if (!e.j) {
                                                break Label_0424;
                                            }
                                            m = g;
                                        }
                                        final int n17 = 1;
                                        g = m;
                                        n16 = n17;
                                    }
                                }
                                int n20;
                                float n21;
                                if (n16 == 0) {
                                    final int n18 = n9 + 1;
                                    final float n19 = b2.j0[super.f];
                                    n20 = n15;
                                    n9 = n18;
                                    n21 = n11;
                                    if (n19 >= 0.0f) {
                                        n21 = n11 + n19;
                                        n20 = n15;
                                        n9 = n18;
                                    }
                                }
                                else {
                                    n20 = n15 + g;
                                    n21 = n11;
                                }
                                n8 = n20;
                                n13 = n9;
                                n10 = n14;
                                n11 = n21;
                                if (l < n5) {
                                    n8 = n20;
                                    n13 = n9;
                                    n10 = n14;
                                    n11 = n21;
                                    if (l < n7) {
                                        n8 = n20 + -n12.i.f;
                                        n11 = n21;
                                        n10 = n14;
                                        n13 = n9;
                                    }
                                }
                            }
                            ++l;
                            n9 = n13;
                        }
                        if (n8 >= n && n9 != 0) {
                            ++j;
                        }
                        else {
                            final int n22 = n10;
                            int n23 = n9;
                            final int n24 = n4;
                            int n25 = h.g;
                            if (b) {
                                n25 = i.g;
                            }
                            int n26 = n25;
                            if (n8 > n) {
                                if (b) {
                                    n26 = n25 + (int)((n8 - n) / 2.0f + 0.5f);
                                }
                                else {
                                    n26 = n25 - (int)((n8 - n) / 2.0f + 0.5f);
                                }
                            }
                            int n50;
                            int n51;
                            int n52;
                            if (n23 > 0) {
                                final float n27 = (float)(n - n8);
                                final int n28 = (int)(n27 / n23 + 0.5f);
                                int n29 = 0;
                                final int n30 = 0;
                                final int n31 = n8;
                                int n32 = n30;
                                final int n33 = n26;
                                while (n29 < size) {
                                    final n n34 = (n)k.get(n29);
                                    final e b3 = n34.b;
                                    if (b3.f0 != 8 && n34.d == 3) {
                                        final y.f e2 = n34.e;
                                        if (!e2.j) {
                                            int n35;
                                            if (n11 > 0.0f) {
                                                n35 = (int)(b3.j0[super.f] * n27 / n11 + 0.5f);
                                            }
                                            else {
                                                n35 = n28;
                                            }
                                            int n36;
                                            int n37;
                                            if (super.f == 0) {
                                                n36 = b3.v;
                                                n37 = b3.u;
                                            }
                                            else {
                                                n36 = b3.y;
                                                n37 = b3.x;
                                            }
                                            int min;
                                            if (n34.a == 1) {
                                                min = Math.min(n35, e2.m);
                                            }
                                            else {
                                                min = n35;
                                            }
                                            int n39;
                                            final int n38 = n39 = Math.max(n37, min);
                                            if (n36 > 0) {
                                                n39 = Math.min(n36, n38);
                                            }
                                            int n40 = n35;
                                            int n41 = n32;
                                            if (n39 != n35) {
                                                n41 = n32 + 1;
                                                n40 = n39;
                                            }
                                            e2.d(n40);
                                            n32 = n41;
                                        }
                                    }
                                    ++n29;
                                }
                                int n45;
                                int n46;
                                if (n32 > 0) {
                                    final int n42 = n23 - n32;
                                    int n43 = 0;
                                    final int n44 = 0;
                                    n45 = n24;
                                    n46 = n44;
                                    while (n43 < size) {
                                        final n n47 = (n)k.get(n43);
                                        if (n47.b.f0 != 8) {
                                            int n48 = n46;
                                            if (n43 > 0) {
                                                n48 = n46;
                                                if (n43 >= n45) {
                                                    n48 = n46 + n47.h.f;
                                                }
                                            }
                                            final int n49 = n46 = n48 + n47.e.g;
                                            if (n43 < n5) {
                                                n46 = n49;
                                                if (n43 < n7) {
                                                    n46 = n49 + -n47.i.f;
                                                }
                                            }
                                        }
                                        ++n43;
                                    }
                                    n23 = n42;
                                }
                                else {
                                    n45 = n24;
                                    n46 = n31;
                                }
                                if (this.l == 2 && n32 == 0) {
                                    this.l = 0;
                                    n50 = n45;
                                    n51 = n46;
                                    n52 = n33;
                                }
                                else {
                                    n50 = n45;
                                    n51 = n46;
                                    n52 = n33;
                                }
                            }
                            else {
                                final int n53 = n24;
                                n52 = n26;
                                n51 = n8;
                                n50 = n53;
                            }
                            if (n51 > n) {
                                this.l = 2;
                            }
                            if (n22 > 0 && n23 == 0 && n50 == n7) {
                                this.l = 2;
                            }
                            final int l2 = this.l;
                            if (l2 == 1) {
                                int n54;
                                if (n22 > 1) {
                                    n54 = (n - n51) / (n22 - 1);
                                }
                                else if (n22 == 1) {
                                    n54 = (n - n51) / 2;
                                }
                                else {
                                    n54 = 0;
                                }
                                int n55 = n54;
                                if (n23 > 0) {
                                    n55 = 0;
                                }
                                int n56 = 0;
                                int n57 = n52;
                                while (n56 < size) {
                                    int n58;
                                    if (b) {
                                        n58 = size - (n56 + 1);
                                    }
                                    else {
                                        n58 = n56;
                                    }
                                    final n n59 = (n)k.get(n58);
                                    final int f2 = n59.b.f0;
                                    final y.e i2 = n59.i;
                                    final y.e h2 = n59.h;
                                    int n60;
                                    if (f2 == 8) {
                                        h2.d(n57);
                                        i2.d(n57);
                                        n60 = n57;
                                    }
                                    else {
                                        int n61 = n57;
                                        if (n56 > 0) {
                                            if (b) {
                                                n61 = n57 - n55;
                                            }
                                            else {
                                                n61 = n57 + n55;
                                            }
                                        }
                                        int n62 = n61;
                                        if (n56 > 0) {
                                            n62 = n61;
                                            if (n56 >= n50) {
                                                if (b) {
                                                    n62 = n61 - h2.f;
                                                }
                                                else {
                                                    n62 = n61 + h2.f;
                                                }
                                            }
                                        }
                                        if (b) {
                                            i2.d(n62);
                                        }
                                        else {
                                            h2.d(n62);
                                        }
                                        final y.f e3 = n59.e;
                                        int n64;
                                        final int n63 = n64 = e3.g;
                                        if (n59.d == 3) {
                                            n64 = n63;
                                            if (n59.a == 1) {
                                                n64 = e3.m;
                                            }
                                        }
                                        int n65;
                                        if (b) {
                                            n65 = n62 - n64;
                                        }
                                        else {
                                            n65 = n62 + n64;
                                        }
                                        if (b) {
                                            h2.d(n65);
                                        }
                                        else {
                                            i2.d(n65);
                                        }
                                        n59.g = true;
                                        n60 = n65;
                                        if (n56 < n5) {
                                            n60 = n65;
                                            if (n56 < n7) {
                                                if (b) {
                                                    n60 = n65 - -i2.f;
                                                }
                                                else {
                                                    n60 = n65 + -i2.f;
                                                }
                                            }
                                        }
                                    }
                                    ++n56;
                                    n57 = n60;
                                }
                                return;
                            }
                            if (l2 == 0) {
                                int n66 = (n - n51) / (n22 + 1);
                                if (n23 > 0) {
                                    n66 = 0;
                                }
                                for (int n67 = 0; n67 < size; ++n67) {
                                    int n68;
                                    if (b) {
                                        n68 = size - (n67 + 1);
                                    }
                                    else {
                                        n68 = n67;
                                    }
                                    final n n69 = (n)k.get(n68);
                                    final int f3 = n69.b.f0;
                                    final y.e i3 = n69.i;
                                    final y.e h3 = n69.h;
                                    if (f3 == 8) {
                                        h3.d(n52);
                                        i3.d(n52);
                                    }
                                    else {
                                        int n70;
                                        if (b) {
                                            n70 = n52 - n66;
                                        }
                                        else {
                                            n70 = n52 + n66;
                                        }
                                        int n71 = n70;
                                        if (n67 > 0) {
                                            n71 = n70;
                                            if (n67 >= n50) {
                                                if (b) {
                                                    n71 = n70 - h3.f;
                                                }
                                                else {
                                                    n71 = n70 + h3.f;
                                                }
                                            }
                                        }
                                        if (b) {
                                            i3.d(n71);
                                        }
                                        else {
                                            h3.d(n71);
                                        }
                                        final y.f e4 = n69.e;
                                        int n73;
                                        final int n72 = n73 = e4.g;
                                        if (n69.d == 3) {
                                            n73 = n72;
                                            if (n69.a == 1) {
                                                n73 = Math.min(n72, e4.m);
                                            }
                                        }
                                        int n74;
                                        if (b) {
                                            n74 = n71 - n73;
                                        }
                                        else {
                                            n74 = n71 + n73;
                                        }
                                        if (b) {
                                            h3.d(n74);
                                        }
                                        else {
                                            i3.d(n74);
                                        }
                                        n52 = n74;
                                        if (n67 < n5) {
                                            n52 = n74;
                                            if (n67 < n7) {
                                                if (b) {
                                                    n52 = n74 - -i3.f;
                                                }
                                                else {
                                                    n52 = n74 + -i3.f;
                                                }
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            if (l2 == 2) {
                                float n75;
                                if (super.f == 0) {
                                    n75 = super.b.c0;
                                }
                                else {
                                    n75 = super.b.d0;
                                }
                                float n76 = n75;
                                if (b) {
                                    n76 = 1.0f - n75;
                                }
                                int n77 = (int)((n - n51) * n76 + 0.5f);
                                if (n77 < 0 || n23 > 0) {
                                    n77 = 0;
                                }
                                int n78;
                                if (b) {
                                    n78 = n52 - n77;
                                }
                                else {
                                    n78 = n52 + n77;
                                }
                                for (int n79 = 0; n79 < size; ++n79) {
                                    int n80;
                                    if (b) {
                                        n80 = size - (n79 + 1);
                                    }
                                    else {
                                        n80 = n79;
                                    }
                                    final n n81 = (n)k.get(n80);
                                    final int f4 = n81.b.f0;
                                    final y.e i4 = n81.i;
                                    final y.e h4 = n81.h;
                                    if (f4 == 8) {
                                        h4.d(n78);
                                        i4.d(n78);
                                    }
                                    else {
                                        int n82 = n78;
                                        if (n79 > 0) {
                                            n82 = n78;
                                            if (n79 >= n50) {
                                                if (b) {
                                                    n82 = n78 - h4.f;
                                                }
                                                else {
                                                    n82 = n78 + h4.f;
                                                }
                                            }
                                        }
                                        if (b) {
                                            i4.d(n82);
                                        }
                                        else {
                                            h4.d(n82);
                                        }
                                        final y.f e5 = n81.e;
                                        int n83 = e5.g;
                                        if (n81.d == 3 && n81.a == 1) {
                                            n83 = e5.m;
                                        }
                                        int n84;
                                        if (b) {
                                            n84 = n82 - n83;
                                        }
                                        else {
                                            n84 = n82 + n83;
                                        }
                                        if (b) {
                                            h4.d(n84);
                                        }
                                        else {
                                            i4.d(n84);
                                        }
                                        n78 = n84;
                                        if (n79 < n5) {
                                            n78 = n84;
                                            if (n79 < n7) {
                                                if (b) {
                                                    n78 = n84 - -i4.f;
                                                }
                                                else {
                                                    n78 = n84 + -i4.f;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                    }
                    final int n24 = n4;
                    int n23 = 0;
                    final int n22 = 0;
                    int n8 = 0;
                    float n11 = 0.0f;
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void d() {
        final ArrayList k = this.k;
        final Iterator iterator = k.iterator();
        while (iterator.hasNext()) {
            ((n)iterator.next()).d();
        }
        final int size = k.size();
        if (size < 1) {
            return;
        }
        final e b = ((n)k.get(0)).b;
        final e b2 = ((n)k.get(size - 1)).b;
        final int f = super.f;
        final y.e i = super.i;
        final y.e h = super.h;
        if (f == 0) {
            final x.d h2 = b.H;
            final x.d j = b2.J;
            final y.e l = n.i(h2, 0);
            int n = h2.d();
            final e m = this.m();
            if (m != null) {
                n = m.H.d();
            }
            if (l != null) {
                y.n.b(h, l, n);
            }
            final y.e i2 = y.n.i(j, 0);
            int n2 = j.d();
            final e n3 = this.n();
            if (n3 != null) {
                n2 = n3.J.d();
            }
            if (i2 != null) {
                y.n.b(i, i2, -n2);
            }
        }
        else {
            final x.d i3 = b.I;
            final x.d k2 = b2.K;
            final y.e i4 = n.i(i3, 1);
            int n4 = i3.d();
            final e m2 = this.m();
            if (m2 != null) {
                n4 = m2.I.d();
            }
            if (i4 != null) {
                n.b(h, i4, n4);
            }
            final y.e i5 = n.i(k2, 1);
            int n5 = k2.d();
            final e n6 = this.n();
            if (n6 != null) {
                n5 = n6.K.d();
            }
            if (i5 != null) {
                n.b(i, i5, -n5);
            }
        }
        h.a = this;
        i.a = this;
    }
    
    @Override
    public final void e() {
        int n = 0;
        while (true) {
            final ArrayList k = this.k;
            if (n >= k.size()) {
                break;
            }
            ((n)k.get(n)).e();
            ++n;
        }
    }
    
    @Override
    public final void f() {
        super.c = null;
        final Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((n)iterator.next()).f();
        }
    }
    
    @Override
    public final long j() {
        final ArrayList k = this.k;
        final int size = k.size();
        long n = 0L;
        for (int i = 0; i < size; ++i) {
            final n n2 = (n)k.get(i);
            n = n2.i.f + (n2.j() + (n + n2.h.f));
        }
        return n;
    }
    
    @Override
    public final boolean k() {
        final ArrayList k = this.k;
        for (int size = k.size(), i = 0; i < size; ++i) {
            if (!((n)k.get(i)).k()) {
                return false;
            }
        }
        return true;
    }
    
    public final e m() {
        int n = 0;
        while (true) {
            final ArrayList k = this.k;
            if (n >= k.size()) {
                return null;
            }
            final e b = ((n)k.get(n)).b;
            if (b.f0 != 8) {
                return b;
            }
            ++n;
        }
    }
    
    public final e n() {
        final ArrayList k = this.k;
        for (int i = k.size() - 1; i >= 0; --i) {
            final e b = ((n)k.get(i)).b;
            if (b.f0 != 8) {
                return b;
            }
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChainRun ");
        String s;
        if (super.f == 0) {
            s = "horizontal : ";
        }
        else {
            s = "vertical : ";
        }
        sb.append(s);
        for (final n n : this.k) {
            sb.append("<");
            sb.append((Object)n);
            sb.append("> ");
        }
        return sb.toString();
    }
}

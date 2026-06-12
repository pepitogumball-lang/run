package t0;

import m0.a;
import java.util.ArrayList;

public final class b extends q
{
    public ArrayList e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    
    public static void c(final ArrayList list) {
        final int n = list.size() - 1;
        if (n < 0) {
            return;
        }
        list.get(n).getClass();
        throw new ClassCastException();
    }
    
    @Override
    public final void a() {
        final ArrayList g = this.g;
        final int n = g.size() - 1;
        if (n >= 0) {
            m0.a.m(g.get(n));
            throw null;
        }
        final ArrayList e = this.e;
        for (int i = e.size() - 1; i >= 0; --i) {
            if (e.get(i) != null) {
                throw new ClassCastException();
            }
            if (super.a != null) {
                throw null;
            }
            e.remove(i);
        }
        final ArrayList f = this.f;
        final int n2 = f.size() - 1;
        if (n2 >= 0) {
            f.get(n2).getClass();
            throw new ClassCastException();
        }
        final ArrayList h = this.h;
        final int n3 = h.size() - 1;
        if (n3 >= 0) {
            m0.a.m(h.get(n3));
            throw null;
        }
        h.clear();
        if (!this.b()) {
            return;
        }
        final ArrayList j = this.j;
        for (int k = j.size() - 1; k >= 0; --k) {
            final ArrayList list = (ArrayList)j.get(k);
            final int n4 = list.size() - 1;
            if (n4 >= 0) {
                m0.a.m(list.get(n4));
                throw null;
            }
        }
        final ArrayList l = this.i;
        for (int n5 = l.size() - 1; n5 >= 0; --n5) {
            final ArrayList list2 = (ArrayList)l.get(n5);
            final int n6 = list2.size() - 1;
            if (n6 >= 0) {
                list2.get(n6).getClass();
                throw new ClassCastException();
            }
        }
        final ArrayList m = this.k;
        for (int n7 = m.size() - 1; n7 >= 0; --n7) {
            final ArrayList list3 = (ArrayList)m.get(n7);
            final int n8 = list3.size() - 1;
            if (n8 >= 0) {
                m0.a.m(list3.get(n8));
                throw null;
            }
        }
        c(this.n);
        c(this.m);
        c(this.l);
        c(this.o);
        final ArrayList b = super.b;
        if (b.size() <= 0) {
            b.clear();
            return;
        }
        m0.a.m(b.get(0));
        throw null;
    }
    
    @Override
    public final boolean b() {
        return !this.f.isEmpty() || !this.h.isEmpty() || !this.g.isEmpty() || !this.e.isEmpty() || !this.m.isEmpty() || !this.n.isEmpty() || !this.l.isEmpty() || !this.o.isEmpty() || !this.j.isEmpty() || !this.i.isEmpty() || !this.k.isEmpty();
    }
}

package B2;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

public abstract class f extends b implements List, RandomAccess
{
    public static final c D;
    
    static {
        D = new c(g.G, 0);
    }
    
    public final void add(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    public final boolean equals(Object value) {
        final boolean b = true;
        boolean b2;
        if (value == this) {
            b2 = b;
        }
        else {
            Label_0022: {
                if (value instanceof List) {
                    final List list = (List)value;
                    final int size = ((List)this).size();
                    if (size == list.size()) {
                        if (list instanceof RandomAccess) {
                            int n = 0;
                            while (true) {
                                b2 = b;
                                if (n >= size) {
                                    return b2;
                                }
                                value = ((List)this).get(n);
                                final Object value2 = list.get(n);
                                if (value != value2 && (value == null || !value.equals(value2))) {
                                    break;
                                }
                                ++n;
                            }
                        }
                        else {
                            final c u = this.u(0);
                            final Iterator iterator = list.iterator();
                            while (u.hasNext()) {
                                if (!iterator.hasNext()) {
                                    break Label_0022;
                                }
                                final Object next = u.next();
                                final Object next2 = iterator.next();
                                if (next == next2) {
                                    continue;
                                }
                                if (next != null && next.equals(next2)) {
                                    continue;
                                }
                                break Label_0022;
                            }
                            if (!iterator.hasNext()) {
                                b2 = b;
                                return b2;
                            }
                        }
                    }
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public final int hashCode() {
        final int size = this.size();
        int i = 0;
        int n = 1;
        while (i < size) {
            n = n * 31 + ((List)this).get(i).hashCode();
            ++i;
        }
        return n;
    }
    
    public int indexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        final int size = ((List)this).size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            if (o.equals(((List)this).get(n2))) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    public int lastIndexOf(final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        int n2 = ((List)this).size() - 1;
        int n3;
        while (true) {
            n3 = n;
            if (n2 < 0) {
                break;
            }
            if (o.equals(((List)this).get(n2))) {
                n3 = n2;
                break;
            }
            --n2;
        }
        return n3;
    }
    
    @Override
    public int p(final Object[] array) {
        final int size = this.size();
        for (int i = 0; i < size; ++i) {
            array[i] = ((List)this).get(i);
        }
        return size;
    }
    
    public f r() {
        if (this.size() <= 1) {
            return this;
        }
        return new d(this);
    }
    
    public final Object remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final Object set(final int n, final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public f t(final int n, int n2) {
        J5.b.f0(n, n2, this.size());
        n2 -= n;
        if (n2 == this.size()) {
            return this;
        }
        if (n2 == 0) {
            return g.G;
        }
        return new e(this, n, n2);
    }
    
    public final c u(final int n) {
        final int size = this.size();
        if (n < 0 || n > size) {
            throw new IndexOutOfBoundsException(J5.b.h0(n, "index", size));
        }
        if (this.isEmpty()) {
            return f.D;
        }
        return new c(this, n);
    }
}

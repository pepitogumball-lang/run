package t;

import java.util.Iterator;
import java.util.Collection;

public final class i implements Collection
{
    public final a C;
    
    public i(final a c) {
        this.C = c;
    }
    
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public final void clear() {
        this.C.a();
    }
    
    public final boolean contains(final Object o) {
        return this.C.f(o) >= 0;
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean isEmpty() {
        return this.C.d() == 0;
    }
    
    public final Iterator iterator() {
        return (Iterator)new f(this.C, 1);
    }
    
    public final boolean remove(final Object o) {
        final a c = this.C;
        final int f = c.f(o);
        if (f >= 0) {
            c.g(f);
            return true;
        }
        return false;
    }
    
    public final boolean removeAll(final Collection collection) {
        final a c = this.C;
        int d = c.d();
        int i = 0;
        boolean b = false;
        while (i < d) {
            int n = d;
            int n2 = i;
            if (collection.contains(c.b(i, 1))) {
                c.g(i);
                n2 = i - 1;
                n = d - 1;
                b = true;
            }
            i = n2 + 1;
            d = n;
        }
        return b;
    }
    
    public final boolean retainAll(final Collection collection) {
        final a c = this.C;
        int d = c.d();
        int i = 0;
        boolean b = false;
        while (i < d) {
            int n = d;
            int n2 = i;
            if (!collection.contains(c.b(i, 1))) {
                c.g(i);
                n2 = i - 1;
                n = d - 1;
                b = true;
            }
            i = n2 + 1;
            d = n;
        }
        return b;
    }
    
    public final int size() {
        return this.C.d();
    }
    
    public final Object[] toArray() {
        final a c = this.C;
        final int d = c.d();
        final Object[] array = new Object[d];
        for (int i = 0; i < d; ++i) {
            array[i] = c.b(i, 1);
        }
        return array;
    }
    
    public final Object[] toArray(final Object[] array) {
        return this.C.i(1, array);
    }
}

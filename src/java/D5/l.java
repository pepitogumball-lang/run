package d5;

import com.google.android.gms.internal.measurement.L;
import java.util.ListIterator;
import java.util.Iterator;
import n5.h;
import java.util.Collection;
import o5.a;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.List;

public final class l implements List, Serializable, RandomAccess, a
{
    public static final l C;
    
    static {
        C = (l)new Object();
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean contains(final Object o) {
        if (!(o instanceof Void)) {
            return false;
        }
        h.e("element", (Object)o);
        return false;
    }
    
    public final boolean containsAll(final Collection collection) {
        h.e("elements", (Object)collection);
        return collection.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof List && ((List)o).isEmpty();
    }
    
    public final Object get(final int n) {
        final StringBuilder sb = new StringBuilder("Empty list doesn't contain element at index ");
        sb.append(n);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof Void)) {
            return -1;
        }
        h.e("element", (Object)o);
        return -1;
    }
    
    public final boolean isEmpty() {
        return true;
    }
    
    public final Iterator iterator() {
        return (Iterator)k.C;
    }
    
    public final int lastIndexOf(final Object o) {
        if (!(o instanceof Void)) {
            return -1;
        }
        h.e("element", (Object)o);
        return -1;
    }
    
    public final ListIterator listIterator() {
        return (ListIterator)k.C;
    }
    
    public final ListIterator listIterator(final int n) {
        if (n == 0) {
            return (ListIterator)k.C;
        }
        throw new IndexOutOfBoundsException(L.h(n, "Index: "));
    }
    
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ int size() {
        return 0;
    }
    
    public final List subList(final int n, final int n2) {
        if (n == 0 && n2 == 0) {
            return (List)this;
        }
        throw new IndexOutOfBoundsException(Y3.a.k("fromIndex: ", ", toIndex: ", n, n2));
    }
    
    public final Object[] toArray() {
        return h.i((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        h.e("array", (Object)array);
        return h.j((Collection)this, array);
    }
    
    @Override
    public final String toString() {
        return "[]";
    }
}

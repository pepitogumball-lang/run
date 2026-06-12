package d5;

import java.util.Arrays;
import java.util.Iterator;
import n5.h;
import java.util.Collection;

public final class a implements Collection, o5.a
{
    public final Object[] C;
    public final boolean D;
    
    public a(final Object[] c, final boolean d) {
        this.C = c;
        this.D = d;
    }
    
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean contains(final Object o) {
        final Object[] c = this.C;
        h.e("<this>", (Object)c);
        boolean b = false;
        int i = 0;
        Label_0080: {
            if (o == null) {
                for (int length = c.length, i = 0; i < length; ++i) {
                    if (c[i] == null) {
                        break Label_0080;
                    }
                }
            }
            else {
                for (int length2 = c.length, i = 0; i < length2; ++i) {
                    if (o.equals(c[i])) {
                        break Label_0080;
                    }
                }
            }
            i = -1;
        }
        if (i >= 0) {
            b = true;
        }
        return b;
    }
    
    public final boolean containsAll(final Collection collection) {
        h.e("elements", (Object)collection);
        final Iterable iterable = (Iterable)collection;
        final boolean empty = ((Collection)iterable).isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = iterable.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    public final boolean isEmpty() {
        return this.C.length == 0;
    }
    
    public final Iterator iterator() {
        return (Iterator)new n5.a(this.C);
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
    
    public final int size() {
        return this.C.length;
    }
    
    public final Object[] toArray() {
        Object[] array = this.C;
        if (!this.D || !array.getClass().equals(Object[].class)) {
            array = Arrays.copyOf(array, array.length, (Class)Object[].class);
            h.d("copyOf(...)", (Object)array);
        }
        return array;
    }
    
    public final Object[] toArray(final Object[] array) {
        h.e("array", (Object)array);
        return h.j((Collection)this, array);
    }
}

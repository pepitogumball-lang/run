package d5;

import java.util.NoSuchElementException;
import o5.a;
import java.util.ListIterator;

public final class k implements ListIterator, a
{
    public static final k C;
    
    static {
        C = (k)new Object();
    }
    
    public final boolean hasNext() {
        return false;
    }
    
    public final boolean hasPrevious() {
        return false;
    }
    
    public final Object next() {
        throw new NoSuchElementException();
    }
    
    public final int nextIndex() {
        return 0;
    }
    
    public final Object previous() {
        throw new NoSuchElementException();
    }
    
    public final int previousIndex() {
        return -1;
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

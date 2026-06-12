package n5;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class a implements Iterator, o5.a
{
    public final Object[] C;
    public int D;
    
    public a(final Object[] c) {
        this.C = c;
    }
    
    public final boolean hasNext() {
        return this.D < this.C.length;
    }
    
    public final Object next() {
        try {
            return this.C[this.D++];
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            --this.D;
            throw new NoSuchElementException(((Throwable)ex).getMessage());
        }
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package U2;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.ListIterator;
import B2.h;

public final class b extends h implements ListIterator
{
    public final int D;
    public int E;
    public final d F;
    
    public b(final d f, final int e) {
        final int size = f.size();
        super(1);
        if (e >= 0 && e <= size) {
            this.D = size;
            this.E = e;
            this.F = f;
            return;
        }
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.auth.h.d(e, "index", size));
    }
    
    public final Object a(final int n) {
        return ((List)this.F).get(n);
    }
    
    public final void add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean hasNext() {
        return this.E < this.D;
    }
    
    public final boolean hasPrevious() {
        return this.E > 0;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            return this.a(this.E++);
        }
        throw new NoSuchElementException();
    }
    
    public final int nextIndex() {
        return this.E;
    }
    
    public final Object previous() {
        if (this.hasPrevious()) {
            final int e = this.E - 1;
            this.E = e;
            return this.a(e);
        }
        throw new NoSuchElementException();
    }
    
    public final int previousIndex() {
        return this.E - 1;
    }
    
    public final void set(final Object o) {
        throw new UnsupportedOperationException();
    }
}

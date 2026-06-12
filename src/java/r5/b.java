package r5;

import java.util.NoSuchElementException;
import o5.a;
import java.util.Iterator;

public final class b implements Iterator, a
{
    public final int C;
    public final int D;
    public boolean E;
    public int F;
    
    public b(int f, final int d, final int c) {
        this.C = c;
        this.D = d;
        boolean e = false;
        Label_0040: {
            if (c > 0) {
                if (f > d) {
                    break Label_0040;
                }
            }
            else if (f < d) {
                break Label_0040;
            }
            e = true;
        }
        this.E = e;
        if (!e) {
            f = d;
        }
        this.F = f;
    }
    
    public final boolean hasNext() {
        return this.E;
    }
    
    public final Object next() {
        final int f = this.F;
        if (f == this.D) {
            if (!this.E) {
                throw new NoSuchElementException();
            }
            this.E = false;
        }
        else {
            this.F = this.C + f;
        }
        return f;
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

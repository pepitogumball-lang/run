package t;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class f implements Iterator
{
    public final int C;
    public int D;
    public int E;
    public boolean F;
    public final a G;
    
    public f(final a g, final int c) {
        this.G = g;
        this.F = false;
        this.C = c;
        this.D = g.d();
    }
    
    public final boolean hasNext() {
        return this.E < this.D;
    }
    
    public final Object next() {
        if (this.hasNext()) {
            final Object b = this.G.b(this.E, this.C);
            ++this.E;
            this.F = true;
            return b;
        }
        throw new NoSuchElementException();
    }
    
    public final void remove() {
        if (this.F) {
            final int e = this.E - 1;
            this.E = e;
            --this.D;
            this.F = false;
            this.G.g(e);
            return;
        }
        throw new IllegalStateException();
    }
}

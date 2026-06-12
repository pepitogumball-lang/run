package q;

import java.util.Iterator;

public final class d extends e implements Iterator
{
    public c C;
    public boolean D;
    public final f E;
    
    public d(final f e) {
        this.E = e;
        this.D = true;
    }
    
    @Override
    public final void a(c f) {
        final c c = this.C;
        if (f == c) {
            f = c.F;
            this.C = f;
            this.D = (f == null);
        }
    }
    
    public final boolean hasNext() {
        final boolean d = this.D;
        final boolean b = false;
        boolean b2 = false;
        if (d) {
            if (this.E.C != null) {
                b2 = true;
            }
            return b2;
        }
        final c c = this.C;
        boolean b3 = b;
        if (c != null) {
            b3 = b;
            if (c.E != null) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final Object next() {
        if (this.D) {
            this.D = false;
            this.C = this.E.C;
        }
        else {
            final c c = this.C;
            c e;
            if (c != null) {
                e = c.E;
            }
            else {
                e = null;
            }
            this.C = e;
        }
        return this.C;
    }
}

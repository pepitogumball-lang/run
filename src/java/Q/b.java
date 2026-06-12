package q;

import java.util.Iterator;

public final class b extends e implements Iterator
{
    public c C;
    public c D;
    public final int E;
    
    public b(final c d, final c c, final int e) {
        this.E = e;
        this.C = c;
        this.D = d;
    }
    
    @Override
    public final void a(c b) {
        final c c = this.C;
        final c c2 = null;
        if (c == b && b == this.D) {
            this.D = null;
            this.C = null;
        }
        final c c3 = this.C;
        if (c3 == b) {
            c c4 = null;
            switch (this.E) {
                default: {
                    c4 = c3.E;
                    break;
                }
                case 0: {
                    c4 = c3.F;
                    break;
                }
            }
            this.C = c4;
        }
        final c d = this.D;
        if (d == b) {
            final c c5 = this.C;
            b = c2;
            if (d != c5) {
                if (c5 == null) {
                    b = c2;
                }
                else {
                    b = this.b(d);
                }
            }
            this.D = b;
        }
    }
    
    public final c b(final c c) {
        switch (this.E) {
            default: {
                return c.F;
            }
            case 0: {
                return c.E;
            }
        }
    }
    
    public final boolean hasNext() {
        return this.D != null;
    }
    
    public final Object next() {
        final c d = this.D;
        final c c = this.C;
        c b;
        if (d != c && c != null) {
            b = this.b(d);
        }
        else {
            b = null;
        }
        this.D = b;
        return d;
    }
}

package u5;

import java.util.NoSuchElementException;
import o5.a;
import java.util.Iterator;

public final class b implements Iterator, a
{
    public final String C;
    public int D;
    public int E;
    public int F;
    public int G;
    
    public b(final String c) {
        this.C = c;
    }
    
    public final boolean hasNext() {
        final int d = this.D;
        boolean b = false;
        if (d != 0) {
            if (d == 1) {
                b = true;
            }
            return b;
        }
        final int g = this.G;
        int g2 = 2;
        if (g < 0) {
            this.D = 2;
            return false;
        }
        final String c = this.C;
        final int length = c.length();
    Label_0135:
        while (true) {
            for (int i = this.E; i < c.length(); ++i) {
                final char char1 = c.charAt(i);
                if (char1 == '\n' || char1 == '\r') {
                    if (char1 == '\r') {
                        final int n = i + 1;
                        if (n < c.length() && c.charAt(n) == '\n') {
                            break Label_0135;
                        }
                    }
                    g2 = 1;
                    this.D = 1;
                    this.G = g2;
                    this.F = i;
                    return true;
                }
            }
            g2 = -1;
            int i = length;
            continue Label_0135;
        }
    }
    
    public final Object next() {
        if (this.hasNext()) {
            this.D = 0;
            final int f = this.F;
            final int e = this.E;
            this.E = this.G + f;
            return this.C.subSequence(e, f).toString();
        }
        throw new NoSuchElementException();
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

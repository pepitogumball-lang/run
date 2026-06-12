package y;

import java.util.Iterator;

public class f extends e
{
    public int m;
    
    public f(final n n) {
        super(n);
        if (n instanceof j) {
            super.e = 2;
        }
        else {
            super.e = 3;
        }
    }
    
    @Override
    public final void d(final int g) {
        if (super.j) {
            return;
        }
        super.j = true;
        super.g = g;
        for (final d d : super.k) {
            d.a(d);
        }
    }
}

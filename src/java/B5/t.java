package B5;

import w5.v;
import n3.u0;
import e5.i;
import g5.d;
import w5.a;

public class t extends a implements d
{
    public final e5.d F;
    
    public t(final e5.d f, final i i) {
        super(i, true);
        this.F = f;
    }
    
    @Override
    public final boolean H() {
        return true;
    }
    
    @Override
    public final d e() {
        final e5.d f = this.F;
        d d;
        if (f instanceof d) {
            d = (d)f;
        }
        else {
            d = null;
        }
        return d;
    }
    
    @Override
    public void o(final Object o) {
        B5.a.i(u0.o(this.F), v.k(o));
    }
    
    @Override
    public void p(final Object o) {
        this.F.h(v.k(o));
    }
}

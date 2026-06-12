package B5;

import c5.h;
import w5.v;
import A0.c;
import m5.l;
import n5.i;

public final class p extends i implements l
{
    public final l D;
    public final Object E;
    public final e5.i F;
    
    public p(final l d, final Object e, final e5.i f) {
        this.D = d;
        this.E = e;
        this.F = f;
        super(1);
    }
    
    @Override
    public final Object g(final Object o) {
        final Throwable t = (Throwable)o;
        final c a = B5.a.a(this.D, this.E, null);
        if (a != null) {
            v.f(this.F, (Throwable)a);
        }
        return h.a;
    }
}

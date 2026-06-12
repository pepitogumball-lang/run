package y5;

import w5.a0;
import w5.S;
import w5.Y;
import java.util.concurrent.CancellationException;
import B5.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import E5.g;
import c5.h;
import w5.v;
import e5.i;
import w5.a;

public final class n extends a implements o, f
{
    public final b F;
    
    public n(final i i, final b f) {
        super(i, true);
        this.F = f;
    }
    
    public final void R(final Throwable t, final boolean b) {
        if (!this.F.e(t, false) && !b) {
            v.f(super.E, t);
        }
    }
    
    public final void S(final Object o) {
        final h h = (h)o;
        this.F.e(null, false);
    }
    
    public final void U(final g g) {
        final b f = this.F;
        f.getClass();
        AtomicReferenceFieldUpdater m;
        do {
            m = b.M;
            if (m.compareAndSet((Object)f, (Object)null, (Object)g)) {
                return;
            }
        } while (m.get((Object)f) == null);
    Label_0038:
        while (true) {
            final Object value = m.get((Object)f);
            final w q = d.q;
            if (value == q) {
                while (!m.compareAndSet((Object)f, (Object)q, (Object)d.r)) {
                    if (m.get((Object)f) != q) {
                        continue Label_0038;
                    }
                }
                g.g((Object)f.j());
                return;
            }
            if (value == d.r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            final StringBuilder sb = new StringBuilder("Another handler is already registered: ");
            sb.append(value);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
    
    public final void b(final CancellationException ex) {
        final Object c = ((a0)this).C();
        if (!(c instanceof w5.n)) {
            if (!(c instanceof Y) || !((Y)c).d()) {
                CancellationException ex2;
                if ((ex2 = ex) == null) {
                    ex2 = new S(this.t(), null, (a0)this);
                }
                this.r(ex2);
            }
        }
    }
    
    public final Object k(final Object o) {
        return this.F.k(o);
    }
    
    public final void r(final CancellationException ex) {
        this.F.e((Throwable)ex, true);
        ((a0)this).q((Object)ex);
    }
}

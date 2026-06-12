package w5;

import B5.a;
import B5.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n5.h;
import B5.k;
import B5.b;

public final class Z extends b
{
    public final V b;
    public b0 c;
    public final a0 d;
    public final M e;
    
    public Z(final V b, final a0 d, final M e) {
        this.d = d;
        this.e = e;
        this.b = b;
    }
    
    public final void b(final Object o, final Object o2) {
        final k k = (k)o;
        final boolean b = o2 == null;
        final V b2 = this.b;
        M c;
        if (b) {
            c = b2;
        }
        else {
            c = this.c;
        }
        if (c != null) {
            final AtomicReferenceFieldUpdater c2 = B5.k.C;
            while (!c2.compareAndSet((Object)k, (Object)this, (Object)c)) {
                if (c2.get((Object)k) != this) {
                    return;
                }
            }
            if (b) {
                final b0 c3 = this.c;
                h.b((Object)c3);
                b2.i((k)c3);
            }
        }
    }
    
    public final w c(final Object o) {
        final k k = (k)o;
        w e;
        if (this.d.C() == this.e) {
            e = null;
        }
        else {
            e = a.e;
        }
        return e;
    }
}

package c1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import J5.b;

public final class d extends b
{
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    
    public d(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void G(final g g, final g g2) {
        this.b.lazySet((Object)g, (Object)g2);
    }
    
    public final void I(final g g, final Thread thread) {
        this.a.lazySet((Object)g, (Object)thread);
    }
    
    public final boolean d(final h h, final c c, final c c2) {
        AtomicReferenceFieldUpdater d;
        do {
            d = this.d;
            if (d.compareAndSet((Object)h, (Object)c, (Object)c2)) {
                return true;
            }
        } while (d.get((Object)h) == c);
        return false;
    }
    
    public final boolean f(final h h, final Object o, final Object o2) {
        AtomicReferenceFieldUpdater e;
        do {
            e = this.e;
            if (e.compareAndSet((Object)h, o, o2)) {
                return true;
            }
        } while (e.get((Object)h) == o);
        return false;
    }
    
    public final boolean h(final h h, final g g, final g g2) {
        AtomicReferenceFieldUpdater c;
        do {
            c = this.c;
            if (c.compareAndSet((Object)h, (Object)g, (Object)g2)) {
                return true;
            }
        } while (c.get((Object)h) == g);
        return false;
    }
}

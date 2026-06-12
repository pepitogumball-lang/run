package V2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import J5.b;

public final class e extends b
{
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    
    public e(final AtomicReferenceFieldUpdater a, final AtomicReferenceFieldUpdater b, final AtomicReferenceFieldUpdater c, final AtomicReferenceFieldUpdater d, final AtomicReferenceFieldUpdater e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void F(final m m, final m i) {
        this.b.lazySet((Object)m, (Object)i);
    }
    
    public final void H(final m m, final Thread thread) {
        this.a.lazySet((Object)m, (Object)thread);
    }
    
    public final boolean c(final n n, final d d, final d d2) {
        AtomicReferenceFieldUpdater d3;
        do {
            d3 = this.d;
            if (d3.compareAndSet((Object)n, (Object)d, (Object)d2)) {
                return true;
            }
        } while (d3.get((Object)n) == d);
        return false;
    }
    
    public final boolean e(final n n, final Object o, final Object o2) {
        AtomicReferenceFieldUpdater e;
        do {
            e = this.e;
            if (e.compareAndSet((Object)n, o, o2)) {
                return true;
            }
        } while (e.get((Object)n) == o);
        return false;
    }
    
    public final boolean g(final n n, final m m, final m i) {
        AtomicReferenceFieldUpdater c;
        do {
            c = this.c;
            if (c.compareAndSet((Object)n, (Object)m, (Object)i)) {
                return true;
            }
        } while (c.get((Object)n) == m);
        return false;
    }
    
    public final d y(final n n) {
        return (d)this.d.getAndSet((Object)n, (Object)V2.d.d);
    }
    
    public final m z(final n n) {
        return (m)this.c.getAndSet((Object)n, (Object)m.c);
    }
}

package B5;

import n5.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class d
{
    public static final AtomicReferenceFieldUpdater C;
    public static final AtomicReferenceFieldUpdater D;
    private volatile Object _next;
    private volatile Object _prev;
    
    static {
        C = AtomicReferenceFieldUpdater.newUpdater((Class)d.class, (Class)Object.class, "_next");
        D = AtomicReferenceFieldUpdater.newUpdater((Class)d.class, (Class)Object.class, "_prev");
    }
    
    public d(final u prev) {
        this._prev = prev;
    }
    
    public final void a() {
        d.D.lazySet((Object)this, (Object)null);
    }
    
    public final d b() {
        final Object value = d.C.get((Object)this);
        if (value == a.b) {
            return null;
        }
        return (d)value;
    }
    
    public abstract boolean c();
    
    public final void d() {
        if (this.b() == null) {
            return;
        }
        d d2;
        d b;
        do {
            AtomicReferenceFieldUpdater d;
            for (d = B5.d.D, d2 = (d)d.get((Object)this); d2 != null && d2.c(); d2 = (d)d.get((Object)d2)) {}
            b = this.b();
            h.b((Object)b);
            while (b.c()) {
                final d b2 = b.b();
                if (b2 == null) {
                    break;
                }
                b = b2;
            }
        Label_0080:
            while (true) {
                final Object value = d.get((Object)b);
                Object o;
                if (value == null) {
                    o = null;
                }
                else {
                    o = d2;
                }
                while (!d.compareAndSet((Object)b, value, o)) {
                    if (d.get((Object)b) != value) {
                        continue Label_0080;
                    }
                }
                break;
            }
            if (d2 != null) {
                B5.d.C.set((Object)d2, (Object)b);
            }
        } while ((b.c() && b.b() != null) || (d2 != null && d2.c()));
    }
}

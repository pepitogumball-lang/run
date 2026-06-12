package B5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b extends q
{
    public static final AtomicReferenceFieldUpdater a;
    private volatile Object _consensus;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater((Class)b.class, (Class)Object.class, "_consensus");
    }
    
    public b() {
        this._consensus = B5.a.a;
    }
    
    @Override
    public final Object a(final Object o) {
        final AtomicReferenceFieldUpdater a = b.a;
        final Object value = a.get((Object)this);
        final w a2 = B5.a.a;
        Object o2 = value;
        if (value == a2) {
            o2 = this.c(o);
            final Object value2 = a.get((Object)this);
            if (value2 != a2) {
                o2 = value2;
            }
            else {
                while (!a.compareAndSet((Object)this, (Object)a2, o2)) {
                    if (a.get((Object)this) != a2) {
                        o2 = a.get((Object)this);
                        break;
                    }
                }
            }
        }
        this.b(o, o2);
        return o2;
    }
    
    public abstract void b(final Object p0, final Object p1);
    
    public abstract w c(final Object p0);
}

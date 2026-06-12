package B5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class l
{
    public static final AtomicReferenceFieldUpdater a;
    private volatile Object _cur;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater((Class)l.class, (Class)Object.class, "_cur");
    }
    
    public l() {
        this._cur = new n(8, false);
    }
    
    public final boolean a(final Runnable runnable) {
        while (true) {
            final AtomicReferenceFieldUpdater a = l.a;
            final n n = (n)a.get((Object)this);
            final int a2 = n.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    continue;
                }
                return false;
            }
            else {
                while (!a.compareAndSet((Object)this, (Object)n, (Object)n.c())) {
                    if (a.get((Object)this) != n) {
                        break;
                    }
                }
            }
        }
    }
    
    public final void b() {
        while (true) {
            final AtomicReferenceFieldUpdater a = l.a;
            final n n = (n)a.get((Object)this);
            if (n.b()) {
                break;
            }
            while (!a.compareAndSet((Object)this, (Object)n, (Object)n.c())) {
                if (a.get((Object)this) != n) {
                    break;
                }
            }
        }
    }
    
    public final int c() {
        final n n = (n)l.a.get((Object)this);
        n.getClass();
        final long value = B5.n.f.get((Object)n);
        return (int)((value & 0xFFFFFFFC0000000L) >> 30) - (int)(0x3FFFFFFFL & value) & 0x3FFFFFFF;
    }
    
    public final Object d() {
        Object d;
        while (true) {
            final AtomicReferenceFieldUpdater a = l.a;
            final n n = (n)a.get((Object)this);
            d = n.d();
            if (d != B5.n.g) {
                break;
            }
            while (!a.compareAndSet((Object)this, (Object)n, (Object)n.c())) {
                if (a.get((Object)this) != n) {
                    break;
                }
            }
        }
        return d;
    }
}

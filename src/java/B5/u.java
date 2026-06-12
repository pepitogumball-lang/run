package B5;

import e5.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w5.d0;

public abstract class u extends d implements d0
{
    public static final AtomicIntegerFieldUpdater F;
    public final long E;
    private volatile int cleanedAndPointers;
    
    static {
        F = AtomicIntegerFieldUpdater.newUpdater((Class)u.class, "cleanedAndPointers");
    }
    
    public u(final long e, final u u, final int n) {
        super(u);
        this.E = e;
        this.cleanedAndPointers = n << 16;
    }
    
    @Override
    public final boolean c() {
        return u.F.get((Object)this) == this.f() && this.b() != null;
    }
    
    public final boolean e() {
        return u.F.addAndGet((Object)this, -65536) == this.f() && this.b() != null;
    }
    
    public abstract int f();
    
    public abstract void g(final int p0, final i p1);
    
    public final void h() {
        if (u.F.incrementAndGet((Object)this) == this.f()) {
            this.d();
        }
    }
    
    public final boolean i() {
        AtomicIntegerFieldUpdater f;
        int value;
        do {
            f = u.F;
            value = f.get((Object)this);
            if (value == this.f() && this.b() != null) {
                return false;
            }
        } while (!f.compareAndSet((Object)this, value, 65536 + value));
        return true;
    }
}

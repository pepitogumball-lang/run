package w5;

import m5.l;
import B5.a;
import n3.u0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import B5.t;

public final class A extends t
{
    public static final AtomicIntegerFieldUpdater G;
    private volatile int _decision;
    
    static {
        G = AtomicIntegerFieldUpdater.newUpdater((Class)A.class, "_decision");
    }
    
    public final void o(final Object o) {
        this.p(o);
    }
    
    public final void p(final Object o) {
        AtomicIntegerFieldUpdater g;
        do {
            g = A.G;
            final int value = g.get((Object)this);
            if (value != 0) {
                if (value == 1) {
                    a.h(u0.o(super.F), v.k(o), (l)null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!g.compareAndSet((Object)this, 0, 2));
    }
}

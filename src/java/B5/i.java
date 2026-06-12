package B5;

import V2.o;
import w5.x;
import D5.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w5.z;
import w5.s;

public final class i extends s implements z
{
    public static final AtomicIntegerFieldUpdater I;
    public final k E;
    public final int F;
    public final l G;
    public final Object H;
    private volatile int runningWorkers;
    
    static {
        I = AtomicIntegerFieldUpdater.newUpdater((Class)i.class, "runningWorkers");
    }
    
    public i(final k e, int a) {
        this.E = e;
        this.F = a;
        z z;
        if (e instanceof z) {
            z = (z)e;
        }
        else {
            z = null;
        }
        if (z == null) {
            a = x.a;
        }
        this.G = new l();
        this.H = new Object();
    }
    
    @Override
    public final void g(final e5.i i, final Runnable runnable) {
        this.G.a(runnable);
        final AtomicIntegerFieldUpdater j = i.I;
        if (j.get((Object)this) < this.F) {
            final Object h = this.H;
            synchronized (h) {
                if (j.get((Object)this) < this.F) {
                    j.incrementAndGet((Object)this);
                    monitorexit(h);
                    final Runnable k = this.j();
                    if (k != null) {
                        this.E.g(this, (Runnable)new o(1, (Object)this, (Object)k, false));
                    }
                }
            }
        }
    }
    
    public final Runnable j() {
        Runnable runnable;
        while (true) {
            runnable = (Runnable)this.G.d();
            if (runnable == null) {
                final Object h = this.H;
                synchronized (h) {
                    final AtomicIntegerFieldUpdater i = B5.i.I;
                    i.decrementAndGet((Object)this);
                    if (this.G.c() == 0) {
                        return null;
                    }
                    i.incrementAndGet((Object)this);
                    continue;
                }
                break;
            }
            break;
        }
        return runnable;
    }
}

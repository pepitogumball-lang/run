package l3;

import O2.a;
import h3.d;
import n3.u0;
import O2.t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

public final class b implements Executor
{
    public final ExecutorService C;
    public final Object D;
    public t E;
    
    public b(final ExecutorService c) {
        this.D = new Object();
        this.E = u0.m((Object)null);
        this.C = c;
    }
    
    public final t a(final Runnable runnable) {
        final Object d = this.D;
        synchronized (d) {
            return this.E = this.E.e((Executor)this.C, (a)new d(runnable, 5));
        }
    }
    
    public final void execute(final Runnable runnable) {
        ((Executor)this.C).execute(runnable);
    }
}

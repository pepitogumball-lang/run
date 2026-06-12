package b1;

import O2.p;
import java.util.concurrent.ExecutorService;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class i implements Executor
{
    public final ArrayDeque C;
    public final ExecutorService D;
    public final Object E;
    public volatile Runnable F;
    
    public i(final ExecutorService d) {
        this.D = d;
        this.C = new ArrayDeque();
        this.E = new Object();
    }
    
    public final void a() {
        final Object e;
        monitorenter(e = this.E);
        Label_0049: {
            try {
                final Runnable f = (Runnable)this.C.poll();
                this.F = f;
                if (f != null) {
                    ((Executor)this.D).execute(this.F);
                }
                break Label_0049;
            }
            finally {
                monitorexit(e);
                monitorexit(e);
            }
        }
    }
    
    public final void execute(final Runnable runnable) {
        final Object e;
        monitorenter(e = this.E);
        Label_0054: {
            try {
                this.C.add((Object)new p((Object)this, 10, (Object)runnable));
                if (this.F == null) {
                    this.a();
                }
                break Label_0054;
            }
            finally {
                monitorexit(e);
                monitorexit(e);
            }
        }
    }
}

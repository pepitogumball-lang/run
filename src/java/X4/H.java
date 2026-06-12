package x4;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

public final class h implements d
{
    public final ExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final AtomicBoolean c;
    
    public h(final ExecutorService a) {
        this.a = a;
        this.b = new ConcurrentLinkedQueue();
        this.c = new AtomicBoolean(false);
    }
    
    @Override
    public final void a(final b b) {
        this.b.add((Object)b);
        ((Executor)this.a).execute((Runnable)new g(this, 0));
    }
    
    public final void b() {
        final ExecutorService a = this.a;
        final ConcurrentLinkedQueue b = this.b;
        final AtomicBoolean c = this.c;
        if (c.compareAndSet(false, true)) {
            Label_0053: {
                try {
                    final Runnable runnable = (Runnable)b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                    break Label_0053;
                }
                finally {
                    c.set(false);
                    if (!b.isEmpty()) {
                        ((Executor)a).execute((Runnable)new g(this, 1));
                    }
                    c.set(false);
                    iftrue(Label_0113:)(b.isEmpty());
                    ((Executor)a).execute((Runnable)new g(this, 1));
                }
            }
        }
        Label_0113:;
    }
}

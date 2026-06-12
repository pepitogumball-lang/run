package u;

import java.lang.ref.Reference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import V2.q;

public final class j implements q
{
    public final WeakReference C;
    public final i D;
    
    public j(final h h) {
        this.D = new i(this);
        this.C = new WeakReference((Object)h);
    }
    
    public final void a(final Runnable runnable, final Executor executor) {
        this.D.a(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        final h h = (h)((Reference)this.C).get();
        final boolean cancel = this.D.cancel(b);
        if (cancel && h != null) {
            h.a = null;
            h.b = null;
            h.c.k((Object)null);
        }
        return cancel;
    }
    
    public final Object get() {
        return this.D.get();
    }
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.D.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.D.C instanceof a;
    }
    
    public final boolean isDone() {
        return this.D.isDone();
    }
    
    @Override
    public final String toString() {
        return this.D.toString();
    }
}

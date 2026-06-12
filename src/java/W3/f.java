package W3;

import Z3.c;
import com.google.android.gms.internal.auth.h;
import Z3.d;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import Y3.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import R3.a;

public final class f
{
    public static final a f;
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;
    
    static {
        f = a.d();
    }
    
    public f() {
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        final Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = singleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }
    
    public final void a(final long e, final j j) {
        monitorenter(this);
        while (true) {
            try {
                this.e = e;
                final f f = this;
                final ScheduledExecutorService scheduledExecutorService = f.a;
                final e e2 = new(W3.e.class)();
                final e e4;
                final e e3 = e4 = e2;
                final f f2 = this;
                final j i = j;
                final int n = 0;
                new e(f2, i, n);
                final f f3 = this;
                final ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                final e e5 = e3;
                final long n2 = 0L;
                final long n3 = e;
                final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                final ScheduledFuture scheduledFuture = scheduledExecutorService2.scheduleAtFixedRate((Runnable)e5, n2, n3, timeUnit);
                f3.d = scheduledFuture;
                break Label_0092;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return;
            }
            try {
                final f f = this;
                final ScheduledExecutorService scheduledExecutorService = f.a;
                final e e2 = new(W3.e.class)();
                final e e4;
                final e e3 = e4 = e2;
                final f f2 = this;
                final j i = j;
                final int n = 0;
                new e(f2, i, n);
                final f f3 = this;
                final ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                final e e5 = e3;
                final long n2 = 0L;
                final long n3 = e;
                final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                final ScheduledFuture scheduledFuture = scheduledExecutorService2.scheduleAtFixedRate((Runnable)e5, n2, n3, timeUnit);
                f3.d = scheduledFuture;
                continue;
            }
            catch (final RejectedExecutionException ex) {}
            break;
        }
    }
    
    public final d b(final j j) {
        if (j == null) {
            return null;
        }
        final long c = j.C;
        final long a = j.a();
        final c w = Z3.d.w();
        w.l();
        Z3.d.u((d)w.D, a + c);
        final Runtime c2 = this.c;
        final int w2 = h.w(Y3.a.b(5) * (c2.totalMemory() - c2.freeMemory()) / 1024L);
        w.l();
        Z3.d.v((d)w.D, w2);
        return (d)w.j();
    }
}

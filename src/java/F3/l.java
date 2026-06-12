package f3;

import java.util.concurrent.RejectedExecutionException;
import h2.A;
import O2.p;
import java.util.ArrayDeque;
import java.util.logging.Logger;
import java.util.concurrent.Executor;

public final class l implements Executor
{
    public static final Logger H;
    public final Executor C;
    public final ArrayDeque D;
    public int E;
    public long F;
    public final p G;
    
    static {
        H = Logger.getLogger(l.class.getName());
    }
    
    public l(final Executor c) {
        this.D = new ArrayDeque();
        this.E = 1;
        this.F = 0L;
        this.G = new p(this);
        A.h((Object)c);
        this.C = c;
    }
    
    public final void execute(Runnable d) {
        A.h((Object)d);
        ArrayDeque arrayDeque;
        monitorenter(arrayDeque = this.D);
        Label_0224: {
            try {
                final int e = this.E;
                if (e == 4 || e == 3) {
                    break Label_0224;
                }
                final long f = this.F;
                final k k = new k((Runnable)d, 0);
                this.D.add((Object)k);
                this.E = 2;
                monitorexit(arrayDeque);
                try {
                    this.C.execute((Runnable)this.G);
                    if (this.E != 2) {
                        return;
                    }
                    d = (Error)this.D;
                    final Error error;
                    monitorenter(error = d);
                    Label_0133: {
                        try {
                            if (this.F == f && this.E == 2) {
                                this.E = 3;
                            }
                            break Label_0133;
                        }
                        finally {
                            monitorexit(error);
                            monitorexit(error);
                            return;
                        }
                    }
                }
                catch (final Error d) {}
                catch (final RuntimeException ex) {}
                monitorenter(arrayDeque = this.D);
                try {
                    final int e2 = this.E;
                    boolean b = true;
                    if ((e2 != 1 && e2 != 2) || !this.D.removeLastOccurrence((Object)k)) {
                        b = false;
                    }
                    if (d instanceof RejectedExecutionException && !b) {
                        monitorexit(arrayDeque);
                        return;
                    }
                    throw d;
                }
                finally {
                    monitorexit(arrayDeque);
                    throw d;
                }
            }
            finally {
                monitorexit(arrayDeque);
                this.D.add((Object)d);
                monitorexit(arrayDeque);
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(System.identityHashCode((Object)this));
        sb.append("{");
        sb.append((Object)this.C);
        sb.append("}");
        return sb.toString();
    }
}

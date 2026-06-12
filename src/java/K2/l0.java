package K2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class l0 extends FutureTask implements Comparable
{
    public final long C;
    public final boolean D;
    public final String E;
    public final k0 F;
    
    public l0(final k0 f, final Runnable runnable, final boolean d, final String e) {
        this.F = f;
        super(runnable, (Object)null);
        final long andIncrement = k0.M.getAndIncrement();
        this.C = andIncrement;
        this.E = e;
        this.D = d;
        if (andIncrement == Long.MAX_VALUE) {
            f.j().H.f("Tasks index overflow");
        }
    }
    
    public l0(final k0 f, final Callable callable, final boolean d) {
        this.F = f;
        super(callable);
        final long andIncrement = k0.M.getAndIncrement();
        this.C = andIncrement;
        this.E = "Task exception on worker thread";
        this.D = d;
        if (andIncrement == Long.MAX_VALUE) {
            f.j().H.f("Tasks index overflow");
        }
    }
    
    public final int compareTo(final Object o) {
        final l0 l0 = (l0)o;
        final boolean d = l0.D;
        final boolean d2 = this.D;
        if (d2 != d) {
            if (d2) {
                return -1;
            }
            return 1;
        }
        else {
            final long c = l0.C;
            final long c2 = this.C;
            final long n = lcmp(c2, c);
            if (n < 0) {
                return -1;
            }
            if (n > 0) {
                return 1;
            }
            this.F.j().I.g("Two tasks share the same index. index", c2);
            return 0;
        }
    }
    
    public final void setException(final Throwable exception) {
        this.F.j().H.g(this.E, exception);
        super.setException(exception);
    }
}

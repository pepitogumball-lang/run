package f3;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import u.a;
import V4.G;
import java.util.concurrent.ScheduledFuture;
import u.g;

public final class i extends g implements ScheduledFuture
{
    public final ScheduledFuture J;
    
    public i(final h h) {
        this.J = h.a(new G((Object)this, 6));
    }
    
    public final int compareTo(final Object o) {
        return ((Comparable)this.J).compareTo((Object)o);
    }
    
    @Override
    public final void d() {
        final ScheduledFuture j = this.J;
        final Object c = super.C;
        ((Future)j).cancel(c instanceof a && ((a)c).a);
    }
    
    public final long getDelay(final TimeUnit timeUnit) {
        return ((Delayed)this.J).getDelay(timeUnit);
    }
}

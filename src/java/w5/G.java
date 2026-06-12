package w5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class g extends n
{
    public static final AtomicIntegerFieldUpdater c;
    private volatile int _resumed;
    
    static {
        c = AtomicIntegerFieldUpdater.newUpdater((Class)g.class, "_resumed");
    }
    
    public g(final f f, final Throwable t, final boolean b) {
        Object o = t;
        if (t == null) {
            final StringBuilder sb = new StringBuilder("Continuation ");
            sb.append((Object)f);
            sb.append(" was cancelled normally");
            o = new CancellationException(sb.toString());
        }
        super((Throwable)o, b);
        this._resumed = 0;
    }
}

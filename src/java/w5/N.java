package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class n
{
    public static final AtomicIntegerFieldUpdater b;
    private volatile int _handled;
    public final Throwable a;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater((Class)n.class, "_handled");
    }
    
    public n(final Throwable a, final boolean handled) {
        this.a = a;
        this._handled = (handled ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('[');
        sb.append((Object)this.a);
        sb.append(']');
        return sb.toString();
    }
}

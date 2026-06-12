package t5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements b
{
    public final AtomicReference a;
    
    public a(final e e) {
        this.a = new AtomicReference((Object)e);
    }
    
    @Override
    public final Iterator iterator() {
        final b b = (b)this.a.getAndSet((Object)null);
        if (b != null) {
            return b.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

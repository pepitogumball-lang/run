package F4;

import w2.e;
import java.util.concurrent.atomic.AtomicReference;
import c2.k;
import java.util.concurrent.atomic.AtomicBoolean;

public final class g
{
    public final AtomicBoolean a;
    public final k b;
    
    public g(final k b) {
        this.b = b;
        this.a = new AtomicBoolean(false);
    }
    
    public final void a(final Object o) {
        if (!this.a.get()) {
            final k b = this.b;
            if (((AtomicReference)b.E).get() == this) {
                final e e = (e)b.F;
                ((f)e.D).k((String)e.E, ((v)e.F).a(o));
            }
        }
    }
}

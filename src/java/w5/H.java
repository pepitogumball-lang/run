package w5;

import B5.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import e5.d;
import B5.a;

public final class h extends T
{
    public final f G;
    
    public h(final f g) {
        this.G = g;
    }
    
    @Override
    public final void n(final Throwable t) {
        final a0 m = this.m();
        final f g = this.G;
        final Throwable s = g.s(m);
        if (g.x()) {
            final d f = g.F;
            n5.h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", (Object)f);
            final B5.h h = (B5.h)f;
        Label_0043:
            while (true) {
                final AtomicReferenceFieldUpdater j = B5.h.J;
                final Object value = j.get((Object)h);
                final w d = a.d;
                if (n5.h.a(value, (Object)d)) {
                    while (!j.compareAndSet((Object)h, (Object)d, (Object)s)) {
                        if (j.get((Object)h) != d) {
                            continue Label_0043;
                        }
                    }
                    return;
                }
                if (value instanceof Throwable) {
                    return;
                }
                while (!j.compareAndSet((Object)h, value, (Object)null)) {
                    if (j.get((Object)h) != value) {
                        continue Label_0043;
                    }
                }
                break;
            }
        }
        g.p(s);
        if (!g.x()) {
            g.q();
        }
    }
}

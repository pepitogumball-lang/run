package u;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import com.google.android.gms.internal.auth.m;

public final class d extends m
{
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    
    public d(final AtomicReferenceFieldUpdater f, final AtomicReferenceFieldUpdater g, final AtomicReferenceFieldUpdater h, final AtomicReferenceFieldUpdater i, final AtomicReferenceFieldUpdater j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final boolean c(final g g, final c c, final c c2) {
        AtomicReferenceFieldUpdater i;
        do {
            i = this.i;
            if (i.compareAndSet((Object)g, (Object)c, (Object)c2)) {
                return true;
            }
        } while (i.get((Object)g) == c);
        return false;
    }
    
    public final boolean d(final g g, final Object o, final Object o2) {
        AtomicReferenceFieldUpdater j;
        do {
            j = this.j;
            if (j.compareAndSet((Object)g, o, o2)) {
                return true;
            }
        } while (j.get((Object)g) == o);
        return false;
    }
    
    public final boolean e(final g g, final f f, final f f2) {
        AtomicReferenceFieldUpdater h;
        do {
            h = this.h;
            if (h.compareAndSet((Object)g, (Object)f, (Object)f2)) {
                return true;
            }
        } while (h.get((Object)g) == f);
        return false;
    }
    
    public final void t(final f f, final f f2) {
        this.g.lazySet((Object)f, (Object)f2);
    }
    
    public final void u(final f f, final Thread thread) {
        this.f.lazySet((Object)f, (Object)thread);
    }
}

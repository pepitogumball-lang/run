package w5;

import java.util.concurrent.locks.LockSupport;
import n5.h;
import e5.i;

public final class c extends a
{
    public final Thread F;
    public final I G;
    
    public c(final i i, final Thread f, final I g) {
        super(i, true);
        this.F = f;
        this.G = g;
    }
    
    public final void o(final Object o) {
        final Thread currentThread = Thread.currentThread();
        final Thread f = this.F;
        if (!h.a((Object)currentThread, (Object)f)) {
            LockSupport.unpark(f);
        }
    }
}

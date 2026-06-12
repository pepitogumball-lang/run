package w5;

import B5.a;
import e5.e;
import e5.d;
import e5.h;
import g5.c;
import e5.i;
import B5.t;

public final class j0 extends t
{
    public final ThreadLocal G;
    private volatile boolean threadLocalIsSet;
    
    public j0(final i i, final c c) {
        final k0 c2 = k0.C;
        i c3;
        if (i.i((h)c2) == null) {
            c3 = i.c((i)c2);
        }
        else {
            c3 = i;
        }
        super((d)c, c3);
        this.G = new ThreadLocal();
        if (!(((d)c).getContext().i((h)e.C) instanceof s)) {
            final Object m = a.m(i, (Object)null);
            a.g(i, m);
            this.V(i, m);
        }
    }
    
    public final boolean U() {
        final boolean b = this.threadLocalIsSet && this.G.get() == null;
        this.G.remove();
        return b ^ true;
    }
    
    public final void V(final i i, final Object o) {
        this.threadLocalIsSet = true;
        this.G.set((Object)new c5.c((Object)i, o));
    }
    
    public final void p(Object p) {
        if (this.threadLocalIsSet) {
            final c5.c c = (c5.c)this.G.get();
            if (c != null) {
                a.g((i)c.C, c.D);
            }
            this.G.remove();
        }
        final Object k = v.k(p);
        final d f = super.F;
        final i context = f.getContext();
        p = null;
        final Object m = a.m(context, (Object)null);
        if (m != a.f) {
            p = v.p(f, context, m);
        }
        try {
            super.F.h(k);
        }
        finally {
            if (p == null || ((j0)p).U()) {
                a.g(context, m);
            }
        }
    }
}

package W;

import e5.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import m5.p;
import g5.h;

public final class g extends h implements p
{
    public Iterator G;
    public Object H;
    public int I;
    public Object J;
    public final List K;
    public final ArrayList L;
    
    public g(final List k, final ArrayList l, final d d) {
        this.K = k;
        this.L = l;
        super(2, d);
    }
    
    public final Object f(final Object o, final Object o2) {
        return ((g)this.i((d)o2, o)).l(c5.h.a);
    }
    
    public final d i(final d d, final Object j) {
        final g g = new g(this.K, this.L, d);
        g.J = j;
        return (d)g;
    }
    
    public final Object l(Object j) {
        final int i = this.I;
        Iterator iterator;
        Object l;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iterator = this.G;
                l = this.J;
                com.google.android.gms.internal.auth.h.z(j);
            }
            else {
                final Object h = this.H;
                iterator = this.G;
                l = this.J;
                com.google.android.gms.internal.auth.h.z(j);
                if (j) {
                    ((List)l).add((Object)new h(1, (d)null));
                    this.J = l;
                    this.G = iterator;
                    this.H = null;
                    this.I = 2;
                    throw null;
                }
                j = h;
            }
        }
        else {
            com.google.android.gms.internal.auth.h.z(j);
            j = this.J;
            iterator = ((Iterable)this.K).iterator();
            l = this.L;
        }
        if (!iterator.hasNext()) {
            return j;
        }
        if (iterator.next() == null) {
            this.J = l;
            this.G = iterator;
            this.H = j;
            this.I = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}

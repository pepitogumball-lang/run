package c1;

import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import V2.q;

public final class j extends h
{
    public final boolean k(final Object o) {
        Object i = o;
        if (o == null) {
            i = h.I;
        }
        boolean b;
        if (h.H.f((h)this, (Object)null, i)) {
            h.d(this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean l(final Throwable t) {
        boolean b;
        if (h.H.f((h)this, (Object)null, (Object)new b(t))) {
            h.d(this);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean m(final q q) {
        q.getClass();
        final Object c = super.C;
        final boolean b = false;
        Object c2 = c;
        Label_0137: {
            if (c == null) {
                if (((Future)q).isDone()) {
                    final Object g = h.g(q);
                    final boolean b2 = b;
                    if (!h.H.f((h)this, (Object)null, g)) {
                        return b2;
                    }
                    h.d(this);
                }
                else {
                    final e e = new e(this, q);
                    if (!h.H.f((h)this, (Object)null, (Object)e)) {
                        c2 = super.C;
                        break Label_0137;
                    }
                    try {
                        q.a((Runnable)e, (Executor)i.C);
                    }
                    finally {
                        b b4 = null;
                        try {
                            final Throwable t;
                            final b b3 = new b(t);
                        }
                        finally {
                            b4 = c1.b.b;
                        }
                        h.H.f((h)this, (Object)e, (Object)b4);
                    }
                }
                return true;
            }
        }
        boolean b2 = b;
        if (c2 instanceof a) {
            ((Future)q).cancel(((a)c2).a);
            b2 = b;
        }
        return b2;
    }
}

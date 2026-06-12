package E5;

import B5.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import w5.f;
import w5.v;
import n3.u0;
import c5.h;
import g5.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends i implements a
{
    public static final AtomicReferenceFieldUpdater g;
    private volatile Object owner;
    
    static {
        g = AtomicReferenceFieldUpdater.newUpdater((Class)d.class, (Class)Object.class, "owner");
    }
    
    public d(final boolean b) {
        super(b ? 1 : 0);
        Object a;
        if ((b ? 1 : 0) != 0) {
            a = null;
        }
        else {
            a = E5.e.a;
        }
        this.owner = a;
    }
    
    public final boolean c() {
        final int value = i.f.get((Object)this);
        boolean b = false;
        if (Math.max(value, 0) == 0) {
            b = true;
        }
        return b;
    }
    
    public final Object d(c c) {
        int n;
        while (true) {
            final AtomicIntegerFieldUpdater f = i.f;
            final int value = f.get((Object)this);
            if (value > 1) {
                int value2;
                do {
                    value2 = f.get((Object)this);
                    if (value2 > 1) {
                        continue;
                    }
                    break;
                } while (!f.compareAndSet((Object)this, value2, 1));
            }
            else {
                if (value <= 0) {
                    n = 1;
                    break;
                }
                if (f.compareAndSet((Object)this, value, value - 1)) {
                    d.g.set((Object)this, (Object)null);
                    n = 0;
                    break;
                }
                continue;
            }
        }
        Object a;
        final Object o = a = h.a;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            else {
                c = (c)v.e(u0.o((e5.d)c));
                try {
                    a = new E5.c(this, (f)c);
                    this.a((E5.c)a);
                    c = (c)((f)c).t();
                    final f5.a c2 = f5.a.C;
                    if (c != c2) {
                        c = (c)o;
                    }
                    a = o;
                    if (c == c2) {
                        a = c;
                    }
                }
                finally {
                    ((f)c).A();
                }
            }
        }
        return a;
    }
    
    public final void e(final Object o) {
    Label_0000:
        while (this.c()) {
            final AtomicReferenceFieldUpdater g = d.g;
            final Object value = g.get((Object)this);
            final w a = E5.e.a;
            if (value != a) {
                if (value != o) {
                    if (o != null) {
                        final StringBuilder sb = new StringBuilder("This mutex is locked by ");
                        sb.append(value);
                        sb.append(", but ");
                        sb.append(o);
                        sb.append(" is expected");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                while (!g.compareAndSet((Object)this, value, (Object)a)) {
                    if (g.get((Object)this) != value) {
                        continue Label_0000;
                    }
                }
                this.b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(v.d((Object)this));
        sb.append("[isLocked=");
        sb.append(this.c());
        sb.append(",owner=");
        sb.append(d.g.get((Object)this));
        sb.append(']');
        return sb.toString();
    }
}

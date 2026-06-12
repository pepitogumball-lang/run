package B5;

import n5.m;
import w5.v;
import n5.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class k
{
    public static final AtomicReferenceFieldUpdater C;
    public static final AtomicReferenceFieldUpdater D;
    public static final AtomicReferenceFieldUpdater E;
    private volatile Object _next;
    private volatile Object _prev;
    private volatile Object _removedRef;
    
    static {
        C = AtomicReferenceFieldUpdater.newUpdater((Class)k.class, (Class)Object.class, "_next");
        D = AtomicReferenceFieldUpdater.newUpdater((Class)k.class, (Class)Object.class, "_prev");
        E = AtomicReferenceFieldUpdater.newUpdater((Class)k.class, (Class)Object.class, "_removedRef");
    }
    
    public k() {
        this._next = this;
        this._prev = this;
    }
    
    public final k h() {
    Label_0000:
        while (true) {
            while (true) {
                final AtomicReferenceFieldUpdater d = k.D;
                Object o2;
                final Object o = o2 = d.get((Object)this);
                while (true) {
                    k k = null;
                    while (true) {
                        final AtomicReferenceFieldUpdater c = B5.k.C;
                        final Object value = c.get(o2);
                        if (value == this) {
                            if (o == o2) {
                                return (k)o2;
                            }
                            while (!d.compareAndSet((Object)this, o, o2)) {
                                if (d.get((Object)this) != o) {
                                    continue Label_0000;
                                }
                            }
                            return (k)o2;
                        }
                        else {
                            if (this.l()) {
                                return null;
                            }
                            if (value == null) {
                                return (k)o2;
                            }
                            if (value instanceof q) {
                                ((q)value).a(o2);
                                continue Label_0000;
                            }
                            if (value instanceof r) {
                                if (k != null) {
                                    while (!c.compareAndSet((Object)k, o2, (Object)((r)value).a)) {
                                        if (c.get((Object)k) != o2) {
                                            continue Label_0000;
                                        }
                                    }
                                    o2 = k;
                                    break;
                                }
                                o2 = d.get(o2);
                            }
                            else {
                                h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", value);
                                final k i = (k)value;
                                k = (k)o2;
                                o2 = i;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public final void i(final k k) {
    Label_0000:
        while (true) {
            final AtomicReferenceFieldUpdater d = k.D;
            final k i = (k)d.get((Object)k);
            if (this.j() != k) {
                return;
            }
            while (!d.compareAndSet((Object)k, (Object)i, (Object)this)) {
                if (d.get((Object)k) != i) {
                    continue Label_0000;
                }
            }
            if (this.l()) {
                k.h();
            }
        }
    }
    
    public final Object j() {
        Object value;
        while (true) {
            value = k.C.get((Object)this);
            if (!(value instanceof q)) {
                break;
            }
            ((q)value).a(this);
        }
        return value;
    }
    
    public final k k() {
        final Object j = this.j();
        r r;
        if (j instanceof r) {
            r = (r)j;
        }
        else {
            r = null;
        }
        k a;
        if (r == null || (a = r.a) == null) {
            h.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", j);
            a = (k)j;
        }
        return a;
    }
    
    public boolean l() {
        return this.j() instanceof r;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)new m(this, v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1));
        sb.append('@');
        sb.append(v.d((Object)this));
        return sb.toString();
    }
}

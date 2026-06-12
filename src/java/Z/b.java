package Z;

import m5.l;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashMap;
import n5.h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

public final class b
{
    public final Map a;
    public final AtomicBoolean b;
    
    public b(final Map a, final boolean b) {
        h.e("preferencesMap", (Object)a);
        this.a = a;
        this.b = new AtomicBoolean(b);
    }
    
    public final void a() {
        if (!this.b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }
    
    public final Object b(final d d) {
        h.e("key", (Object)d);
        return this.a.get((Object)d);
    }
    
    public final void c(final d d, final Object o) {
        h.e("key", (Object)d);
        this.d(d, o);
    }
    
    public final void d(final d d, final Object o) {
        h.e("key", (Object)d);
        this.a();
        final Map a = this.a;
        if (o == null) {
            this.a();
            a.remove((Object)d);
        }
        else if (o instanceof Set) {
            final Set unmodifiableSet = Collections.unmodifiableSet(d5.d.N((Iterable)o));
            h.d("unmodifiableSet(value.toSet())", (Object)unmodifiableSet);
            a.put((Object)d, (Object)unmodifiableSet);
        }
        else {
            a.put((Object)d, o);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof b && h.a((Object)this.a, (Object)((b)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return d5.d.I((Collection)this.a.entrySet(), ",\n", "{\n", "\n}", (l)Z.a.D, 24);
    }
}

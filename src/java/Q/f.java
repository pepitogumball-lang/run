package q;

import java.util.Iterator;
import java.util.Map$Entry;
import java.util.WeakHashMap;

public class f implements Iterable
{
    public c C;
    public c D;
    public final WeakHashMap E;
    public int F;
    
    public f() {
        this.E = new WeakHashMap();
        this.F = 0;
    }
    
    public c c(final Object obj) {
        c c;
        for (c = this.C; c != null && !c.C.equals(obj); c = c.E) {}
        return c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        if (this.F != f.F) {
            return false;
        }
        final Iterator iterator = this.iterator();
        final Iterator iterator2 = f.iterator();
        Map$Entry map$Entry;
        Object next;
        do {
            final b b2 = (b)iterator;
            if (b2.hasNext()) {
                final b b3 = (b)iterator2;
                if (b3.hasNext()) {
                    map$Entry = (Map$Entry)b2.next();
                    next = b3.next();
                    continue;
                }
            }
            if (b2.hasNext() || ((b)iterator2).hasNext()) {
                b = false;
            }
            return b;
        } while ((map$Entry != null || next == null) && (map$Entry == null || map$Entry.equals(next)));
        return false;
    }
    
    public Object h(final Object o) {
        final c c = this.c(o);
        if (c == null) {
            return null;
        }
        --this.F;
        final WeakHashMap e = this.E;
        if (!e.isEmpty()) {
            final Iterator iterator = e.keySet().iterator();
            while (iterator.hasNext()) {
                ((e)iterator.next()).a(c);
            }
        }
        final c f = c.F;
        if (f != null) {
            f.E = c.E;
        }
        else {
            this.C = c.E;
        }
        final c e2 = c.E;
        if (e2 != null) {
            e2.F = f;
        }
        else {
            this.D = f;
        }
        c.E = null;
        c.F = null;
        return c.D;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (true) {
            final b b = (b)iterator;
            if (!b.hasNext()) {
                break;
            }
            n += ((Map$Entry)b.next()).hashCode();
        }
        return n;
    }
    
    public final Iterator iterator() {
        final b b = new b(this.C, this.D, 0);
        this.E.put((Object)b, (Object)Boolean.FALSE);
        return (Iterator)b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        final Iterator iterator = this.iterator();
        while (true) {
            final b b = (b)iterator;
            if (!b.hasNext()) {
                break;
            }
            sb.append(b.next().toString());
            if (!b.hasNext()) {
                continue;
            }
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}

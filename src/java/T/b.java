package t;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Set;
import java.util.Map;

public final class b extends j implements Map
{
    public a J;
    
    public b(final int n) {
        if (n == 0) {
            super.C = d.a;
            super.D = d.b;
        }
        else {
            this.a(n);
        }
        super.E = 0;
    }
    
    public final Set entrySet() {
        if (this.J == null) {
            this.J = new a(this, 0);
        }
        final a j = this.J;
        if (j.a == null) {
            j.a = new g(j, 0);
        }
        return (Set)j.a;
    }
    
    public final Set keySet() {
        if (this.J == null) {
            this.J = new a(this, 0);
        }
        final a j = this.J;
        if (j.b == null) {
            j.b = new g(j, 1);
        }
        return (Set)j.b;
    }
    
    public final void putAll(final Map map) {
        this.b(map.size() + super.E);
        for (final Map$Entry map$Entry : map.entrySet()) {
            this.put(map$Entry.getKey(), map$Entry.getValue());
        }
    }
    
    public final Collection values() {
        if (this.J == null) {
            this.J = new a(this, 0);
        }
        final a j = this.J;
        if (j.c == null) {
            j.c = new i(j);
        }
        return (Collection)j.c;
    }
}

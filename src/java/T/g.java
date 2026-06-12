package t;

import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map$Entry;
import java.util.Set;

public final class g implements Set
{
    public final int C;
    public final a D;
    
    public final boolean add(final Object o) {
        switch (this.C) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: {
                final Map$Entry map$Entry = (Map$Entry)o;
                throw new UnsupportedOperationException();
            }
        }
    }
    
    public final boolean addAll(final Collection collection) {
        switch (this.C) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: {
                final a d = this.D;
                final int d2 = d.d();
                for (final Map$Entry map$Entry : collection) {
                    final Object key = map$Entry.getKey();
                    final Object value = map$Entry.getValue();
                    switch (d.d) {
                        default: {
                            ((c)d.e).add(key);
                            continue;
                        }
                        case 0: {
                            ((b)d.e).put(key, value);
                            continue;
                        }
                    }
                }
                return d2 != d.d();
            }
        }
    }
    
    public final void clear() {
        switch (this.C) {
            default: {
                this.D.a();
                return;
            }
            case 0: {
                this.D.a();
            }
        }
    }
    
    public final boolean contains(Object value) {
        switch (this.C) {
            default: {
                return this.D.e(value) >= 0;
            }
            case 0: {
                final boolean b = value instanceof Map$Entry;
                final boolean b2 = false;
                boolean b3;
                if (!b) {
                    b3 = b2;
                }
                else {
                    final Map$Entry map$Entry = (Map$Entry)value;
                    final Object key = map$Entry.getKey();
                    final a d = this.D;
                    final int e = d.e(key);
                    if (e < 0) {
                        b3 = b2;
                    }
                    else {
                        final Object b4 = d.b(e, 1);
                        value = map$Entry.getValue();
                        if (b4 != value) {
                            b3 = b2;
                            if (b4 == null) {
                                return b3;
                            }
                            b3 = b2;
                            if (!b4.equals(value)) {
                                return b3;
                            }
                        }
                        b3 = true;
                    }
                }
                return b3;
            }
        }
    }
    
    public final boolean containsAll(final Collection collection) {
        switch (this.C) {
            default: {
                final Map c = this.D.c();
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    if (!c.containsKey(iterator.next())) {
                        return false;
                    }
                }
                return true;
            }
            case 0: {
                final Iterator iterator2 = collection.iterator();
                while (iterator2.hasNext()) {
                    if (!this.contains(iterator2.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        switch (this.C) {
            default: {
                return a.h((Set)this, o);
            }
            case 0: {
                return a.h((Set)this, o);
            }
        }
    }
    
    @Override
    public final int hashCode() {
        switch (this.C) {
            default: {
                final a d = this.D;
                int i = d.d() - 1;
                int n = 0;
                while (i >= 0) {
                    final Object b = d.b(i, 0);
                    int hashCode;
                    if (b == null) {
                        hashCode = 0;
                    }
                    else {
                        hashCode = b.hashCode();
                    }
                    n += hashCode;
                    --i;
                }
                return n;
            }
            case 0: {
                final a d2 = this.D;
                int j = d2.d() - 1;
                int n2 = 0;
                while (j >= 0) {
                    final Object b2 = d2.b(j, 0);
                    final Object b3 = d2.b(j, 1);
                    int hashCode2;
                    if (b2 == null) {
                        hashCode2 = 0;
                    }
                    else {
                        hashCode2 = b2.hashCode();
                    }
                    int hashCode3;
                    if (b3 == null) {
                        hashCode3 = 0;
                    }
                    else {
                        hashCode3 = b3.hashCode();
                    }
                    n2 += (hashCode2 ^ hashCode3);
                    --j;
                }
                return n2;
            }
        }
    }
    
    public final boolean isEmpty() {
        switch (this.C) {
            default: {
                return this.D.d() == 0;
            }
            case 0: {
                return this.D.d() == 0;
            }
        }
    }
    
    public final Iterator iterator() {
        switch (this.C) {
            default: {
                return (Iterator)new f(this.D, 0);
            }
            case 0: {
                return (Iterator)new h(this.D);
            }
        }
    }
    
    public final boolean remove(final Object o) {
        switch (this.C) {
            default: {
                final a d = this.D;
                final int e = d.e(o);
                boolean b;
                if (e >= 0) {
                    d.g(e);
                    b = true;
                }
                else {
                    b = false;
                }
                return b;
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
    
    public final boolean removeAll(final Collection collection) {
        switch (this.C) {
            default: {
                final Map c = this.D.c();
                final int size = c.size();
                final Iterator iterator = collection.iterator();
                while (iterator.hasNext()) {
                    c.remove(iterator.next());
                }
                return size != c.size();
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
    
    public final boolean retainAll(final Collection collection) {
        switch (this.C) {
            default: {
                final Map c = this.D.c();
                final int size = c.size();
                final Iterator iterator = c.keySet().iterator();
                while (iterator.hasNext()) {
                    if (!collection.contains(iterator.next())) {
                        iterator.remove();
                    }
                }
                return size != c.size();
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
    
    public final int size() {
        switch (this.C) {
            default: {
                return this.D.d();
            }
            case 0: {
                return this.D.d();
            }
        }
    }
    
    public final Object[] toArray() {
        switch (this.C) {
            default: {
                final a d = this.D;
                final int d2 = d.d();
                final Object[] array = new Object[d2];
                for (int i = 0; i < d2; ++i) {
                    array[i] = d.b(i, 0);
                }
                return array;
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
    
    public final Object[] toArray(final Object[] array) {
        switch (this.C) {
            default: {
                return this.D.i(0, array);
            }
            case 0: {
                throw new UnsupportedOperationException();
            }
        }
    }
}

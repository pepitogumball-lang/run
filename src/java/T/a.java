package t;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public final class a
{
    public g a;
    public g b;
    public i c;
    public final int d;
    public final Object e;
    
    public static boolean h(final Set set, final Object o) {
        boolean b = true;
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() != set2.size() || !set.containsAll((Collection)set2)) {
                b = false;
            }
            return b;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public final void a() {
        switch (this.d) {
            default: {
                ((c)this.e).clear();
                return;
            }
            case 0: {
                ((b)this.e).clear();
            }
        }
    }
    
    public final Object b(final int n, final int n2) {
        switch (this.d) {
            default: {
                return ((c)this.e).D[n];
            }
            case 0: {
                return ((b)this.e).D[(n << 1) + n2];
            }
        }
    }
    
    public final Map c() {
        switch (this.d) {
            default: {
                throw new UnsupportedOperationException("not a map");
            }
            case 0: {
                return (Map)this.e;
            }
        }
    }
    
    public final int d() {
        switch (this.d) {
            default: {
                return ((c)this.e).E;
            }
            case 0: {
                return ((b)this.e).E;
            }
        }
    }
    
    public final int e(final Object o) {
        switch (this.d) {
            default: {
                return ((c)this.e).indexOf(o);
            }
            case 0: {
                return ((b)this.e).e(o);
            }
        }
    }
    
    public final int f(final Object o) {
        switch (this.d) {
            default: {
                return ((c)this.e).indexOf(o);
            }
            case 0: {
                return ((b)this.e).g(o);
            }
        }
    }
    
    public final void g(final int n) {
        switch (this.d) {
            default: {
                ((c)this.e).r(n);
                return;
            }
            case 0: {
                ((b)this.e).i(n);
            }
        }
    }
    
    public final Object[] i(final int n, final Object[] array) {
        final int d = this.d();
        Object[] array2 = array;
        if (array.length < d) {
            array2 = (Object[])Array.newInstance((Class)array.getClass().getComponentType(), d);
        }
        for (int i = 0; i < d; ++i) {
            array2[i] = this.b(i, n);
        }
        if (array2.length > d) {
            array2[d] = null;
        }
        return array2;
    }
}

package t;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public final class c implements Collection, Set
{
    public static final int[] G;
    public static final Object[] H;
    public static Object[] I;
    public static int J;
    public static Object[] K;
    public static int L;
    public int[] C;
    public Object[] D;
    public int E;
    public a F;
    
    static {
        G = new int[0];
        H = new Object[0];
    }
    
    public c(final int n) {
        if (n == 0) {
            this.C = c.G;
            this.D = c.H;
        }
        else {
            this.c(n);
        }
        this.E = 0;
    }
    
    public static void h(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            final Class<c> clazz;
            monitorenter(clazz = c.class);
            Label_0064: {
                try {
                    if (c.L < 10) {
                        array2[0] = c.K;
                        array2[1] = array;
                        --i;
                        while (i >= 2) {
                            array2[i] = null;
                            --i;
                        }
                        break Label_0064;
                    }
                    break Label_0064;
                }
                finally {
                    monitorexit(clazz);
                    c.K = array2;
                    ++c.L;
                    monitorexit(clazz);
                    return;
                }
            }
        }
        if (array.length == 4) {
            final Class<c> clazz2;
            monitorenter(clazz2 = c.class);
            Label_0136: {
                try {
                    if (c.J < 10) {
                        array2[0] = c.I;
                        array2[1] = array;
                        --i;
                        while (i >= 2) {
                            array2[i] = null;
                            --i;
                        }
                        break Label_0136;
                    }
                    break Label_0136;
                }
                finally {
                    monitorexit(clazz2);
                    c.I = array2;
                    ++c.J;
                    monitorexit(clazz2);
                }
            }
        }
    }
    
    public final boolean add(final Object o) {
        int n;
        int hashCode;
        if (o == null) {
            n = this.p();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.i(hashCode, o);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int e = this.E;
        final int[] c = this.C;
        if (e >= c.length) {
            int n3 = 8;
            if (e >= 8) {
                n3 = (e >> 1) + e;
            }
            else if (e < 4) {
                n3 = 4;
            }
            final Object[] d = this.D;
            this.c(n3);
            final int[] c2 = this.C;
            if (c2.length > 0) {
                System.arraycopy((Object)c, 0, (Object)c2, 0, c.length);
                System.arraycopy((Object)d, 0, (Object)this.D, 0, d.length);
            }
            h(c, d, this.E);
        }
        final int e2 = this.E;
        if (n2 < e2) {
            final int[] c3 = this.C;
            final int n4 = n2 + 1;
            System.arraycopy((Object)c3, n2, (Object)c3, n4, e2 - n2);
            final Object[] d2 = this.D;
            System.arraycopy((Object)d2, n2, (Object)d2, n4, this.E - n2);
        }
        this.C[n2] = hashCode;
        this.D[n2] = o;
        ++this.E;
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        final int n = collection.size() + this.E;
        final int[] c = this.C;
        final int length = c.length;
        boolean b = false;
        if (length < n) {
            final Object[] d = this.D;
            this.c(n);
            final int e = this.E;
            if (e > 0) {
                System.arraycopy((Object)c, 0, (Object)this.C, 0, e);
                System.arraycopy((Object)d, 0, (Object)this.D, 0, this.E);
            }
            h(c, d, this.E);
        }
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            b |= this.add(iterator.next());
        }
        return b;
    }
    
    public final void c(final int n) {
        Label_0149: {
            if (n == 8) {
                final Class<c> clazz;
                monitorenter(clazz = c.class);
                Label_0066: {
                    try {
                        final Object[] k = c.K;
                        if (k != null) {
                            this.D = k;
                            c.K = (Object[])k[0];
                            this.C = (int[])k[1];
                            k[0] = (k[1] = null);
                            --c.L;
                            monitorexit(clazz);
                            return;
                        }
                        break Label_0066;
                    }
                    finally {
                        monitorexit(clazz);
                        monitorexit(clazz);
                        break Label_0149;
                    }
                }
            }
            if (n == 4) {
                final Class<c> clazz2;
                monitorenter(clazz2 = c.class);
                Label_0140: {
                    try {
                        final Object[] i = c.I;
                        if (i != null) {
                            this.D = i;
                            c.I = (Object[])i[0];
                            this.C = (int[])i[1];
                            i[0] = (i[1] = null);
                            --c.J;
                            monitorexit(clazz2);
                            return;
                        }
                        break Label_0140;
                    }
                    finally {
                        monitorexit(clazz2);
                        monitorexit(clazz2);
                    }
                }
            }
        }
        this.C = new int[n];
        this.D = new Object[n];
    }
    
    public final void clear() {
        final int e = this.E;
        if (e != 0) {
            h(this.C, this.D, e);
            this.C = c.G;
            this.D = c.H;
            this.E = 0;
        }
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.E != set.size()) {
            return false;
        }
        int i = 0;
        try {
            while (i < this.E) {
                if (!set.contains(this.D[i])) {
                    return false;
                }
                ++i;
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final int[] c = this.C;
        final int e = this.E;
        int i = 0;
        int n = 0;
        while (i < e) {
            n += c[i];
            ++i;
        }
        return n;
    }
    
    public final int i(final int n, final Object o) {
        final int e = this.E;
        if (e == 0) {
            return -1;
        }
        int a = d.a(e, n, this.C);
        if (a < 0) {
            return a;
        }
        if (o.equals(this.D[a])) {
            return a;
        }
        int n2;
        for (n2 = a + 1; n2 < e && this.C[n2] == n; ++n2) {
            if (o.equals(this.D[n2])) {
                return n2;
            }
        }
        --a;
        while (a >= 0 && this.C[a] == n) {
            if (o.equals(this.D[a])) {
                return a;
            }
            --a;
        }
        return ~n2;
    }
    
    public final int indexOf(final Object o) {
        int n;
        if (o == null) {
            n = this.p();
        }
        else {
            n = this.i(o.hashCode(), o);
        }
        return n;
    }
    
    public final boolean isEmpty() {
        return this.E <= 0;
    }
    
    public final Iterator iterator() {
        if (this.F == null) {
            this.F = new a(this, 1);
        }
        final a f = this.F;
        if (f.b == null) {
            f.b = new g(f, 1);
        }
        return f.b.iterator();
    }
    
    public final int p() {
        final int e = this.E;
        if (e == 0) {
            return -1;
        }
        final int a = d.a(e, 0, this.C);
        if (a < 0) {
            return a;
        }
        if (this.D[a] == null) {
            return a;
        }
        int n;
        for (n = a + 1; n < e && this.C[n] == 0; ++n) {
            if (this.D[n] == null) {
                return n;
            }
        }
        for (int n2 = a - 1; n2 >= 0 && this.C[n2] == 0; --n2) {
            if (this.D[n2] == null) {
                return n2;
            }
        }
        return ~n;
    }
    
    public final void r(final int n) {
        final Object[] d = this.D;
        final Object o = d[n];
        int e = this.E;
        if (e <= 1) {
            h(this.C, d, e);
            this.C = c.G;
            this.D = c.H;
            this.E = 0;
        }
        else {
            final int[] c = this.C;
            final int length = c.length;
            int n2 = 8;
            if (length > 8 && e < c.length / 3) {
                if (e > 8) {
                    n2 = e + (e >> 1);
                }
                this.c(n2);
                --this.E;
                if (n > 0) {
                    System.arraycopy((Object)c, 0, (Object)this.C, 0, n);
                    System.arraycopy((Object)d, 0, (Object)this.D, 0, n);
                }
                final int e2 = this.E;
                if (n < e2) {
                    final int n3 = n + 1;
                    System.arraycopy((Object)c, n3, (Object)this.C, n, e2 - n);
                    System.arraycopy((Object)d, n3, (Object)this.D, n, this.E - n);
                }
            }
            else {
                --e;
                if (n < (this.E = e)) {
                    final int n4 = n + 1;
                    System.arraycopy((Object)c, n4, (Object)c, n, e - n);
                    final Object[] d2 = this.D;
                    System.arraycopy((Object)d2, n4, (Object)d2, n, this.E - n);
                }
                this.D[this.E] = null;
            }
        }
    }
    
    public final boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index >= 0) {
            this.r(index);
            return true;
        }
        return false;
    }
    
    public final boolean removeAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    public final boolean retainAll(final Collection collection) {
        int i = this.E - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.D[i])) {
                this.r(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    public final int size() {
        return this.E;
    }
    
    public final Object[] toArray() {
        final int e = this.E;
        final Object[] array = new Object[e];
        System.arraycopy((Object)this.D, 0, (Object)array, 0, e);
        return array;
    }
    
    public final Object[] toArray(final Object[] array) {
        Object[] array2 = array;
        if (array.length < this.E) {
            array2 = (Object[])Array.newInstance((Class)array.getClass().getComponentType(), this.E);
        }
        System.arraycopy((Object)this.D, 0, (Object)array2, 0, this.E);
        final int length = array2.length;
        final int e = this.E;
        if (length > e) {
            array2[e] = null;
        }
        return array2;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.E * 14);
        sb.append('{');
        for (int i = 0; i < this.E; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object o = this.D[i];
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

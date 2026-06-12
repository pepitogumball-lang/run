package t;

import java.util.Map;
import java.util.ConcurrentModificationException;

public class j
{
    public static Object[] F;
    public static int G;
    public static Object[] H;
    public static int I;
    public int[] C;
    public Object[] D;
    public int E;
    
    public j() {
        this.C = d.a;
        this.D = d.b;
        this.E = 0;
    }
    
    public j(final j j) {
        this();
        final int e = j.E;
        this.b(e);
        final int e2 = this.E;
        int i = 0;
        if (e2 == 0) {
            if (e > 0) {
                System.arraycopy((Object)j.C, 0, (Object)this.C, 0, e);
                System.arraycopy((Object)j.D, 0, (Object)this.D, 0, e << 1);
                this.E = e;
            }
        }
        else {
            while (i < e) {
                this.put(j.h(i), j.j(i));
                ++i;
            }
        }
    }
    
    public static void c(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            final Class<j> clazz;
            monitorenter(clazz = j.class);
            Label_0055: {
                while (true) {
                    try {
                        if (j.I < 10) {
                            array2[0] = j.H;
                            array2[1] = array;
                            for (i = (i << 1) - 1; i >= 2; --i) {
                                array2[i] = null;
                            }
                            break Label_0055;
                        }
                        break Label_0067;
                    }
                    finally {
                        monitorexit(clazz);
                        monitorexit(clazz);
                        return;
                        j.H = array2;
                        ++j.I;
                        continue;
                    }
                    break;
                }
            }
        }
        if (array.length == 4) {
            final Class<j> clazz2;
            monitorenter(clazz2 = j.class);
            Label_0142: {
                try {
                    if (j.G < 10) {
                        array2[0] = j.F;
                        array2[1] = array;
                        for (i = (i << 1) - 1; i >= 2; --i) {
                            array2[i] = null;
                        }
                        break Label_0142;
                    }
                    break Label_0142;
                }
                finally {
                    monitorexit(clazz2);
                    j.F = array2;
                    ++j.G;
                    monitorexit(clazz2);
                }
            }
        }
    }
    
    public final void a(final int n) {
        Label_0149: {
            if (n == 8) {
                final Class<j> clazz;
                monitorenter(clazz = j.class);
                Label_0066: {
                    try {
                        final Object[] h = j.H;
                        if (h != null) {
                            this.D = h;
                            j.H = (Object[])h[0];
                            this.C = (int[])h[1];
                            h[0] = (h[1] = null);
                            --j.I;
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
                final Class<j> clazz2;
                monitorenter(clazz2 = j.class);
                Label_0140: {
                    try {
                        final Object[] f = j.F;
                        if (f != null) {
                            this.D = f;
                            j.F = (Object[])f[0];
                            this.C = (int[])f[1];
                            f[0] = (f[1] = null);
                            --j.G;
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
        this.D = new Object[n << 1];
    }
    
    public final void b(final int n) {
        final int e = this.E;
        final int[] c = this.C;
        if (c.length < n) {
            final Object[] d = this.D;
            this.a(n);
            if (this.E > 0) {
                System.arraycopy((Object)c, 0, (Object)this.C, 0, e);
                System.arraycopy((Object)d, 0, (Object)this.D, 0, e << 1);
            }
            c(c, d, e);
        }
        if (this.E == e) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final void clear() {
        final int e = this.E;
        if (e > 0) {
            final int[] c = this.C;
            final Object[] d = this.D;
            this.C = t.d.a;
            this.D = t.d.b;
            this.E = 0;
            c(c, d, e);
        }
        if (this.E <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final boolean containsKey(final Object o) {
        return this.e(o) >= 0;
    }
    
    public final boolean containsValue(final Object o) {
        return this.g(o) >= 0;
    }
    
    public final int d(final int n, final Object o) {
        final int e = this.E;
        if (e == 0) {
            return -1;
        }
        final int[] c = this.C;
        try {
            final int a = d.a(e, n, c);
            if (a < 0) {
                return a;
            }
            if (o.equals(this.D[a << 1])) {
                return a;
            }
            int n2;
            for (n2 = a + 1; n2 < e && this.C[n2] == n; ++n2) {
                if (o.equals(this.D[n2 << 1])) {
                    return n2;
                }
            }
            for (int n3 = a - 1; n3 >= 0 && this.C[n3] == n; --n3) {
                if (o.equals(this.D[n3 << 1])) {
                    return n3;
                }
            }
            return ~n2;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    public final int e(final Object o) {
        int n;
        if (o == null) {
            n = this.f();
        }
        else {
            n = this.d(o.hashCode(), o);
        }
        return n;
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof j) {
            final j j = (j)o;
            if (this.E != j.E) {
                return false;
            }
            int i = 0;
            try {
                while (i < this.E) {
                    final Object h = this.h(i);
                    final Object k = this.j(i);
                    o = j.getOrDefault(h, null);
                    if (k == null) {
                        if (o != null || !j.containsKey(h)) {
                            return false;
                        }
                    }
                    else if (!k.equals(o)) {
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
        if (!(o instanceof Map)) {
            return false;
        }
        final Map map = (Map)o;
        if (this.E != map.size()) {
            return false;
        }
        int l = 0;
        try {
            while (l < this.E) {
                final Object h2 = this.h(l);
                final Object m = this.j(l);
                o = map.get(h2);
                if (m == null) {
                    if (o != null || !map.containsKey(h2)) {
                        return false;
                    }
                }
                else if (!m.equals(o)) {
                    return false;
                }
                ++l;
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex2) {
            return false;
        }
    }
    
    public final int f() {
        final int e = this.E;
        if (e == 0) {
            return -1;
        }
        final int[] c = this.C;
        try {
            final int a = d.a(e, 0, c);
            if (a < 0) {
                return a;
            }
            if (this.D[a << 1] == null) {
                return a;
            }
            int n;
            for (n = a + 1; n < e && this.C[n] == 0; ++n) {
                if (this.D[n << 1] == null) {
                    return n;
                }
            }
            for (int n2 = a - 1; n2 >= 0 && this.C[n2] == 0; --n2) {
                if (this.D[n2 << 1] == null) {
                    return n2;
                }
            }
            return ~n;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    public final int g(final Object o) {
        final int n = this.E * 2;
        final Object[] d = this.D;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (d[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (o.equals(d[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    public final Object get(final Object o) {
        return this.getOrDefault(o, null);
    }
    
    public final Object getOrDefault(final Object o, Object o2) {
        final int e = this.e(o);
        if (e >= 0) {
            o2 = this.D[(e << 1) + 1];
        }
        return o2;
    }
    
    public final Object h(final int n) {
        return this.D[n << 1];
    }
    
    @Override
    public final int hashCode() {
        final int[] c = this.C;
        final Object[] d = this.D;
        final int e = this.E;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < e) {
            final Object o = d[n];
            final int n3 = c[i];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    public final Object i(int e) {
        final Object[] d = this.D;
        final int n = e << 1;
        final Object o = d[n + 1];
        final int e2 = this.E;
        final int n2 = 0;
        if (e2 <= 1) {
            c(this.C, d, e2);
            this.C = t.d.a;
            this.D = t.d.b;
            e = n2;
        }
        else {
            final int n3 = e2 - 1;
            final int[] c = this.C;
            final int length = c.length;
            int n4 = 8;
            if (length > 8 && e2 < c.length / 3) {
                if (e2 > 8) {
                    n4 = e2 + (e2 >> 1);
                }
                this.a(n4);
                if (e2 != this.E) {
                    throw new ConcurrentModificationException();
                }
                if (e > 0) {
                    System.arraycopy((Object)c, 0, (Object)this.C, 0, e);
                    System.arraycopy((Object)d, 0, (Object)this.D, 0, n);
                }
                if (e < n3) {
                    final int n5 = e + 1;
                    final int[] c2 = this.C;
                    final int n6 = n3 - e;
                    System.arraycopy((Object)c, n5, (Object)c2, e, n6);
                    System.arraycopy((Object)d, n5 << 1, (Object)this.D, n, n6 << 1);
                }
            }
            else {
                if (e < n3) {
                    final int n7 = e + 1;
                    final int n8 = n3 - e;
                    System.arraycopy((Object)c, n7, (Object)c, e, n8);
                    final Object[] d2 = this.D;
                    System.arraycopy((Object)d2, n7 << 1, (Object)d2, n, n8 << 1);
                }
                final Object[] d3 = this.D;
                e = n3 << 1;
                d3[e + 1] = (d3[e] = null);
            }
            e = n3;
        }
        if (e2 == this.E) {
            this.E = e;
            return o;
        }
        throw new ConcurrentModificationException();
    }
    
    public final boolean isEmpty() {
        return this.E <= 0;
    }
    
    public final Object j(final int n) {
        return this.D[(n << 1) + 1];
    }
    
    public final Object put(final Object o, final Object o2) {
        final int e = this.E;
        int n;
        int hashCode;
        if (o == null) {
            n = this.f();
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = this.d(hashCode, o);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] d = this.D;
            final Object o3 = d[n2];
            d[n2] = o2;
            return o3;
        }
        final int n3 = ~n;
        final int[] c = this.C;
        if (e >= c.length) {
            int n4 = 8;
            if (e >= 8) {
                n4 = (e >> 1) + e;
            }
            else if (e < 4) {
                n4 = 4;
            }
            final Object[] d2 = this.D;
            this.a(n4);
            if (e != this.E) {
                throw new ConcurrentModificationException();
            }
            final int[] c2 = this.C;
            if (c2.length > 0) {
                System.arraycopy((Object)c, 0, (Object)c2, 0, c.length);
                System.arraycopy((Object)d2, 0, (Object)this.D, 0, d2.length);
            }
            c(c, d2, e);
        }
        if (n3 < e) {
            final int[] c3 = this.C;
            final int n5 = n3 + 1;
            System.arraycopy((Object)c3, n3, (Object)c3, n5, e - n3);
            final Object[] d3 = this.D;
            System.arraycopy((Object)d3, n3 << 1, (Object)d3, n5 << 1, this.E - n3 << 1);
        }
        final int e2 = this.E;
        if (e == e2) {
            final int[] c4 = this.C;
            if (n3 < c4.length) {
                c4[n3] = hashCode;
                final Object[] d4 = this.D;
                final int n6 = n3 << 1;
                d4[n6] = o;
                d4[n6 + 1] = o2;
                this.E = e2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    public final Object putIfAbsent(final Object o, final Object o2) {
        Object o3;
        if ((o3 = this.getOrDefault(o, null)) == null) {
            o3 = this.put(o, o2);
        }
        return o3;
    }
    
    public final Object remove(final Object o) {
        final int e = this.e(o);
        if (e >= 0) {
            return this.i(e);
        }
        return null;
    }
    
    public final boolean remove(Object j, final Object o) {
        final int e = this.e(j);
        if (e >= 0) {
            j = this.j(e);
            if (o == j || (o != null && o.equals(j))) {
                this.i(e);
                return true;
            }
        }
        return false;
    }
    
    public final Object replace(final Object o, final Object o2) {
        final int e = this.e(o);
        if (e >= 0) {
            final int n = (e << 1) + 1;
            final Object[] d = this.D;
            final Object o3 = d[n];
            d[n] = o2;
            return o3;
        }
        return null;
    }
    
    public final boolean replace(Object j, final Object o, final Object o2) {
        final int e = this.e(j);
        if (e >= 0) {
            j = this.j(e);
            if (j == o || (o != null && o.equals(j))) {
                final int n = (e << 1) + 1;
                final Object[] d = this.D;
                j = d[n];
                d[n] = o2;
                return true;
            }
        }
        return false;
    }
    
    public final int size() {
        return this.E;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.E * 28);
        sb.append('{');
        for (int i = 0; i < this.E; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object h = this.h(i);
            if (h != this) {
                sb.append(h);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object j = this.j(i);
            if (j != this) {
                sb.append(j);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

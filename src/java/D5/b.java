package d5;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import n5.h;
import o5.a;
import java.util.List;
import java.util.AbstractList;

public final class b extends AbstractList implements List, a
{
    public static final Object[] F;
    public int C;
    public Object[] D;
    public int E;
    
    static {
        F = new Object[0];
    }
    
    public b() {
        this.D = b.F;
    }
    
    public final void add(int c, final Object o) {
        final int e = this.E;
        if (c < 0 || c > e) {
            throw new IndexOutOfBoundsException(Y3.a.k("index: ", ", size: ", c, e));
        }
        if (c == e) {
            this.addLast(o);
            return;
        }
        if (c == 0) {
            this.addFirst(o);
            return;
        }
        this.u();
        this.h(this.E + 1);
        final int t = this.t(this.C + c);
        final int e2 = this.E;
        if (c < e2 + 1 >> 1) {
            if ((c = t) == 0) {
                final Object[] d = this.D;
                h.e("<this>", (Object)d);
                c = d.length;
            }
            final int n = c - 1;
            c = this.C;
            if (c == 0) {
                final Object[] d2 = this.D;
                h.e("<this>", (Object)d2);
                c = d2.length - 1;
            }
            else {
                --c;
            }
            final int c2 = this.C;
            if (n >= c2) {
                final Object[] d3 = this.D;
                d3[c] = d3[c2];
                c.F(c2, c2 + 1, n + 1, d3, d3);
            }
            else {
                final Object[] d4 = this.D;
                c.F(c2 - 1, c2, d4.length, d4, d4);
                final Object[] d5 = this.D;
                d5[d5.length - 1] = d5[0];
                c.F(0, 1, n + 1, d5, d5);
            }
            this.D[n] = o;
            this.C = c;
        }
        else {
            c = this.t(this.C + e2);
            if (t < c) {
                final Object[] d6 = this.D;
                c.F(t + 1, t, c, d6, d6);
            }
            else {
                final Object[] d7 = this.D;
                c.F(1, 0, c, d7, d7);
                final Object[] d8 = this.D;
                d8[0] = d8[d8.length - 1];
                c.F(t + 1, t, d8.length - 1, d8, d8);
            }
            this.D[t] = o;
        }
        ++this.E;
    }
    
    public final boolean add(final Object o) {
        this.addLast(o);
        return true;
    }
    
    public final boolean addAll(int c, final Collection collection) {
        h.e("elements", (Object)collection);
        final int e = this.E;
        if (c < 0 || c > e) {
            throw new IndexOutOfBoundsException(Y3.a.k("index: ", ", size: ", c, e));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (c == this.E) {
            return this.addAll(collection);
        }
        this.u();
        this.h(collection.size() + this.E);
        final int t = this.t(this.C + this.E);
        final int t2 = this.t(this.C + c);
        final int size = collection.size();
        if (c < this.E + 1 >> 1) {
            final int c2 = this.C;
            c = c2 - size;
            if (t2 >= c2) {
                if (c >= 0) {
                    final Object[] d = this.D;
                    c.F(c, c2, t2, d, d);
                }
                else {
                    final Object[] d2 = this.D;
                    c += d2.length;
                    final int n = d2.length - c;
                    if (n >= t2 - c2) {
                        c.F(c, c2, t2, d2, d2);
                    }
                    else {
                        c.F(c, c2, c2 + n, d2, d2);
                        final Object[] d3 = this.D;
                        c.F(0, this.C + n, t2, d3, d3);
                    }
                }
            }
            else {
                final Object[] d4 = this.D;
                c.F(c, c2, d4.length, d4, d4);
                if (size >= t2) {
                    final Object[] d5 = this.D;
                    c.F(d5.length - size, 0, t2, d5, d5);
                }
                else {
                    final Object[] d6 = this.D;
                    c.F(d6.length - size, 0, size, d6, d6);
                    final Object[] d7 = this.D;
                    c.F(0, size, t2, d7, d7);
                }
            }
            this.C = c;
            this.c(this.p(t2 - size), collection);
        }
        else {
            c = t2 + size;
            if (t2 < t) {
                final int n2 = size + t;
                final Object[] d8 = this.D;
                if (n2 <= d8.length) {
                    c.F(c, t2, t, d8, d8);
                }
                else if (c >= d8.length) {
                    c.F(c - d8.length, t2, t, d8, d8);
                }
                else {
                    final int n3 = t - (n2 - d8.length);
                    c.F(0, n3, t, d8, d8);
                    final Object[] d9 = this.D;
                    c.F(c, t2, n3, d9, d9);
                }
            }
            else {
                final Object[] d10 = this.D;
                c.F(size, 0, t, d10, d10);
                final Object[] d11 = this.D;
                if (c >= d11.length) {
                    c.F(c - d11.length, t2, d11.length, d11, d11);
                }
                else {
                    c.F(0, d11.length - size, d11.length, d11, d11);
                    final Object[] d12 = this.D;
                    c.F(c, t2, d12.length - size, d12, d12);
                }
            }
            this.c(t2, collection);
        }
        return true;
    }
    
    public final boolean addAll(final Collection collection) {
        h.e("elements", (Object)collection);
        if (collection.isEmpty()) {
            return false;
        }
        this.u();
        this.h(collection.size() + this.E);
        this.c(this.t(this.C + this.E), collection);
        return true;
    }
    
    public final void addFirst(final Object o) {
        this.u();
        this.h(this.E + 1);
        int c;
        if ((c = this.C) == 0) {
            final Object[] d = this.D;
            h.e("<this>", (Object)d);
            c = d.length;
        }
        --c;
        this.C = c;
        this.D[c] = o;
        ++this.E;
    }
    
    public final void addLast(final Object o) {
        this.u();
        this.h(this.E + 1);
        this.D[this.t(this.C + this.E)] = o;
        ++this.E;
    }
    
    public final void c(int e, final Collection collection) {
        Iterator iterator;
        for (iterator = collection.iterator(); e < this.D.length && iterator.hasNext(); ++e) {
            this.D[e] = iterator.next();
        }
        int c;
        for (c = this.C, e = 0; e < c && iterator.hasNext(); ++e) {
            this.D[e] = iterator.next();
        }
        e = this.E;
        this.E = collection.size() + e;
    }
    
    public final void clear() {
        if (!((Collection)this).isEmpty()) {
            this.u();
            this.r(this.C, this.t(this.C + this.E));
        }
        this.C = 0;
        this.E = 0;
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final Object get(final int n) {
        final int e = this.E;
        if (n >= 0 && n < e) {
            return this.D[this.t(this.C + n)];
        }
        throw new IndexOutOfBoundsException(Y3.a.k("index: ", ", size: ", n, e));
    }
    
    public final void h(int length) {
        if (length < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        final Object[] d = this.D;
        if (length <= d.length) {
            return;
        }
        if (d == b.F) {
            int n;
            if ((n = length) < 10) {
                n = 10;
            }
            this.D = new Object[n];
            return;
        }
        final int length2 = d.length;
        int n2;
        if ((n2 = length2 + (length2 >> 1)) - length < 0) {
            n2 = length;
        }
        int n3 = n2;
        if (n2 - 2147483639 > 0) {
            if (length > 2147483639) {
                n3 = Integer.MAX_VALUE;
            }
            else {
                n3 = 2147483639;
            }
        }
        final Object[] d2 = new Object[n3];
        c.F(0, this.C, d.length, d, d2);
        final Object[] d3 = this.D;
        length = d3.length;
        final int c = this.C;
        d5.c.F(length - c, 0, c, d3, d2);
        this.C = 0;
        this.D = d2;
    }
    
    public final int i(int n) {
        final Object[] d = this.D;
        h.e("<this>", (Object)d);
        if (n == d.length - 1) {
            n = 0;
        }
        else {
            ++n;
        }
        return n;
    }
    
    public final int indexOf(final Object o) {
        final int t = this.t(this.C + this.E);
        int i = this.C;
        if (i < t) {
            while (i < t) {
                if (h.a(o, this.D[i])) {
                    final int n = this.C;
                    return i - n;
                }
                ++i;
            }
            return -1;
        }
        if (i >= t) {
            while (i < this.D.length) {
                if (h.a(o, this.D[i])) {
                    final int n = this.C;
                    return i - n;
                }
                ++i;
            }
            for (int j = 0; j < t; ++j) {
                if (h.a(o, this.D[j])) {
                    i = j + this.D.length;
                    final int n = this.C;
                    return i - n;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public final boolean isEmpty() {
        return this.E == 0;
    }
    
    public final int lastIndexOf(final Object o) {
        int t = this.t(this.C + this.E);
        final int c = this.C;
        int n;
        if (c < t) {
            --t;
            if (c > t) {
                return -1;
            }
            while (!h.a(o, this.D[t])) {
                if (t == c) {
                    return -1;
                }
                --t;
            }
            n = this.C;
        }
        else {
            if (c <= t) {
                return -1;
            }
            --t;
            while (-1 < t) {
                if (h.a(o, this.D[t])) {
                    t += this.D.length;
                    n = this.C;
                    return t - n;
                }
                --t;
            }
            final Object[] d = this.D;
            h.e("<this>", (Object)d);
            t = d.length - 1;
            final int c2 = this.C;
            if (c2 > t) {
                return -1;
            }
            while (!h.a(o, this.D[t])) {
                if (t == c2) {
                    return -1;
                }
                --t;
            }
            n = this.C;
        }
        return t - n;
    }
    
    public final int p(final int n) {
        int n2 = n;
        if (n < 0) {
            n2 = n + this.D.length;
        }
        return n2;
    }
    
    public final void r(final int n, final int n2) {
        if (n < n2) {
            final Object[] d = this.D;
            h.e("<this>", (Object)d);
            Arrays.fill(d, n, n2, (Object)null);
        }
        else {
            final Object[] d2 = this.D;
            Arrays.fill(d2, n, d2.length, (Object)null);
            final Object[] d3 = this.D;
            h.e("<this>", (Object)d3);
            Arrays.fill(d3, 0, n2, (Object)null);
        }
    }
    
    public final Object remove(int n) {
        final int e = this.E;
        if (n >= 0 && n < e) {
            Object o;
            if (n == this.size() - 1) {
                o = this.removeLast();
            }
            else if (n == 0) {
                o = this.removeFirst();
            }
            else {
                this.u();
                final int t = this.t(this.C + n);
                final Object[] d = this.D;
                o = d[t];
                if (n < this.E >> 1) {
                    n = this.C;
                    if (t >= n) {
                        c.F(n + 1, n, t, d, d);
                    }
                    else {
                        c.F(1, 0, t, d, d);
                        final Object[] d2 = this.D;
                        d2[0] = d2[d2.length - 1];
                        n = this.C;
                        c.F(n + 1, n, d2.length - 1, d2, d2);
                    }
                    final Object[] d3 = this.D;
                    n = this.C;
                    d3[n] = null;
                    this.C = this.i(n);
                }
                else {
                    n = this.C;
                    n = this.t(this.size() - 1 + n);
                    if (t <= n) {
                        final Object[] d4 = this.D;
                        c.F(t, t + 1, n + 1, d4, d4);
                    }
                    else {
                        final Object[] d5 = this.D;
                        c.F(t, t + 1, d5.length, d5, d5);
                        final Object[] d6 = this.D;
                        d6[d6.length - 1] = d6[0];
                        c.F(0, 1, n + 1, d6, d6);
                    }
                    this.D[n] = null;
                }
                --this.E;
            }
            return o;
        }
        throw new IndexOutOfBoundsException(Y3.a.k("index: ", ", size: ", n, e));
    }
    
    public final boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    public final boolean removeAll(final Collection collection) {
        h.e("elements", (Object)collection);
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        final int n2 = 0;
        int n3 = b ? 1 : 0;
        if (!empty) {
            if (this.D.length == 0) {
                n3 = (b ? 1 : 0);
            }
            else {
                final int t = this.t(this.C + this.E);
                int i = this.C;
                int n5;
                int n6;
                if (i < t) {
                    int n4 = i;
                    n5 = n2;
                    while (i < t) {
                        final Object o = this.D[i];
                        if (!collection.contains(o)) {
                            this.D[n4] = o;
                            ++n4;
                        }
                        else {
                            n5 = 1;
                        }
                        ++i;
                    }
                    final Object[] d = this.D;
                    h.e("<this>", (Object)d);
                    Arrays.fill(d, n4, t, (Object)null);
                    n6 = n4;
                }
                else {
                    final int length = this.D.length;
                    n5 = 0;
                    int n7 = i;
                    while (i < length) {
                        final Object[] d2 = this.D;
                        final Object o2 = d2[i];
                        d2[i] = null;
                        if (!collection.contains(o2)) {
                            this.D[n7] = o2;
                            ++n7;
                        }
                        else {
                            n5 = 1;
                        }
                        ++i;
                    }
                    n6 = this.t(n7);
                    for (int j = n; j < t; ++j) {
                        final Object[] d3 = this.D;
                        final Object o3 = d3[j];
                        d3[j] = null;
                        if (!collection.contains(o3)) {
                            this.D[n6] = o3;
                            n6 = this.i(n6);
                        }
                        else {
                            n5 = 1;
                        }
                    }
                }
                n3 = n5;
                if (n5 != 0) {
                    this.u();
                    this.E = this.p(n6 - this.C);
                    n3 = n5;
                }
            }
        }
        return n3 != 0;
    }
    
    public final Object removeFirst() {
        if (!this.isEmpty()) {
            this.u();
            final Object[] d = this.D;
            final int c = this.C;
            final Object o = d[c];
            d[c] = null;
            this.C = this.i(c);
            --this.E;
            return o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    public final Object removeLast() {
        if (!this.isEmpty()) {
            this.u();
            final int t = this.t(((List)this).size() - 1 + this.C);
            final Object[] d = this.D;
            final Object o = d[t];
            d[t] = null;
            --this.E;
            return o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    public final void removeRange(int i, int n) {
        final int e = this.E;
        if (i < 0 || n > e) {
            final StringBuilder sb = new StringBuilder("fromIndex: ");
            sb.append(i);
            sb.append(", toIndex: ");
            sb.append(n);
            sb.append(", size: ");
            sb.append(e);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i > n) {
            throw new IllegalArgumentException(Y3.a.k("fromIndex: ", " > toIndex: ", i, n));
        }
        final int n2 = n - i;
        if (n2 == 0) {
            return;
        }
        if (n2 == this.E) {
            this.clear();
            return;
        }
        if (n2 == 1) {
            this.remove(i);
            return;
        }
        this.u();
        if (i < this.E - n) {
            final int t = this.t(i - 1 + this.C);
            int n3 = this.t(n - 1 + this.C);
            n = t;
            while (i > 0) {
                final int n4 = n + 1;
                final int min = Math.min(i, Math.min(n4, n3 + 1));
                final Object[] d = this.D;
                final int n5 = n3 - min;
                n -= min;
                c.F(n5 + 1, n + 1, n4, d, d);
                n = this.p(n);
                n3 = this.p(n5);
                i -= min;
            }
            i = this.t(this.C + n2);
            this.r(this.C, i);
            this.C = i;
        }
        else {
            final int t2 = this.t(this.C + n);
            i = this.t(this.C + i);
            int e2 = this.E;
            int min2 = n;
            n = t2;
            while (true) {
                e2 -= min2;
                if (e2 <= 0) {
                    break;
                }
                final Object[] d2 = this.D;
                min2 = Math.min(e2, Math.min(d2.length - n, d2.length - i));
                final Object[] d3 = this.D;
                final int n6 = n + min2;
                c.F(i, n, n6, d3, d3);
                n = this.t(n6);
                i = this.t(i + min2);
            }
            i = this.t(this.C + this.E);
            this.r(this.p(i - n2), i);
        }
        this.E -= n2;
    }
    
    public final boolean retainAll(final Collection collection) {
        h.e("elements", (Object)collection);
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        final int n2 = 0;
        int n3 = b ? 1 : 0;
        if (!empty) {
            if (this.D.length == 0) {
                n3 = (b ? 1 : 0);
            }
            else {
                final int t = this.t(this.C + this.E);
                int i = this.C;
                int n5;
                int n6;
                if (i < t) {
                    int n4 = i;
                    n5 = n2;
                    while (i < t) {
                        final Object o = this.D[i];
                        if (collection.contains(o)) {
                            this.D[n4] = o;
                            ++n4;
                        }
                        else {
                            n5 = 1;
                        }
                        ++i;
                    }
                    final Object[] d = this.D;
                    h.e("<this>", (Object)d);
                    Arrays.fill(d, n4, t, (Object)null);
                    n6 = n4;
                }
                else {
                    final int length = this.D.length;
                    n5 = 0;
                    int n7 = i;
                    while (i < length) {
                        final Object[] d2 = this.D;
                        final Object o2 = d2[i];
                        d2[i] = null;
                        if (collection.contains(o2)) {
                            this.D[n7] = o2;
                            ++n7;
                        }
                        else {
                            n5 = 1;
                        }
                        ++i;
                    }
                    n6 = this.t(n7);
                    for (int j = n; j < t; ++j) {
                        final Object[] d3 = this.D;
                        final Object o3 = d3[j];
                        d3[j] = null;
                        if (collection.contains(o3)) {
                            this.D[n6] = o3;
                            n6 = this.i(n6);
                        }
                        else {
                            n5 = 1;
                        }
                    }
                }
                n3 = n5;
                if (n5 != 0) {
                    this.u();
                    this.E = this.p(n6 - this.C);
                    n3 = n5;
                }
            }
        }
        return n3 != 0;
    }
    
    public final Object set(int t, final Object o) {
        final int e = this.E;
        if (t >= 0 && t < e) {
            t = this.t(this.C + t);
            final Object[] d = this.D;
            final Object o2 = d[t];
            d[t] = o;
            return o2;
        }
        throw new IndexOutOfBoundsException(Y3.a.k("index: ", ", size: ", t, e));
    }
    
    public final int size() {
        return this.E;
    }
    
    public final int t(final int n) {
        final Object[] d = this.D;
        int n2 = n;
        if (n >= d.length) {
            n2 = n - d.length;
        }
        return n2;
    }
    
    public final Object[] toArray() {
        return this.toArray(new Object[this.E]);
    }
    
    public final Object[] toArray(Object[] array) {
        h.e("array", (Object)array);
        final int length = array.length;
        final int e = this.E;
        if (length < e) {
            final Object instance = Array.newInstance((Class)array.getClass().getComponentType(), e);
            h.c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", instance);
            array = (Object[])instance;
        }
        final int t = this.t(this.C + this.E);
        final int c = this.C;
        if (c < t) {
            d5.c.F(0, c, t, this.D, array);
        }
        else if (!this.isEmpty()) {
            final Object[] d = this.D;
            d5.c.F(0, this.C, d.length, d, array);
            final Object[] d2 = this.D;
            d5.c.F(d2.length - this.C, 0, t, d2, array);
        }
        final int e2 = this.E;
        if (e2 < array.length) {
            array[e2] = null;
        }
        return array;
    }
    
    public final void u() {
        ++super.modCount;
    }
}

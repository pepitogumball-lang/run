package n5;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Collection;
import m0.a;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.L;

public abstract class h
{
    public static final Object[] a;
    
    static {
        a = new Object[0];
    }
    
    public static boolean a(final Object o, final Object obj) {
        boolean equals;
        if (o == null) {
            equals = (obj == null);
        }
        else {
            equals = o.equals(obj);
        }
        return equals;
    }
    
    public static void b(final Object o) {
        if (o != null) {
            return;
        }
        final NullPointerException ex = new NullPointerException();
        f((RuntimeException)ex, h.class.getName());
        throw ex;
    }
    
    public static void c(final String s, final Object o) {
        if (o != null) {
            return;
        }
        final NullPointerException ex = new NullPointerException(s);
        f((RuntimeException)ex, h.class.getName());
        throw ex;
    }
    
    public static void d(final String s, final Object o) {
        if (o != null) {
            return;
        }
        final NullPointerException ex = new NullPointerException(s.concat(" must not be null"));
        f((RuntimeException)ex, h.class.getName());
        throw ex;
    }
    
    public static void e(final String s, final Object o) {
        if (o == null) {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            final String name = h.class.getName();
            int n = 0;
            int n2;
            while (true) {
                n2 = n;
                if (stackTrace[n].getClassName().equals((Object)name)) {
                    break;
                }
                ++n;
            }
            while (stackTrace[n2].getClassName().equals((Object)name)) {
                ++n2;
            }
            final StackTraceElement stackTraceElement = stackTrace[n2];
            final StringBuilder m = L.m("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            m.append(s);
            final NullPointerException ex = new NullPointerException(m.toString());
            f((RuntimeException)ex, h.class.getName());
            throw ex;
        }
    }
    
    public static void f(final RuntimeException ex, final String s) {
        final StackTraceElement[] stackTrace = ((Throwable)ex).getStackTrace();
        final int length = stackTrace.length;
        int n = -1;
        for (int i = 0; i < length; ++i) {
            if (s.equals((Object)stackTrace[i].getClassName())) {
                n = i;
            }
        }
        ((Throwable)ex).setStackTrace((StackTraceElement[])Arrays.copyOfRange((Object[])stackTrace, n + 1, length));
    }
    
    public static String g(final String s, final Object o) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(o);
        return sb.toString();
    }
    
    public static void h(final String s) {
        final RuntimeException ex = new RuntimeException(m0.a.g("lateinit property ", s, " has not been initialized"));
        f(ex, h.class.getName());
        throw ex;
    }
    
    public static final Object[] i(final Collection collection) {
        final int size = collection.size();
        final Object[] a = h.a;
        Object[] copy;
        if (size == 0) {
            copy = a;
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                copy = a;
            }
            else {
                copy = new Object[size];
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    copy[n] = iterator.next();
                    Object[] copy2;
                    if (n2 >= copy.length) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy2 = Arrays.copyOf(copy, n3);
                    }
                    else {
                        copy2 = copy;
                        if (!iterator.hasNext()) {
                            copy = Arrays.copyOf(copy, n2);
                            d("copyOf(...)", copy);
                            break;
                        }
                    }
                    n = n2;
                    copy = copy2;
                }
            }
        }
        return copy;
    }
    
    public static final Object[] j(final Collection collection, final Object[] array) {
        array.getClass();
        final int size = collection.size();
        int n = 0;
        Object[] copy;
        if (size == 0) {
            copy = array;
            if (array.length > 0) {
                array[0] = null;
                copy = array;
            }
        }
        else {
            final Iterator iterator = collection.iterator();
            if (!iterator.hasNext()) {
                copy = array;
                if (array.length > 0) {
                    array[0] = null;
                    copy = array;
                }
            }
            else {
                if (size <= array.length) {
                    copy = array;
                }
                else {
                    final Object instance = Array.newInstance((Class)array.getClass().getComponentType(), size);
                    c("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", instance);
                    copy = (Object[])instance;
                }
                while (true) {
                    final int n2 = n + 1;
                    copy[n] = iterator.next();
                    Object[] copy2;
                    if (n2 >= copy.length) {
                        if (!iterator.hasNext()) {
                            break;
                        }
                        int n3;
                        if ((n3 = n2 * 3 + 1 >>> 1) <= n2) {
                            n3 = 2147483645;
                            if (n2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        copy2 = Arrays.copyOf(copy, n3);
                    }
                    else {
                        copy2 = copy;
                        if (!iterator.hasNext()) {
                            if (copy == array) {
                                array[n2] = null;
                                copy = array;
                                break;
                            }
                            copy = Arrays.copyOf(copy, n2);
                            d("copyOf(...)", copy);
                            break;
                        }
                    }
                    n = n2;
                    copy = copy2;
                }
            }
        }
        return copy;
    }
}

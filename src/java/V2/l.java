package V2;

import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import sun.misc.Unsafe;
import J5.b;

public final class l extends b
{
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    
    static {
        Label_0024: {
            try {
                final Unsafe unsafe = Unsafe.getUnsafe();
                break Label_0024;
            }
            catch (final SecurityException ex) {
                final k k = new(V2.k.class)();
                final k j;
                final k i = j = k;
                new k();
                final k l = i;
                final Object o = AccessController.doPrivileged((PrivilegedExceptionAction)l);
                final Unsafe unsafe;
                final Unsafe unsafe2 = unsafe = (Unsafe)o;
            }
            try {
                final k k = new(V2.k.class)();
                final k j;
                final k i = j = k;
                new k();
                final k l = i;
                final Object o = AccessController.doPrivileged((PrivilegedExceptionAction)l);
                final Unsafe unsafe = (Unsafe)o;
                try {
                    c = unsafe.objectFieldOffset(n.class.getDeclaredField("E"));
                    b = unsafe.objectFieldOffset(n.class.getDeclaredField("D"));
                    d = unsafe.objectFieldOffset(n.class.getDeclaredField("C"));
                    e = unsafe.objectFieldOffset(m.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(m.class.getDeclaredField("b"));
                    a = unsafe;
                }
                catch (final NoSuchFieldException ex2) {
                    throw new RuntimeException((Throwable)ex2);
                }
            }
            catch (final PrivilegedActionException ex3) {
                throw new RuntimeException("Could not initialize intrinsics", ex3.getCause());
            }
        }
    }
    
    public final void F(final m m, final m i) {
        l.a.putObject((Object)m, l.f, (Object)i);
    }
    
    public final void H(final m m, final Thread thread) {
        l.a.putObject((Object)m, l.e, (Object)thread);
    }
    
    public final boolean c(final n n, final d d, final d d2) {
        return i.a(l.a, n, l.b, d, d2);
    }
    
    public final boolean e(final n n, final Object o, final Object o2) {
        return j.a(l.a, n, l.d, o, o2);
    }
    
    public final boolean g(final n n, final m m, final m i) {
        return h.a(l.a, n, l.c, m, i);
    }
    
    public final d y(final n n) {
        final d d = V2.d.d;
        d d2;
        do {
            d2 = n.D;
            if (d == d2) {
                return d2;
            }
        } while (!this.c(n, d2, d));
        return d2;
    }
    
    public final m z(final n n) {
        final m c = m.c;
        m e;
        do {
            e = n.E;
            if (c == e) {
                return e;
            }
        } while (!this.g(n, e, c));
        return e;
    }
}

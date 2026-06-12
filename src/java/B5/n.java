package B5;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class n
{
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicLongFieldUpdater f;
    public static final w g;
    private volatile Object _next;
    private volatile long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;
    
    static {
        e = AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)Object.class, "_next");
        f = AtomicLongFieldUpdater.newUpdater((Class)n.class, "_state");
        g = new w("REMOVE_FROZEN", 0);
    }
    
    public n(final int a, final boolean b) {
        this.a = a;
        this.b = b;
        final int c = a - 1;
        this.c = c;
        this.d = new AtomicReferenceArray(a);
        if (c > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((a & c) == 0x0) {
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
    
    public final int a(final Runnable runnable) {
        while (true) {
            final AtomicLongFieldUpdater f = n.f;
            final long value = f.get((Object)this);
            int n = 1;
            if ((0x3000000000000000L & value) != 0x0L) {
                if ((value & 0x2000000000000000L) != 0x0L) {
                    n = 2;
                }
                return n;
            }
            final int n2 = (int)(0x3FFFFFFFL & value);
            final int n3 = (int)((0xFFFFFFFC0000000L & value) >> 30);
            final int c = this.c;
            if ((n3 + 2 & c) == (n2 & c)) {
                return 1;
            }
            final AtomicReferenceArray d = this.d;
            if (!this.b && d.get(n3 & c) != null) {
                final int a = this.a;
                if (a < 1024 || (n3 - n2 & 0x3FFFFFFF) > a >> 1) {
                    return 1;
                }
                continue;
            }
            else {
                if (f.compareAndSet((Object)this, value, (0xF00000003FFFFFFFL & value) | (long)(n3 + 1 & 0x3FFFFFFF) << 30)) {
                    d.set(n3 & c, (Object)runnable);
                    n n4 = this;
                    while ((f.get((Object)n4) & 0x1000000000000000L) != 0x0L) {
                        n c2 = n4.c();
                        final AtomicReferenceArray d2 = c2.d;
                        final int n5 = c2.c & n3;
                        final Object value2 = d2.get(n5);
                        if (value2 instanceof m && ((m)value2).a == n3) {
                            d2.set(n5, (Object)runnable);
                        }
                        else {
                            c2 = null;
                        }
                        n4 = c2;
                        if (c2 == null) {
                            break;
                        }
                    }
                    return 0;
                }
                continue;
            }
        }
    }
    
    public final boolean b() {
        AtomicLongFieldUpdater f;
        long value;
        do {
            f = n.f;
            value = f.get((Object)this);
            if ((value & 0x2000000000000000L) != 0x0L) {
                return true;
            }
            if ((0x1000000000000000L & value) != 0x0L) {
                return false;
            }
        } while (!f.compareAndSet((Object)this, value, 0x2000000000000000L | value));
        return true;
    }
    
    public final n c() {
        AtomicLongFieldUpdater f;
        long value;
        long n;
        do {
            f = B5.n.f;
            value = f.get((Object)this);
            if ((value & 0x1000000000000000L) != 0x0L) {
                n = value;
                break;
            }
            n = (value | 0x1000000000000000L);
        } while (!f.compareAndSet((Object)this, value, n));
        n n2;
        while (true) {
            final AtomicReferenceFieldUpdater e = B5.n.e;
            n2 = (n)e.get((Object)this);
            if (n2 != null) {
                break;
            }
            final n n3 = new n(this.a * 2, this.b);
            int n4 = (int)(0x3FFFFFFFL & n);
            final int n5 = (int)((0xFFFFFFFC0000000L & n) >> 30);
            while (true) {
                final int c = this.c;
                final int n6 = n4 & c;
                if (n6 == (c & n5)) {
                    break;
                }
                Object value2;
                if ((value2 = this.d.get(n6)) == null) {
                    value2 = new m(n4);
                }
                n3.d.set(n3.c & n4, value2);
                ++n4;
            }
            f.set((Object)n3, 0xEFFFFFFFFFFFFFFFL & n);
            while (!e.compareAndSet((Object)this, (Object)null, (Object)n3)) {
                if (e.get((Object)this) != null) {
                    break;
                }
            }
        }
        return n2;
    }
    
    public final Object d() {
        while (true) {
            final AtomicLongFieldUpdater f = n.f;
            final long value = f.get((Object)this);
            if ((value & 0x1000000000000000L) != 0x0L) {
                return n.g;
            }
            final int n = (int)(value & 0x3FFFFFFFL);
            final int n2 = (int)((0xFFFFFFFC0000000L & value) >> 30);
            final int c = this.c;
            final int n3 = n & c;
            if ((n2 & c) == n3) {
                return null;
            }
            final AtomicReferenceArray d = this.d;
            final Object value2 = d.get(n3);
            final boolean b = this.b;
            if (value2 == null) {
                if (b) {
                    return null;
                }
                continue;
            }
            else {
                if (value2 instanceof m) {
                    return null;
                }
                final long n4 = n + 1 & 0x3FFFFFFF;
                if (f.compareAndSet((Object)this, value, (value & 0xFFFFFFFFC0000000L) | n4)) {
                    d.set(n3, (Object)null);
                    return value2;
                }
                if (b) {
                    n n5 = this;
                    while (true) {
                        final AtomicLongFieldUpdater f2 = B5.n.f;
                        final long value3 = f2.get((Object)n5);
                        final int n6 = (int)(value3 & 0x3FFFFFFFL);
                        n c2;
                        if ((value3 & 0x1000000000000000L) != 0x0L) {
                            c2 = n5.c();
                        }
                        else {
                            if (!f2.compareAndSet((Object)n5, value3, (value3 & 0xFFFFFFFFC0000000L) | n4)) {
                                continue;
                            }
                            n5.d.set(n5.c & n6, (Object)null);
                            c2 = null;
                        }
                        n5 = c2;
                        if (c2 == null) {
                            break;
                        }
                    }
                    return value2;
                }
                continue;
            }
        }
    }
}

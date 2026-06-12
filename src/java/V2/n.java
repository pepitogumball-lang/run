package V2;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import com.google.android.gms.internal.measurement.L;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.Objects;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import J5.b;
import W2.a;

public abstract class n extends a implements q
{
    public static final boolean F;
    public static final p G;
    public static final b H;
    public static final Object I;
    public volatile Object C;
    public volatile d D;
    public volatile m E;
    
    static {
        boolean boolean1;
        try {
            boolean1 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        }
        catch (final SecurityException t) {
            boolean1 = false;
        }
        F = boolean1;
        G = new p();
        Object o = null;
        Object h = null;
        Throwable t = null;
        Label_0129: {
            try {
                h = new Object();
                t = null;
                break Label_0129;
            }
            catch (final Error t) {}
            catch (final Exception ex) {}
            try {
                h = new e(AtomicReferenceFieldUpdater.newUpdater((Class)m.class, (Class)Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater((Class)m.class, (Class)m.class, "b"), AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)m.class, "E"), AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)d.class, "D"), AtomicReferenceFieldUpdater.newUpdater((Class)n.class, (Class)Object.class, "C"));
                break Label_0129;
            }
            catch (final Error error) {}
            catch (final Exception h) {
                goto Label_0108;
            }
            final Object o2 = new Object();
            o = h;
            h = o2;
        }
        H = (b)h;
        if (o != null) {
            final p g = n.G;
            final Logger a = g.a();
            final Level severe = Level.SEVERE;
            a.log(severe, "UnsafeAtomicHelper is broken!", t);
            g.a().log(severe, "SafeAtomicHelper is broken!", (Throwable)o);
        }
        I = new Object();
    }
    
    public static void e(final n n) {
        n.getClass();
        for (m m = n.H.z(n); m != null; m = m.b) {
            final Thread a = m.a;
            if (a != null) {
                m.a = null;
                LockSupport.unpark(a);
            }
        }
        d y = n.H.y(n);
        d c = null;
        d d;
        while (true) {
            d = c;
            if (y == null) {
                break;
            }
            final d c2 = y.c;
            y.c = c;
            c = y;
            y = c2;
        }
        while (d != null) {
            final d c3 = d.c;
            final Runnable a2 = d.a;
            Objects.requireNonNull((Object)a2);
            final Executor b = d.b;
            Objects.requireNonNull((Object)b);
            f(a2, b);
            d = c3;
        }
    }
    
    public static void f(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final Exception ex) {
            final Logger a = n.G.a();
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append((Object)runnable);
            sb.append(" with executor ");
            sb.append((Object)executor);
            a.log(severe, sb.toString(), (Throwable)ex);
        }
    }
    
    public static Object g(final Object o) {
        if (o instanceof V2.a) {
            final RuntimeException a = ((V2.a)o).a;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ((Throwable)ex).initCause((Throwable)a);
            throw ex;
        }
        if (!(o instanceof c)) {
            Object o2;
            if ((o2 = o) == n.I) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((c)o).a);
    }
    
    public static Object h(final n n) {
        boolean b = false;
        try {
            return ((Future)n).get();
        }
        catch (final InterruptedException ex) {
            b = true;
            return ((Future)n).get();
        }
        finally {
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public void a(final Runnable runnable, final Executor executor) {
        if (executor != null) {
            if (!this.isDone()) {
                d c = this.D;
                final d d = V2.d.d;
                if (c != d) {
                    final d d2 = new d(runnable, executor);
                    do {
                        d2.c = c;
                        if (n.H.c(this, c, d2)) {
                            return;
                        }
                    } while ((c = this.D) != d);
                }
            }
            f(runnable, executor);
            return;
        }
        throw new NullPointerException("Executor was null.");
    }
    
    public final void c(final StringBuilder sb) {
        try {
            final Object h = h(this);
            sb.append("SUCCESS, result=[");
            this.d(sb, h);
            sb.append("]");
            return;
        }
        catch (final Exception ex) {
            goto Label_0036;
        }
        catch (final ExecutionException ex2) {}
        catch (final CancellationException ex3) {
            sb.append("CANCELLED");
            return;
        }
        sb.append("FAILURE, cause=[");
        final ExecutionException ex2;
        sb.append((Object)((Throwable)ex2).getCause());
        sb.append("]");
    }
    
    public boolean cancel(final boolean b) {
        final Object c = this.C;
        boolean b2 = false;
        if (c == null) {
            V2.a a;
            if (n.F) {
                a = new V2.a(b, (RuntimeException)new CancellationException("Future.cancel() was called."));
            }
            else {
                if (b) {
                    a = V2.a.b;
                }
                else {
                    a = V2.a.c;
                }
                Objects.requireNonNull((Object)a);
            }
            b2 = b2;
            if (n.H.e(this, c, (Object)a)) {
                e(this);
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void d(final StringBuilder sb, final Object o) {
        if (o == null) {
            sb.append("null");
        }
        else if (o == this) {
            sb.append("this future");
        }
        else {
            sb.append(o.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(o)));
        }
    }
    
    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c = this.C;
        if (c != null) {
            return g(c);
        }
        m m = this.E;
        final m c2 = V2.m.c;
        if (m != c2) {
            final m i = new m();
            do {
                final b h = n.H;
                h.F(i, m);
                if (h.g(this, m, i)) {
                    Object c3;
                    do {
                        LockSupport.park((Object)this);
                        if (Thread.interrupted()) {
                            this.j(i);
                            throw new InterruptedException();
                        }
                        c3 = this.C;
                    } while (c3 == null);
                    return g(c3);
                }
            } while ((m = this.E) != c2);
        }
        final Object c4 = this.C;
        Objects.requireNonNull(c4);
        return g(c4);
    }
    
    public Object get(long convert, final TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c = this.C;
        if (c != null) {
            return g(c);
        }
        long n;
        if (nanos > 0L) {
            n = System.nanoTime() + nanos;
        }
        else {
            n = 0L;
        }
        long n2 = nanos;
        Label_0229: {
            if (nanos >= 1000L) {
                m m = this.E;
                final m c2 = V2.m.c;
                if (m != c2) {
                    final m i = new m();
                    do {
                        final b h = V2.n.H;
                        h.F(i, m);
                        if (h.g(this, m, i)) {
                            do {
                                LockSupport.parkNanos((Object)this, Math.min(nanos, 2147483647999999999L));
                                if (Thread.interrupted()) {
                                    this.j(i);
                                    throw new InterruptedException();
                                }
                                final Object c3 = this.C;
                                if (c3 != null) {
                                    return g(c3);
                                }
                                n2 = (nanos = n - System.nanoTime());
                            } while (n2 >= 1000L);
                            this.j(i);
                            break Label_0229;
                        }
                    } while ((m = this.E) != c2);
                }
                final Object c4 = this.C;
                Objects.requireNonNull(c4);
                return g(c4);
            }
        }
        while (n2 > 0L) {
            final Object c5 = this.C;
            if (c5 != null) {
                return g(c5);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n2 = n - System.nanoTime();
        }
        final String string = this.toString();
        final String string2 = timeUnit.toString();
        final Locale root = Locale.ROOT;
        final String lowerCase = string2.toLowerCase(root);
        final StringBuilder sb = new StringBuilder("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(root));
        String s2;
        final String s = s2 = sb.toString();
        if (n2 + 1000L < 0L) {
            final String j = L.i(s, " (plus ");
            final long n3 = -n2;
            convert = timeUnit.convert(n3, TimeUnit.NANOSECONDS);
            final long n4 = n3 - timeUnit.toNanos(convert);
            final long n5 = lcmp(convert, 0L);
            final boolean b = n5 == 0 || n4 > 1000L;
            String k = j;
            if (n5 > 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(j);
                sb2.append(convert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String s3 = sb2.toString();
                if (b) {
                    s3 = L.i(s3, ",");
                }
                k = L.i(s3, " ");
            }
            String string3 = k;
            if (b) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(k);
                sb3.append(n4);
                sb3.append(" nanoseconds ");
                string3 = sb3.toString();
            }
            s2 = L.i(string3, "delay)");
        }
        if (this.isDone()) {
            throw new TimeoutException(L.i(s2, " but future completed as timeout expired"));
        }
        throw new TimeoutException(L.j(s2, " for ", string));
    }
    
    public final String i() {
        if (this instanceof ScheduledFuture) {
            final StringBuilder sb = new StringBuilder("remaining delay=[");
            sb.append(((Delayed)this).getDelay(TimeUnit.MILLISECONDS));
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }
    
    public boolean isCancelled() {
        return this.C instanceof V2.a;
    }
    
    public boolean isDone() {
        return this.C != null;
    }
    
    public final void j(m e) {
        e.a = null;
    Label_0005:
        while (true) {
            e = this.E;
            if (e == m.c) {
                return;
            }
            m m = null;
            while (e != null) {
                final m b = e.b;
                m i;
                if (e.a != null) {
                    i = e;
                }
                else if (m != null) {
                    m.b = b;
                    i = m;
                    if (m.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    i = m;
                    if (!n.H.g(this, e, b)) {
                        continue Label_0005;
                    }
                }
                e = b;
                m = i;
            }
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(this.getClass().getSimpleName());
        }
        else {
            sb.append(this.getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append("[status=");
        if (this.isCancelled()) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.c(sb);
        }
        else {
            final int length = sb.length();
            sb.append("PENDING");
            String s = null;
            Label_0186: {
                try {
                    s = this.i();
                    if (a.a.p(s)) {
                        s = null;
                    }
                    break Label_0186;
                }
                catch (final StackOverflowError s) {}
                catch (final Exception ex) {}
                final StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append((Object)s.getClass());
                s = sb2.toString();
            }
            if (s != null) {
                sb.append(", info=[");
                sb.append(s);
                sb.append("]");
            }
            if (this.isDone()) {
                sb.delete(length, sb.length());
                this.c(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

package u;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import com.google.android.gms.internal.measurement.L;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import com.google.android.gms.internal.auth.m;
import java.util.logging.Logger;
import V2.q;

public abstract class g implements q
{
    public static final boolean F;
    public static final Logger G;
    public static final m H;
    public static final Object I;
    public volatile Object C;
    public volatile c D;
    public volatile f E;
    
    static {
        F = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        G = Logger.getLogger(g.class.getName());
        Object h;
        try {
            final d d = new d(AtomicReferenceFieldUpdater.newUpdater((Class)f.class, (Class)Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater((Class)f.class, (Class)f.class, "b"), AtomicReferenceFieldUpdater.newUpdater((Class)g.class, (Class)f.class, "E"), AtomicReferenceFieldUpdater.newUpdater((Class)g.class, (Class)c.class, "D"), AtomicReferenceFieldUpdater.newUpdater((Class)g.class, (Class)Object.class, "C"));
        }
        finally {
            h = new Object();
        }
        H = (m)h;
        final Throwable t;
        if (t != null) {
            g.G.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        I = new Object();
    }
    
    public static void e(final g g) {
        f f;
        do {
            f = g.E;
        } while (!g.H.e(g, f, u.f.c));
        c c;
        while (true) {
            c = null;
            if (f == null) {
                break;
            }
            final Thread a = f.a;
            if (a != null) {
                f.a = null;
                LockSupport.unpark(a);
            }
            f = f.b;
        }
        g.d();
        c d;
        do {
            d = g.D;
        } while (!g.H.c(g, d, u.c.d));
        c c2 = c;
        c c3 = d;
        c c5;
        while (true) {
            final c c4 = c3;
            c5 = c2;
            if (c4 == null) {
                break;
            }
            c3 = c4.c;
            c4.c = c2;
            c2 = c4;
        }
        while (c5 != null) {
            final c c6 = c5.c;
            f(c5.a, c5.b);
            c5 = c6;
        }
    }
    
    public static void f(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append((Object)runnable);
            sb.append(" with executor ");
            sb.append((Object)executor);
            g.G.log(severe, sb.toString(), (Throwable)ex);
        }
    }
    
    public static Object g(final Object o) {
        if (o instanceof a) {
            final CancellationException b = ((a)o).b;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ((Throwable)ex).initCause((Throwable)b);
            throw ex;
        }
        if (!(o instanceof b)) {
            Object o2;
            if ((o2 = o) == g.I) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((b)o).a);
    }
    
    public static Object h(final g g) {
        boolean b = false;
        try {
            return g.get();
        }
        catch (final InterruptedException ex) {
            b = true;
            return g.get();
        }
        finally {
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public final void a(final Runnable runnable, final Executor executor) {
        executor.getClass();
        c c = this.D;
        final c d = u.c.d;
        if (c != d) {
            final c c2 = new c(runnable, executor);
            do {
                c2.c = c;
                if (g.H.c(this, c, c2)) {
                    return;
                }
            } while ((c = this.D) != d);
        }
        f(runnable, executor);
    }
    
    public final void c(final StringBuilder sb) {
        try {
            final Object h = h(this);
            sb.append("SUCCESS, result=[");
            String value;
            if (h == this) {
                value = "this future";
            }
            else {
                value = String.valueOf(h);
            }
            sb.append(value);
            sb.append("]");
            return;
        }
        catch (final RuntimeException ex) {
            goto Label_0052;
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
    
    public final boolean cancel(final boolean b) {
        final Object c = this.C;
        boolean b2 = false;
        if (c == null) {
            a a;
            if (g.F) {
                a = new a(b, new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                a = u.a.c;
            }
            else {
                a = u.a.d;
            }
            b2 = b2;
            if (g.H.d(this, c, (Object)a)) {
                e(this);
                b2 = true;
            }
        }
        return b2;
    }
    
    public void d() {
    }
    
    public final Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c = this.C;
        if (c != null) {
            return g(c);
        }
        f f = this.E;
        final f c2 = u.f.c;
        if (f != c2) {
            final f f2 = new f();
            do {
                final m h = g.H;
                h.t(f2, f);
                if (h.e(this, f, f2)) {
                    Object c3;
                    do {
                        LockSupport.park((Object)this);
                        if (Thread.interrupted()) {
                            this.j(f2);
                            throw new InterruptedException();
                        }
                        c3 = this.C;
                    } while (c3 == null);
                    return g(c3);
                }
            } while ((f = this.E) != c2);
        }
        return g(this.C);
    }
    
    public final Object get(long convert, final TimeUnit timeUnit) {
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
        Label_0216: {
            if (nanos >= 1000L) {
                f f = this.E;
                final f c2 = u.f.c;
                if (f != c2) {
                    final f f2 = new f();
                    do {
                        final m h = g.H;
                        h.t(f2, f);
                        if (h.e(this, f, f2)) {
                            do {
                                LockSupport.parkNanos((Object)this, nanos);
                                if (Thread.interrupted()) {
                                    this.j(f2);
                                    throw new InterruptedException();
                                }
                                final Object c3 = this.C;
                                if (c3 != null) {
                                    return g(c3);
                                }
                                n2 = (nanos = n - System.nanoTime());
                            } while (n2 >= 1000L);
                            this.j(f2);
                            break Label_0216;
                        }
                    } while ((f = this.E) != c2);
                }
                return g(this.C);
            }
        }
        while (n2 > 0L) {
            final Object c4 = this.C;
            if (c4 != null) {
                return g(c4);
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
            final String i = L.i(s, " (plus ");
            final long n3 = -n2;
            convert = timeUnit.convert(n3, TimeUnit.NANOSECONDS);
            final long n4 = n3 - timeUnit.toNanos(convert);
            final long n5 = lcmp(convert, 0L);
            final boolean b = n5 == 0 || n4 > 1000L;
            String j = i;
            if (n5 > 0) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(i);
                sb2.append(convert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String s3 = sb2.toString();
                if (b) {
                    s3 = L.i(s3, ",");
                }
                j = L.i(s3, " ");
            }
            String string3 = j;
            if (b) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(j);
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
    
    public String i() {
        if (this instanceof ScheduledFuture) {
            final StringBuilder sb = new StringBuilder("remaining delay=[");
            sb.append(((Delayed)this).getDelay(TimeUnit.MILLISECONDS));
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }
    
    public final boolean isCancelled() {
        return this.C instanceof a;
    }
    
    public final boolean isDone() {
        return this.C != null;
    }
    
    public final void j(f e) {
        e.a = null;
    Label_0005:
        while (true) {
            e = this.E;
            if (e == f.c) {
                return;
            }
            f f = null;
            while (e != null) {
                final f b = e.b;
                f f2;
                if (e.a != null) {
                    f2 = e;
                }
                else if (f != null) {
                    f.b = b;
                    f2 = f;
                    if (f.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    f2 = f;
                    if (!g.H.e(this, e, b)) {
                        continue Label_0005;
                    }
                }
                e = b;
                f = f2;
            }
        }
    }
    
    public boolean k(final Object o) {
        Object i = o;
        if (o == null) {
            i = g.I;
        }
        if (g.H.d(this, (Object)null, i)) {
            e(this);
            return true;
        }
        return false;
    }
    
    public boolean l(final Throwable t) {
        t.getClass();
        if (g.H.d(this, (Object)null, (Object)new b(t))) {
            e(this);
            return true;
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.C instanceof a) {
            sb.append("CANCELLED");
        }
        else if (this.isDone()) {
            this.c(sb);
        }
        else {
            String s;
            try {
                s = this.i();
            }
            catch (final RuntimeException ex) {
                final StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                sb2.append((Object)ex.getClass());
                s = sb2.toString();
            }
            if (s != null && !s.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(s);
                sb.append("]");
            }
            else if (this.isDone()) {
                this.c(sb);
            }
            else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

package c1;

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
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import J5.b;
import java.util.logging.Logger;
import V2.q;

public abstract class h implements q
{
    public static final boolean F;
    public static final Logger G;
    public static final b H;
    public static final Object I;
    public volatile Object C;
    public volatile c D;
    public volatile g E;
    
    static {
        F = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        G = Logger.getLogger(h.class.getName());
        Object h;
        try {
            final d d = new d(AtomicReferenceFieldUpdater.newUpdater((Class)g.class, (Class)Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater((Class)g.class, (Class)g.class, "b"), AtomicReferenceFieldUpdater.newUpdater((Class)h.class, (Class)g.class, "E"), AtomicReferenceFieldUpdater.newUpdater((Class)h.class, (Class)c.class, "D"), AtomicReferenceFieldUpdater.newUpdater((Class)h.class, (Class)Object.class, "C"));
        }
        finally {
            h = new Object();
        }
        H = (b)h;
        final Throwable t;
        if (t != null) {
            c1.h.G.log(Level.SEVERE, "SafeAtomicHelper is broken!", t);
        }
        I = new Object();
    }
    
    public static void d(final h h) {
        final c c = null;
        h c2 = h;
        c c3 = c;
    Label_0006:
        while (true) {
            g g = c2.E;
            if (h.H.h(c2, g, c1.g.c)) {
                while (g != null) {
                    final Thread a = g.a;
                    if (a != null) {
                        g.a = null;
                        LockSupport.unpark(a);
                    }
                    g = g.b;
                }
                c d;
                do {
                    d = c2.D;
                } while (!h.H.d(c2, d, c1.c.d));
                c c4 = d;
                c c6;
                while (true) {
                    final c c5 = c4;
                    c6 = c3;
                    if (c5 == null) {
                        break;
                    }
                    c4 = c5.c;
                    c5.c = c3;
                    c3 = c5;
                }
                while (c6 != null) {
                    c3 = c6.c;
                    final Runnable a2 = c6.a;
                    if (a2 instanceof e) {
                        final e e = (e)a2;
                        c2 = e.C;
                        if (c2.C == e && h.H.f(c2, (Object)e, g(e.D))) {
                            continue Label_0006;
                        }
                    }
                    else {
                        e(a2, c6.b);
                    }
                    c6 = c3;
                }
                break;
            }
        }
    }
    
    public static void e(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append((Object)runnable);
            sb.append(" with executor ");
            sb.append((Object)executor);
            h.G.log(severe, sb.toString(), (Throwable)ex);
        }
    }
    
    public static Object f(final Object o) {
        if (o instanceof a) {
            final CancellationException b = ((a)o).b;
            final CancellationException ex = new CancellationException("Task was cancelled.");
            ((Throwable)ex).initCause((Throwable)b);
            throw ex;
        }
        if (!(o instanceof c1.b)) {
            Object o2;
            if ((o2 = o) == h.I) {
                o2 = null;
            }
            return o2;
        }
        throw new ExecutionException(((c1.b)o).a);
    }
    
    public static Object g(final q q) {
        if (q instanceof h) {
            Object o2;
            final Object o = o2 = ((h)q).C;
            if (o instanceof a) {
                final a a = (a)o;
                o2 = o;
                if (a.a) {
                    if (a.b != null) {
                        o2 = new a(false, a.b);
                    }
                    else {
                        o2 = c1.a.d;
                    }
                }
            }
            return o2;
        }
        final boolean cancelled = ((Future)q).isCancelled();
        if ((h.F ^ true) & cancelled) {
            return a.d;
        }
        Object o3 = null;
        final Throwable t;
        Label_0129: {
            try {
                if ((o3 = h(q)) == null) {
                    o3 = h.I;
                }
            }
            catch (final CancellationException o3) {
                break Label_0129;
            }
            catch (final ExecutionException ex) {
                return new c1.b(t.getCause());
            }
            finally {
                return new c1.b(t);
            }
            return o3;
        }
        if (!cancelled) {
            final StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append((Object)t);
            return new c1.b((Throwable)new IllegalArgumentException(sb.toString(), (Throwable)o3));
        }
        return new a(false, (CancellationException)o3);
    }
    
    public static Object h(final q q) {
        boolean b = false;
        try {
            return ((Future)q).get();
        }
        catch (final InterruptedException ex) {
            b = true;
            return ((Future)q).get();
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
        final c d = c1.c.d;
        if (c != d) {
            final c c2 = new c(runnable, executor);
            do {
                c2.c = c;
                if (h.H.d(this, c, c2)) {
                    return;
                }
            } while ((c = this.D) != d);
        }
        e(runnable, executor);
    }
    
    public final void c(final StringBuilder sb) {
        try {
            final Object h = h((q)this);
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
            goto Label_0055;
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
        Object o = this.C;
        final boolean b2 = true;
        boolean b3;
        if (o == null | o instanceof e) {
            a a;
            if (h.F) {
                a = new a(b, new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                a = c1.a.c;
            }
            else {
                a = c1.a.d;
            }
            h h = this;
            b3 = false;
            while (true) {
                if (c1.h.H.f(h, o, (Object)a)) {
                    d(h);
                    b3 = b2;
                    if (!(o instanceof e)) {
                        break;
                    }
                    final q d = ((e)o).D;
                    if (!(d instanceof h)) {
                        ((Future)d).cancel(b);
                        b3 = b2;
                        break;
                    }
                    h = (h)d;
                    o = h.C;
                    final boolean b4 = o == null;
                    b3 = b2;
                    if (!(b4 | o instanceof e)) {
                        break;
                    }
                    b3 = true;
                }
                else {
                    if (!((o = h.C) instanceof e)) {
                        break;
                    }
                    continue;
                }
            }
        }
        else {
            b3 = false;
        }
        return b3;
    }
    
    public final Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c = this.C;
        if (c != null & (c instanceof e ^ true)) {
            return f(c);
        }
        g g = this.E;
        final g c2 = c1.g.c;
        if (g != c2) {
            final g g2 = new g();
            do {
                final b h = c1.h.H;
                h.G(g2, g);
                if (h.h(this, g, g2)) {
                    Object c3;
                    do {
                        LockSupport.park((Object)this);
                        if (Thread.interrupted()) {
                            this.j(g2);
                            throw new InterruptedException();
                        }
                        c3 = this.C;
                    } while (!(c3 != null & (c3 instanceof e ^ true)));
                    return f(c3);
                }
            } while ((g = this.E) != c2);
        }
        return f(this.C);
    }
    
    public final Object get(long convert, final TimeUnit timeUnit) {
        final long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object c = this.C;
        if (c != null & (c instanceof e ^ true)) {
            return f(c);
        }
        long n;
        if (nanos > 0L) {
            n = System.nanoTime() + nanos;
        }
        else {
            n = 0L;
        }
    Label_0226:
        while (true) {
            if (nanos >= 1000L) {
                g g = this.E;
                final g c2 = c1.g.c;
                if (g != c2) {
                    final g g2 = new g();
                    do {
                        final b h = c1.h.H;
                        h.G(g2, g);
                        if (h.h(this, g, g2)) {
                            long n2 = nanos;
                            long n3;
                            do {
                                LockSupport.parkNanos((Object)this, n2);
                                if (Thread.interrupted()) {
                                    this.j(g2);
                                    throw new InterruptedException();
                                }
                                final Object c3 = this.C;
                                if (c3 != null & (c3 instanceof e ^ true)) {
                                    return f(c3);
                                }
                                n3 = (n2 = n - System.nanoTime());
                            } while (n3 >= 1000L);
                            this.j(g2);
                            final long n4 = n;
                            final long n5 = n3;
                            break Label_0226;
                        }
                    } while ((g = this.E) != c2);
                }
                return f(this.C);
            }
            final long n4 = n;
            long n5 = nanos;
            if (n5 > 0L) {
                final Object c4 = this.C;
                if (c4 != null & (c4 instanceof e ^ true)) {
                    return f(c4);
                }
                if (!Thread.interrupted()) {
                    n5 = n4 - System.nanoTime();
                    continue Label_0226;
                }
                throw new InterruptedException();
            }
            else {
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
                if (n5 + 1000L < 0L) {
                    final String i = L.i(s, " (plus ");
                    final long n6 = -n5;
                    convert = timeUnit.convert(n6, TimeUnit.NANOSECONDS);
                    final long n7 = n6 - timeUnit.toNanos(convert);
                    final long n8 = lcmp(convert, 0L);
                    final boolean b = n8 == 0 || n7 > 1000L;
                    String j = i;
                    if (n8 > 0) {
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
                        sb3.append(n7);
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
            break;
        }
    }
    
    public final String i() {
        final Object c = this.C;
        if (c instanceof e) {
            final StringBuilder sb = new StringBuilder("setFuture=[");
            final q d = ((e)c).D;
            String value;
            if (d == this) {
                value = "this future";
            }
            else {
                value = String.valueOf((Object)d);
            }
            return x.a.b(sb, value, "]");
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder sb2 = new StringBuilder("remaining delay=[");
            sb2.append(((Delayed)this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }
    
    public final boolean isCancelled() {
        return this.C instanceof a;
    }
    
    public final boolean isDone() {
        final Object c = this.C;
        return (c instanceof e ^ true) & c != null;
    }
    
    public final void j(g e) {
        e.a = null;
    Label_0005:
        while (true) {
            e = this.E;
            if (e == g.c) {
                return;
            }
            g g = null;
            while (e != null) {
                final g b = e.b;
                g g2;
                if (e.a != null) {
                    g2 = e;
                }
                else if (g != null) {
                    g.b = b;
                    g2 = g;
                    if (g.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    g2 = g;
                    if (!h.H.h(this, e, b)) {
                        continue Label_0005;
                    }
                }
                e = b;
                g = g2;
            }
        }
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

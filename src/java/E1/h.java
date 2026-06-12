package E1;

import com.google.android.gms.internal.ads.pA;
import com.google.android.gms.internal.ads.gv;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.Rr;
import com.google.android.gms.internal.ads.OA;
import O2.r;
import com.google.android.gms.internal.ads.U4;
import java.util.Iterator;
import J1.j;
import com.google.android.gms.internal.ads.E5;
import java.io.File;
import com.google.android.gms.internal.ads.bs;
import com.google.android.gms.internal.ads.ls;
import C2.b;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.y4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import android.util.Base64;
import com.google.android.gms.internal.ads.E4;
import com.google.android.gms.internal.ads.I4;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.internal.ads.z4;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.ads.Tv;
import I1.M;
import android.app.Activity;
import android.view.View;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.a4;
import com.google.android.gms.internal.ads.b4;
import com.google.android.gms.internal.ads.R4;
import J1.e;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.z7;
import android.os.Looper;
import F1.p;
import com.google.android.gms.internal.ads.rd;
import F1.q;
import com.google.android.gms.internal.ads.D7;
import java.util.concurrent.Executors;
import java.util.concurrent.CountDownLatch;
import J1.a;
import android.content.Context;
import K2.c0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Vector;
import com.google.android.gms.internal.ads.T4;

public final class h implements Runnable, T4
{
    public final Vector C;
    public final AtomicReference D;
    public final AtomicReference E;
    public boolean F;
    public final boolean G;
    public final boolean H;
    public final ExecutorService I;
    public final c0 J;
    public Context K;
    public final Context L;
    public a M;
    public final a N;
    public final boolean O;
    public final CountDownLatch P;
    public int Q;
    
    public h(final Context context, final a a) {
        this.C = new Vector();
        this.D = new AtomicReference();
        this.E = new AtomicReference();
        this.P = new CountDownLatch(1);
        this.K = context;
        this.L = context;
        this.M = a;
        this.N = a;
        final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        this.I = cachedThreadPool;
        final z7 t2 = D7.t2;
        final q d = q.d;
        final boolean booleanValue = (boolean)d.c.a(t2);
        this.O = booleanValue;
        this.J = c0.d(context, cachedThreadPool, booleanValue);
        final z7 q2 = D7.q2;
        final B7 c = d.c;
        this.G = (boolean)c.a(q2);
        this.H = (boolean)c.a(D7.u2);
        if (c.a(D7.s2)) {
            this.Q = 2;
        }
        else {
            this.Q = 1;
        }
        if (!(boolean)c.a(D7.w3)) {
            this.F = this.k();
        }
        if (c.a(D7.q3)) {
            rd.a.execute((Runnable)this);
            return;
        }
        final e a2 = p.f.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            rd.a.execute((Runnable)this);
            return;
        }
        this.run();
    }
    
    public static final R4 p(Context context, final a a, final boolean b, final boolean b2) {
        final a4 y = b4.y();
        ((OA)y).e();
        b4.C((b4)((OA)y).D, b);
        final String c = a.C;
        ((OA)y).e();
        b4.D((b4)((OA)y).D, c);
        final b4 b3 = (b4)((OA)y).b();
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        final Class<R4> clazz;
        monitorenter(clazz = R4.class);
        try {
            final Object o = new Object();
            ((Rr)o).b = false;
            final byte b4 = (byte)(((Rr)o).f | 0x1);
            ((Rr)o).c = true;
            final byte b5 = (byte)((byte)(b4 | 0x2) | 0x4);
            ((Rr)o).d = 100L;
            final byte b6 = (byte)((byte)(b5 | 0x8) | 0x10);
            ((Rr)o).e = 300L;
            ((Rr)o).f = (byte)(b6 | 0x20);
            final String b7 = b3.B();
            if (b7 != null) {
                ((Rr)o).a = b7;
                ((Rr)o).b = b3.E();
                ((Rr)o).f |= 0x1;
                final R4 m = R4.m(context, Executors.newCachedThreadPool(), ((Rr)o).a(), b2);
                monitorexit(clazz);
                return m;
            }
            throw new NullPointerException("Null clientVersion");
        }
        finally {
            monitorexit(clazz);
            throw new NullPointerException("Null clientVersion");
        }
    }
    
    public final void a(final MotionEvent motionEvent) {
        final T4 m = this.m();
        if (m != null) {
            this.n();
            m.a(motionEvent);
            return;
        }
        this.C.add((Object)new Object[] { motionEvent });
    }
    
    public final void b(final View view) {
        final T4 m = this.m();
        if (m != null) {
            m.b(view);
        }
    }
    
    public final String c(final Context context) {
        return this.j(context);
    }
    
    public final void d(final StackTraceElement[] array) {
        if (q.d.c.a(D7.Q2)) {
            if (this.P.getCount() == 0L) {
                final T4 m = this.m();
                if (m != null) {
                    m.d(array);
                }
            }
        }
        else if (this.l()) {
            final T4 i = this.m();
            if (i != null) {
                i.d(array);
            }
        }
    }
    
    public final String e(final Context context, final View view, final Activity activity) {
        final z7 qa = D7.qa;
        final q d = q.d;
        final boolean booleanValue = (boolean)d.c.a(qa);
        final B7 c = d.c;
        if (booleanValue) {
            if (this.l()) {
                final T4 m = this.m();
                if (c.a(D7.ra)) {
                    final M c2 = o.B.c;
                    I1.M.i(view, 2);
                }
                if (m != null) {
                    return m.e(context, view, activity);
                }
            }
        }
        else {
            final T4 i = this.m();
            if (c.a(D7.ra)) {
                final M c3 = o.B.c;
                I1.M.i(view, 2);
            }
            if (i != null) {
                return i.e(context, view, activity);
            }
        }
        return "";
    }
    
    public final String f(final Context context) {
        final Tv tv = new Tv((Callable)new f(this, 0, context));
        ((Executor)this.I).execute((Runnable)tv);
        try {
            return (String)((gv)tv).get((long)(int)q.d.c.a(D7.K2), TimeUnit.MILLISECONDS);
        }
        catch (final TimeoutException ex) {
            final String c = this.N.C;
            String s;
            try {
                final y4 y = z4.y();
                ((OA)y).e();
                z4.A((z4)((OA)y).D, c);
                ((OA)y).e();
                z4.z((z4)((OA)y).D);
                final String packageName = context.getPackageName();
                ((OA)y).e();
                z4.B((z4)((OA)y).D, packageName);
                final long n = System.currentTimeMillis() / 1000L;
                ((OA)y).e();
                z4.C((z4)((OA)y).D, n);
                try {
                    final long n2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    ((OA)y).e();
                    z4.D((z4)((OA)y).D, n2);
                }
                catch (final PackageManager$NameNotFoundException ex2) {
                    ((OA)y).e();
                    z4.D((z4)((OA)y).D, -1L);
                }
                final D4 a = I4.a((String)null, ((pA)((OA)y).b()).d());
                ((OA)a).e();
                E4.C((E4)((OA)a).D);
                ((OA)a).e();
                E4.B((E4)((OA)a).D, 2);
                s = Base64.encodeToString(((pA)((OA)a).b()).d(), 11);
            }
            catch (final GeneralSecurityException | UnsupportedEncodingException ex3) {
                s = Integer.toString(7);
            }
            return s;
        }
        catch (final InterruptedException | ExecutionException ex4) {
            return Integer.toString(17);
        }
    }
    
    public final String g(final Context context, final String s, final View view) {
        return this.h(context, s, view, null);
    }
    
    public final String h(Context context, final String s, final View view, final Activity activity) {
        if (this.l()) {
            final T4 m = this.m();
            if (q.d.c.a(D7.ra)) {
                final M c = o.B.c;
                I1.M.i(view, 4);
            }
            if (m != null) {
                this.n();
                final Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                return m.h(context, s, view, activity);
            }
        }
        return "";
    }
    
    public final void i(final int n, final int n2, final int n3) {
        final T4 m = this.m();
        if (m != null) {
            this.n();
            m.i(n, n2, n3);
            return;
        }
        this.C.add((Object)new Object[] { n, n2, n3 });
    }
    
    public final String j(Context context) {
        if (this.l()) {
            final T4 m = this.m();
            if (m != null) {
                this.n();
                final Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                return m.c(context);
            }
        }
        return "";
    }
    
    public final boolean k() {
        final Context k = this.K;
        final ls ls = new ls(k, F7.x(k, this.J), (bs)new b(this, 4), (boolean)q.d.c.a(D7.r2));
        final long currentTimeMillis = System.currentTimeMillis();
        final Object h;
        monitorenter(h = com.google.android.gms.internal.ads.ls.H);
        boolean b = true;
        Label_0117: {
            try {
                final E5 g = ls.g(1);
                if (g == null) {
                    ls.f(currentTimeMillis, 4025);
                    monitorexit(h);
                    b = false;
                    return b;
                }
                break Label_0117;
            }
            finally {
                monitorexit(h);
                Label_0167: {
                    final File d;
                    iftrue(Label_0205:)(new File(d, "pcbc").exists());
                }
                Block_6: {
                    break Block_6;
                    final E5 g;
                    final File d = ls.d(g.G());
                    iftrue(Label_0167:)(new File(d, "pcam.jar").exists());
                    Block_5: {
                        break Block_5;
                        Label_0205:
                        ls.f(currentTimeMillis, 5019);
                        monitorexit(h);
                        return b;
                    }
                    ls.f(currentTimeMillis, 4026);
                    monitorexit(h);
                    return false;
                }
                ls.f(currentTimeMillis, 4027);
                monitorexit(h);
                return false;
            }
        }
    }
    
    public final boolean l() {
        try {
            this.P.await();
            return true;
        }
        catch (final InterruptedException ex) {
            j.j("Interrupted during GADSignals creation.", (Throwable)ex);
            return false;
        }
    }
    
    public final T4 m() {
        int q;
        if (this.G && !this.F) {
            q = 1;
        }
        else {
            q = this.Q;
        }
        if (q == 2) {
            return (T4)this.E.get();
        }
        return (T4)this.D.get();
    }
    
    public final void n() {
        final Vector c = this.C;
        final T4 m = this.m();
        if (!c.isEmpty()) {
            if (m != null) {
                for (final Object[] array : c) {
                    final int length = array.length;
                    if (length == 1) {
                        m.a((MotionEvent)array[0]);
                    }
                    else {
                        if (length != 3) {
                            continue;
                        }
                        m.i((int)array[0], (int)array[1], (int)array[2]);
                    }
                }
                c.clear();
            }
        }
    }
    
    public final void o(final boolean b) {
        final String c = this.M.C;
        final Context k = this.K;
        Context applicationContext = k.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = k;
        }
        final a4 y = b4.y();
        ((OA)y).e();
        b4.C((b4)((OA)y).D, b);
        ((OA)y).e();
        b4.D((b4)((OA)y).D, c);
        final b4 b2 = (b4)((OA)y).b();
        final Object o = new Object();
        ((r)o).D = b2.B();
        ((r)o).C = b2.E();
        ((r)o).E = b2.z();
        b2.A();
        this.D.set((Object)U4.u(applicationContext, (r)o));
    }
    
    public final void run() {
        Label_0298: {
            try {
                if (q.d.c.a(D7.w3)) {
                    this.F = this.k();
                }
            }
            finally {
                break Label_0298;
            }
            final boolean f = this.M.F;
            final q q;
            final boolean booleanValue = (boolean)q.c.a(D7.Z0);
            boolean b2;
            final boolean b = b2 = false;
            if (!booleanValue) {
                b2 = b;
                if (f) {
                    b2 = true;
                }
            }
            int q2;
            if (this.G && !this.F) {
                q2 = 1;
            }
            else {
                q2 = this.Q;
            }
            Label_0280: {
                if (q2 == 1) {
                    this.o(b2);
                    if (this.Q == 2) {
                        ((Executor)this.I).execute((Runnable)new g(0, this, b2));
                    }
                }
                else {
                    final long currentTimeMillis = System.currentTimeMillis();
                    R4 p = null;
                    Label_0252: {
                        R4 r4;
                        try {
                            p = p(this.K, this.M, b2, this.O);
                            this.E.set((Object)p);
                            if (!this.H) {
                                break Label_0280;
                            }
                            monitorenter(r4 = p);
                            final R4 r5 = p;
                            final boolean b3 = r5.R;
                            final R4 r6 = r4;
                            monitorexit(r6);
                            final boolean b4 = b3;
                            if (!b4) {
                                final h h = this;
                                final int n = 1;
                                h.Q = n;
                                final h h2 = this;
                                final boolean b5 = b2;
                                h2.o(b5);
                            }
                            break Label_0280;
                        }
                        catch (final NullPointerException p) {
                            break Label_0252;
                        }
                        try {
                            final R4 r5 = p;
                            final boolean b3 = r5.R;
                            final R4 r6 = r4;
                            monitorexit(r6);
                            final boolean b4 = b3;
                            if (!b4) {
                                final h h = this;
                                final int n = 1;
                                h.Q = n;
                                final h h2 = this;
                                final boolean b5 = b2;
                                h2.o(b5);
                            }
                            break Label_0280;
                        }
                        finally {
                            monitorexit(r4);
                        }
                    }
                    this.Q = 1;
                    this.o(b2);
                    this.J.j(2031, System.currentTimeMillis() - currentTimeMillis, (Exception)p);
                }
            }
            this.P.countDown();
            this.K = null;
            this.M = null;
            return;
        }
        this.P.countDown();
        this.K = null;
        this.M = null;
    }
}

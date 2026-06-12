package O3;

import java.lang.ref.Reference;
import com.google.protobuf.n;
import androidx.fragment.app.Q;
import n5.h;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import com.google.android.gms.internal.measurement.K1;
import androidx.fragment.app.E;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.fragment.app.y;
import Z3.w;
import Z3.x;
import java.util.Map;
import com.google.firebase.perf.session.SessionManager;
import Z3.A;
import S3.d;
import android.util.SparseIntArray;
import d2.m;
import android.os.Build$VERSION;
import com.google.firebase.perf.metrics.Trace;
import android.app.Activity;
import java.util.Iterator;
import N3.b;
import Z3.i;
import Y3.j;
import K2.D;
import X3.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashSet;
import java.util.HashMap;
import java.util.WeakHashMap;
import R3.a;
import android.app.Application$ActivityLifecycleCallbacks;

public final class c implements Application$ActivityLifecycleCallbacks
{
    public static final a T;
    public static volatile c U;
    public final WeakHashMap C;
    public final WeakHashMap D;
    public final WeakHashMap E;
    public final WeakHashMap F;
    public final HashMap G;
    public final HashSet H;
    public final HashSet I;
    public final AtomicInteger J;
    public final f K;
    public final P3.a L;
    public final D M;
    public final boolean N;
    public j O;
    public j P;
    public i Q;
    public boolean R;
    public boolean S;
    
    static {
        T = a.d();
    }
    
    public c(final f k, final D m) {
        final P3.a e = P3.a.e();
        final a e2 = O3.f.e;
        this.C = new WeakHashMap();
        this.D = new WeakHashMap();
        this.E = new WeakHashMap();
        this.F = new WeakHashMap();
        this.G = new HashMap();
        this.H = new HashSet();
        this.I = new HashSet();
        this.J = new AtomicInteger(0);
        this.Q = i.F;
        this.R = false;
        this.S = true;
        this.K = k;
        this.M = m;
        this.L = e;
        this.N = true;
    }
    
    public static c a() {
        if (c.U == null) {
            final Class<c> clazz;
            monitorenter(clazz = c.class);
            Label_0052: {
                try {
                    if (c.U == null) {
                        c.U = new c(f.U, new D(18));
                    }
                    break Label_0052;
                }
                finally {
                    monitorexit(clazz);
                    monitorexit(clazz);
                }
            }
        }
        return c.U;
    }
    
    public final void b(final String s) {
        final HashMap g;
        monitorenter(g = this.G);
        Label_0046: {
            try {
                final Long n = (Long)this.G.get((Object)s);
                if (n == null) {
                    this.G.put((Object)s, (Object)1L);
                    break Label_0046;
                }
                break Label_0046;
            }
            finally {
                monitorexit(g);
                final Long n;
                this.G.put((Object)s, (Object)(n + 1L));
                monitorexit(g);
            }
        }
    }
    
    public final void c() {
        final HashSet i;
        monitorenter(i = this.I);
        Label_0072: {
            try {
                final Iterator iterator = this.I.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() != null) {
                        try {
                            b.a();
                        }
                        catch (final IllegalStateException ex) {
                            N3.c.a.g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", ex);
                        }
                    }
                }
                break Label_0072;
            }
            finally {
                monitorexit(i);
                monitorexit(i);
            }
        }
    }
    
    public final void d(final Activity activity) {
        final WeakHashMap f = this.F;
        final Trace trace = (Trace)f.get((Object)activity);
        if (trace == null) {
            return;
        }
        f.remove((Object)activity);
        final O3.f f2 = (O3.f)this.D.get((Object)activity);
        final b1.f b = f2.b;
        final boolean d = f2.d;
        final a e = O3.f.e;
        Y3.f a;
        if (!d) {
            e.a("Cannot stop because no recording was started");
            a = new Y3.f();
        }
        else {
            final HashMap c = f2.c;
            if (!c.isEmpty()) {
                e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                c.clear();
            }
            a = f2.a();
            Label_0174: {
                try {
                    b.m(f2.a);
                    break Label_0174;
                }
                catch (final NullPointerException a) {}
                catch (final IllegalArgumentException ex) {}
                if (a instanceof NullPointerException && Build$VERSION.SDK_INT > 28) {
                    throw a;
                }
                e.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", a.toString());
                a = new Y3.f();
            }
            final m m = (m)b.D;
            final Object c2 = m.c;
            m.c = new SparseIntArray[9];
            f2.d = false;
        }
        if (!a.b()) {
            c.T.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        Y3.i.a(trace, (d)a.a());
        trace.stop();
    }
    
    public final void e(final String s, final j j, final j i) {
        if (!this.L.p()) {
            return;
        }
        final x n = A.N();
        n.q(s);
        n.o(j.C);
        n.p(j.b(i));
        final w a = SessionManager.getInstance().perfSession().a();
        ((n)n).l();
        A.z((A)((n)n).D, a);
        final int andSet = this.J.getAndSet(0);
        final HashMap g;
        monitorenter(g = this.G);
        Label_0136: {
            try {
                final HashMap g2 = this.G;
                ((n)n).l();
                A.v((A)((n)n).D).putAll((Map)g2);
                if (andSet != 0) {
                    n.n("_tsns", (long)andSet);
                }
                break Label_0136;
            }
            finally {
                monitorexit(g);
                this.G.clear();
                monitorexit(g);
                this.K.c((A)((n)n).j(), i.G);
            }
        }
    }
    
    public final void f(final Activity activity) {
        if (this.N && this.L.p()) {
            final O3.f f = new O3.f(activity);
            this.D.put((Object)activity, (Object)f);
            if (activity instanceof y) {
                final e e = new e(this.M, this.K, this, f);
                this.E.put((Object)activity, (Object)e);
                final K1 n = ((y)activity).getSupportFragmentManager().n;
                n.getClass();
                ((CopyOnWriteArrayList)n.E).add((Object)new E(e));
            }
        }
    }
    
    public final void g(final i q) {
        this.Q = q;
        final HashSet h;
        monitorenter(h = this.H);
        while (true) {
            Label_0078: {
                try {
                    final Iterator iterator = this.H.iterator();
                    while (iterator.hasNext()) {
                        final O3.b b = (O3.b)((Reference)iterator.next()).get();
                        if (b == null) {
                            break Label_0078;
                        }
                        b.onUpdateAppState(this.Q);
                    }
                    break Label_0078;
                }
                finally {
                    monitorexit(h);
                    final Iterator iterator;
                    iterator.remove();
                    continue;
                    monitorexit(h);
                }
            }
            break;
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.f(activity);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.D.remove((Object)activity);
        if (this.E.containsKey((Object)activity)) {
            while (true) {
                final Q supportFragmentManager = ((y)activity).getSupportFragmentManager();
                final Object o = this.E.remove((Object)activity);
                final K1 n = supportFragmentManager.n;
                n.getClass();
                h.e("cb", o);
                final CopyOnWriteArrayList list;
                monitorenter(list = (CopyOnWriteArrayList)n.E);
                Label_0152: {
                Label_0146:
                    while (true) {
                        int n2;
                        try {
                            final int size = ((CopyOnWriteArrayList)n.E).size();
                            n2 = 0;
                            if (n2 >= size) {
                                break Label_0146;
                            }
                            if (((E)((CopyOnWriteArrayList)n.E).get(n2)).a == o) {
                                ((CopyOnWriteArrayList)n.E).remove(n2);
                                break Label_0146;
                            }
                        }
                        finally {
                            break Label_0152;
                        }
                        ++n2;
                        continue;
                    }
                    monitorexit(list);
                    break;
                }
                monitorexit(list);
            }
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        monitorenter(this);
        Label_0102: {
            while (true) {
                Label_0077: {
                    try {
                        if (!this.C.isEmpty()) {
                            break Label_0102;
                        }
                        this.M.getClass();
                        this.O = new j();
                        this.C.put((Object)activity, (Object)Boolean.TRUE);
                        if (this.S) {
                            this.g(i.E);
                            this.c();
                            this.S = false;
                            break Label_0114;
                        }
                        break Label_0077;
                    }
                    finally {
                        monitorexit(this);
                        this.e("_bs", this.P, this.O);
                        this.g(i.E);
                        monitorexit(this);
                        return;
                        this.C.put((Object)activity, (Object)Boolean.TRUE);
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        monitorenter(this);
        while (true) {
            Label_0044: {
                try {
                    if (!this.N || !this.L.p()) {
                        break Label_0102;
                    }
                    if (!this.D.containsKey((Object)activity)) {
                        this.f(activity);
                    }
                    break Label_0044;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                    return;
                    ((O3.f)this.D.get((Object)activity)).b();
                    final Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.K, this.M, this);
                    trace.start();
                    this.F.put((Object)activity, (Object)trace);
                    continue;
                }
            }
            break;
        }
    }
    
    public final void onActivityStopped(final Activity activity) {
        monitorenter(this);
        Label_0023: {
            try {
                if (this.N) {
                    this.d(activity);
                }
                break Label_0023;
            }
            finally {
                monitorexit(this);
                while (true) {
                    monitorexit(this);
                    return;
                    iftrue(Label_0093:)(!this.C.containsKey((Object)activity));
                    this.C.remove((Object)activity);
                    iftrue(Label_0093:)(!this.C.isEmpty());
                    this.M.getClass();
                    final j p = new j();
                    this.P = p;
                    this.e("_fs", this.O, p);
                    this.g(i.F);
                    continue;
                }
            }
        }
    }
}

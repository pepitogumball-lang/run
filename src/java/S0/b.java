package S0;

import c1.h;
import java.util.concurrent.Future;
import androidx.work.impl.foreground.SystemForegroundService;
import c1.j;
import com.google.android.gms.internal.measurement.L;
import java.util.concurrent.Executor;
import K2.N0;
import C2.v;
import w2.e;
import android.content.Intent;
import android.os.Build$VERSION;
import E.d;
import R0.g;
import java.util.Iterator;
import a1.i;
import androidx.work.ListenableWorker;
import V2.q;
import R0.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import androidx.work.impl.WorkDatabase;
import c2.k;
import android.content.Context;
import android.os.PowerManager$WakeLock;

public final class b implements a
{
    public static final String N;
    public PowerManager$WakeLock C;
    public final Context D;
    public final R0.b E;
    public final k F;
    public final WorkDatabase G;
    public final HashMap H;
    public final HashMap I;
    public final List J;
    public final HashSet K;
    public final ArrayList L;
    public final Object M;
    
    static {
        N = m.h("Processor");
    }
    
    public b(final Context d, final R0.b e, final k f, final WorkDatabase g, final List j) {
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.I = new HashMap();
        this.H = new HashMap();
        this.J = j;
        this.K = new HashSet();
        this.L = new ArrayList();
        this.C = null;
        this.M = new Object();
    }
    
    public static boolean c(final String s, final l l) {
        if (l != null) {
            l.U = true;
            l.h();
            final q t = l.T;
            boolean done;
            if (t != null) {
                done = ((Future)t).isDone();
                ((Future)l.T).cancel(true);
            }
            else {
                done = false;
            }
            final ListenableWorker h = l.H;
            if (h != null && !done) {
                h.stop();
            }
            else {
                final i g = l.G;
                final StringBuilder sb = new StringBuilder("WorkSpec ");
                sb.append((Object)g);
                sb.append(" is already done. Not interrupting.");
                m.e().c(l.V, sb.toString(), new Throwable[0]);
            }
            m.e().c(b.N, m0.a.f("WorkerWrapper interrupted for ", s), new Throwable[0]);
            return true;
        }
        m.e().c(b.N, m0.a.f("WorkerWrapper could not be found for ", s), new Throwable[0]);
        return false;
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        final Object m;
        monitorenter(m = this.M);
        Label_0143: {
            try {
                this.I.remove((Object)s);
                final m e = R0.m.e();
                final String n = b.N;
                final String simpleName = b.class.getSimpleName();
                final StringBuilder sb = new StringBuilder();
                sb.append(simpleName);
                sb.append(" ");
                sb.append(s);
                sb.append(" executed; reschedule = ");
                sb.append(b);
                e.c(n, sb.toString(), new Throwable[0]);
                final Iterator iterator = this.L.iterator();
                while (iterator.hasNext()) {
                    ((a)iterator.next()).a(s, b);
                }
                break Label_0143;
            }
            finally {
                monitorexit(m);
                monitorexit(m);
            }
        }
    }
    
    public final void b(final a a) {
        final Object m = this.M;
        synchronized (m) {
            this.L.add((Object)a);
        }
    }
    
    public final boolean d(final String s) {
        final Object m;
        monitorenter(m = this.M);
        Label_0044: {
            try {
                if (!this.I.containsKey((Object)s) && !this.H.containsKey((Object)s)) {
                    final boolean b = false;
                    break Label_0044;
                }
                break Label_0044;
            }
            finally {
                monitorexit(m);
                final boolean b = true;
                monitorexit(m);
                return b;
            }
        }
    }
    
    public final void e(final a a) {
        final Object m = this.M;
        synchronized (m) {
            this.L.remove((Object)a);
        }
    }
    
    public final void f(final String s, final g g) {
        final Object m;
        monitorenter(m = this.M);
        Label_0117: {
            try {
                final m e = R0.m.e();
                final String n = b.N;
                final StringBuilder sb = new StringBuilder("Moving WorkSpec (");
                sb.append(s);
                sb.append(") to the foreground");
                e.g(n, sb.toString(), new Throwable[0]);
                final l l = (l)this.I.remove((Object)s);
                if (l == null) {
                    break Label_0117;
                }
                if (this.C == null) {
                    (this.C = b1.k.a(this.D, "ProcessorForegroundLck")).acquire();
                }
                break Label_0117;
            }
            finally {
                monitorexit(m);
                while (true) {
                    final Context d;
                    final Intent d2;
                    E.d.b(d, d2);
                    break Label_0117;
                    Label_0160: {
                        d.startService(d2);
                    }
                    break Label_0117;
                    final l l;
                    this.H.put((Object)s, (Object)l);
                    d2 = Z0.a.d(this.D, s, g);
                    d = this.D;
                    iftrue(Label_0160:)(Build$VERSION.SDK_INT < 26);
                    continue;
                }
                monitorexit(m);
            }
        }
    }
    
    public final boolean g(final String s, e f) {
        final Object m;
        monitorenter(m = this.M);
        Label_0075: {
            try {
                if (this.d(s)) {
                    final m e = R0.m.e();
                    final String n = b.N;
                    final StringBuilder sb = new StringBuilder("Work ");
                    sb.append(s);
                    sb.append(" is already enqueued for processing");
                    e.c(n, sb.toString(), new Throwable[0]);
                    monitorexit(m);
                    return false;
                }
                break Label_0075;
            }
            finally {
                monitorexit(m);
                R0.b e2 = null;
                k f2 = null;
                WorkDatabase g = null;
                Context applicationContext = null;
                List j = null;
                Label_0131: {
                    e e3;
                    while (true) {
                        break Label_0131;
                        final Context d = this.D;
                        e2 = this.E;
                        f2 = this.F;
                        g = this.G;
                        e3 = new e(11);
                        applicationContext = d.getApplicationContext();
                        j = this.J;
                        iftrue(Label_0129:)(f == null);
                        continue;
                    }
                    Label_0129: {
                        f = e3;
                    }
                }
                final Object o = new Object();
                ((l)o).J = new R0.i();
                ((l)o).S = (j)new Object();
                ((l)o).T = null;
                ((l)o).C = applicationContext;
                ((l)o).I = f2;
                ((l)o).L = this;
                ((l)o).D = s;
                ((l)o).E = j;
                ((l)o).F = f;
                ((l)o).H = null;
                ((l)o).K = e2;
                ((l)o).M = g;
                ((l)o).N = g.n();
                ((l)o).O = g.i();
                ((l)o).P = g.o();
                final j s2 = ((l)o).S;
                final v v = new v(17);
                v.E = this;
                v.D = s;
                ((h)(v.F = s2)).a((Runnable)v, (Executor)this.F.F);
                this.I.put((Object)s, o);
                monitorexit(m);
                ((b1.i)this.F.D).execute((Runnable)o);
                R0.m.e().c(b.N, com.google.android.gms.internal.measurement.L.j(b.class.getSimpleName(), ": processing ", s), new Throwable[0]);
                return true;
            }
        }
    }
    
    public final void h() {
        final Object m;
        monitorenter(m = this.M);
        Label_0107: {
            try {
                if (!this.H.isEmpty()) {
                    break Label_0107;
                }
                final Context d = this.D;
                final String l = Z0.a.L;
                final Intent intent = new Intent(d, (Class)SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.D.startService(intent);
                }
                finally {
                    final Throwable t;
                    R0.m.e().d(b.N, "Unable to stop foreground service", t);
                }
                final PowerManager$WakeLock c = this.C;
                if (c != null) {
                    c.release();
                    this.C = null;
                }
                break Label_0107;
            }
            finally {
                monitorexit(m);
                monitorexit(m);
            }
        }
    }
    
    public final boolean i(final String s) {
        final Object m = this.M;
        synchronized (m) {
            final m e = R0.m.e();
            final String n = b.N;
            final StringBuilder sb = new StringBuilder("Processor stopping foreground work ");
            sb.append(s);
            e.c(n, sb.toString(), new Throwable[0]);
            return c(s, (l)this.H.remove((Object)s));
        }
    }
    
    public final boolean j(final String s) {
        final Object m = this.M;
        synchronized (m) {
            final m e = R0.m.e();
            final String n = b.N;
            final StringBuilder sb = new StringBuilder("Processor stopping background work ");
            sb.append(s);
            e.c(n, sb.toString(), new Throwable[0]);
            return c(s, (l)this.I.remove((Object)s));
        }
    }
}

package S0;

import u0.o;
import z0.f;
import C2.z;
import java.util.Iterator;
import androidx.work.impl.WorkDatabase_Impl;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.concurrent.Executor;
import b1.e;
import java.util.Arrays;
import b1.g;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayDeque;
import u0.n;
import k3.v;
import u0.l;
import android.app.ActivityManager;
import java.util.ArrayList;
import u0.j;
import b1.i;
import R0.m;
import android.content.BroadcastReceiver$PendingResult;
import X4.C;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import R0.b;
import android.content.Context;
import s2.a;

public final class k extends a
{
    public static k m;
    public static k n;
    public static final Object o;
    public final Context d;
    public final b e;
    public final WorkDatabase f;
    public final c2.k g;
    public final List h;
    public final S0.b i;
    public final C j;
    public boolean k;
    public BroadcastReceiver$PendingResult l;
    
    static {
        R0.m.h("WorkManagerImpl");
        k.m = null;
        k.n = null;
        o = new Object();
    }
    
    public k(Context applicationContext, final b e, final c2.k g) {
        final boolean boolean1 = applicationContext.getResources().getBoolean(2130968583);
        final Context applicationContext2 = applicationContext.getApplicationContext();
        final i d = (i)g.D;
        final int k = WorkDatabase.k;
        j j;
        if (boolean1) {
            j = new j(applicationContext2, (String)null);
            j.g = true;
        }
        else {
            final String a = S0.j.a;
            j = new j(applicationContext2, "androidx.work.workdb");
            j.f = new R4.b(applicationContext2);
        }
        j.d = (Executor)d;
        final Object o = new Object();
        if (j.c == null) {
            j.c = new ArrayList();
        }
        j.c.add(o);
        j.a(new v0.a[] { S0.i.a });
        j.a(new v0.a[] { new h(applicationContext2, 2, 3) });
        j.a(new v0.a[] { S0.i.b });
        j.a(new v0.a[] { S0.i.c });
        j.a(new v0.a[] { new h(applicationContext2, 5, 6) });
        j.a(new v0.a[] { S0.i.d });
        j.a(new v0.a[] { S0.i.e });
        j.a(new v0.a[] { S0.i.f });
        j.a(new v0.a[] { new h(applicationContext2) });
        j.a(new v0.a[] { new h(applicationContext2, 10, 11) });
        j.a(new v0.a[] { S0.i.g });
        j.h = false;
        j.i = true;
        final Context b = j.b;
        if (b != null) {
            final Executor d2 = j.d;
            if (d2 == null && j.e == null) {
                final p.a f = p.b.f;
                j.e = (Executor)f;
                j.d = (Executor)f;
            }
            else if (d2 != null && j.e == null) {
                j.e = d2;
            }
            else if (d2 == null) {
                final Executor e2 = j.e;
                if (e2 != null) {
                    j.d = e2;
                }
            }
            if (j.f == null) {
                j.f = (y0.a)new Object();
            }
            final y0.a f2 = j.f;
            final ArrayList c = j.c;
            final boolean g2 = j.g;
            final ActivityManager activityManager = (ActivityManager)b.getSystemService("activity");
            int n;
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                n = 3;
            }
            else {
                n = 2;
            }
            final Executor d3 = j.d;
            final Executor e3 = j.e;
            final boolean h = j.h;
            final boolean i = j.i;
            final String a2 = j.a;
            final u0.k l = j.j;
            final Object o2 = new Object();
            ((v)o2).c = f2;
            ((v)o2).d = b;
            ((v)o2).e = a2;
            ((v)o2).f = l;
            ((v)o2).g = d3;
            ((v)o2).h = e3;
            ((v)o2).a = h;
            ((v)o2).b = i;
            final String name = WorkDatabase.class.getPackage().getName();
            String s = WorkDatabase.class.getCanonicalName();
            if (!name.isEmpty()) {
                s = s.substring(name.length() + 1);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(s.replace('.', '_'));
            sb.append("_Impl");
            Object o3 = sb.toString();
            try {
                Object string;
                if (name.isEmpty()) {
                    string = o3;
                }
                else {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(name);
                    sb2.append(".");
                    sb2.append((String)o3);
                    string = sb2.toString();
                }
                final l m = (l)Class.forName((String)string).newInstance();
                o3 = m.e((v)o2);
                m.c = (y0.b)o3;
                if (o3 instanceof n) {
                    ((n)o3).getClass();
                }
                final boolean b2 = n == 3;
                ((y0.b)o3).setWriteAheadLoggingEnabled(b2);
                m.g = c;
                m.b = d3;
                new ArrayDeque();
                m.e = g2;
                m.f = b2;
                final WorkDatabase f3 = (WorkDatabase)m;
                o3 = applicationContext.getApplicationContext();
                final m e4 = new m(e.f, 0);
                synchronized (m.class) {
                    R0.m.E = e4;
                    monitorexit(m.class);
                    final String a3 = S0.d.a;
                    final V0.b b3 = new V0.b((Context)o3, this);
                    b1.g.a((Context)o3, (Class)SystemJobService.class, true);
                    R0.m.e().c(S0.d.a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                    final List list = Arrays.asList((Object[])new c[] { b3, new T0.b((Context)o3, e, g, this) });
                    o3 = new S0.b(applicationContext, e, g, f3, list);
                    applicationContext = applicationContext.getApplicationContext();
                    this.d = applicationContext;
                    this.e = e;
                    this.g = g;
                    this.f = f3;
                    this.h = list;
                    this.i = (S0.b)o3;
                    this.j = new C((Object)f3, 2);
                    this.k = false;
                    if (!applicationContext.isDeviceProtectedStorage()) {
                        this.g.m((Runnable)new e(applicationContext, this));
                        return;
                    }
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                }
            }
            catch (final InstantiationException ex) {
                final StringBuilder sb3 = new StringBuilder("Failed to create an instance of ");
                sb3.append(WorkDatabase.class.getCanonicalName());
                throw new RuntimeException(sb3.toString());
            }
            catch (final IllegalAccessException ex2) {
                final StringBuilder sb4 = new StringBuilder("Cannot access the constructor");
                sb4.append(WorkDatabase.class.getCanonicalName());
                throw new RuntimeException(sb4.toString());
            }
            catch (final ClassNotFoundException ex3) {
                final StringBuilder sb5 = new StringBuilder("cannot find implementation for ");
                sb5.append(WorkDatabase.class.getCanonicalName());
                sb5.append(". ");
                sb5.append((String)o3);
                sb5.append(" does not exist");
                throw new RuntimeException(sb5.toString());
            }
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }
    
    public static k u(final Context context) {
        final Object o = k.o;
        monitorenter(o);
        try {
            final Object o2;
            monitorenter(o2 = o);
            Label_0029: {
                try {
                    final k k = S0.k.m;
                    if (k != null) {
                        monitorexit(o2);
                        break Label_0029;
                    }
                    break Label_0029;
                }
                finally {
                    monitorexit(o2);
                    Label_0047: {
                        context.getApplicationContext();
                    }
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    final k k;
                    iftrue(Label_0047:)(k == null);
                    monitorexit(o2);
                    return k;
                    k = S0.k.n;
                    monitorexit(o2);
                }
            }
        }
        finally {}
    }
    
    public static void v(Context applicationContext, final b b) {
        final Object o;
        monitorenter(o = k.o);
        Label_0043: {
            try {
                final k m = k.m;
                if (m != null && k.n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                break Label_0043;
            }
            finally {
                monitorexit(o);
                final k m;
                iftrue(Label_0094:)(m != null);
                while (true) {
                    Block_6: {
                        break Block_6;
                        monitorexit(o);
                        return;
                    }
                    applicationContext = applicationContext.getApplicationContext();
                    iftrue(Label_0088:)(k.n != null);
                    k.n = new k(applicationContext, b, new c2.k(b.b));
                    Label_0088: {
                        k.m = k.n;
                    }
                    continue;
                }
            }
        }
    }
    
    public final void w() {
        final Object o;
        monitorenter(o = S0.k.o);
        Label_0038: {
            try {
                this.k = true;
                final BroadcastReceiver$PendingResult l = this.l;
                if (l != null) {
                    l.finish();
                    this.l = null;
                }
                break Label_0038;
            }
            finally {
                monitorexit(o);
                monitorexit(o);
            }
        }
    }
    
    public final void x() {
        final WorkDatabase f = this.f;
        final Context d = this.d;
        final String g = V0.b.G;
        final JobScheduler jobScheduler = (JobScheduler)d.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            final ArrayList c = V0.b.c(d, jobScheduler);
            if (c != null && !c.isEmpty()) {
                final Iterator iterator = c.iterator();
                while (iterator.hasNext()) {
                    V0.b.a(jobScheduler, ((JobInfo)iterator.next()).getId());
                }
            }
        }
        final z n = f.n();
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)n.a;
        ((l)workDatabase_Impl).b();
        final a1.e e = (a1.e)n.i;
        final f a = ((o)e).a();
        ((l)workDatabase_Impl).c();
        try {
            a.F.executeUpdateDelete();
            ((l)workDatabase_Impl).h();
            ((l)workDatabase_Impl).f();
            ((o)e).c(a);
            S0.d.a(this.e, f, this.h);
        }
        finally {
            ((l)workDatabase_Impl).f();
            ((o)e).c(a);
        }
    }
    
    public final void y(final String d, final w2.e f) {
        final c2.k g = this.g;
        final C2.v v = new C2.v(22);
        v.E = this;
        v.D = d;
        v.F = f;
        g.m((Runnable)v);
    }
    
    public final void z(final String s) {
        this.g.m((Runnable)new b1.j(this, s, false));
    }
}

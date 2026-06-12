package b1;

import C2.z;
import u0.o;
import L3.A;
import android.os.BaseBundle;
import android.database.Cursor;
import u0.l;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteAccessPermException;
import S0.j;
import java.util.List;
import X4.C;
import android.os.PersistableBundle;
import java.util.Iterator;
import a1.i;
import S0.d;
import K2.G0;
import android.app.ActivityManager;
import android.os.Build$VERSION;
import androidx.work.impl.WorkDatabase;
import z0.f;
import androidx.work.impl.WorkDatabase_Impl;
import android.text.TextUtils;
import android.app.job.JobInfo;
import java.util.HashSet;
import java.util.ArrayList;
import y0.c;
import android.app.job.JobScheduler;
import android.app.PendingIntent;
import android.content.ComponentName;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import android.content.Intent;
import K.b;
import android.app.AlarmManager;
import java.util.concurrent.TimeUnit;
import R0.m;
import S0.k;
import android.content.Context;

public final class e implements Runnable
{
    public static final String F;
    public static final long G;
    public final Context C;
    public final k D;
    public int E;
    
    static {
        F = m.h("ForceStopRunnable");
        G = TimeUnit.DAYS.toMillis(3650L);
    }
    
    public e(final Context context, final k d) {
        this.C = context.getApplicationContext();
        this.D = d;
        this.E = 0;
    }
    
    public static void c(final Context context) {
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n;
        if (b.b()) {
            n = 167772160;
        }
        else {
            n = 134217728;
        }
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class)ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, n);
        final long currentTimeMillis = System.currentTimeMillis();
        final long g = e.G;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis + g, broadcast);
        }
    }
    
    public final void a() {
        final String g = V0.b.G;
        final Context c = this.C;
        Object o = c.getSystemService("jobscheduler");
        Object o2 = V0.b.c(c, (JobScheduler)o);
        final c2.k k = this.D.f.k();
        k.getClass();
        final u0.m c2 = u0.m.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        Object o3 = k.D;
        ((l)o3).b();
        Object o4 = ((l)o3).g((c)c2);
        Label_1024: {
            try {
                o3 = new ArrayList(((Cursor)o4).getCount());
                while (((Cursor)o4).moveToNext()) {
                    ((ArrayList)o3).add((Object)((Cursor)o4).getString(0));
                }
            }
            finally {
                break Label_1024;
            }
            ((Cursor)o4).close();
            c2.h();
            int size;
            if (o2 != null) {
                size = ((ArrayList)o2).size();
            }
            else {
                size = 0;
            }
            o4 = new HashSet(size);
            Label_0284: {
                if (o2 == null || ((ArrayList)o2).isEmpty()) {
                    break Label_0284;
                }
                final Iterator iterator = ((ArrayList)o2).iterator();
            Label_0249_Outer:
                while (true) {
                    if (!iterator.hasNext()) {
                        break Label_0284;
                    }
                    o2 = iterator.next();
                    final PersistableBundle extras = ((JobInfo)o2).getExtras();
                    Object string;
                    Iterator iterator2;
                    final k i;
                    boolean b;
                    WorkDatabase f;
                    boolean empty;
                    boolean b2;
                    Long w;
                    C j;
                    int n;
                    PendingIntent broadcast;
                    List l;
                    final IllegalArgumentException ex;
                    WorkDatabase f2;
                    Label_0540_Outer:Label_0408_Outer:
                    while (true) {
                        if (extras == null) {
                            break Label_0249;
                        }
                        try {
                            if (((BaseBundle)extras).containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = ((BaseBundle)extras).getString("EXTRA_WORK_SPEC_ID");
                            }
                            else {
                                string = null;
                            }
                            if (!TextUtils.isEmpty((CharSequence)string)) {
                                ((HashSet)o4).add(string);
                                continue Label_0249_Outer;
                            }
                            V0.b.a((JobScheduler)o, ((JobInfo)o2).getId());
                            continue Label_0249_Outer;
                            iterator2 = ((ArrayList)o3).iterator();
                        Label_0421_Outer:
                            while (true) {
                                while (true) {
                                Label_1016_Outer:
                                    while (true) {
                                        while (true) {
                                            Label_0429: {
                                                while (true) {
                                                    Label_0291: {
                                                        break Label_0291;
                                                        ((Cursor)o4).close();
                                                        c2.h();
                                                        throw i;
                                                        Label_0340: {
                                                            b = false;
                                                        }
                                                        break Label_0342;
                                                    }
                                                    iftrue(Label_0340:)(!iterator2.hasNext());
                                                    Block_12: {
                                                        break Block_12;
                                                        iftrue(Label_0429:)(!b);
                                                        break Label_1016_Outer;
                                                        o = ((A)o3).D;
                                                        ((l)o).b();
                                                        o4 = ((A)o3).G;
                                                        o3 = ((o)o4).a();
                                                        ((l)o).c();
                                                        try {
                                                            ((f)o3).l();
                                                            ((l)o).h();
                                                            ((l)o).f();
                                                            ((o)o4).c((f)o3);
                                                            ((l)f).h();
                                                            ((l)f).f();
                                                            b2 = (!empty || b);
                                                            w = ((WorkDatabase)i.j.D).j().w("reschedule_needed");
                                                            o3 = e.F;
                                                            if (w != null && w == 1L) {
                                                                m.e().c((String)o3, "Rescheduling Workers.", new Throwable[0]);
                                                                i.x();
                                                                j = i.j;
                                                                j.getClass();
                                                                ((WorkDatabase)j.D).j().z(new a1.c("reschedule_needed", 0L));
                                                            }
                                                            else {
                                                                Label_0978: {
                                                                    Label_0958: {
                                                                        Label_0918: {
                                                                            Label_0905: {
                                                                                try {
                                                                                    if (K.b.b()) {
                                                                                        n = 570425344;
                                                                                    }
                                                                                    else {
                                                                                        n = 536870912;
                                                                                    }
                                                                                    o = new Intent();
                                                                                    ((Intent)o).setComponent(new ComponentName(c, (Class)ForceStopRunnable$BroadcastReceiver.class));
                                                                                    ((Intent)o).setAction("ACTION_FORCE_STOP_RESCHEDULE");
                                                                                    broadcast = PendingIntent.getBroadcast(c, -1, (Intent)o, n);
                                                                                    if (Build$VERSION.SDK_INT < 30) {
                                                                                        break Label_0905;
                                                                                    }
                                                                                    if (broadcast != null) {
                                                                                        broadcast.cancel();
                                                                                    }
                                                                                }
                                                                                catch (final IllegalArgumentException ex) {
                                                                                    break Label_0958;
                                                                                }
                                                                                catch (final SecurityException ex) {
                                                                                    break Label_0958;
                                                                                }
                                                                                l = G0.k((ActivityManager)c.getSystemService("activity"));
                                                                                if (l != null && !l.isEmpty()) {
                                                                                    for (int n2 = 0; n2 < l.size(); ++n2) {
                                                                                        if (G0.b(G0.d(l.get(n2))) == 10) {
                                                                                            break Label_0978;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break Label_0918;
                                                                            }
                                                                            if (broadcast == null) {
                                                                                c(c);
                                                                                break Label_0978;
                                                                            }
                                                                        }
                                                                        if (b2) {
                                                                            m.e().c((String)o3, "Found unfinished work, scheduling it.", new Throwable[0]);
                                                                            d.a(i.e, i.f, i.h);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    m.e().i((String)o3, "Ignoring exception", new Throwable[] { (Throwable)ex });
                                                                }
                                                                m.e().c((String)o3, "Application was force-stopped, rescheduling.", new Throwable[0]);
                                                                i.x();
                                                            }
                                                            return;
                                                        }
                                                        finally {
                                                            ((l)o).f();
                                                            ((o)o4).c((f)o3);
                                                        }
                                                        ((l)f).f();
                                                        ((l)f2).h();
                                                        ((l)f2).f();
                                                        break Label_0429;
                                                    }
                                                    iftrue(Label_0291:)(((HashSet)o4).contains((Object)iterator2.next()));
                                                    m.e().c(V0.b.G, "Reconciling jobs", new Throwable[0]);
                                                    b = true;
                                                    continue Label_0540_Outer;
                                                }
                                                ((l)f2).f();
                                            }
                                            f = i.f;
                                            o = f.n();
                                            o3 = f.m();
                                            ((l)f).c();
                                            try {
                                                o4 = ((z)o).d();
                                                empty = ((ArrayList)o4).isEmpty();
                                                if (!empty) {
                                                    o2 = ((ArrayList)o4).iterator();
                                                    while (((Iterator)o2).hasNext()) {
                                                        o4 = ((Iterator)o2).next();
                                                        ((z)o).q(1, new String[] { ((i)o4).a });
                                                        ((z)o).m(((i)o4).a, -1L);
                                                    }
                                                }
                                            }
                                            finally {
                                                continue Label_0408_Outer;
                                            }
                                            break;
                                        }
                                        continue Label_1016_Outer;
                                    }
                                    f2 = i.f;
                                    ((l)f2).c();
                                    try {
                                        o = f2.n();
                                        o3 = ((ArrayList)o3).iterator();
                                        while (((Iterator)o3).hasNext()) {
                                            ((z)o).m((String)((Iterator)o3).next(), -1L);
                                        }
                                    }
                                    finally {
                                        continue;
                                    }
                                    break;
                                }
                                continue Label_0421_Outer;
                            }
                        }
                        catch (final NullPointerException ex2) {
                            continue;
                        }
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public final boolean b() {
        final R0.b e = this.D.e;
        e.getClass();
        final boolean empty = TextUtils.isEmpty((CharSequence)null);
        final String f = b1.e.F;
        if (empty) {
            m.e().c(f, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        final boolean a = h.a(this.C, e);
        final m e2 = m.e();
        final StringBuilder sb = new StringBuilder("Is default app process = ");
        sb.append(a);
        e2.c(f, sb.toString(), new Throwable[0]);
        return a;
    }
    
    public final void run() {
        while (true) {
            Object f = e.F;
            final k d = this.D;
            while (true) {
                Label_0232: {
                    Throwable t;
                    try {
                        if (!this.b()) {
                            d.w();
                            return;
                        }
                        j.a(this.C);
                        m.e().c((String)f, "Performing cleanup operations.", new Throwable[0]);
                        final e e = this;
                        e.a();
                        final k k = d;
                        k.w();
                        return;
                    }
                    finally {
                        final SQLiteAccessPermException ex;
                        t = (Throwable)ex;
                        break Label_0232;
                    }
                    try {
                        final e e = this;
                        e.a();
                        final k k = d;
                        k.w();
                        return;
                    }
                    catch (final SQLiteAccessPermException t) {}
                    catch (final SQLiteConstraintException t) {}
                    catch (final SQLiteTableLockedException t) {}
                    catch (final SQLiteDatabaseLockedException t) {}
                    catch (final SQLiteDatabaseCorruptException t) {}
                    catch (final SQLiteCantOpenDatabaseException ex2) {}
                    final int e2 = this.E + 1;
                    this.E = e2;
                    Label_0185: {
                        if (e2 >= 3) {
                            break Label_0185;
                        }
                        final long n = e2;
                        final m e3 = m.e();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Retrying after ");
                        sb.append(n * 300L);
                        e3.c((String)f, sb.toString(), new Throwable[] { t });
                        final long n2 = this.E;
                        try {
                            Thread.sleep(n2 * 300L);
                            continue;
                            m.e().d((String)f, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", new Throwable[] { t });
                            f = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", t);
                            d.e.getClass();
                            throw f;
                            d.w();
                        }
                        catch (final InterruptedException t) {
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
}

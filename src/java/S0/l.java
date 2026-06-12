package S0;

import java.util.AbstractCollection;
import L3.A;
import R0.s;
import java.util.concurrent.ExecutorService;
import android.database.Cursor;
import K2.C;
import java.util.concurrent.Executor;
import C2.v;
import K2.N0;
import androidx.work.WorkerParameters;
import java.util.HashSet;
import b1.n;
import b1.o;
import java.util.UUID;
import R0.h;
import java.util.Collection;
import java.util.LinkedList;
import com.google.android.gms.internal.measurement.L;
import b1.g;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import z0.f;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import y0.c;
import m0.a;
import R0.m;
import V2.q;
import c1.j;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.K1;
import C2.z;
import androidx.work.impl.WorkDatabase;
import R0.b;
import c2.k;
import androidx.work.ListenableWorker;
import a1.i;
import w2.e;
import java.util.List;
import android.content.Context;

public final class l implements Runnable
{
    public static final String V;
    public Context C;
    public String D;
    public List E;
    public e F;
    public i G;
    public ListenableWorker H;
    public k I;
    public R0.l J;
    public b K;
    public S0.b L;
    public WorkDatabase M;
    public z N;
    public com.google.android.gms.internal.auth.l O;
    public K1 P;
    public ArrayList Q;
    public String R;
    public j S;
    public q T;
    public volatile boolean U;
    
    static {
        V = m.h("WorkerWrapper");
    }
    
    public final void a(R0.l m) {
        final boolean b = m instanceof R0.k;
        final String v = l.V;
        if (b) {
            m.e().g(v, a.f("Worker result SUCCESS for ", this.R), new Throwable[0]);
            if (this.G.c()) {
                this.d();
            }
            else {
                final com.google.android.gms.internal.auth.l o = this.O;
                final String d = this.D;
                final z n = this.N;
                m = (R0.l)this.M;
                ((u0.l)m).c();
                Label_0376: {
                    Label_0360: {
                        Object o2 = null;
                        Object g = null;
                        Label_0345: {
                            try {
                                n.q(3, new String[] { d });
                                n.o(d, ((R0.k)this.J).a);
                                final long currentTimeMillis = System.currentTimeMillis();
                                for (final String s : o.n(d)) {
                                    if (n.g(s) == 5) {
                                        o2 = u0.m.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                        if (s == null) {
                                            ((u0.m)o2).f(1);
                                        }
                                        else {
                                            ((u0.m)o2).g(1, s);
                                        }
                                        g = o.D;
                                        ((u0.l)g).b();
                                        g = ((u0.l)g).g((c)o2);
                                        int int1 = 0;
                                        Label_0250: {
                                            try {
                                                if (((Cursor)g).moveToFirst()) {
                                                    int1 = ((Cursor)g).getInt(0);
                                                    if (int1 != 0) {
                                                        int1 = 1;
                                                        break Label_0250;
                                                    }
                                                }
                                            }
                                            finally {
                                                break Label_0345;
                                            }
                                            int1 = 0;
                                        }
                                        ((Cursor)g).close();
                                        ((u0.m)o2).h();
                                        if (int1 == 0) {
                                            continue;
                                        }
                                        o2 = m.e();
                                        g = new StringBuilder();
                                        ((StringBuilder)g).append("Setting status to enqueued for ");
                                        ((StringBuilder)g).append(s);
                                        final String s2;
                                        ((m)o2).g(s2, ((StringBuilder)g).toString(), new Throwable[0]);
                                        n.q(1, new String[] { s });
                                        n.p(s, currentTimeMillis);
                                    }
                                }
                                break Label_0360;
                            }
                            finally {
                                break Label_0376;
                            }
                        }
                        ((Cursor)g).close();
                        ((u0.m)o2).h();
                        throw;
                    }
                    ((u0.l)m).h();
                    ((u0.l)m).f();
                    this.e(false);
                    return;
                }
                ((u0.l)m).f();
                this.e(false);
            }
        }
        else if (m instanceof R0.j) {
            m.e().g(v, a.f("Worker result RETRY for ", this.R), new Throwable[0]);
            this.c();
        }
        else {
            m.e().g(v, a.f("Worker result FAILURE for ", this.R), new Throwable[0]);
            if (this.G.c()) {
                this.d();
            }
            else {
                this.g();
            }
        }
    }
    
    public final void b() {
        final boolean h = this.h();
        final String d = this.D;
        final WorkDatabase m = this.M;
        Label_0200: {
            if (!h) {
                ((u0.l)m).c();
                Label_0138: {
                    int g;
                    Object o;
                    WorkDatabase_Impl workDatabase_Impl;
                    a1.e e;
                    try {
                        g = this.N.g(d);
                        o = m.m();
                        workDatabase_Impl = (WorkDatabase_Impl)((A)o).D;
                        ((u0.l)workDatabase_Impl).b();
                        e = (a1.e)((A)o).F;
                        o = ((u0.o)e).a();
                        if (d == null) {
                            ((z0.b)o).d(1);
                        }
                        else {
                            ((z0.b)o).f(1, d);
                        }
                        ((u0.l)workDatabase_Impl).c();
                        final z0.b b = (z0.b)o;
                        ((f)b).l();
                        final WorkDatabase_Impl workDatabase_Impl2 = workDatabase_Impl;
                        ((u0.l)workDatabase_Impl2).h();
                        final WorkDatabase_Impl workDatabase_Impl3 = workDatabase_Impl;
                        ((u0.l)workDatabase_Impl3).f();
                        final a1.e e2 = e;
                        final z0.b b2 = (z0.b)o;
                        ((u0.o)e2).c((f)b2);
                        final int n = g;
                        if (n == 0) {
                            final l l = this;
                            final boolean b3 = false;
                            l.e(b3);
                            break Label_0138;
                        }
                        break Label_0138;
                    }
                    finally {
                        break Label_0138;
                    }
                    try {
                        final z0.b b = (z0.b)o;
                        ((f)b).l();
                        final WorkDatabase_Impl workDatabase_Impl2 = workDatabase_Impl;
                        ((u0.l)workDatabase_Impl2).h();
                        final WorkDatabase_Impl workDatabase_Impl3 = workDatabase_Impl;
                        ((u0.l)workDatabase_Impl3).f();
                        final a1.e e2 = e;
                        final z0.b b2 = (z0.b)o;
                        ((u0.o)e2).c((f)b2);
                        final int n = g;
                        if (n == 0) {
                            final l l = this;
                            final boolean b3 = false;
                            l.e(b3);
                        }
                        else if (g == 2) {
                            this.a(this.J);
                        }
                        else if (!a.d(g)) {
                            this.c();
                        }
                        ((u0.l)m).h();
                        ((u0.l)m).f();
                        break Label_0200;
                    }
                    finally {
                        ((u0.l)workDatabase_Impl).f();
                        ((u0.o)e).c((f)o);
                    }
                }
                ((u0.l)m).f();
            }
        }
        final List e3 = this.E;
        if (e3 != null) {
            final Iterator iterator = e3.iterator();
            while (iterator.hasNext()) {
                ((S0.c)iterator.next()).b(d);
            }
            S0.d.a(this.K, m, e3);
        }
    }
    
    public final void c() {
        final String d = this.D;
        final z n = this.N;
        final WorkDatabase m = this.M;
        ((u0.l)m).c();
        try {
            n.q(1, new String[] { d });
            n.p(d, System.currentTimeMillis());
            n.m(d, -1L);
            ((u0.l)m).h();
        }
        finally {
            ((u0.l)m).f();
            this.e(true);
        }
    }
    
    public final void d() {
        final String d = this.D;
        final z n = this.N;
        final WorkDatabase m = this.M;
        ((u0.l)m).c();
        try {
            n.p(d, System.currentTimeMillis());
            n.q(1, new String[] { d });
            n.n(d);
            n.m(d, -1L);
            ((u0.l)m).h();
        }
        finally {
            ((u0.l)m).f();
            this.e(false);
        }
    }
    
    public final void e(final boolean b) {
        ((u0.l)this.M).c();
        Label_0275: {
            Object o = null;
            Label_0261: {
                try {
                    o = this.M.n();
                    ((z)o).getClass();
                    final u0.m c = u0.m.c(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                    o = ((z)o).a;
                    ((u0.l)o).b();
                    o = ((u0.l)o).g((c)c);
                    int int1 = 0;
                    Label_0088: {
                        try {
                            if (((Cursor)o).moveToFirst()) {
                                int1 = ((Cursor)o).getInt(0);
                                if (int1 != 0) {
                                    int1 = 1;
                                    break Label_0088;
                                }
                            }
                        }
                        finally {
                            break Label_0261;
                        }
                        int1 = 0;
                    }
                    ((Cursor)o).close();
                    c.h();
                    if (int1 == 0) {
                        g.a(this.C, (Class)RescheduleReceiver.class, false);
                    }
                }
                finally {
                    break Label_0275;
                }
                if (b) {
                    this.N.q(1, new String[] { this.D });
                    this.N.m(this.D, -1L);
                }
                if (this.G != null) {
                    final ListenableWorker h = this.H;
                    if (h != null && h.isRunInForeground()) {
                        final S0.b l = this.L;
                        final String d = this.D;
                        final Object m = l.M;
                        synchronized (m) {
                            l.H.remove((Object)d);
                            l.h();
                        }
                    }
                }
                ((u0.l)this.M).h();
                ((u0.l)this.M).f();
                this.S.k((Object)b);
                return;
            }
            ((Cursor)o).close();
            final u0.m i;
            i.h();
            throw;
        }
        ((u0.l)this.M).f();
    }
    
    public final void f() {
        final z n = this.N;
        final String d = this.D;
        final int g = n.g(d);
        final String v = l.V;
        if (g == 2) {
            m.e().c(v, a.g("Status for ", d, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            this.e(true);
        }
        else {
            final m e = m.e();
            final StringBuilder l = com.google.android.gms.internal.measurement.L.l("Status for ", d, " is ");
            l.append(a.p(g));
            l.append("; not doing any work");
            e.c(v, l.toString(), new Throwable[0]);
            this.e(false);
        }
    }
    
    public final void g() {
        final String d = this.D;
        final WorkDatabase m = this.M;
        ((u0.l)m).c();
        try {
            final LinkedList list = new LinkedList();
            list.add((Object)d);
            while (!((AbstractCollection)list).isEmpty()) {
                final String s = (String)list.remove();
                final z n = this.N;
                if (n.g(s) != 6) {
                    n.q(4, new String[] { s });
                }
                list.addAll((Collection)this.O.n(s));
            }
            this.N.o(d, ((R0.i)this.J).a);
            ((u0.l)m).h();
        }
        finally {
            ((u0.l)m).f();
            this.e(false);
        }
    }
    
    public final boolean h() {
        if (this.U) {
            m.e().c(l.V, a.f("Work interrupted for ", this.R), new Throwable[0]);
            final int g = this.N.g(this.D);
            if (g == 0) {
                this.e(false);
            }
            else {
                this.e(a.d(g) ^ true);
            }
            return true;
        }
        return false;
    }
    
    public final void run() {
        final K1 p = this.P;
        Object o = this.D;
        final ArrayList x = p.x((String)o);
        this.Q = x;
        final StringBuilder l = com.google.android.gms.internal.measurement.L.l("Work [ id=", (String)o, ", tags={ ");
        Object o2 = x.iterator();
        int n = 1;
        while (((Iterator)o2).hasNext()) {
            final String s = (String)((Iterator)o2).next();
            if (n != 0) {
                n = 0;
            }
            else {
                l.append(", ");
            }
            l.append(s);
        }
        l.append(" } ]");
        this.R = l.toString();
        Object n2 = this.N;
        if (!this.h()) {
            WorkDatabase m;
            while (true) {
                m = this.M;
                ((u0.l)m).c();
                Label_1296: {
                    while (true) {
                        try {
                            final i j = ((z)n2).j((String)o);
                            this.G = j;
                            o2 = S0.l.V;
                            if (j == null) {
                                final m e = R0.m.e();
                                n2 = new StringBuilder("Didn't find WorkSpec for id ");
                                ((StringBuilder)n2).append((String)o);
                                e.d((String)o2, ((StringBuilder)n2).toString(), new Throwable[0]);
                                this.e(false);
                                ((u0.l)m).h();
                                ((u0.l)m).f();
                                return;
                            }
                        }
                        finally {
                            break Label_1296;
                        }
                        final i i;
                        if (i.b != 1) {
                            this.f();
                            ((u0.l)m).h();
                            o = R0.m.e();
                            final String c = this.G.c;
                            n2 = new StringBuilder();
                            ((StringBuilder)n2).append(c);
                            ((StringBuilder)n2).append(" is not in ENQUEUED state. Nothing more to do.");
                            ((m)o).c((String)o2, ((StringBuilder)n2).toString(), new Throwable[0]);
                            continue;
                        }
                        if (!i.c()) {
                            final i g = this.G;
                            if (g.b != 1 || g.k <= 0) {
                                break;
                            }
                        }
                        final long currentTimeMillis = System.currentTimeMillis();
                        final i g2 = this.G;
                        if (g2.n == 0L) {
                            break;
                        }
                        if (currentTimeMillis < g2.a()) {
                            final m e2 = R0.m.e();
                            o = this.G.c;
                            n2 = new StringBuilder("Delaying execution for ");
                            ((StringBuilder)n2).append((String)o);
                            ((StringBuilder)n2).append(" because it is being executed before schedule.");
                            e2.c((String)o2, ((StringBuilder)n2).toString(), new Throwable[0]);
                            this.e(true);
                            ((u0.l)m).h();
                            continue;
                        }
                        break;
                    }
                    break;
                }
                ((u0.l)m).f();
            }
            ((u0.l)m).h();
            ((u0.l)m).f();
            final boolean c2 = this.G.c();
            final b k = this.K;
            R0.f b = null;
            Label_0780: {
                if (c2) {
                    b = this.G.e;
                }
                else {
                    final C d = k.d;
                    final String d2 = this.G.d;
                    d.getClass();
                    final String a = h.a;
                    h h;
                    try {
                        h = (h)Class.forName(d2).newInstance();
                    }
                    catch (final Exception ex) {
                        R0.m.e().d(R0.h.a, m0.a.f("Trouble instantiating + ", d2), (Throwable)ex);
                        h = null;
                    }
                    if (h == null) {
                        R0.m.e().d((String)o2, m0.a.f("Could not create Input Merger ", this.G.d), new Throwable[0]);
                        this.g();
                        return;
                    }
                    final ArrayList list = new ArrayList();
                    list.add((Object)this.G.e);
                    final u0.m c3 = u0.m.c(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    if (o == null) {
                        c3.f(1);
                    }
                    else {
                        c3.g(1, (String)o);
                    }
                    final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)((z)n2).a;
                    ((u0.l)workDatabase_Impl).b();
                    final Cursor g3 = ((u0.l)workDatabase_Impl).g((c)c3);
                    Label_1281: {
                        ArrayList list2;
                        try {
                            list2 = new ArrayList(g3.getCount());
                            while (g3.moveToNext()) {
                                list2.add((Object)R0.f.a(g3.getBlob(0)));
                            }
                        }
                        finally {
                            break Label_1281;
                        }
                        g3.close();
                        c3.h();
                        list.addAll((Collection)list2);
                        final h h2;
                        b = h2.a(list);
                        break Label_0780;
                    }
                    g3.close();
                    c3.h();
                }
            }
            final UUID fromString = UUID.fromString((String)o);
            final ArrayList q = this.Q;
            int k2 = this.G.k;
            final ExecutorService a2 = k.a;
            final k i2 = this.I;
            final o i3 = new o(m, i2);
            final n j2 = new n(m, this.L, i2);
            final Object o3 = new Object();
            ((WorkerParameters)o3).a = fromString;
            ((WorkerParameters)o3).b = b;
            ((WorkerParameters)o3).c = new HashSet((Collection)q);
            ((WorkerParameters)o3).d = this.F;
            ((WorkerParameters)o3).e = k2;
            ((WorkerParameters)o3).f = a2;
            ((WorkerParameters)o3).g = i2;
            final s c4 = k.c;
            ((WorkerParameters)o3).h = c4;
            ((WorkerParameters)o3).i = i3;
            ((WorkerParameters)o3).j = j2;
            if (this.H == null) {
                this.H = c4.a(this.C, this.G.c, (WorkerParameters)o3);
            }
            final ListenableWorker h3 = this.H;
            if (h3 == null) {
                R0.m.e().d((String)o2, a.f("Could not create Worker ", this.G.c), new Throwable[0]);
                this.g();
            }
            else if (h3.isUsed()) {
                R0.m.e().d((String)o2, a.g("Received an already-used Worker ", this.G.c, "; WorkerFactory should return new instances"), new Throwable[0]);
                this.g();
            }
            else {
                this.H.setUsed();
                ((u0.l)m).c();
                Label_1273: {
                    Label_1116: {
                        try {
                            final int g4 = ((z)n2).g((String)o);
                            k2 = 1;
                            if (g4 == 1) {
                                ((z)n2).q(2, new String[] { (String)o });
                                ((z)n2).k((String)o);
                                break Label_1116;
                            }
                        }
                        finally {
                            break Label_1273;
                        }
                        k2 = 0;
                    }
                    ((u0.l)m).h();
                    ((u0.l)m).f();
                    if (k2 == 0) {
                        this.f();
                        return;
                    }
                    if (this.h()) {
                        return;
                    }
                    final Object o4 = new Object();
                    final b1.m m2 = new b1.m(this.C, this.G, this.H, j2, this.I);
                    ((N0)i2.F).execute((Runnable)m2);
                    final j c5 = m2.C;
                    ((c1.h)c5).a((Runnable)new v((Object)this, (Object)c5, o4, 18, false), (Executor)i2.F);
                    ((c1.h)o4).a((Runnable)new v((Object)this, o4, this.R, 19), (Executor)i2.D);
                    return;
                }
                ((u0.l)m).f();
            }
        }
    }
}

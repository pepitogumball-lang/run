package b1;

import java.util.List;
import android.content.Context;
import R0.o;
import R0.r;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.auth.l;
import java.util.UUID;
import java.util.Iterator;
import android.database.Cursor;
import C2.z;
import a1.i;
import androidx.work.impl.WorkDatabase;
import S0.k;
import java.util.HashSet;
import a1.j;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import android.os.Build$VERSION;
import R0.n;
import androidx.work.impl.WorkDatabase_Impl;
import a1.h;
import u2.f;
import java.util.ArrayList;
import y0.c;
import android.text.TextUtils;
import m0.a;
import R0.m;
import com.google.android.gms.internal.measurement.K1;
import S0.e;

public final class d implements Runnable
{
    public static final String E;
    public final e C;
    public final K1 D;
    
    static {
        E = m.h("EnqueueRunnable");
    }
    
    public d(final e c) {
        this.C = c;
        this.D = new K1(17);
    }
    
    public static boolean a(final e e) {
        final HashSet r = e.R(e);
        boolean b = false;
        String[] array = (String[])r.toArray((Object[])new String[0]);
        final long currentTimeMillis = System.currentTimeMillis();
        final k i = e.i;
        final WorkDatabase f = i.f;
        final boolean b2 = array != null && array.length > 0;
        Label_1266: {
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            Label_0225: {
                if (!b2) {
                    n = 0;
                    n2 = 0;
                    n3 = 1;
                    break Label_0225;
                }
                final int length = array.length;
                int n4 = 0;
                int n6;
                int n5 = n6 = 0;
                int n7 = 1;
                while (true) {
                    n3 = n7;
                    n = n5;
                    n2 = n6;
                    if (n4 >= length) {
                        break Label_0225;
                    }
                    final String s = array[n4];
                    final i j = f.n().j(s);
                    if (j == null) {
                        m.e().d(d.E, a.g("Prerequisite ", s, " doesn't exist; not enqueuing"), new Throwable[0]);
                        break;
                    }
                    final int b3 = j.b;
                    n7 &= ((b3 == 3) ? 1 : 0);
                    int n8;
                    if (b3 == 4) {
                        n8 = 1;
                    }
                    else {
                        n8 = n6;
                        if (b3 == 6) {
                            n5 = 1;
                            n8 = n6;
                        }
                    }
                    ++n4;
                    n6 = n8;
                }
                break Label_1266;
            }
            final boolean empty = TextUtils.isEmpty((CharSequence)null);
            Label_0642: {
                String[] array2 = null;
                Label_0635: {
                    if (!empty && !b2) {
                        final z n9 = f.n();
                        n9.getClass();
                        final u0.m c = u0.m.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                        c.f(1);
                        Object o = n9.a;
                        ((u0.l)o).b();
                        final Cursor g = ((u0.l)o).g((c)c);
                        Label_0617: {
                            try {
                                final int f2 = I5.d.f(g, "id");
                                final int f3 = I5.d.f(g, "state");
                                o = new ArrayList(g.getCount());
                                while (g.moveToNext()) {
                                    final Object o2 = new Object();
                                    ((h)o2).a = g.getString(f2);
                                    ((h)o2).b = u2.f.t(g.getInt(f3));
                                    ((ArrayList)o).add(o2);
                                }
                            }
                            finally {
                                break Label_0617;
                            }
                            g.close();
                            c.h();
                            array2 = array;
                            if (!((ArrayList)o).isEmpty()) {
                                final Iterator iterator = ((ArrayList)o).iterator();
                                while (iterator.hasNext()) {
                                    final int b4 = ((h)iterator.next()).b;
                                    if (b4 == 1 || b4 == 2) {
                                        b = false;
                                        break Label_1266;
                                    }
                                }
                                new b(i, 1).run();
                                final z n10 = f.n();
                                final Iterator iterator2 = ((ArrayList)o).iterator();
                                while (iterator2.hasNext()) {
                                    final String a = ((h)iterator2.next()).a;
                                    final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)n10.a;
                                    ((u0.l)workDatabase_Impl).b();
                                    final a1.e e2 = (a1.e)n10.c;
                                    final z0.f a2 = e2.a();
                                    if (a == null) {
                                        ((z0.b)a2).d(1);
                                    }
                                    else {
                                        ((z0.b)a2).f(1, a);
                                    }
                                    ((u0.l)workDatabase_Impl).c();
                                    try {
                                        a2.l();
                                        ((u0.l)workDatabase_Impl).h();
                                        continue;
                                    }
                                    finally {
                                        ((u0.l)workDatabase_Impl).f();
                                        e2.c(a2);
                                    }
                                    break;
                                }
                                b = true;
                                break Label_0642;
                            }
                            break Label_0635;
                        }
                        g.close();
                        c.h();
                    }
                    else {
                        array2 = array;
                    }
                }
                b = false;
                array = array2;
            }
            final Iterator iterator3 = e.j.iterator();
            final String[] array3 = array;
            final Iterator iterator4 = iterator3;
            while (iterator4.hasNext()) {
                final n n11 = (n)iterator4.next();
                final i b5 = n11.b;
                if (b2 && n3 == 0) {
                    if (n2 != 0) {
                        b5.b = 4;
                    }
                    else if (n != 0) {
                        b5.b = 6;
                    }
                    else {
                        b5.b = 5;
                    }
                }
                else if (!b5.c()) {
                    b5.n = currentTimeMillis;
                }
                else {
                    b5.n = 0L;
                }
                if (Build$VERSION.SDK_INT <= 25) {
                    final R0.c k = b5.j;
                    final String c2 = b5.c;
                    if (!c2.equals((Object)ConstraintTrackingWorker.class.getName()) && (k.d || k.e)) {
                        final w4.f f4 = new w4.f(1);
                        f4.a(b5.e.a);
                        f4.a.put((Object)"androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", (Object)c2);
                        b5.c = ConstraintTrackingWorker.class.getName();
                        final R0.f e3 = new R0.f(f4.a);
                        R0.f.c(e3);
                        b5.e = e3;
                    }
                }
                if (b5.b == 1) {
                    b = true;
                }
                final z n12 = f.n();
                Object o3 = n12.a;
                ((u0.l)o3).b();
                ((u0.l)o3).c();
                try {
                    ((a1.b)n12.b).e(b5);
                    ((u0.l)o3).h();
                    ((u0.l)o3).f();
                    final UUID a3 = n11.a;
                    if (b2) {
                        final int length2 = array3.length;
                        int l = 0;
                        while (l < length2) {
                            o3 = array3[l];
                            final a1.a a4 = new a1.a(a3.toString(), (String)o3);
                            final l m = f.i();
                            o3 = m.D;
                            ((u0.l)o3).b();
                            ((u0.l)o3).c();
                            try {
                                ((a1.b)m.E).e(a4);
                                ((u0.l)o3).h();
                                ((u0.l)o3).f();
                                ++l;
                                continue;
                            }
                            finally {
                                ((u0.l)o3).f();
                            }
                            break;
                        }
                    }
                    for (final String s2 : n11.c) {
                        o3 = f.o();
                        final j j2 = new j(s2, a3.toString());
                        final WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl)((K1)o3).D;
                        ((u0.l)workDatabase_Impl2).b();
                        ((u0.l)workDatabase_Impl2).c();
                        try {
                            ((a1.b)((K1)o3).E).e(j2);
                            ((u0.l)workDatabase_Impl2).h();
                            continue;
                        }
                        finally {
                            ((u0.l)workDatabase_Impl2).f();
                        }
                        break;
                    }
                    if (empty) {
                        continue;
                    }
                    o3 = f.l();
                    final a1.f f5 = new a1.f(a3.toString());
                    final WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl)((l)o3).D;
                    ((u0.l)workDatabase_Impl3).b();
                    ((u0.l)workDatabase_Impl3).c();
                    try {
                        ((a1.b)((l)o3).E).e(f5);
                        ((u0.l)workDatabase_Impl3).h();
                    }
                    finally {
                        ((u0.l)workDatabase_Impl3).f();
                    }
                    continue;
                }
                finally {
                    ((u0.l)o3).f();
                }
                break;
            }
        }
        e.m = true;
        return b;
    }
    
    public final void run() {
        final K1 d = this.D;
        final e c = this.C;
        final Throwable t;
        Label_0170: {
            Label_0105: {
                Object f;
                k i;
                try {
                    f = new HashSet();
                    if (e.Q(c, (HashSet)f)) {
                        break Label_0105;
                    }
                    i = c.i;
                    f = i.f;
                    ((u0.l)f).c();
                    final e e = c;
                    final boolean b = a(e);
                    final HashSet set = (HashSet)f;
                    ((u0.l)set).h();
                    final HashSet set2 = (HashSet)f;
                    ((u0.l)set2).f();
                    final boolean b2 = b;
                    if (b2) {
                        final k k = i;
                        final Context context = k.d;
                        final Class<RescheduleReceiver> clazz = RescheduleReceiver.class;
                        final boolean b3 = true;
                        g.a(context, clazz, b3);
                        final k j = i;
                        final R0.b b4 = j.e;
                        final k l = i;
                        final WorkDatabase workDatabase = l.f;
                        final k m = i;
                        final List list = m.h;
                        S0.d.a(b4, workDatabase, list);
                        break Label_0105;
                    }
                    break Label_0105;
                }
                finally {
                    break Label_0170;
                }
                try {
                    final e e = c;
                    final boolean b = a(e);
                    final HashSet set = (HashSet)f;
                    ((u0.l)set).h();
                    final HashSet set2 = (HashSet)f;
                    ((u0.l)set2).f();
                    final boolean b2 = b;
                    if (b2) {
                        final k k = i;
                        final Context context = k.d;
                        final Class<RescheduleReceiver> clazz = RescheduleReceiver.class;
                        final boolean b3 = true;
                        g.a(context, clazz, b3);
                        final k j = i;
                        final R0.b b4 = j.e;
                        final k l = i;
                        final WorkDatabase workDatabase = l.f;
                        final k m = i;
                        final List list = m.h;
                        S0.d.a(b4, workDatabase, list);
                    }
                    d.B((com.google.android.gms.internal.auth.m)r.d);
                    return;
                }
                finally {
                    ((u0.l)f).f();
                }
            }
            final StringBuilder sb = new StringBuilder("WorkContinuation has cycles (");
            sb.append((Object)t);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        d.B((com.google.android.gms.internal.auth.m)new o(t));
    }
}

package g2;

import java.util.Set;
import java.util.concurrent.locks.Lock;
import android.view.Menu;
import j.u;
import android.animation.ValueAnimator;
import java.util.Iterator;
import t0.q;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import h1.E;
import h1.p;
import android.view.View;
import n.l;
import j.G;
import E4.j;
import o.r0;
import androidx.appcompat.widget.Toolbar;
import m0.a;
import java.util.Collection;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Map$Entry;
import q.b;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.content.Context;
import w2.e;
import android.database.Cursor;
import y0.c;
import F1.c0;
import u0.f;
import java.util.HashSet;
import java.util.Objects;
import com.google.android.gms.common.api.internal.zacm;

public final class n implements Runnable
{
    public final int C;
    public final Object D;
    
    public n(final zacm d) {
        this.C = 1;
        Objects.requireNonNull((Object)d);
        this.D = d;
    }
    
    public HashSet a() {
        final HashSet set = new HashSet();
        final Cursor g = ((u0.l)((f)this.D).c).g((c)new c0("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 2));
        Label_0091: {
            try {
                while (g.moveToNext()) {
                    set.add((Object)g.getInt(0));
                }
            }
            finally {
                break Label_0091;
            }
            g.close();
            final HashSet set2;
            if (!set2.isEmpty()) {
                ((f)this.D).f.l();
            }
            return set2;
        }
        g.close();
    }
    
    public final void run() {
        switch (this.C) {
            default: {
                final e e = (e)this.D;
                final long long1 = w2.e.R((Context)e.D).getLong("app_set_id_last_used_time", -1L);
                long n;
                if (long1 != -1L) {
                    n = long1 + 33696000000L;
                }
                else {
                    n = -1L;
                }
                if (n != -1L && System.currentTimeMillis() > n) {
                    final Context context = (Context)e.D;
                    if (!w2.e.R(context).edit().remove("app_set_id").commit()) {
                        final String value = String.valueOf((Object)context.getPackageName());
                        String concat;
                        if (value.length() != 0) {
                            concat = "Failed to clear app set ID generated for App ".concat(value);
                        }
                        else {
                            concat = new String("Failed to clear app set ID generated for App ");
                        }
                        Log.e("AppSet", concat);
                    }
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        final String value2 = String.valueOf((Object)context.getPackageName());
                        String concat2;
                        if (value2.length() != 0) {
                            concat2 = "Failed to clear app set ID last used time for App ".concat(value2);
                        }
                        else {
                            concat2 = new String("Failed to clear app set ID last used time for App ");
                        }
                        Log.e("AppSet", concat2);
                    }
                }
                return;
            }
            case 10: {
                final ReentrantReadWriteLock$ReadLock lock = ((u0.l)((f)this.D).c).h.readLock();
                Object a = null;
            Label_0670:
                while (true) {
                    final SQLiteException ex3;
                    Label_0558: {
                        Label_0542: {
                            while (true) {
                                try {
                                    z0.b e2;
                                    try {
                                        ((Lock)lock).lock();
                                        if (((f)this.D).a()) {
                                            if (((f)this.D).d.compareAndSet(true, false)) {
                                                if (!((SQLiteDatabase)((u0.l)((f)this.D).c).c.e().D).inTransaction()) {
                                                    final WorkDatabase_Impl c = ((f)this.D).c;
                                                    if (((u0.l)c).f) {
                                                        e2 = ((u0.l)c).c.e();
                                                        e2.a();
                                                        final n n2 = this;
                                                        final HashSet set = n2.a();
                                                        final z0.b b = e2;
                                                        b.k();
                                                        final z0.b b2 = e2;
                                                        b2.g();
                                                        break Label_0548;
                                                    }
                                                    break Label_0542;
                                                }
                                            }
                                        }
                                        ((Lock)lock).unlock();
                                        return;
                                    }
                                    finally {
                                        break Label_0670;
                                    }
                                    try {
                                        final n n2 = this;
                                        final HashSet set = n2.a();
                                        try {
                                            final z0.b b = e2;
                                            b.k();
                                            try {
                                                final z0.b b2 = e2;
                                                b2.g();
                                            }
                                            catch (final SQLiteException ex) {}
                                            catch (final IllegalStateException ex2) {}
                                        }
                                        finally {}
                                    }
                                    finally {
                                        a = null;
                                    }
                                    e2.g();
                                    throw ex3;
                                    a = null;
                                    break Label_0558;
                                }
                                catch (final SQLiteException ex3) {
                                    continue;
                                }
                                catch (final IllegalStateException ex3) {
                                    continue;
                                }
                                break;
                            }
                        }
                        a = this.a();
                        ((Lock)lock).unlock();
                        if (a != null && !((Set)a).isEmpty()) {
                            final q.f h;
                            monitorenter(h = ((f)this.D).h);
                            Label_0641: {
                                try {
                                    final b b3 = (b)((f)this.D).h.iterator();
                                    if (b3.hasNext()) {
                                        break Label_0641;
                                    }
                                    monitorexit(h);
                                }
                                finally {
                                    monitorexit(h);
                                    final b b3;
                                    ((Map$Entry)b3.next()).getValue().getClass();
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex3);
                    continue;
                }
                ((Lock)lock).unlock();
                throw a;
            }
            case 9: {
                ((StaggeredGridLayoutManager)this.D).J();
                return;
            }
            case 8: {
                final q i0 = ((RecyclerView)this.D).i0;
                if (i0 != null) {
                    final t0.b b4 = (t0.b)i0;
                    final ArrayList e3 = b4.e;
                    final boolean empty = e3.isEmpty();
                    final ArrayList g = b4.g;
                    final boolean empty2 = g.isEmpty();
                    final ArrayList h2 = b4.h;
                    final boolean empty3 = h2.isEmpty();
                    final ArrayList f = b4.f;
                    final boolean empty4 = f.isEmpty();
                    if (!empty || !empty2 || !empty4 || !empty3) {
                        final Iterator iterator = e3.iterator();
                        if (iterator.hasNext()) {
                            iterator.next().getClass();
                            throw new ClassCastException();
                        }
                        e3.clear();
                        if (!empty2) {
                            final ArrayList list = new ArrayList();
                            list.addAll((Collection)g);
                            final ArrayList j = b4.j;
                            j.add((Object)list);
                            g.clear();
                            if (!empty) {
                                a.m(list.get(0));
                                throw null;
                            }
                            final Iterator iterator2 = list.iterator();
                            if (iterator2.hasNext()) {
                                a.m(iterator2.next());
                                throw null;
                            }
                            list.clear();
                            j.remove((Object)list);
                        }
                        if (!empty3) {
                            final ArrayList list2 = new ArrayList();
                            list2.addAll((Collection)h2);
                            final ArrayList k = b4.k;
                            k.add((Object)list2);
                            h2.clear();
                            if (!empty) {
                                a.m(list2.get(0));
                                throw null;
                            }
                            final Iterator iterator3 = list2.iterator();
                            if (iterator3.hasNext()) {
                                a.m(iterator3.next());
                                throw null;
                            }
                            list2.clear();
                            k.remove((Object)list2);
                        }
                        if (!empty4) {
                            final ArrayList list3 = new ArrayList();
                            list3.addAll((Collection)f);
                            final ArrayList l = b4.i;
                            l.add((Object)list3);
                            f.clear();
                            if (!empty || !empty2 || !empty3) {
                                long d = 0L;
                                long c2;
                                if (!empty2) {
                                    c2 = ((q)b4).c;
                                }
                                else {
                                    c2 = 0L;
                                }
                                if (!empty3) {
                                    d = ((q)b4).d;
                                }
                                Math.max(c2, d);
                                list3.get(0).getClass();
                                throw new ClassCastException();
                            }
                            final Iterator iterator4 = list3.iterator();
                            if (iterator4.hasNext()) {
                                iterator4.next().getClass();
                                throw new ClassCastException();
                            }
                            list3.clear();
                            l.remove((Object)list3);
                        }
                    }
                }
                return;
            }
            case 7: {
                final t0.f f2 = (t0.f)this.D;
                final int v = f2.v;
                final ValueAnimator u = f2.u;
                if (v != 1) {
                    if (v != 2) {
                        return;
                    }
                }
                else {
                    u.cancel();
                }
                f2.v = 3;
                u.setFloatValues(new float[] { (float)u.getAnimatedValue(), 0.0f });
                u.setDuration((long)500);
                u.start();
                return;
            }
            case 6: {
                ((Toolbar)this.D).v();
                return;
            }
            case 5: {
                final r0 r0 = (r0)this.D;
                r0.N = null;
                r0.drawableStateChanged();
                return;
            }
            case 4: {
                ((j)((j)this.D).b).notImplemented();
                return;
            }
            case 3: {
                final G g2 = (G)this.D;
                final u b5 = g2.b;
                final Menu v2 = g2.v();
                l m;
                if (v2 instanceof l) {
                    m = (l)v2;
                }
                else {
                    m = null;
                }
                if (m != null) {
                    m.w();
                }
                Label_1434: {
                    try {
                        v2.clear();
                        if (b5.onCreatePanelMenu(0, v2) && b5.onPreparePanel(0, (View)null, v2)) {
                            break Label_1434;
                        }
                        break Label_1434;
                    }
                    finally {
                        if (m != null) {
                            m.v();
                        }
                        Label_1451: {
                            return;
                        }
                        v2.clear();
                        break Label_1434;
                        while (true) {
                            m.v();
                            return;
                            iftrue(Label_1451:)(m == null);
                            continue;
                        }
                    }
                }
            }
            case 2: {
                final p p = (p)this.D;
                final h1.b d2 = p.D;
                d2.t(0);
                final h1.f l2 = E.l;
                d2.H(24, 6, l2);
                p.a(l2);
                return;
            }
            case 1: {
                ((zacm)this.D).I.b(new e2.b(4));
                return;
            }
            case 0: {
                final o o = (o)((X.a)this.D).D;
                o.D.a(o.D.getClass().getName().concat(" disconnecting because it was signed out."));
            }
        }
    }
}

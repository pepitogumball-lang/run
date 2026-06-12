package b4;

import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import c4.p;
import com.google.android.gms.internal.measurement.L;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.google.android.gms.internal.ads.Rc;
import c4.j;
import c4.i;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n3.u0;
import G0.k;
import android.app.Application;
import E3.b;
import Y2.c;
import F3.e;
import X2.f;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import java.util.HashMap;
import java.util.Random;
import e4.a;

public final class m implements a
{
    public static final Random j;
    public static final HashMap k;
    public final HashMap a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final f d;
    public final e e;
    public final c f;
    public final b g;
    public final String h;
    public final HashMap i;
    
    static {
        j = new Random();
        k = new HashMap();
    }
    
    public m(final Context b, final ScheduledExecutorService c, final f d, final e e, final c f, final b g) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        d.a();
        this.h = d.c.b;
        final AtomicReference a = l.a;
        final Application application = (Application)b.getApplicationContext();
        final AtomicReference a2 = l.a;
        Label_0138: {
            if (a2.get() == null) {
                final Object o = new Object();
                while (!a2.compareAndSet((Object)null, o)) {
                    if (a2.get() != null) {
                        break Label_0138;
                    }
                }
                g2.c.b(application);
                g2.c.G.a((g2.b)o);
            }
        }
        u0.f((Executor)c, (Callable)new k((Object)this, 3));
    }
    
    public final d a(final f f, final String s, final e e, c c, final Executor executor, final c4.c c2, final c4.c c3, final c4.c c4, final i i, final j j, final c4.l l, final Rc rc) {
        m m = this;
        monitorenter(this);
        while (true) {
            d d;
            Context b;
            try {
                if (!this.a.containsKey((Object)s)) {
                    d = new(b4.d.class)();
                    Label_0052: {
                        if (s.equals((Object)"firebase")) {
                            f.a();
                            if (f.b.equals((Object)"[DEFAULT]")) {
                                break Label_0052;
                            }
                        }
                        c = null;
                    }
                    b = this.b;
                    m = this;
                    monitorenter(this);
                    final w2.e e2 = new(w2.e.class)();
                    final w2.e e4;
                    final w2.e e3 = e4 = e2;
                    final f f2 = f;
                    final e e5 = e;
                    final i k = i;
                    final c4.c c5 = c3;
                    final Context context = b;
                    final String s2 = s;
                    final c4.l l2 = l;
                    final m m2 = this;
                    final ScheduledExecutorService scheduledExecutorService = m2.c;
                    new w2.e(f2, e5, k, c5, context, s2, l2, scheduledExecutorService);
                    final m m3 = m;
                    monitorexit(m3);
                    final d d2 = d;
                    final e e6 = e;
                    final c c6 = c;
                    final Executor executor2 = executor;
                    final c4.c c7 = c2;
                    final c4.c c8 = c3;
                    final c4.c c9 = c4;
                    final i i2 = i;
                    final j j2 = j;
                    final c4.l l3 = l;
                    final w2.e e7 = e3;
                    final Rc rc2 = rc;
                    new d(e6, c6, executor2, c7, c8, c9, i2, j2, l3, e7, rc2);
                    final c4.c c10 = c3;
                    c10.b();
                    final c4.c c11 = c4;
                    c11.b();
                    final c4.c c12 = c2;
                    c12.b();
                    final m m4 = this;
                    final HashMap hashMap = m4.a;
                    final String s3 = s;
                    final d d3 = d;
                    hashMap.put((Object)s3, (Object)d3);
                    final HashMap hashMap2 = b4.m.k;
                    final String s4 = s;
                    final d d4 = d;
                    hashMap2.put((Object)s4, (Object)d4);
                    return (d)this.a.get((Object)s);
                }
                return (d)this.a.get((Object)s);
            }
            finally {
                monitorexit(m);
                return (d)this.a.get((Object)s);
            }
            try {
                final w2.e e2 = new(w2.e.class)();
                final w2.e e4;
                final w2.e e3 = e4 = e2;
                final f f2 = f;
                final e e5 = e;
                final i k = i;
                final c4.c c5 = c3;
                final Context context = b;
                final String s2 = s;
                final c4.l l2 = l;
                final m m2 = this;
                final ScheduledExecutorService scheduledExecutorService = m2.c;
                new w2.e(f2, e5, k, c5, context, s2, l2, scheduledExecutorService);
                final m m3 = m;
                monitorexit(m3);
                final d d2 = d;
                final e e6 = e;
                final c c6 = c;
                final Executor executor2 = executor;
                final c4.c c7 = c2;
                final c4.c c8 = c3;
                final c4.c c9 = c4;
                final i i2 = i;
                final j j2 = j;
                final c4.l l3 = l;
                final w2.e e7 = e3;
                final Rc rc2 = rc;
                new d(e6, c6, executor2, c7, c8, c9, i2, j2, l3, e7, rc2);
                final c4.c c10 = c3;
                c10.b();
                final c4.c c11 = c4;
                c11.b();
                final c4.c c12 = c2;
                c12.b();
                final m m4 = this;
                final HashMap hashMap = m4.a;
                final String s3 = s;
                final d d3 = d;
                hashMap.put((Object)s3, (Object)d3);
                final HashMap hashMap2 = b4.m.k;
                final String s4 = s;
                final d d4 = d;
                hashMap2.put((Object)s4, (Object)d4);
                continue;
            }
            finally {}
            break;
        }
    }
    
    public final d b(final String s) {
        monitorenter(this);
        Label_0228: {
            try {
                final c4.c c = this.c(s, "fetch");
                final c4.c c2 = this.c(s, "activate");
                final c4.c c3 = this.c(s, "defaults");
                final Context b = this.b;
                Object h = this.h;
                Object o = new StringBuilder("frc_");
                ((StringBuilder)o).append((String)h);
                ((StringBuilder)o).append("_");
                ((StringBuilder)o).append(s);
                ((StringBuilder)o).append("_settings");
                o = new c4.l(b.getSharedPreferences(((StringBuilder)o).toString(), 0));
                h = new j((Executor)this.c, c2, c3);
                final f d = this.d;
                final b g = this.g;
                d.a();
                com.google.android.gms.internal.auth.l l;
                if (d.b.equals((Object)"[DEFAULT]") && s.equals((Object)"firebase")) {
                    l = new com.google.android.gms.internal.auth.l(g);
                }
                else {
                    l = null;
                }
                if (l == null) {
                    break Label_0228;
                }
                final b4.k k = new b4.k(l);
                final HashSet a = ((j)h).a;
                synchronized (a) {
                    ((j)h).a.add((Object)k);
                }
            }
            finally {
                monitorexit(this);
                final com.google.android.gms.internal.auth.l e = new com.google.android.gms.internal.auth.l(25, false);
                final c4.c c2;
                e.D = c2;
                final c4.c c3;
                e.E = c3;
                final Rc rc = new Rc(17, false);
                rc.G = Collections.newSetFromMap((Map)new ConcurrentHashMap());
                rc.D = c2;
                rc.E = e;
                final ScheduledExecutorService c4 = this.c;
                rc.F = c4;
                final c4.c c;
                final Object h;
                final Object o;
                final d a2 = this.a(this.d, s, this.e, this.f, (Executor)c4, c, c2, c3, this.d(s, c, (c4.l)o), (j)h, (c4.l)o, rc);
                monitorexit(this);
                return a2;
            }
        }
    }
    
    public final c4.c c(final String s, String b) {
        b = x.a.b(L.m("frc_", this.h, "_", s, "_"), b, ".json");
        final ScheduledExecutorService c = this.c;
        final Context b2 = this.b;
        final HashMap c2 = p.c;
        final Class<p> clazz;
        monitorenter(clazz = p.class);
        Label_0086: {
            try {
                final HashMap c3 = p.c;
                if (!c3.containsKey((Object)b)) {
                    c3.put((Object)b, (Object)new p(b2, b));
                }
                break Label_0086;
            }
            finally {
                monitorexit(clazz);
                final HashMap c3;
                final p p2 = (p)c3.get((Object)b);
                monitorexit(clazz);
                final HashMap d = c4.c.d;
                final Class<c4.c> clazz2;
                monitorenter(clazz2 = c4.c.class);
                Label_0156: {
                    try {
                        final String b3 = p2.b;
                        final HashMap d2 = c4.c.d;
                        if (!d2.containsKey((Object)b3)) {
                            d2.put((Object)b3, (Object)new c4.c((Executor)c, p2));
                        }
                        break Label_0156;
                    }
                    finally {
                        monitorexit(clazz2);
                        final String b3;
                        final HashMap d2;
                        final c4.c c4 = (c4.c)d2.get((Object)b3);
                        monitorexit(clazz2);
                        return c4;
                    }
                }
            }
        }
    }
    
    public final i d(final String s, final c4.c c, final c4.l l) {
        monitorenter(this);
        while (true) {
            Label_0048: {
                try {
                    final e e = this.e;
                    final f d = this.d;
                    d.a();
                    if (d.b.equals((Object)"[DEFAULT]")) {
                        final Object g = this.g;
                        break Label_0048;
                    }
                    break Label_0048;
                }
                finally {
                    monitorexit(this);
                    final ScheduledExecutorService c2 = this.c;
                    final Random j = m.j;
                    final f d2 = this.d;
                    d2.a();
                    final String a = d2.c.a;
                    final f d3 = this.d;
                    d3.a();
                    final e e;
                    final Object g;
                    final i i = new i(e, (b)g, (Executor)c2, j, c, new ConfigFetchHttpClient(this.b, d3.c.b, a, s, l.a.getLong("fetch_timeout_in_seconds", 60L), l.a.getLong("fetch_timeout_in_seconds", 60L)), l, this.i);
                    monitorexit(this);
                    return i;
                    g = new L3.m(4);
                    continue;
                }
            }
            break;
        }
    }
}

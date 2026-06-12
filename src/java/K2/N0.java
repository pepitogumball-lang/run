package K2;

import com.google.android.gms.internal.measurement.u2;
import android.os.BaseBundle;
import android.text.TextUtils;
import android.os.SystemClock;
import h2.A;
import android.os.Bundle;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import C.u;
import com.google.android.gms.internal.measurement.H1;
import java.io.Serializable;
import T2.e;
import android.database.ContentObserver;
import com.google.android.gms.internal.auth.f;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.G1;
import com.google.android.gms.internal.measurement.P1;
import java.util.concurrent.atomic.AtomicInteger;
import q2.a;
import R3.b;
import android.content.Context;

public final class n0 implements w0
{
    public static volatile n0 k0;
    public final Context C;
    public final String D;
    public final String E;
    public final String F;
    public final boolean G;
    public final b H;
    public final d I;
    public final a0 J;
    public final P K;
    public final k0 L;
    public final l1 M;
    public final J1 N;
    public final L O;
    public final a P;
    public final X0 Q;
    public final H0 R;
    public final p S;
    public final V0 T;
    public final String U;
    public J V;
    public b1 W;
    public o X;
    public K Y;
    public boolean Z;
    public Boolean a0;
    public long b0;
    public volatile Boolean c0;
    public final Boolean d0;
    public final Boolean e0;
    public volatile boolean f0;
    public int g0;
    public int h0;
    public final AtomicInteger i0;
    public final long j0;
    
    public n0(final E0 e0) {
        final boolean b = false;
        this.Z = false;
        this.i0 = new AtomicInteger(0);
        final Context a = e0.a;
        final b b2 = new b(8);
        this.H = b2;
        C0.k = b2;
        this.C = a;
        this.D = e0.b;
        this.E = e0.c;
        this.F = e0.d;
        this.G = e0.h;
        this.c0 = e0.e;
        this.U = e0.j;
        this.f0 = true;
        Object c = e0.g;
        if (c != null) {
            final Bundle i = ((com.google.android.gms.internal.measurement.Z)c).I;
            if (i != null) {
                final Object value = ((BaseBundle)i).get("measurementEnabled");
                if (value instanceof Boolean) {
                    this.d0 = (Boolean)value;
                }
                c = ((BaseBundle)((com.google.android.gms.internal.measurement.Z)c).I).get("measurementDeactivated");
                if (c instanceof Boolean) {
                    this.e0 = (Boolean)c;
                }
            }
        }
        if (P1.h == null) {
            if (a != null) {
                final Object g = P1.g;
                Object o;
                monitorenter(o = g);
                Label_0453: {
                    try {
                        if (P1.h != null) {
                            break Label_0453;
                        }
                        monitorenter(o = g);
                        Label_0361: {
                            try {
                                final H1 h = P1.h;
                                if ((c = a.getApplicationContext()) == null) {
                                    c = a;
                                }
                                if (h != null && h.a == c) {
                                    break Label_0361;
                                }
                                if (h == null) {
                                    break Label_0361;
                                }
                                G1.c();
                                Q1.a();
                                final Class<K1> clazz;
                                monitorenter(clazz = K1.class);
                                Label_0342: {
                                    try {
                                        final K1 f = K1.F;
                                        if (f == null) {
                                            break Label_0342;
                                        }
                                        final Context context = (Context)f.D;
                                        if (context != null && f.E != null) {
                                            context.getContentResolver().unregisterContentObserver((ContentObserver)K1.F.E);
                                        }
                                        break Label_0342;
                                    }
                                    finally {
                                        monitorexit(clazz);
                                        K1.F = null;
                                        monitorexit(clazz);
                                    }
                                }
                            }
                            finally {
                                monitorexit(o);
                                Object o2 = null;
                                Label_0401: {
                                    final Object o3;
                                    o2 = new T2.f((T2.d)o3);
                                }
                                Label_0412: {
                                    break Label_0412;
                                    monitorexit(o);
                                    break Label_0453;
                                    while (true) {
                                        final Object o3;
                                        o2 = new e((T2.d)o3);
                                        break Label_0412;
                                        o3 = new Object();
                                        ((u2)o3).C = c;
                                        iftrue(Label_0401:)(!(o3 instanceof Serializable));
                                        continue;
                                    }
                                }
                                P1.h = new H1((Context)c, (T2.d)o2);
                                P1.i.incrementAndGet();
                            }
                        }
                    }
                    finally {
                        monitorexit(o);
                        monitorexit(o);
                    }
                }
            }
        }
        this.P = q2.a.a;
        final Long j = e0.i;
        long j2;
        if (j != null) {
            j2 = j;
        }
        else {
            j2 = System.currentTimeMillis();
        }
        this.j0 = j2;
        final u k = new u(this);
        ((d)k).F = (K2.e)new C3.f(9);
        this.I = (d)k;
        final a0 l = new a0(this);
        l.x();
        this.J = l;
        final P m = new P(this);
        m.x();
        this.K = m;
        final J1 n = new J1(this);
        n.x();
        this.N = n;
        this.O = new L(new b1.f((Object)this, 19));
        this.S = new p(this);
        final X0 q = new X0(this);
        q.A();
        this.Q = q;
        final H0 r = new H0(this);
        r.A();
        this.R = r;
        final l1 m2 = new l1(this);
        m2.A();
        this.M = m2;
        final x0 t = new x0(this);
        t.x();
        this.T = (V0)t;
        final k0 l2 = new k0(this);
        l2.x();
        this.L = l2;
        final com.google.android.gms.internal.measurement.Z g2 = e0.g;
        int n2 = b ? 1 : 0;
        if (g2 != null) {
            n2 = (b ? 1 : 0);
            if (g2.D != 0L) {
                n2 = 1;
            }
        }
        if (a.getApplicationContext() instanceof Application) {
            e(r);
            final n0 n3 = (n0)r.C;
            if (n3.C.getApplicationContext() instanceof Application) {
                final Application application = (Application)n3.C.getApplicationContext();
                if (r.E == null) {
                    r.E = new S0(r);
                }
                if (n2 == 0) {
                    application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)r.E);
                    application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)r.E);
                    r.j().P.f("Registered activity lifecycle callback");
                }
            }
        }
        else {
            f(m);
            m.K.f("Application context is not an Application");
        }
        l2.E((Runnable)new V2.o(13, (Object)this, (Object)e0, false));
    }
    
    public static n0 b(final Context context, final com.google.android.gms.internal.measurement.Z z, final Long n) {
        com.google.android.gms.internal.measurement.Z z2 = z;
        Label_0053: {
            if (z != null) {
                if (z.G != null) {
                    z2 = z;
                    if (z.H != null) {
                        break Label_0053;
                    }
                }
                z2 = new com.google.android.gms.internal.measurement.Z(z.C, z.D, z.E, z.F, (String)null, (String)null, z.I, (String)null);
            }
        }
        A.h((Object)context);
        A.h((Object)context.getApplicationContext());
        Label_0172: {
            if (n0.k0 == null) {
                final Class<n0> clazz;
                monitorenter(clazz = n0.class);
                Label_0113: {
                    try {
                        if (n0.k0 == null) {
                            n0.k0 = new n0(new E0(context, z2, n));
                        }
                        break Label_0113;
                    }
                    finally {
                        monitorexit(clazz);
                        monitorexit(clazz);
                        break Label_0172;
                    }
                }
            }
            if (z2 != null) {
                final Bundle i = z2.I;
                if (i != null && ((BaseBundle)i).containsKey("dataCollectionDefaultEnabled")) {
                    A.h((Object)n0.k0);
                    n0.k0.c0 = ((BaseBundle)z2.I).getBoolean("dataCollectionDefaultEnabled");
                }
            }
        }
        A.h((Object)n0.k0);
        return n0.k0;
    }
    
    public static void c(final u u) {
        if (u != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }
    
    public static void e(final Z z) {
        if (z == null) {
            throw new IllegalStateException("Component not created");
        }
        if (z.D) {
            return;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf((Object)z.getClass())));
    }
    
    public static void f(final x0 x0) {
        if (x0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (x0.D) {
            return;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf((Object)x0.getClass())));
    }
    
    public final Context a() {
        return this.C;
    }
    
    public final a d() {
        return this.P;
    }
    
    public final boolean g() {
        return this.k() == 0;
    }
    
    public final b h() {
        return this.H;
    }
    
    public final boolean i() {
        if (this.Z) {
            final k0 l = this.L;
            f(l);
            l.v();
            final Boolean a0 = this.a0;
            final a p = this.P;
            if (a0 != null && this.b0 != 0L) {
                if (a0) {
                    return this.a0;
                }
                p.getClass();
                if (Math.abs(SystemClock.elapsedRealtime() - this.b0) <= 1000L) {
                    return this.a0;
                }
            }
            p.getClass();
            this.b0 = SystemClock.elapsedRealtime();
            final J1 n = this.N;
            c(n);
            final boolean x0 = n.x0("android.permission.INTERNET");
            final boolean b = true;
            boolean b2 = false;
            Label_0171: {
                if (x0 && n.x0("android.permission.ACCESS_NETWORK_STATE")) {
                    final Context c = this.C;
                    if (s2.b.a(c).d() || this.I.J() || (J1.c0(c) && J1.u0(c))) {
                        b2 = true;
                        break Label_0171;
                    }
                }
                b2 = false;
            }
            this.a0 = b2;
            if (b2) {
                final String d = this.o().D();
                final K o = this.o();
                o.z();
                boolean b3 = b;
                if (!n.g0(d, o.O)) {
                    final K o2 = this.o();
                    o2.z();
                    b3 = (!TextUtils.isEmpty((CharSequence)o2.O) && b);
                }
                this.a0 = b3;
            }
            return this.a0;
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }
    
    public final P j() {
        final P k = this.K;
        f(k);
        return k;
    }
    
    public final int k() {
        final k0 l = this.L;
        f(l);
        l.v();
        final Boolean e = this.I.E("firebase_analytics_collection_deactivated");
        if (e != null && e) {
            return 1;
        }
        final Boolean e2 = this.e0;
        if (e2 != null && e2) {
            return 2;
        }
        final k0 i = this.L;
        f(i);
        i.v();
        if (!this.f0) {
            return 8;
        }
        final a0 j = this.J;
        c(j);
        j.v();
        Boolean value;
        if (j.D().contains("measurement_enabled")) {
            value = j.D().getBoolean("measurement_enabled", true);
        }
        else {
            value = null;
        }
        if (value != null) {
            if (value) {
                return 0;
            }
            return 3;
        }
        else {
            final Boolean e3 = this.I.E("firebase_analytics_collection_enabled");
            if (e3 != null) {
                if (e3) {
                    return 0;
                }
                return 4;
            }
            else {
                final Boolean d0 = this.d0;
                if (d0 != null) {
                    if (d0) {
                        return 0;
                    }
                    return 5;
                }
                else {
                    if (this.c0 == null) {
                        return 0;
                    }
                    if (this.c0) {
                        return 0;
                    }
                    return 7;
                }
            }
        }
    }
    
    public final k0 l() {
        final k0 l = this.L;
        f(l);
        return l;
    }
    
    public final p m() {
        final p s = this.S;
        if (s != null) {
            return s;
        }
        throw new IllegalStateException("Component not created");
    }
    
    public final o n() {
        f(this.X);
        return this.X;
    }
    
    public final K o() {
        e(this.Y);
        return this.Y;
    }
    
    public final J p() {
        e(this.V);
        return this.V;
    }
    
    public final L q() {
        return this.O;
    }
    
    public final b1 r() {
        e(this.W);
        return this.W;
    }
    
    public final void s() {
        c(this.N);
    }
}

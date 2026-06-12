package K2;

import android.os.BaseBundle;
import h2.A;
import android.os.SystemClock;
import V2.o;
import m0.a;
import java.util.Objects;
import android.os.Bundle;
import android.app.Activity;
import java.util.concurrent.ConcurrentHashMap;

public final class X0 extends Z
{
    public volatile Y0 E;
    public volatile Y0 F;
    public Y0 G;
    public final ConcurrentHashMap H;
    public Activity I;
    public volatile boolean J;
    public volatile Y0 K;
    public Y0 L;
    public boolean M;
    public final Object N;
    
    public X0(final n0 n0) {
        super(n0);
        this.N = new Object();
        this.H = new ConcurrentHashMap();
    }
    
    @Override
    public final boolean B() {
        return false;
    }
    
    public final Y0 C(final boolean b) {
        this.z();
        this.v();
        if (!b) {
            return this.G;
        }
        final Y0 g = this.G;
        if (g != null) {
            return g;
        }
        return this.L;
    }
    
    public final String D(final Class clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        final String[] split = canonicalName.split("\\.");
        String s;
        if (split.length > 0) {
            s = split[split.length - 1];
        }
        else {
            s = "";
        }
        final int length = s.length();
        final n0 n0 = (n0)super.C;
        n0.I.getClass();
        String substring = s;
        if (length > 500) {
            n0.I.getClass();
            substring = s.substring(0, 500);
        }
        return substring;
    }
    
    public final void E(final Y0 y0, final Y0 y2, final long d, final boolean b, final Bundle bundle) {
        this.v();
        final int n = 0;
        final boolean b2 = y2 == null || y2.c != y0.c || !Objects.equals((Object)y2.b, (Object)y0.b) || !Objects.equals((Object)y2.a, (Object)y0.a);
        int n2 = n;
        if (b) {
            n2 = n;
            if (this.G != null) {
                n2 = 1;
            }
        }
        final boolean e = y0.e;
        final n0 n3 = (n0)super.C;
        if (b2) {
            Bundle bundle2;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            }
            else {
                bundle2 = new Bundle();
            }
            J1.M(y0, bundle2, true);
            if (y2 != null) {
                final String a = y2.a;
                if (a != null) {
                    ((BaseBundle)bundle2).putString("_pn", a);
                }
                final String b3 = y2.b;
                if (b3 != null) {
                    ((BaseBundle)bundle2).putString("_pc", b3);
                }
                ((BaseBundle)bundle2).putLong("_pi", y2.c);
            }
            if (n2 != 0) {
                final p1 h = this.y().H;
                final long n4 = d - h.D;
                h.D = d;
                if (n4 > 0L) {
                    this.u().P(bundle2, n4);
                }
            }
            if (!n3.I.I()) {
                ((BaseBundle)bundle2).putLong("_mst", 1L);
            }
            String s;
            if (e) {
                s = "app";
            }
            else {
                s = "auto";
            }
            n3.P.getClass();
            final long currentTimeMillis = System.currentTimeMillis();
            long f = 0L;
            Label_0319: {
                if (e) {
                    f = y0.f;
                    if (f != 0L) {
                        break Label_0319;
                    }
                }
                f = currentTimeMillis;
            }
            this.w().C(f, bundle2, s, "_vs");
        }
        if (n2 != 0) {
            this.F(this.G, true, d);
        }
        this.G = y0;
        if (e) {
            this.L = y0;
        }
        final b1 e2 = a.e(n3);
        e2.E((Runnable)new o(21, (Object)e2, (Object)y0, false));
    }
    
    public final void F(final Y0 y0, final boolean b, final long n) {
        final n0 n2 = (n0)super.C;
        final p m = n2.m();
        n2.P.getClass();
        m.z(SystemClock.elapsedRealtime());
        if (this.y().H.a(y0 != null && y0.d, b, n) && y0 != null) {
            y0.d = false;
        }
    }
    
    public final void G(final Activity activity, final Y0 y0, final boolean b) {
        Y0 y2;
        if (this.E == null) {
            y2 = this.F;
        }
        else {
            y2 = this.E;
        }
        Y0 e;
        if (y0.b == null) {
            String d;
            if (activity != null) {
                d = this.D(activity.getClass());
            }
            else {
                d = null;
            }
            e = new Y0(y0.a, d, y0.c, y0.e, y0.f);
        }
        else {
            e = y0;
        }
        this.F = this.E;
        this.E = e;
        ((n0)super.C).P.getClass();
        this.l().E((Runnable)new T0(this, e, y2, SystemClock.elapsedRealtime(), b));
    }
    
    public final void H(final Activity activity, Bundle bundle) {
        if (!((n0)super.C).I.I()) {
            return;
        }
        if (bundle == null) {
            return;
        }
        bundle = bundle.getBundle("com.google.app_measurement.screen_service");
        if (bundle == null) {
            return;
        }
        this.H.put((Object)activity.hashCode(), (Object)new Y0(((BaseBundle)bundle).getString("name"), ((BaseBundle)bundle).getString("referrer_name"), ((BaseBundle)bundle).getLong("id")));
    }
    
    public final Y0 I(final Activity activity) {
        A.h((Object)activity);
        Y0 y0;
        if ((y0 = (Y0)this.H.get((Object)activity.hashCode())) == null) {
            y0 = new Y0(null, this.D(activity.getClass()), this.u().F0());
            this.H.put((Object)activity.hashCode(), (Object)y0);
        }
        if (this.K != null) {
            return this.K;
        }
        return y0;
    }
}

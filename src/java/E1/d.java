package E1;

import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.pA;
import com.google.android.gms.internal.ads.OA;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.A0;
import com.google.android.gms.internal.ads.V;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.GF;
import com.google.android.gms.internal.ads.Ov;
import com.google.android.gms.internal.ads.kv;
import com.google.android.gms.internal.ads.pd;
import com.google.android.gms.internal.ads.sd;
import android.content.pm.PackageInfo;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.internal.ads.z7;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.Ba;
import com.google.android.gms.internal.ads.Dv;
import com.google.android.gms.internal.ads.xw;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.sv;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.Aq;
import android.content.pm.PackageManager$NameNotFoundException;
import s2.b;
import org.json.JSONObject;
import com.google.android.gms.internal.ads.ya;
import com.google.android.gms.internal.ads.za;
import com.google.android.gms.internal.ads.Aa;
import com.google.android.gms.internal.ads.F7;
import android.text.TextUtils;
import J1.j;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.Eq;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.id;
import android.content.Context;
import com.google.android.gms.internal.ads.C6;
import com.google.android.gms.internal.ads.D6;
import com.google.android.gms.internal.ads.Sl;
import I1.J;
import android.database.sqlite.SQLiteDatabase;
import K2.N;
import com.google.android.gms.internal.ads.Sb;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import com.google.android.gms.internal.ads.Ak;
import h2.A;
import q2.a;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.C;
import java.util.ArrayList;
import com.google.android.gms.internal.ads.rq;
import com.google.android.gms.internal.ads.I;
import com.google.android.gms.internal.ads.H;
import O2.e;

public final class d implements e, H, I, rq
{
    public final int C;
    public long D;
    public Object E;
    
    public d(final int c) {
        switch (this.C = c) {
            default: {
                this.E = new ArrayList();
                return;
            }
            case 9: {
                this.D = 0L;
                return;
            }
            case 8: {
                this.E = null;
                this.D = -1L;
            }
        }
    }
    
    public d(final C e, final long d) {
        this.C = 4;
        this.E = e;
        y7.P(e.F >= d);
        this.D = d;
    }
    
    public d(final a e) {
        this.C = 2;
        A.h((Object)e);
        this.E = e;
    }
    
    public static final void o(final Ak ak, final String s, final long n) {
        if (ak != null && (boolean)q.d.c.a(D7.pc)) {
            final Sb a = ak.a();
            a.m("action", "lat_init");
            a.m(s, Long.toString(n));
            a.s();
        }
    }
    
    public void F(final int n) {
        ((C)this.E).i(n, false);
    }
    
    public void G(final int n) {
        ((C)this.E).k(n);
    }
    
    public void H(final byte[] array, final int n, final int n2) {
        ((C)this.E).J(array, n, n2, false);
    }
    
    public void I(final byte[] array, final int n, final int n2) {
        ((C)this.E).K(array, n, n2, false);
    }
    
    public boolean J(final byte[] array, final int n, final int n2, final boolean b) {
        return ((C)this.E).J(array, 0, n2, b);
    }
    
    public boolean K(final byte[] array, final int n, final int n2, final boolean b) {
        return ((C)this.E).K(array, 0, n2, b);
    }
    
    public long b() {
        return ((C)this.E).b() - this.D;
    }
    
    public long c() {
        return ((C)this.E).F - this.D;
    }
    
    public int e(final byte[] array, final int n, final int n2) {
        return ((C)this.E).e(array, n, n2);
    }
    
    @Override
    public void f(final Exception ex) {
        ((N)this.E).c.set(this.D);
    }
    
    public long h() {
        return ((C)this.E).E - this.D;
    }
    
    public int i(int i) {
        final d d = (d)this.E;
        if (d == null) {
            if (i >= 64) {
                return Long.bitCount(this.D);
            }
            return Long.bitCount(this.D & (1L << i) - 1L);
        }
        else {
            if (i < 64) {
                return Long.bitCount(this.D & (1L << i) - 1L);
            }
            i = d.i(i - 64);
            return Long.bitCount(this.D) + i;
        }
    }
    
    public void j() {
        ((C)this.E).H = 0;
    }
    
    public Object k(final Object o) {
        final SQLiteDatabase sqLiteDatabase = (SQLiteDatabase)o;
        if (!((J)((vd)this.E).a).k()) {
            final C6 n = D6.N();
            ((OA)n).e();
            final D6 d6 = (D6)((OA)n).D;
            final long d7 = this.D;
            D6.J(d6, d7);
            final byte[] d8 = ((pA)((OA)n).b()).d();
            sqLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
            y7.J(sqLiteDatabase, d7, d8);
        }
        return null;
    }
    
    public boolean l(final int n) {
        if (n >= 64) {
            if (this.E == null) {
                this.E = new d(9);
            }
            return ((d)this.E).l(n - 64);
        }
        return (this.D & 1L << n) != 0x0L;
    }
    
    public void m() {
        this.D = 0L;
        final d d = (d)this.E;
        if (d != null) {
            d.m();
        }
    }
    
    public void n(final Context context, final J1.a a, final boolean b, id i, final String s, final String s2, final pf pf, final Eq eq, final Ak ak, final Long n) {
        final o b2 = o.B;
        b2.j.getClass();
        if (SystemClock.elapsedRealtime() - this.D < 5000L) {
            j.i("Not retrying to fetch app settings");
            return;
        }
        final a j = b2.j;
        j.getClass();
        this.D = SystemClock.elapsedRealtime();
        if (i != null) {
            if (!TextUtils.isEmpty((CharSequence)i.e)) {
                final long f = i.f;
                j.getClass();
                if (System.currentTimeMillis() - f <= (long)q.d.c.a(D7.f4) && i.h) {
                    return;
                }
            }
        }
        if (context == null) {
            J1.j.i("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s) && TextUtils.isEmpty((CharSequence)s2)) {
            J1.j.i("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext;
        if ((applicationContext = context.getApplicationContext()) == null) {
            applicationContext = context;
        }
        this.E = applicationContext;
        i = (id)F7.i(context, 4);
        ((Aq)i).e();
        final Ba y = b2.q.y((Context)this.E, a, eq);
        final sa b3 = Aa.b;
        final c a2 = y.a("google.afma.config.fetchAppSettings", (za)b3, (ya)b3);
        Label_0583: {
            JSONObject jsonObject = null;
            Label_0306: {
                try {
                    jsonObject = new JSONObject();
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        jsonObject.put("app_id", (Object)s);
                        break Label_0306;
                    }
                }
                catch (final Exception ex) {
                    break Label_0583;
                }
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    jsonObject.put("ad_unit_id", (Object)s2);
                }
            }
            jsonObject.put("is_init", b);
            jsonObject.put("pn", (Object)context.getPackageName());
            final z7 a3 = D7.a;
            jsonObject.put("experiment_ids", (Object)TextUtils.join((CharSequence)",", (Iterable)q.d.a.m()));
            jsonObject.put("js", (Object)a.C);
            try {
                final ApplicationInfo applicationInfo = ((Context)this.E).getApplicationInfo();
                if (applicationInfo != null) {
                    final PackageInfo c = b.a(context).c(0, applicationInfo.packageName);
                    if (c != null) {
                        jsonObject.put("version", c.versionCode);
                    }
                }
            }
            catch (final PackageManager$NameNotFoundException ex2) {
                I1.H.m("Error fetching PackageInfo.");
            }
            final sd a4 = a2.a(jsonObject);
            final c c2 = new c(this, n, ak, (Aq)i, eq);
            final pd g = rd.g;
            final kv f2 = F7.F0((V2.q)a4, (sv)c2, (Executor)g);
            final Ov c3 = a4.C;
            if (pf != null) {
                ((gv)c3).a((Runnable)pf, (Executor)g);
            }
            if (n != null) {
                ((gv)c3).a((Runnable)new V2.o(this, ak, n), (Executor)g);
            }
            if (q.d.c.a(D7.x7)) {
                ((gv)f2).a((Runnable)new Dv((Object)f2, 0, (Object)new xw("ConfigLoader.maybeFetchNewAppSettings", 4)), (Executor)g);
                return;
            }
            y7.j((V2.q)f2, "ConfigLoader.maybeFetchNewAppSettings");
            return;
        }
        final Exception ex;
        J1.j.g("Error requesting application settings", (Throwable)ex);
        ((Aq)i).p((Throwable)ex);
        ((Aq)i).m0(false);
        eq.b(((Aq)i).m());
    }
    
    public void t() {
        ((GF)this.E).t();
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 9: {
                String s;
                if (this.E == null) {
                    s = Long.toBinaryString(this.D);
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(((d)this.E).toString());
                    sb.append("xx");
                    sb.append(Long.toBinaryString(this.D));
                    s = sb.toString();
                }
                return s;
            }
        }
    }
    
    public b0 u(final int n, final int n2) {
        return ((GF)this.E).u(n, n2);
    }
    
    public void v(final V v) {
        ((GF)this.E).v((V)new A0(this, v, v));
    }
}

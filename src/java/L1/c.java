package l1;

import android.util.SparseArray;
import java.util.HashMap;
import android.net.NetworkInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.telephony.TelephonyManager;
import java.util.Locale;
import m1.G;
import m1.H;
import java.util.TimeZone;
import java.util.Calendar;
import android.os.Build;
import android.os.Build$VERSION;
import java.net.MalformedURLException;
import m1.p;
import m1.B;
import m1.v;
import m1.I;
import m1.k;
import m1.q;
import m1.C;
import m1.g;
import m1.r;
import m1.D;
import m1.h;
import m1.o;
import m1.A;
import m1.e;
import m1.s;
import m1.E;
import m1.i;
import m1.l;
import m1.b;
import m1.n;
import m1.y;
import m1.t;
import m1.F;
import m1.j;
import m1.m;
import x3.d;
import m1.w;
import java.net.URL;
import android.content.Context;
import android.net.ConnectivityManager;
import X.a;
import o1.f;

public final class c implements f
{
    public final a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final w1.a e;
    public final w1.a f;
    public final int g;
    
    public c(final Context c, final w1.a f, final w1.a e) {
        final z3.c c2 = new z3.c();
        final m1.c a = m1.c.a;
        c2.a((Class)w.class, (d)a);
        c2.a((Class)m.class, (d)a);
        final j a2 = j.a;
        c2.a((Class)F.class, (d)a2);
        c2.a((Class)t.class, (d)a2);
        final m1.d a3 = m1.d.a;
        c2.a((Class)y.class, (d)a3);
        c2.a((Class)n.class, (d)a3);
        final b a4 = m1.b.a;
        c2.a((Class)m1.a.class, (d)a4);
        c2.a((Class)l.class, (d)a4);
        final i a5 = i.a;
        c2.a((Class)E.class, (d)a5);
        c2.a((Class)s.class, (d)a5);
        final e a6 = m1.e.a;
        c2.a((Class)A.class, (d)a6);
        c2.a((Class)o.class, (d)a6);
        final h a7 = h.a;
        c2.a((Class)D.class, (d)a7);
        c2.a((Class)r.class, (d)a7);
        final g a8 = m1.g.a;
        c2.a((Class)C.class, (d)a8);
        c2.a((Class)q.class, (d)a8);
        final k a9 = k.a;
        c2.a((Class)I.class, (d)a9);
        c2.a((Class)v.class, (d)a9);
        final m1.f a10 = m1.f.a;
        c2.a((Class)B.class, (d)a10);
        c2.a((Class)p.class, (d)a10);
        c2.d = true;
        this.a = new a((Object)c2, 26);
        this.c = c;
        this.b = (ConnectivityManager)c.getSystemService("connectivity");
        this.d = b(l1.a.c);
        this.e = e;
        this.f = f;
        this.g = 130000;
    }
    
    public static URL b(final String s) {
        try {
            return new URL(s);
        }
        catch (final MalformedURLException ex) {
            throw new IllegalArgumentException(m0.a.f("Invalid url: ", s), (Throwable)ex);
        }
    }
    
    public final n1.i a(final n1.i i) {
        final NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        final n1.h c = i.c();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final HashMap f = c.f;
        if (f == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        f.put((Object)"sdk-version", (Object)String.valueOf(sdk_INT));
        c.a("model", Build.MODEL);
        c.a("hardware", Build.HARDWARE);
        c.a("device", Build.DEVICE);
        c.a("product", Build.PRODUCT);
        c.a("os-uild", Build.ID);
        c.a("manufacturer", Build.MANUFACTURER);
        c.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        final long n = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        final HashMap f2 = c.f;
        if (f2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        f2.put((Object)"tz-offset", (Object)String.valueOf(n));
        final int n2 = -1;
        int type;
        if (activeNetworkInfo == null) {
            final SparseArray c2 = H.C;
            type = -1;
        }
        else {
            type = activeNetworkInfo.getType();
        }
        final HashMap f3 = c.f;
        if (f3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        f3.put((Object)"net-type", (Object)String.valueOf(type));
        int subtype = 0;
        Label_0248: {
            if (activeNetworkInfo == null) {
                final SparseArray c3 = G.C;
            }
            else {
                subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    final SparseArray c4 = G.C;
                    subtype = 100;
                    break Label_0248;
                }
                if (G.C.get(subtype) != null) {
                    break Label_0248;
                }
            }
            subtype = 0;
        }
        final HashMap f4 = c.f;
        if (f4 != null) {
            f4.put((Object)"mobile-subtype", (Object)String.valueOf(subtype));
            c.a("country", Locale.getDefault().getCountry());
            c.a("locale", Locale.getDefault().getLanguage());
            final Context c5 = this.c;
            String simOperator = ((TelephonyManager)c5.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c.a("mcc_mnc", simOperator);
            int versionCode;
            try {
                versionCode = c5.getPackageManager().getPackageInfo(c5.getPackageName(), 0).versionCode;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                J5.b.w("CctTransportBackend", "Unable to find version code for package", (Exception)ex);
                versionCode = n2;
            }
            c.a("application_build", Integer.toString(versionCode));
            return c.b();
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
}

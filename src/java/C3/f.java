package C3;

import java.io.Serializable;
import J1.l;
import F4.m;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.L3;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.measurement.r3;
import com.google.android.gms.internal.measurement.h3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.V2;
import com.google.android.gms.internal.measurement.T2;
import com.google.android.gms.internal.measurement.G3;
import com.google.android.gms.internal.measurement.E3;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.W2;
import com.google.android.gms.internal.measurement.U2;
import com.google.android.gms.internal.ads.z7;
import android.text.TextUtils;
import H1.c;
import android.net.Uri;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import I1.H;
import android.content.ActivityNotFoundException;
import com.google.android.gms.internal.ads.Ak;
import H1.a;
import H1.b;
import android.content.Intent;
import android.content.Context;
import I1.M;
import J1.j;
import android.os.Process;
import E1.o;
import android.webkit.CookieManager;
import K2.E;
import K2.e;
import J1.d;
import F4.n;
import S2.g;

public class f implements g, n, d, e, E
{
    public final int C;
    
    public static CookieManager d() {
        final M c = o.B.c;
        final int myUid = Process.myUid();
        if (myUid == 0 || myUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        }
        finally {
            final Throwable t;
            j.g("Failed to obtain CookieManager.", t);
            o.B.g.g("ApiLevelUtil.getCookieManager", t);
            return null;
        }
    }
    
    public static final boolean e(final Context context, final Intent intent, final b b, final a a, final boolean b2, final Ak ak, final String s) {
        final boolean b3 = true;
        if (b2) {
            final Uri data = intent.getData();
            int c;
            try {
                o.B.c.getClass();
                final int n = c = M.C(context, data);
                if (b != null) {
                    b.f();
                    c = n;
                }
            }
            catch (final ActivityNotFoundException ex) {
                j.i(((Throwable)ex).getMessage());
                c = 6;
            }
            if (a != null) {
                a.E(c);
            }
            boolean b4 = b3;
            if (c != 5) {
                b4 = false;
            }
            return b4;
        }
        String uri;
        StringBuilder sb;
        M c2;
        M c3;
        Block_12_Outer:Label_0197_Outer:
        while (true) {
            Label_0174: {
                try {
                    uri = intent.toURI();
                    sb = new StringBuilder("Launching an intent: ");
                    sb.append(uri);
                    H.m(sb.toString());
                    if (q.d.c.a(D7.Kc)) {
                        c2 = o.B.c;
                        M.r(context, intent, ak, s);
                        break Label_0187;
                    }
                    break Label_0174;
                }
                catch (final ActivityNotFoundException ex2) {
                    j.i(((Throwable)ex2).getMessage());
                    if (a != null) {
                        a.F(false);
                    }
                    return false;
                    Label_0208: {
                        return true;
                    }
                    while (true) {
                        Block_11: {
                            while (true) {
                                a.F(true);
                                return true;
                                iftrue(Label_0197:)(b == null);
                                break Block_11;
                                iftrue(Label_0208:)(a == null);
                                continue Label_0197_Outer;
                            }
                            c3 = o.B.c;
                            M.p(context, intent);
                            continue Block_12_Outer;
                        }
                        b.f();
                        continue;
                    }
                }
            }
            break;
        }
    }
    
    public static final boolean f(final Context context, final c c, final b b, final a a, final Ak ak, final String s) {
        final int n = 0;
        if (c == null) {
            j.i("No intent data for launcher overlay.");
            return false;
        }
        D7.a(context);
        final Intent j = c.J;
        if (j != null) {
            return e(context, j, b, a, c.L, ak, s);
        }
        final Intent intent = new Intent();
        final String d = c.D;
        if (TextUtils.isEmpty((CharSequence)d)) {
            J1.j.i("Open GMSG did not contain a URL.");
            return false;
        }
        final String e = c.E;
        if (!TextUtils.isEmpty((CharSequence)e)) {
            intent.setDataAndType(Uri.parse(d), e);
        }
        else {
            intent.setData(Uri.parse(d));
        }
        intent.setAction("android.intent.action.VIEW");
        final String f = c.F;
        if (!TextUtils.isEmpty((CharSequence)f)) {
            intent.setPackage(f);
        }
        final String g = c.G;
        if (!TextUtils.isEmpty((CharSequence)g)) {
            final String[] split = g.split("/", 2);
            if (split.length < 2) {
                J1.j.i("Could not parse component name from open GMSG: ".concat(g));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        final String h = c.H;
        if (!TextUtils.isEmpty((CharSequence)h)) {
            int int1;
            try {
                int1 = Integer.parseInt(h);
            }
            catch (final NumberFormatException ex) {
                J1.j.i("Could not parse intent flags.");
                int1 = n;
            }
            intent.addFlags(int1);
        }
        final z7 w4 = D7.w4;
        final q d2 = q.d;
        if (d2.c.a(w4)) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
        else if (d2.c.a(D7.v4)) {
            final M c2 = o.B.c;
            M.E(context, intent);
        }
        return e(context, intent, b, a, c.L, ak, s);
    }
    
    @Override
    public Object a() {
        switch (this.C) {
            default: {
                U2.D.get();
                final Long n = (Long)W2.d0.a();
                n.getClass();
                return n;
            }
            case 28: {
                U2.D.get();
                return W2.l.a();
            }
            case 27: {
                U2.D.get();
                return (int)(long)W2.p.a();
            }
            case 26: {
                U2.D.get();
                return (int)(long)W2.S.a();
            }
            case 25: {
                U2.D.get();
                return (int)(long)W2.T.a();
            }
            case 24: {
                a3.D.get();
                final Boolean b = (Boolean)c3.a.a();
                b.getClass();
                return b;
            }
            case 23: {
                E3.D.get();
                final Boolean b2 = (Boolean)G3.a.a();
                b2.getClass();
                return b2;
            }
            case 22: {
                T2.D.get();
                final Boolean b3 = (Boolean)V2.a.a();
                b3.getClass();
                return b3;
            }
            case 21: {
                f3.D.get();
                final Boolean b4 = (Boolean)h3.b.a();
                b4.getClass();
                return b4;
            }
            case 20: {
                U2.D.get();
                return (int)(long)W2.V.a();
            }
            case 19: {
                r3.D.get();
                final Boolean b5 = (Boolean)t3.a.a();
                b5.getClass();
                return b5;
            }
            case 18: {
                J3.D.get();
                final Boolean b6 = (Boolean)L3.b.a();
                b6.getClass();
                return b6;
            }
            case 17: {
                l3.D.get();
                final Boolean b7 = (Boolean)n3.c.a();
                b7.getClass();
                return b7;
            }
            case 16: {
                l3.D.get();
                final Boolean b8 = (Boolean)n3.b.a();
                b8.getClass();
                return b8;
            }
            case 15: {
                f3.D.get();
                final Boolean b9 = (Boolean)h3.c.a();
                b9.getClass();
                return b9;
            }
            case 14: {
                b4.D.get();
                final Boolean b10 = (Boolean)d4.k.a();
                b10.getClass();
                return b10;
            }
            case 13: {
                b4.D.get();
                final Boolean b11 = (Boolean)d4.a.a();
                b11.getClass();
                return b11;
            }
            case 12: {
                b4.D.get();
                final Boolean b12 = (Boolean)d4.e.a();
                b12.getClass();
                return b12;
            }
            case 11: {
                b4.D.get();
                final Boolean b13 = (Boolean)d4.j.a();
                b13.getClass();
                return b13;
            }
            case 10: {
                b4.D.get();
                final Boolean b14 = (Boolean)d4.h.a();
                b14.getClass();
                return b14;
            }
        }
    }
    
    @Override
    public void b(final S2.f f) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf((Object)f.b)));
    }
    
    @Override
    public String c(final String s, final String s2) {
        return null;
    }
    
    public Intent g(final Activity activity) {
        final Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", ((Context)activity).getPackageName());
        intent.putExtra("app_uid", ((Context)activity).getApplicationInfo().uid);
        return intent;
    }
    
    public int h(final Context context, final TelephonyManager telephonyManager) {
        return 3;
    }
    
    public void i(final Context context) {
    }
    
    public boolean j(final Context context) {
        return false;
    }
    
    public int k(final AudioManager audioManager) {
        return 0;
    }
    
    public void l(final Activity activity) {
    }
    
    public int m(final Context context) {
        return ((TelephonyManager)context.getSystemService("phone")).getNetworkType();
    }
    
    @Override
    public void onMethodCall(final m m, final F4.o o) {
        switch (this.C) {
            default: {
                ((E4.j)o).success(null);
                return;
            }
            case 3: {
                ((E4.j)o).success(null);
            }
        }
    }
    
    @Override
    public l p(final String s) {
        new C1.c(1, (Serializable)s).start();
        return l.C;
    }
}

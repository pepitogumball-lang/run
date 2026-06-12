package K2;

import android.os.BaseBundle;
import s2.b;
import java.util.Iterator;
import C.u;
import android.text.TextUtils;
import android.net.Uri$Builder;
import android.os.Bundle;

public final class e0
{
    public n0 a;
    
    public void a(String string, final Bundle bundle) {
        final n0 a = this.a;
        final k0 l = a.L;
        n0.f(l);
        l.v();
        if (!a.g()) {
            if (((BaseBundle)bundle).isEmpty()) {
                string = null;
            }
            else {
                String s = string;
                if (string.isEmpty()) {
                    s = "auto";
                }
                final Uri$Builder uri$Builder = new Uri$Builder();
                uri$Builder.path(s);
                for (final String s2 : ((BaseBundle)bundle).keySet()) {
                    uri$Builder.appendQueryParameter(s2, ((BaseBundle)bundle).getString(s2));
                }
                string = uri$Builder.build().toString();
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                final a0 j = a.J;
                n0.c(j);
                j.Z.i(string);
                n0.c(j);
                a.P.getClass();
                j.a0.b(System.currentTimeMillis());
            }
        }
    }
    
    public boolean b() {
        final n0 a = this.a;
        Label_0064: {
            R4.b a2;
            try {
                a2 = b.a(a.C);
                if (a2 == null) {
                    final P k = a.K;
                    n0.f(k);
                    k.P.f("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                    return false;
                }
            }
            catch (final Exception ex) {
                break Label_0064;
            }
            return a2.c(128, "com.android.vending").versionCode >= 80837300;
        }
        final P i = a.K;
        n0.f(i);
        final Exception ex;
        i.P.g("Failed to retrieve Play Store version for Install Referrer", ex);
        return false;
    }
    
    public boolean c() {
        final a0 j = this.a.J;
        n0.c(j);
        return j.a0.a() > 0L;
    }
    
    public boolean d() {
        if (!this.c()) {
            return false;
        }
        final n0 a = this.a;
        a.P.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final a0 j = a.J;
        n0.c(j);
        return currentTimeMillis - j.a0.a() > a.I.B(null, w.V);
    }
}

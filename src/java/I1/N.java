package I1;

import J1.e;
import e2.j;
import e2.f;
import F1.p;
import java.util.regex.Pattern;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.F3;
import com.google.android.gms.internal.ads.P3;
import java.io.File;
import com.google.android.gms.internal.ads.us;
import com.google.android.gms.internal.ads.G3;
import com.google.android.gms.internal.ads.v1;
import android.content.Context;
import com.google.android.gms.internal.ads.Ii;

public final class n extends Ii
{
    public final Context F;
    
    public n(final Context f, final v1 v1) {
        super(v1);
        this.F = f;
    }
    
    public static G3 s(final Context context) {
        final n n = new n(context, new v1(22));
        final File cacheDir = context.getCacheDir();
        final int d = us.d;
        final G3 g3 = new G3(new P3(new File(new File(cacheDir, "admob_volley").getPath())), (Ii)n);
        g3.c();
        return g3;
    }
    
    public final C3 f(final F3 f3) {
        if (f3.D == 0) {
            final String s = (String)q.d.c.a(D7.t4);
            final String e = f3.E;
            if (Pattern.matches(s, (CharSequence)e)) {
                final e a = p.f.a;
                final f b = f.b;
                final Context f4 = this.F;
                if (b.c(f4, 13400000) == 0) {
                    final C3 f5 = new j(f4, 1).f(f3);
                    if (f5 != null) {
                        H.m("Got gmscore asset response: ".concat(String.valueOf((Object)e)));
                        return f5;
                    }
                    H.m("Failed to get gmscore asset response: ".concat(String.valueOf((Object)e)));
                }
            }
        }
        return super.f(f3);
    }
}

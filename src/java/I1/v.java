package I1;

import java.util.Map;
import com.google.android.gms.internal.ads.F3;
import com.google.android.gms.internal.ads.t3;
import J1.j;
import J1.f;
import com.google.android.gms.internal.ads.Rc;
import J1.g;
import com.google.android.gms.internal.auth.l;
import com.google.android.gms.internal.ads.sd;
import java.util.HashMap;
import com.google.android.gms.internal.ads.P3;
import com.google.android.gms.internal.ads.Ii;
import com.google.android.gms.internal.ads.v1;
import F1.q;
import com.google.android.gms.internal.ads.D7;
import android.content.Context;
import com.google.android.gms.internal.ads.G3;

public final class v
{
    public static G3 a;
    public static final Object b;
    
    static {
        b = new Object();
    }
    
    public v(Context applicationContext) {
        Context applicationContext2 = applicationContext;
        if (applicationContext.getApplicationContext() != null) {
            applicationContext2 = applicationContext.getApplicationContext();
        }
        final Object b;
        monitorenter(b = v.b);
        while (true) {
            Label_0072: {
                try {
                    if (v.a != null) {
                        break Label_0138;
                    }
                    D7.a(applicationContext2);
                    if (q.d.c.a(D7.s4)) {
                        final G3 s = n.s(applicationContext2);
                        break Label_0072;
                    }
                    break Label_0072;
                }
                finally {
                    monitorexit(b);
                    final Ii ii = new Ii(new v1(22));
                    applicationContext = applicationContext2.getApplicationContext();
                    final G3 s = new G3(new P3(new Ii(applicationContext)), ii);
                    s.c();
                    break Label_0072;
                    monitorexit(b);
                    return;
                    v.a = s;
                    continue;
                }
            }
            break;
        }
    }
    
    public static t a(final int n, final String s, final HashMap hashMap, final byte[] array) {
        final sd sd = new sd();
        final l l = new l((Object)s, 10, (Object)sd);
        final g g = new g();
        final s s2 = new s(n, s, (t)sd, l, array, hashMap, g);
        if (J1.g.c()) {
            try {
                final Map c = s2.c();
                byte[] array2 = array;
                if (array == null) {
                    array2 = null;
                }
                if (J1.g.c()) {
                    g.d("onNetworkRequest", (f)new Rc((Object)s, (Object)"GET", (Object)c, (Object)array2, 2));
                }
            }
            catch (final t3 t3) {
                j.i(((Throwable)t3).getMessage());
            }
        }
        v.a.a((F3)s2);
        return (t)sd;
    }
}

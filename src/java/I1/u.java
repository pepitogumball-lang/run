package I1;

import java.util.Map;
import h1.w;
import com.google.android.gms.internal.ads.ob;
import K2.c0;
import com.google.android.gms.internal.ads.C3;
import J1.f;
import com.google.android.gms.internal.ads.Rc;
import com.google.android.gms.internal.ads.H3;
import C2.b;
import J1.g;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.F3;

public final class u extends F3
{
    public final sd O;
    public final g P;
    
    public u(final String s, final sd o) {
        super(0, s, (H3)new b((Object)o, 14));
        this.O = o;
        final g p2 = new g();
        this.P = p2;
        if (g.c()) {
            p2.d("onNetworkRequest", (f)new Rc((Object)s, (Object)"GET", (Object)null, (Object)null, 2));
        }
    }
    
    public final c0 a(final C3 c3) {
        return new c0(c3, ob.i(c3));
    }
    
    public final void e(final Object o) {
        final C3 c3 = (C3)o;
        final Map c4 = c3.c;
        final g p = this.P;
        p.getClass();
        if (g.c()) {
            final int a = c3.a;
            p.d("onNetworkResponse", (f)new w(a, (Object)c4));
            if (a < 200 || a >= 300) {
                p.d("onNetworkRequestError", (f)new F1.c0((String)null, 1));
            }
        }
        if (g.c()) {
            final byte[] b = c3.b;
            if (b != null) {
                p.d("onNetworkResponseBody", (f)new C2.f((Object)b, 15));
            }
        }
        this.O.c((Object)c3);
    }
}

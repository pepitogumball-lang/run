package o0;

import m5.p;
import e5.i;
import w5.v;
import B5.o;
import w5.C;
import V2.q;
import q0.d;
import n5.h;
import l0.a;
import android.os.Build$VERSION;
import android.content.Context;
import q0.f;

public final class b
{
    public final f a;
    
    public b(final f a) {
        this.a = a;
    }
    
    public static final b a(final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final a a = l0.a.a;
        final int n = 0;
        int a2;
        if (sdk_INT >= 30) {
            a2 = a.a();
        }
        else {
            a2 = 0;
        }
        b b = null;
        f f;
        if (a2 >= 5) {
            final Object systemService = context.getSystemService(E4.a.w());
            h.d("context.getSystemService\u2026opicsManager::class.java)", systemService);
            f = new d(E4.a.l(systemService), 1);
        }
        else {
            int a3 = n;
            if (sdk_INT >= 30) {
                a3 = a.a();
            }
            if (a3 == 4) {
                final Object systemService2 = context.getSystemService(E4.a.w());
                h.d("context.getSystemService\u2026opicsManager::class.java)", systemService2);
                f = new d(E4.a.l(systemService2), 0);
            }
            else {
                f = null;
            }
        }
        if (f != null) {
            b = new b(f);
        }
        return b;
    }
    
    public q b(final q0.a a) {
        h.e("request", a);
        final D5.d a2 = C.a;
        return (q)a.a.b(v.b(v.a((i)o.a), (p)new o0.a(this, a, null)));
    }
}

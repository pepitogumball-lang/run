package w2;

import g2.k;
import n3.u0;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import U1.e;
import O2.t;
import io.flutter.embedding.android.FlutterActivity;
import com.google.android.gms.internal.auth.h;
import L2.b;
import e2.f;
import android.content.Context;
import f2.d;
import U1.a;

public final class g extends f2.g implements a
{
    public static final d P;
    public final Context N;
    public final f O;
    
    static {
        P = new d("AppSet.API", (h)new b(6), new c0.f(1));
    }
    
    public g(final Context n, final f o) {
        super(n, (FlutterActivity)null, g.P, (f2.b)f2.b.z, f2.f.c);
        this.N = n;
        this.O = o;
    }
    
    public final t c() {
        if (this.O.c(this.N, 212800000) == 0) {
            final Object o = new Object();
            ((k)o).a = new e2.d[] { e.a };
            ((k)o).d = new c0.b((Object)this);
            ((k)o).b = false;
            ((k)o).c = 27601;
            return this.d(0, ((k)o).a());
        }
        return u0.l((Exception)new f2.e(new Status(17, (String)null, (PendingIntent)null, (e2.b)null)));
    }
}

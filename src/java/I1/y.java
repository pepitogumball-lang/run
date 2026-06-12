package I1;

import java.util.concurrent.RejectedExecutionException;
import com.google.android.gms.internal.ads.F7;
import J1.l;
import Y0.h;
import com.google.android.gms.internal.ads.rd;
import E1.o;
import android.content.Context;
import C2.b;
import J1.m;
import C.u;

public final class y extends u
{
    public final m D;
    public final String E;
    public final b F;
    
    public y(final Context context, final String s, final String e, final b f) {
        final String x = o.B.c.x(context, s);
        super(1);
        this.D = new m(x);
        this.E = e;
        this.F = f;
    }
    
    public final void q() {
        final String e = this.E;
        final m d = this.D;
        final b f = this.F;
        if (f != null) {
            final h h = new h((Object)f.D, (Object)d, (Object)rd.e, (Object)null);
            try {
                h.I(0L, e, 1);
            }
            catch (final RejectedExecutionException | NullPointerException ex) {
                F7.w0((Object)l.D);
            }
            return;
        }
        d.p(e);
    }
}

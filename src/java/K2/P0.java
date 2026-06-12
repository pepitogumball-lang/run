package K2;

import C2.v;
import m0.a;
import C.u;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.internal.measurement.S;

public final class p0 implements Runnable
{
    public final int C;
    public final S D;
    public final AppMeasurementDynamiteService E;
    
    public final void run() {
        switch (this.C) {
            default: {
                final AppMeasurementDynamiteService e = this.E;
                final J1 n = e.C.N;
                n0.c(n);
                final n0 c = e.C;
                n.W(this.D, c.c0 != null && c.c0);
                return;
            }
            case 0: {
                final b1 e2 = a.e(this.E.C);
                e2.E((Runnable)new v((Object)e2, (Object)e2.O(false), (Object)this.D, 9, false));
            }
        }
    }
}

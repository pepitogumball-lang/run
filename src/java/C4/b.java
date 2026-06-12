package c4;

import O2.t;
import com.google.android.gms.internal.ads.PD;
import com.google.android.gms.internal.ads.UD;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n3.u0;
import o.q1;
import com.google.android.gms.internal.ads.Mj;
import R0.m;
import com.google.android.gms.internal.ads.rF;
import com.google.android.gms.internal.ads.Sb;
import com.google.android.gms.internal.ads.fD;
import com.google.android.gms.internal.ads.co;

public final class b implements Runnable
{
    public final int C;
    public final int D;
    public final long E;
    public final Object F;
    
    public final void run() {
        switch (this.C) {
            default: {
                final int a = co.a;
                final UD t = ((fD)((Sb)this.F).E).C.T;
                final PD j = t.j((rF)t.d.G);
                t.i(j, 1018, (Mj)new m(j, this.D, this.E));
                return;
            }
            case 0: {
                final q1 q1 = (q1)this.F;
                int d = this.D;
                final long e = this.E;
                final q1 q2;
                monitorenter(q2 = q1);
                --d;
                try {
                    final t c = ((i)q1.E).c(3 - d);
                    final O2.i b = ((c)q1.F).b();
                    u0.B(new O2.i[] { (O2.i)c, b }).e((Executor)q1.H, (O2.a)new a(q1, c, b, e, d));
                    return;
                }
                finally {
                    monitorexit(q2);
                }
                break;
            }
        }
    }
}

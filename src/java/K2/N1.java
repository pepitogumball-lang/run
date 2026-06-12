package K2;

import android.os.Handler;
import b1.f;
import com.google.android.gms.internal.measurement.K1;

public final class n1 implements Runnable
{
    public final int C;
    public final long D;
    public final l1 E;
    
    public final void run() {
        switch (this.C) {
            default: {
                final l1 e = this.E;
                e.v();
                e.C();
                final P j = e.j();
                final long d = this.D;
                j.P.g("Activity resumed, time", d);
                final n0 n0 = (n0)e.C;
                final boolean g = n0.I.G(null, w.N0);
                final d i = n0.I;
                final p1 h = e.H;
                if (g) {
                    if (i.I() || e.F) {
                        ((l1)h.F).v();
                        ((q1)h.E).a();
                        h.C = d;
                        h.D = d;
                    }
                }
                else if (i.I() || e.t().V.b()) {
                    ((l1)h.F).v();
                    ((q1)h.E).a();
                    h.C = d;
                    h.D = d;
                }
                final K1 k = e.I;
                final l1 l1 = (l1)k.E;
                l1.v();
                final o1 o1 = (o1)k.D;
                if (o1 != null) {
                    ((Handler)l1.E).removeCallbacks((Runnable)o1);
                }
                l1.t().V.a(false);
                l1.v();
                l1.F = false;
                if (((n0)l1.C).I.G(null, w.K0) && l1.w().O) {
                    l1.j().P.f("Retrying trigger URI registration in foreground");
                    l1.w().V();
                }
                final f g2 = e.G;
                ((l1)g2.D).v();
                final l1 l2 = (l1)g2.D;
                if (((n0)l2.C).g()) {
                    ((n0)l2.C).P.getClass();
                    g2.q(System.currentTimeMillis(), false);
                }
                return;
            }
            case 0: {
                final l1 e2 = this.E;
                e2.v();
                e2.C();
                final P m = e2.j();
                final long d2 = this.D;
                m.P.g("Activity paused, time", d2);
                final K1 i2 = e2.I;
                final l1 l3 = (l1)i2.E;
                ((n0)l3.C).P.getClass();
                final o1 d3 = new o1(i2, System.currentTimeMillis(), d2);
                i2.D = d3;
                ((Handler)l3.E).postDelayed((Runnable)d3, 2000L);
                if (((n0)e2.C).I.I()) {
                    ((q1)e2.H.E).a();
                }
            }
        }
    }
}

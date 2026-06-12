package K2;

import C2.h;
import com.google.android.gms.internal.measurement.K1;

public final class o1 implements Runnable
{
    public final long C;
    public final long D;
    public final K1 E;
    
    public o1(final K1 e, final long c, final long d) {
        this.E = e;
        this.C = c;
        this.D = d;
    }
    
    public final void run() {
        final k0 l = ((l1)this.E.E).l();
        final h h = new h(11);
        h.D = this;
        l.E((Runnable)h);
    }
}

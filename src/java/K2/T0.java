package K2;

import com.google.android.gms.measurement.internal.zzic;
import java.util.List;
import android.os.Bundle;

public final class t0 implements Runnable
{
    public final int C;
    public final Object D;
    public final Object E;
    public final long F;
    public final Object G;
    public final Object H;
    
    public final void run() {
        switch (this.C) {
            default: {
                final Bundle bundle = (Bundle)this.D;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                final X0 x0 = (X0)this.H;
                x0.E((Y0)this.E, (Y0)this.G, this.F, true, x0.u().G("screen_view", bundle, null, false));
                return;
            }
            case 1: {
                ((H0)this.H).D(this.F, this.G, (String)this.D, (String)this.E);
                return;
            }
            case 0: {
                final String s = (String)this.E;
                final zzic zzic = (zzic)this.H;
                final String s2 = (String)this.D;
                if (s2 == null) {
                    final y1 c = zzic.C;
                    c.l().v();
                    final String h0 = c.h0;
                    if (h0 == null || h0.equals((Object)s)) {
                        c.h0 = s;
                        c.g0 = null;
                    }
                }
                else {
                    final Y0 g0 = new Y0((String)this.G, s2, this.F);
                    final y1 c2 = zzic.C;
                    c2.l().v();
                    final String h2 = c2.h0;
                    if (h2 != null) {
                        h2.equals((Object)s);
                    }
                    c2.h0 = s;
                    c2.g0 = g0;
                }
            }
        }
    }
}

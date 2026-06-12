package X3;

import java.util.List;
import Z3.w;
import com.google.protobuf.t;
import com.google.android.gms.internal.auth.h;
import java.util.Random;
import K2.D;
import I1.z;
import android.content.Context;
import P3.a;

public final class d
{
    public final a a;
    public final double b;
    public final double c;
    public final c d;
    public final c e;
    
    public d(final Context context, final z z) {
        final D d = new D(18);
        final double nextDouble = new Random().nextDouble();
        final double nextDouble2 = new Random().nextDouble();
        final a e = P3.a.e();
        this.d = null;
        this.e = null;
        final boolean b = false;
        if (0.0 > nextDouble || nextDouble >= 1.0) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        int n = b ? 1 : 0;
        if (0.0 <= nextDouble2) {
            n = (b ? 1 : 0);
            if (nextDouble2 < 1.0) {
                n = 1;
            }
        }
        if (n != 0) {
            this.b = nextDouble;
            this.c = nextDouble2;
            this.a = e;
            this.d = new c(z, d, e, "Trace");
            this.e = new c(z, d, e, "Network");
            h.s(context);
            return;
        }
        throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
    }
    
    public static boolean a(final t t) {
        final int size = ((List)t).size();
        boolean b2;
        final boolean b = b2 = false;
        if (size > 0) {
            b2 = b;
            if (((w)((List)t).get(0)).x() > 0) {
                b2 = b;
                if (((w)((List)t).get(0)).w() == 2) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
}

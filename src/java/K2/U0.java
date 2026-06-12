package K2;

import com.google.android.gms.measurement.internal.zzic;
import java.util.concurrent.Callable;

public final class u0 implements Callable
{
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final zzic e;
    
    public final Object call() {
        switch (this.a) {
            default: {
                final zzic e = this.e;
                e.C.e0();
                final h e2 = e.C.E;
                y1.r(e2);
                return e2.O(this.b, this.c, this.d);
            }
            case 2: {
                final zzic e3 = this.e;
                e3.C.e0();
                final h e4 = e3.C.E;
                y1.r(e4);
                return e4.O(this.b, this.c, this.d);
            }
            case 1: {
                final zzic e5 = this.e;
                e5.C.e0();
                final h e6 = e5.C.E;
                y1.r(e6);
                return e6.m0(this.b, this.c, this.d);
            }
            case 0: {
                final zzic e7 = this.e;
                e7.C.e0();
                final h e8 = e7.C.E;
                y1.r(e8);
                return e8.m0(this.b, this.c, this.d);
            }
        }
    }
}

package P1;

import com.google.android.gms.internal.ads.pd;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.ki;
import com.google.android.gms.internal.ads.y7;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.FC;
import com.google.android.gms.internal.ads.GC;

public final class l implements GC
{
    public final int a;
    public final FC b;
    public final FC c;
    public final FC d;
    
    public final Object d() {
        switch (this.a) {
            default: {
                return new q((j)this.b.d(), (int)this.c.d(), (String)this.d.d());
            }
            case 0: {
                Object o = this.b.d();
                final q q = (q)this.c.d();
                final pd a = rd.a;
                y7.H((Object)a);
                if ((int)this.d.d() == 2) {
                    o = q;
                }
                return new ki(o, (Executor)a);
            }
        }
    }
}

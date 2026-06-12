package P1;

import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.nl;
import android.os.Binder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.internal.ads.Av;
import com.google.android.gms.internal.ads.ul;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.ads.G4;
import com.google.android.gms.internal.ads.pd;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.kl;
import I1.M;
import E1.o;
import com.google.android.gms.internal.ads.ic;
import V2.q;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.sv;

public final class n implements sv
{
    public final Iv a;
    public final F1.n b;
    
    public n(final Iv a, final F1.n b) {
        this.a = a;
        this.b = b;
    }
    
    public final q k(final Object o) {
        final ic ic = (ic)o;
        final F1.n b = this.b;
        final String f = ic.F;
        final M c = o.B.c;
        Object o2;
        if (M.d(f)) {
            o2 = F7.r0((Throwable)new kl(1));
        }
        else if (F1.q.d.c.a(D7.i7)) {
            o2 = ((pd)b.F).b((Callable)new G4((Object)b, 6, (Object)ic));
        }
        else {
            o2 = ((ul)b.G).c(ic);
        }
        return (q)F7.F0((q)F7.m0((q)F7.G0((q)Av.s((q)o2), (long)(int)F1.q.d.c.a(D7.r5), TimeUnit.SECONDS, (ScheduledExecutorService)b.D), (Class)Throwable.class, (sv)new nl((Object)b, ic, Binder.getCallingUid(), 1), (Executor)b.E), (sv)new e(ic, 2), (Executor)this.a);
    }
}

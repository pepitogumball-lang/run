package y1;

import java.util.concurrent.Executor;
import android.os.RemoteException;
import J1.j;
import F1.O0;
import J1.c;
import F1.q;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.internal.ads.D7;
import F1.v0;
import F1.y;
import android.content.Context;

public final class e
{
    public final Context a;
    public final y b;
    
    public e(final Context a, final y b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final v0 v0) {
        final Context a = this.a;
        D7.a(a);
        if (d8.c.p()) {
            if (q.d.c.a(D7.Sa)) {
                ((Executor)c.b).execute((Runnable)new j0.c(4, (Object)this, (Object)v0, false));
                return;
            }
        }
        try {
            this.b.C2(O0.a(a, v0));
        }
        catch (final RemoteException ex) {
            j.g("Failed to load ad.", (Throwable)ex);
        }
    }
}

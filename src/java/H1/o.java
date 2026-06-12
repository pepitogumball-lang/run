package h1;

import android.os.BaseBundle;
import com.google.android.gms.internal.auth.m;
import L4.g;
import com.google.android.gms.internal.play_billing.f1;
import com.google.android.gms.internal.play_billing.q0;
import android.os.Bundle;
import android.os.Handler;
import E4.b;
import android.os.ResultReceiver;

public final class o extends ResultReceiver
{
    public final b C;
    public final h1.b D;
    
    public o(final h1.b d, final Handler handler, final b c) {
        this.C = c;
        this.D = d;
        super(handler);
    }
    
    public final void onReceiveResult(int a, final Bundle bundle) {
        final e a2 = f.a();
        a2.a = a;
        final b c = this.C;
        if (a != 0) {
            final h1.b d = this.D;
            if (bundle == null) {
                d.G(c, E.i, 73, null);
                return;
            }
            a2.b = q0.e("BillingClient", bundle);
            a = ((BaseBundle)bundle).getInt("INTERNAL_LOG_ERROR_REASON");
            if (a != 0) {
                a = f1.o(a);
            }
            else {
                a = 23;
            }
            d.r(h1.C.c(a, 16, a2.a(), ((BaseBundle)bundle).getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
        }
        ((g)c.D).success((Object)m.m(a2.a()));
    }
}

package c2;

import com.google.android.gms.common.api.Status;
import f2.c;
import X1.a;
import h2.A;
import g2.q;
import com.google.android.gms.common.api.internal.BasePendingResult;

public abstract class i extends BasePendingResult
{
    public i(final q q) {
        A.i("GoogleApiClient must not be null", (Object)q);
        super(q);
        A.i("Api must not be null", (Object)a.a);
    }
    
    public abstract void N(final c p0);
    
    public final void O(final Status status) {
        A.a("Failed result must not be success", status.h() ^ true);
        this.K(this.H(status));
    }
}

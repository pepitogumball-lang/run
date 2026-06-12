package f2;

import g2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class n extends BasePendingResult
{
    public final Status p;
    
    public n(final Status p) {
        super((q)null);
        this.p = p;
    }
    
    public final l H(final Status status) {
        return (l)this.p;
    }
}

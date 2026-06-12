package f2;

import com.google.android.gms.common.api.Status;
import g2.q;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class o extends BasePendingResult
{
    public final int p;
    
    public final l H(final Status status) {
        switch (this.p) {
            default: {
                return (l)status;
            }
            case 0: {
                throw new UnsupportedOperationException("Creating failed results is not supported");
            }
        }
    }
}

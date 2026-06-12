package g2;

import f2.l;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.auth.m;

public final class i extends m
{
    public final BasePendingResult f;
    
    public i(final BasePendingResult f) {
        this.f = f;
    }
    
    public final l b(final TimeUnit timeUnit) {
        return this.f.b(timeUnit);
    }
}

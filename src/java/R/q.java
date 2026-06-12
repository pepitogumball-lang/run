package r;

import android.os.Binder;
import android.os.Looper;
import android.os.IInterface;
import b.f;
import android.os.Handler;
import android.support.customtabs.IEngagementSignalsCallback$Stub;

public final class q extends IEngagementSignalsCallback$Stub
{
    public final Handler C;
    public final s D;
    
    public q(final s d) {
        this.D = d;
        ((Binder)this).attachInterface((IInterface)this, f.i);
        this.C = new Handler(Looper.getMainLooper());
    }
}

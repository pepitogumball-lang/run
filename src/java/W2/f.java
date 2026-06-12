package w2;

import android.os.Binder;
import android.os.IInterface;
import O2.j;
import com.google.android.gms.internal.appset.zze;

public final class f extends zze
{
    public final j C;
    
    public f(final j c) {
        this.C = c;
        ((Binder)this).attachInterface((IInterface)this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}

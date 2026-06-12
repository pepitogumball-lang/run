package r;

import android.os.Binder;
import android.os.Looper;
import android.os.IInterface;
import b.b;
import android.os.Handler;
import android.support.customtabs.ICustomTabsCallback$Stub;

public final class f extends ICustomTabsCallback$Stub
{
    public final Handler C;
    public final a D;
    
    public f(final a d) {
        this.D = d;
        ((Binder)this).attachInterface((IInterface)this, b.g);
        this.C = new Handler(Looper.getMainLooper());
    }
}

package h1;

import android.os.BaseBundle;
import com.google.android.gms.internal.play_billing.q0;
import L3.g;
import V4.G;
import android.content.Context;
import X2.b;

public final class a
{
    public volatile b a;
    public final Context b = b;
    public volatile G c;
    public volatile g d;
    public volatile boolean e;
    
    public final boolean a() {
        final Context b = this.b;
        try {
            return ((BaseBundle)b.getPackageManager().getApplicationInfo(b.getPackageName(), 128).metaData).getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        }
        catch (final Exception ex) {
            q0.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", (Throwable)ex);
            return false;
        }
    }
}

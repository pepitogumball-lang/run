package K2;

import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.internal.measurement.T;

public final class a implements D0
{
    public final T a;
    public final AppMeasurementDynamiteService b;
    
    public a(final AppMeasurementDynamiteService b, final T a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final long n, final Bundle bundle, final String s, final String s2) {
        try {
            this.a.H2(n, bundle, s, s2);
        }
        catch (final RemoteException ex) {
            final n0 c = this.b.C;
            if (c != null) {
                final P k = c.K;
                n0.f(k);
                k.K.g("Event listener threw exception", ex);
            }
        }
    }
}

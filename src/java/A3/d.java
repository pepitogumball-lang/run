package a3;

import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.zzdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

public final class d implements Callable
{
    public final int a;
    public final FirebaseAnalytics b;
    
    public final Object call() {
        switch (this.a) {
            default: {
                final e0 a = this.b.a;
                a.getClass();
                final zzdk zzdk = new zzdk();
                a.f((b0)new o0(a, zzdk, 6));
                return zzdk.e0(120000L);
            }
            case 0: {
                final e0 a2 = this.b.a;
                a2.getClass();
                final zzdk zzdk2 = new zzdk();
                a2.f((b0)new o0(a2, zzdk2, 5));
                return zzdk.zza(zzdk2.T(120000L), (Class)Long.class);
            }
        }
    }
}

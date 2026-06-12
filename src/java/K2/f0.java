package K2;

import com.google.android.gms.internal.measurement.H;
import V2.o;
import com.google.android.gms.internal.measurement.zzby;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

public final class f0 implements ServiceConnection
{
    public final String C;
    public final e0 D;
    
    public f0(final e0 d, final String c) {
        this.D = d;
        this.C = c;
    }
    
    public final void onServiceConnected(ComponentName d, final IBinder binder) {
        d = (ComponentName)this.D;
        if (binder == null) {
            final P k = ((e0)d).a.K;
            n0.f(k);
            k.K.f("Install Referrer connection returned with null binder");
            return;
        }
        Label_0119: {
            H zza;
            try {
                zza = zzby.zza(binder);
                if (zza == null) {
                    final P i = ((e0)d).a.K;
                    n0.f(i);
                    i.K.f("Install Referrer Service implementation was not found");
                    return;
                }
            }
            catch (final RuntimeException ex) {
                break Label_0119;
            }
            final P j = ((e0)d).a.K;
            n0.f(j);
            j.P.f("Install Referrer Service connected");
            final k0 l = ((e0)d).a.L;
            n0.f(l);
            l.E((Runnable)new o(this, zza, this));
            return;
        }
        final P m = ((e0)d).a.K;
        n0.f(m);
        final RuntimeException ex;
        m.K.g("Exception occurred while calling Install Referrer API", ex);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        final P k = this.D.a.K;
        n0.f(k);
        k.P.f("Install Referrer Service disconnected");
    }
}

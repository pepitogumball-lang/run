package Y0;

import R0.m;
import com.google.android.gms.internal.ads.Z4;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.hr;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

public final class e extends ConnectivityManager$NetworkCallback
{
    public final int a;
    public final Object b;
    
    public void onAvailable(final Network network) {
        switch (this.a) {
            default: {
                super.onAvailable(network);
                return;
            }
            case 3: {
                hr.b((hr)this.b, true);
                return;
            }
            case 2: {
                ((kd)this.b).o.set(true);
            }
        }
    }
    
    public void onCapabilitiesChanged(final Network network, final NetworkCapabilities d) {
        switch (this.a) {
            default: {
                super.onCapabilitiesChanged(network, d);
                return;
            }
            case 1: {
                synchronized (Z4.class) {
                    ((Z4)this.b).D = d;
                }
            }
            case 0: {
                final m e = m.e();
                final String i = f.i;
                final StringBuilder sb = new StringBuilder("Network capabilities changed: ");
                sb.append((Object)d);
                e.c(i, sb.toString(), new Throwable[0]);
                final f f = (f)this.b;
                f.c(f.f());
            }
        }
    }
    
    public final void onLost(final Network network) {
        switch (this.a) {
            default: {
                hr.b((hr)this.b, false);
                return;
            }
            case 2: {
                ((kd)this.b).o.set(false);
                return;
            }
            case 1: {
                synchronized (Z4.class) {
                    ((Z4)this.b).D = null;
                }
            }
            case 0: {
                m.e().c(f.i, "Network connection lost", new Throwable[0]);
                final f f = (f)this.b;
                f.c(f.f());
            }
        }
    }
}

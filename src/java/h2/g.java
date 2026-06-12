package h2;

import e2.b;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import android.os.Bundle;
import android.os.IBinder;

public final class G extends w
{
    public final IBinder g;
    public final d h;
    
    public G(final d h, final int n, final IBinder g, final Bundle bundle) {
        Objects.requireNonNull((Object)h);
        super(this.h = h, n, bundle);
        this.g = g;
    }
    
    @Override
    public final boolean a() {
        final IBinder g = this.g;
        try {
            A.h(g);
            final String interfaceDescriptor = g.getInterfaceDescriptor();
            final d h = this.h;
            if (!h.n().equals((Object)interfaceDescriptor)) {
                final String n = h.n();
                final StringBuilder sb = new StringBuilder(n.length() + 34 + String.valueOf((Object)interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(n);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            final IInterface e = h.e(g);
            if (e != null && (h.t(2, 4, e) || h.t(3, 4, e))) {
                h.u = null;
                final a o = h.o;
                if (o != null) {
                    o.T();
                }
                return true;
            }
            return false;
        }
        catch (final RemoteException ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
    
    @Override
    public final void b(final b b) {
        final h2.b p = this.h.p;
        if (p != null) {
            p.e0(b);
        }
        System.currentTimeMillis();
    }
}

package Y0;

import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.ConnectivityManager$NetworkCallback;
import d1.a;
import android.content.Context;
import R0.m;
import android.net.ConnectivityManager;

public final class f extends d
{
    public static final String i;
    public final ConnectivityManager g;
    public final e h;
    
    static {
        i = m.h("NetworkStateTracker");
    }
    
    public f(final Context context, final a a) {
        super(context, a);
        this.g = (ConnectivityManager)super.b.getSystemService("connectivity");
        this.h = new e(this, 0);
    }
    
    @Override
    public final Object a() {
        return this.f();
    }
    
    @Override
    public final void d() {
        final String i = f.i;
        try {
            m.e().c(i, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)this.h);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalArgumentException ex2) {}
        final SecurityException ex;
        m.e().d(i, "Received exception while registering network callback", new Throwable[] { (Throwable)ex });
    }
    
    @Override
    public final void e() {
        final String i = f.i;
        try {
            m.e().c(i, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback((ConnectivityManager$NetworkCallback)this.h);
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalArgumentException ex2) {}
        final SecurityException ex;
        m.e().d(i, "Received exception while unregistering network callback", new Throwable[] { (Throwable)ex });
    }
    
    public final W0.a f() {
        final ConnectivityManager g = this.g;
        final NetworkInfo activeNetworkInfo = g.getActiveNetworkInfo();
        final boolean b = false;
        boolean a;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            a = true;
        }
        else {
            a = false;
        }
        boolean b2 = false;
        Label_0094: {
            try {
                final NetworkCapabilities networkCapabilities = g.getNetworkCapabilities(g.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    b2 = true;
                    break Label_0094;
                }
            }
            catch (final SecurityException ex) {
                m.e().d(f.i, "Unable to validate active network", new Throwable[] { (Throwable)ex });
            }
            b2 = false;
        }
        final boolean activeNetworkMetered = g.isActiveNetworkMetered();
        boolean d = b;
        if (activeNetworkInfo != null) {
            d = b;
            if (!activeNetworkInfo.isRoaming()) {
                d = true;
            }
        }
        final Object o = new Object();
        ((W0.a)o).a = a;
        ((W0.a)o).b = b2;
        ((W0.a)o).c = activeNetworkMetered;
        ((W0.a)o).d = d;
        return (W0.a)o;
    }
}

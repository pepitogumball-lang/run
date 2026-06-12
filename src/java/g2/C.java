package g2;

import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import java.util.Iterator;
import android.content.ComponentCallbacks;
import android.app.Application;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

public final class c implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public static final c G;
    public final AtomicBoolean C;
    public final AtomicBoolean D;
    public final ArrayList E;
    public boolean F;
    
    static {
        G = new c();
    }
    
    public c() {
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.E = new ArrayList();
        this.F = false;
    }
    
    public static void b(final Application application) {
        final c g = c.G;
        final c c;
        monitorenter(c = g);
        Label_0037: {
            try {
                if (!g.F) {
                    application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)g);
                    application.registerComponentCallbacks((ComponentCallbacks)g);
                    g.F = true;
                }
                break Label_0037;
            }
            finally {
                monitorexit(c);
                monitorexit(c);
            }
        }
    }
    
    public final void a(final b b) {
        final c g = c.G;
        synchronized (g) {
            this.E.add((Object)b);
        }
    }
    
    public final void c(final boolean b) {
        final c g;
        monitorenter(g = c.G);
        Label_0048: {
            try {
                final Iterator iterator = this.E.iterator();
                while (iterator.hasNext()) {
                    ((b)iterator.next()).a(b);
                }
                break Label_0048;
            }
            finally {
                monitorexit(g);
                monitorexit(g);
            }
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final AtomicBoolean d = this.D;
        final boolean compareAndSet = this.C.compareAndSet(true, false);
        d.set(true);
        if (compareAndSet) {
            this.c(false);
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        final AtomicBoolean d = this.D;
        final boolean compareAndSet = this.C.compareAndSet(true, false);
        d.set(true);
        if (compareAndSet) {
            this.c(false);
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        if (n == 20 && this.C.compareAndSet(false, true)) {
            this.D.set(true);
            this.c(true);
        }
    }
}

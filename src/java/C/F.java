package C;

import android.util.Log;
import V2.o;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

public final class f implements Application$ActivityLifecycleCallbacks
{
    public Object C;
    public Activity D;
    public final int E;
    public boolean F;
    public boolean G;
    public boolean H;
    
    public f(final Activity d) {
        this.F = false;
        this.G = false;
        this.H = false;
        this.D = d;
        this.E = d.hashCode();
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        if (this.D == activity) {
            this.D = null;
            this.G = true;
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        if (this.G && !this.H && !this.F) {
            final Object c = this.C;
            try {
                final Object value = g.c.get((Object)activity);
                if (value == c) {
                    if (activity.hashCode() == this.E) {
                        g.g.postAtFrontOfQueue((Runnable)new o(g.b.get((Object)activity), 4, value));
                        this.H = true;
                        this.C = null;
                    }
                }
            }
            finally {
                final Throwable t;
                Log.e("ActivityRecreator", "Exception while fetching field values", t);
            }
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        if (this.D == activity) {
            this.F = true;
        }
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}

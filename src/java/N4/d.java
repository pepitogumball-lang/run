package n4;

import android.content.Context;
import android.app.Application;
import android.os.Bundle;
import android.app.Activity;
import androidx.lifecycle.t;
import io.flutter.embedding.android.FlutterActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import android.app.Application$ActivityLifecycleCallbacks;

public final class d implements Application$ActivityLifecycleCallbacks, DefaultLifecycleObserver
{
    public final FlutterActivity C;
    
    public d(final FlutterActivity c) {
        this.C = c;
    }
    
    public final void a(final t t) {
    }
    
    public final void b(final t t) {
        this.onActivityDestroyed((Activity)this.C);
    }
    
    public final void c(final t t) {
    }
    
    public final void e(final t t) {
    }
    
    public final void f(final t t) {
    }
    
    public final void g(final t t) {
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        if (this.C == activity && ((Context)activity).getApplicationContext() != null) {
            ((Application)((Context)activity).getApplicationContext()).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}

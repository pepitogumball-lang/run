package r;

import android.support.customtabs.ICustomTabsService$Stub;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class n implements ServiceConnection
{
    private Context mApplicationContext;
    
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }
    
    public abstract void onCustomTabsServiceConnected(final ComponentName p0, final g p1);
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (this.mApplicationContext != null) {
            this.onCustomTabsServiceConnected(componentName, new g(ICustomTabsService$Stub.asInterface(binder), componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
    
    public void setApplicationContext(final Context mApplicationContext) {
        this.mApplicationContext = mApplicationContext;
    }
}

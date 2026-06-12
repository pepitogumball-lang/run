package e2;

import java.util.concurrent.BlockingQueue;
import android.content.ComponentName;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import h2.A;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import android.content.ServiceConnection;

public final class a implements ServiceConnection
{
    public boolean C;
    public final LinkedBlockingQueue D;
    
    public a() {
        this.C = false;
        this.D = new LinkedBlockingQueue();
    }
    
    public final IBinder a() {
        A.g("BlockingServiceConnection.getService() called on main thread");
        if (!this.C) {
            this.C = true;
            return (IBinder)this.D.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }
    
    public final IBinder b(final TimeUnit timeUnit) {
        A.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.C) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.C = true;
        final IBinder binder = (IBinder)this.D.poll(10000L, timeUnit);
        if (binder != null) {
            return binder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        ((BlockingQueue)this.D).add((Object)binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}

package O3;

import java.util.HashSet;
import Z3.i;
import java.lang.ref.WeakReference;

public abstract class d implements b
{
    private final WeakReference<b> appStateCallback;
    private final c appStateMonitor;
    private i currentAppState;
    private boolean isRegisteredForAppState;
    
    public d(final c appStateMonitor) {
        this.isRegisteredForAppState = false;
        this.currentAppState = i.D;
        this.appStateMonitor = appStateMonitor;
        this.appStateCallback = (WeakReference<b>)new WeakReference((Object)this);
    }
    
    public i getAppState() {
        return this.currentAppState;
    }
    
    public WeakReference<b> getAppStateCallback() {
        return this.appStateCallback;
    }
    
    public void incrementTsnsCount(final int n) {
        this.appStateMonitor.J.addAndGet(n);
    }
    
    @Override
    public void onUpdateAppState(final i currentAppState) {
        final i currentAppState2 = this.currentAppState;
        final i d = i.D;
        if (currentAppState2 == d) {
            this.currentAppState = currentAppState;
        }
        else if (currentAppState2 != currentAppState && currentAppState != d) {
            this.currentAppState = i.G;
        }
    }
    
    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        final c appStateMonitor = this.appStateMonitor;
        this.currentAppState = appStateMonitor.Q;
        final WeakReference<b> appStateCallback = this.appStateCallback;
        final HashSet h = appStateMonitor.H;
        synchronized (h) {
            appStateMonitor.H.add((Object)appStateCallback);
            monitorexit(h);
            this.isRegisteredForAppState = true;
        }
    }
    
    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        final c appStateMonitor = this.appStateMonitor;
        final WeakReference<b> appStateCallback = this.appStateCallback;
        final HashSet h = appStateMonitor.H;
        synchronized (h) {
            appStateMonitor.H.remove((Object)appStateCallback);
            monitorexit(h);
            this.isRegisteredForAppState = false;
        }
    }
}

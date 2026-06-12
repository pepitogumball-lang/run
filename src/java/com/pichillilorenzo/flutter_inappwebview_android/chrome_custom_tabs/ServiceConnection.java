package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import java.lang.ref.Reference;
import r.g;
import android.content.ComponentName;
import java.lang.ref.WeakReference;
import r.n;

public class ServiceConnection extends n
{
    private WeakReference<ServiceConnectionCallback> mConnectionCallback;
    
    public ServiceConnection(final ServiceConnectionCallback serviceConnectionCallback) {
        this.mConnectionCallback = (WeakReference<ServiceConnectionCallback>)new WeakReference((Object)serviceConnectionCallback);
    }
    
    @Override
    public void onCustomTabsServiceConnected(final ComponentName componentName, final g g) {
        final ServiceConnectionCallback serviceConnectionCallback = (ServiceConnectionCallback)((Reference)this.mConnectionCallback).get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceConnected(g);
        }
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        final ServiceConnectionCallback serviceConnectionCallback = (ServiceConnectionCallback)((Reference)this.mConnectionCallback).get();
        if (serviceConnectionCallback != null) {
            serviceConnectionCallback.onServiceDisconnected();
        }
    }
}

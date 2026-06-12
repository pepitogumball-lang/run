package org.chromium.support_lib_boundary;

import android.os.CancellationSignal;
import android.webkit.WebStorage;
import android.webkit.ServiceWorkerController;
import android.webkit.GeolocationPermissions;
import android.webkit.CookieManager;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;

public interface ProfileBoundaryInterface
{
    void clearPrefetch(final String p0, final Executor p1, final InvocationHandler p2);
    
    CookieManager getCookieManager();
    
    GeolocationPermissions getGeoLocationPermissions();
    
    String getName();
    
    ServiceWorkerController getServiceWorkerController();
    
    WebStorage getWebStorage();
    
    void prefetchUrl(final String p0, final CancellationSignal p1, final Executor p2, final InvocationHandler p3);
    
    void prefetchUrl(final String p0, final CancellationSignal p1, final Executor p2, final InvocationHandler p3, final InvocationHandler p4);
    
    void setSpeculativeLoadingConfig(final InvocationHandler p0);
}

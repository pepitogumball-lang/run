package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;

public interface WebViewProviderFactoryBoundaryInterface
{
    public static final String MULTI_COOKIE_HEADER_NAME = "\u0000Set-Cookie-Multivalue\u0000";
    public static final String MULTI_COOKIE_VALUE_SEPARATOR = "\u0000";
    
    InvocationHandler createWebView(final WebView p0);
    
    InvocationHandler getDropDataProvider();
    
    InvocationHandler getProfileStore();
    
    InvocationHandler getProxyController();
    
    InvocationHandler getServiceWorkerController();
    
    InvocationHandler getStatics();
    
    String[] getSupportedFeatures();
    
    InvocationHandler getTracingController();
    
    InvocationHandler getWebViewBuilder();
    
    InvocationHandler getWebkitToCompatConverter();
    
    void startUpWebView(final InvocationHandler p0, final InvocationHandler p1);
}

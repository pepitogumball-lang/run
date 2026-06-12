package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

public interface WebViewNavigationClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface
{
    void onFirstContentfulPaint(final InvocationHandler p0);
    
    void onNavigationCompleted(final InvocationHandler p0);
    
    void onNavigationRedirected(final InvocationHandler p0);
    
    void onNavigationStarted(final InvocationHandler p0);
    
    void onPageDOMContentLoadedEventFired(final InvocationHandler p0);
    
    void onPageDeleted(final InvocationHandler p0);
    
    void onPageLoadEventFired(final InvocationHandler p0);
}

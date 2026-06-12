package org.chromium.support_lib_boundary;

import android.os.Bundle;
import android.webkit.ValueCallback;
import java.util.concurrent.Executor;
import android.os.CancellationSignal;
import android.net.Uri;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import java.lang.reflect.InvocationHandler;

public interface WebViewProviderBoundaryInterface
{
    InvocationHandler addDocumentStartJavaScript(final String p0, final String[] p1);
    
    void addWebMessageListener(final String p0, final String[] p1, final InvocationHandler p2);
    
    InvocationHandler[] createWebMessageChannel();
    
    InvocationHandler getProfile();
    
    WebChromeClient getWebChromeClient();
    
    WebViewClient getWebViewClient();
    
    InvocationHandler getWebViewNavigationClient();
    
    InvocationHandler getWebViewRenderer();
    
    InvocationHandler getWebViewRendererClient();
    
    void insertVisualStateCallback(final long p0, final InvocationHandler p1);
    
    boolean isAudioMuted();
    
    void postMessageToMainFrame(final InvocationHandler p0, final Uri p1);
    
    void prerenderUrl(final String p0, final CancellationSignal p1, final Executor p2, final ValueCallback<Void> p3, final ValueCallback<Throwable> p4);
    
    void prerenderUrl(final String p0, final CancellationSignal p1, final Executor p2, final InvocationHandler p3, final ValueCallback<Void> p4, final ValueCallback<Throwable> p5);
    
    void removeWebMessageListener(final String p0);
    
    void saveState(final Bundle p0, final int p1, final boolean p2);
    
    void setAudioMuted(final boolean p0);
    
    void setProfile(final String p0);
    
    void setWebViewNavigationClient(final InvocationHandler p0);
    
    void setWebViewRendererClient(final InvocationHandler p0);
}

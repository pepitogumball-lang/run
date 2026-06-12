package com.pichillilorenzo.flutter_inappwebview_android.webview;

import F4.o;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import android.net.Uri;
import android.webkit.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import android.os.Looper;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import android.webkit.WebView$HitTestResult;
import java.util.HashMap;
import android.content.Context;
import android.net.http.SslCertificate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;

public interface InAppWebViewInterface
{
    void addWebMessageListener(final WebMessageListener p0);
    
    void callAsyncJavaScript(final String p0, final Map<String, Object> p1, final ContentWorld p2, final ValueCallback<String> p3);
    
    boolean canGoBack();
    
    boolean canGoBackOrForward(final int p0);
    
    boolean canGoForward();
    
    boolean canScrollHorizontally();
    
    boolean canScrollVertically();
    
    void clearAllCache();
    
    void clearFocus();
    
    void clearHistory();
    
    void clearMatches();
    
    void clearSslPreferences();
    
    WebMessageChannel createCompatWebMessageChannel();
    
    WebMessageChannel createWebMessageChannel(final ValueCallback<WebMessageChannel> p0);
    
    void disposeWebMessageChannels();
    
    void disposeWebMessageListeners();
    
    void evaluateJavascript(final String p0, final ContentWorld p1, final ValueCallback<String> p2);
    
    void findAllAsync(final String p0);
    
    void findNext(final boolean p0);
    
    SslCertificate getCertificate();
    
    WebViewChannelDelegate getChannelDelegate();
    
    int getContentHeight();
    
    void getContentHeight(final ValueCallback<Integer> p0);
    
    void getContentWidth(final ValueCallback<Integer> p0);
    
    Context getContext();
    
    Map<String, Object> getContextMenu();
    
    HashMap<String, Object> getCopyBackForwardList();
    
    Map<String, Object> getCustomSettings();
    
    WebView$HitTestResult getHitTestResult();
    
    void getHitTestResult(final ValueCallback<HitTestResult> p0);
    
    InAppBrowserDelegate getInAppBrowserDelegate();
    
    String getOriginalUrl();
    
    InAppWebViewFlutterPlugin getPlugin();
    
    int getProgress();
    
    int getScrollX();
    
    int getScrollY();
    
    void getSelectedText(final ValueCallback<String> p0);
    
    String getTitle();
    
    String getUrl();
    
    UserContentController getUserContentController();
    
    Map<String, WebMessageChannel> getWebMessageChannels();
    
    Looper getWebViewLooper();
    
    float getZoomScale();
    
    void getZoomScale(final ValueCallback<Float> p0);
    
    void goBack();
    
    void goBackOrForward(final int p0);
    
    void goForward();
    
    void injectCSSCode(final String p0);
    
    void injectCSSFileFromUrl(final String p0, final Map<String, Object> p1);
    
    void injectJavascriptFileFromUrl(final String p0, final Map<String, Object> p1);
    
    boolean isInFullscreen();
    
    boolean isLoading();
    
    void isSecureContext(final ValueCallback<Boolean> p0);
    
    void loadDataWithBaseURL(final String p0, final String p1, final String p2, final String p3, final String p4);
    
    void loadFile(final String p0);
    
    void loadUrl(final URLRequest p0);
    
    void onPause();
    
    void onResume();
    
    boolean pageDown(final boolean p0);
    
    boolean pageUp(final boolean p0);
    
    void pauseTimers();
    
    void postUrl(final String p0, final byte[] p1);
    
    void postWebMessage(final WebMessage p0, final Uri p1);
    
    void postWebMessage(final com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage p0, final Uri p1, final ValueCallback<String> p2);
    
    String printCurrentPage(final PrintJobSettings p0);
    
    void reload();
    
    Map<String, Object> requestFocusNodeHref();
    
    Map<String, Object> requestImageRef();
    
    void resumeTimers();
    
    void saveWebArchive(final String p0, final boolean p1, final ValueCallback<String> p2);
    
    void scrollBy(final Integer p0, final Integer p1, final Boolean p2);
    
    void scrollTo(final Integer p0, final Integer p1, final Boolean p2);
    
    void setChannelDelegate(final WebViewChannelDelegate p0);
    
    void setContextMenu(final Map<String, Object> p0);
    
    void setInAppBrowserDelegate(final InAppBrowserDelegate p0);
    
    void setInFullscreen(final boolean p0);
    
    void setPlugin(final InAppWebViewFlutterPlugin p0);
    
    void setSettings(final InAppWebViewSettings p0, final HashMap<String, Object> p1);
    
    void setUserContentController(final UserContentController p0);
    
    void setWebMessageChannels(final Map<String, WebMessageChannel> p0);
    
    void stopLoading();
    
    void takeScreenshot(final Map<String, Object> p0, final o p1);
    
    void zoomBy(final float p0);
    
    boolean zoomIn();
    
    boolean zoomOut();
}

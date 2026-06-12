package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import java.io.IOException;
import android.util.Log;
import F0.d;
import android.webkit.WebView;
import android.webkit.WebView$WebViewTransport;
import android.os.Message;
import java.util.Iterator;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import android.hardware.display.DisplayManager;
import java.util.HashMap;
import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView;

public class FlutterWebView implements PlatformWebView
{
    static final String LOG_TAG = "IAWFlutterWebView";
    public String keepAliveId;
    public PullToRefreshLayout pullToRefreshLayout;
    public InAppWebView webView;
    
    public FlutterWebView(final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, final Context context, final Object o, final HashMap<String, Object> hashMap) {
        final DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        this.keepAliveId = (String)hashMap.get((Object)"keepAliveId");
        final Map map = (Map)hashMap.get((Object)"initialSettings");
        final Map map2 = (Map)hashMap.get((Object)"contextMenu");
        final Integer n = (Integer)hashMap.get((Object)"windowId");
        final List list = (List)hashMap.get((Object)"initialUserScripts");
        final Map map3 = (Map)hashMap.get((Object)"pullToRefreshSettings");
        final InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse((Map<String, Object>)map);
        final ArrayList list2 = new ArrayList();
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)UserScript.fromMap((Map<String, Object>)iterator.next()));
            }
        }
        Object flutterView;
        if (inAppWebViewSettings.useHybridComposition) {
            flutterView = null;
        }
        else {
            flutterView = inAppWebViewFlutterPlugin.flutterView;
        }
        this.webView = new InAppWebView(context, inAppWebViewFlutterPlugin, o, n, inAppWebViewSettings, (Map<String, Object>)map2, (View)flutterView, (List<UserScript>)list2);
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        ((View)this.webView).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        final PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
        pullToRefreshSettings.parse((Map<String, Object>)map3);
        ((ViewGroup)(this.pullToRefreshLayout = new PullToRefreshLayout(context, inAppWebViewFlutterPlugin, o, pullToRefreshSettings))).addView((View)this.webView);
        this.pullToRefreshLayout.prepare();
        (this.webView.findInteractionController = new FindInteractionController(this.webView, inAppWebViewFlutterPlugin, o, null)).prepare();
        this.webView.prepare();
    }
    
    @Override
    public void dispose() {
        if (this.keepAliveId == null) {
            final InAppWebView webView = this.webView;
            if (webView != null) {
                webView.dispose();
                this.webView = null;
                final PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshLayout;
                if (pullToRefreshLayout != null) {
                    pullToRefreshLayout.dispose();
                    this.pullToRefreshLayout = null;
                }
            }
        }
    }
    
    @Override
    public View getView() {
        Object o = this.pullToRefreshLayout;
        if (o == null) {
            o = this.webView;
        }
        return (View)o;
    }
    
    @Override
    public void makeInitialLoad(final HashMap<String, Object> hashMap) {
        if (this.webView == null) {
            return;
        }
        final Integer n = (Integer)hashMap.get((Object)"windowId");
        final Map map = (Map)hashMap.get((Object)"initialUrlRequest");
        final String s = (String)hashMap.get((Object)"initialFile");
        final Map map2 = (Map)hashMap.get((Object)"initialData");
        if (n != null) {
            final InAppWebViewFlutterPlugin plugin = this.webView.plugin;
            if (plugin != null) {
                final InAppWebViewManager inAppWebViewManager = plugin.inAppWebViewManager;
                if (inAppWebViewManager != null) {
                    final Message message = (Message)inAppWebViewManager.windowWebViewMessages.get((Object)n);
                    if (message != null) {
                        ((WebView$WebViewTransport)message.obj).setWebView((WebView)this.webView);
                        message.sendToTarget();
                        if (d.a("DOCUMENT_START_SCRIPT")) {
                            ((View)this.webView).post((Runnable)new Runnable(this) {
                                final FlutterWebView this$0;
                                
                                public void run() {
                                    final InAppWebView webView = this.this$0.webView;
                                    if (webView != null) {
                                        webView.prepareAndAddUserScripts();
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
        else if (s != null) {
            try {
                this.webView.loadFile(s);
            }
            catch (final IOException ex) {
                Log.e("IAWFlutterWebView", s.concat(" asset file cannot be found!"), (Throwable)ex);
            }
        }
        else if (map2 != null) {
            this.webView.loadDataWithBaseURL((String)map2.get((Object)"baseUrl"), (String)map2.get((Object)"data"), (String)map2.get((Object)"mimeType"), (String)map2.get((Object)"encoding"), (String)map2.get((Object)"historyUrl"));
        }
        else if (map != null) {
            final URLRequest fromMap = URLRequest.fromMap((Map<String, Object>)map);
            if (fromMap != null) {
                this.webView.loadUrl(fromMap);
            }
        }
    }
    
    public void onFlutterViewAttached(final View containerView) {
        final InAppWebView webView = this.webView;
        if (webView != null && !webView.customSettings.useHybridComposition) {
            this.webView.setContainerView(containerView);
        }
    }
    
    public void onFlutterViewDetached() {
        final InAppWebView webView = this.webView;
        if (webView != null && !webView.customSettings.useHybridComposition) {
            this.webView.setContainerView(null);
        }
    }
    
    public void onInputConnectionLocked() {
        final InAppWebView webView = this.webView;
        if (webView != null && webView.inAppBrowserDelegate == null && !webView.customSettings.useHybridComposition) {
            this.webView.lockInputConnection();
        }
    }
    
    public void onInputConnectionUnlocked() {
        final InAppWebView webView = this.webView;
        if (webView != null && webView.inAppBrowserDelegate == null && !webView.customSettings.useHybridComposition) {
            this.webView.unlockInputConnection();
        }
    }
}

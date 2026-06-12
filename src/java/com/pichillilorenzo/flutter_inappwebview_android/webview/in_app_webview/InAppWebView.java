package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.BaseBundle;
import G0.c;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import android.webkit.URLUtil;
import java.io.IOException;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import F4.o;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.MenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import android.widget.HorizontalScrollView;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import android.view.LayoutInflater;
import android.view.ActionMode$Callback;
import android.view.ActionMode;
import android.print.PrintJob;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import android.print.PrintAttributes$MediaSize;
import android.print.PrintAttributes$Builder;
import android.print.PrintManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import android.view.View$OnLongClickListener;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import android.webkit.WebView$FindListener;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import M.b;
import com.google.android.gms.internal.ads.sE;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.graphics.Paint;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import android.webkit.WebSettings$LayoutAlgorithm;
import android.webkit.WebSettings;
import F0.q;
import C3.i;
import G0.z;
import android.webkit.DownloadListener;
import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import android.view.ViewParent;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsoluteLayout$LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.ContextMenu;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import org.json.JSONArray;
import com.google.android.gms.internal.measurement.L;
import v.e;
import android.os.Looper;
import android.webkit.WebHistoryItem;
import android.webkit.WebBackForwardList;
import m0.a;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import android.webkit.WebChromeClient;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.content.pm.PackageInfo;
import android.util.Log;
import android.webkit.WebViewClient;
import android.webkit.WebStorage;
import java.util.Iterator;
import android.text.TextUtils;
import org.json.JSONObject;
import java.util.UUID;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import android.animation.Animator$AnimatorListener;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.util.Set;
import F0.w;
import F0.d;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import android.webkit.CookieManager;
import android.app.Activity;
import F4.f;
import F4.p;
import android.view.View;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import android.webkit.WebView;
import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import java.util.regex.Pattern;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import android.view.GestureDetector;
import android.widget.LinearLayout;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import android.graphics.Point;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import android.webkit.ValueCallback;
import java.util.Map;
import android.os.Handler;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;

public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface
{
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler;
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public InAppWebViewSettings customSettings;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;
    public Object id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts;
    private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
    public boolean isLoading;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public Handler mainLooperHandler;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public List<WebMessageListener> webMessageListeners;
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale;
    
    static {
        InAppWebView.mHandler = new Handler();
    }
    
    public InAppWebView(final Context context) {
        super(context);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(this.getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.webMessageChannels = (Map<String, WebMessageChannel>)new HashMap();
        this.webMessageListeners = (List<WebMessageListener>)new ArrayList();
        this.initialUserOnlyScripts = (List<UserScript>)new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }
    
    public InAppWebView(final Context context, final AttributeSet set) {
        super(context, set);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(this.getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.webMessageChannels = (Map<String, WebMessageChannel>)new HashMap();
        this.webMessageListeners = (List<WebMessageListener>)new ArrayList();
        this.initialUserOnlyScripts = (List<UserScript>)new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }
    
    public InAppWebView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(this.getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.webMessageChannels = (Map<String, WebMessageChannel>)new HashMap();
        this.webMessageListeners = (List<WebMessageListener>)new ArrayList();
        this.initialUserOnlyScripts = (List<UserScript>)new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }
    
    public InAppWebView(final Context context, final InAppWebViewFlutterPlugin plugin, final Object id, final Integer windowId, final InAppWebViewSettings customSettings, final Map<String, Object> contextMenu, final View view, final List<UserScript> initialUserOnlyScripts) {
        super(context, view, customSettings.useHybridComposition);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(this.getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = (Map<String, ValueCallback<String>>)new HashMap();
        this.webMessageChannels = (Map<String, WebMessageChannel>)new HashMap();
        this.webMessageListeners = (List<WebMessageListener>)new ArrayList();
        this.initialUserOnlyScripts = (List<UserScript>)new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = plugin;
        this.id = id;
        final f messenger = plugin.messenger;
        final StringBuilder sb = new StringBuilder("com.pichillilorenzo/flutter_inappwebview_");
        sb.append(id);
        this.channelDelegate = new WebViewChannelDelegate(this, new p(messenger, sb.toString()));
        this.windowId = windowId;
        this.customSettings = customSettings;
        this.contextMenu = contextMenu;
        this.initialUserOnlyScripts = initialUserOnlyScripts;
        final Activity activity = plugin.activity;
        if (activity != null) {
            activity.registerForContextMenu((View)this);
        }
    }
    
    public static /* synthetic */ Point access$000(final InAppWebView inAppWebView) {
        return inAppWebView.contextMenuPoint;
    }
    
    @Deprecated
    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies((ValueCallback)new ValueCallback<Boolean>(this) {
            final InAppWebView this$0;
            
            public void onReceiveValue(final Boolean b) {
            }
        });
    }
    
    private void sendOnCreateContextMenuEvent() {
        final HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(this.getHitTestResult());
        final WebViewChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onCreateContextMenu(fromWebViewHitTestResult);
        }
    }
    
    @Override
    public void addWebMessageListener(final WebMessageListener webMessageListener) {
        if (d.a("WEB_MESSAGE_LISTENER")) {
            w.b((WebView)this, webMessageListener.jsObjectName, (Set)webMessageListener.allowedOriginRules, webMessageListener.listener);
            this.webMessageListeners.add((Object)webMessageListener);
        }
    }
    
    public void adjustFloatingContextMenuPosition() {
        this.evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", (ValueCallback)new ValueCallback<String>(this) {
            final InAppWebView this$0;
            
            public void onReceiveValue(final String s) {
                if (this.this$0.floatingContextMenu != null) {
                    if (s != null && !s.equalsIgnoreCase("null")) {
                        final int x = InAppWebView.access$000(this.this$0).x;
                        final int y = (int)(((View)this.this$0.floatingContextMenu).getHeight() / 3.5 + Util.getPixelDensity(((View)this.this$0).getContext()) * Float.parseFloat(s));
                        InAppWebView.access$000(this.this$0).y = y;
                        this.this$0.onFloatingActionGlobalLayout(x, y);
                    }
                    else {
                        ((View)this.this$0.floatingContextMenu).setVisibility(0);
                        ((View)this.this$0.floatingContextMenu).animate().alpha(1.0f).setDuration(100L).setListener((Animator$AnimatorListener)null);
                        final InAppWebView this$0 = this.this$0;
                        this$0.onFloatingActionGlobalLayout(InAppWebView.access$000(this$0).x, InAppWebView.access$000(this.this$0).y);
                    }
                }
            }
        });
    }
    
    @Override
    public void callAsyncJavaScript(String replace, final Map<String, Object> map, final ContentWorld contentWorld, final ValueCallback<String> valueCallback) {
        final String string = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put((Object)string, (Object)valueCallback);
        }
        final Iterator keys = new JSONObject((Map)map).keys();
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        while (keys.hasNext()) {
            final String s = (String)keys.next();
            list.add((Object)s);
            final StringBuilder sb = new StringBuilder("obj.");
            sb.append(s);
            list2.add((Object)sb.toString());
        }
        replace = "(function(obj) {  (async function($IN_APP_WEBVIEW_FUNCTION_ARGUMENT_NAMES) {    \n$IN_APP_WEBVIEW_FUNCTION_BODY\n  })($IN_APP_WEBVIEW_FUNCTION_ARGUMENT_VALUES).then(function(value) {    window.flutter_inappwebview.callHandler('callAsyncJavaScript', {'value': value, 'error': null, 'resultUuid': '$IN_APP_WEBVIEW_RESULT_UUID'});  }).catch(function(error) {    window.flutter_inappwebview.callHandler('callAsyncJavaScript', {'value': null, 'error': error + '', 'resultUuid': '$IN_APP_WEBVIEW_RESULT_UUID'});  });  return null;})($IN_APP_WEBVIEW_FUNCTION_ARGUMENTS_OBJ);".replace((CharSequence)"$IN_APP_WEBVIEW_FUNCTION_ARGUMENT_NAMES", (CharSequence)TextUtils.join((CharSequence)", ", (Iterable)list)).replace((CharSequence)"$IN_APP_WEBVIEW_FUNCTION_ARGUMENT_VALUES", (CharSequence)TextUtils.join((CharSequence)", ", (Iterable)list2)).replace((CharSequence)"$IN_APP_WEBVIEW_FUNCTION_ARGUMENTS_OBJ", (CharSequence)Util.JSONStringify(map)).replace((CharSequence)"$IN_APP_WEBVIEW_FUNCTION_BODY", (CharSequence)replace).replace((CharSequence)"$IN_APP_WEBVIEW_RESULT_UUID", (CharSequence)string).replace((CharSequence)"$IN_APP_WEBVIEW_RESULT_UUID", (CharSequence)string);
        this.evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(replace, contentWorld), (ValueCallback)null);
    }
    
    @Override
    public boolean canScrollHorizontally() {
        return ((View)this).computeHorizontalScrollRange() > ((View)this).computeHorizontalScrollExtent();
    }
    
    @Override
    public boolean canScrollVertically() {
        return ((View)this).computeVerticalScrollRange() > ((View)this).computeVerticalScrollExtent();
    }
    
    @Deprecated
    @Override
    public void clearAllCache() {
        this.clearCache(true);
        this.clearCookies();
        this.clearFormData();
        WebStorage.getInstance().deleteAllData();
    }
    
    @Override
    public WebMessageChannel createCompatWebMessageChannel() {
        final String string = UUID.randomUUID().toString();
        final WebMessageChannel webMessageChannel = new WebMessageChannel(string, this);
        this.webMessageChannels.put((Object)string, (Object)webMessageChannel);
        return webMessageChannel;
    }
    
    @Override
    public WebMessageChannel createWebMessageChannel(final ValueCallback<WebMessageChannel> valueCallback) {
        final WebMessageChannel compatWebMessageChannel = this.createCompatWebMessageChannel();
        valueCallback.onReceiveValue((Object)compatWebMessageChannel);
        return compatWebMessageChannel;
    }
    
    public WebViewClient createWebViewClient(final InAppBrowserDelegate inAppBrowserDelegate) {
        final PackageInfo d = w.d(((View)this).getContext());
        if (d == null) {
            Log.d("InAppWebView", "Using InAppWebViewClient implementation");
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        final boolean equals = "com.android.webview".equals((Object)d.packageName);
        final int n = 1;
        final boolean b = equals || "com.google.android.webview".equals((Object)d.packageName) || "com.android.chrome".equals((Object)d.packageName);
        while (true) {
            if (!b) {
                break Label_0157;
            }
            String versionName = d.versionName;
            if (versionName == null) {
                versionName = "";
            }
            try {
                int int1;
                if (versionName.contains((CharSequence)".")) {
                    int1 = Integer.parseInt(versionName.split("\\.")[0]);
                }
                else {
                    int1 = 0;
                }
                int n2;
                if (int1 >= 73) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 == 0 && b) {
                    Log.d("InAppWebView", "Using InAppWebViewClient implementation");
                    return new InAppWebViewClient(inAppBrowserDelegate);
                }
                Log.d("InAppWebView", "Using InAppWebViewClientCompat implementation");
                return (WebViewClient)new InAppWebViewClientCompat(inAppBrowserDelegate);
            }
            catch (final NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public void destroy() {
        super.destroy();
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }
    
    @Override
    public void dispose() {
        final WebViewChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        this.getSettings().setJavaScriptEnabled(false);
        this.removeJavascriptInterface("flutter_inappwebview");
        if (Build$VERSION.SDK_INT >= 29 && d.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            w.i(this, (InAppWebViewRenderProcessClient)null);
        }
        this.setWebChromeClient(new WebChromeClient());
        this.setWebViewClient((WebViewClient)new WebViewClient(this) {
            final InAppWebView this$0;
            
            public void onPageFinished(final WebView webView, final String s) {
                this.this$0.destroy();
            }
        });
        this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
        this.userContentController.dispose();
        final FindInteractionController findInteractionController = this.findInteractionController;
        if (findInteractionController != null) {
            findInteractionController.dispose();
            this.findInteractionController = null;
        }
        final WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null) {
            webViewAssetLoaderExt.dispose();
            this.webViewAssetLoaderExt = null;
        }
        final Integer windowId = this.windowId;
        if (windowId != null) {
            final InAppWebViewFlutterPlugin plugin = this.plugin;
            if (plugin != null) {
                final InAppWebViewManager inAppWebViewManager = plugin.inAppWebViewManager;
                if (inAppWebViewManager != null) {
                    inAppWebViewManager.windowWebViewMessages.remove((Object)windowId);
                }
            }
        }
        this.mainLooperHandler.removeCallbacksAndMessages((Object)null);
        InAppWebView.mHandler.removeCallbacksAndMessages((Object)null);
        this.disposeWebMessageChannels();
        this.disposeWebMessageListeners();
        ((ViewGroup)this).removeAllViews();
        final Runnable checkContextMenuShouldBeClosedTask = this.checkContextMenuShouldBeClosedTask;
        if (checkContextMenuShouldBeClosedTask != null) {
            ((View)this).removeCallbacks(checkContextMenuShouldBeClosedTask);
        }
        final Runnable checkScrollStoppedTask = this.checkScrollStoppedTask;
        if (checkScrollStoppedTask != null) {
            ((View)this).removeCallbacks(checkScrollStoppedTask);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        final InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient != null) {
            inAppWebViewRenderProcessClient.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        final InAppWebViewChromeClient inAppWebViewChromeClient = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient != null) {
            inAppWebViewChromeClient.dispose();
            this.inAppWebViewChromeClient = null;
        }
        final InAppWebViewClientCompat inAppWebViewClientCompat = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.dispose();
            this.inAppWebViewClientCompat = null;
        }
        final InAppWebViewClient inAppWebViewClient = this.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.dispose();
            this.inAppWebViewClient = null;
        }
        final JavaScriptBridgeInterface javaScriptBridgeInterface = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface != null) {
            javaScriptBridgeInterface.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        this.loadUrl("about:blank");
    }
    
    @Override
    public void disposeWebMessageChannels() {
        final Iterator iterator = this.webMessageChannels.values().iterator();
        while (iterator.hasNext()) {
            ((WebMessageChannel)iterator.next()).dispose();
        }
        this.webMessageChannels.clear();
    }
    
    @Override
    public void disposeWebMessageListeners() {
        final Iterator iterator = this.webMessageListeners.iterator();
        while (iterator.hasNext()) {
            ((WebMessageListener)iterator.next()).dispose();
        }
        this.webMessageListeners.clear();
    }
    
    public void enablePluginScriptAtRuntime(final String s, final boolean b, final PluginScript pluginScript) {
        this.evaluateJavascript(a.f("window.", s), null, (ValueCallback<String>)new ValueCallback<String>(this, s, b, pluginScript) {
            final InAppWebView this$0;
            final boolean val$enable;
            final String val$flagVariable;
            final PluginScript val$pluginScript;
            
            public void onReceiveValue(String string) {
                if (string != null && !string.equalsIgnoreCase("null")) {
                    final StringBuilder sb = new StringBuilder("window.");
                    sb.append(this.val$flagVariable);
                    sb.append(" = ");
                    sb.append(this.val$enable);
                    sb.append(";");
                    string = sb.toString();
                    this.this$0.evaluateJavascript(string, null, null);
                    if (!this.val$enable) {
                        this.this$0.userContentController.removePluginScript(this.val$pluginScript);
                    }
                }
                else if (this.val$enable) {
                    this.this$0.evaluateJavascript(this.val$pluginScript.getSource(), null, null);
                    this.this$0.userContentController.addPluginScript(this.val$pluginScript);
                }
            }
        });
    }
    
    @Override
    public void evaluateJavascript(final String s, final ContentWorld contentWorld, final ValueCallback<String> valueCallback) {
        this.injectDeferredObject(s, contentWorld, null, valueCallback);
    }
    
    @Override
    public WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }
    
    @Override
    public void getContentHeight(final ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue((Object)this.getContentHeight());
    }
    
    @Override
    public void getContentWidth(final ValueCallback<Integer> valueCallback) {
        this.evaluateJavascript("document.documentElement.scrollWidth;", (ValueCallback)new ValueCallback<String>(this, valueCallback) {
            final InAppWebView this$0;
            final ValueCallback val$callback;
            
            public void onReceiveValue(final String s) {
                Integer value;
                if (s != null && !s.equalsIgnoreCase("null")) {
                    value = Integer.parseInt(s);
                }
                else {
                    value = null;
                }
                this.val$callback.onReceiveValue((Object)value);
            }
        });
    }
    
    @Override
    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }
    
    @Override
    public HashMap<String, Object> getCopyBackForwardList() {
        final WebBackForwardList copyBackForwardList = this.copyBackForwardList();
        final int size = copyBackForwardList.getSize();
        final int currentIndex = copyBackForwardList.getCurrentIndex();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < size; ++i) {
            final WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"originalUrl", (Object)itemAtIndex.getOriginalUrl());
            hashMap.put((Object)"title", (Object)itemAtIndex.getTitle());
            hashMap.put((Object)"url", (Object)itemAtIndex.getUrl());
            list.add((Object)hashMap);
        }
        final HashMap hashMap2 = new HashMap();
        hashMap2.put((Object)"list", (Object)list);
        hashMap2.put((Object)"currentIndex", (Object)currentIndex);
        return (HashMap<String, Object>)hashMap2;
    }
    
    @Override
    public Map<String, Object> getCustomSettings() {
        final InAppWebViewSettings customSettings = this.customSettings;
        Map<String, Object> realSettings;
        if (customSettings != null) {
            realSettings = customSettings.getRealSettings((InAppWebViewInterface)this);
        }
        else {
            realSettings = null;
        }
        return realSettings;
    }
    
    @Override
    public void getHitTestResult(final ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue((Object)HitTestResult.fromWebViewHitTestResult(this.getHitTestResult()));
    }
    
    @Override
    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }
    
    @Override
    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }
    
    @Override
    public void getSelectedText(final ValueCallback<String> valueCallback) {
        this.evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }  return txt;})();", (ValueCallback)new ValueCallback<String>(this, valueCallback) {
            final InAppWebView this$0;
            final ValueCallback val$resultCallback;
            
            public void onReceiveValue(String substring) {
                if (substring != null && !substring.equalsIgnoreCase("null")) {
                    substring = substring.substring(1, substring.length() - 1);
                }
                else {
                    substring = null;
                }
                this.val$resultCallback.onReceiveValue((Object)substring);
            }
        });
    }
    
    @Override
    public UserContentController getUserContentController() {
        return this.userContentController;
    }
    
    @Override
    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }
    
    @Override
    public Looper getWebViewLooper() {
        if (Build$VERSION.SDK_INT >= 28) {
            return super.getWebViewLooper();
        }
        return Looper.getMainLooper();
    }
    
    @Override
    public float getZoomScale() {
        return this.zoomScale;
    }
    
    @Override
    public void getZoomScale(final ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue((Object)this.zoomScale);
    }
    
    public void hideContextMenu() {
        ((ViewGroup)this).removeView((View)this.floatingContextMenu);
        this.floatingContextMenu = null;
        final WebViewChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onHideContextMenu();
        }
    }
    
    @Override
    public void injectCSSCode(final String s) {
        this.injectDeferredObject(s, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
    }
    
    @Override
    public void injectCSSFileFromUrl(final String s, final Map<String, Object> map) {
        final String s2 = "";
        String s8;
        String string6;
        if (map != null) {
            final String s3 = (String)map.get((Object)"id");
            String string;
            if (s3 != null) {
                final StringBuilder sb = new StringBuilder(" link.id = '");
                sb.append(s3.replaceAll("'", "\\\\'"));
                sb.append("'; ");
                string = sb.toString();
            }
            else {
                string = "";
            }
            final String s4 = (String)map.get((Object)"media");
            String string2 = string;
            if (s4 != null) {
                final StringBuilder c = e.c(string, " link.media = '");
                c.append(s4.replaceAll("'", "\\\\'"));
                c.append("'; ");
                string2 = c.toString();
            }
            final String s5 = (String)map.get((Object)"crossOrigin");
            String string3 = string2;
            if (s5 != null) {
                final StringBuilder c2 = e.c(string2, " link.crossOrigin = '");
                c2.append(s5.replaceAll("'", "\\\\'"));
                c2.append("'; ");
                string3 = c2.toString();
            }
            final String s6 = (String)map.get((Object)"integrity");
            String string4 = string3;
            if (s6 != null) {
                final StringBuilder c3 = e.c(string3, " link.integrity = '");
                c3.append(s6.replaceAll("'", "\\\\'"));
                c3.append("'; ");
                string4 = c3.toString();
            }
            final String s7 = (String)map.get((Object)"referrerPolicy");
            String string5 = string4;
            if (s7 != null) {
                final StringBuilder c4 = e.c(string4, " link.referrerPolicy = '");
                c4.append(s7.replaceAll("'", "\\\\'"));
                c4.append("'; ");
                string5 = c4.toString();
            }
            final Boolean b = (Boolean)map.get((Object)"disabled");
            String i = string5;
            if (b != null) {
                i = string5;
                if (b) {
                    i = L.i(string5, " link.disabled = true; ");
                }
            }
            final Boolean b2 = (Boolean)map.get((Object)"alternate");
            s8 = s2;
            if (b2 != null) {
                s8 = s2;
                if (b2) {
                    s8 = "alternate ";
                }
            }
            final String s9 = (String)map.get((Object)"title");
            if (s9 != null) {
                final StringBuilder c5 = e.c(i, " link.title = '");
                c5.append(s9.replaceAll("'", "\\\\'"));
                c5.append("'; ");
                string6 = c5.toString();
            }
            else {
                string6 = i;
            }
        }
        else {
            string6 = "";
            s8 = s2;
        }
        this.injectDeferredObject(s, null, a.i("(function(d) { var link = d.createElement('link'); link.rel='", s8, "stylesheet'; link.type='text/css'; ", string6, " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);"), null);
    }
    
    public void injectDeferredObject(String replace, final ContentWorld contentWorld, String format, final ValueCallback<String> valueCallback) {
        String string;
        if (contentWorld != null && !contentWorld.equals(ContentWorld.PAGE)) {
            string = UUID.randomUUID().toString();
        }
        else {
            string = null;
        }
        if (format != null) {
            final JSONArray jsonArray = new JSONArray();
            jsonArray.put((Object)replace);
            final String string2 = jsonArray.toString();
            format = String.format(format, new Object[] { string2.substring(1, string2.length() - 1) });
        }
        else {
            format = replace;
        }
        if (string != null && valueCallback != null) {
            this.evaluateJavaScriptContentWorldCallbacks.put((Object)string, (Object)valueCallback);
            final StringBuilder sb = new StringBuilder("_flutter_inappwebview_");
            sb.append(Math.round(Math.random() * 1000000.0));
            replace = Util.replaceAll("var $IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME = null;try {  $IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME = eval($IN_APP_WEBVIEW_PLACEHOLDER_VALUE);} catch(e) {  console.error(e);}window.flutter_inappwebview.callHandler('evaluateJavaScriptWithContentWorld', {'value': $IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME, 'resultUuid': '$IN_APP_WEBVIEW_RESULT_UUID'});", "$IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME", sb.toString()).replace((CharSequence)"$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", (CharSequence)UserContentController.escapeCode(replace)).replace((CharSequence)"$IN_APP_WEBVIEW_RESULT_UUID", (CharSequence)string);
        }
        else {
            replace = format;
        }
        this.mainLooperHandler.post((Runnable)new Runnable(this, replace, contentWorld, valueCallback, string) {
            final InAppWebView this$0;
            final ContentWorld val$contentWorld;
            final String val$finalScriptToInject;
            final ValueCallback val$resultCallback;
            final String val$resultUuid;
            
            public void run() {
                this.this$0.evaluateJavascript(this.this$0.userContentController.generateCodeForScriptEvaluation(this.val$finalScriptToInject, this.val$contentWorld), (ValueCallback)new ValueCallback<String>(this) {
                    final InAppWebView$10 this$1;
                    
                    public void onReceiveValue(final String s) {
                        final Runnable this$1 = (Runnable)this.this$1;
                        if (this$1.val$resultUuid == null) {
                            final ValueCallback val$resultCallback = this$1.val$resultCallback;
                            if (val$resultCallback != null) {
                                val$resultCallback.onReceiveValue((Object)s);
                            }
                        }
                    }
                });
            }
        });
    }
    
    @Override
    public void injectJavascriptFileFromUrl(final String s, final Map<String, Object> map) {
        String string = "";
        if (map != null) {
            final String s2 = (String)map.get((Object)"type");
            String string2 = string;
            if (s2 != null) {
                final StringBuilder sb = new StringBuilder(" script.type = '");
                sb.append(s2.replaceAll("'", "\\\\'"));
                sb.append("'; ");
                string2 = sb.toString();
            }
            final String s3 = (String)map.get((Object)"id");
            String h = string2;
            if (s3 != null) {
                final String replaceAll = s3.replaceAll("'", "\\\\'");
                h = a.h(a.h(a.h(string2, " script.id = '", replaceAll, "'; "), " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '", replaceAll, "');  }};"), " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '", replaceAll, "');  }};");
            }
            final Boolean b = (Boolean)map.get((Object)"async");
            String i = h;
            if (b != null) {
                i = h;
                if (b) {
                    i = L.i(h, " script.async = true; ");
                }
            }
            final Boolean b2 = (Boolean)map.get((Object)"defer");
            String j = i;
            if (b2 != null) {
                j = i;
                if (b2) {
                    j = L.i(i, " script.defer = true; ");
                }
            }
            final String s4 = (String)map.get((Object)"crossOrigin");
            String string3 = j;
            if (s4 != null) {
                final StringBuilder c = e.c(j, " script.crossOrigin = '");
                c.append(s4.replaceAll("'", "\\\\'"));
                c.append("'; ");
                string3 = c.toString();
            }
            final String s5 = (String)map.get((Object)"integrity");
            String string4 = string3;
            if (s5 != null) {
                final StringBuilder c2 = e.c(string3, " script.integrity = '");
                c2.append(s5.replaceAll("'", "\\\\'"));
                c2.append("'; ");
                string4 = c2.toString();
            }
            final Boolean b3 = (Boolean)map.get((Object)"noModule");
            String k = string4;
            if (b3 != null) {
                k = string4;
                if (b3) {
                    k = L.i(string4, " script.noModule = true; ");
                }
            }
            final String s6 = (String)map.get((Object)"nonce");
            String string5 = k;
            if (s6 != null) {
                final StringBuilder c3 = e.c(k, " script.nonce = '");
                c3.append(s6.replaceAll("'", "\\\\'"));
                c3.append("'; ");
                string5 = c3.toString();
            }
            final String s7 = (String)map.get((Object)"referrerPolicy");
            string = string5;
            if (s7 != null) {
                final StringBuilder c4 = e.c(string5, " script.referrerPolicy = '");
                c4.append(s7.replaceAll("'", "\\\\'"));
                c4.append("'; ");
                string = c4.toString();
            }
        }
        this.injectDeferredObject(s, null, a.g("(function(d) { var script = d.createElement('script'); ", string, " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);"), null);
    }
    
    @Override
    public boolean isInFullscreen() {
        return this.inFullscreen;
    }
    
    @Override
    public boolean isLoading() {
        return this.isLoading;
    }
    
    @Override
    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        this.evaluateJavascript("window.isSecureContext", (ValueCallback)new ValueCallback<String>(this, valueCallback) {
            final InAppWebView this$0;
            final ValueCallback val$resultCallback;
            
            public void onReceiveValue(final String s) {
                if (s != null && !s.isEmpty() && !s.equalsIgnoreCase("null") && !s.equalsIgnoreCase("false")) {
                    this.val$resultCallback.onReceiveValue((Object)Boolean.TRUE);
                    return;
                }
                this.val$resultCallback.onReceiveValue((Object)Boolean.FALSE);
            }
        });
    }
    
    @Override
    public void loadFile(final String s) {
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin == null) {
            return;
        }
        this.loadUrl(Util.getUrlAsset(plugin, s));
    }
    
    @Override
    public void loadUrl(final URLRequest urlRequest) {
        final String url = urlRequest.getUrl();
        final String method = urlRequest.getMethod();
        if (method != null && method.equals((Object)"POST")) {
            this.postUrl(url, urlRequest.getBody());
            return;
        }
        final Map<String, String> headers = urlRequest.getHeaders();
        if (headers != null) {
            this.loadUrl(url, (Map)headers);
            return;
        }
        this.loadUrl(url);
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        this.sendOnCreateContextMenuEvent();
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.customSettings.useHybridComposition) {
            final View containerView = super.containerView;
            if (containerView != null) {
                containerView.getHandler().postDelayed((Runnable)new Runnable(this) {
                    final InAppWebView this$0;
                    
                    public void run() {
                        final InputMethodManager inputMethodManager = (InputMethodManager)((View)this.this$0).getContext().getSystemService("input_method");
                        while (true) {
                            if (inputMethodManager == null) {
                                break Label_0028;
                            }
                            try {
                                boolean acceptingText = inputMethodManager.isAcceptingText();
                                while (true) {
                                    final View containerView = this.this$0.containerView;
                                    if (containerView != null && inputMethodManager != null && !acceptingText) {
                                        inputMethodManager.hideSoftInputFromWindow(containerView.getWindowToken(), 2);
                                    }
                                    return;
                                    acceptingText = false;
                                    continue;
                                }
                            }
                            catch (final Exception ex) {
                                continue;
                            }
                            break;
                        }
                    }
                }, 128L);
            }
        }
        return onCreateInputConnection;
    }
    
    public void onFloatingActionGlobalLayout(int n, int scrollX) {
        final int width = ((View)this).getWidth();
        ((View)this).getHeight();
        final int width2 = ((View)this.floatingContextMenu).getWidth();
        final int height = ((View)this.floatingContextMenu).getHeight();
        final int n2 = n - width2 / 2;
        if (n2 < 0) {
            n = 0;
        }
        else {
            n = n2;
            if (n2 + width2 > width) {
                n = width - width2;
            }
        }
        float n3;
        if ((n3 = scrollX - height * 1.5f) < 0.0f) {
            n3 = (float)(scrollX + height);
        }
        final LinearLayout floatingContextMenu = this.floatingContextMenu;
        scrollX = ((View)this).getScrollX();
        ((ViewGroup)this).updateViewLayout((View)floatingContextMenu, (ViewGroup$LayoutParams)new AbsoluteLayout$LayoutParams(-2, -2, scrollX + n, ((View)this).getScrollY() + (int)n3));
        this.mainLooperHandler.post((Runnable)new Runnable(this) {
            final InAppWebView this$0;
            
            public void run() {
                final LinearLayout floatingContextMenu = this.this$0.floatingContextMenu;
                if (floatingContextMenu != null) {
                    ((View)floatingContextMenu).setVisibility(0);
                    ((View)this.this$0.floatingContextMenu).animate().alpha(1.0f).setDuration(100L).setListener((Animator$AnimatorListener)null);
                }
            }
        });
    }
    
    public void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.onOverScrolled(n, n2, b, b2);
        final boolean canScrollHorizontally = this.canScrollHorizontally();
        final boolean b3 = false;
        final boolean b4 = canScrollHorizontally && b;
        boolean b5 = b3;
        if (this.canScrollVertically()) {
            b5 = b3;
            if (b2) {
                b5 = true;
            }
        }
        final ViewParent parent = ((View)this).getParent();
        if (parent instanceof PullToRefreshLayout && b5 && n2 <= 10) {
            final PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout)parent;
            this.setOverScrollMode(2);
            pullToRefreshLayout.setEnabled((boolean)pullToRefreshLayout.settings.enabled);
            this.setOverScrollMode((int)this.customSettings.overScrollMode);
        }
        if (b4 || b5) {
            final WebViewChannelDelegate channelDelegate = this.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onOverScrolled(n, n2, b4, b5);
            }
        }
    }
    
    public void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        final LinearLayout floatingContextMenu = this.floatingContextMenu;
        if (floatingContextMenu != null) {
            ((View)floatingContextMenu).setAlpha(0.0f);
            ((View)this.floatingContextMenu).setVisibility(8);
        }
        final WebViewChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onScrollChanged(n, n2);
        }
    }
    
    public void onScrollStopped() {
        if (this.floatingContextMenu != null) {
            this.adjustFloatingContextMenuPosition();
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.lastTouch = new Point((int)motionEvent.getX(), (int)motionEvent.getY());
        final ViewParent parent = ((View)this).getParent();
        if (parent instanceof PullToRefreshLayout) {
            final PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout)parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void onWindowVisibilityChanged(final int n) {
        if (this.customSettings.allowBackgroundAudioPlaying) {
            if (n != 8) {
                super.onWindowVisibilityChanged(0);
            }
            return;
        }
        super.onWindowVisibilityChanged(n);
    }
    
    @Override
    public void postWebMessage(final WebMessage webMessage, final Uri uri, final ValueCallback<String> valueCallback) {
        throw new UnsupportedOperationException();
    }
    
    public void prepare() {
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, plugin, ((View)this).getContext());
        }
        this.addJavascriptInterface((Object)(this.javaScriptBridgeInterface = new JavaScriptBridgeInterface(this)), "flutter_inappwebview");
        this.setWebChromeClient((WebChromeClient)(this.inAppWebViewChromeClient = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate)));
        final WebViewClient webViewClient = this.createWebViewClient(this.inAppBrowserDelegate);
        if (webViewClient instanceof InAppWebViewClientCompat) {
            this.setWebViewClient((WebViewClient)(this.inAppWebViewClientCompat = (InAppWebViewClientCompat)webViewClient));
        }
        else if (webViewClient instanceof InAppWebViewClient) {
            this.setWebViewClient((WebViewClient)(this.inAppWebViewClient = (InAppWebViewClient)webViewClient));
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29 && d.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            w.i(this, this.inAppWebViewRenderProcessClient = new InAppWebViewRenderProcessClient());
        }
        if (this.windowId == null || !d.a("DOCUMENT_START_SCRIPT")) {
            this.prepareAndAddUserScripts();
        }
        if (this.customSettings.useOnDownloadStart) {
            this.setDownloadListener((DownloadListener)new DownloadStartListener());
        }
        final WebSettings settings = this.getSettings();
        settings.setJavaScriptEnabled((boolean)this.customSettings.javaScriptEnabled);
        settings.setJavaScriptCanOpenWindowsAutomatically((boolean)this.customSettings.javaScriptCanOpenWindowsAutomatically);
        settings.setBuiltInZoomControls((boolean)this.customSettings.builtInZoomControls);
        settings.setDisplayZoomControls((boolean)this.customSettings.displayZoomControls);
        settings.setSupportMultipleWindows((boolean)this.customSettings.supportMultipleWindows);
        if (d.a("SAFE_BROWSING_ENABLE")) {
            final boolean booleanValue = this.customSettings.safeBrowsingEnabled;
            final G0.b b = z.b;
            if (b.a()) {
                i.w(settings, booleanValue);
            }
            else {
                if (!((c)b).b()) {
                    throw z.a();
                }
                q.a(settings).q(booleanValue);
            }
        }
        else if (sdk_INT >= 26) {
            i.w(settings, (boolean)this.customSettings.safeBrowsingEnabled);
        }
        settings.setMediaPlaybackRequiresUserGesture((boolean)this.customSettings.mediaPlaybackRequiresUserGesture);
        settings.setDatabaseEnabled((boolean)this.customSettings.databaseEnabled);
        settings.setDomStorageEnabled((boolean)this.customSettings.domStorageEnabled);
        final String userAgent = this.customSettings.userAgent;
        if (userAgent != null && !userAgent.isEmpty()) {
            settings.setUserAgentString(this.customSettings.userAgent);
        }
        else {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(((View)this).getContext()));
        }
        final String applicationNameForUserAgent = this.customSettings.applicationNameForUserAgent;
        if (applicationNameForUserAgent != null && !applicationNameForUserAgent.isEmpty()) {
            final String userAgent2 = this.customSettings.userAgent;
            String s;
            if (userAgent2 != null && !userAgent2.isEmpty()) {
                s = this.customSettings.userAgent;
            }
            else {
                s = WebSettings.getDefaultUserAgent(((View)this).getContext());
            }
            final StringBuilder c = e.c(s, " ");
            c.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(c.toString());
        }
        if (this.customSettings.clearCache) {
            this.clearAllCache();
        }
        else if (this.customSettings.clearSessionCache) {
            CookieManager.getInstance().removeSessionCookie();
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies((WebView)this, (boolean)this.customSettings.thirdPartyCookiesEnabled);
        settings.setLoadWithOverviewMode((boolean)this.customSettings.loadWithOverviewMode);
        settings.setUseWideViewPort((boolean)this.customSettings.useWideViewPort);
        settings.setSupportZoom((boolean)this.customSettings.supportZoom);
        settings.setTextZoom((int)this.customSettings.textZoom);
        ((View)this).setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll && this.customSettings.verticalScrollBarEnabled);
        ((View)this).setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll && this.customSettings.horizontalScrollBarEnabled);
        if (this.customSettings.transparentBackground) {
            ((View)this).setBackgroundColor(0);
        }
        final Integer mixedContentMode = this.customSettings.mixedContentMode;
        if (mixedContentMode != null) {
            settings.setMixedContentMode((int)mixedContentMode);
        }
        settings.setAllowContentAccess((boolean)this.customSettings.allowContentAccess);
        settings.setAllowFileAccess((boolean)this.customSettings.allowFileAccess);
        settings.setAllowFileAccessFromFileURLs((boolean)this.customSettings.allowFileAccessFromFileURLs);
        settings.setAllowUniversalAccessFromFileURLs((boolean)this.customSettings.allowUniversalAccessFromFileURLs);
        this.setCacheEnabled(this.customSettings.cacheEnabled);
        final String appCachePath = this.customSettings.appCachePath;
        if (appCachePath != null && !appCachePath.isEmpty() && this.customSettings.cacheEnabled) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
        }
        settings.setBlockNetworkImage((boolean)this.customSettings.blockNetworkImage);
        settings.setBlockNetworkLoads((boolean)this.customSettings.blockNetworkLoads);
        final Integer cacheMode = this.customSettings.cacheMode;
        if (cacheMode != null) {
            settings.setCacheMode((int)cacheMode);
        }
        settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
        settings.setDefaultFixedFontSize((int)this.customSettings.defaultFixedFontSize);
        settings.setDefaultFontSize((int)this.customSettings.defaultFontSize);
        settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
        if (this.customSettings.disabledActionModeMenuItems != null) {
            if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                final int intValue = this.customSettings.disabledActionModeMenuItems;
                z.c.getClass();
                settings.setDisabledActionModeMenuItems(intValue);
            }
            else {
                settings.setDisabledActionModeMenuItems((int)this.customSettings.disabledActionModeMenuItems);
            }
        }
        settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
        settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
        if (this.customSettings.forceDark != null) {
            if (d.a("FORCE_DARK")) {
                final int intValue2 = this.customSettings.forceDark;
                final G0.b h = z.H;
                if (h.a()) {
                    G0.f.q(settings, intValue2);
                }
                else {
                    if (!((c)h).b()) {
                        throw z.a();
                    }
                    q.a(settings).m(intValue2);
                }
            }
            else if (sdk_INT >= 29) {
                G0.f.q(settings, (int)this.customSettings.forceDark);
            }
        }
        if (this.customSettings.forceDarkStrategy != null && d.a("FORCE_DARK_STRATEGY")) {
            final int intValue3 = this.customSettings.forceDarkStrategy;
            if (!((c)z.I).b()) {
                throw z.a();
            }
            q.a(settings).n(intValue3);
        }
        settings.setGeolocationEnabled((boolean)this.customSettings.geolocationEnabled);
        final WebSettings$LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            if (layoutAlgorithm.equals(WebSettings$LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            }
            else {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            }
        }
        settings.setLoadsImagesAutomatically((boolean)this.customSettings.loadsImagesAutomatically);
        settings.setMinimumFontSize((int)this.customSettings.minimumFontSize);
        settings.setMinimumLogicalFontSize((int)this.customSettings.minimumLogicalFontSize);
        this.setInitialScale((int)this.customSettings.initialScale);
        settings.setNeedInitialFocus((boolean)this.customSettings.needInitialFocus);
        if (d.a("OFF_SCREEN_PRERASTER")) {
            final boolean booleanValue2 = this.customSettings.offscreenPreRaster;
            z.a.getClass();
            settings.setOffscreenPreRaster(booleanValue2);
        }
        else {
            settings.setOffscreenPreRaster((boolean)this.customSettings.offscreenPreRaster);
        }
        settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
        settings.setSerifFontFamily(this.customSettings.serifFontFamily);
        settings.setStandardFontFamily(this.customSettings.standardFontFamily);
        final Integer preferredContentMode = this.customSettings.preferredContentMode;
        if (preferredContentMode != null && preferredContentMode == PreferredContentModeOptionType.DESKTOP.toValue()) {
            this.setDesktopMode(true);
        }
        settings.setSaveFormData((boolean)this.customSettings.saveFormData);
        if (this.customSettings.incognito) {
            this.setIncognito(true);
        }
        if (this.customSettings.useHybridComposition) {
            if (this.customSettings.hardwareAcceleration) {
                this.setLayerType(2, (Paint)null);
            }
            else {
                this.setLayerType(0, (Paint)null);
            }
        }
        final String regexToCancelSubFramesLoading = this.customSettings.regexToCancelSubFramesLoading;
        if (regexToCancelSubFramesLoading != null) {
            this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(regexToCancelSubFramesLoading);
        }
        ((View)this).setScrollBarStyle((int)this.customSettings.scrollBarStyle);
        final InAppWebViewSettings customSettings = this.customSettings;
        final Integer scrollBarDefaultDelayBeforeFade = customSettings.scrollBarDefaultDelayBeforeFade;
        if (scrollBarDefaultDelayBeforeFade != null) {
            ((View)this).setScrollBarDefaultDelayBeforeFade((int)scrollBarDefaultDelayBeforeFade);
        }
        else {
            customSettings.scrollBarDefaultDelayBeforeFade = ((View)this).getScrollBarDefaultDelayBeforeFade();
        }
        ((View)this).setScrollbarFadingEnabled((boolean)this.customSettings.scrollbarFadingEnabled);
        final InAppWebViewSettings customSettings2 = this.customSettings;
        final Integer scrollBarFadeDuration = customSettings2.scrollBarFadeDuration;
        if (scrollBarFadeDuration != null) {
            ((View)this).setScrollBarFadeDuration((int)scrollBarFadeDuration);
        }
        else {
            customSettings2.scrollBarFadeDuration = ((View)this).getScrollBarFadeDuration();
        }
        ((View)this).setVerticalScrollbarPosition((int)this.customSettings.verticalScrollbarPosition);
        if (sdk_INT >= 29) {
            if (this.customSettings.verticalScrollbarThumbColor != null) {
                sE.q(this, new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
            }
            if (this.customSettings.verticalScrollbarTrackColor != null) {
                sE.x(this, new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
            }
            if (this.customSettings.horizontalScrollbarThumbColor != null) {
                sE.A(this, new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
            }
            if (this.customSettings.horizontalScrollbarTrackColor != null) {
                sE.C(this, new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
            }
        }
        this.setOverScrollMode((int)this.customSettings.overScrollMode);
        final Boolean networkAvailable = this.customSettings.networkAvailable;
        if (networkAvailable != null) {
            this.setNetworkAvailable((boolean)networkAvailable);
        }
        final Map<String, Object> rendererPriorityPolicy = this.customSettings.rendererPriorityPolicy;
        if (rendererPriorityPolicy != null && !rendererPriorityPolicy.isEmpty() && sdk_INT >= 26) {
            b.y(this, (int)this.customSettings.rendererPriorityPolicy.get((Object)"rendererRequestedPriority"), (boolean)this.customSettings.rendererPriorityPolicy.get((Object)"waivedWhenNotVisible"));
        }
        if (d.a("ALGORITHMIC_DARKENING") && sdk_INT >= 29) {
            final boolean booleanValue3 = this.customSettings.algorithmicDarkeningAllowed;
            if (!z.E.b()) {
                throw z.a();
            }
            q.a(settings).k(booleanValue3);
        }
        if (d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            final boolean booleanValue4 = this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled;
            if (!((c)z.N).b()) {
                throw z.a();
            }
            q.a(settings).l(booleanValue4);
        }
        if (this.customSettings.requestedWithHeaderOriginAllowList != null && d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            final Set<String> requestedWithHeaderOriginAllowList = this.customSettings.requestedWithHeaderOriginAllowList;
            if (!((c)z.P).b()) {
                throw z.a();
            }
            q.a(settings).p((Set)requestedWithHeaderOriginAllowList);
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (final Map map : this.customSettings.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add((Object)new ContentBlocker(ContentBlockerTrigger.fromMap((Map<String, Object>)map.get((Object)"trigger")), ContentBlockerAction.fromMap((Map<String, Object>)map.get((Object)"action"))));
        }
        this.setFindListener((WebView$FindListener)new WebView$FindListener(this) {
            final InAppWebView this$0;
            
            public void onFindResultReceived(final int n, final int n2, final boolean b) {
                final FindInteractionController findInteractionController = this.this$0.findInteractionController;
                if (findInteractionController != null) {
                    final FindInteractionChannelDelegate channelDelegate = findInteractionController.channelDelegate;
                    if (channelDelegate != null) {
                        channelDelegate.onFindResultReceived(n, n2, b);
                    }
                }
                final WebViewChannelDelegate channelDelegate2 = this.this$0.channelDelegate;
                if (channelDelegate2 != null) {
                    channelDelegate2.onFindResultReceived(n, n2, b);
                }
            }
        });
        this.gestureDetector = new GestureDetector(((View)this).getContext(), (GestureDetector$OnGestureListener)new GestureDetector$SimpleOnGestureListener(this) {
            final InAppWebView this$0;
            
            public boolean onSingleTapUp(final MotionEvent motionEvent) {
                final InAppWebView this$0 = this.this$0;
                if (this$0.floatingContextMenu != null) {
                    this$0.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = (Runnable)new Runnable(this) {
            final InAppWebView this$0;
            
            public void run() {
                final int scrollY = ((View)this.this$0).getScrollY();
                final InAppWebView this$0 = this.this$0;
                if (this$0.initialPositionScrollStoppedTask - scrollY == 0) {
                    this$0.onScrollStopped();
                }
                else {
                    this$0.initialPositionScrollStoppedTask = ((View)this$0).getScrollY();
                    final InAppWebView this$2 = this.this$0;
                    this$2.mainLooperHandler.postDelayed(this$2.checkScrollStoppedTask, (long)this$2.newCheckScrollStoppedTask);
                }
            }
        };
        if (!this.customSettings.useHybridComposition) {
            this.checkContextMenuShouldBeClosedTask = (Runnable)new Runnable(this) {
                final InAppWebView this$0;
                
                public void run() {
                    final InAppWebView this$0 = this.this$0;
                    if (this$0.floatingContextMenu != null) {
                        this$0.evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }var activeEl = document.activeElement;var nodeName = (activeEl != null) ? activeEl.nodeName.toLowerCase() : '';var isActiveElementInputEditable = activeEl != null && (activeEl.nodeType == 1 && (nodeName == 'textarea' || (nodeName == 'input' && /^(?:text|email|number|search|tel|url|password)$/i.test(activeEl.type != null ? activeEl.type : 'text')))) && !activeEl.disabled && !activeEl.readOnly;var isActiveElementEditable = isActiveElementInputEditable || (activeEl != null && activeEl.isContentEditable) || document.designMode === 'on';  return txt === '' && !isActiveElementEditable;})();", (ValueCallback)new ValueCallback<String>(this) {
                            final InAppWebView$4 this$1;
                            
                            public void onReceiveValue(final String s) {
                                if (s != null && !s.equals((Object)"true")) {
                                    final InAppWebView this$0 = this.this$1.this$0;
                                    this$0.mainLooperHandler.postDelayed(this$0.checkContextMenuShouldBeClosedTask, (long)this$0.newCheckContextMenuShouldBeClosedTaskTask);
                                }
                                else {
                                    final InAppWebView this$2 = this.this$1.this$0;
                                    if (this$2.floatingContextMenu != null) {
                                        this$2.hideContextMenu();
                                    }
                                }
                            }
                        });
                    }
                }
            };
        }
        ((View)this).setOnTouchListener((View$OnTouchListener)new View$OnTouchListener(this) {
            float m_downX;
            float m_downY;
            final InAppWebView this$0;
            
            public boolean onTouch(final View view, final MotionEvent motionEvent) {
                this.this$0.gestureDetector.onTouchEvent(motionEvent);
                final int action = motionEvent.getAction();
                boolean b = true;
                if (action == 1) {
                    this.this$0.checkScrollStoppedTask.run();
                }
                if (this.this$0.customSettings.disableHorizontalScroll && this.this$0.customSettings.disableVerticalScroll) {
                    if (motionEvent.getAction() != 2) {
                        b = false;
                    }
                    return b;
                }
                if (this.this$0.customSettings.disableHorizontalScroll || this.this$0.customSettings.disableVerticalScroll) {
                    final int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        if (action2 == 1 || action2 == 2 || action2 == 3) {
                            if (this.this$0.customSettings.disableHorizontalScroll) {
                                motionEvent.setLocation(this.m_downX, motionEvent.getY());
                            }
                            else {
                                motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                            }
                        }
                    }
                    else {
                        this.m_downX = motionEvent.getX();
                        this.m_downY = motionEvent.getY();
                    }
                }
                return false;
            }
        });
        ((View)this).setOnLongClickListener((View$OnLongClickListener)new View$OnLongClickListener(this) {
            final InAppWebView this$0;
            
            public boolean onLongClick(final View view) {
                final HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(this.this$0.getHitTestResult());
                final WebViewChannelDelegate channelDelegate = this.this$0.channelDelegate;
                if (channelDelegate != null) {
                    channelDelegate.onLongPressHitTestResult(fromWebViewHitTestResult);
                }
                return false;
            }
        });
    }
    
    public void prepareAndAddUserScripts() {
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests);
        if (this.customSettings.useShouldInterceptAjaxRequest) {
            this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useShouldInterceptFetchRequest) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useOnLoadResource) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.customSettings.useHybridComposition) {
            this.userContentController.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT);
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }
    
    @Override
    public String printCurrentPage(final PrintJobSettings printJobSettings) {
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final Activity activity = plugin.activity;
            if (activity != null) {
                final PrintManager printManager = (PrintManager)activity.getSystemService("print");
                if (printManager != null) {
                    final PrintAttributes$Builder printAttributes$Builder = new PrintAttributes$Builder();
                    final StringBuilder sb = new StringBuilder();
                    String s;
                    if (this.getTitle() != null) {
                        s = this.getTitle();
                    }
                    else {
                        s = this.getUrl();
                    }
                    String b;
                    final String s2 = b = x.a.b(sb, s, " Document");
                    if (printJobSettings != null) {
                        final String jobName = printJobSettings.jobName;
                        String jobName2 = s2;
                        if (jobName != null) {
                            jobName2 = s2;
                            if (!jobName.isEmpty()) {
                                jobName2 = printJobSettings.jobName;
                            }
                        }
                        final Integer orientation = printJobSettings.orientation;
                        if (orientation != null) {
                            final int intValue = orientation;
                            if (intValue != 0) {
                                if (intValue == 1) {
                                    printAttributes$Builder.setMediaSize(PrintAttributes$MediaSize.UNKNOWN_LANDSCAPE);
                                }
                            }
                            else {
                                printAttributes$Builder.setMediaSize(PrintAttributes$MediaSize.UNKNOWN_PORTRAIT);
                            }
                        }
                        final MediaSizeExt mediaSize = printJobSettings.mediaSize;
                        if (mediaSize != null) {
                            printAttributes$Builder.setMediaSize(mediaSize.toMediaSize());
                        }
                        final Integer colorMode = printJobSettings.colorMode;
                        if (colorMode != null) {
                            printAttributes$Builder.setColorMode((int)colorMode);
                        }
                        final Integer duplexMode = printJobSettings.duplexMode;
                        if (duplexMode != null) {
                            printAttributes$Builder.setDuplexMode((int)duplexMode);
                        }
                        final ResolutionExt resolution = printJobSettings.resolution;
                        b = jobName2;
                        if (resolution != null) {
                            printAttributes$Builder.setResolution(resolution.toResolution());
                            b = jobName2;
                        }
                    }
                    final PrintJob print = printManager.print(b, this.createPrintDocumentAdapter(b), printAttributes$Builder.build());
                    if (printJobSettings != null && printJobSettings.handledByClient && this.plugin.printJobManager != null) {
                        final String string = UUID.randomUUID().toString();
                        final PrintJobController printJobController = new PrintJobController(string, print, printJobSettings, this.plugin);
                        this.plugin.printJobManager.jobs.put((Object)printJobController.id, (Object)printJobController);
                        return string;
                    }
                }
                else {
                    Log.e("InAppWebView", "No PrintManager available");
                }
            }
        }
        return null;
    }
    
    public ActionMode rebuildActionMode(final ActionMode actionMode, final ActionMode$Callback actionMode$Callback) {
        if (!this.customSettings.useHybridComposition) {
            final View containerView = super.containerView;
            if (containerView != null) {
                ((View)this).onWindowFocusChanged(containerView.isFocused());
            }
        }
        final LinearLayout floatingContextMenu = this.floatingContextMenu;
        int y = 0;
        boolean b;
        if (floatingContextMenu != null) {
            this.hideContextMenu();
            b = true;
        }
        else {
            b = false;
        }
        if (actionMode == null) {
            return null;
        }
        final Menu menu = actionMode.getMenu();
        actionMode.hide(3000L);
        final ArrayList list = new ArrayList();
        for (int i = 0; i < menu.size(); ++i) {
            list.add((Object)menu.getItem(i));
        }
        menu.clear();
        actionMode.finish();
        if (this.customSettings.disableContextMenu) {
            return actionMode;
        }
        final LinearLayout floatingContextMenu2 = (LinearLayout)LayoutInflater.from(((View)this).getContext()).inflate(R.layout.floating_action_mode, (ViewGroup)this, false);
        this.floatingContextMenu = floatingContextMenu2;
        final LinearLayout linearLayout = (LinearLayout)((ViewGroup)((ViewGroup)floatingContextMenu2).getChildAt(0)).getChildAt(0);
        Object o = new ArrayList();
        final ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
        final Map<String, Object> contextMenu = this.contextMenu;
        if (contextMenu != null) {
            final List list2 = (List)contextMenu.get((Object)"menuItems");
            final Map map = (Map)this.contextMenu.get((Object)"settings");
            o = list2;
            if (map != null) {
                contextMenuSettings.parse((Map<String, Object>)map);
                o = list2;
            }
        }
        Object o2;
        if ((o2 = o) == null) {
            o2 = new ArrayList();
        }
        final Boolean hideDefaultSystemContextMenuItems = contextMenuSettings.hideDefaultSystemContextMenuItems;
        if (hideDefaultSystemContextMenuItems == null || !hideDefaultSystemContextMenuItems) {
            for (final MenuItem menuItem : list) {
                final int itemId = menuItem.getItemId();
                final String string = menuItem.getTitle().toString();
                final TextView textView = (TextView)LayoutInflater.from(((View)this).getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup)this, false);
                textView.setText((CharSequence)string);
                ((View)textView).setOnClickListener((View$OnClickListener)new View$OnClickListener(this, actionMode$Callback, actionMode, menuItem, itemId, string) {
                    final InAppWebView this$0;
                    final ActionMode val$actionMode;
                    final ActionMode$Callback val$callback;
                    final int val$itemId;
                    final String val$itemTitle;
                    final MenuItem val$menuItem;
                    
                    public void onClick(final View view) {
                        this.this$0.hideContextMenu();
                        this.val$callback.onActionItemClicked(this.val$actionMode, this.val$menuItem);
                        final WebViewChannelDelegate channelDelegate = this.this$0.channelDelegate;
                        if (channelDelegate != null) {
                            channelDelegate.onContextMenuActionItemClicked(this.val$itemId, this.val$itemTitle);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    ((ViewGroup)linearLayout).addView((View)textView);
                }
            }
        }
        for (final Map map2 : o2) {
            final int intValue = (int)map2.get((Object)"id");
            final String text = (String)map2.get((Object)"title");
            final TextView textView2 = (TextView)LayoutInflater.from(((View)this).getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup)this, false);
            textView2.setText((CharSequence)text);
            ((View)textView2).setOnClickListener((View$OnClickListener)new View$OnClickListener(this, intValue, text) {
                final InAppWebView this$0;
                final int val$itemId;
                final String val$itemTitle;
                
                public void onClick(final View view) {
                    this.this$0.hideContextMenu();
                    final WebViewChannelDelegate channelDelegate = this.this$0.channelDelegate;
                    if (channelDelegate != null) {
                        channelDelegate.onContextMenuActionItemClicked(this.val$itemId, this.val$itemTitle);
                    }
                }
            });
            if (this.floatingContextMenu != null) {
                ((ViewGroup)linearLayout).addView((View)textView2);
            }
        }
        final Point lastTouch = this.lastTouch;
        int x;
        if (lastTouch != null) {
            x = lastTouch.x;
        }
        else {
            x = 0;
        }
        if (lastTouch != null) {
            y = lastTouch.y;
        }
        this.contextMenuPoint = new Point(x, y);
        final LinearLayout floatingContextMenu3 = this.floatingContextMenu;
        if (floatingContextMenu3 != null) {
            ((View)floatingContextMenu3).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener(this, x, y) {
                final InAppWebView this$0;
                final int val$x;
                final int val$y;
                
                public void onGlobalLayout() {
                    final LinearLayout floatingContextMenu = this.this$0.floatingContextMenu;
                    if (floatingContextMenu != null) {
                        ((View)floatingContextMenu).getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                        if (this.this$0.getSettings().getJavaScriptEnabled()) {
                            this.this$0.onScrollStopped();
                        }
                        else {
                            this.this$0.onFloatingActionGlobalLayout(this.val$x, this.val$y);
                        }
                    }
                }
            });
            ((ViewGroup)this).addView((View)this.floatingContextMenu, (ViewGroup$LayoutParams)new AbsoluteLayout$LayoutParams(-2, -2, x, y));
            if (b) {
                this.sendOnCreateContextMenuEvent();
            }
            final Runnable checkContextMenuShouldBeClosedTask = this.checkContextMenuShouldBeClosedTask;
            if (checkContextMenuShouldBeClosedTask != null) {
                checkContextMenuShouldBeClosedTask.run();
            }
        }
        return actionMode;
    }
    
    @Override
    public Map<String, Object> requestFocusNodeHref() {
        final Message obtainMessage = InAppWebView.mHandler.obtainMessage();
        this.requestFocusNodeHref(obtainMessage);
        final Bundle peekData = obtainMessage.peekData();
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"src", (Object)((BaseBundle)peekData).getString("src"));
        hashMap.put((Object)"url", (Object)((BaseBundle)peekData).getString("url"));
        hashMap.put((Object)"title", (Object)((BaseBundle)peekData).getString("title"));
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public Map<String, Object> requestImageRef() {
        final Message obtainMessage = InAppWebView.mHandler.obtainMessage();
        this.requestImageRef(obtainMessage);
        final Bundle peekData = obtainMessage.peekData();
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)((BaseBundle)peekData).getString("url"));
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public void scrollBy(final Integer n, final Integer n2, final Boolean b) {
        if (b) {
            ObjectAnimator.ofPropertyValuesHolder((Object)this, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("scrollX", new int[] { n + ((View)this).getScrollX() }), PropertyValuesHolder.ofInt("scrollY", new int[] { n2 + ((View)this).getScrollY() }) }).setDuration(300L).start();
        }
        else {
            ((View)this).scrollBy((int)n, (int)n2);
        }
    }
    
    @Override
    public void scrollTo(final Integer n, final Integer n2, final Boolean b) {
        if (b) {
            ObjectAnimator.ofPropertyValuesHolder((Object)this, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("scrollX", new int[] { n }), PropertyValuesHolder.ofInt("scrollY", new int[] { n2 }) }).setDuration(300L).start();
        }
        else {
            ((View)this).scrollTo((int)n, (int)n2);
        }
    }
    
    public void setCacheEnabled(final boolean b) {
        final WebSettings settings = this.getSettings();
        if (b) {
            final Context context = ((View)this).getContext();
            if (context != null) {
                Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
                settings.setCacheMode(-1);
                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
            }
        }
        else {
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
        }
    }
    
    @Override
    public void setChannelDelegate(final WebViewChannelDelegate channelDelegate) {
        this.channelDelegate = channelDelegate;
    }
    
    @Override
    public void setContextMenu(final Map<String, Object> contextMenu) {
        this.contextMenu = contextMenu;
    }
    
    public void setDesktopMode(final boolean b) {
        final WebSettings settings = this.getSettings();
        String userAgentString;
        if (b) {
            userAgentString = settings.getUserAgentString().replace((CharSequence)"Mobile", (CharSequence)"eliboM").replace((CharSequence)"Android", (CharSequence)"diordnA");
        }
        else {
            userAgentString = settings.getUserAgentString().replace((CharSequence)"eliboM", (CharSequence)"Mobile").replace((CharSequence)"diordnA", (CharSequence)"Android");
        }
        settings.setUserAgentString(userAgentString);
        settings.setUseWideViewPort(b);
        settings.setLoadWithOverviewMode(b);
        settings.setSupportZoom(b);
        settings.setBuiltInZoomControls(b);
    }
    
    @Override
    public void setInAppBrowserDelegate(final InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }
    
    @Override
    public void setInFullscreen(final boolean inFullscreen) {
        this.inFullscreen = inFullscreen;
    }
    
    public void setIncognito(final boolean b) {
        final WebSettings settings = this.getSettings();
        if (b) {
            CookieManager.getInstance().removeAllCookies((ValueCallback)null);
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            this.clearHistory();
            this.clearCache(true);
            this.clearFormData();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
        }
        else {
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
            settings.setSavePassword(true);
            settings.setSaveFormData(true);
        }
    }
    
    @Override
    public void setPlugin(final InAppWebViewFlutterPlugin plugin) {
        this.plugin = plugin;
    }
    
    @Override
    public void setSettings(final InAppWebViewSettings customSettings, final HashMap<String, Object> hashMap) {
        final WebSettings settings = this.getSettings();
        if (hashMap.get((Object)"javaScriptEnabled") != null) {
            final Boolean javaScriptEnabled = this.customSettings.javaScriptEnabled;
            final Boolean javaScriptEnabled2 = customSettings.javaScriptEnabled;
            if (javaScriptEnabled != javaScriptEnabled2) {
                settings.setJavaScriptEnabled((boolean)javaScriptEnabled2);
            }
        }
        if (hashMap.get((Object)"useShouldInterceptAjaxRequest") != null) {
            final Boolean useShouldInterceptAjaxRequest = this.customSettings.useShouldInterceptAjaxRequest;
            final Boolean useShouldInterceptAjaxRequest2 = customSettings.useShouldInterceptAjaxRequest;
            if (useShouldInterceptAjaxRequest != useShouldInterceptAjaxRequest2) {
                this.enablePluginScriptAtRuntime("flutter_inappwebview._useShouldInterceptAjaxRequest", useShouldInterceptAjaxRequest2, InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get((Object)"interceptOnlyAsyncAjaxRequests") != null) {
            final Boolean interceptOnlyAsyncAjaxRequests = this.customSettings.interceptOnlyAsyncAjaxRequests;
            final Boolean interceptOnlyAsyncAjaxRequests2 = customSettings.interceptOnlyAsyncAjaxRequests;
            if (interceptOnlyAsyncAjaxRequests != interceptOnlyAsyncAjaxRequests2) {
                this.enablePluginScriptAtRuntime("flutter_inappwebview._interceptOnlyAsyncAjaxRequests", interceptOnlyAsyncAjaxRequests2, this.interceptOnlyAsyncAjaxRequestsPluginScript);
            }
        }
        if (hashMap.get((Object)"useShouldInterceptFetchRequest") != null) {
            final Boolean useShouldInterceptFetchRequest = this.customSettings.useShouldInterceptFetchRequest;
            final Boolean useShouldInterceptFetchRequest2 = customSettings.useShouldInterceptFetchRequest;
            if (useShouldInterceptFetchRequest != useShouldInterceptFetchRequest2) {
                this.enablePluginScriptAtRuntime("flutter_inappwebview._useShouldInterceptFetchRequest", useShouldInterceptFetchRequest2, InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get((Object)"useOnLoadResource") != null) {
            final Boolean useOnLoadResource = this.customSettings.useOnLoadResource;
            final Boolean useOnLoadResource2 = customSettings.useOnLoadResource;
            if (useOnLoadResource != useOnLoadResource2) {
                this.enablePluginScriptAtRuntime("flutter_inappwebview._useOnLoadResource", useOnLoadResource2, OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get((Object)"javaScriptCanOpenWindowsAutomatically") != null) {
            final Boolean javaScriptCanOpenWindowsAutomatically = this.customSettings.javaScriptCanOpenWindowsAutomatically;
            final Boolean javaScriptCanOpenWindowsAutomatically2 = customSettings.javaScriptCanOpenWindowsAutomatically;
            if (javaScriptCanOpenWindowsAutomatically != javaScriptCanOpenWindowsAutomatically2) {
                settings.setJavaScriptCanOpenWindowsAutomatically((boolean)javaScriptCanOpenWindowsAutomatically2);
            }
        }
        if (hashMap.get((Object)"builtInZoomControls") != null) {
            final Boolean builtInZoomControls = this.customSettings.builtInZoomControls;
            final Boolean builtInZoomControls2 = customSettings.builtInZoomControls;
            if (builtInZoomControls != builtInZoomControls2) {
                settings.setBuiltInZoomControls((boolean)builtInZoomControls2);
            }
        }
        if (hashMap.get((Object)"displayZoomControls") != null) {
            final Boolean displayZoomControls = this.customSettings.displayZoomControls;
            final Boolean displayZoomControls2 = customSettings.displayZoomControls;
            if (displayZoomControls != displayZoomControls2) {
                settings.setDisplayZoomControls((boolean)displayZoomControls2);
            }
        }
        if (hashMap.get((Object)"safeBrowsingEnabled") != null && this.customSettings.safeBrowsingEnabled != customSettings.safeBrowsingEnabled) {
            if (d.a("SAFE_BROWSING_ENABLE")) {
                final boolean booleanValue = customSettings.safeBrowsingEnabled;
                final G0.b b = z.b;
                if (b.a()) {
                    i.w(settings, booleanValue);
                }
                else {
                    if (!((c)b).b()) {
                        throw z.a();
                    }
                    q.a(settings).q(booleanValue);
                }
            }
            else if (Build$VERSION.SDK_INT >= 26) {
                i.w(settings, (boolean)customSettings.safeBrowsingEnabled);
            }
        }
        if (hashMap.get((Object)"mediaPlaybackRequiresUserGesture") != null) {
            final Boolean mediaPlaybackRequiresUserGesture = this.customSettings.mediaPlaybackRequiresUserGesture;
            final Boolean mediaPlaybackRequiresUserGesture2 = customSettings.mediaPlaybackRequiresUserGesture;
            if (mediaPlaybackRequiresUserGesture != mediaPlaybackRequiresUserGesture2) {
                settings.setMediaPlaybackRequiresUserGesture((boolean)mediaPlaybackRequiresUserGesture2);
            }
        }
        if (hashMap.get((Object)"databaseEnabled") != null) {
            final Boolean databaseEnabled = this.customSettings.databaseEnabled;
            final Boolean databaseEnabled2 = customSettings.databaseEnabled;
            if (databaseEnabled != databaseEnabled2) {
                settings.setDatabaseEnabled((boolean)databaseEnabled2);
            }
        }
        if (hashMap.get((Object)"domStorageEnabled") != null) {
            final Boolean domStorageEnabled = this.customSettings.domStorageEnabled;
            final Boolean domStorageEnabled2 = customSettings.domStorageEnabled;
            if (domStorageEnabled != domStorageEnabled2) {
                settings.setDomStorageEnabled((boolean)domStorageEnabled2);
            }
        }
        if (hashMap.get((Object)"userAgent") != null && !this.customSettings.userAgent.equals((Object)customSettings.userAgent) && !customSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(customSettings.userAgent);
        }
        if (hashMap.get((Object)"applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals((Object)customSettings.applicationNameForUserAgent) && !customSettings.applicationNameForUserAgent.isEmpty()) {
            final String userAgent = customSettings.userAgent;
            String s;
            if (userAgent != null && !userAgent.isEmpty()) {
                s = customSettings.userAgent;
            }
            else {
                s = WebSettings.getDefaultUserAgent(((View)this).getContext());
            }
            final StringBuilder c = e.c(s, " ");
            c.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(c.toString());
        }
        if (hashMap.get((Object)"clearCache") != null && customSettings.clearCache) {
            this.clearAllCache();
        }
        else if (hashMap.get((Object)"clearSessionCache") != null && customSettings.clearSessionCache) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (hashMap.get((Object)"thirdPartyCookiesEnabled") != null && this.customSettings.thirdPartyCookiesEnabled != customSettings.thirdPartyCookiesEnabled) {
            CookieManager.getInstance().setAcceptThirdPartyCookies((WebView)this, (boolean)customSettings.thirdPartyCookiesEnabled);
        }
        if (hashMap.get((Object)"useWideViewPort") != null) {
            final Boolean useWideViewPort = this.customSettings.useWideViewPort;
            final Boolean useWideViewPort2 = customSettings.useWideViewPort;
            if (useWideViewPort != useWideViewPort2) {
                settings.setUseWideViewPort((boolean)useWideViewPort2);
            }
        }
        if (hashMap.get((Object)"supportZoom") != null) {
            final Boolean supportZoom = this.customSettings.supportZoom;
            final Boolean supportZoom2 = customSettings.supportZoom;
            if (supportZoom != supportZoom2) {
                settings.setSupportZoom((boolean)supportZoom2);
            }
        }
        if (hashMap.get((Object)"textZoom") != null && !this.customSettings.textZoom.equals((Object)customSettings.textZoom)) {
            settings.setTextZoom((int)customSettings.textZoom);
        }
        if (hashMap.get((Object)"verticalScrollBarEnabled") != null) {
            final Boolean verticalScrollBarEnabled = this.customSettings.verticalScrollBarEnabled;
            final Boolean verticalScrollBarEnabled2 = customSettings.verticalScrollBarEnabled;
            if (verticalScrollBarEnabled != verticalScrollBarEnabled2) {
                ((View)this).setVerticalScrollBarEnabled((boolean)verticalScrollBarEnabled2);
            }
        }
        if (hashMap.get((Object)"horizontalScrollBarEnabled") != null) {
            final Boolean horizontalScrollBarEnabled = this.customSettings.horizontalScrollBarEnabled;
            final Boolean horizontalScrollBarEnabled2 = customSettings.horizontalScrollBarEnabled;
            if (horizontalScrollBarEnabled != horizontalScrollBarEnabled2) {
                ((View)this).setHorizontalScrollBarEnabled((boolean)horizontalScrollBarEnabled2);
            }
        }
        final Object value = hashMap.get((Object)"transparentBackground");
        final boolean b2 = false;
        if (value != null) {
            final Boolean transparentBackground = this.customSettings.transparentBackground;
            final Boolean transparentBackground2 = customSettings.transparentBackground;
            if (transparentBackground != transparentBackground2) {
                if (transparentBackground2) {
                    ((View)this).setBackgroundColor(0);
                }
                else {
                    ((View)this).setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (hashMap.get((Object)"mixedContentMode") != null) {
            final Integer mixedContentMode = this.customSettings.mixedContentMode;
            if (mixedContentMode == null || !mixedContentMode.equals((Object)customSettings.mixedContentMode)) {
                settings.setMixedContentMode((int)customSettings.mixedContentMode);
            }
        }
        if (hashMap.get((Object)"supportMultipleWindows") != null) {
            final Boolean supportMultipleWindows = this.customSettings.supportMultipleWindows;
            final Boolean supportMultipleWindows2 = customSettings.supportMultipleWindows;
            if (supportMultipleWindows != supportMultipleWindows2) {
                settings.setSupportMultipleWindows((boolean)supportMultipleWindows2);
            }
        }
        if (hashMap.get((Object)"useOnDownloadStart") != null) {
            final Boolean useOnDownloadStart = this.customSettings.useOnDownloadStart;
            final Boolean useOnDownloadStart2 = customSettings.useOnDownloadStart;
            if (useOnDownloadStart != useOnDownloadStart2) {
                if (useOnDownloadStart2) {
                    this.setDownloadListener((DownloadListener)new DownloadStartListener());
                }
                else {
                    this.setDownloadListener((DownloadListener)null);
                }
            }
        }
        if (hashMap.get((Object)"allowContentAccess") != null) {
            final Boolean allowContentAccess = this.customSettings.allowContentAccess;
            final Boolean allowContentAccess2 = customSettings.allowContentAccess;
            if (allowContentAccess != allowContentAccess2) {
                settings.setAllowContentAccess((boolean)allowContentAccess2);
            }
        }
        if (hashMap.get((Object)"allowFileAccess") != null) {
            final Boolean allowFileAccess = this.customSettings.allowFileAccess;
            final Boolean allowFileAccess2 = customSettings.allowFileAccess;
            if (allowFileAccess != allowFileAccess2) {
                settings.setAllowFileAccess((boolean)allowFileAccess2);
            }
        }
        if (hashMap.get((Object)"allowFileAccessFromFileURLs") != null) {
            final Boolean allowFileAccessFromFileURLs = this.customSettings.allowFileAccessFromFileURLs;
            final Boolean allowFileAccessFromFileURLs2 = customSettings.allowFileAccessFromFileURLs;
            if (allowFileAccessFromFileURLs != allowFileAccessFromFileURLs2) {
                settings.setAllowFileAccessFromFileURLs((boolean)allowFileAccessFromFileURLs2);
            }
        }
        if (hashMap.get((Object)"allowUniversalAccessFromFileURLs") != null) {
            final Boolean allowUniversalAccessFromFileURLs = this.customSettings.allowUniversalAccessFromFileURLs;
            final Boolean allowUniversalAccessFromFileURLs2 = customSettings.allowUniversalAccessFromFileURLs;
            if (allowUniversalAccessFromFileURLs != allowUniversalAccessFromFileURLs2) {
                settings.setAllowUniversalAccessFromFileURLs((boolean)allowUniversalAccessFromFileURLs2);
            }
        }
        if (hashMap.get((Object)"cacheEnabled") != null) {
            final Boolean cacheEnabled = this.customSettings.cacheEnabled;
            final Boolean cacheEnabled2 = customSettings.cacheEnabled;
            if (cacheEnabled != cacheEnabled2) {
                this.setCacheEnabled(cacheEnabled2);
            }
        }
        if (hashMap.get((Object)"appCachePath") != null) {
            final String appCachePath = this.customSettings.appCachePath;
            if (appCachePath == null || !appCachePath.equals((Object)customSettings.appCachePath)) {
                Util.invokeMethodIfExists(settings, "setAppCachePath", customSettings.appCachePath);
            }
        }
        if (hashMap.get((Object)"blockNetworkImage") != null) {
            final Boolean blockNetworkImage = this.customSettings.blockNetworkImage;
            final Boolean blockNetworkImage2 = customSettings.blockNetworkImage;
            if (blockNetworkImage != blockNetworkImage2) {
                settings.setBlockNetworkImage((boolean)blockNetworkImage2);
            }
        }
        if (hashMap.get((Object)"blockNetworkLoads") != null) {
            final Boolean blockNetworkLoads = this.customSettings.blockNetworkLoads;
            final Boolean blockNetworkLoads2 = customSettings.blockNetworkLoads;
            if (blockNetworkLoads != blockNetworkLoads2) {
                settings.setBlockNetworkLoads((boolean)blockNetworkLoads2);
            }
        }
        if (hashMap.get((Object)"cacheMode") != null && !this.customSettings.cacheMode.equals((Object)customSettings.cacheMode)) {
            settings.setCacheMode((int)customSettings.cacheMode);
        }
        if (hashMap.get((Object)"cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals((Object)customSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(customSettings.cursiveFontFamily);
        }
        if (hashMap.get((Object)"defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals((Object)customSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize((int)customSettings.defaultFixedFontSize);
        }
        if (hashMap.get((Object)"defaultFontSize") != null && !this.customSettings.defaultFontSize.equals((Object)customSettings.defaultFontSize)) {
            settings.setDefaultFontSize((int)customSettings.defaultFontSize);
        }
        if (hashMap.get((Object)"defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals((Object)customSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(customSettings.defaultTextEncodingName);
        }
        if (hashMap.get((Object)"disabledActionModeMenuItems") != null) {
            final Integer disabledActionModeMenuItems = this.customSettings.disabledActionModeMenuItems;
            if (disabledActionModeMenuItems == null || !disabledActionModeMenuItems.equals((Object)customSettings.disabledActionModeMenuItems)) {
                if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                    final int intValue = customSettings.disabledActionModeMenuItems;
                    z.c.getClass();
                    settings.setDisabledActionModeMenuItems(intValue);
                }
                else {
                    settings.setDisabledActionModeMenuItems((int)customSettings.disabledActionModeMenuItems);
                }
            }
        }
        if (hashMap.get((Object)"fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals((Object)customSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(customSettings.fantasyFontFamily);
        }
        if (hashMap.get((Object)"fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals((Object)customSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(customSettings.fixedFontFamily);
        }
        if (hashMap.get((Object)"forceDark") != null && !this.customSettings.forceDark.equals((Object)customSettings.forceDark)) {
            if (d.a("FORCE_DARK")) {
                final int intValue2 = customSettings.forceDark;
                final G0.b h = z.H;
                if (h.a()) {
                    G0.f.q(settings, intValue2);
                }
                else {
                    if (!((c)h).b()) {
                        throw z.a();
                    }
                    q.a(settings).m(intValue2);
                }
            }
            else if (sdk_INT >= 29) {
                G0.f.q(settings, (int)customSettings.forceDark);
            }
        }
        if (hashMap.get((Object)"forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals((Object)customSettings.forceDarkStrategy) && d.a("FORCE_DARK_STRATEGY")) {
            final int intValue3 = customSettings.forceDarkStrategy;
            if (!((c)z.I).b()) {
                throw z.a();
            }
            q.a(settings).n(intValue3);
        }
        if (hashMap.get((Object)"geolocationEnabled") != null) {
            final Boolean geolocationEnabled = this.customSettings.geolocationEnabled;
            final Boolean geolocationEnabled2 = customSettings.geolocationEnabled;
            if (geolocationEnabled != geolocationEnabled2) {
                settings.setGeolocationEnabled((boolean)geolocationEnabled2);
            }
        }
        if (hashMap.get((Object)"layoutAlgorithm") != null) {
            final WebSettings$LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
            final WebSettings$LayoutAlgorithm layoutAlgorithm2 = customSettings.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                if (layoutAlgorithm2.equals(WebSettings$LayoutAlgorithm.TEXT_AUTOSIZING)) {
                    settings.setLayoutAlgorithm(customSettings.layoutAlgorithm);
                }
                else {
                    settings.setLayoutAlgorithm(customSettings.layoutAlgorithm);
                }
            }
        }
        if (hashMap.get((Object)"loadWithOverviewMode") != null) {
            final Boolean loadWithOverviewMode = this.customSettings.loadWithOverviewMode;
            final Boolean loadWithOverviewMode2 = customSettings.loadWithOverviewMode;
            if (loadWithOverviewMode != loadWithOverviewMode2) {
                settings.setLoadWithOverviewMode((boolean)loadWithOverviewMode2);
            }
        }
        if (hashMap.get((Object)"loadsImagesAutomatically") != null) {
            final Boolean loadsImagesAutomatically = this.customSettings.loadsImagesAutomatically;
            final Boolean loadsImagesAutomatically2 = customSettings.loadsImagesAutomatically;
            if (loadsImagesAutomatically != loadsImagesAutomatically2) {
                settings.setLoadsImagesAutomatically((boolean)loadsImagesAutomatically2);
            }
        }
        if (hashMap.get((Object)"minimumFontSize") != null && !this.customSettings.minimumFontSize.equals((Object)customSettings.minimumFontSize)) {
            settings.setMinimumFontSize((int)customSettings.minimumFontSize);
        }
        if (hashMap.get((Object)"minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals((Object)customSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize((int)customSettings.minimumLogicalFontSize);
        }
        if (hashMap.get((Object)"initialScale") != null && !this.customSettings.initialScale.equals((Object)customSettings.initialScale)) {
            this.setInitialScale((int)customSettings.initialScale);
        }
        if (hashMap.get((Object)"needInitialFocus") != null) {
            final Boolean needInitialFocus = this.customSettings.needInitialFocus;
            final Boolean needInitialFocus2 = customSettings.needInitialFocus;
            if (needInitialFocus != needInitialFocus2) {
                settings.setNeedInitialFocus((boolean)needInitialFocus2);
            }
        }
        if (hashMap.get((Object)"offscreenPreRaster") != null && this.customSettings.offscreenPreRaster != customSettings.offscreenPreRaster) {
            if (d.a("OFF_SCREEN_PRERASTER")) {
                final boolean booleanValue2 = customSettings.offscreenPreRaster;
                z.a.getClass();
                settings.setOffscreenPreRaster(booleanValue2);
            }
            else {
                settings.setOffscreenPreRaster((boolean)customSettings.offscreenPreRaster);
            }
        }
        if (hashMap.get((Object)"sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals((Object)customSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(customSettings.sansSerifFontFamily);
        }
        if (hashMap.get((Object)"serifFontFamily") != null && !this.customSettings.serifFontFamily.equals((Object)customSettings.serifFontFamily)) {
            settings.setSerifFontFamily(customSettings.serifFontFamily);
        }
        if (hashMap.get((Object)"standardFontFamily") != null && !this.customSettings.standardFontFamily.equals((Object)customSettings.standardFontFamily)) {
            settings.setStandardFontFamily(customSettings.standardFontFamily);
        }
        if (hashMap.get((Object)"preferredContentMode") != null && !this.customSettings.preferredContentMode.equals((Object)customSettings.preferredContentMode)) {
            final int n = InAppWebView$21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(customSettings.preferredContentMode).ordinal()];
            if (n != 1) {
                if (n == 2 || n == 3) {
                    this.setDesktopMode(false);
                }
            }
            else {
                this.setDesktopMode(true);
            }
        }
        if (hashMap.get((Object)"saveFormData") != null) {
            final Boolean saveFormData = this.customSettings.saveFormData;
            final Boolean saveFormData2 = customSettings.saveFormData;
            if (saveFormData != saveFormData2) {
                settings.setSaveFormData((boolean)saveFormData2);
            }
        }
        if (hashMap.get((Object)"incognito") != null) {
            final Boolean incognito = this.customSettings.incognito;
            final Boolean incognito2 = customSettings.incognito;
            if (incognito != incognito2) {
                this.setIncognito(incognito2);
            }
        }
        if (this.customSettings.useHybridComposition && hashMap.get((Object)"hardwareAcceleration") != null) {
            final Boolean hardwareAcceleration = this.customSettings.hardwareAcceleration;
            final Boolean hardwareAcceleration2 = customSettings.hardwareAcceleration;
            if (hardwareAcceleration != hardwareAcceleration2) {
                if (hardwareAcceleration2) {
                    this.setLayerType(2, (Paint)null);
                }
                else {
                    this.setLayerType(0, (Paint)null);
                }
            }
        }
        if (hashMap.get((Object)"regexToCancelSubFramesLoading") != null) {
            final String regexToCancelSubFramesLoading = this.customSettings.regexToCancelSubFramesLoading;
            if (regexToCancelSubFramesLoading == null || !regexToCancelSubFramesLoading.equals((Object)customSettings.regexToCancelSubFramesLoading)) {
                if (customSettings.regexToCancelSubFramesLoading == null) {
                    this.regexToCancelSubFramesLoadingCompiled = null;
                }
                else {
                    this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
                }
            }
        }
        if (customSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (final Map map : customSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add((Object)new ContentBlocker(ContentBlockerTrigger.fromMap((Map<String, Object>)map.get((Object)"trigger")), ContentBlockerAction.fromMap((Map<String, Object>)map.get((Object)"action"))));
            }
        }
        if (hashMap.get((Object)"scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals((Object)customSettings.scrollBarStyle)) {
            ((View)this).setScrollBarStyle((int)customSettings.scrollBarStyle);
        }
        if (hashMap.get((Object)"scrollBarDefaultDelayBeforeFade") != null) {
            final Integer scrollBarDefaultDelayBeforeFade = this.customSettings.scrollBarDefaultDelayBeforeFade;
            if (scrollBarDefaultDelayBeforeFade == null || !scrollBarDefaultDelayBeforeFade.equals((Object)customSettings.scrollBarDefaultDelayBeforeFade)) {
                ((View)this).setScrollBarDefaultDelayBeforeFade((int)customSettings.scrollBarDefaultDelayBeforeFade);
            }
        }
        if (hashMap.get((Object)"scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals((Object)customSettings.scrollbarFadingEnabled)) {
            ((View)this).setScrollbarFadingEnabled((boolean)customSettings.scrollbarFadingEnabled);
        }
        if (hashMap.get((Object)"scrollBarFadeDuration") != null) {
            final Integer scrollBarFadeDuration = this.customSettings.scrollBarFadeDuration;
            if (scrollBarFadeDuration == null || !scrollBarFadeDuration.equals((Object)customSettings.scrollBarFadeDuration)) {
                ((View)this).setScrollBarFadeDuration((int)customSettings.scrollBarFadeDuration);
            }
        }
        if (hashMap.get((Object)"verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals((Object)customSettings.verticalScrollbarPosition)) {
            ((View)this).setVerticalScrollbarPosition((int)customSettings.verticalScrollbarPosition);
        }
        if (hashMap.get((Object)"disableVerticalScroll") != null) {
            final Boolean disableVerticalScroll = this.customSettings.disableVerticalScroll;
            final Boolean disableVerticalScroll2 = customSettings.disableVerticalScroll;
            if (disableVerticalScroll != disableVerticalScroll2) {
                ((View)this).setVerticalScrollBarEnabled(!disableVerticalScroll2 && customSettings.verticalScrollBarEnabled);
            }
        }
        if (hashMap.get((Object)"disableHorizontalScroll") != null) {
            final Boolean disableHorizontalScroll = this.customSettings.disableHorizontalScroll;
            final Boolean disableHorizontalScroll2 = customSettings.disableHorizontalScroll;
            if (disableHorizontalScroll != disableHorizontalScroll2) {
                boolean horizontalScrollBarEnabled3 = b2;
                if (!disableHorizontalScroll2) {
                    horizontalScrollBarEnabled3 = b2;
                    if (customSettings.horizontalScrollBarEnabled) {
                        horizontalScrollBarEnabled3 = true;
                    }
                }
                ((View)this).setHorizontalScrollBarEnabled(horizontalScrollBarEnabled3);
            }
        }
        if (hashMap.get((Object)"overScrollMode") != null && !this.customSettings.overScrollMode.equals((Object)customSettings.overScrollMode)) {
            this.setOverScrollMode((int)customSettings.overScrollMode);
        }
        if (hashMap.get((Object)"networkAvailable") != null) {
            final Boolean networkAvailable = this.customSettings.networkAvailable;
            final Boolean networkAvailable2 = customSettings.networkAvailable;
            if (networkAvailable != networkAvailable2) {
                this.setNetworkAvailable((boolean)networkAvailable2);
            }
        }
        if (hashMap.get((Object)"rendererPriorityPolicy") != null) {
            final Map<String, Object> rendererPriorityPolicy = this.customSettings.rendererPriorityPolicy;
            if ((rendererPriorityPolicy == null || rendererPriorityPolicy.get((Object)"rendererRequestedPriority") != customSettings.rendererPriorityPolicy.get((Object)"rendererRequestedPriority") || this.customSettings.rendererPriorityPolicy.get((Object)"waivedWhenNotVisible") != customSettings.rendererPriorityPolicy.get((Object)"waivedWhenNotVisible")) && Build$VERSION.SDK_INT >= 26) {
                b.y(this, (int)customSettings.rendererPriorityPolicy.get((Object)"rendererRequestedPriority"), (boolean)customSettings.rendererPriorityPolicy.get((Object)"waivedWhenNotVisible"));
            }
        }
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        if (sdk_INT2 >= 29) {
            if (hashMap.get((Object)"verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, customSettings.verticalScrollbarThumbColor)) {
                sE.q(this, new ColorDrawable(Color.parseColor(customSettings.verticalScrollbarThumbColor)));
            }
            if (hashMap.get((Object)"verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, customSettings.verticalScrollbarTrackColor)) {
                sE.x(this, new ColorDrawable(Color.parseColor(customSettings.verticalScrollbarTrackColor)));
            }
            if (hashMap.get((Object)"horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, customSettings.horizontalScrollbarThumbColor)) {
                sE.A(this, new ColorDrawable(Color.parseColor(customSettings.horizontalScrollbarThumbColor)));
            }
            if (hashMap.get((Object)"horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, customSettings.horizontalScrollbarTrackColor)) {
                sE.C(this, new ColorDrawable(Color.parseColor(customSettings.horizontalScrollbarTrackColor)));
            }
        }
        if (hashMap.get((Object)"algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, customSettings.algorithmicDarkeningAllowed) && d.a("ALGORITHMIC_DARKENING") && sdk_INT2 >= 29) {
            final boolean booleanValue3 = customSettings.algorithmicDarkeningAllowed;
            if (!z.E.b()) {
                throw z.a();
            }
            q.a(settings).k(booleanValue3);
        }
        if (hashMap.get((Object)"enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, customSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            final boolean booleanValue4 = customSettings.enterpriseAuthenticationAppLinkPolicyEnabled;
            if (!((c)z.N).b()) {
                throw z.a();
            }
            q.a(settings).l(booleanValue4);
        }
        if (hashMap.get((Object)"requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, customSettings.requestedWithHeaderOriginAllowList) && d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            final Set<String> requestedWithHeaderOriginAllowList = customSettings.requestedWithHeaderOriginAllowList;
            if (!((c)z.P).b()) {
                throw z.a();
            }
            q.a(settings).p((Set)requestedWithHeaderOriginAllowList);
        }
        if (this.plugin != null) {
            final WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt != null) {
                webViewAssetLoaderExt.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, ((View)this).getContext());
        }
        this.customSettings = customSettings;
    }
    
    @Override
    public void setUserContentController(final UserContentController userContentController) {
        this.userContentController = userContentController;
    }
    
    @Override
    public void setWebMessageChannels(final Map<String, WebMessageChannel> webMessageChannels) {
        this.webMessageChannels = webMessageChannels;
    }
    
    public ActionMode startActionMode(final ActionMode$Callback actionMode$Callback) {
        if (this.customSettings.useHybridComposition && !this.customSettings.disableContextMenu) {
            final Map<String, Object> contextMenu = this.contextMenu;
            if (contextMenu == null || contextMenu.keySet().size() == 0) {
                return super.startActionMode(actionMode$Callback);
            }
        }
        return this.rebuildActionMode(super.startActionMode(actionMode$Callback), actionMode$Callback);
    }
    
    public ActionMode startActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        if (this.customSettings.useHybridComposition && !this.customSettings.disableContextMenu) {
            final Map<String, Object> contextMenu = this.contextMenu;
            if (contextMenu == null || contextMenu.keySet().size() == 0) {
                return super.startActionMode(actionMode$Callback, n);
            }
        }
        return this.rebuildActionMode(super.startActionMode(actionMode$Callback, n), actionMode$Callback);
    }
    
    @Override
    public void takeScreenshot(final Map<String, Object> map, final o o) {
        this.mainLooperHandler.post((Runnable)new Runnable(this, map, Util.getPixelDensity(((View)this).getContext()), o) {
            final InAppWebView this$0;
            final float val$pixelDensity;
            final o val$result;
            final Map val$screenshotConfiguration;
            
            public void run() {
                Label_0434: {
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    Bitmap scaledBitmap = null;
                    Bitmap$CompressFormat value = null;
                    int intValue = 0;
                    Label_0384: {
                        Bitmap bitmap = null;
                        Bitmap$CompressFormat png = null;
                        Label_0375: {
                            try {
                                bitmap = Bitmap.createBitmap(((View)this.this$0).getMeasuredWidth(), ((View)this.this$0).getMeasuredHeight(), Bitmap$Config.ARGB_8888);
                                final Canvas canvas = new Canvas(bitmap);
                                canvas.translate((float)(-((View)this.this$0).getScrollX()), (float)(-((View)this.this$0).getScrollY()));
                                ((View)this.this$0).draw(canvas);
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                png = Bitmap$CompressFormat.PNG;
                                final Map val$screenshotConfiguration = this.val$screenshotConfiguration;
                                if (val$screenshotConfiguration == null) {
                                    break Label_0375;
                                }
                                final Map map = (Map)val$screenshotConfiguration.get((Object)"rect");
                                if (map != null) {
                                    bitmap = Bitmap.createBitmap(bitmap, (int)Math.floor((double)map.get((Object)"x") * this.val$pixelDensity + 0.5), (int)Math.floor((double)map.get((Object)"y") * this.val$pixelDensity + 0.5), Math.min(bitmap.getWidth(), (int)Math.floor((double)map.get((Object)"width") * this.val$pixelDensity + 0.5)), Math.min(bitmap.getHeight(), (int)Math.floor((double)map.get((Object)"height") * this.val$pixelDensity + 0.5)));
                                }
                            }
                            catch (final IllegalArgumentException ex) {
                                break Label_0434;
                            }
                            final Double n = (Double)this.val$screenshotConfiguration.get((Object)"snapshotWidth");
                            scaledBitmap = bitmap;
                            if (n != null) {
                                final int n2 = (int)Math.floor(n * this.val$pixelDensity + 0.5);
                                scaledBitmap = Bitmap.createScaledBitmap(bitmap, n2, (int)(n2 / (bitmap.getWidth() / (float)bitmap.getHeight())), true);
                            }
                            try {
                                value = Bitmap$CompressFormat.valueOf((String)this.val$screenshotConfiguration.get((Object)"compressFormat"));
                            }
                            catch (final IllegalArgumentException ex2) {
                                Log.e("InAppWebView", "", (Throwable)ex2);
                                value = png;
                            }
                            intValue = (int)this.val$screenshotConfiguration.get((Object)"quality");
                            break Label_0384;
                        }
                        scaledBitmap = bitmap;
                        intValue = 100;
                        value = png;
                    }
                    scaledBitmap.compress(value, intValue, (OutputStream)byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (final IOException ex3) {
                        Log.e("InAppWebView", "", (Throwable)ex3);
                    }
                    scaledBitmap.recycle();
                    this.val$result.success((Object)byteArrayOutputStream.toByteArray());
                    return;
                }
                final IllegalArgumentException ex;
                Log.e("InAppWebView", "", (Throwable)ex);
                this.val$result.success((Object)null);
            }
        });
    }
    
    public class DownloadStartListener implements DownloadListener
    {
        final InAppWebView this$0;
        
        public DownloadStartListener(final InAppWebView this$0) {
            this.this$0 = this$0;
        }
        
        public void onDownloadStart(final String s, final String s2, final String s3, final String s4, final long n) {
            final DownloadStartRequest downloadStartRequest = new DownloadStartRequest(s, s2, s3, s4, n, URLUtil.guessFileName(s, s3, s4), null);
            final WebViewChannelDelegate channelDelegate = this.this$0.channelDelegate;
            if (channelDelegate != null) {
                channelDelegate.onDownloadStartRequest(downloadStartRequest);
            }
        }
    }
}

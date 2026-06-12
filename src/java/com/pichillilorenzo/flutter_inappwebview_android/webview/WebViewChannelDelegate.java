package com.pichillilorenzo.flutter_inappwebview_android.webview;

import G0.c;
import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import G0.b;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import java.io.IOException;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import G0.B;
import G0.e;
import G0.z;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import F0.w;
import android.net.Uri;
import F0.n;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import java.util.ArrayList;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import F0.d;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import java.util.Map;
import F4.m;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import Y3.a;
import F4.o;
import java.util.HashMap;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class WebViewChannelDelegate extends ChannelDelegateImpl
{
    static final String LOG_TAG = "WebViewChannelDelegate";
    private InAppWebView webView;
    
    public WebViewChannelDelegate(final InAppWebView webView, final p p2) {
        super(p2);
        this.webView = webView;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.webView = null;
    }
    
    public void onCallJsHandler(final String s, final String s2, final CallJsHandlerCallback callJsHandlerCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            callJsHandlerCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"handlerName", (Object)s);
        hashMap.put((Object)"args", (Object)s2);
        channel.a("onCallJsHandler", (Object)hashMap, (o)callJsHandlerCallback);
    }
    
    public void onCloseWindow() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCloseWindow", (Object)new HashMap(), (o)null);
    }
    
    public void onConsoleMessage(final String s, final int n) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"message", (Object)s);
        hashMap.put((Object)"messageLevel", (Object)n);
        channel.a("onConsoleMessage", (Object)hashMap, (o)null);
    }
    
    public void onContextMenuActionItemClicked(final int n, final String s) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        a.m(n, hashMap, "id", n, "androidId");
        hashMap.put((Object)"iosId", (Object)null);
        hashMap.put((Object)"title", (Object)s);
        channel.a("onContextMenuActionItemClicked", (Object)hashMap, (o)null);
    }
    
    public void onCreateContextMenu(final HitTestResult hitTestResult) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCreateContextMenu", (Object)hitTestResult.toMap(), (o)null);
    }
    
    public void onCreateWindow(final CreateWindowAction createWindowAction, final CreateWindowCallback createWindowCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            createWindowCallback.defaultBehaviour(null);
            return;
        }
        channel.a("onCreateWindow", (Object)createWindowAction.toMap(), (o)createWindowCallback);
    }
    
    public void onDownloadStartRequest(final DownloadStartRequest downloadStartRequest) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onDownloadStartRequest", (Object)downloadStartRequest.toMap(), (o)null);
    }
    
    public void onEnterFullscreen() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onEnterFullscreen", (Object)new HashMap(), (o)null);
    }
    
    public void onExitFullscreen() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onExitFullscreen", (Object)new HashMap(), (o)null);
    }
    
    @Deprecated
    public void onFindResultReceived(final int n, final int n2, final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        a.m(n, hashMap, "activeMatchOrdinal", n2, "numberOfMatches");
        hashMap.put((Object)"isDoneCounting", (Object)b);
        channel.a("onFindResultReceived", (Object)hashMap, (o)null);
    }
    
    public void onFormResubmission(final String s, final FormResubmissionCallback formResubmissionCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            formResubmissionCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        channel.a("onFormResubmission", (Object)hashMap, (o)formResubmissionCallback);
    }
    
    public void onGeolocationPermissionsHidePrompt() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onGeolocationPermissionsHidePrompt", (Object)new HashMap(), (o)null);
    }
    
    public void onGeolocationPermissionsShowPrompt(final String s, final GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"origin", (Object)s);
        channel.a("onGeolocationPermissionsShowPrompt", (Object)hashMap, (o)geolocationPermissionsShowPromptCallback);
    }
    
    public void onHideContextMenu() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onHideContextMenu", (Object)new HashMap(), (o)null);
    }
    
    public void onJsAlert(final String s, final String s2, final Boolean b, final JsAlertCallback jsAlertCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            jsAlertCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"message", (Object)s2);
        hashMap.put((Object)"isMainFrame", (Object)b);
        channel.a("onJsAlert", (Object)hashMap, (o)jsAlertCallback);
    }
    
    public void onJsBeforeUnload(final String s, final String s2, final JsBeforeUnloadCallback jsBeforeUnloadCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            jsBeforeUnloadCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"message", (Object)s2);
        channel.a("onJsBeforeUnload", (Object)hashMap, (o)jsBeforeUnloadCallback);
    }
    
    public void onJsConfirm(final String s, final String s2, final Boolean b, final JsConfirmCallback jsConfirmCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            jsConfirmCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"message", (Object)s2);
        hashMap.put((Object)"isMainFrame", (Object)b);
        channel.a("onJsConfirm", (Object)hashMap, (o)jsConfirmCallback);
    }
    
    public void onJsPrompt(final String s, final String s2, final String s3, final Boolean b, final JsPromptCallback jsPromptCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            jsPromptCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"message", (Object)s2);
        hashMap.put((Object)"defaultValue", (Object)s3);
        hashMap.put((Object)"isMainFrame", (Object)b);
        channel.a("onJsPrompt", (Object)hashMap, (o)jsPromptCallback);
    }
    
    public CustomSchemeResponse onLoadResourceWithCustomScheme(final WebResourceRequestExt webResourceRequestExt) {
        final p channel = this.getChannel();
        if (channel == null) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"request", (Object)webResourceRequestExt.toMap());
        return Util.invokeMethodAndWaitResult(channel, "onLoadResourceWithCustomScheme", hashMap, (SyncBaseCallbackResultImpl<CustomSchemeResponse>)new SyncLoadResourceWithCustomSchemeCallback());
    }
    
    public void onLoadResourceWithCustomScheme(final WebResourceRequestExt webResourceRequestExt, final LoadResourceWithCustomSchemeCallback loadResourceWithCustomSchemeCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            loadResourceWithCustomSchemeCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"request", (Object)webResourceRequestExt.toMap());
        channel.a("onLoadResourceWithCustomScheme", (Object)hashMap, (o)loadResourceWithCustomSchemeCallback);
    }
    
    public void onLoadStart(final String s) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        channel.a("onLoadStart", (Object)hashMap, (o)null);
    }
    
    public void onLoadStop(final String s) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        channel.a("onLoadStop", (Object)hashMap, (o)null);
    }
    
    public void onLongPressHitTestResult(final HitTestResult hitTestResult) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onLongPressHitTestResult", (Object)hitTestResult.toMap(), (o)null);
    }
    
    @Override
    public void onMethodCall(final m m, o o) {
        try {
            final int n = WebViewChannelDelegate$8.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.valueOf(m.a).ordinal()];
            boolean b = true;
            final boolean b2 = true;
            final boolean b3 = true;
            final boolean b4 = true;
            final Object o2 = null;
            final Object o3 = null;
            final Object o4 = null;
            final Object o5 = null;
            final Object o6 = null;
            final Object o7 = null;
            switch (n) {
                case 74: {
                    final InAppWebView webView = this.webView;
                    if (webView != null) {
                        webView.clearFormData();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 73: {
                    final InAppWebView webView2 = this.webView;
                    if (webView2 != null) {
                        o.success((Object)webView2.isInFullscreen());
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 72: {
                    final InAppWebView webView3 = this.webView;
                    if (webView3 != null) {
                        o.success((Object)webView3.canScrollHorizontally());
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 71: {
                    final InAppWebView webView4 = this.webView;
                    if (webView4 != null) {
                        o.success((Object)webView4.canScrollVertically());
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 70: {
                    if (this.webView == null) {
                        o.success((Object)Boolean.TRUE);
                        break;
                    }
                    final Map map = (Map)m.a("webMessageListener");
                    final InAppWebView webView5 = this.webView;
                    final WebMessageListener fromMap = WebMessageListener.fromMap(webView5, webView5.getPlugin().messenger, (Map<String, Object>)map);
                    if (this.webView != null && d.a("WEB_MESSAGE_LISTENER")) {
                        try {
                            this.webView.addWebMessageListener(fromMap);
                            o.success((Object)Boolean.TRUE);
                        }
                        catch (final Exception ex) {
                            o.error("WebViewChannelDelegate", ((Throwable)ex).getMessage(), (Object)null);
                        }
                        break;
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 69: {
                    if (this.webView == null || !d.a("POST_WEB_MESSAGE")) {
                        o.success((Object)Boolean.TRUE);
                        break;
                    }
                    final WebMessageCompatExt fromMap2 = WebMessageCompatExt.fromMap((Map<String, Object>)m.a("message"));
                    final String s = (String)m.a("targetOrigin");
                    final ArrayList list = new ArrayList();
                    final List<WebMessagePortCompatExt> ports = fromMap2.getPorts();
                    if (ports != null) {
                        for (final WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                            final WebMessageChannel webMessageChannel = (WebMessageChannel)this.webView.getWebMessageChannels().get((Object)webMessagePortCompatExt.getWebMessageChannelId());
                            if (webMessageChannel != null && this.webView != null) {
                                list.add((Object)webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                            }
                        }
                    }
                    final Object data = fromMap2.getData();
                    if (this.webView != null) {
                        Label_0924: {
                            Label_0912: {
                                try {
                                    if (d.a("WEB_MESSAGE_ARRAY_BUFFER") && data != null && fromMap2.getType() == 1) {
                                        w.g((WebView)this.webView, new n((byte[])data, (F0.o[])list.toArray((Object[])new F0.o[0])), Uri.parse(s));
                                        break Label_0912;
                                    }
                                }
                                catch (final Exception ex2) {
                                    break Label_0924;
                                }
                                final InAppWebView webView6 = this.webView;
                                String string;
                                if (data != null) {
                                    string = data.toString();
                                }
                                else {
                                    string = null;
                                }
                                w.g((WebView)webView6, new n(string, (F0.o[])list.toArray((Object[])new F0.o[0])), Uri.parse(s));
                            }
                            o.success((Object)Boolean.TRUE);
                            break;
                        }
                        final Exception ex2;
                        o.error("WebViewChannelDelegate", ((Throwable)ex2).getMessage(), (Object)null);
                        break;
                    }
                    break;
                }
                case 68: {
                    if (this.webView == null) {
                        o.success((Object)null);
                        break;
                    }
                    if (d.a("CREATE_WEB_MESSAGE_CHANNEL")) {
                        o.success((Object)this.webView.createCompatWebMessageChannel().toMap());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 67: {
                    final InAppWebView webView7 = this.webView;
                    if (webView7 != null) {
                        webView7.isSecureContext((ValueCallback<Boolean>)new ValueCallback<Boolean>(this, o) {
                            final WebViewChannelDelegate this$0;
                            final o val$result;
                            
                            public void onReceiveValue(final Boolean b) {
                                this.val$result.success((Object)b);
                            }
                        });
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 66: {
                    if (this.webView != null) {
                        this.webView.callAsyncJavaScript((String)m.a("functionBody"), (Map<String, Object>)m.a("arguments"), ContentWorld.fromMap((Map<String, Object>)m.a("contentWorld")), (ValueCallback<String>)new ValueCallback<String>(this, o) {
                            final WebViewChannelDelegate this$0;
                            final o val$result;
                            
                            public void onReceiveValue(final String s) {
                                this.val$result.success((Object)s);
                            }
                        });
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 65: {
                    final InAppWebView webView8 = this.webView;
                    if (webView8 != null && webView8.getUserContentController() != null) {
                        this.webView.getUserContentController().removeAllUserOnlyScripts();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 64: {
                    final InAppWebView webView9 = this.webView;
                    if (webView9 != null && webView9.getUserContentController() != null) {
                        this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String)m.a("groupName"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 63: {
                    final InAppWebView webView10 = this.webView;
                    if (webView10 != null && webView10.getUserContentController() != null) {
                        o.success((Object)this.webView.getUserContentController().removeUserOnlyScriptAt((int)m.a("index"), UserScript.fromMap((Map<String, Object>)m.a("userScript")).getInjectionTime()));
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 62: {
                    final InAppWebView webView11 = this.webView;
                    if (webView11 != null && webView11.getUserContentController() != null) {
                        o.success((Object)this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map<String, Object>)m.a("userScript"))));
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 61: {
                    final InAppWebView webView12 = this.webView;
                    if (webView12 != null) {
                        webView12.clearHistory();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 60: {
                    final InAppWebView webView13 = this.webView;
                    if (webView13 != null) {
                        o.success((Object)SslCertificateExt.toMap(webView13.getCertificate()));
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 59: {
                    final InAppWebView webView14 = this.webView;
                    if (webView14 != null) {
                        o.success((Object)((View)webView14).getScrollY());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 58: {
                    final InAppWebView webView15 = this.webView;
                    if (webView15 != null) {
                        o.success((Object)((View)webView15).getScrollX());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 57: {
                    final InAppWebView webView16 = this.webView;
                    if (webView16 != null) {
                        o.success((Object)webView16.requestImageRef());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 56: {
                    final InAppWebView webView17 = this.webView;
                    if (webView17 != null) {
                        o.success((Object)webView17.requestFocusNodeHref());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 55: {
                    if (this.webView != null) {
                        this.webView.setContextMenu((Map<String, Object>)m.a("contextMenu"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 54: {
                    final InAppWebView webView18 = this.webView;
                    if (webView18 != null) {
                        webView18.clearFocus();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 53: {
                    final InAppWebView webView19 = this.webView;
                    if (webView19 != null) {
                        o.success((Object)webView19.zoomOut());
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 52: {
                    final InAppWebView webView20 = this.webView;
                    if (webView20 != null) {
                        o.success((Object)webView20.zoomIn());
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 51: {
                    if (this.webView != null) {
                        this.webView.saveWebArchive((String)m.a("filePath"), (boolean)m.a("autoname"), (ValueCallback)new ValueCallback<String>(this, o) {
                            final WebViewChannelDelegate this$0;
                            final o val$result;
                            
                            public void onReceiveValue(final String s) {
                                this.val$result.success((Object)s);
                            }
                        });
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 50: {
                    if (this.webView != null) {
                        o.success((Object)this.webView.pageUp((boolean)m.a("top")));
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 49: {
                    if (this.webView != null) {
                        o.success((Object)this.webView.pageDown((boolean)m.a("bottom")));
                        break;
                    }
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                case 48: {
                    final InAppWebView webView21 = this.webView;
                    if (webView21 != null) {
                        o.success((Object)HitTestResult.fromWebViewHitTestResult(webView21.getHitTestResult()).toMap());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 47: {
                    final InAppWebView webView22 = this.webView;
                    if (webView22 != null) {
                        webView22.getSelectedText((ValueCallback<String>)new ValueCallback<String>(this, o) {
                            final WebViewChannelDelegate this$0;
                            final o val$result;
                            
                            public void onReceiveValue(final String s) {
                                this.val$result.success((Object)s);
                            }
                        });
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 46: {
                    final InAppWebView webView23 = this.webView;
                    if (webView23 != null) {
                        o.success((Object)webView23.getZoomScale());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 45: {
                    final InAppWebView webView24 = this.webView;
                    Object originalUrl = o7;
                    if (webView24 != null) {
                        originalUrl = webView24.getOriginalUrl();
                    }
                    o.success(originalUrl);
                    break;
                }
                case 44: {
                    if (this.webView != null) {
                        this.webView.zoomBy((float)(double)m.a("zoomFactor"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 43: {
                    final InAppWebView webView25 = this.webView;
                    if (webView25 != null) {
                        webView25.getContentWidth((ValueCallback<Integer>)new ValueCallback<Integer>(this, o) {
                            final WebViewChannelDelegate this$0;
                            final o val$result;
                            
                            public void onReceiveValue(final Integer n) {
                                this.val$result.success((Object)n);
                            }
                        });
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 42: {
                    final InAppWebView webView26 = this.webView;
                    if (webView26 != null) {
                        o.success((Object)webView26.getContentHeight());
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 41: {
                    if (this.webView != null) {
                        final PrintJobSettings printJobSettings = new PrintJobSettings();
                        final Map map2 = (Map)m.a("settings");
                        if (map2 != null) {
                            printJobSettings.parse((Map<String, Object>)map2);
                        }
                        o.success((Object)this.webView.printCurrentPage(printJobSettings));
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 40: {
                    final InAppWebView webView27 = this.webView;
                    if (webView27 != null) {
                        webView27.resumeTimers();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 39: {
                    final InAppWebView webView28 = this.webView;
                    if (webView28 != null) {
                        webView28.pauseTimers();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 38: {
                    final InAppWebView webView29 = this.webView;
                    if (webView29 != null) {
                        webView29.onResume();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 37: {
                    final InAppWebView webView30 = this.webView;
                    if (webView30 != null) {
                        webView30.onPause();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 36: {
                    if (this.webView != null) {
                        this.webView.scrollBy((Integer)m.a("x"), (Integer)m.a("y"), (Boolean)m.a("animated"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 35: {
                    if (this.webView != null) {
                        this.webView.scrollTo((Integer)m.a("x"), (Integer)m.a("y"), (Boolean)m.a("animated"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 34: {
                    final InAppWebView webView31 = this.webView;
                    if (webView31 != null) {
                        webView31.clearMatches();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 33: {
                    if (this.webView != null) {
                        this.webView.findNext((boolean)m.a("forward"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 32: {
                    if (this.webView != null) {
                        this.webView.findAllAsync((String)m.a("find"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 31: {
                    final InAppWebView webView32 = this.webView;
                    if (webView32 != null) {
                        webView32.clearSslPreferences();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 30: {
                    final InAppWebView webView33 = this.webView;
                    if (webView33 != null) {
                        webView33.clearAllCache();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 29: {
                    if (this.webView == null || !d.a("START_SAFE_BROWSING")) {
                        o.success((Object)Boolean.FALSE);
                        break;
                    }
                    final Context context = ((View)this.webView).getContext();
                    o = (o)new ValueCallback<Boolean>(this, o) {
                        final WebViewChannelDelegate this$0;
                        final o val$result;
                        
                        public void onReceiveValue(final Boolean b) {
                            this.val$result.success((Object)b);
                        }
                    };
                    final Uri a = w.a;
                    final b d = z.d;
                    if (d.a()) {
                        e.f(context, (ValueCallback)o);
                        break;
                    }
                    if (((c)d).b()) {
                        B.a.getStatics().initSafeBrowsing(context, (ValueCallback)o);
                        break;
                    }
                    throw z.a();
                }
                case 28: {
                    final InAppWebView webView34 = this.webView;
                    Object copyBackForwardList = o2;
                    if (webView34 != null) {
                        copyBackForwardList = webView34.getCopyBackForwardList();
                    }
                    o.success(copyBackForwardList);
                    break;
                }
                case 27: {
                    final InAppWebView webView35 = this.webView;
                    if (webView35 != null && webView35.getInAppBrowserDelegate() instanceof InAppBrowserActivity) {
                        o.success((Object)((InAppBrowserActivity)this.webView.getInAppBrowserDelegate()).isHidden);
                        break;
                    }
                    o.notImplemented();
                    break;
                }
                case 26: {
                    final InAppWebView webView36 = this.webView;
                    if (webView36 != null && webView36.getInAppBrowserDelegate() instanceof InAppBrowserActivity) {
                        ((InAppBrowserActivity)this.webView.getInAppBrowserDelegate()).hide();
                        o.success((Object)Boolean.TRUE);
                        break;
                    }
                    o.notImplemented();
                    break;
                }
                case 25: {
                    final InAppWebView webView37 = this.webView;
                    if (webView37 != null && webView37.getInAppBrowserDelegate() instanceof InAppBrowserActivity) {
                        ((InAppBrowserActivity)this.webView.getInAppBrowserDelegate()).show();
                        o.success((Object)Boolean.TRUE);
                        break;
                    }
                    o.notImplemented();
                    break;
                }
                case 24: {
                    final InAppWebView webView38 = this.webView;
                    if (webView38 != null && webView38.getInAppBrowserDelegate() instanceof InAppBrowserActivity) {
                        ((InAppBrowserActivity)this.webView.getInAppBrowserDelegate()).close(o);
                        break;
                    }
                    o.notImplemented();
                    break;
                }
                case 23: {
                    final InAppWebView webView39 = this.webView;
                    if (webView39 != null && webView39.getInAppBrowserDelegate() instanceof InAppBrowserActivity) {
                        o.success((Object)((InAppBrowserActivity)this.webView.getInAppBrowserDelegate()).getCustomSettings());
                        break;
                    }
                    final InAppWebView webView40 = this.webView;
                    Object customSettings = o3;
                    if (webView40 != null) {
                        customSettings = webView40.getCustomSettings();
                    }
                    o.success(customSettings);
                    break;
                }
                case 22: {
                    final InAppWebView webView41 = this.webView;
                    if (webView41 != null && webView41.getInAppBrowserDelegate() instanceof InAppBrowserActivity) {
                        final InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity)this.webView.getInAppBrowserDelegate();
                        final InAppBrowserSettings inAppBrowserSettings = new InAppBrowserSettings();
                        final HashMap hashMap = (HashMap)m.a("settings");
                        inAppBrowserSettings.parse((Map<String, Object>)hashMap);
                        inAppBrowserActivity.setSettings(inAppBrowserSettings, (HashMap<String, Object>)hashMap);
                    }
                    else if (this.webView != null) {
                        final InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                        final HashMap hashMap2 = (HashMap)m.a("settings");
                        inAppWebViewSettings.parse((Map<String, Object>)hashMap2);
                        this.webView.setSettings(inAppWebViewSettings, (HashMap<String, Object>)hashMap2);
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 21: {
                    if (this.webView != null) {
                        this.webView.takeScreenshot((Map<String, Object>)m.a("screenshotConfiguration"), o);
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 20: {
                    final InAppWebView webView42 = this.webView;
                    o.success((Object)(webView42 != null && webView42.isLoading() && b4));
                    break;
                }
                case 19: {
                    final InAppWebView webView43 = this.webView;
                    if (webView43 != null) {
                        webView43.stopLoading();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 18: {
                    final InAppWebView webView44 = this.webView;
                    if (webView44 == null || !webView44.canGoBackOrForward((int)m.a("steps"))) {
                        b = false;
                    }
                    o.success((Object)b);
                    break;
                }
                case 17: {
                    final InAppWebView webView45 = this.webView;
                    if (webView45 != null) {
                        webView45.goBackOrForward((int)m.a("steps"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 16: {
                    final InAppWebView webView46 = this.webView;
                    o.success((Object)(webView46 != null && webView46.canGoForward() && b2));
                    break;
                }
                case 15: {
                    final InAppWebView webView47 = this.webView;
                    if (webView47 != null) {
                        webView47.goForward();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 14: {
                    final InAppWebView webView48 = this.webView;
                    o.success((Object)(webView48 != null && webView48.canGoBack() && b3));
                    break;
                }
                case 13: {
                    final InAppWebView webView49 = this.webView;
                    if (webView49 != null) {
                        webView49.goBack();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 12: {
                    final InAppWebView webView50 = this.webView;
                    if (webView50 != null) {
                        webView50.reload();
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 11: {
                    if (this.webView != null) {
                        this.webView.injectCSSFileFromUrl((String)m.a("urlFile"), (Map<String, Object>)m.a("cssLinkHtmlTagAttributes"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 10: {
                    if (this.webView != null) {
                        this.webView.injectCSSCode((String)m.a("source"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 9: {
                    if (this.webView != null) {
                        this.webView.injectJavascriptFileFromUrl((String)m.a("urlFile"), (Map<String, Object>)m.a("scriptHtmlTagAttributes"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 8: {
                    if (this.webView != null) {
                        this.webView.evaluateJavascript((String)m.a("source"), ContentWorld.fromMap((Map<String, Object>)m.a("contentWorld")), (ValueCallback<String>)new ValueCallback<String>(this, o) {
                            final WebViewChannelDelegate this$0;
                            final o val$result;
                            
                            public void onReceiveValue(final String s) {
                                this.val$result.success((Object)s);
                            }
                        });
                        break;
                    }
                    o.success((Object)null);
                    break;
                }
                case 7: {
                    if (this.webView != null) {
                        final String s2 = (String)m.a("assetFilePath");
                        try {
                            this.webView.loadFile(s2);
                        }
                        catch (final IOException ex3) {
                            ((Throwable)ex3).printStackTrace();
                            o.error("WebViewChannelDelegate", ((Throwable)ex3).getMessage(), (Object)null);
                            return;
                        }
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 6: {
                    if (this.webView != null) {
                        this.webView.loadDataWithBaseURL((String)m.a("baseUrl"), (String)m.a("data"), (String)m.a("mimeType"), (String)m.a("encoding"), (String)m.a("historyUrl"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 5: {
                    if (this.webView != null) {
                        this.webView.postUrl((String)m.a("url"), (byte[])m.a("postData"));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 4: {
                    if (this.webView != null) {
                        this.webView.loadUrl(URLRequest.fromMap((Map<String, Object>)m.a("urlRequest")));
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                case 3: {
                    final InAppWebView webView51 = this.webView;
                    Object value = o4;
                    if (webView51 != null) {
                        value = webView51.getProgress();
                    }
                    o.success(value);
                    break;
                }
                case 2: {
                    final InAppWebView webView52 = this.webView;
                    Object title = o5;
                    if (webView52 != null) {
                        title = webView52.getTitle();
                    }
                    o.success(title);
                    break;
                }
                case 1: {
                    final InAppWebView webView53 = this.webView;
                    Object url = o6;
                    if (webView53 != null) {
                        url = webView53.getUrl();
                    }
                    o.success(url);
                    break;
                }
            }
        }
        catch (final IllegalArgumentException ex4) {
            o.notImplemented();
        }
    }
    
    public void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        a.m(n, hashMap, "x", n2, "y");
        hashMap.put((Object)"clampedX", (Object)b);
        hashMap.put((Object)"clampedY", (Object)b2);
        channel.a("onOverScrolled", (Object)hashMap, (o)null);
    }
    
    public void onPageCommitVisible(final String s) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        channel.a("onPageCommitVisible", (Object)hashMap, (o)null);
    }
    
    public void onPermissionRequest(final String s, final List<String> list, final Object o, final PermissionRequestCallback permissionRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            permissionRequestCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"origin", (Object)s);
        hashMap.put((Object)"resources", (Object)list);
        hashMap.put((Object)"frame", o);
        channel.a("onPermissionRequest", (Object)hashMap, (o)permissionRequestCallback);
    }
    
    public void onPermissionRequestCanceled(final String s, final List<String> list) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"origin", (Object)s);
        hashMap.put((Object)"resources", (Object)list);
        channel.a("onPermissionRequestCanceled", (Object)hashMap, (o)null);
    }
    
    public void onPrintRequest(final String s, final String s2, final PrintRequestCallback printRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            printRequestCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"printJobId", (Object)s2);
        channel.a("onPrintRequest", (Object)hashMap, (o)printRequestCallback);
    }
    
    public void onProgressChanged(final int n) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"progress", (Object)n);
        channel.a("onProgressChanged", (Object)hashMap, (o)null);
    }
    
    public void onReceivedClientCertRequest(final ClientCertChallenge clientCertChallenge, final ReceivedClientCertRequestCallback receivedClientCertRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            receivedClientCertRequestCallback.defaultBehaviour(null);
            return;
        }
        channel.a("onReceivedClientCertRequest", (Object)clientCertChallenge.toMap(), (o)receivedClientCertRequestCallback);
    }
    
    public void onReceivedError(final WebResourceRequestExt webResourceRequestExt, final WebResourceErrorExt webResourceErrorExt) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"request", (Object)webResourceRequestExt.toMap());
        hashMap.put((Object)"error", (Object)webResourceErrorExt.toMap());
        channel.a("onReceivedError", (Object)hashMap, (o)null);
    }
    
    public void onReceivedHttpAuthRequest(final HttpAuthenticationChallenge httpAuthenticationChallenge, final ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            receivedHttpAuthRequestCallback.defaultBehaviour(null);
            return;
        }
        channel.a("onReceivedHttpAuthRequest", (Object)httpAuthenticationChallenge.toMap(), (o)receivedHttpAuthRequestCallback);
    }
    
    public void onReceivedHttpError(final WebResourceRequestExt webResourceRequestExt, final WebResourceResponseExt webResourceResponseExt) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"request", (Object)webResourceRequestExt.toMap());
        hashMap.put((Object)"errorResponse", (Object)webResourceResponseExt.toMap());
        channel.a("onReceivedHttpError", (Object)hashMap, (o)null);
    }
    
    public void onReceivedIcon(final byte[] array) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"icon", (Object)array);
        channel.a("onReceivedIcon", (Object)hashMap, (o)null);
    }
    
    public void onReceivedLoginRequest(final String s, final String s2, final String s3) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"realm", (Object)s);
        hashMap.put((Object)"account", (Object)s2);
        hashMap.put((Object)"args", (Object)s3);
        channel.a("onReceivedLoginRequest", (Object)hashMap, (o)null);
    }
    
    public void onReceivedServerTrustAuthRequest(final ServerTrustChallenge serverTrustChallenge, final ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
            return;
        }
        channel.a("onReceivedServerTrustAuthRequest", (Object)serverTrustChallenge.toMap(), (o)receivedServerTrustAuthRequestCallback);
    }
    
    public void onReceivedTouchIconUrl(final String s, final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"precomposed", (Object)b);
        channel.a("onReceivedTouchIconUrl", (Object)hashMap, (o)null);
    }
    
    public void onRenderProcessGone(final boolean b, final int n) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"didCrash", (Object)b);
        hashMap.put((Object)"rendererPriorityAtExit", (Object)n);
        channel.a("onRenderProcessGone", (Object)hashMap, (o)null);
    }
    
    public void onRenderProcessResponsive(final String s, final RenderProcessResponsiveCallback renderProcessResponsiveCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            renderProcessResponsiveCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        channel.a("onRenderProcessResponsive", (Object)hashMap, (o)renderProcessResponsiveCallback);
    }
    
    public void onRenderProcessUnresponsive(final String s, final RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        channel.a("onRenderProcessUnresponsive", (Object)hashMap, (o)renderProcessUnresponsiveCallback);
    }
    
    public void onRequestFocus() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onRequestFocus", (Object)new HashMap(), (o)null);
    }
    
    public void onSafeBrowsingHit(final String s, final int n, final SafeBrowsingHitCallback safeBrowsingHitCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            safeBrowsingHitCallback.defaultBehaviour(null);
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"threatType", (Object)n);
        channel.a("onSafeBrowsingHit", (Object)hashMap, (o)safeBrowsingHitCallback);
    }
    
    public void onScrollChanged(final int n, final int n2) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        a.m(n, hashMap, "x", n2, "y");
        channel.a("onScrollChanged", (Object)hashMap, (o)null);
    }
    
    public void onTitleChanged(final String s) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"title", (Object)s);
        channel.a("onTitleChanged", (Object)hashMap, (o)null);
    }
    
    public void onUpdateVisitedHistory(final String s, final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"isReload", (Object)b);
        channel.a("onUpdateVisitedHistory", (Object)hashMap, (o)null);
    }
    
    public void onZoomScaleChanged(final float n, final float n2) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"oldScale", (Object)n);
        hashMap.put((Object)"newScale", (Object)n2);
        channel.a("onZoomScaleChanged", (Object)hashMap, (o)null);
    }
    
    public WebResourceResponseExt shouldInterceptRequest(final WebResourceRequestExt webResourceRequestExt) {
        final p channel = this.getChannel();
        if (channel == null) {
            return null;
        }
        return Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), (SyncBaseCallbackResultImpl<WebResourceResponseExt>)new SyncShouldInterceptRequestCallback());
    }
    
    public void shouldInterceptRequest(final WebResourceRequestExt webResourceRequestExt, final ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            shouldInterceptRequestCallback.defaultBehaviour(null);
            return;
        }
        channel.a("shouldInterceptRequest", (Object)webResourceRequestExt.toMap(), (o)shouldInterceptRequestCallback);
    }
    
    public void shouldOverrideUrlLoading(final NavigationAction navigationAction, final ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback) {
        final p channel = this.getChannel();
        if (channel == null) {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
            return;
        }
        channel.a("shouldOverrideUrlLoading", (Object)navigationAction.toMap(), (o)shouldOverrideUrlLoadingCallback);
    }
    
    public static class CallJsHandlerCallback extends BaseCallbackResultImpl<Object>
    {
        @Override
        public Object decodeResult(final Object o) {
            return o;
        }
    }
    
    public static class CreateWindowCallback extends BaseCallbackResultImpl<Boolean>
    {
        @Override
        public Boolean decodeResult(final Object o) {
            return o instanceof Boolean && (boolean)o;
        }
    }
    
    public static class FormResubmissionCallback extends BaseCallbackResultImpl<Integer>
    {
        @Override
        public Integer decodeResult(final Object o) {
            Integer n;
            if (o instanceof Integer) {
                n = (Integer)o;
            }
            else {
                n = null;
            }
            return n;
        }
    }
    
    public static class GeolocationPermissionsShowPromptCallback extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse>
    {
        @Override
        public GeolocationPermissionShowPromptResponse decodeResult(final Object o) {
            return GeolocationPermissionShowPromptResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class JsAlertCallback extends BaseCallbackResultImpl<JsAlertResponse>
    {
        @Override
        public JsAlertResponse decodeResult(final Object o) {
            return JsAlertResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class JsBeforeUnloadCallback extends BaseCallbackResultImpl<JsBeforeUnloadResponse>
    {
        @Override
        public JsBeforeUnloadResponse decodeResult(final Object o) {
            return JsBeforeUnloadResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class JsConfirmCallback extends BaseCallbackResultImpl<JsConfirmResponse>
    {
        @Override
        public JsConfirmResponse decodeResult(final Object o) {
            return JsConfirmResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class JsPromptCallback extends BaseCallbackResultImpl<JsPromptResponse>
    {
        @Override
        public JsPromptResponse decodeResult(final Object o) {
            return JsPromptResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class LoadResourceWithCustomSchemeCallback extends BaseCallbackResultImpl<CustomSchemeResponse>
    {
        @Override
        public CustomSchemeResponse decodeResult(final Object o) {
            return CustomSchemeResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class PermissionRequestCallback extends BaseCallbackResultImpl<PermissionResponse>
    {
        @Override
        public PermissionResponse decodeResult(final Object o) {
            return PermissionResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class PrintRequestCallback extends BaseCallbackResultImpl<Boolean>
    {
        @Override
        public Boolean decodeResult(final Object o) {
            return o instanceof Boolean && (boolean)o;
        }
    }
    
    public static class ReceivedClientCertRequestCallback extends BaseCallbackResultImpl<ClientCertResponse>
    {
        @Override
        public ClientCertResponse decodeResult(final Object o) {
            return ClientCertResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class ReceivedHttpAuthRequestCallback extends BaseCallbackResultImpl<HttpAuthResponse>
    {
        @Override
        public HttpAuthResponse decodeResult(final Object o) {
            return HttpAuthResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class ReceivedServerTrustAuthRequestCallback extends BaseCallbackResultImpl<ServerTrustAuthResponse>
    {
        @Override
        public ServerTrustAuthResponse decodeResult(final Object o) {
            return ServerTrustAuthResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class RenderProcessResponsiveCallback extends BaseCallbackResultImpl<Integer>
    {
        @Override
        public Integer decodeResult(final Object o) {
            Integer n;
            if (o instanceof Integer) {
                n = (Integer)o;
            }
            else {
                n = null;
            }
            return n;
        }
    }
    
    public static class RenderProcessUnresponsiveCallback extends BaseCallbackResultImpl<Integer>
    {
        @Override
        public Integer decodeResult(final Object o) {
            Integer n;
            if (o instanceof Integer) {
                n = (Integer)o;
            }
            else {
                n = null;
            }
            return n;
        }
    }
    
    public static class SafeBrowsingHitCallback extends BaseCallbackResultImpl<SafeBrowsingResponse>
    {
        @Override
        public SafeBrowsingResponse decodeResult(final Object o) {
            return SafeBrowsingResponse.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt>
    {
        @Override
        public WebResourceResponseExt decodeResult(final Object o) {
            return WebResourceResponseExt.fromMap((Map<String, Object>)o);
        }
    }
    
    public static class ShouldOverrideUrlLoadingCallback extends BaseCallbackResultImpl<NavigationActionPolicy>
    {
        @Override
        public NavigationActionPolicy decodeResult(final Object o) {
            int n;
            if (o instanceof Integer) {
                n = (int)o;
            }
            else {
                n = NavigationActionPolicy.CANCEL.rawValue();
            }
            return NavigationActionPolicy.fromValue(n);
        }
    }
    
    public static class SyncLoadResourceWithCustomSchemeCallback extends SyncBaseCallbackResultImpl<CustomSchemeResponse>
    {
        @Override
        public CustomSchemeResponse decodeResult(final Object o) {
            return new LoadResourceWithCustomSchemeCallback().decodeResult(o);
        }
    }
    
    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
    {
        @Override
        public WebResourceResponseExt decodeResult(final Object o) {
            return new ShouldInterceptRequestCallback().decodeResult(o);
        }
    }
}

package com.pichillilorenzo.flutter_inappwebview_android.webview;

import G0.c;
import G0.b;
import android.net.Uri;
import O.n0;
import android.os.Build$VERSION;
import G0.e;
import android.webkit.ValueCallback;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import android.webkit.WebSettings;
import G0.B;
import G0.z;
import F0.w;
import F0.d;
import F4.o;
import F4.m;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import android.content.pm.PackageInfo;
import android.webkit.WebView;
import android.content.Context;
import java.util.HashMap;
import F4.p;
import android.os.Message;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class InAppWebViewManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;
    
    public InAppWebViewManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_manager"));
        this.keepAliveWebViews = (Map<String, FlutterWebView>)new HashMap();
        this.windowWebViewMessages = (Map<Integer, Message>)new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = plugin;
    }
    
    public void clearAllCache(final Context context, final boolean b) {
        final WebView webView = new WebView(context);
        webView.clearCache(b);
        webView.destroy();
    }
    
    public Map<String, Object> convertWebViewPackageToMap(final PackageInfo packageInfo) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"versionName", (Object)packageInfo.versionName);
        hashMap.put((Object)"packageName", (Object)packageInfo.packageName);
        return (Map<String, Object>)hashMap;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        final Iterator iterator = this.keepAliveWebViews.values().iterator();
        while (iterator.hasNext()) {
            final String keepAliveId = ((FlutterWebView)iterator.next()).keepAliveId;
            if (keepAliveId != null) {
                this.disposeKeepAlive(keepAliveId);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }
    
    public void disposeKeepAlive(final String s) {
        final FlutterWebView flutterWebView = (FlutterWebView)this.keepAliveWebViews.get((Object)s);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            final View view = flutterWebView.getView();
            if (view != null) {
                final ViewGroup viewGroup = (ViewGroup)view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey((Object)s)) {
            this.keepAliveWebViews.put((Object)s, (Object)null);
        }
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        Object convertWebViewPackageToMap = null;
        int n = -1;
        switch (a.hashCode()) {
            case 1867011305: {
                if (!a.equals((Object)"disposeKeepAlive")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1667434977: {
                if (!a.equals((Object)"isMultiProcessEnabled")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1586319888: {
                if (!a.equals((Object)"getCurrentWebViewPackage")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1033609166: {
                if (!a.equals((Object)"clearAllCache")) {
                    break;
                }
                n = 7;
                break;
            }
            case 643643439: {
                if (!a.equals((Object)"getDefaultUserAgent")) {
                    break;
                }
                n = 6;
                break;
            }
            case 426229521: {
                if (!a.equals((Object)"setSafeBrowsingAllowlist")) {
                    break;
                }
                n = 5;
                break;
            }
            case 258673215: {
                if (!a.equals((Object)"getSafeBrowsingPrivacyPolicyUrl")) {
                    break;
                }
                n = 4;
                break;
            }
            case -436220260: {
                if (!a.equals((Object)"clearClientCertPreferences")) {
                    break;
                }
                n = 3;
                break;
            }
            case -633518365: {
                if (!a.equals((Object)"getVariationsHeader")) {
                    break;
                }
                n = 2;
                break;
            }
            case -910403233: {
                if (!a.equals((Object)"setWebContentsDebuggingEnabled")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1496477679: {
                if (!a.equals((Object)"disableWebView")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                o.notImplemented();
                break;
            }
            case 10: {
                final String s = (String)m.a("keepAliveId");
                if (s != null) {
                    this.disposeKeepAlive(s);
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 9: {
                if (!d.a("MULTI_PROCESS")) {
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                final Uri a2 = w.a;
                if (((c)z.G).b()) {
                    o.success((Object)B.a.getStatics().isMultiProcessEnabled());
                    break;
                }
                throw z.a();
            }
            case 8: {
                final InAppWebViewFlutterPlugin plugin = this.plugin;
                Object o2;
                if (plugin != null) {
                    if ((o2 = plugin.activity) == null) {
                        o2 = plugin.applicationContext;
                    }
                }
                else {
                    o2 = null;
                }
                PackageInfo d;
                if (o2 != null) {
                    d = w.d((Context)o2);
                }
                else {
                    d = null;
                }
                if (d != null) {
                    convertWebViewPackageToMap = this.convertWebViewPackageToMap(d);
                }
                o.success(convertWebViewPackageToMap);
                break;
            }
            case 7: {
                final InAppWebViewFlutterPlugin plugin2 = this.plugin;
                if (plugin2 != null) {
                    Object o3;
                    if ((o3 = plugin2.activity) == null) {
                        o3 = plugin2.applicationContext;
                    }
                    if (o3 != null) {
                        this.clearAllCache((Context)o3, (boolean)m.a("includeDiskFiles"));
                    }
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 6: {
                final InAppWebViewFlutterPlugin plugin3 = this.plugin;
                if (plugin3 != null) {
                    o.success((Object)WebSettings.getDefaultUserAgent(plugin3.applicationContext));
                    break;
                }
                o.success((Object)null);
                break;
            }
            case 5: {
                if (d.a("SAFE_BROWSING_ALLOWLIST")) {
                    w.h(new HashSet((Collection)m.a("hosts")), (ValueCallback)new ValueCallback<Boolean>(this, o) {
                        final InAppWebViewManager this$0;
                        final o val$result;
                        
                        public void onReceiveValue(final Boolean b) {
                            this.val$result.success((Object)b);
                        }
                    });
                    break;
                }
                if (d.a("SAFE_BROWSING_WHITELIST")) {
                    final List list = (List)m.a("hosts");
                    final ValueCallback<Boolean> valueCallback = (ValueCallback<Boolean>)new ValueCallback<Boolean>(this, o) {
                        final InAppWebViewManager this$0;
                        final o val$result;
                        
                        public void onReceiveValue(final Boolean b) {
                            this.val$result.success((Object)b);
                        }
                    };
                    final Uri a3 = w.a;
                    w.h(new HashSet((Collection)list), (ValueCallback)valueCallback);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 4: {
                if (d.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    final Uri a4 = w.a;
                    final b g = z.g;
                    Uri uri;
                    if (g.a()) {
                        uri = e.a();
                    }
                    else {
                        if (!((c)g).b()) {
                            throw z.a();
                        }
                        uri = B.a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
                    }
                    o.success((Object)uri.toString());
                    break;
                }
                o.success((Object)null);
                break;
            }
            case 3: {
                WebView.clearClientCertPreferences((Runnable)new Runnable(this, o) {
                    final InAppWebViewManager this$0;
                    final o val$result;
                    
                    public void run() {
                        this.val$result.success((Object)Boolean.TRUE);
                    }
                });
                break;
            }
            case 2: {
                if (!d.a("GET_VARIATIONS_HEADER")) {
                    o.success((Object)null);
                    break;
                }
                final Uri a5 = w.a;
                if (((c)z.M).b()) {
                    o.success((Object)B.a.getStatics().getVariationsHeader());
                    break;
                }
                throw z.a();
            }
            case 1: {
                WebView.setWebContentsDebuggingEnabled((boolean)m.a("debuggingEnabled"));
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 0: {
                if (Build$VERSION.SDK_INT >= 28) {
                    n0.m();
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
        }
    }
}

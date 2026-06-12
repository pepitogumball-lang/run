package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView;
import java.util.HashMap;
import io.flutter.plugin.platform.f;
import android.content.Context;
import F4.u;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import io.flutter.plugin.platform.g;

public class FlutterWebViewFactory extends g
{
    public static final String VIEW_TYPE_ID = "com.pichillilorenzo/flutter_inappwebview";
    private final InAppWebViewFlutterPlugin plugin;
    
    public FlutterWebViewFactory(final InAppWebViewFlutterPlugin plugin) {
        final u a = u.a;
        this.plugin = plugin;
    }
    
    public f create(final Context context, int n, final Object o) {
        final HashMap hashMap = (HashMap)o;
        final Integer value = n;
        final String keepAliveId = (String)hashMap.get((Object)"keepAliveId");
        final String s = (String)hashMap.get((Object)"headlessWebViewId");
        final HeadlessInAppWebViewManager headlessInAppWebViewManager = this.plugin.headlessInAppWebViewManager;
        FlutterWebView flutterWebView = null;
        Label_0099: {
            if (s != null && headlessInAppWebViewManager != null) {
                final HeadlessInAppWebView headlessInAppWebView = (HeadlessInAppWebView)headlessInAppWebViewManager.webViews.get((Object)s);
                if (headlessInAppWebView != null) {
                    final FlutterWebView disposeAndGetFlutterWebView = headlessInAppWebView.disposeAndGetFlutterWebView();
                    if ((flutterWebView = disposeAndGetFlutterWebView) != null) {
                        disposeAndGetFlutterWebView.keepAliveId = keepAliveId;
                        flutterWebView = disposeAndGetFlutterWebView;
                    }
                    break Label_0099;
                }
            }
            flutterWebView = null;
        }
        final InAppWebViewManager inAppWebViewManager = this.plugin.inAppWebViewManager;
        FlutterWebView flutterWebView2 = flutterWebView;
        if (keepAliveId != null && (flutterWebView2 = flutterWebView) == null) {
            flutterWebView2 = flutterWebView;
            if (inAppWebViewManager != null) {
                final FlutterWebView flutterWebView3 = (FlutterWebView)inAppWebViewManager.keepAliveWebViews.get((Object)keepAliveId);
                if ((flutterWebView2 = flutterWebView3) != null) {
                    final View view = flutterWebView3.getView();
                    flutterWebView2 = flutterWebView3;
                    if (view != null) {
                        final ViewGroup viewGroup = (ViewGroup)view.getParent();
                        flutterWebView2 = flutterWebView3;
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                            flutterWebView2 = flutterWebView3;
                        }
                    }
                }
            }
        }
        if (flutterWebView2 == null) {
            n = 1;
        }
        else {
            n = 0;
        }
        FlutterWebView flutterWebView4 = flutterWebView2;
        if (flutterWebView2 == null) {
            Object o2 = value;
            if (keepAliveId != null) {
                o2 = keepAliveId;
            }
            flutterWebView4 = new FlutterWebView(this.plugin, context, o2, (HashMap<String, Object>)hashMap);
        }
        if (keepAliveId != null && inAppWebViewManager != null) {
            inAppWebViewManager.keepAliveWebViews.put((Object)keepAliveId, (Object)flutterWebView4);
        }
        if (n != 0) {
            flutterWebView4.makeInitialLoad((HashMap<String, Object>)hashMap);
        }
        return (f)flutterWebView4;
    }
}

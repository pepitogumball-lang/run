package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import android.content.Context;
import android.app.Activity;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import F4.o;
import F4.m;
import java.util.Iterator;
import java.util.HashMap;
import F4.p;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class HeadlessInAppWebViewManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_headless_inappwebview";
    public InAppWebViewFlutterPlugin plugin;
    public final Map<String, HeadlessInAppWebView> webViews;
    
    public HeadlessInAppWebViewManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_headless_inappwebview"));
        this.webViews = (Map<String, HeadlessInAppWebView>)new HashMap();
        this.plugin = plugin;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        for (final HeadlessInAppWebView headlessInAppWebView : this.webViews.values()) {
            if (headlessInAppWebView != null) {
                headlessInAppWebView.dispose();
            }
        }
        this.webViews.clear();
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String s = (String)m.a("id");
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"run")) {
            o.notImplemented();
        }
        else {
            this.run(s, (HashMap<String, Object>)m.a("params"));
            o.success((Object)Boolean.TRUE);
        }
    }
    
    public void run(final String s, final HashMap<String, Object> hashMap) {
        final InAppWebViewFlutterPlugin plugin = this.plugin;
        if (plugin != null) {
            final Activity activity = plugin.activity;
            if (activity != null || plugin.applicationContext != null) {
                Context applicationContext;
                if ((applicationContext = (Context)activity) == null) {
                    applicationContext = plugin.applicationContext;
                }
                final FlutterWebView flutterWebView = new FlutterWebView(plugin, applicationContext, s, hashMap);
                final HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, s, flutterWebView);
                this.webViews.put((Object)s, (Object)headlessInAppWebView);
                headlessInAppWebView.prepare((Map<String, Object>)hashMap);
                headlessInAppWebView.onWebViewCreated();
                flutterWebView.makeInitialLoad(hashMap);
            }
        }
    }
}

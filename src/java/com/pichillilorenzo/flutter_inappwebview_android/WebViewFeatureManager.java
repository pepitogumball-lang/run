package com.pichillilorenzo.flutter_inappwebview_android;

import android.content.Context;
import F0.d;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class WebViewFeatureManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "WebViewFeatureManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
    public InAppWebViewFlutterPlugin plugin;
    
    public WebViewFeatureManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_webviewfeature"));
        this.plugin = plugin;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"isStartupFeatureSupported")) {
            if (!a.equals((Object)"isFeatureSupported")) {
                o.notImplemented();
            }
            else {
                o.success((Object)d.a((String)m.a("feature")));
            }
        }
        else {
            final InAppWebViewFlutterPlugin plugin = this.plugin;
            if (plugin != null && plugin.activity != null) {
                o.success((Object)d.b((Context)this.plugin.activity, (String)m.a("startupFeature")));
            }
        }
    }
}

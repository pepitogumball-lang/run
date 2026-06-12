package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.BaseBundle;
import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.io.Serializable;
import android.os.Bundle;
import android.app.Activity;
import java.util.List;
import android.content.Context;
import r.g;
import java.util.ArrayList;
import F4.o;
import F4.m;
import java.util.Iterator;
import java.util.UUID;
import F4.p;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class ChromeSafariBrowserManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared;
    public final Map<String, ChromeCustomTabsActivity> browsers;
    public String id;
    public InAppWebViewFlutterPlugin plugin;
    
    static {
        shared = (Map)new HashMap();
    }
    
    public ChromeSafariBrowserManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_chromesafaribrowser"));
        this.browsers = (Map<String, ChromeCustomTabsActivity>)new HashMap();
        final String string = UUID.randomUUID().toString();
        this.id = string;
        this.plugin = plugin;
        ChromeSafariBrowserManager.shared.put((Object)string, (Object)this);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        for (final ChromeCustomTabsActivity chromeCustomTabsActivity : this.browsers.values()) {
            if (chromeCustomTabsActivity != null) {
                chromeCustomTabsActivity.close();
                chromeCustomTabsActivity.dispose();
            }
        }
        this.browsers.clear();
        ChromeSafariBrowserManager.shared.remove((Object)this.id);
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String s = (String)m.a("id");
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 444517567: {
                if (!a.equals((Object)"isAvailable")) {
                    break;
                }
                n = 3;
                break;
            }
            case 268490427: {
                if (!a.equals((Object)"getPackageName")) {
                    break;
                }
                n = 2;
                break;
            }
            case 3417674: {
                if (!a.equals((Object)"open")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1382009261: {
                if (!a.equals((Object)"getMaxToolbarItems")) {
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
            case 3: {
                final InAppWebViewFlutterPlugin plugin = this.plugin;
                if (plugin != null) {
                    final Activity activity = plugin.activity;
                    if (activity != null) {
                        o.success((Object)CustomTabActivityHelper.isAvailable(activity));
                        break;
                    }
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 2: {
                final InAppWebViewFlutterPlugin plugin2 = this.plugin;
                if (plugin2 != null && plugin2.activity != null) {
                    o.success((Object)g.b((Context)this.plugin.activity, (List)m.a("packages"), (boolean)m.a("ignoreDefault")));
                    break;
                }
                o.success((Object)null);
                break;
            }
            case 1: {
                final InAppWebViewFlutterPlugin plugin3 = this.plugin;
                if (plugin3 != null && plugin3.activity != null) {
                    this.open(this.plugin.activity, s, (String)m.a("url"), (HashMap<String, Object>)m.a("headers"), (String)m.a("referrer"), (ArrayList<String>)m.a("otherLikelyURLs"), (HashMap<String, Object>)m.a("settings"), (HashMap<String, Object>)m.a("actionButton"), (HashMap<String, Object>)m.a("secondaryToolbar"), (List<HashMap<String, Object>>)m.a("menuItemList"), o);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                o.success((Object)5);
                break;
            }
        }
    }
    
    public void open(final Activity activity, final String s, final String s2, final HashMap<String, Object> hashMap, final String s3, final ArrayList<String> list, final HashMap<String, Object> hashMap2, final HashMap<String, Object> hashMap3, final HashMap<String, Object> hashMap4, final List<HashMap<String, Object>> list2, final o o) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("url", s2);
        ((BaseBundle)bundle).putString("id", s);
        ((BaseBundle)bundle).putString("managerId", this.id);
        bundle.putSerializable("headers", (Serializable)hashMap);
        ((BaseBundle)bundle).putString("referrer", s3);
        bundle.putSerializable("otherLikelyURLs", (Serializable)list);
        bundle.putSerializable("settings", (Serializable)hashMap2);
        bundle.putSerializable("actionButton", (Serializable)hashMap3);
        bundle.putSerializable("secondaryToolbar", (Serializable)hashMap4);
        bundle.putSerializable("menuItemList", (Serializable)list2);
        final Boolean false = Boolean.FALSE;
        final Boolean b = Util.getOrDefault((Map<String, Object>)hashMap2, "isSingleInstance", false);
        final Boolean b2 = Util.getOrDefault((Map<String, Object>)hashMap2, "isTrustedWebActivity", false);
        if (CustomTabActivityHelper.isAvailable(activity)) {
            Object o2;
            if (!b) {
                if (!b2) {
                    o2 = ChromeCustomTabsActivity.class;
                }
                else {
                    o2 = TrustedWebActivity.class;
                }
            }
            else if (!b2) {
                o2 = ChromeCustomTabsActivitySingleInstance.class;
            }
            else {
                o2 = TrustedWebActivitySingleInstance.class;
            }
            final Intent intent = new Intent((Context)activity, (Class)o2);
            intent.putExtras(bundle);
            if (Util.getOrDefault((Map<String, Object>)hashMap2, "noHistory", false)) {
                intent.addFlags(1073741824);
            }
            activity.startActivity(intent);
            o.success((Object)Boolean.TRUE);
            return;
        }
        o.error("ChromeBrowserManager", "ChromeCustomTabs is not available!", (Object)null);
    }
}

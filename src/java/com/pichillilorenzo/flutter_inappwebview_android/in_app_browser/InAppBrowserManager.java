package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.os.BaseBundle;
import android.content.Context;
import android.util.Log;
import v.e;
import android.net.Uri;
import java.util.Iterator;
import android.os.Parcelable;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import android.content.Intent;
import java.io.Serializable;
import android.os.Bundle;
import java.util.List;
import android.app.Activity;
import F4.o;
import F4.m;
import android.webkit.MimeTypeMap;
import java.util.UUID;
import F4.p;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class InAppBrowserManager extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "InAppBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappbrowser";
    public static final Map<String, InAppBrowserManager> shared;
    public String id;
    public InAppWebViewFlutterPlugin plugin;
    
    static {
        shared = (Map)new HashMap();
    }
    
    public InAppBrowserManager(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappbrowser"));
        final String string = UUID.randomUUID().toString();
        this.id = string;
        this.plugin = plugin;
        InAppBrowserManager.shared.put((Object)string, (Object)this);
    }
    
    public static String getMimeType(String s) {
        s = MimeTypeMap.getFileExtensionFromUrl(s);
        if (s != null) {
            s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
        }
        else {
            s = null;
        }
        return s;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        InAppBrowserManager.shared.remove((Object)this.id);
        this.plugin = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"openWithSystemBrowser")) {
            if (!a.equals((Object)"open")) {
                o.notImplemented();
            }
            else {
                final InAppWebViewFlutterPlugin plugin = this.plugin;
                if (plugin != null) {
                    final Activity activity = plugin.activity;
                    if (activity != null) {
                        this.open(activity, (Map<String, Object>)m.b);
                        o.success((Object)Boolean.TRUE);
                        return;
                    }
                }
                o.success((Object)Boolean.FALSE);
            }
        }
        else {
            final InAppWebViewFlutterPlugin plugin2 = this.plugin;
            if (plugin2 != null && plugin2.activity != null) {
                this.openWithSystemBrowser(this.plugin.activity, (String)m.a("url"), o);
            }
            else {
                o.success((Object)Boolean.FALSE);
            }
        }
    }
    
    public void open(final Activity activity, final Map<String, Object> map) {
        final String s = (String)map.get((Object)"id");
        final Map map2 = (Map)map.get((Object)"urlRequest");
        final String s2 = (String)map.get((Object)"assetFilePath");
        final String s3 = (String)map.get((Object)"data");
        final String s4 = (String)map.get((Object)"mimeType");
        final String s5 = (String)map.get((Object)"encoding");
        final String s6 = (String)map.get((Object)"baseUrl");
        final String s7 = (String)map.get((Object)"historyUrl");
        final Map map3 = (Map)map.get((Object)"settings");
        final Map map4 = (Map)map.get((Object)"contextMenu");
        final Integer n = (Integer)map.get((Object)"windowId");
        final List list = (List)map.get((Object)"initialUserScripts");
        final Map map5 = (Map)map.get((Object)"pullToRefreshSettings");
        final List list2 = (List)map.get((Object)"menuItems");
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("fromActivity", activity.getClass().getName());
        bundle.putSerializable("initialUrlRequest", (Serializable)map2);
        ((BaseBundle)bundle).putString("initialFile", s2);
        ((BaseBundle)bundle).putString("initialData", s3);
        ((BaseBundle)bundle).putString("initialMimeType", s4);
        ((BaseBundle)bundle).putString("initialEncoding", s5);
        ((BaseBundle)bundle).putString("initialBaseUrl", s6);
        ((BaseBundle)bundle).putString("initialHistoryUrl", s7);
        ((BaseBundle)bundle).putString("id", s);
        ((BaseBundle)bundle).putString("managerId", this.id);
        bundle.putSerializable("settings", (Serializable)map3);
        bundle.putSerializable("contextMenu", (Serializable)map4);
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = -1;
        }
        ((BaseBundle)bundle).putInt("windowId", intValue);
        bundle.putSerializable("initialUserScripts", (Serializable)list);
        bundle.putSerializable("pullToRefreshInitialSettings", (Serializable)map5);
        bundle.putSerializable("menuItems", (Serializable)list2);
        this.startInAppBrowserActivity(activity, bundle);
    }
    
    public void openExternalExcludeCurrentApp(final Activity activity, Intent chooser) {
        final String packageName = ((Context)activity).getPackageName();
        final List queryIntentActivities = ((Context)activity).getPackageManager().queryIntentActivities(chooser, 0);
        final ArrayList list = new ArrayList();
        final Iterator iterator = queryIntentActivities.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
            if (!packageName.equals((Object)resolveInfo.activityInfo.packageName)) {
                final Intent intent = (Intent)chooser.clone();
                intent.setPackage(resolveInfo.activityInfo.packageName);
                list.add((Object)intent);
            }
            else {
                b = true;
            }
        }
        if (b && list.size() != 0) {
            if (list.size() == 1) {
                activity.startActivity((Intent)list.get(0));
            }
            else if (list.size() > 0) {
                chooser = Intent.createChooser((Intent)list.remove(list.size() - 1), (CharSequence)null);
                chooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray((Object[])new Parcelable[0]));
                activity.startActivity(chooser);
            }
        }
        else {
            activity.startActivity(chooser);
        }
    }
    
    public void openWithSystemBrowser(final Activity activity, final String s, final o o) {
        Label_0093: {
            Intent intent = null;
            Label_0061: {
                Uri parse;
                try {
                    intent = new Intent("android.intent.action.VIEW");
                    parse = Uri.parse(s);
                    if ("file".equals((Object)parse.getScheme())) {
                        intent.setDataAndType(parse, getMimeType(s));
                        break Label_0061;
                    }
                }
                catch (final RuntimeException ex) {
                    break Label_0093;
                }
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", ((Context)activity).getPackageName());
            this.openExternalExcludeCurrentApp(activity, intent);
            o.success((Object)Boolean.TRUE);
            return;
        }
        final StringBuilder c = e.c(s, " cannot be opened: ");
        final RuntimeException ex;
        c.append(ex.toString());
        Log.d("InAppBrowserManager", c.toString());
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" cannot be opened!");
        o.error("InAppBrowserManager", sb.toString(), (Object)null);
    }
    
    public void startInAppBrowserActivity(final Activity activity, final Bundle bundle) {
        final Intent intent = new Intent((Context)activity, (Class)InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}

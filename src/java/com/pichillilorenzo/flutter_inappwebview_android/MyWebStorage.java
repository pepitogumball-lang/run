package com.pichillilorenzo.flutter_inappwebview_android;

import F4.m;
import java.util.Iterator;
import java.util.HashMap;
import android.webkit.WebStorage$Origin;
import java.util.Map;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import F4.o;
import F4.p;
import android.webkit.WebStorage;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class MyWebStorage extends ChannelDelegateImpl
{
    protected static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;
    
    public MyWebStorage(final InAppWebViewFlutterPlugin plugin) {
        super(new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager"));
        this.plugin = plugin;
    }
    
    public static void init() {
        if (MyWebStorage.webStorageManager == null) {
            MyWebStorage.webStorageManager = WebStorage.getInstance();
        }
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
    
    public void getOrigins(final o o) {
        final WebStorage webStorageManager = MyWebStorage.webStorageManager;
        if (webStorageManager == null) {
            o.success((Object)new ArrayList());
            return;
        }
        webStorageManager.getOrigins((ValueCallback)new ValueCallback<Map>(this, o) {
            final MyWebStorage this$0;
            final o val$result;
            
            public void onReceiveValue(final Map map) {
                final ArrayList list = new ArrayList();
                final Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    final WebStorage$Origin webStorage$Origin = (WebStorage$Origin)map.get(iterator.next());
                    final HashMap hashMap = new HashMap();
                    hashMap.put((Object)"origin", (Object)webStorage$Origin.getOrigin());
                    hashMap.put((Object)"quota", (Object)webStorage$Origin.getQuota());
                    hashMap.put((Object)"usage", (Object)webStorage$Origin.getUsage());
                    list.add((Object)hashMap);
                }
                this.val$result.success((Object)list);
            }
        });
    }
    
    public void getQuotaForOrigin(final String s, final o o) {
        final WebStorage webStorageManager = MyWebStorage.webStorageManager;
        if (webStorageManager == null) {
            o.success((Object)0);
            return;
        }
        webStorageManager.getQuotaForOrigin(s, (ValueCallback)new ValueCallback<Long>(this, o) {
            final MyWebStorage this$0;
            final o val$result;
            
            public void onReceiveValue(final Long n) {
                this.val$result.success((Object)n);
            }
        });
    }
    
    public void getUsageForOrigin(final String s, final o o) {
        final WebStorage webStorageManager = MyWebStorage.webStorageManager;
        if (webStorageManager == null) {
            o.success((Object)0);
            return;
        }
        webStorageManager.getUsageForOrigin(s, (ValueCallback)new ValueCallback<Long>(this, o) {
            final MyWebStorage this$0;
            final o val$result;
            
            public void onReceiveValue(final Long n) {
                this.val$result.success((Object)n);
            }
        });
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        init();
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 843309476: {
                if (!a.equals((Object)"getUsageForOrigin")) {
                    break;
                }
                n = 4;
                break;
            }
            case -165580329: {
                if (!a.equals((Object)"getOrigins")) {
                    break;
                }
                n = 3;
                break;
            }
            case -876677967: {
                if (!a.equals((Object)"deleteOrigin")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1117417280: {
                if (!a.equals((Object)"deleteAllData")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1308548435: {
                if (!a.equals((Object)"getQuotaForOrigin")) {
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
            case 4: {
                this.getUsageForOrigin((String)m.a("origin"), o);
                break;
            }
            case 3: {
                this.getOrigins(o);
                break;
            }
            case 2: {
                if (MyWebStorage.webStorageManager != null) {
                    MyWebStorage.webStorageManager.deleteOrigin((String)m.a("origin"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 1: {
                final WebStorage webStorageManager = MyWebStorage.webStorageManager;
                if (webStorageManager != null) {
                    webStorageManager.deleteAllData();
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                this.getQuotaForOrigin((String)m.a("origin"), o);
                break;
            }
        }
    }
}

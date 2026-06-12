package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import android.content.Intent;
import java.util.Map;
import java.util.ArrayList;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import s.a;
import java.util.List;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class ChromeCustomTabsSettings implements ISettings<ChromeCustomTabsActivity>
{
    static final String LOG_TAG = "ChromeCustomTabsSettings";
    @Deprecated
    public Boolean addDefaultShareMenuItem;
    public List<String> additionalTrustedOrigins;
    public Boolean alwaysUseBrowserUI;
    public a displayMode;
    public Boolean enableUrlBarHiding;
    public List<AndroidResource> exitAnimations;
    public Boolean instantAppsEnabled;
    public Boolean isSingleInstance;
    public Boolean isTrustedWebActivity;
    public Boolean keepAliveEnabled;
    public String navigationBarColor;
    public String navigationBarDividerColor;
    public Boolean noHistory;
    public String packageName;
    public Integer screenOrientation;
    public String secondaryToolbarColor;
    public Integer shareState;
    public Boolean showTitle;
    public List<AndroidResource> startAnimations;
    public String toolbarBackgroundColor;
    
    public ChromeCustomTabsSettings() {
        final Integer value = 0;
        this.shareState = value;
        this.showTitle = Boolean.TRUE;
        final Boolean false = Boolean.FALSE;
        this.enableUrlBarHiding = false;
        this.instantAppsEnabled = false;
        this.keepAliveEnabled = false;
        this.isSingleInstance = false;
        this.noHistory = false;
        this.isTrustedWebActivity = false;
        this.additionalTrustedOrigins = (List<String>)new ArrayList();
        this.displayMode = null;
        this.screenOrientation = value;
        this.startAnimations = (List<AndroidResource>)new ArrayList();
        this.exitAnimations = (List<AndroidResource>)new ArrayList();
        this.alwaysUseBrowserUI = false;
    }
    
    @Override
    public Map<String, Object> getRealSettings(final ChromeCustomTabsActivity chromeCustomTabsActivity) {
        final Map<String, Object> map = this.toMap();
        if (chromeCustomTabsActivity != null) {
            final Intent intent = chromeCustomTabsActivity.getIntent();
            if (intent != null) {
                map.put((Object)"packageName", (Object)intent.getPackage());
                map.put((Object)"keepAliveEnabled", (Object)intent.hasExtra("android.support.customtabs.extra.KEEP_ALIVE"));
            }
        }
        return map;
    }
    
    @Override
    public ChromeCustomTabsSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            int n = -1;
            switch (s.hashCode()) {
                case 2126240217: {
                    if (!s.equals((Object)"keepAliveEnabled")) {
                        break;
                    }
                    n = 19;
                    break;
                }
                case 1714132357: {
                    if (!s.equals((Object)"displayMode")) {
                        break;
                    }
                    n = 18;
                    break;
                }
                case 1603728804: {
                    if (!s.equals((Object)"alwaysUseBrowserUI")) {
                        break;
                    }
                    n = 17;
                    break;
                }
                case 1578203421: {
                    if (!s.equals((Object)"additionalTrustedOrigins")) {
                        break;
                    }
                    n = 16;
                    break;
                }
                case 1518510995: {
                    if (!s.equals((Object)"noHistory")) {
                        break;
                    }
                    n = 15;
                    break;
                }
                case 908759025: {
                    if (!s.equals((Object)"packageName")) {
                        break;
                    }
                    n = 14;
                    break;
                }
                case 472764366: {
                    if (!s.equals((Object)"instantAppsEnabled")) {
                        break;
                    }
                    n = 13;
                    break;
                }
                case 390710230: {
                    if (!s.equals((Object)"isTrustedWebActivity")) {
                        break;
                    }
                    n = 12;
                    break;
                }
                case 378069052: {
                    if (!s.equals((Object)"secondaryToolbarColor")) {
                        break;
                    }
                    n = 11;
                    break;
                }
                case 317955373: {
                    if (!s.equals((Object)"exitAnimations")) {
                        break;
                    }
                    n = 10;
                    break;
                }
                case 227582404: {
                    if (!s.equals((Object)"screenOrientation")) {
                        break;
                    }
                    n = 9;
                    break;
                }
                case 137483238: {
                    if (!s.equals((Object)"enableUrlBarHiding")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case -227713574: {
                    if (!s.equals((Object)"toolbarBackgroundColor")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case -329366839: {
                    if (!s.equals((Object)"navigationBarDividerColor")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case -462720700: {
                    if (!s.equals((Object)"navigationBarColor")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -632275769: {
                    if (!s.equals((Object)"isSingleInstance")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1799055374: {
                    if (!s.equals((Object)"shareState")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1913803429: {
                    if (!s.equals((Object)"showTitle")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -2080611471: {
                    if (!s.equals((Object)"startAnimations")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -2112880751: {
                    if (!s.equals((Object)"addDefaultShareMenuItem")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    continue;
                }
                case 19: {
                    this.keepAliveEnabled = (Boolean)value;
                    continue;
                }
                case 18: {
                    final Map map2 = (Map)value;
                    final String s2 = (String)map2.get((Object)"type");
                    if (s2 == null) {
                        continue;
                    }
                    if (s2.equals((Object)"IMMERSIVE_MODE")) {
                        this.displayMode = (a)new S2.a((int)map2.get((Object)"displayCutoutMode"), (boolean)map2.get((Object)"isSticky"));
                        continue;
                    }
                    if (!s2.equals((Object)"DEFAULT_MODE")) {
                        continue;
                    }
                    this.displayMode = (a)new Object();
                    continue;
                }
                case 17: {
                    this.alwaysUseBrowserUI = (Boolean)value;
                    continue;
                }
                case 16: {
                    this.additionalTrustedOrigins = (List<String>)value;
                    continue;
                }
                case 15: {
                    this.noHistory = (Boolean)value;
                    continue;
                }
                case 14: {
                    this.packageName = (String)value;
                    continue;
                }
                case 13: {
                    this.instantAppsEnabled = (Boolean)value;
                    continue;
                }
                case 12: {
                    this.isTrustedWebActivity = (Boolean)value;
                    continue;
                }
                case 11: {
                    this.secondaryToolbarColor = (String)value;
                    continue;
                }
                case 10: {
                    for (final Map map3 : (List)value) {
                        if (AndroidResource.fromMap((Map<String, Object>)map3) != null) {
                            this.exitAnimations.add((Object)AndroidResource.fromMap((Map<String, Object>)map3));
                        }
                    }
                    continue;
                }
                case 9: {
                    this.screenOrientation = (Integer)value;
                    continue;
                }
                case 8: {
                    this.enableUrlBarHiding = (Boolean)value;
                    continue;
                }
                case 7: {
                    this.toolbarBackgroundColor = (String)value;
                    continue;
                }
                case 6: {
                    this.navigationBarDividerColor = (String)value;
                    continue;
                }
                case 5: {
                    this.navigationBarColor = (String)value;
                    continue;
                }
                case 4: {
                    this.isSingleInstance = (Boolean)value;
                    continue;
                }
                case 3: {
                    this.shareState = (Integer)value;
                    continue;
                }
                case 2: {
                    this.showTitle = (Boolean)value;
                    continue;
                }
                case 1: {
                    for (final Map map4 : (List)value) {
                        if (AndroidResource.fromMap((Map<String, Object>)map4) != null) {
                            this.startAnimations.add((Object)AndroidResource.fromMap((Map<String, Object>)map4));
                        }
                    }
                    continue;
                }
                case 0: {
                    this.addDefaultShareMenuItem = (Boolean)value;
                    continue;
                }
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"addDefaultShareMenuItem", (Object)this.addDefaultShareMenuItem);
        hashMap.put((Object)"showTitle", (Object)this.showTitle);
        hashMap.put((Object)"toolbarBackgroundColor", (Object)this.toolbarBackgroundColor);
        hashMap.put((Object)"navigationBarColor", (Object)this.navigationBarColor);
        hashMap.put((Object)"navigationBarDividerColor", (Object)this.navigationBarDividerColor);
        hashMap.put((Object)"secondaryToolbarColor", (Object)this.secondaryToolbarColor);
        hashMap.put((Object)"enableUrlBarHiding", (Object)this.enableUrlBarHiding);
        hashMap.put((Object)"instantAppsEnabled", (Object)this.instantAppsEnabled);
        hashMap.put((Object)"packageName", (Object)this.packageName);
        hashMap.put((Object)"keepAliveEnabled", (Object)this.keepAliveEnabled);
        hashMap.put((Object)"isSingleInstance", (Object)this.isSingleInstance);
        hashMap.put((Object)"noHistory", (Object)this.noHistory);
        hashMap.put((Object)"isTrustedWebActivity", (Object)this.isTrustedWebActivity);
        hashMap.put((Object)"additionalTrustedOrigins", (Object)this.additionalTrustedOrigins);
        hashMap.put((Object)"screenOrientation", (Object)this.screenOrientation);
        hashMap.put((Object)"alwaysUseBrowserUI", (Object)this.alwaysUseBrowserUI);
        return (Map<String, Object>)hashMap;
    }
}

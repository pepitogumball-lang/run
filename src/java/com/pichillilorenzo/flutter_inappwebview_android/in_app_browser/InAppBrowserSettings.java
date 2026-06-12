package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import android.widget.ProgressBar;
import android.view.Menu;
import j.a;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;

public class InAppBrowserSettings implements ISettings<InAppBrowserActivity>
{
    public static final String LOG_TAG = "InAppBrowserSettings";
    public Boolean allowGoBackWithBackButton;
    public Boolean closeOnCannotGoBack;
    public Boolean hidden;
    public Boolean hideDefaultMenuItems;
    public Boolean hideProgressBar;
    public Boolean hideTitleBar;
    public Boolean hideToolbarTop;
    public Boolean hideUrlBar;
    public Boolean shouldCloseOnBackButtonPressed;
    public String toolbarTopBackgroundColor;
    public String toolbarTopFixedTitle;
    
    public InAppBrowserSettings() {
        final Boolean false = Boolean.FALSE;
        this.hidden = false;
        this.hideToolbarTop = false;
        this.hideUrlBar = false;
        this.hideProgressBar = false;
        this.hideTitleBar = false;
        final Boolean true = Boolean.TRUE;
        this.closeOnCannotGoBack = true;
        this.allowGoBackWithBackButton = true;
        this.shouldCloseOnBackButtonPressed = false;
        this.hideDefaultMenuItems = false;
    }
    
    @Override
    public Map<String, Object> getRealSettings(final InAppBrowserActivity inAppBrowserActivity) {
        final Map<String, Object> map = this.toMap();
        map.put((Object)"hidden", (Object)inAppBrowserActivity.isHidden);
        final a actionBar = inAppBrowserActivity.actionBar;
        final boolean b = true;
        map.put((Object)"hideToolbarTop", (Object)(actionBar == null || !actionBar.h()));
        final Menu menu = inAppBrowserActivity.menu;
        map.put((Object)"hideUrlBar", (Object)(menu == null || !menu.findItem(R.id.menu_search).isVisible()));
        final ProgressBar progressBar = inAppBrowserActivity.progressBar;
        boolean b2 = b;
        if (progressBar != null) {
            b2 = (progressBar.getMax() == 0 && b);
        }
        map.put((Object)"hideProgressBar", (Object)b2);
        return map;
    }
    
    @Override
    public InAppBrowserSettings parse(final Map<String, Object> map) {
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            final Object value = map$Entry.getValue();
            if (value == null) {
                continue;
            }
            s.getClass();
            int n = -1;
            switch (s.hashCode()) {
                case 2140270213: {
                    if (!s.equals((Object)"shouldCloseOnBackButtonPressed")) {
                        break;
                    }
                    n = 10;
                    break;
                }
                case 2111633307: {
                    if (!s.equals((Object)"toolbarTopBackgroundColor")) {
                        break;
                    }
                    n = 9;
                    break;
                }
                case 406250502: {
                    if (!s.equals((Object)"hideUrlBar")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 90270825: {
                    if (!s.equals((Object)"closeOnCannotGoBack")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 3851268: {
                    if (!s.equals((Object)"hideProgressBar")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case -118493506: {
                    if (!s.equals((Object)"toolbarTopFixedTitle")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -299596350: {
                    if (!s.equals((Object)"hideDefaultMenuItems")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -809085252: {
                    if (!s.equals((Object)"hideToolbarTop")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -842349289: {
                    if (!s.equals((Object)"allowGoBackWithBackButton")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1217487446: {
                    if (!s.equals((Object)"hidden")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1307803139: {
                    if (!s.equals((Object)"hideTitleBar")) {
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
                case 10: {
                    this.shouldCloseOnBackButtonPressed = (Boolean)value;
                    continue;
                }
                case 9: {
                    this.toolbarTopBackgroundColor = (String)value;
                    continue;
                }
                case 8: {
                    this.hideUrlBar = (Boolean)value;
                    continue;
                }
                case 7: {
                    this.closeOnCannotGoBack = (Boolean)value;
                    continue;
                }
                case 6: {
                    this.hideProgressBar = (Boolean)value;
                    continue;
                }
                case 5: {
                    this.toolbarTopFixedTitle = (String)value;
                    continue;
                }
                case 4: {
                    this.hideDefaultMenuItems = (Boolean)value;
                    continue;
                }
                case 3: {
                    this.hideToolbarTop = (Boolean)value;
                    continue;
                }
                case 2: {
                    this.allowGoBackWithBackButton = (Boolean)value;
                    continue;
                }
                case 1: {
                    this.hidden = (Boolean)value;
                    continue;
                }
                case 0: {
                    this.hideTitleBar = (Boolean)value;
                    continue;
                }
            }
        }
        return this;
    }
    
    @Override
    public Map<String, Object> toMap() {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"hidden", (Object)this.hidden);
        hashMap.put((Object)"hideToolbarTop", (Object)this.hideToolbarTop);
        hashMap.put((Object)"toolbarTopBackgroundColor", (Object)this.toolbarTopBackgroundColor);
        hashMap.put((Object)"toolbarTopFixedTitle", (Object)this.toolbarTopFixedTitle);
        hashMap.put((Object)"hideUrlBar", (Object)this.hideUrlBar);
        hashMap.put((Object)"hideTitleBar", (Object)this.hideTitleBar);
        hashMap.put((Object)"closeOnCannotGoBack", (Object)this.closeOnCannotGoBack);
        hashMap.put((Object)"hideProgressBar", (Object)this.hideProgressBar);
        hashMap.put((Object)"allowGoBackWithBackButton", (Object)this.allowGoBackWithBackButton);
        hashMap.put((Object)"shouldCloseOnBackButtonPressed", (Object)this.shouldCloseOnBackButtonPressed);
        hashMap.put((Object)"hideDefaultMenuItems", (Object)this.hideDefaultMenuItems);
        return (Map<String, Object>)hashMap;
    }
}

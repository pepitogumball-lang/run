package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.BaseBundle;
import r.f;
import r.r;
import android.app.Activity;
import java.util.Collections;
import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import android.os.IBinder;
import android.net.Uri;
import java.util.Map;
import android.content.Intent;
import android.content.Context;
import s.b;
import s.a;
import java.util.List;
import r.k;
import android.os.Bundle;
import android.graphics.Color;
import s.c;

public class TrustedWebActivity extends ChromeCustomTabsActivity
{
    protected static final String LOG_TAG = "TrustedWebActivity";
    public c builder;
    
    private void prepareCustomTabs() {
        final String toolbarBackgroundColor = super.customSettings.toolbarBackgroundColor;
        final Integer n = null;
        Integer value;
        if (toolbarBackgroundColor != null && !toolbarBackgroundColor.isEmpty()) {
            value = (Color.parseColor(super.customSettings.toolbarBackgroundColor) | 0xFF000000);
        }
        else {
            value = null;
        }
        final String navigationBarColor = super.customSettings.navigationBarColor;
        Integer value2;
        if (navigationBarColor != null && !navigationBarColor.isEmpty()) {
            value2 = (0xFF000000 | Color.parseColor(super.customSettings.navigationBarColor));
        }
        else {
            value2 = null;
        }
        final String navigationBarDividerColor = super.customSettings.navigationBarDividerColor;
        Integer value3;
        if (navigationBarDividerColor != null && !navigationBarDividerColor.isEmpty()) {
            value3 = Color.parseColor(super.customSettings.navigationBarDividerColor);
        }
        else {
            value3 = null;
        }
        final String secondaryToolbarColor = super.customSettings.secondaryToolbarColor;
        Integer value4 = n;
        if (secondaryToolbarColor != null) {
            value4 = n;
            if (!secondaryToolbarColor.isEmpty()) {
                value4 = Color.parseColor(super.customSettings.secondaryToolbarColor);
            }
        }
        final k b = this.builder.b;
        b.getClass();
        final Bundle e = new Bundle();
        if (value != null) {
            ((BaseBundle)e).putInt("android.support.customtabs.extra.TOOLBAR_COLOR", (int)value);
        }
        if (value4 != null) {
            ((BaseBundle)e).putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", (int)value4);
        }
        if (value2 != null) {
            ((BaseBundle)e).putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", (int)value2);
        }
        if (value3 != null) {
            ((BaseBundle)e).putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", (int)value3);
        }
        b.e = e;
        final List<String> additionalTrustedOrigins = super.customSettings.additionalTrustedOrigins;
        if (additionalTrustedOrigins != null && !additionalTrustedOrigins.isEmpty()) {
            this.builder.c = super.customSettings.additionalTrustedOrigins;
        }
        final ChromeCustomTabsSettings customSettings = super.customSettings;
        final a displayMode = customSettings.displayMode;
        if (displayMode != null) {
            this.builder.d = displayMode;
        }
        this.builder.e = customSettings.screenOrientation;
    }
    
    private void prepareCustomTabsIntent(final b b) {
        final Intent a = b.a;
        final String packageName = super.customSettings.packageName;
        if (packageName != null) {
            a.setPackage(packageName);
        }
        else {
            a.setPackage(CustomTabsHelper.getPackageNameToUse((Context)this));
        }
        if (super.customSettings.keepAliveEnabled) {
            CustomTabsHelper.addKeepAliveExtra((Context)this, a);
        }
        if (super.customSettings.alwaysUseBrowserUI) {
            Intent intent;
            if ((intent = a) == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }
    
    @Override
    public void launchUrl(final String s, final Map<String, String> map, final String s2, final List<String> list) {
        if (super.customTabsSession == null) {
            return;
        }
        final Uri parse = Uri.parse(s);
        this.mayLaunchUrl(s, list);
        this.builder = new c(parse);
        this.prepareCustomTabs();
        final c builder = this.builder;
        final r customTabsSession = super.customTabsSession;
        if (customTabsSession != null) {
            final k b = builder.b;
            b.getClass();
            final String packageName = customTabsSession.d.getPackageName();
            final Intent a = b.a;
            a.setPackage(packageName);
            final f c = customTabsSession.c;
            final Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder)c);
            a.putExtras(bundle);
            final Intent a2 = b.a().a;
            a2.setData(builder.a);
            a2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
            if (builder.c != null) {
                a2.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", (Serializable)new ArrayList((Collection)builder.c));
            }
            Collections.emptyList();
            a2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", builder.d.n());
            a2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", builder.e);
            final b b2 = new b(a2);
            this.prepareCustomTabsIntent(b2);
            Uri parse2;
            if (s2 != null) {
                parse2 = Uri.parse(s2);
            }
            else {
                parse2 = null;
            }
            CustomTabActivityHelper.openTrustedWebActivity(this, b2, parse, map, parse2, 100);
            return;
        }
        builder.getClass();
        throw new NullPointerException("CustomTabsSession is required for launching a TWA");
    }
}

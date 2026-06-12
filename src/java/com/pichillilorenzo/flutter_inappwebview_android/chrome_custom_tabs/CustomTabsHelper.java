package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.IntentFilter;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import android.net.Uri;
import android.os.Parcelable;
import android.content.Intent;
import android.content.Context;

public class CustomTabsHelper
{
    static final String BETA_PACKAGE = "com.chrome.beta";
    static final String DEV_PACKAGE = "com.chrome.dev";
    protected static final String EXTRA_CUSTOM_TABS_KEEP_ALIVE = "android.support.customtabs.extra.KEEP_ALIVE";
    static final String LOCAL_PACKAGE = "com.google.android.apps.chrome";
    static final String STABLE_PACKAGE = "com.android.chrome";
    protected static final String TAG = "CustomTabsHelper";
    private static String sPackageNameToUse;
    
    private CustomTabsHelper() {
    }
    
    public static void addKeepAliveExtra(final Context context, final Intent intent) {
        intent.putExtra("android.support.customtabs.extra.KEEP_ALIVE", (Parcelable)new Intent().setClassName(context.getPackageName(), KeepAliveService.class.getCanonicalName()));
    }
    
    public static String getPackageNameToUse(final Context context) {
        final String sPackageNameToUse = CustomTabsHelper.sPackageNameToUse;
        if (sPackageNameToUse != null) {
            return sPackageNameToUse;
        }
        final PackageManager packageManager = context.getPackageManager();
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        intent.addCategory("android.intent.category.BROWSABLE");
        final ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        Object packageName;
        if (resolveActivity != null) {
            packageName = resolveActivity.activityInfo.packageName;
        }
        else {
            packageName = null;
        }
        final List queryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
        final ArrayList list = new ArrayList();
        for (final ResolveInfo resolveInfo : queryIntentActivities) {
            final Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                list.add((Object)resolveInfo.activityInfo.packageName);
            }
        }
        if (list.isEmpty()) {
            CustomTabsHelper.sPackageNameToUse = null;
        }
        else if (list.size() == 1) {
            CustomTabsHelper.sPackageNameToUse = (String)list.get(0);
        }
        else if (!TextUtils.isEmpty((CharSequence)packageName) && !hasSpecializedHandlerIntents(context, intent) && list.contains(packageName)) {
            CustomTabsHelper.sPackageNameToUse = (String)packageName;
        }
        else if (list.contains((Object)"com.android.chrome")) {
            CustomTabsHelper.sPackageNameToUse = "com.android.chrome";
        }
        else if (list.contains((Object)"com.chrome.beta")) {
            CustomTabsHelper.sPackageNameToUse = "com.chrome.beta";
        }
        else if (list.contains((Object)"com.chrome.dev")) {
            CustomTabsHelper.sPackageNameToUse = "com.chrome.dev";
        }
        else if (list.contains((Object)"com.google.android.apps.chrome")) {
            CustomTabsHelper.sPackageNameToUse = "com.google.android.apps.chrome";
        }
        return CustomTabsHelper.sPackageNameToUse;
    }
    
    public static String[] getPackages() {
        return new String[] { "", "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome" };
    }
    
    private static boolean hasSpecializedHandlerIntents(final Context context, final Intent intent) {
        try {
            final List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
                for (final ResolveInfo resolveInfo : queryIntentActivities) {
                    final IntentFilter filter = resolveInfo.filter;
                    if (filter == null) {
                        continue;
                    }
                    if (filter.countDataAuthorities() == 0) {
                        continue;
                    }
                    if (filter.countDataPaths() == 0) {
                        continue;
                    }
                    if (resolveInfo.activityInfo == null) {
                        continue;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        catch (final RuntimeException ex) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }
}

package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.BaseBundle;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class ActionBroadcastReceiver extends BroadcastReceiver
{
    public static final String KEY_ACTION_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID";
    public static final String KEY_ACTION_MANAGER_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID";
    public static final String KEY_ACTION_VIEW_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID";
    public static final String KEY_URL_TITLE = "android.intent.extra.SUBJECT";
    protected static final String LOG_TAG = "ActionBroadcastReceiver";
    
    public void onReceive(final Context context, final Intent intent) {
        final int intExtra = intent.getIntExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID", -1);
        final String dataString = intent.getDataString();
        if (dataString != null) {
            final Bundle extras = intent.getExtras();
            final String string = ((BaseBundle)extras).getString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID");
            final String string2 = ((BaseBundle)extras).getString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID");
            if (string2 != null) {
                final ChromeSafariBrowserManager chromeSafariBrowserManager = (ChromeSafariBrowserManager)ChromeSafariBrowserManager.shared.get((Object)string2);
                if (chromeSafariBrowserManager != null) {
                    if (intExtra == -1) {
                        final int int1 = ((BaseBundle)extras).getInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID");
                        final String string3 = ((BaseBundle)extras).getString("android.intent.extra.SUBJECT");
                        final ChromeCustomTabsActivity chromeCustomTabsActivity = (ChromeCustomTabsActivity)chromeSafariBrowserManager.browsers.get((Object)string);
                        if (chromeCustomTabsActivity != null) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = chromeCustomTabsActivity.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onItemActionPerform(int1, dataString, string3);
                            }
                        }
                    }
                    else {
                        final ChromeCustomTabsActivity chromeCustomTabsActivity2 = (ChromeCustomTabsActivity)chromeSafariBrowserManager.browsers.get((Object)string);
                        if (chromeCustomTabsActivity2 != null) {
                            final ChromeCustomTabsChannelDelegate channelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
                            if (channelDelegate2 != null) {
                                channelDelegate2.onSecondaryItemActionPerform(((Context)chromeCustomTabsActivity2).getResources().getResourceName(intExtra), dataString);
                            }
                        }
                    }
                }
            }
        }
    }
}

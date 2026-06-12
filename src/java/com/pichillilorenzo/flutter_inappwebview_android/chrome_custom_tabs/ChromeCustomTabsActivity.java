package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.os.BaseBundle;
import android.os.RemoteException;
import F4.f;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import r.a;
import java.util.HashMap;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import android.net.Uri;
import android.util.Log;
import b.c;
import r.q;
import r.s;
import r.l;
import android.graphics.Bitmap;
import java.util.Iterator;
import android.widget.RemoteViews;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.os.Parcelable;
import android.app.ActivityOptions;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import android.graphics.Color;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.app.PendingIntent;
import java.util.ArrayList;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import java.util.List;
import java.util.Map;
import r.r;
import r.k;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import android.app.Activity;

public class ChromeCustomTabsActivity extends Activity implements Disposable
{
    public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    protected static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
    public CustomTabsActionButton actionButton;
    public k builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public ChromeCustomTabsSettings customSettings;
    public CustomTabActivityHelper customTabActivityHelper;
    public r customTabsSession;
    public String id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    protected boolean isBindSuccess;
    public ChromeSafariBrowserManager manager;
    public List<CustomTabsMenuItem> menuItems;
    protected boolean onCompletedInitialLoad;
    protected boolean onOpened;
    public CustomTabsSecondaryToolbar secondaryToolbar;
    
    public ChromeCustomTabsActivity() {
        this.customSettings = new ChromeCustomTabsSettings();
        this.customTabActivityHelper = new CustomTabActivityHelper();
        this.onOpened = false;
        this.onCompletedInitialLoad = false;
        this.isBindSuccess = false;
        this.menuItems = (List<CustomTabsMenuItem>)new ArrayList();
    }
    
    private PendingIntent createPendingIntent(final int n) {
        final Intent intent = new Intent((Context)this, (Class)ActionBroadcastReceiver.class);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID", n);
        ((BaseBundle)bundle).putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID", this.id);
        final ChromeSafariBrowserManager manager = this.manager;
        String id;
        if (manager != null) {
            id = manager.id;
        }
        else {
            id = null;
        }
        ((BaseBundle)bundle).putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID", id);
        intent.putExtras(bundle);
        if (Build$VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast((Context)this, n, intent, 167772160);
        }
        return PendingIntent.getBroadcast((Context)this, n, intent, 134217728);
    }
    
    private void prepareCustomTabs() {
        final k builder = this.builder;
        if (builder == null) {
            return;
        }
        final ChromeCustomTabsSettings customSettings = this.customSettings;
        final Boolean addDefaultShareMenuItem = customSettings.addDefaultShareMenuItem;
        if (addDefaultShareMenuItem != null) {
            int n;
            if (addDefaultShareMenuItem) {
                n = 1;
            }
            else {
                n = 2;
            }
            builder.b(n);
        }
        else {
            builder.b((int)customSettings.shareState);
        }
        final String toolbarBackgroundColor = this.customSettings.toolbarBackgroundColor;
        final Integer n2 = null;
        Integer value;
        if (toolbarBackgroundColor != null && !toolbarBackgroundColor.isEmpty()) {
            value = (Color.parseColor(this.customSettings.toolbarBackgroundColor) | 0xFF000000);
        }
        else {
            value = null;
        }
        final String navigationBarColor = this.customSettings.navigationBarColor;
        Integer value2;
        if (navigationBarColor != null && !navigationBarColor.isEmpty()) {
            value2 = (0xFF000000 | Color.parseColor(this.customSettings.navigationBarColor));
        }
        else {
            value2 = null;
        }
        final String navigationBarDividerColor = this.customSettings.navigationBarDividerColor;
        Integer value3;
        if (navigationBarDividerColor != null && !navigationBarDividerColor.isEmpty()) {
            value3 = Color.parseColor(this.customSettings.navigationBarDividerColor);
        }
        else {
            value3 = null;
        }
        final String secondaryToolbarColor = this.customSettings.secondaryToolbarColor;
        Integer value4 = n2;
        if (secondaryToolbarColor != null) {
            value4 = n2;
            if (!secondaryToolbarColor.isEmpty()) {
                value4 = Color.parseColor(this.customSettings.secondaryToolbarColor);
            }
        }
        final k builder2 = this.builder;
        builder2.getClass();
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
        builder2.e = e;
        this.builder.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", (int)(((boolean)this.customSettings.showTitle) ? 1 : 0));
        this.builder.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", (boolean)this.customSettings.enableUrlBarHiding);
        this.builder.g = this.customSettings.instantAppsEnabled;
        final int size = this.customSettings.startAnimations.size();
        int i = 0;
        if (size == 2) {
            final k builder3 = this.builder;
            final int identifier = ((AndroidResource)this.customSettings.startAnimations.get(0)).getIdentifier((Context)this);
            final int identifier2 = ((AndroidResource)this.customSettings.startAnimations.get(1)).getIdentifier((Context)this);
            builder3.getClass();
            builder3.d = ActivityOptions.makeCustomAnimation((Context)this, identifier, identifier2);
        }
        if (this.customSettings.exitAnimations.size() == 2) {
            final k builder4 = this.builder;
            final int identifier3 = ((AndroidResource)this.customSettings.exitAnimations.get(0)).getIdentifier((Context)this);
            final int identifier4 = ((AndroidResource)this.customSettings.exitAnimations.get(1)).getIdentifier((Context)this);
            builder4.getClass();
            builder4.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation((Context)this, identifier3, identifier4).toBundle());
        }
        for (final CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
            final k builder5 = this.builder;
            final String label = customTabsMenuItem.getLabel();
            final PendingIntent pendingIntent = this.createPendingIntent(customTabsMenuItem.getId());
            if (builder5.c == null) {
                builder5.c = new ArrayList();
            }
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", label);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)pendingIntent);
            builder5.c.add((Object)bundle);
        }
        final CustomTabsActionButton actionButton = this.actionButton;
        if (actionButton != null) {
            final byte[] icon = actionButton.getIcon();
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inMutable = true;
            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, bitmapFactory$Options);
            final k builder6 = this.builder;
            final String description = this.actionButton.getDescription();
            final PendingIntent pendingIntent2 = this.createPendingIntent(this.actionButton.getId());
            final boolean shouldTint = this.actionButton.isShouldTint();
            builder6.getClass();
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putInt("android.support.customtabs.customaction.ID", 0);
            bundle2.putParcelable("android.support.customtabs.customaction.ICON", (Parcelable)decodeByteArray);
            ((BaseBundle)bundle2).putString("android.support.customtabs.customaction.DESCRIPTION", description);
            bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)pendingIntent2);
            final Intent a = builder6.a;
            a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle2);
            a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", shouldTint);
        }
        final CustomTabsSecondaryToolbar secondaryToolbar = this.secondaryToolbar;
        if (secondaryToolbar != null) {
            final AndroidResource layout = secondaryToolbar.getLayout();
            final RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier((Context)this));
            final int[] array = new int[this.secondaryToolbar.getClickableIDs().size()];
            while (i < this.secondaryToolbar.getClickableIDs().size()) {
                array[i] = ((AndroidResource)this.secondaryToolbar.getClickableIDs().get(i)).getIdentifier((Context)this);
                ++i;
            }
            final k builder7 = this.builder;
            final PendingIntent secondaryToolbarOnClickPendingIntent = this.getSecondaryToolbarOnClickPendingIntent();
            final Intent a2 = builder7.a;
            a2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", (Parcelable)remoteViews);
            a2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", array);
            a2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", (Parcelable)secondaryToolbarOnClickPendingIntent);
        }
    }
    
    private void prepareCustomTabsIntent(final l l) {
        final String packageName = this.customSettings.packageName;
        if (packageName != null) {
            l.a.setPackage(packageName);
        }
        else {
            l.a.setPackage(CustomTabsHelper.getPackageNameToUse((Context)this));
        }
        if (this.customSettings.keepAliveEnabled) {
            CustomTabsHelper.addKeepAliveExtra((Context)this, l.a);
        }
        if (this.customSettings.alwaysUseBrowserUI) {
            Intent a;
            if ((a = l.a) == null) {
                a = new Intent("android.intent.action.VIEW");
            }
            a.addFlags(268435456);
            a.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }
    
    public void close() {
        this.onStop();
        this.onDestroy();
        this.customTabsSession = null;
        this.finish();
        final ChromeCustomTabsChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onClosed();
        }
    }
    
    public void customTabsConnected() {
        final r session = this.customTabActivityHelper.getSession();
        this.customTabsSession = session;
        if (session != null) {
            try {
                final Bundle bundle = new Bundle();
                if (this.customTabsSession.b(bundle)) {
                    final r customTabsSession = this.customTabsSession;
                    final s s = new s(this) {
                        final ChromeCustomTabsActivity this$0;
                        
                        @Override
                        public void onGreatestScrollPercentageIncreased(final int n, final Bundle bundle) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onGreatestScrollPercentageIncreased(n);
                            }
                        }
                        
                        @Override
                        public void onSessionEnded(final boolean b, final Bundle bundle) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onSessionEnded(b);
                            }
                        }
                        
                        @Override
                        public void onVerticalScrollEvent(final boolean b, final Bundle bundle) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onVerticalScrollEvent(b);
                            }
                        }
                    };
                    final Bundle a = customTabsSession.a(bundle);
                    final q q = new q((s)s);
                    try {
                        ((c)customTabsSession.b).d2(customTabsSession.c, q, a);
                    }
                    catch (final SecurityException ex) {
                        throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", (Throwable)ex);
                    }
                }
            }
            finally {
                final Throwable t;
                Log.d("CustomTabsActivity", "Custom Tabs Engagement Signals API not supported", t);
            }
        }
        if (this.isBindSuccess) {
            final String initialUrl = this.initialUrl;
            if (initialUrl != null) {
                this.launchUrl(initialUrl, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
            }
        }
    }
    
    public void dispose() {
        this.onStop();
        this.onDestroy();
        final ChromeCustomTabsChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        final ChromeSafariBrowserManager manager = this.manager;
        if (manager != null && manager.browsers.containsKey((Object)this.id)) {
            this.manager.browsers.put((Object)this.id, (Object)null);
        }
        this.manager = null;
    }
    
    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        final Intent intent = new Intent((Context)this, (Class)ActionBroadcastReceiver.class);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID", this.id);
        final ChromeSafariBrowserManager manager = this.manager;
        String id;
        if (manager != null) {
            id = manager.id;
        }
        else {
            id = null;
        }
        ((BaseBundle)bundle).putString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID", id);
        intent.putExtras(bundle);
        if (Build$VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast((Context)this, 0, intent, 167772160);
        }
        return PendingIntent.getBroadcast((Context)this, 0, intent, 134217728);
    }
    
    public void launchUrl(final String s, final Map<String, String> map, final String s2, final List<String> list) {
        this.launchUrlWithSession(this.customTabsSession, s, map, s2, list);
    }
    
    public void launchUrlWithSession(final r r, final String s, final Map<String, String> map, final String s2, final List<String> list) {
        this.mayLaunchUrl(s, list);
        this.builder = new k(r);
        this.prepareCustomTabs();
        final l a = this.builder.a();
        this.prepareCustomTabsIntent(a);
        final Uri parse = Uri.parse(s);
        Uri parse2;
        if (s2 != null) {
            parse2 = Uri.parse(s2);
        }
        else {
            parse2 = null;
        }
        CustomTabActivityHelper.openCustomTab(this, a, parse, map, parse2, 100);
    }
    
    public boolean mayLaunchUrl(final String s, final List<String> list) {
        Uri parse;
        if (s != null) {
            parse = Uri.parse(s);
        }
        else {
            parse = null;
        }
        final ArrayList list2 = new ArrayList();
        if (list != null) {
            final Bundle bundle = new Bundle();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                ((BaseBundle)bundle).putString("android.support.customtabs.otherurls.URL", (String)iterator.next());
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(parse, null, (List<Bundle>)list2);
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 100) {
            this.close();
            this.dispose();
        }
    }
    
    public void onCreate(Bundle extras) {
        super.onCreate(extras);
        this.setContentView(R.layout.chrome_custom_tabs_layout);
        extras = this.getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.id = ((BaseBundle)extras).getString("id");
        final ChromeSafariBrowserManager manager = (ChromeSafariBrowserManager)ChromeSafariBrowserManager.shared.get((Object)((BaseBundle)extras).getString("managerId"));
        if ((this.manager = manager) != null) {
            final InAppWebViewFlutterPlugin plugin = manager.plugin;
            if (plugin != null) {
                if (plugin.messenger != null) {
                    manager.browsers.put((Object)this.id, (Object)this);
                    final f messenger = this.manager.plugin.messenger;
                    final StringBuilder sb = new StringBuilder("com.pichillilorenzo/flutter_chromesafaribrowser_");
                    sb.append(this.id);
                    this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new p(messenger, sb.toString()));
                    this.initialUrl = ((BaseBundle)extras).getString("url");
                    this.initialHeaders = (Map<String, String>)extras.getSerializable("headers");
                    this.initialReferrer = ((BaseBundle)extras).getString("referrer");
                    this.initialOtherLikelyURLs = (List<String>)extras.getStringArrayList("otherLikelyURLs");
                    (this.customSettings = new ChromeCustomTabsSettings()).parse((Map<String, Object>)extras.getSerializable("settings"));
                    this.actionButton = CustomTabsActionButton.fromMap((Map<String, Object>)extras.getSerializable("actionButton"));
                    this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map<String, Object>)extras.getSerializable("secondaryToolbar"));
                    final Iterator iterator = ((List)extras.getSerializable("menuItemList")).iterator();
                    while (iterator.hasNext()) {
                        this.menuItems.add((Object)CustomTabsMenuItem.fromMap((Map<String, Object>)iterator.next()));
                    }
                    if (this.customSettings.noHistory) {
                        final NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks;
                        if (noHistoryCustomTabsActivityCallbacks != null) {
                            final Map<String, String> noHistoryBrowserIDs = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
                            final String id = this.id;
                            noHistoryBrowserIDs.put((Object)id, (Object)id);
                        }
                    }
                    this.customTabActivityHelper.setConnectionCallback((CustomTabActivityHelper.ConnectionCallback)new CustomTabActivityHelper.ConnectionCallback(this, this) {
                        final ChromeCustomTabsActivity this$0;
                        final ChromeCustomTabsActivity val$chromeCustomTabsActivity;
                        
                        @Override
                        public void onCustomTabsConnected() {
                            this.this$0.customTabsConnected();
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onServiceConnected();
                            }
                        }
                        
                        @Override
                        public void onCustomTabsDisconnected() {
                            this.val$chromeCustomTabsActivity.close();
                            this.this$0.dispose();
                        }
                    });
                    this.customTabActivityHelper.setCustomTabsCallback(new a(this) {
                        final ChromeCustomTabsActivity this$0;
                        
                        @Override
                        public void extraCallback(final String s, final Bundle bundle) {
                        }
                        
                        @Override
                        public void onMessageChannelReady(final Bundle bundle) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onMessageChannelReady();
                            }
                        }
                        
                        @Override
                        public void onNavigationEvent(final int n, final Bundle bundle) {
                            if (n == 5) {
                                final ChromeCustomTabsActivity this$0 = this.this$0;
                                if (!this$0.onOpened) {
                                    this$0.onOpened = true;
                                    final ChromeCustomTabsChannelDelegate channelDelegate = this$0.channelDelegate;
                                    if (channelDelegate != null) {
                                        channelDelegate.onOpened();
                                    }
                                }
                            }
                            if (n == 2) {
                                final ChromeCustomTabsActivity this$2 = this.this$0;
                                if (!this$2.onCompletedInitialLoad) {
                                    this$2.onCompletedInitialLoad = true;
                                    final ChromeCustomTabsChannelDelegate channelDelegate2 = this$2.channelDelegate;
                                    if (channelDelegate2 != null) {
                                        channelDelegate2.onCompletedInitialLoad();
                                    }
                                }
                            }
                            final ChromeCustomTabsChannelDelegate channelDelegate3 = this.this$0.channelDelegate;
                            if (channelDelegate3 != null) {
                                channelDelegate3.onNavigationEvent(n);
                            }
                        }
                        
                        @Override
                        public void onPostMessage(final String s, final Bundle bundle) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onPostMessage(s);
                            }
                        }
                        
                        @Override
                        public void onRelationshipValidationResult(final int n, final Uri uri, final boolean b, final Bundle bundle) {
                            final ChromeCustomTabsChannelDelegate channelDelegate = this.this$0.channelDelegate;
                            if (channelDelegate != null) {
                                channelDelegate.onRelationshipValidationResult(n, uri, b);
                            }
                        }
                    });
                }
            }
        }
    }
    
    public void onDestroy() {
        super.onDestroy();
    }
    
    public void onStart() {
        super.onStart();
        if (!(this.isBindSuccess = this.customTabActivityHelper.bindCustomTabsService(this))) {
            final String initialUrl = this.initialUrl;
            if (initialUrl != null) {
                this.launchUrlWithSession(null, initialUrl, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
            }
        }
    }
    
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
        this.isBindSuccess = false;
    }
    
    public void updateActionButton(final byte[] icon, final String description) {
        if (this.customTabsSession == null) {
            return;
        }
        if (this.actionButton == null) {
            return;
        }
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inMutable = true;
        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, bitmapFactory$Options);
        final r customTabsSession = this.customTabsSession;
        customTabsSession.getClass();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", (Parcelable)decodeByteArray);
        ((BaseBundle)bundle).putString("android.support.customtabs.customaction.DESCRIPTION", description);
        final Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        while (true) {
            try {
                ((c)customTabsSession.b).l3(customTabsSession.c, bundle2);
                this.actionButton.setIcon(icon);
                this.actionButton.setDescription(description);
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public void updateSecondaryToolbar(final CustomTabsSecondaryToolbar secondaryToolbar) {
        if (this.customTabsSession == null) {
            return;
        }
        final AndroidResource layout = secondaryToolbar.getLayout();
        final RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier((Context)this));
        final int[] array = new int[secondaryToolbar.getClickableIDs().size()];
        for (int size = secondaryToolbar.getClickableIDs().size(), i = 0; i < size; ++i) {
            array[i] = ((AndroidResource)secondaryToolbar.getClickableIDs().get(i)).getIdentifier((Context)this);
        }
        final r customTabsSession = this.customTabsSession;
        final PendingIntent secondaryToolbarOnClickPendingIntent = this.getSecondaryToolbarOnClickPendingIntent();
        customTabsSession.getClass();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", (Parcelable)remoteViews);
        ((BaseBundle)bundle).putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", array);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", (Parcelable)secondaryToolbarOnClickPendingIntent);
        while (true) {
            try {
                ((c)customTabsSession.b).l3(customTabsSession.c, bundle);
                this.secondaryToolbar = secondaryToolbar;
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
}

package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.os.BaseBundle;
import android.view.ViewGroup;
import androidx.activity.n;
import java.util.HashMap;
import android.view.KeyEvent;
import android.view.MenuItem$OnMenuItemClickListener;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import android.view.View;
import android.view.View$OnFocusChangeListener;
import android.widget.SearchView$OnCloseListener;
import android.widget.SearchView$OnQueryTextListener;
import n.l;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import F4.f;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import java.io.IOException;
import android.webkit.WebView;
import android.webkit.WebView$WebViewTransport;
import android.os.Message;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import F4.p;
import android.os.Bundle;
import java.util.Iterator;
import android.util.Log;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import android.app.Activity;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import android.widget.RelativeLayout;
import F4.r;
import o.q1;
import android.view.MenuItem;
import F4.o;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import f.b;
import j.i;
import x0.d;
import j.h;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import android.widget.SearchView;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import android.widget.ProgressBar;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import android.view.Menu;
import java.util.List;
import j.a;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import j.j;

public class InAppBrowserActivity extends j implements InAppBrowserDelegate, Disposable
{
    protected static final String LOG_TAG = "InAppBrowserActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappbrowser_";
    public a actionBar;
    private List<ActivityResultListener> activityResultListeners;
    public InAppBrowserChannelDelegate channelDelegate;
    public InAppBrowserSettings customSettings;
    public String fromActivity;
    public String id;
    public boolean isHidden;
    public InAppBrowserManager manager;
    public Menu menu;
    public List<InAppBrowserMenuItem> menuItems;
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;
    
    public InAppBrowserActivity() {
        ((n)this).getSavedStateRegistry().c("androidx:appcompat", (d)new h(this));
        ((n)this).addOnContextAvailableListener((b)new i(this));
        this.customSettings = new InAppBrowserSettings();
        this.isHidden = false;
        this.activityResultListeners = (List<ActivityResultListener>)new ArrayList();
        this.menuItems = (List<InAppBrowserMenuItem>)new ArrayList();
    }
    
    private void prepareView() {
        final InAppWebView webView = this.webView;
        if (webView != null) {
            webView.prepare();
        }
        if (this.customSettings.hidden) {
            this.hide();
        }
        else {
            this.show();
        }
        final ProgressBar progressBar = this.findViewById(R.id.progressBar);
        this.progressBar = progressBar;
        if (progressBar != null) {
            if (this.customSettings.hideProgressBar) {
                this.progressBar.setMax(0);
            }
            else {
                this.progressBar.setMax(100);
            }
        }
        final a actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.p(this.customSettings.hideTitleBar ^ true);
            if (this.customSettings.hideToolbarTop) {
                this.actionBar.f();
            }
            final String toolbarTopBackgroundColor = this.customSettings.toolbarTopBackgroundColor;
            if (toolbarTopBackgroundColor != null && !toolbarTopBackgroundColor.isEmpty()) {
                this.actionBar.n(new ColorDrawable(Color.parseColor(this.customSettings.toolbarTopBackgroundColor)));
            }
            final String toolbarTopFixedTitle = this.customSettings.toolbarTopFixedTitle;
            if (toolbarTopFixedTitle != null && !toolbarTopFixedTitle.isEmpty()) {
                this.actionBar.r((CharSequence)this.customSettings.toolbarTopFixedTitle);
            }
        }
    }
    
    public boolean canGoBack() {
        final InAppWebView webView = this.webView;
        return webView != null && webView.canGoBack();
    }
    
    public boolean canGoForward() {
        final InAppWebView webView = this.webView;
        return webView != null && webView.canGoForward();
    }
    
    public void close(final o o) {
        final InAppBrowserChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.onExit();
        }
        this.dispose();
        if (o != null) {
            o.success((Object)Boolean.TRUE);
        }
    }
    
    public void closeButtonClicked(final MenuItem menuItem) {
        this.close(null);
    }
    
    @Override
    public void didChangeProgress(final int n) {
        final ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            ((View)progressBar).setVisibility(0);
            this.progressBar.setProgress(n, true);
            if (n == 100) {
                ((View)this.progressBar).setVisibility(8);
            }
        }
    }
    
    @Override
    public void didChangeTitle(final String s) {
        if (this.actionBar != null) {
            final String toolbarTopFixedTitle = this.customSettings.toolbarTopFixedTitle;
            if (toolbarTopFixedTitle == null || toolbarTopFixedTitle.isEmpty()) {
                this.actionBar.r((CharSequence)s);
            }
        }
    }
    
    @Override
    public void didFailNavigation(final String s, final int n, final String s2) {
        final ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }
    
    @Override
    public void didFinishNavigation(final String s) {
        final SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery((CharSequence)s, false);
        }
        final ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }
    
    @Override
    public void didStartNavigation(final String s) {
        final ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        final SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery((CharSequence)s, false);
        }
    }
    
    @Override
    public void didUpdateVisitedHistory(final String s) {
        final SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery((CharSequence)s, false);
        }
    }
    
    @Override
    public void dispose() {
        final InAppBrowserChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.activityResultListeners.clear();
        final InAppWebView webView = this.webView;
        if (webView != null) {
            final InAppBrowserManager manager = this.manager;
            if (manager != null) {
                final InAppWebViewFlutterPlugin plugin = manager.plugin;
                if (plugin != null) {
                    final C4.b activityPluginBinding = plugin.activityPluginBinding;
                    if (activityPluginBinding != null) {
                        final InAppWebViewChromeClient inAppWebViewChromeClient = webView.inAppWebViewChromeClient;
                        if (inAppWebViewChromeClient != null) {
                            ((q1)activityPluginBinding).h((r)inAppWebViewChromeClient);
                        }
                    }
                }
            }
            final RelativeLayout relativeLayout = this.findViewById(R.id.container);
            if (relativeLayout != null) {
                ((ViewGroup)relativeLayout).removeAllViews();
            }
            this.webView.dispose();
            this.webView = null;
            ((Activity)this).finish();
        }
    }
    
    @Override
    public Activity getActivity() {
        return (Activity)this;
    }
    
    @Override
    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }
    
    public Map<String, Object> getCustomSettings() {
        final InAppWebView webView = this.webView;
        final Map map = null;
        Map customSettings;
        if (webView != null) {
            customSettings = webView.getCustomSettings();
        }
        else {
            customSettings = null;
        }
        final InAppBrowserSettings customSettings2 = this.customSettings;
        Map realSettings = map;
        if (customSettings2 != null) {
            if (customSettings == null) {
                realSettings = map;
            }
            else {
                realSettings = customSettings2.getRealSettings(this);
                realSettings.putAll(customSettings);
            }
        }
        return (Map<String, Object>)realSettings;
    }
    
    public void goBack() {
        if (this.webView != null && this.canGoBack()) {
            this.webView.goBack();
        }
    }
    
    public void goBackButtonClicked(final MenuItem menuItem) {
        this.goBack();
    }
    
    public void goForward() {
        if (this.webView != null && this.canGoForward()) {
            this.webView.goForward();
        }
    }
    
    public void goForwardButtonClicked(final MenuItem menuItem) {
        this.goForward();
    }
    
    public void hide() {
        if (this.fromActivity != null) {
            try {
                this.isHidden = true;
                final Intent intent = new Intent((Context)this, (Class)Class.forName(this.fromActivity));
                intent.setFlags(131072);
                ((Activity)this).startActivityIfNeeded(intent, 0);
            }
            catch (final ClassNotFoundException ex) {
                Log.d("InAppBrowserActivity", "", (Throwable)ex);
            }
        }
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        final Iterator iterator = this.activityResultListeners.iterator();
        while (iterator.hasNext()) {
            if (((ActivityResultListener)iterator.next()).onActivityResult(n, n2, intent)) {
                return;
            }
        }
        super.onActivityResult(n, n2, intent);
    }
    
    public void onCreate(Bundle extras) {
        super.onCreate(extras);
        extras = ((Activity)this).getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.id = ((BaseBundle)extras).getString("id");
        final InAppBrowserManager manager = (InAppBrowserManager)InAppBrowserManager.shared.get((Object)((BaseBundle)extras).getString("managerId"));
        if ((this.manager = manager) != null) {
            final InAppWebViewFlutterPlugin plugin = manager.plugin;
            if (plugin != null) {
                if (plugin.messenger != null) {
                    final Map map = (Map)extras.getSerializable("settings");
                    this.customSettings.parse((Map<String, Object>)map);
                    this.windowId = ((BaseBundle)extras).getInt("windowId");
                    this.setContentView(R.layout.activity_web_view);
                    final Map map2 = (Map)extras.getSerializable("pullToRefreshInitialSettings");
                    final f messenger = this.manager.plugin.messenger;
                    final StringBuilder sb = new StringBuilder("com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_");
                    sb.append(this.id);
                    final p p = new p(messenger, sb.toString());
                    final PullToRefreshSettings settings = new PullToRefreshSettings();
                    settings.parse((Map<String, Object>)map2);
                    final PullToRefreshLayout pullToRefreshLayout = this.findViewById(R.id.pullToRefresh);
                    this.pullToRefreshLayout = pullToRefreshLayout;
                    pullToRefreshLayout.channelDelegate = new PullToRefreshChannelDelegate(pullToRefreshLayout, p);
                    final PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshLayout;
                    pullToRefreshLayout2.settings = settings;
                    pullToRefreshLayout2.prepare();
                    final InAppWebView webView = this.findViewById(R.id.webView);
                    this.webView = webView;
                    final String id = this.id;
                    webView.id = id;
                    webView.windowId = this.windowId;
                    webView.inAppBrowserDelegate = this;
                    final InAppWebViewFlutterPlugin plugin2 = this.manager.plugin;
                    webView.plugin = plugin2;
                    (this.webView.findInteractionController = new FindInteractionController(webView, plugin2, id, null)).prepare();
                    final f messenger2 = this.manager.plugin.messenger;
                    final StringBuilder sb2 = new StringBuilder("com.pichillilorenzo/flutter_inappbrowser_");
                    sb2.append(this.id);
                    final p p2 = new p(messenger2, sb2.toString());
                    this.channelDelegate = new InAppBrowserChannelDelegate(p2);
                    final InAppWebView webView2 = this.webView;
                    webView2.channelDelegate = new WebViewChannelDelegate(webView2, p2);
                    this.fromActivity = ((BaseBundle)extras).getString("fromActivity");
                    final Map contextMenu = (Map)extras.getSerializable("contextMenu");
                    final List list = (List)extras.getSerializable("initialUserScripts");
                    final Iterator iterator = ((List)extras.getSerializable("menuItems")).iterator();
                    while (iterator.hasNext()) {
                        this.menuItems.add((Object)InAppBrowserMenuItem.fromMap((Map<String, Object>)iterator.next()));
                    }
                    final InAppWebViewSettings customSettings = new InAppWebViewSettings();
                    customSettings.parse((Map<String, Object>)map);
                    final InAppWebView webView3 = this.webView;
                    webView3.customSettings = customSettings;
                    webView3.contextMenu = (Map<String, Object>)contextMenu;
                    final ArrayList list2 = new ArrayList();
                    if (list != null) {
                        final Iterator iterator2 = list.iterator();
                        while (iterator2.hasNext()) {
                            list2.add((Object)UserScript.fromMap((Map<String, Object>)iterator2.next()));
                        }
                    }
                    this.webView.userContentController.addUserOnlyScripts((List<UserScript>)list2);
                    this.actionBar = this.getSupportActionBar();
                    this.prepareView();
                    Label_0814: {
                        if (this.windowId != -1) {
                            final InAppWebViewFlutterPlugin plugin3 = this.webView.plugin;
                            if (plugin3 != null) {
                                final InAppWebViewManager inAppWebViewManager = plugin3.inAppWebViewManager;
                                if (inAppWebViewManager != null) {
                                    final Message message = (Message)inAppWebViewManager.windowWebViewMessages.get((Object)this.windowId);
                                    if (message != null) {
                                        ((WebView$WebViewTransport)message.obj).setWebView((WebView)this.webView);
                                        message.sendToTarget();
                                    }
                                }
                            }
                        }
                        else {
                            final String string = ((BaseBundle)extras).getString("initialFile");
                            final Map map3 = (Map)extras.getSerializable("initialUrlRequest");
                            final String string2 = ((BaseBundle)extras).getString("initialData");
                            if (string != null) {
                                try {
                                    this.webView.loadFile(string);
                                    break Label_0814;
                                }
                                catch (final IOException ex) {
                                    Log.e("InAppBrowserActivity", string.concat(" asset file cannot be found!"), (Throwable)ex);
                                    return;
                                }
                            }
                            if (string2 != null) {
                                this.webView.loadDataWithBaseURL(((BaseBundle)extras).getString("initialBaseUrl"), string2, ((BaseBundle)extras).getString("initialMimeType"), ((BaseBundle)extras).getString("initialEncoding"), ((BaseBundle)extras).getString("initialHistoryUrl"));
                            }
                            else if (map3 != null) {
                                final URLRequest fromMap = URLRequest.fromMap((Map<String, Object>)map3);
                                if (fromMap != null) {
                                    this.webView.loadUrl(fromMap);
                                }
                            }
                        }
                    }
                    final InAppBrowserChannelDelegate channelDelegate = this.channelDelegate;
                    if (channelDelegate != null) {
                        channelDelegate.onBrowserCreated();
                    }
                }
            }
        }
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.menu = menu;
        final a actionBar = this.actionBar;
        final String s = "";
        if (actionBar != null) {
            final String toolbarTopFixedTitle = this.customSettings.toolbarTopFixedTitle;
            if (toolbarTopFixedTitle == null || toolbarTopFixedTitle.isEmpty()) {
                final a actionBar2 = this.actionBar;
                final InAppWebView webView = this.webView;
                String title;
                if (webView != null) {
                    title = webView.getTitle();
                }
                else {
                    title = "";
                }
                actionBar2.r((CharSequence)title);
            }
        }
        final Menu menu2 = this.menu;
        if (menu2 == null) {
            return super.onCreateOptionsMenu(menu);
        }
        if (menu2 instanceof l) {
            ((l)menu2).s = true;
        }
        this.getMenuInflater().inflate(R.menu.menu_main, this.menu);
        final MenuItem item = this.menu.findItem(R.id.menu_search);
        if (item != null) {
            if (this.customSettings.hideUrlBar) {
                item.setVisible(false);
            }
            final SearchView searchView = (SearchView)item.getActionView();
            if ((this.searchView = searchView) != null) {
                ((View)searchView).setFocusable(true);
                final SearchView searchView2 = this.searchView;
                final InAppWebView webView2 = this.webView;
                String url = s;
                if (webView2 != null) {
                    url = webView2.getUrl();
                }
                searchView2.setQuery((CharSequence)url, false);
                this.searchView.setOnQueryTextListener((SearchView$OnQueryTextListener)new SearchView$OnQueryTextListener(this) {
                    final InAppBrowserActivity this$0;
                    
                    public boolean onQueryTextChange(final String s) {
                        return false;
                    }
                    
                    public boolean onQueryTextSubmit(final String s) {
                        if (!s.isEmpty()) {
                            final InAppWebView webView = this.this$0.webView;
                            if (webView != null) {
                                webView.loadUrl(s);
                            }
                            final SearchView searchView = this.this$0.searchView;
                            if (searchView != null) {
                                searchView.setQuery((CharSequence)"", false);
                                this.this$0.searchView.setIconified(true);
                            }
                            return true;
                        }
                        return false;
                    }
                });
                this.searchView.setOnCloseListener((SearchView$OnCloseListener)new SearchView$OnCloseListener(this) {
                    final InAppBrowserActivity this$0;
                    
                    public boolean onClose() {
                        final SearchView searchView = this.this$0.searchView;
                        if (searchView != null && searchView.getQuery().toString().isEmpty()) {
                            final InAppBrowserActivity this$0 = this.this$0;
                            final SearchView searchView2 = this$0.searchView;
                            final InAppWebView webView = this$0.webView;
                            String url;
                            if (webView != null) {
                                url = webView.getUrl();
                            }
                            else {
                                url = "";
                            }
                            searchView2.setQuery((CharSequence)url, false);
                        }
                        return false;
                    }
                });
                this.searchView.setOnQueryTextFocusChangeListener((View$OnFocusChangeListener)new View$OnFocusChangeListener(this) {
                    final InAppBrowserActivity this$0;
                    
                    public void onFocusChange(final View view, final boolean b) {
                        if (!b) {
                            final SearchView searchView = this.this$0.searchView;
                            if (searchView != null) {
                                searchView.setQuery((CharSequence)"", false);
                                this.this$0.searchView.setIconified(true);
                            }
                        }
                    }
                });
            }
        }
        if (this.customSettings.hideDefaultMenuItems) {
            final MenuItem item2 = this.menu.findItem(R.id.action_close);
            if (item2 != null) {
                item2.setVisible(false);
            }
            final MenuItem item3 = this.menu.findItem(R.id.action_go_back);
            if (item3 != null) {
                item3.setVisible(false);
            }
            final MenuItem item4 = this.menu.findItem(R.id.action_reload);
            if (item4 != null) {
                item4.setVisible(false);
            }
            final MenuItem item5 = this.menu.findItem(R.id.action_go_forward);
            if (item5 != null) {
                item5.setVisible(false);
            }
            final MenuItem item6 = this.menu.findItem(R.id.action_share);
            if (item6 != null) {
                item6.setVisible(false);
            }
        }
        for (final InAppBrowserMenuItem inAppBrowserMenuItem : this.menuItems) {
            int intValue;
            if (inAppBrowserMenuItem.getOrder() != null) {
                intValue = inAppBrowserMenuItem.getOrder();
            }
            else {
                intValue = 0;
            }
            final MenuItem add = this.menu.add(0, inAppBrowserMenuItem.getId(), intValue, (CharSequence)inAppBrowserMenuItem.getTitle());
            if (inAppBrowserMenuItem.isShowAsAction()) {
                add.setShowAsAction(2);
            }
            final Object icon = inAppBrowserMenuItem.getIcon();
            if (icon != null) {
                if (icon instanceof AndroidResource) {
                    add.setIcon(((AndroidResource)icon).getIdentifier((Context)this));
                }
                else {
                    add.setIcon(Util.drawableFromBytes((Context)this, (byte[])icon));
                }
                final String iconColor = inAppBrowserMenuItem.getIconColor();
                if (iconColor != null && !iconColor.isEmpty()) {
                    add.getIcon().setTint(Color.parseColor(iconColor));
                }
            }
            add.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new MenuItem$OnMenuItemClickListener(this, inAppBrowserMenuItem) {
                final InAppBrowserActivity this$0;
                final InAppBrowserMenuItem val$menuItem;
                
                public boolean onMenuItemClick(final MenuItem menuItem) {
                    final InAppBrowserChannelDelegate channelDelegate = this.this$0.channelDelegate;
                    if (channelDelegate != null) {
                        channelDelegate.onMenuItemClicked(this.val$menuItem);
                    }
                    return true;
                }
            });
        }
        return true;
    }
    
    @Override
    public void onDestroy() {
        this.dispose();
        super.onDestroy();
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            if (this.customSettings.shouldCloseOnBackButtonPressed) {
                this.close(null);
                return true;
            }
            if (this.customSettings.allowGoBackWithBackButton) {
                if (this.canGoBack()) {
                    this.goBack();
                }
                else if (this.customSettings.closeOnCannotGoBack) {
                    this.close(null);
                }
                return true;
            }
            if (!this.customSettings.shouldCloseOnBackButtonPressed) {
                return true;
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void reload() {
        final InAppWebView webView = this.webView;
        if (webView != null) {
            webView.reload();
        }
    }
    
    public void reloadButtonClicked(final MenuItem menuItem) {
        this.reload();
    }
    
    public void setSettings(final InAppBrowserSettings customSettings, final HashMap<String, Object> hashMap) {
        final InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse((Map<String, Object>)hashMap);
        final InAppWebView webView = this.webView;
        if (webView != null) {
            webView.setSettings(inAppWebViewSettings, hashMap);
        }
        if (hashMap.get((Object)"hidden") != null) {
            final Boolean hidden = this.customSettings.hidden;
            final Boolean hidden2 = customSettings.hidden;
            if (hidden != hidden2) {
                if (hidden2) {
                    this.hide();
                }
                else {
                    this.show();
                }
            }
        }
        if (hashMap.get((Object)"hideProgressBar") != null) {
            final Boolean hideProgressBar = this.customSettings.hideProgressBar;
            final Boolean hideProgressBar2 = customSettings.hideProgressBar;
            if (hideProgressBar != hideProgressBar2 && this.progressBar != null) {
                if (hideProgressBar2) {
                    this.progressBar.setMax(0);
                }
                else {
                    this.progressBar.setMax(100);
                }
            }
        }
        if (this.actionBar != null && hashMap.get((Object)"hideTitleBar") != null) {
            final Boolean hideTitleBar = this.customSettings.hideTitleBar;
            final Boolean hideTitleBar2 = customSettings.hideTitleBar;
            if (hideTitleBar != hideTitleBar2) {
                this.actionBar.p(hideTitleBar2 ^ true);
            }
        }
        if (this.actionBar != null && hashMap.get((Object)"hideToolbarTop") != null) {
            final Boolean hideToolbarTop = this.customSettings.hideToolbarTop;
            final Boolean hideToolbarTop2 = customSettings.hideToolbarTop;
            if (hideToolbarTop != hideToolbarTop2) {
                if (hideToolbarTop2) {
                    this.actionBar.f();
                }
                else {
                    this.actionBar.t();
                }
            }
        }
        if (this.actionBar != null && hashMap.get((Object)"toolbarTopBackgroundColor") != null && !Util.objEquals(this.customSettings.toolbarTopBackgroundColor, customSettings.toolbarTopBackgroundColor)) {
            final String toolbarTopBackgroundColor = customSettings.toolbarTopBackgroundColor;
            if (toolbarTopBackgroundColor != null && !toolbarTopBackgroundColor.isEmpty()) {
                this.actionBar.n(new ColorDrawable(Color.parseColor(customSettings.toolbarTopBackgroundColor)));
            }
        }
        if (this.actionBar != null && hashMap.get((Object)"toolbarTopFixedTitle") != null && !Util.objEquals(this.customSettings.toolbarTopFixedTitle, customSettings.toolbarTopFixedTitle)) {
            final String toolbarTopFixedTitle = customSettings.toolbarTopFixedTitle;
            if (toolbarTopFixedTitle != null && !toolbarTopFixedTitle.isEmpty()) {
                this.actionBar.r((CharSequence)customSettings.toolbarTopFixedTitle);
            }
        }
        if (this.menu != null && hashMap.get((Object)"hideUrlBar") != null && this.customSettings.hideUrlBar != customSettings.hideUrlBar) {
            final MenuItem item = this.menu.findItem(R.id.menu_search);
            if (item != null) {
                item.setVisible(customSettings.hideUrlBar ^ true);
            }
        }
        if (this.menu != null && hashMap.get((Object)"hideDefaultMenuItems") != null && this.customSettings.hideDefaultMenuItems != customSettings.hideDefaultMenuItems) {
            final MenuItem item2 = this.menu.findItem(R.id.action_close);
            if (item2 != null) {
                item2.setVisible(customSettings.hideDefaultMenuItems ^ true);
            }
            final MenuItem item3 = this.menu.findItem(R.id.action_go_back);
            if (item3 != null) {
                item3.setVisible(customSettings.hideDefaultMenuItems ^ true);
            }
            final MenuItem item4 = this.menu.findItem(R.id.action_reload);
            if (item4 != null) {
                item4.setVisible(customSettings.hideDefaultMenuItems ^ true);
            }
            final MenuItem item5 = this.menu.findItem(R.id.action_go_forward);
            if (item5 != null) {
                item5.setVisible(customSettings.hideDefaultMenuItems ^ true);
            }
            final MenuItem item6 = this.menu.findItem(R.id.action_share);
            if (item6 != null) {
                item6.setVisible(customSettings.hideDefaultMenuItems ^ true);
            }
        }
        this.customSettings = customSettings;
    }
    
    public void shareButtonClicked(final MenuItem menuItem) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        final InAppWebView webView = this.webView;
        String url;
        if (webView != null) {
            url = webView.getUrl();
        }
        else {
            url = "";
        }
        intent.putExtra("android.intent.extra.TEXT", url);
        ((Context)this).startActivity(Intent.createChooser(intent, (CharSequence)"Share"));
    }
    
    public void show() {
        this.isHidden = false;
        final Intent intent = new Intent((Context)this, (Class)InAppBrowserActivity.class);
        intent.setFlags(131072);
        ((Activity)this).startActivityIfNeeded(intent, 0);
    }
}

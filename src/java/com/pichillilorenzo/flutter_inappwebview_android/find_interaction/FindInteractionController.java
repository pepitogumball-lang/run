package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import F4.f;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class FindInteractionController implements Disposable
{
    static final String LOG_TAG = "FindInteractionController";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_find_interaction_";
    public FindSession activeFindSession;
    public FindInteractionChannelDelegate channelDelegate;
    public String searchText;
    public FindInteractionSettings settings;
    public InAppWebViewInterface webView;
    
    public FindInteractionController(final InAppWebViewInterface webView, final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, final Object o, final FindInteractionSettings settings) {
        this.webView = webView;
        this.settings = settings;
        final f messenger = inAppWebViewFlutterPlugin.messenger;
        final StringBuilder sb = new StringBuilder("com.pichillilorenzo/flutter_inappwebview_find_interaction_");
        sb.append(o);
        this.channelDelegate = new FindInteractionChannelDelegate(this, new p(messenger, sb.toString()));
    }
    
    public void clearMatches() {
        final InAppWebViewInterface webView = this.webView;
        if (webView != null) {
            webView.clearMatches();
        }
    }
    
    @Override
    public void dispose() {
        final FindInteractionChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.webView = null;
        this.activeFindSession = null;
        this.searchText = null;
    }
    
    public void findAll(String searchText) {
        if (searchText == null) {
            searchText = this.searchText;
        }
        else {
            this.searchText = searchText;
        }
        final InAppWebViewInterface webView = this.webView;
        if (webView != null && searchText != null) {
            webView.findAllAsync(searchText);
        }
    }
    
    public void findNext(final boolean b) {
        final InAppWebViewInterface webView = this.webView;
        if (webView != null) {
            webView.findNext(b);
        }
    }
    
    public void prepare() {
    }
}

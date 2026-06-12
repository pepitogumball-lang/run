package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.view.ViewGroup;
import android.graphics.Color;
import androidx.swiperefreshlayout.widget.j;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import android.view.View;
import androidx.swiperefreshlayout.widget.i;
import F4.f;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import android.util.AttributeSet;
import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import androidx.swiperefreshlayout.widget.l;

public class PullToRefreshLayout extends l implements Disposable
{
    static final String LOG_TAG = "PullToRefreshLayout";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_";
    public PullToRefreshChannelDelegate channelDelegate;
    public PullToRefreshSettings settings;
    
    public PullToRefreshLayout(final Context context) {
        super(context, (AttributeSet)null);
        this.settings = new PullToRefreshSettings();
    }
    
    public PullToRefreshLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.settings = new PullToRefreshSettings();
    }
    
    public PullToRefreshLayout(final Context context, final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, final Object o, final PullToRefreshSettings settings) {
        super(context, (AttributeSet)null);
        new PullToRefreshSettings();
        this.settings = settings;
        final f messenger = inAppWebViewFlutterPlugin.messenger;
        final StringBuilder sb = new StringBuilder("com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_");
        sb.append(o);
        this.channelDelegate = new PullToRefreshChannelDelegate(this, new p(messenger, sb.toString()));
    }
    
    public void dispose() {
        final PullToRefreshChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        ((ViewGroup)this).removeAllViews();
    }
    
    public void prepare() {
        this.setEnabled((boolean)this.settings.enabled);
        this.setOnChildScrollUpCallback((i)new i(this) {
            final PullToRefreshLayout this$0;
            
            public boolean canChildScrollUp(final l l, final View view) {
                final boolean b = view instanceof InAppWebView;
                boolean b3;
                final boolean b2 = b3 = true;
                if (b) {
                    final InAppWebView inAppWebView = (InAppWebView)view;
                    if (inAppWebView.canScrollVertically()) {
                        b3 = b2;
                        if (((View)inAppWebView).getScrollY() > 0) {
                            return b3;
                        }
                    }
                    b3 = (!inAppWebView.canScrollVertically() && ((View)inAppWebView).getScrollY() == 0 && b2);
                }
                return b3;
            }
        });
        this.setOnRefreshListener((j)new j(this, this) {
            final PullToRefreshLayout this$0;
            final PullToRefreshLayout val$self;
            
            public void onRefresh() {
                final PullToRefreshChannelDelegate channelDelegate = this.this$0.channelDelegate;
                if (channelDelegate == null) {
                    this.val$self.setRefreshing(false);
                    return;
                }
                channelDelegate.onRefresh();
            }
        });
        final String color = this.settings.color;
        if (color != null) {
            this.setColorSchemeColors(new int[] { Color.parseColor(color) });
        }
        final String backgroundColor = this.settings.backgroundColor;
        if (backgroundColor != null) {
            this.setProgressBackgroundColorSchemeColor(Color.parseColor(backgroundColor));
        }
        final Integer distanceToTriggerSync = this.settings.distanceToTriggerSync;
        if (distanceToTriggerSync != null) {
            this.setDistanceToTriggerSync((int)distanceToTriggerSync);
        }
        final Integer slingshotDistance = this.settings.slingshotDistance;
        if (slingshotDistance != null) {
            this.setSlingshotDistance((int)slingshotDistance);
        }
        final Integer size = this.settings.size;
        if (size != null) {
            this.setSize((int)size);
        }
    }
}

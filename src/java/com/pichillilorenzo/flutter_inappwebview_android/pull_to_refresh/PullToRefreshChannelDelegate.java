package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.view.View;
import java.util.HashMap;
import android.graphics.Color;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class PullToRefreshChannelDelegate extends ChannelDelegateImpl
{
    private PullToRefreshLayout pullToRefreshView;
    
    public PullToRefreshChannelDelegate(final PullToRefreshLayout pullToRefreshView, final p p2) {
        super(p2);
        this.pullToRefreshView = pullToRefreshView;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        boolean b = true;
        final String a = m.a;
        a.getClass();
        int n = 0;
        Label_0298: {
            switch (a.hashCode()) {
                case 2105594551: {
                    if (!a.equals((Object)"isEnabled")) {
                        break;
                    }
                    n = 9;
                    break Label_0298;
                }
                case 1984958339: {
                    if (!a.equals((Object)"setSize")) {
                        break;
                    }
                    n = 8;
                    break Label_0298;
                }
                case 1849446385: {
                    if (!a.equals((Object)"isRefreshing")) {
                        break;
                    }
                    n = 7;
                    break Label_0298;
                }
                case 1807783361: {
                    if (!a.equals((Object)"setDistanceToTriggerSync")) {
                        break;
                    }
                    n = 6;
                    break Label_0298;
                }
                case 1743806995: {
                    if (!a.equals((Object)"setBackgroundColor")) {
                        break;
                    }
                    n = 5;
                    break Label_0298;
                }
                case 1389555745: {
                    if (!a.equals((Object)"setColor")) {
                        break;
                    }
                    n = 4;
                    break Label_0298;
                }
                case 1364071551: {
                    if (!a.equals((Object)"setEnabled")) {
                        break;
                    }
                    n = 3;
                    break Label_0298;
                }
                case 1235582893: {
                    if (!a.equals((Object)"getDefaultSlingshotDistance")) {
                        break;
                    }
                    n = 2;
                    break Label_0298;
                }
                case 154556713: {
                    if (!a.equals((Object)"setRefreshing")) {
                        break;
                    }
                    n = 1;
                    break Label_0298;
                }
                case -1790841290: {
                    if (!a.equals((Object)"setSlingshotDistance")) {
                        break;
                    }
                    n = 0;
                    break Label_0298;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                o.notImplemented();
                break;
            }
            case 9: {
                final PullToRefreshLayout pullToRefreshView = this.pullToRefreshView;
                if (pullToRefreshView != null) {
                    o.success((Object)((View)pullToRefreshView).isEnabled());
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 8: {
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setSize((int)m.a("size"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 7: {
                final PullToRefreshLayout pullToRefreshView2 = this.pullToRefreshView;
                if (pullToRefreshView2 == null || !pullToRefreshView2.isRefreshing()) {
                    b = false;
                }
                o.success((Object)b);
                break;
            }
            case 6: {
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setDistanceToTriggerSync((int)m.a("distanceToTriggerSync"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 5: {
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String)m.a("color")));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 4: {
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setColorSchemeColors(new int[] { Color.parseColor((String)m.a("color")) });
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 3: {
                if (this.pullToRefreshView != null) {
                    final Boolean enabled = (Boolean)m.a("enabled");
                    final PullToRefreshLayout pullToRefreshView3 = this.pullToRefreshView;
                    pullToRefreshView3.settings.enabled = enabled;
                    pullToRefreshView3.setEnabled((boolean)enabled);
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 2: {
                o.success((Object)(-1));
                break;
            }
            case 1: {
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setRefreshing((boolean)m.a("refreshing"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                if (this.pullToRefreshView != null) {
                    this.pullToRefreshView.setSlingshotDistance((int)m.a("slingshotDistance"));
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
    
    public void onRefresh() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onRefresh", (Object)new HashMap(), (o)null);
    }
}

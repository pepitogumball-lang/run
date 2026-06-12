package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import java.util.Map;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl
{
    private HeadlessInAppWebView headlessWebView;
    
    public HeadlessWebViewChannelDelegate(final HeadlessInAppWebView headlessWebView, final p p2) {
        super(p2);
        this.headlessWebView = headlessWebView;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.headlessWebView = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 1984958339: {
                if (!a.equals((Object)"setSize")) {
                    break;
                }
                n = 2;
                break;
            }
            case 1671767583: {
                if (!a.equals((Object)"dispose")) {
                    break;
                }
                n = 1;
                break;
            }
            case -75151241: {
                if (!a.equals((Object)"getSize")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                o.notImplemented();
                break;
            }
            case 2: {
                if (this.headlessWebView != null) {
                    final Size2D fromMap = Size2D.fromMap((Map<String, Object>)m.a("size"));
                    if (fromMap != null) {
                        this.headlessWebView.setSize(fromMap);
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 1: {
                final HeadlessInAppWebView headlessWebView = this.headlessWebView;
                if (headlessWebView != null) {
                    headlessWebView.dispose();
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                final HeadlessInAppWebView headlessWebView2 = this.headlessWebView;
                Object map = null;
                if (headlessWebView2 != null) {
                    final Size2D size = headlessWebView2.getSize();
                    if (size != null) {
                        map = size.toMap();
                    }
                    o.success(map);
                    break;
                }
                o.success((Object)null);
                break;
            }
        }
    }
    
    public void onWebViewCreated() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onWebViewCreated", (Object)new HashMap(), (o)null);
    }
}

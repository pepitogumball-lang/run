package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import F4.m;
import java.util.Map;
import F4.o;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl
{
    private WebMessageChannel webMessageChannel;
    
    public WebMessageChannelChannelDelegate(final WebMessageChannel webMessageChannel, final p p2) {
        super(p2);
        this.webMessageChannel = webMessageChannel;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.webMessageChannel = null;
    }
    
    public void onMessage(final int n, final WebMessageCompatExt webMessageCompatExt) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"index", (Object)n);
        Map map;
        if (webMessageCompatExt != null) {
            map = webMessageCompatExt.toMap();
        }
        else {
            map = null;
        }
        hashMap.put((Object)"message", (Object)map);
        channel.a("onMessage", (Object)hashMap, (o)null);
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 1490029383: {
                if (!a.equals((Object)"postMessage")) {
                    break;
                }
                n = 2;
                break;
            }
            case 556190586: {
                if (!a.equals((Object)"setWebMessageCallback")) {
                    break;
                }
                n = 1;
                break;
            }
            case 94756344: {
                if (!a.equals((Object)"close")) {
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
                final WebMessageChannel webMessageChannel = this.webMessageChannel;
                if (webMessageChannel != null && webMessageChannel.webView instanceof InAppWebView) {
                    this.webMessageChannel.postMessageForInAppWebView((Integer)m.a("index"), WebMessageCompatExt.fromMap((Map<String, Object>)m.a("message")), o);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 1: {
                final WebMessageChannel webMessageChannel2 = this.webMessageChannel;
                if (webMessageChannel2 != null && webMessageChannel2.webView instanceof InAppWebView) {
                    this.webMessageChannel.setWebMessageCallbackForInAppWebView((int)m.a("index"), o);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                final WebMessageChannel webMessageChannel3 = this.webMessageChannel;
                if (webMessageChannel3 != null && webMessageChannel3.webView instanceof InAppWebView) {
                    this.webMessageChannel.closeForInAppWebView((Integer)m.a("index"), o);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
}

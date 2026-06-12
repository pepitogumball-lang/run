package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import java.util.Map;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl
{
    private WebMessageListener webMessageListener;
    
    public WebMessageListenerChannelDelegate(final WebMessageListener webMessageListener, final p p2) {
        super(p2);
        this.webMessageListener = webMessageListener;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.webMessageListener = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        if (!a.equals((Object)"postMessage")) {
            o.notImplemented();
        }
        else {
            final WebMessageListener webMessageListener = this.webMessageListener;
            if (webMessageListener != null && webMessageListener.webView instanceof InAppWebView) {
                this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map<String, Object>)m.a("message")), o);
            }
            else {
                o.success((Object)Boolean.FALSE);
            }
        }
    }
    
    public void onPostMessage(final WebMessageCompatExt webMessageCompatExt, final String s, final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        Map map;
        if (webMessageCompatExt != null) {
            map = webMessageCompatExt.toMap();
        }
        else {
            map = null;
        }
        hashMap.put((Object)"message", (Object)map);
        hashMap.put((Object)"sourceOrigin", (Object)s);
        hashMap.put((Object)"isMainFrame", (Object)b);
        channel.a("onPostMessage", (Object)hashMap, (o)null);
    }
}

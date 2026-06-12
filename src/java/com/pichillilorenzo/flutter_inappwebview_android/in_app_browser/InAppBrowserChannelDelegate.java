package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import F4.o;
import java.util.HashMap;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class InAppBrowserChannelDelegate extends ChannelDelegateImpl
{
    public InAppBrowserChannelDelegate(final p p) {
        super(p);
    }
    
    public void onBrowserCreated() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onBrowserCreated", (Object)new HashMap(), (o)null);
    }
    
    public void onExit() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onExit", (Object)new HashMap(), (o)null);
    }
    
    public void onMenuItemClicked(final InAppBrowserMenuItem inAppBrowserMenuItem) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)inAppBrowserMenuItem.getId());
        channel.a("onMenuItemClicked", (Object)hashMap, (o)null);
    }
}

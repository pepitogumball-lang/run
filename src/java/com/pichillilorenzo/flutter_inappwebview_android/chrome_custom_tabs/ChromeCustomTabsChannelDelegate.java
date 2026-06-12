package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import r.r;
import android.os.RemoteException;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import b.c;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import F4.m;
import F4.o;
import java.util.HashMap;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl
{
    private ChromeCustomTabsActivity chromeCustomTabsActivity;
    
    public ChromeCustomTabsChannelDelegate(final ChromeCustomTabsActivity chromeCustomTabsActivity, final p p2) {
        super(p2);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }
    
    public void onClosed() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onClosed", (Object)new HashMap(), (o)null);
    }
    
    public void onCompletedInitialLoad() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCompletedInitialLoad", (Object)new HashMap(), (o)null);
    }
    
    public void onGreatestScrollPercentageIncreased(final int n) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"scrollPercentage", (Object)n);
        channel.a("onGreatestScrollPercentageIncreased", (Object)hashMap, (o)null);
    }
    
    public void onItemActionPerform(final int n, final String s, final String s2) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)n);
        hashMap.put((Object)"url", (Object)s);
        hashMap.put((Object)"title", (Object)s2);
        channel.a("onItemActionPerform", (Object)hashMap, (o)null);
    }
    
    public void onMessageChannelReady() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onMessageChannelReady", (Object)new HashMap(), (o)null);
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final boolean b = false;
        final String a = m.a;
        a.getClass();
        final Uri uri = null;
        int n = -1;
        switch (a.hashCode()) {
            case 2000053463: {
                if (!a.equals((Object)"mayLaunchUrl")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1490029383: {
                if (!a.equals((Object)"postMessage")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1392239787: {
                if (!a.equals((Object)"requestPostMessageChannel")) {
                    break;
                }
                n = 6;
                break;
            }
            case 1256059502: {
                if (!a.equals((Object)"validateRelationship")) {
                    break;
                }
                n = 5;
                break;
            }
            case 94756344: {
                if (!a.equals((Object)"close")) {
                    break;
                }
                n = 4;
                break;
            }
            case 50870385: {
                if (!a.equals((Object)"updateActionButton")) {
                    break;
                }
                n = 3;
                break;
            }
            case -334843312: {
                if (!a.equals((Object)"updateSecondaryToolbar")) {
                    break;
                }
                n = 2;
                break;
            }
            case -675108676: {
                if (!a.equals((Object)"launchUrl")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1526944655: {
                if (!a.equals((Object)"isEngagementSignalsApiAvailable")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        ChromeCustomTabsActivity chromeCustomTabsActivity;
        ChromeCustomTabsActivity chromeCustomTabsActivity2;
        String s;
        String s2;
        r customTabsSession;
        Uri parse;
        Uri parse2;
        ChromeCustomTabsActivity chromeCustomTabsActivity3;
        Integer n2;
        String s3;
        r customTabsSession2;
        int intValue;
        Uri parse3;
        boolean y4;
        Bundle a2;
        ChromeCustomTabsActivity chromeCustomTabsActivity4;
        ChromeSafariBrowserManager manager;
        ChromeCustomTabsActivity chromeCustomTabsActivity5;
        r customTabsSession3;
        String s4;
        InAppWebViewFlutterPlugin plugin;
        Activity activity;
        Intent intent;
        Block_30_Outer:Label_0820_Outer:Block_26_Outer:
        while (true) {
            Label_0965: {
                switch (n) {
                    default: {
                        o.notImplemented();
                        return;
                    }
                    case 8: {
                        if (this.chromeCustomTabsActivity != null) {
                            o.success((Object)this.chromeCustomTabsActivity.mayLaunchUrl((String)m.a("url"), (List<String>)m.a("otherLikelyURLs")));
                            return;
                        }
                        o.success((Object)Boolean.FALSE);
                        return;
                    }
                    case 7: {
                        chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                        if (chromeCustomTabsActivity != null && chromeCustomTabsActivity.customTabsSession != null) {
                            o.success((Object)this.chromeCustomTabsActivity.customTabsSession.c((String)m.a("message"), new Bundle()));
                            return;
                        }
                        o.success((Object)(-3));
                        return;
                    }
                    case 6: {
                        chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                        if (chromeCustomTabsActivity2 != null && chromeCustomTabsActivity2.customTabsSession != null) {
                            s = (String)m.a("sourceOrigin");
                            s2 = (String)m.a("targetOrigin");
                            customTabsSession = this.chromeCustomTabsActivity.customTabsSession;
                            parse = Uri.parse(s);
                            parse2 = uri;
                            if (s2 != null) {
                                parse2 = Uri.parse(s2);
                            }
                            o.success((Object)customTabsSession.d(parse, parse2, new Bundle()));
                            return;
                        }
                        o.success((Object)Boolean.FALSE);
                        return;
                    }
                    case 4: {
                        break Label_0965;
                    }
                    case 3: {
                        break Label_0965;
                    }
                    case 2: {
                        break Label_0965;
                    }
                    case 1: {
                        break Label_0965;
                    }
                    case 5: {
                        chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                        if (chromeCustomTabsActivity3 == null || chromeCustomTabsActivity3.customTabsSession == null) {
                            break Block_30_Outer;
                        }
                        n2 = (Integer)m.a("relation");
                        s3 = (String)m.a("origin");
                        customTabsSession2 = this.chromeCustomTabsActivity.customTabsSession;
                        intValue = n2;
                        parse3 = Uri.parse(s3);
                        customTabsSession2.getClass();
                        y4 = b;
                        if (intValue < 1) {
                            break Label_0700;
                        }
                        if (intValue > 2) {
                            y4 = b;
                            break Label_0700;
                        }
                    }
                    case 0: {
                        Label_1072: {
                            break Label_1072;
                            a2 = customTabsSession2.a((Bundle)null);
                            try {
                                y4 = ((c)customTabsSession2.b).Y4(customTabsSession2.c, intValue, parse3, a2);
                                o.success((Object)y4);
                                return;
                            Block_25_Outer:
                                while (true) {
                                    while (true) {
                                        Block_24: {
                                            Block_27: {
                                                while (true) {
                                                    while (true) {
                                                        Block_28: {
                                                        Block_31:
                                                            while (true) {
                                                                Block_23: {
                                                                    while (true) {
                                                                        chromeCustomTabsActivity4.onStop();
                                                                        this.chromeCustomTabsActivity.onDestroy();
                                                                        this.chromeCustomTabsActivity.close();
                                                                        manager = this.chromeCustomTabsActivity.manager;
                                                                        iftrue(Label_0820:)(manager == null);
                                                                        break Block_23;
                                                                        o.success((Object)Boolean.FALSE);
                                                                        return;
                                                                        chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                                                                        iftrue(Label_0839:)(chromeCustomTabsActivity4 == null);
                                                                        continue Block_30_Outer;
                                                                    }
                                                                    iftrue(Label_0953:)(this.chromeCustomTabsActivity == null);
                                                                    break Block_27;
                                                                    customTabsSession3 = chromeCustomTabsActivity5.customTabsSession;
                                                                    iftrue(Label_1131:)(customTabsSession3 == null);
                                                                    break Block_31;
                                                                    this.chromeCustomTabsActivity.dispose();
                                                                    o.success((Object)Boolean.TRUE);
                                                                    return;
                                                                    this.chromeCustomTabsActivity.updateActionButton((byte[])m.a("icon"), (String)m.a("description"));
                                                                    o.success((Object)Boolean.TRUE);
                                                                    return;
                                                                    this.chromeCustomTabsActivity.launchUrl(s4, (Map<String, String>)m.a("headers"), (String)m.a("referrer"), (List<String>)m.a("otherLikelyURLs"));
                                                                    o.success((Object)Boolean.TRUE);
                                                                    return;
                                                                }
                                                                plugin = manager.plugin;
                                                                iftrue(Label_0820:)(plugin == null);
                                                                break Block_24;
                                                                Label_0901: {
                                                                    o.success((Object)Boolean.FALSE);
                                                                }
                                                                return;
                                                                Label_1131:
                                                                o.success((Object)Boolean.FALSE);
                                                                return;
                                                                Label_0953:
                                                                o.success((Object)Boolean.FALSE);
                                                                return;
                                                                Label_1060:
                                                                o.success((Object)Boolean.FALSE);
                                                                return;
                                                                iftrue(Label_1060:)(this.chromeCustomTabsActivity == null);
                                                                break Block_28;
                                                                chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                                                                iftrue(Label_1131:)(chromeCustomTabsActivity5 == null);
                                                                continue Label_0820_Outer;
                                                            }
                                                            try {
                                                                o.success((Object)customTabsSession3.b(new Bundle()));
                                                            }
                                                            finally {
                                                                o.success((Object)Boolean.FALSE);
                                                            }
                                                            return;
                                                            Label_1048: {
                                                                o.success((Object)Boolean.FALSE);
                                                            }
                                                            return;
                                                        }
                                                        s4 = (String)m.a("url");
                                                        iftrue(Label_1048:)(s4 == null);
                                                        continue Block_25_Outer;
                                                    }
                                                    Label_0839: {
                                                        o.success((Object)Boolean.FALSE);
                                                    }
                                                    return;
                                                    intent = new Intent((Context)activity, (Class)activity.getClass());
                                                    intent.addFlags(67108864);
                                                    intent.addFlags(536870912);
                                                    activity.startActivity(intent);
                                                    continue Block_26_Outer;
                                                }
                                            }
                                            this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map<String, Object>)m.a("secondaryToolbar")));
                                            o.success((Object)Boolean.TRUE);
                                            return;
                                        }
                                        activity = plugin.activity;
                                        iftrue(Label_0820:)(activity == null);
                                        continue;
                                    }
                                    iftrue(Label_0901:)(this.chromeCustomTabsActivity == null);
                                    continue Block_25_Outer;
                                }
                            }
                            catch (final RemoteException ex) {
                                y4 = b;
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
    
    public void onNavigationEvent(final int n) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"navigationEvent", (Object)n);
        channel.a("onNavigationEvent", (Object)hashMap, (o)null);
    }
    
    public void onOpened() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onOpened", (Object)new HashMap(), (o)null);
    }
    
    public void onPostMessage(final String s) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"message", (Object)s);
        channel.a("onPostMessage", (Object)hashMap, (o)null);
    }
    
    public void onRelationshipValidationResult(final int n, final Uri uri, final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"relation", (Object)n);
        hashMap.put((Object)"requestedOrigin", (Object)uri.toString());
        hashMap.put((Object)"result", (Object)b);
        channel.a("onRelationshipValidationResult", (Object)hashMap, (o)null);
    }
    
    public void onSecondaryItemActionPerform(final String s, final String s2) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"name", (Object)s);
        hashMap.put((Object)"url", (Object)s2);
        channel.a("onSecondaryItemActionPerform", (Object)hashMap, (o)null);
    }
    
    public void onServiceConnected() {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onServiceConnected", (Object)new HashMap(), (o)null);
    }
    
    public void onSessionEnded(final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"didUserInteract", (Object)b);
        channel.a("onSessionEnded", (Object)hashMap, (o)null);
    }
    
    public void onVerticalScrollEvent(final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"isDirectionUp", (Object)b);
        channel.a("onVerticalScrollEvent", (Object)hashMap, (o)null);
    }
}

package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import F4.m;
import F4.o;
import Y3.a;
import java.util.HashMap;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class FindInteractionChannelDelegate extends ChannelDelegateImpl
{
    private FindInteractionController findInteractionController;
    
    public FindInteractionChannelDelegate(final FindInteractionController findInteractionController, final p p2) {
        super(p2);
        this.findInteractionController = findInteractionController;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }
    
    public void onFindResultReceived(final int n, final int n2, final boolean b) {
        final p channel = this.getChannel();
        if (channel == null) {
            return;
        }
        if (b) {
            final FindInteractionController findInteractionController = this.findInteractionController;
            if (findInteractionController != null && findInteractionController.webView != null) {
                findInteractionController.activeFindSession = new FindSession(n2, n);
            }
        }
        final HashMap hashMap = new HashMap();
        a.m(n, hashMap, "activeMatchOrdinal", n2, "numberOfMatches");
        hashMap.put((Object)"isDoneCounting", (Object)b);
        channel.a("onFindResultReceived", (Object)hashMap, (o)null);
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 2137531137: {
                if (!a.equals((Object)"getActiveFindSession")) {
                    break;
                }
                n = 5;
                break;
            }
            case 817048102: {
                if (!a.equals((Object)"clearMatches")) {
                    break;
                }
                n = 4;
                break;
            }
            case -234090249: {
                if (!a.equals((Object)"setSearchText")) {
                    break;
                }
                n = 3;
                break;
            }
            case -679382964: {
                if (!a.equals((Object)"findNext")) {
                    break;
                }
                n = 2;
                break;
            }
            case -853211864: {
                if (!a.equals((Object)"findAll")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1008221461: {
                if (!a.equals((Object)"getSearchText")) {
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
            case 5: {
                final FindInteractionController findInteractionController = this.findInteractionController;
                if (findInteractionController != null) {
                    final FindSession activeFindSession = findInteractionController.activeFindSession;
                    if (activeFindSession != null) {
                        o.success((Object)activeFindSession.toMap());
                        break;
                    }
                }
                o.success((Object)null);
                break;
            }
            case 4: {
                final FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 != null) {
                    findInteractionController2.clearMatches();
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 3: {
                final FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.searchText = (String)m.a("searchText");
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 2: {
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext((boolean)m.a("forward"));
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 1: {
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String)m.a("find"));
                }
                o.success((Object)Boolean.TRUE);
                break;
            }
            case 0: {
                final FindInteractionController findInteractionController4 = this.findInteractionController;
                if (findInteractionController4 != null) {
                    o.success((Object)findInteractionController4.searchText);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
}

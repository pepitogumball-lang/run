package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class PrintJobChannelDelegate extends ChannelDelegateImpl
{
    private PrintJobController printJobController;
    
    public PrintJobChannelDelegate(final PrintJobController printJobController, final p p2) {
        super(p2);
        this.printJobController = printJobController;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 1671767583: {
                if (!a.equals((Object)"dispose")) {
                    break;
                }
                n = 3;
                break;
            }
            case 1097506319: {
                if (!a.equals((Object)"restart")) {
                    break;
                }
                n = 2;
                break;
            }
            case -75444956: {
                if (!a.equals((Object)"getInfo")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1367724422: {
                if (!a.equals((Object)"cancel")) {
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
            case 3: {
                final PrintJobController printJobController = this.printJobController;
                if (printJobController != null) {
                    printJobController.dispose();
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 2: {
                final PrintJobController printJobController2 = this.printJobController;
                if (printJobController2 != null) {
                    printJobController2.restart();
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 1: {
                final PrintJobController printJobController3 = this.printJobController;
                Object map = null;
                if (printJobController3 != null) {
                    final PrintJobInfoExt info = printJobController3.getInfo();
                    if (info != null) {
                        map = info.toMap();
                    }
                    o.success(map);
                    break;
                }
                o.success((Object)null);
                break;
            }
            case 0: {
                final PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 != null) {
                    printJobController4.cancel();
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
}

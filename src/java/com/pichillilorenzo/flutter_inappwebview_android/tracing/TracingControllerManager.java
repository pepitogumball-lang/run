package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import F0.l;
import F0.d;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import F0.k;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import F0.m;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;

public class TracingControllerManager implements Disposable
{
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static m tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;
    
    public TracingControllerManager(final InAppWebViewFlutterPlugin plugin) {
        this.plugin = plugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new p(plugin.messenger, "com.pichillilorenzo/flutter_inappwebview_tracingcontroller"));
    }
    
    public static k buildTracingConfig(final TracingSettings tracingSettings) {
        final ArrayList list = new ArrayList();
        final Iterator iterator = tracingSettings.categories.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (next instanceof String) {
                list.addAll((Collection)Arrays.asList((Object[])new String[] { (String)next }));
            }
            if (next instanceof Integer) {
                n |= (new int[] { (int)next })[0];
            }
        }
        final Integer tracingMode = tracingSettings.tracingMode;
        int intValue;
        if (tracingMode != null) {
            intValue = tracingMode;
        }
        else {
            intValue = 1;
        }
        return new k(list, n, intValue);
    }
    
    public static void init() {
        if (TracingControllerManager.tracingController == null && d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
            TracingControllerManager.tracingController = (m)l.a;
        }
    }
    
    @Override
    public void dispose() {
        final TracingControllerChannelDelegate channelDelegate = this.channelDelegate;
        if (channelDelegate != null) {
            channelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}

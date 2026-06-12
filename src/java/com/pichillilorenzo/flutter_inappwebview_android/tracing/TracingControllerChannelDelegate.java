package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import G0.c;
import java.util.concurrent.ExecutorService;
import java.util.ArrayList;
import G0.b;
import F0.k;
import java.util.concurrent.Executor;
import java.io.OutputStream;
import java.util.concurrent.Executors;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collection;
import G0.B;
import java.util.List;
import C2.d0;
import G0.z;
import G0.r;
import java.util.Map;
import F0.d;
import F4.o;
import F4.m;
import F4.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;

public class TracingControllerChannelDelegate extends ChannelDelegateImpl
{
    private TracingControllerManager tracingControllerManager;
    
    public TracingControllerChannelDelegate(final TracingControllerManager tracingControllerManager, final p p2) {
        super(p2);
        this.tracingControllerManager = tracingControllerManager;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }
    
    @Override
    public void onMethodCall(final m m, final o o) {
        TracingControllerManager.init();
        final F0.m tracingController = TracingControllerManager.tracingController;
        final String a = m.a;
        a.getClass();
        int n = -1;
        switch (a.hashCode()) {
            case 109757538: {
                if (!a.equals((Object)"start")) {
                    break;
                }
                n = 2;
                break;
            }
            case 3540994: {
                if (!a.equals((Object)"stop")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1647175624: {
                if (!a.equals((Object)"isTracing")) {
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
                if (tracingController == null || !d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    o.success((Object)Boolean.FALSE);
                    break;
                }
                final Map map = (Map)m.a("settings");
                final TracingSettings tracingSettings = new TracingSettings();
                tracingSettings.parse((Map<String, Object>)map);
                final k buildTracingConfig = TracingControllerManager.buildTracingConfig(tracingSettings);
                final r r = (r)tracingController;
                if (buildTracingConfig != null) {
                    final b a2 = z.A;
                    final boolean a3 = a2.a();
                    final ArrayList b = buildTracingConfig.b;
                    final int c = buildTracingConfig.c;
                    final int a4 = buildTracingConfig.a;
                    if (a3) {
                        if (r.a == null) {
                            r.a = d0.r();
                        }
                        d0.x(r.a, d0.q(d0.n(d0.o(d0.p(d0.m(), new int[] { a4 }), (List)b), c)));
                    }
                    else {
                        if (!((c)a2).b()) {
                            throw z.a();
                        }
                        if (r.b == null) {
                            r.b = B.a.getTracingController();
                        }
                        r.b.start(a4, (Collection)b, c);
                    }
                    o.success((Object)Boolean.TRUE);
                    break;
                }
                throw new IllegalArgumentException("Tracing config must be non null");
            }
            case 1: {
                if (tracingController != null && d.a("TRACING_CONTROLLER_BASIC_USAGE")) {
                    final String s = (String)m.a("filePath");
                    Object o2 = null;
                    Label_0421: {
                        Label_0419: {
                            if (s != null) {
                                Label_0540: {
                                    try {
                                        o2 = new FileOutputStream(s);
                                        break Label_0421;
                                    }
                                    catch (final FileNotFoundException ex) {
                                        break Label_0540;
                                    }
                                    break Label_0419;
                                }
                                final FileNotFoundException ex;
                                ((Throwable)ex).printStackTrace();
                                o.success((Object)Boolean.FALSE);
                                break;
                            }
                        }
                        o2 = null;
                    }
                    final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
                    final r r2 = (r)tracingController;
                    final b a5 = z.A;
                    boolean b2;
                    if (a5.a()) {
                        if (r2.a == null) {
                            r2.a = d0.r();
                        }
                        b2 = d0.A(r2.a, (FileOutputStream)o2, singleThreadExecutor);
                    }
                    else {
                        if (!((c)a5).b()) {
                            throw z.a();
                        }
                        if (r2.b == null) {
                            r2.b = B.a.getTracingController();
                        }
                        b2 = r2.b.stop((OutputStream)o2, (Executor)singleThreadExecutor);
                    }
                    o.success((Object)b2);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
            case 0: {
                if (tracingController != null) {
                    final r r3 = (r)tracingController;
                    final b a6 = z.A;
                    boolean b3;
                    if (a6.a()) {
                        if (r3.a == null) {
                            r3.a = d0.r();
                        }
                        b3 = d0.z(r3.a);
                    }
                    else {
                        if (!((c)a6).b()) {
                            throw z.a();
                        }
                        if (r3.b == null) {
                            r3.b = B.a.getTracingController();
                        }
                        b3 = r3.b.isTracing();
                    }
                    o.success((Object)b3);
                    break;
                }
                o.success((Object)Boolean.FALSE);
                break;
            }
        }
    }
}

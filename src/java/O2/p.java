package O2;

import android.app.Dialog;
import android.os.Handler;
import P1.u;
import com.google.android.gms.internal.ads.Op;
import java.util.Iterator;
import h2.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.ads.Rj;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Dq;
import com.google.android.gms.internal.ads.W4;
import android.net.Uri;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.internal.ads.D7;
import F1.y0;
import F1.J0;
import com.google.android.gms.internal.ads.La;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.W9;
import F1.B0;
import F1.C0;
import R4.V;
import T0.a;
import java.util.Set;
import java.util.Collections;
import f2.c;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.U;
import com.google.android.gms.internal.play_billing.D;
import java.util.concurrent.Future;
import com.google.android.gms.internal.auth.m;
import java.util.ArrayList;
import com.google.android.gms.internal.play_billing.q0;
import java.util.List;
import V4.G;
import h1.E;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.Activity;
import android.content.BroadcastReceiver;
import E.h;
import android.content.IntentFilter;
import f2.d;
import e2.e;
import android.content.DialogInterface$OnClickListener;
import h2.r;
import android.view.View;
import android.app.AlertDialog$Builder;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.content.DialogInterface$OnCancelListener;
import g2.g;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import h2.A;
import java.util.ArrayDeque;
import V2.q;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import I0.j;
import android.util.Log;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
import android.os.IBinder;
import d2.k;
import B5.w;
import g2.B;
import M2.f;
import com.google.android.gms.common.api.internal.zacm;
import e2.b;
import H1.n;
import java.util.Objects;
import g2.l;
import C2.x;

public final class p implements Runnable
{
    public final int C;
    public Object D = d;
    public final Object E = e;
    
    public p(final x e, final l d) {
        this.C = 18;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public p(final n e, final b d) {
        this.C = 15;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public p(final o e, final i d) {
        this.C = 0;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public p(final o e, final i d, final byte b) {
        this.C = 1;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public p(final zacm e, final f d) {
        this.C = 16;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public p(final f3.l e) {
        this.C = 14;
        this.E = e;
    }
    
    public p(final l e, final B d) {
        this.C = 17;
        Objects.requireNonNull((Object)e);
        this.E = e;
        this.D = d;
    }
    
    private final void a() {
        final k k = (k)this.D;
        final IBinder binder = (IBinder)this.E;
        final k i;
        monitorenter(i = k);
        Label_0040: {
            if (binder != null) {
                break Label_0040;
            }
            try {
                k.a(0, "Null service connection");
                monitorexit(i);
            }
            finally {
                monitorexit(i);
                try {
                    k.E = new com.google.android.gms.internal.auth.l(binder);
                    k.C = 2;
                    ((Executor)k.H.d).execute((Runnable)new d2.i(k, 0));
                    monitorexit(i);
                }
                catch (final RemoteException ex) {
                    k.a(0, ((Throwable)ex).getMessage());
                    monitorexit(i);
                }
            }
        }
    }
    
    private final void b() {
        final k k = (k)this.D;
        final int a = ((d2.l)this.E).a;
        final k i;
        synchronized (i = k) {
            final d2.l l = (d2.l)k.G.get(a);
            if (l != null) {
                final StringBuilder sb = new StringBuilder("Timing out request: ");
                sb.append(a);
                Log.w("MessengerIpcClient", sb.toString());
                k.G.remove(a);
                l.b((j)new Exception("Timed out waiting for response", (Throwable)null));
                k.c();
            }
            monitorexit(i);
        }
    }
    
    private final void c() {
        final Object i = ((ConstraintTrackingWorker)this.E).I;
        synchronized (i) {
            if (((ConstraintTrackingWorker)this.E).J) {
                ((ConstraintTrackingWorker)this.E).K.k(new Object());
            }
            else {
                ((ConstraintTrackingWorker)this.E).K.m((q)this.D);
            }
        }
    }
    
    private final void d() {
        try {
            this.f();
        }
        catch (final Error error) {
            final ArrayDeque d = ((f3.l)this.E).D;
            synchronized (d) {
                ((f3.l)this.E).E = 1;
                monitorexit(d);
                throw error;
            }
        }
    }
    
    private final void e() {
        final l l = (l)this.E;
        if (!l.D) {
            return;
        }
        final B b = (B)this.D;
        final b b2 = b.b;
        if (b2.D != 0 && b2.E != null) {
            final Object c = l.C;
            final Activity a = l.a();
            final PendingIntent e = b2.E;
            A.h((Object)e);
            final int a2 = b.a;
            final int d = GoogleApiActivity.D;
            final Intent intent = new Intent((Context)a, (Class)GoogleApiActivity.class);
            intent.putExtra("pending_intent", (Parcelable)e);
            intent.putExtra("failing_client_id", a2);
            intent.putExtra("notify_manager", false);
            ((g)c).startActivityForResult(intent, 1);
            return;
        }
        final Activity a3 = l.a();
        final int d2 = b2.D;
        final e g = l.G;
        if (((e2.f)g).b(d2, (Context)a3, (String)null) != null) {
            g.f(l.a(), (g)l.C, b2.D, (DialogInterface$OnCancelListener)l);
            return;
        }
        if (b2.D == 18) {
            final Activity a4 = l.a();
            final ProgressBar view = new ProgressBar((Context)a4, (AttributeSet)null, 16842874);
            view.setIndeterminate(true);
            ((View)view).setVisibility(0);
            final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)a4);
            alertDialog$Builder.setView((View)view);
            alertDialog$Builder.setMessage((CharSequence)r.b((Context)a4, 18));
            alertDialog$Builder.setPositiveButton((CharSequence)"", (DialogInterface$OnClickListener)null);
            final AlertDialog create = alertDialog$Builder.create();
            e.h(a4, create, "GooglePlayServicesUpdatingDialog", (DialogInterface$OnCancelListener)l);
            final Context applicationContext = ((Context)l.a()).getApplicationContext();
            final d d3 = new d(this, create);
            final IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            final g2.r r = new g2.r(d3);
            h.c(applicationContext, (BroadcastReceiver)r, intentFilter);
            r.a = applicationContext;
            if (!e2.i.c(applicationContext)) {
                final l i = (l)((p)d3.E).E;
                i.E.set((Object)null);
                final A2.b p = i.I.P;
                ((Handler)p).sendMessage(((Handler)p).obtainMessage(3));
                if (((Dialog)create).isShowing()) {
                    ((Dialog)create).dismiss();
                }
                final g2.r r2;
                monitorenter(r2 = r);
                Label_0454: {
                    try {
                        final Context a5 = r.a;
                        if (a5 != null) {
                            a5.unregisterReceiver((BroadcastReceiver)r);
                        }
                        break Label_0454;
                    }
                    finally {
                        monitorexit(r2);
                        r.a = null;
                        monitorexit(r2);
                    }
                }
            }
            return;
        }
        final int a6 = b.a;
        l.E.set((Object)null);
        l.I.g(b2, a6);
    }
    
    public void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: iconst_0       
        //     3: istore_1       
        //     4: iload_1        
        //     5: istore          4
        //     7: aload_0        
        //     8: getfield        O2/p.E:Ljava/lang/Object;
        //    11: checkcast       Lf3/l;
        //    14: getfield        f3/l.D:Ljava/util/ArrayDeque;
        //    17: astore          6
        //    19: iload_1        
        //    20: istore          4
        //    22: aload           6
        //    24: dup            
        //    25: astore          10
        //    27: monitorenter   
        //    28: iload_2        
        //    29: istore_3       
        //    30: iload_2        
        //    31: ifne            91
        //    34: aload_0        
        //    35: getfield        O2/p.E:Ljava/lang/Object;
        //    38: checkcast       Lf3/l;
        //    41: astore          7
        //    43: aload           7
        //    45: getfield        f3/l.E:I
        //    48: iconst_4       
        //    49: if_icmpne       71
        //    52: aload           10
        //    54: monitorexit    
        //    55: iload_1        
        //    56: ifeq            65
        //    59: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    62: invokevirtual   java/lang/Thread.interrupt:()V
        //    65: return         
        //    66: astore          7
        //    68: goto            271
        //    71: aload           7
        //    73: aload           7
        //    75: getfield        f3/l.F:J
        //    78: lconst_1       
        //    79: ladd           
        //    80: putfield        f3/l.F:J
        //    83: aload           7
        //    85: iconst_4       
        //    86: putfield        f3/l.E:I
        //    89: iconst_1       
        //    90: istore_3       
        //    91: aload_0        
        //    92: getfield        O2/p.E:Ljava/lang/Object;
        //    95: checkcast       Lf3/l;
        //    98: getfield        f3/l.D:Ljava/util/ArrayDeque;
        //   101: invokevirtual   java/util/ArrayDeque.poll:()Ljava/lang/Object;
        //   104: checkcast       Ljava/lang/Runnable;
        //   107: astore          7
        //   109: aload_0        
        //   110: aload           7
        //   112: putfield        O2/p.D:Ljava/lang/Object;
        //   115: aload           7
        //   117: ifnonnull       145
        //   120: aload_0        
        //   121: getfield        O2/p.E:Ljava/lang/Object;
        //   124: checkcast       Lf3/l;
        //   127: iconst_1       
        //   128: putfield        f3/l.E:I
        //   131: aload           10
        //   133: monitorexit    
        //   134: iload_1        
        //   135: ifeq            144
        //   138: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   141: invokevirtual   java/lang/Thread.interrupt:()V
        //   144: return         
        //   145: aload           10
        //   147: monitorexit    
        //   148: iload_1        
        //   149: istore          4
        //   151: invokestatic    java/lang/Thread.interrupted:()Z
        //   154: istore          5
        //   156: iload_1        
        //   157: iload           5
        //   159: ior            
        //   160: istore_1       
        //   161: aload_0        
        //   162: getfield        O2/p.D:Ljava/lang/Object;
        //   165: checkcast       Ljava/lang/Runnable;
        //   168: invokeinterface java/lang/Runnable.run:()V
        //   173: iload_1        
        //   174: istore          4
        //   176: aload_0        
        //   177: aconst_null    
        //   178: putfield        O2/p.D:Ljava/lang/Object;
        //   181: iload_3        
        //   182: istore_2       
        //   183: goto            4
        //   186: astore          6
        //   188: goto            280
        //   191: astore          6
        //   193: goto            257
        //   196: astore          8
        //   198: getstatic       f3/l.H:Ljava/util/logging/Logger;
        //   201: astore          7
        //   203: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   206: astore          6
        //   208: new             Ljava/lang/StringBuilder;
        //   211: astore          9
        //   213: aload           9
        //   215: invokespecial   java/lang/StringBuilder.<init>:()V
        //   218: aload           9
        //   220: ldc_w           "Exception while executing runnable "
        //   223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: pop            
        //   227: aload           9
        //   229: aload_0        
        //   230: getfield        O2/p.D:Ljava/lang/Object;
        //   233: checkcast       Ljava/lang/Runnable;
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   239: pop            
        //   240: aload           7
        //   242: aload           6
        //   244: aload           9
        //   246: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   249: aload           8
        //   251: invokevirtual   java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   254: goto            173
        //   257: iload_1        
        //   258: istore          4
        //   260: aload_0        
        //   261: aconst_null    
        //   262: putfield        O2/p.D:Ljava/lang/Object;
        //   265: iload_1        
        //   266: istore          4
        //   268: aload           6
        //   270: athrow         
        //   271: aload           10
        //   273: monitorexit    
        //   274: iload_1        
        //   275: istore          4
        //   277: aload           7
        //   279: athrow         
        //   280: iload           4
        //   282: ifeq            291
        //   285: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   288: invokevirtual   java/lang/Thread.interrupt:()V
        //   291: aload           6
        //   293: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      19     186    294    Any
        //  22     28     186    294    Any
        //  34     55     66     280    Any
        //  71     89     66     280    Any
        //  91     115    66     280    Any
        //  120    134    66     280    Any
        //  145    148    66     280    Any
        //  151    156    186    294    Any
        //  161    173    196    257    Ljava/lang/RuntimeException;
        //  161    173    191    271    Any
        //  176    181    186    294    Any
        //  198    254    191    271    Any
        //  260    265    186    294    Any
        //  268    271    186    294    Any
        //  271    274    66     280    Any
        //  277    280    186    294    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0173:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void run() {
        h2.h interface1 = null;
        final Bundle bundle = null;
        switch (this.C) {
            default: {
                final h1.b b = (h1.b)this.D;
                b.getClass();
                b.C((E4.b)this.E, h1.E.l, 24, (Exception)null);
                return;
            }
            case 28: {
                final h1.b b2 = (h1.b)this.D;
                b2.getClass();
                final h1.f l = h1.E.l;
                b2.H(24, 13, l);
                ((E4.b)this.E).f(l);
                return;
            }
            case 27: {
                final h1.b b3 = (h1.b)this.D;
                b3.getClass();
                final h1.f i = h1.E.l;
                b3.H(24, 3, i);
                ((E4.b)this.E).b(i);
                return;
            }
            case 26: {
                final h1.b b4 = (h1.b)this.D;
                b4.getClass();
                b4.G((E4.b)this.E, h1.E.l, 24, (Exception)null);
                return;
            }
            case 25: {
                final h1.b b5 = (h1.b)this.D;
                final h1.f f = (h1.f)this.E;
                if (b5.e.c != null) {
                    ((G)b5.e.c).u(f, (List)null);
                }
                else {
                    q0.g("BillingClient", "No valid listener is set in BroadcastManager");
                }
                return;
            }
            case 24: {
                final h1.b b6 = (h1.b)this.D;
                final h1.f j = h1.E.l;
                b6.H(24, 7, j);
                ((L3.g)this.E).a(j, new ArrayList());
                return;
            }
            case 23: {
                final h1.b b7 = (h1.b)this.D;
                b7.getClass();
                final h1.f k = h1.E.l;
                b7.H(24, 11, k);
                ((E4.b)this.E).i(k, (ArrayList)null);
                return;
            }
            case 22: {
                final h1.b b8 = (h1.b)this.D;
                b8.getClass();
                final h1.f m = h1.E.l;
                b8.H(24, 4, m);
                ((L4.h)((E4.b)this.E).D).success((Object)com.google.android.gms.internal.auth.m.m(m));
                return;
            }
            case 21: {
                final Future future = (Future)this.D;
                if (!future.isDone() && !future.isCancelled()) {
                    future.cancel(true);
                    q0.g("BillingClient", "Async task is taking too long, cancel it!");
                    final Runnable runnable = (Runnable)this.E;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                return;
            }
            case 20: {
                final h1.b b9 = (h1.b)this.D;
                b9.getClass();
                b9.A((E4.b)this.E, h1.E.l, 24, (Exception)null);
                return;
            }
            case 19: {
                final h1.b b10 = (h1.b)this.D;
                b10.getClass();
                final h1.f l2 = h1.E.l;
                b10.H(24, 9, l2);
                final com.google.android.gms.internal.play_billing.A d = com.google.android.gms.internal.play_billing.D.D;
                ((E4.b)this.E).j(l2, (List)U.G);
                return;
            }
            case 18: {
                final x x = (x)this.E;
                final int b11 = x.b;
                final l l3 = (l)this.D;
                if (b11 > 0) {
                    final Bundle bundle2 = (Bundle)x.c;
                    Bundle bundle3 = bundle;
                    if (bundle2 != null) {
                        bundle3 = bundle2.getBundle("ConnectionlessLifecycleHelper");
                    }
                    l3.b(bundle3);
                }
                if (x.b >= 2) {
                    l3.D = true;
                    l3.d();
                }
                if (x.b >= 3) {
                    l3.d();
                }
                if (x.b >= 4) {
                    l3.c();
                }
                return;
            }
            case 17: {
                this.e();
                return;
            }
            case 16: {
                final zacm zacm = (zacm)this.E;
                zacm.getClass();
                final f f2 = (f)this.D;
                final b d2 = f2.D;
                Label_0976: {
                    if (d2.h()) {
                        final v e = f2.E;
                        A.h((Object)e);
                        final b e2 = e.E;
                        if (!e2.h()) {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf((Object)e2)), (Throwable)new Exception());
                            zacm.I.b(e2);
                            zacm.H.f();
                            return;
                        }
                        final n i2 = zacm.I;
                        final IBinder d3 = e.D;
                        if (d3 != null) {
                            interface1 = IAccountAccessor$Stub.asInterface(d3);
                        }
                        i2.getClass();
                        if (interface1 != null) {
                            final Set f3 = zacm.F;
                            if (f3 != null) {
                                i2.F = interface1;
                                i2.G = f3;
                                if (i2.C) {
                                    ((h2.d)i2.D).k(interface1, f3);
                                }
                                break Label_0976;
                            }
                        }
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", (Throwable)new Exception());
                        i2.b(new b(4));
                    }
                    else {
                        zacm.I.b(d2);
                    }
                }
                zacm.H.f();
                return;
            }
            case 15: {
                final n n = (n)this.E;
                final g2.o o = (g2.o)((g2.e)n.H).L.get((Object)n.E);
                if (o != null) {
                    final b b12 = (b)this.D;
                    if (b12.h()) {
                        n.C = true;
                        final c c = (c)n.D;
                        if (!c.c()) {
                            try {
                                final h2.g g = (h2.g)c;
                                Set set;
                                if (g.c()) {
                                    set = g.z;
                                }
                                else {
                                    set = Collections.emptySet();
                                }
                                ((h2.d)c).k((h2.h)null, set);
                            }
                            catch (final SecurityException ex) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", (Throwable)ex);
                                c.a("Failed to get service from broker.");
                                o.k(new b(10), (RuntimeException)null);
                            }
                        }
                        else if (n.C) {
                            final h2.h h = (h2.h)n.F;
                            if (h != null) {
                                ((h2.d)c).k(h, (Set)n.G);
                            }
                        }
                    }
                    else {
                        o.k(b12, (RuntimeException)null);
                    }
                }
                return;
            }
            case 14: {
                this.d();
                return;
            }
            case 13: {
                this.c();
                return;
            }
            case 12: {
                this.b();
                return;
            }
            case 11: {
                this.a();
                return;
            }
            case 10: {
                final b1.i i3 = (b1.i)this.D;
                try {
                    ((Runnable)this.E).run();
                }
                finally {
                    i3.a();
                }
            }
            case 9: {
                for (final X0.b b13 : (ArrayList)this.D) {
                    final Object e3 = ((Y0.d)this.E).e;
                    b13.b = e3;
                    b13.d(b13.d, e3);
                }
                return;
            }
            case 8: {
                final R0.m e4 = R0.m.e();
                final String d4 = a.d;
                final a1.i i4 = (a1.i)this.D;
                e4.c(d4, m0.a.f("Scheduling work ", i4.a), new Throwable[0]);
                ((a)this.E).a.d(i4);
                return;
            }
            case 7: {
                final Object o2 = this.D;
                final V v = (V)this.E;
                final C0 e5 = C0.e();
                final Object a;
                monitorenter(a = e5.a);
                Label_1424: {
                    try {
                        if (e5.c) {
                            e5.b.add((Object)v);
                            monitorexit(a);
                            return;
                        }
                        break Label_1424;
                    }
                    finally {
                        monitorexit(a);
                        while (true) {
                            v.a(e5.d());
                            monitorexit(a);
                            return;
                            iftrue(Label_1446:)(!e5.d);
                            continue;
                        }
                        while (true) {
                            final Object e6;
                            monitorenter(e6 = e5.e);
                            try {
                                Label_1620: {
                                    try {
                                        e5.c((Context)o2);
                                        e5.f.F2((W9)new B0((Object)e5, 0));
                                        e5.f.C0((La)new zzbok());
                                        final y1.p h2 = e5.h;
                                        if (h2.a == -1) {
                                            if (h2.b == -1) {
                                                break Label_1620;
                                            }
                                        }
                                        try {
                                            e5.f.J1(new J0(h2));
                                            break Label_1620;
                                        }
                                        catch (final RemoteException ex2) {
                                            J1.j.g("Unable to set request configuration parcel.", (Throwable)ex2);
                                            break Label_1620;
                                        }
                                    }
                                    finally {
                                        monitorexit(e6);
                                    Label_1779_Outer:
                                        while (true) {
                                            ((Executor)J1.c.b).execute((Runnable)new y0(e5, (Context)o2, 1));
                                            while (true) {
                                                break Label_1779;
                                                D7.a((Context)o2);
                                                iftrue(Label_1698:)(!(boolean)d8.a.p() || !(boolean)F1.q.d.c.a(D7.Ra));
                                                J1.j.d("Initializing on bg thread");
                                                J1.c.a.execute((Runnable)new y0(e5, (Context)o2, 0));
                                                monitorexit(e6);
                                                return;
                                                Label_1768: {
                                                    J1.j.d("Initializing on calling thread");
                                                }
                                                e5.b((Context)o2);
                                                continue;
                                            }
                                            Label_1698: {
                                                iftrue(Label_1768:)(!(boolean)d8.b.p() || !(boolean)F1.q.d.c.a(D7.Ra));
                                            }
                                            continue Label_1779_Outer;
                                        }
                                    }
                                }
                            }
                            catch (final RemoteException ex3) {}
                            throw new IllegalArgumentException("Context cannot be null.");
                            Label_1446: {
                                e5.c = true;
                            }
                            e5.b.add((Object)v);
                            monitorexit(a);
                            iftrue(Label_1788:)(o2 == null);
                            continue;
                        }
                        Label_1788: {
                            throw new IllegalArgumentException("Context cannot be null.");
                        }
                    }
                }
            }
            case 6: {
                ((F4.p)((c2.k)this.E).F).a("onAdEvent", (Object)this.D, (F4.o)null);
                return;
            }
            case 5: {
                final P1.a a2 = (P1.a)this.D;
                Uri uri = Uri.parse((String)this.E);
                Label_1957: {
                    Label_1937: {
                        try {
                            if (F1.q.d.c.a(D7.Ib)) {
                                final Op d5 = a2.d;
                                if (d5 != null) {
                                    uri = d5.a(uri, a2.a, (View)a2.b, (Activity)null);
                                    break Label_1957;
                                }
                            }
                        }
                        catch (final W4 w4) {
                            break Label_1937;
                        }
                        uri = a2.c.a(uri, a2.a, (View)a2.b, (Activity)null);
                        break Label_1957;
                    }
                    final W4 w4;
                    J1.j.e("Failed to append the click signal to URL: ", (Throwable)w4);
                    E1.o.B.g.h("TaggingLibraryJsInterface.recordClick", (Throwable)w4);
                }
                a2.i.b(uri.toString(), (C2.b)null, (Dq)null);
                return;
            }
            case 4: {
                final P1.q q = (P1.q)this.D;
                final P1.p p = (P1.p)this.E;
                final P1.j c2 = q.C;
                final String e7 = q.E;
                c2.getClass();
                if (!TextUtils.isEmpty((CharSequence)e7)) {
                    if (!c2.b()) {
                        Object string = new JSONObject();
                        Label_2183: {
                            Label_2178: {
                                Label_2164: {
                                    String c3;
                                    try {
                                        final JSONObject jsonObject = new JSONObject();
                                        jsonObject.put("params", (Object)p.a);
                                        jsonObject.put("signal_dictionary", (Object)F1.p.f.a.i(p.f));
                                        ((JSONObject)string).put("sr", (Object)jsonObject);
                                        c3 = p.c;
                                        if (TextUtils.isEmpty((CharSequence)c3)) {
                                            string = "";
                                            break Label_2183;
                                        }
                                    }
                                    catch (final JSONException ex4) {
                                        break Label_2164;
                                    }
                                    ((JSONObject)string).put("rs", (Object)Base64.encodeToString(P1.j.a(c3).getBytes(StandardCharsets.UTF_8), 10));
                                    E1.o.B.j.getClass();
                                    ((JSONObject)string).put("ts_ms", System.currentTimeMillis());
                                    break Label_2178;
                                }
                                final JSONException ex4;
                                E1.o.B.g.h("DiskCachingManager.createStringToWrite", (Throwable)ex4);
                            }
                            string = ((JSONObject)string).toString();
                        }
                        if (!TextUtils.isEmpty((CharSequence)string)) {
                            final u b14 = c2.b;
                            b14.e();
                            final Object d6 = b14.d;
                            synchronized (d6) {
                                b14.b.putString(e7, (String)string).commit();
                            }
                        }
                    }
                }
                return;
            }
            case 3: {
                zzau.zzH((zzau)this.D, (Rj[])this.E);
                return;
            }
            case 2: {
                final t t = (t)this.D;
                final Exception ex6;
                Label_2314: {
                    try {
                        t.o(((Callable)this.E).call());
                        return;
                    }
                    catch (final Exception ex5) {
                        break Label_2314;
                    }
                    t.q((Exception)new RuntimeException((Throwable)ex6));
                    return;
                }
                t.q(ex6);
                return;
            }
            case 1: {
                final o o3 = (o)this.E;
                Label_2412: {
                    try {
                        final t s = ((O2.h)o3.E).s(((i)this.D).g());
                        if (s == null) {
                            o3.f((Exception)new NullPointerException("Continuation returned null"));
                        }
                        else {
                            final s b15 = O2.k.b;
                            s.d((Executor)b15, (O2.f)o3);
                            s.c((Executor)b15, (O2.e)o3);
                            s.a((Executor)b15, o3);
                        }
                    }
                    catch (final Exception ex7) {
                        break Label_2412;
                    }
                    catch (final O2.g g2) {
                        if (((Throwable)g2).getCause() instanceof Exception) {
                            o3.f((Exception)((Throwable)g2).getCause());
                            return;
                        }
                        o3.f((Exception)g2);
                        final Exception ex7;
                        o3.f(ex7);
                    }
                    catch (final CancellationException ex8) {}
                }
                return;
            }
            case 0: {
                final o o4 = (o)this.E;
                final Object e8;
                monitorenter(e8 = o4.E);
                Label_2511: {
                    try {
                        final O2.f f4 = (O2.f)o4.F;
                        if (f4 != null) {
                            f4.e(((i)this.D).g());
                        }
                        break Label_2511;
                    }
                    finally {
                        monitorexit(e8);
                        monitorexit(e8);
                        return;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 14: {
                final Runnable runnable = (Runnable)this.D;
                String s;
                if (runnable != null) {
                    final StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                    sb.append((Object)runnable);
                    sb.append("}");
                    s = sb.toString();
                }
                else {
                    final StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                    final int e = ((f3.l)this.E).E;
                    String s2;
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                if (e != 4) {
                                    s2 = "null";
                                }
                                else {
                                    s2 = "RUNNING";
                                }
                            }
                            else {
                                s2 = "QUEUED";
                            }
                        }
                        else {
                            s2 = "QUEUING";
                        }
                    }
                    else {
                        s2 = "IDLE";
                    }
                    sb2.append(s2);
                    sb2.append("}");
                    s = sb2.toString();
                }
                return s;
            }
        }
    }
}

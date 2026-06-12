package h1;

import com.google.android.gms.internal.play_billing.i1;
import android.app.Activity;
import com.google.android.gms.internal.play_billing.S0;
import java.util.AbstractCollection;
import com.google.android.gms.internal.play_billing.h1;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.X1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.Y1;
import C2.x;
import com.google.android.gms.internal.play_billing.U1;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.content.pm.ServiceInfo;
import android.util.Log;
import android.content.pm.ResolveInfo;
import android.content.ServiceConnection;
import android.content.ComponentName;
import java.util.Objects;
import K2.c0;
import com.google.android.gms.internal.ads.Fl;
import java.util.List;
import com.google.android.gms.internal.play_billing.U;
import android.os.BaseBundle;
import com.google.android.gms.internal.play_billing.N0;
import java.util.Iterator;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.content.Intent;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.f1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.internal.play_billing.r;
import java.util.function.Function;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.O0;
import com.google.android.gms.internal.play_billing.a;
import java.util.Arrays;
import android.os.Bundle;
import java.util.HashSet;
import java.util.function.Predicate;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.D;
import java.util.Collection;
import java.util.ArrayList;
import H1.n;
import io.flutter.embedding.android.FlutterActivity;
import B5.w;
import C2.j;
import android.text.TextUtils;
import F1.E0;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.W1;
import L4.h;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.play_billing.d2;
import L3.g;
import V4.G;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.e2;
import java.util.Random;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.f;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.play_billing.A0;
import java.util.concurrent.ExecutorService;

public class b
{
    public final X2.b A;
    public final boolean B;
    public ExecutorService C;
    public volatile A0 D;
    public final Long E;
    public final Object a;
    public volatile int b;
    public final String c;
    public final Handler d;
    public volatile F e;
    public final Context f;
    public final m g;
    public volatile f h;
    public volatile p i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public b(final X2.b a, final Context context) {
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.l = 0;
        final long nextLong = new Random().nextLong();
        this.E = nextLong;
        this.c = p();
        this.f = context.getApplicationContext();
        final d2 r = e2.r();
        final String p2 = p();
        ((h1)r).e();
        e2.q((e2)((h1)r).D, p2);
        final String packageName = this.f.getPackageName();
        ((h1)r).e();
        e2.p((e2)((h1)r).D, packageName);
        ((h1)r).e();
        e2.o((e2)((h1)r).D, nextLong);
        this.g = new m(this.f, (e2)((h1)r).b());
        q0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.e = new F(this.f, null, null, this.g);
        this.A = a;
        this.f.getPackageName();
    }
    
    public b(final X2.b a, final Context context, final G g) {
        final String p3 = p();
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.l = 0;
        final long nextLong = new Random().nextLong();
        this.E = nextLong;
        this.c = p3;
        this.f = context.getApplicationContext();
        final d2 r = e2.r();
        ((h1)r).e();
        e2.q((e2)((h1)r).D, p3);
        final String packageName = this.f.getPackageName();
        ((h1)r).e();
        e2.p((e2)((h1)r).D, packageName);
        ((h1)r).e();
        e2.o((e2)((h1)r).D, nextLong);
        this.g = new m(this.f, (e2)((h1)r).b());
        if (g == null) {
            q0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.e = new F(this.f, g, null, this.g);
        this.A = a;
        this.B = false;
        this.f.getPackageName();
    }
    
    public b(final X2.b a, final Context context, final G g, final g g2) {
        final String p4 = p();
        this.a = new Object();
        boolean b = false;
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.l = 0;
        final long nextLong = new Random().nextLong();
        this.E = nextLong;
        this.c = p4;
        this.f = context.getApplicationContext();
        final d2 r = e2.r();
        ((h1)r).e();
        e2.q((e2)((h1)r).D, p4);
        final String packageName = this.f.getPackageName();
        ((h1)r).e();
        e2.p((e2)((h1)r).D, packageName);
        ((h1)r).e();
        e2.o((e2)((h1)r).D, nextLong);
        this.g = new m(this.f, (e2)((h1)r).b());
        if (g == null) {
            q0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.e = new F(this.f, g, g2, this.g);
        this.A = a;
        if (g2 != null) {
            b = true;
        }
        this.B = b;
    }
    
    public b(final Context context) {
        this.a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.l = 0;
        final long nextLong = new Random().nextLong();
        this.E = nextLong;
        final String p = p();
        this.c = p;
        this.f = context.getApplicationContext();
        final d2 r = e2.r();
        ((h1)r).e();
        e2.q((e2)((h1)r).D, p);
        final String packageName = this.f.getPackageName();
        ((h1)r).e();
        e2.p((e2)((h1)r).D, packageName);
        ((h1)r).e();
        e2.o((e2)((h1)r).D, nextLong);
        this.g = new m(this.f, (e2)((h1)r).b());
        this.f.getPackageName();
    }
    
    public static Future m(final Callable callable, final long n, final Runnable runnable, final Handler handler, final ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed((Runnable)new O2.p((Object)submit, 21, (Object)runnable), (long)(n * 0.95));
            return submit;
        }
        catch (final Exception ex) {
            q0.h("BillingClient", "Async task throws exception!", (Throwable)ex);
            return null;
        }
    }
    
    public static String p() {
        try {
            return (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object)null);
        }
        catch (final Exception ex) {
            return "7.1.1";
        }
    }
    
    public final void A(final E4.b b, final h1.f f, final int n, final Exception ex) {
        this.I(n, 14, f, h1.C.a(ex));
        ((h)b.D).success((Object)com.google.android.gms.internal.auth.m.m(f));
    }
    
    public final void B(final E4.b b, final h1.f f, final int n, final String s, final Exception ex) {
        q0.h("BillingClient", s, (Throwable)ex);
        this.I(n, 4, f, h1.C.a(ex));
        ((h)b.D).success((Object)com.google.android.gms.internal.auth.m.m(f));
    }
    
    public final void C(final E4.b b, final h1.f f, final int n, final Exception ex) {
        this.I(n, 15, f, h1.C.a(ex));
        b.e(f);
    }
    
    public final Handler D() {
        Handler d;
        if (Looper.myLooper() == null) {
            d = this.d;
        }
        else {
            d = new Handler(Looper.myLooper());
        }
        return d;
    }
    
    public final h1.f E() {
        q0.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        final V1 q = W1.q();
        ((h1)q).e();
        W1.p((W1)((h1)q).D, 6);
        final r2 o = s2.o();
        ((h1)o).e();
        s2.n((s2)((h1)o).D);
        ((h1)q).e();
        W1.o((W1)((h1)q).D, (s2)((h1)o).b());
        this.s((W1)((h1)q).b());
        return h1.E.j;
    }
    
    public final void F(final E4.b b, final h1.f f, final int n, final Exception ex) {
        q0.h("BillingClient", "getBillingConfig got an exception.", (Throwable)ex);
        this.I(n, 13, f, h1.C.a(ex));
        b.f(f);
    }
    
    public final void G(final E4.b b, final h1.f f, final int n, final Exception ex) {
        this.I(n, 16, f, h1.C.a(ex));
        ((L4.g)b.D).success((Object)com.google.android.gms.internal.auth.m.m(f));
    }
    
    public final void H(final int n, final int n2, final h1.f f) {
        try {
            this.r(h1.C.b(n, n2, f));
        }
        finally {
            final Throwable t;
            q0.h("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void I(final int n, final int n2, final h1.f f, final String s) {
        try {
            this.r(h1.C.c(n, n2, f, s));
        }
        finally {
            final Throwable t;
            q0.h("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void J(final int n) {
        try {
            this.s(h1.C.d(n));
        }
        finally {
            final Throwable t;
            q0.h("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void K(final h1.f f) {
        if (Thread.interrupted()) {
            return;
        }
        this.d.post((Runnable)new O2.p((Object)this, 25, (Object)f));
    }
    
    public void a(final E0 e0, final E4.b b) {
        if (!this.g()) {
            final h1.f k = h1.E.k;
            this.H(2, 3, k);
            b.b(k);
            return;
        }
        if (TextUtils.isEmpty((CharSequence)e0.a)) {
            q0.g("BillingClient", "Please provide a valid purchase token.");
            final h1.f h = h1.E.h;
            this.H(26, 3, h);
            b.b(h);
            return;
        }
        if (!this.o) {
            final h1.f b2 = h1.E.b;
            this.H(27, 3, b2);
            b.b(b2);
            return;
        }
        if (m((Callable)new j((Object)this, (Object)b, (Object)e0, 10), 30000L, (Runnable)new O2.p((Object)this, 27, (Object)b), this.D(), this.q()) == null) {
            final h1.f n = this.n();
            this.H(25, 3, n);
            b.b(n);
        }
    }
    
    public void b(final w w, final E4.b b) {
        final boolean g = this.g();
        final h h = (h)b.D;
        if (!g) {
            final h1.f k = h1.E.k;
            this.H(2, 4, k);
            h.success((Object)com.google.android.gms.internal.auth.m.m(k));
            return;
        }
        if (m((Callable)new j((Object)this, (Object)w, (Object)b, 5), 30000L, (Runnable)new O2.p(this, b, w), this.D(), this.q()) == null) {
            final h1.f n = this.n();
            this.H(25, 4, n);
            h.success((Object)com.google.android.gms.internal.auth.m.m(n));
        }
    }
    
    public final void c(final E4.b b) {
        if (!this.g()) {
            this.C(b, h1.E.k, 2, null);
            return;
        }
        if (!this.x) {
            q0.g("BillingClient", "Current client doesn't support alternative billing only.");
            this.C(b, h1.E.C, 66, null);
            return;
        }
        if (m((Callable)new E1.f((Object)this, 9, (Object)b), 30000L, (Runnable)new O2.p((Object)this, 29, (Object)b), this.D(), this.q()) == null) {
            this.C(b, this.n(), 25, null);
        }
    }
    
    public void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: bipush          12
        //     3: invokevirtual   h1/b.J:(I)V
        //     6: aload_0        
        //     7: getfield        h1/b.a:Ljava/lang/Object;
        //    10: astore_1       
        //    11: aload_1        
        //    12: dup            
        //    13: astore          5
        //    15: monitorenter   
        //    16: aload_0        
        //    17: getfield        h1/b.e:Lh1/F;
        //    20: ifnull          76
        //    23: aload_0        
        //    24: getfield        h1/b.e:Lh1/F;
        //    27: astore_3       
        //    28: aload_3        
        //    29: getfield        h1/F.f:Ljava/lang/Object;
        //    32: checkcast       LK2/X;
        //    35: astore_2       
        //    36: aload_3        
        //    37: getfield        h1/F.b:Ljava/lang/Object;
        //    40: checkcast       Landroid/content/Context;
        //    43: astore          4
        //    45: aload_2        
        //    46: aload           4
        //    48: invokevirtual   K2/X.c:(Landroid/content/Context;)V
        //    51: aload_3        
        //    52: getfield        h1/F.g:Ljava/lang/Object;
        //    55: checkcast       LK2/X;
        //    58: aload           4
        //    60: invokevirtual   K2/X.c:(Landroid/content/Context;)V
        //    63: goto            76
        //    66: astore_2       
        //    67: ldc             "BillingClient"
        //    69: ldc_w           "There was an exception while shutting down broadcast manager while ending connection!"
        //    72: aload_2        
        //    73: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //    76: ldc             "BillingClient"
        //    78: ldc_w           "Unbinding from service."
        //    81: invokestatic    com/google/android/gms/internal/play_billing/q0.f:(Ljava/lang/String;Ljava/lang/String;)V
        //    84: aload_0        
        //    85: invokevirtual   h1/b.u:()V
        //    88: goto            101
        //    91: astore_2       
        //    92: ldc             "BillingClient"
        //    94: ldc_w           "There was an exception while unbinding from the service while ending connection!"
        //    97: aload_2        
        //    98: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   101: aload_0        
        //   102: dup            
        //   103: astore          6
        //   105: monitorenter   
        //   106: aload_0        
        //   107: getfield        h1/b.C:Ljava/util/concurrent/ExecutorService;
        //   110: astore_2       
        //   111: aload_2        
        //   112: ifnull          132
        //   115: aload_2        
        //   116: invokeinterface java/util/concurrent/ExecutorService.shutdownNow:()Ljava/util/List;
        //   121: pop            
        //   122: aload_0        
        //   123: aconst_null    
        //   124: putfield        h1/b.C:Ljava/util/concurrent/ExecutorService;
        //   127: aload_0        
        //   128: aconst_null    
        //   129: putfield        h1/b.D:Lcom/google/android/gms/internal/play_billing/A0;
        //   132: aload           6
        //   134: monitorexit    
        //   135: goto            142
        //   138: astore_2       
        //   139: goto            154
        //   142: aload_0        
        //   143: iconst_3       
        //   144: invokevirtual   h1/b.t:(I)V
        //   147: goto            172
        //   150: astore_2       
        //   151: goto            184
        //   154: aload           6
        //   156: monitorexit    
        //   157: aload_2        
        //   158: athrow         
        //   159: astore_2       
        //   160: ldc             "BillingClient"
        //   162: ldc_w           "There was an exception while shutting down the executor service while ending connection!"
        //   165: aload_2        
        //   166: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   169: goto            142
        //   172: aload           5
        //   174: monitorexit    
        //   175: return         
        //   176: astore_2       
        //   177: aload_0        
        //   178: iconst_3       
        //   179: invokevirtual   h1/b.t:(I)V
        //   182: aload_2        
        //   183: athrow         
        //   184: aload           5
        //   186: monitorexit    
        //   187: aload_2        
        //   188: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  16     63     66     76     Any
        //  67     76     150    189    Any
        //  76     88     91     101    Any
        //  92     101    150    189    Any
        //  101    106    159    184    Any
        //  106    111    138    159    Any
        //  115    132    138    159    Any
        //  132    135    159    184    Any
        //  142    147    150    189    Any
        //  154    157    138    159    Any
        //  157    159    159    184    Any
        //  160    169    176    184    Any
        //  172    175    150    189    Any
        //  177    184    150    189    Any
        //  184    187    150    189    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
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
    
    public final void e(final E4.b b) {
        if (!this.g()) {
            q0.g("BillingClient", "Service disconnected.");
            final h1.f k = h1.E.k;
            this.H(2, 13, k);
            b.f(k);
            return;
        }
        if (!this.u) {
            q0.g("BillingClient", "Current client doesn't support get billing config.");
            final h1.f y = h1.E.y;
            this.H(32, 13, y);
            b.f(y);
            return;
        }
        if (m((Callable)new E1.f((Object)this, 8, (Object)b), 30000L, (Runnable)new O2.p((Object)this, 28, (Object)b), this.D(), this.q()) == null) {
            final h1.f n = this.n();
            this.H(25, 13, n);
            b.f(n);
        }
    }
    
    public final void f(final E4.b b) {
        if (!this.g()) {
            this.A(b, h1.E.k, 2, null);
            return;
        }
        if (!this.x) {
            q0.g("BillingClient", "Current client doesn't support alternative billing only.");
            this.A(b, h1.E.C, 66, null);
            return;
        }
        if (m((Callable)new E1.f((Object)this, 7, (Object)b), 30000L, (Runnable)new O2.p((Object)this, 20, (Object)b), this.D(), this.q()) == null) {
            this.A(b, this.n(), 25, null);
        }
    }
    
    public final boolean g() {
        final Object a;
        monitorenter(a = this.a);
        Label_0054: {
            try {
                final int b = this.b;
                boolean b3;
                final boolean b2 = b3 = false;
                if (b != 2) {
                    break Label_0054;
                }
                b3 = b2;
                if (this.h == null) {
                    break Label_0054;
                }
                b3 = b2;
                if (this.i != null) {
                    b3 = true;
                }
                break Label_0054;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
                return;
            }
        }
    }
    
    public h1.f h(FlutterActivity ex, n ex2) {
        Object a = "BUY_INTENT";
        Label_2782: {
            if (this.e == null || this.e.c == null) {
                break Label_2782;
            }
            if (!this.g()) {
                final h1.f k = h1.E.k;
                this.H(2, 2, k);
                this.K(k);
                return k;
            }
            final ArrayList list = new ArrayList();
            list.addAll((Collection)((n)ex2).H);
            final D d = (D)((n)ex2).G;
            final Iterator iterator = list.iterator();
            Object next;
            if (iterator.hasNext()) {
                next = iterator.next();
            }
            else {
                next = null;
            }
            Label_2774: {
                if (next != null) {
                    break Label_2774;
                }
                final A a2 = (A)d.iterator();
                Object next2;
                if (a2.hasNext()) {
                    next2 = a2.next();
                }
                else {
                    next2 = null;
                }
                c c = (c)next2;
                final h1.j a3 = c.a;
                final String c2 = a3.c;
                final String d2 = a3.d;
                if (d2.equals((Object)"subs") && !this.j) {
                    q0.g("BillingClient", "Current client doesn't support subscriptions.");
                    final h1.f m = h1.E.m;
                    this.H(9, 2, m);
                    this.K(m);
                    return m;
                }
                Label_2747: {
                    Label_0312: {
                        if (((n)ex2).D == null && ((n)ex2).E == null) {
                            final e e = (e)((n)ex2).F;
                            e.getClass();
                            if (e.a == 0 && !((Collection)((n)ex2).G).stream().anyMatch((Predicate)new Object()) && !((n)ex2).C) {
                                break Label_0312;
                            }
                        }
                        if (!this.m) {
                            break Label_2747;
                        }
                    }
                    if (list.size() > 1 && !this.s) {
                        q0.g("BillingClient", "Current client doesn't support multi-item purchases.");
                        final h1.f r = h1.E.r;
                        this.H(19, 2, r);
                        this.K(r);
                        return r;
                    }
                    if (!((List)d).isEmpty() && !this.t) {
                        q0.g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                        final h1.f t = h1.E.t;
                        this.H(20, 2, t);
                        this.K(t);
                        return t;
                    }
                    h1.f f = null;
                    Label_0926: {
                        if (((AbstractCollection)((n)ex2).G).isEmpty()) {
                            f = h1.E.j;
                            a = "BUY_INTENT";
                        }
                        else {
                            final c c3 = (c)((List)((n)ex2).G).get(0);
                            int i = 1;
                            Object o = a;
                            while (i < ((AbstractCollection)((n)ex2).G).size()) {
                                final Object o2 = ((List)((n)ex2).G).get(i);
                                final String c4 = ((c)o2).a().c();
                                final h1.j a4 = c3.a();
                                a = o;
                                if (!c4.equals((Object)a4.c()) && !((c)o2).a().c().equals((Object)"play_pass_subs")) {
                                    f = h1.E.a(5, "All products should have same ProductType.");
                                    break Label_0926;
                                }
                                ++i;
                                o = a;
                            }
                            a = o;
                            final String d3 = c3.a().d();
                            final Object o2 = new HashSet();
                            final HashSet set = new HashSet();
                            final D d4 = (D)((n)ex2).G;
                            i = ((List)d4).size();
                            for (int j = 0; j < i; ++j) {
                                final c c5 = (c)((List)d4).get(j);
                                c5.a().c().equals((Object)"subs");
                                if (((HashSet)o2).contains((Object)c5.a().b())) {
                                    final String b = c5.a().b();
                                    final StringBuilder sb = new StringBuilder("ProductId can not be duplicated. Invalid product id: ");
                                    sb.append(b);
                                    sb.append(".");
                                    f = h1.E.a(5, sb.toString());
                                    break Label_0926;
                                }
                                ((HashSet)o2).add((Object)c5.a().b());
                                if (!c3.a().c().equals((Object)"play_pass_subs") && !c5.a().c().equals((Object)"play_pass_subs") && !d3.equals((Object)c5.a().d())) {
                                    f = h1.E.a(5, "All products must have the same package name.");
                                    break Label_0926;
                                }
                            }
                            for (final String s : set) {
                                if (((HashSet)o2).contains((Object)s)) {
                                    final StringBuilder sb2 = new StringBuilder("OldProductId must not be one of the products to be purchased. Invalid old product id: ");
                                    sb2.append(s);
                                    sb2.append(".");
                                    f = h1.E.a(5, sb2.toString());
                                    break Label_0926;
                                }
                            }
                            final h1.g a5 = c3.a().a();
                            if (a5 != null && a5.f != null) {
                                f = h1.E.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                            }
                            else {
                                f = h1.E.j;
                            }
                        }
                    }
                    if (f != h1.E.j) {
                        this.H(120, 2, f);
                        this.K(f);
                        return f;
                    }
                    Label_2311: {
                        if (!this.m) {
                            break Label_2311;
                        }
                        final boolean o3 = this.o;
                        final boolean v = this.v;
                        this.A.getClass();
                        final boolean d5 = this.A.D;
                        final boolean b2 = this.B;
                        final String c6 = this.c;
                        final long longValue = this.E;
                        final String packageName = this.f.getPackageName();
                        final Object o2 = new Bundle();
                        q0.b((Bundle)o2, c6, longValue);
                        final int a6 = ((e)((n)ex2).F).a;
                        if (a6 != 0) {
                            ((BaseBundle)o2).putInt("prorationMode", a6);
                        }
                        if (!TextUtils.isEmpty((CharSequence)((n)ex2).D)) {
                            ((BaseBundle)o2).putString("accountId", (String)((n)ex2).D);
                        }
                        if (!TextUtils.isEmpty((CharSequence)((n)ex2).E)) {
                            ((BaseBundle)o2).putString("obfuscatedProfileId", (String)((n)ex2).E);
                        }
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            ((Bundle)o2).putStringArrayList("skusToReplace", new ArrayList((Collection)Arrays.asList((Object[])new String[] { null })));
                        }
                        if (!TextUtils.isEmpty((CharSequence)((e)((n)ex2).F).b)) {
                            ((BaseBundle)o2).putString("oldSkuPurchaseToken", ((e)((n)ex2).F).b);
                        }
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            ((BaseBundle)o2).putString("oldSkuPurchaseId", (String)null);
                        }
                        ((n)ex2).F.getClass();
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            ((n)ex2).F.getClass();
                            ((BaseBundle)o2).putString("originalExternalTransactionId", (String)null);
                        }
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            ((BaseBundle)o2).putString("paymentsPurchaseParams", (String)null);
                        }
                        if (o3) {
                            ((BaseBundle)o2).putBoolean("enablePendingPurchases", true);
                        }
                        if (v && d5) {
                            ((BaseBundle)o2).putBoolean("enablePendingPurchaseForSubscriptions", true);
                        }
                        if (b2) {
                            ((BaseBundle)o2).putBoolean("enableAlternativeBilling", true);
                        }
                        if (((Collection)((n)ex2).G).stream().anyMatch((Predicate)new a(0))) {
                            final N0 n = O0.n();
                            final Iterable iterable = (Iterable)((Collection)((n)ex2).G).stream().filter((Predicate)new a(1)).map((Function)new u(packageName)).collect(com.google.android.gms.internal.play_billing.r.a);
                            ((h1)n).e();
                            O0.o((O0)((h1)n).D, iterable);
                            ((Bundle)o2).putByteArray("subscriptionProductReplacementParamsList", ((S0)((h1)n).b()).b());
                        }
                        if (!list.isEmpty()) {
                            final ArrayList list2 = new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            final Iterator iterator3 = list.iterator();
                            if (iterator3.hasNext()) {
                                iterator3.next().getClass();
                                throw new ClassCastException();
                            }
                            if (!list2.isEmpty()) {
                                ((Bundle)o2).putStringArrayList("skuDetailsTokens", list2);
                            }
                            if (list.size() > 1) {
                                final ArrayList list3 = new ArrayList(list.size() - 1);
                                final ArrayList list4 = new ArrayList(list.size() - 1);
                                if (1 < list.size()) {
                                    list.get(1).getClass();
                                    throw new ClassCastException();
                                }
                                ((Bundle)o2).putStringArrayList("additionalSkus", list3);
                                ((Bundle)o2).putStringArrayList("additionalSkuTypes", list4);
                            }
                        }
                        else {
                            final ArrayList list5 = new ArrayList(((List)d).size() - 1);
                            final ArrayList list6 = new ArrayList(((List)d).size() - 1);
                            final ArrayList list7 = new ArrayList();
                            final ArrayList list8 = new ArrayList();
                            final ArrayList list9 = new ArrayList();
                            final ArrayList list10 = new ArrayList();
                            int l = 0;
                            final c c7 = c;
                            while (l < ((List)d).size()) {
                                final c c8 = (c)((List)d).get(l);
                                final h1.j a7 = c8.a;
                                if (!a7.h.isEmpty()) {
                                    list7.add((Object)a7.h);
                                }
                                list8.add((Object)c8.b);
                                final String i2 = a7.i;
                                final ArrayList k2 = a7.k;
                                String e2 = i2;
                                if (k2 != null) {
                                    e2 = i2;
                                    if (!k2.isEmpty()) {
                                        final Iterator iterator4 = a7.k.iterator();
                                        while (true) {
                                            e2 = i2;
                                            if (!iterator4.hasNext()) {
                                                break;
                                            }
                                            final h1.g g = (h1.g)iterator4.next();
                                            if (!TextUtils.isEmpty((CharSequence)g.e)) {
                                                e2 = g.e;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!TextUtils.isEmpty((CharSequence)e2)) {
                                    list9.add((Object)e2);
                                }
                                if (l > 0) {
                                    list5.add((Object)((c)((List)d).get(l)).a.c);
                                    list6.add((Object)((c)((List)d).get(l)).a.d);
                                }
                                ++l;
                            }
                            ((Bundle)o2).putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", list8);
                            ((Bundle)o2).putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", list10);
                            if (!list7.isEmpty()) {
                                ((Bundle)o2).putStringArrayList("skuDetailsTokens", list7);
                            }
                            if (!list9.isEmpty()) {
                                ((Bundle)o2).putStringArrayList("SKU_SERIALIZED_DOCID_LIST", list9);
                            }
                            c = c7;
                            if (!list5.isEmpty()) {
                                ((Bundle)o2).putStringArrayList("additionalSkus", list5);
                                ((Bundle)o2).putStringArrayList("additionalSkuTypes", list6);
                                c = c7;
                            }
                        }
                        if (((BaseBundle)o2).containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.q) {
                            final h1.f s2 = h1.E.s;
                            this.H(21, 2, s2);
                            this.K(s2);
                            return s2;
                        }
                        int i;
                        if (!TextUtils.isEmpty((CharSequence)c.a.d())) {
                            ((BaseBundle)o2).putString("skuPackageName", c.a.d());
                            i = 1;
                        }
                        else {
                            i = 0;
                        }
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            ((BaseBundle)o2).putString("accountName", (String)null);
                        }
                        final Intent intent = ((Activity)ex).getIntent();
                        String stringExtra;
                        String versionName = null;
                        BaseBundle baseBundle;
                        String s3;
                        String s4;
                        CancellationException ex4;
                        String e3;
                        String name;
                        int n2;
                        Intent intent2;
                        Label_2341_Outer:Label_2206_Outer:
                        while (true) {
                            if (intent == null) {
                                q0.g("BillingClient", "Activity's intent is null.");
                                break Label_2217;
                            }
                            if (TextUtils.isEmpty((CharSequence)intent.getStringExtra("PROXY_PACKAGE"))) {
                                break Label_2217;
                            }
                            stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            ((BaseBundle)o2).putString("proxyPackage", stringExtra);
                            try {
                                versionName = this.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName;
                                baseBundle = (BaseBundle)o2;
                                s3 = "proxyPackageVersion";
                                s4 = versionName;
                                baseBundle.putString(s3, s4);
                                break Label_2217;
                            }
                            catch (final PackageManager$NameNotFoundException ex3) {}
                            while (true) {
                                try {
                                    baseBundle = (BaseBundle)o2;
                                    s3 = "proxyPackageVersion";
                                    s4 = versionName;
                                    baseBundle.putString(s3, s4);
                                    if (this.t && !((List)d).isEmpty()) {
                                        i = 17;
                                    }
                                    else if (this.r && i != 0) {
                                        i = 15;
                                    }
                                    else if (this.o) {
                                        i = 9;
                                    }
                                    else {
                                        i = 6;
                                    }
                                    ex2 = (Exception)m((Callable)new h1.n(this, i, c2, d2, (n)ex2, (Bundle)o2), 5000L, null, this.d, this.q());
                                    while (true) {
                                        ex4 = null;
                                        Label_2379: {
                                            if (ex2 == null) {
                                                Label_2716: {
                                                    Label_2685: {
                                                        try {
                                                            ex = (CancellationException)h1.E.d;
                                                            this.H(25, 2, (h1.f)ex);
                                                            this.K((h1.f)ex);
                                                            return (h1.f)ex;
                                                        }
                                                        catch (final Exception ex2) {
                                                            break Label_2685;
                                                        }
                                                        catch (final CancellationException ex) {
                                                            break Label_2716;
                                                        }
                                                        catch (final TimeoutException ex) {
                                                            break Label_2716;
                                                        }
                                                        break Label_2379;
                                                    }
                                                    q0.h("BillingClient", "Exception while launching billing flow. Try to reconnect", (Throwable)ex2);
                                                    ex = (CancellationException)h1.E.k;
                                                    this.I(5, 2, (h1.f)ex, h1.C.a(ex2));
                                                    this.K((h1.f)ex);
                                                    return (h1.f)ex;
                                                }
                                                q0.h("BillingClient", "Time out while launching billing flow. Try to reconnect", (Throwable)ex);
                                                ex2 = (Exception)h1.E.l;
                                                this.I(4, 2, (h1.f)ex2, h1.C.a((Exception)ex));
                                                this.K((h1.f)ex2);
                                                return (h1.f)ex2;
                                            }
                                        }
                                        ex2 = (Exception)((Future)ex2).get(5000L, TimeUnit.MILLISECONDS);
                                        i = q0.a("BillingClient", (Bundle)ex2);
                                        e3 = q0.e("BillingClient", (Bundle)ex2);
                                        if (i != 0) {
                                            ex = (CancellationException)new StringBuilder();
                                            ((StringBuilder)ex).append("Unable to buy item, Error response code: ");
                                            ((StringBuilder)ex).append(i);
                                            q0.g("BillingClient", ((StringBuilder)ex).toString());
                                            a = h1.E.a(i, e3);
                                            Label_2567: {
                                                Label_2457: {
                                                    if (ex2 != null) {
                                                        Label_2502: {
                                                            try {
                                                                ex = (CancellationException)((BaseBundle)ex2).get("LOG_REASON");
                                                                if (ex == null) {
                                                                    break Label_2457;
                                                                }
                                                                if (!(ex instanceof Integer)) {
                                                                    break Label_2502;
                                                                }
                                                                i = f1.o((int)ex);
                                                            }
                                                            finally {
                                                                q0.g("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf((Object)((Throwable)ex).getMessage())));
                                                                break Label_2457;
                                                                name = ex.getClass().getName();
                                                                ex = (CancellationException)new StringBuilder();
                                                                ((StringBuilder)ex).append("Unexpected type for bundle log reason: ");
                                                                ((StringBuilder)ex).append(name);
                                                                q0.g("BillingClient", ((StringBuilder)ex).toString());
                                                                break Label_2457;
                                                            }
                                                        }
                                                        break Label_2567;
                                                    }
                                                }
                                                i = 1;
                                            }
                                            n2 = i;
                                            if (i == 1) {
                                                n2 = 23;
                                            }
                                            if (ex2 == null) {
                                                ex = ex4;
                                            }
                                            else {
                                                try {
                                                    ((BaseBundle)ex2).getString("ADDITIONAL_LOG_DETAILS");
                                                }
                                                finally {
                                                    q0.g("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf((Object)((Throwable)ex).getMessage())));
                                                    ex = ex4;
                                                }
                                            }
                                            this.I(n2, 2, (h1.f)a, (String)ex);
                                            this.K((h1.f)a);
                                            return (h1.f)a;
                                        }
                                        intent2 = new Intent((Context)ex, (Class)ProxyBillingActivity.class);
                                        intent2.putExtra((String)a, (Parcelable)((Bundle)ex2).getParcelable((String)a));
                                        ((Activity)ex).startActivity(intent2);
                                        return h1.E.j;
                                        throw new ClassCastException();
                                        ex2 = (Exception)m((Callable)new j((Object)this, (Object)c2, (Object)d2, 9), 5000L, null, this.d, this.q());
                                        continue Label_2206_Outer;
                                    }
                                    q0.g("BillingClient", "Current client doesn't support extra params for buy intent.");
                                    ex = (CancellationException)h1.E.g;
                                    this.H(18, 2, (h1.f)ex);
                                    this.K((h1.f)ex);
                                    return (h1.f)ex;
                                    ((BaseBundle)o2).putString("proxyPackageVersion", "package not found");
                                    continue Label_2341_Outer;
                                    ex = (CancellationException)h1.E.D;
                                    this.H(12, 2, (h1.f)ex);
                                    return (h1.f)ex;
                                }
                                catch (final PackageManager$NameNotFoundException ex5) {
                                    continue;
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public void i(final G g, final g g2) {
        if (!this.g()) {
            final h1.f k = h1.E.k;
            this.H(2, 7, k);
            g2.a(k, new ArrayList());
            return;
        }
        if (!this.t) {
            q0.g("BillingClient", "Querying product details is not supported.");
            final h1.f t = h1.E.t;
            this.H(20, 7, t);
            g2.a(t, new ArrayList());
            return;
        }
        if (m((Callable)new j((Object)this, (Object)g, (Object)g2, 6), 30000L, (Runnable)new O2.p((Object)this, 24, (Object)g2), this.D(), this.q()) == null) {
            final h1.f n = this.n();
            this.H(25, 7, n);
            g2.a(n, new ArrayList());
        }
    }
    
    public final void j(final w w, final E4.b b) {
        if (!this.g()) {
            final h1.f k = h1.E.k;
            this.H(2, 9, k);
            final A d = com.google.android.gms.internal.play_billing.D.D;
            b.j(k, (List)U.G);
        }
        else {
            final String b2 = w.b;
            if (TextUtils.isEmpty((CharSequence)b2)) {
                q0.g("BillingClient", "Please provide a valid product type.");
                final h1.f f = h1.E.f;
                this.H(50, 9, f);
                final A d2 = com.google.android.gms.internal.play_billing.D.D;
                b.j(f, (List)U.G);
            }
            else if (m((Callable)new j(this, b2, (Object)b, 7), 30000L, (Runnable)new O2.p((Object)this, 19, (Object)b), this.D(), this.q()) == null) {
                final h1.f n = this.n();
                this.H(25, 9, n);
                final A d3 = com.google.android.gms.internal.play_billing.D.D;
                b.j(n, (List)U.G);
            }
        }
    }
    
    public final void k(final FlutterActivity flutterActivity, final E4.b b) {
        if (flutterActivity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!this.g()) {
            this.H(2, 16, h1.E.k);
            return;
        }
        if (!this.x) {
            q0.g("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            this.H(66, 16, h1.E.C);
            return;
        }
        final Handler d = this.d;
        if (m((Callable)new Fl((Object)this, (Object)b, (Object)flutterActivity, (Object)new o(this, d, b), 1), 30000L, (Runnable)new O2.p((Object)this, 26, (Object)b), d, this.q()) == null) {
            this.H(25, 16, this.n());
            return;
        }
        final h1.f a = h1.E.a;
    }
    
    public void l(final c0 c0) {
        final Object a;
        monitorenter(a = this.a);
        Object o;
        ServiceInfo serviceInfo;
        String packageName;
        String name;
        int n = 0;
        List queryIntentServices = null;
        ComponentName component;
        Intent intent;
        Object a2;
        p i;
        Block_9_Outer:Block_5_Outer:
        while (true) {
            Label_0035: {
                try {
                    if (this.g()) {
                        o = this.E();
                        monitorexit(a);
                        break Label_0480;
                    }
                    break Label_0035;
                }
                finally {
                    monitorexit(a);
                    Label_0072: {
                        iftrue(Label_0109:)(this.b != 3);
                    }
                    Label_0453: {
                        Block_14: {
                        Block_7_Outer:
                            while (true) {
                                while (true) {
                                    while (true) {
                                        Block_8: {
                                            Label_0434: {
                                                Block_6: {
                                                    break Block_6;
                                                    packageName = serviceInfo.packageName;
                                                    name = serviceInfo.name;
                                                    iftrue(Label_0434:)(!Objects.equals((Object)packageName, (Object)"com.android.vending") || name == null);
                                                    Block_11: {
                                                        break Block_11;
                                                        Label_0445:
                                                        q0.g("BillingClient", "The device doesn't have valid Play Store.");
                                                        break Label_0453;
                                                        q0.g("BillingClient", "Client is already in the process of connecting to billing service.");
                                                        o = h1.E.e;
                                                        this.H(37, 6, (h1.f)o);
                                                        monitorexit(a);
                                                        break Label_0480;
                                                        n = n;
                                                        iftrue(Label_0453:)(queryIntentServices.isEmpty());
                                                        break Block_8;
                                                    }
                                                    component = new ComponentName(packageName, name);
                                                    o = new Intent(intent);
                                                    ((Intent)o).setComponent(component);
                                                    ((Intent)o).putExtra("playBillingLibraryVersion", this.c);
                                                    monitorenter(a2 = this.a);
                                                    Label_0340: {
                                                        try {
                                                            if (this.b == 2) {
                                                                o = this.E();
                                                                monitorexit(a2);
                                                                break Label_0480;
                                                            }
                                                            break Label_0340;
                                                        }
                                                        finally {
                                                            monitorexit(a2);
                                                            Label_0377:
                                                            i = this.i;
                                                            monitorexit(a2);
                                                            iftrue(Label_0415:)(!this.f.bindService((Intent)o, (ServiceConnection)i, 1));
                                                            q0.f("BillingClient", "Service was bonded successfully.");
                                                            o = null;
                                                            break Label_0480;
                                                            Label_0415:
                                                            q0.g("BillingClient", "Connection to Billing service is blocked.");
                                                            n = 39;
                                                            break Label_0453;
                                                            while (true) {
                                                                q0.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                                o = h1.E.k;
                                                                this.H(117, 6, (h1.f)o);
                                                                monitorexit(a2);
                                                                break Label_0480;
                                                                iftrue(Label_0377:)(this.b == 1);
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    break Label_0434;
                                                    Label_0529:
                                                    return;
                                                    iftrue(Label_0529:)(o == null);
                                                    Block_13: {
                                                        break Block_13;
                                                        Label_0505:
                                                        c0.C = true;
                                                        ((L4.g)c0.D).success((Object)com.google.android.gms.internal.auth.m.m((h1.f)o));
                                                        return;
                                                    }
                                                    iftrue(Label_0505:)(!c0.C);
                                                    break Block_14;
                                                }
                                                q0.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                                                o = h1.E.k;
                                                this.H(38, 6, (h1.f)o);
                                                monitorexit(a);
                                                continue Block_9_Outer;
                                            }
                                            q0.g("BillingClient", "The device doesn't have valid Play Store.");
                                            break Label_0453;
                                        }
                                        serviceInfo = ((ResolveInfo)queryIntentServices.get(0)).serviceInfo;
                                        n = 40;
                                        iftrue(Label_0445:)(serviceInfo == null);
                                        continue Block_5_Outer;
                                    }
                                    Label_0109:
                                    this.t(1);
                                    this.u();
                                    q0.f("BillingClient", "Starting in-app billing setup.");
                                    this.i = new p(this, c0);
                                    monitorexit(a);
                                    intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                                    intent.setPackage("com.android.vending");
                                    queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
                                    n = 41;
                                    iftrue(Label_0453:)(queryIntentServices == null);
                                    continue;
                                }
                                iftrue(Label_0072:)(this.b != 1);
                                continue Block_7_Outer;
                            }
                        }
                        Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
                        return;
                    }
                    this.t(0);
                    q0.f("BillingClient", "Billing service unavailable on device.");
                    o = h1.E.c;
                    this.H(n, 6, (h1.f)o);
                    continue Block_9_Outer;
                }
            }
            break;
        }
    }
    
    public final h1.f n() {
        int n = 0;
        final Object a;
        monitorenter(a = this.a);
        while (true) {
            Label_0061: {
                if (n >= 2) {
                    break Label_0061;
                }
                Label_0055: {
                    try {
                        if (this.b == (new int[] { 0, 3 })[n]) {
                            monitorexit(a);
                            return h1.E.k;
                        }
                        break Label_0055;
                    }
                    finally {
                        monitorexit(a);
                        ++n;
                        continue;
                        monitorexit(a);
                        return h1.E.i;
                    }
                }
            }
        }
    }
    
    public final void o() {
        if (!TextUtils.isEmpty((CharSequence)null)) {
            return;
        }
        this.f.getPackageName();
    }
    
    public final ExecutorService q() {
        monitorenter(this);
        Label_0039: {
            try {
                if (this.C == null) {
                    this.C = Executors.newFixedThreadPool(q0.a, (ThreadFactory)new J1.b());
                }
                break Label_0039;
            }
            finally {
                monitorexit(this);
                final ExecutorService c = this.C;
                monitorexit(this);
                return c;
            }
        }
    }
    
    public final void r(final U1 u1) {
        try {
            this.g.k(u1, this.l);
        }
        finally {
            final Throwable t;
            q0.h("BillingClient", "Unable to log.", t);
        }
    }
    
    public final void s(final W1 w1) {
        try {
            final m g = this.g;
            final int l = this.l;
            g.getClass();
            try {
                final d2 d2 = (d2)((i1)g.D).g();
                ((h1)d2).e();
                e2.n((e2)((h1)d2).D, l);
                g.D = ((h1)d2).b();
                g.m(w1);
            }
            finally {
                final Throwable t;
                q0.h("BillingLogger", "Unable to log.", t);
            }
        }
        finally {
            final Throwable t2;
            q0.h("BillingClient", "Unable to log.", t2);
        }
    }
    
    public final void t(final int b) {
        final Object a;
        monitorenter(a = this.a);
        Label_0028: {
            try {
                if (this.b == 3) {
                    monitorexit(a);
                    return;
                }
                break Label_0028;
            }
            finally {
                monitorexit(a);
                Label_0102: {
                    final String s = "CONNECTING";
                }
                while (true) {
                    Block_8: {
                        while (true) {
                            String s;
                            int b2;
                            String s2;
                            StringBuilder sb;
                            Block_6_Outer:Label_0072_Outer:
                            while (true) {
                                break Label_0115;
                            Label_0072:
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            iftrue(Label_0054:)(b2 == 2);
                                            Block_7: {
                                                break Block_7;
                                                iftrue(Label_0110:)(b == 0);
                                                break Block_8;
                                                Label_0054:
                                                s2 = "CONNECTED";
                                                continue Label_0072;
                                            }
                                            s2 = "CLOSED";
                                            continue Label_0072;
                                            Label_0110:
                                            s = "DISCONNECTED";
                                            break Label_0115;
                                            Label_0061:
                                            s2 = "CONNECTING";
                                            continue Label_0072;
                                            iftrue(Label_0061:)(b2 == 1);
                                            continue Label_0072_Outer;
                                        }
                                        Label_0094:
                                        s = "CONNECTED";
                                        break Label_0115;
                                        b2 = this.b;
                                        iftrue(Label_0068:)(b2 == 0);
                                        continue;
                                    }
                                    Label_0068:
                                    s2 = "DISCONNECTED";
                                    continue Label_0072;
                                }
                                sb = new StringBuilder("Setting clientState from ");
                                sb.append(s2);
                                sb.append(" to ");
                                sb.append(s);
                                q0.f("BillingClient", sb.toString());
                                this.b = b;
                                monitorexit(a);
                                return;
                                s = "CLOSED";
                                continue Block_6_Outer;
                            }
                            iftrue(Label_0094:)(b == 2);
                            continue;
                        }
                    }
                    iftrue(Label_0102:)(b == 1);
                    continue;
                }
            }
        }
    }
    
    public final void u() {
        final Object a;
        monitorenter(a = this.a);
        while (true) {
            try {
                if (this.i != null) {
                    final b b = this;
                    final Context context = b.f;
                    final b b2 = this;
                    final p p = b2.i;
                    context.unbindService((ServiceConnection)p);
                    final b b3 = this;
                    final f f = null;
                    b3.h = f;
                    final b b4 = this;
                    final p p2 = null;
                    b4.i = p2;
                }
                break Label_0082;
            }
            finally {
                monitorexit(a);
                monitorexit(a);
                return;
                try {
                    final Throwable t;
                    q0.h("BillingClient", "There was an exception while unbinding service!", t);
                }
                finally {
                    this.h = null;
                    this.i = null;
                }
                continue;
            }
            try {
                final b b = this;
                final Context context = b.f;
                final b b2 = this;
                final p p = b2.i;
                context.unbindService((ServiceConnection)p);
                final b b3 = this;
                final f f = null;
                b3.h = f;
                final b b4 = this;
                final p p2 = null;
                b4.i = p2;
                continue;
            }
            finally {}
            break;
        }
    }
    
    public final x v(final h1.f f, final int n, final String s, final Exception ex) {
        q0.h("BillingClient", s, (Throwable)ex);
        this.I(n, 7, f, h1.C.a(ex));
        return new x(f.a, f.b, new ArrayList());
    }
    
    public final h1.u w(final h1.f f, final int n, final String s, final Exception ex) {
        q0.h("BillingClient", s, (Throwable)ex);
        this.I(n, 11, f, h1.C.a(ex));
        return new h1.u(f, null);
    }
    
    public final h1.u x(final h1.f f, final int n, final String s, final Exception ex) {
        this.I(n, 9, f, h1.C.a(ex));
        q0.h("BillingClient", s, (Throwable)ex);
        return new h1.u(f, null);
    }
    
    public final void y(int a, final int n, final h1.f f) {
        final int a2 = f.a;
        final W1 w1 = null;
        final U1 u1 = null;
        if (a2 != 0) {
            final int a3 = h1.C.a;
            U1 u2;
            try {
                final T1 r = U1.r();
                final X1 r2 = Y1.r();
                r2.f(f.a);
                final String b = f.b;
                ((h1)r2).e();
                Y1.o((Y1)((h1)r2).D, b);
                r2.g(a);
                r.f(r2);
                r.g(5);
                final g2 o = i2.o();
                ((h1)o).e();
                i2.n((i2)((h1)o).D, n);
                final i2 i2 = (i2)((h1)o).b();
                ((h1)r).e();
                U1.p((U1)((h1)r).D, i2);
                u2 = (U1)((h1)r).b();
            }
            catch (final Exception ex) {
                q0.h("BillingLogger", "Unable to create logging payload", (Throwable)ex);
                u2 = u1;
            }
            this.r(u2);
            return;
        }
        a = h1.C.a;
        W1 w2;
        try {
            final V1 q = W1.q();
            ((h1)q).e();
            W1.p((W1)((h1)q).D, 5);
            final g2 o2 = i2.o();
            ((h1)o2).e();
            i2.n((i2)((h1)o2).D, n);
            final i2 i3 = (i2)((h1)o2).b();
            ((h1)q).e();
            W1.n((W1)((h1)q).D, i3);
            w2 = (W1)((h1)q).b();
        }
        catch (final Exception ex2) {
            q0.h("BillingLogger", "Unable to create logging payload", (Throwable)ex2);
            w2 = w1;
        }
        this.s(w2);
    }
    
    public final void z(final E4.b b, final h1.f f, final int n, final Exception ex) {
        q0.h("BillingClient", "Error in acknowledge purchase!", (Throwable)ex);
        this.I(n, 3, f, h1.C.a(ex));
        b.b(f);
    }
}

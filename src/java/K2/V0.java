package K2;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.J3;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import J1.b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import O2.i;
import n3.u0;
import L3.l;
import C2.v;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import d2.a;
import android.content.BroadcastReceiver$PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import android.net.Uri;

public final class v0 implements Runnable
{
    public final int C;
    public final Object D = d;
    public final Object E = e;
    public final boolean F = f;
    public final Object G = g;
    public final Object H = h;
    
    public v0(final S0 h, final boolean f, final Uri g, final String d, final String e) {
        this.C = 2;
        this.F = f;
        this.G = g;
        this.D = d;
        this.E = e;
        this.H = h;
    }
    
    public final void run() {
        switch (this.C) {
            default: {
                final FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = (FirebaseInstanceIdReceiver)this.G;
                final Intent intent = (Intent)this.D;
                final Context context = (Context)this.E;
                final boolean f = this.F;
                final BroadcastReceiver$PendingResult broadcastReceiver$PendingResult = (BroadcastReceiver$PendingResult)this.H;
                firebaseInstanceIdReceiver.getClass();
                Label_0116: {
                    try {
                        final Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                        final boolean b = parcelableExtra instanceof Intent;
                        final Executor executor = null;
                        if (b) {
                            final Intent intent2 = (Intent)parcelableExtra;
                            break Label_0116;
                        }
                        break Label_0116;
                    }
                    finally {
                        if (broadcastReceiver$PendingResult != null) {
                            broadcastReceiver$PendingResult.finish();
                        }
                        final a a;
                        Label_0148: {
                            a = new a(intent);
                        }
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final Class<FirebaseInstanceIdReceiver> clazz;
                        monitorenter(clazz = FirebaseInstanceIdReceiver.class);
                        while (true) {
                            Intent intent2 = null;
                        Label_0427:
                            while (true) {
                                Label_0209: {
                                    try {
                                        final SoftReference b2 = FirebaseInstanceIdReceiver.b;
                                        final Executor executor;
                                        Executor executor2 = executor;
                                        if (b2 != null) {
                                            executor2 = (Executor)b2.get();
                                        }
                                        break Label_0209;
                                    }
                                    finally {
                                        monitorexit(clazz);
                                    Block_40_Outer:
                                        while (true) {
                                            monitorexit(clazz);
                                            Object o = new v((Object)context, (Object)a, (Object)countDownLatch, 23);
                                            Object unconfigurableExecutorService = null;
                                            ((Executor)unconfigurableExecutorService).execute((Runnable)o);
                                            Block_35: {
                                                Label_0380: {
                                                    try {
                                                        o = new l(context);
                                                        final int resultCode = (int)u0.c((i)((l)o).b(intent));
                                                        break Label_0380;
                                                    }
                                                    catch (final InterruptedException o) {}
                                                    catch (final ExecutionException ex) {}
                                                    Log.e("FirebaseMessaging", "Failed to send message to service.", (Throwable)o);
                                                    final int resultCode = 500;
                                                    Block_37: {
                                                        break Block_37;
                                                        while (true) {
                                                            Label_0442: {
                                                                while (true) {
                                                                    broadcastReceiver$PendingResult.setResultCode(resultCode);
                                                                    break Label_0442;
                                                                    iftrue(Label_0442:)(!f || broadcastReceiver$PendingResult == null);
                                                                    continue Block_40_Outer;
                                                                }
                                                                broadcastReceiver$PendingResult.finish();
                                                                return;
                                                                final Executor executor2;
                                                                iftrue(Label_0297:)((unconfigurableExecutorService = executor2) != null);
                                                                break Block_35;
                                                            }
                                                            iftrue(Label_0452:)(broadcastReceiver$PendingResult == null);
                                                            continue;
                                                        }
                                                    }
                                                    try {
                                                        if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                                            Log.w("CloudMessagingReceiver", "Message ack timed out");
                                                        }
                                                    }
                                                    catch (final InterruptedException ex2) {
                                                        Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(ex2.toString()));
                                                    }
                                                }
                                                continue Label_0427;
                                            }
                                            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue(), (ThreadFactory)new b("pscm-ack-executor", 2));
                                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                                            unconfigurableExecutorService = Executors.unconfigurableExecutorService((ExecutorService)threadPoolExecutor);
                                            FirebaseInstanceIdReceiver.b = new SoftReference(unconfigurableExecutorService);
                                            continue;
                                        }
                                        Label_0452:
                                        return;
                                    }
                                }
                                Label_0133:
                                iftrue(Label_0148:)(intent.getExtras() != null);
                                Block_29: {
                                    break Block_29;
                                    intent2 = null;
                                    break Label_0116;
                                    final int resultCode = FirebaseInstanceIdReceiver.a(intent2);
                                    continue Label_0427;
                                }
                                final int resultCode = 500;
                                continue Label_0427;
                            }
                            iftrue(Label_0133:)(intent2 == null);
                            continue;
                        }
                    }
                }
            }
            case 2: {
                H0 h0 = null;
                Label_1136: {
                    Uri uri = null;
                    String s = null;
                    n0 n0 = null;
                    F s2 = null;
                    Bundle bundle = null;
                    Label_0736: {
                        J1 u;
                        boolean g;
                        while (true) {
                            uri = (Uri)this.G;
                            s = (String)this.E;
                            h0 = (H0)((S0)this.H).D;
                            n0 = (n0)h0.C;
                            h0.v();
                            while (true) {
                                try {
                                    u = h0.u();
                                    J3.a();
                                    final d i = n0.I;
                                    s2 = w.S0;
                                    g = i.G(null, s2);
                                    if (TextUtils.isEmpty((CharSequence)s)) {
                                        bundle = null;
                                        break Label_0736;
                                    }
                                    if (s.contains((CharSequence)"gclid")) {
                                        break;
                                    }
                                    if (g) {
                                        if (s.contains((CharSequence)"gbraid")) {
                                            break;
                                        }
                                    }
                                }
                                catch (final RuntimeException ex3) {
                                    break Label_1136;
                                }
                                if (!s.contains((CharSequence)"utm_campaign") && !s.contains((CharSequence)"utm_source") && !s.contains((CharSequence)"utm_medium") && !s.contains((CharSequence)"utm_id") && !s.contains((CharSequence)"dclid") && !s.contains((CharSequence)"srsltid") && !s.contains((CharSequence)"sfmc_id")) {
                                    u.j().O.f("Activity created with data 'referrer' without required params");
                                    continue;
                                }
                                break;
                            }
                            break;
                        }
                        final Bundle j = u.I(g, Uri.parse("https://google.com/search?".concat(s)));
                        if ((bundle = j) != null) {
                            ((BaseBundle)j).putString("_cis", "referrer");
                            bundle = j;
                        }
                    }
                    final String s3 = (String)this.D;
                    final d k = n0.I;
                    final boolean f2 = this.F;
                    final e0 s4 = h0.S;
                    if (f2) {
                        final J1 u2 = h0.u();
                        J3.a();
                        final Bundle l = u2.I(k.G(null, s2), uri);
                        if (l != null) {
                            ((BaseBundle)l).putString("_cis", "intent");
                            if (!((BaseBundle)l).containsKey("gclid") && bundle != null && ((BaseBundle)bundle).containsKey("gclid")) {
                                final String string = ((BaseBundle)bundle).getString("gclid");
                                final StringBuilder sb = new StringBuilder("gclid=");
                                sb.append(string);
                                ((BaseBundle)l).putString("_cer", sb.toString());
                            }
                            h0.Z(s3, "_cmp", l);
                            s4.a(s3, l);
                        }
                    }
                    if (TextUtils.isEmpty((CharSequence)s)) {
                        return;
                    }
                    h0.j().O.g("Activity created with referrer", s);
                    if (k.G(null, w.p0)) {
                        if (bundle != null) {
                            h0.Z(s3, "_cmp", bundle);
                            s4.a(s3, bundle);
                        }
                        else {
                            h0.j().O.g("Referrer does not contain valid parameters", s);
                        }
                        n0.P.getClass();
                        h0.P("auto", "_ldl", null, true, System.currentTimeMillis());
                        return;
                    }
                    if (!s.contains((CharSequence)"gclid") || (!s.contains((CharSequence)"utm_campaign") && !s.contains((CharSequence)"utm_source") && !s.contains((CharSequence)"utm_medium") && !s.contains((CharSequence)"utm_term") && !s.contains((CharSequence)"utm_content"))) {
                        h0.j().O.f("Activity created with data 'referrer' without required params");
                        return;
                    }
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        n0.P.getClass();
                        h0.P("auto", "_ldl", s, true, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                final RuntimeException ex3;
                h0.j().H.g("Throwable caught in handleReferrerForOnActivityCreated", ex3);
                return;
            }
            case 1: {
                final b1 e = m0.a.e((n0)((H0)this.H).C);
                e.E((Runnable)new d1(e, (AtomicReference)this.G, (String)this.D, (String)this.E, e.O(false), this.F));
                return;
            }
            case 0: {
                final b1 e2 = m0.a.e(((AppMeasurementDynamiteService)this.H).C);
                e2.E((Runnable)new d1(e2, (String)this.D, (String)this.E, e2.O(false), this.F, (S)this.G));
            }
        }
    }
}

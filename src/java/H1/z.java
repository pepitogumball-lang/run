package h1;

import java.util.concurrent.Future;
import com.google.android.gms.internal.play_billing.G0;
import com.google.android.gms.internal.play_billing.H0;
import java.io.Serializable;
import com.google.android.gms.internal.play_billing.z2;
import android.content.pm.ServiceInfo;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import K2.c0;
import java.util.concurrent.TimeoutException;
import H1.n;
import io.flutter.embedding.android.FlutterActivity;
import com.google.android.gms.internal.play_billing.W1;
import android.content.ServiceConnection;
import java.util.concurrent.ExecutorService;
import com.google.android.gms.internal.play_billing.v0;
import com.google.android.gms.internal.play_billing.C0;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.gms.internal.play_billing.A0;
import d2.m;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.play_billing.t0;
import com.google.android.gms.internal.play_billing.F0;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import com.google.android.gms.internal.play_billing.U1;
import java.util.Objects;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.f1;
import com.google.android.gms.internal.play_billing.v2;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.w2;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.z0;
import B5.w;
import F1.E0;
import L3.g;
import V4.G;
import com.google.android.gms.internal.play_billing.B0;
import Q2.h;
import com.google.android.gms.internal.play_billing.j;
import android.content.Context;

public final class z extends b
{
    public final Context F;
    public volatile int G;
    public volatile j H;
    public volatile h I;
    public volatile B0 J;
    
    public z(final X2.b b, final Context f) {
        super(b, f);
        this.G = 0;
        this.F = f;
    }
    
    public z(final X2.b b, final Context f, final G g) {
        super(b, f, g);
        this.G = 0;
        this.F = f;
    }
    
    public z(final X2.b b, final Context f, final G g, final g g2) {
        super(b, f, g, g2);
        this.G = 0;
        this.F = f;
    }
    
    public z(final Context f) {
        super(f);
        this.G = 0;
        this.F = f;
    }
    
    public final boolean O() {
        monitorenter(this);
        Label_0036: {
            try {
                if (this.G == 2 && this.H != null && this.I != null) {
                    monitorexit(this);
                    return true;
                }
                break Label_0036;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return false;
            }
        }
    }
    
    public final z0 P(final int n) {
        if (!this.O()) {
            q0.g("BillingClientTesting", "Billing Override Service is not ready.");
            this.Q(106, 28, h1.E.a(-1, "Billing Override Service connection is disconnected."));
            return (z0)new Object();
        }
        final h1.w w = new h1.w(this, n);
        final Object o = new Object();
        ((w2)o).c = (z2)new Object();
        final y2 b = new y2((w2)o);
        ((w2)o).b = b;
        ((w2)o).a = (Serializable)h1.w.class;
        try {
            w.k((w2)o);
            ((w2)o).a = (Serializable)"billingOverrideService.getBillingOverride";
        }
        catch (final Exception ex) {
            final s1 s1 = new s1((Throwable)ex);
            final f1 h = v2.H;
            final x2 d = b.D;
            if (h.D((v2)d, (Object)null, (Object)s1)) {
                v2.d((v2)d);
            }
        }
        return (z0)b;
    }
    
    public final void Q(final int n, final int n2, final f f) {
        final U1 b = h1.C.b(n, n2, f);
        Objects.requireNonNull((Object)b, "ApiFailure should not be null");
        super.g.j(b);
    }
    
    public final void R(final int n, final Consumer consumer, final Runnable runnable) {
        final z0 p3 = this.P(n);
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        monitorenter(this);
        Label_0071: {
            try {
                if (this.J == null) {
                    final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    Object j;
                    if (singleThreadScheduledExecutor instanceof B0) {
                        j = singleThreadScheduledExecutor;
                    }
                    else {
                        j = new F0(singleThreadScheduledExecutor);
                    }
                    this.J = (B0)j;
                }
                break Label_0071;
            }
            finally {
                monitorexit(this);
                Object c = null;
                Label_0097: {
                    c = new Object();
                }
                ((H0)c).J = p3;
                final Object o = new Object();
                ((G0)o).C = (H0)c;
                final B0 i;
                ((H0)c).K = ((F0)i).schedule((Runnable)o, 28500L, milliseconds);
                p3.b((Runnable)o, (Executor)t0.C);
                Label_0161: {
                    break Label_0161;
                    i = this.J;
                    monitorexit(this);
                    iftrue(Label_0097:)(!((Future)p3).isDone());
                    c = p3;
                }
                final m m = new m(this, n, consumer, runnable);
                monitorenter(this);
                Label_0251: {
                    try {
                        if (super.D == null) {
                            final ExecutorService q = this.q();
                            Object d;
                            if (q instanceof A0) {
                                d = q;
                            }
                            else if (q instanceof ScheduledExecutorService) {
                                d = new F0((ScheduledExecutorService)q);
                            }
                            else {
                                d = new C0(q);
                            }
                            super.D = (A0)d;
                        }
                        break Label_0251;
                    }
                    finally {
                        monitorexit(this);
                        final A0 d2 = super.D;
                        monitorexit(this);
                        ((z0)c).b((Runnable)new v0((z0)c, m), (Executor)d2);
                    }
                }
            }
        }
    }
    
    @Override
    public final void a(final E0 e0, final E4.b b) {
        this.R(3, (Consumer)new v(b, 2), (Runnable)new C2.v((Object)this, (Object)e0, (Object)b, 26));
    }
    
    @Override
    public final void b(final w w, final E4.b b) {
        this.R(4, (Consumer)new v(w, b), (Runnable)new C2.v((Object)this, (Object)w, (Object)b, 25));
    }
    
    @Override
    public final void d() {
        monitorenter(this);
        try {
            final W1 d = h1.C.d(27);
            Objects.requireNonNull((Object)d, "ApiSuccess should not be null");
            super.g.m(d);
            Label_0125: {
                Label_0116: {
                    try {
                        try {
                            if (this.I != null && this.H != null) {
                                q0.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                                this.F.unbindService((ServiceConnection)this.I);
                                this.I = new h((Object)this, 2);
                            }
                        }
                        finally {}
                    }
                    catch (final RuntimeException ex) {
                        break Label_0116;
                    }
                    this.H = null;
                    if (this.J != null) {
                        ((C0)this.J).shutdownNow();
                        this.J = null;
                    }
                    break Label_0125;
                }
                final RuntimeException ex;
                q0.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", (Throwable)ex);
            }
            this.G = 3;
            monitorexit(this);
            super.d();
        }
        finally {
            monitorexit(this);
            while (true) {
                this.G = 3;
                continue;
            }
        }
    }
    
    @Override
    public final f h(final FlutterActivity flutterActivity, final n n) {
        final z0 p2 = this.P(2);
        final int n2 = 0;
        int intValue = 0;
        Label_0108: {
            try {
                intValue = (int)((Future)p2).get(28500L, TimeUnit.MILLISECONDS);
                break Label_0108;
            }
            catch (final Exception ex) {
                if (ex instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                this.Q(107, 28, h1.E.E);
                q0.h("BillingClientTesting", "An error occurred while retrieving billing override.", (Throwable)ex);
                intValue = n2;
                break Label_0108;
            }
            catch (final TimeoutException ex2) {}
            this.Q(114, 28, h1.E.E);
            final Throwable t;
            q0.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", t);
            intValue = n2;
        }
        f f;
        if (intValue > 0) {
            f = h1.E.a(intValue, "Billing override value was set by a license tester.");
            this.Q(105, 2, f);
            this.K(f);
        }
        else {
            try {
                f = super.h(flutterActivity, n);
            }
            catch (final Exception ex3) {
                f = h1.E.i;
                this.Q(115, 2, f);
                q0.h("BillingClientTesting", "An internal error occurred.", (Throwable)ex3);
            }
        }
        return f;
    }
    
    @Override
    public final void i(final G g, final g g2) {
        this.R(7, (Consumer)new v(g2, 0), (Runnable)new C2.v((Object)this, (Object)g, (Object)g2, 24));
    }
    
    @Override
    public final void l(final c0 c0) {
        monitorenter(this);
    Label_0324_Outer:
        while (true) {
            Label_0055: {
                try {
                    if (this.O()) {
                        q0.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                        final W1 d = h1.C.d(26);
                        Objects.requireNonNull((Object)d, "ApiSuccess should not be null");
                        super.g.m(d);
                        monitorexit(this);
                        break Label_0374;
                    }
                    break Label_0055;
                }
                finally {
                    monitorexit(this);
                    int n = 0;
                    Label_0341: {
                        n = 41;
                    }
                    String packageName;
                    String name;
                    ComponentName component;
                    Intent intent2;
                    Intent intent;
                    List queryIntentServices;
                    ServiceInfo serviceInfo;
                    int g;
                    Label_0324:Block_5_Outer:
                    while (true) {
                        Label_0344: {
                            break Label_0344;
                            while (true) {
                                Block_12_Outer:Block_9_Outer:
                                while (true) {
                                    q0.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                                    this.Q(38, 26, h1.E.a(-1, "Billing Override Service connection is disconnected."));
                                    monitorexit(this);
                                    break Label_0374;
                                    while (true) {
                                        Block_8: {
                                            while (true) {
                                                while (true) {
                                                    q0.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                                    monitorexit(this);
                                                    break Label_0374;
                                                    n = 39;
                                                    break Label_0344;
                                                    component = new ComponentName(packageName, name);
                                                    intent = new Intent(intent2);
                                                    intent.setComponent(component);
                                                    iftrue(Label_0316:)(!this.F.bindService(intent, (ServiceConnection)this.I, 1));
                                                    continue Label_0324_Outer;
                                                }
                                                Label_0117:
                                                this.G = 1;
                                                q0.f("BillingClientTesting", "Starting Billing Override Service setup.");
                                                this.I = new h((Object)this, 2);
                                                intent2 = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                                                intent2.setPackage("com.google.android.apps.play.billingtestcompanion");
                                                queryIntentServices = this.F.getPackageManager().queryIntentServices(intent2, 0);
                                                iftrue(Label_0341:)(queryIntentServices == null || queryIntentServices.isEmpty());
                                                break Block_8;
                                                packageName = serviceInfo.packageName;
                                                name = serviceInfo.name;
                                                iftrue(Label_0330:)(!Objects.equals((Object)packageName, (Object)"com.google.android.apps.play.billingtestcompanion") || name == null);
                                                continue Block_9_Outer;
                                            }
                                            Label_0330:
                                            q0.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                                            continue Label_0324;
                                        }
                                        serviceInfo = ((ResolveInfo)queryIntentServices.get(0)).serviceInfo;
                                        iftrue(Label_0344:)(serviceInfo == null);
                                        continue Block_5_Outer;
                                    }
                                    q0.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                                    monitorexit(this);
                                    super.l(c0);
                                    return;
                                    Label_0081:
                                    iftrue(Label_0117:)(this.G != 3);
                                    continue Block_12_Outer;
                                }
                                g = this.G;
                                n = 1;
                                iftrue(Label_0081:)(g != 1);
                                continue;
                            }
                        }
                        this.G = 0;
                        q0.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                        this.Q(n, 26, h1.E.a(2, "Billing Override Service unavailable on device."));
                        monitorexit(this);
                        continue Label_0324_Outer;
                        Label_0316:
                        q0.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                        continue Label_0324;
                    }
                }
            }
            break;
        }
    }
}

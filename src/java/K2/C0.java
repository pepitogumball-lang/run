package K2;

import com.google.android.gms.internal.ads.OA;
import com.google.android.gms.internal.ads.V;
import com.google.android.gms.internal.ads.b0;
import com.google.android.gms.internal.ads.V1;
import com.google.android.gms.internal.ads.d4;
import h1.w;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.h4;
import java.util.concurrent.Executor;
import com.google.android.gms.internal.ads.qi;
import android.content.SharedPreferences$Editor;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.gms.internal.ads.Wt;
import java.util.Arrays;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.WF;
import com.google.android.gms.internal.ads.Yt;
import com.google.android.gms.internal.ads.VF;
import com.google.android.gms.internal.ads.ou;
import com.google.android.gms.internal.ads.Ga;
import C.a;
import C2.f;
import F4.c;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import Y0.h;
import com.google.android.gms.internal.ads.tl;
import com.google.android.gms.internal.ads.Hl;
import O2.j;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import o.q1;
import com.google.android.gms.internal.ads.u3;
import com.google.android.gms.internal.ads.aG;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.S1;
import com.google.android.gms.internal.ads.I3;
import android.net.Uri;
import O2.t;
import java.util.concurrent.ExecutorService;
import f2.d;
import android.media.Spatializer;
import com.google.android.gms.internal.ads.x3;
import android.os.Handler;
import com.google.android.gms.internal.ads.y7;
import android.os.Looper;
import com.google.android.gms.internal.ads.bG;
import P.b;
import com.google.android.gms.internal.ads.co;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.gG;
import android.content.Context;
import L4.g;
import V4.F;
import h2.A;
import com.google.android.gms.internal.ads.dG;
import com.google.android.gms.internal.ads.I;

public final class c0 implements I, dG
{
    public static volatile int G = 1;
    public boolean C = c;
    public final Object D = d;
    public Object E = e;
    public final Object F = f;
    
    public c0(final a0 f, final String d) {
        this.F = f;
        A.e(d);
        this.D = d;
    }
    
    public c0(final F f, final g d, final Long e) {
        this.F = f;
        this.D = d;
        this.E = e;
        this.C = false;
    }
    
    public c0(final Context context, final gG gg) {
        AudioManager audioManager;
        if (context == null) {
            audioManager = null;
        }
        else {
            audioManager = (AudioManager)context.getSystemService("audio");
        }
        boolean c = false;
        if (audioManager != null && !co.e(context)) {
            final Spatializer b = P.b.b(audioManager);
            this.D = b;
            if (P.b.a(b) != 0) {
                c = true;
            }
            this.C = c;
            final bG f = new bG(gg);
            this.F = f;
            final Looper myLooper = Looper.myLooper();
            y7.C((Object)myLooper);
            final Handler e = new Handler(myLooper);
            this.E = e;
            P.b.f(b, new x3(e, 2), f);
            return;
        }
        this.D = null;
        this.C = false;
        this.E = null;
        this.F = null;
    }
    
    public c0(final Context e, final String d, final d f, final boolean c) {
        this.E = e;
        this.D = d;
        this.F = f;
        this.C = c;
    }
    
    public c0(final Context d, final ExecutorService e, final t f, final boolean c) {
        this.D = d;
        this.E = e;
        this.F = f;
        this.C = c;
    }
    
    public c0(final Uri f, final String d, final String e, final boolean c, final boolean b) {
        this.F = f;
        this.D = d;
        this.E = e;
        this.C = c;
    }
    
    public c0(final I3 f) {
        this.C = false;
        this.D = null;
        this.E = null;
        this.F = f;
    }
    
    public c0(final I d, final S1 e) {
        this.D = d;
        this.E = e;
        this.F = new SparseArray();
    }
    
    public c0(final Object d, final u3 e) {
        this.C = false;
        this.D = d;
        this.E = e;
        this.F = null;
    }
    
    public c0(final q1 f, final boolean c) {
        this.F = f;
        this.E = new AtomicReference((Object)null);
        this.C = c;
        int n;
        if (c) {
            n = 8192;
        }
        else {
            n = 1024;
        }
        this.D = new AtomicMarkableReference((Object)new m3.d(n), false);
    }
    
    public static c0 d(final Context context, final ExecutorService executorService, final boolean b) {
        final j j = new j();
        if (b) {
            ((Executor)executorService).execute((Runnable)new Hl(context, j));
        }
        else {
            ((Executor)executorService).execute((Runnable)new tl((Object)j, 14));
        }
        return new c0(context, executorService, j.a, b);
    }
    
    public void a() {
        final f g = ((F)this.F).G;
        final C c = new C(16);
        g.getClass();
        new h((Object)g.D, (Object)"dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onBillingServiceDisconnected", (Object)V4.d.d, (Object)null).t((Object)new ArrayList((Collection)Collections.singletonList((Object)this.E)), (c)new E4.b((Object)c, 8));
    }
    
    public boolean b(final String s, final String s2) {
        monitorenter(this);
        Label_0033: {
            try {
                if (!((m3.d)((AtomicMarkableReference)this.D).getReference()).b(s, s2)) {
                    monitorexit(this);
                    return false;
                }
                break Label_0033;
            }
            finally {
                monitorexit(this);
                return true;
                a a = null;
            Block_5:
                while (true) {
                    final AtomicReference atomicReference;
                    iftrue(Label_0107:)(!atomicReference.compareAndSet((Object)null, (Object)a));
                    break Block_5;
                    Label_0107: {
                        iftrue(Label_0074:)(atomicReference.get() == null);
                    }
                    return true;
                    final AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference)this.D;
                    atomicMarkableReference.set((Object)atomicMarkableReference.getReference(), true);
                    monitorexit(this);
                    a = new a((Object)this, 12);
                    atomicReference = (AtomicReference)this.E;
                    continue;
                }
                ((l3.c)((q1)this.F).D).b.a((Runnable)a);
                return true;
            }
        }
    }
    
    public ou c(final int n, final Ga ga, final int[] array) {
        final gG gg = (gG)this.D;
        final aG ag = (aG)this.E;
        final VF vf = new VF(gg, ag);
        final int n2 = ((int[])this.F)[n];
        final Wt d = Yt.D;
        y7.i(4, "initialCapacity");
        Object[] copy = new Object[4];
        int i = 0;
        int n3 = 0;
        while (i < ga.a) {
            final WF wf = new WF(n, ga, i, ag, array[i], this.C, vf);
            final int length = copy.length;
            final int n4 = n3 + 1;
            final int f = St.f(length, n4);
            if (f > length) {
                copy = Arrays.copyOf(copy, f);
            }
            copy[n3] = wf;
            ++i;
            n3 = n4;
        }
        return Yt.x(n3, copy);
    }
    
    public P1 e(final String s, final long n) {
        final Object g = P1.g;
        return new P1(this, s, (Object)n, 0);
    }
    
    public P1 f(final String s, final String s2) {
        final Object g = P1.g;
        return new P1(this, s, (Object)s2, 3);
    }
    
    public P1 g(final String s, final boolean b) {
        final Object g = P1.g;
        return new P1(this, s, (Object)b, 2);
    }
    
    public String h() {
        if (!this.C) {
            this.C = true;
            this.E = ((a0)this.F).D().getString((String)this.D, (String)null);
        }
        return (String)this.E;
    }
    
    public void i(final String e) {
        final SharedPreferences$Editor edit = ((a0)this.F).D().edit();
        edit.putString((String)this.D, e);
        edit.apply();
        this.E = e;
    }
    
    public void j(final int n, final long n2, final Exception ex) {
        this.l(n, n2, ex, null, null);
    }
    
    public void k(final long n, final int n2) {
        this.l(n2, n, null, null, null);
    }
    
    public t l(final int n, final long n2, final Exception ex, final String s, final String s2) {
        if (!this.C) {
            return ((t)this.F).l((Executor)this.E, (O2.a)new qi(24, (byte)0));
        }
        final Context context = (Context)this.D;
        final d4 y = h4.y();
        final String packageName = context.getPackageName();
        ((OA)y).e();
        h4.z((h4)((OA)y).D, packageName);
        ((OA)y).e();
        h4.D((h4)((OA)y).D, n2);
        final int g = c0.G;
        ((OA)y).e();
        h4.F((h4)((OA)y).D, g);
        if (ex != null) {
            final Object a = rt.a;
            final StringWriter stringWriter = new StringWriter();
            ((Throwable)ex).printStackTrace(new PrintWriter((Writer)stringWriter));
            final String string = stringWriter.toString();
            ((OA)y).e();
            h4.E((h4)((OA)y).D, string);
            final String name = ex.getClass().getName();
            ((OA)y).e();
            h4.C((h4)((OA)y).D, name);
        }
        if (s2 != null) {
            ((OA)y).e();
            h4.A((h4)((OA)y).D, s2);
        }
        if (s != null) {
            ((OA)y).e();
            h4.B((h4)((OA)y).D, s);
        }
        return ((t)this.F).l((Executor)this.E, (O2.a)new w((Object)y, n));
    }
    
    public void t() {
        ((I)this.D).t();
        if (this.C) {
            int n = 0;
            while (true) {
                final SparseArray sparseArray = (SparseArray)this.F;
                if (n >= sparseArray.size()) {
                    break;
                }
                ((V1)sparseArray.valueAt(n)).i = true;
                ++n;
            }
        }
    }
    
    public b0 u(final int n, final int n2) {
        final I i = (I)this.D;
        if (n2 != 3) {
            this.C = true;
            return i.u(n, n2);
        }
        final SparseArray sparseArray = (SparseArray)this.F;
        final V1 v1 = (V1)sparseArray.get(n);
        if (v1 != null) {
            return (b0)v1;
        }
        final V1 v2 = new V1(i.u(n, 3), (S1)this.E);
        sparseArray.put(n, (Object)v2);
        return (b0)v2;
    }
    
    public void v(final V v) {
        ((I)this.D).v(v);
    }
}

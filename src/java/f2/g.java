package f2;

import android.os.Handler;
import android.app.Activity;
import java.lang.ref.Reference;
import g2.y;
import java.util.concurrent.Executor;
import K2.N0;
import java.util.Objects;
import android.os.SystemClock;
import h2.n;
import h2.o;
import O2.j;
import O2.t;
import g2.k;
import g2.w;
import g2.x;
import com.google.android.gms.common.api.internal.BasePendingResult;
import c2.i;
import java.util.Set;
import java.util.Collection;
import t.c;
import java.util.Collections;
import java.util.WeakHashMap;
import g2.l;
import android.app.Fragment;
import java.lang.ref.WeakReference;
import g2.E;
import com.google.android.gms.internal.ads.YD;
import android.os.Build$VERSION;
import h2.A;
import io.flutter.embedding.android.FlutterActivity;
import g2.e;
import g2.q;
import android.os.Looper;
import g2.a;
import X4.C;
import android.content.Context;

public abstract class g
{
    public final Context C;
    public final String D;
    public final C E;
    public final d F;
    public final b G;
    public final a H;
    public final Looper I;
    public final int J;
    public final q K;
    public final c0.b L;
    public final e M;
    
    public g(final Context context, final FlutterActivity flutterActivity, final d f, final b g, final f f2) {
        A.i("Null context is not permitted.", (Object)context);
        A.i("Api must not be null.", (Object)f);
        A.i("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", (Object)f2);
        final Context applicationContext = context.getApplicationContext();
        A.i("The provided context did not have an application context.", (Object)applicationContext);
        this.C = applicationContext;
        final int sdk_INT = Build$VERSION.SDK_INT;
        C e = null;
        String b;
        if (sdk_INT >= 30 && sdk_INT >= 30) {
            b = E.f.b(context);
        }
        else {
            b = null;
        }
        this.D = b;
        if (sdk_INT >= 31) {
            e = new C(YD.d(context), 16);
        }
        this.E = e;
        this.F = f;
        this.G = g;
        this.I = f2.b;
        final a h = new a(f, g, b);
        this.H = h;
        this.K = new q(this);
        final e c = g2.e.c(applicationContext);
        this.M = c;
        this.J = c.J.getAndIncrement();
        this.L = f2.a;
        if (flutterActivity != null && Looper.myLooper() == Looper.getMainLooper()) {
            final WeakHashMap d = g2.E.D;
            final WeakReference weakReference = (WeakReference)d.get((Object)flutterActivity);
            Label_0308: {
                Object o = null;
                if (weakReference != null) {
                    if ((o = ((Reference)weakReference).get()) != null) {
                        break Label_0308;
                    }
                }
                try {
                    final E e2 = (E)((Activity)flutterActivity).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    Label_0293: {
                        if (e2 != null) {
                            o = e2;
                            if (!((Fragment)e2).isRemoving()) {
                                break Label_0293;
                            }
                        }
                        o = new E();
                        ((Activity)flutterActivity).getFragmentManager().beginTransaction().add((Fragment)o, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    d.put((Object)flutterActivity, (Object)new WeakReference(o));
                    l a;
                    if ((a = ((g2.g)o).a()) == null) {
                        final Object c2 = e2.e.c;
                        a = new l((g2.g)o, c);
                    }
                    a.H.add((Object)h);
                    c.d(a);
                }
                catch (final ClassCastException ex) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", (Throwable)ex);
                }
            }
        }
        final A2.b p5 = c.P;
        ((Handler)p5).sendMessage(((Handler)p5).obtainMessage(7, (Object)this));
    }
    
    public final w2.e a() {
        final w2.e e = new w2.e(19, false);
        final Set emptySet = Collections.emptySet();
        if (e.D == null) {
            e.D = new c(0);
        }
        ((c)e.D).addAll((Collection)emptySet);
        final Context c = this.C;
        e.F = c.getClass().getName();
        e.E = c.getPackageName();
        return e;
    }
    
    public final void b(final int n, final i i) {
        final boolean n2 = i.n;
        boolean n3 = true;
        if (!n2) {
            n3 = ((boolean)((ThreadLocal)BasePendingResult.o).get() && n3);
        }
        i.n = n3;
        final e m = this.M;
        m.getClass();
        final w w = new w((g2.A)new x(n, i), m.K.get(), this);
        final A2.b p2 = m.P;
        ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(4, (Object)w));
    }
    
    public final t d(final int n, final k k) {
        final j j = new j();
        final e m = this.M;
        m.getClass();
        final int c = k.c;
        final A2.b p2 = m.P;
        final t a = j.a;
        if (c != 0) {
            Object o3 = null;
            Label_0249: {
                Label_0193: {
                    if (m.e()) {
                        final o o = (o)n.b().C;
                        final a h = this.H;
                        boolean b = true;
                        Label_0199: {
                            if (o != null) {
                                if (!o.D) {
                                    break Label_0193;
                                }
                                final g2.o o2 = (g2.o)m.L.get((Object)h);
                                if (o2 != null) {
                                    final f2.c d = o2.D;
                                    if (!(d instanceof h2.d)) {
                                        break Label_0193;
                                    }
                                    final h2.d d2 = (h2.d)d;
                                    if (d2.w != null && !d2.r()) {
                                        final h2.e a2 = g2.t.a(o2, d2, c);
                                        if (a2 != null) {
                                            ++o2.N;
                                            b = a2.E;
                                            break Label_0199;
                                        }
                                        break Label_0193;
                                    }
                                }
                                b = o.E;
                            }
                        }
                        long currentTimeMillis;
                        if (b) {
                            currentTimeMillis = System.currentTimeMillis();
                        }
                        else {
                            currentTimeMillis = 0L;
                        }
                        long elapsedRealtime;
                        if (b) {
                            elapsedRealtime = SystemClock.elapsedRealtime();
                        }
                        else {
                            elapsedRealtime = 0L;
                        }
                        o3 = new g2.t(m, c, h, currentTimeMillis, elapsedRealtime);
                        break Label_0249;
                    }
                }
                o3 = null;
            }
            if (o3 != null) {
                Objects.requireNonNull((Object)p2);
                a.b((Executor)new N0((Object)p2, 3), (O2.d)o3);
            }
        }
        ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(4, (Object)new w((g2.A)new y(n, k, j, this.L), m.K.get(), this)));
        return a;
    }
}

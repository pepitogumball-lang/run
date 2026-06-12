package w4;

import android.content.res.AssetManager;
import F4.n;
import F4.p;
import F4.v;
import x4.i;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.util.HashSet;
import f2.d;
import io.flutter.plugin.platform.q;
import io.flutter.plugin.platform.r;
import com.google.android.gms.internal.measurement.K1;
import E4.m;
import b1.f;
import c2.k;
import G4.a;
import h1.F;
import m.l;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import a5.b;

public final class c implements b
{
    public static long y = 1L;
    public static final HashMap z;
    public final FlutterJNI a;
    public final j b;
    public final l c;
    public final F d;
    public final a e;
    public final k f;
    public final E4.c g;
    public final f h;
    public final C2.b i;
    public final f j;
    public final E4.k k;
    public final com.google.android.gms.internal.auth.l l;
    public final C2.f m;
    public final C2.b n;
    public final m o;
    public final f p;
    public final C2.b q;
    public final K1 r;
    public final r s;
    public final q t;
    public final d u;
    public final HashSet v;
    public final long w;
    public final w4.a x;
    
    static {
        z = new HashMap();
    }
    
    public c(final Context context, final FlutterJNI flutterJNI, final r d, final String[] array, final boolean b, final boolean a) {
        this.v = new HashSet();
        this.x = new w4.a(this);
        final long y = w4.c.y;
        w4.c.y = 1L + y;
        this.w = y;
        w4.c.z.put((Object)y, (Object)this);
        AssetManager assetManager;
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        }
        catch (final PackageManager$NameNotFoundException ex) {
            assetManager = context.getAssets();
        }
        final k t = c2.k.t();
        FlutterJNI g = flutterJNI;
        if (flutterJNI == null) {
            t.E.getClass();
            g = new FlutterJNI();
        }
        this.a = g;
        final l c = new l(g, assetManager, this.w);
        this.c = c;
        g.setPlatformMessageHandler((x4.j)c.G);
        c2.k.t().getClass();
        this.f = new k(c, g);
        new R3.b(c);
        this.g = new E4.c(c);
        final K1 k1 = new K1(c, 4);
        this.h = new f(c, 8);
        this.i = new C2.b(c, 7);
        this.j = new f(c, 6);
        this.l = new com.google.android.gms.internal.auth.l(c, 4);
        final K1 k2 = new K1(c, context.getPackageManager());
        final p e = new p((F4.f)c, "flutter/restoration", (F4.q)F4.v.b, (c0.b)null);
        final Object i = new Object();
        ((E4.k)i).b = false;
        ((E4.k)i).c = false;
        final f f = new f(i, 10);
        ((E4.k)i).e = e;
        ((E4.k)i).a = a;
        e.b((n)f);
        this.k = (E4.k)i;
        this.m = new C2.f(c);
        this.n = new C2.b(c, 10);
        this.o = new m(c);
        this.p = new f(c, 12);
        this.q = new C2.b(c, 11);
        this.r = new K1(c, 7);
        final a a2 = new a(context, k1);
        this.e = a2;
        final z4.d d2 = (z4.d)t.D;
        if (!g.isAttached()) {
            d2.c(context.getApplicationContext());
            d2.a(context, array);
        }
        final q e2 = new q();
        e2.C = d.C;
        e2.G = g;
        (d.G = g).addEngineLifecycleListener((w4.b)this.x);
        g.setPlatformViewsController(d);
        g.setPlatformViewsController2(e2);
        g.setLocalizationPlugin(a2);
        t.getClass();
        g.setDeferredComponentManager((y4.a)null);
        if (!g.isAttached()) {
            g.attachToNative();
            if (!g.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.b = new j(g);
        this.s = d;
        this.t = e2;
        final d u = new d(5);
        u.D = d;
        u.E = e2;
        this.u = u;
        final F d3 = new F(context.getApplicationContext(), this, d2);
        this.d = d3;
        a2.b(context.getResources().getConfiguration());
        if (b && d2.d.a) {
            u2.f.u(this);
        }
        J5.b.b(context, (b)this);
        d3.a((B4.c)new I4.a(k2));
    }
    
    public c(final Context context, final String[] array) {
        this(context, null, new r(), array, true, false);
    }
}

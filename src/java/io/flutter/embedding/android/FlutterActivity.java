package io.flutter.embedding.android;

import C2.x;
import android.view.ViewGroup;
import android.os.BaseBundle;
import android.view.Surface;
import io.flutter.plugin.platform.D;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import android.view.Window;
import android.util.SparseArray;
import io.flutter.plugin.platform.q;
import android.view.textservice.TextServicesManager;
import com.google.android.gms.internal.measurement.K1;
import android.view.TextureView$SurfaceTextureListener;
import v4.j;
import v4.i;
import android.util.AttributeSet;
import android.content.Context;
import android.view.TextureView;
import v4.l;
import v4.h;
import android.database.ContentObserver;
import android.provider.Settings$System;
import android.view.ViewTreeObserver$OnPreDrawListener;
import v4.d;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.accessibility.AccessibilityManager;
import h1.m;
import com.google.android.gms.internal.ads.vo;
import w4.f;
import u0.k;
import F4.p;
import java.util.Iterator;
import h1.F;
import android.os.Trace;
import F4.r;
import java.util.Collection;
import java.util.HashSet;
import o.q1;
import a5.a;
import java.util.Objects;
import android.content.Intent;
import android.util.Log;
import androidx.lifecycle.o;
import G0.g;
import v4.b;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.activity.s;
import v4.c;
import android.os.Build$VERSION;
import android.view.View;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.v;
import v4.e;
import androidx.lifecycle.t;
import android.app.Activity;

public class FlutterActivity extends Activity implements t
{
    public static final int G;
    public boolean C;
    public e D;
    public final v E;
    public final OnBackInvokedCallback F;
    
    static {
        G = View.generateViewId();
    }
    
    public FlutterActivity() {
        this.C = false;
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object f;
        if (sdk_INT < 33) {
            f = null;
        }
        else if (sdk_INT >= 34) {
            f = new c(this);
        }
        else {
            f = new s((Object)this, 3);
        }
        this.F = (OnBackInvokedCallback)f;
        this.E = new v((t)this);
    }
    
    public final String a() {
        if ((((Context)this).getApplicationInfo().flags & 0x2) != 0x0 && "android.intent.action.RUN".equals((Object)this.getIntent().getAction())) {
            final String dataString = this.getIntent().getDataString();
            if (dataString != null) {
                return dataString;
            }
        }
        return null;
    }
    
    public final int b() {
        if (!this.getIntent().hasExtra("background_mode")) {
            return 1;
        }
        final String stringExtra = this.getIntent().getStringExtra("background_mode");
        if (stringExtra != null) {
            int n;
            if (stringExtra.equals((Object)"opaque")) {
                n = 1;
            }
            else {
                if (!stringExtra.equals((Object)"transparent")) {
                    throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
                }
                n = 2;
            }
            return n;
        }
        throw new NullPointerException("Name is null");
    }
    
    public final String c() {
        return this.getIntent().getStringExtra("cached_engine_id");
    }
    
    public final String d() {
        String s = "main";
        if (this.getIntent().hasExtra("dart_entrypoint")) {
            return this.getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            final Bundle f = this.f();
            String string;
            if (f != null) {
                string = ((BaseBundle)f).getString("io.flutter.Entrypoint");
            }
            else {
                string = null;
            }
            if (string != null) {
                s = string;
            }
            return s;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return s;
        }
    }
    
    public final String e() {
        if (this.getIntent().hasExtra("route")) {
            return this.getIntent().getStringExtra("route");
        }
        final String s = null;
        try {
            final Bundle f = this.f();
            String string = s;
            if (f != null) {
                string = ((BaseBundle)f).getString("io.flutter.InitialRoute");
            }
            return string;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return s;
        }
    }
    
    public final Bundle f() {
        return ((Context)this).getPackageManager().getActivityInfo(this.getComponentName(), 128).metaData;
    }
    
    public final void g(final boolean b) {
        if (b && !this.C) {
            if (Build$VERSION.SDK_INT >= 33) {
                b.b(b.a(this), this.F);
                this.C = true;
            }
        }
        else if (!b && this.C && Build$VERSION.SDK_INT >= 33) {
            g.x(b.a(this), this.F);
            this.C = false;
        }
    }
    
    public final o getLifecycle() {
        return (o)this.E;
    }
    
    public final boolean h() {
        boolean b = this.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (this.c() == null) {
            if (this.D.g) {
                b = b;
            }
            else {
                b = this.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
            }
        }
        return b;
    }
    
    public final boolean i() {
        if (this.getIntent().hasExtra("enable_state_restoration")) {
            return this.getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return this.c() == null;
    }
    
    public final boolean j(final String s) {
        final e d = this.D;
        if (d == null) {
            final StringBuilder sb = new StringBuilder("FlutterActivity ");
            sb.append(this.hashCode());
            sb.append(" ");
            sb.append(s);
            sb.append(" called after release.");
            Log.w("FlutterActivity", sb.toString());
            return false;
        }
        if (!d.j) {
            final StringBuilder sb2 = new StringBuilder("FlutterActivity ");
            sb2.append(this.hashCode());
            sb2.append(" ");
            sb2.append(s);
            sb2.append(" called after detach.");
            Log.w("FlutterActivity", sb2.toString());
            return false;
        }
        return true;
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        if (this.j("onActivityResult")) {
            final e d = this.D;
            d.c();
            if (d.b != null) {
                Objects.toString((Object)intent);
                final F d2 = d.b.d;
                if (d2.f()) {
                    a.b("FlutterEngineConnectionRegistry#onActivityResult");
                    Label_0152: {
                        try {
                            final q1 q1 = (q1)d2.g;
                            q1.getClass();
                            final Iterator iterator = new HashSet((Collection)q1.F).iterator();
                        Label_0098:
                            while (true) {
                                int n3 = 0;
                                while (iterator.hasNext()) {
                                    if (!((r)iterator.next()).onActivityResult(n, n2, intent) && n3 == 0) {
                                        continue Label_0098;
                                    }
                                    n3 = 1;
                                }
                                break Label_0152;
                            }
                        }
                        finally {
                            try {
                                Trace.endSection();
                            }
                            finally {
                                final Throwable t;
                                final Throwable t2;
                                t.addSuppressed(t2);
                            }
                            Trace.endSection();
                            return;
                        }
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onBackPressed() {
        if (this.j("onBackPressed")) {
            final e d = this.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                ((p)b.i.D).a("popRoute", (Object)null, (F4.o)null);
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onCreate(Bundle d) {
        try {
            final Bundle f = this.f();
            if (f != null) {
                final int int1 = ((BaseBundle)f).getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (int1 != -1) {
                    ((Context)this).setTheme(int1);
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(d);
        if (d != null) {
            this.g(((BaseBundle)d).getBoolean("enableOnBackInvokedCallbackState"));
        }
        final e e = new e(this);
        (this.D = e).c();
        final w4.c b = e.b;
        final int n = 0;
        if (b == null) {
            final String c = e.a.c();
            if (c != null) {
                if (k.b == null) {
                    k.b = new k();
                }
                final w4.c b2 = (w4.c)k.b.a.get((Object)c);
                e.b = b2;
                e.g = true;
                if (b2 == null) {
                    throw new IllegalStateException(m0.a.g("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", c, "'"));
                }
            }
            else {
                e.a.getClass();
                e.b = null;
                final String stringExtra = e.a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (f.b == null) {
                        final Class<f> clazz;
                        monitorenter(clazz = f.class);
                        Label_0266: {
                            try {
                                if (f.b == null) {
                                    f.b = new f(0);
                                }
                                break Label_0266;
                            }
                            finally {
                                monitorexit(clazz);
                                monitorexit(clazz);
                            }
                        }
                    }
                    final w4.e e2 = (w4.e)f.b.a.get((Object)stringExtra);
                    if (e2 == null) {
                        throw new IllegalStateException(m0.a.g("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", stringExtra, "'"));
                    }
                    final FlutterActivity a = e.a;
                    a.getClass();
                    final vo vo = new vo(a);
                    e.a(vo);
                    e.b = e2.a(vo);
                    e.g = false;
                }
                else {
                    final FlutterActivity a2 = e.a;
                    a2.getClass();
                    final w4.e e3 = new w4.e(a2, a4.c.a(e.a.getIntent()).b());
                    final FlutterActivity a3 = e.a;
                    a3.getClass();
                    final vo vo2 = new vo(a3);
                    vo2.C = false;
                    vo2.D = e.a.i();
                    e.a(vo2);
                    e.b = e3.a(vo2);
                    e.g = false;
                }
            }
        }
        e.a.getClass();
        final F d2 = e.b.d;
        final v e4 = e.a.E;
        d2.getClass();
        a.b("FlutterEngineConnectionRegistry#attachToActivity");
        Label_0543: {
            try {
                final e e5 = (e)d2.f;
                if (e5 != null) {
                    e5.b();
                }
                break Label_0543;
            }
            finally {
                try {
                    Trace.endSection();
                }
                finally {
                    final Throwable t;
                    ((Throwable)d).addSuppressed(t);
                }
                while (true) {
                    q t2 = null;
                    SparseArray k;
                    int n2 = 0;
                    final E4.k i;
                    io.flutter.embedding.engine.renderer.a a4;
                    io.flutter.plugin.platform.r s;
                    SparseArray o;
                    int n3;
                    l c2;
                    w4.c b3;
                    io.flutter.view.g r;
                    boolean enabled;
                    boolean touchExplorationEnabled;
                    boolean b4;
                    SparseArray n4;
                    int n5;
                    final E4.j j;
                    byte[] byteArray = null;
                    l c3;
                    Window window;
                    int n6;
                    e d3 = null;
                    w4.c l;
                    io.flutter.plugin.platform.r s2;
                    w4.c m;
                    q t3;
                    int n7;
                    SparseArray l2;
                    int n8;
                    w4.c b5;
                    F d4;
                    Iterator iterator;
                    final Throwable t4;
                    int b6;
                    SparseArray q;
                    FlutterActivity a5;
                    h h;
                    FlutterActivity a6;
                    Iterator iterator2;
                    FlutterActivity a7;
                    TextureView textureView;
                    FlutterActivity a8;
                    io.flutter.embedding.engine.renderer.j b7;
                    w4.c j2;
                    TextServicesManager s3;
                    FlutterActivity a9;
                    FlutterActivity a10;
                    FlutterActivity a11;
                    w4.c b8;
                    FlutterActivity a12;
                    w4.c b9;
                    C2.b n9;
                    int g;
                    Object o2;
                    FlutterActivity a13;
                    Label_2215:Label_0901_Outer:
                    while (true) {
                    Label_0901:
                        while (true) {
                            Block_25:Block_48_Outer:Label_1990_Outer:Label_1564_Outer:
                            while (true) {
                                k = t2.K;
                                iftrue(Label_2182:)(n2 >= k.size());
                                Block_44: {
                                    break Block_44;
                                    Label_0849: {
                                        iftrue(Label_0895:)(!i.c);
                                    }
                                    break Block_25;
                                    Label_2340: {
                                    Label_1945:
                                        while (true) {
                                        Block_40:
                                            while (true) {
                                            Label_1293_Outer:
                                                while (true) {
                                                    Label_1374: {
                                                    Label_1293:
                                                        while (true) {
                                                        Label_0783_Outer:
                                                            while (true) {
                                                                Block_49: {
                                                                Label_0783:
                                                                    while (true) {
                                                                        Block_22: {
                                                                        Label_1785:
                                                                            while (true) {
                                                                                Block_37: {
                                                                                    Label_0741: {
                                                                                        while (true) {
                                                                                            Block_28_Outer:Label_2092_Outer:
                                                                                            while (true) {
                                                                                            Label_2092:
                                                                                                while (true) {
                                                                                                    Block_31: {
                                                                                                    Block_29_Outer:
                                                                                                        while (true) {
                                                                                                            Label_1019: {
                                                                                                                while (true) {
                                                                                                                    Label_1056: {
                                                                                                                        Label_1009: {
                                                                                                                        Label_1990:
                                                                                                                            while (true) {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        Block_47: {
                                                                                                                                            while (true) {
                                                                                                                                                Label_2035: {
                                                                                                                                                    Label_1071: {
                                                                                                                                                        Block_34: {
                                                                                                                                                            while (true) {
                                                                                                                                                                Label_2305: {
                                                                                                                                                                    Block_41: {
                                                                                                                                                                        while (true) {
                                                                                                                                                                            a4.b();
                                                                                                                                                                            break Label_2215;
                                                                                                                                                                            iftrue(Label_2265:)(((e)d).f == null);
                                                                                                                                                                            break Block_49;
                                                                                                                                                                            o = s.O;
                                                                                                                                                                            iftrue(Label_2033:)(n3 >= o.size());
                                                                                                                                                                            break Block_41;
                                                                                                                                                                            iftrue(Label_2215:)(!c2.I);
                                                                                                                                                                            continue Block_48_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        new m(c2, c2.M.b, c2.J.m);
                                                                                                                                                                        c2.O = c2.J.e;
                                                                                                                                                                        c2.P = new c2.k(c2);
                                                                                                                                                                        c2.Q = new v4.a(c2.J.b, false);
                                                                                                                                                                        r = new io.flutter.view.g(c2, b3.f, (AccessibilityManager)((View)c2).getContext().getSystemService("accessibility"), ((View)c2).getContext().getContentResolver(), (io.flutter.plugin.platform.k)b3.u);
                                                                                                                                                                        c2.R = r;
                                                                                                                                                                        r.s = c2.V;
                                                                                                                                                                        enabled = r.c.isEnabled();
                                                                                                                                                                        touchExplorationEnabled = c2.R.c.isTouchExplorationEnabled();
                                                                                                                                                                        iftrue(Label_1779:)(c2.J.b.a.getIsSoftwareRenderingEnabled());
                                                                                                                                                                        break Block_37;
                                                                                                                                                                        ((View)((e)d).c).setId(FlutterActivity.G);
                                                                                                                                                                        iftrue(Label_2305:)(!b4);
                                                                                                                                                                        break Block_47;
                                                                                                                                                                        Label_1369:
                                                                                                                                                                        c2.a();
                                                                                                                                                                        break Label_1374;
                                                                                                                                                                        ((io.flutter.plugin.platform.f)n4.valueAt(n5)).onFlutterViewAttached((View)s.F);
                                                                                                                                                                        ++n5;
                                                                                                                                                                        break Label_2035;
                                                                                                                                                                        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
                                                                                                                                                                        break Label_1056;
                                                                                                                                                                        j.success((Object)E4.k.d(byteArray));
                                                                                                                                                                        i.f = null;
                                                                                                                                                                        i.d = byteArray;
                                                                                                                                                                        break Label_0901;
                                                                                                                                                                        ((e)d).f = new d((e)d, c3);
                                                                                                                                                                        ((View)c3).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)((e)d).f);
                                                                                                                                                                        break Label_2305;
                                                                                                                                                                        ((e)d).c.H.add((Object)((e)d).l);
                                                                                                                                                                        ((e)d).a.getClass();
                                                                                                                                                                        c2 = ((e)d).c;
                                                                                                                                                                        b3 = ((e)d).b;
                                                                                                                                                                        c2.getClass();
                                                                                                                                                                        Objects.toString((Object)b3);
                                                                                                                                                                        iftrue(Label_1374:)(!c2.c());
                                                                                                                                                                        break Block_34;
                                                                                                                                                                        Label_0895:
                                                                                                                                                                        i.d = byteArray;
                                                                                                                                                                        break Label_0901;
                                                                                                                                                                        window.setStatusBarColor(1073741824);
                                                                                                                                                                        break Label_2340;
                                                                                                                                                                    }
                                                                                                                                                                    ((ViewGroup)s.F).addView((View)o.valueAt(n3));
                                                                                                                                                                    ++n3;
                                                                                                                                                                    continue Label_1990;
                                                                                                                                                                    n6 = 1;
                                                                                                                                                                    break Label_1071;
                                                                                                                                                                    Label_0781:
                                                                                                                                                                    byteArray = null;
                                                                                                                                                                    break Label_0783;
                                                                                                                                                                    Label_1779:
                                                                                                                                                                    ((View)c2).setWillNotDraw(false);
                                                                                                                                                                    break Label_1785;
                                                                                                                                                                }
                                                                                                                                                                this.setContentView((View)((e)d).c);
                                                                                                                                                                window = this.getWindow();
                                                                                                                                                                window.addFlags(Integer.MIN_VALUE);
                                                                                                                                                                iftrue(Label_2340:)(Build$VERSION.SDK_INT >= 35);
                                                                                                                                                                continue Block_29_Outer;
                                                                                                                                                            }
                                                                                                                                                            Label_2033:
                                                                                                                                                            n5 = 0;
                                                                                                                                                            break Label_2035;
                                                                                                                                                        }
                                                                                                                                                        iftrue(Label_1369:)(b3 != c2.J);
                                                                                                                                                        break Label_0901;
                                                                                                                                                        iftrue(Label_0901:)(!d3.a.i());
                                                                                                                                                        break Label_2215;
                                                                                                                                                        l = c2.J;
                                                                                                                                                        s2 = l.s;
                                                                                                                                                        s2.K.a = c2.R;
                                                                                                                                                        s2.D = new v4.a(l.b, true);
                                                                                                                                                        m = c2.J;
                                                                                                                                                        t3 = m.t;
                                                                                                                                                        t3.J.a = c2.R;
                                                                                                                                                        t3.D = new v4.a(m.b, true);
                                                                                                                                                        c2.M.b.restartInput((View)c2);
                                                                                                                                                        c2.d();
                                                                                                                                                        ((View)c2).getContext().getContentResolver().registerContentObserver(Settings$System.getUriFor("show_password"), false, (ContentObserver)c2.W);
                                                                                                                                                        c2.e();
                                                                                                                                                        s = b3.s;
                                                                                                                                                        s.F = c2;
                                                                                                                                                        n7 = 0;
                                                                                                                                                        break Label_1945;
                                                                                                                                                        ((ViewGroup)t2.F).addView((View)l2.valueAt(n8));
                                                                                                                                                        ++n8;
                                                                                                                                                        break Label_2092;
                                                                                                                                                        break Label_0741;
                                                                                                                                                    }
                                                                                                                                                    b4 = (n6 == 1);
                                                                                                                                                    ((e)d).c();
                                                                                                                                                    iftrue(Label_1181:)(((e)d).a.b() != 1);
                                                                                                                                                    break Block_31;
                                                                                                                                                }
                                                                                                                                                n4 = s.N;
                                                                                                                                                iftrue(Label_2076:)(n5 >= n4.size());
                                                                                                                                                continue Block_28_Outer;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        c3 = ((e)d).c;
                                                                                                                                        iftrue(Label_2294:)(((e)d).a.b() != 1);
                                                                                                                                        continue Label_1990_Outer;
                                                                                                                                    }
                                                                                                                                    Label_0736:
                                                                                                                                    u2.f.u(b5);
                                                                                                                                    break Label_0741;
                                                                                                                                    a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                                                                                                                                    try {
                                                                                                                                        iterator = ((HashSet)((q1)d4.g).I).iterator();
                                                                                                                                        if (!iterator.hasNext()) {
                                                                                                                                            Trace.endSection();
                                                                                                                                            break Label_1019;
                                                                                                                                        }
                                                                                                                                        if (iterator.next() == null) {
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        throw new ClassCastException();
                                                                                                                                    }
                                                                                                                                    finally {
                                                                                                                                        try {
                                                                                                                                            Trace.endSection();
                                                                                                                                        }
                                                                                                                                        finally {
                                                                                                                                            ((Throwable)d).addSuppressed(t4);
                                                                                                                                        }
                                                                                                                                        throw new ClassCastException();
                                                                                                                                    }
                                                                                                                                    break Label_1009;
                                                                                                                                    l2 = t2.L;
                                                                                                                                    n2 = n;
                                                                                                                                    iftrue(Label_2139:)(n8 >= l2.size());
                                                                                                                                    continue Label_2092_Outer;
                                                                                                                                }
                                                                                                                                Label_1988:
                                                                                                                                n3 = 0;
                                                                                                                                continue Label_1990;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
                                                                                                                        break Label_1019;
                                                                                                                    }
                                                                                                                    d = (Bundle)this.D;
                                                                                                                    iftrue(Label_1071:)(this.b() != 1);
                                                                                                                    continue Label_0783_Outer;
                                                                                                                }
                                                                                                                Label_2294:
                                                                                                                throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                                                                                                            }
                                                                                                            this.E.e(androidx.lifecycle.m.ON_CREATE);
                                                                                                            b6 = this.b();
                                                                                                            n6 = 2;
                                                                                                            iftrue(Label_1056:)(b6 != 2);
                                                                                                            continue Label_0901_Outer;
                                                                                                        }
                                                                                                        q = s.Q;
                                                                                                        iftrue(Label_1988:)(n7 >= q.size());
                                                                                                        break Block_40;
                                                                                                    }
                                                                                                    a5 = ((e)d).a;
                                                                                                    a5.getClass();
                                                                                                    h = new h(a5, ((e)d).a.b() != 1);
                                                                                                    ((e)d).a.getClass();
                                                                                                    a6 = ((e)d).a;
                                                                                                    a6.getClass();
                                                                                                    ((e)d).c = new l(a6, h);
                                                                                                    continue Label_1293;
                                                                                                    Label_2076:
                                                                                                    t2 = b3.t;
                                                                                                    t2.F = c2;
                                                                                                    n8 = 0;
                                                                                                    continue Label_2092;
                                                                                                }
                                                                                                Label_2182:
                                                                                                iterator2 = c2.K.iterator();
                                                                                                iftrue(Label_2351:)(iterator2.hasNext());
                                                                                                continue Label_1564_Outer;
                                                                                            }
                                                                                            d3.a.getClass();
                                                                                            d4 = d3.b.d;
                                                                                            iftrue(Label_1009:)(!d4.f());
                                                                                            continue;
                                                                                        }
                                                                                        Label_2351:
                                                                                        iterator2.next().getClass();
                                                                                        throw new ClassCastException();
                                                                                    }
                                                                                    e.j = true;
                                                                                    d3 = this.D;
                                                                                    d3.c();
                                                                                    iftrue(Label_0781:)(d == null);
                                                                                    break Block_22;
                                                                                }
                                                                                ((View)c2).setWillNotDraw(!enabled && !touchExplorationEnabled);
                                                                                continue Label_1785;
                                                                            }
                                                                        }
                                                                        d.getBundle("plugins");
                                                                        byteArray = d.getByteArray("framework");
                                                                        continue Label_0783;
                                                                    }
                                                                }
                                                                ((View)c3).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)((e)d).f);
                                                                continue Label_1293_Outer;
                                                            }
                                                            Label_1181:
                                                            a7 = ((e)d).a;
                                                            a7.getClass();
                                                            textureView = new TextureView((Context)a7, (AttributeSet)null);
                                                            ((j)textureView).C = false;
                                                            ((j)textureView).D = false;
                                                            textureView.setSurfaceTextureListener((TextureView$SurfaceTextureListener)new i((j)textureView));
                                                            textureView.setOpaque(((e)d).a.b() == 1);
                                                            ((e)d).a.getClass();
                                                            a8 = ((e)d).a;
                                                            a8.getClass();
                                                            ((e)d).c = new l(a8, (j)textureView);
                                                            continue Label_1293;
                                                        }
                                                    }
                                                    c2.J = b3;
                                                    b7 = b3.b;
                                                    c2.I = b7.d;
                                                    ((io.flutter.embedding.engine.renderer.l)c2.F).c(b7);
                                                    a4 = c2.a0;
                                                    b7.a(a4);
                                                    c2.L = new K1(c2, c2.J.h);
                                                    j2 = c2.J;
                                                    c2.M = new io.flutter.plugin.editing.j(c2, j2.r, j2.m, j2.s, j2.t);
                                                    try {
                                                        s3 = (TextServicesManager)((View)c2).getContext().getSystemService("textservices");
                                                        c2.S = s3;
                                                        c2.N = new io.flutter.plugin.editing.g(s3, c2.J.p);
                                                    }
                                                    catch (final Exception ex2) {
                                                        Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
                                                    }
                                                    continue Label_0901_Outer;
                                                }
                                                d2.e();
                                                d2.f = e;
                                                a9 = e.a;
                                                a9.getClass();
                                                d2.b(a9, e4);
                                                Trace.endSection();
                                                a10 = e.a;
                                                a10.getClass();
                                                a11 = e.a;
                                                b8 = e.b;
                                                a11.getClass();
                                                e.d = new I1.r(a11, b8.l, a11);
                                                a12 = e.a;
                                                b9 = e.b;
                                                a12.getClass();
                                                n9 = b9.n;
                                                g = FlutterActivity.G;
                                                o2 = new Object();
                                                ((x)o2).a = a10;
                                                ((x)o2).b = g;
                                                ((x)o2).c = n9;
                                                n9.D = o2;
                                                e.e = (x)o2;
                                                a13 = e.a;
                                                b5 = e.b;
                                                iftrue(Label_0736:)(!a13.D.g);
                                                continue;
                                            }
                                            ((ViewGroup)s.F).addView((View)q.valueAt(n7));
                                            ++n7;
                                            continue Label_1945;
                                        }
                                    }
                                    window.getDecorView().setSystemUiVisibility(1280);
                                    return;
                                }
                                ((io.flutter.plugin.platform.f)k.valueAt(n2)).onFlutterViewAttached((View)t2.F);
                                ++n2;
                                continue Label_0901_Outer;
                            }
                            ((p)i.e).a("push", (Object)E4.k.d(byteArray), (F4.o)new E4.j((Object)i, 0, (Object)byteArray));
                            continue Label_0901;
                        }
                        continue Label_2215;
                    }
                    i = d3.b.k;
                    i.b = true;
                    j = (E4.j)i.f;
                    iftrue(Label_0849:)(j == null);
                    continue;
                }
            }
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        if (this.j("onDestroy")) {
            this.D.e();
            this.D.f();
        }
        if (Build$VERSION.SDK_INT >= 33) {
            g.x(b.a(this), this.F);
            this.C = false;
        }
        final e d = this.D;
        if (d != null) {
            d.a = null;
            d.b = null;
            d.c = null;
            d.d = null;
            d.e = null;
            this.D = null;
        }
        this.E.e(androidx.lifecycle.m.ON_DESTROY);
    }
    
    public final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        if (this.j("onNewIntent")) {
            final e d = this.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                final F d2 = b.d;
                Label_0130: {
                    if (d2.f()) {
                        a.b("FlutterEngineConnectionRegistry#onNewIntent");
                        Label_0100: {
                            try {
                                final Iterator iterator = ((HashSet)((q1)d2.g).G).iterator();
                                while (iterator.hasNext()) {
                                    ((F4.s)iterator.next()).a(intent);
                                }
                                break Label_0100;
                            }
                            finally {
                                try {
                                    Trace.endSection();
                                }
                                finally {
                                    ((Throwable)d).addSuppressed((Throwable)intent);
                                }
                                Trace.endSection();
                                break Label_0130;
                            }
                        }
                    }
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                final String d3 = d.d(intent);
                if (d3 != null && !d3.isEmpty()) {
                    final C2.b i = d.b.i;
                    i.getClass();
                    final HashMap hashMap = new HashMap();
                    hashMap.put((Object)"location", (Object)d3);
                    ((p)i.D).a("pushRouteInformation", (Object)hashMap, (F4.o)null);
                }
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onPause() {
        super.onPause();
        if (this.j("onPause")) {
            final e d = this.D;
            d.c();
            d.a.getClass();
            final w4.c b = d.b;
            if (b != null) {
                final E4.c g = b.g;
                g.a(3, g.c);
            }
        }
        this.E.e(androidx.lifecycle.m.ON_PAUSE);
    }
    
    public final void onPostResume() {
        super.onPostResume();
        if (this.j("onPostResume")) {
            final e d = this.D;
            d.c();
            if (d.b != null) {
                final I1.r d2 = d.d;
                if (d2 != null) {
                    d2.b();
                }
                d.b.s.m();
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (this.j("onRequestPermissionsResult")) {
            final e d = this.D;
            d.c();
            if (d.b != null) {
                Arrays.toString((Object[])array);
                Arrays.toString(array2);
                final F d2 = d.b.d;
                if (d2.f()) {
                    a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
                        ((q1)d2.g).f(array2, n);
                        Trace.endSection();
                        return;
                    }
                    finally {
                        try {
                            Trace.endSection();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)(Object)array2).addSuppressed(t);
                        }
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.E.e(androidx.lifecycle.m.ON_RESUME);
        if (this.j("onResume")) {
            final e d = this.D;
            d.c();
            d.b.b.i();
            d.a.getClass();
            final w4.c b = d.b;
            if (b != null) {
                final E4.c g = b.g;
                g.a(2, g.c);
            }
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.j("onSaveInstanceState")) {
            final e d = this.D;
            d.c();
            if (d.a.i()) {
                bundle.putByteArray("framework", (byte[])d.b.k.d);
            }
            d.a.getClass();
            final Bundle bundle2 = new Bundle();
            final F d2 = d.b.d;
            Label_0186: {
                if (d2.f()) {
                    a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                    try {
                        final Iterator iterator = ((HashSet)((q1)d2.g).I).iterator();
                        if (!iterator.hasNext()) {
                            Trace.endSection();
                            break Label_0186;
                        }
                        if (iterator.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    finally {
                        try {
                            Trace.endSection();
                        }
                        finally {
                            ((Throwable)bundle).addSuppressed((Throwable)bundle2);
                        }
                        throw new ClassCastException();
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (d.a.c() != null && !d.a.h()) {
                ((BaseBundle)bundle).putBoolean("enableOnBackInvokedCallbackState", d.a.C);
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.E.e(androidx.lifecycle.m.ON_START);
        if (!this.j("onStart")) {
            return;
        }
        final e d = this.D;
        d.c();
        Label_0288: {
            if (d.a.c() != null) {
                break Label_0288;
            }
            if (d.b.c.D) {
                break Label_0288;
            }
            Object o;
            if ((o = d.a.e()) == null) {
                final FlutterActivity a = d.a;
                a.getClass();
                if ((o = d.d(a.getIntent())) == null) {
                    o = "/";
                }
            }
            final FlutterActivity a2 = d.a;
            a2.getClass();
            while (true) {
                try {
                    final Bundle f = a2.f();
                    String string;
                    if (f != null) {
                        string = ((BaseBundle)f).getString("io.flutter.EntrypointUri");
                    }
                    else {
                        string = null;
                    }
                    d.a.d();
                    ((p)d.b.i.D).a("setInitialRoute", o, (F4.o)null);
                    final String a3 = d.a.a();
                    Label_0217: {
                        if (a3 != null) {
                            o = a3;
                            if (!a3.isEmpty()) {
                                break Label_0217;
                            }
                        }
                        o = ((z4.d)c2.k.t().D).d.c;
                    }
                    if (string == null) {
                        o = new x4.a((String)o, d.a.d());
                    }
                    else {
                        o = new x4.a((String)o, string, d.a.d());
                    }
                    d.b.c.b((x4.a)o, (List)d.a.getIntent().getSerializableExtra("dart_entrypoint_args"));
                    o = d.k;
                    if (o != null) {
                        d.c.setVisibility((int)o);
                    }
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void onStop() {
        super.onStop();
        if (this.j("onStop")) {
            final e d = this.D;
            d.c();
            d.a.getClass();
            final w4.c b = d.b;
            if (b != null) {
                final E4.c g = b.g;
                g.a(5, g.c);
            }
            d.k = ((View)d.c).getVisibility();
            d.c.setVisibility(8);
            final w4.c b2 = d.b;
            if (b2 != null) {
                b2.b.f(40);
            }
        }
        this.E.e(androidx.lifecycle.m.ON_STOP);
    }
    
    public final void onTrimMemory(final int n) {
        super.onTrimMemory(n);
        if (this.j("onTrimMemory")) {
            final e d = this.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                if (d.i && n >= 10) {
                    final FlutterJNI flutterJNI = (FlutterJNI)b.c.E;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    final C2.b q = d.b.q;
                    q.getClass();
                    final HashMap hashMap = new HashMap(1);
                    hashMap.put((Object)"type", (Object)"memoryPressure");
                    ((Y0.h)q.D).t((Object)hashMap, (F4.c)null);
                }
                d.b.b.f(n);
                final io.flutter.plugin.platform.r s = d.b.s;
                if (n < 40) {
                    s.getClass();
                }
                else {
                    final Iterator iterator = s.L.values().iterator();
                    while (iterator.hasNext()) {
                        ((D)iterator.next()).h.setSurface((Surface)null);
                    }
                }
            }
        }
    }
    
    public final void onUserLeaveHint() {
        if (this.j("onUserLeaveHint")) {
            final e d = this.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                final F d2 = b.d;
                if (d2.f()) {
                    a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
                        final Iterator iterator = ((HashSet)((q1)d2.g).H).iterator();
                        if (!iterator.hasNext()) {
                            Trace.endSection();
                            return;
                        }
                        if (iterator.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    finally {
                        try {
                            Trace.endSection();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                        throw new ClassCastException();
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (this.j("onWindowFocusChanged")) {
            final e d = this.D;
            d.c();
            d.a.getClass();
            final w4.c b2 = d.b;
            if (b2 != null) {
                final E4.c g = b2.g;
                if (b) {
                    g.a(g.a, true);
                }
                else {
                    g.a(g.a, false);
                }
            }
        }
    }
}

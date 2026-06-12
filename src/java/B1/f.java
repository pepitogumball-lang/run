package b1;

import android.os.BaseBundle;
import C.u;
import K2.B;
import com.google.android.gms.internal.ads.FB;
import java.lang.ref.Reference;
import com.google.android.gms.internal.ads.ww;
import android.os.SystemClock;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import K2.l1;
import java.nio.ByteBuffer;
import E4.i;
import android.util.Log;
import io.flutter.plugin.platform.r;
import E4.k;
import android.os.Build$VERSION;
import C2.x;
import com.google.android.gms.internal.ads.Wh;
import com.google.android.gms.internal.ads.kn;
import com.google.android.gms.internal.ads.ui;
import java.util.Iterator;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.K1;
import androidx.work.impl.WorkDatabase;
import java.util.Locale;
import android.content.Context;
import android.content.res.Configuration;
import com.google.android.gms.internal.ads.ye;
import com.google.android.gms.ads.internal.overlay.zzm;
import n5.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import android.app.Activity;
import n5.e;
import android.net.Uri;
import C2.a0;
import K2.P;
import K2.x0;
import K2.n0;
import K2.y1;
import android.text.TextUtils;
import android.os.Bundle;
import android.view.ContentInfo$Builder;
import C2.G;
import C2.g;
import android.app.Application;
import C2.o;
import C2.I;
import C2.H;
import C2.V;
import java.util.List;
import java.util.Arrays;
import E4.a;
import java.util.HashMap;
import android.window.BackEvent;
import java.util.Map;
import android.content.ClipData;
import O2.j;
import com.google.android.gms.internal.auth.l;
import c0.b;
import F4.q;
import F4.p;
import F4.v;
import java.util.Objects;
import java.util.EnumMap;
import K2.y0;
import d2.m;
import com.google.android.gms.internal.ads.Cv;
import O.d;
import K2.I1;
import com.google.android.gms.internal.ads.Ne;
import F4.n;
import S2.c;
import C2.W;

public class f implements W, c, n, Ne, I1, d, O2.f, Cv
{
    public final int C;
    public Object D;
    
    public f(final int c) {
        switch (this.C = c) {
            default: {
                this.D = new m(1);
                return;
            }
            case 17: {
                this.D = new EnumMap((Class)y0.class);
            }
        }
    }
    
    public f(final C2.f f, final f d) {
        this.C = 25;
        this.D = d;
        Objects.requireNonNull((Object)f);
    }
    
    public f(final F4.f f) {
        this.C = 7;
        new p(f, "flutter/keyboard", (q)v.b, (b)null).b((n)new l(this));
    }
    
    public f(final j d) {
        this.C = 26;
        Objects.requireNonNull((Object)d);
        this.D = d;
    }
    
    public f(final ClipData clipData, final int n) {
        this.C = 23;
        this.D = O.c.n(clipData, n);
    }
    
    public f(final EnumMap enumMap) {
        this.C = 17;
        ((EnumMap)(this.D = new EnumMap((Class)y0.class))).putAll((Map)enumMap);
    }
    
    public f(final m.l l, final int c) {
        switch (this.C = c) {
            default: {
                ((p)(this.D = new p((F4.f)l, "flutter/backgesture", (q)v.b, (b)null))).b((n)new C3.f(3));
                return;
            }
            case 12: {
                new p((F4.f)l, "flutter/spellcheck", (q)v.b, (b)null).b((n)new C2.f((Object)this, 9));
                return;
            }
            case 8: {
                new p((F4.f)l, "flutter/mousecursor", (q)v.b, (b)null).b((n)new C2.f((Object)this, 5));
            }
        }
    }
    
    public static HashMap h(final BackEvent backEvent) {
        final HashMap hashMap = new HashMap(3);
        final float a = E4.a.a(backEvent);
        final float u = E4.a.u(backEvent);
        List list;
        if (!Float.isNaN(a) && !Float.isNaN(u)) {
            list = Arrays.asList((Object[])new Float[] { a, u });
        }
        else {
            list = null;
        }
        hashMap.put((Object)"touchOffset", (Object)list);
        hashMap.put((Object)"progress", (Object)E4.a.y(backEvent));
        hashMap.put((Object)"swipeEdge", (Object)E4.a.c(backEvent));
        return hashMap;
    }
    
    public Object a() {
        switch (this.C) {
            default: {
                final V v = (V)this.D;
                if (v != null) {
                    return v.a();
                }
                throw new IllegalStateException();
            }
            case 3: {
                final G b = H.b;
                I.c((Object)b);
                return new o((C2.b)this.D, b);
            }
            case 2: {
                return new g((Application)((C2.b)this.D).D);
            }
        }
    }
    
    public O.g b() {
        return new O.g((O.f)new C2.b(O.c.o((ContentInfo$Builder)this.D)));
    }
    
    public void b0(final String s, final String s2, final Bundle bundle) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final y1 y1 = (y1)this.D;
        if (empty) {
            final n0 n = y1.N;
            if (n != null) {
                final P k = n.K;
                n0.f((x0)k);
                k.H.g("AppId not known when logging event", (Object)s2);
            }
        }
        else {
            y1.l().E((Runnable)new A1.b((Object)this, s, s2, (Object)bundle, 7));
        }
    }
    
    public void c(final S2.f f) {
        final a0 a0 = (a0)this.D;
        final Object e = a0.e;
        synchronized (e) {
            a0.g = false;
        }
    }
    
    public void d(final Bundle bundle) {
        O.c.z((ContentInfo$Builder)this.D, bundle);
    }
    
    public void e(final Object o) {
        final Void void1 = (Void)o;
        ((j)((f)this.D).D).a.r();
    }
    
    public void f(final Uri uri) {
        O.c.y((ContentInfo$Builder)this.D, uri);
    }
    
    public void g(final int n) {
        O.c.x((ContentInfo$Builder)this.D, n);
    }
    
    public I0.d i(final Object o, final e e, final Activity activity, final N0.b b) {
        final Object proxyInstance = Proxy.newProxyInstance((ClassLoader)this.D, new Class[] { this.n() }, (InvocationHandler)new I0.c(e, b));
        h.d("newProxyInstance(loader,\u2026onsumerClass()), handler)", proxyInstance);
        o.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, this.n()).invoke(o, new Object[] { activity, proxyInstance });
        return new I0.d(o.getClass().getMethod("removeWindowLayoutInfoListener", this.n()), o, proxyInstance);
    }
    
    public void j(final String s, final int n, final String s2, final boolean b) {
        final ye e = ((zzm)this.D).E;
        if (e != null) {
            e.d0();
        }
    }
    
    public String k(String string, String packageName) {
        final G4.a a = (G4.a)this.D;
        Context context = a.b;
        if (packageName != null) {
            final Locale a2 = G4.a.a(packageName);
            final Configuration configuration = new Configuration(a.b.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = a.b.createConfigurationContext(configuration);
        }
        packageName = a.b.getPackageName();
        final int identifier = context.getResources().getIdentifier(string, "string", packageName);
        if (identifier != 0) {
            string = context.getResources().getString(identifier);
        }
        else {
            string = null;
        }
        return string;
    }
    
    public int l(int n) {
        final Class<f> clazz;
        monitorenter(clazz = f.class);
        Label_0176: {
            try {
                final WorkDatabase workDatabase = (WorkDatabase)this.D;
                ((u0.l)workDatabase).c();
                int n2 = 0;
                int intValue = 0;
                Label_0057: {
                    try {
                        final Long w = workDatabase.j().w("next_job_scheduler_id");
                        n2 = 0;
                        if (w != null) {
                            intValue = w.intValue();
                            break Label_0057;
                        }
                    }
                    finally {
                        break Label_0176;
                    }
                    intValue = 0;
                }
                int n3;
                if (intValue == Integer.MAX_VALUE) {
                    n3 = 0;
                }
                else {
                    n3 = intValue + 1;
                }
                K1 k1 = workDatabase.j();
                k1.z(new a1.c("next_job_scheduler_id", n3));
                ((u0.l)workDatabase).h();
                ((u0.l)workDatabase).f();
                if (intValue >= 0 && intValue <= n) {
                    n = intValue;
                }
                else {
                    k1 = ((WorkDatabase)this.D).j();
                    k1.z(new a1.c("next_job_scheduler_id", 1));
                    n = n2;
                }
                monitorexit(clazz);
                return n;
            }
            finally {
                monitorexit(clazz);
                final u0.l l;
                l.f();
                throw;
            }
        }
    }
    
    public void m(final Activity activity) {
        final m m = (m)this.D;
        final ArrayList list = (ArrayList)m.d;
        for (final WeakReference weakReference : list) {
            if (((Reference)weakReference).get() == activity) {
                list.remove((Object)weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((Window$OnFrameMetricsAvailableListener)m.e);
    }
    
    public Class n() {
        final Class loadClass = ((ClassLoader)this.D).loadClass("java.util.function.Consumer");
        h.d("loader.loadClass(\"java.util.function.Consumer\")", (Object)loadClass);
        return loadClass;
    }
    
    public void o(Object o) {
        final ui ui = (ui)this.D;
        final P1.p p = (P1.p)o;
        synchronized (ui) {
            o = new kn((Object)p, 19);
            ((FB)ui).m1((Wh)o);
        }
    }
    
    public void onMethodCall(F4.m ex, final F4.o o) {
        final int n = 2;
        boolean b = true;
        final int n2 = 0;
        switch (this.C) {
            default: {
                final C2.b b2 = (C2.b)this.D;
                if (b2.D != null) {
                    final String a = ((F4.m)ex).a;
                    a.getClass();
                    int n3 = 0;
                    Label_0175: {
                        switch (a.hashCode()) {
                            case 1615625817: {
                                if (!a.equals((Object)"SensitiveContent.isSupported")) {
                                    break;
                                }
                                n3 = 2;
                                break Label_0175;
                            }
                            case 598223325: {
                                if (!a.equals((Object)"SensitiveContent.setContentSensitivity")) {
                                    break;
                                }
                                n3 = 1;
                                break Label_0175;
                            }
                            case -1937987631: {
                                if (!a.equals((Object)"SensitiveContent.getContentSensitivity")) {
                                    break;
                                }
                                n3 = 0;
                                break Label_0175;
                            }
                        }
                        n3 = -1;
                    }
                    switch (n3) {
                        default: {
                            ((E4.j)o).notImplemented();
                            break;
                        }
                        case 2: {
                            b2.D.getClass();
                            if (Build$VERSION.SDK_INT < 35) {
                                b = false;
                            }
                            ((E4.j)o).success((Object)b);
                            break;
                        }
                        case 1: {
                            final int intValue = (int)((F4.m)ex).b;
                            try {
                                ex = (IllegalArgumentException)b2.D;
                                b2.getClass();
                                int n4;
                                if (intValue != 0) {
                                    if (intValue != 1) {
                                        if (intValue != 2) {
                                            ex = new IllegalArgumentException(Y3.a.j(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                                            throw ex;
                                        }
                                        n4 = n;
                                    }
                                    else {
                                        n4 = 1;
                                    }
                                }
                                else {
                                    n4 = 0;
                                }
                                ((x)ex).k(n4);
                                break;
                            }
                            catch (final IllegalArgumentException ex) {}
                            catch (final IllegalStateException ex2) {}
                            ((E4.j)o).error("error", ((Throwable)ex).getMessage(), (Object)null);
                            break;
                        }
                        case 0: {
                            try {
                                final int i = ((x)b2.D).i();
                                int n5;
                                if (i != 0) {
                                    if (i != 1) {
                                        if (i != 2) {
                                            n5 = 3;
                                        }
                                        else {
                                            n5 = 2;
                                        }
                                    }
                                    else {
                                        n5 = 1;
                                    }
                                }
                                else {
                                    n5 = 0;
                                }
                                ((E4.j)o).success((Object)n5);
                                break;
                            }
                            catch (final IllegalArgumentException ex) {}
                            catch (final IllegalStateException ex3) {}
                            ((E4.j)o).error("error", ((Throwable)ex).getMessage(), (Object)null);
                            break;
                        }
                    }
                }
                return;
            }
            case 10: {
                final String a2 = ((F4.m)ex).a;
                a2.getClass();
                final k k = (k)this.D;
                if (!a2.equals((Object)"get")) {
                    if (!a2.equals((Object)"put")) {
                        ((E4.j)o).notImplemented();
                    }
                    else {
                        k.d = ((F4.m)ex).b;
                        ((E4.j)o).success((Object)null);
                    }
                }
                else {
                    k.c = true;
                    if (!k.b && k.a) {
                        k.f = o;
                    }
                    else {
                        ((E4.j)o).success((Object)E4.k.d((byte[])k.d));
                    }
                }
                return;
            }
            case 9: {
                final l l = (l)this.D;
                if (l.E != null) {
                    final String a3 = ((F4.m)ex).a;
                    a3.getClass();
                    final Object b3 = ((F4.m)ex).b;
                    int n6 = 0;
                    Label_0877: {
                        switch (a3.hashCode()) {
                            case 1671767583: {
                                if (!a3.equals((Object)"dispose")) {
                                    break;
                                }
                                n6 = 7;
                                break Label_0877;
                            }
                            case 576796989: {
                                if (!a3.equals((Object)"setDirection")) {
                                    break;
                                }
                                n6 = 6;
                                break Label_0877;
                            }
                            case 110550847: {
                                if (!a3.equals((Object)"touch")) {
                                    break;
                                }
                                n6 = 5;
                                break Label_0877;
                            }
                            case -308988850: {
                                if (!a3.equals((Object)"synchronizeToNativeViewHierarchy")) {
                                    break;
                                }
                                n6 = 4;
                                break Label_0877;
                            }
                            case -756050293: {
                                if (!a3.equals((Object)"clearFocus")) {
                                    break;
                                }
                                n6 = 3;
                                break Label_0877;
                            }
                            case -934437708: {
                                if (!a3.equals((Object)"resize")) {
                                    break;
                                }
                                n6 = 2;
                                break Label_0877;
                            }
                            case -1019779949: {
                                if (!a3.equals((Object)"offset")) {
                                    break;
                                }
                                n6 = 1;
                                break Label_0877;
                            }
                            case -1352294148: {
                                if (!a3.equals((Object)"create")) {
                                    break;
                                }
                                n6 = 0;
                                break Label_0877;
                            }
                        }
                        n6 = -1;
                    }
                    switch (n6) {
                        default: {
                            ((E4.j)o).notImplemented();
                            break;
                        }
                        case 7: {
                            final int intValue2 = (int)((Map)b3).get((Object)"id");
                            try {
                                final f2.d d = (f2.d)l.E;
                                final io.flutter.plugin.platform.q q = (io.flutter.plugin.platform.q)d.E;
                                if (q.c(intValue2) != null) {
                                    q.R.g(intValue2);
                                }
                                else {
                                    ((r)d.D).Y.g(intValue2);
                                }
                                ((E4.j)o).success((Object)null);
                            }
                            catch (final IllegalStateException ex4) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex4), (Object)null);
                            }
                            break;
                        }
                        case 6: {
                            final Map map = (Map)b3;
                            final int intValue3 = (int)map.get((Object)"id");
                            final int intValue4 = (int)map.get((Object)"direction");
                            try {
                                final f2.d d2 = (f2.d)l.E;
                                final io.flutter.plugin.platform.q q2 = (io.flutter.plugin.platform.q)d2.E;
                                if (q2.c(intValue3) != null) {
                                    q2.R.m(intValue3, intValue4);
                                }
                                else {
                                    ((r)d2.D).Y.m(intValue3, intValue4);
                                }
                                ((E4.j)o).success((Object)null);
                            }
                            catch (final IllegalStateException ex5) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex5), (Object)null);
                            }
                            break;
                        }
                        case 5: {
                            final List list = (List)b3;
                            final int intValue5 = (int)list.get(0);
                            final E4.g g = new E4.g(intValue5, (Number)list.get(1), (Number)list.get(2), (int)list.get(3), (int)list.get(4), list.get(5), list.get(6), (int)list.get(7), (int)list.get(8), (float)(double)list.get(9), (float)(double)list.get(10), (int)list.get(11), (int)list.get(12), (int)list.get(13), (int)list.get(14), ((Number)list.get(15)).longValue());
                            try {
                                final f2.d d3 = (f2.d)l.E;
                                final io.flutter.plugin.platform.q q3 = (io.flutter.plugin.platform.q)d3.E;
                                if (q3.c(intValue5) != null) {
                                    q3.R.j(g);
                                }
                                else {
                                    ((r)d3.D).Y.j(g);
                                }
                                ((E4.j)o).success((Object)null);
                            }
                            catch (final IllegalStateException ex6) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex6), (Object)null);
                            }
                            break;
                        }
                        case 4: {
                            final boolean booleanValue = (boolean)b3;
                            try {
                                ((r)((r)((f2.d)l.E).D).Y.b).T = booleanValue;
                                ((E4.j)o).success((Object)null);
                            }
                            catch (final IllegalStateException ex7) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex7), (Object)null);
                            }
                            break;
                        }
                        case 3: {
                            final int intValue6 = (int)b3;
                            try {
                                final f2.d d4 = (f2.d)l.E;
                                final io.flutter.plugin.platform.q q4 = (io.flutter.plugin.platform.q)d4.E;
                                if (q4.c(intValue6) != null) {
                                    q4.R.c(intValue6);
                                }
                                else {
                                    ((r)d4.D).Y.c(intValue6);
                                }
                                ((E4.j)o).success((Object)null);
                            }
                            catch (final IllegalStateException ex8) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex8), (Object)null);
                            }
                            break;
                        }
                        case 2: {
                            final Map map2 = (Map)b3;
                            final int intValue7 = (int)map2.get((Object)"id");
                            final i j = new i(intValue7, (double)map2.get((Object)"width"), (double)map2.get((Object)"height"));
                            try {
                                final f2.d d5 = (f2.d)l.E;
                                final E4.h h = new E4.h((E4.j)o, 0);
                                d5.getClass();
                                if (((io.flutter.plugin.platform.q)d5.E).c(intValue7) == null) {
                                    ((r)d5.D).Y.l(j, h);
                                }
                            }
                            catch (final IllegalStateException ex9) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex9), (Object)null);
                            }
                            break;
                        }
                        case 1: {
                            final Map map3 = (Map)b3;
                            try {
                                final f2.d d6 = (f2.d)l.E;
                                final int intValue8 = (int)map3.get((Object)"id");
                                final double doubleValue = (double)map3.get((Object)"top");
                                final double doubleValue2 = (double)map3.get((Object)"left");
                                if (((io.flutter.plugin.platform.q)d6.E).c(intValue8) == null) {
                                    ((r)d6.D).Y.i(intValue8, doubleValue, doubleValue2);
                                }
                                ((E4.j)o).success((Object)null);
                            }
                            catch (final IllegalStateException ex10) {
                                ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex10), (Object)null);
                            }
                            break;
                        }
                        case 0: {
                            final Map map4 = (Map)b3;
                            final boolean b4 = map4.containsKey((Object)"hybrid") && (boolean)map4.get((Object)"hybrid");
                            ByteBuffer wrap;
                            if (map4.containsKey((Object)"params")) {
                                wrap = ByteBuffer.wrap((byte[])map4.get((Object)"params"));
                            }
                            else {
                                wrap = null;
                            }
                            Label_2132: {
                                if (b4) {
                                    Label_2451: {
                                        try {
                                            ((r)((f2.d)l.E).D).Y.d(new E4.f((int)map4.get((Object)"id"), (String)map4.get((Object)"viewType"), 0.0, 0.0, 0.0, 0.0, (int)map4.get((Object)"direction"), 3, wrap));
                                            ((E4.j)o).success((Object)null);
                                            break;
                                        }
                                        catch (final IllegalStateException ex11) {
                                            break Label_2451;
                                        }
                                        break Label_2132;
                                    }
                                    final IllegalStateException ex11;
                                    ((E4.j)o).error("error", Log.getStackTraceString((Throwable)ex11), (Object)null);
                                    break;
                                }
                            }
                            int n7 = n2;
                            if (map4.containsKey((Object)"hybridFallback")) {
                                n7 = n2;
                                if (map4.get((Object)"hybridFallback")) {
                                    n7 = 1;
                                }
                            }
                            final int intValue9 = (int)map4.get((Object)"id");
                            final String s = (String)map4.get((Object)"viewType");
                            double doubleValue3;
                            if (map4.containsKey((Object)"top")) {
                                doubleValue3 = (double)map4.get((Object)"top");
                            }
                            else {
                                doubleValue3 = 0.0;
                            }
                            double doubleValue4;
                            if (map4.containsKey((Object)"left")) {
                                doubleValue4 = (double)map4.get((Object)"left");
                            }
                            else {
                                doubleValue4 = 0.0;
                            }
                            final double doubleValue5 = (double)map4.get((Object)"width");
                            final double doubleValue6 = (double)map4.get((Object)"height");
                            final int intValue10 = (int)map4.get((Object)"direction");
                            int n8;
                            if (n7 != 0) {
                                n8 = 2;
                            }
                            else {
                                n8 = 1;
                            }
                            final long e = ((r)((f2.d)l.E).D).Y.e(new E4.f(intValue9, s, doubleValue3, doubleValue4, doubleValue5, doubleValue6, intValue10, n8, wrap));
                            if (e != -2L) {
                                ((E4.j)o).success((Object)e);
                                break;
                            }
                            if (n7 != 0) {
                                ((E4.j)o).success((Object)null);
                                break;
                            }
                            throw new AssertionError((Object)"Platform view attempted to fall back to hybrid mode when not requested.");
                        }
                    }
                }
            }
        }
    }
    
    public void p() {
        final l1 l1 = (l1)this.D;
        ((B)l1).v();
        final K2.a0 t = ((u)l1).t();
        final n0 n0 = (n0)((u)l1).C;
        n0.P.getClass();
        if (t.A(System.currentTimeMillis())) {
            ((u)l1).t().O.a(true);
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (activityManager$RunningAppProcessInfo.importance == 100) {
                ((u)l1).j().P.f("Detected application was in foreground");
                n0.P.getClass();
                this.u(System.currentTimeMillis());
            }
        }
    }
    
    public void q(final long n, final boolean b) {
        final l1 l1 = (l1)this.D;
        ((B)l1).v();
        l1.C();
        if (((u)l1).t().A(n)) {
            ((u)l1).t().O.a(true);
            ((n0)((u)l1).C).o().E();
        }
        ((u)l1).t().S.b(n);
        if (((u)l1).t().O.b()) {
            this.u(n);
        }
    }
    
    public void r(final y0 y0, final int n) {
        K2.g g = K2.g.D;
        Label_0060: {
            if (n != -30) {
                if (n != -20) {
                    if (n == -10) {
                        g = K2.g.G;
                        break Label_0060;
                    }
                    if (n != 0) {
                        if (n != 30) {
                            break Label_0060;
                        }
                        g = K2.g.H;
                        break Label_0060;
                    }
                }
                g = K2.g.I;
            }
            else {
                g = K2.g.J;
            }
        }
        ((EnumMap)this.D).put((Enum)y0, (Object)g);
    }
    
    public void s(final y0 y0, final K2.g g) {
        ((EnumMap)this.D).put((Enum)y0, (Object)g);
    }
    
    public boolean t() {
        final n0 n0 = (n0)this.D;
        if (TextUtils.isEmpty((CharSequence)n0.D)) {
            final P k = n0.K;
            K2.n0.f((x0)k);
            if (k.D(3)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 17: {
                final StringBuilder sb = new StringBuilder("1");
                final y0[] values = y0.values();
                for (int length = values.length, i = 0; i < length; ++i) {
                    K2.g d;
                    if ((d = (K2.g)((EnumMap)this.D).get((Object)values[i])) == null) {
                        d = K2.g.D;
                    }
                    sb.append(d.C);
                }
                return sb.toString();
            }
        }
    }
    
    public void u(final long n) {
        final l1 l1 = (l1)this.D;
        ((B)l1).v();
        final n0 n2 = (n0)((u)l1).C;
        if (!n2.g()) {
            return;
        }
        ((u)l1).t().S.b(n);
        n2.P.getClass();
        ((u)l1).j().P.g("Session started, time", (Object)SystemClock.elapsedRealtime());
        final long n3 = n / 1000L;
        ((B)l1).w().D(n, (Object)n3, "auto", "_sid");
        ((u)l1).t().T.b(n3);
        ((u)l1).t().O.a(false);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_sid", n3);
        ((B)l1).w().C(n, bundle, "auto", "_s");
        final String h = ((u)l1).t().Y.h();
        if (!TextUtils.isEmpty((CharSequence)h)) {
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putString("_ffr", h);
            ((B)l1).w().C(n, bundle2, "auto", "_ssr");
        }
    }
    
    public void v(final Throwable t) {
        final ui ui = (ui)this.D;
        final String message = t.getMessage();
        synchronized (ui) {
            ((FB)ui).m1((Wh)new ww(message, 6));
        }
    }
}

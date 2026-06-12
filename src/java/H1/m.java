package h1;

import com.google.android.gms.internal.play_billing.i1;
import com.google.android.gms.internal.play_billing.h1;
import k3.v;
import n3.u0;
import java.io.FilenameFilter;
import java.io.File;
import android.util.Log;
import com.google.android.gms.internal.play_billing.q2;
import java.util.Iterator;
import E4.j;
import android.app.ActivityManager;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import android.os.Build;
import F4.o;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.d2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.U1;
import V4.G;
import u1.i;
import android.view.MenuItem;
import g4.A;
import O.d0;
import O.e0;
import java.util.concurrent.Executor;
import O2.k;
import X4.C;
import O2.t;
import java.util.WeakHashMap;
import android.view.ViewGroup;
import android.view.View;
import O.H;
import O.V;
import j.y;
import java.util.HashMap;
import h3.d;
import android.view.KeyEvent;
import android.os.Build$VERSION;
import android.view.inputmethod.InputMethodManager;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import n1.p;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.play_billing.e2;
import w2.g;
import android.content.Context;
import C2.f;
import java.util.concurrent.atomic.AtomicInteger;
import android.util.SparseIntArray;
import e2.e;
import z5.c;
import v4.r;
import F4.n;
import p1.b;
import O2.h;
import m.a;

public final class m implements D, a, h, b, n, t3.a, r, U1.a, c
{
    public final int C;
    public Object D = d;
    public Object E = new ArrayList();
    
    public m(final int c) {
        switch (this.C = c) {
            default: {
                final e d = e.d;
                this.D = new SparseIntArray();
                this.E = d;
                return;
            }
            case 8: {
                this.D = new AtomicInteger();
                this.E = new AtomicInteger();
            }
        }
    }
    
    public m(final f d) {
        this.C = 13;
        this.E = new R0.m(12);
        this.D = d;
    }
    
    public m(final Context d, final int c) {
        switch (this.C = c) {
            default: {
                this.D = d;
                this.E = null;
                return;
            }
            case 14: {
                final e2.f b = e2.f.b;
                this.D = new g(d, b);
                final Class<w2.e> clazz;
                monitorenter(clazz = w2.e.class);
                Label_0096: {
                    try {
                        if (w2.e.G == null) {
                            w2.e.G = new w2.e(d.getApplicationContext(), 0);
                        }
                        break Label_0096;
                    }
                    finally {
                        monitorexit(clazz);
                        final w2.e g = w2.e.G;
                        monitorexit(clazz);
                        this.E = g;
                        return;
                    }
                }
                break;
            }
        }
    }
    
    public m(final Context context, final e2 d) {
        this.C = 1;
        final Tl e = new Tl(4);
        try {
            p.b(context);
            e.E = p.a().c(l1.a.e).a("PLAY_BILLING_LIBRARY", new k1.c("proto"), (k1.e)new c0.f(2));
        }
        finally {
            e.D = true;
        }
        this.E = e;
        this.D = d;
    }
    
    public m(final String s) {
        this.C = 0;
        final JSONObject d = new JSONObject(s);
        this.D = d;
        final JSONArray optJSONArray = d.optJSONArray("products");
        final ArrayList e = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); ++i) {
                final JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    e.add((Object)new l(optJSONObject));
                }
            }
        }
        this.E = e;
    }
    
    public m(final v4.l e, final InputMethodManager d, final f f) {
        this.C = 5;
        if (Build$VERSION.SDK_INT >= 33) {
            G0.g.z(e);
        }
        this.E = e;
        this.D = d;
        f.D = this;
    }
    
    public m(final t3.a[] d) {
        this.C = 11;
        this.D = d;
        this.E = new Object();
    }
    
    public void a(final KeyEvent keyEvent, final Tl tl) {
        final int action = keyEvent.getAction();
        boolean b = true;
        if (action != 0 && action != 1) {
            tl.c(false);
            return;
        }
        final Character b2 = ((R0.m)this.E).b(keyEvent.getUnicodeChar());
        if (action == 0) {
            b = false;
        }
        final d d = new d(tl, 11);
        final f f = (f)this.D;
        final HashMap hashMap = new HashMap();
        String s;
        if (b) {
            s = "keyup";
        }
        else {
            s = "keydown";
        }
        hashMap.put((Object)"type", (Object)s);
        hashMap.put((Object)"keymap", (Object)"android");
        hashMap.put((Object)"flags", (Object)keyEvent.getFlags());
        hashMap.put((Object)"plainCodePoint", (Object)keyEvent.getUnicodeChar(0));
        hashMap.put((Object)"codePoint", (Object)keyEvent.getUnicodeChar());
        hashMap.put((Object)"keyCode", (Object)keyEvent.getKeyCode());
        hashMap.put((Object)"scanCode", (Object)keyEvent.getScanCode());
        hashMap.put((Object)"metaState", (Object)keyEvent.getMetaState());
        hashMap.put((Object)"character", (Object)b2.toString());
        hashMap.put((Object)"source", (Object)keyEvent.getSource());
        hashMap.put((Object)"deviceId", (Object)keyEvent.getDeviceId());
        hashMap.put((Object)"repeatCount", (Object)keyEvent.getRepeatCount());
        ((Y0.h)f.D).t((Object)hashMap, (F4.c)new E4.b((Object)d, 0));
    }
    
    public boolean b(final m.b b, final n.l l) {
        final ViewGroup c0 = ((y)this.E).c0;
        final WeakHashMap a = V.a;
        H.c((View)c0);
        return ((a)this.D).b(b, l);
    }
    
    public t c() {
        final t c = ((g)this.D).c();
        final C c2 = new C((Object)this, 20);
        c.getClass();
        return c.e((Executor)k.a, (O2.a)c2);
    }
    
    public void d(final m.b b) {
        ((a)this.D).d(b);
        final y y = (y)this.E;
        if (y.Y != null) {
            y.N.getDecorView().removeCallbacks((Runnable)y.Z);
        }
        if (y.X != null) {
            final d0 a0 = y.a0;
            if (a0 != null) {
                a0.b();
            }
            final d0 a2 = V.a((View)y.X);
            a2.a(0.0f);
            (y.a0 = a2).d((e0)new j.r(this, 2));
        }
        ((j.k)y.P).onSupportActionModeFinished(y.W);
        y.W = null;
        final ViewGroup c0 = y.c0;
        final WeakHashMap a3 = V.a;
        H.c((View)c0);
        y.J();
    }
    
    public Object e(z5.d j, final e5.d d) {
        Object o = null;
        Label_0053: {
            if (d instanceof z5.f) {
                final z5.f f = (z5.f)d;
                final int g = f.G;
                if ((g & Integer.MIN_VALUE) != 0x0) {
                    f.G = g + Integer.MIN_VALUE;
                    o = f;
                    break Label_0053;
                }
            }
            o = new z5.f(this, d);
        }
        Object o2 = ((z5.f)o).F;
        final f5.a c = f5.a.C;
        final int g2 = ((z5.f)o).G;
        m i;
        if (g2 != 0) {
            if (g2 != 1) {
                if (g2 == 2) {
                    com.google.android.gms.internal.auth.h.z(o2);
                    return c5.h.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                j = ((z5.f)o).J;
                i = ((z5.f)o).I;
                com.google.android.gms.internal.auth.h.z(o2);
            }
        }
        else {
            com.google.android.gms.internal.auth.h.z(o2);
            ((z5.f)o).I = this;
            ((z5.f)o).J = j;
            ((z5.f)o).G = 1;
            o2 = z5.p.a((c)this.D, j, (g5.c)o);
            if (o2 == c) {
                return c;
            }
            i = this;
        }
        final Throwable k = (Throwable)o2;
        if (k != null) {
            final A a = (A)i.E;
            ((z5.f)o).I = null;
            ((z5.f)o).J = null;
            ((z5.f)o).G = 2;
            a.getClass();
            j = j;
            final g5.h h = new g5.h(3, (e5.d)o);
            ((A)h).H = j;
            ((A)h).I = k;
            if (((A)h).l((Object)c5.h.a) == c) {
                return c;
            }
        }
        return c5.h.a;
    }
    
    public boolean f(final m.b b, final MenuItem menuItem) {
        return ((a)this.D).f(b, menuItem);
    }
    
    public boolean g(final m.b b, final n.l l) {
        return ((a)this.D).g(b, l);
    }
    
    public Object get() {
        switch (this.C) {
            default: {
                return new i((w1.a)new c0.f(22), (w1.a)new Object(), u1.a.f, (u1.k)((C)this.D).get(), (b5.a)this.E);
            }
            case 9: {
                return new o1.e((Context)((C)this.D).D, (o1.d)((G)this.E).get());
            }
        }
    }
    
    public void h(String string, final Object o) {
        final int length = string.length();
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder(length + 1 + value.length());
        sb.append(string);
        sb.append("=");
        sb.append(value);
        string = sb.toString();
        ((ArrayList)this.E).add((Object)string);
    }
    
    public int i(final Context context, final f2.c c) {
        h2.A.h(context);
        h2.A.h(c);
        final int b = c.b();
        final SparseIntArray sparseIntArray = (SparseIntArray)this.D;
        synchronized (sparseIntArray) {
            int n = sparseIntArray.get(b, -1);
            monitorexit(sparseIntArray);
            if (n != -1) {
                return n;
            }
            final SparseIntArray sparseIntArray2 = (SparseIntArray)this.D;
            monitorenter(sparseIntArray2);
            final int n2 = 0;
            int n3 = 0;
            while (true) {
                Label_0107: {
                    try {
                        if (n3 >= sparseIntArray2.size()) {
                            break Label_0107;
                        }
                        final int key = sparseIntArray2.keyAt(n3);
                        if (key > b && sparseIntArray2.get(key) == 0) {
                            n = n2;
                            break Label_0107;
                        }
                        break Label_0107;
                    }
                    finally {
                        monitorexit(sparseIntArray);
                        n = -1;
                        break Label_0107;
                        Label_0137: {
                            sparseIntArray2.put(b, n);
                        }
                        return n;
                        ++n3;
                        continue;
                        iftrue(Label_0137:)(n != -1);
                        Block_9: {
                            break Block_9;
                        }
                        n = ((e2.f)this.E).c(context, b);
                    }
                }
                break;
            }
        }
    }
    
    public void j(final U1 u1) {
        if (u1 == null) {
            return;
        }
        try {
            final l2 t = m2.t();
            t.f((e2)this.D);
            ((h1)t).e();
            m2.n((m2)((h1)t).D, u1);
            ((Tl)this.E).e((m2)((h1)t).b());
        }
        finally {
            final Throwable t2;
            q0.h("BillingLogger", "Unable to log.", t2);
        }
    }
    
    public void k(final U1 u1, final int n) {
        try {
            final d2 d2 = (d2)((i1)this.D).g();
            ((h1)d2).e();
            e2.n((e2)((h1)d2).D, n);
            this.D = ((h1)d2).b();
            this.j(u1);
        }
        finally {
            final Throwable t;
            q0.h("BillingLogger", "Unable to log.", t);
        }
    }
    
    public StackTraceElement[] l(StackTraceElement[] l) {
        if (l.length <= 1024) {
            return l;
        }
        final t3.a[] array = (t3.a[])this.D;
        int i = 0;
        StackTraceElement[] j = l;
        while (i < 1) {
            final t3.a a = array[i];
            if (j.length <= 1024) {
                break;
            }
            j = a.l(l);
            ++i;
        }
        l = j;
        if (j.length > 1024) {
            l = ((c0.b)this.E).l(j);
        }
        return l;
    }
    
    public void m(final W1 w1) {
        if (w1 == null) {
            return;
        }
        try {
            final l2 t = m2.t();
            t.f((e2)this.D);
            ((h1)t).e();
            m2.o((m2)((h1)t).D, w1);
            ((Tl)this.E).e((m2)((h1)t).b());
        }
        finally {
            final Throwable t2;
            q0.h("BillingLogger", "Unable to log.", t2);
        }
    }
    
    public void n(final a2 a2) {
        try {
            final l2 t = m2.t();
            t.f((e2)this.D);
            ((h1)t).e();
            m2.p((m2)((h1)t).D, a2);
            ((Tl)this.E).e((m2)((h1)t).b());
        }
        finally {
            final Throwable t2;
            q0.h("BillingLogger", "Unable to log.", t2);
        }
    }
    
    public void o(final p2 p) {
        try {
            final Tl tl = (Tl)this.E;
            final l2 t = m2.t();
            t.f((e2)this.D);
            ((h1)t).e();
            m2.r((m2)((h1)t).D, p);
            tl.e((m2)((h1)t).b());
        }
        finally {
            final Throwable t2;
            q0.h("BillingLogger", "Unable to log.", t2);
        }
    }
    
    public void onMethodCall(F4.m h, final o o) {
        n5.h.e("call", (Object)h);
        Label_0864: {
            if (!h.a.equals((Object)"getDeviceInfo")) {
                break Label_0864;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put((Object)"board", (Object)Build.BOARD);
            hashMap.put((Object)"bootloader", (Object)Build.BOOTLOADER);
            final String brand = Build.BRAND;
            hashMap.put((Object)"brand", (Object)brand);
            final String device = Build.DEVICE;
            hashMap.put((Object)"device", (Object)device);
            hashMap.put((Object)"display", (Object)Build.DISPLAY);
            final String fingerprint = Build.FINGERPRINT;
            hashMap.put((Object)"fingerprint", (Object)fingerprint);
            final String hardware = Build.HARDWARE;
            hashMap.put((Object)"hardware", (Object)hardware);
            hashMap.put((Object)"host", (Object)Build.HOST);
            hashMap.put((Object)"id", (Object)Build.ID);
            final String manufacturer = Build.MANUFACTURER;
            hashMap.put((Object)"manufacturer", (Object)manufacturer);
            final String model = Build.MODEL;
            hashMap.put((Object)"model", (Object)model);
            final String product = Build.PRODUCT;
            hashMap.put((Object)"product", (Object)product);
            final String[] supported_32_BIT_ABIS = Build.SUPPORTED_32_BIT_ABIS;
            hashMap.put((Object)"supported32BitAbis", (Object)d5.e.D(Arrays.copyOf((Object[])supported_32_BIT_ABIS, supported_32_BIT_ABIS.length)));
            final String[] supported_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
            hashMap.put((Object)"supported64BitAbis", (Object)d5.e.D(Arrays.copyOf((Object[])supported_64_BIT_ABIS, supported_64_BIT_ABIS.length)));
            final String[] supported_ABIS = Build.SUPPORTED_ABIS;
            hashMap.put((Object)"supportedAbis", (Object)d5.e.D(Arrays.copyOf((Object[])supported_ABIS, supported_ABIS.length)));
            hashMap.put((Object)"tags", (Object)Build.TAGS);
            hashMap.put((Object)"type", (Object)Build.TYPE);
            n5.h.d("BRAND", (Object)brand);
            final boolean startsWith = brand.startsWith("generic");
            final int n = 0;
            h = (F4.m)"unknown";
            boolean b = false;
            Label_0526: {
                Label_0524: {
                    if (startsWith) {
                        n5.h.d("DEVICE", (Object)device);
                        if (device.startsWith("generic")) {
                            break Label_0524;
                        }
                    }
                    n5.h.d("FINGERPRINT", (Object)fingerprint);
                    if (!fingerprint.startsWith("generic") && !fingerprint.startsWith("unknown")) {
                        n5.h.d("HARDWARE", (Object)hardware);
                        if (!u5.i.Q(hardware, "goldfish") && !u5.i.Q(hardware, "ranchu")) {
                            n5.h.d("MODEL", (Object)model);
                            if (!u5.i.Q(model, "google_sdk") && !u5.i.Q(model, "Emulator") && !u5.i.Q(model, "Android SDK built for x86")) {
                                n5.h.d("MANUFACTURER", (Object)manufacturer);
                                if (!u5.i.Q(manufacturer, "Genymotion")) {
                                    n5.h.d("PRODUCT", (Object)product);
                                    if (!u5.i.Q(product, "sdk") && !u5.i.Q(product, "vbox86p") && !u5.i.Q(product, "emulator")) {
                                        if (!u5.i.Q(product, "simulator")) {
                                            b = false;
                                            break Label_0526;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                b = true;
            }
            hashMap.put((Object)"isPhysicalDevice", (Object)(b ^ true));
            final FeatureInfo[] systemAvailableFeatures = ((PackageManager)this.D).getSystemAvailableFeatures();
            n5.h.d("getSystemAvailableFeatures(...)", (Object)systemAvailableFeatures);
            final ArrayList list = new ArrayList();
            for (int length = systemAvailableFeatures.length, i = n; i < length; ++i) {
                final FeatureInfo featureInfo = systemAvailableFeatures[i];
                if (featureInfo.name != null) {
                    list.add((Object)featureInfo);
                }
            }
            final ArrayList list2 = new ArrayList(d5.f.E((Iterable)list));
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)((FeatureInfo)iterator.next()).name);
            }
            hashMap.put((Object)"systemFeatures", (Object)list2);
            final HashMap hashMap2 = new HashMap();
            final int sdk_INT = Build$VERSION.SDK_INT;
            hashMap2.put((Object)"baseOS", (Object)Build$VERSION.BASE_OS);
            hashMap2.put((Object)"previewSdkInt", (Object)Build$VERSION.PREVIEW_SDK_INT);
            hashMap2.put((Object)"securityPatch", (Object)Build$VERSION.SECURITY_PATCH);
            hashMap2.put((Object)"codename", (Object)Build$VERSION.CODENAME);
            hashMap2.put((Object)"incremental", (Object)Build$VERSION.INCREMENTAL);
            hashMap2.put((Object)"release", (Object)Build$VERSION.RELEASE);
            hashMap2.put((Object)"sdkInt", (Object)sdk_INT);
            hashMap.put((Object)"version", (Object)hashMap2);
            hashMap.put((Object)"isLowRamDevice", (Object)((ActivityManager)this.E).isLowRamDevice());
            Label_0840: {
                if (sdk_INT < 26) {
                    break Label_0840;
                }
                while (true) {
                    try {
                        h = (F4.m)io.flutter.plugin.editing.i.h();
                        hashMap.put((Object)"serialNumber", (Object)h);
                        while (true) {
                            ((j)o).success((Object)hashMap);
                            return;
                            hashMap.put((Object)"serialNumber", (Object)Build.SERIAL);
                            continue;
                        }
                        ((j)o).notImplemented();
                    }
                    catch (final SecurityException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public void p(final q2 q2) {
        if (q2 == null) {
            return;
        }
        try {
            final l2 t = m2.t();
            t.f((e2)this.D);
            ((h1)t).e();
            m2.s((m2)((h1)t).D, q2);
            ((Tl)this.E).e((m2)((h1)t).b());
        }
        finally {
            final Throwable t2;
            q0.h("BillingLogger", "Unable to log.", t2);
        }
    }
    
    public t s(final Object o) {
        final Boolean b = (Boolean)o;
        final boolean booleanValue = b;
        final k3.m m = (k3.m)this.E;
        t t;
        if (!booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", (Throwable)null);
            }
            final Iterator iterator = q3.c.j((Object[])((File)m.g.F).listFiles((FilenameFilter)k3.m.t)).iterator();
            while (iterator.hasNext()) {
                ((File)iterator.next()).delete();
            }
            final q3.c b2 = ((q3.a)m.m.E).b;
            q3.a.a(q3.c.j((Object[])((File)b2.H).listFiles()));
            q3.a.a(q3.c.j((Object[])((File)b2.I).listFiles()));
            q3.a.a(q3.c.j((Object[])((File)b2.J).listFiles()));
            m.r.d((Object)null);
            t = u0.m((Object)null);
        }
        else {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", (Throwable)null);
            }
            final boolean booleanValue2 = b;
            final v b3 = m.b;
            if (!booleanValue2) {
                b3.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            ((O2.j)b3.g).d((Object)null);
            t = ((t)this.D).n((Executor)m.e.a, (h)new X.a((Object)this, 13));
        }
        return t;
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 2: {
                final StringBuilder sb = new StringBuilder(100);
                sb.append(this.D.getClass().getSimpleName());
                sb.append('{');
                final ArrayList list = (ArrayList)this.E;
                for (int size = list.size(), i = 0; i < size; ++i) {
                    sb.append((String)list.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            }
        }
    }
}

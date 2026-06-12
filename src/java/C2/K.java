package c2;

import android.view.View;
import android.text.SpannableStringBuilder;
import java.util.Map;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.text.Selection;
import R4.N;
import java.util.Arrays;
import com.google.android.gms.internal.ads.Tl;
import android.view.KeyEvent;
import android.database.Cursor;
import java.util.LinkedHashMap;
import androidx.lifecycle.X;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import java.io.InputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;
import android.util.Log;
import F4.v;
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import R0.n;
import C2.a0;
import C2.o;
import o.q1;
import C2.G;
import C2.I;
import C2.H;
import C2.V;
import C2.g;
import android.app.Application;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import R4.j;
import android.app.Activity;
import java.util.concurrent.ThreadFactory;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.L;
import java.net.URLEncoder;
import java.util.Map$Entry;
import android.net.Uri$Builder;
import java.net.URL;
import java.util.concurrent.atomic.AtomicReference;
import h1.m;
import v4.q;
import v4.r;
import F4.u;
import io.flutter.embedding.engine.FlutterJNI;
import K2.N0;
import java.util.concurrent.ExecutorService;
import androidx.work.OverwritingInputMerger;
import java.util.UUID;
import java.util.HashSet;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import e5.i;
import a1.e;
import u0.l;
import androidx.work.impl.WorkDatabase_Impl;
import n5.h;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import android.content.Context;
import java.util.HashMap;
import F4.p;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import C2.f;
import java.util.ArrayList;
import d1.a;
import z5.c;
import F4.d;
import C2.W;

public final class k implements W, d, c, a
{
    public static k G;
    public static k H;
    public final int C;
    public Object D = e.D;
    public Object E = e.E;
    public Object F = e.F;
    
    public k() {
        this.C = 6;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
    }
    
    public k(final f d) {
        this.C = 8;
        this.D = d;
        this.E = new ReentrantLock();
        this.F = new WeakHashMap();
    }
    
    public k(final p f) {
        this.C = 12;
        this.F = f;
        this.E = new HashMap();
    }
    
    public k(final Context context) {
        this.C = 0;
        final b a = b.a(context);
        this.D = a;
        this.E = a.b();
        this.F = a.c();
    }
    
    public k(final b0 b0, final Z z) {
        this.C = 16;
        h.e("store", (Object)b0);
        this(b0, z, (h0.b)h0.a.b);
    }
    
    public k(final b0 d, final Z e, final h0.b f) {
        this.C = 16;
        h.e("store", (Object)d);
        h.e("defaultCreationExtras", (Object)f);
        this.D = d;
        this.E = e;
        this.F = f;
    }
    
    public k(final WorkDatabase_Impl d) {
        this.C = 15;
        this.D = d;
        this.E = new a1.b((l)d, 2);
        this.F = new e((l)d, 0);
    }
    
    public k(final c0.b b) {
        this.C = 22;
        this.D = new N.c(30);
        this.E = new ArrayList();
        this.F = new ArrayList();
        new c0.f(this);
    }
    
    public k(final g4.b d, final i e) {
        this.C = 19;
        this.D = d;
        this.E = e;
        this.F = "firebase-settings.crashlytics.com";
    }
    
    public k(final io.flutter.plugins.firebase.messaging.a f) {
        this.C = 9;
        this.F = f;
        this.D = Executors.newSingleThreadExecutor();
        this.E = new Handler(Looper.getMainLooper());
    }
    
    public k(final Class clazz) {
        this.C = 11;
        this.F = new HashSet();
        this.D = UUID.randomUUID();
        this.E = new a1.i(((UUID)this.D).toString(), clazz.getName());
        ((HashSet)this.F).add((Object)clazz.getName());
        ((a1.i)this.E).d = OverwritingInputMerger.class.getName();
    }
    
    public k(final String d) {
        this.C = 13;
        final com.google.android.gms.internal.auth.l l = new com.google.android.gms.internal.auth.l(16, false);
        this.E = l;
        this.F = l;
        this.D = d;
    }
    
    public k(final String d, final HashMap e) {
        this.C = 21;
        this.D = d;
        this.E = e;
        this.F = new HashMap();
    }
    
    public k(final ExecutorService executorService) {
        this.C = 18;
        this.E = new Handler(Looper.getMainLooper());
        this.F = new N0((Object)this, 2);
        this.D = new b1.i(executorService);
    }
    
    public k(final m.l l, final FlutterJNI e) {
        this.C = 4;
        ((Y0.h)(this.D = new Y0.h(l, "flutter/accessibility", u.a, null))).u((F4.b)new f((Object)this, 3));
        this.E = e;
    }
    
    public k(final v4.l f) {
        this.C = 24;
        this.E = new HashSet();
        this.F = f;
        this.D = new r[] { (r)new q(f.getBinaryMessenger()), (r)new m(new f(f.getBinaryMessenger())) };
        new b1.f(f.getBinaryMessenger()).D = this;
    }
    
    public k(final w2.e f, final F4.h d) {
        this.C = 5;
        this.F = f;
        this.E = new AtomicReference((Object)null);
        this.D = d;
    }
    
    public static k F(final Context context) {
        synchronized (k.class) {
            final Context applicationContext = context.getApplicationContext();
            synchronized (k.class) {
                k g = k.G;
                if (g == null) {
                    g = (k.G = new k(applicationContext));
                }
                monitorexit(k.class);
                return g;
            }
        }
    }
    
    public static final URL b(final k k) {
        final Uri$Builder appendPath = new Uri$Builder().scheme("https").authority((String)k.F).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        final g4.b b = (g4.b)k.D;
        final Uri$Builder appendPath2 = appendPath.appendPath(b.a).appendPath("settings");
        final g4.a d = b.d;
        return new URL(appendPath2.appendQueryParameter("build_version", d.c).appendQueryParameter("display_version", d.b).build().toString());
    }
    
    public static String g(final String s, final HashMap hashMap) {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = hashMap.entrySet().iterator();
        final Map$Entry map$Entry = (Map$Entry)iterator.next();
        sb.append((String)map$Entry.getKey());
        sb.append("=");
        String encode;
        if (map$Entry.getValue() != null) {
            encode = URLEncoder.encode((String)map$Entry.getValue(), "UTF-8");
        }
        else {
            encode = "";
        }
        sb.append(encode);
        while (iterator.hasNext()) {
            final Map$Entry map$Entry2 = (Map$Entry)iterator.next();
            sb.append("&");
            sb.append((String)map$Entry2.getKey());
            sb.append("=");
            String encode2;
            if (map$Entry2.getValue() != null) {
                encode2 = URLEncoder.encode((String)map$Entry2.getValue(), "UTF-8");
            }
            else {
                encode2 = "";
            }
            sb.append(encode2);
        }
        final String string = sb.toString();
        if (string.isEmpty()) {
            return s;
        }
        if (s.contains((CharSequence)"?")) {
            String concat = string;
            if (!s.endsWith("&")) {
                concat = "&".concat(string);
            }
            return L.i(s, concat);
        }
        return L.j(s, "?", string);
    }
    
    public static k t() {
        if (k.H == null) {
            final c0.f e = new c0.f(23);
            final b1.p p = new b1.p(1);
            p.b = 0;
            final ExecutorService cachedThreadPool = Executors.newCachedThreadPool((ThreadFactory)p);
            final FlutterJNI e2 = new FlutterJNI();
            final Object d = new Object();
            ((z4.d)d).a = false;
            ((z4.d)d).e = e2;
            ((z4.d)d).f = cachedThreadPool;
            final k h = new k(23);
            h.D = d;
            h.E = e;
            h.F = cachedThreadPool;
            k.H = h;
        }
        return k.H;
    }
    
    public void A(final Activity obj, final L0.l c) {
        h.e("activity", (Object)obj);
        Object iterator = this.E;
        ((ReentrantLock)iterator).lock();
        final WeakHashMap weakHashMap = (WeakHashMap)this.F;
        try {
            if (c.equals((Object)weakHashMap.get((Object)obj))) {
                return;
            }
            final L0.l l = (L0.l)weakHashMap.put((Object)obj, (Object)c);
            ((ReentrantLock)iterator).unlock();
            iterator = ((O0.l)((f)this.D).D).b.iterator();
            while (((Iterator)iterator).hasNext()) {
                final O0.k k = (O0.k)((Iterator)iterator).next();
                if (!k.a.equals(obj)) {
                    continue;
                }
                k.c = c;
                k.b.accept((Object)c);
            }
        }
        finally {
            ((ReentrantLock)iterator).unlock();
        }
    }
    
    public void B(final ArrayList list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final t0.a a = (t0.a)list.get(i);
            a.getClass();
            final N.c c = (N.c)this.D;
            c.getClass();
            h.e("instance", (Object)a);
            final int b = c.b;
            int n = 0;
            while (true) {
                final Object[] a2 = c.a;
                if (n >= b) {
                    final int b2 = c.b;
                    if (b2 < a2.length) {
                        a2[b2] = a;
                        c.b = b2 + 1;
                    }
                    break;
                }
                if (a2[n] == a) {
                    throw new IllegalStateException("Already in the pool!");
                }
                ++n;
            }
        }
        list.clear();
    }
    
    public void C(final String s) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.D;
        ((l)workDatabase_Impl).b();
        final e e = (e)this.F;
        final z0.f a = e.a();
        if (s == null) {
            ((z0.b)a).d(1);
        }
        else {
            ((z0.b)a).f(1, s);
        }
        ((l)workDatabase_Impl).c();
        try {
            a.l();
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
            e.c(a);
        }
    }
    
    public void D(final String d) {
        if (d != null) {
            this.D = d;
            return;
        }
        throw new NullPointerException("Null backendName");
    }
    
    public void E(final j j, final int n) {
        final HashMap hashMap = (HashMap)this.E;
        if (hashMap.get((Object)n) == null) {
            hashMap.put((Object)n, (Object)j);
            return;
        }
        throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[] { n }));
    }
    
    public void G() {
        monitorenter(this);
        b b;
        ReentrantLock a;
        try {
            b = (b)this.D;
            a = b.a;
            a.lock();
            final b b2 = b;
            final SharedPreferences sharedPreferences = b2.b;
            final SharedPreferences$Editor sharedPreferences$Editor = sharedPreferences.edit();
            final SharedPreferences$Editor sharedPreferences$Editor2 = sharedPreferences$Editor.clear();
            sharedPreferences$Editor2.apply();
            final ReentrantLock reentrantLock = a;
            reentrantLock.unlock();
            final k k = this;
            final Object o = null;
            k.E = o;
            final k i = this;
            final Object o2 = null;
            i.F = o2;
            final k j = this;
            monitorexit(j);
            return;
        }
        finally {
            final ReentrantLock reentrantLock2;
            a = reentrantLock2;
            monitorexit(this);
        }
        try {
            final b b2 = b;
            final SharedPreferences sharedPreferences = b2.b;
            final SharedPreferences$Editor sharedPreferences$Editor = sharedPreferences.edit();
            final SharedPreferences$Editor sharedPreferences$Editor2 = sharedPreferences$Editor.clear();
            sharedPreferences$Editor2.apply();
            final ReentrantLock reentrantLock = a;
            reentrantLock.unlock();
            final k k = this;
            final Object o = null;
            k.E = o;
            final k i = this;
            final Object o2 = null;
            i.F = o2;
            final k j = this;
            monitorexit(j);
        }
        finally {}
    }
    
    public void H(final String s, final double n, final double n2) {
        int n3 = 0;
        ArrayList list;
        ArrayList list2;
        ArrayList list3;
        while (true) {
            list = (ArrayList)this.D;
            final int size = list.size();
            list2 = (ArrayList)this.E;
            list3 = (ArrayList)this.F;
            if (n3 >= size) {
                break;
            }
            final double doubleValue = (double)list3.get(n3);
            final double doubleValue2 = (double)list2.get(n3);
            if (n < doubleValue) {
                break;
            }
            if (doubleValue == n && n2 < doubleValue2) {
                break;
            }
            ++n3;
        }
        list.add(n3, (Object)s);
        list3.add(n3, (Object)n);
        list2.add(n3, (Object)n2);
    }
    
    public Y0.h I() {
        final Application application = (Application)((C2.b)this.D).D;
        final g g = (g)((V)this.E).a();
        final C2.b0 b0 = (C2.b0)((V)this.F).a();
        final G b2 = C2.H.b;
        I.c((Object)b2);
        return new Y0.h(application, g, b0, b2);
    }
    
    public n c() {
        final UUID a = (UUID)this.D;
        final a1.i b = (a1.i)this.E;
        final HashSet c = (HashSet)this.F;
        final Object o = new Object();
        ((n)o).a = a;
        ((n)o).b = b;
        ((n)o).c = c;
        final R0.c j = b.j;
        boolean b2 = false;
        Label_0104: {
            if (j.h.a.size() <= 0) {
                if (!j.d && !j.b) {
                    if (!j.c) {
                        b2 = false;
                        break Label_0104;
                    }
                }
            }
            b2 = true;
        }
        if (((a1.i)this.E).q && b2) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.D = UUID.randomUUID();
        final a1.i i = (a1.i)this.E;
        final Object e = new Object();
        ((a1.i)e).b = 1;
        final R0.f c2 = R0.f.c;
        ((a1.i)e).e = c2;
        ((a1.i)e).f = c2;
        ((a1.i)e).j = R0.c.i;
        ((a1.i)e).l = 1;
        ((a1.i)e).m = 30000L;
        ((a1.i)e).p = -1L;
        ((a1.i)e).r = 1;
        ((a1.i)e).a = i.a;
        ((a1.i)e).c = i.c;
        ((a1.i)e).b = i.b;
        ((a1.i)e).d = i.d;
        ((a1.i)e).e = new R0.f(i.e);
        ((a1.i)e).f = new R0.f(i.f);
        ((a1.i)e).g = i.g;
        ((a1.i)e).h = i.h;
        ((a1.i)e).i = i.i;
        final R0.c k = i.j;
        final Object l = new Object();
        ((R0.c)l).a = 1;
        ((R0.c)l).f = -1L;
        ((R0.c)l).g = -1L;
        ((R0.c)l).h = new R0.e();
        ((R0.c)l).b = k.b;
        ((R0.c)l).c = k.c;
        ((R0.c)l).a = k.a;
        ((R0.c)l).d = k.d;
        ((R0.c)l).e = k.e;
        ((R0.c)l).h = k.h;
        ((a1.i)e).j = (R0.c)l;
        ((a1.i)e).k = i.k;
        ((a1.i)e).l = i.l;
        ((a1.i)e).m = i.m;
        ((a1.i)e).n = i.n;
        ((a1.i)e).o = i.o;
        ((a1.i)e).p = i.p;
        ((a1.i)e).q = i.q;
        ((a1.i)e).r = i.r;
        this.E = e;
        ((a1.i)e).a = ((UUID)this.D).toString();
        return (n)o;
    }
    
    public Object clone() {
        switch (this.C) {
            default: {
                return super.clone();
            }
            case 17: {
                final com.google.android.gms.internal.measurement.c d = (com.google.android.gms.internal.measurement.c)((com.google.android.gms.internal.measurement.c)this.D).clone();
                final k k = new k(17);
                k.D = d;
                k.E = d.clone();
                k.F = new ArrayList();
                final Iterator iterator = ((ArrayList)this.F).iterator();
                while (iterator.hasNext()) {
                    ((ArrayList)k.F).add((Object)((com.google.android.gms.internal.measurement.c)iterator.next()).clone());
                }
                return k;
            }
        }
    }
    
    public n1.j d() {
        String s;
        if (this.D == null) {
            s = " backendName";
        }
        else {
            s = "";
        }
        String concat = s;
        if (this.F == null) {
            concat = s.concat(" priority");
        }
        if (concat.isEmpty()) {
            return new n1.j((String)this.D, (byte[])this.E, (k1.d)this.F);
        }
        throw new IllegalStateException("Missing required properties:".concat(concat));
    }
    
    public Object e(final z5.d d, final e5.d d2) {
        final Object e = ((c)this.D).e((z5.d)new X4.r(d, (Z.d)this.E, (X4.L)this.F), d2);
        if (e == f5.a.C) {
            return e;
        }
        return c5.h.a;
    }
    
    public void f(final Activity activity) {
        final ReentrantLock reentrantLock = (ReentrantLock)this.E;
        reentrantLock.lock();
        try {
            ((WeakHashMap)this.F).put((Object)activity, (Object)null);
        }
        finally {
            reentrantLock.unlock();
        }
    }
    
    public void h(final int n, final io.flutter.view.d d) {
        ((FlutterJNI)this.E).dispatchSemanticsAction(n, d);
    }
    
    public void i(final int n, final io.flutter.view.d d, final Serializable s) {
        ((FlutterJNI)this.E).dispatchSemanticsAction(n, d, (Object)s);
    }
    
    public void j(final Object o, final ByteArrayOutputStream byteArrayOutputStream) {
        final HashMap hashMap = (HashMap)this.E;
        final HashMap hashMap2 = (HashMap)this.D;
        final A3.g g = new A3.g(byteArrayOutputStream, hashMap2, hashMap, (A3.f)this.F);
        final x3.d d = (x3.d)hashMap2.get((Object)o.getClass());
        if (d != null) {
            ((x3.a)d).a(o, (Object)g);
            return;
        }
        final StringBuilder sb = new StringBuilder("No encoder for ");
        sb.append((Object)o.getClass());
        throw new RuntimeException(sb.toString());
    }
    
    public void k(ByteBuffer byteBuffer, final x4.f f) {
        final w2.e e = (w2.e)this.F;
        final F4.m d = ((v)e.F).d(byteBuffer);
        final String a = d.a;
        final boolean equals = a.equals((Object)"listen");
        final AtomicReference atomicReference = (AtomicReference)this.E;
        byteBuffer = (ByteBuffer)e.E;
        final v v = (v)e.F;
        final F4.h h = (F4.h)this.D;
        final Object b = d.b;
        if (equals) {
            final F4.g g = new F4.g(this);
            if (atomicReference.getAndSet((Object)g) != null) {
                try {
                    h.i((Object)null);
                }
                catch (final RuntimeException ex) {
                    final StringBuilder sb = new StringBuilder("EventChannel#");
                    sb.append((String)byteBuffer);
                    Log.e(sb.toString(), "Failed to close existing event stream", (Throwable)ex);
                }
            }
            try {
                h.m(b, g);
                f.a(v.a((Object)null));
            }
            catch (final RuntimeException ex2) {
                atomicReference.set((Object)null);
                final StringBuilder sb2 = new StringBuilder("EventChannel#");
                sb2.append((String)byteBuffer);
                Log.e(sb2.toString(), "Failed to open event stream", (Throwable)ex2);
                f.a(v.c("error", ((Throwable)ex2).getMessage(), (Object)null));
            }
        }
        else if (a.equals((Object)"cancel")) {
            if (atomicReference.getAndSet((Object)null) != null) {
                try {
                    h.i(b);
                    f.a(v.a((Object)null));
                }
                catch (final RuntimeException ex3) {
                    final StringBuilder sb3 = new StringBuilder("EventChannel#");
                    sb3.append((String)byteBuffer);
                    Log.e(sb3.toString(), "Failed to close event stream", (Throwable)ex3);
                    f.a(v.c("error", ((Throwable)ex3).getMessage(), (Object)null));
                }
            }
            else {
                f.a(v.c("error", "No active stream to cancel", (Object)null));
            }
        }
        else {
            f.a((ByteBuffer)null);
        }
    }
    
    public h1.e l() {
        l3.c.b();
        Object o = null;
        Object g = null;
        Label_0367: {
            while (true) {
                try {
                    final String s = (String)this.D;
                    g = this.E;
                    try {
                        g = g(s, (HashMap)g);
                        final StringBuilder sb = new StringBuilder("GET Request URL: ");
                        sb.append((String)g);
                        final String string = sb.toString();
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", string, (Throwable)null);
                            }
                        }
                        finally {}
                        g = new URL((String)g).openConnection();
                        try {
                            ((URLConnection)g).setReadTimeout(10000);
                            ((URLConnection)g).setConnectTimeout(10000);
                            ((HttpURLConnection)g).setRequestMethod("GET");
                            for (final Map$Entry map$Entry : ((HashMap)this.F).entrySet()) {
                                ((URLConnection)g).addRequestProperty((String)map$Entry.getKey(), (String)map$Entry.getValue());
                            }
                        }
                        finally {
                            break Label_0367;
                        }
                        ((URLConnection)g).connect();
                        final int responseCode = ((HttpURLConnection)g).getResponseCode();
                        final InputStream inputStream = ((URLConnection)g).getInputStream();
                        if (inputStream != null) {
                            try {
                                o = new InputStreamReader(inputStream, "UTF-8");
                                final BufferedReader bufferedReader = new BufferedReader((Reader)o);
                                final char[] array = new char[8192];
                                o = new StringBuilder();
                                while (true) {
                                    final int read = ((Reader)bufferedReader).read(array);
                                    if (read == -1) {
                                        break;
                                    }
                                    ((StringBuilder)o).append(array, 0, read);
                                }
                                ((StringBuilder)o).toString();
                            }
                            finally {
                                o = inputStream;
                                break Label_0367;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        ((HttpURLConnection)g).disconnect();
                        g = new Object();
                        ((h1.e)g).a = responseCode;
                        final String b;
                        ((h1.e)g).b = b;
                        return (h1.e)g;
                    }
                    finally {}
                    while (true) {
                        g = null;
                        break Label_0367;
                        continue;
                    }
                }
                finally {
                    continue;
                }
                break;
            }
        }
        if (o != null) {
            ((InputStream)o).close();
        }
        if (g != null) {
            ((HttpURLConnection)g).disconnect();
        }
    }
    
    public void m(final Runnable runnable) {
        ((b1.i)this.D).execute(runnable);
    }
    
    public int n(final int n, int i) {
        for (ArrayList list = (ArrayList)this.F; i < list.size(); ++i) {
            list.get(i).getClass();
        }
        return n;
    }
    
    public androidx.lifecycle.W o(final Class clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return this.p(clazz, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    public androidx.lifecycle.W p(Class w, final String s) {
        h.e("key", (Object)s);
        final b0 b0 = (b0)this.D;
        b0.getClass();
        final LinkedHashMap a = b0.a;
        final androidx.lifecycle.W obj = (androidx.lifecycle.W)a.get((Object)s);
        final boolean instance = ((Class)w).isInstance(obj);
        final Z z = (Z)this.E;
        if (instance) {
            T t;
            if (z instanceof T) {
                t = (T)z;
            }
            else {
                t = null;
            }
            if (t != null) {
                h.b((Object)obj);
                final androidx.lifecycle.o f = t.F;
                if (f != null) {
                    final x0.e g = t.G;
                    h.b((Object)g);
                    P.a(obj, g, f);
                }
            }
            h.c("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", (Object)obj);
            return obj;
        }
        final h0.c c = new h0.c((h0.b)this.F);
        ((Map)((h0.b)c).a).put((Object)X.b, (Object)s);
        try {
            w = z.d((Class)w, c);
        }
        catch (final AbstractMethodError abstractMethodError) {
            w = z.b((Class)w);
        }
        h.e("viewModel", (Object)w);
        final androidx.lifecycle.W w2 = (androidx.lifecycle.W)((Map)a).put((Object)s, (Object)w);
        if (w2 != null) {
            w2.b();
        }
        return w;
    }
    
    public a1.d q(final String s) {
        final u0.m c = u0.m.c(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (s == null) {
            c.f(1);
        }
        else {
            c.g(1, s);
        }
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.D;
        ((l)workDatabase_Impl).b();
        final Cursor g = ((l)workDatabase_Impl).g((y0.c)c);
        Label_0124: {
            final a1.d d2;
            Label_0110: {
                try {
                    final int f = I5.d.f(g, "work_spec_id");
                    final int f2 = I5.d.f(g, "system_id");
                    if (g.moveToFirst()) {
                        final a1.d d = new a1.d(g.getString(f), g.getInt(f2));
                        break Label_0110;
                    }
                }
                finally {
                    break Label_0124;
                }
                d2 = null;
            }
            g.close();
            c.h();
            return d2;
        }
        g.close();
        c.h();
    }
    
    public boolean r(final KeyEvent d) {
        final boolean remove = ((HashSet)this.E).remove((Object)d);
        int i = 0;
        if (remove) {
            return false;
        }
        final r[] array = (r[])this.D;
        if (array.length > 0) {
            final Object o = new Object();
            ((g2.k)o).a = this;
            ((g2.k)o).c = ((r[])this.D).length;
            ((g2.k)o).b = false;
            ((g2.k)o).d = d;
            while (i < array.length) {
                array[i].a(d, new Tl((g2.k)o));
                ++i;
            }
        }
        else {
            this.z(d);
        }
        return true;
    }
    
    public void s(final a1.d d) {
        final WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl)this.D;
        ((l)workDatabase_Impl).b();
        ((l)workDatabase_Impl).c();
        try {
            ((a1.b)this.E).e(d);
            ((l)workDatabase_Impl).h();
        }
        finally {
            ((l)workDatabase_Impl).f();
        }
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 13: {
                final StringBuilder sb = new StringBuilder(32);
                sb.append((String)this.D);
                sb.append('{');
                com.google.android.gms.internal.auth.l l = (com.google.android.gms.internal.auth.l)((com.google.android.gms.internal.auth.l)this.E).E;
                String s = "";
                while (l != null) {
                    final Object d = l.D;
                    sb.append(s);
                    if (d != null && d.getClass().isArray()) {
                        final String deepToString = Arrays.deepToString(new Object[] { d });
                        sb.append((CharSequence)deepToString, 1, deepToString.length() - 1);
                    }
                    else {
                        sb.append(d);
                    }
                    l = (com.google.android.gms.internal.auth.l)l.E;
                    s = ", ";
                }
                sb.append('}');
                return sb.toString();
            }
        }
    }
    
    public void u(final HashMap hashMap) {
        new Handler(Looper.getMainLooper()).post((Runnable)new O2.p(6, (Object)this, (Object)hashMap, false));
    }
    
    public void v(final int n, final R4.g g) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"adId", (Object)n);
        hashMap.put((Object)"eventName", (Object)"onAdFailedToLoad");
        hashMap.put((Object)"loadAdError", (Object)g);
        this.u(hashMap);
    }
    
    public void w(final int n, final y1.q q) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"adId", (Object)n);
        hashMap.put((Object)"eventName", (Object)"onAdLoaded");
        Object o;
        if (q == null) {
            o = null;
        }
        else {
            o = new R4.i(q);
        }
        hashMap.put((Object)"responseInfo", o);
        this.u(hashMap);
    }
    
    public void x(final int n, final String s, final String s2) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"adId", (Object)n);
        hashMap.put((Object)"eventName", (Object)"onAppEvent");
        hashMap.put((Object)"name", (Object)s);
        hashMap.put((Object)"data", (Object)s2);
        this.u(hashMap);
    }
    
    public void y(final int n, final N n2) {
        final HashMap hashMap = new HashMap();
        hashMap.put((Object)"adId", (Object)n);
        hashMap.put((Object)"eventName", (Object)"onRewardedAdUserEarnedReward");
        hashMap.put((Object)"rewardItem", (Object)n2);
        this.u(hashMap);
    }
    
    public void z(final KeyEvent keyEvent) {
        final v4.l l = (v4.l)this.F;
        if (l != null) {
            final io.flutter.plugin.editing.j m = l.M;
            final boolean acceptingText = m.b.isAcceptingText();
            int n2;
            final int n = n2 = 0;
            Label_0379: {
                if (acceptingText) {
                    final InputConnection j = m.j;
                    if (j == null) {
                        n2 = n;
                    }
                    else if (j instanceof io.flutter.plugin.editing.c) {
                        final io.flutter.plugin.editing.c c = (io.flutter.plugin.editing.c)j;
                        n2 = n;
                        if (keyEvent.getAction() == 0) {
                            if (keyEvent.getKeyCode() == 21) {
                                n2 = (c.d(true, keyEvent.isShiftPressed()) ? 1 : 0);
                            }
                            else if (keyEvent.getKeyCode() == 22) {
                                n2 = (c.d(false, keyEvent.isShiftPressed()) ? 1 : 0);
                            }
                            else if (keyEvent.getKeyCode() == 19) {
                                n2 = (c.e(true, keyEvent.isShiftPressed()) ? 1 : 0);
                            }
                            else if (keyEvent.getKeyCode() == 20) {
                                n2 = (c.e(false, keyEvent.isShiftPressed()) ? 1 : 0);
                            }
                            else {
                                while (true) {
                                    Label_0243: {
                                        if (keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160) {
                                            break Label_0243;
                                        }
                                        final EditorInfo e = c.e;
                                        if ((e.inputType & 0x20000) != 0x0) {
                                            break Label_0243;
                                        }
                                        c.performEditorAction(e.imeOptions & 0xFF);
                                        n2 = 1;
                                        break Label_0379;
                                    }
                                    final io.flutter.plugin.editing.f d = c.d;
                                    final int selectionStart = Selection.getSelectionStart((CharSequence)d);
                                    final int selectionEnd = Selection.getSelectionEnd((CharSequence)d);
                                    final int unicodeChar = keyEvent.getUnicodeChar();
                                    n2 = n;
                                    if (selectionStart >= 0) {
                                        n2 = n;
                                        if (selectionEnd >= 0) {
                                            if (unicodeChar != 0) {
                                                final int min = Math.min(selectionStart, selectionEnd);
                                                final int max = Math.max(selectionStart, selectionEnd);
                                                c.beginBatchEdit();
                                                if (min != max) {
                                                    ((SpannableStringBuilder)d).delete(min, max);
                                                }
                                                ((SpannableStringBuilder)d).insert(min, (CharSequence)String.valueOf((char)unicodeChar));
                                                final int n3 = min + 1;
                                                c.setSelection(n3, n3);
                                                c.endBatchEdit();
                                                continue;
                                            }
                                            n2 = n;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        n2 = (j.sendKeyEvent(keyEvent) ? 1 : 0);
                    }
                }
            }
            if (n2 == 0) {
                final HashSet set = (HashSet)this.E;
                set.add((Object)keyEvent);
                ((View)l).getRootView().dispatchKeyEvent(keyEvent);
                if (set.remove((Object)keyEvent)) {
                    Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }
}

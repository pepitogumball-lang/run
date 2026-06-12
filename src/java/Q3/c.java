package q3;

import n3.B;
import java.util.AbstractCollection;
import n3.e0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import n3.A;
import k3.y;
import n3.u0;
import C2.v;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.IOException;
import com.google.firebase.perf.session.SessionManager;
import K2.D;
import com.google.firebase.perf.config.RemoteConfigManager;
import t1.h;
import c0.f;
import java.util.concurrent.Executor;
import X4.C;
import n3.U;
import n3.D0;
import Z4.V;
import n3.q0;
import n3.S;
import n3.W;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.ads.Rc;
import java.util.Stack;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Comparator;
import n3.F;
import java.util.Map$Entry;
import n1.p;
import k3.t;
import k3.j;
import k3.z;
import n3.h0;
import n3.g0;
import m3.m;
import java.util.ArrayList;
import h1.w;
import n3.K0;
import java.util.List;
import n3.O;
import n3.Q;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import K2.c0;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m3.d;
import android.util.Log;
import n3.d0;
import o.q1;
import m3.e;
import n3.P;
import k3.g;
import java.io.File;
import n3.a0;
import android.content.Context;
import p1.b;
import b5.a;

public final class c implements a, b
{
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    
    public c(final Context context) {
        this.C = 0;
        final String a = ((a0)h3.c.b.e(context)).a;
        this.D = a;
        final File filesDir = context.getFilesDir();
        this.E = filesDir;
        String string;
        if (!a.isEmpty()) {
            final StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            String s;
            if (a.length() > 40) {
                s = g.h(a);
            }
            else {
                s = a.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(s);
            string = sb.toString();
        }
        else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        final File f = new File(filesDir, string);
        h(f);
        this.F = f;
        final File g = new File(f, "open-sessions");
        h(g);
        this.G = g;
        final File h = new File(f, "reports");
        h(h);
        this.H = h;
        final File i = new File(f, "priority-reports");
        h(i);
        this.I = i;
        final File j = new File(f, "native-reports");
        h(j);
        this.J = j;
    }
    
    public static P a(final P p3, final e e, final q1 q1) {
        final O a = p3.a();
        final String d = ((m3.c)e.D).d();
        if (d != null) {
            a.e = new d0(d);
        }
        else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", (Throwable)null);
        }
        final d d2 = (d)((AtomicMarkableReference)((c0)q1.F).D).getReference();
        synchronized (d2) {
            final Map unmodifiableMap = Collections.unmodifiableMap((Map)new HashMap((Map)d2.a));
            monitorexit(d2);
            final List f = f(unmodifiableMap);
            final d d3 = (d)((AtomicMarkableReference)((c0)q1.G).D).getReference();
            synchronized (d3) {
                final Map unmodifiableMap2 = Collections.unmodifiableMap((Map)new HashMap((Map)d3.a));
                monitorexit(d3);
                final List f2 = f(unmodifiableMap2);
                if (!f.isEmpty() || !f2.isEmpty()) {
                    final Q c = p3.c;
                    a.c = new Q(c.a, f, f2, c.d, c.e, c.f, c.g);
                }
                return a.a();
            }
        }
    }
    
    public static K0 b(final P p2, final q1 q1) {
        final List h = ((w)q1.H).h();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < h.size(); ++i) {
            final m m = (m)h.get(i);
            m.getClass();
            final Object o = new Object();
            final m3.b b = (m3.b)m;
            final String e = b.e;
            if (e == null) {
                throw new NullPointerException("Null variantId");
            }
            final String b2 = b.b;
            if (b2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            ((e0)o).a = new g0(b2, e);
            final String c = b.c;
            if (c == null) {
                throw new NullPointerException("Null parameterKey");
            }
            ((e0)o).b = c;
            final String d = b.d;
            if (d == null) {
                throw new NullPointerException("Null parameterValue");
            }
            ((e0)o).c = d;
            ((e0)o).d = b.f;
            ((e0)o).e |= 0x1;
            list.add((Object)((e0)o).a());
        }
        if (list.isEmpty()) {
            return p2;
        }
        final O a = p2.a();
        a.f = new h0((List)list);
        return a.a();
    }
    
    public static c d(final Context context, final z z, final c c, final C2.c c2, final e e, final q1 q1, final h1.m m, final C2.z z2, final h1.m i, final j j, final l3.c c3) {
        final t t = new t(context, z, c2, m, z2);
        final q3.a a = new q3.a(c, z2, j);
        final o3.a b = r3.a.b;
        p.b(context);
        return new c(t, a, new r3.a(new r3.c(p.a().c(new l1.a(r3.a.c, r3.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new k1.c("json"), (k1.e)r3.a.e), z2.f(), i)), e, q1, z, c3, 2);
    }
    
    public static List f(final Map map) {
        final ArrayList list = new ArrayList();
        list.ensureCapacity(map.size());
        for (final Map$Entry map$Entry : map.entrySet()) {
            final String s = (String)map$Entry.getKey();
            if (s == null) {
                throw new NullPointerException("Null key");
            }
            final String s2 = (String)map$Entry.getValue();
            if (s2 == null) {
                throw new NullPointerException("Null value");
            }
            list.add((Object)new F(s, s2));
        }
        Collections.sort((List)list, (Comparator)new L.a(2));
        return Collections.unmodifiableList((List)list);
    }
    
    public static void h(final File file) {
        final Class<c> clazz;
        monitorenter(clazz = c.class);
        Label_0083: {
            try {
                if (!file.exists()) {
                    break Label_0083;
                }
                if (file.isDirectory()) {
                    monitorexit(clazz);
                    return;
                }
                final StringBuilder sb = new StringBuilder("Unexpected non-directory file: ");
                sb.append((Object)file);
                sb.append("; deleting file and creating new directory.");
                final String string = sb.toString();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", string, (Throwable)null);
                }
                file.delete();
                break Label_0083;
            }
            finally {
                monitorexit(clazz);
                while (true) {
                    final StringBuilder sb2 = new StringBuilder("Could not create Crashlytics-specific directory: ");
                    sb2.append((Object)file);
                    Log.e("FirebaseCrashlytics", sb2.toString(), (Throwable)null);
                    Label_0118: {
                        monitorexit(clazz);
                    }
                    return;
                    iftrue(Label_0118:)(file.mkdirs());
                    continue;
                }
            }
        }
    }
    
    public static boolean i(final File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                i(listFiles[i]);
            }
        }
        return file.delete();
    }
    
    public static List j(final Object[] array) {
        List list;
        if (array == null) {
            list = Collections.emptyList();
        }
        else {
            list = Arrays.asList(array);
        }
        return list;
    }
    
    public void c(String string) {
        final File file = new File((File)this.E, string);
        if (file.exists() && i(file)) {
            final StringBuilder sb = new StringBuilder("Deleted previous Crashlytics file system: ");
            sb.append(file.getPath());
            string = sb.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, (Throwable)null);
            }
        }
    }
    
    public File e(final String s, final String s2) {
        final File file = new File((File)this.G, s);
        file.mkdirs();
        return new File(file, s2);
    }
    
    public void g(Throwable cause, final Thread obj, final String s, final String b, final long a, final boolean b2) {
        final boolean equals = b.equals((Object)"crash");
        final t t = (t)this.D;
        final Context a2 = t.a;
        final int orientation = a2.getResources().getConfiguration().orientation;
        final Stack stack = new Stack();
        while (cause != null) {
            stack.push((Object)cause);
            cause = cause.getCause();
        }
        final Boolean b3 = null;
        Rc rc = null;
        h1.m d;
        while (true) {
            final boolean empty = ((AbstractCollection)stack).isEmpty();
            d = t.d;
            if (empty) {
                break;
            }
            final Throwable t2 = (Throwable)stack.pop();
            rc = new Rc((Object)t2.getLocalizedMessage(), (Object)t2.getClass().getName(), (Object)d.l(t2.getStackTrace()), (Object)rc, 20);
        }
        final Object o = new Object();
        ((O)o).b = b;
        ((O)o).a = a;
        ((O)o).g |= 0x1;
        final D0 e = h3.c.b.e(a2);
        final int c = ((a0)e).c;
        Boolean value = b3;
        if (c > 0) {
            value = (c != 100);
        }
        final ArrayList d2 = h3.c.d(a2);
        final byte b4 = 1;
        final ArrayList list = new ArrayList();
        final StackTraceElement[] array = (StackTraceElement[])rc.F;
        final String name = obj.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        final byte b5 = 1;
        final List d3 = k3.t.d(array, 4);
        if (d3 == null) {
            throw new NullPointerException("Null frames");
        }
        if (b5 != 1) {
            final StringBuilder sb = new StringBuilder();
            if (b5 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(L.k("Missing required properties:", sb));
        }
        list.add((Object)new W(name, 4, d3));
        if (b2) {
            for (final Map$Entry map$Entry : Thread.getAllStackTraces().entrySet()) {
                final Thread thread = (Thread)map$Entry.getKey();
                if (!thread.equals(obj)) {
                    final StackTraceElement[] l = d.l((StackTraceElement[])map$Entry.getValue());
                    final String name2 = thread.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    final List d4 = k3.t.d(l, 0);
                    if (d4 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b5 != 1) {
                        final StringBuilder sb2 = new StringBuilder();
                        if (b5 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(L.k("Missing required properties:", sb2));
                    }
                    list.add((Object)new W(name2, 0, d4));
                }
            }
        }
        final List unmodifiableList = Collections.unmodifiableList((List)list);
        final U c2 = k3.t.c(rc, 0);
        final n3.V e2 = k3.t.e();
        final List a3 = t.a();
        if (a3 == null) {
            throw new NullPointerException("Null binaries");
        }
        final S s2 = new S(unmodifiableList, c2, null, e2, a3);
        if (b4 != 1) {
            final StringBuilder sb3 = new StringBuilder();
            if (b4 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(L.k("Missing required properties:", sb3));
        }
        ((O)o).c = new Q(s2, null, null, value, e, (List)d2, orientation);
        ((O)o).d = t.b(orientation);
        final P a4 = ((O)o).a();
        final e e3 = (e)this.G;
        final q1 q1 = (q1)this.H;
        final K0 b6 = b(a(a4, e3, q1), q1);
        if (!b2) {
            ((l3.c)this.J).b.a((Runnable)new V((Object)this, (Object)b6, s, equals, 1));
            return;
        }
        ((q3.a)this.E).d(b6, s, equals);
    }
    
    public Object get() {
        switch (this.C) {
            default: {
                return new h((Context)((C)this.D).D, (o1.e)((a)this.E).get(), (u1.d)((a)this.F).get(), (t1.c)((w2.e)this.G).get(), (Executor)((a)this.H).get(), (v1.c)((a)this.I).get(), (w1.a)new f(22), (w1.a)new Object(), (u1.c)((a)this.J).get());
            }
            case 1: {
                return new N3.b((X2.f)((Q3.a)this.D).get(), (E3.b)((C2.f)this.E).get(), (F3.e)((C2.b)this.F).get(), (E3.b)((Q3.a)this.G).get(), (RemoteConfigManager)((D)this.H).get(), (P3.a)((K2.C)this.I).get(), (SessionManager)((K2.C)this.J).get());
            }
        }
    }
    
    public O2.t k(final l3.b b, String s) {
        final ArrayList b2 = ((q3.a)this.E).b();
        final ArrayList list = new ArrayList();
        for (final File file : b2) {
            try {
                final o3.a g = q3.a.g;
                final String e = q3.a.e(file);
                g.getClass();
                list.add((Object)new k3.a(o3.a.i(e), file.getName(), file));
            }
            catch (final IOException ex) {
                final StringBuilder sb = new StringBuilder("Could not load report file ");
                sb.append((Object)file);
                sb.append("; deleting");
                Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)ex);
                file.delete();
            }
        }
        final ArrayList list2 = new ArrayList();
        for (k3.a a : list) {
            if (s != null && !s.equals((Object)a.b)) {
                continue;
            }
            final r3.a a2 = (r3.a)this.F;
            Object o = a.a;
            final String f = ((B)o).f;
            final int n = 1;
            k3.a a3 = null;
            Label_0342: {
                if (f != null) {
                    a3 = a;
                    if (((B)o).g != null) {
                        break Label_0342;
                    }
                }
                final y b3 = ((z)this.I).b(true);
                final A a4 = a.a.a();
                a4.e = b3.a;
                o = a4.a().a();
                ((A)o).f = b3.b;
                a3 = new k3.a(((A)o).a(), a.b, a.c);
            }
            final boolean b4 = s != null;
            Object a5 = a2.a;
            Object f2 = ((r3.c)a5).f;
            monitorenter(f2);
            Label_0814: {
                Label_0787: {
                    Label_0763: {
                        try {
                            o = new O2.j();
                            if (!b4) {
                                break Label_0763;
                            }
                            ((AtomicInteger)((r3.c)a5).i.D).getAndIncrement();
                            int n2;
                            if (((r3.c)a5).f.size() < ((r3.c)a5).e) {
                                n2 = n;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                final h3.c a6 = h3.c.a;
                                final StringBuilder sb2 = new StringBuilder("Enqueueing report: ");
                                sb2.append(a3.b);
                                a6.c(sb2.toString());
                                final StringBuilder sb3 = new StringBuilder("Queue size: ");
                                sb3.append(((r3.c)a5).f.size());
                                a6.c(sb3.toString());
                                final ThreadPoolExecutor g2 = ((r3.c)a5).g;
                                final Object o2 = f2 = f2;
                                try {
                                    final v v = new v(a5, (Object)a3, o, 28, false);
                                    f2 = o2;
                                    g2.execute((Runnable)v);
                                    f2 = o2;
                                    f2 = o2;
                                    a5 = new StringBuilder("Closing task for report: ");
                                    f2 = o2;
                                    ((StringBuilder)a5).append(a3.b);
                                    f2 = o2;
                                    a6.c(((StringBuilder)a5).toString());
                                    f2 = o2;
                                    ((O2.j)o).d((Object)a3);
                                    f2 = o2;
                                    monitorexit(o2);
                                }
                                finally {}
                            }
                        }
                        finally {
                            s = (String)f2;
                            break Label_0814;
                        }
                        final ArrayBlockingQueue arrayBlockingQueue = (ArrayBlockingQueue)f2;
                        ((r3.c)a5).a();
                        final StringBuilder sb4 = new StringBuilder("Dropping report due to queue being full: ");
                        sb4.append(a3.b);
                        final String string = sb4.toString();
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", string, (Throwable)null);
                        }
                        ((AtomicInteger)((r3.c)a5).i.E).getAndIncrement();
                        ((O2.j)o).d((Object)a3);
                        monitorexit(arrayBlockingQueue);
                        break Label_0787;
                    }
                    final ArrayBlockingQueue arrayBlockingQueue2 = (ArrayBlockingQueue)f2;
                    ((r3.c)a5).b(a3, (O2.j)o);
                    monitorexit(arrayBlockingQueue2);
                }
                final Executor executor;
                list2.add((Object)((O2.j)o).a.l(executor, (O2.a)new h3.d((Object)this, 1)));
                continue;
            }
            monitorexit(s);
        }
        return u0.A((List)list2);
    }
}

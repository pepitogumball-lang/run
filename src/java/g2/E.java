package g2;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.LinkedList;
import e2.i;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.os.Process;
import O.n0;
import android.os.Build$VERSION;
import android.app.Application;
import java.util.Map;
import h2.d;
import java.util.List;
import java.util.ArrayList;
import io.flutter.embedding.android.FlutterActivity;
import f2.f;
import java.util.Arrays;
import android.util.Log;
import h2.q;
import android.os.Message;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import android.util.SparseIntArray;
import h2.n;
import java.util.Collection;
import f2.g;
import android.os.HandlerThread;
import h2.M;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.app.PendingIntent;
import t.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import h1.m;
import android.content.Context;
import j2.b;
import h2.p;
import com.google.android.gms.common.api.Status;
import android.os.Handler$Callback;

public final class e implements Handler$Callback
{
    public static final Status R;
    public static final Status S;
    public static final Object T;
    public static e U;
    public long C;
    public boolean D;
    public p E;
    public b F;
    public final Context G;
    public final e2.e H;
    public final m I;
    public final AtomicInteger J;
    public final AtomicInteger K;
    public final ConcurrentHashMap L;
    public l M;
    public final c N;
    public final c O;
    public final A2.b P;
    public volatile boolean Q;
    
    static {
        R = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent)null, (e2.b)null);
        S = new Status(4, "The user must be signed in to make this API call.", (PendingIntent)null, (e2.b)null);
        T = new Object();
    }
    
    public e(final Context g, final Looper looper) {
        final e2.e d = e2.e.d;
        this.C = 10000L;
        this.D = false;
        boolean b = true;
        this.J = new AtomicInteger(1);
        this.K = new AtomicInteger(0);
        this.L = new ConcurrentHashMap(5, 0.75f, 1);
        this.M = null;
        this.N = new c(0);
        this.O = new c(0);
        this.Q = true;
        this.G = g;
        final A2.b p2 = new A2.b(looper, (Handler$Callback)this, 5);
        Looper.getMainLooper();
        this.P = p2;
        this.H = d;
        this.I = new m(3);
        final PackageManager packageManager = g.getPackageManager();
        if (q2.b.g == null) {
            if (!q2.b.h() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                b = false;
            }
            q2.b.g = b;
        }
        if (q2.b.g) {
            this.Q = false;
        }
        ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(6));
    }
    
    public static Status b(final a a, final e2.b b) {
        final String s = (String)a.b.E;
        final String value = String.valueOf((Object)b);
        final StringBuilder sb = new StringBuilder(String.valueOf((Object)s).length() + 63 + value.length());
        sb.append("API: ");
        sb.append(s);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(value);
        return new Status(17, sb.toString(), b.E, b);
    }
    
    public static e c(Context applicationContext) {
        final Object t;
        monitorenter(t = e.T);
        try {
            if (e.U == null) {
                final Object g;
                monitorenter(g = M.g);
                Label_0042: {
                    try {
                        final HandlerThread handlerThread = M.i;
                        if (handlerThread != null) {
                            monitorexit(g);
                            break Label_0042;
                        }
                        break Label_0042;
                    }
                    finally {
                        monitorexit(g);
                        final HandlerThread handlerThread;
                        final Looper looper = handlerThread.getLooper();
                        applicationContext = applicationContext.getApplicationContext();
                        final Object c = e2.e.c;
                        e.U = new e(applicationContext, looper);
                        ((Thread)(M.i = new HandlerThread("GoogleApiHandler", 9))).start();
                        handlerThread = M.i;
                        monitorexit(g);
                    }
                }
            }
        }
        finally {
            final e u = e.U;
            monitorexit(t);
            return u;
        }
    }
    
    public final o a(final g g) {
        final ConcurrentHashMap l = this.L;
        final a h = g.H;
        o o;
        if ((o = (o)l.get((Object)h)) == null) {
            o = new o(this, g);
            l.put((Object)h, (Object)o);
        }
        if (o.D.c()) {
            this.O.add((Object)h);
        }
        o.n();
        return o;
    }
    
    public final void d(final l m) {
        final Object t;
        monitorenter(t = e.T);
        Label_0035: {
            try {
                if (this.M != m) {
                    this.M = m;
                    this.N.clear();
                }
                break Label_0035;
            }
            finally {
                monitorexit(t);
                this.N.addAll((Collection)m.H);
                monitorexit(t);
            }
        }
    }
    
    public final boolean e() {
        if (this.D) {
            return false;
        }
        final h2.o o = (h2.o)n.b().C;
        if (o != null && !o.D) {
            return false;
        }
        final SparseIntArray sparseIntArray = (SparseIntArray)this.I.D;
        synchronized (sparseIntArray) {
            final int value = sparseIntArray.get(203400000, -1);
            monitorexit(sparseIntArray);
            return value == -1 || value == 0;
        }
    }
    
    public final boolean f(final e2.b b, final int n) {
        final e2.e h = this.H;
        h.getClass();
        final Context g = this.G;
        final boolean h2 = s2.a.h(g);
        boolean b2 = false;
        if (!h2) {
            final int d = b.D;
            Object o = b.E;
            if (d == 0 || o == null) {
                o = null;
                final Intent b3 = h.b(d, g, null);
                if (b3 != null) {
                    o = PendingIntent.getActivity(g, 0, b3, 201326592);
                }
            }
            if (o != null) {
                final int d2 = GoogleApiActivity.D;
                final Intent intent = new Intent(g, (Class)GoogleApiActivity.class);
                intent.putExtra("pending_intent", (Parcelable)o);
                intent.putExtra("failing_client_id", n);
                intent.putExtra("notify_manager", true);
                h.g(g, d, PendingIntent.getActivity(g, 0, intent, z2.c.a | 0x8000000));
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void g(final e2.b b, final int n) {
        if (!this.f(b, n)) {
            final A2.b p2 = this.P;
            ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(5, n, 0, (Object)b));
        }
    }
    
    public final boolean handleMessage(final Message message) {
        final int what = message.what;
        final A2.b p = this.P;
        final ConcurrentHashMap l = this.L;
        final q d = q.D;
        long c = 300000L;
        final int n = 0;
        Label_0170: {
            switch (what) {
                default: {
                    final StringBuilder sb = new StringBuilder(String.valueOf(what).length() + 20);
                    sb.append("Unknown message id: ");
                    sb.append(what);
                    Log.w("GoogleApiManager", sb.toString());
                    return false;
                }
                case 19: {
                    this.D = false;
                    break;
                }
                case 18: {
                    final u u = (u)message.obj;
                    final long c2 = u.c;
                    final h2.l a = u.a;
                    final int b = u.b;
                    if (c2 == 0L) {
                        final p p2 = new p(b, Arrays.asList((Object[])new h2.l[] { a }));
                        if (this.F == null) {
                            this.F = (b)new g(this.G, (FlutterActivity)null, j2.b.N, (f2.b)d, f.c);
                        }
                        this.F.e(p2);
                        break;
                    }
                    final p e = this.E;
                    if (e != null) {
                        final List d2 = e.D;
                        if (e.C == b && (d2 == null || d2.size() < u.d)) {
                            final p e2 = this.E;
                            if (e2.D == null) {
                                e2.D = (List)new ArrayList();
                            }
                            e2.D.add((Object)a);
                        }
                        else {
                            ((Handler)p).removeMessages(17);
                            final p e3 = this.E;
                            if (e3 != null) {
                                if (e3.C > 0 || this.e()) {
                                    if (this.F == null) {
                                        this.F = (b)new g(this.G, (FlutterActivity)null, j2.b.N, (f2.b)d, f.c);
                                    }
                                    this.F.e(e3);
                                }
                                this.E = null;
                            }
                        }
                    }
                    if (this.E == null) {
                        final ArrayList list = new ArrayList();
                        list.add((Object)a);
                        this.E = new p(b, (List)list);
                        ((Handler)p).sendMessageDelayed(((Handler)p).obtainMessage(17), c2);
                        break;
                    }
                    break;
                }
                case 17: {
                    final p e4 = this.E;
                    if (e4 != null) {
                        if (e4.C > 0 || this.e()) {
                            if (this.F == null) {
                                this.F = (b)new g(this.G, (FlutterActivity)null, b.N, (f2.b)d, f.c);
                            }
                            this.F.e(e4);
                        }
                        this.E = null;
                        break;
                    }
                    break;
                }
                case 16: {
                    final g2.p p3 = (g2.p)message.obj;
                    if (!l.containsKey((Object)p3.a)) {
                        break;
                    }
                    final o o = (o)l.get((Object)p3.a);
                    if (o.L.remove((Object)p3)) {
                        final e o2 = o.O;
                        ((Handler)o2.P).removeMessages(15, (Object)p3);
                        ((Handler)o2.P).removeMessages(16, (Object)p3);
                        final LinkedList c3 = o.C;
                        final ArrayList list2 = new ArrayList(c3.size());
                        final Iterator iterator = ((Collection)c3).iterator();
                        e2.d b2;
                        while (true) {
                            final boolean hasNext = iterator.hasNext();
                            b2 = p3.b;
                            if (!hasNext) {
                                break;
                            }
                            final A a2 = (A)iterator.next();
                            if (!(a2 instanceof v)) {
                                continue;
                            }
                            final e2.d[] f = ((v)a2).f(o);
                            if (f == null) {
                                continue;
                            }
                            final int length = f.length;
                            int i = 0;
                            while (i < length) {
                                if (h2.A.l((Object)f[i], (Object)b2)) {
                                    if (i >= 0) {
                                        list2.add((Object)a2);
                                        break;
                                    }
                                    break;
                                }
                                else {
                                    ++i;
                                }
                            }
                        }
                        for (int size = list2.size(), j = n; j < size; ++j) {
                            final A a3 = (A)list2.get(j);
                            c3.remove((Object)a3);
                            a3.b((RuntimeException)new f2.m(b2));
                        }
                        break;
                    }
                    break;
                }
                case 15: {
                    final g2.p p4 = (g2.p)message.obj;
                    if (!l.containsKey((Object)p4.a)) {
                        break;
                    }
                    final o o3 = (o)l.get((Object)p4.a);
                    if (!o3.L.contains((Object)p4)) {
                        break;
                    }
                    if (o3.K) {
                        break;
                    }
                    if (!((d)o3.D).q()) {
                        o3.n();
                        break;
                    }
                    o3.d();
                    break;
                }
                case 14: {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                case 12: {
                    if (!l.containsKey(message.obj)) {
                        break;
                    }
                    final o o4 = (o)l.get(message.obj);
                    h2.A.c(o4.O.P);
                    final f2.c d3 = o4.D;
                    if (!((d)d3).q() || !o4.H.isEmpty()) {
                        break;
                    }
                    final com.google.android.gms.internal.auth.l f2 = o4.F;
                    if (((Map)f2.D).isEmpty() && ((Map)f2.E).isEmpty()) {
                        d3.a("Timing out service connection.");
                        break;
                    }
                    o4.h();
                    break;
                }
                case 11: {
                    if (!l.containsKey(message.obj)) {
                        break;
                    }
                    final o o5 = (o)l.get(message.obj);
                    final e o6 = o5.O;
                    h2.A.c(o6.P);
                    final boolean k = o5.K;
                    if (k) {
                        if (k) {
                            final e o7 = o5.O;
                            final A2.b p5 = o7.P;
                            final a e5 = o5.E;
                            ((Handler)p5).removeMessages(11, (Object)e5);
                            ((Handler)o7.P).removeMessages(9, (Object)e5);
                            o5.K = false;
                        }
                        Status status;
                        if (o6.H.c(o6.G, e2.f.a) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.", (PendingIntent)null, (e2.b)null);
                        }
                        else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.", (PendingIntent)null, (e2.b)null);
                        }
                        o5.g(status);
                        o5.D.a("Timing out connection while resuming.");
                        break;
                    }
                    break;
                }
                case 10: {
                    final c o8 = this.O;
                    final Iterator iterator2 = o8.iterator();
                    while (true) {
                        final t.f f3 = (t.f)iterator2;
                        if (!f3.hasNext()) {
                            break;
                        }
                        final o o9 = (o)l.remove((Object)f3.next());
                        if (o9 == null) {
                            continue;
                        }
                        o9.m();
                    }
                    o8.clear();
                    break;
                }
                case 9: {
                    if (!l.containsKey(message.obj)) {
                        break;
                    }
                    final o o10 = (o)l.get(message.obj);
                    h2.A.c(o10.O.P);
                    if (o10.K) {
                        o10.n();
                        break;
                    }
                    break;
                }
                case 7: {
                    this.a((g)message.obj);
                    break;
                }
                case 6: {
                    final Context g = this.G;
                    if (!(g.getApplicationContext() instanceof Application)) {
                        break;
                    }
                    g2.c.b((Application)g.getApplicationContext());
                    final g2.c g2 = g2.c.G;
                    g2.a((g2.b)new g2.m(this));
                    final AtomicBoolean d4 = g2.D;
                    final boolean value = d4.get();
                    final AtomicBoolean c4 = g2.C;
                    boolean value2 = false;
                    Label_1604: {
                        if (!value) {
                            Boolean m;
                            if ((m = q2.b.k) == null) {
                                if (Build$VERSION.SDK_INT >= 28) {
                                    m = n0.u();
                                }
                                else {
                                    try {
                                        final Object invoke = Process.class.getDeclaredMethod("isIsolated", (Class<?>[])null).invoke((Object)null, (Object[])null);
                                        if (invoke == null) {
                                            throw new RuntimeException(a.a.A("expected a non-null reference", new Object[0]));
                                        }
                                        m = (Boolean)invoke;
                                    }
                                    catch (final ReflectiveOperationException ex) {
                                        m = Boolean.FALSE;
                                    }
                                }
                                q2.b.k = m;
                            }
                            if (m) {
                                value2 = true;
                                break Label_1604;
                            }
                            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
                            if (!d4.getAndSet(true) && activityManager$RunningAppProcessInfo.importance > 100) {
                                c4.set(true);
                            }
                        }
                        value2 = c4.get();
                    }
                    if (!value2) {
                        this.C = 300000L;
                        break;
                    }
                    break;
                }
                case 5: {
                    final int arg1 = message.arg1;
                    final e2.b b3 = (e2.b)message.obj;
                    while (true) {
                        for (final o o11 : l.values()) {
                            if (o11.I == arg1) {
                                if (o11 == null) {
                                    final StringBuilder sb2 = new StringBuilder(String.valueOf(arg1).length() + 65);
                                    sb2.append("Could not find API instance ");
                                    sb2.append(arg1);
                                    sb2.append(" while trying to fail enqueued calls.");
                                    Log.wtf("GoogleApiManager", sb2.toString(), (Throwable)new Exception());
                                    break Label_0170;
                                }
                                final int d5 = b3.D;
                                if (d5 == 13) {
                                    this.H.getClass();
                                    final AtomicBoolean a4 = i.a;
                                    final String i2 = e2.b.i(d5);
                                    final int length2 = String.valueOf((Object)i2).length();
                                    final String f4 = b3.F;
                                    final StringBuilder sb3 = new StringBuilder(length2 + 69 + String.valueOf((Object)f4).length());
                                    sb3.append("Error resolution was canceled by the user, original error message: ");
                                    sb3.append(i2);
                                    sb3.append(": ");
                                    sb3.append(f4);
                                    o11.g(new Status(17, sb3.toString(), (PendingIntent)null, (e2.b)null));
                                    break Label_0170;
                                }
                                o11.g(b(o11.E, b3));
                                break Label_0170;
                            }
                        }
                        o o11 = null;
                        continue;
                    }
                }
                case 4:
                case 8:
                case 13: {
                    final w w = (w)message.obj;
                    final g c5 = w.c;
                    o a5;
                    if ((a5 = (o)l.get((Object)c5.H)) == null) {
                        a5 = this.a(c5);
                    }
                    final boolean c6 = a5.D.c();
                    final A a6 = w.a;
                    if (c6 && this.K.get() != w.b) {
                        a6.a(e.R);
                        a5.m();
                        break;
                    }
                    a5.l(a6);
                    break;
                }
                case 3: {
                    for (final o o12 : l.values()) {
                        h2.A.c(o12.O.P);
                        o12.M = null;
                        o12.n();
                    }
                    break;
                }
                case 2: {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                case 1: {
                    if (message.obj) {
                        c = 10000L;
                    }
                    this.C = c;
                    ((Handler)p).removeMessages(12);
                    final Iterator iterator5 = l.keySet().iterator();
                    while (iterator5.hasNext()) {
                        ((Handler)p).sendMessageDelayed(((Handler)p).obtainMessage(12, (Object)iterator5.next()), this.C);
                    }
                    break;
                }
            }
        }
        return true;
    }
}

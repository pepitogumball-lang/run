package n3;

import android.os.ParcelFileDescriptor;
import android.os.BaseBundle;
import java.io.Serializable;
import java.util.Collection;
import com.google.android.gms.internal.ads.Rc;
import Z4.C;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;
import o.p1;
import o.n1;
import android.os.Build$VERSION;
import android.view.View;
import d5.n;
import java.util.LinkedHashSet;
import java.util.Set;
import java.nio.channels.FileChannel;
import android.content.ContentResolver;
import java.nio.channels.FileChannel$MapMode;
import java.io.FileInputStream;
import android.os.CancellationSignal;
import java.nio.MappedByteBuffer;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import android.content.Intent;
import android.os.Process;
import android.content.Context;
import e5.j;
import android.os.StrictMode$ThreadPolicy;
import android.util.Log;
import java.io.FileOutputStream;
import android.os.StrictMode;
import java.io.InputStream;
import android.content.res.Resources;
import java.io.File;
import java.io.Closeable;
import O2.p;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import android.os.Looper;
import h2.A;
import W.g;
import java.util.ArrayList;
import m5.l;
import com.google.android.gms.internal.auth.h;
import n5.o;
import e5.d;
import W.z;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import com.google.android.gms.internal.auth.c0;
import java.io.IOException;
import com.google.android.gms.internal.auth.n0;
import com.google.android.gms.internal.auth.L;
import com.google.android.gms.internal.auth.K;
import com.google.android.gms.internal.auth.k0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import com.google.android.gms.internal.auth.F;
import com.google.android.gms.internal.auth.O;
import com.google.android.gms.internal.ads.U1;
import K2.N0;
import O2.a;
import C2.b;
import java.util.Arrays;
import java.util.Collections;
import O2.s;
import java.util.Iterator;
import O2.c;
import O2.e;
import O2.f;
import java.util.concurrent.Executor;
import O2.k;
import O2.m;
import O2.i;
import O2.t;
import java.util.List;
import java.lang.reflect.Field;

public abstract class u0
{
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    
    public static t A(final List list) {
        if (list != null && !((Collection)list).isEmpty()) {
            final Iterator iterator = ((Collection)list).iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != null) {
                    continue;
                }
                throw new NullPointerException("null tasks are not accepted");
            }
            final t t = new t();
            final m m = new m(((Collection)list).size(), t);
            for (final i i : list) {
                final s b = k.b;
                i.d((Executor)b, (f)m);
                i.c((Executor)b, (e)m);
                i.a((Executor)b, m);
            }
            return t;
        }
        return m(null);
    }
    
    public static t B(final i... array) {
        if (array.length == 0) {
            return m(Collections.emptyList());
        }
        final List list = Arrays.asList((Object[])array);
        final N0 a = k.a;
        t t;
        if (list != null && !((Collection)list).isEmpty()) {
            final List list2 = list;
            t = A(list2).e((Executor)a, (a)new b(list2));
        }
        else {
            t = m(Collections.emptyList());
        }
        return t;
    }
    
    public static int C(final byte[] array, int j, final U1 u1) {
        j = J(array, j, u1);
        final int d = u1.D;
        if (d < 0) {
            throw O.b();
        }
        if (d > array.length - j) {
            throw O.d();
        }
        if (d == 0) {
            u1.F = F.E;
            return j;
        }
        u1.F = F.r(array, j, d);
        return j + d;
    }
    
    public static Object D(final i i) {
        if (i.j()) {
            return i.g();
        }
        if (((t)i).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException((Throwable)i.f());
    }
    
    public static int E(final int n, final byte[] array) {
        return (array[n + 3] & 0xFF) << 24 | ((array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF) | (array[n + 2] & 0xFF) << 16);
    }
    
    public static int F(final k0 k0, final byte[] array, int n, final int n2, final int n3, final U1 u1) {
        final K h = k0.h();
        n = N(h, k0, array, n, n2, n3, u1);
        k0.b((Object)h);
        u1.F = h;
        return n;
    }
    
    public static int G(final k0 k0, final int n, final byte[] array, int i, final int n2, final L l, final U1 u1) {
        final K h = k0.h();
        i = O(h, k0, array, i, n2, u1);
        k0.b((Object)h);
        ((List)l).add(u1.F = h);
        while (i < n2) {
            final int j = J(array, i, u1);
            if (n != u1.D) {
                break;
            }
            final K h2 = k0.h();
            i = O(h2, k0, array, j, n2, u1);
            k0.b((Object)h2);
            ((List)l).add(u1.F = h2);
        }
        return i;
    }
    
    public static int H(final byte[] array, int n, final L l, final U1 u1) {
        if (l != null) {
            throw new ClassCastException();
        }
        final int j = J(array, n, u1);
        n = u1.D + j;
        if (j < n) {
            J(array, j, u1);
            throw null;
        }
        if (j == n) {
            return j;
        }
        throw O.d();
    }
    
    public static int I(final int n, final byte[] array, int n2, int j, final n0 n3, final U1 u1) {
        if (n >>> 3 == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        final int n4 = n & 0x7;
        if (n4 == 0) {
            n2 = M(array, n2, u1);
            n3.b(n, (Object)u1.E);
            return n2;
        }
        if (n4 == 1) {
            n3.b(n, (Object)P(n2, array));
            return n2 + 8;
        }
        if (n4 != 2) {
            if (n4 != 3) {
                if (n4 == 5) {
                    n3.b(n, (Object)E(n2, array));
                    return n2 + 4;
                }
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            else {
                final int n5 = (n & 0xFFFFFFF8) | 0x4;
                final n0 a = n0.a();
                int d = 0;
                int n6;
                int n7;
                while (true) {
                    n6 = d;
                    n7 = n2;
                    if (n2 >= j) {
                        break;
                    }
                    final int i = J(array, n2, u1);
                    d = u1.D;
                    if ((n2 = d) == n5) {
                        n7 = i;
                        n6 = n2;
                        break;
                    }
                    n2 = I(n2, array, i, j, a, u1);
                }
                if (n7 <= j && n6 == n5) {
                    n3.b(n, (Object)a);
                    return n7;
                }
                throw O.c();
            }
        }
        else {
            j = J(array, n2, u1);
            n2 = u1.D;
            if (n2 < 0) {
                throw O.b();
            }
            if (n2 <= array.length - j) {
                if (n2 == 0) {
                    n3.b(n, (Object)F.E);
                }
                else {
                    n3.b(n, (Object)F.r(array, j, n2));
                }
                return j + n2;
            }
            throw O.d();
        }
    }
    
    public static int J(final byte[] array, int d, final U1 u1) {
        final int n = d + 1;
        d = array[d];
        if (d >= 0) {
            u1.D = d;
            return n;
        }
        return K(d, n, u1, array);
    }
    
    public static int K(int n, int n2, final U1 u1, final byte[] array) {
        final byte b = array[n2];
        final int n3 = n2 + 1;
        n &= 0x7F;
        if (b >= 0) {
            u1.D = (n | b << 7);
            return n3;
        }
        final int n4 = n | (b & 0x7F) << 7;
        n = n2 + 2;
        final byte b2 = array[n3];
        if (b2 >= 0) {
            u1.D = (n4 | b2 << 14);
            return n;
        }
        final int n5 = n4 | (b2 & 0x7F) << 14;
        final int n6 = n2 + 3;
        n = array[n];
        if (n >= 0) {
            u1.D = (n5 | n << 21);
            return n6;
        }
        final int n7 = n5 | (n & 0x7F) << 21;
        n = n2 + 4;
        final byte b3 = array[n6];
        if (b3 >= 0) {
            u1.D = (n7 | b3 << 28);
            return n;
        }
        while (true) {
            n2 = n + 1;
            if (array[n] >= 0) {
                break;
            }
            n = n2;
        }
        u1.D = (n7 | (b3 & 0x7F) << 28);
        return n2;
    }
    
    public static void L(final byte[] array, final int n, final L l, final U1 u1) {
        if (l == null) {
            J(array, n, u1);
            throw null;
        }
        throw new ClassCastException();
    }
    
    public static int M(final byte[] array, int n, final U1 u1) {
        final long e = array[n];
        final int n2 = n + 1;
        if (e >= 0L) {
            u1.E = e;
            return n2;
        }
        n += 2;
        byte b = array[n2];
        long e2 = (e & 0x7FL) | (long)(b & 0x7F) << 7;
        for (int n3 = 7; b < 0; b = array[n], n3 += 7, e2 |= (long)(b & 0x7F) << n3, ++n) {}
        u1.E = e2;
        return n;
    }
    
    public static int N(final Object f, final k0 k0, final byte[] array, int n, final int n2, final int n3, final U1 u1) {
        n = ((c0)k0).n(f, array, n, n2, n3, u1);
        u1.F = f;
        return n;
    }
    
    public static int O(final Object f, final k0 k0, final byte[] array, int i, int n, final U1 u1) {
        final int n2 = i + 1;
        final byte b = array[i];
        i = n2;
        int d = b;
        if (b < 0) {
            i = K(b, n2, u1, array);
            d = u1.D;
        }
        if (d >= 0 && d <= n - i) {
            n = d + i;
            k0.e(f, array, i, n, u1);
            u1.F = f;
            return n;
        }
        throw O.d();
    }
    
    public static long P(final int n, final byte[] array) {
        return ((long)array[n] & 0xFFL) | ((long)array[n + 1] & 0xFFL) << 8 | ((long)array[n + 2] & 0xFFL) << 16 | ((long)array[n + 3] & 0xFFL) << 24 | ((long)array[n + 4] & 0xFFL) << 32 | ((long)array[n + 5] & 0xFFL) << 40 | ((long)array[n + 6] & 0xFFL) << 48 | ((long)array[n + 7] & 0xFFL) << 56;
    }
    
    public static Object a(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
        Object fromParcel;
        if (parcel.readInt() != 0) {
            fromParcel = parcelable$Creator.createFromParcel(parcel);
        }
        else {
            fromParcel = null;
        }
        return fromParcel;
    }
    
    public static final Object b(List o, z f, final g5.c c) {
        Object o2 = null;
        Label_0052: {
            if (c instanceof W.e) {
                final W.e e = (W.e)c;
                final int i = e.I;
                if ((i & Integer.MIN_VALUE) != 0x0) {
                    e.I = i + Integer.MIN_VALUE;
                    o2 = e;
                    break Label_0052;
                }
            }
            o2 = new g5.c((d)c);
        }
        final Object h = ((W.e)o2).H;
        final f5.a c2 = f5.a.C;
        final int j = ((W.e)o2).I;
        Object g;
        W.e e2;
        Object o3;
        Object o4;
        Object c3;
        final Throwable c4;
        l l;
        Object f2;
        g g2;
        Label_0360:Label_0200_Outer:
        while (true) {
            Label_0143: {
                if (j == 0) {
                    break Label_0143;
                }
                Label_0127: {
                    if (j == 1) {
                        break Label_0127;
                    }
                    Label_0116: {
                        if (j != 2) {
                            break Label_0116;
                        }
                        g = ((W.e)o2).G;
                        f = ((W.e)o2).F;
                        e2 = (W.e)o2;
                        o3 = g;
                        o4 = f;
                        try {
                            com.google.android.gms.internal.auth.h.z(h);
                            break Label_0218;
                        }
                        finally {
                            c3 = ((o)o4).C;
                            if (c3 == null) {
                                ((o)o4).C = c4;
                                o2 = e2;
                                g = o3;
                                f = o4;
                            }
                            else {
                                a.a.a((Throwable)c3, c4);
                                o2 = e2;
                                g = o3;
                                f = o4;
                            }
                            while (((Iterator)g).hasNext()) {
                                l = (l)((Iterator)g).next();
                                ((W.e)o2).F = (Serializable)f;
                                ((W.e)o2).G = (Iterator)g;
                                ((W.e)o2).I = 2;
                                if (l.g(o2) == c2) {
                                    return c2;
                                }
                            }
                            break Label_0360;
                            g = c2;
                            return g;
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            Label_0197: {
                                o = f2;
                            }
                            while (true) {
                                f = new Object();
                                g = ((Iterable)o).iterator();
                                continue Label_0200_Outer;
                                g = c2;
                                return g;
                                com.google.android.gms.internal.auth.h.z(h);
                                f2 = new ArrayList();
                                g2 = new g((List)o, (ArrayList)f2, (d)null);
                                ((W.e)o2).F = (Serializable)f2;
                                ((W.e)o2).I = 1;
                                iftrue(Label_0197:)(((z)f).a(g2, (g5.c)o2) != c2);
                                return c2;
                                o = ((W.e)o2).F;
                                com.google.android.gms.internal.auth.h.z(h);
                                continue;
                            }
                        }
                    }
                }
            }
            continue;
        }
        final Throwable t = (Throwable)((o)f).C;
        if (t != null) {
            throw t;
        }
        g = c5.h.a;
        return g;
    }
    
    public static Object c(final i i) {
        A.g("Must not be called on the main application thread");
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals((Object)myLooper.getThread().getName(), (Object)"GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        A.i("Task must not be null", (Object)i);
        if (i.i()) {
            return D(i);
        }
        final O2.l l = new O2.l(0);
        final s b = k.b;
        i.d((Executor)b, (f)l);
        i.c((Executor)b, (e)l);
        i.a((Executor)b, l);
        l.D.await();
        return D(i);
    }
    
    public static Object d(final t t, final long n, final TimeUnit timeUnit) {
        A.g("Must not be called on the main application thread");
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals((Object)myLooper.getThread().getName(), (Object)"GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        A.i("Task must not be null", (Object)t);
        A.i("TimeUnit must not be null", (Object)timeUnit);
        if (t.i()) {
            return D(t);
        }
        final O2.l l = new O2.l(0);
        final s b = k.b;
        t.d((Executor)b, (f)l);
        t.c((Executor)b, (e)l);
        t.a((Executor)b, l);
        if (l.D.await(n, timeUnit)) {
            return D(t);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
    
    public static final Z.d e(final String s) {
        n5.h.e("name", (Object)s);
        return new Z.d(s);
    }
    
    public static t f(final Executor executor, final Callable callable) {
        A.i("Executor must not be null", (Object)executor);
        final t t = new t();
        executor.execute((Runnable)new p(t, 2, callable));
        return t;
    }
    
    public static void g(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static boolean h(final File file, final Resources resources, final int n) {
        Closeable closeable;
        try {
            final InputStream openRawResource = resources.openRawResource(n);
            try {
                final boolean i = i(file, openRawResource);
                g((Closeable)openRawResource);
                return i;
            }
            finally {}
        }
        finally {
            closeable = null;
        }
        g(closeable);
    }
    
    public static boolean i(final File file, final InputStream ex) {
        final StrictMode$ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        final Closeable closeable = null;
        Object o = null;
        Label_0153: {
            Closeable closeable2;
            try {
                try {
                    o = o;
                    final FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    try {
                        final byte[] array = new byte[1024];
                        while (true) {
                            final int read = ((InputStream)ex).read(array);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(array, 0, read);
                        }
                    }
                    catch (final IOException ex) {}
                    finally {
                        o = fileOutputStream;
                        break Label_0153;
                    }
                    g((Closeable)fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                finally {}
            }
            catch (final IOException ex) {
                closeable2 = closeable;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Error copying resource contents to temp file: ");
            sb.append(((Throwable)ex).getMessage());
            Log.e("TypefaceCompatUtil", sb.toString());
            g(closeable2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
        g((Closeable)o);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
    }
    
    public static d j(final m5.p p3, final w5.a a, final w5.a a2) {
        n5.h.e("<this>", (Object)p3);
        Object i;
        if (p3 instanceof g5.a) {
            i = ((g5.a)p3).i((d)a2, (Object)a);
        }
        else {
            final j c = j.C;
            final e5.i e = a2.E;
            if (e == c) {
                i = new f5.b(p3, a2, a);
            }
            else {
                i = new f5.c(a2, e, p3, a);
            }
        }
        return (d)i;
    }
    
    public static boolean k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: invokestatic    X2/f.e:()LX2/f;
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokevirtual   X2/f.a:()V
        //    12: aload_1        
        //    13: getfield        X2/f.a:Landroid/content/Context;
        //    16: astore_1       
        //    17: aload_1        
        //    18: ldc_w           "com.google.firebase.messaging"
        //    21: iconst_0       
        //    22: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    25: astore_2       
        //    26: aload_2        
        //    27: ldc_w           "export_to_big_query"
        //    30: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    35: ifeq            49
        //    38: aload_2        
        //    39: ldc_w           "export_to_big_query"
        //    42: iconst_0       
        //    43: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    48: ireturn        
        //    49: aload_1        
        //    50: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    53: astore_2       
        //    54: aload_2        
        //    55: ifnull          107
        //    58: aload_2        
        //    59: aload_1        
        //    60: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    63: sipush          128
        //    66: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    69: astore_1       
        //    70: aload_1        
        //    71: ifnull          107
        //    74: aload_1        
        //    75: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    78: astore_2       
        //    79: aload_2        
        //    80: ifnull          107
        //    83: aload_2        
        //    84: ldc_w           "delivery_metrics_exported_to_big_query_enabled"
        //    87: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //    90: ifeq            107
        //    93: aload_1        
        //    94: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    97: ldc_w           "delivery_metrics_exported_to_big_query_enabled"
        //   100: iconst_0       
        //   101: invokevirtual   android/os/BaseBundle.getBoolean:(Ljava/lang/String;Z)Z
        //   104: istore_0       
        //   105: iload_0        
        //   106: ireturn        
        //   107: iconst_0       
        //   108: ireturn        
        //   109: astore_1       
        //   110: ldc_w           "FirebaseMessaging"
        //   113: ldc_w           "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
        //   116: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   119: pop            
        //   120: iconst_0       
        //   121: ireturn        
        //   122: astore_1       
        //   123: goto            107
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      4      109    122    Ljava/lang/IllegalStateException;
        //  49     54     122    126    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  58     70     122    126    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  74     79     122    126    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  83     105    122    126    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
        //     at java.lang.Thread.run(Thread.java:1119)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static t l(final Exception ex) {
        final t t = new t();
        t.q(ex);
        return t;
    }
    
    public static t m(final Object o) {
        final t t = new t();
        t.o(o);
        return t;
    }
    
    public static File n(Context cacheDir) {
        cacheDir = (Context)cacheDir.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        final String string = sb.toString();
        int n = 0;
    Label_0118_Outer:
        while (true) {
            Label_0124: {
                if (n >= 100) {
                    break Label_0124;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(n);
                final File file = new File((File)cacheDir, sb2.toString());
                while (true) {
                    try {
                        if (file.createNewFile()) {
                            return file;
                        }
                        ++n;
                        continue Label_0118_Outer;
                        return null;
                    }
                    catch (final IOException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static d o(d e) {
        n5.h.e("<this>", e);
        g5.c c;
        if (e instanceof g5.c) {
            c = (g5.c)e;
        }
        else {
            c = null;
        }
        if (c != null && (e = c.E) == null) {
            final e5.f f = (e5.f)c.getContext().i((e5.h)e5.e.C);
            if (f != null) {
                e = new B5.h((w5.s)f, c);
            }
            else {
                e = c;
            }
            c.E = (d)e;
        }
        return (d)e;
    }
    
    public static void p(final Intent ex) {
        if (x((Intent)ex)) {
            q("_nr", ((Intent)ex).getExtras());
        }
        int n = 0;
        if (ex != null && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals((Object)((Intent)ex).getAction()) && k()) {
            final k1.f f = (k1.f)FirebaseMessaging.m.get();
            if (f != null) {
                M3.d d = null;
                final String s = null;
            Label_0225_Outer:
                while (true) {
                    if (ex == null) {
                        break Label_0827;
                    }
                    Bundle bundle;
                    if ((bundle = ((Intent)ex).getExtras()) == null) {
                        bundle = Bundle.EMPTY;
                    }
                    final Object value = ((BaseBundle)bundle).get("google.ttl");
                    Label_0207: {
                        int n2 = 0;
                        Label_0146: {
                            if (!(value instanceof Integer)) {
                                if (value instanceof String) {
                                    try {
                                        n2 = Integer.parseInt((String)value);
                                        break Label_0146;
                                    }
                                    catch (final NumberFormatException ex2) {
                                        final StringBuilder sb = new StringBuilder("Invalid TTL: ");
                                        sb.append(value);
                                        Log.w("FirebaseMessaging", sb.toString());
                                    }
                                }
                                final int n3 = 0;
                                break Label_0207;
                            }
                            n2 = (int)value;
                        }
                        final int n3 = n2;
                    }
                    String string = ((BaseBundle)bundle).getString("google.to");
                    int n3;
                    X2.f e;
                    Object m;
                    String s2;
                    int n4;
                    String s3;
                    long n5;
                    String string2;
                    String s4;
                    String string3;
                    X2.f e2;
                    X2.i c;
                    String e3;
                    X2.f e4;
                    String packageName;
                    M3.b b;
                    String s6;
                    String s5;
                    String b2;
                    String string4;
                    String string5;
                    String[] split;
                    Block_17_Outer:Label_0358_Outer:Label_0574_Outer:Label_0785_Outer:
                    while (true) {
                        if (!TextUtils.isEmpty((CharSequence)string)) {
                            break Label_0225;
                        }
                        Label_0228: {
                            break Label_0228;
                            Label_0263: {
                                break Label_0263;
                                try {
                                    e = X2.f.e();
                                    m = F3.d.m;
                                    string = (String)c(((F3.d)e.c((Class)F3.e.class)).c());
                                    continue Block_17_Outer;
                                    Label_0785:Label_0668_Outer:
                                    while (true) {
                                        Label_0735: {
                                            while (true) {
                                                Label_0454:Label_0528_Outer:Block_30_Outer:
                                                while (true) {
                                                Block_19_Outer:
                                                    while (true) {
                                                        Label_0718: {
                                                            while (true) {
                                                                Label_0408: {
                                                                    while (true) {
                                                                        Label_0528:Label_0343_Outer:Block_32_Outer:
                                                                        while (true) {
                                                                            while (true) {
                                                                                Label_0551: {
                                                                                    while (true) {
                                                                                    Label_0437_Outer:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                            Label_0343:
                                                                                                while (true) {
                                                                                                Block_14:
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                        Label_0390:
                                                                                                            while (true) {
                                                                                                                Block_15: {
                                                                                                                    Block_25: {
                                                                                                                        while (true) {
                                                                                                                        Label_0296:
                                                                                                                            while (true) {
                                                                                                                                Block_13: {
                                                                                                                                    while (true) {
                                                                                                                                        Block_22: {
                                                                                                                                            while (true) {
                                                                                                                                                while (true) {
                                                                                                                                                    n = 5;
                                                                                                                                                    break Label_0408;
                                                                                                                                                    iftrue(Label_0374:)(!"high".equals((Object)s2));
                                                                                                                                                    break Block_15;
                                                                                                                                                    Label_0400: {
                                                                                                                                                        iftrue(Label_0408:)(n4 != 1);
                                                                                                                                                    }
                                                                                                                                                    n = 10;
                                                                                                                                                    break Label_0408;
                                                                                                                                                    iftrue(Label_0615:)(!((BaseBundle)bundle).containsKey("google.c.sender.id"));
                                                                                                                                                    break Label_0528;
                                                                                                                                                    try {
                                                                                                                                                        Label_0758:
                                                                                                                                                        n5 = Long.parseLong(s3);
                                                                                                                                                    }
                                                                                                                                                    catch (final NumberFormatException ex3) {
                                                                                                                                                        Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex3);
                                                                                                                                                        break Label_0735;
                                                                                                                                                    }
                                                                                                                                                    break Label_0785;
                                                                                                                                                    string2 = ((BaseBundle)bundle).getString("from");
                                                                                                                                                    s4 = s;
                                                                                                                                                    iftrue(Label_0492:)(string2 == null);
                                                                                                                                                    Block_21: {
                                                                                                                                                        break Block_21;
                                                                                                                                                        break Label_0528;
                                                                                                                                                        Label_0546:
                                                                                                                                                        string3 = "";
                                                                                                                                                        break Label_0551;
                                                                                                                                                        string3 = ((BaseBundle)bundle).getString("google.c.a.m_l");
                                                                                                                                                        iftrue(Label_0546:)(string3 == null);
                                                                                                                                                        break Block_25;
                                                                                                                                                        e2 = X2.f.e();
                                                                                                                                                        e2.a();
                                                                                                                                                        c = e2.c;
                                                                                                                                                        e3 = c.e;
                                                                                                                                                        iftrue(Label_0668:)(e3 == null);
                                                                                                                                                        break Label_0454;
                                                                                                                                                        e4 = X2.f.e();
                                                                                                                                                        e4.a();
                                                                                                                                                        packageName = e4.a.getPackageName();
                                                                                                                                                        iftrue(Label_0299:)(!C2.b.x(bundle));
                                                                                                                                                        break Block_13;
                                                                                                                                                    }
                                                                                                                                                    s4 = s;
                                                                                                                                                    iftrue(Label_0492:)(!string2.startsWith("/topics/"));
                                                                                                                                                    break Block_22;
                                                                                                                                                    Label_0374:
                                                                                                                                                    iftrue(Label_0388:)(!"normal".equals((Object)s2));
                                                                                                                                                    Block_16: {
                                                                                                                                                        break Block_16;
                                                                                                                                                        Label_0299:
                                                                                                                                                        b = M3.b.D;
                                                                                                                                                        break Label_0296;
                                                                                                                                                        s5 = s6;
                                                                                                                                                        continue Label_0454;
                                                                                                                                                    }
                                                                                                                                                    break Label_0343;
                                                                                                                                                    iftrue(Label_0400:)(n4 != 2);
                                                                                                                                                    continue Label_0358_Outer;
                                                                                                                                                }
                                                                                                                                                Label_0348: {
                                                                                                                                                    s2 = ((BaseBundle)bundle).getString("google.priority");
                                                                                                                                                }
                                                                                                                                                continue Label_0574_Outer;
                                                                                                                                            }
                                                                                                                                            Label_0388: {
                                                                                                                                                n4 = 0;
                                                                                                                                            }
                                                                                                                                            continue Label_0390;
                                                                                                                                            iftrue(Label_0358:)((s2 = ((BaseBundle)bundle).getString("google.delivered_priority")) != null);
                                                                                                                                            break Block_14;
                                                                                                                                            try {
                                                                                                                                                n5 = Long.parseLong(b2);
                                                                                                                                                break Label_0785;
                                                                                                                                            }
                                                                                                                                            catch (final NumberFormatException ex4) {
                                                                                                                                                Log.w("FirebaseMessaging", "error parsing app ID", (Throwable)ex4);
                                                                                                                                                break Label_0735;
                                                                                                                                            }
                                                                                                                                            break Label_0718;
                                                                                                                                            break Label_0798;
                                                                                                                                            iftrue(Label_0835:)(d != null);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        s4 = string2;
                                                                                                                                        Label_0492: {
                                                                                                                                            break Label_0492;
                                                                                                                                            Label_0500: {
                                                                                                                                                s4 = "";
                                                                                                                                            }
                                                                                                                                            break Label_0390;
                                                                                                                                        }
                                                                                                                                        iftrue(Label_0500:)(s4 == null);
                                                                                                                                        break Label_0390;
                                                                                                                                        d = new M3.d(n5, s5, string, b, packageName, string4, n, n3, s4, string3, string5);
                                                                                                                                        continue Label_0225_Outer;
                                                                                                                                        try {
                                                                                                                                            Label_0835: {
                                                                                                                                                ((n1.o)f).a("FCM_CLIENT_EVENT_LOGGING", new k1.c("proto"), (k1.e)new F3.g(3)).i(new k1.a((Object)new M3.e(d), k1.d.C, new k1.b(Integer.valueOf(((Intent)ex).getIntExtra("google.product_id", 111881503)))), (k1.g)new g4.o(5));
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        catch (final RuntimeException ex) {
                                                                                                                                            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", (Throwable)ex);
                                                                                                                                        }
                                                                                                                                        return;
                                                                                                                                        Label_0569: {
                                                                                                                                            string5 = "";
                                                                                                                                        }
                                                                                                                                        continue Label_0785_Outer;
                                                                                                                                        Label_0795:
                                                                                                                                        n5 = 0L;
                                                                                                                                        continue Label_0437_Outer;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                b = M3.b.E;
                                                                                                                                continue Label_0296;
                                                                                                                            }
                                                                                                                            iftrue(Label_0449:)(s6 == null);
                                                                                                                            continue Label_0343_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break Label_0551;
                                                                                                                    n4 = 2;
                                                                                                                    continue Label_0390;
                                                                                                                }
                                                                                                                n4 = 1;
                                                                                                                continue Label_0390;
                                                                                                            }
                                                                                                            string4 = ((BaseBundle)bundle).getString("collapse_key");
                                                                                                            iftrue(Label_0523:)(string4 == null);
                                                                                                            continue Label_0528_Outer;
                                                                                                        }
                                                                                                        break Label_0735;
                                                                                                        continue Label_0785_Outer;
                                                                                                    }
                                                                                                    iftrue(Label_0348:)(!"1".equals((Object)((BaseBundle)bundle).getString("google.priority_reduced")));
                                                                                                    continue Label_0343;
                                                                                                }
                                                                                                s6 = ((BaseBundle)bundle).getString("message_id");
                                                                                                continue Block_30_Outer;
                                                                                            }
                                                                                            e2.a();
                                                                                            b2 = c.b;
                                                                                            iftrue(Label_0718:)(b2.startsWith("1:"));
                                                                                            continue Block_32_Outer;
                                                                                        }
                                                                                        iftrue(Label_0795:)(n5 <= 0L);
                                                                                        continue Block_30_Outer;
                                                                                    }
                                                                                }
                                                                                string5 = ((BaseBundle)bundle).getString("google.c.a.c_l");
                                                                                iftrue(Label_0569:)(string5 == null);
                                                                                continue Block_19_Outer;
                                                                            }
                                                                            Label_0523: {
                                                                                string4 = "";
                                                                            }
                                                                            continue Label_0528;
                                                                        }
                                                                        try {
                                                                            n5 = Long.parseLong(((BaseBundle)bundle).getString("google.c.sender.id"));
                                                                            continue Label_0785;
                                                                        }
                                                                        catch (final NumberFormatException ex5) {
                                                                            Log.w("FirebaseMessaging", "error parsing project number", (Throwable)ex5);
                                                                        }
                                                                        continue Block_30_Outer;
                                                                    }
                                                                }
                                                                iftrue(Label_0437:)((s6 = ((BaseBundle)bundle).getString("google.message_id")) != null);
                                                                continue Label_0668_Outer;
                                                            }
                                                        }
                                                        split = b2.split(":");
                                                        iftrue(Label_0741:)(split.length >= 2);
                                                        break Label_0735;
                                                        Label_0741: {
                                                            s3 = split[1];
                                                        }
                                                        iftrue(Label_0758:)(!s3.isEmpty());
                                                        continue Label_0668_Outer;
                                                    }
                                                    Label_0449: {
                                                        s5 = "";
                                                    }
                                                    continue Label_0454;
                                                }
                                                try {
                                                    n5 = Long.parseLong(e3);
                                                    continue Label_0785;
                                                }
                                                catch (final NumberFormatException ex6) {
                                                    Log.w("FirebaseMessaging", "error parsing sender ID", (Throwable)ex6);
                                                }
                                                continue;
                                            }
                                        }
                                        n5 = 0L;
                                        continue Label_0785;
                                    }
                                }
                                catch (final InterruptedException ex) {}
                                catch (final ExecutionException ex7) {}
                            }
                        }
                        break;
                    }
                    break;
                }
                throw new RuntimeException((Throwable)ex);
            }
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
        }
    }
    
    public static void q(final String s, final Bundle bundle) {
        try {
            X2.f.e();
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle();
            final String string = ((BaseBundle)bundle2).getString("google.c.a.c_id");
            if (string != null) {
                ((BaseBundle)bundle3).putString("_nmid", string);
            }
            final String string2 = ((BaseBundle)bundle2).getString("google.c.a.c_l");
            if (string2 != null) {
                ((BaseBundle)bundle3).putString("_nmn", string2);
            }
            final String string3 = ((BaseBundle)bundle2).getString("google.c.a.m_l");
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                ((BaseBundle)bundle3).putString("label", string3);
            }
            final String string4 = ((BaseBundle)bundle2).getString("google.c.a.m_c");
            if (!TextUtils.isEmpty((CharSequence)string4)) {
                ((BaseBundle)bundle3).putString("message_channel", string4);
            }
            String string5 = ((BaseBundle)bundle2).getString("from");
            final String s2 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                ((BaseBundle)bundle3).putString("_nt", string5);
            }
            final String string6 = ((BaseBundle)bundle2).getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    ((BaseBundle)bundle3).putInt("_nmt", Integer.parseInt(string6));
                }
                catch (final NumberFormatException ex) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", (Throwable)ex);
                }
            }
            String string7 = s2;
            if (((BaseBundle)bundle2).containsKey("google.c.a.udt")) {
                string7 = ((BaseBundle)bundle2).getString("google.c.a.udt");
            }
            if (string7 != null) {
                try {
                    ((BaseBundle)bundle3).putInt("_ndt", Integer.parseInt(string7));
                }
                catch (final NumberFormatException ex2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", (Throwable)ex2);
                }
            }
            String s3;
            if (C2.b.x(bundle2)) {
                s3 = "display";
            }
            else {
                s3 = "data";
            }
            if ("_nr".equals((Object)s) || "_nf".equals((Object)s)) {
                ((BaseBundle)bundle3).putString("_nmc", s3);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder("Logging to scion event=");
                sb.append(s);
                sb.append(" scionPayload=");
                sb.append((Object)bundle3);
                Log.d("FirebaseMessaging", sb.toString());
            }
            final b3.b b = (b3.b)X2.f.e().c((Class)b3.b.class);
            if (b != null) {
                ((b3.c)b).a("fcm", s, bundle3);
            }
            else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        }
        catch (final IllegalStateException ex3) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }
    
    public static MappedByteBuffer r(Context openFileDescriptor, Uri uri) {
        final ContentResolver contentResolver = openFileDescriptor.getContentResolver();
        try {
            openFileDescriptor = (Context)contentResolver.openFileDescriptor(uri, "r", (CancellationSignal)null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                return null;
            }
            try {
                final Object o;
                uri = (Uri)(o = new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor()));
                final FileChannel fileChannel = ((FileInputStream)o).getChannel();
                final FileChannel fileChannel3;
                final FileChannel fileChannel2 = fileChannel3 = fileChannel;
                final long n = fileChannel3.size();
                final FileChannel fileChannel4 = fileChannel2;
                final FileChannel$MapMode fileChannel$MapMode = FileChannel$MapMode.READ_ONLY;
                final long n2 = 0L;
                final long n3 = n;
                final MappedByteBuffer mappedByteBuffer = fileChannel4.map(fileChannel$MapMode, n2, n3);
                final Uri uri2 = uri;
                ((FileInputStream)uri2).close();
                final Context context = openFileDescriptor;
                ((ParcelFileDescriptor)context).close();
                return mappedByteBuffer;
            }
            finally {
                final Uri uri3;
                uri = uri3;
                try {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)uri).addSuppressed(t);
                }
                try {
                    ((FileInputStream)uri).close();
                }
                finally {
                    final Throwable t2;
                    final Throwable t3;
                    t2.addSuppressed(t3);
                }
            }
            try {
                final Object o = uri;
                final FileChannel fileChannel = ((FileInputStream)o).getChannel();
                final FileChannel fileChannel3;
                final FileChannel fileChannel2 = fileChannel3 = fileChannel;
                final long n = fileChannel3.size();
                final FileChannel fileChannel4 = fileChannel2;
                final FileChannel$MapMode fileChannel$MapMode = FileChannel$MapMode.READ_ONLY;
                final long n2 = 0L;
                final long n3 = n;
                final MappedByteBuffer mappedByteBuffer = fileChannel4.map(fileChannel$MapMode, n2, n3);
                final Uri uri2 = uri;
                ((FileInputStream)uri2).close();
                final Context context = openFileDescriptor;
                ((ParcelFileDescriptor)context).close();
                return mappedByteBuffer;
            }
            finally {}
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static Set u(final Object... array) {
        final int length = array.length;
        Object o;
        if (length != 0) {
            int n = 0;
            if (length != 1) {
                final LinkedHashSet set = new LinkedHashSet(d5.o.G(array.length));
                final int length2 = array.length;
                while (true) {
                    o = set;
                    if (n >= length2) {
                        break;
                    }
                    ((Collection)set).add(array[n]);
                    ++n;
                }
            }
            else {
                o = Collections.singleton(array[0]);
                n5.h.d("singleton(...)", o);
            }
        }
        else {
            o = n.C;
        }
        return (Set)o;
    }
    
    public static void v(final View view, final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 26) {
            n1.a(view, charSequence);
        }
        else {
            final p1 m = p1.M;
            if (m != null && m.C == view) {
                p1.b((p1)null);
            }
            if (TextUtils.isEmpty(charSequence)) {
                final p1 n = p1.N;
                if (n != null && n.C == view) {
                    n.a();
                }
                view.setOnLongClickListener((View$OnLongClickListener)null);
                view.setLongClickable(false);
                view.setOnHoverListener((View$OnHoverListener)null);
            }
            else {
                new p1(view, charSequence);
            }
        }
    }
    
    public static void w(final F4.f f, final Z4.m m) {
        n5.h.e("binaryMessenger", (Object)f);
        Object c = null;
        Label_0037: {
            if (m != null) {
                final F1.n a = m.a;
                if (a != null) {
                    c = a.c();
                    break Label_0037;
                }
            }
            c = new X4.c(1);
        }
        final Y0.h h = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", c, (Object)null);
        if (m != null) {
            h.u((F4.b)new C(m, 0));
        }
        else {
            h.u((F4.b)null);
        }
        final Y0.h h2 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", c, (Object)null);
        if (m != null) {
            h2.u((F4.b)new C(m, 1));
        }
        else {
            h2.u((F4.b)null);
        }
        final Y0.h h3 = new Y0.h((Object)f, (Object)"dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", c, (Object)null);
        if (m != null) {
            h3.u((F4.b)new C(m, 2));
        }
        else {
            h3.u((F4.b)null);
        }
    }
    
    public static boolean x(final Intent intent) {
        boolean equals;
        final boolean b = equals = false;
        if (intent != null) {
            if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals((Object)intent.getAction())) {
                equals = b;
            }
            else {
                final Bundle extras = intent.getExtras();
                if (extras == null) {
                    equals = b;
                }
                else {
                    equals = "1".equals((Object)((BaseBundle)extras).getString("google.c.a.e"));
                }
            }
        }
        return equals;
    }
    
    public static int y(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static void z(final m5.p p3, final w5.a a, final w5.a a2) {
        try {
            B5.a.h(o(j(p3, a, a2)), (Object)c5.h.a, (l)null);
        }
        finally {
            final Throwable t;
            a2.h((Object)com.google.android.gms.internal.auth.h.k(t));
        }
    }
    
    public abstract void s(final Throwable p0);
    
    public abstract void t(final Rc p0);
}

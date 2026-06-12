package K2;

import java.util.Random;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.g2;
import android.os.BaseBundle;
import java.util.Arrays;
import java.util.Set;
import java.nio.charset.Charset;
import java.util.EnumMap;
import java.math.BigInteger;
import java.util.Locale;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.UUID;
import com.google.android.gms.internal.measurement.c4;
import java.io.FileNotFoundException;
import java.nio.channels.OverlappingFileLockException;
import java.nio.ByteBuffer;
import java.io.RandomAccessFile;
import java.io.File;
import com.google.android.gms.internal.measurement.K;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.H0;
import java.util.TreeSet;
import com.google.android.gms.internal.measurement.G0;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.a3;
import android.content.ContentValues;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import p2.a;
import android.content.pm.ResolveInfo;
import java.io.Serializable;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.V0;
import com.google.android.gms.internal.measurement.W0;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.N0;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import java.net.URI;
import t.j;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.f2;
import java.lang.reflect.Method;
import android.app.job.JobInfo;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.UserHandle;
import android.app.job.JobScheduler;
import com.google.android.gms.internal.measurement.M;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.content.ComponentName;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Intent;
import com.google.android.gms.internal.measurement.b4;
import java.util.Collection;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collections;
import com.google.android.gms.internal.measurement.l1;
import android.util.Pair;
import android.os.SystemClock;
import android.database.sqlite.SQLiteException;
import java.nio.charset.StandardCharsets;
import com.google.android.gms.internal.measurement.P3;
import java.io.IOException;
import java.util.Objects;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.e1;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;
import h2.A;
import android.app.Service;
import C2.b;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.Z;
import b1.f;
import java.util.HashMap;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashSet;
import java.util.ArrayList;

public final class y1 implements w0
{
    public static volatile y1 j0;
    public final h0 C;
    public final T D;
    public h E;
    public X F;
    public t1 G;
    public K1 H;
    public final T I;
    public T J;
    public k1 K;
    public final w1 L;
    public e0 M;
    public final n0 N;
    public boolean O;
    public boolean P;
    public long Q;
    public ArrayList R;
    public final HashSet S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public FileLock Y;
    public FileChannel Z;
    public ArrayList a0;
    public ArrayList b0;
    public long c0;
    public final HashMap d0;
    public final HashMap e0;
    public final HashMap f0;
    public Y0 g0;
    public String h0;
    public final f i0;
    
    public y1(final F1 f1) {
        this.O = false;
        this.S = new HashSet();
        this.i0 = new f((Object)this, 21);
        this.N = n0.b(f1.a, null, null);
        this.c0 = -1L;
        this.L = (w1)new v1(this);
        final T i = new T(this, 2);
        i.A();
        this.I = i;
        final T d = new T(this, 0);
        d.A();
        this.D = d;
        final h0 c = new h0(this);
        c.A();
        this.C = c;
        this.d0 = new HashMap();
        this.e0 = new HashMap();
        this.f0 = new HashMap();
        this.l().E((Runnable)new C2.h(this, f1));
    }
    
    public static Boolean Z(final B1 b1) {
        final Boolean t = b1.T;
        final String h0 = b1.h0;
        Boolean b2 = t;
        if (!TextUtils.isEmpty((CharSequence)h0)) {
            final int n = C1.a[((B0)b.C(h0).D).ordinal()];
            if (n != 1) {
                if (n == 2) {
                    b2 = Boolean.FALSE;
                    return b2;
                }
                if (n == 3) {
                    b2 = Boolean.TRUE;
                    return b2;
                }
                if (n != 4) {
                    b2 = t;
                    return b2;
                }
            }
            b2 = null;
        }
        return b2;
    }
    
    public static boolean b0(final B1 b1) {
        return !TextUtils.isEmpty((CharSequence)b1.D) || !TextUtils.isEmpty((CharSequence)b1.S);
    }
    
    public static y1 f(final Service service) {
        A.h((Object)service);
        A.h((Object)((Context)service).getApplicationContext());
        if (y1.j0 == null) {
            final Class<y1> clazz;
            monitorenter(clazz = y1.class);
            Label_0057: {
                try {
                    if (y1.j0 == null) {
                        y1.j0 = new y1(new F1(service));
                    }
                    break Label_0057;
                }
                finally {
                    monitorexit(clazz);
                    monitorexit(clazz);
                }
            }
        }
        return y1.j0;
    }
    
    public static String m(final String s, final Map map) {
        if (map == null) {
            return null;
        }
        for (final Map$Entry map$Entry : map.entrySet()) {
            if (s.equalsIgnoreCase((String)map$Entry.getKey())) {
                if (((List)map$Entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String)((List)map$Entry.getValue()).get(0);
            }
        }
        return null;
    }
    
    public static void r(final u1 u1) {
        if (u1 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (u1.E) {
            return;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf((Object)u1.getClass())));
    }
    
    public static void t(final e1 e1, final int n, final String s) {
        final List p3 = e1.p();
        for (int i = 0; i < p3.size(); ++i) {
            if ("_err".equals((Object)((i1)p3.get(i)).D())) {
                return;
            }
        }
        final h1 c = i1.C();
        c.k("_err");
        c.j((long)n);
        final i1 i2 = (i1)((f2)c).d();
        final h1 c2 = i1.C();
        c2.k("_ev");
        c2.l(s);
        final i1 i3 = (i1)((f2)c2).d();
        e1.k(i2);
        e1.k(i3);
    }
    
    public static void u(final e1 e1, final String s) {
        final List p2 = e1.p();
        for (int i = 0; i < p2.size(); ++i) {
            if (s.equals((Object)((i1)p2.get(i)).D())) {
                ((f2)e1).f();
                f1.q(i, (f1)((f2)e1).D);
                return;
            }
        }
    }
    
    public final void A(final String s, final boolean z, final Long a, final Long b) {
        final h e = this.E;
        r(e);
        final G u0 = e.u0(s);
        if (u0 != null) {
            final n0 a2 = u0.a;
            final k0 l = a2.L;
            n0.f(l);
            l.v();
            u0.Q |= (u0.z != z);
            u0.z = z;
            final k0 i = a2.L;
            n0.f(i);
            i.v();
            u0.Q |= (Objects.equals((Object)u0.A, (Object)a) ^ true);
            u0.A = a;
            final k0 j = a2.L;
            n0.f(j);
            j.v();
            u0.Q |= (Objects.equals((Object)u0.B, (Object)b) ^ true);
            u0.B = b;
            if (u0.n()) {
                final h e2 = this.E;
                r(e2);
                e2.Q(u0, false);
            }
        }
    }
    
    public final void B(final boolean b, final int n, IOException ex, byte[] iterator, final String s, List e) {
        final T d = this.D;
        this.l().v();
        this.f0();
        Label_0034: {
            if (iterator == null) {
                Label_0862: {
                    try {
                        iterator = new byte[0];
                    }
                    finally {
                        break Label_0862;
                    }
                    break Label_0034;
                }
                this.W = false;
                this.F();
            }
        }
        final ArrayList a0 = this.a0;
        A.h((Object)a0);
        this.a0 = null;
        Label_0852: {
            if (b && ((n != 200 && n != 204) || ex != null)) {
                P3.a();
                if (this.T().G(null, w.E0)) {
                    final String s2 = new String(iterator, StandardCharsets.UTF_8);
                    this.j().M.h("Network upload failed. Will retry later. code, error", n, ex, s2.substring(0, Math.min(32, s2.length())));
                }
                else {
                    this.j().P.e(n, ex, "Network upload failed. Will retry later. code, error");
                }
                final b0 k = this.K.K;
                this.d().getClass();
                k.b(System.currentTimeMillis());
                if (n == 503 || n == 429) {
                    final b0 i = this.K.I;
                    this.d().getClass();
                    i.b(System.currentTimeMillis());
                }
                final h e2 = this.E;
                r(e2);
                e2.c0((List)a0);
                this.H();
            }
            else {
                this.j().P.g("Network upload successful with code", n);
                Label_0301: {
                    if (b) {
                        Label_0803: {
                            try {
                                final b0 j = this.K.J;
                                this.d().getClass();
                                j.b(System.currentTimeMillis());
                            }
                            catch (final SQLiteException ex2) {
                                break Label_0803;
                            }
                            break Label_0301;
                        }
                        final SQLiteException ex2;
                        this.j().H.g("Database error while trying to delete uploaded bundles", ex2);
                        this.d().getClass();
                        this.Q = SystemClock.elapsedRealtime();
                        this.j().P.g("Disable upload, time", this.Q);
                        break Label_0852;
                    }
                }
                this.K.K.b(0L);
                this.H();
                if (b) {
                    this.j().P.e(n, iterator.length, "Successful upload. Got network response. code, size");
                }
                else {
                    this.j().P.f("Purged empty bundles");
                }
                final h e3 = this.E;
                r(e3);
                e3.C0();
                Label_0785: {
                    try {
                        if (this.T().G(null, w.A0)) {
                            for (final Pair pair : e) {
                                final l1 l1 = (l1)pair.first;
                                final z1 z1 = (z1)pair.second;
                                final h e4 = this.E;
                                r(e4);
                                final String a2 = z1.a;
                                Object o;
                                if ((o = z1.b) == null) {
                                    o = Collections.emptyMap();
                                }
                                e4.Z(s, l1, a2, (Map)o, z1.c);
                            }
                        }
                    }
                    finally {
                        break Label_0785;
                    }
                    iterator = (byte[])(Object)((List)a0).iterator();
                    while (((Iterator)(Object)iterator).hasNext()) {
                        ex = (IOException)((Iterator)(Object)iterator).next();
                        try {
                            e = (List)this.E;
                            r((u1)e);
                            final long longValue = (long)ex;
                            ((C.u)e).v();
                            ((u1)e).z();
                            final SQLiteDatabase d2 = ((h)e).D();
                            try {
                                if (d2.delete("queue", "rowid=?", new String[] { String.valueOf(longValue) }) == 1) {
                                    continue;
                                }
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                            catch (final SQLiteException ex3) {
                                ((C.u)e).j().H.g("Failed to delete a bundle in a queue table", ex3);
                                throw ex3;
                            }
                        }
                        catch (final SQLiteException ex4) {
                            final ArrayList b2 = this.b0;
                            if (b2 != null && b2.contains((Object)ex)) {
                                continue;
                            }
                            throw ex4;
                        }
                        break;
                    }
                    final h e5 = this.E;
                    r(e5);
                    e5.J0();
                    final h e6 = this.E;
                    r(e6);
                    e6.H0();
                    this.b0 = null;
                    r(d);
                    Label_0777: {
                        if (d.m0() && this.I()) {
                            this.g0();
                        }
                        else {
                            if (this.T().G(null, w.A0)) {
                                r(d);
                                if (d.m0()) {
                                    final h e7 = this.E;
                                    r(e7);
                                    if (e7.G0(s)) {
                                        this.V(s);
                                        break Label_0777;
                                    }
                                }
                            }
                            this.c0 = -1L;
                            this.H();
                        }
                    }
                    this.Q = 0L;
                    break Label_0852;
                }
                final h e8 = this.E;
                r(e8);
                e8.H0();
            }
        }
        this.W = false;
        this.F();
    }
    
    public final boolean C(final e1 e1, final e1 e2) {
        A.b("_e".equals((Object)e1.o()));
        this.c0();
        final i1 k = K2.T.K((f1)((f2)e1).d(), "_sc");
        String e3 = null;
        Object e4;
        if (k == null) {
            e4 = null;
        }
        else {
            e4 = k.E();
        }
        this.c0();
        final i1 i = K2.T.K((f1)((f2)e2).d(), "_pc");
        if (i != null) {
            e3 = i.E();
        }
        if (e3 != null && e3.equals(e4)) {
            A.b("_e".equals((Object)e1.o()));
            this.c0();
            final i1 j = K2.T.K((f1)((f2)e1).d(), "_et");
            if (j != null && j.I()) {
                if (j.A() > 0L) {
                    final long a = j.A();
                    this.c0();
                    final i1 l = K2.T.K((f1)((f2)e2).d(), "_et");
                    long n = a;
                    if (l != null) {
                        n = a;
                        if (l.A() > 0L) {
                            n = a + l.A();
                        }
                    }
                    this.c0();
                    K2.T.U(e2, "_et", n);
                    this.c0();
                    K2.T.U(e1, "_fr", 1L);
                }
            }
            return true;
        }
        return false;
    }
    
    public final boolean D(final String p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          23
        //     5: ldc_w           "_ai"
        //     8: astore          22
        //    10: aload_0        
        //    11: invokevirtual   K2/y1.W:()LK2/h;
        //    14: invokevirtual   K2/h.C0:()V
        //    17: new             LK2/d0;
        //    20: astore          21
        //    22: aload           21
        //    24: aload_0        
        //    25: invokespecial   K2/d0.<init>:(LK2/y1;)V
        //    28: aload_0        
        //    29: invokevirtual   K2/y1.W:()LK2/h;
        //    32: astore          24
        //    34: aload_0        
        //    35: getfield        K2/y1.c0:J
        //    38: lstore          12
        //    40: aload           24
        //    42: invokevirtual   C/u.v:()V
        //    45: aload           24
        //    47: invokevirtual   K2/u1.z:()V
        //    50: aload           24
        //    52: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //    55: astore          25
        //    57: aload_1        
        //    58: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    61: istore          14
        //    63: ldc_w           ""
        //    66: astore          16
        //    68: iload           14
        //    70: ifeq            320
        //    73: lload           12
        //    75: ldc2_w          -1
        //    78: lcmp           
        //    79: istore          4
        //    81: iload           4
        //    83: ifeq            130
        //    86: iconst_2       
        //    87: anewarray       Ljava/lang/String;
        //    90: dup            
        //    91: iconst_0       
        //    92: lload           12
        //    94: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    97: aastore        
        //    98: dup            
        //    99: iconst_1       
        //   100: lload_2        
        //   101: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   104: aastore        
        //   105: astore          17
        //   107: goto            143
        //   110: astore_1       
        //   111: aconst_null    
        //   112: astore          16
        //   114: goto            7958
        //   117: astore          17
        //   119: aload_1        
        //   120: astore          16
        //   122: aload_1        
        //   123: astore          18
        //   125: aconst_null    
        //   126: astore_1       
        //   127: goto            1132
        //   130: iconst_1       
        //   131: anewarray       Ljava/lang/String;
        //   134: dup            
        //   135: iconst_0       
        //   136: lload_2        
        //   137: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   140: aastore        
        //   141: astore          17
        //   143: iload           4
        //   145: ifeq            153
        //   148: ldc_w           "rowid <= ? and "
        //   151: astore          16
        //   153: new             Ljava/lang/StringBuilder;
        //   156: astore          18
        //   158: aload           18
        //   160: ldc_w           "select app_id, metadata_fingerprint from raw_events where "
        //   163: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   166: aload           18
        //   168: aload           16
        //   170: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   173: pop            
        //   174: aload           18
        //   176: ldc_w           "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: pop            
        //   183: aload           25
        //   185: aload           18
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: aload           17
        //   192: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   195: astore          17
        //   197: aload           17
        //   199: astore          16
        //   201: aload           17
        //   203: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   208: istore          14
        //   210: iload           14
        //   212: ifne            229
        //   215: aload           17
        //   217: invokeinterface android/database/Cursor.close:()V
        //   222: goto            1166
        //   225: astore_1       
        //   226: goto            7972
        //   229: aload           17
        //   231: astore          16
        //   233: aload           17
        //   235: iconst_0       
        //   236: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   241: astore          18
        //   243: aload           17
        //   245: astore          16
        //   247: aload           17
        //   249: astore          19
        //   251: aload           18
        //   253: astore          20
        //   255: aload           17
        //   257: iconst_1       
        //   258: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   263: astore_1       
        //   264: aload           17
        //   266: astore          16
        //   268: aload           17
        //   270: astore          19
        //   272: aload           18
        //   274: astore          20
        //   276: aload           17
        //   278: invokeinterface android/database/Cursor.close:()V
        //   283: aload_1        
        //   284: astore          20
        //   286: goto            486
        //   289: astore_1       
        //   290: goto            7958
        //   293: astore          16
        //   295: aload           20
        //   297: astore          18
        //   299: aload           19
        //   301: astore_1       
        //   302: aload           16
        //   304: astore          17
        //   306: goto            1132
        //   309: astore          16
        //   311: aload_1        
        //   312: astore          18
        //   314: aload           17
        //   316: astore_1       
        //   317: goto            302
        //   320: lload           12
        //   322: ldc2_w          -1
        //   325: lcmp           
        //   326: istore          4
        //   328: iload           4
        //   330: ifeq            362
        //   333: iconst_2       
        //   334: anewarray       Ljava/lang/String;
        //   337: dup            
        //   338: iconst_0       
        //   339: aload_1        
        //   340: aastore        
        //   341: dup            
        //   342: iconst_1       
        //   343: lload           12
        //   345: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   348: aastore        
        //   349: astore          17
        //   351: goto            372
        //   354: astore          17
        //   356: aload_1        
        //   357: astore          16
        //   359: goto            122
        //   362: iconst_1       
        //   363: anewarray       Ljava/lang/String;
        //   366: dup            
        //   367: iconst_0       
        //   368: aload_1        
        //   369: aastore        
        //   370: astore          17
        //   372: iload           4
        //   374: ifeq            382
        //   377: ldc_w           " and rowid <= ?"
        //   380: astore          16
        //   382: new             Ljava/lang/StringBuilder;
        //   385: astore          18
        //   387: aload           18
        //   389: ldc_w           "select metadata_fingerprint from raw_events where app_id = ?"
        //   392: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   395: aload           18
        //   397: aload           16
        //   399: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   402: pop            
        //   403: aload           18
        //   405: ldc_w           " order by rowid limit 1;"
        //   408: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   411: pop            
        //   412: aload           25
        //   414: aload           18
        //   416: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   419: aload           17
        //   421: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   424: astore          19
        //   426: aload           19
        //   428: astore          16
        //   430: aload           19
        //   432: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   437: istore          14
        //   439: iload           14
        //   441: ifne            454
        //   444: aload           19
        //   446: invokeinterface android/database/Cursor.close:()V
        //   451: goto            222
        //   454: aload           19
        //   456: astore          16
        //   458: aload           19
        //   460: iconst_0       
        //   461: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   466: astore          20
        //   468: aload           19
        //   470: astore          16
        //   472: aload           19
        //   474: invokeinterface android/database/Cursor.close:()V
        //   479: aload_1        
        //   480: astore          18
        //   482: aload           19
        //   484: astore          17
        //   486: aload           17
        //   488: astore          16
        //   490: aload           25
        //   492: ldc_w           "raw_events_metadata"
        //   495: iconst_1       
        //   496: anewarray       Ljava/lang/String;
        //   499: dup            
        //   500: iconst_0       
        //   501: ldc_w           "metadata"
        //   504: aastore        
        //   505: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   508: iconst_2       
        //   509: anewarray       Ljava/lang/String;
        //   512: dup            
        //   513: iconst_0       
        //   514: aload           18
        //   516: aastore        
        //   517: dup            
        //   518: iconst_1       
        //   519: aload           20
        //   521: aastore        
        //   522: aconst_null    
        //   523: aconst_null    
        //   524: ldc_w           "rowid"
        //   527: ldc_w           "2"
        //   530: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   533: astore_1       
        //   534: aload_1        
        //   535: astore          16
        //   537: aload_1        
        //   538: astore          17
        //   540: aload_1        
        //   541: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   546: istore          14
        //   548: iload           14
        //   550: ifne            591
        //   553: aload_1        
        //   554: astore          16
        //   556: aload_1        
        //   557: astore          19
        //   559: aload           18
        //   561: astore          20
        //   563: aload           24
        //   565: invokevirtual   C/u.j:()LK2/P;
        //   568: invokevirtual   K2/P.G:()LK2/S;
        //   571: ldc_w           "Raw event metadata record is missing. appId"
        //   574: aload           18
        //   576: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   579: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   582: aload_1        
        //   583: invokeinterface android/database/Cursor.close:()V
        //   588: goto            222
        //   591: aload_1        
        //   592: astore          16
        //   594: aload_1        
        //   595: astore          17
        //   597: aload_1        
        //   598: iconst_0       
        //   599: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   604: astore          19
        //   606: aload_1        
        //   607: astore          16
        //   609: aload_1        
        //   610: astore          17
        //   612: invokestatic    com/google/android/gms/internal/measurement/n1.b2:()Lcom/google/android/gms/internal/measurement/m1;
        //   615: aload           19
        //   617: invokestatic    K2/T.L:(Lcom/google/android/gms/internal/measurement/f2;[B)Lcom/google/android/gms/internal/measurement/f2;
        //   620: checkcast       Lcom/google/android/gms/internal/measurement/m1;
        //   623: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //   626: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //   629: astore          26
        //   631: aload_1        
        //   632: astore          16
        //   634: aload_1        
        //   635: astore          17
        //   637: aload_1        
        //   638: invokeinterface android/database/Cursor.moveToNext:()Z
        //   643: ifeq            698
        //   646: aload_1        
        //   647: astore          16
        //   649: aload_1        
        //   650: astore          17
        //   652: aload           24
        //   654: invokevirtual   C/u.j:()LK2/P;
        //   657: invokevirtual   K2/P.I:()LK2/S;
        //   660: astore          19
        //   662: aload_1        
        //   663: astore          16
        //   665: aload           19
        //   667: ldc_w           "Get multiple raw event metadata records, expected one. appId"
        //   670: aload           18
        //   672: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   675: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   678: goto            698
        //   681: astore          16
        //   683: aload           16
        //   685: astore          17
        //   687: goto            1132
        //   690: astore          16
        //   692: aload           17
        //   694: astore_1       
        //   695: goto            683
        //   698: aload_1        
        //   699: astore          16
        //   701: aload_1        
        //   702: invokeinterface android/database/Cursor.close:()V
        //   707: aload_1        
        //   708: astore          16
        //   710: aload           21
        //   712: aload           26
        //   714: invokevirtual   K2/d0.a:(Lcom/google/android/gms/internal/measurement/n1;)V
        //   717: lload           12
        //   719: ldc2_w          -1
        //   722: lcmp           
        //   723: ifeq            761
        //   726: ldc_w           "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
        //   729: astore          19
        //   731: aload_1        
        //   732: astore          16
        //   734: iconst_3       
        //   735: anewarray       Ljava/lang/String;
        //   738: dup            
        //   739: iconst_0       
        //   740: aload           18
        //   742: aastore        
        //   743: dup            
        //   744: iconst_1       
        //   745: aload           20
        //   747: aastore        
        //   748: dup            
        //   749: iconst_2       
        //   750: lload           12
        //   752: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   755: aastore        
        //   756: astore          17
        //   758: goto            788
        //   761: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   764: astore          19
        //   766: aload_1        
        //   767: astore          16
        //   769: iconst_2       
        //   770: anewarray       Ljava/lang/String;
        //   773: dup            
        //   774: iconst_0       
        //   775: aload           18
        //   777: aastore        
        //   778: dup            
        //   779: iconst_1       
        //   780: aload           20
        //   782: aastore        
        //   783: astore          17
        //   785: goto            758
        //   788: aload_1        
        //   789: astore          16
        //   791: aload           25
        //   793: ldc_w           "raw_events"
        //   796: iconst_4       
        //   797: anewarray       Ljava/lang/String;
        //   800: dup            
        //   801: iconst_0       
        //   802: ldc_w           "rowid"
        //   805: aastore        
        //   806: dup            
        //   807: iconst_1       
        //   808: ldc_w           "name"
        //   811: aastore        
        //   812: dup            
        //   813: iconst_2       
        //   814: ldc_w           "timestamp"
        //   817: aastore        
        //   818: dup            
        //   819: iconst_3       
        //   820: ldc_w           "data"
        //   823: aastore        
        //   824: aload           19
        //   826: aload           17
        //   828: aconst_null    
        //   829: aconst_null    
        //   830: ldc_w           "rowid"
        //   833: aconst_null    
        //   834: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   837: astore          17
        //   839: aload           17
        //   841: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   846: ifne            900
        //   849: aload           24
        //   851: invokevirtual   C/u.j:()LK2/P;
        //   854: invokevirtual   K2/P.I:()LK2/S;
        //   857: ldc_w           "Raw event data disappeared while in transaction. appId"
        //   860: aload           18
        //   862: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   865: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   868: aload           17
        //   870: invokeinterface android/database/Cursor.close:()V
        //   875: goto            1166
        //   878: astore_1       
        //   879: aload           17
        //   881: astore          16
        //   883: goto            7958
        //   886: astore_1       
        //   887: aload_1        
        //   888: astore          16
        //   890: aload           17
        //   892: astore_1       
        //   893: aload           16
        //   895: astore          17
        //   897: goto            1132
        //   900: aload           17
        //   902: iconst_0       
        //   903: invokeinterface android/database/Cursor.getLong:(I)J
        //   908: lstore          12
        //   910: aload           17
        //   912: iconst_3       
        //   913: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   918: astore_1       
        //   919: invokestatic    com/google/android/gms/internal/measurement/f1.B:()Lcom/google/android/gms/internal/measurement/e1;
        //   922: aload_1        
        //   923: invokestatic    K2/T.L:(Lcom/google/android/gms/internal/measurement/f2;[B)Lcom/google/android/gms/internal/measurement/f2;
        //   926: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //   929: astore_1       
        //   930: aload           17
        //   932: iconst_1       
        //   933: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   938: astore          16
        //   940: aload_1        
        //   941: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //   944: aload_1        
        //   945: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //   948: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //   951: aload           16
        //   953: invokestatic    com/google/android/gms/internal/measurement/f1.w:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)V
        //   956: aload           17
        //   958: iconst_2       
        //   959: invokeinterface android/database/Cursor.getLong:(I)J
        //   964: lstore_2       
        //   965: aload_1        
        //   966: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //   969: lload_2        
        //   970: aload_1        
        //   971: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //   974: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //   977: invokestatic    com/google/android/gms/internal/measurement/f1.y:(JLcom/google/android/gms/internal/measurement/f1;)V
        //   980: aload           21
        //   982: lload           12
        //   984: aload_1        
        //   985: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //   988: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //   991: invokevirtual   K2/d0.b:(JLcom/google/android/gms/internal/measurement/f1;)Z
        //   994: istore          14
        //   996: iload           14
        //   998: ifne            1048
        //  1001: aload           17
        //  1003: invokeinterface android/database/Cursor.close:()V
        //  1008: goto            1166
        //  1011: astore_1       
        //  1012: goto            879
        //  1015: astore_1       
        //  1016: goto            887
        //  1019: astore_1       
        //  1020: goto            879
        //  1023: astore_1       
        //  1024: goto            887
        //  1027: astore_1       
        //  1028: aload           24
        //  1030: invokevirtual   C/u.j:()LK2/P;
        //  1033: invokevirtual   K2/P.G:()LK2/S;
        //  1036: aload           18
        //  1038: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1041: aload_1        
        //  1042: ldc_w           "Data loss. Failed to merge raw event. appId"
        //  1045: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1048: aload           17
        //  1050: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1055: istore          14
        //  1057: iload           14
        //  1059: ifne            900
        //  1062: aload           17
        //  1064: invokeinterface android/database/Cursor.close:()V
        //  1069: goto            1166
        //  1072: astore          17
        //  1074: aload_1        
        //  1075: astore          16
        //  1077: aload           24
        //  1079: invokevirtual   C/u.j:()LK2/P;
        //  1082: invokevirtual   K2/P.G:()LK2/S;
        //  1085: aload           18
        //  1087: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1090: aload           17
        //  1092: ldc_w           "Data loss. Failed to merge raw event metadata. appId"
        //  1095: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1098: aload_1        
        //  1099: invokeinterface android/database/Cursor.close:()V
        //  1104: goto            1166
        //  1107: astore          17
        //  1109: aload_1        
        //  1110: astore          18
        //  1112: aload           19
        //  1114: astore_1       
        //  1115: goto            1132
        //  1118: astore          16
        //  1120: aload           16
        //  1122: astore          17
        //  1124: goto            356
        //  1127: astore          16
        //  1129: goto            1120
        //  1132: aload_1        
        //  1133: astore          16
        //  1135: aload           24
        //  1137: invokevirtual   C/u.j:()LK2/P;
        //  1140: invokevirtual   K2/P.G:()LK2/S;
        //  1143: aload           18
        //  1145: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1148: aload           17
        //  1150: ldc_w           "Data loss. Error selecting raw event. appId"
        //  1153: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1156: aload_1        
        //  1157: ifnull          1166
        //  1160: aload_1        
        //  1161: invokeinterface android/database/Cursor.close:()V
        //  1166: ldc_w           "items"
        //  1169: astore          16
        //  1171: aload           21
        //  1173: getfield        K2/d0.d:Ljava/lang/Object;
        //  1176: checkcast       Ljava/util/ArrayList;
        //  1179: astore_1       
        //  1180: aload_1        
        //  1181: ifnull          7942
        //  1184: aload_1        
        //  1185: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1188: ifeq            1194
        //  1191: goto            7942
        //  1194: aload           21
        //  1196: getfield        K2/d0.b:Ljava/lang/Object;
        //  1199: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1202: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  1205: checkcast       Lcom/google/android/gms/internal/measurement/m1;
        //  1208: astore_1       
        //  1209: aload_1        
        //  1210: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  1213: aload_1        
        //  1214: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  1217: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1220: invokestatic    com/google/android/gms/internal/measurement/n1.e1:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  1223: iconst_0       
        //  1224: istore          14
        //  1226: aconst_null    
        //  1227: astore          17
        //  1229: aconst_null    
        //  1230: astore          18
        //  1232: iconst_0       
        //  1233: istore          8
        //  1235: iconst_0       
        //  1236: istore          4
        //  1238: iconst_m1      
        //  1239: istore          6
        //  1241: iconst_m1      
        //  1242: istore          5
        //  1244: aload           21
        //  1246: getfield        K2/d0.d:Ljava/lang/Object;
        //  1249: checkcast       Ljava/util/ArrayList;
        //  1252: invokevirtual   java/util/ArrayList.size:()I
        //  1255: istore          7
        //  1257: ldc_w           "_fr"
        //  1260: astore          25
        //  1262: ldc_w           "_e"
        //  1265: astore          19
        //  1267: ldc_w           "_c"
        //  1270: astore          20
        //  1272: iload           8
        //  1274: iload           7
        //  1276: if_icmpge       3694
        //  1279: aload           21
        //  1281: getfield        K2/d0.d:Ljava/lang/Object;
        //  1284: checkcast       Ljava/util/ArrayList;
        //  1287: iload           8
        //  1289: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1292: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  1295: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  1298: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //  1301: astore          24
        //  1303: aload_0        
        //  1304: invokevirtual   K2/y1.a0:()LK2/h0;
        //  1307: aload           21
        //  1309: getfield        K2/d0.b:Ljava/lang/Object;
        //  1312: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1315: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  1318: aload           24
        //  1320: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1323: invokevirtual   K2/h0.P:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1326: istore          15
        //  1328: aload_0        
        //  1329: getfield        K2/y1.N:LK2/n0;
        //  1332: astore          26
        //  1334: iload           15
        //  1336: ifeq            1521
        //  1339: aload_0        
        //  1340: invokevirtual   K2/y1.j:()LK2/P;
        //  1343: invokevirtual   K2/P.I:()LK2/S;
        //  1346: aload           21
        //  1348: getfield        K2/d0.b:Ljava/lang/Object;
        //  1351: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1354: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  1357: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1360: aload           26
        //  1362: invokevirtual   K2/n0.q:()LK2/L;
        //  1365: aload           24
        //  1367: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1370: invokevirtual   K2/L.c:(Ljava/lang/String;)Ljava/lang/String;
        //  1373: ldc_w           "Dropping blocked raw event. appId"
        //  1376: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1379: aload           23
        //  1381: aload_0        
        //  1382: invokevirtual   K2/y1.a0:()LK2/h0;
        //  1385: aload           21
        //  1387: getfield        K2/d0.b:Ljava/lang/Object;
        //  1390: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1393: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  1396: ldc_w           "measurement.upload.blacklist_internal"
        //  1399: invokevirtual   K2/h0.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1402: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1405: ifne            1488
        //  1408: aload           23
        //  1410: aload_0        
        //  1411: invokevirtual   K2/y1.a0:()LK2/h0;
        //  1414: aload           21
        //  1416: getfield        K2/d0.b:Ljava/lang/Object;
        //  1419: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1422: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  1425: ldc_w           "measurement.upload.blacklist_public"
        //  1428: invokevirtual   K2/h0.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1431: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1434: ifeq            1440
        //  1437: goto            1488
        //  1440: ldc_w           "_err"
        //  1443: aload           24
        //  1445: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1448: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1451: ifne            1488
        //  1454: aload_0        
        //  1455: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1458: pop            
        //  1459: aload_0        
        //  1460: getfield        K2/y1.i0:Lb1/f;
        //  1463: aload           21
        //  1465: getfield        K2/d0.b:Ljava/lang/Object;
        //  1468: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1471: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  1474: bipush          11
        //  1476: ldc_w           "_ev"
        //  1479: aload           24
        //  1481: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1484: iconst_0       
        //  1485: invokestatic    K2/J1.N:(LK2/I1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //  1488: iload           5
        //  1490: istore          7
        //  1492: aload           18
        //  1494: astore          19
        //  1496: aload_1        
        //  1497: astore          20
        //  1499: aload           16
        //  1501: astore_1       
        //  1502: aload           17
        //  1504: astore          18
        //  1506: aload           20
        //  1508: astore          16
        //  1510: iload           6
        //  1512: istore          5
        //  1514: aload           19
        //  1516: astore          17
        //  1518: goto            3658
        //  1521: aload           24
        //  1523: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1526: aload           22
        //  1528: getstatic       K2/C0.c:[Ljava/lang/String;
        //  1531: getstatic       K2/C0.a:[Ljava/lang/String;
        //  1534: invokestatic    K2/C0.c:(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
        //  1537: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1540: ifeq            1677
        //  1543: aload           24
        //  1545: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  1548: aload           24
        //  1550: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  1553: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  1556: aload           22
        //  1558: invokestatic    com/google/android/gms/internal/measurement/f1.w:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)V
        //  1561: aload_0        
        //  1562: invokevirtual   K2/y1.j:()LK2/P;
        //  1565: invokevirtual   K2/P.H:()LK2/S;
        //  1568: ldc_w           "Renaming ad_impression to _ai"
        //  1571: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1574: aload_0        
        //  1575: invokevirtual   K2/y1.j:()LK2/P;
        //  1578: iconst_5       
        //  1579: invokevirtual   K2/P.D:(I)Z
        //  1582: ifeq            1677
        //  1585: iconst_0       
        //  1586: istore          7
        //  1588: iload           7
        //  1590: aload           24
        //  1592: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  1595: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  1598: invokevirtual   com/google/android/gms/internal/measurement/f1.x:()I
        //  1601: if_icmpge       1677
        //  1604: ldc_w           "ad_platform"
        //  1607: aload           24
        //  1609: iload           7
        //  1611: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1614: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  1617: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1620: ifeq            1671
        //  1623: aload           24
        //  1625: iload           7
        //  1627: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1630: invokevirtual   com/google/android/gms/internal/measurement/i1.E:()Ljava/lang/String;
        //  1633: invokevirtual   java/lang/String.isEmpty:()Z
        //  1636: ifne            1671
        //  1639: ldc_w           "admob"
        //  1642: aload           24
        //  1644: iload           7
        //  1646: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1649: invokevirtual   com/google/android/gms/internal/measurement/i1.E:()Ljava/lang/String;
        //  1652: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1655: ifeq            1671
        //  1658: aload_0        
        //  1659: invokevirtual   K2/y1.j:()LK2/P;
        //  1662: getfield        K2/P.M:LK2/S;
        //  1665: ldc_w           "AdMob ad impression logged from app. Potentially duplicative."
        //  1668: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1671: iinc            7, 1
        //  1674: goto            1588
        //  1677: aload_0        
        //  1678: invokevirtual   K2/y1.a0:()LK2/h0;
        //  1681: aload           21
        //  1683: getfield        K2/d0.b:Ljava/lang/Object;
        //  1686: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  1689: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  1692: aload           24
        //  1694: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1697: invokevirtual   K2/h0.O:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1700: istore          15
        //  1702: iload           15
        //  1704: ifne            1768
        //  1707: aload_0        
        //  1708: invokevirtual   K2/y1.c0:()LK2/T;
        //  1711: pop            
        //  1712: aload           24
        //  1714: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1717: astore          20
        //  1719: aload           20
        //  1721: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //  1724: aload           20
        //  1726: invokevirtual   java/lang/String.hashCode:()I
        //  1729: ldc_w           95027
        //  1732: if_icmpeq       1738
        //  1735: goto            1752
        //  1738: aload           20
        //  1740: ldc_w           "_ui"
        //  1743: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1746: ifeq            1752
        //  1749: goto            1768
        //  1752: ldc_w           "_e"
        //  1755: astore          25
        //  1757: ldc_w           "_fr"
        //  1760: astore          20
        //  1762: aload_1        
        //  1763: astore          19
        //  1765: goto            2517
        //  1768: iconst_0       
        //  1769: istore          10
        //  1771: iconst_0       
        //  1772: istore          9
        //  1774: iconst_0       
        //  1775: istore          7
        //  1777: aload           25
        //  1779: astore          20
        //  1781: aload           24
        //  1783: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  1786: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  1789: invokevirtual   com/google/android/gms/internal/measurement/f1.x:()I
        //  1792: istore          11
        //  1794: iload           7
        //  1796: iload           11
        //  1798: if_icmpge       1968
        //  1801: ldc_w           "_c"
        //  1804: aload           24
        //  1806: iload           7
        //  1808: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1811: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  1814: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1817: ifeq            1877
        //  1820: aload           24
        //  1822: iload           7
        //  1824: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1827: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  1830: checkcast       Lcom/google/android/gms/internal/measurement/h1;
        //  1833: astore          25
        //  1835: aload           25
        //  1837: lconst_1       
        //  1838: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  1841: aload           25
        //  1843: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  1846: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  1849: astore          25
        //  1851: aload           24
        //  1853: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  1856: aload           24
        //  1858: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  1861: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  1864: iload           7
        //  1866: aload           25
        //  1868: invokestatic    com/google/android/gms/internal/measurement/f1.t:(Lcom/google/android/gms/internal/measurement/f1;ILcom/google/android/gms/internal/measurement/i1;)V
        //  1871: iconst_1       
        //  1872: istore          11
        //  1874: goto            1958
        //  1877: iload           10
        //  1879: istore          11
        //  1881: ldc_w           "_r"
        //  1884: aload           24
        //  1886: iload           7
        //  1888: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1891: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  1894: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1897: ifeq            1958
        //  1900: aload           24
        //  1902: iload           7
        //  1904: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  1907: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  1910: checkcast       Lcom/google/android/gms/internal/measurement/h1;
        //  1913: astore          25
        //  1915: aload           25
        //  1917: lconst_1       
        //  1918: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  1921: aload           25
        //  1923: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  1926: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  1929: astore          25
        //  1931: aload           24
        //  1933: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  1936: aload           24
        //  1938: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  1941: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  1944: iload           7
        //  1946: aload           25
        //  1948: invokestatic    com/google/android/gms/internal/measurement/f1.t:(Lcom/google/android/gms/internal/measurement/f1;ILcom/google/android/gms/internal/measurement/i1;)V
        //  1951: iconst_1       
        //  1952: istore          9
        //  1954: iload           10
        //  1956: istore          11
        //  1958: iinc            7, 1
        //  1961: iload           11
        //  1963: istore          10
        //  1965: goto            1781
        //  1968: iload           10
        //  1970: ifne            2030
        //  1973: iload           15
        //  1975: ifeq            2030
        //  1978: aload_0        
        //  1979: invokevirtual   K2/y1.j:()LK2/P;
        //  1982: invokevirtual   K2/P.H:()LK2/S;
        //  1985: ldc_w           "Marking event as conversion"
        //  1988: aload           26
        //  1990: invokevirtual   K2/n0.q:()LK2/L;
        //  1993: aload           24
        //  1995: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  1998: invokevirtual   K2/L.c:(Ljava/lang/String;)Ljava/lang/String;
        //  2001: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2004: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  2007: astore          25
        //  2009: aload           25
        //  2011: ldc_w           "_c"
        //  2014: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  2017: aload           25
        //  2019: lconst_1       
        //  2020: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  2023: aload           24
        //  2025: aload           25
        //  2027: invokevirtual   com/google/android/gms/internal/measurement/e1.j:(Lcom/google/android/gms/internal/measurement/h1;)V
        //  2030: iload           9
        //  2032: ifne            2087
        //  2035: aload_0        
        //  2036: invokevirtual   K2/y1.j:()LK2/P;
        //  2039: invokevirtual   K2/P.H:()LK2/S;
        //  2042: ldc_w           "Marking event as real-time"
        //  2045: aload           26
        //  2047: invokevirtual   K2/n0.q:()LK2/L;
        //  2050: aload           24
        //  2052: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  2055: invokevirtual   K2/L.c:(Ljava/lang/String;)Ljava/lang/String;
        //  2058: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2061: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  2064: astore          25
        //  2066: aload           25
        //  2068: ldc_w           "_r"
        //  2071: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  2074: aload           25
        //  2076: lconst_1       
        //  2077: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  2080: aload           24
        //  2082: aload           25
        //  2084: invokevirtual   com/google/android/gms/internal/measurement/e1.j:(Lcom/google/android/gms/internal/measurement/h1;)V
        //  2087: aload_0        
        //  2088: invokevirtual   K2/y1.W:()LK2/h;
        //  2091: aload_0        
        //  2092: invokevirtual   K2/y1.h0:()J
        //  2095: aload           21
        //  2097: getfield        K2/d0.b:Ljava/lang/Object;
        //  2100: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2103: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  2106: iconst_0       
        //  2107: iconst_1       
        //  2108: iconst_0       
        //  2109: iconst_0       
        //  2110: invokevirtual   K2/h.J:(JLjava/lang/String;ZZZZ)LK2/j;
        //  2113: getfield        K2/j.e:J
        //  2116: lstore_2       
        //  2117: aload_0        
        //  2118: invokevirtual   K2/y1.T:()LK2/d;
        //  2121: astore          26
        //  2123: aload           21
        //  2125: getfield        K2/d0.b:Ljava/lang/Object;
        //  2128: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2131: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  2134: astore          25
        //  2136: aload           26
        //  2138: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2141: pop            
        //  2142: lload_2        
        //  2143: aload           26
        //  2145: aload           25
        //  2147: getstatic       K2/w.p:LK2/F;
        //  2150: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  2153: i2l            
        //  2154: lcmp           
        //  2155: ifle            2169
        //  2158: aload           24
        //  2160: ldc_w           "_r"
        //  2163: invokestatic    K2/y1.u:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;)V
        //  2166: goto            2172
        //  2169: iconst_1       
        //  2170: istore          14
        //  2172: aload           24
        //  2174: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  2177: invokestatic    K2/J1.B0:(Ljava/lang/String;)Z
        //  2180: ifeq            2510
        //  2183: iload           15
        //  2185: ifeq            2510
        //  2188: aload_0        
        //  2189: invokevirtual   K2/y1.W:()LK2/h;
        //  2192: aload_0        
        //  2193: invokevirtual   K2/y1.h0:()J
        //  2196: aload           21
        //  2198: getfield        K2/d0.b:Ljava/lang/Object;
        //  2201: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2204: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  2207: iconst_1       
        //  2208: iconst_0       
        //  2209: iconst_0       
        //  2210: iconst_0       
        //  2211: invokevirtual   K2/h.J:(JLjava/lang/String;ZZZZ)LK2/j;
        //  2214: getfield        K2/j.c:J
        //  2217: aload_0        
        //  2218: invokevirtual   K2/y1.T:()LK2/d;
        //  2221: aload           21
        //  2223: getfield        K2/d0.b:Ljava/lang/Object;
        //  2226: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2229: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  2232: getstatic       K2/w.o:LK2/F;
        //  2235: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  2238: i2l            
        //  2239: lcmp           
        //  2240: ifle            2510
        //  2243: aload_0        
        //  2244: invokevirtual   K2/y1.j:()LK2/P;
        //  2247: invokevirtual   K2/P.I:()LK2/S;
        //  2250: ldc_w           "Too many conversions. Not logging as conversion. appId"
        //  2253: aload           21
        //  2255: getfield        K2/d0.b:Ljava/lang/Object;
        //  2258: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2261: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  2264: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  2267: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2270: iconst_m1      
        //  2271: istore          10
        //  2273: aconst_null    
        //  2274: astore          26
        //  2276: iconst_0       
        //  2277: istore          9
        //  2279: iconst_0       
        //  2280: istore          7
        //  2282: iload           7
        //  2284: aload           24
        //  2286: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  2289: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  2292: invokevirtual   com/google/android/gms/internal/measurement/f1.x:()I
        //  2295: if_icmpge       2385
        //  2298: aload           24
        //  2300: iload           7
        //  2302: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  2305: astore          27
        //  2307: ldc_w           "_c"
        //  2310: aload           27
        //  2312: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  2315: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2318: ifeq            2338
        //  2321: aload           27
        //  2323: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  2326: checkcast       Lcom/google/android/gms/internal/measurement/h1;
        //  2329: astore          25
        //  2331: iload           7
        //  2333: istore          11
        //  2335: goto            2371
        //  2338: iload           10
        //  2340: istore          11
        //  2342: aload           26
        //  2344: astore          25
        //  2346: ldc_w           "_err"
        //  2349: aload           27
        //  2351: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  2354: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2357: ifeq            2371
        //  2360: iconst_1       
        //  2361: istore          9
        //  2363: aload           26
        //  2365: astore          25
        //  2367: iload           10
        //  2369: istore          11
        //  2371: iinc            7, 1
        //  2374: iload           11
        //  2376: istore          10
        //  2378: aload           25
        //  2380: astore          26
        //  2382: goto            2282
        //  2385: iload           9
        //  2387: ifeq            2416
        //  2390: aload           26
        //  2392: ifnull          2416
        //  2395: aload           24
        //  2397: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  2400: iload           10
        //  2402: aload           24
        //  2404: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  2407: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  2410: invokestatic    com/google/android/gms/internal/measurement/f1.q:(ILcom/google/android/gms/internal/measurement/f1;)V
        //  2413: goto            2510
        //  2416: aload           26
        //  2418: ifnull          2483
        //  2421: aload           26
        //  2423: invokevirtual   com/google/android/gms/internal/measurement/f2.clone:()Ljava/lang/Object;
        //  2426: checkcast       Lcom/google/android/gms/internal/measurement/f2;
        //  2429: checkcast       Lcom/google/android/gms/internal/measurement/h1;
        //  2432: astore          25
        //  2434: aload           25
        //  2436: ldc_w           "_err"
        //  2439: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  2442: aload           25
        //  2444: ldc2_w          10
        //  2447: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  2450: aload           25
        //  2452: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  2455: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  2458: astore          25
        //  2460: aload           24
        //  2462: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  2465: aload           24
        //  2467: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  2470: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  2473: iload           10
        //  2475: aload           25
        //  2477: invokestatic    com/google/android/gms/internal/measurement/f1.t:(Lcom/google/android/gms/internal/measurement/f1;ILcom/google/android/gms/internal/measurement/i1;)V
        //  2480: goto            2510
        //  2483: aload_0        
        //  2484: invokevirtual   K2/y1.j:()LK2/P;
        //  2487: invokevirtual   K2/P.G:()LK2/S;
        //  2490: ldc_w           "Did not find conversion parameter. appId"
        //  2493: aload           21
        //  2495: getfield        K2/d0.b:Ljava/lang/Object;
        //  2498: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2501: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  2504: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  2507: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2510: aload           19
        //  2512: astore          25
        //  2514: aload_1        
        //  2515: astore          19
        //  2517: iload           15
        //  2519: ifeq            2713
        //  2522: new             Ljava/util/ArrayList;
        //  2525: astore_1       
        //  2526: aload_1        
        //  2527: aload           24
        //  2529: invokevirtual   com/google/android/gms/internal/measurement/e1.p:()Ljava/util/List;
        //  2532: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  2535: iconst_0       
        //  2536: istore          7
        //  2538: iconst_m1      
        //  2539: istore          9
        //  2541: iconst_m1      
        //  2542: istore          10
        //  2544: aload_1        
        //  2545: invokevirtual   java/util/ArrayList.size:()I
        //  2548: istore          11
        //  2550: iload           7
        //  2552: iload           11
        //  2554: if_icmpge       2628
        //  2557: ldc_w           "value"
        //  2560: aload_1        
        //  2561: iload           7
        //  2563: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2566: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  2569: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  2572: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2575: ifeq            2585
        //  2578: iload           7
        //  2580: istore          11
        //  2582: goto            2618
        //  2585: iload           9
        //  2587: istore          11
        //  2589: ldc_w           "currency"
        //  2592: aload_1        
        //  2593: iload           7
        //  2595: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2598: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  2601: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  2604: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2607: ifeq            2618
        //  2610: iload           7
        //  2612: istore          10
        //  2614: iload           9
        //  2616: istore          11
        //  2618: iinc            7, 1
        //  2621: iload           11
        //  2623: istore          9
        //  2625: goto            2544
        //  2628: iload           9
        //  2630: iconst_m1      
        //  2631: if_icmpeq       2713
        //  2634: aload_1        
        //  2635: iload           9
        //  2637: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2640: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  2643: invokevirtual   com/google/android/gms/internal/measurement/i1.I:()Z
        //  2646: ifne            2716
        //  2649: aload_1        
        //  2650: iload           9
        //  2652: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2655: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  2658: invokevirtual   com/google/android/gms/internal/measurement/i1.G:()Z
        //  2661: ifne            2716
        //  2664: aload_0        
        //  2665: invokevirtual   K2/y1.j:()LK2/P;
        //  2668: getfield        K2/P.M:LK2/S;
        //  2671: ldc_w           "Value must be specified with a numeric type."
        //  2674: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  2677: aload           24
        //  2679: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  2682: iload           9
        //  2684: aload           24
        //  2686: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  2689: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  2692: invokestatic    com/google/android/gms/internal/measurement/f1.q:(ILcom/google/android/gms/internal/measurement/f1;)V
        //  2695: aload           24
        //  2697: ldc_w           "_c"
        //  2700: invokestatic    K2/y1.u:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;)V
        //  2703: aload           24
        //  2705: bipush          18
        //  2707: ldc_w           "value"
        //  2710: invokestatic    K2/y1.t:(Lcom/google/android/gms/internal/measurement/e1;ILjava/lang/String;)V
        //  2713: goto            2842
        //  2716: iload           10
        //  2718: iconst_m1      
        //  2719: if_icmpne       2725
        //  2722: goto            2777
        //  2725: aload_1        
        //  2726: iload           10
        //  2728: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2731: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  2734: invokevirtual   com/google/android/gms/internal/measurement/i1.E:()Ljava/lang/String;
        //  2737: astore_1       
        //  2738: aload_1        
        //  2739: invokevirtual   java/lang/String.length:()I
        //  2742: iconst_3       
        //  2743: if_icmpeq       2749
        //  2746: goto            2777
        //  2749: iconst_0       
        //  2750: istore          7
        //  2752: iload           7
        //  2754: aload_1        
        //  2755: invokevirtual   java/lang/String.length:()I
        //  2758: if_icmpge       2842
        //  2761: aload_1        
        //  2762: iload           7
        //  2764: invokevirtual   java/lang/String.codePointAt:(I)I
        //  2767: istore          10
        //  2769: iload           10
        //  2771: invokestatic    java/lang/Character.isLetter:(I)Z
        //  2774: ifne            2829
        //  2777: aload_0        
        //  2778: invokevirtual   K2/y1.j:()LK2/P;
        //  2781: getfield        K2/P.M:LK2/S;
        //  2784: ldc_w           "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
        //  2787: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  2790: aload           24
        //  2792: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  2795: iload           9
        //  2797: aload           24
        //  2799: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  2802: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  2805: invokestatic    com/google/android/gms/internal/measurement/f1.q:(ILcom/google/android/gms/internal/measurement/f1;)V
        //  2808: aload           24
        //  2810: ldc_w           "_c"
        //  2813: invokestatic    K2/y1.u:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;)V
        //  2816: aload           24
        //  2818: bipush          19
        //  2820: ldc_w           "currency"
        //  2823: invokestatic    K2/y1.t:(Lcom/google/android/gms/internal/measurement/e1;ILjava/lang/String;)V
        //  2826: goto            2842
        //  2829: iload           7
        //  2831: iload           10
        //  2833: invokestatic    java/lang/Character.charCount:(I)I
        //  2836: iadd           
        //  2837: istore          7
        //  2839: goto            2752
        //  2842: aload           25
        //  2844: aload           24
        //  2846: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  2849: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2852: ifeq            2977
        //  2855: aload_0        
        //  2856: invokevirtual   K2/y1.c0:()LK2/T;
        //  2859: pop            
        //  2860: aload           24
        //  2862: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  2865: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  2868: aload           20
        //  2870: invokestatic    K2/T.K:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/i1;
        //  2873: ifnonnull       2974
        //  2876: aload           18
        //  2878: ifnull          2952
        //  2881: aload           18
        //  2883: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  2886: aload           24
        //  2888: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  2891: lsub           
        //  2892: invokestatic    java/lang/Math.abs:(J)J
        //  2895: ldc2_w          1000
        //  2898: lcmp           
        //  2899: ifgt            2952
        //  2902: aload           18
        //  2904: invokevirtual   com/google/android/gms/internal/measurement/f2.clone:()Ljava/lang/Object;
        //  2907: checkcast       Lcom/google/android/gms/internal/measurement/f2;
        //  2910: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //  2913: astore_1       
        //  2914: aload_0        
        //  2915: aload           24
        //  2917: aload_1        
        //  2918: invokevirtual   K2/y1.C:(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1;)Z
        //  2921: ifeq            2952
        //  2924: aload           19
        //  2926: iload           5
        //  2928: aload_1        
        //  2929: invokevirtual   com/google/android/gms/internal/measurement/m1.j:(ILcom/google/android/gms/internal/measurement/e1;)V
        //  2932: iload           5
        //  2934: istore          7
        //  2936: iload           6
        //  2938: istore          5
        //  2940: aconst_null    
        //  2941: astore_1       
        //  2942: aconst_null    
        //  2943: astore          17
        //  2945: iload           7
        //  2947: istore          6
        //  2949: goto            3113
        //  2952: iload           4
        //  2954: istore          7
        //  2956: iload           5
        //  2958: istore          6
        //  2960: aload           24
        //  2962: astore_1       
        //  2963: aload           18
        //  2965: astore          17
        //  2967: iload           7
        //  2969: istore          5
        //  2971: goto            3113
        //  2974: goto            3094
        //  2977: ldc_w           "_vs"
        //  2980: aload           24
        //  2982: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  2985: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2988: ifeq            2974
        //  2991: aload_0        
        //  2992: invokevirtual   K2/y1.c0:()LK2/T;
        //  2995: pop            
        //  2996: aload           24
        //  2998: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  3001: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  3004: ldc_w           "_et"
        //  3007: invokestatic    K2/T.K:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/i1;
        //  3010: ifnonnull       2974
        //  3013: aload           17
        //  3015: ifnull          3072
        //  3018: aload           17
        //  3020: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  3023: aload           24
        //  3025: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  3028: lsub           
        //  3029: invokestatic    java/lang/Math.abs:(J)J
        //  3032: ldc2_w          1000
        //  3035: lcmp           
        //  3036: ifgt            3072
        //  3039: aload           17
        //  3041: invokevirtual   com/google/android/gms/internal/measurement/f2.clone:()Ljava/lang/Object;
        //  3044: checkcast       Lcom/google/android/gms/internal/measurement/f2;
        //  3047: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //  3050: astore_1       
        //  3051: aload_0        
        //  3052: aload_1        
        //  3053: aload           24
        //  3055: invokevirtual   K2/y1.C:(Lcom/google/android/gms/internal/measurement/e1;Lcom/google/android/gms/internal/measurement/e1;)Z
        //  3058: ifeq            3072
        //  3061: aload           19
        //  3063: iload           6
        //  3065: aload_1        
        //  3066: invokevirtual   com/google/android/gms/internal/measurement/m1.j:(ILcom/google/android/gms/internal/measurement/e1;)V
        //  3069: goto            2932
        //  3072: iload           4
        //  3074: istore          7
        //  3076: aload           17
        //  3078: astore_1       
        //  3079: iload           6
        //  3081: istore          5
        //  3083: aload           24
        //  3085: astore          17
        //  3087: iload           7
        //  3089: istore          6
        //  3091: goto            3113
        //  3094: aload           17
        //  3096: astore_1       
        //  3097: iload           6
        //  3099: istore          7
        //  3101: iload           5
        //  3103: istore          6
        //  3105: iload           7
        //  3107: istore          5
        //  3109: aload           18
        //  3111: astore          17
        //  3113: aload           24
        //  3115: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3118: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  3121: invokevirtual   com/google/android/gms/internal/measurement/f1.x:()I
        //  3124: ifeq            3604
        //  3127: aload_0        
        //  3128: invokevirtual   K2/y1.c0:()LK2/T;
        //  3131: pop            
        //  3132: aload           24
        //  3134: invokevirtual   com/google/android/gms/internal/measurement/e1.p:()Ljava/util/List;
        //  3137: invokestatic    K2/T.G:(Ljava/util/List;)Landroid/os/Bundle;
        //  3140: astore          26
        //  3142: iconst_0       
        //  3143: istore          7
        //  3145: aload           16
        //  3147: astore          18
        //  3149: aload           17
        //  3151: astore          16
        //  3153: iload           7
        //  3155: aload           24
        //  3157: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3160: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  3163: invokevirtual   com/google/android/gms/internal/measurement/f1.x:()I
        //  3166: if_icmpge       3424
        //  3169: aload           24
        //  3171: iload           7
        //  3173: invokevirtual   com/google/android/gms/internal/measurement/e1.m:(I)Lcom/google/android/gms/internal/measurement/i1;
        //  3176: astore          20
        //  3178: aload           20
        //  3180: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  3183: aload           18
        //  3185: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3188: ifeq            3363
        //  3191: aload           20
        //  3193: invokevirtual   com/google/android/gms/internal/measurement/i1.F:()Ljava/util/List;
        //  3196: invokeinterface java/util/List.isEmpty:()Z
        //  3201: ifne            3363
        //  3204: aload           21
        //  3206: getfield        K2/d0.b:Ljava/lang/Object;
        //  3209: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3212: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  3215: astore          27
        //  3217: aload           20
        //  3219: invokevirtual   com/google/android/gms/internal/measurement/i1.F:()Ljava/util/List;
        //  3222: astore          17
        //  3224: aload           17
        //  3226: invokeinterface java/util/List.size:()I
        //  3231: anewarray       Landroid/os/Bundle;
        //  3234: astore          25
        //  3236: iconst_0       
        //  3237: istore          9
        //  3239: iload           9
        //  3241: aload           17
        //  3243: invokeinterface java/util/List.size:()I
        //  3248: if_icmpge       3351
        //  3251: aload           17
        //  3253: iload           9
        //  3255: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3260: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  3263: astore          20
        //  3265: aload_0        
        //  3266: invokevirtual   K2/y1.c0:()LK2/T;
        //  3269: pop            
        //  3270: aload           20
        //  3272: invokevirtual   com/google/android/gms/internal/measurement/i1.F:()Ljava/util/List;
        //  3275: invokestatic    K2/T.G:(Ljava/util/List;)Landroid/os/Bundle;
        //  3278: astore          28
        //  3280: aload           20
        //  3282: invokevirtual   com/google/android/gms/internal/measurement/i1.F:()Ljava/util/List;
        //  3285: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3290: astore          20
        //  3292: aload           20
        //  3294: invokeinterface java/util/Iterator.hasNext:()Z
        //  3299: ifeq            3338
        //  3302: aload           20
        //  3304: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3309: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  3312: astore          29
        //  3314: aload_0        
        //  3315: aload           24
        //  3317: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  3320: aload           29
        //  3322: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  3325: checkcast       Lcom/google/android/gms/internal/measurement/h1;
        //  3328: aload           28
        //  3330: aload           27
        //  3332: invokevirtual   K2/y1.z:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/h1;Landroid/os/Bundle;Ljava/lang/String;)V
        //  3335: goto            3292
        //  3338: aload           25
        //  3340: iload           9
        //  3342: aload           28
        //  3344: aastore        
        //  3345: iinc            9, 1
        //  3348: goto            3239
        //  3351: aload           26
        //  3353: aload           18
        //  3355: aload           25
        //  3357: invokevirtual   android/os/Bundle.putParcelableArray:(Ljava/lang/String;[Landroid/os/Parcelable;)V
        //  3360: goto            3418
        //  3363: aload           16
        //  3365: astore          17
        //  3367: aload           17
        //  3369: astore          16
        //  3371: aload           20
        //  3373: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  3376: aload           18
        //  3378: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3381: ifne            3418
        //  3384: aload_0        
        //  3385: aload           24
        //  3387: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  3390: aload           20
        //  3392: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  3395: checkcast       Lcom/google/android/gms/internal/measurement/h1;
        //  3398: aload           26
        //  3400: aload           21
        //  3402: getfield        K2/d0.b:Ljava/lang/Object;
        //  3405: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3408: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  3411: invokevirtual   K2/y1.z:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/h1;Landroid/os/Bundle;Ljava/lang/String;)V
        //  3414: aload           17
        //  3416: astore          16
        //  3418: iinc            7, 1
        //  3421: goto            3153
        //  3424: aload_1        
        //  3425: astore          20
        //  3427: iload           14
        //  3429: istore          15
        //  3431: aload           16
        //  3433: astore          25
        //  3435: aload           24
        //  3437: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  3440: aload           24
        //  3442: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3445: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  3448: invokestatic    com/google/android/gms/internal/measurement/f1.s:(Lcom/google/android/gms/internal/measurement/f1;)V
        //  3451: aload_0        
        //  3452: invokevirtual   K2/y1.c0:()LK2/T;
        //  3455: astore          17
        //  3457: new             Ljava/util/ArrayList;
        //  3460: astore          27
        //  3462: aload           27
        //  3464: invokespecial   java/util/ArrayList.<init>:()V
        //  3467: aload           26
        //  3469: invokevirtual   android/os/BaseBundle.keySet:()Ljava/util/Set;
        //  3472: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  3477: astore          16
        //  3479: aload           16
        //  3481: invokeinterface java/util/Iterator.hasNext:()Z
        //  3486: ifeq            3549
        //  3489: aload           16
        //  3491: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3496: checkcast       Ljava/lang/String;
        //  3499: astore          28
        //  3501: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  3504: astore_1       
        //  3505: aload_1        
        //  3506: aload           28
        //  3508: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  3511: aload           26
        //  3513: aload           28
        //  3515: invokevirtual   android/os/BaseBundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //  3518: astore          28
        //  3520: aload           28
        //  3522: ifnull          3479
        //  3525: aload           17
        //  3527: aload_1        
        //  3528: aload           28
        //  3530: invokevirtual   K2/T.V:(Lcom/google/android/gms/internal/measurement/h1;Ljava/lang/Object;)V
        //  3533: aload           27
        //  3535: aload_1        
        //  3536: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  3539: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  3542: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3545: pop            
        //  3546: goto            3479
        //  3549: aload           27
        //  3551: invokevirtual   java/util/ArrayList.size:()I
        //  3554: istore          9
        //  3556: iconst_0       
        //  3557: istore          7
        //  3559: aload           18
        //  3561: astore_1       
        //  3562: iload           15
        //  3564: istore          14
        //  3566: aload           25
        //  3568: astore          17
        //  3570: aload           20
        //  3572: astore          16
        //  3574: iload           7
        //  3576: iload           9
        //  3578: if_icmpge       3614
        //  3581: aload           27
        //  3583: iload           7
        //  3585: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3588: astore_1       
        //  3589: iinc            7, 1
        //  3592: aload           24
        //  3594: aload_1        
        //  3595: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  3598: invokevirtual   com/google/android/gms/internal/measurement/e1.k:(Lcom/google/android/gms/internal/measurement/i1;)V
        //  3601: goto            3559
        //  3604: aload_1        
        //  3605: astore          18
        //  3607: aload           16
        //  3609: astore_1       
        //  3610: aload           18
        //  3612: astore          16
        //  3614: aload           21
        //  3616: getfield        K2/d0.d:Ljava/lang/Object;
        //  3619: checkcast       Ljava/util/ArrayList;
        //  3622: iload           8
        //  3624: aload           24
        //  3626: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  3629: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  3632: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //  3635: pop            
        //  3636: iinc            4, 1
        //  3639: aload           19
        //  3641: aload           24
        //  3643: invokevirtual   com/google/android/gms/internal/measurement/m1.m:(Lcom/google/android/gms/internal/measurement/e1;)V
        //  3646: aload           16
        //  3648: astore          18
        //  3650: iload           6
        //  3652: istore          7
        //  3654: aload           19
        //  3656: astore          16
        //  3658: iinc            8, 1
        //  3661: aload_1        
        //  3662: astore          19
        //  3664: aload           16
        //  3666: astore_1       
        //  3667: aload           17
        //  3669: astore          16
        //  3671: aload           18
        //  3673: astore          17
        //  3675: aload           16
        //  3677: astore          18
        //  3679: iload           5
        //  3681: istore          6
        //  3683: iload           7
        //  3685: istore          5
        //  3687: aload           19
        //  3689: astore          16
        //  3691: goto            1244
        //  3694: iload           4
        //  3696: istore          6
        //  3698: lconst_0       
        //  3699: lstore          12
        //  3701: iconst_0       
        //  3702: istore          4
        //  3704: iload           4
        //  3706: iload           6
        //  3708: if_icmpge       3907
        //  3711: aload_1        
        //  3712: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3715: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3718: iload           4
        //  3720: invokevirtual   com/google/android/gms/internal/measurement/n1.p:(I)Lcom/google/android/gms/internal/measurement/f1;
        //  3723: astore          16
        //  3725: ldc_w           "_e"
        //  3728: aload           16
        //  3730: invokevirtual   com/google/android/gms/internal/measurement/f1.C:()Ljava/lang/String;
        //  3733: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3736: ifeq            3779
        //  3739: aload_0        
        //  3740: invokevirtual   K2/y1.c0:()LK2/T;
        //  3743: pop            
        //  3744: aload           16
        //  3746: ldc_w           "_fr"
        //  3749: invokestatic    K2/T.K:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/i1;
        //  3752: ifnull          3779
        //  3755: aload_1        
        //  3756: iload           4
        //  3758: invokevirtual   com/google/android/gms/internal/measurement/m1.r:(I)V
        //  3761: iload           6
        //  3763: iconst_1       
        //  3764: isub           
        //  3765: istore          7
        //  3767: iload           4
        //  3769: iconst_1       
        //  3770: isub           
        //  3771: istore          5
        //  3773: lload           12
        //  3775: lstore_2       
        //  3776: goto            3891
        //  3779: aload_0        
        //  3780: invokevirtual   K2/y1.c0:()LK2/T;
        //  3783: pop            
        //  3784: aload           16
        //  3786: ldc_w           "_et"
        //  3789: invokestatic    K2/T.K:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/i1;
        //  3792: astore          16
        //  3794: iload           6
        //  3796: istore          7
        //  3798: iload           4
        //  3800: istore          5
        //  3802: lload           12
        //  3804: lstore_2       
        //  3805: aload           16
        //  3807: ifnull          3776
        //  3810: aload           16
        //  3812: invokevirtual   com/google/android/gms/internal/measurement/i1.I:()Z
        //  3815: ifeq            3831
        //  3818: aload           16
        //  3820: invokevirtual   com/google/android/gms/internal/measurement/i1.A:()J
        //  3823: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3826: astore          16
        //  3828: goto            3834
        //  3831: aconst_null    
        //  3832: astore          16
        //  3834: iload           6
        //  3836: istore          7
        //  3838: iload           4
        //  3840: istore          5
        //  3842: lload           12
        //  3844: lstore_2       
        //  3845: aload           16
        //  3847: ifnull          3776
        //  3850: iload           6
        //  3852: istore          7
        //  3854: iload           4
        //  3856: istore          5
        //  3858: lload           12
        //  3860: lstore_2       
        //  3861: aload           16
        //  3863: invokevirtual   java/lang/Long.longValue:()J
        //  3866: lconst_0       
        //  3867: lcmp           
        //  3868: ifle            3776
        //  3871: lload           12
        //  3873: aload           16
        //  3875: invokevirtual   java/lang/Long.longValue:()J
        //  3878: ladd           
        //  3879: lstore_2       
        //  3880: iload           6
        //  3882: istore          7
        //  3884: iload           4
        //  3886: istore          5
        //  3888: goto            3776
        //  3891: iload           5
        //  3893: iconst_1       
        //  3894: iadd           
        //  3895: istore          4
        //  3897: iload           7
        //  3899: istore          6
        //  3901: lload_2        
        //  3902: lstore          12
        //  3904: goto            3704
        //  3907: aload_0        
        //  3908: aload_1        
        //  3909: lload           12
        //  3911: iconst_0       
        //  3912: invokevirtual   K2/y1.v:(Lcom/google/android/gms/internal/measurement/m1;JZ)V
        //  3915: aload_1        
        //  3916: invokevirtual   com/google/android/gms/internal/measurement/m1.q:()Ljava/util/List;
        //  3919: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3924: astore          16
        //  3926: aload           16
        //  3928: invokeinterface java/util/Iterator.hasNext:()Z
        //  3933: istore          15
        //  3935: iload           15
        //  3937: ifeq            3976
        //  3940: ldc_w           "_s"
        //  3943: aload           16
        //  3945: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3950: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  3953: invokevirtual   com/google/android/gms/internal/measurement/f1.C:()Ljava/lang/String;
        //  3956: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3959: ifeq            3926
        //  3962: aload_0        
        //  3963: invokevirtual   K2/y1.W:()LK2/h;
        //  3966: aload_1        
        //  3967: invokevirtual   com/google/android/gms/internal/measurement/m1.X:()Ljava/lang/String;
        //  3970: ldc_w           "_se"
        //  3973: invokevirtual   K2/h.x0:(Ljava/lang/String;Ljava/lang/String;)V
        //  3976: aload_1        
        //  3977: ldc_w           "_sid"
        //  3980: invokestatic    K2/T.C:(Lcom/google/android/gms/internal/measurement/m1;Ljava/lang/String;)I
        //  3983: iflt            3997
        //  3986: aload_0        
        //  3987: aload_1        
        //  3988: lload           12
        //  3990: iconst_1       
        //  3991: invokevirtual   K2/y1.v:(Lcom/google/android/gms/internal/measurement/m1;JZ)V
        //  3994: goto            4054
        //  3997: aload_1        
        //  3998: ldc_w           "_se"
        //  4001: invokestatic    K2/T.C:(Lcom/google/android/gms/internal/measurement/m1;Ljava/lang/String;)I
        //  4004: istore          4
        //  4006: iload           4
        //  4008: iflt            4054
        //  4011: aload_1        
        //  4012: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4015: aload_1        
        //  4016: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4019: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4022: iload           4
        //  4024: invokestatic    com/google/android/gms/internal/measurement/n1.f0:(Lcom/google/android/gms/internal/measurement/n1;I)V
        //  4027: aload_0        
        //  4028: invokevirtual   K2/y1.j:()LK2/P;
        //  4031: invokevirtual   K2/P.G:()LK2/S;
        //  4034: ldc_w           "Session engagement user property is in the bundle without session ID. appId"
        //  4037: aload           21
        //  4039: getfield        K2/d0.b:Ljava/lang/Object;
        //  4042: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4045: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4048: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  4051: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  4054: aload           21
        //  4056: getfield        K2/d0.b:Ljava/lang/Object;
        //  4059: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4062: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4065: astore          16
        //  4067: aload_0        
        //  4068: invokevirtual   K2/y1.l:()LK2/k0;
        //  4071: invokevirtual   K2/k0.v:()V
        //  4074: aload_0        
        //  4075: invokevirtual   K2/y1.f0:()V
        //  4078: aload_0        
        //  4079: invokevirtual   K2/y1.W:()LK2/h;
        //  4082: aload           16
        //  4084: invokevirtual   K2/h.u0:(Ljava/lang/String;)LK2/G;
        //  4087: astore          17
        //  4089: aload           17
        //  4091: ifnonnull       4115
        //  4094: aload_0        
        //  4095: invokevirtual   K2/y1.j:()LK2/P;
        //  4098: invokevirtual   K2/P.G:()LK2/S;
        //  4101: ldc_w           "Cannot fix consent fields without appInfo. appId"
        //  4104: aload           16
        //  4106: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  4109: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  4112: goto            4122
        //  4115: aload_0        
        //  4116: aload           17
        //  4118: aload_1        
        //  4119: invokevirtual   K2/y1.q:(LK2/G;Lcom/google/android/gms/internal/measurement/m1;)V
        //  4122: invokestatic    com/google/android/gms/internal/measurement/J3.a:()V
        //  4125: aload_0        
        //  4126: invokevirtual   K2/y1.T:()LK2/d;
        //  4129: getstatic       K2/w.T0:LK2/F;
        //  4132: invokevirtual   K2/d.y:(LK2/F;)Z
        //  4135: ifeq            4206
        //  4138: aload           21
        //  4140: getfield        K2/d0.b:Ljava/lang/Object;
        //  4143: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4146: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4149: astore          16
        //  4151: aload_0        
        //  4152: invokevirtual   K2/y1.l:()LK2/k0;
        //  4155: invokevirtual   K2/k0.v:()V
        //  4158: aload_0        
        //  4159: invokevirtual   K2/y1.f0:()V
        //  4162: aload_0        
        //  4163: invokevirtual   K2/y1.W:()LK2/h;
        //  4166: aload           16
        //  4168: invokevirtual   K2/h.u0:(Ljava/lang/String;)LK2/G;
        //  4171: astore          17
        //  4173: aload           17
        //  4175: ifnonnull       4199
        //  4178: aload_0        
        //  4179: invokevirtual   K2/y1.j:()LK2/P;
        //  4182: invokevirtual   K2/P.I:()LK2/S;
        //  4185: ldc_w           "Cannot populate ad_campaign_info without appInfo. appId"
        //  4188: aload           16
        //  4190: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  4193: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  4196: goto            4206
        //  4199: aload_0        
        //  4200: aload           17
        //  4202: aload_1        
        //  4203: invokevirtual   K2/y1.N:(LK2/G;Lcom/google/android/gms/internal/measurement/m1;)V
        //  4206: aload_1        
        //  4207: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4210: aload_1        
        //  4211: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4214: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4217: ldc2_w          9223372036854775807
        //  4220: invokestatic    com/google/android/gms/internal/measurement/n1.v1:(Lcom/google/android/gms/internal/measurement/n1;J)V
        //  4223: aload_1        
        //  4224: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4227: aload_1        
        //  4228: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4231: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4234: ldc2_w          -9223372036854775808
        //  4237: invokestatic    com/google/android/gms/internal/measurement/n1.b1:(Lcom/google/android/gms/internal/measurement/n1;J)V
        //  4240: iconst_0       
        //  4241: istore          4
        //  4243: iload           4
        //  4245: aload_1        
        //  4246: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  4249: if_icmpge       4352
        //  4252: aload_1        
        //  4253: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4256: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4259: iload           4
        //  4261: invokevirtual   com/google/android/gms/internal/measurement/n1.p:(I)Lcom/google/android/gms/internal/measurement/f1;
        //  4264: astore          16
        //  4266: aload           16
        //  4268: invokevirtual   com/google/android/gms/internal/measurement/f1.A:()J
        //  4271: aload_1        
        //  4272: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4275: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4278: invokevirtual   com/google/android/gms/internal/measurement/n1.S1:()J
        //  4281: lcmp           
        //  4282: ifge            4306
        //  4285: aload           16
        //  4287: invokevirtual   com/google/android/gms/internal/measurement/f1.A:()J
        //  4290: lstore_2       
        //  4291: aload_1        
        //  4292: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4295: aload_1        
        //  4296: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4299: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4302: lload_2        
        //  4303: invokestatic    com/google/android/gms/internal/measurement/n1.v1:(Lcom/google/android/gms/internal/measurement/n1;J)V
        //  4306: aload           16
        //  4308: invokevirtual   com/google/android/gms/internal/measurement/f1.A:()J
        //  4311: aload_1        
        //  4312: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4315: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4318: invokevirtual   com/google/android/gms/internal/measurement/n1.J1:()J
        //  4321: lcmp           
        //  4322: ifle            4346
        //  4325: aload           16
        //  4327: invokevirtual   com/google/android/gms/internal/measurement/f1.A:()J
        //  4330: lstore_2       
        //  4331: aload_1        
        //  4332: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4335: aload_1        
        //  4336: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4339: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4342: lload_2        
        //  4343: invokestatic    com/google/android/gms/internal/measurement/n1.b1:(Lcom/google/android/gms/internal/measurement/n1;J)V
        //  4346: iinc            4, 1
        //  4349: goto            4243
        //  4352: aload_1        
        //  4353: invokevirtual   com/google/android/gms/internal/measurement/m1.V:()V
        //  4356: getstatic       K2/z0.c:LK2/z0;
        //  4359: astore          16
        //  4361: invokestatic    com/google/android/gms/internal/measurement/a3.a:()V
        //  4364: aload_0        
        //  4365: invokevirtual   K2/y1.T:()LK2/d;
        //  4368: getstatic       K2/w.X0:LK2/F;
        //  4371: invokevirtual   K2/d.y:(LK2/F;)Z
        //  4374: istore          15
        //  4376: getstatic       K2/y0.D:LK2/y0;
        //  4379: astore          18
        //  4381: iload           15
        //  4383: ifeq            4629
        //  4386: aload_0        
        //  4387: aload           21
        //  4389: getfield        K2/d0.b:Ljava/lang/Object;
        //  4392: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4395: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4398: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //  4401: bipush          100
        //  4403: aload           21
        //  4405: getfield        K2/d0.b:Ljava/lang/Object;
        //  4408: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4411: invokevirtual   com/google/android/gms/internal/measurement/n1.G:()Ljava/lang/String;
        //  4414: invokestatic    K2/z0.c:(ILjava/lang/String;)LK2/z0;
        //  4417: invokevirtual   K2/z0.d:(LK2/z0;)LK2/z0;
        //  4420: astore          17
        //  4422: aload_0        
        //  4423: invokevirtual   K2/y1.W:()LK2/h;
        //  4426: aload           21
        //  4428: getfield        K2/d0.b:Ljava/lang/Object;
        //  4431: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4434: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4437: invokevirtual   K2/h.w0:(Ljava/lang/String;)LK2/z0;
        //  4440: astore          16
        //  4442: aload_0        
        //  4443: invokevirtual   K2/y1.W:()LK2/h;
        //  4446: aload           21
        //  4448: getfield        K2/d0.b:Ljava/lang/Object;
        //  4451: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4454: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4457: aload           17
        //  4459: invokevirtual   K2/h.W:(Ljava/lang/String;LK2/z0;)V
        //  4462: aload           17
        //  4464: invokevirtual   K2/z0.n:()Z
        //  4467: ifne            4499
        //  4470: aload           16
        //  4472: invokevirtual   K2/z0.n:()Z
        //  4475: ifeq            4499
        //  4478: aload_0        
        //  4479: invokevirtual   K2/y1.W:()LK2/h;
        //  4482: aload           21
        //  4484: getfield        K2/d0.b:Ljava/lang/Object;
        //  4487: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4490: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4493: invokevirtual   K2/h.E0:(Ljava/lang/String;)V
        //  4496: goto            4533
        //  4499: aload           17
        //  4501: invokevirtual   K2/z0.n:()Z
        //  4504: ifeq            4533
        //  4507: aload           16
        //  4509: invokevirtual   K2/z0.n:()Z
        //  4512: ifne            4533
        //  4515: aload_0        
        //  4516: invokevirtual   K2/y1.W:()LK2/h;
        //  4519: aload           21
        //  4521: getfield        K2/d0.b:Ljava/lang/Object;
        //  4524: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4527: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4530: invokevirtual   K2/h.F0:(Ljava/lang/String;)V
        //  4533: aload           17
        //  4535: aload           18
        //  4537: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  4540: ifne            4585
        //  4543: aload_1        
        //  4544: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4547: aload_1        
        //  4548: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4551: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4554: invokestatic    com/google/android/gms/internal/measurement/n1.C1:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  4557: aload_1        
        //  4558: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4561: aload_1        
        //  4562: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4565: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4568: invokestatic    com/google/android/gms/internal/measurement/n1.o1:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  4571: aload_1        
        //  4572: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4575: aload_1        
        //  4576: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4579: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4582: invokestatic    com/google/android/gms/internal/measurement/n1.Z0:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  4585: aload           17
        //  4587: astore          16
        //  4589: aload           17
        //  4591: invokevirtual   K2/z0.n:()Z
        //  4594: ifne            4629
        //  4597: aload_1        
        //  4598: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4601: aload_1        
        //  4602: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4605: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4608: invokestatic    com/google/android/gms/internal/measurement/n1.e0:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  4611: aload_1        
        //  4612: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  4615: aload_1        
        //  4616: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4619: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4622: invokestatic    com/google/android/gms/internal/measurement/n1.G1:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  4625: aload           17
        //  4627: astore          16
        //  4629: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  4632: aload_0        
        //  4633: invokevirtual   K2/y1.T:()LK2/d;
        //  4636: aload           21
        //  4638: getfield        K2/d0.b:Ljava/lang/Object;
        //  4641: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4644: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4647: getstatic       K2/w.G0:LK2/F;
        //  4650: invokevirtual   K2/d.F:(Ljava/lang/String;LK2/F;)Z
        //  4653: istore          15
        //  4655: ldc_w           ","
        //  4658: astore          19
        //  4660: iload           15
        //  4662: ifeq            5429
        //  4665: aload_0        
        //  4666: invokevirtual   K2/y1.d0:()LK2/J1;
        //  4669: pop            
        //  4670: aload           21
        //  4672: getfield        K2/d0.b:Ljava/lang/Object;
        //  4675: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4678: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4681: astore          17
        //  4683: getstatic       K2/w.d0:LK2/F;
        //  4686: aconst_null    
        //  4687: invokevirtual   K2/F.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4690: checkcast       Ljava/lang/String;
        //  4693: astore          22
        //  4695: aload           22
        //  4697: ldc_w           "*"
        //  4700: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4703: ifne            4736
        //  4706: aload           22
        //  4708: ldc_w           ","
        //  4711: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //  4714: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //  4717: aload           17
        //  4719: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  4724: ifeq            4730
        //  4727: goto            4736
        //  4730: iconst_0       
        //  4731: istore          4
        //  4733: goto            4739
        //  4736: iconst_1       
        //  4737: istore          4
        //  4739: iload           4
        //  4741: ifeq            5429
        //  4744: aload_0        
        //  4745: aload           21
        //  4747: getfield        K2/d0.b:Ljava/lang/Object;
        //  4750: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4753: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4756: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //  4759: aload           18
        //  4761: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  4764: ifeq            5429
        //  4767: aload           21
        //  4769: getfield        K2/d0.b:Ljava/lang/Object;
        //  4772: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4775: invokevirtual   com/google/android/gms/internal/measurement/n1.V:()Z
        //  4778: ifeq            5429
        //  4781: iconst_0       
        //  4782: istore          4
        //  4784: aload           20
        //  4786: astore          17
        //  4788: iload           4
        //  4790: aload_1        
        //  4791: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  4794: if_icmpge       5429
        //  4797: aload_1        
        //  4798: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  4801: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4804: iload           4
        //  4806: invokevirtual   com/google/android/gms/internal/measurement/n1.p:(I)Lcom/google/android/gms/internal/measurement/f1;
        //  4809: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  4812: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //  4815: astore          20
        //  4817: aload           20
        //  4819: invokevirtual   com/google/android/gms/internal/measurement/e1.p:()Ljava/util/List;
        //  4822: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  4827: astore          18
        //  4829: aload           18
        //  4831: invokeinterface java/util/Iterator.hasNext:()Z
        //  4836: ifeq            5423
        //  4839: aload           17
        //  4841: aload           18
        //  4843: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4848: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  4851: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  4854: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4857: ifeq            4829
        //  4860: aload           21
        //  4862: getfield        K2/d0.b:Ljava/lang/Object;
        //  4865: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4868: invokevirtual   com/google/android/gms/internal/measurement/n1.o:()I
        //  4871: aload_0        
        //  4872: invokevirtual   K2/y1.T:()LK2/d;
        //  4875: aload           21
        //  4877: getfield        K2/d0.b:Ljava/lang/Object;
        //  4880: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4883: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4886: getstatic       K2/w.X:LK2/F;
        //  4889: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  4892: if_icmplt       5406
        //  4895: aload_0        
        //  4896: invokevirtual   K2/y1.T:()LK2/d;
        //  4899: aload           21
        //  4901: getfield        K2/d0.b:Ljava/lang/Object;
        //  4904: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4907: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4910: getstatic       K2/w.i0:LK2/F;
        //  4913: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  4916: istore          5
        //  4918: aload_0        
        //  4919: getfield        K2/y1.S:Ljava/util/HashSet;
        //  4922: astore          22
        //  4924: iload           5
        //  4926: ifle            5203
        //  4929: aload_0        
        //  4930: invokevirtual   K2/y1.W:()LK2/h;
        //  4933: aload_0        
        //  4934: invokevirtual   K2/y1.h0:()J
        //  4937: aload           21
        //  4939: getfield        K2/d0.b:Ljava/lang/Object;
        //  4942: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  4945: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  4948: iconst_0       
        //  4949: iconst_0       
        //  4950: iconst_0       
        //  4951: iconst_1       
        //  4952: invokevirtual   K2/h.J:(JLjava/lang/String;ZZZZ)LK2/j;
        //  4955: getfield        K2/j.g:J
        //  4958: iload           5
        //  4960: i2l            
        //  4961: lcmp           
        //  4962: ifle            5000
        //  4965: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  4968: astore          18
        //  4970: aload           18
        //  4972: ldc_w           "_tnr"
        //  4975: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  4978: aload           18
        //  4980: lconst_1       
        //  4981: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  4984: aload           20
        //  4986: aload           18
        //  4988: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  4991: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  4994: invokevirtual   com/google/android/gms/internal/measurement/e1.k:(Lcom/google/android/gms/internal/measurement/i1;)V
        //  4997: goto            5406
        //  5000: aload_0        
        //  5001: invokevirtual   K2/y1.T:()LK2/d;
        //  5004: aload           21
        //  5006: getfield        K2/d0.b:Ljava/lang/Object;
        //  5009: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5012: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5015: getstatic       K2/w.I0:LK2/F;
        //  5018: invokevirtual   K2/d.F:(Ljava/lang/String;LK2/F;)Z
        //  5021: ifeq            5069
        //  5024: aload_0        
        //  5025: invokevirtual   K2/y1.d0:()LK2/J1;
        //  5028: invokevirtual   K2/J1.G0:()Ljava/lang/String;
        //  5031: astore          18
        //  5033: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  5036: astore          23
        //  5038: aload           23
        //  5040: ldc_w           "_tu"
        //  5043: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  5046: aload           23
        //  5048: aload           18
        //  5050: invokevirtual   com/google/android/gms/internal/measurement/h1.l:(Ljava/lang/String;)V
        //  5053: aload           20
        //  5055: aload           23
        //  5057: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  5060: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  5063: invokevirtual   com/google/android/gms/internal/measurement/e1.k:(Lcom/google/android/gms/internal/measurement/i1;)V
        //  5066: goto            5072
        //  5069: aconst_null    
        //  5070: astore          18
        //  5072: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  5075: astore          23
        //  5077: aload           23
        //  5079: ldc_w           "_tr"
        //  5082: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  5085: aload           23
        //  5087: lconst_1       
        //  5088: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  5091: aload           20
        //  5093: aload           23
        //  5095: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  5098: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  5101: invokevirtual   com/google/android/gms/internal/measurement/e1.k:(Lcom/google/android/gms/internal/measurement/i1;)V
        //  5104: aload_0        
        //  5105: invokevirtual   K2/y1.c0:()LK2/T;
        //  5108: aload           21
        //  5110: getfield        K2/d0.b:Ljava/lang/Object;
        //  5113: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5116: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5119: aload_1        
        //  5120: aload           20
        //  5122: aload           18
        //  5124: invokevirtual   K2/T.F:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/m1;Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;)LK2/s1;
        //  5127: astore          18
        //  5129: aload           18
        //  5131: ifnull          5406
        //  5134: aload_0        
        //  5135: invokevirtual   K2/y1.j:()LK2/P;
        //  5138: invokevirtual   K2/P.H:()LK2/S;
        //  5141: aload           21
        //  5143: getfield        K2/d0.b:Ljava/lang/Object;
        //  5146: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5149: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5152: aload           18
        //  5154: getfield        K2/s1.C:Ljava/lang/String;
        //  5157: ldc_w           "Generated trigger URI. appId, uri"
        //  5160: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  5163: aload_0        
        //  5164: invokevirtual   K2/y1.W:()LK2/h;
        //  5167: aload           21
        //  5169: getfield        K2/d0.b:Ljava/lang/Object;
        //  5172: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5175: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5178: aload           18
        //  5180: invokevirtual   K2/h.X:(Ljava/lang/String;LK2/s1;)V
        //  5183: aload           22
        //  5185: aload           21
        //  5187: getfield        K2/d0.b:Ljava/lang/Object;
        //  5190: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5193: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5196: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  5199: pop            
        //  5200: goto            5406
        //  5203: aload_0        
        //  5204: invokevirtual   K2/y1.T:()LK2/d;
        //  5207: aload           21
        //  5209: getfield        K2/d0.b:Ljava/lang/Object;
        //  5212: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5215: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5218: getstatic       K2/w.I0:LK2/F;
        //  5221: invokevirtual   K2/d.F:(Ljava/lang/String;LK2/F;)Z
        //  5224: ifeq            5272
        //  5227: aload_0        
        //  5228: invokevirtual   K2/y1.d0:()LK2/J1;
        //  5231: invokevirtual   K2/J1.G0:()Ljava/lang/String;
        //  5234: astore          18
        //  5236: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  5239: astore          23
        //  5241: aload           23
        //  5243: ldc_w           "_tu"
        //  5246: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  5249: aload           23
        //  5251: aload           18
        //  5253: invokevirtual   com/google/android/gms/internal/measurement/h1.l:(Ljava/lang/String;)V
        //  5256: aload           20
        //  5258: aload           23
        //  5260: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  5263: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  5266: invokevirtual   com/google/android/gms/internal/measurement/e1.k:(Lcom/google/android/gms/internal/measurement/i1;)V
        //  5269: goto            5275
        //  5272: aconst_null    
        //  5273: astore          18
        //  5275: invokestatic    com/google/android/gms/internal/measurement/i1.C:()Lcom/google/android/gms/internal/measurement/h1;
        //  5278: astore          23
        //  5280: aload           23
        //  5282: ldc_w           "_tr"
        //  5285: invokevirtual   com/google/android/gms/internal/measurement/h1.k:(Ljava/lang/String;)V
        //  5288: aload           23
        //  5290: lconst_1       
        //  5291: invokevirtual   com/google/android/gms/internal/measurement/h1.j:(J)V
        //  5294: aload           20
        //  5296: aload           23
        //  5298: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  5301: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  5304: invokevirtual   com/google/android/gms/internal/measurement/e1.k:(Lcom/google/android/gms/internal/measurement/i1;)V
        //  5307: aload_0        
        //  5308: invokevirtual   K2/y1.c0:()LK2/T;
        //  5311: aload           21
        //  5313: getfield        K2/d0.b:Ljava/lang/Object;
        //  5316: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5319: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5322: aload_1        
        //  5323: aload           20
        //  5325: aload           18
        //  5327: invokevirtual   K2/T.F:(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/m1;Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;)LK2/s1;
        //  5330: astore          18
        //  5332: aload           18
        //  5334: ifnull          5406
        //  5337: aload_0        
        //  5338: invokevirtual   K2/y1.j:()LK2/P;
        //  5341: invokevirtual   K2/P.H:()LK2/S;
        //  5344: aload           21
        //  5346: getfield        K2/d0.b:Ljava/lang/Object;
        //  5349: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5352: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5355: aload           18
        //  5357: getfield        K2/s1.C:Ljava/lang/String;
        //  5360: ldc_w           "Generated trigger URI. appId, uri"
        //  5363: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  5366: aload_0        
        //  5367: invokevirtual   K2/y1.W:()LK2/h;
        //  5370: aload           21
        //  5372: getfield        K2/d0.b:Ljava/lang/Object;
        //  5375: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5378: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5381: aload           18
        //  5383: invokevirtual   K2/h.X:(Ljava/lang/String;LK2/s1;)V
        //  5386: aload           22
        //  5388: aload           21
        //  5390: getfield        K2/d0.b:Ljava/lang/Object;
        //  5393: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5396: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5399: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  5402: pop            
        //  5403: goto            5406
        //  5406: aload_1        
        //  5407: iload           4
        //  5409: aload           20
        //  5411: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  5414: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  5417: invokevirtual   com/google/android/gms/internal/measurement/m1.k:(ILcom/google/android/gms/internal/measurement/f1;)V
        //  5420: goto            5423
        //  5423: iinc            4, 1
        //  5426: goto            4788
        //  5429: invokestatic    com/google/android/gms/internal/measurement/a3.a:()V
        //  5432: aload_0        
        //  5433: invokevirtual   K2/y1.T:()LK2/d;
        //  5436: getstatic       K2/w.X0:LK2/F;
        //  5439: invokevirtual   K2/d.y:(LK2/F;)Z
        //  5442: ifeq            5550
        //  5445: aload_1        
        //  5446: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  5449: aload_1        
        //  5450: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5453: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5456: invokestatic    com/google/android/gms/internal/measurement/n1.J0:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  5459: aload_0        
        //  5460: getfield        K2/y1.H:LK2/K1;
        //  5463: astore          17
        //  5465: aload           17
        //  5467: invokestatic    K2/y1.r:(LK2/u1;)V
        //  5470: aload           17
        //  5472: aload_1        
        //  5473: invokevirtual   com/google/android/gms/internal/measurement/m1.X:()Ljava/lang/String;
        //  5476: aload_1        
        //  5477: invokevirtual   com/google/android/gms/internal/measurement/m1.q:()Ljava/util/List;
        //  5480: aload_1        
        //  5481: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5484: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5487: invokevirtual   com/google/android/gms/internal/measurement/n1.U:()Lcom/google/android/gms/internal/measurement/p2;
        //  5490: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  5493: aload_1        
        //  5494: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5497: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5500: invokevirtual   com/google/android/gms/internal/measurement/n1.S1:()J
        //  5503: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5506: aload_1        
        //  5507: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5510: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5513: invokevirtual   com/google/android/gms/internal/measurement/n1.J1:()J
        //  5516: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5519: aload           16
        //  5521: invokevirtual   K2/z0.n:()Z
        //  5524: iconst_1       
        //  5525: ixor           
        //  5526: invokevirtual   K2/K1.E:(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/ArrayList;
        //  5529: astore          16
        //  5531: aload_1        
        //  5532: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  5535: aload_1        
        //  5536: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5539: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5542: aload           16
        //  5544: invokestatic    com/google/android/gms/internal/measurement/n1.A:(Lcom/google/android/gms/internal/measurement/n1;Ljava/util/ArrayList;)V
        //  5547: goto            5675
        //  5550: aload_1        
        //  5551: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  5554: aload_1        
        //  5555: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5558: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5561: invokestatic    com/google/android/gms/internal/measurement/n1.J0:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  5564: aload_0        
        //  5565: getfield        K2/y1.H:LK2/K1;
        //  5568: astore          18
        //  5570: aload           18
        //  5572: invokestatic    K2/y1.r:(LK2/u1;)V
        //  5575: aload_1        
        //  5576: invokevirtual   com/google/android/gms/internal/measurement/m1.X:()Ljava/lang/String;
        //  5579: astore          17
        //  5581: aload_1        
        //  5582: invokevirtual   com/google/android/gms/internal/measurement/m1.q:()Ljava/util/List;
        //  5585: astore          16
        //  5587: aload_1        
        //  5588: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5591: astore          20
        //  5593: aload           20
        //  5595: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5598: invokevirtual   com/google/android/gms/internal/measurement/n1.U:()Lcom/google/android/gms/internal/measurement/p2;
        //  5601: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  5604: astore          20
        //  5606: aload_1        
        //  5607: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5610: astore          22
        //  5612: aload           22
        //  5614: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5617: invokevirtual   com/google/android/gms/internal/measurement/n1.S1:()J
        //  5620: lstore          12
        //  5622: aload_1        
        //  5623: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5626: astore          22
        //  5628: aload           22
        //  5630: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5633: invokevirtual   com/google/android/gms/internal/measurement/n1.J1:()J
        //  5636: lstore_2       
        //  5637: aload           18
        //  5639: aload           17
        //  5641: aload           16
        //  5643: aload           20
        //  5645: lload           12
        //  5647: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5650: lload_2        
        //  5651: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5654: invokevirtual   K2/K1.D:(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;)Ljava/util/ArrayList;
        //  5657: astore          16
        //  5659: aload_1        
        //  5660: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  5663: aload_1        
        //  5664: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5667: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5670: aload           16
        //  5672: invokestatic    com/google/android/gms/internal/measurement/n1.A:(Lcom/google/android/gms/internal/measurement/n1;Ljava/util/ArrayList;)V
        //  5675: aload_0        
        //  5676: invokevirtual   K2/y1.T:()LK2/d;
        //  5679: aload           21
        //  5681: getfield        K2/d0.b:Ljava/lang/Object;
        //  5684: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5687: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5690: invokevirtual   K2/d.H:(Ljava/lang/String;)Z
        //  5693: ifeq            7060
        //  5696: new             Ljava/util/HashMap;
        //  5699: astore          16
        //  5701: aload           16
        //  5703: invokespecial   java/util/HashMap.<init>:()V
        //  5706: new             Ljava/util/ArrayList;
        //  5709: astore          22
        //  5711: aload           22
        //  5713: invokespecial   java/util/ArrayList.<init>:()V
        //  5716: aload_0        
        //  5717: invokevirtual   K2/y1.d0:()LK2/J1;
        //  5720: invokevirtual   K2/J1.I0:()Ljava/security/SecureRandom;
        //  5723: astore          20
        //  5725: iconst_0       
        //  5726: istore          4
        //  5728: aload           19
        //  5730: astore          18
        //  5732: aload           21
        //  5734: astore          17
        //  5736: aload           16
        //  5738: astore          19
        //  5740: aload_1        
        //  5741: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  5744: istore          5
        //  5746: iload           4
        //  5748: iload           5
        //  5750: if_icmpge       6937
        //  5753: aload_1        
        //  5754: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  5757: astore          16
        //  5759: aload           16
        //  5761: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5764: iload           4
        //  5766: invokevirtual   com/google/android/gms/internal/measurement/n1.p:(I)Lcom/google/android/gms/internal/measurement/f1;
        //  5769: astore          16
        //  5771: aload           16
        //  5773: invokevirtual   com/google/android/gms/internal/measurement/g2.l:()Lcom/google/android/gms/internal/measurement/f2;
        //  5776: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //  5779: astore          23
        //  5781: aload           23
        //  5783: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  5786: ldc_w           "_ep"
        //  5789: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5792: istore          15
        //  5794: iload           15
        //  5796: ifeq            6023
        //  5799: aload_0        
        //  5800: invokevirtual   K2/y1.c0:()LK2/T;
        //  5803: pop            
        //  5804: aload           23
        //  5806: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  5809: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  5812: ldc_w           "_en"
        //  5815: invokestatic    K2/T.g0:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)Ljava/io/Serializable;
        //  5818: checkcast       Ljava/lang/String;
        //  5821: astore          24
        //  5823: aload           19
        //  5825: aload           24
        //  5827: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5830: checkcast       LK2/r;
        //  5833: astore          21
        //  5835: aload           21
        //  5837: astore          16
        //  5839: aload           21
        //  5841: ifnonnull       5905
        //  5844: aload_0        
        //  5845: invokevirtual   K2/y1.W:()LK2/h;
        //  5848: astore          21
        //  5850: aload           17
        //  5852: getfield        K2/d0.b:Ljava/lang/Object;
        //  5855: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  5858: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  5861: astore          16
        //  5863: aload           24
        //  5865: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //  5868: aload           21
        //  5870: ldc_w           "events"
        //  5873: aload           16
        //  5875: aload           24
        //  5877: invokevirtual   K2/h.t0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LK2/r;
        //  5880: astore          21
        //  5882: aload           21
        //  5884: astore          16
        //  5886: aload           21
        //  5888: ifnull          5905
        //  5891: aload           19
        //  5893: aload           24
        //  5895: aload           21
        //  5897: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  5900: pop            
        //  5901: aload           21
        //  5903: astore          16
        //  5905: aload           16
        //  5907: ifnull          6009
        //  5910: aload           16
        //  5912: getfield        K2/r.i:Ljava/lang/Long;
        //  5915: ifnonnull       6009
        //  5918: aload           16
        //  5920: getfield        K2/r.j:Ljava/lang/Long;
        //  5923: astore          21
        //  5925: aload           21
        //  5927: ifnull          5958
        //  5930: aload           21
        //  5932: invokevirtual   java/lang/Long.longValue:()J
        //  5935: lconst_1       
        //  5936: lcmp           
        //  5937: ifle            5958
        //  5940: aload_0        
        //  5941: invokevirtual   K2/y1.c0:()LK2/T;
        //  5944: pop            
        //  5945: aload           23
        //  5947: ldc_w           "_sr"
        //  5950: aload           16
        //  5952: getfield        K2/r.j:Ljava/lang/Long;
        //  5955: invokestatic    K2/T.U:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/Long;)V
        //  5958: aload           16
        //  5960: getfield        K2/r.k:Ljava/lang/Boolean;
        //  5963: astore          16
        //  5965: aload           16
        //  5967: ifnull          5995
        //  5970: aload           16
        //  5972: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  5975: ifeq            5995
        //  5978: aload_0        
        //  5979: invokevirtual   K2/y1.c0:()LK2/T;
        //  5982: pop            
        //  5983: aload           23
        //  5985: ldc_w           "_efs"
        //  5988: lconst_1       
        //  5989: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5992: invokestatic    K2/T.U:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/Long;)V
        //  5995: aload           22
        //  5997: aload           23
        //  5999: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6002: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6005: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  6008: pop            
        //  6009: aload_1        
        //  6010: iload           4
        //  6012: aload           23
        //  6014: invokevirtual   com/google/android/gms/internal/measurement/m1.j:(ILcom/google/android/gms/internal/measurement/e1;)V
        //  6017: aload_1        
        //  6018: astore          16
        //  6020: goto            6927
        //  6023: aload_0        
        //  6024: invokevirtual   K2/y1.a0:()LK2/h0;
        //  6027: aload           17
        //  6029: getfield        K2/d0.b:Ljava/lang/Object;
        //  6032: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6035: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  6038: invokevirtual   K2/h0.C:(Ljava/lang/String;)J
        //  6041: lstore_2       
        //  6042: aload_0        
        //  6043: invokevirtual   K2/y1.d0:()LK2/J1;
        //  6046: pop            
        //  6047: aload           23
        //  6049: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  6052: lstore          12
        //  6054: lload_2        
        //  6055: ldc2_w          60000
        //  6058: lmul           
        //  6059: lstore_2       
        //  6060: lload_2        
        //  6061: lload           12
        //  6063: ladd           
        //  6064: ldc2_w          86400000
        //  6067: ldiv           
        //  6068: lstore          12
        //  6070: aload           23
        //  6072: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6075: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6078: astore          16
        //  6080: ldc_w           "_dbg"
        //  6083: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  6086: ifne            6167
        //  6089: aload           16
        //  6091: invokevirtual   com/google/android/gms/internal/measurement/f1.D:()Lcom/google/android/gms/internal/measurement/p2;
        //  6094: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  6099: astore          16
        //  6101: aload           16
        //  6103: invokeinterface java/util/Iterator.hasNext:()Z
        //  6108: ifeq            6167
        //  6111: aload           16
        //  6113: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  6118: checkcast       Lcom/google/android/gms/internal/measurement/i1;
        //  6121: astore          21
        //  6123: ldc_w           "_dbg"
        //  6126: aload           21
        //  6128: invokevirtual   com/google/android/gms/internal/measurement/i1.D:()Ljava/lang/String;
        //  6131: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  6134: ifeq            6164
        //  6137: lconst_1       
        //  6138: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6141: aload           21
        //  6143: invokevirtual   com/google/android/gms/internal/measurement/i1.A:()J
        //  6146: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6149: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  6152: ifne            6158
        //  6155: goto            6167
        //  6158: iconst_1       
        //  6159: istore          5
        //  6161: goto            6192
        //  6164: goto            6101
        //  6167: aload_0        
        //  6168: invokevirtual   K2/y1.a0:()LK2/h0;
        //  6171: aload           17
        //  6173: getfield        K2/d0.b:Ljava/lang/Object;
        //  6176: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6179: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  6182: aload           23
        //  6184: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6187: invokevirtual   K2/h0.K:(Ljava/lang/String;Ljava/lang/String;)I
        //  6190: istore          5
        //  6192: iload           5
        //  6194: ifgt            6245
        //  6197: aload_0        
        //  6198: invokevirtual   K2/y1.j:()LK2/P;
        //  6201: invokevirtual   K2/P.I:()LK2/S;
        //  6204: aload           23
        //  6206: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6209: iload           5
        //  6211: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6214: ldc_w           "Sample rate must be positive. event, rate"
        //  6217: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  6220: aload           22
        //  6222: aload           23
        //  6224: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6227: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6230: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  6233: pop            
        //  6234: aload_1        
        //  6235: iload           4
        //  6237: aload           23
        //  6239: invokevirtual   com/google/android/gms/internal/measurement/m1.j:(ILcom/google/android/gms/internal/measurement/e1;)V
        //  6242: goto            6017
        //  6245: aload           19
        //  6247: aload           23
        //  6249: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6252: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  6255: checkcast       LK2/r;
        //  6258: astore          16
        //  6260: aload           16
        //  6262: ifnonnull       6373
        //  6265: aload_0        
        //  6266: invokevirtual   K2/y1.W:()LK2/h;
        //  6269: ldc_w           "events"
        //  6272: aload           17
        //  6274: getfield        K2/d0.b:Ljava/lang/Object;
        //  6277: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6280: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  6283: aload           23
        //  6285: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6288: invokevirtual   K2/h.t0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LK2/r;
        //  6291: astore          21
        //  6293: aload           21
        //  6295: astore          16
        //  6297: aload           21
        //  6299: ifnonnull       6373
        //  6302: aload_0        
        //  6303: invokevirtual   K2/y1.j:()LK2/P;
        //  6306: invokevirtual   K2/P.I:()LK2/S;
        //  6309: aload           17
        //  6311: getfield        K2/d0.b:Ljava/lang/Object;
        //  6314: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6317: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  6320: aload           23
        //  6322: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6325: ldc_w           "Event being bundled has no eventAggregate. appId, eventName"
        //  6328: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  6331: new             LK2/r;
        //  6334: astore          16
        //  6336: aload           16
        //  6338: aload           17
        //  6340: getfield        K2/d0.b:Ljava/lang/Object;
        //  6343: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6346: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  6349: aload           23
        //  6351: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6354: lconst_1       
        //  6355: lconst_1       
        //  6356: lconst_1       
        //  6357: aload           23
        //  6359: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  6362: lconst_0       
        //  6363: aconst_null    
        //  6364: aconst_null    
        //  6365: aconst_null    
        //  6366: aconst_null    
        //  6367: invokespecial   K2/r.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //  6370: goto            6373
        //  6373: aload_0        
        //  6374: invokevirtual   K2/y1.c0:()LK2/T;
        //  6377: pop            
        //  6378: aload           23
        //  6380: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6383: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6386: ldc_w           "_eid"
        //  6389: invokestatic    K2/T.g0:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)Ljava/io/Serializable;
        //  6392: checkcast       Ljava/lang/Long;
        //  6395: astore          21
        //  6397: aload           21
        //  6399: ifnull          6408
        //  6402: iconst_1       
        //  6403: istore          6
        //  6405: goto            6414
        //  6408: iconst_0       
        //  6409: istore          6
        //  6411: goto            6405
        //  6414: iload           5
        //  6416: iconst_1       
        //  6417: if_icmpne       6497
        //  6420: aload           22
        //  6422: aload           23
        //  6424: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6427: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6430: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  6433: pop            
        //  6434: iload           6
        //  6436: ifeq            6486
        //  6439: aload           16
        //  6441: getfield        K2/r.i:Ljava/lang/Long;
        //  6444: ifnonnull       6463
        //  6447: aload           16
        //  6449: getfield        K2/r.j:Ljava/lang/Long;
        //  6452: ifnonnull       6463
        //  6455: aload           16
        //  6457: getfield        K2/r.k:Ljava/lang/Boolean;
        //  6460: ifnull          6486
        //  6463: aload           16
        //  6465: aconst_null    
        //  6466: aconst_null    
        //  6467: aconst_null    
        //  6468: invokevirtual   K2/r.b:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LK2/r;
        //  6471: astore          16
        //  6473: aload           19
        //  6475: aload           23
        //  6477: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6480: aload           16
        //  6482: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6485: pop            
        //  6486: aload_1        
        //  6487: iload           4
        //  6489: aload           23
        //  6491: invokevirtual   com/google/android/gms/internal/measurement/m1.j:(ILcom/google/android/gms/internal/measurement/e1;)V
        //  6494: goto            6242
        //  6497: aload           20
        //  6499: iload           5
        //  6501: invokevirtual   java/util/Random.nextInt:(I)I
        //  6504: ifne            6665
        //  6507: aload_0        
        //  6508: invokevirtual   K2/y1.c0:()LK2/T;
        //  6511: pop            
        //  6512: iload           5
        //  6514: i2l            
        //  6515: lstore_2       
        //  6516: aload           23
        //  6518: ldc_w           "_sr"
        //  6521: lload_2        
        //  6522: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6525: invokestatic    K2/T.U:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/Long;)V
        //  6528: aload           22
        //  6530: aload           23
        //  6532: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6535: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6538: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  6541: pop            
        //  6542: aload           16
        //  6544: astore          21
        //  6546: iload           6
        //  6548: ifeq            6564
        //  6551: aload           16
        //  6553: aconst_null    
        //  6554: lload_2        
        //  6555: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6558: aconst_null    
        //  6559: invokevirtual   K2/r.b:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LK2/r;
        //  6562: astore          21
        //  6564: aload           23
        //  6566: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6569: astore          16
        //  6571: aload           23
        //  6573: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  6576: lstore_2       
        //  6577: aload           21
        //  6579: getfield        K2/r.j:Ljava/lang/Long;
        //  6582: astore          24
        //  6584: aload           21
        //  6586: getfield        K2/r.k:Ljava/lang/Boolean;
        //  6589: astore          25
        //  6591: new             LK2/r;
        //  6594: dup            
        //  6595: aload           21
        //  6597: getfield        K2/r.a:Ljava/lang/String;
        //  6600: aload           21
        //  6602: getfield        K2/r.b:Ljava/lang/String;
        //  6605: aload           21
        //  6607: getfield        K2/r.c:J
        //  6610: aload           21
        //  6612: getfield        K2/r.d:J
        //  6615: aload           21
        //  6617: getfield        K2/r.e:J
        //  6620: aload           21
        //  6622: getfield        K2/r.f:J
        //  6625: lload_2        
        //  6626: lload           12
        //  6628: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6631: aload           21
        //  6633: getfield        K2/r.i:Ljava/lang/Long;
        //  6636: aload           24
        //  6638: aload           25
        //  6640: invokespecial   K2/r.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //  6643: astore          21
        //  6645: aload           19
        //  6647: aload           16
        //  6649: aload           21
        //  6651: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6654: pop            
        //  6655: aload_1        
        //  6656: astore          16
        //  6658: goto            6915
        //  6661: astore_1       
        //  6662: goto            7972
        //  6665: aload           16
        //  6667: getfield        K2/r.h:Ljava/lang/Long;
        //  6670: astore          24
        //  6672: aload           24
        //  6674: ifnull          6686
        //  6677: aload           24
        //  6679: invokevirtual   java/lang/Long.longValue:()J
        //  6682: lstore_2       
        //  6683: goto            6703
        //  6686: aload_0        
        //  6687: invokevirtual   K2/y1.d0:()LK2/J1;
        //  6690: pop            
        //  6691: lload_2        
        //  6692: aload           23
        //  6694: invokevirtual   com/google/android/gms/internal/measurement/e1.l:()J
        //  6697: ladd           
        //  6698: ldc2_w          86400000
        //  6701: ldiv           
        //  6702: lstore_2       
        //  6703: lload_2        
        //  6704: lload           12
        //  6706: lcmp           
        //  6707: ifeq            6887
        //  6710: aload_0        
        //  6711: invokevirtual   K2/y1.c0:()LK2/T;
        //  6714: pop            
        //  6715: aload           23
        //  6717: ldc_w           "_efs"
        //  6720: lconst_1       
        //  6721: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6724: invokestatic    K2/T.U:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/Long;)V
        //  6727: aload_0        
        //  6728: invokevirtual   K2/y1.c0:()LK2/T;
        //  6731: pop            
        //  6732: iload           5
        //  6734: i2l            
        //  6735: lstore_2       
        //  6736: aload           23
        //  6738: ldc_w           "_sr"
        //  6741: lload_2        
        //  6742: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6745: invokestatic    K2/T.U:(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/Long;)V
        //  6748: aload           22
        //  6750: aload           23
        //  6752: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  6755: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //  6758: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  6761: pop            
        //  6762: aload           16
        //  6764: astore          21
        //  6766: iload           6
        //  6768: ifeq            6786
        //  6771: aload           16
        //  6773: aconst_null    
        //  6774: lload_2        
        //  6775: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6778: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  6781: invokevirtual   K2/r.b:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LK2/r;
        //  6784: astore          21
        //  6786: aload           23
        //  6788: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6791: astore          16
        //  6793: aload           23
        //  6795: invokevirtual   com/google/android/gms/internal/measurement/e1.n:()J
        //  6798: lstore_2       
        //  6799: aload           21
        //  6801: getfield        K2/r.j:Ljava/lang/Long;
        //  6804: astore          24
        //  6806: aload           21
        //  6808: getfield        K2/r.k:Ljava/lang/Boolean;
        //  6811: astore          25
        //  6813: new             LK2/r;
        //  6816: dup            
        //  6817: aload           21
        //  6819: getfield        K2/r.a:Ljava/lang/String;
        //  6822: aload           21
        //  6824: getfield        K2/r.b:Ljava/lang/String;
        //  6827: aload           21
        //  6829: getfield        K2/r.c:J
        //  6832: aload           21
        //  6834: getfield        K2/r.d:J
        //  6837: aload           21
        //  6839: getfield        K2/r.e:J
        //  6842: aload           21
        //  6844: getfield        K2/r.f:J
        //  6847: lload_2        
        //  6848: lload           12
        //  6850: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6853: aload           21
        //  6855: getfield        K2/r.i:Ljava/lang/Long;
        //  6858: aload           24
        //  6860: aload           25
        //  6862: invokespecial   K2/r.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //  6865: astore          21
        //  6867: aload           19
        //  6869: aload           16
        //  6871: aload           21
        //  6873: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6876: pop            
        //  6877: aload_1        
        //  6878: astore          16
        //  6880: goto            6915
        //  6883: astore_1       
        //  6884: goto            6662
        //  6887: iload           6
        //  6889: ifeq            6877
        //  6892: aload           19
        //  6894: aload           23
        //  6896: invokevirtual   com/google/android/gms/internal/measurement/e1.o:()Ljava/lang/String;
        //  6899: aload           16
        //  6901: aload           21
        //  6903: aconst_null    
        //  6904: aconst_null    
        //  6905: invokevirtual   K2/r.b:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)LK2/r;
        //  6908: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6911: pop            
        //  6912: goto            6877
        //  6915: aload_1        
        //  6916: astore          16
        //  6918: aload           16
        //  6920: iload           4
        //  6922: aload           23
        //  6924: invokevirtual   com/google/android/gms/internal/measurement/m1.j:(ILcom/google/android/gms/internal/measurement/e1;)V
        //  6927: iinc            4, 1
        //  6930: goto            5740
        //  6933: astore_1       
        //  6934: goto            6662
        //  6937: aload           22
        //  6939: invokevirtual   java/util/ArrayList.size:()I
        //  6942: aload_1        
        //  6943: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  6946: if_icmpge       6990
        //  6949: aload_1        
        //  6950: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  6953: aload_1        
        //  6954: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  6957: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6960: invokestatic    com/google/android/gms/internal/measurement/n1.e1:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  6963: aload_1        
        //  6964: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  6967: aload_1        
        //  6968: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  6971: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  6974: aload           22
        //  6976: invokestatic    com/google/android/gms/internal/measurement/n1.i0:(Lcom/google/android/gms/internal/measurement/n1;Ljava/util/ArrayList;)V
        //  6979: goto            6990
        //  6982: astore_1       
        //  6983: goto            6662
        //  6986: astore_1       
        //  6987: goto            6662
        //  6990: aload           19
        //  6992: invokevirtual   java/util/HashMap.entrySet:()Ljava/util/Set;
        //  6995: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  7000: astore          16
        //  7002: aload           16
        //  7004: invokeinterface java/util/Iterator.hasNext:()Z
        //  7009: ifeq            7047
        //  7012: aload           16
        //  7014: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  7019: checkcast       Ljava/util/Map$Entry;
        //  7022: astore          19
        //  7024: aload_0        
        //  7025: invokevirtual   K2/y1.W:()LK2/h;
        //  7028: ldc_w           "events"
        //  7031: aload           19
        //  7033: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //  7038: checkcast       LK2/r;
        //  7041: invokevirtual   K2/h.V:(Ljava/lang/String;LK2/r;)V
        //  7044: goto            7002
        //  7047: aload           17
        //  7049: astore          16
        //  7051: aload_1        
        //  7052: astore          17
        //  7054: aload           18
        //  7056: astore_1       
        //  7057: goto            7075
        //  7060: ldc_w           ","
        //  7063: astore          18
        //  7065: aload_1        
        //  7066: astore          17
        //  7068: aload           21
        //  7070: astore          16
        //  7072: aload           18
        //  7074: astore_1       
        //  7075: aload           16
        //  7077: getfield        K2/d0.b:Ljava/lang/Object;
        //  7080: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7083: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  7086: astore          18
        //  7088: aload_0        
        //  7089: invokevirtual   K2/y1.W:()LK2/h;
        //  7092: aload           18
        //  7094: invokevirtual   K2/h.u0:(Ljava/lang/String;)LK2/G;
        //  7097: astore          19
        //  7099: aload           19
        //  7101: ifnonnull       7134
        //  7104: aload_0        
        //  7105: invokevirtual   K2/y1.j:()LK2/P;
        //  7108: invokevirtual   K2/P.G:()LK2/S;
        //  7111: ldc_w           "Bundling raw events w/o app info. appId"
        //  7114: aload           16
        //  7116: getfield        K2/d0.b:Ljava/lang/Object;
        //  7119: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7122: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  7125: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  7128: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  7131: goto            7513
        //  7134: aload           17
        //  7136: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  7139: ifle            7513
        //  7142: aload           19
        //  7144: getfield        K2/G.a:LK2/n0;
        //  7147: astore          20
        //  7149: aload           20
        //  7151: getfield        K2/n0.L:LK2/k0;
        //  7154: astore          20
        //  7156: aload           20
        //  7158: invokestatic    K2/n0.f:(LK2/x0;)V
        //  7161: aload           20
        //  7163: invokevirtual   K2/k0.v:()V
        //  7166: aload           19
        //  7168: getfield        K2/G.i:J
        //  7171: lstore          12
        //  7173: lload           12
        //  7175: lconst_0       
        //  7176: lcmp           
        //  7177: ifeq            7190
        //  7180: aload           17
        //  7182: lload           12
        //  7184: invokevirtual   com/google/android/gms/internal/measurement/m1.F:(J)V
        //  7187: goto            7195
        //  7190: aload           17
        //  7192: invokevirtual   com/google/android/gms/internal/measurement/m1.Q:()V
        //  7195: aload           19
        //  7197: getfield        K2/G.a:LK2/n0;
        //  7200: astore          20
        //  7202: aload           20
        //  7204: getfield        K2/n0.L:LK2/k0;
        //  7207: astore          20
        //  7209: aload           20
        //  7211: invokestatic    K2/n0.f:(LK2/x0;)V
        //  7214: aload           20
        //  7216: invokevirtual   K2/k0.v:()V
        //  7219: aload           19
        //  7221: getfield        K2/G.h:J
        //  7224: lstore_2       
        //  7225: lload_2        
        //  7226: lconst_0       
        //  7227: lcmp           
        //  7228: ifne            7237
        //  7231: lload           12
        //  7233: lstore_2       
        //  7234: goto            7237
        //  7237: lload_2        
        //  7238: lconst_0       
        //  7239: lcmp           
        //  7240: ifeq            7252
        //  7243: aload           17
        //  7245: lload_2        
        //  7246: invokevirtual   com/google/android/gms/internal/measurement/m1.H:(J)V
        //  7249: goto            7257
        //  7252: aload           17
        //  7254: invokevirtual   com/google/android/gms/internal/measurement/m1.R:()V
        //  7257: invokestatic    com/google/android/gms/internal/measurement/i4.a:()V
        //  7260: aload_0        
        //  7261: invokevirtual   K2/y1.T:()LK2/d;
        //  7264: getstatic       K2/w.w0:LK2/F;
        //  7267: invokevirtual   K2/d.y:(LK2/F;)Z
        //  7270: ifeq            7363
        //  7273: aload_0        
        //  7274: invokevirtual   K2/y1.d0:()LK2/J1;
        //  7277: pop            
        //  7278: aload           19
        //  7280: invokevirtual   K2/G.f:()Ljava/lang/String;
        //  7283: invokestatic    K2/J1.y0:(Ljava/lang/String;)Z
        //  7286: ifeq            7363
        //  7289: aload           19
        //  7291: aload           17
        //  7293: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  7296: i2l            
        //  7297: invokevirtual   K2/G.a:(J)V
        //  7300: aload           19
        //  7302: getfield        K2/G.a:LK2/n0;
        //  7305: astore          20
        //  7307: aload           20
        //  7309: getfield        K2/n0.L:LK2/k0;
        //  7312: astore          20
        //  7314: aload           20
        //  7316: invokestatic    K2/n0.f:(LK2/x0;)V
        //  7319: aload           20
        //  7321: invokevirtual   K2/k0.v:()V
        //  7324: aload           19
        //  7326: getfield        K2/G.G:J
        //  7329: lstore_2       
        //  7330: lload_2        
        //  7331: l2i            
        //  7332: istore          4
        //  7334: aload           17
        //  7336: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  7339: aload           17
        //  7341: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  7344: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7347: iload           4
        //  7349: invokestatic    com/google/android/gms/internal/measurement/n1.f1:(Lcom/google/android/gms/internal/measurement/n1;I)V
        //  7352: goto            7368
        //  7355: astore_1       
        //  7356: goto            6662
        //  7359: astore_1       
        //  7360: goto            6662
        //  7363: aload           19
        //  7365: invokevirtual   K2/G.m:()V
        //  7368: aload           19
        //  7370: getfield        K2/G.a:LK2/n0;
        //  7373: astore          20
        //  7375: aload           20
        //  7377: getfield        K2/n0.L:LK2/k0;
        //  7380: astore          20
        //  7382: aload           20
        //  7384: invokestatic    K2/n0.f:(LK2/x0;)V
        //  7387: aload           20
        //  7389: invokevirtual   K2/k0.v:()V
        //  7392: aload           19
        //  7394: getfield        K2/G.g:J
        //  7397: lstore_2       
        //  7398: lload_2        
        //  7399: l2i            
        //  7400: istore          4
        //  7402: aload           17
        //  7404: iload           4
        //  7406: invokevirtual   com/google/android/gms/internal/measurement/m1.D:(I)V
        //  7409: aload           17
        //  7411: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  7414: astore          20
        //  7416: aload           20
        //  7418: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7421: invokevirtual   com/google/android/gms/internal/measurement/n1.S1:()J
        //  7424: lstore_2       
        //  7425: aload           19
        //  7427: lload_2        
        //  7428: invokevirtual   K2/G.R:(J)V
        //  7431: aload           17
        //  7433: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  7436: astore          20
        //  7438: aload           20
        //  7440: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7443: invokevirtual   com/google/android/gms/internal/measurement/n1.J1:()J
        //  7446: lstore_2       
        //  7447: aload           19
        //  7449: lload_2        
        //  7450: invokevirtual   K2/G.P:(J)V
        //  7453: aload           19
        //  7455: invokevirtual   K2/G.e:()Ljava/lang/String;
        //  7458: astore          20
        //  7460: aload           20
        //  7462: ifnull          7475
        //  7465: aload           17
        //  7467: aload           20
        //  7469: invokevirtual   com/google/android/gms/internal/measurement/m1.P:(Ljava/lang/String;)V
        //  7472: goto            7480
        //  7475: aload           17
        //  7477: invokevirtual   com/google/android/gms/internal/measurement/m1.N:()V
        //  7480: aload_0        
        //  7481: invokevirtual   K2/y1.W:()LK2/h;
        //  7484: aload           19
        //  7486: iconst_0       
        //  7487: invokevirtual   K2/h.Q:(LK2/G;Z)V
        //  7490: goto            7513
        //  7493: astore_1       
        //  7494: goto            6662
        //  7497: astore_1       
        //  7498: goto            6662
        //  7501: astore_1       
        //  7502: goto            6662
        //  7505: astore_1       
        //  7506: goto            6662
        //  7509: astore_1       
        //  7510: goto            6662
        //  7513: aload           17
        //  7515: invokevirtual   com/google/android/gms/internal/measurement/m1.t:()I
        //  7518: ifle            7674
        //  7521: aload_0        
        //  7522: invokevirtual   K2/y1.a0:()LK2/h0;
        //  7525: aload           16
        //  7527: getfield        K2/d0.b:Ljava/lang/Object;
        //  7530: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7533: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  7536: invokevirtual   K2/h0.M:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/N0;
        //  7539: astore          19
        //  7541: aload           19
        //  7543: ifnull          7587
        //  7546: aload           19
        //  7548: invokevirtual   com/google/android/gms/internal/measurement/N0.H:()Z
        //  7551: ifne            7557
        //  7554: goto            7587
        //  7557: aload           19
        //  7559: invokevirtual   com/google/android/gms/internal/measurement/N0.t:()J
        //  7562: lstore_2       
        //  7563: aload           17
        //  7565: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  7568: aload           17
        //  7570: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  7573: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7576: lload_2        
        //  7577: invokestatic    com/google/android/gms/internal/measurement/n1.g0:(Lcom/google/android/gms/internal/measurement/n1;J)V
        //  7580: goto            7657
        //  7583: astore_1       
        //  7584: goto            6662
        //  7587: aload           16
        //  7589: getfield        K2/d0.b:Ljava/lang/Object;
        //  7592: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7595: invokevirtual   com/google/android/gms/internal/measurement/n1.L:()Ljava/lang/String;
        //  7598: invokevirtual   java/lang/String.isEmpty:()Z
        //  7601: ifeq            7630
        //  7604: aload           17
        //  7606: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  7609: aload           17
        //  7611: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  7614: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7617: ldc2_w          -1
        //  7620: invokestatic    com/google/android/gms/internal/measurement/n1.g0:(Lcom/google/android/gms/internal/measurement/n1;J)V
        //  7623: goto            7657
        //  7626: astore_1       
        //  7627: goto            6662
        //  7630: aload_0        
        //  7631: invokevirtual   K2/y1.j:()LK2/P;
        //  7634: invokevirtual   K2/P.I:()LK2/S;
        //  7637: ldc_w           "Did not find measurement config or missing version info. appId"
        //  7640: aload           16
        //  7642: getfield        K2/d0.b:Ljava/lang/Object;
        //  7645: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7648: invokevirtual   com/google/android/gms/internal/measurement/n1.d2:()Ljava/lang/String;
        //  7651: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  7654: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  7657: aload_0        
        //  7658: invokevirtual   K2/y1.W:()LK2/h;
        //  7661: aload           17
        //  7663: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  7666: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  7669: iload           14
        //  7671: invokevirtual   K2/h.T:(Lcom/google/android/gms/internal/measurement/n1;Z)V
        //  7674: aload_0        
        //  7675: invokevirtual   K2/y1.W:()LK2/h;
        //  7678: astore          17
        //  7680: aload           16
        //  7682: getfield        K2/d0.c:Ljava/io/Serializable;
        //  7685: checkcast       Ljava/util/ArrayList;
        //  7688: astore          16
        //  7690: aload           16
        //  7692: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //  7695: aload           17
        //  7697: invokevirtual   C/u.v:()V
        //  7700: aload           17
        //  7702: invokevirtual   K2/u1.z:()V
        //  7705: new             Ljava/lang/StringBuilder;
        //  7708: astore          19
        //  7710: aload           19
        //  7712: ldc_w           "rowid in ("
        //  7715: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  7718: iconst_0       
        //  7719: istore          4
        //  7721: iload           4
        //  7723: aload           16
        //  7725: invokevirtual   java/util/ArrayList.size:()I
        //  7728: if_icmpge       7771
        //  7731: iload           4
        //  7733: ifeq            7746
        //  7736: aload           19
        //  7738: aload_1        
        //  7739: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  7742: pop            
        //  7743: goto            7746
        //  7746: aload           19
        //  7748: aload           16
        //  7750: iload           4
        //  7752: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  7755: checkcast       Ljava/lang/Long;
        //  7758: invokevirtual   java/lang/Long.longValue:()J
        //  7761: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  7764: pop            
        //  7765: iinc            4, 1
        //  7768: goto            7721
        //  7771: aload           19
        //  7773: ldc_w           ")"
        //  7776: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  7779: pop            
        //  7780: aload           17
        //  7782: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //  7785: ldc_w           "raw_events"
        //  7788: aload           19
        //  7790: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  7793: aconst_null    
        //  7794: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //  7797: istore          4
        //  7799: iload           4
        //  7801: aload           16
        //  7803: invokevirtual   java/util/ArrayList.size:()I
        //  7806: if_icmpeq       7836
        //  7809: aload           17
        //  7811: invokevirtual   C/u.j:()LK2/P;
        //  7814: invokevirtual   K2/P.G:()LK2/S;
        //  7817: iload           4
        //  7819: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  7822: aload           16
        //  7824: invokevirtual   java/util/ArrayList.size:()I
        //  7827: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  7830: ldc_w           "Deleted fewer rows from raw events table than expected"
        //  7833: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  7836: aload_0        
        //  7837: invokevirtual   K2/y1.W:()LK2/h;
        //  7840: astore_1       
        //  7841: aload_1        
        //  7842: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //  7845: astore          16
        //  7847: aload           16
        //  7849: ldc_w           "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
        //  7852: iconst_2       
        //  7853: anewarray       Ljava/lang/String;
        //  7856: dup            
        //  7857: iconst_0       
        //  7858: aload           18
        //  7860: aastore        
        //  7861: dup            
        //  7862: iconst_1       
        //  7863: aload           18
        //  7865: aastore        
        //  7866: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  7869: goto            7894
        //  7872: astore          16
        //  7874: aload_1        
        //  7875: invokevirtual   C/u.j:()LK2/P;
        //  7878: invokevirtual   K2/P.G:()LK2/S;
        //  7881: aload           18
        //  7883: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  7886: aload           16
        //  7888: ldc_w           "Failed to remove unused event metadata. appId"
        //  7891: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  7894: aload_0        
        //  7895: invokevirtual   K2/y1.W:()LK2/h;
        //  7898: invokevirtual   K2/h.J0:()V
        //  7901: aload_0        
        //  7902: invokevirtual   K2/y1.W:()LK2/h;
        //  7905: invokevirtual   K2/h.H0:()V
        //  7908: iconst_1       
        //  7909: ireturn        
        //  7910: astore_1       
        //  7911: goto            6662
        //  7914: astore_1       
        //  7915: goto            6662
        //  7918: astore_1       
        //  7919: goto            6662
        //  7922: astore_1       
        //  7923: goto            6662
        //  7926: astore_1       
        //  7927: goto            6662
        //  7930: astore_1       
        //  7931: goto            6662
        //  7934: astore_1       
        //  7935: goto            6662
        //  7938: astore_1       
        //  7939: goto            6662
        //  7942: aload_0        
        //  7943: invokevirtual   K2/y1.W:()LK2/h;
        //  7946: invokevirtual   K2/h.J0:()V
        //  7949: aload_0        
        //  7950: invokevirtual   K2/y1.W:()LK2/h;
        //  7953: invokevirtual   K2/h.H0:()V
        //  7956: iconst_0       
        //  7957: ireturn        
        //  7958: aload           16
        //  7960: ifnull          7970
        //  7963: aload           16
        //  7965: invokeinterface android/database/Cursor.close:()V
        //  7970: aload_1        
        //  7971: athrow         
        //  7972: aload_0        
        //  7973: invokevirtual   K2/y1.W:()LK2/h;
        //  7976: invokevirtual   K2/h.H0:()V
        //  7979: aload_1        
        //  7980: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  17     50     225    229    Any
        //  50     63     1127   1132   Landroid/database/sqlite/SQLiteException;
        //  50     63     110    117    Any
        //  86     107    117    122    Landroid/database/sqlite/SQLiteException;
        //  86     107    110    117    Any
        //  130    143    117    122    Landroid/database/sqlite/SQLiteException;
        //  130    143    110    117    Any
        //  153    197    117    122    Landroid/database/sqlite/SQLiteException;
        //  153    197    110    117    Any
        //  201    210    309    320    Landroid/database/sqlite/SQLiteException;
        //  201    210    289    293    Any
        //  215    222    225    229    Any
        //  233    243    309    320    Landroid/database/sqlite/SQLiteException;
        //  233    243    289    293    Any
        //  255    264    293    302    Landroid/database/sqlite/SQLiteException;
        //  255    264    289    293    Any
        //  276    283    293    302    Landroid/database/sqlite/SQLiteException;
        //  276    283    289    293    Any
        //  333    351    354    356    Landroid/database/sqlite/SQLiteException;
        //  333    351    110    117    Any
        //  362    372    1118   1120   Landroid/database/sqlite/SQLiteException;
        //  362    372    110    117    Any
        //  382    426    1118   1120   Landroid/database/sqlite/SQLiteException;
        //  382    426    110    117    Any
        //  430    439    1107   1118   Landroid/database/sqlite/SQLiteException;
        //  430    439    289    293    Any
        //  444    451    225    229    Any
        //  458    468    1107   1118   Landroid/database/sqlite/SQLiteException;
        //  458    468    289    293    Any
        //  472    479    1107   1118   Landroid/database/sqlite/SQLiteException;
        //  472    479    289    293    Any
        //  490    534    690    698    Landroid/database/sqlite/SQLiteException;
        //  490    534    289    293    Any
        //  540    548    690    698    Landroid/database/sqlite/SQLiteException;
        //  540    548    289    293    Any
        //  563    582    293    302    Landroid/database/sqlite/SQLiteException;
        //  563    582    289    293    Any
        //  582    588    225    229    Any
        //  597    606    690    698    Landroid/database/sqlite/SQLiteException;
        //  597    606    289    293    Any
        //  612    631    1072   1107   Ljava/io/IOException;
        //  612    631    690    698    Landroid/database/sqlite/SQLiteException;
        //  612    631    289    293    Any
        //  637    646    690    698    Landroid/database/sqlite/SQLiteException;
        //  637    646    289    293    Any
        //  652    662    690    698    Landroid/database/sqlite/SQLiteException;
        //  652    662    289    293    Any
        //  665    678    681    683    Landroid/database/sqlite/SQLiteException;
        //  665    678    289    293    Any
        //  701    707    681    683    Landroid/database/sqlite/SQLiteException;
        //  701    707    289    293    Any
        //  710    717    681    683    Landroid/database/sqlite/SQLiteException;
        //  710    717    289    293    Any
        //  734    758    681    683    Landroid/database/sqlite/SQLiteException;
        //  734    758    289    293    Any
        //  769    785    681    683    Landroid/database/sqlite/SQLiteException;
        //  769    785    289    293    Any
        //  791    839    681    683    Landroid/database/sqlite/SQLiteException;
        //  791    839    289    293    Any
        //  839    868    886    887    Landroid/database/sqlite/SQLiteException;
        //  839    868    878    879    Any
        //  868    875    225    229    Any
        //  900    919    886    887    Landroid/database/sqlite/SQLiteException;
        //  900    919    878    879    Any
        //  919    930    1027   1048   Ljava/io/IOException;
        //  919    930    886    887    Landroid/database/sqlite/SQLiteException;
        //  919    930    878    879    Any
        //  930    940    886    887    Landroid/database/sqlite/SQLiteException;
        //  930    940    878    879    Any
        //  940    956    1023   1027   Landroid/database/sqlite/SQLiteException;
        //  940    956    1019   1023   Any
        //  956    965    886    887    Landroid/database/sqlite/SQLiteException;
        //  956    965    878    879    Any
        //  965    980    1015   1019   Landroid/database/sqlite/SQLiteException;
        //  965    980    1011   1015   Any
        //  980    996    886    887    Landroid/database/sqlite/SQLiteException;
        //  980    996    878    879    Any
        //  1001   1008   225    229    Any
        //  1028   1048   886    887    Landroid/database/sqlite/SQLiteException;
        //  1028   1048   878    879    Any
        //  1048   1057   886    887    Landroid/database/sqlite/SQLiteException;
        //  1048   1057   878    879    Any
        //  1062   1069   225    229    Any
        //  1077   1098   681    683    Landroid/database/sqlite/SQLiteException;
        //  1077   1098   289    293    Any
        //  1098   1104   225    229    Any
        //  1135   1156   289    293    Any
        //  1160   1166   225    229    Any
        //  1171   1180   225    229    Any
        //  1184   1191   225    229    Any
        //  1194   1213   225    229    Any
        //  1213   1223   7938   7942   Any
        //  1244   1257   225    229    Any
        //  1279   1328   225    229    Any
        //  1339   1437   225    229    Any
        //  1440   1488   225    229    Any
        //  1521   1585   225    229    Any
        //  1588   1671   225    229    Any
        //  1677   1702   225    229    Any
        //  1707   1735   225    229    Any
        //  1738   1749   225    229    Any
        //  1781   1794   225    229    Any
        //  1801   1871   225    229    Any
        //  1881   1951   225    229    Any
        //  1978   2030   225    229    Any
        //  2035   2087   225    229    Any
        //  2087   2166   225    229    Any
        //  2172   2183   225    229    Any
        //  2188   2270   225    229    Any
        //  2282   2331   225    229    Any
        //  2346   2360   225    229    Any
        //  2395   2413   225    229    Any
        //  2421   2480   225    229    Any
        //  2483   2510   225    229    Any
        //  2522   2535   225    229    Any
        //  2544   2550   225    229    Any
        //  2557   2578   225    229    Any
        //  2589   2610   225    229    Any
        //  2634   2713   225    229    Any
        //  2725   2746   225    229    Any
        //  2752   2777   225    229    Any
        //  2777   2826   225    229    Any
        //  2829   2839   225    229    Any
        //  2842   2876   225    229    Any
        //  2881   2932   225    229    Any
        //  2977   3013   225    229    Any
        //  3018   3069   225    229    Any
        //  3113   3142   225    229    Any
        //  3153   3236   225    229    Any
        //  3239   3292   225    229    Any
        //  3292   3335   225    229    Any
        //  3351   3360   225    229    Any
        //  3371   3414   225    229    Any
        //  3435   3479   225    229    Any
        //  3479   3520   225    229    Any
        //  3525   3546   225    229    Any
        //  3549   3556   225    229    Any
        //  3581   3589   225    229    Any
        //  3592   3601   225    229    Any
        //  3614   3636   225    229    Any
        //  3639   3646   225    229    Any
        //  3711   3761   225    229    Any
        //  3779   3794   225    229    Any
        //  3810   3828   225    229    Any
        //  3861   3880   225    229    Any
        //  3907   3926   225    229    Any
        //  3926   3935   225    229    Any
        //  3940   3976   225    229    Any
        //  3976   3994   225    229    Any
        //  3997   4006   225    229    Any
        //  4011   4054   225    229    Any
        //  4054   4089   225    229    Any
        //  4094   4112   225    229    Any
        //  4115   4122   225    229    Any
        //  4122   4173   225    229    Any
        //  4178   4196   225    229    Any
        //  4199   4206   225    229    Any
        //  4206   4210   225    229    Any
        //  4210   4223   7934   7938   Any
        //  4223   4227   225    229    Any
        //  4227   4240   7930   7934   Any
        //  4243   4306   225    229    Any
        //  4306   4346   225    229    Any
        //  4352   4376   225    229    Any
        //  4386   4496   225    229    Any
        //  4499   4533   225    229    Any
        //  4533   4585   225    229    Any
        //  4589   4625   225    229    Any
        //  4629   4655   225    229    Any
        //  4665   4727   225    229    Any
        //  4744   4781   225    229    Any
        //  4788   4829   225    229    Any
        //  4829   4918   225    229    Any
        //  4929   4997   225    229    Any
        //  5000   5066   225    229    Any
        //  5072   5129   225    229    Any
        //  5134   5200   225    229    Any
        //  5203   5269   225    229    Any
        //  5275   5332   225    229    Any
        //  5337   5403   225    229    Any
        //  5406   5420   225    229    Any
        //  5429   5547   225    229    Any
        //  5550   5554   225    229    Any
        //  5554   5564   7926   7930   Any
        //  5564   5593   225    229    Any
        //  5593   5606   7922   7926   Any
        //  5606   5612   225    229    Any
        //  5612   5622   7918   7922   Any
        //  5622   5628   225    229    Any
        //  5628   5637   7914   7918   Any
        //  5637   5663   225    229    Any
        //  5663   5675   7910   7914   Any
        //  5675   5725   225    229    Any
        //  5740   5746   225    229    Any
        //  5753   5759   225    229    Any
        //  5759   5771   6933   6937   Any
        //  5771   5794   225    229    Any
        //  5799   5835   225    229    Any
        //  5844   5882   225    229    Any
        //  5891   5901   225    229    Any
        //  5910   5925   225    229    Any
        //  5930   5958   225    229    Any
        //  5958   5965   225    229    Any
        //  5970   5995   225    229    Any
        //  5995   6009   225    229    Any
        //  6009   6017   225    229    Any
        //  6023   6054   225    229    Any
        //  6060   6101   225    229    Any
        //  6101   6155   225    229    Any
        //  6167   6192   225    229    Any
        //  6197   6242   225    229    Any
        //  6245   6260   225    229    Any
        //  6265   6293   225    229    Any
        //  6302   6370   225    229    Any
        //  6373   6397   225    229    Any
        //  6420   6434   225    229    Any
        //  6439   6463   225    229    Any
        //  6463   6486   225    229    Any
        //  6486   6494   225    229    Any
        //  6497   6512   225    229    Any
        //  6516   6542   225    229    Any
        //  6551   6564   225    229    Any
        //  6564   6577   225    229    Any
        //  6577   6645   6661   6662   Any
        //  6645   6655   225    229    Any
        //  6665   6672   225    229    Any
        //  6677   6683   225    229    Any
        //  6686   6703   225    229    Any
        //  6710   6732   225    229    Any
        //  6736   6762   225    229    Any
        //  6771   6786   225    229    Any
        //  6786   6799   225    229    Any
        //  6799   6867   6883   6887   Any
        //  6867   6877   225    229    Any
        //  6892   6912   225    229    Any
        //  6918   6927   225    229    Any
        //  6937   6953   225    229    Any
        //  6953   6963   6986   6990   Any
        //  6963   6967   225    229    Any
        //  6967   6979   6982   6986   Any
        //  6990   7002   225    229    Any
        //  7002   7044   225    229    Any
        //  7075   7099   225    229    Any
        //  7104   7131   225    229    Any
        //  7134   7149   225    229    Any
        //  7149   7173   7509   7513   Any
        //  7180   7187   225    229    Any
        //  7190   7195   225    229    Any
        //  7195   7202   225    229    Any
        //  7202   7225   7505   7509   Any
        //  7243   7249   225    229    Any
        //  7252   7257   225    229    Any
        //  7257   7307   225    229    Any
        //  7307   7330   7359   7363   Any
        //  7334   7339   225    229    Any
        //  7339   7352   7355   7359   Any
        //  7363   7368   225    229    Any
        //  7368   7375   225    229    Any
        //  7375   7398   7501   7505   Any
        //  7402   7416   225    229    Any
        //  7416   7425   7497   7501   Any
        //  7425   7438   225    229    Any
        //  7438   7447   7493   7497   Any
        //  7447   7460   225    229    Any
        //  7465   7472   225    229    Any
        //  7475   7480   225    229    Any
        //  7480   7490   225    229    Any
        //  7513   7541   225    229    Any
        //  7546   7554   225    229    Any
        //  7557   7568   225    229    Any
        //  7568   7580   7583   7587   Any
        //  7587   7609   225    229    Any
        //  7609   7623   7626   7630   Any
        //  7630   7657   225    229    Any
        //  7657   7674   225    229    Any
        //  7674   7718   225    229    Any
        //  7721   7731   225    229    Any
        //  7736   7743   225    229    Any
        //  7746   7765   225    229    Any
        //  7771   7836   225    229    Any
        //  7836   7847   225    229    Any
        //  7847   7869   7872   7894   Landroid/database/sqlite/SQLiteException;
        //  7847   7869   225    229    Any
        //  7874   7894   225    229    Any
        //  7894   7901   225    229    Any
        //  7942   7949   225    229    Any
        //  7963   7970   225    229    Any
        //  7970   7972   225    229    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0122:
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
    
    public final void E(final ArrayList list) {
        A.b(list.isEmpty() ^ true);
        if (this.a0 != null) {
            this.j().H.f("Set uploading progress before finishing the previous upload");
            return;
        }
        this.a0 = new ArrayList((Collection)list);
    }
    
    public final void F() {
        this.l().v();
        if (this.V || this.W || this.X) {
            this.j().P.h("Not stopping services. fetch, network, upload", this.V, this.W, this.X);
            return;
        }
        this.j().P.f("Stopping uploading service(s)");
        final ArrayList r = this.R;
        if (r == null) {
            return;
        }
        final Iterator iterator = r.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        final ArrayList r2 = this.R;
        A.h((Object)r2);
        ((List)r2).clear();
    }
    
    public final void G() {
        this.l().v();
        final HashSet s = this.S;
        for (final String package1 : s) {
            b4.a();
            if (this.T().G(package1, w.G0)) {
                this.j().O.g("Notifying app that trigger URIs are available. App ID", package1);
                final Intent intent = new Intent();
                intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent.setPackage(package1);
                this.N.C.sendBroadcast(intent);
            }
        }
        s.clear();
    }
    
    public final void H() {
        this.l().v();
        this.f0();
        if (this.Q > 0L) {
            this.d().getClass();
            final long n = 3600000L - Math.abs(SystemClock.elapsedRealtime() - this.Q);
            if (n > 0L) {
                this.j().P.g("Upload has been suspended. Will update scheduling later in approximately ms", n);
                this.i0().b();
                final t1 g = this.G;
                r(g);
                g.C();
                return;
            }
            this.Q = 0L;
        }
        if (!this.N.i() || !this.I()) {
            this.j().P.f("Nothing to upload or uploading impossible");
            this.i0().b();
            final t1 g2 = this.G;
            r(g2);
            g2.C();
            return;
        }
        this.d().getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        this.T();
        final long max = Math.max(0L, (long)w.B.a(null));
        final h e = this.E;
        r(e);
        boolean b = false;
        Label_0213: {
            if (e.l0("select count(1) > 0 from raw_events where realtime = 1", null) == 0L) {
                final h e2 = this.E;
                r(e2);
                if (e2.l0("select count(1) > 0 from queue where has_realtime = 1", null) == 0L) {
                    b = false;
                    break Label_0213;
                }
            }
            b = true;
        }
        long n2;
        if (b) {
            final String x = this.T().x("debug.firebase.analytics.app");
            if (!TextUtils.isEmpty((CharSequence)x) && !".none.".equals((Object)x)) {
                this.T();
                n2 = Math.max(0L, (long)w.w.a(null));
            }
            else {
                this.T();
                n2 = Math.max(0L, (long)w.v.a(null));
            }
        }
        else {
            this.T();
            n2 = Math.max(0L, (long)w.u.a(null));
        }
        final long a = this.K.J.a();
        final long a2 = this.K.K.a();
        final h e3 = this.E;
        r(e3);
        final long h = e3.H("select max(bundle_end_timestamp) from queue", null, 0L);
        final h e4 = this.E;
        r(e4);
        final long max2 = Math.max(h, e4.H("select max(timestamp) from raw_events", null, 0L));
        final T i = this.I;
        long n7 = 0L;
        Label_0626: {
            Label_0411: {
                if (max2 != 0L) {
                    final long n3 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    final long abs = Math.abs(a - currentTimeMillis);
                    final long n4 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                    final long max3 = Math.max(currentTimeMillis - abs, n4);
                    long n6;
                    final long n5 = n6 = n3 + max;
                    if (b) {
                        n6 = n5;
                        if (max3 > 0L) {
                            n6 = Math.min(n3, max3) + n2;
                        }
                    }
                    r(i);
                    if (!i.d0(max3, n2)) {
                        n6 = max3 + n2;
                    }
                    n7 = n6;
                    if (n4 == 0L) {
                        break Label_0626;
                    }
                    n7 = n6;
                    if (n4 >= n3) {
                        int n8 = 0;
                        while (true) {
                            this.T();
                            if (n8 >= Math.min(20, Math.max(0, (int)w.D.a(null)))) {
                                break Label_0411;
                            }
                            this.T();
                            n7 = n6 + Math.max(0L, (long)w.C.a(null)) * (1L << n8);
                            if (n7 > n4) {
                                break;
                            }
                            ++n8;
                            n6 = n7;
                        }
                    }
                    break Label_0626;
                }
            }
            n7 = 0L;
        }
        if (n7 == 0L) {
            this.j().P.f("Next upload time is 0");
            this.i0().b();
            final t1 g3 = this.G;
            r(g3);
            g3.C();
            return;
        }
        final T d = this.D;
        r(d);
        if (!d.m0()) {
            this.j().P.f("No network");
            final X i2 = this.i0();
            final y1 y1 = (y1)i2.d;
            y1.f0();
            y1.l().v();
            if (!i2.b) {
                y1.N.C.registerReceiver((BroadcastReceiver)i2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                final T d2 = y1.D;
                r(d2);
                i2.c = d2.m0();
                y1.j().P.g("Registering connectivity change receiver. Network connected", i2.c);
                i2.b = true;
            }
            final t1 g4 = this.G;
            r(g4);
            g4.C();
            return;
        }
        final long a3 = this.K.I.a();
        this.T();
        final long max4 = Math.max(0L, (long)w.t.a(null));
        r(i);
        long max5 = n7;
        if (!i.d0(a3, max4)) {
            max5 = Math.max(n7, a3 + max4);
        }
        this.i0().b();
        this.d().getClass();
        long max6;
        if ((max6 = max5 - System.currentTimeMillis()) <= 0L) {
            this.T();
            max6 = Math.max(0L, (long)w.x.a(null));
            final b0 j = this.K.J;
            this.d().getClass();
            j.b(System.currentTimeMillis());
        }
        this.j().P.g("Upload scheduled in approximately ms", max6);
        final t1 g5 = this.G;
        r(g5);
        g5.z();
        final n0 n9 = (n0)g5.C;
        final Context c = n9.C;
        if (!J1.c0(c)) {
            g5.j().O.f("Receiver not registered/enabled");
        }
        if (!J1.u0(c)) {
            g5.j().O.f("Service not registered/enabled");
        }
        g5.C();
        g5.j().P.g("Scheduling upload, millis", max6);
        n9.P.getClass();
        SystemClock.elapsedRealtime();
        if (max6 < Math.max(0L, (long)w.y.a(null))) {
            if (g5.E().c == 0L) {
                g5.E().b(max6);
            }
        }
        final Context c2 = n9.C;
        final ComponentName componentName = new ComponentName(c2, "com.google.android.gms.measurement.AppMeasurementJobService");
        final int d3 = g5.D();
        final PersistableBundle extras = new PersistableBundle();
        ((BaseBundle)extras).putString("action", "com.google.android.gms.measurement.UPLOAD");
        final JobInfo build = new JobInfo$Builder(d3, componentName).setMinimumLatency(max6).setOverrideDeadline(max6 << 1).setExtras(extras).build();
        final Method b2 = com.google.android.gms.internal.measurement.M.b;
        final JobScheduler jobScheduler = (JobScheduler)c2.getSystemService("jobscheduler");
        jobScheduler.getClass();
        final Method b3 = com.google.android.gms.internal.measurement.M.b;
        if (b3 != null && c2.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
            final M m = new M(jobScheduler);
            Object c3 = com.google.android.gms.internal.measurement.M.c;
            int intValue = 0;
            Label_1380: {
                Label_1349: {
                    if (c3 != null) {
                        Label_1354: {
                            try {
                                c3 = ((Method)c3).invoke((Object)UserHandle.class, (Object[])null);
                                if (c3 != null) {
                                    intValue = (int)c3;
                                    break Label_1380;
                                }
                            }
                            catch (final InvocationTargetException c3) {
                                break Label_1354;
                            }
                            catch (final IllegalAccessException c3) {
                                break Label_1354;
                            }
                            break Label_1349;
                        }
                        if (Log.isLoggable("JobSchedulerCompat", 6)) {
                            Log.e("JobSchedulerCompat", "myUserId invocation illegal", (Throwable)c3);
                        }
                    }
                }
                intValue = 0;
            }
            final JobScheduler a4 = m.a;
            try {
                c3 = b3.invoke((Object)a4, new Object[] { build, "com.google.android.gms", intValue, "UploadAlarm" });
                return;
            }
            catch (final InvocationTargetException c3) {}
            catch (final IllegalAccessException ex) {}
            Log.e("UploadAlarm", "error calling scheduleAsPackage", (Throwable)c3);
            a4.schedule(build);
        }
        else {
            jobScheduler.schedule(build);
        }
    }
    
    public final boolean I() {
        this.l().v();
        this.f0();
        final h e = this.E;
        r(e);
        if (e.l0("select count(1) > 0 from raw_events", null) == 0L) {
            final h e2 = this.E;
            r(e2);
            if (TextUtils.isEmpty((CharSequence)e2.E())) {
                return false;
            }
        }
        return true;
    }
    
    public final z0 J(final String s) {
        this.l().v();
        this.f0();
        final HashMap d0 = this.d0;
        z0 z0;
        if ((z0 = (z0)d0.get((Object)s)) == null) {
            final h e = this.E;
            r(e);
            if ((z0 = e.y0(s)) == null) {
                z0 = K2.z0.c;
            }
            this.l().v();
            this.f0();
            d0.put((Object)s, (Object)z0);
            final h e2 = this.E;
            r(e2);
            e2.n0(s, z0);
        }
        return z0;
    }
    
    public final void K(c c, final B1 b1) {
        A.e(c.C);
        A.h((Object)c.D);
        A.h((Object)c.E);
        A.e(c.E.D);
        this.l().v();
        this.f0();
        if (!b0(b1)) {
            return;
        }
        if (!b1.J) {
            this.e(b1);
            return;
        }
        c = new c(c);
        boolean b2 = false;
        c.G = false;
        Object o = this.E;
        r((u1)o);
        ((h)o).C0();
        Label_0732: {
            c s0;
            try {
                o = this.E;
                r((u1)o);
                final String c2 = c.C;
                A.h((Object)c2);
                s0 = ((h)o).s0(c2, c.E.D);
                o = this.N;
                if (s0 != null && !s0.D.equals((Object)c.D)) {
                    this.j().K.h("Updating a conditional user property with different origin. name, origin, origin (from DB)", ((n0)o).O.g(c.E.D), c.D, s0.D);
                }
            }
            finally {
                break Label_0732;
            }
            Label_0391: {
                if (s0 != null) {
                    final boolean g = s0.G;
                    if (g) {
                        c.D = s0.D;
                        c.F = s0.F;
                        c.J = s0.J;
                        c.H = s0.H;
                        c.K = s0.K;
                        c.G = g;
                        final G1 e = c.E;
                        c.E = new G1(s0.E.E, e.a(), e.D, s0.E.H);
                        break Label_0391;
                    }
                }
                if (TextUtils.isEmpty((CharSequence)c.H)) {
                    final G1 e2 = c.E;
                    c.E = new G1(c.F, e2.a(), e2.D, c.E.H);
                    b2 = true;
                    c.G = true;
                }
            }
            if (c.G) {
                final G1 e3 = c.E;
                final String c3 = c.C;
                A.h((Object)c3);
                final String d = c.D;
                final String d2 = e3.D;
                final long e4 = e3.E;
                final Object a = e3.a();
                A.h(a);
                final H1 h1 = new H1(c3, d, d2, e4, a);
                final Object e5 = h1.e;
                final String c4 = h1.c;
                final h e6 = this.E;
                r(e6);
                if (e6.f0(h1)) {
                    this.j().O.h("User property updated immediately", c.C, ((n0)o).O.g(c4), e5);
                }
                else {
                    this.j().H.h("(2)Too many active user properties, ignoring", K2.P.z(c.C), ((n0)o).O.g(c4), e5);
                }
                if (b2) {
                    final v k = c.K;
                    if (k != null) {
                        final B1 b3;
                        this.Q(new v(k, c.F), b3);
                    }
                }
            }
            final h e7 = this.E;
            r(e7);
            if (e7.d0(c)) {
                this.j().O.h("Conditional property added", c.C, ((n0)o).O.g(c.E.D), c.E.a());
            }
            else {
                this.j().H.h("Too many conditional properties, ignoring", K2.P.z(c.C), ((n0)o).O.g(c.E.D), c.E.a());
            }
            final h e8 = this.E;
            r(e8);
            e8.J0();
            final h e9 = this.E;
            r(e9);
            e9.H0();
            return;
        }
        final h e10 = this.E;
        r(e10);
        e10.H0();
    }
    
    public final void L(v v, final B1 b1) {
        A.e(b1.C);
        final U c = K2.U.c(v);
        final J1 d0 = this.d0();
        final h e = this.E;
        r(e);
        final String c2 = b1.C;
        e.v();
        e.z();
        v = null;
        final v v2 = null;
        Label_0408: {
            Label_0263: {
                Cursor cursor = null;
                Object o = null;
                Label_0229: {
                    try {
                        cursor = (Cursor)(v = (v)e.D().rawQuery("select parameters from default_event_params where app_id=?", new String[] { c2 }));
                        try {
                            try {
                                if (!cursor.moveToFirst()) {
                                    v = (v)cursor;
                                    e.j().P.f("Default event parameters not found");
                                    cursor.close();
                                    v = v2;
                                    break Label_0263;
                                }
                            }
                            finally {}
                        }
                        catch (final SQLiteException o) {
                            break Label_0229;
                        }
                        v = (v)cursor;
                        o = cursor.getBlob(0);
                        v = (v)cursor;
                        try {
                            o = ((f2)K2.T.L((f2)f1.B(), (byte[])o)).d();
                            v = (v)cursor;
                            e.w();
                            v = (v)cursor;
                            o = K2.T.G((List)((f1)o).D());
                            cursor.close();
                            v = (v)o;
                        }
                        catch (final IOException o) {
                            v = (v)cursor;
                            e.j().H.e(K2.P.z(c2), o, "Failed to retrieve default event parameters. appId");
                            cursor.close();
                            v = v2;
                        }
                        break Label_0263;
                    }
                    catch (final SQLiteException o) {
                        cursor = null;
                    }
                    finally {
                        break Label_0408;
                    }
                }
                e.j().H.g("Error selecting default event parameters", o);
                v = v2;
                if (cursor != null) {
                    cursor.close();
                    v = v2;
                }
            }
            d0.Q((Bundle)c.e, (Bundle)v);
            final J1 d2 = this.d0();
            final d t = this.T();
            t.getClass();
            d2.L(c, Math.max(Math.min(t.A(c2, w.K), 100), 25));
            v = c.b();
            if ("_cmp".equals((Object)v.C)) {
                final u d3 = v.D;
                if ("referrer API v2".equals((Object)((BaseBundle)d3.C).getString("_cis"))) {
                    final String string = ((BaseBundle)d3.C).getString("gclid");
                    if (!TextUtils.isEmpty((CharSequence)string)) {
                        this.s(new G1(v.F, string, "_lgclid", "auto"), b1);
                    }
                }
            }
            this.o(v, b1);
            return;
        }
        if (v != null) {
            ((Cursor)v).close();
        }
    }
    
    public final void M(final G g) {
        this.l().v();
        if (TextUtils.isEmpty((CharSequence)g.j()) && TextUtils.isEmpty((CharSequence)g.d())) {
            final String f = g.f();
            A.h((Object)f);
            this.O(f, 204, null, null, null);
            return;
        }
        P3.a();
        final d t = this.T();
        final F e0 = w.E0;
        Object o = null;
        final Map map = null;
        final boolean g2 = t.G(null, e0);
        final T d = this.D;
        final h0 c = this.C;
        if (g2) {
            final String f2 = g.f();
            A.h((Object)f2);
            this.j().P.g("Fetching remote configuration", f2);
            r(c);
            final N0 m = c.M(f2);
            r(c);
            c.v();
            final String s = (String)((j)c.O).getOrDefault((Object)f2, (Object)null);
            Object o2 = map;
            if (m != null) {
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    o2 = new j();
                    ((j)o2).put((Object)"If-Modified-Since", (Object)s);
                }
                else {
                    o2 = null;
                }
                r(c);
                c.v();
                final String s2 = (String)((j)c.P).getOrDefault((Object)f2, (Object)null);
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    if (o2 == null) {
                        o2 = new j();
                    }
                    ((j)o2).put((Object)"If-None-Match", (Object)s2);
                }
            }
            this.V = true;
            r(d);
            final b b = new b(19);
            b.D = this;
            d.v();
            d.z();
            d.D.L.getClass();
            final String a = w1.A(g);
            try {
                d.l().C((Runnable)new W(d, g.f(), new URI(a).toURL(), null, (Map)o2, (V)b));
                return;
            }
            catch (final IllegalArgumentException | MalformedURLException | URISyntaxException ex) {
                d.j().H.e(K2.P.z(g.f()), a, "Failed to parse config URL. Not fetching. appId");
                return;
            }
        }
        this.L.getClass();
        final String a2 = w1.A(g);
        try {
            final String f3 = g.f();
            A.h((Object)f3);
            final URL url = new URL(a2);
            this.j().P.g("Fetching remote configuration", f3);
            r(c);
            final N0 i = c.M(f3);
            r(c);
            c.v();
            final String s3 = (String)((j)c.O).getOrDefault((Object)f3, (Object)null);
            if (i != null) {
                if (!TextUtils.isEmpty((CharSequence)s3)) {
                    o = new j();
                    ((j)o).put((Object)"If-Modified-Since", (Object)s3);
                }
                else {
                    o = null;
                }
                r(c);
                c.v();
                final String s4 = (String)((j)c.P).getOrDefault((Object)f3, (Object)null);
                if (!TextUtils.isEmpty((CharSequence)s4)) {
                    if (o == null) {
                        o = new j();
                    }
                    ((j)o).put((Object)"If-None-Match", (Object)s4);
                }
            }
            this.V = true;
            r(d);
            final C2.f f4 = new C2.f((Object)this, 18);
            d.v();
            d.z();
            d.l().C((Runnable)new W(d, f3, url, null, (Map)o, (V)f4));
        }
        catch (final MalformedURLException ex2) {
            this.j().H.e(K2.P.z(g.f()), a2, "Failed to parse config URL. Not fetching. appId");
        }
    }
    
    public final void N(final G g, final m1 m1) {
        this.l().v();
        this.f0();
        final V0 y = W0.y();
        final n0 a = g.a;
        final k0 l = a.L;
        n0.f(l);
        l.v();
        final byte[] i = g.I;
        Object o = y;
        if (i != null) {
            try {
                o = K2.T.L((f2)y, i);
            }
            catch (final o2 o2) {
                this.j().K.g("Failed to parse locally stored ad campaign info. appId", K2.P.z(g.f()));
                o = y;
            }
        }
        for (final f1 f1 : m1.q()) {
            if (f1.C().equals((Object)"_cmp")) {
                final Serializable g2 = K2.T.g0(f1, "gclid");
                final String s = "";
                String s2;
                if ((s2 = (String)g2) == null) {
                    s2 = "";
                }
                final String s3 = s2;
                Object g3;
                if ((g3 = K2.T.g0(f1, "gbraid")) == null) {
                    g3 = "";
                }
                final String s4 = (String)g3;
                Object g4 = K2.T.g0(f1, "gad_source");
                if (g4 == null) {
                    g4 = s;
                }
                final String s5 = (String)g4;
                if (s3.isEmpty() && s4.isEmpty()) {
                    continue;
                }
                Object value = 0L;
                final Serializable g5 = K2.T.g0(f1, "click_timestamp");
                if (g5 != null) {
                    value = g5;
                }
                long n;
                if ((n = (long)value) <= 0L) {
                    n = f1.A();
                }
                if ("referrer API v2".equals((Object)K2.T.g0(f1, "_cis"))) {
                    if (n <= ((W0)((f2)o).D).s()) {
                        continue;
                    }
                    if (s3.isEmpty()) {
                        ((f2)o).f();
                        W0.F((W0)((f2)o).D);
                    }
                    else {
                        ((f2)o).f();
                        W0.G((W0)((f2)o).D, s3);
                    }
                    if (s4.isEmpty()) {
                        ((f2)o).f();
                        W0.C((W0)((f2)o).D);
                    }
                    else {
                        ((f2)o).f();
                        W0.D((W0)((f2)o).D, s4);
                    }
                    if (s5.isEmpty()) {
                        ((f2)o).f();
                        W0.z((W0)((f2)o).D);
                    }
                    else {
                        ((f2)o).f();
                        W0.A((W0)((f2)o).D, s5);
                    }
                    ((f2)o).f();
                    W0.u((W0)((f2)o).D, n);
                }
                else {
                    if (n <= ((W0)((f2)o).D).o()) {
                        continue;
                    }
                    if (s3.isEmpty()) {
                        ((f2)o).f();
                        W0.w((W0)((f2)o).D);
                    }
                    else {
                        ((f2)o).f();
                        W0.x((W0)((f2)o).D, s3);
                    }
                    if (s4.isEmpty()) {
                        ((f2)o).f();
                        W0.t((W0)((f2)o).D);
                    }
                    else {
                        ((f2)o).f();
                        W0.v((W0)((f2)o).D, s4);
                    }
                    if (s5.isEmpty()) {
                        ((f2)o).f();
                        W0.p((W0)((f2)o).D);
                    }
                    else {
                        ((f2)o).f();
                        W0.r((W0)((f2)o).D, s5);
                    }
                    ((f2)o).f();
                    W0.q((W0)((f2)o).D, n);
                }
            }
        }
        if (!((g2)((f2)o).d()).equals((Object)W0.B())) {
            final W0 w0 = (W0)((f2)o).d();
            ((f2)m1).f();
            n1.v((n1)((f2)m1).D, w0);
        }
        final byte[] c = ((S1)((f2)o).d()).c();
        final k0 j = a.L;
        n0.f(j);
        j.v();
        g.Q |= (g.I != c);
        g.I = c;
        if (g.n()) {
            final h e = this.E;
            r(e);
            e.Q(g, false);
        }
    }
    
    public final void O(final String s, final int n, final IOException ex, final byte[] array, final Map map) {
        final T d = this.D;
        this.l().v();
        this.f0();
        A.e(s);
        byte[] array2 = array;
        Label_0042: {
            if (array == null) {
                Label_0762: {
                    try {
                        array2 = new byte[0];
                    }
                    finally {
                        break Label_0762;
                    }
                    break Label_0042;
                }
                this.V = false;
                this.F();
            }
        }
        this.j().P.g("onConfigFetched. Response size", array2.length);
        final h e = this.E;
        r(e);
        e.C0();
        Label_0747: {
            Label_0711: {
                G u0;
                boolean b;
                try {
                    final h e2 = this.E;
                    r(e2);
                    u0 = e2.u0(s);
                    b = ((n == 200 || n == 204 || n == 304) && ex == null);
                    if (u0 == null) {
                        this.j().K.g("App does not exist in onConfigFetched. appId", K2.P.z(s));
                        break Label_0711;
                    }
                }
                finally {
                    break Label_0747;
                }
                final h0 c = this.C;
                if (!b && n != 404) {
                    this.d().getClass();
                    u0.L(System.currentTimeMillis());
                    final h e3 = this.E;
                    r(e3);
                    e3.Q(u0, false);
                    final Throwable t;
                    this.j().P.e(n, t, "Fetching config failed. code, error");
                    r(c);
                    c.v();
                    ((j)c.O).put((Object)s, (Object)null);
                    final b0 k = this.K.K;
                    this.d().getClass();
                    k.b(System.currentTimeMillis());
                    if (n == 503 || n == 429) {
                        final b0 i = this.K.I;
                        this.d().getClass();
                        i.b(System.currentTimeMillis());
                    }
                    this.H();
                }
                else {
                    P3.a();
                    String m;
                    String j;
                    if (this.T().G(null, w.E0)) {
                        m = m("Last-Modified", map);
                        j = m("ETag", map);
                    }
                    else {
                        List list;
                        if (map != null) {
                            list = (List)map.get((Object)"Last-Modified");
                        }
                        else {
                            list = null;
                        }
                        if (list != null && !list.isEmpty()) {
                            m = (String)list.get(0);
                        }
                        else {
                            m = null;
                        }
                        List list2;
                        if (map != null) {
                            list2 = (List)map.get((Object)"ETag");
                        }
                        else {
                            list2 = null;
                        }
                        if (list2 != null && !list2.isEmpty()) {
                            j = (String)list2.get(0);
                        }
                        else {
                            j = null;
                        }
                    }
                    if (n != 404 && n != 304) {
                        r(c);
                        c.J(s, m, j, array2);
                    }
                    else {
                        r(c);
                        if (c.M(s) == null) {
                            r(c);
                            c.J(s, null, null, null);
                        }
                    }
                    this.d().getClass();
                    u0.w(System.currentTimeMillis());
                    final h e4 = this.E;
                    r(e4);
                    e4.Q(u0, false);
                    if (n == 404) {
                        this.j().M.g("Config not found. Using empty config. appId", s);
                    }
                    else {
                        this.j().P.e(n, array2.length, "Successfully fetched config. Got network response. code, size");
                    }
                    r(d);
                    if (d.m0() && this.I()) {
                        this.g0();
                    }
                    else {
                        if (this.T().G(null, w.A0)) {
                            r(d);
                            if (d.m0()) {
                                final h e5 = this.E;
                                r(e5);
                                if (e5.G0(u0.f())) {
                                    this.V(u0.f());
                                    break Label_0711;
                                }
                            }
                        }
                        this.H();
                    }
                }
            }
            final h e6 = this.E;
            r(e6);
            e6.J0();
            final h e7 = this.E;
            r(e7);
            e7.H0();
            this.V = false;
            this.F();
            return;
        }
        final h e8 = this.E;
        r(e8);
        e8.H0();
    }
    
    public final B1 P(final String s) {
        final h e = this.E;
        r(e);
        final G u0 = e.u0(s);
        if (u0 == null || TextUtils.isEmpty((CharSequence)u0.h())) {
            this.j().O.g("No app data available; dropping", s);
            return null;
        }
        final Boolean i = this.i(u0);
        if (i != null && !i) {
            this.j().H.g("App version does not match; dropping. appId", K2.P.z(s));
            return null;
        }
        final String j = u0.j();
        final String h = u0.h();
        final long y = u0.y();
        final n0 a = u0.a;
        final k0 l = a.L;
        n0.f(l);
        l.v();
        final String k = u0.l;
        final k0 m = a.L;
        n0.f(m);
        m.v();
        final long m2 = u0.m;
        final k0 l2 = a.L;
        n0.f(l2);
        l2.v();
        final long n = u0.n;
        final k0 l3 = a.L;
        n0.f(l3);
        l3.v();
        final boolean o = u0.o;
        final String i2 = u0.i();
        final k0 l4 = a.L;
        n0.f(l4);
        l4.v();
        final k0 l5 = a.L;
        n0.f(l5);
        l5.v();
        final boolean p = u0.p;
        final String d = u0.d();
        final Boolean u2 = u0.U();
        final long n2 = u0.N();
        final k0 l6 = a.L;
        n0.f(l6);
        l6.v();
        final ArrayList t = u0.t;
        final String m3 = this.J(s).m();
        final boolean o2 = u0.o();
        final k0 l7 = a.L;
        n0.f(l7);
        l7.v();
        final long w = u0.w;
        final z0 j2 = this.J(s);
        final String b = this.R(s).b;
        final k0 l8 = a.L;
        n0.f(l8);
        l8.v();
        final int y2 = u0.y;
        final k0 l9 = a.L;
        n0.f(l9);
        l9.v();
        return new B1(s, j, h, y, k, m2, n, null, o, false, i2, 0L, 0, p, false, d, u2, n2, (List)t, m3, "", null, o2, w, j2.b, b, y2, u0.C, u0.l(), u0.k());
    }
    
    public final void Q(final v p0, final B1 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //     4: aload_2        
        //     5: getfield        K2/B1.G:J
        //     8: lstore          13
        //    10: aload_2        
        //    11: getfield        K2/B1.Z:Ljava/lang/String;
        //    14: astore          21
        //    16: aload_2        
        //    17: getfield        K2/B1.E:Ljava/lang/String;
        //    20: astore          24
        //    22: aload_2        
        //    23: getfield        K2/B1.F:Ljava/lang/String;
        //    26: astore          25
        //    28: aload_2        
        //    29: getfield        K2/B1.C:Ljava/lang/String;
        //    32: astore          22
        //    34: aload           22
        //    36: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //    39: invokestatic    java/lang/System.nanoTime:()J
        //    42: lstore          11
        //    44: aload_0        
        //    45: invokevirtual   K2/y1.l:()LK2/k0;
        //    48: invokevirtual   K2/k0.v:()V
        //    51: aload_0        
        //    52: invokevirtual   K2/y1.f0:()V
        //    55: aload_0        
        //    56: invokevirtual   K2/y1.c0:()LK2/T;
        //    59: pop            
        //    60: aload_2        
        //    61: getfield        K2/B1.D:Ljava/lang/String;
        //    64: astore          26
        //    66: aload           26
        //    68: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    71: istore          17
        //    73: aload_2        
        //    74: getfield        K2/B1.S:Ljava/lang/String;
        //    77: astore          28
        //    79: iload           17
        //    81: ifeq            93
        //    84: aload           28
        //    86: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    89: ifeq            93
        //    92: return         
        //    93: aload_2        
        //    94: getfield        K2/B1.J:Z
        //    97: istore          18
        //    99: iload           18
        //   101: ifne            111
        //   104: aload_0        
        //   105: aload_2        
        //   106: invokevirtual   K2/y1.e:(LK2/B1;)LK2/G;
        //   109: pop            
        //   110: return         
        //   111: aload_0        
        //   112: invokevirtual   K2/y1.a0:()LK2/h0;
        //   115: astore          23
        //   117: aload_2        
        //   118: getfield        K2/B1.C:Ljava/lang/String;
        //   121: astore          29
        //   123: aload_1        
        //   124: getfield        K2/v.C:Ljava/lang/String;
        //   127: astore          20
        //   129: aload           23
        //   131: aload           29
        //   133: aload           20
        //   135: invokevirtual   K2/h0.P:(Ljava/lang/String;Ljava/lang/String;)Z
        //   138: istore          17
        //   140: iconst_1       
        //   141: istore          6
        //   143: aload_0        
        //   144: getfield        K2/y1.i0:Lb1/f;
        //   147: astore          27
        //   149: aload_0        
        //   150: getfield        K2/y1.N:LK2/n0;
        //   153: astore          23
        //   155: iload           17
        //   157: ifeq            414
        //   160: aload_0        
        //   161: invokevirtual   K2/y1.j:()LK2/P;
        //   164: invokevirtual   K2/P.I:()LK2/S;
        //   167: aload           29
        //   169: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   172: aload           23
        //   174: invokevirtual   K2/n0.q:()LK2/L;
        //   177: aload           20
        //   179: invokevirtual   K2/L.c:(Ljava/lang/String;)Ljava/lang/String;
        //   182: ldc_w           "Dropping blocked event. appId"
        //   185: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   188: iload           6
        //   190: istore          5
        //   192: ldc_w           "1"
        //   195: aload_0        
        //   196: invokevirtual   K2/y1.a0:()LK2/h0;
        //   199: aload           29
        //   201: ldc_w           "measurement.upload.blacklist_internal"
        //   204: invokevirtual   K2/h0.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   207: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   210: ifne            244
        //   213: ldc_w           "1"
        //   216: aload_0        
        //   217: invokevirtual   K2/y1.a0:()LK2/h0;
        //   220: aload           29
        //   222: ldc_w           "measurement.upload.blacklist_public"
        //   225: invokevirtual   K2/h0.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   228: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   231: ifeq            241
        //   234: iload           6
        //   236: istore          5
        //   238: goto            244
        //   241: iconst_0       
        //   242: istore          5
        //   244: iload           5
        //   246: ifne            282
        //   249: ldc_w           "_err"
        //   252: aload           20
        //   254: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   257: ifne            282
        //   260: aload_0        
        //   261: invokevirtual   K2/y1.d0:()LK2/J1;
        //   264: pop            
        //   265: aload           27
        //   267: aload           29
        //   269: bipush          11
        //   271: ldc_w           "_ev"
        //   274: aload_1        
        //   275: getfield        K2/v.C:Ljava/lang/String;
        //   278: iconst_0       
        //   279: invokestatic    K2/J1.N:(LK2/I1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //   282: iload           5
        //   284: ifeq            413
        //   287: aload_0        
        //   288: invokevirtual   K2/y1.W:()LK2/h;
        //   291: aload           29
        //   293: invokevirtual   K2/h.u0:(Ljava/lang/String;)LK2/G;
        //   296: astore_1       
        //   297: aload_1        
        //   298: ifnull          413
        //   301: aload_1        
        //   302: getfield        K2/G.a:LK2/n0;
        //   305: astore_2       
        //   306: aload_2        
        //   307: getfield        K2/n0.L:LK2/k0;
        //   310: astore          20
        //   312: aload           20
        //   314: invokestatic    K2/n0.f:(LK2/x0;)V
        //   317: aload           20
        //   319: invokevirtual   K2/k0.v:()V
        //   322: aload_1        
        //   323: getfield        K2/G.S:J
        //   326: lstore          7
        //   328: aload_2        
        //   329: getfield        K2/n0.L:LK2/k0;
        //   332: astore_2       
        //   333: aload_2        
        //   334: invokestatic    K2/n0.f:(LK2/x0;)V
        //   337: aload_2        
        //   338: invokevirtual   K2/k0.v:()V
        //   341: lload           7
        //   343: aload_1        
        //   344: getfield        K2/G.R:J
        //   347: invokestatic    java/lang/Math.max:(JJ)J
        //   350: lstore          7
        //   352: aload_0        
        //   353: invokevirtual   K2/y1.d:()Lq2/a;
        //   356: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   359: pop            
        //   360: invokestatic    java/lang/System.currentTimeMillis:()J
        //   363: lload           7
        //   365: lsub           
        //   366: invokestatic    java/lang/Math.abs:(J)J
        //   369: lstore          7
        //   371: aload_0        
        //   372: invokevirtual   K2/y1.T:()LK2/d;
        //   375: pop            
        //   376: lload           7
        //   378: getstatic       K2/w.A:LK2/F;
        //   381: aconst_null    
        //   382: invokevirtual   K2/F.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   385: checkcast       Ljava/lang/Long;
        //   388: invokevirtual   java/lang/Long.longValue:()J
        //   391: lcmp           
        //   392: ifle            413
        //   395: aload_0        
        //   396: invokevirtual   K2/y1.j:()LK2/P;
        //   399: invokevirtual   K2/P.F:()LK2/S;
        //   402: ldc_w           "Fetching config for blocked app"
        //   405: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   408: aload_0        
        //   409: aload_1        
        //   410: invokevirtual   K2/y1.M:(LK2/G;)V
        //   413: return         
        //   414: aload_1        
        //   415: invokestatic    K2/U.c:(LK2/v;)LK2/U;
        //   418: astore          20
        //   420: aload_0        
        //   421: invokevirtual   K2/y1.d0:()LK2/J1;
        //   424: astore_1       
        //   425: aload_0        
        //   426: invokevirtual   K2/y1.T:()LK2/d;
        //   429: astore          30
        //   431: aload           30
        //   433: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   436: pop            
        //   437: aload_1        
        //   438: aload           20
        //   440: aload           30
        //   442: aload           29
        //   444: getstatic       K2/w.K:LK2/F;
        //   447: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //   450: bipush          100
        //   452: invokestatic    java/lang/Math.min:(II)I
        //   455: bipush          25
        //   457: invokestatic    java/lang/Math.max:(II)I
        //   460: invokevirtual   K2/J1.L:(LK2/U;I)V
        //   463: aload_0        
        //   464: invokevirtual   K2/y1.T:()LK2/d;
        //   467: aload           29
        //   469: getstatic       K2/w.S:LK2/F;
        //   472: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //   475: bipush          35
        //   477: invokestatic    java/lang/Math.min:(II)I
        //   480: bipush          10
        //   482: invokestatic    java/lang/Math.max:(II)I
        //   485: istore          5
        //   487: aload           20
        //   489: getfield        K2/U.e:Ljava/lang/Object;
        //   492: checkcast       Landroid/os/Bundle;
        //   495: astore          30
        //   497: new             Ljava/util/TreeSet;
        //   500: dup            
        //   501: aload           30
        //   503: invokevirtual   android/os/BaseBundle.keySet:()Ljava/util/Set;
        //   506: invokespecial   java/util/TreeSet.<init>:(Ljava/util/Collection;)V
        //   509: invokevirtual   java/util/TreeSet.iterator:()Ljava/util/Iterator;
        //   512: astore_1       
        //   513: aload_1        
        //   514: invokeinterface java/util/Iterator.hasNext:()Z
        //   519: ifeq            563
        //   522: aload_1        
        //   523: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   528: checkcast       Ljava/lang/String;
        //   531: astore          31
        //   533: ldc_w           "items"
        //   536: aload           31
        //   538: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   541: ifeq            560
        //   544: aload_0        
        //   545: invokevirtual   K2/y1.d0:()LK2/J1;
        //   548: aload           30
        //   550: aload           31
        //   552: invokevirtual   android/os/Bundle.getParcelableArray:(Ljava/lang/String;)[Landroid/os/Parcelable;
        //   555: iload           5
        //   557: invokevirtual   K2/J1.a0:([Landroid/os/Parcelable;I)V
        //   560: goto            513
        //   563: aload           20
        //   565: invokevirtual   K2/U.b:()LK2/v;
        //   568: astore          20
        //   570: aload           20
        //   572: getfield        K2/v.E:Ljava/lang/String;
        //   575: astore          31
        //   577: aload           20
        //   579: getfield        K2/v.C:Ljava/lang/String;
        //   582: astore          30
        //   584: aload_0        
        //   585: invokevirtual   K2/y1.j:()LK2/P;
        //   588: iconst_2       
        //   589: invokevirtual   K2/P.D:(I)Z
        //   592: ifeq            621
        //   595: aload_0        
        //   596: invokevirtual   K2/y1.j:()LK2/P;
        //   599: invokevirtual   K2/P.H:()LK2/S;
        //   602: ldc_w           "Logging event"
        //   605: aload           23
        //   607: invokevirtual   K2/n0.q:()LK2/L;
        //   610: aload           20
        //   612: invokevirtual   K2/L.a:(LK2/v;)Ljava/lang/String;
        //   615: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   618: goto            621
        //   621: invokestatic    com/google/android/gms/internal/measurement/K3.a:()V
        //   624: aload_0        
        //   625: invokevirtual   K2/y1.T:()LK2/d;
        //   628: getstatic       K2/w.C0:LK2/F;
        //   631: invokevirtual   K2/d.y:(LK2/F;)Z
        //   634: pop            
        //   635: aload_0        
        //   636: invokevirtual   K2/y1.W:()LK2/h;
        //   639: invokevirtual   K2/h.C0:()V
        //   642: aload_0        
        //   643: aload_2        
        //   644: invokevirtual   K2/y1.e:(LK2/B1;)LK2/G;
        //   647: pop            
        //   648: ldc_w           "ecommerce_purchase"
        //   651: aload           30
        //   653: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   656: istore          17
        //   658: iload           17
        //   660: ifne            698
        //   663: ldc_w           "purchase"
        //   666: aload           30
        //   668: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   671: ifne            698
        //   674: ldc_w           "refund"
        //   677: aload           30
        //   679: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   682: ifeq            688
        //   685: goto            698
        //   688: iconst_0       
        //   689: istore          5
        //   691: goto            701
        //   694: astore_1       
        //   695: goto            4244
        //   698: iconst_1       
        //   699: istore          5
        //   701: ldc_w           "_iap"
        //   704: aload           30
        //   706: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   709: istore          17
        //   711: aload           20
        //   713: getfield        K2/v.D:LK2/u;
        //   716: astore          32
        //   718: iload           17
        //   720: ifne            734
        //   723: iload           5
        //   725: ifeq            731
        //   728: goto            734
        //   731: goto            1319
        //   734: aload           32
        //   736: invokevirtual   K2/u.p:()Ljava/lang/String;
        //   739: astore          33
        //   741: aload           32
        //   743: getfield        K2/u.C:Landroid/os/Bundle;
        //   746: astore_1       
        //   747: iload           5
        //   749: ifeq            876
        //   752: aload           32
        //   754: invokevirtual   K2/u.h:()Ljava/lang/Double;
        //   757: invokevirtual   java/lang/Double.doubleValue:()D
        //   760: ldc2_w          1000000.0
        //   763: dmul           
        //   764: dstore_3       
        //   765: dload_3        
        //   766: dconst_0       
        //   767: dcmpl          
        //   768: ifne            790
        //   771: aload_1        
        //   772: ldc_w           "value"
        //   775: invokevirtual   android/os/BaseBundle.getLong:(Ljava/lang/String;)J
        //   778: l2d            
        //   779: ldc2_w          1000000.0
        //   782: dmul           
        //   783: dstore_3       
        //   784: goto            790
        //   787: goto            695
        //   790: dload_3        
        //   791: ldc2_w          9.223372036854776E18
        //   794: dcmpg          
        //   795: ifgt            839
        //   798: dload_3        
        //   799: ldc2_w          -9.223372036854776E18
        //   802: dcmpl          
        //   803: iflt            839
        //   806: dload_3        
        //   807: invokestatic    java/lang/Math.round:(D)J
        //   810: lstore          9
        //   812: lload           9
        //   814: lstore          7
        //   816: ldc_w           "refund"
        //   819: aload           30
        //   821: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   824: ifeq            885
        //   827: lload           9
        //   829: lneg           
        //   830: lstore          7
        //   832: goto            885
        //   835: astore_1       
        //   836: goto            787
        //   839: aload_0        
        //   840: invokevirtual   K2/y1.j:()LK2/P;
        //   843: invokevirtual   K2/P.I:()LK2/S;
        //   846: aload           29
        //   848: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   851: dload_3        
        //   852: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   855: ldc_w           "Data lost. Currency value is too big. appId"
        //   858: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   861: aload_0        
        //   862: invokevirtual   K2/y1.W:()LK2/h;
        //   865: invokevirtual   K2/h.J0:()V
        //   868: aload_0        
        //   869: invokevirtual   K2/y1.W:()LK2/h;
        //   872: invokevirtual   K2/h.H0:()V
        //   875: return         
        //   876: aload_1        
        //   877: ldc_w           "value"
        //   880: invokevirtual   android/os/BaseBundle.getLong:(Ljava/lang/String;)J
        //   883: lstore          7
        //   885: aload           33
        //   887: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   890: ifne            1319
        //   893: aload           33
        //   895: getstatic       java/util/Locale.US:Ljava/util/Locale;
        //   898: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   901: astore_1       
        //   902: aload_1        
        //   903: ldc_w           "[A-Z]{3}"
        //   906: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //   909: ifeq            1319
        //   912: new             Ljava/lang/StringBuilder;
        //   915: astore          33
        //   917: aload           33
        //   919: ldc_w           "_ltv_"
        //   922: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   925: aload           33
        //   927: aload_1        
        //   928: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   931: pop            
        //   932: aload           33
        //   934: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   937: astore          33
        //   939: aload_0        
        //   940: invokevirtual   K2/y1.W:()LK2/h;
        //   943: aload           29
        //   945: aload           33
        //   947: invokevirtual   K2/h.v0:(Ljava/lang/String;Ljava/lang/String;)LK2/H1;
        //   950: astore_1       
        //   951: aload_1        
        //   952: ifnull          1038
        //   955: aload_1        
        //   956: getfield        K2/H1.e:Ljava/lang/Object;
        //   959: astore_1       
        //   960: aload_1        
        //   961: instanceof      Ljava/lang/Long;
        //   964: ifne            970
        //   967: goto            1038
        //   970: aload_1        
        //   971: checkcast       Ljava/lang/Long;
        //   974: invokevirtual   java/lang/Long.longValue:()J
        //   977: lstore          9
        //   979: aload           20
        //   981: getfield        K2/v.E:Ljava/lang/String;
        //   984: astore_1       
        //   985: aload_0        
        //   986: invokevirtual   K2/y1.d:()Lq2/a;
        //   989: astore          34
        //   991: aload           34
        //   993: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   996: pop            
        //   997: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1000: lstore          15
        //  1002: new             LK2/H1;
        //  1005: dup            
        //  1006: aload           29
        //  1008: aload_1        
        //  1009: aload           33
        //  1011: lload           15
        //  1013: lload           9
        //  1015: lload           7
        //  1017: ladd           
        //  1018: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1021: invokespecial   K2/H1.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
        //  1024: astore_1       
        //  1025: goto            1250
        //  1028: goto            1035
        //  1031: astore_1       
        //  1032: goto            1028
        //  1035: goto            4244
        //  1038: aload_0        
        //  1039: invokevirtual   K2/y1.W:()LK2/h;
        //  1042: astore          34
        //  1044: aload_0        
        //  1045: invokevirtual   K2/y1.T:()LK2/d;
        //  1048: aload           29
        //  1050: getstatic       K2/w.G:LK2/F;
        //  1053: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  1056: istore          5
        //  1058: aload           29
        //  1060: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //  1063: aload           34
        //  1065: invokevirtual   C/u.v:()V
        //  1068: aload           34
        //  1070: invokevirtual   K2/u1.z:()V
        //  1073: aload           34
        //  1075: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //  1078: astore          35
        //  1080: aload           34
        //  1082: invokevirtual   C/u.s:()LK2/d;
        //  1085: astore_1       
        //  1086: aload_1        
        //  1087: getstatic       K2/w.k1:LK2/F;
        //  1090: invokevirtual   K2/d.y:(LK2/F;)Z
        //  1093: ifeq            1107
        //  1096: ldc_w           "and name like '!_ltv!_%' escape '!'"
        //  1099: astore_1       
        //  1100: goto            1111
        //  1103: astore_1       
        //  1104: goto            1185
        //  1107: ldc_w           "and name like '_ltv_%' "
        //  1110: astore_1       
        //  1111: new             Ljava/lang/StringBuilder;
        //  1114: astore          36
        //  1116: aload           36
        //  1118: ldc_w           "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? "
        //  1121: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1124: aload           36
        //  1126: aload_1        
        //  1127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1130: pop            
        //  1131: aload           36
        //  1133: ldc_w           "order by set_timestamp desc limit ?,10);"
        //  1136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1139: pop            
        //  1140: aload           35
        //  1142: aload           36
        //  1144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1147: iconst_3       
        //  1148: anewarray       Ljava/lang/String;
        //  1151: dup            
        //  1152: iconst_0       
        //  1153: aload           29
        //  1155: aastore        
        //  1156: dup            
        //  1157: iconst_1       
        //  1158: aload           29
        //  1160: aastore        
        //  1161: dup            
        //  1162: iconst_2       
        //  1163: iload           5
        //  1165: iconst_1       
        //  1166: isub           
        //  1167: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1170: aastore        
        //  1171: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1174: goto            1205
        //  1177: astore_1       
        //  1178: goto            1104
        //  1181: astore_1       
        //  1182: goto            1104
        //  1185: aload           34
        //  1187: invokevirtual   C/u.j:()LK2/P;
        //  1190: invokevirtual   K2/P.G:()LK2/S;
        //  1193: aload           29
        //  1195: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1198: aload_1        
        //  1199: ldc_w           "Error pruning currencies. appId"
        //  1202: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1205: new             LK2/H1;
        //  1208: astore_1       
        //  1209: aload           20
        //  1211: getfield        K2/v.E:Ljava/lang/String;
        //  1214: astore          35
        //  1216: aload_0        
        //  1217: invokevirtual   K2/y1.d:()Lq2/a;
        //  1220: astore          34
        //  1222: aload           34
        //  1224: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1227: pop            
        //  1228: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1231: lstore          9
        //  1233: aload_1        
        //  1234: aload           29
        //  1236: aload           35
        //  1238: aload           33
        //  1240: lload           9
        //  1242: lload           7
        //  1244: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1247: invokespecial   K2/H1.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
        //  1250: aload_0        
        //  1251: invokevirtual   K2/y1.W:()LK2/h;
        //  1254: aload_1        
        //  1255: invokevirtual   K2/h.f0:(LK2/H1;)Z
        //  1258: ifne            1319
        //  1261: aload_0        
        //  1262: invokevirtual   K2/y1.j:()LK2/P;
        //  1265: invokevirtual   K2/P.G:()LK2/S;
        //  1268: ldc_w           "Too many unique user properties are set. Ignoring user property. appId"
        //  1271: aload           29
        //  1273: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1276: aload           23
        //  1278: invokevirtual   K2/n0.q:()LK2/L;
        //  1281: aload_1        
        //  1282: getfield        K2/H1.c:Ljava/lang/String;
        //  1285: invokevirtual   K2/L.g:(Ljava/lang/String;)Ljava/lang/String;
        //  1288: aload_1        
        //  1289: getfield        K2/H1.e:Ljava/lang/Object;
        //  1292: invokevirtual   K2/S.h:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1295: aload_0        
        //  1296: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1299: pop            
        //  1300: aload           27
        //  1302: aload           29
        //  1304: bipush          9
        //  1306: aconst_null    
        //  1307: aconst_null    
        //  1308: iconst_0       
        //  1309: invokestatic    K2/J1.N:(LK2/I1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //  1312: goto            1319
        //  1315: astore_1       
        //  1316: goto            1028
        //  1319: aload           30
        //  1321: invokestatic    K2/J1.B0:(Ljava/lang/String;)Z
        //  1324: istore          17
        //  1326: ldc_w           "_err"
        //  1329: aload           30
        //  1331: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1334: istore          19
        //  1336: aload_0        
        //  1337: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1340: pop            
        //  1341: aload           32
        //  1343: invokestatic    K2/J1.C:(LK2/u;)J
        //  1346: lstore          7
        //  1348: aload_0        
        //  1349: invokevirtual   K2/y1.W:()LK2/h;
        //  1352: aload_0        
        //  1353: invokevirtual   K2/y1.h0:()J
        //  1356: aload           29
        //  1358: lload           7
        //  1360: lconst_1       
        //  1361: ladd           
        //  1362: iconst_1       
        //  1363: iload           17
        //  1365: iconst_0       
        //  1366: iload           19
        //  1368: iconst_0       
        //  1369: iconst_0       
        //  1370: iconst_0       
        //  1371: invokevirtual   K2/h.I:(JLjava/lang/String;JZZZZZZZ)LK2/j;
        //  1374: astore_1       
        //  1375: aload_1        
        //  1376: getfield        K2/j.b:J
        //  1379: lstore          7
        //  1381: aload_0        
        //  1382: invokevirtual   K2/y1.T:()LK2/d;
        //  1385: pop            
        //  1386: getstatic       K2/w.l:LK2/F;
        //  1389: aconst_null    
        //  1390: invokevirtual   K2/F.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1393: checkcast       Ljava/lang/Integer;
        //  1396: astore          33
        //  1398: aload           33
        //  1400: invokevirtual   java/lang/Integer.intValue:()I
        //  1403: istore          5
        //  1405: lload           7
        //  1407: iload           5
        //  1409: i2l            
        //  1410: lsub           
        //  1411: lstore          7
        //  1413: lload           7
        //  1415: lconst_0       
        //  1416: lcmp           
        //  1417: ifle            1471
        //  1420: lload           7
        //  1422: ldc2_w          1000
        //  1425: lrem           
        //  1426: lconst_1       
        //  1427: lcmp           
        //  1428: ifne            1456
        //  1431: aload_0        
        //  1432: invokevirtual   K2/y1.j:()LK2/P;
        //  1435: invokevirtual   K2/P.G:()LK2/S;
        //  1438: aload           29
        //  1440: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1443: aload_1        
        //  1444: getfield        K2/j.b:J
        //  1447: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1450: ldc_w           "Data loss. Too many events logged. appId, count"
        //  1453: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1456: aload_0        
        //  1457: invokevirtual   K2/y1.W:()LK2/h;
        //  1460: invokevirtual   K2/h.J0:()V
        //  1463: aload_0        
        //  1464: invokevirtual   K2/y1.W:()LK2/h;
        //  1467: invokevirtual   K2/h.H0:()V
        //  1470: return         
        //  1471: iload           17
        //  1473: ifeq            1587
        //  1476: aload_1        
        //  1477: getfield        K2/j.a:J
        //  1480: lstore          7
        //  1482: aload_0        
        //  1483: invokevirtual   K2/y1.T:()LK2/d;
        //  1486: pop            
        //  1487: lload           7
        //  1489: getstatic       K2/w.n:LK2/F;
        //  1492: aconst_null    
        //  1493: invokevirtual   K2/F.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1496: checkcast       Ljava/lang/Integer;
        //  1499: invokevirtual   java/lang/Integer.intValue:()I
        //  1502: i2l            
        //  1503: lsub           
        //  1504: lstore          7
        //  1506: lload           7
        //  1508: lconst_0       
        //  1509: lcmp           
        //  1510: ifle            1587
        //  1513: lload           7
        //  1515: ldc2_w          1000
        //  1518: lrem           
        //  1519: lconst_1       
        //  1520: lcmp           
        //  1521: ifne            1549
        //  1524: aload_0        
        //  1525: invokevirtual   K2/y1.j:()LK2/P;
        //  1528: invokevirtual   K2/P.G:()LK2/S;
        //  1531: aload           29
        //  1533: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1536: aload_1        
        //  1537: getfield        K2/j.a:J
        //  1540: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1543: ldc_w           "Data loss. Too many public events logged. appId, count"
        //  1546: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1549: aload_0        
        //  1550: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1553: pop            
        //  1554: aload           27
        //  1556: aload           29
        //  1558: bipush          16
        //  1560: ldc_w           "_ev"
        //  1563: aload           20
        //  1565: getfield        K2/v.C:Ljava/lang/String;
        //  1568: iconst_0       
        //  1569: invokestatic    K2/J1.N:(LK2/I1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //  1572: aload_0        
        //  1573: invokevirtual   K2/y1.W:()LK2/h;
        //  1576: invokevirtual   K2/h.J0:()V
        //  1579: aload_0        
        //  1580: invokevirtual   K2/y1.W:()LK2/h;
        //  1583: invokevirtual   K2/h.H0:()V
        //  1586: return         
        //  1587: iload           19
        //  1589: ifeq            1676
        //  1592: aload_1        
        //  1593: getfield        K2/j.d:J
        //  1596: iconst_0       
        //  1597: ldc_w           1000000
        //  1600: aload_0        
        //  1601: invokevirtual   K2/y1.T:()LK2/d;
        //  1604: aload           22
        //  1606: getstatic       K2/w.m:LK2/F;
        //  1609: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  1612: invokestatic    java/lang/Math.min:(II)I
        //  1615: invokestatic    java/lang/Math.max:(II)I
        //  1618: i2l            
        //  1619: lsub           
        //  1620: lstore          7
        //  1622: lload           7
        //  1624: lconst_0       
        //  1625: lcmp           
        //  1626: ifle            1676
        //  1629: lload           7
        //  1631: lconst_1       
        //  1632: lcmp           
        //  1633: ifne            1661
        //  1636: aload_0        
        //  1637: invokevirtual   K2/y1.j:()LK2/P;
        //  1640: invokevirtual   K2/P.G:()LK2/S;
        //  1643: aload           29
        //  1645: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1648: aload_1        
        //  1649: getfield        K2/j.d:J
        //  1652: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1655: ldc_w           "Too many error events logged. appId, count"
        //  1658: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1661: aload_0        
        //  1662: invokevirtual   K2/y1.W:()LK2/h;
        //  1665: invokevirtual   K2/h.J0:()V
        //  1668: aload_0        
        //  1669: invokevirtual   K2/y1.W:()LK2/h;
        //  1672: invokevirtual   K2/h.H0:()V
        //  1675: return         
        //  1676: aload           32
        //  1678: invokevirtual   K2/u.i:()Landroid/os/Bundle;
        //  1681: astore          32
        //  1683: aload_0        
        //  1684: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1687: aload           32
        //  1689: ldc_w           "_o"
        //  1692: aload           31
        //  1694: invokevirtual   K2/J1.R:(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
        //  1697: aload_0        
        //  1698: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1701: aload           29
        //  1703: aload_2        
        //  1704: getfield        K2/B1.g0:Ljava/lang/String;
        //  1707: invokevirtual   K2/J1.w0:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1710: istore          19
        //  1712: iload           19
        //  1714: ifeq            1749
        //  1717: aload_0        
        //  1718: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1721: aload           32
        //  1723: ldc_w           "_dbg"
        //  1726: lconst_1       
        //  1727: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1730: invokevirtual   K2/J1.R:(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
        //  1733: aload_0        
        //  1734: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1737: aload           32
        //  1739: ldc_w           "_r"
        //  1742: lconst_1       
        //  1743: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1746: invokevirtual   K2/J1.R:(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
        //  1749: ldc_w           "_s"
        //  1752: aload           30
        //  1754: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1757: ifeq            1803
        //  1760: aload_0        
        //  1761: invokevirtual   K2/y1.W:()LK2/h;
        //  1764: aload           22
        //  1766: ldc_w           "_sno"
        //  1769: invokevirtual   K2/h.v0:(Ljava/lang/String;Ljava/lang/String;)LK2/H1;
        //  1772: astore_1       
        //  1773: aload_1        
        //  1774: ifnull          1803
        //  1777: aload_1        
        //  1778: getfield        K2/H1.e:Ljava/lang/Object;
        //  1781: instanceof      Ljava/lang/Long;
        //  1784: ifeq            1803
        //  1787: aload_0        
        //  1788: invokevirtual   K2/y1.d0:()LK2/J1;
        //  1791: aload           32
        //  1793: ldc_w           "_sno"
        //  1796: aload_1        
        //  1797: getfield        K2/H1.e:Ljava/lang/Object;
        //  1800: invokevirtual   K2/J1.R:(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
        //  1803: aload_0        
        //  1804: invokevirtual   K2/y1.T:()LK2/d;
        //  1807: getstatic       K2/w.i1:LK2/F;
        //  1810: invokevirtual   K2/d.y:(LK2/F;)Z
        //  1813: ifeq            1887
        //  1816: aload           31
        //  1818: ldc_w           "am"
        //  1821: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1824: ifeq            1887
        //  1827: aload           30
        //  1829: ldc_w           "_ai"
        //  1832: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //  1835: ifeq            1887
        //  1838: aload           32
        //  1840: ldc_w           "value"
        //  1843: invokevirtual   android/os/BaseBundle.get:(Ljava/lang/String;)Ljava/lang/Object;
        //  1846: astore_1       
        //  1847: aload_1        
        //  1848: ifnull          1887
        //  1851: aload_1        
        //  1852: instanceof      Ljava/lang/String;
        //  1855: istore          19
        //  1857: iload           19
        //  1859: ifeq            1887
        //  1862: aload_1        
        //  1863: checkcast       Ljava/lang/String;
        //  1866: invokestatic    java/lang/Double.parseDouble:(Ljava/lang/String;)D
        //  1869: dstore_3       
        //  1870: aload           32
        //  1872: ldc_w           "value"
        //  1875: invokevirtual   android/os/Bundle.remove:(Ljava/lang/String;)V
        //  1878: aload           32
        //  1880: ldc_w           "value"
        //  1883: dload_3        
        //  1884: invokevirtual   android/os/BaseBundle.putDouble:(Ljava/lang/String;D)V
        //  1887: aload_0        
        //  1888: invokevirtual   K2/y1.W:()LK2/h;
        //  1891: aload           29
        //  1893: invokevirtual   K2/h.G:(Ljava/lang/String;)J
        //  1896: lstore          7
        //  1898: lload           7
        //  1900: lconst_0       
        //  1901: lcmp           
        //  1902: ifle            1928
        //  1905: aload_0        
        //  1906: invokevirtual   K2/y1.j:()LK2/P;
        //  1909: invokevirtual   K2/P.I:()LK2/S;
        //  1912: aload           29
        //  1914: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1917: lload           7
        //  1919: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1922: ldc_w           "Data lost. Too many events stored on disk, deleted. appId"
        //  1925: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1928: new             LK2/s;
        //  1931: astore_1       
        //  1932: aload_0        
        //  1933: getfield        K2/y1.N:LK2/n0;
        //  1936: astore          31
        //  1938: aload           20
        //  1940: getfield        K2/v.E:Ljava/lang/String;
        //  1943: astore          30
        //  1945: aload           20
        //  1947: getfield        K2/v.C:Ljava/lang/String;
        //  1950: astore          33
        //  1952: aload_1        
        //  1953: aload           31
        //  1955: aload           30
        //  1957: aload           29
        //  1959: aload           33
        //  1961: aload           20
        //  1963: getfield        K2/v.F:J
        //  1966: lconst_0       
        //  1967: aload           32
        //  1969: invokespecial   K2/s.<init>:(LK2/n0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
        //  1972: aload_1        
        //  1973: getfield        K2/s.b:Ljava/lang/String;
        //  1976: astore          30
        //  1978: aload_0        
        //  1979: invokevirtual   K2/y1.W:()LK2/h;
        //  1982: astore          20
        //  1984: aload           20
        //  1986: ldc_w           "events"
        //  1989: aload           29
        //  1991: aload           30
        //  1993: invokevirtual   K2/h.t0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LK2/r;
        //  1996: astore          20
        //  1998: aload           20
        //  2000: ifnonnull       2198
        //  2003: aload_0        
        //  2004: invokevirtual   K2/y1.W:()LK2/h;
        //  2007: aload           29
        //  2009: invokevirtual   K2/h.r0:(Ljava/lang/String;)J
        //  2012: lstore          7
        //  2014: aload_0        
        //  2015: invokevirtual   K2/y1.T:()LK2/d;
        //  2018: astore          31
        //  2020: aload           31
        //  2022: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2025: pop            
        //  2026: getstatic       K2/w.J:LK2/F;
        //  2029: astore          20
        //  2031: aload           31
        //  2033: aload           29
        //  2035: aload           20
        //  2037: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  2040: sipush          2000
        //  2043: invokestatic    java/lang/Math.min:(II)I
        //  2046: sipush          500
        //  2049: invokestatic    java/lang/Math.max:(II)I
        //  2052: istore          5
        //  2054: lload           7
        //  2056: iload           5
        //  2058: i2l            
        //  2059: lcmp           
        //  2060: iflt            2173
        //  2063: iload           17
        //  2065: ifeq            2173
        //  2068: aload_0        
        //  2069: invokevirtual   K2/y1.j:()LK2/P;
        //  2072: invokevirtual   K2/P.G:()LK2/S;
        //  2075: astore_2       
        //  2076: aload           29
        //  2078: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  2081: astore_1       
        //  2082: aload           23
        //  2084: invokevirtual   K2/n0.q:()LK2/L;
        //  2087: aload           30
        //  2089: invokevirtual   K2/L.c:(Ljava/lang/String;)Ljava/lang/String;
        //  2092: astore          22
        //  2094: aload_0        
        //  2095: invokevirtual   K2/y1.T:()LK2/d;
        //  2098: astore          21
        //  2100: aload           21
        //  2102: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2105: pop            
        //  2106: aload           21
        //  2108: aload           29
        //  2110: aload           20
        //  2112: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  2115: sipush          2000
        //  2118: invokestatic    java/lang/Math.min:(II)I
        //  2121: sipush          500
        //  2124: invokestatic    java/lang/Math.max:(II)I
        //  2127: istore          5
        //  2129: aload_2        
        //  2130: ldc_w           "Too many event names used, ignoring event. appId, name, supported count"
        //  2133: aload_1        
        //  2134: aload           22
        //  2136: iload           5
        //  2138: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2141: invokevirtual   K2/S.h:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //  2144: aload_0        
        //  2145: invokevirtual   K2/y1.d0:()LK2/J1;
        //  2148: pop            
        //  2149: aload           27
        //  2151: aload           29
        //  2153: bipush          8
        //  2155: aconst_null    
        //  2156: aconst_null    
        //  2157: iconst_0       
        //  2158: invokestatic    K2/J1.N:(LK2/I1;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //  2161: aload_0        
        //  2162: invokevirtual   K2/y1.W:()LK2/h;
        //  2165: invokevirtual   K2/h.H0:()V
        //  2168: return         
        //  2169: astore_1       
        //  2170: goto            1028
        //  2173: new             LK2/r;
        //  2176: astore          20
        //  2178: aload           20
        //  2180: aload           29
        //  2182: aload           30
        //  2184: aload_1        
        //  2185: getfield        K2/s.d:J
        //  2188: invokespecial   K2/r.<init>:(Ljava/lang/String;Ljava/lang/String;J)V
        //  2191: goto            2221
        //  2194: astore_1       
        //  2195: goto            1028
        //  2198: aload_1        
        //  2199: aload           23
        //  2201: aload           20
        //  2203: getfield        K2/r.f:J
        //  2206: invokevirtual   K2/s.a:(LK2/n0;J)LK2/s;
        //  2209: astore_1       
        //  2210: aload           20
        //  2212: aload_1        
        //  2213: getfield        K2/s.d:J
        //  2216: invokevirtual   K2/r.a:(J)LK2/r;
        //  2219: astore          20
        //  2221: aload_0        
        //  2222: invokevirtual   K2/y1.W:()LK2/h;
        //  2225: astore          29
        //  2227: aload           29
        //  2229: ldc_w           "events"
        //  2232: aload           20
        //  2234: invokevirtual   K2/h.V:(Ljava/lang/String;LK2/r;)V
        //  2237: aload_0        
        //  2238: invokevirtual   K2/y1.l:()LK2/k0;
        //  2241: invokevirtual   K2/k0.v:()V
        //  2244: aload_0        
        //  2245: invokevirtual   K2/y1.f0:()V
        //  2248: aload_1        
        //  2249: getfield        K2/s.a:Ljava/lang/String;
        //  2252: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //  2255: aload_1        
        //  2256: getfield        K2/s.a:Ljava/lang/String;
        //  2259: aload           22
        //  2261: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2264: invokestatic    h2/A.b:(Z)V
        //  2267: invokestatic    com/google/android/gms/internal/measurement/n1.b2:()Lcom/google/android/gms/internal/measurement/m1;
        //  2270: astore          29
        //  2272: aload           29
        //  2274: invokevirtual   com/google/android/gms/internal/measurement/m1.I:()V
        //  2277: aload           29
        //  2279: invokevirtual   com/google/android/gms/internal/measurement/m1.S:()V
        //  2282: aload           22
        //  2284: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2287: ifne            2297
        //  2290: aload           29
        //  2292: aload           22
        //  2294: invokevirtual   com/google/android/gms/internal/measurement/m1.s:(Ljava/lang/String;)V
        //  2297: aload           25
        //  2299: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2302: ifne            2315
        //  2305: aload           29
        //  2307: aload           25
        //  2309: invokevirtual   com/google/android/gms/internal/measurement/m1.A:(Ljava/lang/String;)V
        //  2312: goto            2315
        //  2315: aload           24
        //  2317: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2320: ifne            2333
        //  2323: aload           29
        //  2325: aload           24
        //  2327: invokevirtual   com/google/android/gms/internal/measurement/m1.C:(Ljava/lang/String;)V
        //  2330: goto            2333
        //  2333: aload           21
        //  2335: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2338: ifne            2351
        //  2341: aload           29
        //  2343: aload           21
        //  2345: invokevirtual   com/google/android/gms/internal/measurement/m1.U:(Ljava/lang/String;)V
        //  2348: goto            2351
        //  2351: aload_2        
        //  2352: getfield        K2/B1.L:J
        //  2355: lstore          15
        //  2357: lload           15
        //  2359: ldc2_w          -2147483648
        //  2362: lcmp           
        //  2363: ifeq            2378
        //  2366: lload           15
        //  2368: l2i            
        //  2369: istore          5
        //  2371: aload           29
        //  2373: iload           5
        //  2375: invokevirtual   com/google/android/gms/internal/measurement/m1.B:(I)V
        //  2378: aload           29
        //  2380: lload           13
        //  2382: invokevirtual   com/google/android/gms/internal/measurement/m1.E:(J)V
        //  2385: aload           26
        //  2387: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2390: ifne            2403
        //  2393: aload           29
        //  2395: aload           26
        //  2397: invokevirtual   com/google/android/gms/internal/measurement/m1.O:(Ljava/lang/String;)V
        //  2400: goto            2403
        //  2403: aload           22
        //  2405: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //  2408: aload_0        
        //  2409: aload           22
        //  2411: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //  2414: astore          30
        //  2416: aload           21
        //  2418: astore          20
        //  2420: aload           30
        //  2422: bipush          100
        //  2424: aload_2        
        //  2425: getfield        K2/B1.X:Ljava/lang/String;
        //  2428: invokestatic    K2/z0.c:(ILjava/lang/String;)LK2/z0;
        //  2431: invokevirtual   K2/z0.d:(LK2/z0;)LK2/z0;
        //  2434: astore          21
        //  2436: aload           29
        //  2438: aload           21
        //  2440: invokevirtual   K2/z0.l:()Ljava/lang/String;
        //  2443: invokevirtual   com/google/android/gms/internal/measurement/m1.G:(Ljava/lang/String;)V
        //  2446: aload           29
        //  2448: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  2451: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  2454: invokevirtual   com/google/android/gms/internal/measurement/n1.L:()Ljava/lang/String;
        //  2457: invokevirtual   java/lang/String.isEmpty:()Z
        //  2460: ifeq            2485
        //  2463: aload           28
        //  2465: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2468: ifne            2485
        //  2471: aload           29
        //  2473: aload           28
        //  2475: invokevirtual   com/google/android/gms/internal/measurement/m1.p:(Ljava/lang/String;)V
        //  2478: goto            2485
        //  2481: astore_1       
        //  2482: goto            695
        //  2485: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  2488: aload_0        
        //  2489: invokevirtual   K2/y1.T:()LK2/d;
        //  2492: aload           22
        //  2494: getstatic       K2/w.G0:LK2/F;
        //  2497: invokevirtual   K2/d.F:(Ljava/lang/String;LK2/F;)Z
        //  2500: ifeq            2857
        //  2503: aload_0        
        //  2504: invokevirtual   K2/y1.d0:()LK2/J1;
        //  2507: pop            
        //  2508: getstatic       K2/w.d0:LK2/F;
        //  2511: aconst_null    
        //  2512: invokevirtual   K2/F.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2515: checkcast       Ljava/lang/String;
        //  2518: astore          28
        //  2520: aload           28
        //  2522: ldc_w           "*"
        //  2525: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2528: ifne            2561
        //  2531: aload           28
        //  2533: ldc_w           ","
        //  2536: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //  2539: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //  2542: aload           22
        //  2544: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  2549: ifeq            2555
        //  2552: goto            2561
        //  2555: iconst_0       
        //  2556: istore          5
        //  2558: goto            2564
        //  2561: iconst_1       
        //  2562: istore          5
        //  2564: iload           5
        //  2566: ifeq            2857
        //  2569: aload           29
        //  2571: aload_2        
        //  2572: getfield        K2/B1.e0:I
        //  2575: invokevirtual   com/google/android/gms/internal/measurement/m1.y:(I)V
        //  2578: aload_2        
        //  2579: getfield        K2/B1.f0:J
        //  2582: lstore          9
        //  2584: lload           9
        //  2586: lstore          7
        //  2588: aload           21
        //  2590: getstatic       K2/y0.D:LK2/y0;
        //  2593: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  2596: ifne            2622
        //  2599: lload           9
        //  2601: lstore          7
        //  2603: lload           9
        //  2605: lconst_0       
        //  2606: lcmp           
        //  2607: ifeq            2622
        //  2610: lload           9
        //  2612: ldc2_w          -2
        //  2615: land           
        //  2616: ldc2_w          32
        //  2619: lor            
        //  2620: lstore          7
        //  2622: lload           7
        //  2624: lconst_1       
        //  2625: lcmp           
        //  2626: ifne            2635
        //  2629: iconst_1       
        //  2630: istore          17
        //  2632: goto            2638
        //  2635: iconst_0       
        //  2636: istore          17
        //  2638: aload           29
        //  2640: iload           17
        //  2642: invokevirtual   com/google/android/gms/internal/measurement/m1.o:(Z)V
        //  2645: lload           7
        //  2647: lconst_0       
        //  2648: lcmp           
        //  2649: ifeq            2857
        //  2652: invokestatic    com/google/android/gms/internal/measurement/Z0.o:()Lcom/google/android/gms/internal/measurement/Y0;
        //  2655: astore          21
        //  2657: lload           7
        //  2659: lconst_1       
        //  2660: land           
        //  2661: lconst_0       
        //  2662: lcmp           
        //  2663: ifeq            2672
        //  2666: iconst_1       
        //  2667: istore          17
        //  2669: goto            2675
        //  2672: iconst_0       
        //  2673: istore          17
        //  2675: aload           21
        //  2677: iload           17
        //  2679: invokevirtual   com/google/android/gms/internal/measurement/Y0.l:(Z)V
        //  2682: lload           7
        //  2684: ldc2_w          2
        //  2687: land           
        //  2688: lconst_0       
        //  2689: lcmp           
        //  2690: ifeq            2699
        //  2693: iconst_1       
        //  2694: istore          17
        //  2696: goto            2702
        //  2699: iconst_0       
        //  2700: istore          17
        //  2702: aload           21
        //  2704: iload           17
        //  2706: invokevirtual   com/google/android/gms/internal/measurement/Y0.n:(Z)V
        //  2709: lload           7
        //  2711: ldc2_w          4
        //  2714: land           
        //  2715: lconst_0       
        //  2716: lcmp           
        //  2717: ifeq            2726
        //  2720: iconst_1       
        //  2721: istore          17
        //  2723: goto            2729
        //  2726: iconst_0       
        //  2727: istore          17
        //  2729: aload           21
        //  2731: iload           17
        //  2733: invokevirtual   com/google/android/gms/internal/measurement/Y0.o:(Z)V
        //  2736: lload           7
        //  2738: ldc2_w          8
        //  2741: land           
        //  2742: lconst_0       
        //  2743: lcmp           
        //  2744: ifeq            2753
        //  2747: iconst_1       
        //  2748: istore          17
        //  2750: goto            2756
        //  2753: iconst_0       
        //  2754: istore          17
        //  2756: aload           21
        //  2758: iload           17
        //  2760: invokevirtual   com/google/android/gms/internal/measurement/Y0.p:(Z)V
        //  2763: lload           7
        //  2765: ldc2_w          16
        //  2768: land           
        //  2769: lconst_0       
        //  2770: lcmp           
        //  2771: ifeq            2780
        //  2774: iconst_1       
        //  2775: istore          17
        //  2777: goto            2783
        //  2780: iconst_0       
        //  2781: istore          17
        //  2783: aload           21
        //  2785: iload           17
        //  2787: invokevirtual   com/google/android/gms/internal/measurement/Y0.k:(Z)V
        //  2790: lload           7
        //  2792: ldc2_w          32
        //  2795: land           
        //  2796: lconst_0       
        //  2797: lcmp           
        //  2798: ifeq            2807
        //  2801: iconst_1       
        //  2802: istore          17
        //  2804: goto            2810
        //  2807: iconst_0       
        //  2808: istore          17
        //  2810: aload           21
        //  2812: iload           17
        //  2814: invokevirtual   com/google/android/gms/internal/measurement/Y0.j:(Z)V
        //  2817: lload           7
        //  2819: ldc2_w          64
        //  2822: land           
        //  2823: lconst_0       
        //  2824: lcmp           
        //  2825: ifeq            2834
        //  2828: iconst_1       
        //  2829: istore          17
        //  2831: goto            2837
        //  2834: iconst_0       
        //  2835: istore          17
        //  2837: aload           21
        //  2839: iload           17
        //  2841: invokevirtual   com/google/android/gms/internal/measurement/Y0.m:(Z)V
        //  2844: aload           29
        //  2846: aload           21
        //  2848: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  2851: checkcast       Lcom/google/android/gms/internal/measurement/Z0;
        //  2854: invokevirtual   com/google/android/gms/internal/measurement/m1.l:(Lcom/google/android/gms/internal/measurement/Z0;)V
        //  2857: aload_2        
        //  2858: getfield        K2/B1.H:J
        //  2861: lstore          7
        //  2863: lload           7
        //  2865: lconst_0       
        //  2866: lcmp           
        //  2867: ifeq            2877
        //  2870: aload           29
        //  2872: lload           7
        //  2874: invokevirtual   com/google/android/gms/internal/measurement/m1.u:(J)V
        //  2877: aload           29
        //  2879: aload_2        
        //  2880: getfield        K2/B1.U:J
        //  2883: invokevirtual   com/google/android/gms/internal/measurement/m1.z:(J)V
        //  2886: aload_0        
        //  2887: invokevirtual   K2/y1.c0:()LK2/T;
        //  2890: invokevirtual   K2/T.l0:()Ljava/util/ArrayList;
        //  2893: astore          21
        //  2895: aload           21
        //  2897: ifnull          2907
        //  2900: aload           29
        //  2902: aload           21
        //  2904: invokevirtual   com/google/android/gms/internal/measurement/m1.w:(Ljava/util/ArrayList;)V
        //  2907: aload_0        
        //  2908: aload           22
        //  2910: invokevirtual   K2/y1.J:(Ljava/lang/String;)LK2/z0;
        //  2913: bipush          100
        //  2915: aload_2        
        //  2916: getfield        K2/B1.X:Ljava/lang/String;
        //  2919: invokestatic    K2/z0.c:(ILjava/lang/String;)LK2/z0;
        //  2922: invokevirtual   K2/z0.d:(LK2/z0;)LK2/z0;
        //  2925: astore          28
        //  2927: getstatic       K2/y0.D:LK2/y0;
        //  2930: astore          30
        //  2932: aload           28
        //  2934: aload           30
        //  2936: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  2939: istore          17
        //  2941: aload_2        
        //  2942: getfield        K2/B1.Q:Z
        //  2945: istore          19
        //  2947: iload           17
        //  2949: ifeq            3333
        //  2952: iload           19
        //  2954: ifeq            3333
        //  2957: aload_0        
        //  2958: getfield        K2/y1.K:LK2/k1;
        //  2961: astore          21
        //  2963: aload           21
        //  2965: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2968: pop            
        //  2969: aload           28
        //  2971: aload           30
        //  2973: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  2976: ifeq            2991
        //  2979: aload           21
        //  2981: aload           22
        //  2983: invokevirtual   K2/k1.D:(Ljava/lang/String;)Landroid/util/Pair;
        //  2986: astore          21
        //  2988: goto            3006
        //  2991: new             Landroid/util/Pair;
        //  2994: dup            
        //  2995: ldc_w           ""
        //  2998: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  3001: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3004: astore          21
        //  3006: aload           21
        //  3008: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  3011: checkcast       Ljava/lang/CharSequence;
        //  3014: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3017: ifne            3330
        //  3020: iload           19
        //  3022: ifeq            3330
        //  3025: aload           29
        //  3027: aload           21
        //  3029: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  3032: checkcast       Ljava/lang/String;
        //  3035: invokevirtual   com/google/android/gms/internal/measurement/m1.T:(Ljava/lang/String;)V
        //  3038: aload           21
        //  3040: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  3043: astore          31
        //  3045: aload           31
        //  3047: ifnull          3063
        //  3050: aload           29
        //  3052: aload           31
        //  3054: checkcast       Ljava/lang/Boolean;
        //  3057: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3060: invokevirtual   com/google/android/gms/internal/measurement/m1.x:(Z)V
        //  3063: aload_1        
        //  3064: getfield        K2/s.b:Ljava/lang/String;
        //  3067: ldc_w           "_fx"
        //  3070: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3073: ifne            3330
        //  3076: aload           21
        //  3078: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  3081: checkcast       Ljava/lang/String;
        //  3084: ldc_w           "00000000-0000-0000-0000-000000000000"
        //  3087: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3090: ifne            3330
        //  3093: aload_0        
        //  3094: invokevirtual   K2/y1.W:()LK2/h;
        //  3097: aload           22
        //  3099: invokevirtual   K2/h.u0:(Ljava/lang/String;)LK2/G;
        //  3102: astore          21
        //  3104: aload           21
        //  3106: ifnull          3330
        //  3109: aload           21
        //  3111: getfield        K2/G.a:LK2/n0;
        //  3114: astore          32
        //  3116: aload           32
        //  3118: getfield        K2/n0.L:LK2/k0;
        //  3121: astore          31
        //  3123: aload           31
        //  3125: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3128: aload           31
        //  3130: invokevirtual   K2/k0.v:()V
        //  3133: aload           21
        //  3135: getfield        K2/G.z:Z
        //  3138: ifeq            3330
        //  3141: aload_0        
        //  3142: aload           22
        //  3144: iconst_0       
        //  3145: aconst_null    
        //  3146: aconst_null    
        //  3147: invokevirtual   K2/y1.A:(Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V
        //  3150: new             Landroid/os/Bundle;
        //  3153: astore          31
        //  3155: aload           31
        //  3157: invokespecial   android/os/Bundle.<init>:()V
        //  3160: aload_0        
        //  3161: invokevirtual   K2/y1.T:()LK2/d;
        //  3164: getstatic       K2/w.V0:LK2/F;
        //  3167: invokevirtual   K2/d.y:(LK2/F;)Z
        //  3170: ifeq            3267
        //  3173: aload           32
        //  3175: getfield        K2/n0.L:LK2/k0;
        //  3178: astore          33
        //  3180: aload           33
        //  3182: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3185: aload           33
        //  3187: invokevirtual   K2/k0.v:()V
        //  3190: aload           21
        //  3192: getfield        K2/G.A:Ljava/lang/Long;
        //  3195: astore          33
        //  3197: aload           33
        //  3199: ifnull          3222
        //  3202: aload           31
        //  3204: ldc_w           "_pfo"
        //  3207: lconst_0       
        //  3208: aload           33
        //  3210: invokevirtual   java/lang/Long.longValue:()J
        //  3213: invokestatic    java/lang/Math.max:(JJ)J
        //  3216: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  3219: goto            3222
        //  3222: aload           32
        //  3224: getfield        K2/n0.L:LK2/k0;
        //  3227: astore          32
        //  3229: aload           32
        //  3231: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3234: aload           32
        //  3236: invokevirtual   K2/k0.v:()V
        //  3239: aload           21
        //  3241: getfield        K2/G.B:Ljava/lang/Long;
        //  3244: astore          21
        //  3246: aload           21
        //  3248: ifnull          3264
        //  3251: aload           31
        //  3253: ldc_w           "_uwa"
        //  3256: aload           21
        //  3258: invokevirtual   java/lang/Long.longValue:()J
        //  3261: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  3264: goto            3306
        //  3267: aload_0        
        //  3268: invokevirtual   K2/y1.T:()LK2/d;
        //  3271: getstatic       K2/w.U0:LK2/F;
        //  3274: invokevirtual   K2/d.y:(LK2/F;)Z
        //  3277: ifeq            3264
        //  3280: aload           31
        //  3282: ldc_w           "_pfo"
        //  3285: lconst_0       
        //  3286: aload_0        
        //  3287: invokevirtual   K2/y1.W:()LK2/h;
        //  3290: aload           22
        //  3292: invokevirtual   K2/h.q0:(Ljava/lang/String;)J
        //  3295: lconst_1       
        //  3296: lsub           
        //  3297: invokestatic    java/lang/Math.max:(JJ)J
        //  3300: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  3303: goto            3264
        //  3306: aload           31
        //  3308: ldc_w           "_r"
        //  3311: lconst_1       
        //  3312: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //  3315: aload           27
        //  3317: aload           22
        //  3319: ldc_w           "_fx"
        //  3322: aload           31
        //  3324: invokevirtual   b1/f.b0:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
        //  3327: goto            3336
        //  3330: goto            3336
        //  3333: goto            3330
        //  3336: aload           23
        //  3338: invokevirtual   K2/n0.n:()LK2/o;
        //  3341: invokevirtual   K2/x0.w:()V
        //  3344: aload           29
        //  3346: getstatic       android/os/Build.MODEL:Ljava/lang/String;
        //  3349: invokevirtual   com/google/android/gms/internal/measurement/m1.J:(Ljava/lang/String;)V
        //  3352: aload           23
        //  3354: invokevirtual   K2/n0.n:()LK2/o;
        //  3357: invokevirtual   K2/x0.w:()V
        //  3360: getstatic       android/os/Build$VERSION.RELEASE:Ljava/lang/String;
        //  3363: astore          21
        //  3365: aload           29
        //  3367: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  3370: aload           29
        //  3372: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3375: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3378: aload           21
        //  3380: invokestatic    com/google/android/gms/internal/measurement/n1.P1:(Lcom/google/android/gms/internal/measurement/n1;Ljava/lang/String;)V
        //  3383: aload           29
        //  3385: aload           23
        //  3387: invokevirtual   K2/n0.n:()LK2/o;
        //  3390: invokevirtual   K2/o.z:()J
        //  3393: l2i            
        //  3394: invokevirtual   com/google/android/gms/internal/measurement/m1.K:(I)V
        //  3397: aload           29
        //  3399: aload           23
        //  3401: invokevirtual   K2/n0.n:()LK2/o;
        //  3404: invokevirtual   K2/o.A:()Ljava/lang/String;
        //  3407: invokevirtual   com/google/android/gms/internal/measurement/m1.W:(Ljava/lang/String;)V
        //  3410: aload           29
        //  3412: aload_2        
        //  3413: getfield        K2/B1.b0:J
        //  3416: invokevirtual   com/google/android/gms/internal/measurement/m1.L:(J)V
        //  3419: aload           23
        //  3421: invokevirtual   K2/n0.g:()Z
        //  3424: ifeq            3462
        //  3427: aload           29
        //  3429: invokevirtual   com/google/android/gms/internal/measurement/m1.X:()Ljava/lang/String;
        //  3432: pop            
        //  3433: aconst_null    
        //  3434: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3437: ifeq            3443
        //  3440: goto            3462
        //  3443: aload           29
        //  3445: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  3448: aload           29
        //  3450: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3453: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3456: aconst_null    
        //  3457: invokestatic    com/google/android/gms/internal/measurement/n1.A1:(Lcom/google/android/gms/internal/measurement/n1;Ljava/lang/String;)V
        //  3460: aconst_null    
        //  3461: athrow         
        //  3462: aload_0        
        //  3463: invokevirtual   K2/y1.W:()LK2/h;
        //  3466: aload           22
        //  3468: invokevirtual   K2/h.u0:(Ljava/lang/String;)LK2/G;
        //  3471: astore          21
        //  3473: aload           21
        //  3475: ifnonnull       3632
        //  3478: new             LK2/G;
        //  3481: astore          21
        //  3483: aload           21
        //  3485: aload           23
        //  3487: aload           22
        //  3489: invokespecial   K2/G.<init>:(LK2/n0;Ljava/lang/String;)V
        //  3492: aload           21
        //  3494: aload_0        
        //  3495: aload           28
        //  3497: invokevirtual   K2/y1.k:(LK2/z0;)Ljava/lang/String;
        //  3500: invokevirtual   K2/G.r:(Ljava/lang/String;)V
        //  3503: aload           21
        //  3505: aload_2        
        //  3506: getfield        K2/B1.M:Ljava/lang/String;
        //  3509: invokevirtual   K2/G.A:(Ljava/lang/String;)V
        //  3512: aload           21
        //  3514: aload           26
        //  3516: invokevirtual   K2/G.C:(Ljava/lang/String;)V
        //  3519: aload           28
        //  3521: aload           30
        //  3523: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  3526: ifeq            3545
        //  3529: aload           21
        //  3531: aload_0        
        //  3532: getfield        K2/y1.K:LK2/k1;
        //  3535: aload           22
        //  3537: iload           19
        //  3539: invokevirtual   K2/k1.C:(Ljava/lang/String;Z)Ljava/lang/String;
        //  3542: invokevirtual   K2/G.G:(Ljava/lang/String;)V
        //  3545: aload           21
        //  3547: lconst_0       
        //  3548: invokevirtual   K2/G.Q:(J)V
        //  3551: aload           21
        //  3553: lconst_0       
        //  3554: invokevirtual   K2/G.R:(J)V
        //  3557: aload           21
        //  3559: lconst_0       
        //  3560: invokevirtual   K2/G.P:(J)V
        //  3563: aload           21
        //  3565: aload           24
        //  3567: invokevirtual   K2/G.x:(Ljava/lang/String;)V
        //  3570: aload           21
        //  3572: lload           15
        //  3574: invokevirtual   K2/G.q:(J)V
        //  3577: aload           21
        //  3579: aload           25
        //  3581: invokevirtual   K2/G.v:(Ljava/lang/String;)V
        //  3584: aload           21
        //  3586: lload           13
        //  3588: invokevirtual   K2/G.M:(J)V
        //  3591: aload           21
        //  3593: aload_2        
        //  3594: getfield        K2/B1.H:J
        //  3597: invokevirtual   K2/G.J:(J)V
        //  3600: aload           21
        //  3602: iload           18
        //  3604: invokevirtual   K2/G.s:(Z)V
        //  3607: aload           21
        //  3609: aload_2        
        //  3610: getfield        K2/B1.U:J
        //  3613: invokevirtual   K2/G.K:(J)V
        //  3616: aload_0        
        //  3617: invokevirtual   K2/y1.W:()LK2/h;
        //  3620: aload           21
        //  3622: iconst_0       
        //  3623: invokevirtual   K2/h.Q:(LK2/G;Z)V
        //  3626: aload           21
        //  3628: astore_2       
        //  3629: goto            3635
        //  3632: aload           21
        //  3634: astore_2       
        //  3635: aload           28
        //  3637: invokevirtual   K2/z0.n:()Z
        //  3640: ifeq            3671
        //  3643: aload_2        
        //  3644: invokevirtual   K2/G.g:()Ljava/lang/String;
        //  3647: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3650: ifne            3671
        //  3653: aload_2        
        //  3654: invokevirtual   K2/G.g:()Ljava/lang/String;
        //  3657: astore          21
        //  3659: aload           21
        //  3661: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //  3664: aload           29
        //  3666: aload           21
        //  3668: invokevirtual   com/google/android/gms/internal/measurement/m1.v:(Ljava/lang/String;)V
        //  3671: aload_2        
        //  3672: invokevirtual   K2/G.i:()Ljava/lang/String;
        //  3675: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3678: ifne            3699
        //  3681: aload_2        
        //  3682: invokevirtual   K2/G.i:()Ljava/lang/String;
        //  3685: astore          21
        //  3687: aload           21
        //  3689: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //  3692: aload           29
        //  3694: aload           21
        //  3696: invokevirtual   com/google/android/gms/internal/measurement/m1.M:(Ljava/lang/String;)V
        //  3699: aload_0        
        //  3700: invokevirtual   K2/y1.W:()LK2/h;
        //  3703: aload           22
        //  3705: invokevirtual   K2/h.B0:(Ljava/lang/String;)Ljava/util/List;
        //  3708: astore          21
        //  3710: iconst_0       
        //  3711: istore          5
        //  3713: iload           5
        //  3715: aload           21
        //  3717: invokeinterface java/util/List.size:()I
        //  3722: if_icmpge       3975
        //  3725: invokestatic    com/google/android/gms/internal/measurement/u1.A:()Lcom/google/android/gms/internal/measurement/t1;
        //  3728: astore          23
        //  3730: aload           21
        //  3732: iload           5
        //  3734: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3739: checkcast       LK2/H1;
        //  3742: getfield        K2/H1.c:Ljava/lang/String;
        //  3745: astore          22
        //  3747: aload           23
        //  3749: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  3752: aload           23
        //  3754: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3757: checkcast       Lcom/google/android/gms/internal/measurement/u1;
        //  3760: aload           22
        //  3762: invokestatic    com/google/android/gms/internal/measurement/u1.r:(Lcom/google/android/gms/internal/measurement/u1;Ljava/lang/String;)V
        //  3765: aload           21
        //  3767: iload           5
        //  3769: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3774: checkcast       LK2/H1;
        //  3777: getfield        K2/H1.d:J
        //  3780: lstore          7
        //  3782: aload           23
        //  3784: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  3787: aload           23
        //  3789: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3792: checkcast       Lcom/google/android/gms/internal/measurement/u1;
        //  3795: lload           7
        //  3797: invokestatic    com/google/android/gms/internal/measurement/u1.v:(Lcom/google/android/gms/internal/measurement/u1;J)V
        //  3800: aload_0        
        //  3801: invokevirtual   K2/y1.c0:()LK2/T;
        //  3804: aload           23
        //  3806: aload           21
        //  3808: iload           5
        //  3810: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3815: checkcast       LK2/H1;
        //  3818: getfield        K2/H1.e:Ljava/lang/Object;
        //  3821: invokevirtual   K2/T.W:(Lcom/google/android/gms/internal/measurement/t1;Ljava/lang/Object;)V
        //  3824: aload           29
        //  3826: aload           23
        //  3828: invokevirtual   com/google/android/gms/internal/measurement/m1.n:(Lcom/google/android/gms/internal/measurement/t1;)V
        //  3831: ldc_w           "_sid"
        //  3834: aload           21
        //  3836: iload           5
        //  3838: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3843: checkcast       LK2/H1;
        //  3846: getfield        K2/H1.c:Ljava/lang/String;
        //  3849: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3852: ifeq            3969
        //  3855: aload_2        
        //  3856: getfield        K2/G.a:LK2/n0;
        //  3859: getfield        K2/n0.L:LK2/k0;
        //  3862: astore          22
        //  3864: aload           22
        //  3866: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3869: aload           22
        //  3871: invokevirtual   K2/k0.v:()V
        //  3874: aload_2        
        //  3875: getfield        K2/G.x:J
        //  3878: lconst_0       
        //  3879: lcmp           
        //  3880: ifeq            3969
        //  3883: aload_0        
        //  3884: invokevirtual   K2/y1.c0:()LK2/T;
        //  3887: astore          22
        //  3889: aload           20
        //  3891: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3894: ifeq            3903
        //  3897: lconst_0       
        //  3898: lstore          7
        //  3900: goto            3921
        //  3903: aload           22
        //  3905: aload           20
        //  3907: ldc_w           "UTF-8"
        //  3910: invokestatic    java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
        //  3913: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //  3916: invokevirtual   K2/T.D:([B)J
        //  3919: lstore          7
        //  3921: aload_2        
        //  3922: getfield        K2/G.a:LK2/n0;
        //  3925: getfield        K2/n0.L:LK2/k0;
        //  3928: astore          22
        //  3930: aload           22
        //  3932: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3935: aload           22
        //  3937: invokevirtual   K2/k0.v:()V
        //  3940: lload           7
        //  3942: aload_2        
        //  3943: getfield        K2/G.x:J
        //  3946: lcmp           
        //  3947: ifeq            3969
        //  3950: aload           29
        //  3952: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //  3955: aload           29
        //  3957: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //  3960: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3963: invokestatic    com/google/android/gms/internal/measurement/n1.G1:(Lcom/google/android/gms/internal/measurement/n1;)V
        //  3966: goto            3969
        //  3969: iinc            5, 1
        //  3972: goto            3713
        //  3975: aload_0        
        //  3976: invokevirtual   K2/y1.W:()LK2/h;
        //  3979: aload           29
        //  3981: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //  3984: checkcast       Lcom/google/android/gms/internal/measurement/n1;
        //  3987: invokevirtual   K2/h.F:(Lcom/google/android/gms/internal/measurement/n1;)J
        //  3990: lstore          7
        //  3992: aload_0        
        //  3993: invokevirtual   K2/y1.W:()LK2/h;
        //  3996: astore_2       
        //  3997: aload_1        
        //  3998: getfield        K2/s.f:LK2/u;
        //  4001: astore          20
        //  4003: aload           20
        //  4005: ifnull          4141
        //  4008: aload           20
        //  4010: invokevirtual   K2/u.iterator:()Ljava/util/Iterator;
        //  4013: astore          21
        //  4015: aload           21
        //  4017: checkcast       LK2/t;
        //  4020: astore          20
        //  4022: aload           20
        //  4024: invokevirtual   K2/t.hasNext:()Z
        //  4027: ifeq            4053
        //  4030: ldc_w           "_r"
        //  4033: aload           20
        //  4035: invokevirtual   K2/t.next:()Ljava/lang/Object;
        //  4038: checkcast       Ljava/lang/String;
        //  4041: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4044: ifeq            4015
        //  4047: iconst_1       
        //  4048: istore          17
        //  4050: goto            4144
        //  4053: aload_0        
        //  4054: invokevirtual   K2/y1.a0:()LK2/h0;
        //  4057: aload_1        
        //  4058: getfield        K2/s.a:Ljava/lang/String;
        //  4061: aload_1        
        //  4062: getfield        K2/s.b:Ljava/lang/String;
        //  4065: invokevirtual   K2/h0.O:(Ljava/lang/String;Ljava/lang/String;)Z
        //  4068: istore          17
        //  4070: aload_0        
        //  4071: invokevirtual   K2/y1.W:()LK2/h;
        //  4074: aload_0        
        //  4075: invokevirtual   K2/y1.h0:()J
        //  4078: aload_1        
        //  4079: getfield        K2/s.a:Ljava/lang/String;
        //  4082: iconst_0       
        //  4083: iconst_0       
        //  4084: iconst_0       
        //  4085: iconst_0       
        //  4086: invokevirtual   K2/h.J:(JLjava/lang/String;ZZZZ)LK2/j;
        //  4089: astore          20
        //  4091: iload           17
        //  4093: ifeq            4141
        //  4096: aload           20
        //  4098: getfield        K2/j.e:J
        //  4101: lstore          9
        //  4103: aload_0        
        //  4104: invokevirtual   K2/y1.T:()LK2/d;
        //  4107: astore          21
        //  4109: aload_1        
        //  4110: getfield        K2/s.a:Ljava/lang/String;
        //  4113: astore          20
        //  4115: aload           21
        //  4117: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4120: pop            
        //  4121: lload           9
        //  4123: aload           21
        //  4125: aload           20
        //  4127: getstatic       K2/w.p:LK2/F;
        //  4130: invokevirtual   K2/d.A:(Ljava/lang/String;LK2/F;)I
        //  4133: i2l            
        //  4134: lcmp           
        //  4135: ifge            4141
        //  4138: goto            4047
        //  4141: iconst_0       
        //  4142: istore          17
        //  4144: aload_2        
        //  4145: aload_1        
        //  4146: lload           7
        //  4148: iload           17
        //  4150: invokevirtual   K2/h.e0:(LK2/s;JZ)Z
        //  4153: ifeq            4187
        //  4156: aload_0        
        //  4157: lconst_0       
        //  4158: putfield        K2/y1.Q:J
        //  4161: goto            4187
        //  4164: astore_1       
        //  4165: aload_0        
        //  4166: invokevirtual   K2/y1.j:()LK2/P;
        //  4169: invokevirtual   K2/P.G:()LK2/S;
        //  4172: aload           29
        //  4174: invokevirtual   com/google/android/gms/internal/measurement/m1.X:()Ljava/lang/String;
        //  4177: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  4180: aload_1        
        //  4181: ldc_w           "Data loss. Failed to insert raw event metadata. appId"
        //  4184: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  4187: aload_0        
        //  4188: invokevirtual   K2/y1.W:()LK2/h;
        //  4191: invokevirtual   K2/h.J0:()V
        //  4194: aload_0        
        //  4195: invokevirtual   K2/y1.W:()LK2/h;
        //  4198: invokevirtual   K2/h.H0:()V
        //  4201: aload_0        
        //  4202: invokevirtual   K2/y1.H:()V
        //  4205: aload_0        
        //  4206: invokevirtual   K2/y1.j:()LK2/P;
        //  4209: invokevirtual   K2/P.H:()LK2/S;
        //  4212: ldc_w           "Background event processing time, ms"
        //  4215: invokestatic    java/lang/System.nanoTime:()J
        //  4218: lload           11
        //  4220: lsub           
        //  4221: ldc2_w          500000
        //  4224: ladd           
        //  4225: ldc2_w          1000000
        //  4228: ldiv           
        //  4229: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4232: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  4235: return         
        //  4236: astore_1       
        //  4237: goto            787
        //  4240: astore_1       
        //  4241: goto            695
        //  4244: aload_0        
        //  4245: invokevirtual   K2/y1.W:()LK2/h;
        //  4248: invokevirtual   K2/h.H0:()V
        //  4251: aload_1        
        //  4252: athrow         
        //  4253: astore_1       
        //  4254: goto            1887
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  642    658    694    695    Any
        //  663    685    694    695    Any
        //  701    711    694    695    Any
        //  734    741    835    839    Any
        //  752    765    835    839    Any
        //  771    784    835    839    Any
        //  806    812    835    839    Any
        //  816    827    835    839    Any
        //  839    868    835    839    Any
        //  876    885    4236   4240   Any
        //  885    951    835    839    Any
        //  955    967    835    839    Any
        //  970    991    835    839    Any
        //  991    1002   1031   1035   Any
        //  1002   1025   835    839    Any
        //  1038   1073   835    839    Any
        //  1073   1086   1181   1185   Landroid/database/sqlite/SQLiteException;
        //  1073   1086   835    839    Any
        //  1086   1096   1103   1104   Landroid/database/sqlite/SQLiteException;
        //  1086   1096   835    839    Any
        //  1111   1116   1103   1104   Landroid/database/sqlite/SQLiteException;
        //  1111   1116   835    839    Any
        //  1116   1174   1177   1181   Landroid/database/sqlite/SQLiteException;
        //  1116   1174   835    839    Any
        //  1185   1205   835    839    Any
        //  1205   1222   835    839    Any
        //  1222   1233   1315   1319   Any
        //  1233   1250   835    839    Any
        //  1250   1312   835    839    Any
        //  1319   1398   835    839    Any
        //  1398   1405   4236   4240   Any
        //  1431   1456   835    839    Any
        //  1456   1463   835    839    Any
        //  1476   1506   835    839    Any
        //  1524   1549   835    839    Any
        //  1549   1579   835    839    Any
        //  1592   1622   835    839    Any
        //  1636   1661   835    839    Any
        //  1661   1668   835    839    Any
        //  1676   1712   835    839    Any
        //  1717   1749   835    839    Any
        //  1749   1773   835    839    Any
        //  1777   1803   835    839    Any
        //  1803   1847   835    839    Any
        //  1851   1857   835    839    Any
        //  1862   1887   4253   4257   Ljava/lang/NumberFormatException;
        //  1862   1887   835    839    Any
        //  1887   1898   835    839    Any
        //  1905   1928   835    839    Any
        //  1928   1932   835    839    Any
        //  1932   1952   4240   4244   Any
        //  1952   1984   835    839    Any
        //  1984   1998   4236   4240   Any
        //  2003   2020   835    839    Any
        //  2020   2054   2194   2198   Any
        //  2068   2100   835    839    Any
        //  2100   2129   2169   2173   Any
        //  2129   2161   835    839    Any
        //  2173   2191   835    839    Any
        //  2198   2221   835    839    Any
        //  2221   2227   835    839    Any
        //  2227   2237   4236   4240   Any
        //  2237   2297   835    839    Any
        //  2297   2312   835    839    Any
        //  2315   2330   835    839    Any
        //  2333   2348   835    839    Any
        //  2371   2378   835    839    Any
        //  2378   2400   835    839    Any
        //  2403   2408   835    839    Any
        //  2408   2416   2481   2485   Any
        //  2420   2478   2481   2485   Any
        //  2485   2552   2481   2485   Any
        //  2569   2584   2481   2485   Any
        //  2588   2599   2481   2485   Any
        //  2638   2645   2481   2485   Any
        //  2652   2657   2481   2485   Any
        //  2675   2682   2481   2485   Any
        //  2702   2709   2481   2485   Any
        //  2729   2736   2481   2485   Any
        //  2756   2763   2481   2485   Any
        //  2783   2790   2481   2485   Any
        //  2810   2817   2481   2485   Any
        //  2837   2857   2481   2485   Any
        //  2857   2863   2481   2485   Any
        //  2870   2877   2481   2485   Any
        //  2877   2895   2481   2485   Any
        //  2900   2907   2481   2485   Any
        //  2907   2941   2481   2485   Any
        //  2957   2988   2481   2485   Any
        //  2991   3006   2481   2485   Any
        //  3006   3020   2481   2485   Any
        //  3025   3045   2481   2485   Any
        //  3050   3063   2481   2485   Any
        //  3063   3104   2481   2485   Any
        //  3116   3197   2481   2485   Any
        //  3202   3219   2481   2485   Any
        //  3222   3246   2481   2485   Any
        //  3251   3264   2481   2485   Any
        //  3267   3303   2481   2485   Any
        //  3306   3327   2481   2485   Any
        //  3336   3440   2481   2485   Any
        //  3443   3462   2481   2485   Any
        //  3462   3473   2481   2485   Any
        //  3478   3545   2481   2485   Any
        //  3545   3626   2481   2485   Any
        //  3635   3671   2481   2485   Any
        //  3671   3699   2481   2485   Any
        //  3699   3710   2481   2485   Any
        //  3713   3897   2481   2485   Any
        //  3903   3921   2481   2485   Any
        //  3921   3966   2481   2485   Any
        //  3975   3992   4164   4187   Ljava/io/IOException;
        //  3975   3992   2481   2485   Any
        //  3992   4003   2481   2485   Any
        //  4008   4015   2481   2485   Any
        //  4015   4047   2481   2485   Any
        //  4053   4091   2481   2485   Any
        //  4096   4138   2481   2485   Any
        //  4144   4161   2481   2485   Any
        //  4165   4187   2481   2485   Any
        //  4187   4194   2481   2485   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1887:
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
    
    public final n R(final String s) {
        this.l().v();
        this.f0();
        final HashMap e0 = this.e0;
        n b;
        if ((b = (n)e0.get((Object)s)) == null) {
            final h e2 = this.E;
            r(e2);
            A.h((Object)s);
            e2.v();
            e2.z();
            b = n.b(e2.M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[] { s }));
            e0.put((Object)s, (Object)b);
        }
        return b;
    }
    
    public final void S(final B1 b1) {
        this.l().v();
        this.f0();
        A.h((Object)b1);
        final String c = b1.C;
        A.e(c);
        if (!b0(b1)) {
            return;
        }
        final h e = this.E;
        r(e);
        final G u0 = e.u0(c);
        final String d = b1.D;
        if (u0 != null && TextUtils.isEmpty((CharSequence)u0.j()) && !TextUtils.isEmpty((CharSequence)d)) {
            u0.w(0L);
            final h e2 = this.E;
            r(e2);
            e2.Q(u0, false);
            final h0 c2 = this.C;
            r(c2);
            c2.v();
            ((j)c2.J).remove((Object)c);
        }
        if (!b1.J) {
            this.e(b1);
            return;
        }
        long n;
        if ((n = b1.O) == 0L) {
            this.d().getClass();
            n = System.currentTimeMillis();
        }
        final n0 n2 = this.N;
        final o n3 = n2.n();
        final Context c3 = n2.C;
        n3.v();
        int p = b1.P;
        if (p != 0 && p != 1) {
            this.j().K.e(K2.P.z(c), p, "Incorrect app type, assuming installed app. appId, appType");
            p = 0;
        }
        final h e3 = this.E;
        r(e3);
        e3.C0();
        Label_2202: {
            Label_0415: {
                Boolean z;
                try {
                    final h e4 = this.E;
                    r(e4);
                    final H1 v0 = e4.v0(c, "_npa");
                    z = Z(b1);
                    if (v0 != null) {
                        if (!"auto".equals((Object)v0.b)) {
                            break Label_0415;
                        }
                    }
                }
                finally {
                    break Label_2202;
                }
                if (z != null) {
                    long n4;
                    if (z) {
                        n4 = 1L;
                    }
                    else {
                        n4 = 0L;
                    }
                    final G1 g1 = new G1(n, n4, "_npa", "auto");
                    final H1 h1;
                    if (h1 == null || !h1.e.equals(g1.F)) {
                        this.s(g1, b1);
                    }
                }
                else {
                    final H1 h1;
                    if (h1 != null) {
                        this.y("_npa", b1);
                    }
                }
            }
            final h e5 = this.E;
            r(e5);
            A.h((Object)c);
            Object u2 = e5.u0(c);
            if (u2 != null) {
                this.d0();
                if (J1.i0(d, ((G)u2).j(), b1.S, ((G)u2).d())) {
                    this.j().K.g("New GMP App Id passed in. Removing cached database data. appId", K2.P.z(((G)u2).f()));
                    final h e6 = this.E;
                    r(e6);
                    final String f = ((G)u2).f();
                    e6.z();
                    e6.v();
                    A.e(f);
                    Label_0770: {
                        try {
                            final SQLiteDatabase d2 = e6.D();
                            u2 = new String[] { f };
                            final int delete = d2.delete("events", "app_id=?", (String[])u2);
                            try {
                                final int n5 = delete + d2.delete("user_attributes", "app_id=?", (String[])u2) + d2.delete("conditional_properties", "app_id=?", (String[])u2) + d2.delete("apps", "app_id=?", (String[])u2) + d2.delete("raw_events", "app_id=?", (String[])u2) + d2.delete("raw_events_metadata", "app_id=?", (String[])u2) + d2.delete("event_filters", "app_id=?", (String[])u2) + d2.delete("property_filters", "app_id=?", (String[])u2) + d2.delete("audience_filter_values", "app_id=?", (String[])u2) + d2.delete("consent_settings", "app_id=?", (String[])u2) + d2.delete("default_event_params", "app_id=?", (String[])u2) + d2.delete("trigger_uris", "app_id=?", (String[])u2);
                                if (n5 > 0) {
                                    e6.j().P.e(f, n5, "Deleted application data. app, records");
                                }
                                break Label_0770;
                            }
                            catch (final SQLiteException u2) {}
                        }
                        catch (final SQLiteException ex) {}
                        e6.j().H.e(K2.P.z(f), u2, "Error deleting application data. appId, error");
                    }
                    u2 = null;
                }
            }
            if (u2 != null) {
                final boolean b2 = ((G)u2).y() != -2147483648L && ((G)u2).y() != b1.L;
                final String h2 = ((G)u2).h();
                if ((((G)u2).y() == -2147483648L && h2 != null && !h2.equals((Object)b1.E)) | b2) {
                    final Bundle bundle = new Bundle();
                    ((BaseBundle)bundle).putString("_pv", h2);
                    this.o(new v("_au", new u(bundle), "auto", n), b1);
                }
            }
            this.e(b1);
            r r;
            if (p == 0) {
                final h e7 = this.E;
                r(e7);
                r = e7.t0("events", c, "_f");
            }
            else if (p == 1) {
                final h e8 = this.E;
                r(e8);
                r = e8.t0("events", c, "_v");
            }
            else {
                r = null;
            }
            if (r == null) {
                final long n6 = (n / 3600000L + 1L) * 3600000L;
                final boolean r2 = b1.R;
                if (p == 0) {
                    this.s(new G1(n, n6, "_fot", "auto"), b1);
                    this.l().v();
                    final e0 m = this.M;
                    A.h((Object)m);
                    final boolean empty = c.isEmpty();
                    final n0 a = m.a;
                    Label_1501: {
                        if (empty) {
                            final P k = a.K;
                            n0.f(k);
                            k.L.f("Install Referrer Reporter was called with invalid app package name");
                        }
                        else {
                            final k0 l = a.L;
                            final Context c4 = a.C;
                            n0.f(l);
                            l.v();
                            final boolean b3 = m.b();
                            final P i = a.K;
                            if (!b3) {
                                n0.f(i);
                                i.N.f("Install Referrer Reporter is not available");
                            }
                            else {
                                final f0 f2 = new f0(m, c);
                                final k0 j = a.L;
                                n0.f(j);
                                j.v();
                                final Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                final PackageManager packageManager = c4.getPackageManager();
                                if (packageManager == null) {
                                    n0.f(i);
                                    i.L.f("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                }
                                else {
                                    final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                        final ServiceInfo serviceInfo = ((ResolveInfo)queryIntentServices.get(0)).serviceInfo;
                                        if (serviceInfo != null) {
                                            final String packageName = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals((Object)packageName) && m.b()) {
                                                final Intent intent2 = new Intent(intent);
                                                Label_1424: {
                                                    try {
                                                        final boolean a2 = p2.a.b().a(c4, intent2, (ServiceConnection)f2, 1);
                                                        n0.f(i);
                                                        final S p2 = i.P;
                                                        if (a2) {
                                                            final String s = "available";
                                                            break Label_1424;
                                                        }
                                                        break Label_1424;
                                                    }
                                                    catch (final RuntimeException ex2) {
                                                        n0.f(i);
                                                        i.H.g("Exception occurred while binding to Install Referrer Service", ((Throwable)ex2).getMessage());
                                                        break Label_1501;
                                                        final String s = "not available";
                                                        final S p2;
                                                        p2.g("Install Referrer Service is", s);
                                                        break Label_1501;
                                                    }
                                                }
                                            }
                                            n0.f(i);
                                            i.K.f("Play Store version 8.3.73 or higher required for Install Referrer");
                                        }
                                    }
                                    else {
                                        n0.f(i);
                                        i.N.f("Play Service for fetching Install Referrer is unavailable on device");
                                    }
                                }
                            }
                        }
                    }
                    this.l().v();
                    this.f0();
                    final Bundle bundle2 = new Bundle();
                    ((BaseBundle)bundle2).putLong("_c", 1L);
                    ((BaseBundle)bundle2).putLong("_r", 1L);
                    ((BaseBundle)bundle2).putLong("_uwa", 0L);
                    ((BaseBundle)bundle2).putLong("_pfo", 0L);
                    ((BaseBundle)bundle2).putLong("_sys", 0L);
                    ((BaseBundle)bundle2).putLong("_sysu", 0L);
                    ((BaseBundle)bundle2).putLong("_et", 1L);
                    if (r2) {
                        ((BaseBundle)bundle2).putLong("_dac", 1L);
                    }
                    final h e9 = this.E;
                    r(e9);
                    A.e(c);
                    e9.v();
                    e9.z();
                    final long k2 = e9.k0(c);
                    if (c3.getPackageManager() == null) {
                        this.j().H.g("PackageManager is null, first open report might be inaccurate. appId", K2.P.z(c));
                    }
                    else {
                        PackageInfo c5;
                        try {
                            c5 = s2.b.a(c3).c(0, c);
                        }
                        catch (final PackageManager$NameNotFoundException ex3) {
                            this.j().H.e(K2.P.z(c), ex3, "Package info is null, first open report might be inaccurate. appId");
                            c5 = null;
                        }
                        if (c5 != null) {
                            final long firstInstallTime = c5.firstInstallTime;
                            if (firstInstallTime != 0L) {
                                boolean b4;
                                if (firstInstallTime != c5.lastUpdateTime) {
                                    if (this.T().G(null, w.r0)) {
                                        if (k2 == 0L) {
                                            ((BaseBundle)bundle2).putLong("_uwa", 1L);
                                        }
                                    }
                                    else {
                                        ((BaseBundle)bundle2).putLong("_uwa", 1L);
                                    }
                                    b4 = false;
                                }
                                else {
                                    b4 = true;
                                }
                                long n7;
                                if (b4) {
                                    n7 = 1L;
                                }
                                else {
                                    n7 = 0L;
                                }
                                this.s(new G1(n, n7, "_fi", "auto"), b1);
                            }
                        }
                        ApplicationInfo a3;
                        try {
                            a3 = s2.b.a(c3).a(0, c);
                        }
                        catch (final PackageManager$NameNotFoundException ex4) {
                            this.j().H.e(K2.P.z(c), ex4, "Application info is null, first open report might be inaccurate. appId");
                            a3 = null;
                        }
                        if (a3 != null) {
                            if ((a3.flags & 0x1) != 0x0) {
                                ((BaseBundle)bundle2).putLong("_sys", 1L);
                            }
                            if ((a3.flags & 0x80) != 0x0) {
                                ((BaseBundle)bundle2).putLong("_sysu", 1L);
                            }
                        }
                    }
                    if (k2 >= 0L) {
                        ((BaseBundle)bundle2).putLong("_pfo", k2);
                    }
                    this.L(new v("_f", new u(bundle2), "auto", n), b1);
                }
                else if (p == 1) {
                    this.s(new G1(n, n6, "_fvt", "auto"), b1);
                    this.l().v();
                    this.f0();
                    final Bundle bundle3 = new Bundle();
                    ((BaseBundle)bundle3).putLong("_c", 1L);
                    ((BaseBundle)bundle3).putLong("_r", 1L);
                    ((BaseBundle)bundle3).putLong("_et", 1L);
                    if (r2) {
                        ((BaseBundle)bundle3).putLong("_dac", 1L);
                    }
                    this.L(new v("_v", new u(bundle3), "auto", n), b1);
                }
            }
            else if (b1.K) {
                this.L(new v("_cd", new u(new Bundle()), "auto", n), b1);
            }
            final h e10 = this.E;
            r(e10);
            e10.J0();
            final h e11 = this.E;
            r(e11);
            e11.H0();
            return;
        }
        final h e12 = this.E;
        r(e12);
        e12.H0();
    }
    
    public final d T() {
        final n0 n = this.N;
        A.h((Object)n);
        return n.I;
    }
    
    public final void U(final B1 b1) {
        if (this.a0 != null) {
            (this.b0 = new ArrayList()).addAll((Collection)this.a0);
        }
        final h e = this.E;
        r(e);
        final String c = b1.C;
        A.h((Object)c);
        A.e(c);
        e.v();
        e.z();
        try {
            final SQLiteDatabase d = e.D();
            final String[] array = { c };
            final int n = d.delete("apps", "app_id=?", array) + d.delete("events", "app_id=?", array) + d.delete("events_snapshot", "app_id=?", array) + d.delete("user_attributes", "app_id=?", array) + d.delete("conditional_properties", "app_id=?", array) + d.delete("raw_events", "app_id=?", array) + d.delete("raw_events_metadata", "app_id=?", array) + d.delete("queue", "app_id=?", array) + d.delete("audience_filter_values", "app_id=?", array) + d.delete("main_event_params", "app_id=?", array) + d.delete("default_event_params", "app_id=?", array) + d.delete("trigger_uris", "app_id=?", array) + d.delete("upload_queue", "app_id=?", array);
            if (n > 0) {
                e.j().P.e(c, n, "Reset analytics data. app, records");
            }
        }
        catch (final SQLiteException ex) {
            e.j().H.e(K2.P.z(c), ex, "Error resetting analytics data. appId, error");
        }
        if (b1.J) {
            this.S(b1);
        }
    }
    
    public final void V(final String s) {
        this.l().v();
        this.f0();
        this.X = true;
        Label_0515: {
            Boolean g;
            try {
                g = this.N.r().G;
                if (g == null) {
                    this.j().K.f("Upload data called on the client side before use of service was decided");
                    this.X = false;
                    this.F();
                    return;
                }
            }
            finally {
                break Label_0515;
            }
            if (g) {
                this.j().H.f("Upload called in the client side when service should be used");
                this.X = false;
                this.F();
                return;
            }
            if (this.Q > 0L) {
                this.H();
                this.X = false;
                this.F();
                return;
            }
            final T d = this.D;
            r(d);
            if (!d.m0()) {
                this.j().P.f("Network not connected, ignoring upload request");
                this.H();
                this.X = false;
                this.F();
                return;
            }
            final h e = this.E;
            r(e);
            if (!e.G0(s)) {
                this.j().P.g("Upload queue has no batches for appId", s);
                this.X = false;
                this.F();
                return;
            }
            final h e2 = this.E;
            r(e2);
            final E1 a0 = e2.A0(s);
            if (a0 == null) {
                this.X = false;
                this.F();
                return;
            }
            final l1 b = a0.b;
            if (b == null) {
                this.X = false;
                this.F();
                return;
            }
            final T i = this.I;
            r(i);
            final String m = i.M(b);
            final byte[] c = ((S1)b).c();
            this.j().P.h("Uploading data from upload queue. appId, uncompressed size, data", s, c.length, m);
            P3.a();
            if (this.T().G(null, w.E0)) {
                this.W = true;
                final T d2 = this.D;
                r(d2);
                d2.X(s, new z1(a0.c, a0.d, a0.e), b, (V)new D1(this, s, a0, 0));
            }
            else {
                try {
                    this.W = true;
                    final T d3 = this.D;
                    r(d3);
                    final URL url = new URL(a0.c);
                    final HashMap d4 = a0.d;
                    final D1 d5 = new D1(this, s, a0, 1);
                    d3.v();
                    d3.z();
                    d3.l().C((Runnable)new W(d3, s, url, c, (Map)d4, (V)d5));
                }
                catch (final MalformedURLException ex) {
                    this.j().H.e(K2.P.z(s), a0.c, "Failed to parse URL. Not uploading MeasurementBatch. appId");
                }
            }
            this.X = false;
            this.F();
            return;
        }
        this.X = false;
        this.F();
    }
    
    public final h W() {
        final h e = this.E;
        r(e);
        return e;
    }
    
    public final void X(final B1 b1) {
        this.l().v();
        this.f0();
        A.e(b1.C);
        final n b2 = n.b(b1.d0);
        final S p = this.j().P;
        final String c = b1.C;
        p.e(c, b2, "Setting DMA consent for package");
        this.l().v();
        this.f0();
        final B0 d = n.a(100, this.g(c)).d();
        this.e0.put((Object)c, (Object)b2);
        final h e = this.E;
        r(e);
        A.h((Object)c);
        A.h((Object)b2);
        e.v();
        e.z();
        if (((n0)e.C).I.G(null, w.Q0)) {
            final z0 y0 = e.y0(c);
            final z0 c2 = z0.c;
            if (y0 == c2) {
                e.n0(c, c2);
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c);
        contentValues.put("dma_consent_settings", b2.b);
        e.R(contentValues);
        final B0 d2 = n.a(100, this.g(c)).d();
        this.l().v();
        this.f0();
        final B0 f = B0.F;
        final B0 g = B0.G;
        final int n = 0;
        boolean b3;
        if (d == f && d2 == g) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        final boolean b4 = d == g && d2 == f;
        int n2 = b3 ? 1 : 0;
        if (this.T().G(null, w.P0)) {
            int n3 = 0;
            Label_0317: {
                if (!b3) {
                    n3 = n;
                    if (!b4) {
                        break Label_0317;
                    }
                }
                n3 = 1;
            }
            n2 = n3;
        }
        if (n2 != 0) {
            this.j().P.g("Generated _dcu event for", c);
            final Bundle bundle = new Bundle();
            final h e2 = this.E;
            r(e2);
            if (e2.J(this.h0(), c, false, false, false, false).f < this.T().A(c, w.Y)) {
                ((BaseBundle)bundle).putLong("_r", 1L);
                final h e3 = this.E;
                r(e3);
                this.j().P.e(c, e3.J(this.h0(), c, false, false, true, false).f, "_dcu realtime event count");
            }
            this.i0.b0(c, "_dcu", bundle);
        }
    }
    
    public final void Y(final B1 b1) {
        this.l().v();
        this.f0();
        A.e(b1.C);
        final z0 c = z0.c(b1.c0, b1.X);
        final String c2 = b1.C;
        final z0 j = this.J(c2);
        this.j().P.e(c2, c, "Setting storage consent for package");
        this.l().v();
        this.f0();
        this.d0.put((Object)c2, (Object)c);
        final h e = this.E;
        r(e);
        e.n0(c2, c);
        a3.a();
        if (!this.T().G(null, w.X0) && c.k(j, (y0[])c.a.keySet().toArray((Object[])new y0[0]))) {
            this.U(b1);
        }
    }
    
    public final Context a() {
        return this.N.C;
    }
    
    public final h0 a0() {
        final h0 c = this.C;
        r(c);
        return c;
    }
    
    public final int b(final String s, final f f) {
        final h0 c = this.C;
        final I0 l = c.L(s);
        final y0 g = y0.G;
        if (l == null) {
            f.s(g, K2.g.L);
            return 1;
        }
        final h e = this.E;
        r(e);
        final G u0 = e.u0(s);
        if (u0 != null && b.C(u0.k()).D == B0.E) {
            final B0 e2 = c.E(s, g);
            if (e2 != B0.D) {
                f.s(g, K2.g.K);
                if (e2 == B0.G) {
                    return 0;
                }
                return 1;
            }
        }
        f.s(g, K2.g.E);
        if (c.N(s, g)) {
            return 0;
        }
        return 1;
    }
    
    public final n c(String join, final n n, final z0 z0, final f f) {
        final h0 c = this.C;
        r(c);
        final I0 l = c.L(join);
        final B0 f2 = B0.F;
        final y0 f3 = y0.F;
        int n2 = 90;
        if (l == null) {
            if (n.d() == f2) {
                n2 = n.a;
                f.r(f3, n2);
            }
            else {
                f.s(f3, g.L);
            }
            return new n(Boolean.FALSE, n2, Boolean.TRUE, "-");
        }
        final B0 d = n.d();
        final B0 g = B0.G;
        final boolean b = true;
        B0 d2 = null;
        Label_0395: {
            if (d != g && d != f2) {
                final B0 e = B0.E;
                d2 = B0.D;
                if (d == e) {
                    final B0 e2 = c.E(join, f3);
                    if (e2 != d2) {
                        f.s(f3, K2.g.K);
                        d2 = e2;
                        break Label_0395;
                    }
                }
                c.v();
                c.T(join);
                final I0 i = c.L(join);
                final y0 y0 = null;
                y0 d3 = null;
                Label_0268: {
                    if (i == null) {
                        d3 = y0;
                    }
                    else {
                        final Iterator iterator = i.r().iterator();
                        G0 g2;
                        do {
                            d3 = y0;
                            if (!iterator.hasNext()) {
                                break Label_0268;
                            }
                            g2 = (G0)iterator.next();
                        } while (f3 != K2.h0.D(g2.p()));
                        d3 = K2.h0.D(g2.o());
                    }
                }
                final y0 d4 = K2.y0.D;
                final B0 b2 = (B0)z0.a.get((Object)d4);
                if (b2 != null) {
                    d2 = b2;
                }
                final boolean b3 = d2 == g || d2 == f2;
                if (d3 == d4 && b3) {
                    f.s(f3, K2.g.F);
                }
                else {
                    f.s(f3, K2.g.E);
                    if (c.N(join, f3)) {
                        d2 = g;
                    }
                    else {
                        d2 = f2;
                    }
                }
            }
            else {
                n2 = n.a;
                f.r(f3, n2);
                d2 = d;
            }
        }
        c.v();
        c.T(join);
        final I0 j = c.L(join);
        boolean b4;
        if (j == null) {
            b4 = b;
        }
        else {
            b4 = b;
            if (j.u()) {
                b4 = (j.t() && b);
            }
        }
        r(c);
        c.v();
        c.T(join);
        final TreeSet set = new TreeSet();
        final I0 k = c.L(join);
        if (k != null) {
            final Iterator iterator2 = ((List)k.p()).iterator();
            while (iterator2.hasNext()) {
                set.add((Object)((H0)iterator2.next()).o());
            }
        }
        if (d2 != f2 && !set.isEmpty()) {
            final Boolean true = Boolean.TRUE;
            join = "";
            if (b4) {
                join = TextUtils.join((CharSequence)"", (Iterable)set);
            }
            return new n(true, n2, b4, join);
        }
        return new n(Boolean.FALSE, n2, b4, "-");
    }
    
    public final T c0() {
        final T i = this.I;
        r(i);
        return i;
    }
    
    public final q2.a d() {
        final n0 n = this.N;
        A.h((Object)n);
        return n.P;
    }
    
    public final J1 d0() {
        final n0 n = this.N;
        A.h((Object)n);
        final J1 n2 = n.N;
        n0.c(n2);
        return n2;
    }
    
    public final G e(final B1 b1) {
        this.l().v();
        this.f0();
        A.h((Object)b1);
        final String c = b1.C;
        A.e(c);
        final String y = b1.Y;
        if (!y.isEmpty()) {
            this.f0.put((Object)c, (Object)new x1(this, y));
        }
        final h e = this.E;
        r(e);
        final G u0 = e.u0(c);
        final z0 d = this.J(c).d(z0.c(100, b1.X));
        final y0 d2 = y0.D;
        final boolean i = d.i(d2);
        final boolean q = b1.Q;
        String c2;
        if (i) {
            c2 = this.K.C(c, q);
        }
        else {
            c2 = "";
        }
        final y0 e2 = y0.E;
        final boolean b2 = true;
        G g2 = null;
        boolean b4 = false;
        Label_0657: {
            Label_0219: {
                if (u0 == null) {
                    final G g = new G(this.N, c);
                    if (d.i(e2)) {
                        g.r(this.k(d));
                    }
                    g2 = g;
                    if (d.i(d2)) {
                        g.G(c2);
                        g2 = g;
                    }
                }
                else {
                    if (d.i(d2) && c2 != null) {
                        final n0 a = u0.a;
                        final k0 l = a.L;
                        n0.f(l);
                        l.v();
                        if (!c2.equals((Object)u0.e)) {
                            final k0 j = a.L;
                            n0.f(j);
                            j.v();
                            final boolean empty = TextUtils.isEmpty((CharSequence)u0.e);
                            u0.G(c2);
                            if (q) {
                                final k1 k = this.K;
                                k.getClass();
                                Pair d3;
                                if (d.i(d2)) {
                                    d3 = k.D(c);
                                }
                                else {
                                    d3 = new Pair((Object)"", (Object)Boolean.FALSE);
                                }
                                if (!"00000000-0000-0000-0000-000000000000".equals(d3.first) && !empty) {
                                    a3.a();
                                    boolean b3;
                                    if (this.T().G(null, w.X0) && !d.i(e2)) {
                                        b3 = true;
                                    }
                                    else {
                                        u0.r(this.k(d));
                                        b3 = false;
                                    }
                                    final h e3 = this.E;
                                    r(e3);
                                    g2 = u0;
                                    b4 = b3;
                                    if (e3.v0(c, "_id") == null) {
                                        break Label_0657;
                                    }
                                    final h e4 = this.E;
                                    r(e4);
                                    g2 = u0;
                                    b4 = b3;
                                    if (e4.v0(c, "_lair") == null) {
                                        this.d().getClass();
                                        final H1 h1 = new H1(b1.C, "auto", "_lair", System.currentTimeMillis(), 1L);
                                        final h e5 = this.E;
                                        r(e5);
                                        e5.f0(h1);
                                        g2 = u0;
                                        b4 = b3;
                                    }
                                    break Label_0657;
                                }
                            }
                            g2 = u0;
                            if (!TextUtils.isEmpty((CharSequence)u0.g())) {
                                break Label_0219;
                            }
                            g2 = u0;
                            if (d.i(e2)) {
                                u0.r(this.k(d));
                                g2 = u0;
                            }
                            break Label_0219;
                        }
                    }
                    g2 = u0;
                    if (TextUtils.isEmpty((CharSequence)u0.g())) {
                        g2 = u0;
                        if (d.i(e2)) {
                            u0.r(this.k(d));
                            g2 = u0;
                        }
                    }
                }
            }
            b4 = false;
        }
        g2.C(b1.D);
        g2.b(b1.S);
        final String m = b1.M;
        if (!TextUtils.isEmpty((CharSequence)m)) {
            g2.A(m);
        }
        final long g3 = b1.G;
        if (g3 != 0L) {
            g2.M(g3);
        }
        final String e6 = b1.E;
        if (!TextUtils.isEmpty((CharSequence)e6)) {
            g2.x(e6);
        }
        g2.q(b1.L);
        final String f = b1.F;
        if (f != null) {
            g2.v(f);
        }
        g2.J(b1.H);
        g2.s(b1.J);
        final String i2 = b1.I;
        if (!TextUtils.isEmpty((CharSequence)i2)) {
            g2.E(i2);
        }
        final n0 a2 = g2.a;
        final k0 l2 = a2.L;
        n0.f(l2);
        l2.v();
        g2.Q |= (g2.p != q);
        g2.p = q;
        final k0 l3 = a2.L;
        n0.f(l3);
        l3.v();
        final boolean q2 = g2.Q;
        final Boolean r = g2.r;
        final Boolean t = b1.T;
        g2.Q = (q2 | (Objects.equals((Object)r, (Object)t) ^ true));
        g2.r = t;
        g2.K(b1.U);
        final k0 l4 = a2.L;
        n0.f(l4);
        l4.v();
        final boolean q3 = g2.Q;
        final String u2 = g2.u;
        final String z = b1.Z;
        g2.Q = (q3 | (Objects.equals((Object)u2, (Object)z) ^ true));
        g2.u = z;
        m3.D.get();
        if (this.T().G(null, w.u0)) {
            g2.c(b1.V);
        }
        else {
            m3.D.get();
            if (this.T().G(null, w.t0)) {
                g2.c(null);
            }
        }
        i4.a();
        if (this.T().G(null, w.w0)) {
            this.d0();
            if (J1.y0(g2.f())) {
                final k0 l5 = a2.L;
                n0.f(l5);
                l5.v();
                final boolean q4 = g2.Q;
                final boolean v = g2.v;
                final boolean a3 = b1.a0;
                g2.Q = (q4 | v != a3);
                g2.v = a3;
                if (this.T().G(null, w.x0)) {
                    final k0 l6 = a2.L;
                    n0.f(l6);
                    l6.v();
                    final boolean q5 = g2.Q;
                    final String d4 = g2.D;
                    final String g4 = b1.g0;
                    g2.Q = (q5 | d4 != g4);
                    g2.D = g4;
                }
            }
        }
        com.google.android.gms.internal.measurement.b4.a();
        if (this.T().G(null, w.G0)) {
            final k0 l7 = a2.L;
            n0.f(l7);
            l7.v();
            final boolean q6 = g2.Q;
            final int y2 = g2.y;
            final int e7 = b1.e0;
            g2.Q = (q6 | y2 != e7);
            g2.y = e7;
        }
        g2.T(b1.b0);
        final k0 l8 = a2.L;
        n0.f(l8);
        l8.v();
        final boolean q7 = g2.Q;
        final String h2 = g2.H;
        final String h3 = b1.h0;
        g2.Q = (q7 | (h2 != h3 && b2));
        g2.H = h3;
        a3.a();
        if (this.T().G(null, w.X0)) {
            if (g2.n() || b4) {
                final h e8 = this.E;
                r(e8);
                e8.Q(g2, b4);
            }
        }
        else if (g2.n()) {
            final h e9 = this.E;
            r(e9);
            e9.Q(g2, false);
        }
        return g2;
    }
    
    public final void e0() {
        this.l().v();
        this.f0();
        if (!this.P) {
            this.P = true;
            this.l().v();
            final FileLock y = this.Y;
            final n0 n = this.N;
            Label_0624: {
                Label_0606: {
                    Label_0588: {
                        Label_0168: {
                            if (y != null && y.isValid()) {
                                this.j().P.f("Storage concurrent access okay");
                                break Label_0168;
                            }
                            final File filesDir = n.C.getFilesDir();
                            final int d = com.google.android.gms.internal.measurement.K.d;
                            final File file = new File(new File(filesDir, "google_app_measurement.db").getPath());
                            try {
                                final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
                                this.Z = channel;
                                final FileLock tryLock = channel.tryLock();
                                this.Y = tryLock;
                                if (tryLock != null) {
                                    this.j().P.f("Storage concurrent access okay");
                                    final FileChannel z = this.Z;
                                    this.l().v();
                                    final int n2 = 0;
                                    int int1 = 0;
                                    Label_0309: {
                                        if (z != null && ((AbstractInterruptibleChannel)z).isOpen()) {
                                            final ByteBuffer allocate = ByteBuffer.allocate(4);
                                            Label_0274: {
                                                try {
                                                    z.position(0L);
                                                    final int read = z.read(allocate);
                                                    if (read != 4) {
                                                        int1 = n2;
                                                        if (read != -1) {
                                                            this.j().K.g("Unexpected data length. Bytes read", read);
                                                            int1 = n2;
                                                        }
                                                        break Label_0309;
                                                    }
                                                }
                                                catch (final IOException ex) {
                                                    break Label_0274;
                                                }
                                                allocate.flip();
                                                int1 = allocate.getInt();
                                                break Label_0309;
                                            }
                                            final IOException ex;
                                            this.j().H.g("Failed to read from channel", ex);
                                            int1 = n2;
                                        }
                                        else {
                                            this.j().H.f("Bad channel to read from");
                                            int1 = n2;
                                        }
                                    }
                                    final K2.K o = n.o();
                                    o.z();
                                    final int g = o.G;
                                    this.l().v();
                                    if (int1 > g) {
                                        this.j().H.e(int1, g, "Panic: can't downgrade version. Previous, current version");
                                        return;
                                    }
                                    if (int1 < g) {
                                        final FileChannel z2 = this.Z;
                                        this.l().v();
                                        if (z2 != null && ((AbstractInterruptibleChannel)z2).isOpen()) {
                                            final ByteBuffer allocate2 = ByteBuffer.allocate(4);
                                            allocate2.putInt(g);
                                            allocate2.flip();
                                            Label_0502: {
                                                try {
                                                    z2.truncate(0L);
                                                    z2.write(allocate2);
                                                    z2.force(true);
                                                    if (z2.size() != 4L) {
                                                        this.j().H.g("Error writing to channel. Bytes written", z2.size());
                                                    }
                                                }
                                                catch (final IOException ex2) {
                                                    break Label_0502;
                                                }
                                                this.j().P.e(int1, g, "Storage version upgraded. Previous, current version");
                                                return;
                                            }
                                            final IOException ex2;
                                            this.j().H.g("Failed to write to channel", ex2);
                                        }
                                        else {
                                            this.j().H.f("Bad channel to read from");
                                        }
                                        this.j().H.e(int1, g, "Storage version upgrade failed. Previous, current version");
                                    }
                                    return;
                                }
                            }
                            catch (final OverlappingFileLockException ex3) {
                                break Label_0588;
                            }
                            catch (final IOException ex4) {
                                break Label_0606;
                            }
                            catch (final FileNotFoundException ex5) {
                                break Label_0624;
                            }
                        }
                        this.j().H.f("Storage concurrent data access panic");
                        return;
                    }
                    final OverlappingFileLockException ex3;
                    this.j().K.g("Storage lock already acquired", ex3);
                    return;
                }
                final IOException ex4;
                this.j().H.g("Failed to access storage lock file", ex4);
                return;
            }
            final FileNotFoundException ex5;
            this.j().H.g("Failed to acquire storage lock", ex5);
        }
    }
    
    public final void f0() {
        if (this.O) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }
    
    public final Bundle g(final String s) {
        this.l().v();
        this.f0();
        final h0 c = this.C;
        r(c);
        if (c.L(s) == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final z0 j = this.J(s);
        final Bundle bundle2 = new Bundle();
        final Iterator iterator = j.a.entrySet().iterator();
        String s2;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            s2 = "denied";
            if (!hasNext) {
                break;
            }
            final Map$Entry map$Entry = (Map$Entry)iterator.next();
            final int ordinal = ((B0)map$Entry.getValue()).ordinal();
            String s3 = s2;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    s3 = null;
                }
                else {
                    s3 = "granted";
                }
            }
            if (s3 == null) {
                continue;
            }
            ((BaseBundle)bundle2).putString(((y0)map$Entry.getKey()).C, s3);
        }
        bundle.putAll(bundle2);
        final n c2 = this.c(s, this.R(s), j, new f(17));
        final Bundle bundle3 = new Bundle();
        for (final Map$Entry map$Entry2 : c2.e.entrySet()) {
            final int ordinal2 = ((B0)map$Entry2.getValue()).ordinal();
            String s4;
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    s4 = null;
                }
                else {
                    s4 = "granted";
                }
            }
            else {
                s4 = "denied";
            }
            if (s4 != null) {
                ((BaseBundle)bundle3).putString(((y0)map$Entry2.getKey()).C, s4);
            }
        }
        final Boolean c3 = c2.c;
        if (c3 != null) {
            ((BaseBundle)bundle3).putString("is_dma_region", c3.toString());
        }
        final String d = c2.d;
        if (d != null) {
            ((BaseBundle)bundle3).putString("cps_display_str", d);
        }
        bundle.putAll(bundle3);
        final h e = this.E;
        r(e);
        final H1 v0 = e.v0(s, "_npa");
        int n;
        if (v0 != null) {
            n = (v0.e.equals(1L) ? 1 : 0);
        }
        else {
            n = this.b(s, new f(17));
        }
        if (n != 1) {
            s2 = "granted";
        }
        ((BaseBundle)bundle).putString("ad_personalization", s2);
        return bundle;
    }
    
    public final void g0() {
        int n;
        Boolean g;
        int n2 = 0;
        long n3 = 0L;
        T d;
        int a;
        long longValue;
        int i = 0;
        long a2;
        h e;
        String e2 = null;
        h e3;
        int max;
        h e4;
        List n4;
        z0 j;
        y0 d2;
        List subList;
        Iterator iterator;
        n1 n5;
        String p;
        n1 n6;
        com.google.android.gms.internal.measurement.k1 w = null;
        int size;
        ArrayList list = null;
        boolean k;
        boolean l;
        z1 z = null;
        int n7;
        List list2;
        m1 m1 = null;
        String p2;
        final Object o2;
        Object o;
        ArrayList list3;
        Iterator iterator2;
        boolean b;
        Long value;
        Long n8;
        boolean b2;
        f1 f1;
        Long n9;
        Long value2;
        i1 k2;
        i1 k3;
        long n10;
        int n11;
        int n12;
        byte[] c;
        T i2;
        long d3;
        l1 l2;
        ArrayList list4;
        l1 l3;
        Iterator iterator3;
        String string;
        l1 l4;
        com.google.android.gms.internal.measurement.k1 p3;
        h0 c2;
        String q;
        ArrayList list5;
        Iterator iterator4;
        m1 q2;
        d t;
        F b3;
        S p4;
        String j2;
        l1 l5;
        l1 l6;
        com.google.android.gms.internal.measurement.k1 w2;
        m1 b4;
        String j3;
        int r0;
        l1 l7;
        String q3;
        Uri parse;
        Uri$Builder buildUpon;
        String authority;
        StringBuilder sb;
        z1 z2;
        String m2;
        byte[] c3;
        boolean y;
        String s;
        T d4;
        T d5;
        URL url;
        Object o3;
        A1 a3;
        k0 l8;
        String l9;
        G u0;
        h w3;
        Label_2514:Label_2703_Outer:
        while (true) {
        Label_0798_Outer:
            while (true) {
                this.l().v();
                this.f0();
                this.X = true;
                n = 0;
                while (true) {
                    Label_1406: {
                        Label_1103: {
                            while (true) {
                                try {
                                    g = this.N.r().G;
                                    if (g == null) {
                                        try {
                                            this.j().K.f("Upload data called on the client side before use of service was decided");
                                            this.X = false;
                                            this.F();
                                            return;
                                        }
                                        finally {
                                            break Label_2514;
                                        }
                                    }
                                    n2 = (((boolean)g) ? 1 : 0);
                                    if (n2 != 0) {
                                        this.j().H.f("Upload called in the client side when service should be used");
                                        this.X = false;
                                        this.F();
                                        return;
                                    }
                                    n3 = this.Q;
                                    if (n3 > 0L) {
                                        this.H();
                                        this.X = false;
                                        this.F();
                                        return;
                                    }
                                    this.l().v();
                                    if (this.a0 != null) {
                                        this.j().P.f("Uploading requested multiple times");
                                        this.X = false;
                                        this.F();
                                        return;
                                    }
                                    d = this.D;
                                    r(d);
                                    n2 = (d.m0() ? 1 : 0);
                                    if (n2 == 0) {
                                        this.j().P.f("Network not connected, ignoring upload request");
                                        this.H();
                                        this.X = false;
                                        this.F();
                                        return;
                                    }
                                    this.d().getClass();
                                    n3 = System.currentTimeMillis();
                                    a = this.T().A(null, K2.w.U);
                                    this.T();
                                    longValue = (long)K2.w.e.a(null);
                                    for (i = 0; i < a; ++i) {
                                        n2 = (this.D(null, n3 - longValue) ? 1 : 0);
                                        if (n2 == 0) {
                                            break;
                                        }
                                    }
                                    com.google.android.gms.internal.measurement.b4.a();
                                    this.G();
                                    a2 = this.K.J.a();
                                    if (a2 != 0L) {
                                        this.j().O.g("Uploading events. Elapsed time since last upload attempt (ms)", Math.abs(n3 - a2));
                                    }
                                    e = this.E;
                                    r(e);
                                    e2 = e.E();
                                    if (TextUtils.isEmpty((CharSequence)e2)) {
                                        break Label_2514;
                                    }
                                    if (this.c0 == -1L) {
                                        e3 = this.E;
                                        r(e3);
                                        this.c0 = e3.C();
                                    }
                                    i = this.T().A(e2, K2.w.h);
                                    max = Math.max(0, this.T().A(e2, K2.w.i));
                                    e4 = this.E;
                                    r(e4);
                                    n4 = e4.N(i, e2, max);
                                    if (n4.isEmpty()) {
                                        break Label_2514;
                                    }
                                    j = this.J(e2);
                                    d2 = y0.D;
                                    n2 = (j.i(d2) ? 1 : 0);
                                    subList = n4;
                                    Label_0646: {
                                        if (n2 != 0) {
                                            iterator = n4.iterator();
                                            while (true) {
                                                while (iterator.hasNext()) {
                                                    n5 = (n1)((Pair)iterator.next()).first;
                                                    if (!n5.P().isEmpty()) {
                                                        p = n5.P();
                                                        subList = n4;
                                                        if (p == null) {
                                                            break Label_0646;
                                                        }
                                                        i = 0;
                                                        while (true) {
                                                            subList = n4;
                                                            if (i >= n4.size()) {
                                                                break Label_0646;
                                                            }
                                                            n6 = (n1)((Pair)n4.get(i)).first;
                                                            if (!n6.P().isEmpty() && !n6.P().equals((Object)p)) {
                                                                subList = n4.subList(0, i);
                                                                break Label_0646;
                                                            }
                                                            ++i;
                                                        }
                                                    }
                                                }
                                                p = null;
                                                continue Label_0798_Outer;
                                            }
                                        }
                                    }
                                    w = l1.w();
                                    size = subList.size();
                                    list = new ArrayList(subList.size());
                                    n2 = ("1".equals((Object)this.T().F.c(e2, "gaia_collection_enabled")) ? 1 : 0);
                                    Label_0731: {
                                        if (n2 != 0) {
                                            n2 = (this.J(e2).i(d2) ? 1 : 0);
                                            if (n2 != 0) {
                                                i = 1;
                                                break Label_0731;
                                            }
                                        }
                                        i = 0;
                                    }
                                    k = this.J(e2).i(d2);
                                    l = this.J(e2).i(y0.E);
                                    c4.D.get();
                                    n2 = (this.T().G(e2, K2.w.v0) ? 1 : 0);
                                    z = this.L.z(e2);
                                    n7 = i;
                                    i = size;
                                    list2 = subList;
                                    if (n >= i) {
                                        break;
                                    }
                                    m1 = (m1)((g2)((Pair)list2.get(n)).first).l();
                                    list.add((Object)((Pair)list2.get(n)).second);
                                    this.T();
                                    ((f2)m1).f();
                                    n1.I1((n1)((f2)m1).D);
                                    ((f2)m1).f();
                                    n1.D1((n1)((f2)m1).D, n3);
                                    ((f2)m1).f();
                                    n1.X0((n1)((f2)m1).D);
                                    if (n7 == 0) {
                                        ((f2)m1).f();
                                        n1.Z0((n1)((f2)m1).D);
                                    }
                                    if (!k) {
                                        ((f2)m1).f();
                                        n1.C1((n1)((f2)m1).D);
                                        ((f2)m1).f();
                                        n1.o1((n1)((f2)m1).D);
                                    }
                                    if (!l) {
                                        ((f2)m1).f();
                                        n1.e0((n1)((f2)m1).D);
                                    }
                                    this.w(m1, e2);
                                    if (n2 == 0) {
                                        ((f2)m1).f();
                                        n1.G1((n1)((f2)m1).D);
                                    }
                                    com.google.android.gms.internal.measurement.a3.a();
                                    if (this.T().G(null, K2.w.Y0) && !l) {
                                        ((f2)m1).f();
                                        n1.J0((n1)((f2)m1).D);
                                    }
                                    p2 = ((n1)((f2)m1).D).P();
                                    if (!TextUtils.isEmpty((CharSequence)p2) && !p2.equals((Object)"00000000-0000-0000-0000-000000000000")) {
                                        break Label_1406;
                                    }
                                    break Label_1103;
                                    break Label_2514;
                                }
                                finally {}
                                o = o2;
                                continue Label_2703_Outer;
                            }
                        }
                        list3 = new ArrayList((Collection)m1.q());
                        iterator2 = list3.iterator();
                        b = false;
                        value = null;
                        n8 = null;
                        b2 = false;
                        while (iterator2.hasNext()) {
                            f1 = (f1)iterator2.next();
                            if ("_fx".equals((Object)f1.C())) {
                                iterator2.remove();
                                b = true;
                                b2 = true;
                            }
                            else {
                                n9 = value;
                                value2 = n8;
                                if ("_f".equals((Object)f1.C())) {
                                    n9 = value;
                                    value2 = n8;
                                    if (this.T().G(null, K2.w.V0)) {
                                        this.c0();
                                        k2 = K2.T.K(f1, "_pfo");
                                        if (k2 != null) {
                                            value = k2.A();
                                        }
                                        this.c0();
                                        k3 = K2.T.K(f1, "_uwa");
                                        n9 = value;
                                        value2 = n8;
                                        if (k3 != null) {
                                            value2 = k3.A();
                                            n9 = value;
                                        }
                                    }
                                    b2 = true;
                                }
                                value = n9;
                                n8 = value2;
                            }
                        }
                        n10 = n3;
                        n11 = i;
                        n12 = n2;
                        if (b) {
                            ((f2)m1).f();
                            n1.e1((n1)((f2)m1).D);
                            ((f2)m1).f();
                            n1.i0((n1)((f2)m1).D, list3);
                        }
                        i = n11;
                        n2 = n12;
                        n3 = n10;
                        if (b2) {
                            this.A(m1.X(), true, value, n8);
                            n3 = n10;
                            n2 = n12;
                            i = n11;
                        }
                    }
                    if (m1.t() != 0) {
                        if (this.T().G(e2, K2.w.l0)) {
                            c = ((S1)((f2)m1).d()).c();
                            i2 = this.I;
                            r(i2);
                            d3 = i2.D(c);
                            ((f2)m1).f();
                            n1.u((n1)((f2)m1).D, d3);
                        }
                        ((f2)w).f();
                        l1.r((l1)((f2)w).D, (n1)((f2)m1).d());
                    }
                    ++n;
                    continue Label_2703_Outer;
                }
            }
            if (((l1)((f2)w).D).o() == 0) {
                this.E(list);
                this.B(false, 204, null, null, e2, Collections.emptyList());
                this.X = false;
                this.F();
                return;
            }
            l2 = (l1)((f2)w).d();
            list4 = new ArrayList();
            l3 = l2;
            Label_2343: {
                if (this.T().G(null, K2.w.w0)) {
                    this.d0();
                    l3 = l2;
                    if (J1.y0(e2)) {
                        l3 = l2;
                        if (z.c == 3) {
                            iterator3 = ((l1)((f2)w).d()).z().iterator();
                            while (true) {
                                while (iterator3.hasNext()) {
                                    if (((n1)iterator3.next()).r0()) {
                                        string = UUID.randomUUID().toString();
                                        l4 = (l1)((f2)w).d();
                                        this.l().v();
                                        this.f0();
                                        p3 = l1.p(l4);
                                        if (!TextUtils.isEmpty((CharSequence)string)) {
                                            ((f2)p3).f();
                                            l1.s((l1)((f2)p3).D, string);
                                        }
                                        c2 = this.C;
                                        r(c2);
                                        q = c2.Q(e2);
                                        if (!TextUtils.isEmpty((CharSequence)q)) {
                                            ((f2)p3).f();
                                            l1.v((l1)((f2)p3).D, q);
                                        }
                                        list5 = new ArrayList();
                                        iterator4 = l4.z().iterator();
                                        while (iterator4.hasNext()) {
                                            q2 = n1.q((n1)iterator4.next());
                                            ((f2)q2).f();
                                            n1.Z0((n1)((f2)q2).D);
                                            list5.add((Object)((f2)q2).d());
                                        }
                                        ((f2)p3).f();
                                        l1.u((l1)((f2)p3).D);
                                        ((f2)p3).f();
                                        l1.t((l1)((f2)p3).D, list5);
                                        t = this.T();
                                        b3 = K2.w.B0;
                                        if (t.y(b3)) {
                                            p4 = this.j().P;
                                            if (TextUtils.isEmpty((CharSequence)string)) {
                                                j2 = "null";
                                            }
                                            else {
                                                j2 = p3.j();
                                            }
                                            p4.g("Processed MeasurementBatch for sGTM with sgtmJoinId: ", j2);
                                        }
                                        else {
                                            this.j().H().f("Processed MeasurementBatch for sGTM.");
                                        }
                                        l5 = (l1)((f2)p3).d();
                                        if (!TextUtils.isEmpty((CharSequence)string) && this.T().y(b3)) {
                                            l6 = (l1)((f2)w).d();
                                            this.l().v();
                                            this.f0();
                                            w2 = l1.w();
                                            this.j().H().g("Processing Google Signal, sgtmJoinId:", string);
                                            ((f2)w2).f();
                                            l1.s((l1)((f2)w2).D, string);
                                            for (final n1 n13 : l6.z()) {
                                                b4 = n1.b2();
                                                j3 = n13.J();
                                                ((f2)b4).f();
                                                n1.A1((n1)((f2)b4).D, j3);
                                                r0 = n13.R0();
                                                ((f2)b4).f();
                                                n1.f1((n1)((f2)b4).D, r0);
                                                ((f2)w2).f();
                                                l1.r((l1)((f2)w2).D, (n1)((f2)b4).d());
                                            }
                                            l7 = (l1)((f2)w2).d();
                                            q3 = this.L.y().Q(e2);
                                            if (!TextUtils.isEmpty((CharSequence)q3)) {
                                                parse = Uri.parse((String)K2.w.s.a(null));
                                                buildUpon = parse.buildUpon();
                                                authority = parse.getAuthority();
                                                sb = new StringBuilder();
                                                sb.append(q3);
                                                sb.append(".");
                                                sb.append(authority);
                                                buildUpon.authority(sb.toString());
                                                z2 = new z1(buildUpon.build().toString(), 2);
                                            }
                                            else {
                                                z2 = new z1((String)K2.w.s.a(null), 2);
                                            }
                                            list4.add((Object)Pair.create((Object)l7, (Object)z2));
                                        }
                                        l3 = l5;
                                        break Label_2343;
                                    }
                                }
                                string = null;
                                continue Label_2703_Outer;
                            }
                        }
                    }
                }
            }
            if (this.j().D(2)) {
                m2 = this.c0().M(l3);
            }
            else {
                m2 = null;
            }
            this.c0();
            c3 = ((S1)l3).c();
            P3.a();
            y = this.T().y(K2.w.E0);
            s = "?";
            if (y) {
                this.E(list);
                this.K.K.b(n3);
                if (i > 0) {
                    s = ((l1)((f2)w).D).q().d2();
                }
                this.j().H().h("Uploading data. app, uncompressed size, data", s, c3.length, m2);
                this.W = true;
                d4 = this.D;
                r(d4);
                d4.X(e2, z, l3, (V)new A1(this, e2, list4, 0));
                break Label_2514;
            }
            while (true) {
                try {
                    this.E(list);
                    this.K.K.b(n3);
                    if (i > 0) {
                        s = ((l1)((f2)w).D).q().d2();
                    }
                }
                catch (final MalformedURLException ex) {
                    break Label_2703;
                }
                this.j().H().h("Uploading data. app, uncompressed size, data", s, c3.length, m2);
                this.W = true;
                d5 = this.D;
                r(d5);
                url = new URL(z.a);
                if ((o3 = z.b) == null) {
                    o3 = Collections.emptyMap();
                }
                Label_2803: {
                    Label_2638: {
                        break Label_2638;
                        break Label_2803;
                    }
                    a3 = new A1(this, e2, list4, 1);
                    d5.v();
                    d5.z();
                    l8 = d5.l();
                    try {
                        l8.C((Runnable)new W(d5, e2, url, c3, (Map)o3, (V)a3));
                        continue Label_2514;
                        this.j().G().e(K2.P.z(e2), z.a, "Failed to parse upload URL. Not uploading. appId");
                        continue Label_2514;
                        while (true) {
                            u0 = this.W().u0(l9);
                            iftrue(Label_2514:)(u0 == null);
                            this.M(u0);
                            continue Label_2514;
                            this.X = false;
                            this.F();
                            throw o;
                            this.c0 = -1L;
                            w3 = this.W();
                            this.T();
                            l9 = w3.L(n3 - (long)K2.w.e.a(null));
                            iftrue(Label_2514:)(TextUtils.isEmpty((CharSequence)l9));
                            continue;
                        }
                        this.X = false;
                        this.F();
                    }
                    catch (final MalformedURLException ex2) {
                        continue;
                    }
                }
                break;
            }
            break;
        }
    }
    
    public final R3.b h() {
        return this.N.H;
    }
    
    public final long h0() {
        this.d().getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final k1 k = this.K;
        k.z();
        k.v();
        final b0 l = k.L;
        long a;
        if ((a = l.a()) == 0L) {
            a = ((Random)k.u().I0()).nextInt(86400000) + 1L;
            l.b(a);
        }
        return (currentTimeMillis + a) / 1000L / 60L / 60L / 24L;
    }
    
    public final Boolean i(final G g) {
        try {
            final long y = g.y();
            final n0 n = this.N;
            if (y != -2147483648L) {
                if (g.y() == s2.b.a(n.C).c(0, g.f()).versionCode) {
                    return Boolean.TRUE;
                }
            }
            else {
                final String versionName = s2.b.a(n.C).c(0, g.f()).versionName;
                final String h = g.h();
                if (h != null && h.equals((Object)versionName)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public final X i0() {
        final X f = this.F;
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }
    
    public final P j() {
        final n0 n = this.N;
        A.h((Object)n);
        final P k = n.K;
        n0.f(k);
        return k;
    }
    
    public final String k(final z0 z0) {
        if (z0.i(y0.E)) {
            final byte[] array = new byte[16];
            this.d0().I0().nextBytes(array);
            return String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, array) });
        }
        return null;
    }
    
    public final k0 l() {
        final n0 n = this.N;
        A.h((Object)n);
        final k0 l = n.L;
        n0.f(l);
        return l;
    }
    
    public final void n(final c c, final B1 b1) {
        A.e(c.C);
        A.h((Object)c.E);
        A.e(c.E.D);
        this.l().v();
        this.f0();
        if (!b0(b1)) {
            return;
        }
        if (!b1.J) {
            this.e(b1);
            return;
        }
        Object o = this.E;
        r((u1)o);
        ((h)o).C0();
        Label_0349: {
            Label_0322: {
                Object o2 = null;
                Label_0287: {
                    try {
                        this.e(b1);
                        final String c2 = c.C;
                        A.h((Object)c2);
                        o = this.E;
                        r((u1)o);
                        o = ((h)o).s0(c2, c.E.D);
                        o2 = this.N;
                        if (o == null) {
                            break Label_0287;
                        }
                        this.j().O.e(c.C, ((n0)o2).O.g(c.E.D), "Removing conditional user property");
                        o2 = this.E;
                        r((u1)o2);
                        ((h)o2).b0(c2, c.E.D);
                        if (((c)o).G) {
                            o2 = this.E;
                            r((u1)o2);
                            ((h)o2).x0(c2, c.E.D);
                        }
                    }
                    finally {
                        break Label_0349;
                    }
                    final v m = c.M;
                    if (m != null) {
                        final u d = m.D;
                        Bundle i;
                        if (d != null) {
                            i = d.i();
                        }
                        else {
                            i = null;
                        }
                        final v e = this.d0().E(m.C, i, ((c)o).D, m.F, true);
                        A.h((Object)e);
                        final B1 b2;
                        this.Q(e, b2);
                    }
                    break Label_0322;
                }
                this.j().K.e(K2.P.z(c.C), ((n0)o2).O.g(c.E.D), "Conditional user property doesn't exist");
            }
            final h e2 = this.E;
            r(e2);
            e2.J0();
            final h e3 = this.E;
            r(e3);
            e3.H0();
            return;
        }
        final h e4 = this.E;
        r(e4);
        e4.H0();
    }
    
    public final void o(v v, final B1 b1) {
        A.h((Object)b1);
        final String c = b1.C;
        A.e(c);
        this.l().v();
        this.f0();
        final U c2 = K2.U.c(v);
        this.l().v();
        Y0 g0 = null;
        Label_0082: {
            if (this.g0 != null) {
                final String h0 = this.h0;
                if (h0 != null) {
                    if (h0.equals((Object)c)) {
                        g0 = this.g0;
                        break Label_0082;
                    }
                }
            }
            g0 = null;
        }
        J1.M(g0, (Bundle)c2.e, false);
        final v b2 = c2.b();
        this.c0();
        if (TextUtils.isEmpty((CharSequence)b1.D) && TextUtils.isEmpty((CharSequence)b1.S)) {
            return;
        }
        if (!b1.J) {
            this.e(b1);
            return;
        }
        final List v2 = b1.V;
        v v3 = b2;
        long n = 0L;
        if (v2 != null) {
            final String c3 = b2.C;
            if (!v2.contains((Object)c3)) {
                this.j().O.h("Dropping non-safelisted event. appId, event name, origin", c, c3, b2.E);
                return;
            }
            final Bundle i = b2.D.i();
            ((BaseBundle)i).putLong("ga_safelisted", 1L);
            final u u = new u(i);
            n = b2.F;
            v3 = new v(b2.C, u, b2.E, n);
        }
        h h2 = this.E;
        r(h2);
        h2.C0();
        Label_1305: {
            long n2 = 0L;
            final List p2;
            Label_0387: {
                try {
                    h2 = this.E;
                    r(h2);
                    A.e(c);
                    h2.v();
                    h2.z();
                    n = v.F;
                    n2 = lcmp(n, 0L);
                    if (n2 < 0) {
                        h2.j().K.e(K2.P.z(c), n, "Invalid time querying timed out conditional properties");
                        Collections.emptyList();
                        break Label_0387;
                    }
                }
                finally {
                    break Label_1305;
                }
                p2 = h2.P("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { c, String.valueOf(n) });
            }
            final Iterator iterator = p2.iterator();
            n0 n3;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                n3 = this.N;
                if (!hasNext) {
                    break;
                }
                final c c4 = (c)iterator.next();
                if (c4 == null) {
                    continue;
                }
                this.j().P.h("User property timed out", c4.C, n3.O.g(c4.E.D), c4.E.a());
                final v j = c4.I;
                if (j != null) {
                    this.Q(new v(j, n), b1);
                }
                final h e = this.E;
                r(e);
                e.b0(c, c4.E.D);
            }
            final h e2 = this.E;
            r(e2);
            A.e(c);
            e2.v();
            e2.z();
            List list;
            if (n2 < 0) {
                e2.j().K.e(K2.P.z(c), n, "Invalid time querying expired conditional properties");
                list = Collections.emptyList();
            }
            else {
                list = e2.P("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { c, String.valueOf(n) });
            }
            final ArrayList list2 = new ArrayList(list.size());
            for (final c c5 : list) {
                if (c5 != null) {
                    this.j().P.h("User property expired", c5.C, n3.O.g(c5.E.D), c5.E.a());
                    final h e3 = this.E;
                    r(e3);
                    e3.x0(c, c5.E.D);
                    final v m = c5.M;
                    if (m != null) {
                        list2.add((Object)m);
                    }
                    final h e4 = this.E;
                    r(e4);
                    e4.b0(c, c5.E.D);
                }
            }
            final int size = list2.size();
            int k = 0;
            while (k < size) {
                final Object value = list2.get(k);
                ++k;
                this.Q(new v((v)value, n), b1);
            }
            final h e5 = this.E;
            r(e5);
            final String c6 = v3.C;
            A.e(c);
            A.e(c6);
            e5.v();
            e5.z();
            List list3;
            if (n2 < 0) {
                e5.j().K.h("Invalid time querying triggered conditional properties", K2.P.z(c), ((n0)e5.C).O.c(c6), n);
                list3 = Collections.emptyList();
            }
            else {
                list3 = e5.P("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { c, c6, String.valueOf(n) });
            }
            final ArrayList list4 = new ArrayList(list3.size());
            for (final c c7 : list3) {
                if (c7 != null) {
                    final G1 e6 = c7.E;
                    final String c8 = c7.C;
                    A.h((Object)c8);
                    final String d = c7.D;
                    final String d2 = e6.D;
                    final Object a = e6.a();
                    A.h(a);
                    final H1 h3 = new H1(c8, d, d2, n, a);
                    final Object e7 = h3.e;
                    final String c9 = h3.c;
                    final h e8 = this.E;
                    r(e8);
                    if (e8.f0(h3)) {
                        this.j().P.h("User property triggered", c7.C, n3.O.g(c9), e7);
                    }
                    else {
                        this.j().H.h("Too many active user properties, ignoring", K2.P.z(c7.C), n3.O.g(c9), e7);
                    }
                    final v l = c7.K;
                    if (l != null) {
                        list4.add((Object)l);
                    }
                    c7.E = new G1(h3);
                    c7.G = true;
                    final h e9 = this.E;
                    r(e9);
                    e9.d0(c7);
                }
            }
            this.Q(v3, b1);
            final int size2 = list4.size();
            int n4 = 0;
            while (n4 < size2) {
                final Object value2 = list4.get(n4);
                ++n4;
                v = (v)value2;
                this.Q(new v(v, n), b1);
            }
            final h e10 = this.E;
            r(e10);
            e10.J0();
            final h e11 = this.E;
            r(e11);
            e11.H0();
            return;
        }
        final h e12 = this.E;
        r(e12);
        e12.H0();
    }
    
    public final void p(final v v, final String s) {
        final h e = this.E;
        r(e);
        final G u0 = e.u0(s);
        if (u0 != null && !TextUtils.isEmpty((CharSequence)u0.h())) {
            final Boolean i = this.i(u0);
            if (i == null) {
                if (!"_ui".equals((Object)v.C)) {
                    this.j().K.g("Could not find package. appId", K2.P.z(s));
                }
            }
            else if (!i) {
                this.j().H.g("App version does not match; dropping event. appId", K2.P.z(s));
                return;
            }
            final String j = u0.j();
            final String h = u0.h();
            final long y = u0.y();
            final n0 a = u0.a;
            final k0 l = a.L;
            n0.f(l);
            l.v();
            final String k = u0.l;
            final k0 m = a.L;
            n0.f(m);
            m.v();
            final long m2 = u0.m;
            final k0 l2 = a.L;
            n0.f(l2);
            l2.v();
            final long n = u0.n;
            final k0 l3 = a.L;
            n0.f(l3);
            l3.v();
            final boolean o = u0.o;
            final String i2 = u0.i();
            final k0 l4 = a.L;
            n0.f(l4);
            l4.v();
            final k0 l5 = a.L;
            n0.f(l5);
            l5.v();
            final boolean p2 = u0.p;
            final String d = u0.d();
            final Boolean u2 = u0.U();
            final long n2 = u0.N();
            final k0 l6 = a.L;
            n0.f(l6);
            l6.v();
            final ArrayList t = u0.t;
            final String m3 = this.J(s).m();
            final boolean o2 = u0.o();
            final k0 l7 = a.L;
            n0.f(l7);
            l7.v();
            final long w = u0.w;
            final z0 j2 = this.J(s);
            final String b = this.R(s).b;
            final k0 l8 = a.L;
            n0.f(l8);
            l8.v();
            final int y2 = u0.y;
            final k0 l9 = a.L;
            n0.f(l9);
            l9.v();
            this.L(v, new B1(s, j, h, y, k, m2, n, null, o, false, i2, 0L, 0, p2, false, d, u2, n2, (List)t, m3, "", null, o2, w, j2.b, b, y2, u0.C, u0.l(), u0.k()));
            return;
        }
        this.j().O.g("No app data available; dropping event", s);
    }
    
    public final void q(final G g, final m1 m1) {
        this.l().v();
        this.f0();
        final String f = ((n1)((f2)m1).D).F();
        final EnumMap enumMap = new EnumMap((Class)y0.class);
        final int length = f.length();
        final int length2 = y0.values().length;
        final g d = g.D;
        f f2;
        if (length >= length2 && f.charAt(0) == '1') {
            final y0[] values = y0.values();
            final int length3 = values.length;
            int i = 0;
            int n = 1;
        Label_0087:
            while (i < length3) {
                final y0 y0 = values[i];
                final char char1 = f.charAt(n);
                while (true) {
                    for (final g g2 : g.values()) {
                        if (g2.C == char1) {
                            enumMap.put((Enum)y0, (Object)g2);
                            ++i;
                            ++n;
                            continue Label_0087;
                        }
                    }
                    g g2 = d;
                    continue;
                }
            }
            f2 = new f(enumMap);
        }
        else {
            f2 = new f(17);
        }
        final String f3 = g.f();
        this.l().v();
        this.f0();
        final z0 k = this.J(f3);
        final int[] a = C1.a;
        final y0 d2 = y0.D;
        final EnumMap a2 = k.a;
        final B0 b0 = (B0)a2.get((Object)d2);
        B0 d3 = B0.D;
        B0 b2 = b0;
        if (b0 == null) {
            b2 = d3;
        }
        final int n2 = a[b2.ordinal()];
        final g l = g.K;
        final g l2 = g.L;
        final int b3 = k.b;
        if (n2 != 1) {
            if (n2 != 2 && n2 != 3) {
                f2.s(d2, l2);
            }
            else {
                f2.r(d2, b3);
            }
        }
        else {
            f2.s(d2, l);
        }
        final y0 e = y0.E;
        final B0 b4 = (B0)a2.get((Object)e);
        if (b4 != null) {
            d3 = b4;
        }
        final int n3 = a[d3.ordinal()];
        if (n3 != 1) {
            if (n3 != 2 && n3 != 3) {
                f2.s(e, l2);
            }
            else {
                f2.r(e, b3);
            }
        }
        else {
            f2.s(e, l);
        }
        final String f4 = g.f();
        this.l().v();
        this.f0();
        final n c = this.c(f4, this.R(f4), this.J(f4), f2);
        final Boolean c2 = c.c;
        A.h((Object)c2);
        final boolean booleanValue = c2;
        ((f2)m1).f();
        n1.j0((n1)((f2)m1).D, booleanValue);
        final String d4 = c.d;
        if (!TextUtils.isEmpty((CharSequence)d4)) {
            ((f2)m1).f();
            n1.r1((n1)((f2)m1).D, d4);
        }
        this.l().v();
        this.f0();
        while (true) {
            for (final com.google.android.gms.internal.measurement.u1 u1 : Collections.unmodifiableList((List)((n1)((f2)m1).D).U())) {
                if ("_npa".equals((Object)u1.B())) {
                    if (u1 != null) {
                        final y0 g3 = y0.G;
                        g g4;
                        if ((g4 = (g)((EnumMap)f2.D).get((Object)g3)) == null) {
                            g4 = d;
                        }
                        if (g4 == d) {
                            final h e2 = this.E;
                            r(e2);
                            final H1 v0 = e2.v0(g.f(), "_npa");
                            final g g5 = g.G;
                            final g i2 = g.I;
                            if (v0 != null) {
                                final String b5 = v0.b;
                                if ("tcf".equals((Object)b5)) {
                                    f2.s(g3, g.J);
                                }
                                else if ("app".equals((Object)b5)) {
                                    f2.s(g3, i2);
                                }
                                else {
                                    f2.s(g3, g5);
                                }
                            }
                            else {
                                final Boolean u2 = g.U();
                                if (u2 != null && (u2 != Boolean.TRUE || u1.x() == 1L) && (u2 != Boolean.FALSE || u1.x() == 0L)) {
                                    f2.s(g3, g5);
                                }
                                else {
                                    f2.s(g3, i2);
                                }
                            }
                        }
                    }
                    else {
                        final int b6 = this.b(g.f(), f2);
                        final com.google.android.gms.internal.measurement.t1 a3 = com.google.android.gms.internal.measurement.u1.A();
                        ((f2)a3).f();
                        com.google.android.gms.internal.measurement.u1.r((com.google.android.gms.internal.measurement.u1)((f2)a3).D, "_npa");
                        this.d().getClass();
                        final long currentTimeMillis = System.currentTimeMillis();
                        ((f2)a3).f();
                        com.google.android.gms.internal.measurement.u1.v((com.google.android.gms.internal.measurement.u1)((f2)a3).D, currentTimeMillis);
                        final long n4 = b6;
                        ((f2)a3).f();
                        com.google.android.gms.internal.measurement.u1.q((com.google.android.gms.internal.measurement.u1)((f2)a3).D, n4);
                        final com.google.android.gms.internal.measurement.u1 u3 = (com.google.android.gms.internal.measurement.u1)((f2)a3).d();
                        ((f2)m1).f();
                        n1.y((n1)((f2)m1).D, u3);
                        this.j().P.e("non_personalized_ads(_npa)", b6, "Setting user property");
                    }
                    final String string = f2.toString();
                    ((f2)m1).f();
                    n1.h1((n1)((f2)m1).D, string);
                    final h0 c3 = this.C;
                    final String f5 = g.f();
                    c3.v();
                    c3.T(f5);
                    final I0 l3 = c3.L(f5);
                    final boolean b7 = l3 == null || !l3.u() || l3.t();
                    final List q = m1.q();
                    for (int n5 = 0; n5 < q.size(); ++n5) {
                        if ("_tcf".equals((Object)((f1)q.get(n5)).C())) {
                            final e1 e3 = (e1)((g2)q.get(n5)).l();
                            final List p2 = e3.p();
                            for (int n6 = 0; n6 < p2.size(); ++n6) {
                                if ("_tcfd".equals((Object)((i1)p2.get(n6)).D())) {
                                    String s2;
                                    final String s = s2 = ((i1)p2.get(n6)).E();
                                    Label_1257: {
                                        if (b7) {
                                            if (s.length() > 4) {
                                                final char[] charArray = s.toCharArray();
                                                while (true) {
                                                    for (int n7 = 1; n7 < 64; ++n7) {
                                                        if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(n7)) {
                                                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(0x1 | n7);
                                                            s2 = String.valueOf(charArray);
                                                            break Label_1257;
                                                        }
                                                    }
                                                    int n7 = 0;
                                                    continue;
                                                }
                                            }
                                            s2 = s;
                                        }
                                    }
                                    final h1 c4 = i1.C();
                                    c4.k("_tcfd");
                                    c4.l(s2);
                                    ((f2)e3).f();
                                    f1.t((f1)((f2)e3).D, n6, (i1)((f2)c4).d());
                                    break;
                                }
                            }
                            m1.j(n5, e3);
                            return;
                        }
                    }
                    return;
                }
            }
            com.google.android.gms.internal.measurement.u1 u1 = null;
            continue;
        }
    }
    
    public final void s(G1 c, final B1 b1) {
        this.l().v();
        this.f0();
        if (!b0(b1)) {
            return;
        }
        if (!b1.J) {
            this.e(b1);
            return;
        }
        final int n0 = this.d0().n0(c.D);
        final f i0 = this.i0;
        final String d = c.D;
        if (n0 != 0) {
            this.d0();
            this.T();
            final String k = J1.K(24, d, true);
            int length;
            if (d != null) {
                length = d.length();
            }
            else {
                length = 0;
            }
            this.d0();
            J1.N((I1)i0, b1.C, n0, "_ev", k, length);
            return;
        }
        final int a = this.d0().A(d, c.a());
        if (a != 0) {
            this.d0();
            this.T();
            final String j = J1.K(24, d, true);
            final Object a2 = c.a();
            int length2;
            if (a2 != null && (a2 instanceof String || a2 instanceof CharSequence)) {
                length2 = String.valueOf(a2).length();
            }
            else {
                length2 = 0;
            }
            this.d0();
            J1.N((I1)i0, b1.C, a, "_ev", j, length2);
            return;
        }
        final Object t0 = this.d0().t0(d, c.a());
        if (t0 == null) {
            return;
        }
        final boolean equals = "_sid".equals((Object)d);
        final long n2 = 0L;
        final String c2 = b1.C;
        if (equals) {
            A.h((Object)c2);
            final h e = this.E;
            r(e);
            final H1 v0 = e.v0(c2, "_sno");
            long n3 = 0L;
            Label_0422: {
                if (v0 != null) {
                    final Object e2 = v0.e;
                    if (e2 instanceof Long) {
                        n3 = (long)e2;
                        break Label_0422;
                    }
                }
                if (v0 != null) {
                    this.j().K.g("Retrieved last session number from database does not contain a valid (long) value", v0.e);
                }
                final h e3 = this.E;
                r(e3);
                final r t2 = e3.t0("events", c2, "_s");
                if (t2 != null) {
                    final P l = this.j();
                    n3 = t2.c;
                    l.P.g("Backfill the session number. Last used session number", n3);
                }
                else {
                    n3 = 0L;
                }
            }
            this.s(new G1(c.E, n3 + 1L, "_sno", c.H), b1);
        }
        A.h((Object)c2);
        final String h = c.H;
        A.h((Object)h);
        final H1 h2 = new H1(c2, h, c.D, c.E, t0);
        final P m = this.j();
        final n0 n4 = this.N;
        final L o = n4.O;
        c = (G1)h2.c;
        m.P.e(o.g((String)c), t0, "Setting user property");
        Object o2 = this.E;
        r((u1)o2);
        ((h)o2).C0();
        Label_0872: {
            try {
                final boolean equals2 = "_id".equals((Object)c);
                o2 = h2.e;
                if (equals2) {
                    final h e4 = this.E;
                    r(e4);
                    final H1 v2 = e4.v0(c2, "_id");
                    if (v2 != null && !o2.equals(v2.e)) {
                        final h e5 = this.E;
                        r(e5);
                        e5.x0(c2, "_lair");
                    }
                }
            }
            finally {
                break Label_0872;
            }
            final B1 b2;
            this.e(b2);
            final h e6 = this.E;
            r(e6);
            final boolean f0 = e6.f0(h2);
            if ("_sid".equals((Object)d)) {
                final T i2 = this.I;
                r(i2);
                final String z = b2.Z;
                long d2;
                if (TextUtils.isEmpty((CharSequence)z)) {
                    d2 = n2;
                }
                else {
                    d2 = i2.D(z.getBytes(Charset.forName("UTF-8")));
                }
                final h e7 = this.E;
                r(e7);
                final G u0 = e7.u0(c2);
                if (u0 != null) {
                    u0.S(d2);
                    if (u0.n()) {
                        final h e8 = this.E;
                        r(e8);
                        e8.Q(u0, false);
                    }
                }
            }
            final h e9 = this.E;
            r(e9);
            e9.J0();
            if (!f0) {
                this.j().H.e(n4.O.g((String)c), o2, "Too many unique user properties are set. Ignoring user property");
                this.d0();
                J1.N((I1)i0, b2.C, 9, null, null, 0);
            }
            final h e10 = this.E;
            r(e10);
            e10.H0();
            return;
        }
        final h e11 = this.E;
        r(e11);
        e11.H0();
    }
    
    public final void v(final m1 m1, final long n, final boolean b) {
        String s;
        if (b) {
            s = "_se";
        }
        else {
            s = "_lte";
        }
        final h e = this.E;
        r(e);
        final H1 v0 = e.v0(m1.X(), s);
        H1 h1 = null;
        Label_0148: {
            if (v0 != null) {
                final Object e2 = v0.e;
                if (e2 != null) {
                    final String x = m1.X();
                    this.d().getClass();
                    h1 = new H1(x, "auto", s, System.currentTimeMillis(), (long)e2 + n);
                    break Label_0148;
                }
            }
            final String x2 = m1.X();
            this.d().getClass();
            h1 = new H1(x2, "auto", s, System.currentTimeMillis(), n);
        }
        final com.google.android.gms.internal.measurement.t1 a = com.google.android.gms.internal.measurement.u1.A();
        ((f2)a).f();
        com.google.android.gms.internal.measurement.u1.r((com.google.android.gms.internal.measurement.u1)((f2)a).D, s);
        this.d().getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        ((f2)a).f();
        com.google.android.gms.internal.measurement.u1.v((com.google.android.gms.internal.measurement.u1)((f2)a).D, currentTimeMillis);
        final Object e3 = h1.e;
        final long longValue = (long)e3;
        ((f2)a).f();
        com.google.android.gms.internal.measurement.u1.q((com.google.android.gms.internal.measurement.u1)((f2)a).D, longValue);
        final com.google.android.gms.internal.measurement.u1 u1 = (com.google.android.gms.internal.measurement.u1)((f2)a).d();
        final int c = K2.T.C(m1, s);
        if (c >= 0) {
            ((f2)m1).f();
            n1.t((n1)((f2)m1).D, c, u1);
        }
        else {
            ((f2)m1).f();
            n1.y((n1)((f2)m1).D, u1);
        }
        if (n > 0L) {
            final h e4 = this.E;
            r(e4);
            e4.f0(h1);
            String s2;
            if (b) {
                s2 = "session-scoped";
            }
            else {
                s2 = "lifetime";
            }
            this.j().P.e(s2, e3, "Updated engagement user property. scope, value");
        }
    }
    
    public final void w(final m1 m1, final String s) {
        final h0 c = this.C;
        r(c);
        c.v();
        c.T(s);
        final t.b g = c.G;
        final Set set = (Set)((j)g).getOrDefault((Object)s, (Object)null);
        if (set != null) {
            ((f2)m1).f();
            n1.W0((n1)((f2)m1).D, set);
        }
        r(c);
        c.v();
        c.T(s);
        if (((j)g).getOrDefault((Object)s, (Object)null) != null && (((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"device_model") || ((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"device_info"))) {
            ((f2)m1).f();
            n1.S0((n1)((f2)m1).D);
        }
        r(c);
        if (c.S(s)) {
            final String n = ((n1)((f2)m1).D).N();
            if (!TextUtils.isEmpty((CharSequence)n)) {
                final int index = n.indexOf(".");
                if (index != -1) {
                    final String substring = n.substring(0, index);
                    ((f2)m1).f();
                    n1.P1((n1)((f2)m1).D, substring);
                }
            }
        }
        r(c);
        c.v();
        c.T(s);
        if (((j)g).getOrDefault((Object)s, (Object)null) != null && ((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"user_id")) {
            final int c2 = K2.T.C(m1, "_id");
            if (c2 != -1) {
                ((f2)m1).f();
                n1.f0((n1)((f2)m1).D, c2);
            }
        }
        r(c);
        c.v();
        c.T(s);
        if (((j)g).getOrDefault((Object)s, (Object)null) != null && ((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"google_signals")) {
            ((f2)m1).f();
            n1.Z0((n1)((f2)m1).D);
        }
        r(c);
        if (c.R(s)) {
            ((f2)m1).f();
            n1.e0((n1)((f2)m1).D);
            a3.a();
            if (!this.T().G(null, w.X0) || this.J(s).i(y0.E)) {
                final HashMap f0 = this.f0;
                Object o = f0.get((Object)s);
                Label_0500: {
                    if (o != null) {
                        final long b = this.T().B(s, w.W);
                        final long b2 = ((x1)o).b;
                        this.d().getClass();
                        if (b + b2 >= SystemClock.elapsedRealtime()) {
                            break Label_0500;
                        }
                    }
                    o = new x1(this, this.d0().G0());
                    f0.put((Object)s, o);
                }
                ((f2)m1).f();
                n1.E1((n1)((f2)m1).D, ((x1)o).a);
            }
        }
        r(c);
        c.v();
        c.T(s);
        if (((j)g).getOrDefault((Object)s, (Object)null) != null && ((Set)((j)g).getOrDefault((Object)s, (Object)null)).contains((Object)"enhanced_user_id")) {
            ((f2)m1).f();
            n1.G1((n1)((f2)m1).D);
        }
    }
    
    public final void x(final String s, final int n, IOException e, final byte[] array, final E1 e2) {
        this.l().v();
        this.f0();
        byte[] array2 = array;
        Label_0032: {
            if (array == null) {
                Label_0360: {
                    try {
                        array2 = new byte[0];
                    }
                    finally {
                        break Label_0360;
                    }
                    break Label_0032;
                }
                this.W = false;
                this.F();
            }
        }
        Label_0350: {
            if ((n == 200 || n == 204) && e == null) {
                e = (IOException)this.E;
                r((u1)e);
                final long a = e2.a;
                ((C.u)e).v();
                ((u1)e).z();
                i4.a();
                final d i = ((n0)((C.u)e).C).I;
                final F a2 = w.A0;
                if (i.G(null, a2)) {
                    final SQLiteDatabase d = ((h)e).D();
                    final String value = String.valueOf((Object)a);
                    try {
                        if (d.delete("upload_queue", "rowid=?", new String[] { value }) != 1) {
                            ((C.u)e).j().K.f("Deleted fewer rows from upload_queue than expected");
                        }
                    }
                    catch (final SQLiteException ex) {
                        ((C.u)e).j().H.g("Failed to delete a MeasurementBatch in a upload_queue table", ex);
                        throw ex;
                    }
                }
                this.j().P.e(s, n, "Successfully uploaded batch from upload queue. appId, status");
                if (this.T().G(null, a2)) {
                    final T d2 = this.D;
                    r(d2);
                    if (d2.m0()) {
                        final h e3 = this.E;
                        r(e3);
                        if (e3.G0(s)) {
                            this.V(s);
                            break Label_0350;
                        }
                    }
                }
                this.H();
            }
            else {
                final String s2 = new String(array2, StandardCharsets.UTF_8);
                final String substring = s2.substring(0, Math.min(32, s2.length()));
                final S m = this.j().M;
                Object o;
                if ((o = e) == null) {
                    o = substring;
                }
                m.h("Network upload failed. Will retry later. appId, status, error", s, n, o);
                final h e4 = this.E;
                r(e4);
                e4.U(e2.a);
                this.H();
            }
        }
        this.W = false;
        this.F();
    }
    
    public final void y(final String s, final B1 b1) {
        this.l().v();
        this.f0();
        if (!b0(b1)) {
            return;
        }
        if (!b1.J) {
            this.e(b1);
            return;
        }
        final Boolean z = Z(b1);
        if ("_npa".equals((Object)s) && z != null) {
            this.j().O.f("Falling back to manifest metadata value for ad personalization");
            this.d().getClass();
            final long currentTimeMillis = System.currentTimeMillis();
            long n;
            if (z) {
                n = 1L;
            }
            else {
                n = 0L;
            }
            this.s(new G1(currentTimeMillis, n, "_npa", "auto"), b1);
            return;
        }
        final P j = this.j();
        final n0 n2 = this.N;
        j.O.g("Removing user property", n2.O.g(s));
        final h e = this.E;
        r(e);
        e.C0();
        Label_0299: {
            try {
                this.e(b1);
                final boolean equals = "_id".equals((Object)s);
                final String c = b1.C;
                if (equals) {
                    final h e2 = this.E;
                    r(e2);
                    A.h((Object)c);
                    e2.x0(c, "_lair");
                }
            }
            finally {
                break Label_0299;
            }
            final h e3 = this.E;
            r(e3);
            final String s2;
            A.h((Object)s2);
            e3.x0(s2, s);
            final h e4 = this.E;
            r(e4);
            e4.J0();
            this.j().O.g("User property removed", n2.O.g(s));
            final h e5 = this.E;
            r(e5);
            e5.H0();
            return;
        }
        final h e6 = this.E;
        r(e6);
        e6.H0();
    }
    
    public final void z(String s, final h1 h1, final Bundle bundle, final String s2) {
        final List unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[])new String[] { "_o", "_sn", "_sc", "_si" }));
        int n;
        if (!J1.A0(((i1)((f2)h1).D).D()) && !J1.A0(s)) {
            final d t = this.T();
            t.getClass();
            n = Math.max(Math.min(t.A(s2, w.T), 500), 100);
        }
        else {
            final d t2 = this.T();
            t2.getClass();
            n = Math.max(Math.max(Math.min(t2.A(s2, w.T), 500), 100), 256);
        }
        final long n2 = n;
        final long n3 = ((i1)((f2)h1).D).E().codePointCount(0, ((i1)((f2)h1).D).E().length());
        this.d0();
        s = ((i1)((f2)h1).D).D();
        this.T();
        s = J1.K(40, s, true);
        if (n3 > n2 && !unmodifiableList.contains((Object)((i1)((f2)h1).D).D())) {
            if ("_ev".equals((Object)((i1)((f2)h1).D).D())) {
                this.d0();
                final String e = ((i1)((f2)h1).D).E();
                final d t3 = this.T();
                t3.getClass();
                ((BaseBundle)bundle).putString("_ev", J1.K(Math.max(Math.max(Math.min(t3.A(s2, w.T), 500), 100), 256), e, true));
                return;
            }
            this.j().M.e(s, n3, "Param value is too long; discarded. Name, value length");
            if (((BaseBundle)bundle).getLong("_err") == 0L) {
                ((BaseBundle)bundle).putLong("_err", 4L);
                if (((BaseBundle)bundle).getString("_ev") == null) {
                    ((BaseBundle)bundle).putString("_ev", s);
                    ((BaseBundle)bundle).putLong("_el", n3);
                }
            }
            bundle.remove(((i1)((f2)h1).D).D());
        }
    }
}

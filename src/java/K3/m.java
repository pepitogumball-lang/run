package k3;

import java.util.SortedSet;
import java.util.Set;
import java.io.Writer;
import n3.M;
import n3.i0;
import n3.I;
import n3.A;
import O2.i;
import java.util.NavigableSet;
import n3.J;
import n3.B;
import java.nio.charset.Charset;
import l3.b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import n3.K;
import C2.D;
import n3.O0;
import h1.w;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import K2.c0;
import java.util.concurrent.atomic.AtomicMarkableReference;
import n3.l0;
import n3.n0;
import android.text.TextUtils;
import android.os.Build;
import android.os.StatFs;
import android.os.Environment;
import n3.o0;
import android.os.Build$VERSION;
import n3.m0;
import com.google.android.gms.internal.measurement.L;
import java.util.Locale;
import java.io.InputStream;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import n3.u0;
import android.util.Log;
import java.io.FilenameFilter;
import java.io.File;
import java.util.ArrayList;
import O2.t;
import java.util.concurrent.atomic.AtomicBoolean;
import h3.a;
import m3.e;
import l3.c;
import o.q1;
import f2.d;
import android.content.Context;

public final class m
{
    public static final h t;
    public final Context a;
    public final v b;
    public final d c;
    public final q1 d;
    public final c e;
    public final z f;
    public final q3.c g;
    public final C2.c h;
    public final e i;
    public final a j;
    public final g3.a k;
    public final j l;
    public final q3.c m;
    public u n;
    public C2.z o;
    public final O2.j p;
    public final O2.j q;
    public final O2.j r;
    public final AtomicBoolean s;
    
    static {
        t = new h(1);
    }
    
    public m(final Context a, final z f, final v b, final q3.c g, final d c, final C2.c h, final q1 d, final e i, final q3.c m, final a j, final g3.a k, final j l, final c e) {
        this.o = null;
        this.p = new O2.j();
        this.q = new O2.j();
        this.r = new O2.j();
        this.s = new AtomicBoolean(false);
        this.a = a;
        this.f = f;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        this.d = d;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.e = e;
    }
    
    public static t a(final m m) {
        m.getClass();
        final ArrayList list = new ArrayList();
        for (final File file : q3.c.j((Object[])((File)m.g.F).listFiles((FilenameFilter)m.t))) {
            try {
                final long long1 = Long.parseLong(file.getName().substring(3));
                t t;
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", (Throwable)null);
                    t = u0.m((Object)null);
                }
                catch (final ClassNotFoundException ex) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", (Throwable)null);
                    }
                    t = u0.f((Executor)new ScheduledThreadPoolExecutor(1), (Callable)new l(m, long1));
                }
                list.add((Object)t);
            }
            catch (final NumberFormatException ex2) {
                final StringBuilder sb = new StringBuilder("Could not parse app exception timestamp from file ");
                sb.append(file.getName());
                Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)null);
            }
            file.delete();
        }
        return u0.A((List)list);
    }
    
    public static String f() {
        final ClassLoader classLoader = m.class.getClassLoader();
        InputStream resourceAsStream = null;
        Label_0049: {
            if (classLoader == null) {
                Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", (Throwable)null);
            }
            else {
                if ((resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto")) != null) {
                    break Label_0049;
                }
                Log.i("FirebaseCrashlytics", "No version control information found", (Throwable)null);
            }
            resourceAsStream = null;
        }
        if (resourceAsStream == null) {
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Read version control info", (Throwable)null);
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[1024];
        while (true) {
            final int read = resourceAsStream.read(array);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
    
    public final void b(final boolean p0, final C2.z p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        k3/m.m:Lq3/c;
        //     7: astore          13
        //     9: new             Ljava/util/ArrayList;
        //    12: dup            
        //    13: aload           13
        //    15: getfield        q3/c.E:Ljava/lang/Object;
        //    18: checkcast       Lq3/a;
        //    21: invokevirtual   q3/a.c:()Ljava/util/NavigableSet;
        //    24: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //    27: astore          10
        //    29: aload           10
        //    31: invokevirtual   java/util/ArrayList.size:()I
        //    34: iload_1        
        //    35: if_icmpgt       58
        //    38: ldc             "FirebaseCrashlytics"
        //    40: iconst_2       
        //    41: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    44: ifeq            57
        //    47: ldc             "FirebaseCrashlytics"
        //    49: ldc_w           "No open sessions to be closed."
        //    52: aconst_null    
        //    53: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    56: pop            
        //    57: return         
        //    58: aload           10
        //    60: iload_1        
        //    61: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    64: checkcast       Ljava/lang/String;
        //    67: astore          14
        //    69: iload_3        
        //    70: ifeq            1771
        //    73: aload_2        
        //    74: invokevirtual   C2/z.f:()Ls3/a;
        //    77: getfield        s3/a.b:Lcom/google/android/gms/internal/ads/n1;
        //    80: getfield        com/google/android/gms/internal/ads/n1.b:Z
        //    83: ifeq            1771
        //    86: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    89: istore          5
        //    91: iload           5
        //    93: bipush          30
        //    95: if_icmplt       1734
        //    98: aload_0        
        //    99: getfield        k3/m.a:Landroid/content/Context;
        //   102: ldc_w           "activity"
        //   105: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //   108: checkcast       Landroid/app/ActivityManager;
        //   111: invokestatic    K2/G0.k:(Landroid/app/ActivityManager;)Ljava/util/List;
        //   114: astore          17
        //   116: aload           17
        //   118: invokeinterface java/util/List.size:()I
        //   123: ifeq            1691
        //   126: aload_0        
        //   127: getfield        k3/m.g:Lq3/c;
        //   130: astore_2       
        //   131: new             Lm3/e;
        //   134: dup            
        //   135: aload_2        
        //   136: invokespecial   m3/e.<init>:(Lq3/c;)V
        //   139: astore          16
        //   141: aload           16
        //   143: getstatic       m3/e.E:Lc0/f;
        //   146: putfield        m3/e.D:Ljava/lang/Object;
        //   149: aload           14
        //   151: ifnonnull       157
        //   154: goto            178
        //   157: aload           16
        //   159: new             Lm3/l;
        //   162: dup            
        //   163: aload_2        
        //   164: aload           14
        //   166: ldc_w           "userlog"
        //   169: invokevirtual   q3/c.e:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   172: invokespecial   m3/l.<init>:(Ljava/io/File;)V
        //   175: putfield        m3/e.D:Ljava/lang/Object;
        //   178: new             Lm3/g;
        //   181: dup            
        //   182: aload_2        
        //   183: invokespecial   m3/g.<init>:(Lq3/c;)V
        //   186: astore          11
        //   188: new             Lo/q1;
        //   191: dup            
        //   192: aload           14
        //   194: aload_2        
        //   195: aload_0        
        //   196: getfield        k3/m.e:Ll3/c;
        //   199: invokespecial   o/q1.<init>:(Ljava/lang/String;Lq3/c;Ll3/c;)V
        //   202: astore          15
        //   204: aload           15
        //   206: getfield        o/q1.F:Ljava/lang/Object;
        //   209: checkcast       LK2/c0;
        //   212: getfield        K2/c0.D:Ljava/lang/Object;
        //   215: checkcast       Ljava/util/concurrent/atomic/AtomicMarkableReference;
        //   218: invokevirtual   java/util/concurrent/atomic/AtomicMarkableReference.getReference:()Ljava/lang/Object;
        //   221: checkcast       Lm3/d;
        //   224: aload           11
        //   226: aload           14
        //   228: iconst_0       
        //   229: invokevirtual   m3/g.c:(Ljava/lang/String;Z)Ljava/util/Map;
        //   232: invokevirtual   m3/d.c:(Ljava/util/Map;)V
        //   235: aload           15
        //   237: getfield        o/q1.G:Ljava/lang/Object;
        //   240: checkcast       LK2/c0;
        //   243: getfield        K2/c0.D:Ljava/lang/Object;
        //   246: checkcast       Ljava/util/concurrent/atomic/AtomicMarkableReference;
        //   249: invokevirtual   java/util/concurrent/atomic/AtomicMarkableReference.getReference:()Ljava/lang/Object;
        //   252: checkcast       Lm3/d;
        //   255: aload           11
        //   257: aload           14
        //   259: iconst_1       
        //   260: invokevirtual   m3/g.c:(Ljava/lang/String;Z)Ljava/util/Map;
        //   263: invokevirtual   m3/d.c:(Ljava/util/Map;)V
        //   266: aload           15
        //   268: getfield        o/q1.I:Ljava/lang/Object;
        //   271: checkcast       Ljava/util/concurrent/atomic/AtomicMarkableReference;
        //   274: aload           11
        //   276: aload           14
        //   278: invokevirtual   m3/g.d:(Ljava/lang/String;)Ljava/lang/String;
        //   281: iconst_0       
        //   282: invokevirtual   java/util/concurrent/atomic/AtomicMarkableReference.set:(Ljava/lang/Object;Z)V
        //   285: aload_2        
        //   286: aload           14
        //   288: ldc_w           "rollouts-state"
        //   291: invokevirtual   q3/c.e:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   294: astore          18
        //   296: aload           18
        //   298: invokevirtual   java/io/File.exists:()Z
        //   301: ifeq            512
        //   304: aload           18
        //   306: invokevirtual   java/io/File.length:()J
        //   309: lconst_0       
        //   310: lcmp           
        //   311: ifne            317
        //   314: goto            512
        //   317: new             Ljava/io/FileInputStream;
        //   320: astore          11
        //   322: aload           11
        //   324: aload           18
        //   326: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   329: aload           11
        //   331: astore_2       
        //   332: aload           11
        //   334: invokestatic    k3/g.i:(Ljava/io/FileInputStream;)Ljava/lang/String;
        //   337: invokestatic    m3/g.b:(Ljava/lang/String;)Ljava/util/ArrayList;
        //   340: astore          12
        //   342: aload           11
        //   344: astore_2       
        //   345: new             Ljava/lang/StringBuilder;
        //   348: astore          19
        //   350: aload           11
        //   352: astore_2       
        //   353: aload           19
        //   355: ldc_w           "Loaded rollouts state:\n"
        //   358: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   361: aload           11
        //   363: astore_2       
        //   364: aload           19
        //   366: aload           12
        //   368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   371: pop            
        //   372: aload           11
        //   374: astore_2       
        //   375: aload           19
        //   377: ldc_w           "\nfor session "
        //   380: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   383: pop            
        //   384: aload           11
        //   386: astore_2       
        //   387: aload           19
        //   389: aload           14
        //   391: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   394: pop            
        //   395: aload           11
        //   397: astore_2       
        //   398: aload           19
        //   400: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   403: astore          19
        //   405: aload           11
        //   407: astore_2       
        //   408: ldc             "FirebaseCrashlytics"
        //   410: iconst_3       
        //   411: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   414: ifeq            429
        //   417: aload           11
        //   419: astore_2       
        //   420: ldc             "FirebaseCrashlytics"
        //   422: aload           19
        //   424: aconst_null    
        //   425: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   428: pop            
        //   429: aload           11
        //   431: ldc_w           "Failed to close rollouts state file."
        //   434: invokestatic    k3/g.b:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   437: aload           12
        //   439: astore_2       
        //   440: goto            543
        //   443: astore          10
        //   445: goto            502
        //   448: astore          12
        //   450: goto            465
        //   453: astore          10
        //   455: aconst_null    
        //   456: astore_2       
        //   457: goto            502
        //   460: astore          12
        //   462: aconst_null    
        //   463: astore          11
        //   465: aload           11
        //   467: astore_2       
        //   468: ldc             "FirebaseCrashlytics"
        //   470: ldc_w           "Error deserializing rollouts state."
        //   473: aload           12
        //   475: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   478: pop            
        //   479: aload           11
        //   481: astore_2       
        //   482: aload           18
        //   484: invokestatic    m3/g.f:(Ljava/io/File;)V
        //   487: aload           11
        //   489: ldc_w           "Failed to close rollouts state file."
        //   492: invokestatic    k3/g.b:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   495: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   498: astore_2       
        //   499: goto            543
        //   502: aload_2        
        //   503: ldc_w           "Failed to close rollouts state file."
        //   506: invokestatic    k3/g.b:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   509: aload           10
        //   511: athrow         
        //   512: new             Ljava/lang/StringBuilder;
        //   515: dup            
        //   516: ldc_w           "The file has a length of zero for session: "
        //   519: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   522: astore_2       
        //   523: aload_2        
        //   524: aload           14
        //   526: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   529: pop            
        //   530: aload           18
        //   532: aload_2        
        //   533: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   536: invokestatic    m3/g.g:(Ljava/io/File;Ljava/lang/String;)V
        //   539: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   542: astore_2       
        //   543: aload           15
        //   545: getfield        o/q1.H:Ljava/lang/Object;
        //   548: checkcast       Lh1/w;
        //   551: aload_2        
        //   552: invokevirtual   h1/w.i:(Ljava/util/List;)Z
        //   555: pop            
        //   556: aload           13
        //   558: getfield        q3/c.E:Ljava/lang/Object;
        //   561: checkcast       Lq3/a;
        //   564: astore          12
        //   566: aload           12
        //   568: getfield        q3/a.b:Lq3/c;
        //   571: aload           14
        //   573: ldc_w           "start-time"
        //   576: invokevirtual   q3/c.e:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   579: invokevirtual   java/io/File.lastModified:()J
        //   582: lstore          8
        //   584: aload           17
        //   586: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   591: astore          17
        //   593: aload           17
        //   595: invokeinterface java/util/Iterator.hasNext:()Z
        //   600: ifeq            626
        //   603: aload           17
        //   605: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   610: invokestatic    K2/G0.d:(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;
        //   613: astore          11
        //   615: aload           11
        //   617: invokestatic    com/google/android/gms/internal/ads/po.d:(Landroid/app/ApplicationExitInfo;)J
        //   620: lload           8
        //   622: lcmp           
        //   623: ifge            631
        //   626: aconst_null    
        //   627: astore_2       
        //   628: goto            647
        //   631: aload           11
        //   633: astore_2       
        //   634: aload           11
        //   636: invokestatic    K2/G0.b:(Landroid/app/ApplicationExitInfo;)I
        //   639: bipush          6
        //   641: if_icmpeq       647
        //   644: goto            593
        //   647: aload_2        
        //   648: ifnonnull       683
        //   651: ldc_w           "No relevant ApplicationExitInfo occurred during session: "
        //   654: aload           14
        //   656: invokestatic    m0/a.f:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   659: astore_2       
        //   660: ldc             "FirebaseCrashlytics"
        //   662: iconst_2       
        //   663: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   666: ifeq            677
        //   669: ldc             "FirebaseCrashlytics"
        //   671: aload_2        
        //   672: aconst_null    
        //   673: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   676: pop            
        //   677: aload           10
        //   679: astore_2       
        //   680: goto            1616
        //   683: aload_2        
        //   684: invokestatic    com/google/android/gms/internal/ads/po.j:(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;
        //   687: astore          17
        //   689: aload           17
        //   691: ifnull          808
        //   694: new             Ljava/io/ByteArrayOutputStream;
        //   697: astore          11
        //   699: aload           11
        //   701: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   704: sipush          8192
        //   707: newarray        B
        //   709: astore          18
        //   711: aload           17
        //   713: aload           18
        //   715: invokevirtual   java/io/InputStream.read:([B)I
        //   718: istore          5
        //   720: iload           5
        //   722: iconst_m1      
        //   723: if_icmpeq       739
        //   726: aload           11
        //   728: aload           18
        //   730: iconst_0       
        //   731: iload           5
        //   733: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //   736: goto            711
        //   739: aload           11
        //   741: getstatic       java/nio/charset/StandardCharsets.UTF_8:Ljava/nio/charset/Charset;
        //   744: invokevirtual   java/nio/charset/Charset.name:()Ljava/lang/String;
        //   747: invokevirtual   java/io/ByteArrayOutputStream.toString:(Ljava/lang/String;)Ljava/lang/String;
        //   750: astore          11
        //   752: goto            811
        //   755: astore          11
        //   757: new             Ljava/lang/StringBuilder;
        //   760: dup            
        //   761: ldc_w           "Could not get input trace in application exit info: "
        //   764: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   767: astore          17
        //   769: aload           17
        //   771: aload_2        
        //   772: invokestatic    com/google/android/gms/internal/ads/po.k:(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;
        //   775: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   778: pop            
        //   779: aload           17
        //   781: ldc_w           " Error: "
        //   784: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   787: pop            
        //   788: aload           17
        //   790: aload           11
        //   792: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   795: pop            
        //   796: ldc             "FirebaseCrashlytics"
        //   798: aload           17
        //   800: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   803: aconst_null    
        //   804: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   807: pop            
        //   808: aconst_null    
        //   809: astore          11
        //   811: new             Ljava/lang/Object;
        //   814: dup            
        //   815: invokespecial   java/lang/Object.<init>:()V
        //   818: astore          18
        //   820: aload           18
        //   822: aload_2        
        //   823: invokestatic    com/google/android/gms/internal/ads/po.b:(Landroid/app/ApplicationExitInfo;)I
        //   826: putfield        n3/C.d:I
        //   829: aload           18
        //   831: aload           18
        //   833: getfield        n3/C.j:B
        //   836: iconst_4       
        //   837: ior            
        //   838: i2b            
        //   839: putfield        n3/C.j:B
        //   842: aload_2        
        //   843: invokestatic    com/google/android/gms/internal/ads/po.v:(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;
        //   846: astore          17
        //   848: aload           17
        //   850: ifnull          1680
        //   853: aload           18
        //   855: aload           17
        //   857: putfield        n3/C.b:Ljava/lang/String;
        //   860: aload           18
        //   862: aload_2        
        //   863: invokestatic    K2/G0.b:(Landroid/app/ApplicationExitInfo;)I
        //   866: putfield        n3/C.c:I
        //   869: aload           18
        //   871: aload           18
        //   873: getfield        n3/C.j:B
        //   876: iconst_2       
        //   877: ior            
        //   878: i2b            
        //   879: putfield        n3/C.j:B
        //   882: aload           18
        //   884: aload_2        
        //   885: invokestatic    com/google/android/gms/internal/ads/po.d:(Landroid/app/ApplicationExitInfo;)J
        //   888: putfield        n3/C.g:J
        //   891: aload           18
        //   893: aload           18
        //   895: getfield        n3/C.j:B
        //   898: bipush          32
        //   900: ior            
        //   901: i2b            
        //   902: putfield        n3/C.j:B
        //   905: aload           18
        //   907: aload_2        
        //   908: invokestatic    com/google/android/gms/internal/ads/po.s:(Landroid/app/ApplicationExitInfo;)I
        //   911: putfield        n3/C.a:I
        //   914: aload           18
        //   916: aload           18
        //   918: getfield        n3/C.j:B
        //   921: iconst_1       
        //   922: ior            
        //   923: i2b            
        //   924: putfield        n3/C.j:B
        //   927: aload           18
        //   929: aload_2        
        //   930: invokestatic    com/google/android/gms/internal/ads/po.t:(Landroid/app/ApplicationExitInfo;)J
        //   933: putfield        n3/C.e:J
        //   936: aload           18
        //   938: aload           18
        //   940: getfield        n3/C.j:B
        //   943: bipush          8
        //   945: ior            
        //   946: i2b            
        //   947: putfield        n3/C.j:B
        //   950: aload           18
        //   952: aload_2        
        //   953: invokestatic    com/google/android/gms/internal/ads/po.x:(Landroid/app/ApplicationExitInfo;)J
        //   956: putfield        n3/C.f:J
        //   959: aload           18
        //   961: aload           18
        //   963: getfield        n3/C.j:B
        //   966: bipush          16
        //   968: ior            
        //   969: i2b            
        //   970: putfield        n3/C.j:B
        //   973: aload           18
        //   975: aload           11
        //   977: putfield        n3/C.h:Ljava/lang/String;
        //   980: aload           18
        //   982: invokevirtual   n3/C.a:()Ln3/D;
        //   985: astore          18
        //   987: aload           13
        //   989: getfield        q3/c.D:Ljava/lang/Object;
        //   992: checkcast       Lk3/t;
        //   995: astore          11
        //   997: aload           11
        //   999: getfield        k3/t.a:Landroid/content/Context;
        //  1002: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  1005: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //  1008: getfield        android/content/res/Configuration.orientation:I
        //  1011: istore          5
        //  1013: new             Ljava/lang/Object;
        //  1016: dup            
        //  1017: invokespecial   java/lang/Object.<init>:()V
        //  1020: astore          17
        //  1022: aload           17
        //  1024: ldc_w           "anr"
        //  1027: putfield        n3/O.b:Ljava/lang/String;
        //  1030: aload           18
        //  1032: getfield        n3/D.g:J
        //  1035: lstore          8
        //  1037: aload           17
        //  1039: lload           8
        //  1041: putfield        n3/O.a:J
        //  1044: aload           17
        //  1046: aload           17
        //  1048: getfield        n3/O.g:B
        //  1051: iconst_1       
        //  1052: ior            
        //  1053: i2b            
        //  1054: putfield        n3/O.g:B
        //  1057: aload           11
        //  1059: getfield        k3/t.e:LC2/z;
        //  1062: invokevirtual   C2/z.f:()Ls3/a;
        //  1065: getfield        s3/a.b:Lcom/google/android/gms/internal/ads/n1;
        //  1068: getfield        com/google/android/gms/internal/ads/n1.c:Z
        //  1071: ifeq            1240
        //  1074: aload           11
        //  1076: getfield        k3/t.c:LC2/c;
        //  1079: astore_2       
        //  1080: aload_2        
        //  1081: getfield        C2/c.E:Ljava/lang/Object;
        //  1084: checkcast       Ljava/util/ArrayList;
        //  1087: invokevirtual   java/util/ArrayList.size:()I
        //  1090: ifle            1237
        //  1093: new             Ljava/util/ArrayList;
        //  1096: dup            
        //  1097: invokespecial   java/util/ArrayList.<init>:()V
        //  1100: astore          19
        //  1102: aload_2        
        //  1103: getfield        C2/c.E:Ljava/lang/Object;
        //  1106: checkcast       Ljava/util/ArrayList;
        //  1109: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  1112: astore_2       
        //  1113: aload_2        
        //  1114: invokeinterface java/util/Iterator.hasNext:()Z
        //  1119: ifeq            1224
        //  1122: aload_2        
        //  1123: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1128: checkcast       Lk3/d;
        //  1131: astore          22
        //  1133: aload           22
        //  1135: getfield        k3/d.a:Ljava/lang/String;
        //  1138: astore          21
        //  1140: aload           21
        //  1142: ifnull          1213
        //  1145: aload           22
        //  1147: getfield        k3/d.b:Ljava/lang/String;
        //  1150: astore          20
        //  1152: aload           20
        //  1154: ifnull          1202
        //  1157: aload           22
        //  1159: getfield        k3/d.c:Ljava/lang/String;
        //  1162: astore          22
        //  1164: aload           22
        //  1166: ifnull          1191
        //  1169: aload           19
        //  1171: new             Ln3/E;
        //  1174: dup            
        //  1175: aload           20
        //  1177: aload           21
        //  1179: aload           22
        //  1181: invokespecial   n3/E.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1184: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1187: pop            
        //  1188: goto            1113
        //  1191: new             Ljava/lang/NullPointerException;
        //  1194: dup            
        //  1195: ldc_w           "Null buildId"
        //  1198: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1201: athrow         
        //  1202: new             Ljava/lang/NullPointerException;
        //  1205: dup            
        //  1206: ldc_w           "Null arch"
        //  1209: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1212: athrow         
        //  1213: new             Ljava/lang/NullPointerException;
        //  1216: dup            
        //  1217: ldc_w           "Null libraryName"
        //  1220: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1223: athrow         
        //  1224: aload           10
        //  1226: astore_2       
        //  1227: aload           19
        //  1229: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  1232: astore          10
        //  1234: goto            1246
        //  1237: goto            1240
        //  1240: aload           10
        //  1242: astore_2       
        //  1243: aconst_null    
        //  1244: astore          10
        //  1246: new             Ljava/lang/Object;
        //  1249: dup            
        //  1250: invokespecial   java/lang/Object.<init>:()V
        //  1253: astore          20
        //  1255: aload           20
        //  1257: aload           18
        //  1259: getfield        n3/D.d:I
        //  1262: putfield        n3/C.d:I
        //  1265: aload           20
        //  1267: getfield        n3/C.j:B
        //  1270: iconst_4       
        //  1271: ior            
        //  1272: i2b            
        //  1273: istore          4
        //  1275: aload           20
        //  1277: iload           4
        //  1279: putfield        n3/C.j:B
        //  1282: aload           18
        //  1284: getfield        n3/D.b:Ljava/lang/String;
        //  1287: astore          19
        //  1289: aload           19
        //  1291: ifnull          1669
        //  1294: aload           20
        //  1296: aload           19
        //  1298: putfield        n3/C.b:Ljava/lang/String;
        //  1301: aload           20
        //  1303: aload           18
        //  1305: getfield        n3/D.c:I
        //  1308: putfield        n3/C.c:I
        //  1311: iload           4
        //  1313: iconst_2       
        //  1314: ior            
        //  1315: i2b            
        //  1316: istore          6
        //  1318: aload           20
        //  1320: lload           8
        //  1322: putfield        n3/C.g:J
        //  1325: iload           6
        //  1327: bipush          32
        //  1329: ior            
        //  1330: i2b            
        //  1331: istore          6
        //  1333: aload           20
        //  1335: aload           18
        //  1337: getfield        n3/D.a:I
        //  1340: putfield        n3/C.a:I
        //  1343: iload           6
        //  1345: iconst_1       
        //  1346: ior            
        //  1347: i2b            
        //  1348: istore          6
        //  1350: aload           20
        //  1352: aload           18
        //  1354: getfield        n3/D.e:J
        //  1357: putfield        n3/C.e:J
        //  1360: iload           6
        //  1362: bipush          8
        //  1364: ior            
        //  1365: i2b            
        //  1366: istore          6
        //  1368: aload           20
        //  1370: aload           18
        //  1372: getfield        n3/D.f:J
        //  1375: putfield        n3/C.f:J
        //  1378: aload           20
        //  1380: iload           6
        //  1382: bipush          16
        //  1384: ior            
        //  1385: i2b            
        //  1386: putfield        n3/C.j:B
        //  1389: aload           20
        //  1391: aload           18
        //  1393: getfield        n3/D.h:Ljava/lang/String;
        //  1396: putfield        n3/C.h:Ljava/lang/String;
        //  1399: aload           20
        //  1401: aload           10
        //  1403: putfield        n3/C.i:Ljava/util/List;
        //  1406: aload           20
        //  1408: invokevirtual   n3/C.a:()Ln3/D;
        //  1411: astore          10
        //  1413: aload           10
        //  1415: getfield        n3/D.d:I
        //  1418: bipush          100
        //  1420: if_icmpeq       1429
        //  1423: iconst_1       
        //  1424: istore          7
        //  1426: goto            1432
        //  1429: iconst_0       
        //  1430: istore          7
        //  1432: getstatic       h3/c.b:Lh3/c;
        //  1435: astore          19
        //  1437: aload           10
        //  1439: getfield        n3/D.b:Ljava/lang/String;
        //  1442: astore          18
        //  1444: ldc_w           "processName"
        //  1447: aload           18
        //  1449: invokestatic    n5/h.e:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1452: aload           10
        //  1454: getfield        n3/D.d:I
        //  1457: istore          6
        //  1459: aload           19
        //  1461: aload           18
        //  1463: aload           10
        //  1465: getfield        n3/D.a:I
        //  1468: iload           6
        //  1470: bipush          8
        //  1472: invokestatic    h3/c.a:(Lh3/c;Ljava/lang/String;III)Ln3/a0;
        //  1475: astore          18
        //  1477: iconst_1       
        //  1478: i2b            
        //  1479: istore          6
        //  1481: invokestatic    k3/t.e:()Ln3/V;
        //  1484: astore          19
        //  1486: aload           11
        //  1488: invokevirtual   k3/t.a:()Ljava/util/List;
        //  1491: astore          20
        //  1493: aload           20
        //  1495: ifnull          1658
        //  1498: new             Ln3/S;
        //  1501: dup            
        //  1502: aconst_null    
        //  1503: aconst_null    
        //  1504: aload           10
        //  1506: aload           19
        //  1508: aload           20
        //  1510: invokespecial   n3/S.<init>:(Ljava/util/List;Ln3/U;Ln3/q0;Ln3/V;Ljava/util/List;)V
        //  1513: astore          10
        //  1515: iload           6
        //  1517: iconst_1       
        //  1518: if_icmpne       1622
        //  1521: aload           17
        //  1523: new             Ln3/Q;
        //  1526: dup            
        //  1527: aload           10
        //  1529: aconst_null    
        //  1530: aconst_null    
        //  1531: iload           7
        //  1533: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1536: aload           18
        //  1538: aconst_null    
        //  1539: iload           5
        //  1541: invokespecial   n3/Q.<init>:(Ln3/S;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ln3/D0;Ljava/util/List;I)V
        //  1544: putfield        n3/O.c:Ln3/Q;
        //  1547: aload           17
        //  1549: aload           11
        //  1551: iload           5
        //  1553: invokevirtual   k3/t.b:(I)Ln3/c0;
        //  1556: putfield        n3/O.d:Ln3/c0;
        //  1559: aload           17
        //  1561: invokevirtual   n3/O.a:()Ln3/P;
        //  1564: astore          10
        //  1566: ldc_w           "Persisting anr for session "
        //  1569: aload           14
        //  1571: invokestatic    m0/a.f:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1574: astore          11
        //  1576: ldc             "FirebaseCrashlytics"
        //  1578: iconst_3       
        //  1579: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1582: ifeq            1594
        //  1585: ldc             "FirebaseCrashlytics"
        //  1587: aload           11
        //  1589: aconst_null    
        //  1590: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1593: pop            
        //  1594: aload           12
        //  1596: aload           10
        //  1598: aload           16
        //  1600: aload           15
        //  1602: invokestatic    q3/c.a:(Ln3/P;Lm3/e;Lo/q1;)Ln3/P;
        //  1605: aload           15
        //  1607: invokestatic    q3/c.b:(Ln3/P;Lo/q1;)Ln3/K0;
        //  1610: aload           14
        //  1612: iconst_1       
        //  1613: invokevirtual   q3/a.d:(Ln3/K0;Ljava/lang/String;Z)V
        //  1616: aload_2        
        //  1617: astore          10
        //  1619: goto            1728
        //  1622: new             Ljava/lang/StringBuilder;
        //  1625: dup            
        //  1626: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1629: astore_2       
        //  1630: iload           6
        //  1632: ifne            1643
        //  1635: aload_2        
        //  1636: ldc_w           " uiOrientation"
        //  1639: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1642: pop            
        //  1643: new             Ljava/lang/IllegalStateException;
        //  1646: dup            
        //  1647: ldc_w           "Missing required properties:"
        //  1650: aload_2        
        //  1651: invokestatic    com/google/android/gms/internal/measurement/L.k:(Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
        //  1654: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1657: athrow         
        //  1658: new             Ljava/lang/NullPointerException;
        //  1661: dup            
        //  1662: ldc_w           "Null binaries"
        //  1665: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1668: athrow         
        //  1669: new             Ljava/lang/NullPointerException;
        //  1672: dup            
        //  1673: ldc_w           "Null processName"
        //  1676: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1679: athrow         
        //  1680: new             Ljava/lang/NullPointerException;
        //  1683: dup            
        //  1684: ldc_w           "Null processName"
        //  1687: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1690: athrow         
        //  1691: aload           10
        //  1693: astore_2       
        //  1694: ldc_w           "No ApplicationExitInfo available. Session: "
        //  1697: aload           14
        //  1699: invokestatic    m0/a.f:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1702: astore          11
        //  1704: aload_2        
        //  1705: astore          10
        //  1707: ldc             "FirebaseCrashlytics"
        //  1709: iconst_2       
        //  1710: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1713: ifeq            1728
        //  1716: ldc             "FirebaseCrashlytics"
        //  1718: aload           11
        //  1720: aconst_null    
        //  1721: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1724: pop            
        //  1725: goto            1796
        //  1728: aload           10
        //  1730: astore_2       
        //  1731: goto            1796
        //  1734: iload           5
        //  1736: ldc_w           "ANR feature enabled, but device is API "
        //  1739: invokestatic    com/google/android/gms/internal/measurement/L.h:(ILjava/lang/String;)Ljava/lang/String;
        //  1742: astore          11
        //  1744: aload           10
        //  1746: astore_2       
        //  1747: ldc             "FirebaseCrashlytics"
        //  1749: iconst_2       
        //  1750: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1753: ifeq            1796
        //  1756: ldc             "FirebaseCrashlytics"
        //  1758: aload           11
        //  1760: aconst_null    
        //  1761: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1764: pop            
        //  1765: aload           10
        //  1767: astore_2       
        //  1768: goto            1796
        //  1771: aload           10
        //  1773: astore_2       
        //  1774: ldc             "FirebaseCrashlytics"
        //  1776: iconst_2       
        //  1777: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1780: ifeq            1796
        //  1783: ldc             "FirebaseCrashlytics"
        //  1785: ldc_w           "ANR feature disabled."
        //  1788: aconst_null    
        //  1789: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1792: pop            
        //  1793: aload           10
        //  1795: astore_2       
        //  1796: iload_3        
        //  1797: ifeq            1932
        //  1800: aload_0        
        //  1801: getfield        k3/m.j:Lh3/a;
        //  1804: astore          10
        //  1806: aload           10
        //  1808: aload           14
        //  1810: invokevirtual   h3/a.c:(Ljava/lang/String;)Z
        //  1813: ifeq            1932
        //  1816: ldc_w           "Finalizing native report for session "
        //  1819: aload           14
        //  1821: invokestatic    m0/a.f:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1824: astore          11
        //  1826: ldc             "FirebaseCrashlytics"
        //  1828: iconst_2       
        //  1829: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1832: ifeq            1844
        //  1835: ldc             "FirebaseCrashlytics"
        //  1837: aload           11
        //  1839: aconst_null    
        //  1840: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1843: pop            
        //  1844: aload           10
        //  1846: aload           14
        //  1848: invokevirtual   h3/a.a:(Ljava/lang/String;)Lh3/c;
        //  1851: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1854: pop            
        //  1855: new             Ljava/lang/StringBuilder;
        //  1858: dup            
        //  1859: ldc_w           "No minidump data found for session "
        //  1862: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1865: astore          10
        //  1867: aload           10
        //  1869: aload           14
        //  1871: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1874: pop            
        //  1875: ldc             "FirebaseCrashlytics"
        //  1877: aload           10
        //  1879: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1882: aconst_null    
        //  1883: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1886: pop            
        //  1887: new             Ljava/lang/StringBuilder;
        //  1890: dup            
        //  1891: ldc_w           "No Tombstones data found for session "
        //  1894: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1897: astore          10
        //  1899: aload           10
        //  1901: aload           14
        //  1903: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1906: pop            
        //  1907: ldc             "FirebaseCrashlytics"
        //  1909: aload           10
        //  1911: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1914: aconst_null    
        //  1915: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1918: pop            
        //  1919: ldc             "FirebaseCrashlytics"
        //  1921: ldc_w           "No native core present"
        //  1924: aconst_null    
        //  1925: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1928: pop            
        //  1929: goto            1932
        //  1932: iload_1        
        //  1933: ifeq            1948
        //  1936: aload_2        
        //  1937: iconst_0       
        //  1938: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1941: checkcast       Ljava/lang/String;
        //  1944: astore_2       
        //  1945: goto            1958
        //  1948: aload_0        
        //  1949: getfield        k3/m.l:Lk3/j;
        //  1952: aconst_null    
        //  1953: invokevirtual   k3/j.a:(Ljava/lang/String;)V
        //  1956: aconst_null    
        //  1957: astore_2       
        //  1958: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1961: ldc2_w          1000
        //  1964: ldiv           
        //  1965: lstore          8
        //  1967: aload           13
        //  1969: getfield        q3/c.E:Ljava/lang/Object;
        //  1972: checkcast       Lq3/a;
        //  1975: astore          10
        //  1977: aload           10
        //  1979: getfield        q3/a.b:Lq3/c;
        //  1982: astore          11
        //  1984: aload           11
        //  1986: ldc_w           ".com.google.firebase.crashlytics"
        //  1989: invokevirtual   q3/c.c:(Ljava/lang/String;)V
        //  1992: aload           11
        //  1994: ldc_w           ".com.google.firebase.crashlytics-ndk"
        //  1997: invokevirtual   q3/c.c:(Ljava/lang/String;)V
        //  2000: aload           11
        //  2002: getfield        q3/c.D:Ljava/lang/Object;
        //  2005: checkcast       Ljava/lang/String;
        //  2008: invokevirtual   java/lang/String.isEmpty:()Z
        //  2011: ifne            2117
        //  2014: aload           11
        //  2016: ldc_w           ".com.google.firebase.crashlytics.files.v1"
        //  2019: invokevirtual   q3/c.c:(Ljava/lang/String;)V
        //  2022: new             Ljava/lang/StringBuilder;
        //  2025: dup            
        //  2026: ldc_w           ".com.google.firebase.crashlytics.files.v2"
        //  2029: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2032: astore          12
        //  2034: aload           12
        //  2036: getstatic       java/io/File.pathSeparator:Ljava/lang/String;
        //  2039: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2042: pop            
        //  2043: aload           12
        //  2045: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2048: astore          12
        //  2050: aload           11
        //  2052: getfield        q3/c.E:Ljava/lang/Object;
        //  2055: checkcast       Ljava/io/File;
        //  2058: astore          13
        //  2060: aload           13
        //  2062: invokevirtual   java/io/File.exists:()Z
        //  2065: ifeq            2117
        //  2068: aload           13
        //  2070: new             Lq3/b;
        //  2073: dup            
        //  2074: aload           12
        //  2076: invokespecial   q3/b.<init>:(Ljava/lang/String;)V
        //  2079: invokevirtual   java/io/File.list:(Ljava/io/FilenameFilter;)[Ljava/lang/String;
        //  2082: astore          12
        //  2084: aload           12
        //  2086: ifnull          2117
        //  2089: aload           12
        //  2091: arraylength    
        //  2092: istore          5
        //  2094: iconst_0       
        //  2095: istore_1       
        //  2096: iload_1        
        //  2097: iload           5
        //  2099: if_icmpge       2117
        //  2102: aload           11
        //  2104: aload           12
        //  2106: iload_1        
        //  2107: aaload         
        //  2108: invokevirtual   q3/c.c:(Ljava/lang/String;)V
        //  2111: iinc            1, 1
        //  2114: goto            2096
        //  2117: aload           10
        //  2119: invokevirtual   q3/a.c:()Ljava/util/NavigableSet;
        //  2122: astore          12
        //  2124: aload_2        
        //  2125: ifnull          2137
        //  2128: aload           12
        //  2130: aload_2        
        //  2131: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //  2136: pop            
        //  2137: aload           12
        //  2139: invokeinterface java/util/Set.size:()I
        //  2144: bipush          8
        //  2146: if_icmpgt       2152
        //  2149: goto            2236
        //  2152: aload           12
        //  2154: invokeinterface java/util/Set.size:()I
        //  2159: bipush          8
        //  2161: if_icmple       2236
        //  2164: aload           12
        //  2166: invokeinterface java/util/SortedSet.last:()Ljava/lang/Object;
        //  2171: checkcast       Ljava/lang/String;
        //  2174: astore          13
        //  2176: ldc_w           "Removing session over cap: "
        //  2179: aload           13
        //  2181: invokestatic    m0/a.f:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2184: astore_2       
        //  2185: ldc             "FirebaseCrashlytics"
        //  2187: iconst_3       
        //  2188: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  2191: ifeq            2202
        //  2194: ldc             "FirebaseCrashlytics"
        //  2196: aload_2        
        //  2197: aconst_null    
        //  2198: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2201: pop            
        //  2202: new             Ljava/io/File;
        //  2205: dup            
        //  2206: aload           11
        //  2208: getfield        q3/c.G:Ljava/lang/Object;
        //  2211: checkcast       Ljava/io/File;
        //  2214: aload           13
        //  2216: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  2219: invokestatic    q3/c.i:(Ljava/io/File;)Z
        //  2222: pop            
        //  2223: aload           12
        //  2225: aload           13
        //  2227: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //  2232: pop            
        //  2233: goto            2152
        //  2236: aload           12
        //  2238: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //  2243: astore          13
        //  2245: aload           13
        //  2247: invokeinterface java/util/Iterator.hasNext:()Z
        //  2252: ifeq            3273
        //  2255: aload           13
        //  2257: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2262: checkcast       Ljava/lang/String;
        //  2265: astore          12
        //  2267: ldc_w           "Finalizing report for session "
        //  2270: aload           12
        //  2272: invokestatic    m0/a.f:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2275: astore_2       
        //  2276: ldc             "FirebaseCrashlytics"
        //  2278: iconst_2       
        //  2279: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  2282: ifeq            2293
        //  2285: ldc             "FirebaseCrashlytics"
        //  2287: aload_2        
        //  2288: aconst_null    
        //  2289: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2292: pop            
        //  2293: getstatic       q3/a.i:Lk3/h;
        //  2296: astore          14
        //  2298: new             Ljava/io/File;
        //  2301: dup            
        //  2302: aload           11
        //  2304: getfield        q3/c.G:Ljava/lang/Object;
        //  2307: checkcast       Ljava/io/File;
        //  2310: aload           12
        //  2312: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  2315: astore_2       
        //  2316: aload_2        
        //  2317: invokevirtual   java/io/File.mkdirs:()Z
        //  2320: pop            
        //  2321: aload_2        
        //  2322: aload           14
        //  2324: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //  2327: invokestatic    q3/c.j:([Ljava/lang/Object;)Ljava/util/List;
        //  2330: astore_2       
        //  2331: aload_2        
        //  2332: invokeinterface java/util/List.isEmpty:()Z
        //  2337: ifeq            2372
        //  2340: ldc_w           "Session "
        //  2343: aload           12
        //  2345: ldc_w           " has no events."
        //  2348: invokestatic    m0/a.g:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2351: astore_2       
        //  2352: ldc             "FirebaseCrashlytics"
        //  2354: iconst_2       
        //  2355: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  2358: ifeq            2369
        //  2361: ldc             "FirebaseCrashlytics"
        //  2363: aload_2        
        //  2364: aconst_null    
        //  2365: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2368: pop            
        //  2369: goto            3244
        //  2372: aload_2        
        //  2373: invokestatic    java/util/Collections.sort:(Ljava/util/List;)V
        //  2376: new             Ljava/util/ArrayList;
        //  2379: dup            
        //  2380: invokespecial   java/util/ArrayList.<init>:()V
        //  2383: astore          15
        //  2385: aload_2        
        //  2386: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2391: astore          14
        //  2393: iconst_0       
        //  2394: istore_3       
        //  2395: aload           14
        //  2397: invokeinterface java/util/Iterator.hasNext:()Z
        //  2402: istore          7
        //  2404: getstatic       q3/a.g:Lo3/a;
        //  2407: astore          17
        //  2409: iload           7
        //  2411: ifeq            2612
        //  2414: aload           14
        //  2416: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2421: checkcast       Ljava/io/File;
        //  2424: astore_2       
        //  2425: aload_2        
        //  2426: invokestatic    q3/a.e:(Ljava/io/File;)Ljava/lang/String;
        //  2429: astore          18
        //  2431: aload           17
        //  2433: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2436: pop            
        //  2437: new             Landroid/util/JsonReader;
        //  2440: astore          16
        //  2442: new             Ljava/io/StringReader;
        //  2445: astore          17
        //  2447: aload           17
        //  2449: aload           18
        //  2451: invokespecial   java/io/StringReader.<init>:(Ljava/lang/String;)V
        //  2454: aload           16
        //  2456: aload           17
        //  2458: invokespecial   android/util/JsonReader.<init>:(Ljava/io/Reader;)V
        //  2461: aload           16
        //  2463: invokestatic    o3/a.e:(Landroid/util/JsonReader;)Ln3/P;
        //  2466: astore          17
        //  2468: aload           16
        //  2470: invokevirtual   android/util/JsonReader.close:()V
        //  2473: aload           15
        //  2475: aload           17
        //  2477: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2480: pop            
        //  2481: iload_3        
        //  2482: ifne            2530
        //  2485: aload_2        
        //  2486: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //  2489: astore          16
        //  2491: aload           16
        //  2493: ldc_w           "event"
        //  2496: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  2499: ifeq            2520
        //  2502: aload           16
        //  2504: ldc_w           "_"
        //  2507: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //  2510: istore          7
        //  2512: iload           7
        //  2514: ifeq            2520
        //  2517: goto            2530
        //  2520: iconst_0       
        //  2521: istore_3       
        //  2522: goto            2532
        //  2525: astore          16
        //  2527: goto            2577
        //  2530: iconst_1       
        //  2531: istore_3       
        //  2532: goto            2609
        //  2535: astore          16
        //  2537: goto            2562
        //  2540: astore          17
        //  2542: aload           16
        //  2544: invokevirtual   android/util/JsonReader.close:()V
        //  2547: goto            2559
        //  2550: astore          16
        //  2552: aload           17
        //  2554: aload           16
        //  2556: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  2559: aload           17
        //  2561: athrow         
        //  2562: new             Ljava/io/IOException;
        //  2565: astore          17
        //  2567: aload           17
        //  2569: aload           16
        //  2571: invokespecial   java/io/IOException.<init>:(Ljava/lang/Throwable;)V
        //  2574: aload           17
        //  2576: athrow         
        //  2577: new             Ljava/lang/StringBuilder;
        //  2580: dup            
        //  2581: ldc_w           "Could not add event to report for "
        //  2584: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2587: astore          17
        //  2589: aload           17
        //  2591: aload_2        
        //  2592: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  2595: pop            
        //  2596: ldc             "FirebaseCrashlytics"
        //  2598: aload           17
        //  2600: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2603: aload           16
        //  2605: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2608: pop            
        //  2609: goto            2395
        //  2612: aload           15
        //  2614: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  2617: ifeq            2652
        //  2620: new             Ljava/lang/StringBuilder;
        //  2623: dup            
        //  2624: ldc_w           "Could not parse event files for session "
        //  2627: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2630: astore_2       
        //  2631: aload_2        
        //  2632: aload           12
        //  2634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2637: pop            
        //  2638: ldc             "FirebaseCrashlytics"
        //  2640: aload_2        
        //  2641: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2644: aconst_null    
        //  2645: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2648: pop            
        //  2649: goto            2369
        //  2652: new             Lm3/g;
        //  2655: dup            
        //  2656: aload           11
        //  2658: invokespecial   m3/g.<init>:(Lq3/c;)V
        //  2661: aload           12
        //  2663: invokevirtual   m3/g.d:(Ljava/lang/String;)Ljava/lang/String;
        //  2666: astore          16
        //  2668: aload           10
        //  2670: getfield        q3/a.d:Lk3/j;
        //  2673: getfield        k3/j.b:Lk3/i;
        //  2676: astore          14
        //  2678: aload           14
        //  2680: dup            
        //  2681: astore          23
        //  2683: monitorenter   
        //  2684: aload           14
        //  2686: getfield        k3/i.b:Ljava/lang/String;
        //  2689: aload           12
        //  2691: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2694: ifeq            2713
        //  2697: aload           14
        //  2699: getfield        k3/i.c:Ljava/lang/String;
        //  2702: astore_2       
        //  2703: aload           23
        //  2705: monitorexit    
        //  2706: goto            2805
        //  2709: astore_2       
        //  2710: goto            3268
        //  2713: aload           14
        //  2715: getfield        k3/i.a:Lq3/c;
        //  2718: astore          18
        //  2720: getstatic       k3/i.d:Lk3/h;
        //  2723: astore_2       
        //  2724: new             Ljava/io/File;
        //  2727: astore          19
        //  2729: aload           19
        //  2731: aload           18
        //  2733: getfield        q3/c.G:Ljava/lang/Object;
        //  2736: checkcast       Ljava/io/File;
        //  2739: aload           12
        //  2741: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  2744: aload           19
        //  2746: invokevirtual   java/io/File.mkdirs:()Z
        //  2749: pop            
        //  2750: aload           19
        //  2752: aload_2        
        //  2753: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //  2756: invokestatic    q3/c.j:([Ljava/lang/Object;)Ljava/util/List;
        //  2759: astore_2       
        //  2760: aload_2        
        //  2761: invokeinterface java/util/List.isEmpty:()Z
        //  2766: ifeq            2784
        //  2769: ldc             "FirebaseCrashlytics"
        //  2771: ldc_w           "Unable to read App Quality Sessions session id."
        //  2774: aconst_null    
        //  2775: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2778: pop            
        //  2779: aconst_null    
        //  2780: astore_2       
        //  2781: goto            2802
        //  2784: aload_2        
        //  2785: getstatic       k3/i.e:LL/a;
        //  2788: invokestatic    java/util/Collections.min:(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;
        //  2791: checkcast       Ljava/io/File;
        //  2794: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //  2797: iconst_4       
        //  2798: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  2801: astore_2       
        //  2802: aload           23
        //  2804: monitorexit    
        //  2805: aload           11
        //  2807: aload           12
        //  2809: ldc_w           "report"
        //  2812: invokevirtual   q3/c.e:(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //  2815: astore          14
        //  2817: aload           14
        //  2819: invokestatic    q3/a.e:(Ljava/io/File;)Ljava/lang/String;
        //  2822: astore          18
        //  2824: aload           17
        //  2826: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2829: pop            
        //  2830: aload           18
        //  2832: invokestatic    o3/a.i:(Ljava/lang/String;)Ln3/B;
        //  2835: astore          18
        //  2837: aload           18
        //  2839: invokevirtual   n3/B.a:()Ln3/A;
        //  2842: astore          17
        //  2844: aload           18
        //  2846: getfield        n3/B.k:Ln3/J;
        //  2849: astore          18
        //  2851: aload           18
        //  2853: ifnull          2939
        //  2856: aload           18
        //  2858: invokevirtual   n3/J.a:()Ln3/I;
        //  2861: astore          19
        //  2863: aload           19
        //  2865: lload           8
        //  2867: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2870: putfield        n3/I.e:Ljava/lang/Long;
        //  2873: aload           19
        //  2875: iload_3        
        //  2876: putfield        n3/I.f:Z
        //  2879: aload           19
        //  2881: getfield        n3/I.m:B
        //  2884: istore_1       
        //  2885: iload_1        
        //  2886: iconst_2       
        //  2887: ior            
        //  2888: i2b            
        //  2889: istore          4
        //  2891: aload           19
        //  2893: iload           4
        //  2895: putfield        n3/I.m:B
        //  2898: aload           16
        //  2900: ifnull          2922
        //  2903: new             Ln3/k0;
        //  2906: astore          18
        //  2908: aload           18
        //  2910: aload           16
        //  2912: invokespecial   n3/k0.<init>:(Ljava/lang/String;)V
        //  2915: aload           19
        //  2917: aload           18
        //  2919: putfield        n3/I.h:Ln3/k0;
        //  2922: aload           17
        //  2924: aload           19
        //  2926: invokevirtual   n3/I.a:()Ln3/J;
        //  2929: putfield        n3/A.j:Ln3/J;
        //  2932: goto            2939
        //  2935: astore_2       
        //  2936: goto            3195
        //  2939: aload           17
        //  2941: invokevirtual   n3/A.a:()Ln3/B;
        //  2944: astore          17
        //  2946: aload           17
        //  2948: invokevirtual   n3/B.a:()Ln3/A;
        //  2951: astore          16
        //  2953: aload           16
        //  2955: aload_2        
        //  2956: putfield        n3/A.g:Ljava/lang/String;
        //  2959: aload           17
        //  2961: getfield        n3/B.k:Ln3/J;
        //  2964: astore          17
        //  2966: aload           17
        //  2968: ifnull          2994
        //  2971: aload           17
        //  2973: invokevirtual   n3/J.a:()Ln3/I;
        //  2976: astore          17
        //  2978: aload           17
        //  2980: aload_2        
        //  2981: putfield        n3/I.c:Ljava/lang/String;
        //  2984: aload           16
        //  2986: aload           17
        //  2988: invokevirtual   n3/I.a:()Ln3/J;
        //  2991: putfield        n3/A.j:Ln3/J;
        //  2994: aload           16
        //  2996: invokevirtual   n3/A.a:()Ln3/B;
        //  2999: astore          17
        //  3001: aload           17
        //  3003: getfield        n3/B.k:Ln3/J;
        //  3006: astore          16
        //  3008: aload           16
        //  3010: ifnull          3198
        //  3013: aload           17
        //  3015: invokevirtual   n3/B.a:()Ln3/A;
        //  3018: astore          17
        //  3020: aload           16
        //  3022: invokevirtual   n3/J.a:()Ln3/I;
        //  3025: astore          16
        //  3027: aload           16
        //  3029: aload           15
        //  3031: putfield        n3/I.k:Ljava/util/List;
        //  3034: aload           17
        //  3036: aload           16
        //  3038: invokevirtual   n3/I.a:()Ln3/J;
        //  3041: putfield        n3/A.j:Ln3/J;
        //  3044: aload           17
        //  3046: invokevirtual   n3/A.a:()Ln3/B;
        //  3049: astore          15
        //  3051: aload           15
        //  3053: getfield        n3/B.k:Ln3/J;
        //  3056: astore          16
        //  3058: aload           16
        //  3060: ifnonnull       3066
        //  3063: goto            3244
        //  3066: new             Ljava/lang/StringBuilder;
        //  3069: astore          17
        //  3071: aload           17
        //  3073: ldc_w           "appQualitySessionId: "
        //  3076: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  3079: aload           17
        //  3081: aload_2        
        //  3082: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3085: pop            
        //  3086: aload           17
        //  3088: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3091: astore_2       
        //  3092: ldc             "FirebaseCrashlytics"
        //  3094: iconst_3       
        //  3095: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  3098: istore          7
        //  3100: iload           7
        //  3102: ifeq            3116
        //  3105: ldc             "FirebaseCrashlytics"
        //  3107: aload_2        
        //  3108: aconst_null    
        //  3109: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  3112: pop            
        //  3113: goto            3116
        //  3116: iload_3        
        //  3117: ifeq            3148
        //  3120: aload           16
        //  3122: getfield        n3/J.b:Ljava/lang/String;
        //  3125: astore          16
        //  3127: new             Ljava/io/File;
        //  3130: astore_2       
        //  3131: aload_2        
        //  3132: aload           11
        //  3134: getfield        q3/c.I:Ljava/lang/Object;
        //  3137: checkcast       Ljava/io/File;
        //  3140: aload           16
        //  3142: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  3145: goto            3171
        //  3148: aload           16
        //  3150: getfield        n3/J.b:Ljava/lang/String;
        //  3153: astore_2       
        //  3154: new             Ljava/io/File;
        //  3157: dup            
        //  3158: aload           11
        //  3160: getfield        q3/c.H:Ljava/lang/Object;
        //  3163: checkcast       Ljava/io/File;
        //  3166: aload_2        
        //  3167: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  3170: astore_2       
        //  3171: aload_2        
        //  3172: getstatic       o3/a.a:LX/a;
        //  3175: aload           15
        //  3177: invokevirtual   X/a.t:(Ljava/lang/Object;)Ljava/lang/String;
        //  3180: invokestatic    q3/a.f:(Ljava/io/File;Ljava/lang/String;)V
        //  3183: goto            3244
        //  3186: astore_2       
        //  3187: goto            3212
        //  3190: astore_2       
        //  3191: goto            3195
        //  3194: astore_2       
        //  3195: goto            3212
        //  3198: new             Ljava/lang/IllegalStateException;
        //  3201: astore_2       
        //  3202: aload_2        
        //  3203: ldc_w           "Reports without sessions cannot have events added to them."
        //  3206: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  3209: aload_2        
        //  3210: athrow         
        //  3211: astore_2       
        //  3212: new             Ljava/lang/StringBuilder;
        //  3215: dup            
        //  3216: ldc_w           "Could not synthesize final report file for "
        //  3219: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  3222: astore          15
        //  3224: aload           15
        //  3226: aload           14
        //  3228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  3231: pop            
        //  3232: ldc             "FirebaseCrashlytics"
        //  3234: aload           15
        //  3236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3239: aload_2        
        //  3240: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  3243: pop            
        //  3244: new             Ljava/io/File;
        //  3247: dup            
        //  3248: aload           11
        //  3250: getfield        q3/c.G:Ljava/lang/Object;
        //  3253: checkcast       Ljava/io/File;
        //  3256: aload           12
        //  3258: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  3261: invokestatic    q3/c.i:(Ljava/io/File;)Z
        //  3264: pop            
        //  3265: goto            2245
        //  3268: aload           23
        //  3270: monitorexit    
        //  3271: aload_2        
        //  3272: athrow         
        //  3273: aload           10
        //  3275: getfield        q3/a.c:LC2/z;
        //  3278: invokevirtual   C2/z.f:()Ls3/a;
        //  3281: getfield        s3/a.a:LR0/m;
        //  3284: astore_2       
        //  3285: aload           10
        //  3287: invokevirtual   q3/a.b:()Ljava/util/ArrayList;
        //  3290: astore_2       
        //  3291: aload_2        
        //  3292: invokevirtual   java/util/ArrayList.size:()I
        //  3295: istore_1       
        //  3296: iload_1        
        //  3297: iconst_4       
        //  3298: if_icmpgt       3304
        //  3301: goto            3341
        //  3304: aload_2        
        //  3305: iconst_4       
        //  3306: iload_1        
        //  3307: invokevirtual   java/util/ArrayList.subList:(II)Ljava/util/List;
        //  3310: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3315: astore_2       
        //  3316: aload_2        
        //  3317: invokeinterface java/util/Iterator.hasNext:()Z
        //  3322: ifeq            3341
        //  3325: aload_2        
        //  3326: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3331: checkcast       Ljava/io/File;
        //  3334: invokevirtual   java/io/File.delete:()Z
        //  3337: pop            
        //  3338: goto            3316
        //  3341: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  317    329    460    465    Ljava/lang/Exception;
        //  317    329    453    460    Any
        //  332    342    448    453    Ljava/lang/Exception;
        //  332    342    443    448    Any
        //  345    350    448    453    Ljava/lang/Exception;
        //  345    350    443    448    Any
        //  353    361    448    453    Ljava/lang/Exception;
        //  353    361    443    448    Any
        //  364    372    448    453    Ljava/lang/Exception;
        //  364    372    443    448    Any
        //  375    384    448    453    Ljava/lang/Exception;
        //  375    384    443    448    Any
        //  387    395    448    453    Ljava/lang/Exception;
        //  387    395    443    448    Any
        //  398    405    448    453    Ljava/lang/Exception;
        //  398    405    443    448    Any
        //  408    417    448    453    Ljava/lang/Exception;
        //  408    417    443    448    Any
        //  420    429    448    453    Ljava/lang/Exception;
        //  420    429    443    448    Any
        //  468    479    443    448    Any
        //  482    487    443    448    Any
        //  683    689    755    808    Ljava/io/IOException;
        //  694    711    755    808    Ljava/io/IOException;
        //  711    720    755    808    Ljava/io/IOException;
        //  726    736    755    808    Ljava/io/IOException;
        //  739    752    755    808    Ljava/io/IOException;
        //  2425   2437   2525   2530   Ljava/io/IOException;
        //  2437   2461   2535   2540   Ljava/lang/IllegalStateException;
        //  2437   2461   2525   2530   Ljava/io/IOException;
        //  2461   2468   2540   2562   Any
        //  2468   2473   2535   2540   Ljava/lang/IllegalStateException;
        //  2468   2473   2525   2530   Ljava/io/IOException;
        //  2473   2481   2525   2530   Ljava/io/IOException;
        //  2485   2512   2525   2530   Ljava/io/IOException;
        //  2542   2547   2550   2559   Any
        //  2552   2559   2535   2540   Ljava/lang/IllegalStateException;
        //  2552   2559   2525   2530   Ljava/io/IOException;
        //  2559   2562   2535   2540   Ljava/lang/IllegalStateException;
        //  2559   2562   2525   2530   Ljava/io/IOException;
        //  2562   2577   2525   2530   Ljava/io/IOException;
        //  2684   2703   2709   3273   Any
        //  2713   2779   2709   3273   Any
        //  2784   2802   2709   3273   Any
        //  2817   2851   3211   3212   Ljava/io/IOException;
        //  2856   2885   2935   2939   Ljava/io/IOException;
        //  2891   2898   3194   3195   Ljava/io/IOException;
        //  2903   2922   3194   3195   Ljava/io/IOException;
        //  2922   2932   3194   3195   Ljava/io/IOException;
        //  2939   2966   3194   3195   Ljava/io/IOException;
        //  2971   2994   3194   3195   Ljava/io/IOException;
        //  2994   3008   3194   3195   Ljava/io/IOException;
        //  3013   3058   3194   3195   Ljava/io/IOException;
        //  3066   3092   3194   3195   Ljava/io/IOException;
        //  3092   3100   3190   3194   Ljava/io/IOException;
        //  3105   3113   3186   3190   Ljava/io/IOException;
        //  3120   3145   3186   3190   Ljava/io/IOException;
        //  3148   3171   3186   3190   Ljava/io/IOException;
        //  3171   3183   3186   3190   Ljava/io/IOException;
        //  3198   3211   3186   3190   Ljava/io/IOException;
        //  3268   3271   2709   3273   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 1510 out of bounds for length 1510
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2125)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:21)
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
    
    public final void c(String a, Boolean b) {
        final long d = System.currentTimeMillis() / 1000L;
        final String f = m0.a.f("Opening a new session with ID ", a);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", f, (Throwable)null);
        }
        final Locale us = Locale.US;
        final z f2 = this.f;
        final C2.c h = this.h;
        final String c = f2.c;
        final String s = (String)h.H;
        final String a2 = f2.c().a;
        int n;
        if (h.F != null) {
            n = 4;
        }
        else {
            n = 1;
        }
        final m0 m0 = new m0(c, s, (String)h.I, a2, L.d(n), (h1.m)h.J);
        final String release = Build$VERSION.RELEASE;
        final String codename = Build$VERSION.CODENAME;
        final o0 o0 = new o0(release, codename, k3.g.g());
        final Context a3 = this.a;
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        final long n2 = statFs.getBlockCount();
        final long n3 = statFs.getBlockSize();
        final f c2 = k3.f.C;
        final String cpu_ABI = Build.CPU_ABI;
        final boolean empty = TextUtils.isEmpty((CharSequence)cpu_ABI);
        final f c3 = k3.f.C;
        f f3;
        if (empty) {
            f3 = c3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", (Throwable)null);
                f3 = c3;
            }
        }
        else {
            f3 = (f)k3.f.D.get((Object)cpu_ABI.toLowerCase(us));
            if (f3 == null) {
                f3 = c3;
            }
        }
        final int ordinal = f3.ordinal();
        final String model = Build.MODEL;
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final long a4 = k3.g.a(a3);
        final boolean f4 = k3.g.f();
        final int c4 = k3.g.c();
        final String manufacturer = Build.MANUFACTURER;
        final String product = Build.PRODUCT;
        this.j.d(a, d, new l0(m0, o0, new n0(ordinal, model, availableProcessors, a4, n2 * n3, f4, c4, manufacturer, product)));
        Label_0547: {
            if (b && a != null) {
                final q1 d2 = this.d;
                final String s2;
                final m3.d d3;
                final m3.d d4;
                synchronized (s2 = (String)d2.E) {
                    d2.E = a;
                    d3 = (m3.d)((AtomicMarkableReference)((c0)d2.F).D).getReference();
                    monitorenter(d4 = d3);
                    final HashMap hashMap = new(java.util.HashMap.class)();
                    final HashMap hashMap3;
                    final HashMap hashMap2 = hashMap3 = hashMap;
                    final m3.d d5 = d3;
                    final HashMap hashMap4 = d5.a;
                    new HashMap((Map)hashMap4);
                    final Map map = (Map)hashMap2;
                    final Map map2 = Collections.unmodifiableMap(map);
                    final m3.d d6 = d4;
                    monitorexit(d6);
                    final q1 q1 = d2;
                    final Object o2 = q1.H;
                    final w w = (w)o2;
                    final List list = w.h();
                    final q1 q2 = d2;
                    final Object o3 = q2.D;
                    final c c5 = (c)o3;
                    final b b2 = c5.b;
                    final L4.c c6 = new(L4.c.class)();
                    final L4.c c8;
                    final L4.c c7 = c8 = c6;
                    final q1 q3 = d2;
                    final String s3 = a;
                    final Map map3 = map2;
                    final List list2 = list;
                    new L4.c(q3, s3, map3, list2);
                    final b b3 = b2;
                    final L4.c c9 = c7;
                    b3.a((Runnable)c9);
                    break Label_0547;
                }
                try {
                    final HashMap hashMap = new(java.util.HashMap.class)();
                    final HashMap hashMap3;
                    final HashMap hashMap2 = hashMap3 = hashMap;
                    final m3.d d5 = d3;
                    final HashMap hashMap4 = d5.a;
                    new HashMap((Map)hashMap4);
                    final Map map = (Map)hashMap2;
                    final Map map2 = Collections.unmodifiableMap(map);
                    final m3.d d6 = d4;
                    monitorexit(d6);
                    final q1 q1 = d2;
                    final Object o2 = q1.H;
                    final w w = (w)o2;
                    final List list = w.h();
                    final q1 q2 = d2;
                    final Object o3 = q2.D;
                    final c c5 = (c)o3;
                    final b b2 = c5.b;
                    final L4.c c6 = new(L4.c.class)();
                    final L4.c c8;
                    final L4.c c7 = c8 = c6;
                    final q1 q3 = d2;
                    final String s3 = a;
                    final Map map3 = map2;
                    final List list2 = list;
                    new L4.c(q3, s3, map3, list2);
                    final b b3 = b2;
                    final L4.c c9 = c7;
                    b3.a((Runnable)c9);
                }
                finally {}
            }
        }
        final e i = this.i;
        ((m3.c)i.D).b();
        i.D = m3.e.E;
        if (a != null) {
            i.D = new m3.l(((q3.c)i.C).e(a, "userlog"));
        }
        this.l.a(a);
        final q3.c j = this.m;
        final k3.t t = (k3.t)j.D;
        final Charset a5 = O0.a;
        final Object o4 = new Object();
        ((A)o4).a = "19.3.0";
        final C2.c c10 = t.c;
        final String b4 = (String)c10.C;
        if (b4 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        ((A)o4).b = b4;
        final z b5 = t.b;
        final String a6 = b5.c().a;
        if (a6 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        ((A)o4).d = a6;
        ((A)o4).e = b5.c().b;
        ((A)o4).f = b5.c().c;
        final String h2 = (String)c10.H;
        if (h2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        ((A)o4).h = h2;
        final String k = (String)c10.I;
        if (k == null) {
            throw new NullPointerException("Null displayVersion");
        }
        ((A)o4).i = k;
        ((A)o4).c = 4;
        ((A)o4).m |= 0x1;
        final Object o5 = new Object();
        ((I)o5).f = false;
        final byte b6 = (byte)(((I)o5).m | 0x2);
        ((I)o5).d = d;
        ((I)o5).m = (byte)(b6 | 0x1);
        if (a == null) {
            throw new NullPointerException("Null identifier");
        }
        ((I)o5).b = a;
        a = k3.t.g;
        if (a == null) {
            throw new NullPointerException("Null generator");
        }
        ((I)o5).a = a;
        a = b5.c;
        if (a != null) {
            final String a7 = b5.c().a;
            final h1.m l = (h1.m)c10.J;
            if (l.E == null) {
                l.E = new D(l);
            }
            final D d7 = (D)l.E;
            final String a8 = d7.a;
            if (d7 == null) {
                l.E = new D(l);
            }
            ((I)o5).g = new K(a, h2, k, a7, a8, ((D)l.E).b);
            final Object o6 = new Object();
            ((i0)o6).a = 3;
            ((i0)o6).e |= 0x1;
            ((i0)o6).b = release;
            ((i0)o6).c = codename;
            ((i0)o6).d = k3.g.g();
            ((i0)o6).e |= 0x2;
            ((I)o5).i = ((i0)o6).a();
            final StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
            final boolean empty2 = TextUtils.isEmpty((CharSequence)cpu_ABI);
            int intValue = 7;
            if (!empty2) {
                final Integer n4 = (Integer)k3.t.f.get((Object)cpu_ABI.toLowerCase(us));
                if (n4 != null) {
                    intValue = n4;
                }
            }
            final int availableProcessors2 = Runtime.getRuntime().availableProcessors();
            final long a9 = k3.g.a(t.a);
            final long n5 = statFs2.getBlockCount();
            final long n6 = statFs2.getBlockSize();
            final boolean f5 = k3.g.f();
            final int c11 = k3.g.c();
            final Object o7 = new Object();
            ((M)o7).a = intValue;
            final byte b7 = (byte)(((M)o7).j | 0x1);
            ((M)o7).b = model;
            ((M)o7).c = availableProcessors2;
            final byte b8 = (byte)(0x2 | b7);
            ((M)o7).d = a9;
            final byte b9 = (byte)(b8 | 0x4);
            ((M)o7).e = n5 * n6;
            final byte b10 = (byte)(b9 | 0x8);
            ((M)o7).f = f5;
            final byte b11 = (byte)(b10 | 0x10);
            ((M)o7).g = c11;
            ((M)o7).j = (byte)(b11 | 0x20);
            ((M)o7).h = manufacturer;
            ((M)o7).i = product;
            ((I)o5).j = ((M)o7).a();
            ((I)o5).l = 3;
            ((I)o5).m |= 0x4;
            ((A)o4).j = ((I)o5).a();
            final B a10 = ((A)o4).a();
            final q3.c b12 = ((q3.a)j.E).b;
            final J k2 = a10.k;
            if (k2 == null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Could not get session for report", (Throwable)null);
                }
            }
            else {
                a = k2.b;
                try {
                    q3.a.g.getClass();
                    q3.a.f(b12.e(a, "report"), o3.a.a.t((Object)a10));
                    final File e = b12.e(a, "start-time");
                    final long d8 = k2.d;
                    b = (Boolean)new OutputStreamWriter((OutputStream)new FileOutputStream(e), q3.a.e);
                    try {
                        ((Writer)b).write("");
                        e.setLastModified(d8 * 1000L);
                        ((OutputStreamWriter)b).close();
                    }
                    finally {
                        try {
                            ((OutputStreamWriter)b).close();
                        }
                        finally {
                            final Throwable t2;
                            final Throwable t3;
                            t2.addSuppressed(t3);
                        }
                    }
                }
                catch (final IOException ex) {
                    a = m0.a.f("Could not persist report for session ", a);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", a, (Throwable)ex);
                    }
                }
            }
            return;
        }
        throw new NullPointerException("Null identifier");
    }
    
    public final boolean d(final C2.z z) {
        l3.c.a();
        final u n = this.n;
        if (n != null && n.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", (Throwable)null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", (Throwable)null);
        }
        try {
            this.b(true, z, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", (Throwable)null);
            }
            return true;
        }
        catch (final Exception ex) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", (Throwable)ex);
            return false;
        }
    }
    
    public final String e() {
        final NavigableSet c = ((q3.a)this.m.E).c();
        String s;
        if (!((Set)c).isEmpty()) {
            s = (String)((SortedSet)c).first();
        }
        else {
            s = null;
        }
        return s;
    }
    
    public final void g(final C2.z p0, final Thread p1, final Throwable p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: astore          10
        //     4: monitorenter   
        //     5: new             Ljava/lang/StringBuilder;
        //     8: astore          7
        //    10: aload           7
        //    12: ldc_w           "Handling uncaught exception \""
        //    15: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    18: aload           7
        //    20: aload_3        
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    24: pop            
        //    25: aload           7
        //    27: ldc_w           "\" from thread "
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: pop            
        //    34: aload           7
        //    36: aload_2        
        //    37: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: aload           7
        //    46: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    49: astore          7
        //    51: ldc             "FirebaseCrashlytics"
        //    53: iconst_3       
        //    54: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //    57: ifeq            69
        //    60: ldc             "FirebaseCrashlytics"
        //    62: aload           7
        //    64: aconst_null    
        //    65: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    68: pop            
        //    69: invokestatic    java/lang/System.currentTimeMillis:()J
        //    72: lstore          5
        //    74: aload_0        
        //    75: getfield        k3/m.e:Ll3/c;
        //    78: getfield        l3/c.a:Ll3/b;
        //    81: astore          7
        //    83: new             Lk3/k;
        //    86: astore          8
        //    88: aload           8
        //    90: aload_0        
        //    91: lload           5
        //    93: aload_3        
        //    94: aload_2        
        //    95: aload_1        
        //    96: iload           4
        //    98: invokespecial   k3/k.<init>:(Lk3/m;JLjava/lang/Throwable;Ljava/lang/Thread;LC2/z;Z)V
        //   101: aload           7
        //   103: getfield        l3/b.D:Ljava/lang/Object;
        //   106: astore_1       
        //   107: aload_1        
        //   108: dup            
        //   109: astore          11
        //   111: monitorenter   
        //   112: aload           7
        //   114: getfield        l3/b.E:LO2/t;
        //   117: astore_3       
        //   118: aload           7
        //   120: getfield        l3/b.C:Ljava/util/concurrent/ExecutorService;
        //   123: astore_2       
        //   124: new             Lh3/d;
        //   127: astore          9
        //   129: aload           9
        //   131: aload           8
        //   133: iconst_4       
        //   134: invokespecial   h3/d.<init>:(Ljava/lang/Object;I)V
        //   137: aload_3        
        //   138: aload_2        
        //   139: aload           9
        //   141: invokevirtual   O2/t.e:(Ljava/util/concurrent/Executor;LO2/a;)LO2/t;
        //   144: astore_2       
        //   145: aload           7
        //   147: aload_2        
        //   148: putfield        l3/b.E:LO2/t;
        //   151: aload           11
        //   153: monitorexit    
        //   154: iload           4
        //   156: ifne            195
        //   159: aload_2        
        //   160: invokestatic    k3/A.a:(LO2/t;)V
        //   163: goto            195
        //   166: astore_1       
        //   167: ldc             "FirebaseCrashlytics"
        //   169: ldc_w           "Error handling uncaught exception"
        //   172: aload_1        
        //   173: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   176: pop            
        //   177: goto            195
        //   180: astore_1       
        //   181: goto            205
        //   184: astore_1       
        //   185: ldc             "FirebaseCrashlytics"
        //   187: ldc_w           "Cannot send reports. Timed out while fetching settings."
        //   190: aconst_null    
        //   191: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   194: pop            
        //   195: aload           10
        //   197: monitorexit    
        //   198: return         
        //   199: astore_2       
        //   200: aload           11
        //   202: monitorexit    
        //   203: aload_2        
        //   204: athrow         
        //   205: aload           10
        //   207: monitorexit    
        //   208: aload_1        
        //   209: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  5      69     180    210    Any
        //  69     112    180    210    Any
        //  112    154    199    205    Any
        //  159    163    184    195    Ljava/util/concurrent/TimeoutException;
        //  159    163    166    180    Ljava/lang/Exception;
        //  159    163    180    210    Any
        //  167    177    180    210    Any
        //  185    195    180    210    Any
        //  200    203    199    205    Any
        //  203    205    180    210    Any
        //  205    208    180    210    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0195:
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
    
    public final void h() {
        try {
            final String f = f();
            if (f != null) {
                this.i("com.crashlytics.version-control-info", f);
                Log.i("FirebaseCrashlytics", "Saved version control info", (Throwable)null);
            }
        }
        catch (final IOException ex) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", (Throwable)ex);
        }
    }
    
    public final void i(final String s, final String s2) {
        try {
            ((c0)this.d.G).b(s, s2);
        }
        catch (final IllegalArgumentException ex) {
            final Context a = this.a;
            if (a != null && (a.getApplicationInfo().flags & 0x2) != 0x0) {
                throw ex;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", (Throwable)null);
        }
    }
    
    public final void j(final t t) {
        final q3.c b = ((q3.a)this.m.E).b;
        final boolean empty = q3.c.j((Object[])((File)b.H).listFiles()).isEmpty();
        final O2.j p = this.p;
        if (empty && q3.c.j((Object[])((File)b.I).listFiles()).isEmpty() && q3.c.j((Object[])((File)b.J).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", (Throwable)null);
            }
            p.d((Object)Boolean.FALSE);
            return;
        }
        final h3.c a = h3.c.a;
        a.f("Crash reports are available to be sent.");
        final v b2 = this.b;
        Label_0263: {
            if (b2.f()) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", (Throwable)null);
                }
                p.d((Object)Boolean.FALSE);
                final t t2 = u0.m((Object)Boolean.TRUE);
                break Label_0263;
            }
            a.c("Automatic data collection is disabled.");
            a.f("Notifying that unsent reports are available.");
            p.d((Object)Boolean.TRUE);
            final Object e = b2.e;
            synchronized (e) {
                final t a2 = ((O2.j)b2.f).a;
                monitorexit(e);
                final t m = a2.m((O2.h)new Object());
                a.c("Waiting for send/deleteUnsentReports to be called.");
                final t t2 = l3.a.a((i)m, this.q.a);
                t2.n((Executor)this.e.a, (O2.h)new h1.m(this, 7, t));
            }
        }
    }
}

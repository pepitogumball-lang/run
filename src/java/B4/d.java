package b4;

import c4.q;
import O2.h;
import Z4.J;
import O2.a;
import c4.f;
import java.util.Map;
import O2.t;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.ArrayList;
import org.json.JSONArray;
import com.google.android.gms.internal.ads.Rc;
import F3.e;
import c4.l;
import c4.j;
import c4.i;
import java.util.concurrent.Executor;
import Y2.c;

public final class d
{
    public static final byte[] l;
    public final c a;
    public final Executor b;
    public final c4.c c;
    public final c4.c d;
    public final c4.c e;
    public final i f;
    public final j g;
    public final l h;
    public final e i;
    public final w2.e j;
    public final Rc k;
    
    static {
        l = new byte[0];
    }
    
    public d(final e i, final c a, final Executor b, final c4.c c, final c4.c d, final c4.c e, final i f, final j g, final l h, final w2.e j, final Rc k) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.k = k;
    }
    
    public static ArrayList d(final JSONArray jsonArray) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final HashMap hashMap = new HashMap();
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s = (String)keys.next();
                hashMap.put((Object)s, (Object)jsonObject.getString(s));
            }
            list.add((Object)hashMap);
        }
        return list;
    }
    
    public final t a() {
        final i f = this.f;
        final long long1 = f.g.a.getLong("minimum_fetch_interval_in_seconds", c4.i.i);
        final HashMap hashMap = new HashMap((Map)f.h);
        hashMap.put((Object)"X-Firebase-RC-Fetch-Type", (Object)"BASE/1");
        return f.e.b().e(f.c, (a)new f(f, long1, hashMap)).n((Executor)f3.j.C, (h)new J(22));
    }
    
    public final HashMap b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        b4/d.g:Lc4/j;
        //     4: astore_3       
        //     5: new             Ljava/util/HashSet;
        //     8: dup            
        //     9: invokespecial   java/util/HashSet.<init>:()V
        //    12: astore_1       
        //    13: aload_1        
        //    14: aload_3        
        //    15: getfield        c4/j.c:Lc4/c;
        //    18: invokestatic    c4/j.a:(Lc4/c;)Ljava/util/HashSet;
        //    21: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //    26: pop            
        //    27: aload_1        
        //    28: aload_3        
        //    29: getfield        c4/j.d:Lc4/c;
        //    32: invokestatic    c4/j.a:(Lc4/c;)Ljava/util/HashSet;
        //    35: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //    40: pop            
        //    41: new             Ljava/util/HashMap;
        //    44: dup            
        //    45: invokespecial   java/util/HashMap.<init>:()V
        //    48: astore          4
        //    50: aload_1        
        //    51: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //    54: astore          6
        //    56: aload           6
        //    58: invokeinterface java/util/Iterator.hasNext:()Z
        //    63: ifeq            331
        //    66: aload           6
        //    68: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    73: checkcast       Ljava/lang/String;
        //    76: astore          5
        //    78: aload_3        
        //    79: getfield        c4/j.c:Lc4/c;
        //    82: invokevirtual   c4/c.c:()Lc4/e;
        //    85: astore_1       
        //    86: aconst_null    
        //    87: astore_2       
        //    88: aload_1        
        //    89: ifnonnull       97
        //    92: aconst_null    
        //    93: astore_1       
        //    94: goto            107
        //    97: aload_1        
        //    98: getfield        c4/e.b:Lorg/json/JSONObject;
        //   101: aload           5
        //   103: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   106: astore_1       
        //   107: aload_1        
        //   108: ifnull          230
        //   111: aload_3        
        //   112: getfield        c4/j.c:Lc4/c;
        //   115: invokevirtual   c4/c.c:()Lc4/e;
        //   118: astore          8
        //   120: aload           8
        //   122: ifnonnull       128
        //   125: goto            212
        //   128: aload_3        
        //   129: getfield        c4/j.a:Ljava/util/HashSet;
        //   132: astore_2       
        //   133: aload_2        
        //   134: dup            
        //   135: astore          12
        //   137: monitorenter   
        //   138: aload_3        
        //   139: getfield        c4/j.a:Ljava/util/HashSet;
        //   142: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   145: astore          10
        //   147: aload           10
        //   149: invokeinterface java/util/Iterator.hasNext:()Z
        //   154: ifeq            209
        //   157: aload           10
        //   159: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   164: checkcast       Lb4/k;
        //   167: astore          7
        //   169: aload_3        
        //   170: getfield        c4/j.b:Ljava/util/concurrent/Executor;
        //   173: astore          11
        //   175: new             LL3/h;
        //   178: astore          9
        //   180: aload           9
        //   182: aload           7
        //   184: aload           5
        //   186: aload           8
        //   188: bipush          12
        //   190: invokespecial   L3/h.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
        //   193: aload           11
        //   195: aload           9
        //   197: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //   202: goto            147
        //   205: astore_1       
        //   206: goto            225
        //   209: aload           12
        //   211: monitorexit    
        //   212: new             Lc4/r;
        //   215: dup            
        //   216: aload_1        
        //   217: iconst_2       
        //   218: invokespecial   c4/r.<init>:(Ljava/lang/String;I)V
        //   221: astore_1       
        //   222: goto            319
        //   225: aload           12
        //   227: monitorexit    
        //   228: aload_1        
        //   229: athrow         
        //   230: aload_3        
        //   231: getfield        c4/j.d:Lc4/c;
        //   234: invokevirtual   c4/c.c:()Lc4/e;
        //   237: astore_1       
        //   238: aload_1        
        //   239: ifnonnull       247
        //   242: aload_2        
        //   243: astore_1       
        //   244: goto            257
        //   247: aload_1        
        //   248: getfield        c4/e.b:Lorg/json/JSONObject;
        //   251: aload           5
        //   253: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   256: astore_1       
        //   257: aload_1        
        //   258: ifnull          274
        //   261: new             Lc4/r;
        //   264: dup            
        //   265: aload_1        
        //   266: iconst_1       
        //   267: invokespecial   c4/r.<init>:(Ljava/lang/String;I)V
        //   270: astore_1       
        //   271: goto            319
        //   274: new             Ljava/lang/StringBuilder;
        //   277: dup            
        //   278: ldc             "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '"
        //   280: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   283: astore_1       
        //   284: aload_1        
        //   285: aload           5
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: pop            
        //   291: aload_1        
        //   292: ldc             "'."
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: pop            
        //   298: ldc             "FirebaseRemoteConfig"
        //   300: aload_1        
        //   301: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   307: pop            
        //   308: new             Lc4/r;
        //   311: dup            
        //   312: ldc             ""
        //   314: iconst_0       
        //   315: invokespecial   c4/r.<init>:(Ljava/lang/String;I)V
        //   318: astore_1       
        //   319: aload           4
        //   321: aload           5
        //   323: aload_1        
        //   324: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   327: pop            
        //   328: goto            56
        //   331: aload           4
        //   333: areturn        
        //   334: astore_1       
        //   335: goto            92
        //   338: astore_1       
        //   339: aload_2        
        //   340: astore_1       
        //   341: goto            257
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  97     107    334    338    Lorg/json/JSONException;
        //  138    147    205    230    Any
        //  147    202    205    230    Any
        //  209    212    205    230    Any
        //  225    228    205    230    Any
        //  247    257    338    344    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0247:
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
    
    public final q c() {
        final l h = this.h;
        final Object b;
        monitorenter(b = h.b);
        try {
            final long long1 = h.a.getLong("last_fetch_time_in_millis", -1L);
            final int int1 = h.a.getInt("last_fetch_status", 0);
            final b4.i i = new b4.i(0);
            final long long2 = h.a.getLong("fetch_timeout_in_seconds", 60L);
            if (long2 >= 0L) {
                i.a = long2;
                i.a(h.a.getLong("minimum_fetch_interval_in_seconds", c4.i.i));
                final q q = new q(long1, int1, new b4.i(i));
                monitorexit(b);
                return q;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[] { long2 }));
        }
        finally {
            monitorexit(b);
            final long long2;
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[] { long2 }));
        }
    }
}

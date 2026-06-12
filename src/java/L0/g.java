package L0;

import android.content.Context;
import n5.p;
import c5.f;

public final class g
{
    public static final g a;
    public static final f b;
    public static final a c;
    
    static {
        a = (g)new Object();
        p.a((Class)h.class).b();
        b = new f((m5.a)L0.f.D);
        c = L0.a.a;
    }
    
    public static b a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_0        
        //     3: invokestatic    n5/h.e:(Ljava/lang/String;Ljava/lang/Object;)V
        //     6: getstatic       L0/g.b:Lc5/f;
        //     9: invokevirtual   c5/f.a:()Ljava/lang/Object;
        //    12: checkcast       LM0/a;
        //    15: astore          4
        //    17: aload           4
        //    19: astore_3       
        //    20: aload           4
        //    22: ifnonnull       205
        //    25: getstatic       O0/l.c:LO0/l;
        //    28: astore_3       
        //    29: getstatic       O0/l.c:LO0/l;
        //    32: ifnonnull       197
        //    35: getstatic       O0/l.d:Ljava/util/concurrent/locks/ReentrantLock;
        //    38: astore          5
        //    40: aload           5
        //    42: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    45: getstatic       O0/l.c:LO0/l;
        //    48: astore_3       
        //    49: aload_3        
        //    50: ifnonnull       182
        //    53: aconst_null    
        //    54: astore          4
        //    56: invokestatic    O0/h.c:()LI0/i;
        //    59: astore          6
        //    61: aload           6
        //    63: ifnonnull       72
        //    66: aload           4
        //    68: astore_3       
        //    69: goto            162
        //    72: getstatic       I0/i.H:LI0/i;
        //    75: astore_3       
        //    76: ldc             "other"
        //    78: aload_3        
        //    79: invokestatic    n5/h.e:(Ljava/lang/String;Ljava/lang/Object;)V
        //    82: aload           6
        //    84: getfield        I0/i.G:Lc5/f;
        //    87: invokevirtual   c5/f.a:()Ljava/lang/Object;
        //    90: astore          6
        //    92: ldc             "<get-bigInteger>(...)"
        //    94: aload           6
        //    96: invokestatic    n5/h.d:(Ljava/lang/String;Ljava/lang/Object;)V
        //    99: aload           6
        //   101: checkcast       Ljava/math/BigInteger;
        //   104: astore          6
        //   106: aload_3        
        //   107: getfield        I0/i.G:Lc5/f;
        //   110: invokevirtual   c5/f.a:()Ljava/lang/Object;
        //   113: astore          7
        //   115: ldc             "<get-bigInteger>(...)"
        //   117: aload           7
        //   119: invokestatic    n5/h.d:(Ljava/lang/String;Ljava/lang/Object;)V
        //   122: aload           4
        //   124: astore_3       
        //   125: aload           6
        //   127: aload           7
        //   129: checkcast       Ljava/math/BigInteger;
        //   132: invokevirtual   java/math/BigInteger.compareTo:(Ljava/math/BigInteger;)I
        //   135: iflt            162
        //   138: new             LO0/j;
        //   141: astore_3       
        //   142: aload_3        
        //   143: aload_0        
        //   144: invokespecial   O0/j.<init>:(Landroid/content/Context;)V
        //   147: aload_3        
        //   148: invokevirtual   O0/j.i:()Z
        //   151: istore_2       
        //   152: iload_2        
        //   153: ifne            162
        //   156: aload           4
        //   158: astore_3       
        //   159: goto            162
        //   162: new             LO0/l;
        //   165: astore_0       
        //   166: aload_0        
        //   167: aload_3        
        //   168: invokespecial   O0/l.<init>:(LO0/j;)V
        //   171: aload_0        
        //   172: putstatic       O0/l.c:LO0/l;
        //   175: goto            182
        //   178: astore_0       
        //   179: goto            190
        //   182: aload           5
        //   184: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   187: goto            197
        //   190: aload           5
        //   192: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   195: aload_0        
        //   196: athrow         
        //   197: getstatic       O0/l.c:LO0/l;
        //   200: astore_3       
        //   201: aload_3        
        //   202: invokestatic    n5/h.b:(Ljava/lang/Object;)V
        //   205: getstatic       L0/o.b:I
        //   208: istore_1       
        //   209: new             LL0/b;
        //   212: dup            
        //   213: aload_3        
        //   214: invokespecial   L0/b.<init>:(LM0/a;)V
        //   217: astore_0       
        //   218: getstatic       L0/g.c:LL0/a;
        //   221: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   224: pop            
        //   225: aload_0        
        //   226: areturn        
        //   227: astore_0       
        //   228: aload           4
        //   230: astore_3       
        //   231: goto            162
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  45     49     178    182    Any
        //  56     61     227    234    Any
        //  72     122    227    234    Any
        //  125    152    227    234    Any
        //  162    175    178    182    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
}

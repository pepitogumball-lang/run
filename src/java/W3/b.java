package W3;

import Z3.k;
import java.util.concurrent.RejectedExecutionException;
import Y3.j;
import android.system.Os;
import android.system.OsConstants;
import android.os.Process;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import R3.a;

public final class b
{
    public static final a g;
    public static final long h;
    public final ConcurrentLinkedQueue a;
    public final ScheduledExecutorService b;
    public final String c;
    public final long d;
    public ScheduledFuture e;
    public long f;
    
    static {
        g = a.d();
        h = TimeUnit.SECONDS.toMicros(1L);
    }
    
    public b() {
        this.e = null;
        this.f = -1L;
        this.a = new ConcurrentLinkedQueue();
        this.b = Executors.newSingleThreadScheduledExecutor();
        final int myPid = Process.myPid();
        final StringBuilder sb = new StringBuilder("/proc/");
        sb.append(Integer.toString(myPid));
        sb.append("/stat");
        this.c = sb.toString();
        this.d = Os.sysconf(OsConstants._SC_CLK_TCK);
    }
    
    public final void a(final long f, final j j) {
        monitorenter(this);
        while (true) {
            try {
                this.f = f;
                final b b = this;
                final ScheduledExecutorService scheduledExecutorService = b.b;
                final W3.a a = new(W3.a.class)();
                final W3.a a3;
                final W3.a a2 = a3 = a;
                final b b2 = this;
                final j i = j;
                final int n = 0;
                new W3.a(b2, i, n);
                final b b3 = this;
                final ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                final W3.a a4 = a2;
                final long n2 = 0L;
                final long n3 = f;
                final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                final ScheduledFuture scheduledFuture = scheduledExecutorService2.scheduleAtFixedRate((Runnable)a4, n2, n3, timeUnit);
                b3.e = scheduledFuture;
                break Label_0092;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return;
            }
            try {
                final b b = this;
                final ScheduledExecutorService scheduledExecutorService = b.b;
                final W3.a a = new(W3.a.class)();
                final W3.a a3;
                final W3.a a2 = a3 = a;
                final b b2 = this;
                final j i = j;
                final int n = 0;
                new W3.a(b2, i, n);
                final b b3 = this;
                final ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                final W3.a a4 = a2;
                final long n2 = 0L;
                final long n3 = f;
                final TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                final ScheduledFuture scheduledFuture = scheduledExecutorService2.scheduleAtFixedRate((Runnable)a4, n2, n3, timeUnit);
                b3.e = scheduledFuture;
                continue;
            }
            catch (final RejectedExecutionException ex) {}
            break;
        }
    }
    
    public final k b(final j p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        W3/b.d:J
        //     4: lstore          8
        //     6: getstatic       W3/b.g:LR3/a;
        //     9: astore          20
        //    11: aload_1        
        //    12: ifnonnull       17
        //    15: aconst_null    
        //    16: areturn        
        //    17: new             Ljava/io/BufferedReader;
        //    20: astore          21
        //    22: new             Ljava/io/FileReader;
        //    25: astore          22
        //    27: aload           22
        //    29: aload_0        
        //    30: getfield        W3/b.c:Ljava/lang/String;
        //    33: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //    36: aload           21
        //    38: aload           22
        //    40: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    43: aload_1        
        //    44: getfield        Y3/j.C:J
        //    47: lstore          14
        //    49: aload_1        
        //    50: invokevirtual   Y3/j.a:()J
        //    53: lstore          12
        //    55: aload           21
        //    57: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    60: ldc             " "
        //    62: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    65: astore_1       
        //    66: aload_1        
        //    67: bipush          13
        //    69: aaload         
        //    70: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    73: lstore          6
        //    75: aload_1        
        //    76: bipush          15
        //    78: aaload         
        //    79: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    82: lstore          10
        //    84: aload_1        
        //    85: bipush          14
        //    87: aaload         
        //    88: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    91: lstore          16
        //    93: aload_1        
        //    94: bipush          16
        //    96: aaload         
        //    97: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   100: lstore          18
        //   102: invokestatic    Z3/k.x:()LZ3/j;
        //   105: astore_1       
        //   106: aload_1        
        //   107: invokevirtual   com/google/protobuf/n.l:()V
        //   110: aload_1        
        //   111: getfield        com/google/protobuf/n.D:Lcom/google/protobuf/p;
        //   114: checkcast       LZ3/k;
        //   117: lload           12
        //   119: lload           14
        //   121: ladd           
        //   122: invokestatic    Z3/k.u:(LZ3/k;J)V
        //   125: lload           16
        //   127: lload           18
        //   129: ladd           
        //   130: l2d            
        //   131: lload           8
        //   133: l2d            
        //   134: ddiv           
        //   135: dstore          4
        //   137: getstatic       W3/b.h:J
        //   140: lstore          12
        //   142: lload           12
        //   144: l2d            
        //   145: dstore_2       
        //   146: dload           4
        //   148: dload_2        
        //   149: dmul           
        //   150: invokestatic    java/lang/Math.round:(D)J
        //   153: lstore          14
        //   155: aload_1        
        //   156: invokevirtual   com/google/protobuf/n.l:()V
        //   159: aload_1        
        //   160: getfield        com/google/protobuf/n.D:Lcom/google/protobuf/p;
        //   163: checkcast       LZ3/k;
        //   166: lload           14
        //   168: invokestatic    Z3/k.w:(LZ3/k;J)V
        //   171: lload           6
        //   173: lload           10
        //   175: ladd           
        //   176: l2d            
        //   177: lload           8
        //   179: l2d            
        //   180: ddiv           
        //   181: lload           12
        //   183: l2d            
        //   184: dmul           
        //   185: invokestatic    java/lang/Math.round:(D)J
        //   188: lstore          6
        //   190: aload_1        
        //   191: invokevirtual   com/google/protobuf/n.l:()V
        //   194: aload_1        
        //   195: getfield        com/google/protobuf/n.D:Lcom/google/protobuf/p;
        //   198: checkcast       LZ3/k;
        //   201: lload           6
        //   203: invokestatic    Z3/k.v:(LZ3/k;J)V
        //   206: aload_1        
        //   207: invokevirtual   com/google/protobuf/n.j:()Lcom/google/protobuf/p;
        //   210: checkcast       LZ3/k;
        //   213: astore_1       
        //   214: aload           21
        //   216: invokevirtual   java/io/BufferedReader.close:()V
        //   219: aload_1        
        //   220: areturn        
        //   221: astore_1       
        //   222: goto            285
        //   225: astore_1       
        //   226: goto            285
        //   229: astore_1       
        //   230: goto            285
        //   233: astore_1       
        //   234: aload_1        
        //   235: astore          21
        //   237: aload           20
        //   239: astore_1       
        //   240: goto            324
        //   243: astore_1       
        //   244: goto            251
        //   247: astore_1       
        //   248: goto            244
        //   251: aload           21
        //   253: invokevirtual   java/io/BufferedReader.close:()V
        //   256: goto            267
        //   259: astore          21
        //   261: aload_1        
        //   262: aload           21
        //   264: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   267: aload_1        
        //   268: athrow         
        //   269: astore_1       
        //   270: goto            285
        //   273: astore_1       
        //   274: goto            270
        //   277: astore_1       
        //   278: goto            270
        //   281: astore_1       
        //   282: goto            234
        //   285: new             Ljava/lang/StringBuilder;
        //   288: dup            
        //   289: ldc             "Unexpected '/proc/[pid]/stat' file format encountered: "
        //   291: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   294: astore          21
        //   296: aload           21
        //   298: aload_1        
        //   299: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   302: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   305: pop            
        //   306: aload           20
        //   308: aload           21
        //   310: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   313: invokevirtual   R3/a.f:(Ljava/lang/String;)V
        //   316: goto            358
        //   319: astore          21
        //   321: aload           20
        //   323: astore_1       
        //   324: new             Ljava/lang/StringBuilder;
        //   327: dup            
        //   328: ldc             "Unable to read 'proc/[pid]/stat' file: "
        //   330: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   333: astore          20
        //   335: aload           20
        //   337: aload           21
        //   339: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: pop            
        //   346: aload_1        
        //   347: aload           20
        //   349: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   352: invokevirtual   R3/a.f:(Ljava/lang/String;)V
        //   355: goto            316
        //   358: aconst_null    
        //   359: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  17     22     319    324    Ljava/io/IOException;
        //  17     22     277    281    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  17     22     273    277    Ljava/lang/NumberFormatException;
        //  17     22     269    270    Ljava/lang/NullPointerException;
        //  22     43     281    285    Ljava/io/IOException;
        //  22     43     277    281    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  22     43     273    277    Ljava/lang/NumberFormatException;
        //  22     43     269    270    Ljava/lang/NullPointerException;
        //  43     125    247    251    Any
        //  137    142    247    251    Any
        //  146    214    243    244    Any
        //  214    219    233    234    Ljava/io/IOException;
        //  214    219    229    233    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  214    219    225    229    Ljava/lang/NumberFormatException;
        //  214    219    221    225    Ljava/lang/NullPointerException;
        //  251    256    259    267    Any
        //  261    267    233    234    Ljava/io/IOException;
        //  261    267    229    233    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  261    267    225    229    Ljava/lang/NumberFormatException;
        //  261    267    221    225    Ljava/lang/NullPointerException;
        //  267    269    233    234    Ljava/io/IOException;
        //  267    269    229    233    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  267    269    225    229    Ljava/lang/NumberFormatException;
        //  267    269    221    225    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0234:
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

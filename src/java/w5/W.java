package w5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class w extends H implements Runnable
{
    public static final w L;
    public static final long M;
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    
    static {
        (L = (w)new H()).m(false);
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        Long n;
        try {
            n = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        }
        catch (final SecurityException ex) {
            n = 1000L;
        }
        M = milliseconds.toNanos((long)n);
    }
    
    public final Thread k() {
        Thread thread;
        if ((thread = w._thread) == null) {
            monitorenter(this);
            Label_0055: {
                try {
                    if ((thread = w._thread) == null) {
                        thread = new Thread((Runnable)this, "kotlinx.coroutines.DefaultExecutor");
                        (w._thread = thread).setDaemon(true);
                        thread.start();
                    }
                    break Label_0055;
                }
                finally {
                    monitorexit(this);
                    monitorexit(this);
                }
            }
        }
        return thread;
    }
    
    @Override
    public final void p(final Runnable runnable) {
        if (w.debugStatus != 4) {
            super.p(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
    
    public final void r() {
        synchronized (this) {
            final int debugStatus = w.debugStatus;
            if (debugStatus != 2 && debugStatus != 3) {
                return;
            }
            w.debugStatus = 3;
            H.I.set((Object)this, (Object)null);
            H.J.set((Object)this, (Object)null);
            this.notifyAll();
        }
    }
    
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //     7: aload_0        
        //     8: dup            
        //     9: astore          13
        //    11: monitorenter   
        //    12: getstatic       w5/w.debugStatus:I
        //    15: istore_1       
        //    16: iload_1        
        //    17: iconst_2       
        //    18: if_icmpeq       34
        //    21: iload_1        
        //    22: iconst_3       
        //    23: if_icmpne       29
        //    26: goto            34
        //    29: iconst_0       
        //    30: istore_1       
        //    31: goto            36
        //    34: iconst_1       
        //    35: istore_1       
        //    36: iload_1        
        //    37: ifeq            64
        //    40: aload           13
        //    42: monitorexit    
        //    43: aconst_null    
        //    44: putstatic       w5/w._thread:Ljava/lang/Thread;
        //    47: aload_0        
        //    48: invokevirtual   w5/w.r:()V
        //    51: aload_0        
        //    52: invokevirtual   w5/H.q:()Z
        //    55: ifne            63
        //    58: aload_0        
        //    59: invokevirtual   w5/w.k:()Ljava/lang/Thread;
        //    62: pop            
        //    63: return         
        //    64: iconst_1       
        //    65: putstatic       w5/w.debugStatus:I
        //    68: aload_0        
        //    69: invokevirtual   java/lang/Object.notifyAll:()V
        //    72: aload           13
        //    74: monitorexit    
        //    75: ldc2_w          9223372036854775807
        //    78: lstore          6
        //    80: invokestatic    java/lang/Thread.interrupted:()Z
        //    83: pop            
        //    84: aload_0        
        //    85: invokevirtual   w5/H.n:()J
        //    88: lstore          10
        //    90: lload           10
        //    92: ldc2_w          9223372036854775807
        //    95: lcmp           
        //    96: ifne            192
        //    99: invokestatic    java/lang/System.nanoTime:()J
        //   102: lstore          4
        //   104: lload           6
        //   106: lstore_2       
        //   107: lload           6
        //   109: ldc2_w          9223372036854775807
        //   112: lcmp           
        //   113: ifne            133
        //   116: getstatic       w5/w.M:J
        //   119: lstore_2       
        //   120: lload_2        
        //   121: lload           4
        //   123: ladd           
        //   124: lstore_2       
        //   125: goto            133
        //   128: astore          12
        //   130: goto            282
        //   133: lload_2        
        //   134: lload           4
        //   136: lsub           
        //   137: lstore          6
        //   139: lload           6
        //   141: lconst_0       
        //   142: lcmp           
        //   143: ifgt            167
        //   146: aconst_null    
        //   147: putstatic       w5/w._thread:Ljava/lang/Thread;
        //   150: aload_0        
        //   151: invokevirtual   w5/w.r:()V
        //   154: aload_0        
        //   155: invokevirtual   w5/H.q:()Z
        //   158: ifne            166
        //   161: aload_0        
        //   162: invokevirtual   w5/w.k:()Ljava/lang/Thread;
        //   165: pop            
        //   166: return         
        //   167: lload_2        
        //   168: lstore          4
        //   170: lload           10
        //   172: lstore          8
        //   174: lload           10
        //   176: lload           6
        //   178: lcmp           
        //   179: ifle            201
        //   182: lload           6
        //   184: lstore          8
        //   186: lload_2        
        //   187: lstore          4
        //   189: goto            201
        //   192: ldc2_w          9223372036854775807
        //   195: lstore          4
        //   197: lload           10
        //   199: lstore          8
        //   201: lload           4
        //   203: lstore          6
        //   205: lload           8
        //   207: lconst_0       
        //   208: lcmp           
        //   209: ifle            80
        //   212: getstatic       w5/w.debugStatus:I
        //   215: istore_1       
        //   216: iload_1        
        //   217: iconst_2       
        //   218: if_icmpeq       234
        //   221: iload_1        
        //   222: iconst_3       
        //   223: if_icmpne       229
        //   226: goto            234
        //   229: iconst_0       
        //   230: istore_1       
        //   231: goto            236
        //   234: iconst_1       
        //   235: istore_1       
        //   236: iload_1        
        //   237: ifeq            261
        //   240: aconst_null    
        //   241: putstatic       w5/w._thread:Ljava/lang/Thread;
        //   244: aload_0        
        //   245: invokevirtual   w5/w.r:()V
        //   248: aload_0        
        //   249: invokevirtual   w5/H.q:()Z
        //   252: ifne            260
        //   255: aload_0        
        //   256: invokevirtual   w5/w.k:()Ljava/lang/Thread;
        //   259: pop            
        //   260: return         
        //   261: aload_0        
        //   262: lload           8
        //   264: invokestatic    java/util/concurrent/locks/LockSupport.parkNanos:(Ljava/lang/Object;J)V
        //   267: lload           4
        //   269: lstore          6
        //   271: goto            80
        //   274: astore          12
        //   276: aload           13
        //   278: monitorexit    
        //   279: aload           12
        //   281: athrow         
        //   282: aconst_null    
        //   283: putstatic       w5/w._thread:Ljava/lang/Thread;
        //   286: aload_0        
        //   287: invokevirtual   w5/w.r:()V
        //   290: aload_0        
        //   291: invokevirtual   w5/H.q:()Z
        //   294: ifne            302
        //   297: aload_0        
        //   298: invokevirtual   w5/w.k:()Ljava/lang/Thread;
        //   301: pop            
        //   302: aload           12
        //   304: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      12     128    305    Any
        //  12     16     274    282    Any
        //  40     43     128    305    Any
        //  64     72     274    282    Any
        //  72     75     128    305    Any
        //  80     90     128    305    Any
        //  99     104    128    305    Any
        //  116    120    128    305    Any
        //  212    216    128    305    Any
        //  261    267    128    305    Any
        //  276    279    274    282    Any
        //  279    282    128    305    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0029:
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
    
    @Override
    public final void shutdown() {
        w.debugStatus = 4;
        super.shutdown();
    }
}

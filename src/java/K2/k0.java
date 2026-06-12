package K2;

import java.util.AbstractCollection;
import h2.A;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class k0 extends x0
{
    public static final AtomicLong M;
    public o0 E;
    public o0 F;
    public final PriorityBlockingQueue G;
    public final LinkedBlockingQueue H;
    public final m0 I;
    public final m0 J;
    public final Object K;
    public final Semaphore L;
    
    static {
        M = new AtomicLong(Long.MIN_VALUE);
    }
    
    public k0(final n0 n0) {
        super(n0);
        this.K = new Object();
        this.L = new Semaphore(2);
        this.G = new PriorityBlockingQueue();
        this.H = new LinkedBlockingQueue();
        this.I = new m0(this, "Thread death: Uncaught exception on worker thread");
        this.J = new m0(this, "Thread death: Uncaught exception on network thread");
    }
    
    public final Object A(final AtomicReference p0, final long p1, final String p2, final Runnable p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: astore          6
        //     4: monitorenter   
        //     5: aload_0        
        //     6: invokevirtual   C/u.l:()LK2/k0;
        //     9: aload           5
        //    11: invokevirtual   K2/k0.E:(Ljava/lang/Runnable;)V
        //    14: aload_1        
        //    15: lload_2        
        //    16: invokevirtual   java/lang/Object.wait:(J)V
        //    19: aload           6
        //    21: monitorexit    
        //    22: aload_1        
        //    23: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    26: astore_1       
        //    27: aload_1        
        //    28: ifnonnull       48
        //    31: aload_0        
        //    32: invokevirtual   C/u.j:()LK2/P;
        //    35: getfield        K2/P.K:LK2/S;
        //    38: ldc             "Timed out waiting for "
        //    40: aload           4
        //    42: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    45: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //    48: aload_1        
        //    49: areturn        
        //    50: astore          4
        //    52: goto            79
        //    55: astore          5
        //    57: aload_0        
        //    58: invokevirtual   C/u.j:()LK2/P;
        //    61: getfield        K2/P.K:LK2/S;
        //    64: ldc             "Interrupted waiting for "
        //    66: aload           4
        //    68: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    71: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //    74: aload           6
        //    76: monitorexit    
        //    77: aconst_null    
        //    78: areturn        
        //    79: aload           6
        //    81: monitorexit    
        //    82: aload           4
        //    84: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  5      14     50     85     Any
        //  14     19     55     79     Ljava/lang/InterruptedException;
        //  14     19     50     85     Any
        //  19     22     50     85     Any
        //  57     77     50     85     Any
        //  79     82     50     85     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    public final void B(final l0 l0) {
        final Object k;
        monitorenter(k = this.K);
        Label_0070: {
            try {
                this.G.add((Object)l0);
                final o0 e = this.E;
                if (e == null) {
                    (this.E = new o0(this, "Measurement Worker", (BlockingQueue)this.G)).setUncaughtExceptionHandler((Thread$UncaughtExceptionHandler)this.I);
                    this.E.start();
                    return;
                }
                break Label_0070;
            }
            finally {
                monitorexit(k);
                final o0 e;
                final Object c = e.C;
                synchronized (c) {
                    e.C.notifyAll();
                    monitorexit(c);
                }
            }
        }
    }
    
    public final void C(final Runnable runnable) {
        this.w();
        final l0 l0 = new l0(this, runnable, false, "Task exception on network thread");
        final Object k;
        monitorenter(k = this.K);
        Label_0089: {
            try {
                ((BlockingQueue)this.H).add((Object)l0);
                final o0 f = this.F;
                if (f == null) {
                    (this.F = new o0(this, "Measurement Network", (BlockingQueue)this.H)).setUncaughtExceptionHandler((Thread$UncaughtExceptionHandler)this.J);
                    this.F.start();
                    return;
                }
                break Label_0089;
            }
            finally {
                monitorexit(k);
                final o0 f;
                final Object c = f.C;
                synchronized (c) {
                    f.C.notifyAll();
                    monitorexit(c);
                }
            }
        }
    }
    
    public final l0 D(final Callable callable) {
        this.w();
        final l0 l0 = new l0(this, callable, true);
        if (Thread.currentThread() == this.E) {
            l0.run();
        }
        else {
            this.B(l0);
        }
        return l0;
    }
    
    public final void E(final Runnable runnable) {
        this.w();
        A.h((Object)runnable);
        this.B(new l0(this, runnable, false, "Task exception on worker thread"));
    }
    
    public final void F(final Runnable runnable) {
        this.w();
        this.B(new l0(this, runnable, true, "Task exception on worker thread"));
    }
    
    public final boolean G() {
        return Thread.currentThread() == this.E;
    }
    
    public final void H() {
        if (Thread.currentThread() == this.F) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }
    
    public final void v() {
        if (Thread.currentThread() == this.E) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    @Override
    public final boolean y() {
        return false;
    }
    
    public final l0 z(final Callable callable) {
        this.w();
        final l0 l0 = new l0(this, callable, false);
        if (Thread.currentThread() == this.E) {
            if (!((AbstractCollection)this.G).isEmpty()) {
                this.j().K.f("Callable skipped the worker queue.");
            }
            l0.run();
        }
        else {
            this.B(l0);
        }
        return l0;
    }
}

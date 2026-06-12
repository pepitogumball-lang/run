package B5;

import w5.v;
import e5.i;
import w5.o;
import java.util.concurrent.CancellationException;
import g5.c;
import w5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import g5.d;
import w5.B;

public final class h extends B implements d, e5.d
{
    public static final AtomicReferenceFieldUpdater J;
    public final s F;
    public final c G;
    public Object H;
    public final Object I;
    private volatile Object _reusableCancellableContinuation;
    
    static {
        J = AtomicReferenceFieldUpdater.newUpdater((Class)h.class, (Class)Object.class, "_reusableCancellableContinuation");
    }
    
    public h(final s f, final c g) {
        super(-1);
        this.F = f;
        this.G = g;
        this.H = a.c;
        this.I = a.l(g.getContext());
    }
    
    @Override
    public final void b(final Object o, final CancellationException ex) {
        if (o instanceof o) {
            ((o)o).b.g(ex);
        }
    }
    
    @Override
    public final e5.d c() {
        return this;
    }
    
    @Override
    public final d e() {
        c g = this.G;
        if (g == null) {
            g = null;
        }
        return g;
    }
    
    @Override
    public final i getContext() {
        return this.G.getContext();
    }
    
    @Override
    public final void h(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        B5/h.G:Lg5/c;
        //     4: astore          5
        //     6: aload           5
        //     8: invokeinterface e5/d.getContext:()Le5/i;
        //    13: astore          4
        //    15: aload_1        
        //    16: invokestatic    c5/e.a:(Ljava/lang/Object;)Ljava/lang/Throwable;
        //    19: astore_3       
        //    20: aload_3        
        //    21: ifnonnull       29
        //    24: aload_1        
        //    25: astore_3       
        //    26: goto            39
        //    29: new             Lw5/n;
        //    32: dup            
        //    33: aload_3        
        //    34: iconst_0       
        //    35: invokespecial   w5/n.<init>:(Ljava/lang/Throwable;Z)V
        //    38: astore_3       
        //    39: aload_0        
        //    40: getfield        B5/h.F:Lw5/s;
        //    43: astore          6
        //    45: aload           6
        //    47: invokevirtual   w5/s.h:()Z
        //    50: ifeq            74
        //    53: aload_0        
        //    54: aload_3        
        //    55: putfield        B5/h.H:Ljava/lang/Object;
        //    58: aload_0        
        //    59: iconst_0       
        //    60: putfield        w5/B.E:I
        //    63: aload           6
        //    65: aload           4
        //    67: aload_0        
        //    68: invokevirtual   w5/s.g:(Le5/i;Ljava/lang/Runnable;)V
        //    71: goto            213
        //    74: invokestatic    w5/h0.a:()Lw5/I;
        //    77: astore          4
        //    79: aload           4
        //    81: getfield        w5/I.E:J
        //    84: ldc2_w          4294967296
        //    87: lcmp           
        //    88: iflt            135
        //    91: aload_0        
        //    92: aload_3        
        //    93: putfield        B5/h.H:Ljava/lang/Object;
        //    96: aload_0        
        //    97: iconst_0       
        //    98: putfield        w5/B.E:I
        //   101: aload           4
        //   103: getfield        w5/I.G:Ld5/b;
        //   106: astore_3       
        //   107: aload_3        
        //   108: astore_1       
        //   109: aload_3        
        //   110: ifnonnull       127
        //   113: new             Ld5/b;
        //   116: dup            
        //   117: invokespecial   d5/b.<init>:()V
        //   120: astore_1       
        //   121: aload           4
        //   123: aload_1        
        //   124: putfield        w5/I.G:Ld5/b;
        //   127: aload_1        
        //   128: aload_0        
        //   129: invokevirtual   d5/b.addLast:(Ljava/lang/Object;)V
        //   132: goto            213
        //   135: aload           4
        //   137: iconst_1       
        //   138: invokevirtual   w5/I.m:(Z)V
        //   141: aload           5
        //   143: invokeinterface e5/d.getContext:()Le5/i;
        //   148: astore          6
        //   150: aload           6
        //   152: aload_0        
        //   153: getfield        B5/h.I:Ljava/lang/Object;
        //   156: invokestatic    B5/a.m:(Le5/i;Ljava/lang/Object;)Ljava/lang/Object;
        //   159: astore_3       
        //   160: aload           5
        //   162: aload_1        
        //   163: invokevirtual   g5/a.h:(Ljava/lang/Object;)V
        //   166: aload           6
        //   168: aload_3        
        //   169: invokestatic    B5/a.g:(Le5/i;Ljava/lang/Object;)V
        //   172: aload           4
        //   174: invokevirtual   w5/I.o:()Z
        //   177: istore_2       
        //   178: iload_2        
        //   179: ifne            172
        //   182: aload           4
        //   184: iconst_1       
        //   185: invokevirtual   w5/I.j:(Z)V
        //   188: goto            213
        //   191: astore_1       
        //   192: goto            204
        //   195: astore_1       
        //   196: aload           6
        //   198: aload_3        
        //   199: invokestatic    B5/a.g:(Le5/i;Ljava/lang/Object;)V
        //   202: aload_1        
        //   203: athrow         
        //   204: aload_0        
        //   205: aload_1        
        //   206: aconst_null    
        //   207: invokevirtual   w5/B.i:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   210: goto            182
        //   213: return         
        //   214: astore_1       
        //   215: aload           4
        //   217: iconst_1       
        //   218: invokevirtual   w5/I.j:(Z)V
        //   221: aload_1        
        //   222: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  141    160    191    213    Any
        //  160    166    195    204    Any
        //  166    172    191    213    Any
        //  172    178    191    213    Any
        //  196    204    191    213    Any
        //  204    210    214    223    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 114 out of bounds for length 114
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
    
    @Override
    public final Object k() {
        final Object h = this.H;
        this.H = a.c;
        return h;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append((Object)this.F);
        sb.append(", ");
        sb.append(v.n((e5.d)this.G));
        sb.append(']');
        return sb.toString();
    }
}

package h2;

import android.os.Handler;
import java.util.Iterator;
import e2.b;
import java.util.concurrent.Executor;
import java.util.Objects;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashMap;
import android.content.ServiceConnection;

public final class K implements ServiceConnection
{
    public final HashMap C;
    public int D;
    public boolean E;
    public IBinder F;
    public final J G;
    public ComponentName H;
    public final M I;
    
    public K(final M i, final J g) {
        Objects.requireNonNull((Object)i);
        this.I = i;
        this.G = g;
        this.C = new HashMap();
        this.D = 2;
    }
    
    public final b a(final String p0, final Executor p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        h2/K.I:Lh2/M;
        //     4: getfield        h2/M.b:Landroid/content/Context;
        //     7: aload_0        
        //     8: getfield        h2/K.G:Lh2/J;
        //    11: invokestatic    h2/C.a:(Landroid/content/Context;Lh2/J;)Landroid/content/Intent;
        //    14: astore          8
        //    16: aload_0        
        //    17: iconst_3       
        //    18: putfield        h2/K.D:I
        //    21: invokestatic    android/os/StrictMode.getVmPolicy:()Landroid/os/StrictMode$VmPolicy;
        //    24: astore          4
        //    26: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    29: bipush          31
        //    31: if_icmplt       52
        //    34: new             Landroid/os/StrictMode$VmPolicy$Builder;
        //    37: dup            
        //    38: aload           4
        //    40: invokespecial   android/os/StrictMode$VmPolicy$Builder.<init>:(Landroid/os/StrictMode$VmPolicy;)V
        //    43: invokestatic    q2/f.a:(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy$Builder;
        //    46: invokevirtual   android/os/StrictMode$VmPolicy$Builder.build:()Landroid/os/StrictMode$VmPolicy;
        //    49: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //    52: aload_0        
        //    53: getfield        h2/K.I:Lh2/M;
        //    56: astore          5
        //    58: aload           5
        //    60: getfield        h2/M.d:Lp2/a;
        //    63: astore          7
        //    65: aload           5
        //    67: getfield        h2/M.b:Landroid/content/Context;
        //    70: astore          6
        //    72: aload_0        
        //    73: getfield        h2/K.G:Lh2/J;
        //    76: astore          9
        //    78: aload           7
        //    80: aload           6
        //    82: aload_1        
        //    83: aload           8
        //    85: aload_0        
        //    86: sipush          4225
        //    89: aload_2        
        //    90: invokevirtual   p2/a.d:(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z
        //    93: istore_3       
        //    94: aload_0        
        //    95: iload_3        
        //    96: putfield        h2/K.E:Z
        //    99: iload_3        
        //   100: ifeq            146
        //   103: aload           5
        //   105: getfield        h2/M.c:LA2/b;
        //   108: iconst_1       
        //   109: aload           9
        //   111: invokevirtual   android/os/Handler.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
        //   114: astore_1       
        //   115: aload           5
        //   117: getfield        h2/M.c:LA2/b;
        //   120: aload_1        
        //   121: aload           5
        //   123: getfield        h2/M.f:J
        //   126: invokevirtual   android/os/Handler.sendMessageDelayed:(Landroid/os/Message;J)Z
        //   129: pop            
        //   130: getstatic       e2/b.G:Le2/b;
        //   133: astore_1       
        //   134: aload           4
        //   136: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //   139: goto            191
        //   142: astore_1       
        //   143: goto            178
        //   146: aload_0        
        //   147: iconst_2       
        //   148: putfield        h2/K.D:I
        //   151: aload           5
        //   153: getfield        h2/M.d:Lp2/a;
        //   156: aload           5
        //   158: getfield        h2/M.b:Landroid/content/Context;
        //   161: aload_0        
        //   162: invokevirtual   p2/a.c:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //   165: new             Le2/b;
        //   168: dup            
        //   169: bipush          16
        //   171: invokespecial   e2/b.<init>:(I)V
        //   174: astore_1       
        //   175: goto            134
        //   178: aload           4
        //   180: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //   183: aload_1        
        //   184: athrow         
        //   185: astore_1       
        //   186: aload_1        
        //   187: getfield        h2/B.C:Le2/b;
        //   190: astore_1       
        //   191: aload_1        
        //   192: areturn        
        //   193: astore_1       
        //   194: goto            165
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      16     185    191    Lh2/B;
        //  52     99     142    146    Any
        //  103    134    142    146    Any
        //  146    151    142    146    Any
        //  151    165    193    197    Ljava/lang/IllegalArgumentException;
        //  151    165    142    146    Any
        //  165    175    142    146    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0165:
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
    
    public final void onBindingDied(final ComponentName componentName) {
        this.onServiceDisconnected(componentName);
    }
    
    public final void onServiceConnected(final ComponentName h, final IBinder f) {
        final M i = this.I;
        final HashMap a;
        monitorenter(a = i.a);
        Label_0088: {
            try {
                ((Handler)i.c).removeMessages(1, (Object)this.G);
                this.F = f;
                this.H = h;
                final Iterator iterator = this.C.values().iterator();
                while (iterator.hasNext()) {
                    ((ServiceConnection)iterator.next()).onServiceConnected(h, f);
                }
                break Label_0088;
            }
            finally {
                monitorexit(a);
                this.D = 1;
                monitorexit(a);
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName h) {
        final M i = this.I;
        final HashMap a;
        monitorenter(a = i.a);
        Label_0081: {
            try {
                ((Handler)i.c).removeMessages(1, (Object)this.G);
                this.F = null;
                this.H = h;
                final Iterator iterator = this.C.values().iterator();
                while (iterator.hasNext()) {
                    ((ServiceConnection)iterator.next()).onServiceDisconnected(h);
                }
                break Label_0081;
            }
            finally {
                monitorexit(a);
                this.D = 2;
                monitorexit(a);
            }
        }
    }
}

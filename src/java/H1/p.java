package h1;

import java.util.concurrent.Callable;
import g2.n;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.q0;
import android.os.IBinder;
import android.content.ComponentName;
import android.util.Log;
import com.google.android.gms.internal.auth.m;
import L4.g;
import K2.c0;
import android.content.ServiceConnection;

public final class p implements ServiceConnection
{
    public final c0 C = c;
    public final b D = d;
    
    public final void a(final f f) {
        final Object a;
        monitorenter(a = this.D.a);
        Label_0030: {
            try {
                if (this.D.b == 3) {
                    monitorexit(a);
                    return;
                }
                break Label_0030;
            }
            finally {
                monitorexit(a);
                final c0 c;
                Label_0055: {
                    c.C = true;
                }
                ((g)c.D).success((Object)m.m(f));
                return;
                monitorexit(a);
                c = this.C;
                iftrue(Label_0055:)(!c.C);
                Log.d("InAppPurchasePlugin", "Tried to call onBillingSetupFinished multiple times.");
            }
        }
    }
    
    public final void onBindingDied(final ComponentName p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc             "Billing service died."
        //     4: invokestatic    com/google/android/gms/internal/play_billing/q0.g:(Ljava/lang/String;Ljava/lang/String;)V
        //     7: aload_0        
        //     8: getfield        h1/p.D:Lh1/b;
        //    11: astore          4
        //    13: aload           4
        //    15: getfield        h1/b.a:Ljava/lang/Object;
        //    18: astore_1       
        //    19: aload_1        
        //    20: dup            
        //    21: astore          6
        //    23: monitorenter   
        //    24: aload           4
        //    26: getfield        h1/b.b:I
        //    29: istore_3       
        //    30: iconst_1       
        //    31: istore_2       
        //    32: iload_3        
        //    33: iconst_1       
        //    34: if_icmpne       40
        //    37: goto            42
        //    40: iconst_0       
        //    41: istore_2       
        //    42: aload           6
        //    44: monitorexit    
        //    45: iload_2        
        //    46: ifeq            105
        //    49: aload_0        
        //    50: getfield        h1/p.D:Lh1/b;
        //    53: getfield        h1/b.g:Lh1/m;
        //    56: astore          5
        //    58: invokestatic    com/google/android/gms/internal/play_billing/U1.r:()Lcom/google/android/gms/internal/play_billing/T1;
        //    61: astore_1       
        //    62: aload_1        
        //    63: bipush          6
        //    65: invokevirtual   com/google/android/gms/internal/play_billing/T1.g:(I)V
        //    68: invokestatic    com/google/android/gms/internal/play_billing/Y1.r:()Lcom/google/android/gms/internal/play_billing/X1;
        //    71: astore          4
        //    73: aload           4
        //    75: bipush          122
        //    77: invokevirtual   com/google/android/gms/internal/play_billing/X1.g:(I)V
        //    80: aload_1        
        //    81: aload           4
        //    83: invokevirtual   com/google/android/gms/internal/play_billing/T1.f:(Lcom/google/android/gms/internal/play_billing/X1;)V
        //    86: aload           5
        //    88: aload_1        
        //    89: invokevirtual   com/google/android/gms/internal/play_billing/h1.b:()Lcom/google/android/gms/internal/play_billing/i1;
        //    92: checkcast       Lcom/google/android/gms/internal/play_billing/U1;
        //    95: invokevirtual   h1/m.j:(Lcom/google/android/gms/internal/play_billing/U1;)V
        //    98: goto            137
        //   101: astore_1       
        //   102: goto            129
        //   105: aload_0        
        //   106: getfield        h1/p.D:Lh1/b;
        //   109: getfield        h1/b.g:Lh1/m;
        //   112: invokestatic    com/google/android/gms/internal/play_billing/a2.n:()Lcom/google/android/gms/internal/play_billing/a2;
        //   115: invokevirtual   h1/m.n:(Lcom/google/android/gms/internal/play_billing/a2;)V
        //   118: goto            137
        //   121: astore          4
        //   123: aload           6
        //   125: monitorexit    
        //   126: aload           4
        //   128: athrow         
        //   129: ldc             "BillingClient"
        //   131: ldc             "Unable to log."
        //   133: aload_1        
        //   134: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   137: aload_0        
        //   138: getfield        h1/p.D:Lh1/b;
        //   141: getfield        h1/b.a:Ljava/lang/Object;
        //   144: astore_1       
        //   145: aload_1        
        //   146: dup            
        //   147: astore          6
        //   149: monitorenter   
        //   150: aload_0        
        //   151: getfield        h1/p.D:Lh1/b;
        //   154: getfield        h1/b.b:I
        //   157: iconst_3       
        //   158: if_icmpeq       205
        //   161: aload_0        
        //   162: getfield        h1/p.D:Lh1/b;
        //   165: getfield        h1/b.b:I
        //   168: ifne            174
        //   171: goto            205
        //   174: aload_0        
        //   175: getfield        h1/p.D:Lh1/b;
        //   178: iconst_0       
        //   179: invokevirtual   h1/b.t:(I)V
        //   182: aload_0        
        //   183: getfield        h1/p.D:Lh1/b;
        //   186: invokevirtual   h1/b.u:()V
        //   189: aload           6
        //   191: monitorexit    
        //   192: aload_0        
        //   193: getfield        h1/p.C:LK2/c0;
        //   196: invokevirtual   K2/c0.a:()V
        //   199: return         
        //   200: astore          4
        //   202: goto            209
        //   205: aload           6
        //   207: monitorexit    
        //   208: return         
        //   209: aload           6
        //   211: monitorexit    
        //   212: aload           4
        //   214: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      24     101    105    Any
        //  24     30     121    129    Any
        //  42     45     121    129    Any
        //  49     98     101    105    Any
        //  105    118    101    105    Any
        //  123    126    121    129    Any
        //  126    129    101    105    Any
        //  150    171    200    215    Any
        //  174    192    200    215    Any
        //  205    208    200    215    Any
        //  209    212    200    215    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        q0.f("BillingClient", "Billing service connected.");
        final Object a;
        monitorenter(a = this.D.a);
        Label_0037: {
            try {
                if (this.D.b == 3) {
                    monitorexit(a);
                    return;
                }
                break Label_0037;
            }
            finally {
                monitorexit(a);
                while (true) {
                    final b d = this.D;
                    final f n = d.n();
                    d.H(25, 6, n);
                    this.a(n);
                    return;
                    this.D.h = zzam.zzu(binder);
                    monitorexit(a);
                    final b d2 = this.D;
                    iftrue(Label_0114:)(b.m((Callable)new E1.m((Object)this, 5), 30000L, (Runnable)new n((Object)this, 2), d2.D(), d2.q()) != null);
                    continue;
                }
                Label_0114:;
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc             "Billing service disconnected."
        //     4: invokestatic    com/google/android/gms/internal/play_billing/q0.g:(Ljava/lang/String;Ljava/lang/String;)V
        //     7: aload_0        
        //     8: getfield        h1/p.D:Lh1/b;
        //    11: astore          4
        //    13: aload           4
        //    15: getfield        h1/b.a:Ljava/lang/Object;
        //    18: astore_1       
        //    19: aload_1        
        //    20: dup            
        //    21: astore          6
        //    23: monitorenter   
        //    24: aload           4
        //    26: getfield        h1/b.b:I
        //    29: istore_3       
        //    30: iconst_1       
        //    31: istore_2       
        //    32: iload_3        
        //    33: iconst_1       
        //    34: if_icmpne       40
        //    37: goto            42
        //    40: iconst_0       
        //    41: istore_2       
        //    42: aload           6
        //    44: monitorexit    
        //    45: iload_2        
        //    46: ifeq            107
        //    49: aload_0        
        //    50: getfield        h1/p.D:Lh1/b;
        //    53: getfield        h1/b.g:Lh1/m;
        //    56: astore_1       
        //    57: invokestatic    com/google/android/gms/internal/play_billing/U1.r:()Lcom/google/android/gms/internal/play_billing/T1;
        //    60: astore          4
        //    62: aload           4
        //    64: bipush          6
        //    66: invokevirtual   com/google/android/gms/internal/play_billing/T1.g:(I)V
        //    69: invokestatic    com/google/android/gms/internal/play_billing/Y1.r:()Lcom/google/android/gms/internal/play_billing/X1;
        //    72: astore          5
        //    74: aload           5
        //    76: bipush          121
        //    78: invokevirtual   com/google/android/gms/internal/play_billing/X1.g:(I)V
        //    81: aload           4
        //    83: aload           5
        //    85: invokevirtual   com/google/android/gms/internal/play_billing/T1.f:(Lcom/google/android/gms/internal/play_billing/X1;)V
        //    88: aload_1        
        //    89: aload           4
        //    91: invokevirtual   com/google/android/gms/internal/play_billing/h1.b:()Lcom/google/android/gms/internal/play_billing/i1;
        //    94: checkcast       Lcom/google/android/gms/internal/play_billing/U1;
        //    97: invokevirtual   h1/m.j:(Lcom/google/android/gms/internal/play_billing/U1;)V
        //   100: goto            139
        //   103: astore_1       
        //   104: goto            131
        //   107: aload_0        
        //   108: getfield        h1/p.D:Lh1/b;
        //   111: getfield        h1/b.g:Lh1/m;
        //   114: invokestatic    com/google/android/gms/internal/play_billing/q2.n:()Lcom/google/android/gms/internal/play_billing/q2;
        //   117: invokevirtual   h1/m.p:(Lcom/google/android/gms/internal/play_billing/q2;)V
        //   120: goto            139
        //   123: astore          4
        //   125: aload           6
        //   127: monitorexit    
        //   128: aload           4
        //   130: athrow         
        //   131: ldc             "BillingClient"
        //   133: ldc             "Unable to log."
        //   135: aload_1        
        //   136: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   139: aload_0        
        //   140: getfield        h1/p.D:Lh1/b;
        //   143: getfield        h1/b.a:Ljava/lang/Object;
        //   146: astore_1       
        //   147: aload_1        
        //   148: dup            
        //   149: astore          6
        //   151: monitorenter   
        //   152: aload_0        
        //   153: getfield        h1/p.D:Lh1/b;
        //   156: getfield        h1/b.b:I
        //   159: iconst_3       
        //   160: if_icmpne       172
        //   163: aload           6
        //   165: monitorexit    
        //   166: return         
        //   167: astore          4
        //   169: goto            191
        //   172: aload_0        
        //   173: getfield        h1/p.D:Lh1/b;
        //   176: iconst_0       
        //   177: invokevirtual   h1/b.t:(I)V
        //   180: aload           6
        //   182: monitorexit    
        //   183: aload_0        
        //   184: getfield        h1/p.C:LK2/c0;
        //   187: invokevirtual   K2/c0.a:()V
        //   190: return         
        //   191: aload           6
        //   193: monitorexit    
        //   194: aload           4
        //   196: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      24     103    107    Any
        //  24     30     123    131    Any
        //  42     45     123    131    Any
        //  49     100    103    107    Any
        //  107    120    103    107    Any
        //  125    128    123    131    Any
        //  128    131    103    107    Any
        //  152    166    167    197    Any
        //  172    183    167    197    Any
        //  191    194    167    197    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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

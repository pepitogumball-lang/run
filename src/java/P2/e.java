package P2;

import android.os.IBinder;
import Q2.h;
import O2.j;
import Q2.d;

public final class e extends d
{
    public final int D;
    public final Object E;
    public final Object F;
    
    public e(final g f, final j j, final j e) {
        this.D = 0;
        this.E = e;
        this.F = f;
        super(j);
    }
    
    public e(final h f, final IBinder e) {
        this.D = 1;
        this.E = e;
        this.F = f;
    }
    
    @Override
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        P2/e.D:I
        //     4: tableswitch {
        //                0: 190
        //          default: 24
        //        }
        //    24: aload_0        
        //    25: getfield        P2/e.E:Ljava/lang/Object;
        //    28: checkcast       Landroid/os/IBinder;
        //    31: invokestatic    com/google/android/play/core/review/internal/zze.zzb:(Landroid/os/IBinder;)LQ2/c;
        //    34: astore          4
        //    36: aload_0        
        //    37: getfield        P2/e.F:Ljava/lang/Object;
        //    40: checkcast       LQ2/h;
        //    43: astore_2       
        //    44: aload_2        
        //    45: getfield        Q2/h.D:Ljava/lang/Object;
        //    48: checkcast       LQ2/i;
        //    51: astore_3       
        //    52: aload_3        
        //    53: aload           4
        //    55: putfield        Q2/i.m:LQ2/c;
        //    58: aload_3        
        //    59: getfield        Q2/i.b:LB5/w;
        //    62: astore          4
        //    64: aload           4
        //    66: ldc             "linkToDeath"
        //    68: iconst_0       
        //    69: anewarray       Ljava/lang/Object;
        //    72: invokevirtual   B5/w.e:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    75: aload_3        
        //    76: getfield        Q2/i.m:LQ2/c;
        //    79: invokeinterface android/os/IInterface.asBinder:()Landroid/os/IBinder;
        //    84: aload_3        
        //    85: getfield        Q2/i.j:LQ2/e;
        //    88: iconst_0       
        //    89: invokeinterface android/os/IBinder.linkToDeath:(Landroid/os/IBinder$DeathRecipient;I)V
        //    94: goto            135
        //    97: astore_3       
        //    98: aload           4
        //   100: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   103: pop            
        //   104: ldc             "PlayCore"
        //   106: bipush          6
        //   108: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   111: ifeq            135
        //   114: ldc             "PlayCore"
        //   116: aload           4
        //   118: getfield        B5/w.b:Ljava/lang/String;
        //   121: ldc             "linkToDeath failed"
        //   123: iconst_0       
        //   124: anewarray       Ljava/lang/Object;
        //   127: invokestatic    B5/w.g:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   130: aload_3        
        //   131: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   134: pop            
        //   135: aload_2        
        //   136: getfield        Q2/h.D:Ljava/lang/Object;
        //   139: checkcast       LQ2/i;
        //   142: astore_2       
        //   143: aload_2        
        //   144: iconst_0       
        //   145: putfield        Q2/i.g:Z
        //   148: aload_2        
        //   149: getfield        Q2/i.d:Ljava/util/ArrayList;
        //   152: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   155: astore_3       
        //   156: aload_3        
        //   157: invokeinterface java/util/Iterator.hasNext:()Z
        //   162: ifeq            182
        //   165: aload_3        
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: checkcast       Ljava/lang/Runnable;
        //   174: invokeinterface java/lang/Runnable.run:()V
        //   179: goto            156
        //   182: aload_2        
        //   183: getfield        Q2/i.d:Ljava/util/ArrayList;
        //   186: invokevirtual   java/util/ArrayList.clear:()V
        //   189: return         
        //   190: aload_0        
        //   191: getfield        P2/e.F:Ljava/lang/Object;
        //   194: checkcast       LP2/g;
        //   197: astore_2       
        //   198: aload_2        
        //   199: getfield        P2/g.a:LQ2/i;
        //   202: getfield        Q2/i.m:LQ2/c;
        //   205: astore          4
        //   207: aload_2        
        //   208: getfield        P2/g.b:Ljava/lang/String;
        //   211: astore_2       
        //   212: new             Landroid/os/Bundle;
        //   215: astore_3       
        //   216: aload_3        
        //   217: invokespecial   android/os/Bundle.<init>:()V
        //   220: getstatic       P2/h.a:Ljava/util/HashMap;
        //   223: astore          5
        //   225: ldc             LP2/h;.class
        //   227: dup            
        //   228: astore          9
        //   230: monitorenter   
        //   231: getstatic       P2/h.a:Ljava/util/HashMap;
        //   234: astore          5
        //   236: aload           5
        //   238: ldc             "java"
        //   240: sipush          20002
        //   243: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   246: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   249: pop            
        //   250: aload           9
        //   252: monitorexit    
        //   253: aload_3        
        //   254: ldc             "playcore_version_code"
        //   256: aload           5
        //   258: ldc             "java"
        //   260: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   263: checkcast       Ljava/lang/Integer;
        //   266: invokevirtual   java/lang/Integer.intValue:()I
        //   269: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //   272: aload           5
        //   274: ldc             "native"
        //   276: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   279: ifeq            308
        //   282: aload_3        
        //   283: ldc             "playcore_native_version"
        //   285: aload           5
        //   287: ldc             "native"
        //   289: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   292: checkcast       Ljava/lang/Integer;
        //   295: invokevirtual   java/lang/Integer.intValue:()I
        //   298: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //   301: goto            308
        //   304: astore_2       
        //   305: goto            469
        //   308: aload           5
        //   310: ldc             "unity"
        //   312: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   315: ifeq            337
        //   318: aload_3        
        //   319: ldc             "playcore_unity_version"
        //   321: aload           5
        //   323: ldc             "unity"
        //   325: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   328: checkcast       Ljava/lang/Integer;
        //   331: invokevirtual   java/lang/Integer.intValue:()I
        //   334: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //   337: new             LP2/f;
        //   340: astore          5
        //   342: aload_0        
        //   343: getfield        P2/e.F:Ljava/lang/Object;
        //   346: checkcast       LP2/g;
        //   349: astore          8
        //   351: aload_0        
        //   352: getfield        P2/e.E:Ljava/lang/Object;
        //   355: checkcast       LO2/j;
        //   358: astore          6
        //   360: aload           8
        //   362: getfield        P2/g.b:Ljava/lang/String;
        //   365: astore          7
        //   367: aload           5
        //   369: aload           8
        //   371: aload           6
        //   373: invokespecial   P2/f.<init>:(LP2/g;LO2/j;)V
        //   376: aload           4
        //   378: checkcast       LQ2/b;
        //   381: astore          6
        //   383: aload           6
        //   385: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   388: pop            
        //   389: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   392: astore          4
        //   394: aload           4
        //   396: ldc             "com.google.android.play.core.inappreview.protocol.IInAppReviewService"
        //   398: invokevirtual   android/os/Parcel.writeInterfaceToken:(Ljava/lang/String;)V
        //   401: aload           4
        //   403: aload_2        
        //   404: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   407: getstatic       Q2/a.a:I
        //   410: istore_1       
        //   411: aload           4
        //   413: iconst_1       
        //   414: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   417: aload_3        
        //   418: aload           4
        //   420: iconst_0       
        //   421: invokevirtual   android/os/Bundle.writeToParcel:(Landroid/os/Parcel;I)V
        //   424: aload           4
        //   426: aload           5
        //   428: invokevirtual   android/os/Parcel.writeStrongBinder:(Landroid/os/IBinder;)V
        //   431: aload           6
        //   433: getfield        Q2/b.C:Landroid/os/IBinder;
        //   436: iconst_2       
        //   437: aload           4
        //   439: aconst_null    
        //   440: iconst_1       
        //   441: invokeinterface android/os/IBinder.transact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
        //   446: pop            
        //   447: aload           4
        //   449: invokevirtual   android/os/Parcel.recycle:()V
        //   452: goto            548
        //   455: astore_2       
        //   456: aload           4
        //   458: invokevirtual   android/os/Parcel.recycle:()V
        //   461: aload_2        
        //   462: athrow         
        //   463: astore_2       
        //   464: aload           9
        //   466: monitorexit    
        //   467: aload_2        
        //   468: athrow         
        //   469: aload_0        
        //   470: getfield        P2/e.F:Ljava/lang/Object;
        //   473: checkcast       LP2/g;
        //   476: astore          4
        //   478: getstatic       P2/g.c:LB5/w;
        //   481: astore_3       
        //   482: aload           4
        //   484: getfield        P2/g.b:Ljava/lang/String;
        //   487: astore          4
        //   489: aload_3        
        //   490: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   493: pop            
        //   494: ldc             "PlayCore"
        //   496: bipush          6
        //   498: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   501: ifeq            529
        //   504: ldc             "PlayCore"
        //   506: aload_3        
        //   507: getfield        B5/w.b:Ljava/lang/String;
        //   510: ldc             "error requesting in-app review for %s"
        //   512: iconst_1       
        //   513: anewarray       Ljava/lang/Object;
        //   516: dup            
        //   517: iconst_0       
        //   518: aload           4
        //   520: aastore        
        //   521: invokestatic    B5/w.g:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   524: aload_2        
        //   525: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   528: pop            
        //   529: aload_0        
        //   530: getfield        P2/e.E:Ljava/lang/Object;
        //   533: checkcast       LO2/j;
        //   536: new             Ljava/lang/RuntimeException;
        //   539: dup            
        //   540: aload_2        
        //   541: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   544: invokevirtual   O2/j.c:(Ljava/lang/Exception;)Z
        //   547: pop            
        //   548: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  75     94     97     135    Landroid/os/RemoteException;
        //  190    231    304    548    Landroid/os/RemoteException;
        //  231    250    463    469    Any
        //  250    301    304    548    Landroid/os/RemoteException;
        //  308    337    304    548    Landroid/os/RemoteException;
        //  337    431    304    548    Landroid/os/RemoteException;
        //  431    447    455    463    Any
        //  447    452    304    548    Landroid/os/RemoteException;
        //  456    463    304    548    Landroid/os/RemoteException;
        //  464    467    463    469    Any
        //  467    469    304    548    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0308:
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

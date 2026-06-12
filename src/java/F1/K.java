package F1;

import com.google.android.gms.internal.ads.La;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.internal.ads.zzbok;
import android.content.Context;

public final class k extends o
{
    public final Context b;
    public final String c;
    public final zzbok d;
    public final n e;
    
    public k(final n e, final Context b, final String c, final zzbok d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a() {
        n.u(this.b, "native_ad");
        return new zzbs();
    }
    
    @Override
    public final Object c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        F1/k.b:Landroid/content/Context;
        //     4: astore          4
        //     6: aload           4
        //     8: invokestatic    com/google/android/gms/internal/ads/D7.a:(Landroid/content/Context;)V
        //    11: getstatic       com/google/android/gms/internal/ads/D7.sa:Lcom/google/android/gms/internal/ads/z7;
        //    14: astore_2       
        //    15: getstatic       F1/q.d:LF1/q;
        //    18: getfield        F1/q.c:Lcom/google/android/gms/internal/ads/B7;
        //    21: aload_2        
        //    22: invokevirtual   com/google/android/gms/internal/ads/B7.a:(Lcom/google/android/gms/internal/ads/z7;)Ljava/lang/Object;
        //    25: checkcast       Ljava/lang/Boolean;
        //    28: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    31: istore_1       
        //    32: aload_0        
        //    33: getfield        F1/k.d:Lcom/google/android/gms/internal/ads/zzbok;
        //    36: astore          7
        //    38: aload_0        
        //    39: getfield        F1/k.c:Ljava/lang/String;
        //    42: astore          6
        //    44: aload_0        
        //    45: getfield        F1/k.e:LF1/n;
        //    48: astore          5
        //    50: aconst_null    
        //    51: astore_3       
        //    52: iload_1        
        //    53: ifeq            280
        //    56: aload           4
        //    58: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //    61: astore          8
        //    63: aload           4
        //    65: invokestatic    J1/j.b:(Landroid/content/Context;)Lu2/d;
        //    68: ldc             "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl"
        //    70: invokevirtual   u2/d.b:(Ljava/lang/String;)Landroid/os/IBinder;
        //    73: checkcast       Landroid/os/IBinder;
        //    76: astore          9
        //    78: aload           9
        //    80: ifnonnull       88
        //    83: aconst_null    
        //    84: astore_2       
        //    85: goto            123
        //    88: aload           9
        //    90: ldc             "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator"
        //    92: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    97: astore_2       
        //    98: aload_2        
        //    99: instanceof      LF1/B;
        //   102: ifeq            113
        //   105: aload_2        
        //   106: checkcast       LF1/B;
        //   109: astore_2       
        //   110: goto            123
        //   113: new             LF1/B;
        //   116: dup            
        //   117: aload           9
        //   119: invokespecial   F1/B.<init>:(Landroid/os/IBinder;)V
        //   122: astore_2       
        //   123: aload_2        
        //   124: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   127: astore          9
        //   129: aload           9
        //   131: aload           8
        //   133: invokestatic    com/google/android/gms/internal/ads/F5.e:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   136: aload           9
        //   138: aload           6
        //   140: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   143: aload           9
        //   145: aload           7
        //   147: invokestatic    com/google/android/gms/internal/ads/F5.e:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   150: aload           9
        //   152: ldc             250930000
        //   154: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   157: aload_2        
        //   158: aload           9
        //   160: iconst_1       
        //   161: invokevirtual   B2/a.K4:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   164: astore          6
        //   166: aload           6
        //   168: invokevirtual   android/os/Parcel.readStrongBinder:()Landroid/os/IBinder;
        //   171: astore_2       
        //   172: aload           6
        //   174: invokevirtual   android/os/Parcel.recycle:()V
        //   177: aload_2        
        //   178: ifnonnull       186
        //   181: aload_3        
        //   182: astore_2       
        //   183: goto            427
        //   186: aload_2        
        //   187: ldc             "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
        //   189: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //   194: astore          6
        //   196: aload           6
        //   198: instanceof      LF1/A;
        //   201: ifeq            225
        //   204: aload           6
        //   206: checkcast       LF1/A;
        //   209: astore_2       
        //   210: goto            427
        //   213: astore_2       
        //   214: goto            252
        //   217: astore_2       
        //   218: goto            252
        //   221: astore_2       
        //   222: goto            252
        //   225: new             LF1/z;
        //   228: dup            
        //   229: aload_2        
        //   230: invokespecial   F1/z.<init>:(Landroid/os/IBinder;)V
        //   233: astore_2       
        //   234: goto            210
        //   237: astore_2       
        //   238: new             LJ1/k;
        //   241: astore          6
        //   243: aload           6
        //   245: aload_2        
        //   246: invokespecial   java/lang/Exception.<init>:(Ljava/lang/Throwable;)V
        //   249: aload           6
        //   251: athrow         
        //   252: aload           4
        //   254: invokestatic    com/google/android/gms/internal/ads/Vb.a:(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Wb;
        //   257: astore          4
        //   259: aload           5
        //   261: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   264: pop            
        //   265: aload           4
        //   267: ldc             "ClientApiBroker.createAdLoaderBuilder"
        //   269: aload_2        
        //   270: invokeinterface com/google/android/gms/internal/ads/Wb.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   275: aload_3        
        //   276: astore_2       
        //   277: goto            427
        //   280: aload           5
        //   282: getfield        F1/n.E:Ljava/lang/Object;
        //   285: checkcast       LF1/G0;
        //   288: astore          5
        //   290: aload           4
        //   292: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   295: astore_2       
        //   296: aload           5
        //   298: aload           4
        //   300: invokevirtual   com/google/android/gms/internal/ads/vd.h:(Landroid/content/Context;)Ljava/lang/Object;
        //   303: checkcast       LF1/B;
        //   306: astore          5
        //   308: aload           5
        //   310: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   313: astore          4
        //   315: aload           4
        //   317: aload_2        
        //   318: invokestatic    com/google/android/gms/internal/ads/F5.e:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   321: aload           4
        //   323: aload           6
        //   325: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   328: aload           4
        //   330: aload           7
        //   332: invokestatic    com/google/android/gms/internal/ads/F5.e:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   335: aload           4
        //   337: ldc             250930000
        //   339: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   342: aload           5
        //   344: aload           4
        //   346: iconst_1       
        //   347: invokevirtual   B2/a.K4:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   350: astore          4
        //   352: aload           4
        //   354: invokevirtual   android/os/Parcel.readStrongBinder:()Landroid/os/IBinder;
        //   357: astore_2       
        //   358: aload           4
        //   360: invokevirtual   android/os/Parcel.recycle:()V
        //   363: aload_2        
        //   364: ifnonnull       372
        //   367: aload_3        
        //   368: astore_2       
        //   369: goto            427
        //   372: aload_2        
        //   373: ldc             "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
        //   375: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //   380: astore          4
        //   382: aload           4
        //   384: instanceof      LF1/A;
        //   387: ifeq            407
        //   390: aload           4
        //   392: checkcast       LF1/A;
        //   395: astore_2       
        //   396: goto            427
        //   399: astore_2       
        //   400: goto            419
        //   403: astore_2       
        //   404: goto            419
        //   407: new             LF1/z;
        //   410: dup            
        //   411: aload_2        
        //   412: invokespecial   F1/z.<init>:(Landroid/os/IBinder;)V
        //   415: astore_2       
        //   416: goto            396
        //   419: ldc             "Could not create remote builder for AdLoader."
        //   421: aload_2        
        //   422: invokestatic    J1/j.j:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   425: aload_3        
        //   426: astore_2       
        //   427: aload_2        
        //   428: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  56     63     221    225    LJ1/k;
        //  56     63     217    221    Landroid/os/RemoteException;
        //  56     63     213    217    Ljava/lang/NullPointerException;
        //  63     78     237    252    Ljava/lang/Exception;
        //  88     110    237    252    Ljava/lang/Exception;
        //  113    123    237    252    Ljava/lang/Exception;
        //  123    177    221    225    LJ1/k;
        //  123    177    217    221    Landroid/os/RemoteException;
        //  123    177    213    217    Ljava/lang/NullPointerException;
        //  186    210    221    225    LJ1/k;
        //  186    210    217    221    Landroid/os/RemoteException;
        //  186    210    213    217    Ljava/lang/NullPointerException;
        //  225    234    221    225    LJ1/k;
        //  225    234    217    221    Landroid/os/RemoteException;
        //  225    234    213    217    Ljava/lang/NullPointerException;
        //  238    252    221    225    LJ1/k;
        //  238    252    217    221    Landroid/os/RemoteException;
        //  238    252    213    217    Ljava/lang/NullPointerException;
        //  290    363    403    407    Landroid/os/RemoteException;
        //  290    363    399    403    Lt2/c;
        //  372    396    403    407    Landroid/os/RemoteException;
        //  372    396    399    403    Lt2/c;
        //  407    416    403    407    Landroid/os/RemoteException;
        //  407    416    399    403    Lt2/c;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
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

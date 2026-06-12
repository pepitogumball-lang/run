package F1;

import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.ads.internal.client.zzcx;
import android.content.Context;

public final class l extends o
{
    public final Context b;
    public final n c;
    
    public l(final n c, final Context b) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object a() {
        n.u(this.b, "mobile_ads_settings");
        return new zzcx();
    }
    
    @Override
    public final Object c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        F1/l.b:Landroid/content/Context;
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
        //    33: getfield        F1/l.c:LF1/n;
        //    36: astore          5
        //    38: aconst_null    
        //    39: astore_3       
        //    40: iload_1        
        //    41: ifeq            252
        //    44: aload           4
        //    46: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //    49: astore          6
        //    51: aload           4
        //    53: invokestatic    J1/j.b:(Landroid/content/Context;)Lu2/d;
        //    56: ldc             "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"
        //    58: invokevirtual   u2/d.b:(Ljava/lang/String;)Landroid/os/IBinder;
        //    61: checkcast       Landroid/os/IBinder;
        //    64: astore_2       
        //    65: aload_2        
        //    66: ifnonnull       74
        //    69: aconst_null    
        //    70: astore_2       
        //    71: goto            110
        //    74: aload_2        
        //    75: ldc             "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator"
        //    77: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    82: astore          7
        //    84: aload           7
        //    86: instanceof      LF1/W;
        //    89: ifeq            101
        //    92: aload           7
        //    94: checkcast       LF1/W;
        //    97: astore_2       
        //    98: goto            110
        //   101: new             LF1/W;
        //   104: dup            
        //   105: aload_2        
        //   106: invokespecial   F1/W.<init>:(Landroid/os/IBinder;)V
        //   109: astore_2       
        //   110: aload_2        
        //   111: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   114: astore          7
        //   116: aload           7
        //   118: aload           6
        //   120: invokestatic    com/google/android/gms/internal/ads/F5.e:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   123: aload           7
        //   125: ldc             250930000
        //   127: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   130: aload_2        
        //   131: aload           7
        //   133: iconst_1       
        //   134: invokevirtual   B2/a.K4:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   137: astore          6
        //   139: aload           6
        //   141: invokevirtual   android/os/Parcel.readStrongBinder:()Landroid/os/IBinder;
        //   144: astore_2       
        //   145: aload           6
        //   147: invokevirtual   android/os/Parcel.recycle:()V
        //   150: aload_2        
        //   151: ifnonnull       159
        //   154: aload_3        
        //   155: astore_2       
        //   156: goto            385
        //   159: aload_2        
        //   160: ldc             "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
        //   162: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //   167: astore          6
        //   169: aload           6
        //   171: instanceof      LF1/V;
        //   174: ifeq            198
        //   177: aload           6
        //   179: checkcast       LF1/V;
        //   182: astore_2       
        //   183: goto            385
        //   186: astore_2       
        //   187: goto            224
        //   190: astore_2       
        //   191: goto            224
        //   194: astore_2       
        //   195: goto            224
        //   198: new             LF1/U;
        //   201: dup            
        //   202: aload_2        
        //   203: invokespecial   F1/U.<init>:(Landroid/os/IBinder;)V
        //   206: astore_2       
        //   207: goto            183
        //   210: astore          6
        //   212: new             LJ1/k;
        //   215: astore_2       
        //   216: aload_2        
        //   217: aload           6
        //   219: invokespecial   java/lang/Exception.<init>:(Ljava/lang/Throwable;)V
        //   222: aload_2        
        //   223: athrow         
        //   224: aload           4
        //   226: invokestatic    com/google/android/gms/internal/ads/Vb.a:(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Wb;
        //   229: astore          4
        //   231: aload           5
        //   233: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   236: pop            
        //   237: aload           4
        //   239: ldc             "ClientApiBroker.getMobileAdsSettingsManager"
        //   241: aload_2        
        //   242: invokeinterface com/google/android/gms/internal/ads/Wb.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   247: aload_3        
        //   248: astore_2       
        //   249: goto            385
        //   252: aload           5
        //   254: getfield        F1/n.F:Ljava/lang/Object;
        //   257: checkcast       LF1/G0;
        //   260: astore          5
        //   262: aload           4
        //   264: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   267: astore_2       
        //   268: aload           5
        //   270: aload           4
        //   272: invokevirtual   com/google/android/gms/internal/ads/vd.h:(Landroid/content/Context;)Ljava/lang/Object;
        //   275: checkcast       LF1/W;
        //   278: astore          4
        //   280: aload           4
        //   282: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   285: astore          5
        //   287: aload           5
        //   289: aload_2        
        //   290: invokestatic    com/google/android/gms/internal/ads/F5.e:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   293: aload           5
        //   295: ldc             250930000
        //   297: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   300: aload           4
        //   302: aload           5
        //   304: iconst_1       
        //   305: invokevirtual   B2/a.K4:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   308: astore          4
        //   310: aload           4
        //   312: invokevirtual   android/os/Parcel.readStrongBinder:()Landroid/os/IBinder;
        //   315: astore_2       
        //   316: aload           4
        //   318: invokevirtual   android/os/Parcel.recycle:()V
        //   321: aload_2        
        //   322: ifnonnull       330
        //   325: aload_3        
        //   326: astore_2       
        //   327: goto            385
        //   330: aload_2        
        //   331: ldc             "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
        //   333: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //   338: astore          4
        //   340: aload           4
        //   342: instanceof      LF1/V;
        //   345: ifeq            365
        //   348: aload           4
        //   350: checkcast       LF1/V;
        //   353: astore_2       
        //   354: goto            385
        //   357: astore_2       
        //   358: goto            377
        //   361: astore_2       
        //   362: goto            377
        //   365: new             LF1/U;
        //   368: dup            
        //   369: aload_2        
        //   370: invokespecial   F1/U.<init>:(Landroid/os/IBinder;)V
        //   373: astore_2       
        //   374: goto            354
        //   377: ldc             "Could not get remote MobileAdsSettingManager."
        //   379: aload_2        
        //   380: invokestatic    J1/j.j:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   383: aload_3        
        //   384: astore_2       
        //   385: aload_2        
        //   386: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  44     51     194    198    LJ1/k;
        //  44     51     190    194    Landroid/os/RemoteException;
        //  44     51     186    190    Ljava/lang/NullPointerException;
        //  51     65     210    224    Ljava/lang/Exception;
        //  74     98     210    224    Ljava/lang/Exception;
        //  101    110    210    224    Ljava/lang/Exception;
        //  110    150    194    198    LJ1/k;
        //  110    150    190    194    Landroid/os/RemoteException;
        //  110    150    186    190    Ljava/lang/NullPointerException;
        //  159    183    194    198    LJ1/k;
        //  159    183    190    194    Landroid/os/RemoteException;
        //  159    183    186    190    Ljava/lang/NullPointerException;
        //  198    207    194    198    LJ1/k;
        //  198    207    190    194    Landroid/os/RemoteException;
        //  198    207    186    190    Ljava/lang/NullPointerException;
        //  212    224    194    198    LJ1/k;
        //  212    224    190    194    Landroid/os/RemoteException;
        //  212    224    186    190    Ljava/lang/NullPointerException;
        //  262    321    361    365    Landroid/os/RemoteException;
        //  262    321    357    361    Lt2/c;
        //  330    354    361    365    Landroid/os/RemoteException;
        //  330    354    357    361    Lt2/c;
        //  365    374    361    365    Landroid/os/RemoteException;
        //  365    374    357    361    Lt2/c;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0074:
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

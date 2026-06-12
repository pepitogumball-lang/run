package V2;

import android.webkit.WebView;
import android.view.ViewGroup;
import android.os.BaseBundle;
import K2.B;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import android.content.SharedPreferences;
import android.os.Parcel;
import K2.k0;
import K2.e0;
import K2.B1;
import java.util.Iterator;
import android.util.SparseArray;
import K2.K;
import K2.P;
import K2.J1;
import K2.l1;
import android.content.SharedPreferences$Editor;
import K2.a0;
import O2.s;
import java.util.concurrent.ExecutionException;
import K2.w;
import w5.v;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.util.Log;
import S2.h;
import android.webkit.ValueCallback;
import C2.I;
import android.os.SystemClock;
import com.google.android.gms.dynamic.ObjectWrapper;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.ads.internal.overlay.zzm;
import org.json.JSONException;
import J1.j;
import org.json.JSONObject;
import com.google.android.gms.internal.ads.id;
import F1.q;
import com.google.android.gms.internal.ads.Z7;
import android.security.NetworkSecurityPolicy;
import android.content.Context;
import K2.m;
import K2.w0;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.measurement.internal.zzic;
import K2.G0;
import K2.s1;
import java.util.List;
import android.os.Build$VERSION;
import K2.x0;
import android.os.Bundle;
import C.u;
import com.google.android.gms.internal.measurement.S;
import K2.y0;
import K2.a1;
import m0.a;
import K2.z0;
import K2.H0;
import com.google.android.gms.internal.auth.l;
import K2.Z;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import android.os.RemoteException;
import K2.n0;
import K2.Y0;
import K2.b1;
import K2.h1;
import java.util.ArrayList;
import K2.y1;
import android.graphics.Typeface;
import C2.b;
import C2.g0;
import O2.t;
import O2.g;
import O2.c;
import O2.f;
import java.util.concurrent.Executor;
import O2.k;
import h2.A;
import O2.e;
import java.util.Objects;
import O2.i;
import O2.n;
import com.google.android.gms.internal.measurement.H;
import K2.f0;
import com.google.android.gms.internal.ads.Ak;
import E1.d;

public final class o implements Runnable
{
    public final int C;
    public Object D = d2;
    public Object E = e;
    
    public o(final f0 e, final H d, final f0 f0) {
        this.C = 12;
        this.D = d;
        this.E = e;
    }
    
    public o(final n e, final i d) {
        this.C = 26;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public o(final n e, final i d, final byte b) {
        this.C = 27;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public o(final O2.o e, final i d) {
        this.C = 28;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    public o(final O2.o e, final i d, final byte b) {
        this.C = 29;
        this.D = d;
        Objects.requireNonNull((Object)e);
        this.E = e;
    }
    
    private final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        V2/o.E:Ljava/lang/Object;
        //     4: checkcast       LK2/n0;
        //     7: astore          17
        //     9: aload           17
        //    11: getfield        K2/n0.L:LK2/k0;
        //    14: astore          9
        //    16: aload           9
        //    18: invokestatic    K2/n0.f:(LK2/x0;)V
        //    21: aload           9
        //    23: invokevirtual   K2/k0.v:()V
        //    26: new             LK2/x0;
        //    29: dup            
        //    30: aload           17
        //    32: invokespecial   K2/x0.<init>:(LK2/n0;)V
        //    35: astore          9
        //    37: aload           9
        //    39: invokevirtual   K2/x0.x:()V
        //    42: aload           17
        //    44: aload           9
        //    46: putfield        K2/n0.X:LK2/o;
        //    49: aload_0        
        //    50: getfield        V2/o.D:Ljava/lang/Object;
        //    53: checkcast       LK2/E0;
        //    56: astore          18
        //    58: aload           18
        //    60: getfield        K2/E0.f:J
        //    63: lstore_3       
        //    64: new             LK2/Z;
        //    67: dup            
        //    68: aload           17
        //    70: invokespecial   K2/Z.<init>:(LK2/n0;)V
        //    73: astore          19
        //    75: aload           19
        //    77: lconst_0       
        //    78: putfield        K2/K.Q:J
        //    81: aload           19
        //    83: aconst_null    
        //    84: putfield        K2/K.R:Ljava/lang/String;
        //    87: aload           19
        //    89: lload_3        
        //    90: putfield        K2/K.J:J
        //    93: aload           19
        //    95: invokevirtual   K2/Z.A:()V
        //    98: aload           17
        //   100: aload           19
        //   102: putfield        K2/n0.Y:LK2/K;
        //   105: new             LK2/J;
        //   108: dup            
        //   109: aload           17
        //   111: invokespecial   K2/J.<init>:(LK2/n0;)V
        //   114: astore          9
        //   116: aload           9
        //   118: invokevirtual   K2/Z.A:()V
        //   121: aload           17
        //   123: aload           9
        //   125: putfield        K2/n0.V:LK2/J;
        //   128: new             LK2/b1;
        //   131: dup            
        //   132: aload           17
        //   134: invokespecial   K2/b1.<init>:(LK2/n0;)V
        //   137: astore          9
        //   139: aload           9
        //   141: invokevirtual   K2/Z.A:()V
        //   144: aload           17
        //   146: aload           9
        //   148: putfield        K2/n0.W:LK2/b1;
        //   151: aload           17
        //   153: getfield        K2/n0.N:LK2/J1;
        //   156: astore          10
        //   158: aload           10
        //   160: getfield        K2/x0.D:Z
        //   163: ifne            4122
        //   166: aload           10
        //   168: invokevirtual   C/u.v:()V
        //   171: new             Ljava/security/SecureRandom;
        //   174: dup            
        //   175: invokespecial   java/security/SecureRandom.<init>:()V
        //   178: astore          9
        //   180: aload           9
        //   182: invokevirtual   java/util/Random.nextLong:()J
        //   185: lstore          5
        //   187: lload           5
        //   189: lstore_3       
        //   190: lload           5
        //   192: lconst_0       
        //   193: lcmp           
        //   194: ifne            230
        //   197: aload           9
        //   199: invokevirtual   java/util/Random.nextLong:()J
        //   202: lstore          5
        //   204: lload           5
        //   206: lstore_3       
        //   207: lload           5
        //   209: lconst_0       
        //   210: lcmp           
        //   211: ifne            230
        //   214: aload           10
        //   216: invokevirtual   C/u.j:()LK2/P;
        //   219: getfield        K2/P.K:LK2/S;
        //   222: ldc             "Utils falling back to Random for random id"
        //   224: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   227: lload           5
        //   229: lstore_3       
        //   230: aload           10
        //   232: getfield        K2/J1.F:Ljava/util/concurrent/atomic/AtomicLong;
        //   235: lload_3        
        //   236: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   239: aload           10
        //   241: getfield        C/u.C:Ljava/lang/Object;
        //   244: checkcast       LK2/n0;
        //   247: getfield        K2/n0.i0:Ljava/util/concurrent/atomic/AtomicInteger;
        //   250: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //   253: pop            
        //   254: aload           10
        //   256: iconst_1       
        //   257: putfield        K2/x0.D:Z
        //   260: aload           17
        //   262: getfield        K2/n0.J:LK2/a0;
        //   265: astore          16
        //   267: aload           16
        //   269: getfield        K2/x0.D:Z
        //   272: ifne            4111
        //   275: aload           16
        //   277: getfield        C/u.C:Ljava/lang/Object;
        //   280: checkcast       LK2/n0;
        //   283: getfield        K2/n0.C:Landroid/content/Context;
        //   286: ldc             "com.google.android.gms.measurement.prefs"
        //   288: iconst_0       
        //   289: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   292: astore          9
        //   294: aload           16
        //   296: aload           9
        //   298: putfield        K2/a0.E:Landroid/content/SharedPreferences;
        //   301: aload           9
        //   303: ldc             "has_been_opened"
        //   305: iconst_0       
        //   306: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   311: istore          7
        //   313: aload           16
        //   315: iload           7
        //   317: putfield        K2/a0.U:Z
        //   320: iload           7
        //   322: ifne            355
        //   325: aload           16
        //   327: getfield        K2/a0.E:Landroid/content/SharedPreferences;
        //   330: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   335: astore          9
        //   337: aload           9
        //   339: ldc             "has_been_opened"
        //   341: iconst_1       
        //   342: invokeinterface android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
        //   347: pop            
        //   348: aload           9
        //   350: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //   355: aload           16
        //   357: new             LK2/d0;
        //   360: dup            
        //   361: aload           16
        //   363: lconst_0       
        //   364: getstatic       K2/w.d:LK2/F;
        //   367: aconst_null    
        //   368: invokevirtual   K2/F.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   371: checkcast       Ljava/lang/Long;
        //   374: invokevirtual   java/lang/Long.longValue:()J
        //   377: invokestatic    java/lang/Math.max:(JJ)J
        //   380: invokespecial   K2/d0.<init>:(LK2/a0;J)V
        //   383: putfield        K2/a0.H:LK2/d0;
        //   386: aload           16
        //   388: getfield        C/u.C:Ljava/lang/Object;
        //   391: checkcast       LK2/n0;
        //   394: getfield        K2/n0.i0:Ljava/util/concurrent/atomic/AtomicInteger;
        //   397: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //   400: pop            
        //   401: aload           16
        //   403: iconst_1       
        //   404: putfield        K2/x0.D:Z
        //   407: aload           17
        //   409: getfield        K2/n0.Y:LK2/K;
        //   412: astore          20
        //   414: aload           20
        //   416: getfield        K2/Z.D:Z
        //   419: ifne            4100
        //   422: aload           20
        //   424: getfield        C/u.C:Ljava/lang/Object;
        //   427: checkcast       LK2/n0;
        //   430: astore          21
        //   432: aload           21
        //   434: getfield        K2/n0.C:Landroid/content/Context;
        //   437: astore          9
        //   439: aload           21
        //   441: getfield        K2/n0.U:Ljava/lang/String;
        //   444: astore          13
        //   446: aload           9
        //   448: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   451: astore          24
        //   453: aload           21
        //   455: getfield        K2/n0.C:Landroid/content/Context;
        //   458: astore          22
        //   460: aload           22
        //   462: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   465: astore          23
        //   467: ldc_w           ""
        //   470: astore          15
        //   472: ldc_w           "unknown"
        //   475: astore          9
        //   477: ldc_w           "Unknown"
        //   480: astore          14
        //   482: ldc_w           -2147483648
        //   485: istore_2       
        //   486: aload           23
        //   488: ifnonnull       535
        //   491: aload           20
        //   493: invokevirtual   C/u.j:()LK2/P;
        //   496: astore          12
        //   498: aload           24
        //   500: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   503: astore          11
        //   505: aload           12
        //   507: getfield        K2/P.H:LK2/S;
        //   510: ldc_w           "PackageManager is null, app identity information might be inaccurate. appId"
        //   513: aload           11
        //   515: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   518: iload_2        
        //   519: istore_1       
        //   520: aload           14
        //   522: astore          12
        //   524: aload           9
        //   526: astore          11
        //   528: aload           11
        //   530: astore          9
        //   532: goto            769
        //   535: aload           23
        //   537: aload           24
        //   539: invokevirtual   android/content/pm/PackageManager.getInstallerPackageName:(Ljava/lang/String;)Ljava/lang/String;
        //   542: astore          11
        //   544: aload           11
        //   546: astore          9
        //   548: aload           9
        //   550: astore          11
        //   552: goto            587
        //   555: astore          11
        //   557: aload           20
        //   559: invokevirtual   C/u.j:()LK2/P;
        //   562: astore          11
        //   564: aload           24
        //   566: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   569: astore          12
        //   571: aload           11
        //   573: getfield        K2/P.H:LK2/S;
        //   576: ldc_w           "Error retrieving app installer package name. appId"
        //   579: aload           12
        //   581: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   584: goto            548
        //   587: aload           11
        //   589: ifnonnull       600
        //   592: ldc_w           "manual_install"
        //   595: astore          9
        //   597: goto            620
        //   600: aload           11
        //   602: astore          9
        //   604: ldc_w           "com.android.vending"
        //   607: aload           11
        //   609: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   612: ifeq            597
        //   615: ldc_w           ""
        //   618: astore          9
        //   620: aload           23
        //   622: aload           22
        //   624: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   627: iconst_0       
        //   628: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   631: astore          25
        //   633: aload           9
        //   635: astore          11
        //   637: aload           14
        //   639: astore          12
        //   641: iload_2        
        //   642: istore_1       
        //   643: aload           25
        //   645: ifnull          528
        //   648: aload           23
        //   650: aload           25
        //   652: getfield        android/content/pm/PackageInfo.applicationInfo:Landroid/content/pm/ApplicationInfo;
        //   655: invokevirtual   android/content/pm/PackageManager.getApplicationLabel:(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
        //   658: astore          11
        //   660: aload           11
        //   662: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   665: ifne            678
        //   668: aload           11
        //   670: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   673: astore          11
        //   675: goto            683
        //   678: ldc_w           "Unknown"
        //   681: astore          11
        //   683: aload           25
        //   685: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //   688: astore          12
        //   690: aload           25
        //   692: getfield        android/content/pm/PackageInfo.versionCode:I
        //   695: istore_1       
        //   696: aload           9
        //   698: astore          11
        //   700: goto            528
        //   703: astore          14
        //   705: aload           12
        //   707: astore          14
        //   709: aload           11
        //   711: astore          12
        //   713: aload           14
        //   715: astore          11
        //   717: goto            731
        //   720: astore          11
        //   722: ldc_w           "Unknown"
        //   725: astore          12
        //   727: aload           14
        //   729: astore          11
        //   731: aload           20
        //   733: invokevirtual   C/u.j:()LK2/P;
        //   736: astore          14
        //   738: aload           24
        //   740: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   743: astore          25
        //   745: aload           14
        //   747: getfield        K2/P.H:LK2/S;
        //   750: aload           25
        //   752: aload           12
        //   754: ldc_w           "Error retrieving package info. appId, appName"
        //   757: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   760: aload           11
        //   762: astore          12
        //   764: iload_2        
        //   765: istore_1       
        //   766: goto            532
        //   769: aload           20
        //   771: aload           24
        //   773: putfield        K2/K.E:Ljava/lang/String;
        //   776: aload           20
        //   778: aload           9
        //   780: putfield        K2/K.H:Ljava/lang/String;
        //   783: aload           20
        //   785: aload           12
        //   787: putfield        K2/K.F:Ljava/lang/String;
        //   790: aload           20
        //   792: iload_1        
        //   793: putfield        K2/K.G:I
        //   796: aload           20
        //   798: lconst_0       
        //   799: putfield        K2/K.I:J
        //   802: aload           21
        //   804: getfield        K2/n0.D:Ljava/lang/String;
        //   807: astore          9
        //   809: aload           9
        //   811: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   814: ifne            836
        //   817: ldc_w           "am"
        //   820: aload           21
        //   822: getfield        K2/n0.E:Ljava/lang/String;
        //   825: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   828: ifeq            836
        //   831: iconst_1       
        //   832: istore_1       
        //   833: goto            838
        //   836: iconst_0       
        //   837: istore_1       
        //   838: aload           21
        //   840: invokevirtual   K2/n0.k:()I
        //   843: istore_2       
        //   844: iload_2        
        //   845: tableswitch {
        //                0: 1063
        //                1: 1046
        //                2: 1029
        //                3: 1012
        //                4: 995
        //                5: 978
        //                6: 961
        //                7: 944
        //                8: 927
        //          default: 896
        //        }
        //   896: aload           20
        //   898: invokevirtual   C/u.j:()LK2/P;
        //   901: getfield        K2/P.N:LK2/S;
        //   904: ldc_w           "App measurement disabled"
        //   907: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   910: aload           20
        //   912: invokevirtual   C/u.j:()LK2/P;
        //   915: getfield        K2/P.I:LK2/S;
        //   918: ldc_w           "Invalid scion state in identity"
        //   921: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   924: goto            1077
        //   927: aload           20
        //   929: invokevirtual   C/u.j:()LK2/P;
        //   932: getfield        K2/P.N:LK2/S;
        //   935: ldc_w           "App measurement disabled due to denied storage consent"
        //   938: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   941: goto            1077
        //   944: aload           20
        //   946: invokevirtual   C/u.j:()LK2/P;
        //   949: getfield        K2/P.N:LK2/S;
        //   952: ldc_w           "App measurement disabled via the global data collection setting"
        //   955: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   958: goto            1077
        //   961: aload           20
        //   963: invokevirtual   C/u.j:()LK2/P;
        //   966: getfield        K2/P.M:LK2/S;
        //   969: ldc_w           "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
        //   972: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   975: goto            1077
        //   978: aload           20
        //   980: invokevirtual   C/u.j:()LK2/P;
        //   983: getfield        K2/P.P:LK2/S;
        //   986: ldc_w           "App measurement disabled via the init parameters"
        //   989: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   992: goto            1077
        //   995: aload           20
        //   997: invokevirtual   C/u.j:()LK2/P;
        //  1000: getfield        K2/P.N:LK2/S;
        //  1003: ldc_w           "App measurement disabled via the manifest"
        //  1006: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1009: goto            1077
        //  1012: aload           20
        //  1014: invokevirtual   C/u.j:()LK2/P;
        //  1017: getfield        K2/P.N:LK2/S;
        //  1020: ldc_w           "App measurement disabled by setAnalyticsCollectionEnabled(false)"
        //  1023: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1026: goto            1077
        //  1029: aload           20
        //  1031: invokevirtual   C/u.j:()LK2/P;
        //  1034: getfield        K2/P.P:LK2/S;
        //  1037: ldc_w           "App measurement deactivated via the init parameters"
        //  1040: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1043: goto            1077
        //  1046: aload           20
        //  1048: invokevirtual   C/u.j:()LK2/P;
        //  1051: getfield        K2/P.N:LK2/S;
        //  1054: ldc_w           "App measurement deactivated via the manifest"
        //  1057: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1060: goto            1077
        //  1063: aload           20
        //  1065: invokevirtual   C/u.j:()LK2/P;
        //  1068: getfield        K2/P.P:LK2/S;
        //  1071: ldc_w           "App measurement collection enabled"
        //  1074: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1077: iload_2        
        //  1078: ifne            1086
        //  1081: iconst_1       
        //  1082: istore_2       
        //  1083: goto            1088
        //  1086: iconst_0       
        //  1087: istore_2       
        //  1088: aload           20
        //  1090: ldc_w           ""
        //  1093: putfield        K2/K.N:Ljava/lang/String;
        //  1096: aload           20
        //  1098: ldc_w           ""
        //  1101: putfield        K2/K.O:Ljava/lang/String;
        //  1104: iload_1        
        //  1105: ifeq            1115
        //  1108: aload           20
        //  1110: aload           9
        //  1112: putfield        K2/K.O:Ljava/lang/String;
        //  1115: aload           22
        //  1117: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  1120: astore          11
        //  1122: aload           13
        //  1124: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1127: ifne            1137
        //  1130: aload           13
        //  1132: astore          9
        //  1134: goto            1144
        //  1137: aload           22
        //  1139: invokestatic    K2/C0.b:(Landroid/content/Context;)Ljava/lang/String;
        //  1142: astore          9
        //  1144: aload           11
        //  1146: ldc_w           "google_app_id"
        //  1149: ldc_w           "string"
        //  1152: aload           9
        //  1154: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //  1157: istore_1       
        //  1158: iload_1        
        //  1159: ifne            1168
        //  1162: aconst_null    
        //  1163: astore          9
        //  1165: goto            1176
        //  1168: aload           11
        //  1170: iload_1        
        //  1171: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //  1174: astore          9
        //  1176: aload           9
        //  1178: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1181: ifeq            1191
        //  1184: aload           15
        //  1186: astore          11
        //  1188: goto            1195
        //  1191: aload           9
        //  1193: astore          11
        //  1195: aload           20
        //  1197: aload           11
        //  1199: putfield        K2/K.N:Ljava/lang/String;
        //  1202: aload           9
        //  1204: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1207: ifne            1282
        //  1210: aload           22
        //  1212: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  1215: astore          9
        //  1217: aload           13
        //  1219: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1222: ifne            1228
        //  1225: goto            1235
        //  1228: aload           22
        //  1230: invokestatic    K2/C0.b:(Landroid/content/Context;)Ljava/lang/String;
        //  1233: astore          13
        //  1235: aload           9
        //  1237: ldc_w           "admob_app_id"
        //  1240: ldc_w           "string"
        //  1243: aload           13
        //  1245: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //  1248: istore_1       
        //  1249: iload_1        
        //  1250: ifne            1259
        //  1253: aconst_null    
        //  1254: astore          9
        //  1256: goto            1267
        //  1259: aload           9
        //  1261: iload_1        
        //  1262: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //  1265: astore          9
        //  1267: aload           20
        //  1269: aload           9
        //  1271: putfield        K2/K.O:Ljava/lang/String;
        //  1274: goto            1282
        //  1277: astore          11
        //  1279: goto            1346
        //  1282: iload_2        
        //  1283: ifeq            1343
        //  1286: aload           20
        //  1288: invokevirtual   C/u.j:()LK2/P;
        //  1291: getfield        K2/P.P:LK2/S;
        //  1294: astore          11
        //  1296: aload           20
        //  1298: getfield        K2/K.E:Ljava/lang/String;
        //  1301: astore          12
        //  1303: aload           20
        //  1305: getfield        K2/K.N:Ljava/lang/String;
        //  1308: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1311: ifeq            1324
        //  1314: aload           20
        //  1316: getfield        K2/K.O:Ljava/lang/String;
        //  1319: astore          9
        //  1321: goto            1331
        //  1324: aload           20
        //  1326: getfield        K2/K.N:Ljava/lang/String;
        //  1329: astore          9
        //  1331: aload           11
        //  1333: aload           12
        //  1335: aload           9
        //  1337: ldc_w           "App measurement enabled for app package, google app id"
        //  1340: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1343: goto            1378
        //  1346: aload           20
        //  1348: invokevirtual   C/u.j:()LK2/P;
        //  1351: astore          9
        //  1353: aload           24
        //  1355: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //  1358: astore          12
        //  1360: aload           9
        //  1362: getfield        K2/P.H:LK2/S;
        //  1365: aload           12
        //  1367: aload           11
        //  1369: ldc_w           "Fetching Google App Id failed with exception. appId"
        //  1372: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1375: goto            1343
        //  1378: aload           20
        //  1380: aconst_null    
        //  1381: putfield        K2/K.K:Ljava/util/List;
        //  1384: aload           21
        //  1386: getfield        K2/n0.I:LK2/d;
        //  1389: astore          11
        //  1391: aload           11
        //  1393: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1396: pop            
        //  1397: ldc_w           "analytics.safelisted_events"
        //  1400: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //  1403: aload           11
        //  1405: invokevirtual   K2/d.z:()Landroid/os/Bundle;
        //  1408: astore          9
        //  1410: aload           9
        //  1412: ifnonnull       1435
        //  1415: aload           11
        //  1417: invokevirtual   C/u.j:()LK2/P;
        //  1420: getfield        K2/P.H:LK2/S;
        //  1423: ldc_w           "Failed to load metadata: Metadata bundle is null"
        //  1426: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1429: aconst_null    
        //  1430: astore          9
        //  1432: goto            1462
        //  1435: aload           9
        //  1437: ldc_w           "analytics.safelisted_events"
        //  1440: invokevirtual   android/os/BaseBundle.containsKey:(Ljava/lang/String;)Z
        //  1443: ifne            1449
        //  1446: goto            1429
        //  1449: aload           9
        //  1451: ldc_w           "analytics.safelisted_events"
        //  1454: invokevirtual   android/os/BaseBundle.getInt:(Ljava/lang/String;)I
        //  1457: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1460: astore          9
        //  1462: aload           9
        //  1464: ifnonnull       1473
        //  1467: aconst_null    
        //  1468: astore          9
        //  1470: goto            1536
        //  1473: aload           11
        //  1475: getfield        C/u.C:Ljava/lang/Object;
        //  1478: checkcast       LK2/n0;
        //  1481: getfield        K2/n0.C:Landroid/content/Context;
        //  1484: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //  1487: aload           9
        //  1489: invokevirtual   java/lang/Integer.intValue:()I
        //  1492: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //  1495: astore          9
        //  1497: aload           9
        //  1499: ifnonnull       1505
        //  1502: goto            1467
        //  1505: aload           9
        //  1507: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //  1510: astore          9
        //  1512: goto            1536
        //  1515: astore          9
        //  1517: aload           11
        //  1519: invokevirtual   C/u.j:()LK2/P;
        //  1522: getfield        K2/P.H:LK2/S;
        //  1525: ldc_w           "Failed to load string array from metadata: resource not found"
        //  1528: aload           9
        //  1530: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1533: goto            1467
        //  1536: aload           9
        //  1538: ifnull          1618
        //  1541: aload           9
        //  1543: invokeinterface java/util/List.isEmpty:()Z
        //  1548: ifeq            1568
        //  1551: aload           20
        //  1553: invokevirtual   C/u.j:()LK2/P;
        //  1556: getfield        K2/P.M:LK2/S;
        //  1559: ldc_w           "Safelisted event list is empty. Ignoring"
        //  1562: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1565: goto            1625
        //  1568: aload           9
        //  1570: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1575: astore          11
        //  1577: aload           11
        //  1579: invokeinterface java/util/Iterator.hasNext:()Z
        //  1584: ifeq            1618
        //  1587: aload           11
        //  1589: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1594: checkcast       Ljava/lang/String;
        //  1597: astore          12
        //  1599: aload           20
        //  1601: invokevirtual   C/u.u:()LK2/J1;
        //  1604: ldc_w           "safelisted event"
        //  1607: aload           12
        //  1609: invokevirtual   K2/J1.s0:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1612: ifne            1577
        //  1615: goto            1625
        //  1618: aload           20
        //  1620: aload           9
        //  1622: putfield        K2/K.K:Ljava/util/List;
        //  1625: aload           23
        //  1627: ifnull          1643
        //  1630: aload           20
        //  1632: aload           22
        //  1634: invokestatic    s2/a.h:(Landroid/content/Context;)Z
        //  1637: putfield        K2/K.M:I
        //  1640: goto            1649
        //  1643: aload           20
        //  1645: iconst_0       
        //  1646: putfield        K2/K.M:I
        //  1649: aload           21
        //  1651: getfield        K2/n0.i0:Ljava/util/concurrent/atomic/AtomicInteger;
        //  1654: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //  1657: pop            
        //  1658: aload           20
        //  1660: iconst_1       
        //  1661: putfield        K2/Z.D:Z
        //  1664: aload           17
        //  1666: getfield        K2/n0.K:LK2/P;
        //  1669: astore          14
        //  1671: aload           14
        //  1673: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1676: aload           14
        //  1678: getfield        K2/P.N:LK2/S;
        //  1681: astore          11
        //  1683: aload           11
        //  1685: ldc_w           "App measurement initialized, version"
        //  1688: ldc2_w          106000
        //  1691: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1694: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1697: aload           14
        //  1699: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1702: aload           11
        //  1704: ldc_w           "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
        //  1707: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1710: aload           19
        //  1712: invokevirtual   K2/K.C:()Ljava/lang/String;
        //  1715: astore          13
        //  1717: aload           17
        //  1719: getfield        K2/n0.D:Ljava/lang/String;
        //  1722: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1725: istore          7
        //  1727: aload           17
        //  1729: getfield        K2/n0.I:LK2/d;
        //  1732: astore          9
        //  1734: iload           7
        //  1736: ifeq            1808
        //  1739: aload           10
        //  1741: aload           13
        //  1743: aload           9
        //  1745: getfield        K2/d.E:Ljava/lang/String;
        //  1748: invokevirtual   K2/J1.w0:(Ljava/lang/String;Ljava/lang/String;)Z
        //  1751: ifeq            1770
        //  1754: aload           14
        //  1756: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1759: aload           11
        //  1761: ldc_w           "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
        //  1764: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1767: goto            1808
        //  1770: aload           14
        //  1772: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1775: new             Ljava/lang/StringBuilder;
        //  1778: dup            
        //  1779: ldc_w           "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
        //  1782: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1785: astore          12
        //  1787: aload           12
        //  1789: aload           13
        //  1791: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1794: pop            
        //  1795: aload           11
        //  1797: aload           12
        //  1799: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1802: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1805: goto            1808
        //  1808: aload           14
        //  1810: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1813: aload           14
        //  1815: getfield        K2/P.O:LK2/S;
        //  1818: ldc_w           "Debug-level message logging enabled"
        //  1821: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1824: aload           17
        //  1826: getfield        K2/n0.g0:I
        //  1829: istore_1       
        //  1830: aload           17
        //  1832: getfield        K2/n0.i0:Ljava/util/concurrent/atomic/AtomicInteger;
        //  1835: astore          11
        //  1837: iload_1        
        //  1838: aload           11
        //  1840: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //  1843: if_icmpeq       1882
        //  1846: aload           14
        //  1848: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1851: aload           17
        //  1853: getfield        K2/n0.g0:I
        //  1856: istore_2       
        //  1857: aload           11
        //  1859: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //  1862: istore_1       
        //  1863: aload           14
        //  1865: getfield        K2/P.H:LK2/S;
        //  1868: iload_2        
        //  1869: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1872: iload_1        
        //  1873: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1876: ldc_w           "Not all components initialized"
        //  1879: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //  1882: aload           17
        //  1884: iconst_1       
        //  1885: putfield        K2/n0.Z:Z
        //  1888: aload           18
        //  1890: getfield        K2/E0.g:Lcom/google/android/gms/internal/measurement/Z;
        //  1893: astore          18
        //  1895: aload           17
        //  1897: getfield        K2/n0.L:LK2/k0;
        //  1900: astore          11
        //  1902: aload           11
        //  1904: invokestatic    K2/n0.f:(LK2/x0;)V
        //  1907: aload           11
        //  1909: invokevirtual   K2/k0.v:()V
        //  1912: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  1915: aload           9
        //  1917: aconst_null    
        //  1918: getstatic       K2/w.H0:LK2/F;
        //  1921: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1924: ifeq            2018
        //  1927: aload           10
        //  1929: invokestatic    K2/n0.c:(LC/u;)V
        //  1932: aload           10
        //  1934: invokevirtual   C/u.v:()V
        //  1937: aload           10
        //  1939: invokevirtual   K2/J1.E0:()J
        //  1942: lconst_1       
        //  1943: lcmp           
        //  1944: ifne            2018
        //  1947: aload           10
        //  1949: invokevirtual   C/u.v:()V
        //  1952: new             Landroid/content/IntentFilter;
        //  1955: dup            
        //  1956: invokespecial   android/content/IntentFilter.<init>:()V
        //  1959: astore          12
        //  1961: aload           12
        //  1963: ldc_w           "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
        //  1966: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //  1969: aload           10
        //  1971: getfield        C/u.C:Ljava/lang/Object;
        //  1974: checkcast       LK2/n0;
        //  1977: astore          11
        //  1979: new             LI1/E;
        //  1982: dup            
        //  1983: iconst_2       
        //  1984: aload           11
        //  1986: iconst_0       
        //  1987: invokespecial   I1/E.<init>:(ILjava/lang/Object;Z)V
        //  1990: astore          13
        //  1992: aload           11
        //  1994: getfield        K2/n0.C:Landroid/content/Context;
        //  1997: aload           13
        //  1999: aload           12
        //  2001: invokestatic    E/h.c:(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
        //  2004: aload           10
        //  2006: invokevirtual   C/u.j:()LK2/P;
        //  2009: getfield        K2/P.O:LK2/S;
        //  2012: ldc_w           "Registered app receiver"
        //  2015: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  2018: aload           16
        //  2020: invokestatic    K2/n0.c:(LC/u;)V
        //  2023: aload           16
        //  2025: invokevirtual   K2/a0.F:()LK2/z0;
        //  2028: astore          12
        //  2030: aload           9
        //  2032: ldc_w           "google_analytics_default_allow_ad_storage"
        //  2035: iconst_0       
        //  2036: invokevirtual   K2/d.C:(Ljava/lang/String;Z)LK2/B0;
        //  2039: astore          20
        //  2041: aload           9
        //  2043: ldc_w           "google_analytics_default_allow_analytics_storage"
        //  2046: iconst_0       
        //  2047: invokevirtual   K2/d.C:(Ljava/lang/String;Z)LK2/B0;
        //  2050: astore          11
        //  2052: getstatic       K2/B0.D:LK2/B0;
        //  2055: astore          19
        //  2057: getstatic       K2/y0.E:LK2/y0;
        //  2060: astore          15
        //  2062: aload           17
        //  2064: getfield        K2/n0.j0:J
        //  2067: lstore          5
        //  2069: aload           17
        //  2071: getfield        K2/n0.R:LK2/H0;
        //  2074: astore          13
        //  2076: aload           20
        //  2078: aload           19
        //  2080: if_acmpne       2090
        //  2083: aload           11
        //  2085: aload           19
        //  2087: if_acmpeq       2093
        //  2090: goto            2096
        //  2093: goto            2168
        //  2096: bipush          -10
        //  2098: aload           16
        //  2100: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  2103: ldc_w           "consent_source"
        //  2106: bipush          100
        //  2108: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //  2113: invokestatic    K2/z0.h:(II)Z
        //  2116: ifeq            2168
        //  2119: new             Ljava/util/EnumMap;
        //  2122: dup            
        //  2123: ldc_w           LK2/y0;.class
        //  2126: invokespecial   java/util/EnumMap.<init>:(Ljava/lang/Class;)V
        //  2129: astore          21
        //  2131: aload           21
        //  2133: getstatic       K2/y0.D:LK2/y0;
        //  2136: aload           20
        //  2138: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //  2141: pop            
        //  2142: aload           21
        //  2144: aload           15
        //  2146: aload           11
        //  2148: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //  2151: pop            
        //  2152: new             LK2/z0;
        //  2155: dup            
        //  2156: aload           21
        //  2158: bipush          -10
        //  2160: invokespecial   K2/z0.<init>:(Ljava/util/EnumMap;I)V
        //  2163: astore          11
        //  2165: goto            2356
        //  2168: aload           17
        //  2170: invokevirtual   K2/n0.o:()LK2/K;
        //  2173: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  2176: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2179: ifne            2247
        //  2182: aload           12
        //  2184: getfield        K2/z0.b:I
        //  2187: istore_1       
        //  2188: iload_1        
        //  2189: ifeq            2222
        //  2192: iload_1        
        //  2193: bipush          30
        //  2195: if_icmpeq       2222
        //  2198: iload_1        
        //  2199: bipush          10
        //  2201: if_icmpeq       2222
        //  2204: iload_1        
        //  2205: bipush          30
        //  2207: if_icmpeq       2222
        //  2210: iload_1        
        //  2211: bipush          30
        //  2213: if_icmpeq       2222
        //  2216: iload_1        
        //  2217: bipush          40
        //  2219: if_icmpne       2247
        //  2222: aload           13
        //  2224: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2227: aload           13
        //  2229: new             LK2/z0;
        //  2232: dup            
        //  2233: bipush          -10
        //  2235: invokespecial   K2/z0.<init>:(I)V
        //  2238: lload           5
        //  2240: iconst_0       
        //  2241: invokevirtual   K2/H0.H:(LK2/z0;JZ)V
        //  2244: goto            2353
        //  2247: aload           17
        //  2249: invokevirtual   K2/n0.o:()LK2/K;
        //  2252: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  2255: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2258: ifeq            2353
        //  2261: aload           18
        //  2263: ifnull          2353
        //  2266: aload           18
        //  2268: getfield        com/google/android/gms/internal/measurement/Z.I:Landroid/os/Bundle;
        //  2271: astore          11
        //  2273: aload           11
        //  2275: ifnull          2353
        //  2278: bipush          30
        //  2280: aload           16
        //  2282: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  2285: ldc_w           "consent_source"
        //  2288: bipush          100
        //  2290: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //  2295: invokestatic    K2/z0.h:(II)Z
        //  2298: ifeq            2353
        //  2301: bipush          30
        //  2303: aload           11
        //  2305: invokestatic    K2/z0.b:(ILandroid/os/Bundle;)LK2/z0;
        //  2308: astore          11
        //  2310: aload           11
        //  2312: getfield        K2/z0.a:Ljava/util/EnumMap;
        //  2315: invokevirtual   java/util/EnumMap.values:()Ljava/util/Collection;
        //  2318: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //  2323: astore          20
        //  2325: aload           20
        //  2327: invokeinterface java/util/Iterator.hasNext:()Z
        //  2332: ifeq            2353
        //  2335: aload           20
        //  2337: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2342: checkcast       LK2/B0;
        //  2345: aload           19
        //  2347: if_acmpeq       2325
        //  2350: goto            2356
        //  2353: aconst_null    
        //  2354: astore          11
        //  2356: aload           11
        //  2358: ifnull          2380
        //  2361: aload           13
        //  2363: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2366: aload           13
        //  2368: aload           11
        //  2370: lload           5
        //  2372: iconst_1       
        //  2373: invokevirtual   K2/H0.H:(LK2/z0;JZ)V
        //  2376: aload           11
        //  2378: astore          12
        //  2380: aload           13
        //  2382: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2385: aload           13
        //  2387: aload           12
        //  2389: invokevirtual   K2/H0.G:(LK2/z0;)V
        //  2392: aload           16
        //  2394: invokevirtual   C/u.v:()V
        //  2397: aload           16
        //  2399: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  2402: ldc_w           "dma_consent_settings"
        //  2405: aconst_null    
        //  2406: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2411: invokestatic    K2/n.b:(Ljava/lang/String;)LK2/n;
        //  2414: getfield        K2/n.a:I
        //  2417: istore_1       
        //  2418: aload           9
        //  2420: ldc_w           "google_analytics_default_allow_ad_personalization_signals"
        //  2423: iconst_1       
        //  2424: invokevirtual   K2/d.C:(Ljava/lang/String;Z)LK2/B0;
        //  2427: astore          11
        //  2429: aload           11
        //  2431: aload           19
        //  2433: if_acmpeq       2457
        //  2436: aload           14
        //  2438: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2441: aload           14
        //  2443: getfield        K2/P.P:LK2/S;
        //  2446: ldc_w           "Default ad personalization consent from Manifest"
        //  2449: aload           11
        //  2451: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2454: goto            2457
        //  2457: aload           9
        //  2459: ldc_w           "google_analytics_default_allow_ad_user_data"
        //  2462: iconst_1       
        //  2463: invokevirtual   K2/d.C:(Ljava/lang/String;Z)LK2/B0;
        //  2466: astore          12
        //  2468: aload           13
        //  2470: getfield        C/u.C:Ljava/lang/Object;
        //  2473: checkcast       LK2/n0;
        //  2476: astore          11
        //  2478: aload           12
        //  2480: aload           19
        //  2482: if_acmpeq       2544
        //  2485: bipush          -10
        //  2487: iload_1        
        //  2488: invokestatic    K2/z0.h:(II)Z
        //  2491: ifeq            2544
        //  2494: aload           13
        //  2496: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2499: new             Ljava/util/EnumMap;
        //  2502: dup            
        //  2503: ldc_w           LK2/y0;.class
        //  2506: invokespecial   java/util/EnumMap.<init>:(Ljava/lang/Class;)V
        //  2509: astore          18
        //  2511: aload           18
        //  2513: getstatic       K2/y0.F:LK2/y0;
        //  2516: aload           12
        //  2518: invokevirtual   java/util/EnumMap.put:(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;
        //  2521: pop            
        //  2522: aload           13
        //  2524: new             LK2/n;
        //  2527: dup            
        //  2528: aload           18
        //  2530: bipush          -10
        //  2532: aconst_null    
        //  2533: aconst_null    
        //  2534: invokespecial   K2/n.<init>:(Ljava/util/EnumMap;ILjava/lang/Boolean;Ljava/lang/String;)V
        //  2537: iconst_1       
        //  2538: invokevirtual   K2/H0.F:(LK2/n;Z)V
        //  2541: goto            2792
        //  2544: aload           17
        //  2546: invokevirtual   K2/n0.o:()LK2/K;
        //  2549: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  2552: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2555: ifne            2594
        //  2558: iload_1        
        //  2559: ifeq            2568
        //  2562: iload_1        
        //  2563: bipush          30
        //  2565: if_icmpne       2594
        //  2568: aload           13
        //  2570: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2573: aload           13
        //  2575: new             LK2/n;
        //  2578: dup            
        //  2579: aconst_null    
        //  2580: bipush          -10
        //  2582: aconst_null    
        //  2583: aconst_null    
        //  2584: invokespecial   K2/n.<init>:(Ljava/lang/Boolean;ILjava/lang/Boolean;Ljava/lang/String;)V
        //  2587: iconst_1       
        //  2588: invokevirtual   K2/H0.F:(LK2/n;Z)V
        //  2591: goto            2541
        //  2594: aload           17
        //  2596: invokevirtual   K2/n0.o:()LK2/K;
        //  2599: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  2602: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2605: ifeq            2696
        //  2608: aload           18
        //  2610: ifnull          2696
        //  2613: aload           18
        //  2615: getfield        com/google/android/gms/internal/measurement/Z.I:Landroid/os/Bundle;
        //  2618: astore          12
        //  2620: aload           12
        //  2622: ifnull          2696
        //  2625: bipush          30
        //  2627: iload_1        
        //  2628: invokestatic    K2/z0.h:(II)Z
        //  2631: ifeq            2696
        //  2634: bipush          30
        //  2636: aload           12
        //  2638: invokestatic    K2/n.a:(ILandroid/os/Bundle;)LK2/n;
        //  2641: astore          12
        //  2643: aload           12
        //  2645: getfield        K2/n.e:Ljava/util/EnumMap;
        //  2648: invokevirtual   java/util/EnumMap.values:()Ljava/util/Collection;
        //  2651: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //  2656: astore          20
        //  2658: aload           20
        //  2660: invokeinterface java/util/Iterator.hasNext:()Z
        //  2665: ifeq            2696
        //  2668: aload           20
        //  2670: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2675: checkcast       LK2/B0;
        //  2678: aload           19
        //  2680: if_acmpeq       2658
        //  2683: aload           13
        //  2685: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2688: aload           13
        //  2690: aload           12
        //  2692: iconst_1       
        //  2693: invokevirtual   K2/H0.F:(LK2/n;Z)V
        //  2696: aload           17
        //  2698: invokevirtual   K2/n0.o:()LK2/K;
        //  2701: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  2704: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2707: ifeq            2541
        //  2710: aload           18
        //  2712: ifnull          2541
        //  2715: aload           18
        //  2717: getfield        com/google/android/gms/internal/measurement/Z.I:Landroid/os/Bundle;
        //  2720: astore          12
        //  2722: aload           12
        //  2724: ifnull          2541
        //  2727: aload           16
        //  2729: getfield        K2/a0.P:LK2/c0;
        //  2732: invokevirtual   K2/c0.h:()Ljava/lang/String;
        //  2735: ifnonnull       2541
        //  2738: aload           12
        //  2740: invokestatic    K2/n.c:(Landroid/os/Bundle;)Ljava/lang/Boolean;
        //  2743: astore          12
        //  2745: aload           12
        //  2747: ifnull          2541
        //  2750: aload           13
        //  2752: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2755: aload           12
        //  2757: invokevirtual   java/lang/Boolean.toString:()Ljava/lang/String;
        //  2760: astore          12
        //  2762: aload           11
        //  2764: getfield        K2/n0.P:Lq2/a;
        //  2767: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2770: pop            
        //  2771: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2774: lstore_3       
        //  2775: aload           13
        //  2777: aload           18
        //  2779: getfield        com/google/android/gms/internal/measurement/Z.G:Ljava/lang/String;
        //  2782: ldc_w           "allow_personalized_ads"
        //  2785: aload           12
        //  2787: iconst_0       
        //  2788: lload_3        
        //  2789: invokevirtual   K2/H0.P:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
        //  2792: aload           9
        //  2794: ldc_w           "google_analytics_tcf_data_enabled"
        //  2797: invokevirtual   K2/d.E:(Ljava/lang/String;)Ljava/lang/Boolean;
        //  2800: astore          12
        //  2802: aload           12
        //  2804: ifnonnull       2813
        //  2807: iconst_1       
        //  2808: istore          7
        //  2810: goto            2820
        //  2813: aload           12
        //  2815: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  2818: istore          7
        //  2820: iload           7
        //  2822: ifeq            2941
        //  2825: aload           14
        //  2827: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2830: aload           14
        //  2832: getfield        K2/P.O:LK2/S;
        //  2835: ldc_w           "TCF client enabled."
        //  2838: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  2841: aload           13
        //  2843: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2846: aload           13
        //  2848: invokevirtual   K2/B.v:()V
        //  2851: aload           13
        //  2853: invokevirtual   C/u.j:()LK2/P;
        //  2856: getfield        K2/P.O:LK2/S;
        //  2859: ldc_w           "Register tcfPrefChangeListener."
        //  2862: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  2865: aload           13
        //  2867: getfield        K2/H0.V:LK2/M0;
        //  2870: ifnonnull       2913
        //  2873: aload           13
        //  2875: new             LK2/O0;
        //  2878: dup            
        //  2879: aload           13
        //  2881: aload           11
        //  2883: iconst_1       
        //  2884: invokespecial   K2/O0.<init>:(LK2/H0;LK2/w0;I)V
        //  2887: putfield        K2/H0.W:LK2/O0;
        //  2890: new             Ljava/lang/Object;
        //  2893: dup            
        //  2894: invokespecial   java/lang/Object.<init>:()V
        //  2897: astore          11
        //  2899: aload           11
        //  2901: aload           13
        //  2903: putfield        K2/M0.a:LK2/H0;
        //  2906: aload           13
        //  2908: aload           11
        //  2910: putfield        K2/H0.V:LK2/M0;
        //  2913: aload           13
        //  2915: invokevirtual   C/u.t:()LK2/a0;
        //  2918: invokevirtual   K2/a0.C:()Landroid/content/SharedPreferences;
        //  2921: aload           13
        //  2923: getfield        K2/H0.V:LK2/M0;
        //  2926: invokeinterface android/content/SharedPreferences.registerOnSharedPreferenceChangeListener:(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
        //  2931: aload           13
        //  2933: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2936: aload           13
        //  2938: invokevirtual   K2/H0.U:()V
        //  2941: aload           16
        //  2943: getfield        K2/a0.I:LK2/b0;
        //  2946: astore          18
        //  2948: aload           18
        //  2950: invokevirtual   K2/b0.a:()J
        //  2953: lconst_0       
        //  2954: lcmp           
        //  2955: ifne            2986
        //  2958: aload           14
        //  2960: invokestatic    K2/n0.f:(LK2/x0;)V
        //  2963: aload           14
        //  2965: getfield        K2/P.P:LK2/S;
        //  2968: ldc_w           "Persisting first open"
        //  2971: lload           5
        //  2973: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2976: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2979: aload           18
        //  2981: lload           5
        //  2983: invokevirtual   K2/b0.b:(J)V
        //  2986: aload           13
        //  2988: invokestatic    K2/n0.e:(LK2/Z;)V
        //  2991: aload           13
        //  2993: getfield        K2/H0.S:LK2/e0;
        //  2996: astore          11
        //  2998: aload           11
        //  3000: invokevirtual   K2/e0.c:()Z
        //  3003: ifeq            3038
        //  3006: aload           11
        //  3008: invokevirtual   K2/e0.d:()Z
        //  3011: ifeq            3038
        //  3014: aload           11
        //  3016: getfield        K2/e0.a:LK2/n0;
        //  3019: getfield        K2/n0.J:LK2/a0;
        //  3022: astore          11
        //  3024: aload           11
        //  3026: invokestatic    K2/n0.c:(LC/u;)V
        //  3029: aload           11
        //  3031: getfield        K2/a0.Z:LK2/c0;
        //  3034: aconst_null    
        //  3035: invokevirtual   K2/c0.i:(Ljava/lang/String;)V
        //  3038: aload           17
        //  3040: invokevirtual   K2/n0.i:()Z
        //  3043: ifne            3233
        //  3046: aload           17
        //  3048: invokevirtual   K2/n0.g:()Z
        //  3051: ifeq            3222
        //  3054: aload           10
        //  3056: invokestatic    K2/n0.c:(LC/u;)V
        //  3059: aload           10
        //  3061: ldc_w           "android.permission.INTERNET"
        //  3064: invokevirtual   K2/J1.x0:(Ljava/lang/String;)Z
        //  3067: ifne            3086
        //  3070: aload           14
        //  3072: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3075: aload           14
        //  3077: getfield        K2/P.H:LK2/S;
        //  3080: ldc_w           "App is missing INTERNET permission"
        //  3083: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3086: aload           10
        //  3088: ldc_w           "android.permission.ACCESS_NETWORK_STATE"
        //  3091: invokevirtual   K2/J1.x0:(Ljava/lang/String;)Z
        //  3094: ifne            3113
        //  3097: aload           14
        //  3099: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3102: aload           14
        //  3104: getfield        K2/P.H:LK2/S;
        //  3107: ldc_w           "App is missing ACCESS_NETWORK_STATE permission"
        //  3110: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3113: aload           17
        //  3115: getfield        K2/n0.C:Landroid/content/Context;
        //  3118: astore          11
        //  3120: aload           11
        //  3122: invokestatic    s2/b.a:(Landroid/content/Context;)LR4/b;
        //  3125: invokevirtual   R4/b.d:()Z
        //  3128: ifne            3187
        //  3131: aload           9
        //  3133: invokevirtual   K2/d.J:()Z
        //  3136: ifne            3187
        //  3139: aload           11
        //  3141: invokestatic    K2/J1.c0:(Landroid/content/Context;)Z
        //  3144: ifne            3163
        //  3147: aload           14
        //  3149: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3152: aload           14
        //  3154: getfield        K2/P.H:LK2/S;
        //  3157: ldc_w           "AppMeasurementReceiver not registered/enabled"
        //  3160: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3163: aload           11
        //  3165: invokestatic    K2/J1.u0:(Landroid/content/Context;)Z
        //  3168: ifne            3187
        //  3171: aload           14
        //  3173: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3176: aload           14
        //  3178: getfield        K2/P.H:LK2/S;
        //  3181: ldc_w           "AppMeasurementService not registered/enabled"
        //  3184: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3187: aload           14
        //  3189: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3192: aload           14
        //  3194: getfield        K2/P.H:LK2/S;
        //  3197: ldc_w           "Uploading is not possible. App measurement disabled"
        //  3200: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3203: aload           10
        //  3205: astore          11
        //  3207: aload           9
        //  3209: astore          11
        //  3211: aload           9
        //  3213: astore          11
        //  3215: aload           10
        //  3217: astore          11
        //  3219: goto            4010
        //  3222: aload           9
        //  3224: astore          11
        //  3226: aload           10
        //  3228: astore          11
        //  3230: goto            3211
        //  3233: aload           17
        //  3235: invokevirtual   K2/n0.o:()LK2/K;
        //  3238: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  3241: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3244: istore          7
        //  3246: aload           16
        //  3248: getfield        K2/a0.J:LK2/c0;
        //  3251: astore          12
        //  3253: iload           7
        //  3255: ifeq            3287
        //  3258: aload           17
        //  3260: invokevirtual   K2/n0.o:()LK2/K;
        //  3263: astore          11
        //  3265: aload           11
        //  3267: invokevirtual   K2/Z.z:()V
        //  3270: aload           11
        //  3272: getfield        K2/K.O:Ljava/lang/String;
        //  3275: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3278: ifne            3284
        //  3281: goto            3287
        //  3284: goto            3652
        //  3287: aload           17
        //  3289: invokevirtual   K2/n0.s:()V
        //  3292: aload           17
        //  3294: invokevirtual   K2/n0.o:()LK2/K;
        //  3297: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  3300: astore          19
        //  3302: aload           16
        //  3304: invokevirtual   C/u.v:()V
        //  3307: aload           16
        //  3309: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3312: ldc_w           "gmp_app_id"
        //  3315: aconst_null    
        //  3316: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3321: astore          11
        //  3323: aload           17
        //  3325: invokevirtual   K2/n0.o:()LK2/K;
        //  3328: astore          20
        //  3330: aload           20
        //  3332: invokevirtual   K2/Z.z:()V
        //  3335: aload           20
        //  3337: getfield        K2/K.O:Ljava/lang/String;
        //  3340: astore          20
        //  3342: aload           16
        //  3344: invokevirtual   C/u.v:()V
        //  3347: aload           19
        //  3349: aload           11
        //  3351: aload           20
        //  3353: aload           16
        //  3355: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3358: ldc_w           "admob_app_id"
        //  3361: aconst_null    
        //  3362: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3367: invokestatic    K2/J1.i0:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
        //  3370: ifeq            3549
        //  3373: aload           14
        //  3375: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3378: aload           14
        //  3380: getfield        K2/P.N:LK2/S;
        //  3383: ldc_w           "Rechecking which service to use due to a GMP App Id change"
        //  3386: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3389: aload           16
        //  3391: invokevirtual   C/u.v:()V
        //  3394: aload           16
        //  3396: invokevirtual   C/u.v:()V
        //  3399: aload           16
        //  3401: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3404: ldc_w           "measurement_enabled"
        //  3407: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //  3412: ifeq            3437
        //  3415: aload           16
        //  3417: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3420: ldc_w           "measurement_enabled"
        //  3423: iconst_1       
        //  3424: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //  3429: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3432: astore          11
        //  3434: goto            3440
        //  3437: aconst_null    
        //  3438: astore          11
        //  3440: aload           16
        //  3442: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3445: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  3450: astore          19
        //  3452: aload           19
        //  3454: invokeinterface android/content/SharedPreferences$Editor.clear:()Landroid/content/SharedPreferences$Editor;
        //  3459: pop            
        //  3460: aload           19
        //  3462: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //  3467: aload           11
        //  3469: ifnull          3512
        //  3472: aload           16
        //  3474: invokevirtual   C/u.v:()V
        //  3477: aload           16
        //  3479: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3482: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  3487: astore          19
        //  3489: aload           19
        //  3491: ldc_w           "measurement_enabled"
        //  3494: aload           11
        //  3496: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3499: invokeinterface android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
        //  3504: pop            
        //  3505: aload           19
        //  3507: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //  3512: aload           17
        //  3514: invokevirtual   K2/n0.p:()LK2/J;
        //  3517: invokevirtual   K2/J.E:()V
        //  3520: aload           17
        //  3522: getfield        K2/n0.W:LK2/b1;
        //  3525: invokevirtual   K2/b1.I:()V
        //  3528: aload           17
        //  3530: getfield        K2/n0.W:LK2/b1;
        //  3533: invokevirtual   K2/b1.H:()V
        //  3536: aload           18
        //  3538: lload           5
        //  3540: invokevirtual   K2/b0.b:(J)V
        //  3543: aload           12
        //  3545: aconst_null    
        //  3546: invokevirtual   K2/c0.i:(Ljava/lang/String;)V
        //  3549: aload           17
        //  3551: invokevirtual   K2/n0.o:()LK2/K;
        //  3554: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  3557: astore          18
        //  3559: aload           16
        //  3561: invokevirtual   C/u.v:()V
        //  3564: aload           16
        //  3566: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3569: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  3574: astore          11
        //  3576: aload           11
        //  3578: ldc_w           "gmp_app_id"
        //  3581: aload           18
        //  3583: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  3588: pop            
        //  3589: aload           11
        //  3591: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //  3596: aload           17
        //  3598: invokevirtual   K2/n0.o:()LK2/K;
        //  3601: astore          11
        //  3603: aload           11
        //  3605: invokevirtual   K2/Z.z:()V
        //  3608: aload           11
        //  3610: getfield        K2/K.O:Ljava/lang/String;
        //  3613: astore          11
        //  3615: aload           16
        //  3617: invokevirtual   C/u.v:()V
        //  3620: aload           16
        //  3622: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  3625: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //  3630: astore          18
        //  3632: aload           18
        //  3634: ldc_w           "admob_app_id"
        //  3637: aload           11
        //  3639: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //  3644: pop            
        //  3645: aload           18
        //  3647: invokeinterface android/content/SharedPreferences$Editor.apply:()V
        //  3652: aload           16
        //  3654: invokevirtual   K2/a0.F:()LK2/z0;
        //  3657: aload           15
        //  3659: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  3662: ifne            3671
        //  3665: aload           12
        //  3667: aconst_null    
        //  3668: invokevirtual   K2/c0.i:(Ljava/lang/String;)V
        //  3671: aload           13
        //  3673: invokestatic    K2/n0.e:(LK2/Z;)V
        //  3676: aload           13
        //  3678: aload           12
        //  3680: invokevirtual   K2/c0.h:()Ljava/lang/String;
        //  3683: invokevirtual   K2/H0.Y:(Ljava/lang/String;)V
        //  3686: aload           10
        //  3688: invokestatic    K2/n0.c:(LC/u;)V
        //  3691: aload           10
        //  3693: astore          11
        //  3695: aload           11
        //  3697: getfield        C/u.C:Ljava/lang/Object;
        //  3700: checkcast       LK2/n0;
        //  3703: getfield        K2/n0.C:Landroid/content/Context;
        //  3706: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //  3709: ldc_w           "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
        //  3712: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //  3715: pop            
        //  3716: iconst_1       
        //  3717: istore_1       
        //  3718: goto            3725
        //  3721: astore          11
        //  3723: iconst_0       
        //  3724: istore_1       
        //  3725: iload_1        
        //  3726: ifne            3769
        //  3729: aload           16
        //  3731: getfield        K2/a0.Y:LK2/c0;
        //  3734: astore          11
        //  3736: aload           11
        //  3738: invokevirtual   K2/c0.h:()Ljava/lang/String;
        //  3741: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3744: ifne            3769
        //  3747: aload           14
        //  3749: invokestatic    K2/n0.f:(LK2/x0;)V
        //  3752: aload           14
        //  3754: getfield        K2/P.K:LK2/S;
        //  3757: ldc_w           "Remote config removed with active feature rollouts"
        //  3760: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  3763: aload           11
        //  3765: aconst_null    
        //  3766: invokevirtual   K2/c0.i:(Ljava/lang/String;)V
        //  3769: aload           17
        //  3771: invokevirtual   K2/n0.o:()LK2/K;
        //  3774: invokevirtual   K2/K.D:()Ljava/lang/String;
        //  3777: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3780: ifeq            3816
        //  3783: aload           17
        //  3785: invokevirtual   K2/n0.o:()LK2/K;
        //  3788: astore          11
        //  3790: aload           11
        //  3792: invokevirtual   K2/Z.z:()V
        //  3795: aload           11
        //  3797: getfield        K2/K.O:Ljava/lang/String;
        //  3800: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3803: ifne            3809
        //  3806: goto            3816
        //  3809: aload           9
        //  3811: astore          11
        //  3813: goto            3211
        //  3816: aload           17
        //  3818: invokevirtual   K2/n0.g:()Z
        //  3821: istore          8
        //  3823: aload           16
        //  3825: getfield        K2/a0.E:Landroid/content/SharedPreferences;
        //  3828: astore          11
        //  3830: aload           11
        //  3832: ifnonnull       3841
        //  3835: iconst_0       
        //  3836: istore          7
        //  3838: goto            3853
        //  3841: aload           11
        //  3843: ldc_w           "deferred_analytics_collection"
        //  3846: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //  3851: istore          7
        //  3853: iload           7
        //  3855: ifne            3904
        //  3858: aload           9
        //  3860: ldc_w           "firebase_analytics_collection_deactivated"
        //  3863: invokevirtual   K2/d.E:(Ljava/lang/String;)Ljava/lang/Boolean;
        //  3866: astore          11
        //  3868: aload           11
        //  3870: ifnull          3886
        //  3873: aload           11
        //  3875: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3878: ifeq            3886
        //  3881: iconst_1       
        //  3882: istore_1       
        //  3883: goto            3888
        //  3886: iconst_0       
        //  3887: istore_1       
        //  3888: iload_1        
        //  3889: ifne            3904
        //  3892: aload           16
        //  3894: iload           8
        //  3896: iconst_1       
        //  3897: ixor           
        //  3898: invokevirtual   K2/a0.B:(Z)V
        //  3901: goto            3904
        //  3904: aload           9
        //  3906: astore          11
        //  3908: iload           8
        //  3910: ifeq            3923
        //  3913: aload           13
        //  3915: invokestatic    K2/n0.e:(LK2/Z;)V
        //  3918: aload           13
        //  3920: invokevirtual   K2/H0.R:()V
        //  3923: aload           17
        //  3925: getfield        K2/n0.M:LK2/l1;
        //  3928: astore          11
        //  3930: aload           11
        //  3932: invokestatic    K2/n0.e:(LK2/Z;)V
        //  3935: aload           11
        //  3937: getfield        K2/l1.G:Lb1/f;
        //  3940: invokevirtual   b1/f.p:()V
        //  3943: aload           17
        //  3945: invokevirtual   K2/n0.r:()LK2/b1;
        //  3948: new             Ljava/util/concurrent/atomic/AtomicReference;
        //  3951: dup            
        //  3952: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:()V
        //  3955: invokevirtual   K2/b1.F:(Ljava/util/concurrent/atomic/AtomicReference;)V
        //  3958: aload           17
        //  3960: invokevirtual   K2/n0.r:()LK2/b1;
        //  3963: astore          11
        //  3965: aload           16
        //  3967: getfield        K2/a0.b0:LL3/A;
        //  3970: invokevirtual   L3/A.j:()Landroid/os/Bundle;
        //  3973: astore          12
        //  3975: aload           11
        //  3977: invokevirtual   K2/B.v:()V
        //  3980: aload           11
        //  3982: invokevirtual   K2/Z.z:()V
        //  3985: aload           11
        //  3987: new             LC2/v;
        //  3990: dup            
        //  3991: aload           11
        //  3993: aload           11
        //  3995: iconst_0       
        //  3996: invokevirtual   K2/b1.O:(Z)LK2/B1;
        //  3999: aload           12
        //  4001: bipush          10
        //  4003: iconst_0       
        //  4004: invokespecial   C2/v.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
        //  4007: invokevirtual   K2/b1.E:(Ljava/lang/Runnable;)V
        //  4010: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  4013: aload           9
        //  4015: aconst_null    
        //  4016: getstatic       K2/w.H0:LK2/F;
        //  4019: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  4022: ifeq            4090
        //  4025: aload           10
        //  4027: invokestatic    K2/n0.c:(LC/u;)V
        //  4030: aload           10
        //  4032: invokevirtual   C/u.v:()V
        //  4035: aload           10
        //  4037: invokevirtual   K2/J1.E0:()J
        //  4040: lconst_1       
        //  4041: lcmp           
        //  4042: ifne            4050
        //  4045: iconst_1       
        //  4046: istore_1       
        //  4047: goto            4052
        //  4050: iconst_0       
        //  4051: istore_1       
        //  4052: iload_1        
        //  4053: ifeq            4090
        //  4056: aload           13
        //  4058: invokestatic    K2/n0.e:(LK2/Z;)V
        //  4061: new             LK2/q0;
        //  4064: dup            
        //  4065: iconst_0       
        //  4066: invokespecial   K2/q0.<init>:(I)V
        //  4069: astore          9
        //  4071: aload           9
        //  4073: aload           13
        //  4075: putfield        K2/q0.D:LK2/H0;
        //  4078: new             Ljava/lang/Thread;
        //  4081: dup            
        //  4082: aload           9
        //  4084: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //  4087: invokevirtual   java/lang/Thread.start:()V
        //  4090: aload           16
        //  4092: getfield        K2/a0.R:LK2/Y;
        //  4095: iconst_1       
        //  4096: invokevirtual   K2/Y.a:(Z)V
        //  4099: return         
        //  4100: new             Ljava/lang/IllegalStateException;
        //  4103: dup            
        //  4104: ldc_w           "Can't initialize twice"
        //  4107: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  4110: athrow         
        //  4111: new             Ljava/lang/IllegalStateException;
        //  4114: dup            
        //  4115: ldc_w           "Can't initialize twice"
        //  4118: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  4121: athrow         
        //  4122: new             Ljava/lang/IllegalStateException;
        //  4125: dup            
        //  4126: ldc_w           "Can't initialize twice"
        //  4129: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  4132: athrow         
        //  4133: astore          12
        //  4135: aload           11
        //  4137: astore          12
        //  4139: aload           14
        //  4141: astore          11
        //  4143: goto            731
        //  4146: astore          9
        //  4148: goto            1162
        //  4151: astore          9
        //  4153: goto            1253
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  535    544    555    587    Ljava/lang/IllegalArgumentException;
        //  620    633    720    731    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  648    675    720    731    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  683    690    4133   4146   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  690    696    703    720    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1115   1130   1277   1282   Ljava/lang/IllegalStateException;
        //  1137   1144   1277   1282   Ljava/lang/IllegalStateException;
        //  1144   1158   1277   1282   Ljava/lang/IllegalStateException;
        //  1168   1176   4146   4151   Landroid/content/res/Resources$NotFoundException;
        //  1168   1176   1277   1282   Ljava/lang/IllegalStateException;
        //  1176   1184   1277   1282   Ljava/lang/IllegalStateException;
        //  1195   1225   1277   1282   Ljava/lang/IllegalStateException;
        //  1228   1235   1277   1282   Ljava/lang/IllegalStateException;
        //  1235   1249   1277   1282   Ljava/lang/IllegalStateException;
        //  1259   1267   4151   4156   Landroid/content/res/Resources$NotFoundException;
        //  1259   1267   1277   1282   Ljava/lang/IllegalStateException;
        //  1267   1274   1277   1282   Ljava/lang/IllegalStateException;
        //  1286   1321   1277   1282   Ljava/lang/IllegalStateException;
        //  1324   1331   1277   1282   Ljava/lang/IllegalStateException;
        //  1331   1343   1277   1282   Ljava/lang/IllegalStateException;
        //  1473   1497   1515   1536   Landroid/content/res/Resources$NotFoundException;
        //  1505   1512   1515   1536   Landroid/content/res/Resources$NotFoundException;
        //  3695   3716   3721   3725   Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 1697 out of bounds for length 1697
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
    
    public final void run() {
        switch (this.C) {
            default: {
                final O2.o o = (O2.o)this.E;
                final Object e;
                monitorenter(e = o.E);
                Label_0207: {
                    try {
                        final e e2 = (e)o.F;
                        if (e2 != null) {
                            final Exception f = ((i)this.D).f();
                            A.h((Object)f);
                            e2.f(f);
                        }
                        break Label_0207;
                    }
                    finally {
                        monitorexit(e);
                        monitorexit(e);
                    }
                }
            }
            case 28: {
                final O2.o o2 = (O2.o)this.E;
                final Object e3;
                monitorenter(e3 = o2.E);
                Label_0276: {
                    try {
                        final O2.d d = (O2.d)o2.F;
                        if (d != null) {
                            d.l((i)this.D);
                        }
                        break Label_0276;
                    }
                    finally {
                        monitorexit(e3);
                        monitorexit(e3);
                    }
                }
            }
            case 27: {
                final n n = (n)this.E;
                Label_0388: {
                    try {
                        final i i = (i)n.E.d((i)this.D);
                        if (i == null) {
                            n.f((Exception)new NullPointerException("Continuation returned null"));
                        }
                        else {
                            final s b = k.b;
                            i.d((Executor)b, (f)n);
                            i.c((Executor)b, (e)n);
                            i.a((Executor)b, n);
                        }
                    }
                    catch (final Exception ex) {
                        break Label_0388;
                    }
                    catch (final g g) {
                        if (((Throwable)g).getCause() instanceof Exception) {
                            n.F.q((Exception)((Throwable)g).getCause());
                            return;
                        }
                        n.F.q((Exception)g);
                        final Exception ex;
                        n.F.q(ex);
                    }
                }
                return;
            }
            case 26: {
                final i j = (i)this.D;
                if (((t)j).d) {
                    ((n)this.E).F.r();
                }
                else {
                    Label_0529: {
                        try {
                            ((n)this.E).F.o(((n)this.E).E.d(j));
                        }
                        catch (final Exception ex2) {
                            break Label_0529;
                        }
                        catch (final g g2) {
                            if (((Throwable)g2).getCause() instanceof Exception) {
                                ((n)this.E).F.q((Exception)((Throwable)g2).getCause());
                                return;
                            }
                            ((n)this.E).F.q((Exception)g2);
                            final Exception ex2;
                            ((n)this.E).F.q(ex2);
                        }
                    }
                }
                return;
            }
            case 25: {
                ((L.d)this.D).accept(this.E);
                return;
            }
            case 24: {
                final g0 g3 = (g0)((b)this.D).D;
                if (g3 != null) {
                    g3.b((Typeface)this.E);
                }
                return;
            }
            case 23: {
                final y1 y1 = (y1)this.D;
                y1.e0();
                y1.l().v();
                if (y1.R == null) {
                    y1.R = new ArrayList();
                }
                y1.R.add((Object)this.E);
                y1.g0();
                return;
            }
            case 22: {
                final b1 e4 = ((h1)this.E).E;
                ((B)e4).v();
                if (e4.F != null) {
                    e4.F = null;
                    ((u)e4).j().P.g("Disconnected from device MeasurementService", (Object)this.D);
                    ((B)e4).v();
                    e4.H();
                }
                return;
            }
            case 21: {
                final b1 b2 = (b1)this.E;
                final K2.H f2 = b2.F;
                if (f2 == null) {
                    ((u)b2).j().H.f("Failed to send current screen to service");
                }
                else {
                    Label_0909: {
                        Label_0901: {
                            Y0 y2;
                            try {
                                y2 = (Y0)this.D;
                                if (y2 == null) {
                                    f2.x4(0L, (String)null, (String)null, ((n0)((u)b2).C).C.getPackageName());
                                    break Label_0901;
                                }
                            }
                            catch (final RemoteException ex3) {
                                break Label_0909;
                            }
                            f2.x4(y2.c, y2.a, y2.b, ((n0)((u)b2).C).C.getPackageName());
                        }
                        b2.N();
                        return;
                    }
                    final RemoteException ex3;
                    ((u)b2).j().H.g("Failed to send current screen to the service", (Object)ex3);
                }
                return;
            }
            case 20: {
                final H0 r = ((AppMeasurementDynamiteService)this.E).C.R;
                n0.e((Z)r);
                final l f3 = (l)this.D;
                ((B)r).v();
                ((Z)r).z();
                final l f4 = r.F;
                if (f3 != f4) {
                    A.j("EventInterceptor already set.", f4 == null);
                }
                r.F = f3;
                return;
            }
            case 19: {
                final H0 h0 = (H0)this.E;
                final a0 t = ((u)h0).t();
                ((u)t).v();
                ((u)t).v();
                final K2.n b3 = K2.n.b(t.D().getString("dma_consent_settings", (String)null));
                final K2.n n2 = (K2.n)this.D;
                final int a = b3.a;
                final int a2 = n2.a;
                if (z0.h(a2, a)) {
                    final SharedPreferences$Editor edit = t.D().edit();
                    edit.putString("dma_consent_settings", n2.b);
                    edit.apply();
                    ((u)h0).j().P.g("Setting DMA consent(FE)", (Object)n2);
                    final n0 n3 = (n0)((u)h0).C;
                    final b1 e5 = m0.a.e(n3);
                    if (e5.L()) {
                        if (((u)e5).u().z0() < 241200) {
                            n3.r().G(false);
                            return;
                        }
                    }
                    final b1 e6 = m0.a.e(n3);
                    final a1 a3 = new a1(1);
                    (a3.D = e6).E((Runnable)a3);
                }
                else {
                    ((u)h0).j().N.g("Lower precedence consent source ignored, proposed source", (Object)a2);
                }
                return;
            }
            case 18: {
                ((H0)this.E).L((Boolean)this.D, true);
                return;
            }
            case 17: {
                final H0 h2 = (H0)this.E;
                final l1 y3 = ((B)h2).y();
                Long value = null;
                Label_1378: {
                    if (!((u)y3).t().F().i(y0.E)) {
                        ((u)y3).j().M.f("Analytics storage consent denied; will not get session id");
                    }
                    else {
                        final a0 t2 = ((u)y3).t();
                        ((n0)((u)y3).C).P.getClass();
                        if (!t2.A(System.currentTimeMillis())) {
                            if (((u)y3).t().T.a() != 0L) {
                                value = ((u)y3).t().T.a();
                                break Label_1378;
                            }
                        }
                    }
                    value = null;
                }
                final n0 n4 = (n0)((u)h2).C;
                final S s = (S)this.D;
                if (value != null) {
                    final J1 n5 = n4.N;
                    n0.c((u)n5);
                    n5.T(s, (long)value);
                }
                else {
                    try {
                        s.a0((Bundle)null);
                    }
                    catch (final RemoteException ex4) {
                        final P k = n4.K;
                        n0.f((x0)k);
                        k.H.g("getSessionId failed with exception", (Object)ex4);
                    }
                }
                return;
            }
            case 16: {
                final n0 n6 = (n0)((u)this.D).C;
                final K o3 = n6.o();
                final String r2 = o3.R;
                final String r3 = (String)this.E;
                final boolean b4 = r2 != null && !r2.equals((Object)r3);
                o3.R = r3;
                if (b4) {
                    n6.o().E();
                }
                return;
            }
            case 15: {
                final H0 h3 = (H0)this.D;
                ((B)h3).v();
                if (Build$VERSION.SDK_INT >= 30) {
                    final SparseArray e7 = ((u)h3).t().E();
                    for (final s1 s2 : (List)this.E) {
                        if (!G0.o(e7, s2.E) || (long)e7.get(s2.E) < s2.D) {
                            h3.Q().add((Object)s2);
                        }
                    }
                    h3.V();
                }
                return;
            }
            case 14: {
                final zzic zzic = (zzic)this.E;
                zzic.C.e0();
                final K2.c c = (K2.c)this.D;
                final Object a4 = c.E.a();
                final y1 c2 = zzic.C;
                if (a4 == null) {
                    c2.getClass();
                    final String c3 = c.C;
                    A.h((Object)c3);
                    final B1 p = c2.P(c3);
                    if (p != null) {
                        c2.n(c, p);
                    }
                }
                else {
                    c2.getClass();
                    final String c4 = c.C;
                    A.h((Object)c4);
                    final B1 p2 = c2.P(c4);
                    if (p2 != null) {
                        c2.K(c, p2);
                    }
                }
                return;
            }
            case 13: {
                this.a();
                return;
            }
            case 12: {
                final f0 f5 = (f0)this.E;
                final e0 d2 = f5.D;
                final n0 a5 = d2.a;
                final k0 l = a5.L;
                n0.f((x0)l);
                l.v();
                final H h4 = (H)this.D;
                final P m = a5.K;
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("package_name", f5.C);
                try {
                    final J j2 = (J)h4;
                    final Parcel q = ((B2.a)j2).Q();
                    G.c(q, (Parcelable)bundle);
                    final Parcel v2 = ((B2.a)j2).v2(q, 1);
                    final Bundle bundle2 = (Bundle)G.a(v2, Bundle.CREATOR);
                    v2.recycle();
                    if (bundle2 == null) {
                        n0.f((x0)m);
                        m.H.f("Install Referrer Service returned a null response");
                    }
                }
                catch (final Exception ex5) {
                    n0.f((x0)m);
                    m.H.g("Exception occurred while retrieving the Install Referrer", (Object)((Throwable)ex5).getMessage());
                }
                final k0 l2 = d2.a.L;
                n0.f((x0)l2);
                l2.v();
                throw new IllegalStateException("Unexpected call on client side");
            }
            case 11: {
                ((w0)this.D).h();
                if (R3.b.c()) {
                    ((w0)this.D).l().E((Runnable)this);
                }
                else {
                    final boolean b5 = ((m)this.E).c != 0L;
                    ((m)this.E).c = 0L;
                    if (b5) {
                        ((m)this.E).c();
                    }
                }
                return;
            }
            case 10: {
                final I1.J j3 = (I1.J)this.D;
                final SharedPreferences sharedPreferences = ((Context)this.E).getSharedPreferences("admob", 0);
                final SharedPreferences$Editor edit2 = sharedPreferences.edit();
                try {
                    final Object a6;
                    monitorenter(a6 = j3.a);
                    Label_2393: {
                        try {
                            j3.f = sharedPreferences;
                            j3.g = edit2;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            j3.h = j3.f.getBoolean("use_https", j3.h);
                            j3.u = j3.f.getBoolean("content_url_opted_out", j3.u);
                            j3.i = j3.f.getString("content_url_hashes", j3.i);
                            j3.k = j3.f.getBoolean("gad_idless", j3.k);
                            j3.v = j3.f.getBoolean("content_vertical_opted_out", j3.v);
                            j3.j = j3.f.getString("content_vertical_hashes", j3.j);
                            j3.r = j3.f.getInt("version_code", j3.r);
                            if ((boolean)Z7.g.p() && q.d.c.j) {
                                j3.n = new id("", 0L);
                                break Label_2393;
                            }
                            break Label_2393;
                        }
                        finally {
                            monitorexit(a6);
                            j3.n = new id(j3.f.getString("app_settings_json", j3.n.e), j3.f.getLong("app_settings_last_update_ms", j3.n.f));
                            j3.o = j3.f.getLong("app_last_background_time_ms", j3.o);
                            j3.q = j3.f.getInt("request_in_session_count", j3.q);
                            j3.p = j3.f.getLong("first_ad_req_time_ms", j3.p);
                            j3.s = j3.f.getStringSet("never_pool_slots", j3.s);
                            j3.w = j3.f.getString("display_cutout", j3.w);
                            j3.B = j3.f.getInt("app_measurement_npa", j3.B);
                            j3.C = j3.f.getInt("sd_app_measure_npa", j3.C);
                            j3.D = j3.f.getLong("sd_app_measure_npa_ts", j3.D);
                            j3.x = j3.f.getString("inspector_info", j3.x);
                            j3.y = j3.f.getBoolean("linked_device", j3.y);
                            j3.z = j3.f.getString("linked_ad_unit", j3.z);
                            j3.A = j3.f.getString("inspector_ui_storage", j3.A);
                            j3.l = j3.f.getString("IABTCF_TCString", j3.l);
                            j3.m = j3.f.getInt("gad_has_consent_for_cookies", j3.m);
                            try {
                                j3.t = new JSONObject(j3.f.getString("native_advanced_settings", "{}"));
                            }
                            catch (final JSONException ex6) {
                                j.j("Could not convert native advanced settings to json object", (Throwable)ex6);
                            }
                            j3.m();
                            monitorexit(a6);
                        }
                    }
                }
                finally {
                    final Throwable t3;
                    E1.o.B.g.h("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", t3);
                    I1.H.n("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", t3);
                }
                return;
            }
            case 9: {
                ((zzm)((H1.g)this.D).E).C.getWindow().setBackgroundDrawable((Drawable)this.E);
                return;
            }
            case 8: {
                ((ViewGroup)((F1.x0)this.D).l).addView((View)ObjectWrapper.unwrap((t2.b)this.E));
                return;
            }
            case 7: {
                E1.o.B.j.getClass();
                d.o((Ak)this.D, "cld_r", SystemClock.elapsedRealtime() - (long)this.E);
                return;
            }
            case 6: {
                Object o4 = this.D;
                final String s3 = (String)this.E;
                final Class<I> clazz;
                monitorenter(clazz = I.class);
                while (true) {
                    try {
                        if (I.a == null) {
                            final Object o5 = o4;
                            final String s4 = "(function(){})()";
                            final ValueCallback valueCallback = null;
                            ((WebView)o5).evaluateJavascript(s4, valueCallback);
                            final Boolean b6 = I.a = Boolean.TRUE;
                        }
                        break Label_3043;
                    }
                    finally {
                        final C2.s s5;
                        o4 = s5;
                        monitorexit(clazz);
                        return;
                        final boolean booleanValue = I.a;
                        monitorexit(clazz);
                        iftrue(Label_3068:)(!booleanValue);
                        Block_79: {
                            break Block_79;
                            Label_3068: {
                                ((WebView)o4).loadUrl("javascript:".concat(s3));
                            }
                            return;
                        }
                        ((WebView)o4).evaluateJavascript(s3, (ValueCallback)null);
                        return;
                    }
                    try {
                        final Object o5 = o4;
                        final String s4 = "(function(){})()";
                        final ValueCallback valueCallback = null;
                        ((WebView)o5).evaluateJavascript(s4, valueCallback);
                        I.a = Boolean.TRUE;
                        continue;
                    }
                    catch (final IllegalStateException ex7) {}
                    break;
                }
            }
            case 5: {
                final AtomicReference d3 = ((C2.o)this.D).d;
                Objects.requireNonNull((Object)d3);
                ((C2.l)this.E).b((h)new b((Object)d3, 1), (S2.g)new C3.f(2));
                return;
            }
            case 4: {
                Label_3207: {
                    while (true) {
                        try {
                            final Method d4 = C.g.d;
                            final Object e8 = this.E;
                            final Object d5 = this.D;
                            if (d4 == null) {
                                break Label_3207;
                            }
                            d4.invoke(d5, new Object[] { e8, Boolean.FALSE, "AppCompat recreation" });
                        }
                        catch (final RuntimeException ex8) {
                            if (ex8.getClass() != RuntimeException.class || ((Throwable)ex8).getMessage() == null) {
                                return;
                            }
                            if (!((Throwable)ex8).getMessage().startsWith("Unable to stop")) {
                                return;
                            }
                            throw ex8;
                            final Object e8;
                            final Throwable t4;
                            C.g.e.invoke((Object)t4, new Object[] { e8, Boolean.FALSE });
                            return;
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", t4);
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                return;
            }
            case 3: {
                ((Application)this.D).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.E);
                return;
            }
            case 2: {
                ((C.f)this.D).C = this.E;
                return;
            }
            case 1: {
                int n7 = 0;
                while (true) {
                    try {
                        ((Runnable)this.D).run();
                    }
                    finally {
                        final Throwable t5;
                        v.f((e5.i)e5.j.C, t5);
                    }
                    final B5.i i2 = (B5.i)this.E;
                    final Runnable j4 = i2.j();
                    if (j4 == null) {
                        break;
                    }
                    this.D = j4;
                    if (++n7 >= 16) {
                        final D5.k e9 = i2.E;
                        e9.getClass();
                        e9.g((e5.i)i2, (Runnable)this);
                        break;
                    }
                }
                return;
            }
            case 0: {
                final V2.q q2 = (V2.q)this.D;
                final boolean b7 = q2 instanceof W2.a;
                Object o6 = this.E;
                if (b7) {
                    final V2.n n8 = (V2.n)q2;
                    Throwable a7 = null;
                    Label_3490: {
                        if (n8 instanceof V2.g) {
                            final Object c5 = n8.C;
                            if (c5 instanceof V2.c) {
                                a7 = ((V2.c)c5).a;
                                break Label_3490;
                            }
                        }
                        a7 = null;
                    }
                    if (a7 != null) {
                        ((l)o6).p(a7);
                        return;
                    }
                }
                try {
                    a.a.j(q2);
                    final H0 h5 = (H0)((l)o6).E;
                    ((B)h5).v();
                    final boolean g4 = ((n0)((u)h5).C).I.G((String)null, w.M0);
                    final s1 s6 = (s1)((l)o6).D;
                    if (g4) {
                        final H0 h6 = (H0)((l)o6).E;
                        final SparseArray e10 = ((u)h6).t().E();
                        o6 = ((l)o6).D;
                        e10.put(((s1)o6).E, (Object)((s1)o6).D);
                        ((u)h6).t().z(e10);
                        h5.K = false;
                        h5.L = 1;
                        o6 = ((u)h5).j();
                        ((P)o6).O.g("Successfully registered trigger URI", (Object)s6.C);
                        h5.V();
                    }
                    else {
                        h5.K = false;
                        h5.V();
                        o6 = ((u)h5).j();
                        ((P)o6).O.g("registerTriggerAsync ran. uri", (Object)s6.C);
                    }
                }
                catch (final ExecutionException ex9) {
                    ((l)o6).p(((Throwable)ex9).getCause());
                }
                finally {
                    final Throwable t6;
                    ((l)o6).p(t6);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.C) {
            default: {
                return super.toString();
            }
            case 0: {
                final c2.k k = new c2.k(o.class.getSimpleName());
                final l l = new l(16, false);
                ((l)k.F).E = l;
                k.F = l;
                l.D = this.E;
                return k.toString();
            }
        }
    }
}

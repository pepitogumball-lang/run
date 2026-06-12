package u2;

import android.os.IInterface;
import B2.a;
import java.lang.reflect.InvocationTargetException;
import android.os.IBinder;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import android.util.Log;
import h2.A;
import android.content.Context;
import com.google.android.gms.internal.ads.T3;
import c0.b;
import c0.f;

public final class d
{
    public static final f b;
    public static final b c;
    public static final f d;
    public static Boolean e;
    public static String f;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static final ThreadLocal j;
    public static final T3 k;
    public static final b l;
    public static i m;
    public static j n;
    public final Context a;
    
    static {
        j = new ThreadLocal();
        k = new T3(11);
        l = (b)new Object();
        b = new f(20);
        c = (b)new Object();
        d = new f(21);
    }
    
    public d(final Context a) {
        this.a = a;
    }
    
    public static int a(final Context context, final String s) {
        try {
            final ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            final StringBuilder sb = new StringBuilder(s.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(s);
            sb.append(".ModuleDescriptor");
            final Class loadClass = classLoader.loadClass(sb.toString());
            final Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            loadClass.getDeclaredField("MODULE_VERSION");
            if (!A.l(declaredField.get((Object)null), (Object)s)) {
                final String value = String.valueOf(declaredField.get((Object)null));
                final StringBuilder sb2 = new StringBuilder(value.length() + 50 + s.length() + 1);
                sb2.append("Module descriptor id '");
                sb2.append(value);
                sb2.append("' didn't match expected id '");
                sb2.append(s);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            goto Label_0178;
        }
        catch (final Exception ex) {
            goto Label_0187;
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb3 = new StringBuilder(s.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(s);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
        }
        return 0;
    }
    
    public static d c(final Context p0, final c p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //     4: astore          16
        //     6: aload           16
        //     8: ifnull          1536
        //    11: getstatic       u2/d.j:Ljava/lang/ThreadLocal;
        //    14: astore          11
        //    16: aload           11
        //    18: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    21: checkcast       Lu2/h;
        //    24: astore          12
        //    26: new             Ljava/lang/Object;
        //    29: dup            
        //    30: invokespecial   java/lang/Object.<init>:()V
        //    33: astore          14
        //    35: aload           11
        //    37: aload           14
        //    39: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //    42: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //    45: astore          17
        //    47: aload           17
        //    49: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    52: checkcast       Ljava/lang/Long;
        //    55: astore          13
        //    57: aload           13
        //    59: invokevirtual   java/lang/Long.longValue:()J
        //    62: lstore          9
        //    64: aload           17
        //    66: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //    69: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    72: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //    75: aload_1        
        //    76: aload_0        
        //    77: aload_2        
        //    78: getstatic       u2/d.l:Lc0/b;
        //    81: invokeinterface u2/c.k:(Landroid/content/Context;Ljava/lang/String;Lu2/b;)Lcom/google/android/gms/internal/ads/b;
        //    86: astore          15
        //    88: aload           15
        //    90: getfield        com/google/android/gms/internal/ads/b.a:I
        //    93: istore          7
        //    95: aload           15
        //    97: getfield        com/google/android/gms/internal/ads/b.b:I
        //   100: istore          8
        //   102: aload_2        
        //   103: invokevirtual   java/lang/String.length:()I
        //   106: istore          5
        //   108: iload           7
        //   110: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   113: invokevirtual   java/lang/String.length:()I
        //   116: istore          6
        //   118: aload_2        
        //   119: invokevirtual   java/lang/String.length:()I
        //   122: istore_3       
        //   123: iload           8
        //   125: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   128: invokevirtual   java/lang/String.length:()I
        //   131: istore          4
        //   133: new             Ljava/lang/StringBuilder;
        //   136: astore          18
        //   138: aload           18
        //   140: iload           5
        //   142: bipush          26
        //   144: iadd           
        //   145: iload           6
        //   147: iadd           
        //   148: bipush          19
        //   150: iadd           
        //   151: iload_3        
        //   152: iadd           
        //   153: iconst_1       
        //   154: iadd           
        //   155: iload           4
        //   157: iadd           
        //   158: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   161: aload           18
        //   163: ldc             "Considering local module "
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: pop            
        //   169: aload           18
        //   171: aload_2        
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: pop            
        //   176: aload           18
        //   178: ldc             ":"
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: pop            
        //   184: aload           18
        //   186: iload           7
        //   188: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   191: pop            
        //   192: aload           18
        //   194: ldc             " and remote module "
        //   196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   199: pop            
        //   200: aload           18
        //   202: aload_2        
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: pop            
        //   207: aload           18
        //   209: ldc             ":"
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: pop            
        //   215: aload           18
        //   217: iload           8
        //   219: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   222: pop            
        //   223: ldc             "DynamiteModule"
        //   225: aload           18
        //   227: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   230: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   233: pop            
        //   234: aload           15
        //   236: getfield        com/google/android/gms/internal/ads/b.c:I
        //   239: istore          4
        //   241: iload           4
        //   243: ifeq            1358
        //   246: iload           4
        //   248: istore_3       
        //   249: iload           4
        //   251: iconst_m1      
        //   252: if_icmpne       265
        //   255: aload           15
        //   257: getfield        com/google/android/gms/internal/ads/b.a:I
        //   260: ifeq            1358
        //   263: iconst_m1      
        //   264: istore_3       
        //   265: goto            272
        //   268: astore_0       
        //   269: goto            1486
        //   272: iload_3        
        //   273: iconst_1       
        //   274: if_icmpne       285
        //   277: aload           15
        //   279: getfield        com/google/android/gms/internal/ads/b.b:I
        //   282: ifeq            1358
        //   285: iload_3        
        //   286: iconst_m1      
        //   287: if_icmpne       359
        //   290: ldc             "DynamiteModule"
        //   292: ldc             "Selected local version of "
        //   294: aload_2        
        //   295: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   298: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   301: pop            
        //   302: new             Lu2/d;
        //   305: dup            
        //   306: aload           16
        //   308: invokespecial   u2/d.<init>:(Landroid/content/Context;)V
        //   311: astore_0       
        //   312: lload           9
        //   314: lconst_0       
        //   315: lcmp           
        //   316: ifne            327
        //   319: aload           17
        //   321: invokevirtual   java/lang/ThreadLocal.remove:()V
        //   324: goto            334
        //   327: aload           17
        //   329: aload           13
        //   331: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   334: aload           14
        //   336: getfield        u2/h.a:Landroid/database/Cursor;
        //   339: astore_1       
        //   340: aload_1        
        //   341: ifnull          350
        //   344: aload_1        
        //   345: invokeinterface android/database/Cursor.close:()V
        //   350: aload           11
        //   352: aload           12
        //   354: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //   357: aload_0        
        //   358: areturn        
        //   359: iload_3        
        //   360: iconst_1       
        //   361: if_icmpne       1308
        //   364: aload           15
        //   366: getfield        com/google/android/gms/internal/ads/b.b:I
        //   369: istore          4
        //   371: ldc             Lu2/d;.class
        //   373: dup            
        //   374: astore          19
        //   376: monitorenter   
        //   377: aload_0        
        //   378: invokestatic    u2/d.e:(Landroid/content/Context;)Z
        //   381: ifeq            1049
        //   384: getstatic       u2/d.e:Ljava/lang/Boolean;
        //   387: astore          17
        //   389: aload           19
        //   391: monitorexit    
        //   392: aload           17
        //   394: ifnull          1028
        //   397: aload           17
        //   399: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   402: ifeq            739
        //   405: aload_2        
        //   406: invokevirtual   java/lang/String.length:()I
        //   409: istore          5
        //   411: iload           4
        //   413: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   416: invokevirtual   java/lang/String.length:()I
        //   419: istore_3       
        //   420: new             Ljava/lang/StringBuilder;
        //   423: astore          17
        //   425: aload           17
        //   427: iload           5
        //   429: bipush          40
        //   431: iadd           
        //   432: iload_3        
        //   433: iadd           
        //   434: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   437: aload           17
        //   439: ldc             "Selected remote version of "
        //   441: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   444: pop            
        //   445: aload           17
        //   447: aload_2        
        //   448: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   451: pop            
        //   452: aload           17
        //   454: ldc             ", version >= "
        //   456: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   459: pop            
        //   460: aload           17
        //   462: iload           4
        //   464: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   467: pop            
        //   468: ldc             "DynamiteModule"
        //   470: aload           17
        //   472: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   475: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   478: pop            
        //   479: ldc             Lu2/d;.class
        //   481: dup            
        //   482: astore          19
        //   484: monitorenter   
        //   485: getstatic       u2/d.n:Lu2/j;
        //   488: astore          17
        //   490: aload           19
        //   492: monitorexit    
        //   493: aload           17
        //   495: ifnull          715
        //   498: aload           11
        //   500: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   503: checkcast       Lu2/h;
        //   506: astore          18
        //   508: aload           18
        //   510: ifnull          699
        //   513: aload           18
        //   515: getfield        u2/h.a:Landroid/database/Cursor;
        //   518: ifnull          699
        //   521: aload_0        
        //   522: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //   525: astore          11
        //   527: aload           18
        //   529: getfield        u2/h.a:Landroid/database/Cursor;
        //   532: astore          18
        //   534: aconst_null    
        //   535: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   538: pop            
        //   539: ldc             Lu2/d;.class
        //   541: dup            
        //   542: astore          19
        //   544: monitorenter   
        //   545: getstatic       u2/d.h:I
        //   548: iconst_2       
        //   549: if_icmplt       557
        //   552: iconst_1       
        //   553: istore_3       
        //   554: goto            559
        //   557: iconst_0       
        //   558: istore_3       
        //   559: aload           19
        //   561: monitorexit    
        //   562: iload_3        
        //   563: ifeq            613
        //   566: ldc             "DynamiteModule"
        //   568: ldc_w           "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
        //   571: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   574: pop            
        //   575: aload           17
        //   577: aload           11
        //   579: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   582: aload_2        
        //   583: iload           4
        //   585: aload           18
        //   587: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   590: invokevirtual   u2/j.s5:(Lt2/b;Ljava/lang/String;ILt2/b;)Lt2/b;
        //   593: astore          11
        //   595: goto            642
        //   598: astore          17
        //   600: goto            1071
        //   603: astore          11
        //   605: goto            1100
        //   608: astore          11
        //   610: goto            1103
        //   613: ldc             "DynamiteModule"
        //   615: ldc_w           "Dynamite loader version < 2, falling back to loadModule2"
        //   618: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   621: pop            
        //   622: aload           17
        //   624: aload           11
        //   626: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   629: aload_2        
        //   630: iload           4
        //   632: aload           18
        //   634: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   637: invokevirtual   u2/j.r5:(Lt2/b;Ljava/lang/String;ILt2/b;)Lt2/b;
        //   640: astore          11
        //   642: aload           11
        //   644: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.unwrap:(Lt2/b;)Ljava/lang/Object;
        //   647: checkcast       Landroid/content/Context;
        //   650: astore          17
        //   652: aload           17
        //   654: ifnull          675
        //   657: new             Lu2/d;
        //   660: astore          11
        //   662: aload           11
        //   664: aload           17
        //   666: invokespecial   u2/d.<init>:(Landroid/content/Context;)V
        //   669: aload           11
        //   671: astore_0       
        //   672: goto            1243
        //   675: new             Lu2/a;
        //   678: astore          11
        //   680: aload           11
        //   682: ldc_w           "Failed to get module context"
        //   685: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   688: aload           11
        //   690: athrow         
        //   691: astore          11
        //   693: aload           19
        //   695: monitorexit    
        //   696: aload           11
        //   698: athrow         
        //   699: new             Lu2/a;
        //   702: astore          11
        //   704: aload           11
        //   706: ldc_w           "No result cursor"
        //   709: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   712: aload           11
        //   714: athrow         
        //   715: new             Lu2/a;
        //   718: astore          11
        //   720: aload           11
        //   722: ldc_w           "DynamiteLoaderV2 was not cached."
        //   725: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   728: aload           11
        //   730: athrow         
        //   731: astore          11
        //   733: aload           19
        //   735: monitorexit    
        //   736: aload           11
        //   738: athrow         
        //   739: aload_2        
        //   740: invokevirtual   java/lang/String.length:()I
        //   743: istore          5
        //   745: iload           4
        //   747: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   750: invokevirtual   java/lang/String.length:()I
        //   753: istore_3       
        //   754: new             Ljava/lang/StringBuilder;
        //   757: astore          17
        //   759: aload           17
        //   761: iload           5
        //   763: bipush          40
        //   765: iadd           
        //   766: iload_3        
        //   767: iadd           
        //   768: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   771: aload           17
        //   773: ldc             "Selected remote version of "
        //   775: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   778: pop            
        //   779: aload           17
        //   781: aload_2        
        //   782: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   785: pop            
        //   786: aload           17
        //   788: ldc             ", version >= "
        //   790: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   793: pop            
        //   794: aload           17
        //   796: iload           4
        //   798: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   801: pop            
        //   802: ldc             "DynamiteModule"
        //   804: aload           17
        //   806: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   809: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   812: pop            
        //   813: aload_0        
        //   814: invokestatic    u2/d.h:(Landroid/content/Context;)Lu2/i;
        //   817: astore          17
        //   819: aload           17
        //   821: ifnull          1012
        //   824: aload           17
        //   826: aload           17
        //   828: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   831: bipush          6
        //   833: invokevirtual   B2/a.e0:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   836: astore          18
        //   838: aload           18
        //   840: invokevirtual   android/os/Parcel.readInt:()I
        //   843: istore_3       
        //   844: aload           18
        //   846: invokevirtual   android/os/Parcel.recycle:()V
        //   849: iload_3        
        //   850: iconst_3       
        //   851: if_icmplt       910
        //   854: aload           11
        //   856: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   859: checkcast       Lu2/h;
        //   862: astore          11
        //   864: aload           11
        //   866: ifnull          894
        //   869: aload           17
        //   871: aload_0        
        //   872: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   875: aload_2        
        //   876: iload           4
        //   878: aload           11
        //   880: getfield        u2/h.a:Landroid/database/Cursor;
        //   883: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   886: invokevirtual   u2/i.t5:(Lt2/b;Ljava/lang/String;ILt2/b;)Lt2/b;
        //   889: astore          11
        //   891: goto            964
        //   894: new             Lu2/a;
        //   897: astore          11
        //   899: aload           11
        //   901: ldc_w           "No cached result cursor holder"
        //   904: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   907: aload           11
        //   909: athrow         
        //   910: iload_3        
        //   911: iconst_2       
        //   912: if_icmpne       941
        //   915: ldc             "DynamiteModule"
        //   917: ldc_w           "IDynamite loader version = 2"
        //   920: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   923: pop            
        //   924: aload           17
        //   926: aload_0        
        //   927: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   930: aload_2        
        //   931: iload           4
        //   933: invokevirtual   u2/i.s5:(Lt2/b;Ljava/lang/String;I)Lt2/b;
        //   936: astore          11
        //   938: goto            964
        //   941: ldc             "DynamiteModule"
        //   943: ldc_w           "Dynamite loader version < 2, falling back to createModuleContext"
        //   946: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   949: pop            
        //   950: aload           17
        //   952: aload_0        
        //   953: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   956: aload_2        
        //   957: iload           4
        //   959: invokevirtual   u2/i.r5:(Lt2/b;Ljava/lang/String;I)Lt2/b;
        //   962: astore          11
        //   964: aload           11
        //   966: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.unwrap:(Lt2/b;)Ljava/lang/Object;
        //   969: astore          11
        //   971: aload           11
        //   973: ifnull          996
        //   976: new             Lu2/d;
        //   979: dup            
        //   980: aload           11
        //   982: checkcast       Landroid/content/Context;
        //   985: invokespecial   u2/d.<init>:(Landroid/content/Context;)V
        //   988: astore          11
        //   990: aload           11
        //   992: astore_0       
        //   993: goto            1243
        //   996: new             Lu2/a;
        //   999: astore          11
        //  1001: aload           11
        //  1003: ldc_w           "Failed to load remote module."
        //  1006: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1009: aload           11
        //  1011: athrow         
        //  1012: new             Lu2/a;
        //  1015: astore          11
        //  1017: aload           11
        //  1019: ldc_w           "Failed to create IDynamiteLoader."
        //  1022: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1025: aload           11
        //  1027: athrow         
        //  1028: new             Lu2/a;
        //  1031: astore          11
        //  1033: aload           11
        //  1035: ldc_w           "Failed to determine which loading route to use."
        //  1038: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1041: aload           11
        //  1043: athrow         
        //  1044: astore          11
        //  1046: goto            1065
        //  1049: new             Lu2/a;
        //  1052: astore          11
        //  1054: aload           11
        //  1056: ldc_w           "Remote loading disabled"
        //  1059: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1062: aload           11
        //  1064: athrow         
        //  1065: aload           19
        //  1067: monitorexit    
        //  1068: aload           11
        //  1070: athrow         
        //  1071: aload_0        
        //  1072: aload           17
        //  1074: invokestatic    q2/b.a:(Landroid/content/Context;Ljava/lang/Throwable;)V
        //  1077: new             Lu2/a;
        //  1080: astore          11
        //  1082: aload           11
        //  1084: ldc_w           "Failed to load remote module."
        //  1087: aload           17
        //  1089: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1092: aload           11
        //  1094: athrow         
        //  1095: astore          11
        //  1097: goto            1123
        //  1100: aload           11
        //  1102: athrow         
        //  1103: new             Lu2/a;
        //  1106: astore          17
        //  1108: aload           17
        //  1110: ldc_w           "Failed to load remote module."
        //  1113: aload           11
        //  1115: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1118: aload           17
        //  1120: athrow         
        //  1121: astore          11
        //  1123: aload           11
        //  1125: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1128: astore          18
        //  1130: aload           18
        //  1132: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1135: invokevirtual   java/lang/String.length:()I
        //  1138: istore_3       
        //  1139: new             Ljava/lang/StringBuilder;
        //  1142: astore          17
        //  1144: aload           17
        //  1146: iload_3        
        //  1147: bipush          30
        //  1149: iadd           
        //  1150: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1153: aload           17
        //  1155: ldc_w           "Failed to load remote module: "
        //  1158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1161: pop            
        //  1162: aload           17
        //  1164: aload           18
        //  1166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1169: pop            
        //  1170: ldc             "DynamiteModule"
        //  1172: aload           17
        //  1174: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1177: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  1180: pop            
        //  1181: aload           15
        //  1183: getfield        com/google/android/gms/internal/ads/b.a:I
        //  1186: istore_3       
        //  1187: iload_3        
        //  1188: ifeq            1293
        //  1191: new             LR0/m;
        //  1194: astore          15
        //  1196: aload           15
        //  1198: iload_3        
        //  1199: bipush          11
        //  1201: invokespecial   R0/m.<init>:(II)V
        //  1204: aload_1        
        //  1205: aload_0        
        //  1206: aload_2        
        //  1207: aload           15
        //  1209: invokeinterface u2/c.k:(Landroid/content/Context;Ljava/lang/String;Lu2/b;)Lcom/google/android/gms/internal/ads/b;
        //  1214: getfield        com/google/android/gms/internal/ads/b.c:I
        //  1217: iconst_m1      
        //  1218: if_icmpne       1293
        //  1221: ldc             "DynamiteModule"
        //  1223: ldc             "Selected local version of "
        //  1225: aload_2        
        //  1226: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1229: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //  1232: pop            
        //  1233: new             Lu2/d;
        //  1236: dup            
        //  1237: aload           16
        //  1239: invokespecial   u2/d.<init>:(Landroid/content/Context;)V
        //  1242: astore_0       
        //  1243: lload           9
        //  1245: lconst_0       
        //  1246: lcmp           
        //  1247: ifne            1259
        //  1250: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //  1253: invokevirtual   java/lang/ThreadLocal.remove:()V
        //  1256: goto            1267
        //  1259: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //  1262: aload           13
        //  1264: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1267: aload           14
        //  1269: getfield        u2/h.a:Landroid/database/Cursor;
        //  1272: astore_1       
        //  1273: aload_1        
        //  1274: ifnull          1283
        //  1277: aload_1        
        //  1278: invokeinterface android/database/Cursor.close:()V
        //  1283: getstatic       u2/d.j:Ljava/lang/ThreadLocal;
        //  1286: aload           12
        //  1288: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1291: aload_0        
        //  1292: areturn        
        //  1293: new             Lu2/a;
        //  1296: astore_0       
        //  1297: aload_0        
        //  1298: ldc_w           "Remote load failed. No local fallback found."
        //  1301: aload           11
        //  1303: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1306: aload_0        
        //  1307: athrow         
        //  1308: new             Lu2/a;
        //  1311: astore_0       
        //  1312: iload_3        
        //  1313: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1316: invokevirtual   java/lang/String.length:()I
        //  1319: istore          4
        //  1321: new             Ljava/lang/StringBuilder;
        //  1324: astore_1       
        //  1325: aload_1        
        //  1326: iload           4
        //  1328: bipush          36
        //  1330: iadd           
        //  1331: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1334: aload_1        
        //  1335: ldc_w           "VersionPolicy returned invalid code:"
        //  1338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1341: pop            
        //  1342: aload_1        
        //  1343: iload_3        
        //  1344: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1347: pop            
        //  1348: aload_0        
        //  1349: aload_1        
        //  1350: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1353: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1356: aload_0        
        //  1357: athrow         
        //  1358: new             Lu2/a;
        //  1361: astore_0       
        //  1362: aload           15
        //  1364: getfield        com/google/android/gms/internal/ads/b.a:I
        //  1367: istore          6
        //  1369: aload           15
        //  1371: getfield        com/google/android/gms/internal/ads/b.b:I
        //  1374: istore          7
        //  1376: aload_2        
        //  1377: invokevirtual   java/lang/String.length:()I
        //  1380: istore          5
        //  1382: iload           6
        //  1384: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1387: invokevirtual   java/lang/String.length:()I
        //  1390: istore_3       
        //  1391: iload           7
        //  1393: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1396: invokevirtual   java/lang/String.length:()I
        //  1399: istore          4
        //  1401: new             Ljava/lang/StringBuilder;
        //  1404: astore_1       
        //  1405: aload_1        
        //  1406: iload           5
        //  1408: bipush          46
        //  1410: iadd           
        //  1411: iload_3        
        //  1412: iadd           
        //  1413: bipush          23
        //  1415: iadd           
        //  1416: iload           4
        //  1418: iadd           
        //  1419: iconst_1       
        //  1420: iadd           
        //  1421: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1424: aload_1        
        //  1425: ldc_w           "No acceptable module "
        //  1428: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1431: pop            
        //  1432: aload_1        
        //  1433: aload_2        
        //  1434: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1437: pop            
        //  1438: aload_1        
        //  1439: ldc_w           " found. Local version is "
        //  1442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1445: pop            
        //  1446: aload_1        
        //  1447: iload           6
        //  1449: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1452: pop            
        //  1453: aload_1        
        //  1454: ldc_w           " and remote version is "
        //  1457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1460: pop            
        //  1461: aload_1        
        //  1462: iload           7
        //  1464: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1467: pop            
        //  1468: aload_1        
        //  1469: ldc_w           "."
        //  1472: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1475: pop            
        //  1476: aload_0        
        //  1477: aload_1        
        //  1478: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1481: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1484: aload_0        
        //  1485: athrow         
        //  1486: lload           9
        //  1488: lconst_0       
        //  1489: lcmp           
        //  1490: ifne            1502
        //  1493: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //  1496: invokevirtual   java/lang/ThreadLocal.remove:()V
        //  1499: goto            1510
        //  1502: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //  1505: aload           13
        //  1507: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1510: aload           14
        //  1512: getfield        u2/h.a:Landroid/database/Cursor;
        //  1515: astore_1       
        //  1516: aload_1        
        //  1517: ifnull          1526
        //  1520: aload_1        
        //  1521: invokeinterface android/database/Cursor.close:()V
        //  1526: getstatic       u2/d.j:Ljava/lang/ThreadLocal;
        //  1529: aload           12
        //  1531: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //  1534: aload_0        
        //  1535: athrow         
        //  1536: new             Ljava/lang/Exception;
        //  1539: dup            
        //  1540: ldc_w           "null application Context"
        //  1543: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //  1546: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  64     241    268    1536   Any
        //  255    263    268    1536   Any
        //  277    285    268    1536   Any
        //  290    312    268    1536   Any
        //  364    371    1121   1123   Lu2/a;
        //  364    371    268    1536   Any
        //  371    377    608    613    Landroid/os/RemoteException;
        //  371    377    603    608    Lu2/a;
        //  371    377    598    603    Any
        //  377    392    1044   1071   Any
        //  397    485    608    613    Landroid/os/RemoteException;
        //  397    485    603    608    Lu2/a;
        //  397    485    598    603    Any
        //  485    493    731    739    Any
        //  498    508    608    613    Landroid/os/RemoteException;
        //  498    508    603    608    Lu2/a;
        //  498    508    598    603    Any
        //  513    545    608    613    Landroid/os/RemoteException;
        //  513    545    603    608    Lu2/a;
        //  513    545    598    603    Any
        //  545    552    691    699    Any
        //  559    562    691    699    Any
        //  566    595    608    613    Landroid/os/RemoteException;
        //  566    595    603    608    Lu2/a;
        //  566    595    598    603    Any
        //  613    642    608    613    Landroid/os/RemoteException;
        //  613    642    603    608    Lu2/a;
        //  613    642    598    603    Any
        //  642    652    608    613    Landroid/os/RemoteException;
        //  642    652    603    608    Lu2/a;
        //  642    652    598    603    Any
        //  657    669    608    613    Landroid/os/RemoteException;
        //  657    669    603    608    Lu2/a;
        //  657    669    598    603    Any
        //  675    691    608    613    Landroid/os/RemoteException;
        //  675    691    603    608    Lu2/a;
        //  675    691    598    603    Any
        //  693    696    691    699    Any
        //  696    699    608    613    Landroid/os/RemoteException;
        //  696    699    603    608    Lu2/a;
        //  696    699    598    603    Any
        //  699    715    608    613    Landroid/os/RemoteException;
        //  699    715    603    608    Lu2/a;
        //  699    715    598    603    Any
        //  715    731    608    613    Landroid/os/RemoteException;
        //  715    731    603    608    Lu2/a;
        //  715    731    598    603    Any
        //  733    736    731    739    Any
        //  736    739    608    613    Landroid/os/RemoteException;
        //  736    739    603    608    Lu2/a;
        //  736    739    598    603    Any
        //  739    819    608    613    Landroid/os/RemoteException;
        //  739    819    603    608    Lu2/a;
        //  739    819    598    603    Any
        //  824    849    608    613    Landroid/os/RemoteException;
        //  824    849    603    608    Lu2/a;
        //  824    849    598    603    Any
        //  854    864    608    613    Landroid/os/RemoteException;
        //  854    864    603    608    Lu2/a;
        //  854    864    598    603    Any
        //  869    891    608    613    Landroid/os/RemoteException;
        //  869    891    603    608    Lu2/a;
        //  869    891    598    603    Any
        //  894    910    608    613    Landroid/os/RemoteException;
        //  894    910    603    608    Lu2/a;
        //  894    910    598    603    Any
        //  915    938    608    613    Landroid/os/RemoteException;
        //  915    938    603    608    Lu2/a;
        //  915    938    598    603    Any
        //  941    964    608    613    Landroid/os/RemoteException;
        //  941    964    603    608    Lu2/a;
        //  941    964    598    603    Any
        //  964    971    608    613    Landroid/os/RemoteException;
        //  964    971    603    608    Lu2/a;
        //  964    971    598    603    Any
        //  976    990    608    613    Landroid/os/RemoteException;
        //  976    990    603    608    Lu2/a;
        //  976    990    598    603    Any
        //  996    1012   608    613    Landroid/os/RemoteException;
        //  996    1012   603    608    Lu2/a;
        //  996    1012   598    603    Any
        //  1012   1028   608    613    Landroid/os/RemoteException;
        //  1012   1028   603    608    Lu2/a;
        //  1012   1028   598    603    Any
        //  1028   1044   608    613    Landroid/os/RemoteException;
        //  1028   1044   603    608    Lu2/a;
        //  1028   1044   598    603    Any
        //  1049   1065   1044   1071   Any
        //  1065   1068   1044   1071   Any
        //  1068   1071   608    613    Landroid/os/RemoteException;
        //  1068   1071   603    608    Lu2/a;
        //  1068   1071   598    603    Any
        //  1071   1095   1095   1100   Lu2/a;
        //  1071   1095   268    1536   Any
        //  1100   1103   1095   1100   Lu2/a;
        //  1100   1103   268    1536   Any
        //  1103   1121   1095   1100   Lu2/a;
        //  1103   1121   268    1536   Any
        //  1123   1187   268    1536   Any
        //  1191   1243   268    1536   Any
        //  1293   1308   268    1536   Any
        //  1308   1358   268    1536   Any
        //  1358   1486   268    1536   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0557:
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
    
    public static int d(final Context p0, final String p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: dup            
        //     3: astore          17
        //     5: monitorenter   
        //     6: getstatic       u2/d.e:Ljava/lang/Boolean;
        //     9: astore          13
        //    11: iconst_1       
        //    12: istore          4
        //    14: iconst_0       
        //    15: istore_3       
        //    16: aconst_null    
        //    17: astore          11
        //    19: aconst_null    
        //    20: astore          10
        //    22: aconst_null    
        //    23: astore          12
        //    25: aload           13
        //    27: astore          9
        //    29: aload           13
        //    31: ifnonnull       428
        //    34: aload_0        
        //    35: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //    38: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    41: ldc_w           Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;.class
        //    44: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    47: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    50: ldc_w           "sClassLoader"
        //    53: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    56: astore          14
        //    58: aload           14
        //    60: invokevirtual   java/lang/reflect/Field.getDeclaringClass:()Ljava/lang/Class;
        //    63: astore          13
        //    65: aload           13
        //    67: dup            
        //    68: astore          18
        //    70: monitorenter   
        //    71: aload           14
        //    73: aconst_null    
        //    74: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    77: checkcast       Ljava/lang/ClassLoader;
        //    80: astore          9
        //    82: aload           9
        //    84: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //    87: if_acmpne       103
        //    90: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    93: astore          9
        //    95: goto            337
        //    98: astore          9
        //   100: goto            343
        //   103: aload           9
        //   105: ifnull          121
        //   108: aload           9
        //   110: invokestatic    u2/d.g:(Ljava/lang/ClassLoader;)V
        //   113: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   116: astore          9
        //   118: goto            337
        //   121: aload_0        
        //   122: invokestatic    u2/d.e:(Landroid/content/Context;)Z
        //   125: ifne            140
        //   128: aload           18
        //   130: monitorexit    
        //   131: aload           17
        //   133: monitorexit    
        //   134: iconst_0       
        //   135: ireturn        
        //   136: astore_1       
        //   137: goto            1207
        //   140: getstatic       u2/d.g:Z
        //   143: ifne            323
        //   146: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   149: astore          15
        //   151: aload           15
        //   153: aconst_null    
        //   154: invokevirtual   java/lang/Boolean.equals:(Ljava/lang/Object;)Z
        //   157: istore          8
        //   159: iload           8
        //   161: ifeq            167
        //   164: goto            323
        //   167: aload_0        
        //   168: aload_1        
        //   169: iload_2        
        //   170: iconst_1       
        //   171: invokestatic    u2/d.f:(Landroid/content/Context;Ljava/lang/String;ZZ)I
        //   174: istore          5
        //   176: getstatic       u2/d.f:Ljava/lang/String;
        //   179: astore          9
        //   181: aload           9
        //   183: ifnull          295
        //   186: aload           9
        //   188: invokevirtual   java/lang/String.isEmpty:()Z
        //   191: ifeq            197
        //   194: goto            295
        //   197: invokestatic    u2/f.D:()Ljava/lang/ClassLoader;
        //   200: astore          9
        //   202: aload           9
        //   204: ifnull          210
        //   207: goto            268
        //   210: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   213: bipush          29
        //   215: if_icmplt       244
        //   218: invokestatic    G0/e.d:()V
        //   221: getstatic       u2/d.f:Ljava/lang/String;
        //   224: astore          9
        //   226: aload           9
        //   228: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //   231: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   234: aload           9
        //   236: invokestatic    G0/e.c:(Ljava/lang/ClassLoader;Ljava/lang/String;)Ldalvik/system/DelegateLastClassLoader;
        //   239: astore          9
        //   241: goto            268
        //   244: getstatic       u2/d.f:Ljava/lang/String;
        //   247: astore          9
        //   249: aload           9
        //   251: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //   254: new             Ldalvik/system/PathClassLoader;
        //   257: dup            
        //   258: aload           9
        //   260: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   263: invokespecial   dalvik/system/PathClassLoader.<init>:(Ljava/lang/String;Ljava/lang/ClassLoader;)V
        //   266: astore          9
        //   268: aload           9
        //   270: invokestatic    u2/d.g:(Ljava/lang/ClassLoader;)V
        //   273: aload           14
        //   275: aconst_null    
        //   276: aload           9
        //   278: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   281: aload           15
        //   283: putstatic       u2/d.e:Ljava/lang/Boolean;
        //   286: aload           18
        //   288: monitorexit    
        //   289: aload           17
        //   291: monitorexit    
        //   292: iload           5
        //   294: ireturn        
        //   295: aload           18
        //   297: monitorexit    
        //   298: aload           17
        //   300: monitorexit    
        //   301: iload           5
        //   303: ireturn        
        //   304: astore          9
        //   306: aload           14
        //   308: aconst_null    
        //   309: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   312: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   315: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   318: astore          9
        //   320: goto            337
        //   323: aload           14
        //   325: aconst_null    
        //   326: invokestatic    java/lang/ClassLoader.getSystemClassLoader:()Ljava/lang/ClassLoader;
        //   329: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   332: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   335: astore          9
        //   337: aload           18
        //   339: monitorexit    
        //   340: goto            423
        //   343: aload           18
        //   345: monitorexit    
        //   346: aload           9
        //   348: athrow         
        //   349: astore          9
        //   351: goto            361
        //   354: astore          9
        //   356: goto            361
        //   359: astore          9
        //   361: aload           9
        //   363: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   366: astore          13
        //   368: aload           13
        //   370: invokevirtual   java/lang/String.length:()I
        //   373: istore          5
        //   375: new             Ljava/lang/StringBuilder;
        //   378: astore          9
        //   380: aload           9
        //   382: iload           5
        //   384: bipush          30
        //   386: iadd           
        //   387: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   390: aload           9
        //   392: ldc_w           "Failed to load module via V2: "
        //   395: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   398: pop            
        //   399: aload           9
        //   401: aload           13
        //   403: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   406: pop            
        //   407: ldc             "DynamiteModule"
        //   409: aload           9
        //   411: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   414: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   417: pop            
        //   418: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   421: astore          9
        //   423: aload           9
        //   425: putstatic       u2/d.e:Ljava/lang/Boolean;
        //   428: aload           17
        //   430: monitorexit    
        //   431: aload           9
        //   433: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   436: istore          8
        //   438: iload           8
        //   440: ifeq            512
        //   443: aload_0        
        //   444: aload_1        
        //   445: iload_2        
        //   446: iconst_0       
        //   447: invokestatic    u2/d.f:(Landroid/content/Context;Ljava/lang/String;ZZ)I
        //   450: istore_2       
        //   451: iload_2        
        //   452: ireturn        
        //   453: astore_1       
        //   454: goto            1212
        //   457: astore_1       
        //   458: aload_1        
        //   459: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   462: astore          9
        //   464: aload           9
        //   466: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   469: invokevirtual   java/lang/String.length:()I
        //   472: istore_2       
        //   473: new             Ljava/lang/StringBuilder;
        //   476: astore_1       
        //   477: aload_1        
        //   478: iload_2        
        //   479: bipush          42
        //   481: iadd           
        //   482: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   485: aload_1        
        //   486: ldc_w           "Failed to retrieve remote module version: "
        //   489: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   492: pop            
        //   493: aload_1        
        //   494: aload           9
        //   496: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   499: pop            
        //   500: ldc             "DynamiteModule"
        //   502: aload_1        
        //   503: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   506: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   509: pop            
        //   510: iconst_0       
        //   511: ireturn        
        //   512: aload_0        
        //   513: invokestatic    u2/d.h:(Landroid/content/Context;)Lu2/i;
        //   516: astore          13
        //   518: aload           13
        //   520: ifnonnull       528
        //   523: iload_3        
        //   524: istore_2       
        //   525: goto            1187
        //   528: aload           10
        //   530: astore          9
        //   532: aload           13
        //   534: aload           13
        //   536: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   539: bipush          6
        //   541: invokevirtual   B2/a.e0:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   544: astore          14
        //   546: aload           10
        //   548: astore          9
        //   550: aload           14
        //   552: invokevirtual   android/os/Parcel.readInt:()I
        //   555: istore          5
        //   557: aload           10
        //   559: astore          9
        //   561: aload           14
        //   563: invokevirtual   android/os/Parcel.recycle:()V
        //   566: iload           5
        //   568: iconst_3       
        //   569: if_icmplt       879
        //   572: aload           10
        //   574: astore          9
        //   576: getstatic       u2/d.j:Ljava/lang/ThreadLocal;
        //   579: astore          14
        //   581: aload           10
        //   583: astore          9
        //   585: aload           14
        //   587: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   590: checkcast       Lu2/h;
        //   593: astore          15
        //   595: aload           15
        //   597: ifnull          637
        //   600: aload           10
        //   602: astore          9
        //   604: aload           15
        //   606: getfield        u2/h.a:Landroid/database/Cursor;
        //   609: astore          15
        //   611: aload           15
        //   613: ifnull          637
        //   616: aload           10
        //   618: astore          9
        //   620: aload           15
        //   622: iconst_0       
        //   623: invokeinterface android/database/Cursor.getInt:(I)I
        //   628: istore_2       
        //   629: goto            1187
        //   632: astore          10
        //   634: goto            1091
        //   637: aload           10
        //   639: astore          9
        //   641: aload_0        
        //   642: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   645: astore          15
        //   647: aload           10
        //   649: astore          9
        //   651: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //   654: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   657: checkcast       Ljava/lang/Long;
        //   660: invokevirtual   java/lang/Long.longValue:()J
        //   663: lstore          6
        //   665: aload           10
        //   667: astore          9
        //   669: aload           13
        //   671: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   674: astore          16
        //   676: aload           10
        //   678: astore          9
        //   680: aload           16
        //   682: aload           15
        //   684: invokestatic    B2/i.b:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   687: aload           10
        //   689: astore          9
        //   691: aload           16
        //   693: aload_1        
        //   694: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   697: aload           10
        //   699: astore          9
        //   701: aload           16
        //   703: iload_2        
        //   704: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   707: aload           10
        //   709: astore          9
        //   711: aload           16
        //   713: lload           6
        //   715: invokevirtual   android/os/Parcel.writeLong:(J)V
        //   718: aload           10
        //   720: astore          9
        //   722: aload           13
        //   724: aload           16
        //   726: bipush          7
        //   728: invokevirtual   B2/a.e0:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   731: invokestatic    m0/a.j:(Landroid/os/Parcel;)Lt2/b;
        //   734: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.unwrap:(Lt2/b;)Ljava/lang/Object;
        //   737: checkcast       Landroid/database/Cursor;
        //   740: astore_1       
        //   741: aload_1        
        //   742: ifnull          847
        //   745: aload_1        
        //   746: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   751: ifne            757
        //   754: goto            847
        //   757: aload_1        
        //   758: iconst_0       
        //   759: invokeinterface android/database/Cursor.getInt:(I)I
        //   764: istore          5
        //   766: iload           5
        //   768: ifle            818
        //   771: aload           14
        //   773: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   776: checkcast       Lu2/h;
        //   779: astore          9
        //   781: aload           9
        //   783: ifnull          806
        //   786: aload           9
        //   788: getfield        u2/h.a:Landroid/database/Cursor;
        //   791: ifnonnull       806
        //   794: aload           9
        //   796: aload_1        
        //   797: putfield        u2/h.a:Landroid/database/Cursor;
        //   800: iload           4
        //   802: istore_2       
        //   803: goto            808
        //   806: iconst_0       
        //   807: istore_2       
        //   808: iload_2        
        //   809: ifeq            818
        //   812: aload           12
        //   814: astore_1       
        //   815: goto            818
        //   818: iload           5
        //   820: istore_2       
        //   821: aload_1        
        //   822: ifnull          834
        //   825: aload_1        
        //   826: invokeinterface android/database/Cursor.close:()V
        //   831: iload           5
        //   833: istore_2       
        //   834: goto            1187
        //   837: astore          9
        //   839: goto            873
        //   842: astore          10
        //   844: goto            876
        //   847: ldc             "DynamiteModule"
        //   849: ldc_w           "Failed to retrieve remote module version."
        //   852: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   855: pop            
        //   856: iload_3        
        //   857: istore_2       
        //   858: aload_1        
        //   859: ifnull          1187
        //   862: aload_1        
        //   863: invokeinterface android/database/Cursor.close:()V
        //   868: iload_3        
        //   869: istore_2       
        //   870: goto            1187
        //   873: goto            1194
        //   876: goto            1094
        //   879: iload           5
        //   881: iconst_2       
        //   882: if_icmpne       983
        //   885: aload           10
        //   887: astore          9
        //   889: ldc             "DynamiteModule"
        //   891: ldc_w           "IDynamite loader version = 2, no high precision latency measurement."
        //   894: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   897: pop            
        //   898: aload           10
        //   900: astore          9
        //   902: aload_0        
        //   903: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //   906: astore          12
        //   908: aload           10
        //   910: astore          9
        //   912: aload           13
        //   914: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //   917: astore          14
        //   919: aload           10
        //   921: astore          9
        //   923: aload           14
        //   925: aload           12
        //   927: invokestatic    B2/i.b:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //   930: aload           10
        //   932: astore          9
        //   934: aload           14
        //   936: aload_1        
        //   937: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   940: aload           10
        //   942: astore          9
        //   944: aload           14
        //   946: iload_2        
        //   947: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   950: aload           10
        //   952: astore          9
        //   954: aload           13
        //   956: aload           14
        //   958: iconst_5       
        //   959: invokevirtual   B2/a.e0:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   962: astore_1       
        //   963: aload           10
        //   965: astore          9
        //   967: aload_1        
        //   968: invokevirtual   android/os/Parcel.readInt:()I
        //   971: istore_2       
        //   972: aload           10
        //   974: astore          9
        //   976: aload_1        
        //   977: invokevirtual   android/os/Parcel.recycle:()V
        //   980: goto            834
        //   983: aload           10
        //   985: astore          9
        //   987: ldc             "DynamiteModule"
        //   989: ldc_w           "IDynamite loader version < 2, falling back to getModuleVersion2"
        //   992: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   995: pop            
        //   996: aload           10
        //   998: astore          9
        //  1000: aload_0        
        //  1001: invokestatic    com/google/android/gms/dynamic/ObjectWrapper.wrap:(Ljava/lang/Object;)Lt2/b;
        //  1004: astore          12
        //  1006: aload           10
        //  1008: astore          9
        //  1010: aload           13
        //  1012: invokevirtual   B2/a.P1:()Landroid/os/Parcel;
        //  1015: astore          14
        //  1017: aload           10
        //  1019: astore          9
        //  1021: aload           14
        //  1023: aload           12
        //  1025: invokestatic    B2/i.b:(Landroid/os/Parcel;Landroid/os/IInterface;)V
        //  1028: aload           10
        //  1030: astore          9
        //  1032: aload           14
        //  1034: aload_1        
        //  1035: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //  1038: aload           10
        //  1040: astore          9
        //  1042: aload           14
        //  1044: iload_2        
        //  1045: invokevirtual   android/os/Parcel.writeInt:(I)V
        //  1048: aload           10
        //  1050: astore          9
        //  1052: aload           13
        //  1054: aload           14
        //  1056: iconst_3       
        //  1057: invokevirtual   B2/a.e0:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //  1060: astore_1       
        //  1061: aload           10
        //  1063: astore          9
        //  1065: aload_1        
        //  1066: invokevirtual   android/os/Parcel.readInt:()I
        //  1069: istore_2       
        //  1070: aload           10
        //  1072: astore          9
        //  1074: aload_1        
        //  1075: invokevirtual   android/os/Parcel.recycle:()V
        //  1078: goto            834
        //  1081: aload           9
        //  1083: astore_1       
        //  1084: aload           10
        //  1086: astore          9
        //  1088: goto            1194
        //  1091: aload           11
        //  1093: astore_1       
        //  1094: aload_1        
        //  1095: astore          9
        //  1097: aload           10
        //  1099: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1102: astore          10
        //  1104: aload_1        
        //  1105: astore          9
        //  1107: aload           10
        //  1109: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1112: invokevirtual   java/lang/String.length:()I
        //  1115: istore_2       
        //  1116: aload_1        
        //  1117: astore          9
        //  1119: new             Ljava/lang/StringBuilder;
        //  1122: astore          11
        //  1124: aload_1        
        //  1125: astore          9
        //  1127: aload           11
        //  1129: iload_2        
        //  1130: bipush          42
        //  1132: iadd           
        //  1133: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1136: aload_1        
        //  1137: astore          9
        //  1139: aload           11
        //  1141: ldc_w           "Failed to retrieve remote module version: "
        //  1144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1147: pop            
        //  1148: aload_1        
        //  1149: astore          9
        //  1151: aload           11
        //  1153: aload           10
        //  1155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1158: pop            
        //  1159: aload_1        
        //  1160: astore          9
        //  1162: ldc             "DynamiteModule"
        //  1164: aload           11
        //  1166: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1169: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  1172: pop            
        //  1173: iload_3        
        //  1174: istore_2       
        //  1175: aload_1        
        //  1176: ifnull          1187
        //  1179: aload_1        
        //  1180: invokeinterface android/database/Cursor.close:()V
        //  1185: iload_3        
        //  1186: istore_2       
        //  1187: iload_2        
        //  1188: ireturn        
        //  1189: astore          10
        //  1191: goto            1081
        //  1194: aload_1        
        //  1195: ifnull          1204
        //  1198: aload_1        
        //  1199: invokeinterface android/database/Cursor.close:()V
        //  1204: aload           9
        //  1206: athrow         
        //  1207: aload           17
        //  1209: monitorexit    
        //  1210: aload_1        
        //  1211: athrow         
        //  1212: aload_0        
        //  1213: aload_1        
        //  1214: invokestatic    q2/b.a:(Landroid/content/Context;Ljava/lang/Throwable;)V
        //  1217: aload_1        
        //  1218: athrow         
        //  1219: astore          9
        //  1221: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      6      453    457    Any
        //  6      11     136    1212   Any
        //  34     71     359    361    Ljava/lang/ClassNotFoundException;
        //  34     71     354    359    Ljava/lang/IllegalAccessException;
        //  34     71     349    354    Ljava/lang/NoSuchFieldException;
        //  34     71     136    1212   Any
        //  71     95     98     349    Any
        //  108    113    1219   1224   Lu2/a;
        //  108    113    98     349    Any
        //  113    118    98     349    Any
        //  121    131    98     349    Any
        //  131    134    136    1212   Any
        //  140    159    98     349    Any
        //  167    181    304    323    Lu2/a;
        //  167    181    98     349    Any
        //  186    194    304    323    Lu2/a;
        //  186    194    98     349    Any
        //  197    202    304    323    Lu2/a;
        //  197    202    98     349    Any
        //  210    241    304    323    Lu2/a;
        //  210    241    98     349    Any
        //  244    268    304    323    Lu2/a;
        //  244    268    98     349    Any
        //  268    286    304    323    Lu2/a;
        //  268    286    98     349    Any
        //  286    289    98     349    Any
        //  289    292    136    1212   Any
        //  295    298    98     349    Any
        //  298    301    136    1212   Any
        //  306    320    98     349    Any
        //  323    337    98     349    Any
        //  337    340    98     349    Any
        //  343    346    98     349    Any
        //  346    349    359    361    Ljava/lang/ClassNotFoundException;
        //  346    349    354    359    Ljava/lang/IllegalAccessException;
        //  346    349    349    354    Ljava/lang/NoSuchFieldException;
        //  346    349    136    1212   Any
        //  361    423    136    1212   Any
        //  423    428    136    1212   Any
        //  428    431    136    1212   Any
        //  431    438    453    457    Any
        //  443    451    457    512    Lu2/a;
        //  443    451    453    457    Any
        //  458    510    453    457    Any
        //  512    518    453    457    Any
        //  532    546    632    637    Landroid/os/RemoteException;
        //  532    546    1189   1091   Any
        //  550    557    632    637    Landroid/os/RemoteException;
        //  550    557    1189   1091   Any
        //  561    566    632    637    Landroid/os/RemoteException;
        //  561    566    1189   1091   Any
        //  576    581    632    637    Landroid/os/RemoteException;
        //  576    581    1189   1091   Any
        //  585    595    632    637    Landroid/os/RemoteException;
        //  585    595    1189   1091   Any
        //  604    611    632    637    Landroid/os/RemoteException;
        //  604    611    1189   1091   Any
        //  620    629    632    637    Landroid/os/RemoteException;
        //  620    629    1189   1091   Any
        //  641    647    632    637    Landroid/os/RemoteException;
        //  641    647    1189   1091   Any
        //  651    665    632    637    Landroid/os/RemoteException;
        //  651    665    1189   1091   Any
        //  669    676    632    637    Landroid/os/RemoteException;
        //  669    676    1189   1091   Any
        //  680    687    632    637    Landroid/os/RemoteException;
        //  680    687    1189   1091   Any
        //  691    697    632    637    Landroid/os/RemoteException;
        //  691    697    1189   1091   Any
        //  701    707    632    637    Landroid/os/RemoteException;
        //  701    707    1189   1091   Any
        //  711    718    632    637    Landroid/os/RemoteException;
        //  711    718    1189   1091   Any
        //  722    741    632    637    Landroid/os/RemoteException;
        //  722    741    1189   1091   Any
        //  745    754    842    847    Landroid/os/RemoteException;
        //  745    754    837    842    Any
        //  757    766    842    847    Landroid/os/RemoteException;
        //  757    766    837    842    Any
        //  771    781    842    847    Landroid/os/RemoteException;
        //  771    781    837    842    Any
        //  786    800    842    847    Landroid/os/RemoteException;
        //  786    800    837    842    Any
        //  825    831    453    457    Any
        //  847    856    842    847    Landroid/os/RemoteException;
        //  847    856    837    842    Any
        //  862    868    453    457    Any
        //  889    898    632    637    Landroid/os/RemoteException;
        //  889    898    1189   1091   Any
        //  902    908    632    637    Landroid/os/RemoteException;
        //  902    908    1189   1091   Any
        //  912    919    632    637    Landroid/os/RemoteException;
        //  912    919    1189   1091   Any
        //  923    930    632    637    Landroid/os/RemoteException;
        //  923    930    1189   1091   Any
        //  934    940    632    637    Landroid/os/RemoteException;
        //  934    940    1189   1091   Any
        //  944    950    632    637    Landroid/os/RemoteException;
        //  944    950    1189   1091   Any
        //  954    963    632    637    Landroid/os/RemoteException;
        //  954    963    1189   1091   Any
        //  967    972    632    637    Landroid/os/RemoteException;
        //  967    972    1189   1091   Any
        //  976    980    632    637    Landroid/os/RemoteException;
        //  976    980    1189   1091   Any
        //  987    996    632    637    Landroid/os/RemoteException;
        //  987    996    1189   1091   Any
        //  1000   1006   632    637    Landroid/os/RemoteException;
        //  1000   1006   1189   1091   Any
        //  1010   1017   632    637    Landroid/os/RemoteException;
        //  1010   1017   1189   1091   Any
        //  1021   1028   632    637    Landroid/os/RemoteException;
        //  1021   1028   1189   1091   Any
        //  1032   1038   632    637    Landroid/os/RemoteException;
        //  1032   1038   1189   1091   Any
        //  1042   1048   632    637    Landroid/os/RemoteException;
        //  1042   1048   1189   1091   Any
        //  1052   1061   632    637    Landroid/os/RemoteException;
        //  1052   1061   1189   1091   Any
        //  1065   1070   632    637    Landroid/os/RemoteException;
        //  1065   1070   1189   1091   Any
        //  1074   1078   632    637    Landroid/os/RemoteException;
        //  1074   1078   1189   1091   Any
        //  1097   1104   1189   1091   Any
        //  1107   1116   1189   1091   Any
        //  1119   1124   1189   1091   Any
        //  1127   1136   1189   1091   Any
        //  1139   1148   1189   1091   Any
        //  1151   1159   1189   1091   Any
        //  1162   1173   1189   1091   Any
        //  1179   1185   453    457    Any
        //  1198   1204   453    457    Any
        //  1204   1207   453    457    Any
        //  1207   1210   136    1212   Any
        //  1210   1212   453    457    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 584 out of bounds for length 584
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:284)
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
    
    public static boolean e(final Context context) {
        final Boolean true = Boolean.TRUE;
        if (true.equals((Object)null)) {
            return true;
        }
        if (true.equals((Object)u2.d.i)) {
            return true;
        }
        final Boolean i = u2.d.i;
        int n = 0;
        final boolean b = false;
        if (i == null) {
            final PackageManager packageManager = context.getPackageManager();
            int n2;
            if (Build$VERSION.SDK_INT >= 29) {
                n2 = 268435456;
            }
            else {
                n2 = 0;
            }
            final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", n2);
            int n3 = b ? 1 : 0;
            if (e2.f.b.c(context, 10000000) == 0) {
                n3 = (b ? 1 : 0);
                if (resolveContentProvider != null) {
                    n3 = (b ? 1 : 0);
                    if ("com.google.android.gms".equals((Object)resolveContentProvider.packageName)) {
                        n3 = 1;
                    }
                }
            }
            u2.d.i = (boolean)(n3 != 0);
            if ((n = n3) != 0) {
                final ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
                n = n3;
                if (applicationInfo != null) {
                    n = n3;
                    if ((applicationInfo.flags & 0x81) == 0x0) {
                        Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                        u2.d.g = true;
                        n = n3;
                    }
                }
            }
        }
        if (n == 0) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return n != 0;
    }
    
    public static int f(final Context p0, final String p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          17
        //     3: aconst_null    
        //     4: astore          18
        //     6: aconst_null    
        //     7: astore          16
        //     9: aload           17
        //    11: astore          13
        //    13: aload           18
        //    15: astore          14
        //    17: getstatic       u2/d.k:Lcom/google/android/gms/internal/ads/T3;
        //    20: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    23: checkcast       Ljava/lang/Long;
        //    26: invokevirtual   java/lang/Long.longValue:()J
        //    29: lstore          11
        //    31: ldc_w           "api_force_staging"
        //    34: astore          15
        //    36: iconst_1       
        //    37: istore          6
        //    39: iconst_1       
        //    40: iload_2        
        //    41: if_icmpeq       49
        //    44: ldc_w           "api"
        //    47: astore          15
        //    49: aload           17
        //    51: astore          13
        //    53: aload           18
        //    55: astore          14
        //    57: new             Landroid/net/Uri$Builder;
        //    60: astore          19
        //    62: aload           17
        //    64: astore          13
        //    66: aload           18
        //    68: astore          14
        //    70: aload           19
        //    72: invokespecial   android/net/Uri$Builder.<init>:()V
        //    75: aload           17
        //    77: astore          13
        //    79: aload           18
        //    81: astore          14
        //    83: aload           19
        //    85: ldc_w           "content"
        //    88: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    91: ldc_w           "com.google.android.gms.chimera"
        //    94: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    97: aload           15
        //    99: invokevirtual   android/net/Uri$Builder.path:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   102: aload_1        
        //   103: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   106: ldc_w           "requestStartUptime"
        //   109: lload           11
        //   111: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   114: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   117: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   120: astore          15
        //   122: aload           17
        //   124: astore          13
        //   126: aload           18
        //   128: astore          14
        //   130: aload_0        
        //   131: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   134: aload           15
        //   136: invokevirtual   android/content/ContentResolver.acquireUnstableContentProviderClient:(Landroid/net/Uri;)Landroid/content/ContentProviderClient;
        //   139: astore_1       
        //   140: iconst_0       
        //   141: istore_2       
        //   142: aload_1        
        //   143: ifnonnull       151
        //   146: aconst_null    
        //   147: astore_0       
        //   148: goto            496
        //   151: aload_1        
        //   152: aload           15
        //   154: aconst_null    
        //   155: aconst_null    
        //   156: aconst_null    
        //   157: aconst_null    
        //   158: invokevirtual   android/content/ContentProviderClient.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   161: astore          13
        //   163: aload           13
        //   165: ifnonnull       184
        //   168: aload           17
        //   170: astore          13
        //   172: aload           18
        //   174: astore          14
        //   176: aload_1        
        //   177: invokevirtual   android/content/ContentProviderClient.release:()Z
        //   180: pop            
        //   181: goto            146
        //   184: aload           13
        //   186: invokeinterface android/database/Cursor.getCount:()I
        //   191: istore          7
        //   193: aload           13
        //   195: invokeinterface android/database/Cursor.getColumnCount:()I
        //   200: istore          8
        //   202: new             Landroid/database/MatrixCursor;
        //   205: astore_0       
        //   206: aload_0        
        //   207: aload           13
        //   209: invokeinterface android/database/Cursor.getColumnNames:()[Ljava/lang/String;
        //   214: iload           7
        //   216: invokespecial   android/database/MatrixCursor.<init>:([Ljava/lang/String;I)V
        //   219: iconst_0       
        //   220: istore          4
        //   222: iload           4
        //   224: iload           7
        //   226: if_icmpge       426
        //   229: aload           13
        //   231: iload           4
        //   233: invokeinterface android/database/Cursor.moveToPosition:(I)Z
        //   238: ifeq            413
        //   241: iload           8
        //   243: anewarray       Ljava/lang/Object;
        //   246: astore          14
        //   248: iconst_0       
        //   249: istore          5
        //   251: iload           5
        //   253: iload           8
        //   255: if_icmpge       401
        //   258: aload           13
        //   260: iload           5
        //   262: invokeinterface android/database/Cursor.getType:(I)I
        //   267: istore          9
        //   269: iload           9
        //   271: ifeq            389
        //   274: iload           9
        //   276: iconst_1       
        //   277: if_icmpeq       369
        //   280: iload           9
        //   282: iconst_2       
        //   283: if_icmpeq       349
        //   286: iload           9
        //   288: iconst_3       
        //   289: if_icmpeq       332
        //   292: iload           9
        //   294: iconst_4       
        //   295: if_icmpne       319
        //   298: aload           14
        //   300: iload           5
        //   302: aload           13
        //   304: iload           5
        //   306: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   311: aastore        
        //   312: goto            395
        //   315: astore_0       
        //   316: goto            453
        //   319: new             Landroid/os/RemoteException;
        //   322: astore_0       
        //   323: aload_0        
        //   324: ldc_w           "Unknown column type"
        //   327: invokespecial   android/os/RemoteException.<init>:(Ljava/lang/String;)V
        //   330: aload_0        
        //   331: athrow         
        //   332: aload           14
        //   334: iload           5
        //   336: aload           13
        //   338: iload           5
        //   340: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   345: aastore        
        //   346: goto            395
        //   349: aload           14
        //   351: iload           5
        //   353: aload           13
        //   355: iload           5
        //   357: invokeinterface android/database/Cursor.getDouble:(I)D
        //   362: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   365: aastore        
        //   366: goto            395
        //   369: aload           14
        //   371: iload           5
        //   373: aload           13
        //   375: iload           5
        //   377: invokeinterface android/database/Cursor.getLong:(I)J
        //   382: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   385: aastore        
        //   386: goto            395
        //   389: aload           14
        //   391: iload           5
        //   393: aconst_null    
        //   394: aastore        
        //   395: iinc            5, 1
        //   398: goto            251
        //   401: aload_0        
        //   402: aload           14
        //   404: invokevirtual   android/database/MatrixCursor.addRow:([Ljava/lang/Object;)V
        //   407: iinc            4, 1
        //   410: goto            222
        //   413: new             Landroid/os/RemoteException;
        //   416: astore_0       
        //   417: aload_0        
        //   418: ldc_w           "Cursor read incomplete (ContentProvider dead?)"
        //   421: invokespecial   android/os/RemoteException.<init>:(Ljava/lang/String;)V
        //   424: aload_0        
        //   425: athrow         
        //   426: aload           13
        //   428: invokeinterface android/database/Cursor.close:()V
        //   433: aload           17
        //   435: astore          13
        //   437: aload           18
        //   439: astore          14
        //   441: aload_1        
        //   442: invokevirtual   android/content/ContentProviderClient.release:()Z
        //   445: pop            
        //   446: goto            496
        //   449: astore_0       
        //   450: goto            473
        //   453: aload           13
        //   455: invokeinterface android/database/Cursor.close:()V
        //   460: goto            471
        //   463: astore          13
        //   465: aload_0        
        //   466: aload           13
        //   468: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   471: aload_0        
        //   472: athrow         
        //   473: aload           17
        //   475: astore          13
        //   477: aload           18
        //   479: astore          14
        //   481: aload_1        
        //   482: invokevirtual   android/content/ContentProviderClient.release:()Z
        //   485: pop            
        //   486: aload           17
        //   488: astore          13
        //   490: aload           18
        //   492: astore          14
        //   494: aload_0        
        //   495: athrow         
        //   496: aload_0        
        //   497: ifnull          759
        //   500: aload_0        
        //   501: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   506: ifeq            759
        //   509: aload_0        
        //   510: iconst_0       
        //   511: invokeinterface android/database/Cursor.getInt:(I)I
        //   516: istore          5
        //   518: iload           5
        //   520: ifle            676
        //   523: ldc             Lu2/d;.class
        //   525: dup            
        //   526: astore          20
        //   528: monitorenter   
        //   529: aload_0        
        //   530: iconst_2       
        //   531: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   536: putstatic       u2/d.f:Ljava/lang/String;
        //   539: aload_0        
        //   540: ldc_w           "loaderVersion"
        //   543: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   548: istore          4
        //   550: iload           4
        //   552: iflt            573
        //   555: aload_0        
        //   556: iload           4
        //   558: invokeinterface android/database/Cursor.getInt:(I)I
        //   563: putstatic       u2/d.h:I
        //   566: goto            573
        //   569: astore_1       
        //   570: goto            679
        //   573: aload_0        
        //   574: ldc_w           "disableStandaloneDynamiteLoader2"
        //   577: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   582: istore          4
        //   584: iload           4
        //   586: iflt            617
        //   589: aload_0        
        //   590: iload           4
        //   592: invokeinterface android/database/Cursor.getInt:(I)I
        //   597: ifeq            606
        //   600: iconst_1       
        //   601: istore          10
        //   603: goto            609
        //   606: iconst_0       
        //   607: istore          10
        //   609: iload           10
        //   611: putstatic       u2/d.g:Z
        //   614: goto            620
        //   617: iconst_0       
        //   618: istore          10
        //   620: aload           20
        //   622: monitorexit    
        //   623: getstatic       u2/d.j:Ljava/lang/ThreadLocal;
        //   626: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //   629: checkcast       Lu2/h;
        //   632: astore_1       
        //   633: aload_1        
        //   634: ifnull          656
        //   637: aload_1        
        //   638: getfield        u2/h.a:Landroid/database/Cursor;
        //   641: ifnonnull       656
        //   644: aload_1        
        //   645: aload_0        
        //   646: putfield        u2/h.a:Landroid/database/Cursor;
        //   649: iload           6
        //   651: istore          4
        //   653: goto            659
        //   656: iconst_0       
        //   657: istore          4
        //   659: iload           10
        //   661: istore_2       
        //   662: iload           4
        //   664: ifeq            676
        //   667: aload           16
        //   669: astore_0       
        //   670: iload           10
        //   672: istore_2       
        //   673: goto            693
        //   676: goto            693
        //   679: aload           20
        //   681: monitorexit    
        //   682: aload_1        
        //   683: athrow         
        //   684: astore          13
        //   686: goto            781
        //   689: astore_1       
        //   690: goto            789
        //   693: iload_3        
        //   694: ifeq            746
        //   697: iload_2        
        //   698: ifne            704
        //   701: goto            746
        //   704: aload_0        
        //   705: astore          13
        //   707: aload_0        
        //   708: astore          14
        //   710: new             Lu2/a;
        //   713: astore_1       
        //   714: aload_0        
        //   715: astore          13
        //   717: aload_0        
        //   718: astore          14
        //   720: aload_1        
        //   721: ldc_w           "forcing fallback to container DynamiteLoader impl"
        //   724: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   727: aload_0        
        //   728: astore          13
        //   730: aload_0        
        //   731: astore          14
        //   733: aload_1        
        //   734: athrow         
        //   735: astore_0       
        //   736: aload           13
        //   738: astore_1       
        //   739: goto            911
        //   742: astore_0       
        //   743: goto            794
        //   746: aload_0        
        //   747: ifnull          756
        //   750: aload_0        
        //   751: invokeinterface android/database/Cursor.close:()V
        //   756: iload           5
        //   758: ireturn        
        //   759: ldc             "DynamiteModule"
        //   761: ldc_w           "Failed to retrieve remote module version."
        //   764: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   767: pop            
        //   768: new             Lu2/a;
        //   771: astore_1       
        //   772: aload_1        
        //   773: ldc_w           "Failed to connect to dynamite module ContentResolver."
        //   776: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
        //   779: aload_1        
        //   780: athrow         
        //   781: aload_0        
        //   782: astore_1       
        //   783: aload           13
        //   785: astore_0       
        //   786: goto            911
        //   789: aload_0        
        //   790: astore          14
        //   792: aload_1        
        //   793: astore_0       
        //   794: aload           14
        //   796: astore          13
        //   798: aload_0        
        //   799: instanceof      Lu2/a;
        //   802: ifne            905
        //   805: aload           14
        //   807: astore          13
        //   809: new             Lu2/a;
        //   812: astore          15
        //   814: aload           14
        //   816: astore          13
        //   818: aload_0        
        //   819: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   822: astore_1       
        //   823: aload           14
        //   825: astore          13
        //   827: aload_1        
        //   828: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   831: invokevirtual   java/lang/String.length:()I
        //   834: istore          4
        //   836: aload           14
        //   838: astore          13
        //   840: new             Ljava/lang/StringBuilder;
        //   843: astore          16
        //   845: aload           14
        //   847: astore          13
        //   849: aload           16
        //   851: iload           4
        //   853: bipush          25
        //   855: iadd           
        //   856: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   859: aload           14
        //   861: astore          13
        //   863: aload           16
        //   865: ldc_w           "V2 version check failed: "
        //   868: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   871: pop            
        //   872: aload           14
        //   874: astore          13
        //   876: aload           16
        //   878: aload_1        
        //   879: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   882: pop            
        //   883: aload           14
        //   885: astore          13
        //   887: aload           15
        //   889: aload           16
        //   891: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   894: aload_0        
        //   895: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   898: aload           14
        //   900: astore          13
        //   902: aload           15
        //   904: athrow         
        //   905: aload           14
        //   907: astore          13
        //   909: aload_0        
        //   910: athrow         
        //   911: aload_1        
        //   912: ifnull          921
        //   915: aload_1        
        //   916: invokeinterface android/database/Cursor.close:()V
        //   921: aload_0        
        //   922: athrow         
        //   923: astore_0       
        //   924: goto            168
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  17     31     742    746    Ljava/lang/Exception;
        //  17     31     735    742    Any
        //  57     62     742    746    Ljava/lang/Exception;
        //  57     62     735    742    Any
        //  70     75     742    746    Ljava/lang/Exception;
        //  70     75     735    742    Any
        //  83     122    742    746    Ljava/lang/Exception;
        //  83     122    735    742    Any
        //  130    140    742    746    Ljava/lang/Exception;
        //  130    140    735    742    Any
        //  151    163    923    927    Landroid/os/RemoteException;
        //  151    163    449    496    Any
        //  176    181    742    746    Ljava/lang/Exception;
        //  176    181    735    742    Any
        //  184    219    315    473    Any
        //  229    248    315    473    Any
        //  258    269    315    473    Any
        //  298    312    315    473    Any
        //  319    332    315    473    Any
        //  332    346    315    473    Any
        //  349    366    315    473    Any
        //  369    386    315    473    Any
        //  401    407    315    473    Any
        //  413    426    315    473    Any
        //  426    433    923    927    Landroid/os/RemoteException;
        //  426    433    449    496    Any
        //  441    446    742    746    Ljava/lang/Exception;
        //  441    446    735    742    Any
        //  453    460    463    471    Any
        //  465    471    923    927    Landroid/os/RemoteException;
        //  465    471    449    496    Any
        //  471    473    923    927    Landroid/os/RemoteException;
        //  471    473    449    496    Any
        //  481    486    742    746    Ljava/lang/Exception;
        //  481    486    735    742    Any
        //  494    496    742    746    Ljava/lang/Exception;
        //  494    496    735    742    Any
        //  500    518    689    693    Ljava/lang/Exception;
        //  500    518    684    689    Any
        //  523    529    689    693    Ljava/lang/Exception;
        //  523    529    684    689    Any
        //  529    550    569    684    Any
        //  555    566    569    684    Any
        //  573    584    569    684    Any
        //  589    600    569    684    Any
        //  609    614    569    684    Any
        //  620    623    569    684    Any
        //  623    633    689    693    Ljava/lang/Exception;
        //  623    633    684    689    Any
        //  637    649    689    693    Ljava/lang/Exception;
        //  637    649    684    689    Any
        //  679    682    569    684    Any
        //  682    684    689    693    Ljava/lang/Exception;
        //  682    684    684    689    Any
        //  710    714    742    746    Ljava/lang/Exception;
        //  710    714    735    742    Any
        //  720    727    742    746    Ljava/lang/Exception;
        //  720    727    735    742    Any
        //  733    735    742    746    Ljava/lang/Exception;
        //  733    735    735    742    Any
        //  759    781    689    693    Ljava/lang/Exception;
        //  759    781    684    689    Any
        //  798    805    735    742    Any
        //  809    814    735    742    Any
        //  818    823    735    742    Any
        //  827    836    735    742    Any
        //  840    845    735    742    Any
        //  849    859    735    742    Any
        //  863    872    735    742    Any
        //  876    883    735    742    Any
        //  887    898    735    742    Any
        //  902    905    735    742    Any
        //  909    911    735    742    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 426 out of bounds for length 426
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:284)
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
    
    public static void g(final ClassLoader classLoader) {
        a n = null;
        Label_0088: {
            IBinder binder;
            try {
                final Class loadClass = classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2");
                n = null;
                binder = (IBinder)loadClass.getConstructor((Class[])null).newInstance((Object[])null);
                if (binder == null) {
                    break Label_0088;
                }
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof j) {
                    n = (j)queryLocalInterface;
                    break Label_0088;
                }
            }
            catch (final NoSuchMethodException ex) {
                throw new Exception("Failed to instantiate dynamite loader", (Throwable)ex);
            }
            catch (final InvocationTargetException ex) {
                throw new Exception("Failed to instantiate dynamite loader", (Throwable)ex);
            }
            catch (final InstantiationException ex) {
                throw new Exception("Failed to instantiate dynamite loader", (Throwable)ex);
            }
            catch (final IllegalAccessException ex) {
                throw new Exception("Failed to instantiate dynamite loader", (Throwable)ex);
            }
            catch (final ClassNotFoundException ex) {
                throw new Exception("Failed to instantiate dynamite loader", (Throwable)ex);
            }
            n = new a(binder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 0);
        }
        u2.d.n = (j)n;
    }
    
    public static i h(final Context context) {
        final Class<d> clazz;
        monitorenter(clazz = d.class);
        Label_0021: {
            try {
                final i m = u2.d.m;
                if (m != null) {
                    monitorexit(clazz);
                    return m;
                }
                break Label_0021;
            }
            finally {
                monitorexit(clazz);
            Label_0096:
                while (true) {
                    IBinder binder = null;
                Block_6_Outer:
                    while (true) {
                        final Exception ex;
                        final String message = ((Throwable)ex).getMessage();
                        final StringBuilder sb = new StringBuilder(String.valueOf((Object)message).length() + 45);
                        sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                        sb.append(message);
                        Log.e("DynamiteModule", sb.toString());
                        while (true) {
                            Label_0157: {
                                break Label_0157;
                                final a i;
                                u2.d.m = (i)i;
                                monitorexit(clazz);
                                return (i)i;
                            }
                            monitorexit(clazz);
                            return null;
                            final a i;
                            iftrue(Label_0157:)(i == null);
                            continue;
                        }
                        try {
                            binder = context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                            if (binder == null) {
                                final a i = null;
                                continue Label_0096;
                            }
                            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                            if (queryLocalInterface instanceof i) {
                                final a i = (i)queryLocalInterface;
                                continue Label_0096;
                            }
                        }
                        catch (final Exception ex) {
                            continue Block_6_Outer;
                        }
                        break;
                    }
                    final a i = new a(binder, "com.google.android.gms.dynamite.IDynamiteLoader", 0);
                    continue Label_0096;
                }
            }
        }
    }
    
    public final IBinder b(final String s) {
        IBinder binder = null;
        try {
            binder = this.a.getClassLoader().loadClass(s).newInstance();
            return binder;
        }
        catch (final IllegalAccessException binder) {}
        catch (final InstantiationException binder) {}
        catch (final ClassNotFoundException ex) {}
        throw new Exception("Failed to instantiate module class: ".concat(s), (Throwable)binder);
    }
}

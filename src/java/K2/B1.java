package K2;

import android.os.SystemClock;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import e2.f;
import java.util.List;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import h2.A;
import h2.b;
import android.os.Looper;
import com.google.android.gms.internal.measurement.a3;
import C2.v;
import java.util.concurrent.atomic.AtomicReference;
import i2.a;
import android.os.Parcelable;
import java.util.ArrayList;
import E1.d;

public final class b1 extends Z
{
    public final h1 E;
    public H F;
    public volatile Boolean G;
    public final c1 H;
    public final d I;
    public final ArrayList J;
    public final c1 K;
    
    public b1(final n0 n0) {
        super(n0);
        this.J = new ArrayList();
        this.I = new d(n0.P);
        this.E = new h1(this);
        this.H = new c1(this, n0, 0);
        this.K = new c1(this, n0, 1);
    }
    
    @Override
    public final boolean B() {
        return false;
    }
    
    public final void C(final c c) {
        this.v();
        this.z();
        final J p = ((n0)super.C).p();
        p.u();
        final byte[] l0 = J1.l0((Parcelable)c);
        boolean d;
        if (l0.length > 131072) {
            p.j().I.f("Conditional user property too long for local database. Sending directly to service");
            d = false;
        }
        else {
            d = p.D(2, l0);
        }
        this.E((Runnable)new e1(this, this.O(true), d, new c(c), c));
    }
    
    public final void D(final H p0, final a p1, final B1 p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   K2/B.v:()V
        //     4: aload_0        
        //     5: invokevirtual   K2/Z.z:()V
        //     8: bipush          100
        //    10: istore          5
        //    12: iconst_0       
        //    13: istore          4
        //    15: iload           4
        //    17: sipush          1001
        //    20: if_icmpge       1882
        //    23: iload           5
        //    25: bipush          100
        //    27: if_icmpne       1882
        //    30: new             Ljava/util/ArrayList;
        //    33: dup            
        //    34: invokespecial   java/util/ArrayList.<init>:()V
        //    37: astore          23
        //    39: aload_0        
        //    40: getfield        C/u.C:Ljava/lang/Object;
        //    43: checkcast       LK2/n0;
        //    46: astore          22
        //    48: aload           22
        //    50: invokevirtual   K2/n0.p:()LK2/J;
        //    53: astore          24
        //    55: aload           24
        //    57: invokevirtual   K2/B.v:()V
        //    60: aload           24
        //    62: getfield        K2/J.F:Z
        //    65: ifeq            82
        //    68: iload           4
        //    70: istore          5
        //    72: iload           5
        //    74: istore          4
        //    76: aconst_null    
        //    77: astore          16
        //    79: goto            1447
        //    82: new             Ljava/util/ArrayList;
        //    85: dup            
        //    86: invokespecial   java/util/ArrayList.<init>:()V
        //    89: astore          21
        //    91: aload           24
        //    93: getfield        C/u.C:Ljava/lang/Object;
        //    96: checkcast       LK2/n0;
        //    99: getfield        K2/n0.C:Landroid/content/Context;
        //   102: ldc             "google_app_measurement_local.db"
        //   104: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //   107: invokevirtual   java/io/File.exists:()Z
        //   110: ifne            120
        //   113: aload           21
        //   115: astore          16
        //   117: goto            1447
        //   120: iconst_5       
        //   121: istore          7
        //   123: iconst_0       
        //   124: istore          6
        //   126: iload           6
        //   128: iconst_5       
        //   129: if_icmpge       1430
        //   132: aload           24
        //   134: invokevirtual   K2/J.G:()Landroid/database/sqlite/SQLiteDatabase;
        //   137: astore          16
        //   139: aload           16
        //   141: ifnonnull       211
        //   144: aload           24
        //   146: iconst_1       
        //   147: putfield        K2/J.F:Z
        //   150: iload           4
        //   152: istore          5
        //   154: aload           16
        //   156: ifnull          72
        //   159: aload           16
        //   161: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //   164: iload           4
        //   166: istore          5
        //   168: goto            72
        //   171: astore_1       
        //   172: aconst_null    
        //   173: astore          19
        //   175: goto            1406
        //   178: astore          20
        //   180: aconst_null    
        //   181: astore          17
        //   183: goto            1141
        //   186: astore          17
        //   188: goto            1116
        //   191: astore          17
        //   193: aconst_null    
        //   194: astore          18
        //   196: aload           17
        //   198: astore          20
        //   200: aload           18
        //   202: astore          17
        //   204: iload           4
        //   206: istore          5
        //   208: goto            1320
        //   211: aload           16
        //   213: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   216: aload           16
        //   218: invokestatic    K2/J.C:(Landroid/database/sqlite/SQLiteDatabase;)J
        //   221: lstore          11
        //   223: ldc2_w          -1
        //   226: lstore          9
        //   228: lload           11
        //   230: ldc2_w          -1
        //   233: lcmp           
        //   234: ifeq            258
        //   237: ldc             "rowid<?"
        //   239: astore          17
        //   241: iconst_1       
        //   242: anewarray       Ljava/lang/String;
        //   245: dup            
        //   246: iconst_0       
        //   247: lload           11
        //   249: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   252: aastore        
        //   253: astore          18
        //   255: goto            264
        //   258: aconst_null    
        //   259: astore          17
        //   261: aconst_null    
        //   262: astore          18
        //   264: bipush          100
        //   266: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   269: astore          19
        //   271: aload           16
        //   273: ldc             "messages"
        //   275: iconst_3       
        //   276: anewarray       Ljava/lang/String;
        //   279: dup            
        //   280: iconst_0       
        //   281: ldc             "rowid"
        //   283: aastore        
        //   284: dup            
        //   285: iconst_1       
        //   286: ldc             "type"
        //   288: aastore        
        //   289: dup            
        //   290: iconst_2       
        //   291: ldc             "entry"
        //   293: aastore        
        //   294: aload           17
        //   296: aload           18
        //   298: aconst_null    
        //   299: aconst_null    
        //   300: ldc             "rowid asc"
        //   302: aload           19
        //   304: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   307: astore          17
        //   309: aload           16
        //   311: astore          18
        //   313: aload           17
        //   315: astore          19
        //   317: aload           17
        //   319: invokeinterface android/database/Cursor.moveToNext:()Z
        //   324: istore          15
        //   326: iload           15
        //   328: ifeq            983
        //   331: aload           16
        //   333: astore          18
        //   335: aload           17
        //   337: astore          19
        //   339: aload           17
        //   341: iconst_0       
        //   342: invokeinterface android/database/Cursor.getLong:(I)J
        //   347: lstore          9
        //   349: aload           16
        //   351: astore          18
        //   353: aload           17
        //   355: astore          19
        //   357: aload           17
        //   359: iconst_1       
        //   360: invokeinterface android/database/Cursor.getInt:(I)I
        //   365: istore          5
        //   367: aload           16
        //   369: astore          18
        //   371: aload           17
        //   373: astore          19
        //   375: aload           17
        //   377: iconst_2       
        //   378: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   383: astore          20
        //   385: iload           5
        //   387: ifne            589
        //   390: aload           16
        //   392: astore          18
        //   394: aload           17
        //   396: astore          19
        //   398: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   401: astore          25
        //   403: aload           20
        //   405: arraylength    
        //   406: istore          5
        //   408: aload           25
        //   410: aload           20
        //   412: iconst_0       
        //   413: iload           5
        //   415: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   418: aload           25
        //   420: iconst_0       
        //   421: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   424: getstatic       K2/v.CREATOR:Landroid/os/Parcelable$Creator;
        //   427: aload           25
        //   429: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   434: checkcast       LK2/v;
        //   437: astore          20
        //   439: aload           16
        //   441: astore          18
        //   443: aload           17
        //   445: astore          19
        //   447: aload           25
        //   449: invokevirtual   android/os/Parcel.recycle:()V
        //   452: aload           20
        //   454: ifnull          505
        //   457: aload           16
        //   459: astore          18
        //   461: aload           17
        //   463: astore          19
        //   465: aload           21
        //   467: aload           20
        //   469: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   472: pop            
        //   473: goto            505
        //   476: astore_1       
        //   477: aload           18
        //   479: astore          16
        //   481: goto            1406
        //   484: astore          20
        //   486: goto            183
        //   489: goto            1096
        //   492: astore          18
        //   494: aload           18
        //   496: astore          20
        //   498: iload           4
        //   500: istore          5
        //   502: goto            1320
        //   505: goto            965
        //   508: astore          20
        //   510: goto            550
        //   513: astore          20
        //   515: goto            550
        //   518: astore          18
        //   520: aload           24
        //   522: invokevirtual   C/u.j:()LK2/P;
        //   525: getfield        K2/P.H:LK2/S;
        //   528: ldc_w           "Failed to load event from local database"
        //   531: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   534: aload           16
        //   536: astore          18
        //   538: aload           17
        //   540: astore          19
        //   542: aload           25
        //   544: invokevirtual   android/os/Parcel.recycle:()V
        //   547: goto            505
        //   550: aload           16
        //   552: astore          18
        //   554: aload           17
        //   556: astore          19
        //   558: aload           25
        //   560: invokevirtual   android/os/Parcel.recycle:()V
        //   563: aload           16
        //   565: astore          18
        //   567: aload           17
        //   569: astore          19
        //   571: aload           20
        //   573: athrow         
        //   574: astore          20
        //   576: goto            183
        //   579: astore          18
        //   581: goto            489
        //   584: astore          18
        //   586: goto            494
        //   589: iload           5
        //   591: iconst_1       
        //   592: if_icmpne       741
        //   595: aload           16
        //   597: astore          18
        //   599: aload           17
        //   601: astore          19
        //   603: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   606: astore          25
        //   608: aload           25
        //   610: aload           20
        //   612: iconst_0       
        //   613: aload           20
        //   615: arraylength    
        //   616: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   619: aload           25
        //   621: iconst_0       
        //   622: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   625: getstatic       K2/G1.CREATOR:Landroid/os/Parcelable$Creator;
        //   628: aload           25
        //   630: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   635: checkcast       LK2/G1;
        //   638: astore          20
        //   640: aload           16
        //   642: astore          18
        //   644: aload           17
        //   646: astore          19
        //   648: aload           25
        //   650: invokevirtual   android/os/Parcel.recycle:()V
        //   653: goto            693
        //   656: astore          20
        //   658: goto            717
        //   661: astore          18
        //   663: aload           24
        //   665: invokevirtual   C/u.j:()LK2/P;
        //   668: getfield        K2/P.H:LK2/S;
        //   671: ldc_w           "Failed to load user property from local database"
        //   674: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   677: aload           16
        //   679: astore          18
        //   681: aload           17
        //   683: astore          19
        //   685: aload           25
        //   687: invokevirtual   android/os/Parcel.recycle:()V
        //   690: aconst_null    
        //   691: astore          20
        //   693: aload           20
        //   695: ifnull          505
        //   698: aload           16
        //   700: astore          18
        //   702: aload           17
        //   704: astore          19
        //   706: aload           21
        //   708: aload           20
        //   710: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   713: pop            
        //   714: goto            505
        //   717: aload           16
        //   719: astore          18
        //   721: aload           17
        //   723: astore          19
        //   725: aload           25
        //   727: invokevirtual   android/os/Parcel.recycle:()V
        //   730: aload           16
        //   732: astore          18
        //   734: aload           17
        //   736: astore          19
        //   738: aload           20
        //   740: athrow         
        //   741: iload           5
        //   743: iconst_2       
        //   744: if_icmpne       912
        //   747: aload           16
        //   749: astore          18
        //   751: aload           17
        //   753: astore          19
        //   755: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   758: astore          25
        //   760: aload           20
        //   762: arraylength    
        //   763: istore          5
        //   765: aload           25
        //   767: aload           20
        //   769: iconst_0       
        //   770: iload           5
        //   772: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   775: aload           25
        //   777: iconst_0       
        //   778: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   781: getstatic       K2/c.CREATOR:Landroid/os/Parcelable$Creator;
        //   784: aload           25
        //   786: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   791: checkcast       LK2/c;
        //   794: astore          20
        //   796: aload           16
        //   798: astore          18
        //   800: aload           17
        //   802: astore          19
        //   804: aload           25
        //   806: invokevirtual   android/os/Parcel.recycle:()V
        //   809: goto            859
        //   812: astore          20
        //   814: goto            1141
        //   817: astore          20
        //   819: goto            883
        //   822: astore          20
        //   824: goto            883
        //   827: astore          18
        //   829: aload           24
        //   831: invokevirtual   C/u.j:()LK2/P;
        //   834: getfield        K2/P.H:LK2/S;
        //   837: ldc_w           "Failed to load conditional user property from local database"
        //   840: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   843: aload           16
        //   845: astore          18
        //   847: aload           17
        //   849: astore          19
        //   851: aload           25
        //   853: invokevirtual   android/os/Parcel.recycle:()V
        //   856: aconst_null    
        //   857: astore          20
        //   859: aload           20
        //   861: ifnull          965
        //   864: aload           16
        //   866: astore          18
        //   868: aload           17
        //   870: astore          19
        //   872: aload           21
        //   874: aload           20
        //   876: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   879: pop            
        //   880: goto            965
        //   883: aload           16
        //   885: astore          18
        //   887: aload           17
        //   889: astore          19
        //   891: aload           25
        //   893: invokevirtual   android/os/Parcel.recycle:()V
        //   896: aload           16
        //   898: astore          18
        //   900: aload           17
        //   902: astore          19
        //   904: aload           20
        //   906: athrow         
        //   907: astore          18
        //   909: goto            494
        //   912: iload           5
        //   914: iconst_3       
        //   915: if_icmpne       943
        //   918: aload           16
        //   920: astore          18
        //   922: aload           17
        //   924: astore          19
        //   926: aload           24
        //   928: invokevirtual   C/u.j:()LK2/P;
        //   931: getfield        K2/P.K:LK2/S;
        //   934: ldc_w           "Skipping app launch break"
        //   937: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   940: goto            965
        //   943: aload           16
        //   945: astore          18
        //   947: aload           17
        //   949: astore          19
        //   951: aload           24
        //   953: invokevirtual   C/u.j:()LK2/P;
        //   956: getfield        K2/P.H:LK2/S;
        //   959: ldc_w           "Unknown record type in local database"
        //   962: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   965: goto            309
        //   968: astore          18
        //   970: goto            909
        //   973: astore          20
        //   975: goto            1141
        //   978: astore          18
        //   980: goto            1096
        //   983: iload           4
        //   985: istore          5
        //   987: aload           16
        //   989: astore          18
        //   991: aload           17
        //   993: astore          19
        //   995: aload           16
        //   997: ldc             "messages"
        //   999: ldc_w           "rowid <= ?"
        //  1002: iconst_1       
        //  1003: anewarray       Ljava/lang/String;
        //  1006: dup            
        //  1007: iconst_0       
        //  1008: lload           9
        //  1010: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //  1013: aastore        
        //  1014: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //  1017: aload           21
        //  1019: invokevirtual   java/util/ArrayList.size:()I
        //  1022: if_icmpge       1047
        //  1025: aload           16
        //  1027: astore          18
        //  1029: aload           17
        //  1031: astore          19
        //  1033: aload           24
        //  1035: invokevirtual   C/u.j:()LK2/P;
        //  1038: getfield        K2/P.H:LK2/S;
        //  1041: ldc_w           "Fewer entries removed from local database than expected"
        //  1044: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1047: aload           16
        //  1049: astore          18
        //  1051: aload           17
        //  1053: astore          19
        //  1055: aload           16
        //  1057: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //  1060: aload           16
        //  1062: astore          18
        //  1064: aload           17
        //  1066: astore          19
        //  1068: aload           16
        //  1070: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1073: aload           17
        //  1075: invokeinterface android/database/Cursor.close:()V
        //  1080: aload           16
        //  1082: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1085: aload           21
        //  1087: astore          16
        //  1089: iload           5
        //  1091: istore          4
        //  1093: goto            1447
        //  1096: iload           4
        //  1098: istore          5
        //  1100: goto            1250
        //  1103: astore          20
        //  1105: aconst_null    
        //  1106: astore          17
        //  1108: goto            1141
        //  1111: astore          17
        //  1113: goto            193
        //  1116: aconst_null    
        //  1117: astore          17
        //  1119: iload           4
        //  1121: istore          5
        //  1123: goto            1250
        //  1126: astore_1       
        //  1127: aconst_null    
        //  1128: astore          16
        //  1130: goto            172
        //  1133: astore          20
        //  1135: aconst_null    
        //  1136: astore          16
        //  1138: goto            1105
        //  1141: aload           16
        //  1143: ifnull          1175
        //  1146: aload           16
        //  1148: astore          18
        //  1150: aload           17
        //  1152: astore          19
        //  1154: aload           16
        //  1156: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //  1159: ifeq            1175
        //  1162: aload           16
        //  1164: astore          18
        //  1166: aload           17
        //  1168: astore          19
        //  1170: aload           16
        //  1172: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1175: aload           16
        //  1177: astore          18
        //  1179: aload           17
        //  1181: astore          19
        //  1183: aload           24
        //  1185: invokevirtual   C/u.j:()LK2/P;
        //  1188: getfield        K2/P.H:LK2/S;
        //  1191: ldc_w           "Error reading entries from local database"
        //  1194: aload           20
        //  1196: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1199: aload           16
        //  1201: astore          18
        //  1203: aload           17
        //  1205: astore          19
        //  1207: aload           24
        //  1209: iconst_1       
        //  1210: putfield        K2/J.F:Z
        //  1213: aload           17
        //  1215: ifnull          1225
        //  1218: aload           17
        //  1220: invokeinterface android/database/Cursor.close:()V
        //  1225: aload           16
        //  1227: ifnull          1235
        //  1230: aload           16
        //  1232: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1235: iload           7
        //  1237: istore          8
        //  1239: goto            1396
        //  1242: astore          16
        //  1244: aconst_null    
        //  1245: astore          16
        //  1247: goto            1116
        //  1250: iload           7
        //  1252: i2l            
        //  1253: lstore          9
        //  1255: aload           16
        //  1257: astore          18
        //  1259: aload           17
        //  1261: astore          19
        //  1263: lload           9
        //  1265: invokestatic    android/os/SystemClock.sleep:(J)V
        //  1268: iinc            7, 20
        //  1271: aload           17
        //  1273: ifnull          1283
        //  1276: aload           17
        //  1278: invokeinterface android/database/Cursor.close:()V
        //  1283: iload           7
        //  1285: istore          8
        //  1287: iload           5
        //  1289: istore          4
        //  1291: aload           16
        //  1293: ifnull          1396
        //  1296: aload           16
        //  1298: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1301: iload           7
        //  1303: istore          8
        //  1305: iload           5
        //  1307: istore          4
        //  1309: goto            1396
        //  1312: astore          17
        //  1314: aconst_null    
        //  1315: astore          16
        //  1317: goto            193
        //  1320: aload           16
        //  1322: astore          18
        //  1324: aload           17
        //  1326: astore          19
        //  1328: aload           24
        //  1330: invokevirtual   C/u.j:()LK2/P;
        //  1333: getfield        K2/P.H:LK2/S;
        //  1336: ldc_w           "Error reading entries from local database"
        //  1339: aload           20
        //  1341: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1344: aload           16
        //  1346: astore          18
        //  1348: aload           17
        //  1350: astore          19
        //  1352: aload           24
        //  1354: iconst_1       
        //  1355: putfield        K2/J.F:Z
        //  1358: aload           17
        //  1360: ifnull          1370
        //  1363: aload           17
        //  1365: invokeinterface android/database/Cursor.close:()V
        //  1370: iload           7
        //  1372: istore          8
        //  1374: iload           5
        //  1376: istore          4
        //  1378: aload           16
        //  1380: ifnull          1396
        //  1383: aload           16
        //  1385: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1388: iload           5
        //  1390: istore          4
        //  1392: iload           7
        //  1394: istore          8
        //  1396: iinc            6, 1
        //  1399: iload           8
        //  1401: istore          7
        //  1403: goto            126
        //  1406: aload           19
        //  1408: ifnull          1418
        //  1411: aload           19
        //  1413: invokeinterface android/database/Cursor.close:()V
        //  1418: aload           16
        //  1420: ifnull          1428
        //  1423: aload           16
        //  1425: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1428: aload_1        
        //  1429: athrow         
        //  1430: aload           24
        //  1432: invokevirtual   C/u.j:()LK2/P;
        //  1435: getfield        K2/P.K:LK2/S;
        //  1438: ldc_w           "Failed to read events from database in reasonable time"
        //  1441: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1444: goto            76
        //  1447: aload           16
        //  1449: ifnull          1472
        //  1452: aload           23
        //  1454: aload           16
        //  1456: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  1459: pop            
        //  1460: aload           16
        //  1462: invokeinterface java/util/List.size:()I
        //  1467: istore          5
        //  1469: goto            1475
        //  1472: iconst_0       
        //  1473: istore          5
        //  1475: aload_2        
        //  1476: ifnull          1493
        //  1479: iload           5
        //  1481: bipush          100
        //  1483: if_icmpge       1493
        //  1486: aload           23
        //  1488: aload_2        
        //  1489: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1492: pop            
        //  1493: getstatic       K2/w.D0:LK2/F;
        //  1496: astore          16
        //  1498: aload           22
        //  1500: getfield        K2/n0.I:LK2/d;
        //  1503: aconst_null    
        //  1504: aload           16
        //  1506: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1509: istore          15
        //  1511: aload           23
        //  1513: invokevirtual   java/util/ArrayList.size:()I
        //  1516: istore          7
        //  1518: iconst_0       
        //  1519: istore          6
        //  1521: iload           6
        //  1523: iload           7
        //  1525: if_icmpge       1876
        //  1528: aload           23
        //  1530: iload           6
        //  1532: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1535: checkcast       Li2/a;
        //  1538: astore          16
        //  1540: aload           16
        //  1542: instanceof      LK2/v;
        //  1545: ifeq            1771
        //  1548: aload           22
        //  1550: getfield        K2/n0.P:Lq2/a;
        //  1553: astore          17
        //  1555: iload           15
        //  1557: ifeq            1605
        //  1560: aload           17
        //  1562: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1565: pop            
        //  1566: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1569: lstore          11
        //  1571: aload           17
        //  1573: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1576: pop            
        //  1577: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1580: lstore          9
        //  1582: goto            1611
        //  1585: astore          16
        //  1587: lload           11
        //  1589: lstore          9
        //  1591: lconst_0       
        //  1592: lstore          11
        //  1594: goto            1699
        //  1597: astore          16
        //  1599: lconst_0       
        //  1600: lstore          9
        //  1602: goto            1591
        //  1605: lconst_0       
        //  1606: lstore          11
        //  1608: lconst_0       
        //  1609: lstore          9
        //  1611: aload_1        
        //  1612: aload           16
        //  1614: checkcast       LK2/v;
        //  1617: aload_3        
        //  1618: invokeinterface K2/H.G1:(LK2/v;LK2/B1;)V
        //  1623: iload           15
        //  1625: ifeq            1870
        //  1628: aload_0        
        //  1629: invokevirtual   C/u.j:()LK2/P;
        //  1632: getfield        K2/P.P:LK2/S;
        //  1635: ldc_w           "Logging telemetry for logEvent from database"
        //  1638: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1641: aload           22
        //  1643: invokestatic    K2/N.a:(LK2/n0;)LK2/N;
        //  1646: astore          16
        //  1648: aload           17
        //  1650: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1653: pop            
        //  1654: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1657: lstore          13
        //  1659: aload           17
        //  1661: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1664: pop            
        //  1665: aload           16
        //  1667: iconst_0       
        //  1668: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1671: lload           9
        //  1673: lsub           
        //  1674: l2i            
        //  1675: lload           11
        //  1677: lload           13
        //  1679: invokevirtual   K2/N.b:(IIJJ)V
        //  1682: goto            1870
        //  1685: astore          16
        //  1687: lload           11
        //  1689: lstore          13
        //  1691: lload           9
        //  1693: lstore          11
        //  1695: lload           13
        //  1697: lstore          9
        //  1699: aload_0        
        //  1700: invokevirtual   C/u.j:()LK2/P;
        //  1703: getfield        K2/P.H:LK2/S;
        //  1706: ldc_w           "Failed to send event to the service"
        //  1709: aload           16
        //  1711: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1714: iload           15
        //  1716: ifeq            1870
        //  1719: lload           9
        //  1721: lconst_0       
        //  1722: lcmp           
        //  1723: ifeq            1870
        //  1726: aload           22
        //  1728: invokestatic    K2/N.a:(LK2/n0;)LK2/N;
        //  1731: astore          16
        //  1733: aload           17
        //  1735: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1738: pop            
        //  1739: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1742: lstore          13
        //  1744: aload           17
        //  1746: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1749: pop            
        //  1750: aload           16
        //  1752: bipush          13
        //  1754: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1757: lload           11
        //  1759: lsub           
        //  1760: l2i            
        //  1761: lload           9
        //  1763: lload           13
        //  1765: invokevirtual   K2/N.b:(IIJJ)V
        //  1768: goto            1870
        //  1771: aload           16
        //  1773: instanceof      LK2/G1;
        //  1776: ifeq            1814
        //  1779: aload_1        
        //  1780: aload           16
        //  1782: checkcast       LK2/G1;
        //  1785: aload_3        
        //  1786: invokeinterface K2/H.W0:(LK2/G1;LK2/B1;)V
        //  1791: goto            1870
        //  1794: astore          16
        //  1796: aload_0        
        //  1797: invokevirtual   C/u.j:()LK2/P;
        //  1800: getfield        K2/P.H:LK2/S;
        //  1803: ldc_w           "Failed to send user property to the service"
        //  1806: aload           16
        //  1808: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1811: goto            1870
        //  1814: aload           16
        //  1816: instanceof      LK2/c;
        //  1819: ifeq            1857
        //  1822: aload_1        
        //  1823: aload           16
        //  1825: checkcast       LK2/c;
        //  1828: aload_3        
        //  1829: invokeinterface K2/H.F0:(LK2/c;LK2/B1;)V
        //  1834: goto            1870
        //  1837: astore          16
        //  1839: aload_0        
        //  1840: invokevirtual   C/u.j:()LK2/P;
        //  1843: getfield        K2/P.H:LK2/S;
        //  1846: ldc_w           "Failed to send conditional user property to the service"
        //  1849: aload           16
        //  1851: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1854: goto            1870
        //  1857: aload_0        
        //  1858: invokevirtual   C/u.j:()LK2/P;
        //  1861: getfield        K2/P.H:LK2/S;
        //  1864: ldc_w           "Discarding data. Unrecognized parcel type."
        //  1867: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //  1870: iinc            6, 1
        //  1873: goto            1521
        //  1876: iinc            4, 1
        //  1879: goto            15
        //  1882: return         
        //  1883: astore          18
        //  1885: goto            520
        //  1888: astore          18
        //  1890: goto            489
        //  1893: astore          18
        //  1895: goto            829
        //  1898: astore          18
        //  1900: goto            1096
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                   
        //  -----  -----  -----  -----  -------------------------------------------------------
        //  132    139    1312   1320   Landroid/database/sqlite/SQLiteFullException;
        //  132    139    1242   1250   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  132    139    1133   1141   Landroid/database/sqlite/SQLiteException;
        //  132    139    1126   1133   Any
        //  144    150    191    193    Landroid/database/sqlite/SQLiteFullException;
        //  144    150    186    191    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  144    150    178    183    Landroid/database/sqlite/SQLiteException;
        //  144    150    171    172    Any
        //  211    223    1111   1116   Landroid/database/sqlite/SQLiteFullException;
        //  211    223    186    191    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  211    223    1103   1105   Landroid/database/sqlite/SQLiteException;
        //  211    223    171    172    Any
        //  264    309    1111   1116   Landroid/database/sqlite/SQLiteFullException;
        //  264    309    186    191    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  264    309    1103   1105   Landroid/database/sqlite/SQLiteException;
        //  264    309    171    172    Any
        //  317    326    968    973    Landroid/database/sqlite/SQLiteFullException;
        //  317    326    579    584    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  317    326    574    579    Landroid/database/sqlite/SQLiteException;
        //  317    326    476    484    Any
        //  339    349    584    589    Landroid/database/sqlite/SQLiteFullException;
        //  339    349    978    983    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  339    349    973    978    Landroid/database/sqlite/SQLiteException;
        //  339    349    476    484    Any
        //  357    367    968    973    Landroid/database/sqlite/SQLiteFullException;
        //  357    367    579    584    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  357    367    574    579    Landroid/database/sqlite/SQLiteException;
        //  357    367    476    484    Any
        //  375    385    968    973    Landroid/database/sqlite/SQLiteFullException;
        //  375    385    579    584    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  375    385    574    579    Landroid/database/sqlite/SQLiteException;
        //  375    385    476    484    Any
        //  398    403    584    589    Landroid/database/sqlite/SQLiteFullException;
        //  398    403    579    584    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  398    403    574    579    Landroid/database/sqlite/SQLiteException;
        //  398    403    476    484    Any
        //  403    408    518    520    Li2/b;
        //  403    408    513    518    Any
        //  408    439    1883   1888   Li2/b;
        //  408    439    508    513    Any
        //  447    452    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  447    452    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  447    452    484    489    Landroid/database/sqlite/SQLiteException;
        //  447    452    476    484    Any
        //  465    473    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  465    473    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  465    473    484    489    Landroid/database/sqlite/SQLiteException;
        //  465    473    476    484    Any
        //  520    534    508    513    Any
        //  542    547    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  542    547    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  542    547    484    489    Landroid/database/sqlite/SQLiteException;
        //  542    547    476    484    Any
        //  558    563    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  558    563    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  558    563    484    489    Landroid/database/sqlite/SQLiteException;
        //  558    563    476    484    Any
        //  571    574    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  571    574    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  571    574    484    489    Landroid/database/sqlite/SQLiteException;
        //  571    574    476    484    Any
        //  603    608    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  603    608    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  603    608    484    489    Landroid/database/sqlite/SQLiteException;
        //  603    608    476    484    Any
        //  608    640    661    693    Li2/b;
        //  608    640    656    741    Any
        //  648    653    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  648    653    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  648    653    484    489    Landroid/database/sqlite/SQLiteException;
        //  648    653    476    484    Any
        //  663    677    656    741    Any
        //  685    690    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  685    690    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  685    690    484    489    Landroid/database/sqlite/SQLiteException;
        //  685    690    476    484    Any
        //  706    714    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  706    714    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  706    714    484    489    Landroid/database/sqlite/SQLiteException;
        //  706    714    476    484    Any
        //  725    730    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  725    730    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  725    730    484    489    Landroid/database/sqlite/SQLiteException;
        //  725    730    476    484    Any
        //  738    741    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  738    741    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  738    741    484    489    Landroid/database/sqlite/SQLiteException;
        //  738    741    476    484    Any
        //  755    760    907    909    Landroid/database/sqlite/SQLiteFullException;
        //  755    760    1888   1893   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  755    760    484    489    Landroid/database/sqlite/SQLiteException;
        //  755    760    476    484    Any
        //  760    765    827    829    Li2/b;
        //  760    765    822    827    Any
        //  765    796    1893   1898   Li2/b;
        //  765    796    817    822    Any
        //  804    809    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  804    809    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  804    809    812    817    Landroid/database/sqlite/SQLiteException;
        //  804    809    476    484    Any
        //  829    843    817    822    Any
        //  851    856    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  851    856    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  851    856    812    817    Landroid/database/sqlite/SQLiteException;
        //  851    856    476    484    Any
        //  872    880    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  872    880    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  872    880    812    817    Landroid/database/sqlite/SQLiteException;
        //  872    880    476    484    Any
        //  891    896    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  891    896    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  891    896    812    817    Landroid/database/sqlite/SQLiteException;
        //  891    896    476    484    Any
        //  904    907    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  904    907    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  904    907    812    817    Landroid/database/sqlite/SQLiteException;
        //  904    907    476    484    Any
        //  926    940    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  926    940    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  926    940    812    817    Landroid/database/sqlite/SQLiteException;
        //  926    940    476    484    Any
        //  951    965    492    494    Landroid/database/sqlite/SQLiteFullException;
        //  951    965    1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  951    965    812    817    Landroid/database/sqlite/SQLiteException;
        //  951    965    476    484    Any
        //  995    1025   492    494    Landroid/database/sqlite/SQLiteFullException;
        //  995    1025   1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  995    1025   812    817    Landroid/database/sqlite/SQLiteException;
        //  995    1025   476    484    Any
        //  1033   1047   492    494    Landroid/database/sqlite/SQLiteFullException;
        //  1033   1047   1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1033   1047   812    817    Landroid/database/sqlite/SQLiteException;
        //  1033   1047   476    484    Any
        //  1055   1060   492    494    Landroid/database/sqlite/SQLiteFullException;
        //  1055   1060   1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1055   1060   812    817    Landroid/database/sqlite/SQLiteException;
        //  1055   1060   476    484    Any
        //  1068   1073   492    494    Landroid/database/sqlite/SQLiteFullException;
        //  1068   1073   1898   1903   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1068   1073   812    817    Landroid/database/sqlite/SQLiteException;
        //  1068   1073   476    484    Any
        //  1154   1162   476    484    Any
        //  1170   1175   476    484    Any
        //  1183   1199   476    484    Any
        //  1207   1213   476    484    Any
        //  1263   1268   476    484    Any
        //  1328   1344   476    484    Any
        //  1352   1358   476    484    Any
        //  1560   1571   1597   1605   Landroid/os/RemoteException;
        //  1571   1582   1585   1591   Landroid/os/RemoteException;
        //  1611   1623   1685   1699   Landroid/os/RemoteException;
        //  1628   1682   1685   1699   Landroid/os/RemoteException;
        //  1779   1791   1794   1814   Landroid/os/RemoteException;
        //  1822   1834   1837   1857   Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 850 out of bounds for length 850
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:284)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:284)
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
    
    public final void E(final Runnable runnable) {
        this.v();
        if (this.J()) {
            runnable.run();
            return;
        }
        final ArrayList j = this.J;
        if (j.size() >= 1000L) {
            this.j().H.f("Discarding data. Max runnable queue size reached");
            return;
        }
        j.add((Object)runnable);
        this.K.b(60000L);
        this.H();
    }
    
    public final void F(final AtomicReference atomicReference) {
        this.v();
        this.z();
        this.E((Runnable)new v((Object)this, (Object)atomicReference, (Object)this.O(false), 8, false));
    }
    
    public final void G(final boolean b) {
        this.v();
        this.z();
        a3.a();
        final n0 n0 = (n0)super.C;
        if (!n0.I.G(null, w.W0) && b) {
            n0.p().E();
        }
        if (this.K()) {
            this.E((Runnable)new f1(this, this.O(false), 4));
        }
    }
    
    public final void H() {
        this.v();
        this.z();
        if (this.J()) {
            return;
        }
        if (this.L()) {
            final h1 e = this.E;
            e.E.v();
            final Context c = ((n0)e.E.C).C;
            final h1 h1;
            monitorenter(h1 = e);
            Label_0087: {
                try {
                    if (e.C) {
                        e.E.j().P.f("Connection attempt already in progress");
                        monitorexit(h1);
                        return;
                    }
                    break Label_0087;
                }
                finally {
                    monitorexit(h1);
                    iftrue(Label_0136:)(e.D == null || (!e.D.r() && !e.D.q()));
                    e.E.j().P.f("Already awaiting connection attempt");
                    monitorexit(h1);
                    return;
                    Label_0136: {
                        e.D = (M)new h2.d(93, c, Looper.getMainLooper(), (h2.a)e, (b)e);
                    }
                    e.E.j().P.f("Connecting to remote service");
                    e.C = true;
                    A.h((Object)e.D);
                    e.D.d();
                    monitorexit(h1);
                    return;
                }
            }
        }
        if (!((n0)super.C).I.J()) {
            final List queryIntentServices = ((n0)super.C).C.getPackageManager().queryIntentServices(new Intent().setClassName(((n0)super.C).C, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                final Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(((n0)super.C).C, "com.google.android.gms.measurement.AppMeasurementService"));
                final h1 e2 = this.E;
                e2.E.v();
                final Context c2 = ((n0)e2.E.C).C;
                final p2.a b = p2.a.b();
                final h1 h2;
                monitorenter(h2 = e2);
                Label_0378: {
                    try {
                        if (e2.C) {
                            e2.E.j().P.f("Connection attempt already in progress");
                            monitorexit(h2);
                            return;
                        }
                        break Label_0378;
                    }
                    finally {
                        monitorexit(h2);
                        e2.E.j().P.f("Using local app measurement service");
                        e2.C = true;
                        b.a(c2, intent, (ServiceConnection)e2.E.E, 129);
                        monitorexit(h2);
                        return;
                    }
                }
            }
            this.j().H.f("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }
    
    public final void I() {
        this.v();
        this.z();
        final h1 e = this.E;
        if (e.D != null && (e.D.q() || e.D.r())) {
            e.D.f();
        }
        e.D = null;
        while (true) {
            try {
                p2.a.b().c(((n0)super.C).C, (ServiceConnection)this.E);
                this.F = null;
            }
            catch (final IllegalStateException | IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean J() {
        this.v();
        this.z();
        return this.F != null;
    }
    
    public final boolean K() {
        this.v();
        this.z();
        return !this.L() || this.u().z0() >= (int)w.s0.a(null);
    }
    
    public final boolean L() {
        this.v();
        this.z();
        if (this.G == null) {
            this.v();
            this.z();
            final a0 t = this.t();
            t.v();
            final boolean contains = t.D().contains("use_service");
            final int n = 0;
            Boolean value;
            if (!contains) {
                value = null;
            }
            else {
                value = t.D().getBoolean("use_service", false);
            }
            final int n2 = 1;
            int n3 = 1;
            int n4 = 1;
            if (value == null || !value) {
                final K o = ((n0)super.C).o();
                o.z();
                int n5 = 0;
                Label_0360: {
                    Label_0129: {
                        if (o.M != 1) {
                            this.j().P.f("Checking service availability");
                            final int c = f.b.c(((n0)this.u().C).C, 12451000);
                            if (c != 0) {
                                if (c != 1) {
                                    if (c != 2) {
                                        if (c != 3) {
                                            if (c != 9) {
                                                if (c == 18) {
                                                    this.j().K.f("Service updating");
                                                    break Label_0129;
                                                }
                                                this.j().K.g("Unexpected service status", c);
                                            }
                                            else {
                                                this.j().K.f("Service invalid");
                                            }
                                        }
                                        else {
                                            this.j().K.f("Service disabled");
                                        }
                                        n5 = 0;
                                        n4 = 0;
                                        break Label_0360;
                                    }
                                    this.j().O.f("Service container out of date");
                                    if (this.u().z0() >= 17443) {
                                        if (value != null) {
                                            n4 = 0;
                                        }
                                        n5 = 0;
                                        break Label_0360;
                                    }
                                }
                                else {
                                    this.j().P.f("Service missing");
                                }
                                n5 = 1;
                                n4 = 0;
                                break Label_0360;
                            }
                            this.j().P.f("Service available");
                        }
                    }
                    n5 = 1;
                    n4 = n2;
                }
                if (n4 == 0 && ((n0)super.C).I.J()) {
                    this.j().H.f("No way to upload. Consider using the full version of Analytics");
                    n5 = n;
                }
                n3 = n4;
                if (n5 != 0) {
                    final a0 t2 = this.t();
                    t2.v();
                    final SharedPreferences$Editor edit = t2.D().edit();
                    edit.putBoolean("use_service", (boolean)(n4 != 0));
                    edit.apply();
                    n3 = n4;
                }
            }
            this.G = (boolean)(n3 != 0);
        }
        return this.G;
    }
    
    public final void M() {
        this.v();
        final P j = this.j();
        final ArrayList i = this.J;
        j.P.g("Processing queued up service tasks", i.size());
        for (final Runnable runnable : i) {
            try {
                runnable.run();
            }
            catch (final RuntimeException ex) {
                this.j().H.g("Task exception while flushing queue", ex);
            }
        }
        i.clear();
        this.K.a();
    }
    
    public final void N() {
        this.v();
        final d i = this.I;
        i.E.getClass();
        i.D = SystemClock.elapsedRealtime();
        this.H.b((long)w.L.a(null));
    }
    
    public final B1 O(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        C/u.C:Ljava/lang/Object;
        //     4: checkcast       LK2/n0;
        //     7: invokevirtual   K2/n0.o:()LK2/K;
        //    10: astore          23
        //    12: iload_1        
        //    13: ifeq            324
        //    16: aload_0        
        //    17: invokevirtual   C/u.j:()LK2/P;
        //    20: astore          19
        //    22: aload           19
        //    24: invokevirtual   C/u.t:()LK2/a0;
        //    27: getfield        K2/a0.H:LK2/d0;
        //    30: astore          20
        //    32: aconst_null    
        //    33: astore          21
        //    35: aload           20
        //    37: ifnonnull       47
        //    40: aload           21
        //    42: astore          20
        //    44: goto            321
        //    47: aload           19
        //    49: invokevirtual   C/u.t:()LK2/a0;
        //    52: getfield        K2/a0.H:LK2/d0;
        //    55: astore          19
        //    57: aload           19
        //    59: getfield        K2/d0.e:Ljava/lang/Object;
        //    62: checkcast       LK2/a0;
        //    65: astore          20
        //    67: aload           20
        //    69: invokevirtual   C/u.v:()V
        //    72: aload           20
        //    74: invokevirtual   C/u.v:()V
        //    77: aload           19
        //    79: getfield        K2/d0.e:Ljava/lang/Object;
        //    82: checkcast       LK2/a0;
        //    85: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //    88: aload           19
        //    90: getfield        K2/d0.b:Ljava/lang/Object;
        //    93: checkcast       Ljava/lang/String;
        //    96: lconst_0       
        //    97: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //   102: lstore          5
        //   104: lload           5
        //   106: lconst_0       
        //   107: lcmp           
        //   108: ifne            122
        //   111: aload           19
        //   113: invokevirtual   K2/d0.c:()V
        //   116: lconst_0       
        //   117: lstore          5
        //   119: goto            148
        //   122: aload           20
        //   124: getfield        C/u.C:Ljava/lang/Object;
        //   127: checkcast       LK2/n0;
        //   130: getfield        K2/n0.P:Lq2/a;
        //   133: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   136: pop            
        //   137: lload           5
        //   139: invokestatic    java/lang/System.currentTimeMillis:()J
        //   142: lsub           
        //   143: invokestatic    java/lang/Math.abs:(J)J
        //   146: lstore          5
        //   148: aload           19
        //   150: getfield        K2/d0.a:J
        //   153: lstore          7
        //   155: lload           5
        //   157: lload           7
        //   159: lcmp           
        //   160: ifge            169
        //   163: aconst_null    
        //   164: astore          19
        //   166: goto            273
        //   169: lload           5
        //   171: lload           7
        //   173: iconst_1       
        //   174: lshl           
        //   175: lcmp           
        //   176: ifle            187
        //   179: aload           19
        //   181: invokevirtual   K2/d0.c:()V
        //   184: goto            163
        //   187: aload           20
        //   189: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //   192: aload           19
        //   194: getfield        K2/d0.d:Ljava/lang/Object;
        //   197: checkcast       Ljava/lang/String;
        //   200: aconst_null    
        //   201: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   206: astore          22
        //   208: aload           20
        //   210: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //   213: aload           19
        //   215: getfield        K2/d0.c:Ljava/io/Serializable;
        //   218: checkcast       Ljava/lang/String;
        //   221: lconst_0       
        //   222: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //   227: lstore          5
        //   229: aload           19
        //   231: invokevirtual   K2/d0.c:()V
        //   234: aload           22
        //   236: ifnull          268
        //   239: lload           5
        //   241: lconst_0       
        //   242: lcmp           
        //   243: ifgt            249
        //   246: goto            268
        //   249: new             Landroid/util/Pair;
        //   252: dup            
        //   253: aload           22
        //   255: lload           5
        //   257: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   260: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   263: astore          19
        //   265: goto            273
        //   268: getstatic       K2/a0.c0:Landroid/util/Pair;
        //   271: astore          19
        //   273: aload           21
        //   275: astore          20
        //   277: aload           19
        //   279: ifnull          321
        //   282: aload           19
        //   284: getstatic       K2/a0.c0:Landroid/util/Pair;
        //   287: if_acmpne       297
        //   290: aload           21
        //   292: astore          20
        //   294: goto            321
        //   297: aload           19
        //   299: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   302: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   305: ldc_w           ":"
        //   308: aload           19
        //   310: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   313: checkcast       Ljava/lang/String;
        //   316: invokestatic    com/google/android/gms/internal/measurement/L.j:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   319: astore          20
        //   321: goto            327
        //   324: aconst_null    
        //   325: astore          20
        //   327: aload           23
        //   329: invokevirtual   K2/B.v:()V
        //   332: aload           23
        //   334: invokevirtual   K2/K.C:()Ljava/lang/String;
        //   337: astore          24
        //   339: aload           23
        //   341: invokevirtual   K2/K.D:()Ljava/lang/String;
        //   344: astore          27
        //   346: aload           23
        //   348: invokevirtual   K2/Z.z:()V
        //   351: aload           23
        //   353: getfield        K2/K.F:Ljava/lang/String;
        //   356: astore          25
        //   358: aload           23
        //   360: invokevirtual   K2/Z.z:()V
        //   363: aload           23
        //   365: getfield        K2/K.G:I
        //   368: i2l            
        //   369: lstore          11
        //   371: aload           23
        //   373: invokevirtual   K2/Z.z:()V
        //   376: aload           23
        //   378: getfield        K2/K.H:Ljava/lang/String;
        //   381: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //   384: aload           23
        //   386: getfield        K2/K.H:Ljava/lang/String;
        //   389: astore          26
        //   391: aload           23
        //   393: invokevirtual   K2/Z.z:()V
        //   396: aload           23
        //   398: invokevirtual   K2/B.v:()V
        //   401: aload           23
        //   403: getfield        K2/K.I:J
        //   406: lstore          5
        //   408: aload           23
        //   410: getfield        C/u.C:Ljava/lang/Object;
        //   413: checkcast       LK2/n0;
        //   416: astore          22
        //   418: lload           5
        //   420: lconst_0       
        //   421: lcmp           
        //   422: ifne            631
        //   425: aload           22
        //   427: getfield        K2/n0.N:LK2/J1;
        //   430: astore          19
        //   432: aload           19
        //   434: invokestatic    K2/n0.c:(LC/u;)V
        //   437: aload           22
        //   439: getfield        K2/n0.C:Landroid/content/Context;
        //   442: astore          28
        //   444: aload           28
        //   446: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   449: astore          30
        //   451: aload           19
        //   453: invokevirtual   C/u.v:()V
        //   456: aload           30
        //   458: invokestatic    h2/A.e:(Ljava/lang/String;)V
        //   461: aload           28
        //   463: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   466: astore          29
        //   468: invokestatic    K2/J1.H0:()Ljava/security/MessageDigest;
        //   471: astore          21
        //   473: ldc2_w          -1
        //   476: lstore          5
        //   478: aload           21
        //   480: ifnonnull       500
        //   483: aload           19
        //   485: invokevirtual   C/u.j:()LK2/P;
        //   488: getfield        K2/P.H:LK2/S;
        //   491: ldc_w           "Could not get MD5 instance"
        //   494: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   497: goto            624
        //   500: aload           29
        //   502: ifnull          621
        //   505: aload           19
        //   507: aload           28
        //   509: aload           30
        //   511: invokevirtual   K2/J1.r0:(Landroid/content/Context;Ljava/lang/String;)Z
        //   514: ifne            599
        //   517: aload           28
        //   519: invokestatic    s2/b.a:(Landroid/content/Context;)LR4/b;
        //   522: bipush          64
        //   524: aload           19
        //   526: getfield        C/u.C:Ljava/lang/Object;
        //   529: checkcast       LK2/n0;
        //   532: getfield        K2/n0.C:Landroid/content/Context;
        //   535: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   538: invokevirtual   R4/b.c:(ILjava/lang/String;)Landroid/content/pm/PackageInfo;
        //   541: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //   544: astore          28
        //   546: aload           28
        //   548: ifnull          582
        //   551: aload           28
        //   553: arraylength    
        //   554: ifle            582
        //   557: aload           21
        //   559: aload           28
        //   561: iconst_0       
        //   562: aaload         
        //   563: invokevirtual   android/content/pm/Signature.toByteArray:()[B
        //   566: invokevirtual   java/security/MessageDigest.digest:([B)[B
        //   569: invokestatic    K2/J1.D:([B)J
        //   572: lstore          5
        //   574: goto            624
        //   577: astore          21
        //   579: goto            605
        //   582: aload           19
        //   584: invokevirtual   C/u.j:()LK2/P;
        //   587: getfield        K2/P.K:LK2/S;
        //   590: ldc_w           "Could not get signatures"
        //   593: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   596: goto            497
        //   599: lconst_0       
        //   600: lstore          5
        //   602: goto            497
        //   605: aload           19
        //   607: invokevirtual   C/u.j:()LK2/P;
        //   610: getfield        K2/P.H:LK2/S;
        //   613: ldc_w           "Package name not found"
        //   616: aload           21
        //   618: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //   621: lconst_0       
        //   622: lstore          5
        //   624: aload           23
        //   626: lload           5
        //   628: putfield        K2/K.I:J
        //   631: aload           23
        //   633: getfield        K2/K.I:J
        //   636: lstore          13
        //   638: aload           22
        //   640: invokevirtual   K2/n0.g:()Z
        //   643: istore          17
        //   645: aload           23
        //   647: invokevirtual   C/u.t:()LK2/a0;
        //   650: getfield        K2/a0.U:Z
        //   653: istore          16
        //   655: aload           23
        //   657: invokevirtual   K2/B.v:()V
        //   660: aload           22
        //   662: invokevirtual   K2/n0.g:()Z
        //   665: istore_1       
        //   666: aload           22
        //   668: getfield        K2/n0.I:LK2/d;
        //   671: astore          28
        //   673: iload_1        
        //   674: ifne            683
        //   677: aconst_null    
        //   678: astore          19
        //   680: goto            858
        //   683: getstatic       com/google/android/gms/internal/measurement/n4.D:Lcom/google/android/gms/internal/measurement/n4;
        //   686: invokevirtual   com/google/android/gms/internal/measurement/n4.get:()Ljava/lang/Object;
        //   689: pop            
        //   690: aload           22
        //   692: getfield        K2/n0.C:Landroid/content/Context;
        //   695: astore          29
        //   697: aload           28
        //   699: aconst_null    
        //   700: getstatic       K2/w.q0:LK2/F;
        //   703: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //   706: ifeq            729
        //   709: aload           23
        //   711: invokevirtual   C/u.j:()LK2/P;
        //   714: getfield        K2/P.P:LK2/S;
        //   717: ldc_w           "Disabled IID for tests."
        //   720: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   723: aconst_null    
        //   724: astore          19
        //   726: goto            858
        //   729: aload           29
        //   731: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //   734: ldc_w           "com.google.firebase.analytics.FirebaseAnalytics"
        //   737: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   740: astore          21
        //   742: aload           21
        //   744: ifnonnull       750
        //   747: goto            723
        //   750: aload           21
        //   752: ldc_w           "getInstance"
        //   755: iconst_1       
        //   756: anewarray       Ljava/lang/Class;
        //   759: dup            
        //   760: iconst_0       
        //   761: ldc             Landroid/content/Context;.class
        //   763: aastore        
        //   764: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   767: astore          30
        //   769: aconst_null    
        //   770: astore          19
        //   772: aload           30
        //   774: aconst_null    
        //   775: iconst_1       
        //   776: anewarray       Ljava/lang/Object;
        //   779: dup            
        //   780: iconst_0       
        //   781: aload           29
        //   783: aastore        
        //   784: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   787: astore          29
        //   789: aload           29
        //   791: ifnonnull       797
        //   794: goto            858
        //   797: aload           21
        //   799: ldc_w           "getFirebaseInstanceId"
        //   802: aconst_null    
        //   803: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   806: aload           29
        //   808: aconst_null    
        //   809: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   812: checkcast       Ljava/lang/String;
        //   815: astore          19
        //   817: goto            858
        //   820: astore          19
        //   822: aload           23
        //   824: invokevirtual   C/u.j:()LK2/P;
        //   827: getfield        K2/P.M:LK2/S;
        //   830: ldc_w           "Failed to retrieve Firebase Instance Id"
        //   833: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   836: goto            723
        //   839: astore          19
        //   841: aload           23
        //   843: invokevirtual   C/u.j:()LK2/P;
        //   846: getfield        K2/P.L:LK2/S;
        //   849: ldc_w           "Failed to obtain Firebase Analytics instance"
        //   852: invokevirtual   K2/S.f:(Ljava/lang/String;)V
        //   855: goto            723
        //   858: aload           22
        //   860: getfield        K2/n0.J:LK2/a0;
        //   863: astore          21
        //   865: aload           21
        //   867: invokestatic    K2/n0.c:(LC/u;)V
        //   870: aload           21
        //   872: getfield        K2/a0.I:LK2/b0;
        //   875: invokevirtual   K2/b0.a:()J
        //   878: lstore          7
        //   880: aload           22
        //   882: getfield        K2/n0.j0:J
        //   885: lstore          5
        //   887: lload           7
        //   889: lconst_0       
        //   890: lcmp           
        //   891: ifne            897
        //   894: goto            906
        //   897: lload           5
        //   899: lload           7
        //   901: invokestatic    java/lang/Math.min:(JJ)J
        //   904: lstore          5
        //   906: aload           23
        //   908: invokevirtual   K2/Z.z:()V
        //   911: aload           23
        //   913: getfield        K2/K.M:I
        //   916: istore          4
        //   918: aload           28
        //   920: ldc_w           "google_analytics_adid_collection_enabled"
        //   923: invokevirtual   K2/d.E:(Ljava/lang/String;)Ljava/lang/Boolean;
        //   926: astore          21
        //   928: aload           21
        //   930: ifnull          949
        //   933: aload           21
        //   935: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   938: ifeq            944
        //   941: goto            949
        //   944: iconst_0       
        //   945: istore_1       
        //   946: goto            951
        //   949: iconst_1       
        //   950: istore_1       
        //   951: aload           23
        //   953: invokevirtual   C/u.t:()LK2/a0;
        //   956: astore          21
        //   958: aload           21
        //   960: invokevirtual   C/u.v:()V
        //   963: aload           21
        //   965: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //   968: ldc_w           "deferred_analytics_collection"
        //   971: iconst_0       
        //   972: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   977: istore          18
        //   979: aload           23
        //   981: invokevirtual   K2/Z.z:()V
        //   984: aload           23
        //   986: getfield        K2/K.O:Ljava/lang/String;
        //   989: astore          29
        //   991: aload           28
        //   993: ldc_w           "google_analytics_default_allow_ad_personalization_signals"
        //   996: invokevirtual   K2/d.E:(Ljava/lang/String;)Ljava/lang/Boolean;
        //   999: astore          21
        //  1001: aload           21
        //  1003: ifnonnull       1012
        //  1006: aconst_null    
        //  1007: astore          21
        //  1009: goto            1024
        //  1012: aload           21
        //  1014: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1017: iconst_1       
        //  1018: ixor           
        //  1019: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1022: astore          21
        //  1024: aload           23
        //  1026: getfield        K2/K.K:Ljava/util/List;
        //  1029: astore          32
        //  1031: aload           23
        //  1033: invokevirtual   C/u.t:()LK2/a0;
        //  1036: invokevirtual   K2/a0.F:()LK2/z0;
        //  1039: invokevirtual   K2/z0.m:()Ljava/lang/String;
        //  1042: astore          30
        //  1044: aload           23
        //  1046: getfield        K2/K.L:Ljava/lang/String;
        //  1049: ifnonnull       1065
        //  1052: aload           23
        //  1054: aload           23
        //  1056: invokevirtual   C/u.u:()LK2/J1;
        //  1059: invokevirtual   K2/J1.G0:()Ljava/lang/String;
        //  1062: putfield        K2/K.L:Ljava/lang/String;
        //  1065: aload           23
        //  1067: getfield        K2/K.L:Ljava/lang/String;
        //  1070: astore          31
        //  1072: invokestatic    com/google/android/gms/internal/measurement/a3.a:()V
        //  1075: aload           28
        //  1077: aconst_null    
        //  1078: getstatic       K2/w.W0:LK2/F;
        //  1081: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1084: ifeq            1110
        //  1087: aload           23
        //  1089: invokevirtual   C/u.t:()LK2/a0;
        //  1092: invokevirtual   K2/a0.F:()LK2/z0;
        //  1095: getstatic       K2/y0.E:LK2/y0;
        //  1098: invokevirtual   K2/z0.i:(LK2/y0;)Z
        //  1101: ifne            1110
        //  1104: aconst_null    
        //  1105: astore          22
        //  1107: goto            1199
        //  1110: aload           23
        //  1112: invokevirtual   K2/B.v:()V
        //  1115: aload           23
        //  1117: getfield        K2/K.Q:J
        //  1120: lconst_0       
        //  1121: lcmp           
        //  1122: ifeq            1179
        //  1125: aload           22
        //  1127: getfield        K2/n0.P:Lq2/a;
        //  1130: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1133: pop            
        //  1134: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1137: lstore          7
        //  1139: aload           23
        //  1141: getfield        K2/K.Q:J
        //  1144: lstore          9
        //  1146: aload           23
        //  1148: getfield        K2/K.P:Ljava/lang/String;
        //  1151: ifnull          1179
        //  1154: lload           7
        //  1156: lload           9
        //  1158: lsub           
        //  1159: ldc2_w          86400000
        //  1162: lcmp           
        //  1163: ifle            1179
        //  1166: aload           23
        //  1168: getfield        K2/K.R:Ljava/lang/String;
        //  1171: ifnonnull       1179
        //  1174: aload           23
        //  1176: invokevirtual   K2/K.E:()V
        //  1179: aload           23
        //  1181: getfield        K2/K.P:Ljava/lang/String;
        //  1184: ifnonnull       1192
        //  1187: aload           23
        //  1189: invokevirtual   K2/K.E:()V
        //  1192: aload           23
        //  1194: getfield        K2/K.P:Ljava/lang/String;
        //  1197: astore          22
        //  1199: lconst_0       
        //  1200: lstore          9
        //  1202: aload           28
        //  1204: ldc_w           "google_analytics_sgtm_upload_enabled"
        //  1207: invokevirtual   K2/d.E:(Ljava/lang/String;)Ljava/lang/Boolean;
        //  1210: astore          33
        //  1212: aload           33
        //  1214: ifnonnull       1223
        //  1217: iconst_0       
        //  1218: istore          15
        //  1220: goto            1230
        //  1223: aload           33
        //  1225: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1228: istore          15
        //  1230: aload           23
        //  1232: invokevirtual   C/u.u:()LK2/J1;
        //  1235: astore          33
        //  1237: aload           23
        //  1239: invokevirtual   K2/K.C:()Ljava/lang/String;
        //  1242: astore          34
        //  1244: aload           33
        //  1246: getfield        C/u.C:Ljava/lang/Object;
        //  1249: checkcast       LK2/n0;
        //  1252: astore          35
        //  1254: aload           35
        //  1256: getfield        K2/n0.C:Landroid/content/Context;
        //  1259: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1262: ifnonnull       1271
        //  1265: lconst_0       
        //  1266: lstore          7
        //  1268: goto            1329
        //  1271: aload           35
        //  1273: getfield        K2/n0.C:Landroid/content/Context;
        //  1276: invokestatic    s2/b.a:(Landroid/content/Context;)LR4/b;
        //  1279: astore          35
        //  1281: aload           35
        //  1283: iconst_0       
        //  1284: aload           34
        //  1286: invokevirtual   R4/b.a:(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;
        //  1289: astore          35
        //  1291: aload           35
        //  1293: ifnull          1323
        //  1296: aload           35
        //  1298: getfield        android/content/pm/ApplicationInfo.targetSdkVersion:I
        //  1301: istore_3       
        //  1302: goto            1325
        //  1305: astore          35
        //  1307: aload           33
        //  1309: invokevirtual   C/u.j:()LK2/P;
        //  1312: getfield        K2/P.N:LK2/S;
        //  1315: ldc_w           "PackageManager failed to find running app: app_id"
        //  1318: aload           34
        //  1320: invokevirtual   K2/S.g:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1323: iconst_0       
        //  1324: istore_3       
        //  1325: iload_3        
        //  1326: i2l            
        //  1327: lstore          7
        //  1329: aload           23
        //  1331: invokevirtual   C/u.t:()LK2/a0;
        //  1334: invokevirtual   K2/a0.F:()LK2/z0;
        //  1337: astore          33
        //  1339: aload           23
        //  1341: invokevirtual   C/u.t:()LK2/a0;
        //  1344: astore          34
        //  1346: aload           34
        //  1348: invokevirtual   C/u.v:()V
        //  1351: aload           34
        //  1353: invokevirtual   K2/a0.D:()Landroid/content/SharedPreferences;
        //  1356: ldc_w           "dma_consent_settings"
        //  1359: aconst_null    
        //  1360: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1365: invokestatic    K2/n.b:(Ljava/lang/String;)LK2/n;
        //  1368: getfield        K2/n.b:Ljava/lang/String;
        //  1371: astore          34
        //  1373: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  1376: getstatic       K2/w.H0:LK2/F;
        //  1379: astore          35
        //  1381: aload           28
        //  1383: aconst_null    
        //  1384: aload           35
        //  1386: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1389: ifeq            1420
        //  1392: aload           23
        //  1394: invokevirtual   C/u.u:()LK2/J1;
        //  1397: pop            
        //  1398: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1401: bipush          30
        //  1403: if_icmplt       1420
        //  1406: invokestatic    K2/G0.C:()I
        //  1409: iconst_3       
        //  1410: if_icmple       1420
        //  1413: invokestatic    com/google/android/gms/internal/ads/po.a:()I
        //  1416: istore_3       
        //  1417: goto            1422
        //  1420: iconst_0       
        //  1421: istore_3       
        //  1422: invokestatic    com/google/android/gms/internal/measurement/b4.a:()V
        //  1425: aload           28
        //  1427: aconst_null    
        //  1428: aload           35
        //  1430: invokevirtual   K2/d.G:(Ljava/lang/String;LK2/F;)Z
        //  1433: ifeq            1446
        //  1436: aload           23
        //  1438: invokevirtual   C/u.u:()LK2/J1;
        //  1441: invokevirtual   K2/J1.E0:()J
        //  1444: lstore          9
        //  1446: aload           28
        //  1448: getfield        K2/d.E:Ljava/lang/String;
        //  1451: astore          35
        //  1453: aload           28
        //  1455: ldc_w           "google_analytics_default_allow_ad_personalization_signals"
        //  1458: iconst_1       
        //  1459: invokevirtual   K2/d.C:(Ljava/lang/String;Z)LK2/B0;
        //  1462: invokestatic    K2/z0.a:(LK2/B0;)C
        //  1465: istore_2       
        //  1466: new             LK2/B1;
        //  1469: dup            
        //  1470: aload           24
        //  1472: aload           27
        //  1474: aload           25
        //  1476: lload           11
        //  1478: aload           26
        //  1480: ldc2_w          106000
        //  1483: lload           13
        //  1485: aload           20
        //  1487: iload           17
        //  1489: iload           16
        //  1491: iconst_1       
        //  1492: ixor           
        //  1493: aload           19
        //  1495: lload           5
        //  1497: iload           4
        //  1499: iload_1        
        //  1500: iload           18
        //  1502: aload           29
        //  1504: aload           21
        //  1506: aload           23
        //  1508: getfield        K2/K.J:J
        //  1511: aload           32
        //  1513: aload           30
        //  1515: aload           31
        //  1517: aload           22
        //  1519: iload           15
        //  1521: lload           7
        //  1523: aload           33
        //  1525: getfield        K2/z0.b:I
        //  1528: aload           34
        //  1530: iload_3        
        //  1531: lload           9
        //  1533: aload           35
        //  1535: iload_2        
        //  1536: invokestatic    java/lang/String.valueOf:(C)Ljava/lang/String;
        //  1539: invokespecial   K2/B1.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V
        //  1542: areturn        
        //  1543: astore          19
        //  1545: goto            723
        //  1548: astore          35
        //  1550: goto            1307
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  505    546    577    582    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  551    574    577    582    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  582    596    577    582    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  729    742    1543   1548   Ljava/lang/ClassNotFoundException;
        //  750    769    839    858    Ljava/lang/Exception;
        //  772    789    839    858    Ljava/lang/Exception;
        //  797    817    820    839    Ljava/lang/Exception;
        //  1271   1281   1305   1307   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1281   1291   1548   1553   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1296   1302   1548   1553   Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1307:
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

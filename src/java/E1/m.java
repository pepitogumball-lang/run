package E1;

import K2.v;
import com.google.android.gms.measurement.internal.zzic;
import java.util.concurrent.Callable;

public final class m implements Callable
{
    public final int a;
    public Object b;
    
    public m(final zzic b, final v v, final String s) {
        this.a = 3;
        this.b = b;
    }
    
    public final Object call() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        E1/m.a:I
        //     4: tableswitch {
        //                0: 1707
        //                1: 1683
        //                2: 1665
        //                3: 1605
        //                4: 1594
        //                5: 111
        //          default: 44
        //        }
        //    44: aload_0        
        //    45: getfield        E1/m.b:Ljava/lang/Object;
        //    48: checkcast       Lj0/a;
        //    51: astore          7
        //    53: aload           7
        //    55: getfield        j0/a.F:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    58: iconst_1       
        //    59: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    62: bipush          10
        //    64: invokestatic    android/os/Process.setThreadPriority:(I)V
        //    67: aload           7
        //    69: getfield        j0/a.G:Lc2/d;
        //    72: invokevirtual   c2/d.d:()V
        //    75: invokestatic    android/os/Binder.flushPendingCommands:()V
        //    78: aload           7
        //    80: aconst_null    
        //    81: invokevirtual   j0/a.a:(Ljava/lang/Object;)V
        //    84: aconst_null    
        //    85: areturn        
        //    86: astore          8
        //    88: aload           7
        //    90: getfield        j0/a.E:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    93: iconst_1       
        //    94: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //    97: aload           8
        //    99: athrow         
        //   100: astore          8
        //   102: aload           7
        //   104: aconst_null    
        //   105: invokevirtual   j0/a.a:(Ljava/lang/Object;)V
        //   108: aload           8
        //   110: athrow         
        //   111: aload_0        
        //   112: getfield        E1/m.b:Ljava/lang/Object;
        //   115: checkcast       Lh1/p;
        //   118: astore          8
        //   120: aload           8
        //   122: getfield        h1/p.D:Lh1/b;
        //   125: getfield        h1/b.a:Ljava/lang/Object;
        //   128: astore          7
        //   130: aload           7
        //   132: dup            
        //   133: astore          13
        //   135: monitorenter   
        //   136: aload           8
        //   138: getfield        h1/p.D:Lh1/b;
        //   141: getfield        h1/b.b:I
        //   144: iconst_3       
        //   145: if_icmpne       159
        //   148: aload           13
        //   150: monitorexit    
        //   151: goto            1586
        //   154: astore          8
        //   156: goto            1588
        //   159: aload           8
        //   161: getfield        h1/p.D:Lh1/b;
        //   164: getfield        h1/b.b:I
        //   167: istore          5
        //   169: aload           13
        //   171: monitorexit    
        //   172: aconst_null    
        //   173: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   176: ifne            224
        //   179: new             Landroid/os/Bundle;
        //   182: dup            
        //   183: invokespecial   android/os/Bundle.<init>:()V
        //   186: astore          7
        //   188: aload           7
        //   190: ldc             "accountName"
        //   192: aconst_null    
        //   193: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   196: aload           8
        //   198: getfield        h1/p.D:Lh1/b;
        //   201: astore          9
        //   203: aload           7
        //   205: aload           9
        //   207: getfield        h1/b.c:Ljava/lang/String;
        //   210: aload           9
        //   212: getfield        h1/b.E:Ljava/lang/Long;
        //   215: invokevirtual   java/lang/Long.longValue:()J
        //   218: invokestatic    com/google/android/gms/internal/play_billing/q0.b:(Landroid/os/Bundle;Ljava/lang/String;J)V
        //   221: goto            227
        //   224: aconst_null    
        //   225: astore          7
        //   227: aload           8
        //   229: getfield        h1/p.D:Lh1/b;
        //   232: getfield        h1/b.a:Ljava/lang/Object;
        //   235: astore          10
        //   237: aload           10
        //   239: dup            
        //   240: astore          14
        //   242: monitorenter   
        //   243: aload           8
        //   245: getfield        h1/p.D:Lh1/b;
        //   248: getfield        h1/b.h:Lcom/google/android/gms/internal/play_billing/f;
        //   251: astore          9
        //   253: aload           14
        //   255: monitorexit    
        //   256: aload           9
        //   258: ifnonnull       308
        //   261: aload           8
        //   263: getfield        h1/p.D:Lh1/b;
        //   266: iconst_0       
        //   267: invokevirtual   h1/b.t:(I)V
        //   270: aload           8
        //   272: getfield        h1/p.D:Lh1/b;
        //   275: astore          9
        //   277: getstatic       h1/E.k:Lh1/f;
        //   280: astore          7
        //   282: aload           9
        //   284: bipush          119
        //   286: bipush          6
        //   288: aload           7
        //   290: invokevirtual   h1/b.H:(IILh1/f;)V
        //   293: aload           8
        //   295: aload           7
        //   297: invokevirtual   h1/p.a:(Lh1/f;)V
        //   300: goto            151
        //   303: astore          7
        //   305: goto            1180
        //   308: aload           8
        //   310: getfield        h1/p.D:Lh1/b;
        //   313: getfield        h1/b.f:Landroid/content/Context;
        //   316: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   319: astore          10
        //   321: iconst_3       
        //   322: istore_1       
        //   323: bipush          23
        //   325: istore_2       
        //   326: iload_2        
        //   327: iconst_3       
        //   328: if_icmplt       458
        //   331: aload           7
        //   333: ifnonnull       394
        //   336: aload           9
        //   338: checkcast       Lcom/google/android/gms/internal/play_billing/e;
        //   341: astore          11
        //   343: aload           11
        //   345: invokevirtual   B2/a.o5:()Landroid/os/Parcel;
        //   348: astore          12
        //   350: aload           12
        //   352: iload_2        
        //   353: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   356: aload           12
        //   358: aload           10
        //   360: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   363: aload           12
        //   365: ldc             "subs"
        //   367: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   370: aload           11
        //   372: aload           12
        //   374: iconst_1       
        //   375: invokevirtual   B2/a.p5:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   378: astore          11
        //   380: aload           11
        //   382: invokevirtual   android/os/Parcel.readInt:()I
        //   385: istore_1       
        //   386: aload           11
        //   388: invokevirtual   android/os/Parcel.recycle:()V
        //   391: goto            410
        //   394: aload           9
        //   396: checkcast       Lcom/google/android/gms/internal/play_billing/e;
        //   399: iload_2        
        //   400: aload           10
        //   402: ldc             "subs"
        //   404: aload           7
        //   406: invokevirtual   com/google/android/gms/internal/play_billing/e.r5:(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I
        //   409: istore_1       
        //   410: iload_1        
        //   411: ifne            452
        //   414: new             Ljava/lang/StringBuilder;
        //   417: astore          11
        //   419: aload           11
        //   421: invokespecial   java/lang/StringBuilder.<init>:()V
        //   424: aload           11
        //   426: ldc             "highestLevelSupportedForSubs: "
        //   428: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   431: pop            
        //   432: aload           11
        //   434: iload_2        
        //   435: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   438: pop            
        //   439: ldc             "BillingClient"
        //   441: aload           11
        //   443: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   446: invokestatic    com/google/android/gms/internal/play_billing/q0.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   449: goto            460
        //   452: iinc            2, -1
        //   455: goto            326
        //   458: iconst_0       
        //   459: istore_2       
        //   460: aload           8
        //   462: getfield        h1/p.D:Lh1/b;
        //   465: astore          11
        //   467: iload_2        
        //   468: iconst_5       
        //   469: if_icmplt       478
        //   472: iconst_1       
        //   473: istore          6
        //   475: goto            481
        //   478: iconst_0       
        //   479: istore          6
        //   481: aload           11
        //   483: iload           6
        //   485: putfield        h1/b.k:Z
        //   488: iload_2        
        //   489: iconst_3       
        //   490: if_icmplt       499
        //   493: iconst_1       
        //   494: istore          6
        //   496: goto            502
        //   499: iconst_0       
        //   500: istore          6
        //   502: aload           11
        //   504: iload           6
        //   506: putfield        h1/b.j:Z
        //   509: iload_2        
        //   510: iconst_3       
        //   511: if_icmpge       527
        //   514: ldc             "BillingClient"
        //   516: ldc             "In-app billing API does not support subscription on this device."
        //   518: invokestatic    com/google/android/gms/internal/play_billing/q0.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   521: bipush          9
        //   523: istore_2       
        //   524: goto            529
        //   527: iconst_1       
        //   528: istore_2       
        //   529: bipush          23
        //   531: istore_3       
        //   532: iload_3        
        //   533: iconst_3       
        //   534: if_icmplt       673
        //   537: aload           7
        //   539: ifnonnull       600
        //   542: aload           9
        //   544: checkcast       Lcom/google/android/gms/internal/play_billing/e;
        //   547: astore          12
        //   549: aload           12
        //   551: invokevirtual   B2/a.o5:()Landroid/os/Parcel;
        //   554: astore          11
        //   556: aload           11
        //   558: iload_3        
        //   559: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   562: aload           11
        //   564: aload           10
        //   566: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   569: aload           11
        //   571: ldc             "inapp"
        //   573: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   576: aload           12
        //   578: aload           11
        //   580: iconst_1       
        //   581: invokevirtual   B2/a.p5:(Landroid/os/Parcel;I)Landroid/os/Parcel;
        //   584: astore          11
        //   586: aload           11
        //   588: invokevirtual   android/os/Parcel.readInt:()I
        //   591: istore_1       
        //   592: aload           11
        //   594: invokevirtual   android/os/Parcel.recycle:()V
        //   597: goto            616
        //   600: aload           9
        //   602: checkcast       Lcom/google/android/gms/internal/play_billing/e;
        //   605: iload_3        
        //   606: aload           10
        //   608: ldc             "inapp"
        //   610: aload           7
        //   612: invokevirtual   com/google/android/gms/internal/play_billing/e.r5:(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I
        //   615: istore_1       
        //   616: iload_1        
        //   617: ifne            667
        //   620: aload           8
        //   622: getfield        h1/p.D:Lh1/b;
        //   625: iload_3        
        //   626: putfield        h1/b.l:I
        //   629: new             Ljava/lang/StringBuilder;
        //   632: astore          7
        //   634: aload           7
        //   636: invokespecial   java/lang/StringBuilder.<init>:()V
        //   639: aload           7
        //   641: ldc             "mHighestLevelSupportedForInApp: "
        //   643: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   646: pop            
        //   647: aload           7
        //   649: iload_3        
        //   650: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   653: pop            
        //   654: ldc             "BillingClient"
        //   656: aload           7
        //   658: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   661: invokestatic    com/google/android/gms/internal/play_billing/q0.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   664: goto            673
        //   667: iinc            3, -1
        //   670: goto            532
        //   673: aload           8
        //   675: getfield        h1/p.D:Lh1/b;
        //   678: astore          7
        //   680: aload           7
        //   682: getfield        h1/b.l:I
        //   685: istore_3       
        //   686: iload_3        
        //   687: bipush          23
        //   689: if_icmplt       698
        //   692: iconst_1       
        //   693: istore          6
        //   695: goto            701
        //   698: iconst_0       
        //   699: istore          6
        //   701: aload           7
        //   703: iload           6
        //   705: putfield        h1/b.z:Z
        //   708: iload_3        
        //   709: bipush          22
        //   711: if_icmplt       720
        //   714: iconst_1       
        //   715: istore          6
        //   717: goto            723
        //   720: iconst_0       
        //   721: istore          6
        //   723: aload           7
        //   725: iload           6
        //   727: putfield        h1/b.y:Z
        //   730: iload_3        
        //   731: bipush          21
        //   733: if_icmplt       742
        //   736: iconst_1       
        //   737: istore          6
        //   739: goto            745
        //   742: iconst_0       
        //   743: istore          6
        //   745: aload           7
        //   747: iload           6
        //   749: putfield        h1/b.x:Z
        //   752: iload_3        
        //   753: bipush          20
        //   755: if_icmplt       764
        //   758: iconst_1       
        //   759: istore          6
        //   761: goto            767
        //   764: iconst_0       
        //   765: istore          6
        //   767: aload           7
        //   769: iload           6
        //   771: putfield        h1/b.w:Z
        //   774: iload_3        
        //   775: bipush          19
        //   777: if_icmplt       786
        //   780: iconst_1       
        //   781: istore          6
        //   783: goto            789
        //   786: iconst_0       
        //   787: istore          6
        //   789: aload           7
        //   791: iload           6
        //   793: putfield        h1/b.v:Z
        //   796: iload_3        
        //   797: bipush          18
        //   799: if_icmplt       808
        //   802: iconst_1       
        //   803: istore          6
        //   805: goto            811
        //   808: iconst_0       
        //   809: istore          6
        //   811: aload           7
        //   813: iload           6
        //   815: putfield        h1/b.u:Z
        //   818: iload_3        
        //   819: bipush          17
        //   821: if_icmplt       830
        //   824: iconst_1       
        //   825: istore          6
        //   827: goto            833
        //   830: iconst_0       
        //   831: istore          6
        //   833: aload           7
        //   835: iload           6
        //   837: putfield        h1/b.t:Z
        //   840: iload_3        
        //   841: bipush          16
        //   843: if_icmplt       852
        //   846: iconst_1       
        //   847: istore          6
        //   849: goto            855
        //   852: iconst_0       
        //   853: istore          6
        //   855: aload           7
        //   857: iload           6
        //   859: putfield        h1/b.s:Z
        //   862: iload_3        
        //   863: bipush          15
        //   865: if_icmplt       874
        //   868: iconst_1       
        //   869: istore          6
        //   871: goto            877
        //   874: iconst_0       
        //   875: istore          6
        //   877: aload           7
        //   879: iload           6
        //   881: putfield        h1/b.r:Z
        //   884: iload_3        
        //   885: bipush          14
        //   887: if_icmplt       896
        //   890: iconst_1       
        //   891: istore          6
        //   893: goto            899
        //   896: iconst_0       
        //   897: istore          6
        //   899: aload           7
        //   901: iload           6
        //   903: putfield        h1/b.q:Z
        //   906: iload_3        
        //   907: bipush          12
        //   909: if_icmplt       918
        //   912: iconst_1       
        //   913: istore          6
        //   915: goto            921
        //   918: iconst_0       
        //   919: istore          6
        //   921: aload           7
        //   923: iload           6
        //   925: putfield        h1/b.p:Z
        //   928: iload_3        
        //   929: bipush          9
        //   931: if_icmplt       940
        //   934: iconst_1       
        //   935: istore          6
        //   937: goto            943
        //   940: iconst_0       
        //   941: istore          6
        //   943: aload           7
        //   945: iload           6
        //   947: putfield        h1/b.o:Z
        //   950: iload_3        
        //   951: bipush          8
        //   953: if_icmplt       962
        //   956: iconst_1       
        //   957: istore          6
        //   959: goto            965
        //   962: iconst_0       
        //   963: istore          6
        //   965: aload           7
        //   967: iload           6
        //   969: putfield        h1/b.n:Z
        //   972: iload_3        
        //   973: bipush          6
        //   975: if_icmplt       984
        //   978: iconst_1       
        //   979: istore          6
        //   981: goto            987
        //   984: iconst_0       
        //   985: istore          6
        //   987: aload           7
        //   989: iload           6
        //   991: putfield        h1/b.m:Z
        //   994: iload_3        
        //   995: iconst_3       
        //   996: if_icmpge       1009
        //   999: ldc             "BillingClient"
        //  1001: ldc             "In-app billing API version 3 is not supported on this device."
        //  1003: invokestatic    com/google/android/gms/internal/play_billing/q0.g:(Ljava/lang/String;Ljava/lang/String;)V
        //  1006: bipush          36
        //  1008: istore_2       
        //  1009: iload_1        
        //  1010: ifne            1147
        //  1013: aload           8
        //  1015: getfield        h1/p.D:Lh1/b;
        //  1018: getfield        h1/b.a:Ljava/lang/Object;
        //  1021: astore          9
        //  1023: aload           9
        //  1025: dup            
        //  1026: astore          15
        //  1028: monitorenter   
        //  1029: aload           8
        //  1031: getfield        h1/p.D:Lh1/b;
        //  1034: getfield        h1/b.b:I
        //  1037: iconst_3       
        //  1038: if_icmpne       1052
        //  1041: aload           15
        //  1043: monitorexit    
        //  1044: goto            1586
        //  1047: astore          7
        //  1049: goto            1141
        //  1052: iload           5
        //  1054: iconst_1       
        //  1055: if_icmpne       1064
        //  1058: iconst_0       
        //  1059: istore          4
        //  1061: goto            1067
        //  1064: iconst_1       
        //  1065: istore          4
        //  1067: aload           8
        //  1069: getfield        h1/p.D:Lh1/b;
        //  1072: iconst_2       
        //  1073: invokevirtual   h1/b.t:(I)V
        //  1076: aload           8
        //  1078: getfield        h1/p.D:Lh1/b;
        //  1081: getfield        h1/b.e:Lh1/F;
        //  1084: ifnull          1100
        //  1087: aload           8
        //  1089: getfield        h1/p.D:Lh1/b;
        //  1092: getfield        h1/b.e:Lh1/F;
        //  1095: astore          7
        //  1097: goto            1103
        //  1100: aconst_null    
        //  1101: astore          7
        //  1103: aload           15
        //  1105: monitorexit    
        //  1106: iload           4
        //  1108: istore_3       
        //  1109: aload           7
        //  1111: ifnull          1130
        //  1114: aload           7
        //  1116: aload           8
        //  1118: getfield        h1/p.D:Lh1/b;
        //  1121: getfield        h1/b.x:Z
        //  1124: invokevirtual   h1/F.g:(Z)V
        //  1127: iload           4
        //  1129: istore_3       
        //  1130: aconst_null    
        //  1131: astore          7
        //  1133: iload_2        
        //  1134: istore          4
        //  1136: iload_1        
        //  1137: istore_2       
        //  1138: goto            1288
        //  1141: aload           15
        //  1143: monitorexit    
        //  1144: aload           7
        //  1146: athrow         
        //  1147: iload           5
        //  1149: iconst_1       
        //  1150: if_icmpne       1158
        //  1153: iconst_0       
        //  1154: istore_3       
        //  1155: goto            1160
        //  1158: iconst_1       
        //  1159: istore_3       
        //  1160: aload           8
        //  1162: getfield        h1/p.D:Lh1/b;
        //  1165: iconst_0       
        //  1166: invokevirtual   h1/b.t:(I)V
        //  1169: goto            1130
        //  1172: astore          7
        //  1174: aload           14
        //  1176: monitorexit    
        //  1177: aload           7
        //  1179: athrow         
        //  1180: iload           5
        //  1182: iconst_1       
        //  1183: if_icmpne       1191
        //  1186: iconst_0       
        //  1187: istore_2       
        //  1188: goto            1193
        //  1191: iconst_1       
        //  1192: istore_2       
        //  1193: ldc             "BillingClient"
        //  1195: ldc_w           "Exception while checking if billing is supported; try to reconnect"
        //  1198: aload           7
        //  1200: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1203: aload           7
        //  1205: instanceof      Landroid/os/DeadObjectException;
        //  1208: ifeq            1217
        //  1211: bipush          101
        //  1213: istore_1       
        //  1214: goto            1248
        //  1217: aload           7
        //  1219: instanceof      Landroid/os/RemoteException;
        //  1222: ifeq            1231
        //  1225: bipush          100
        //  1227: istore_1       
        //  1228: goto            1214
        //  1231: aload           7
        //  1233: instanceof      Ljava/lang/SecurityException;
        //  1236: ifeq            1245
        //  1239: bipush          102
        //  1241: istore_1       
        //  1242: goto            1214
        //  1245: bipush          42
        //  1247: istore_1       
        //  1248: iload_1        
        //  1249: bipush          42
        //  1251: if_icmpne       1264
        //  1254: aload           7
        //  1256: invokestatic    h1/C.a:(Ljava/lang/Exception;)Ljava/lang/String;
        //  1259: astore          7
        //  1261: goto            1267
        //  1264: aconst_null    
        //  1265: astore          7
        //  1267: aload           8
        //  1269: getfield        h1/p.D:Lh1/b;
        //  1272: iconst_0       
        //  1273: invokevirtual   h1/b.t:(I)V
        //  1276: bipush          6
        //  1278: istore          4
        //  1280: iload_2        
        //  1281: istore_3       
        //  1282: iload           4
        //  1284: istore_2       
        //  1285: iload_1        
        //  1286: istore          4
        //  1288: iload_2        
        //  1289: ifne            1402
        //  1292: iconst_1       
        //  1293: iload_3        
        //  1294: if_icmpeq       1315
        //  1297: aload           8
        //  1299: getfield        h1/p.D:Lh1/b;
        //  1302: bipush          6
        //  1304: invokevirtual   h1/b.J:(I)V
        //  1307: goto            1391
        //  1310: astore          7
        //  1312: goto            1381
        //  1315: aload           8
        //  1317: getfield        h1/p.D:Lh1/b;
        //  1320: getfield        h1/b.g:Lh1/m;
        //  1323: astore          7
        //  1325: invokestatic    com/google/android/gms/internal/play_billing/p2.o:()Lcom/google/android/gms/internal/play_billing/o2;
        //  1328: astore          9
        //  1330: invokestatic    com/google/android/gms/internal/play_billing/Y1.r:()Lcom/google/android/gms/internal/play_billing/X1;
        //  1333: astore          10
        //  1335: aload           10
        //  1337: iconst_0       
        //  1338: invokevirtual   com/google/android/gms/internal/play_billing/X1.f:(I)V
        //  1341: aload           9
        //  1343: invokevirtual   com/google/android/gms/internal/play_billing/h1.e:()V
        //  1346: aload           9
        //  1348: getfield        com/google/android/gms/internal/play_billing/h1.D:Lcom/google/android/gms/internal/play_billing/i1;
        //  1351: checkcast       Lcom/google/android/gms/internal/play_billing/p2;
        //  1354: aload           10
        //  1356: invokevirtual   com/google/android/gms/internal/play_billing/h1.b:()Lcom/google/android/gms/internal/play_billing/i1;
        //  1359: checkcast       Lcom/google/android/gms/internal/play_billing/Y1;
        //  1362: invokestatic    com/google/android/gms/internal/play_billing/p2.n:(Lcom/google/android/gms/internal/play_billing/p2;Lcom/google/android/gms/internal/play_billing/Y1;)V
        //  1365: aload           7
        //  1367: aload           9
        //  1369: invokevirtual   com/google/android/gms/internal/play_billing/h1.b:()Lcom/google/android/gms/internal/play_billing/i1;
        //  1372: checkcast       Lcom/google/android/gms/internal/play_billing/p2;
        //  1375: invokevirtual   h1/m.o:(Lcom/google/android/gms/internal/play_billing/p2;)V
        //  1378: goto            1391
        //  1381: ldc             "BillingClient"
        //  1383: ldc_w           "Unable to log."
        //  1386: aload           7
        //  1388: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1391: aload           8
        //  1393: getstatic       h1/E.j:Lh1/f;
        //  1396: invokevirtual   h1/p.a:(Lh1/f;)V
        //  1399: goto            1044
        //  1402: getstatic       h1/E.a:Lh1/f;
        //  1405: astore          10
        //  1407: iconst_1       
        //  1408: iload_3        
        //  1409: if_icmpeq       1436
        //  1412: aload           8
        //  1414: getfield        h1/p.D:Lh1/b;
        //  1417: iload           4
        //  1419: bipush          6
        //  1421: aload           10
        //  1423: aload           7
        //  1425: invokevirtual   h1/b.I:(IILh1/f;Ljava/lang/String;)V
        //  1428: goto            1575
        //  1431: astore          7
        //  1433: goto            1565
        //  1436: invokestatic    com/google/android/gms/internal/play_billing/Y1.r:()Lcom/google/android/gms/internal/play_billing/X1;
        //  1439: astore          9
        //  1441: aload           9
        //  1443: aload           10
        //  1445: getfield        h1/f.a:I
        //  1448: invokevirtual   com/google/android/gms/internal/play_billing/X1.f:(I)V
        //  1451: aload           10
        //  1453: getfield        h1/f.b:Ljava/lang/String;
        //  1456: astore          10
        //  1458: aload           9
        //  1460: invokevirtual   com/google/android/gms/internal/play_billing/h1.e:()V
        //  1463: aload           9
        //  1465: getfield        com/google/android/gms/internal/play_billing/h1.D:Lcom/google/android/gms/internal/play_billing/i1;
        //  1468: checkcast       Lcom/google/android/gms/internal/play_billing/Y1;
        //  1471: aload           10
        //  1473: invokestatic    com/google/android/gms/internal/play_billing/Y1.o:(Lcom/google/android/gms/internal/play_billing/Y1;Ljava/lang/String;)V
        //  1476: aload           9
        //  1478: iload           4
        //  1480: invokevirtual   com/google/android/gms/internal/play_billing/X1.g:(I)V
        //  1483: aload           7
        //  1485: ifnull          1506
        //  1488: aload           9
        //  1490: invokevirtual   com/google/android/gms/internal/play_billing/h1.e:()V
        //  1493: aload           9
        //  1495: getfield        com/google/android/gms/internal/play_billing/h1.D:Lcom/google/android/gms/internal/play_billing/i1;
        //  1498: checkcast       Lcom/google/android/gms/internal/play_billing/Y1;
        //  1501: aload           7
        //  1503: invokestatic    com/google/android/gms/internal/play_billing/Y1.n:(Lcom/google/android/gms/internal/play_billing/Y1;Ljava/lang/String;)V
        //  1506: aload           8
        //  1508: getfield        h1/p.D:Lh1/b;
        //  1511: getfield        h1/b.g:Lh1/m;
        //  1514: astore          7
        //  1516: invokestatic    com/google/android/gms/internal/play_billing/p2.o:()Lcom/google/android/gms/internal/play_billing/o2;
        //  1519: astore          10
        //  1521: aload           9
        //  1523: invokevirtual   com/google/android/gms/internal/play_billing/h1.b:()Lcom/google/android/gms/internal/play_billing/i1;
        //  1526: checkcast       Lcom/google/android/gms/internal/play_billing/Y1;
        //  1529: astore          9
        //  1531: aload           10
        //  1533: invokevirtual   com/google/android/gms/internal/play_billing/h1.e:()V
        //  1536: aload           10
        //  1538: getfield        com/google/android/gms/internal/play_billing/h1.D:Lcom/google/android/gms/internal/play_billing/i1;
        //  1541: checkcast       Lcom/google/android/gms/internal/play_billing/p2;
        //  1544: aload           9
        //  1546: invokestatic    com/google/android/gms/internal/play_billing/p2.n:(Lcom/google/android/gms/internal/play_billing/p2;Lcom/google/android/gms/internal/play_billing/Y1;)V
        //  1549: aload           7
        //  1551: aload           10
        //  1553: invokevirtual   com/google/android/gms/internal/play_billing/h1.b:()Lcom/google/android/gms/internal/play_billing/i1;
        //  1556: checkcast       Lcom/google/android/gms/internal/play_billing/p2;
        //  1559: invokevirtual   h1/m.o:(Lcom/google/android/gms/internal/play_billing/p2;)V
        //  1562: goto            1575
        //  1565: ldc             "BillingClient"
        //  1567: ldc_w           "Unable to log."
        //  1570: aload           7
        //  1572: invokestatic    com/google/android/gms/internal/play_billing/q0.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1575: aload           8
        //  1577: getstatic       h1/E.a:Lh1/f;
        //  1580: invokevirtual   h1/p.a:(Lh1/f;)V
        //  1583: goto            1044
        //  1586: aconst_null    
        //  1587: areturn        
        //  1588: aload           13
        //  1590: monitorexit    
        //  1591: aload           8
        //  1593: athrow         
        //  1594: aload_0        
        //  1595: getfield        E1/m.b:Ljava/lang/Object;
        //  1598: checkcast       LP1/a;
        //  1601: invokevirtual   P1/a.getViewSignals:()Ljava/lang/String;
        //  1604: areturn        
        //  1605: aload_0        
        //  1606: getfield        E1/m.b:Ljava/lang/Object;
        //  1609: checkcast       Lcom/google/android/gms/measurement/internal/zzic;
        //  1612: astore          7
        //  1614: aload           7
        //  1616: getfield        com/google/android/gms/measurement/internal/zzic.C:LK2/y1;
        //  1619: invokevirtual   K2/y1.e0:()V
        //  1622: aload           7
        //  1624: getfield        com/google/android/gms/measurement/internal/zzic.C:LK2/y1;
        //  1627: getfield        K2/y1.J:LK2/T;
        //  1630: astore          7
        //  1632: aload           7
        //  1634: invokestatic    K2/y1.r:(LK2/u1;)V
        //  1637: aload           7
        //  1639: invokevirtual   C/u.v:()V
        //  1642: aload           7
        //  1644: getfield        C/u.C:Ljava/lang/Object;
        //  1647: checkcast       LK2/n0;
        //  1650: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1653: pop            
        //  1654: new             Ljava/lang/IllegalStateException;
        //  1657: dup            
        //  1658: ldc_w           "Unexpected call on client side"
        //  1661: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1664: athrow         
        //  1665: new             Lcom/google/android/gms/internal/measurement/m2;
        //  1668: dup            
        //  1669: aload_0        
        //  1670: getfield        E1/m.b:Ljava/lang/Object;
        //  1673: checkcast       LK2/h0;
        //  1676: getfield        K2/h0.M:LC2/b;
        //  1679: invokespecial   com/google/android/gms/internal/measurement/m2.<init>:(LC2/b;)V
        //  1682: areturn        
        //  1683: getstatic       I1/M.l:LI1/I;
        //  1686: astore          7
        //  1688: getstatic       E1/o.B:LE1/o;
        //  1691: getfield        E1/o.c:LI1/M;
        //  1694: astore          7
        //  1696: aload_0        
        //  1697: getfield        E1/m.b:Ljava/lang/Object;
        //  1700: checkcast       Landroid/net/Uri;
        //  1703: invokestatic    I1/M.l:(Landroid/net/Uri;)Ljava/util/HashMap;
        //  1706: areturn        
        //  1707: aload_0        
        //  1708: getfield        E1/m.b:Ljava/lang/Object;
        //  1711: checkcast       Lcom/google/android/gms/ads/internal/zzu;
        //  1714: astore          7
        //  1716: aload           7
        //  1718: getfield        com/google/android/gms/ads/internal/zzu.C:LJ1/a;
        //  1721: getfield        J1/a.C:Ljava/lang/String;
        //  1724: astore          9
        //  1726: new             Ljava/lang/Object;
        //  1729: dup            
        //  1730: invokespecial   java/lang/Object.<init>:()V
        //  1733: astore          8
        //  1735: aload           8
        //  1737: aload           9
        //  1739: putfield        O2/r.D:Ljava/lang/Object;
        //  1742: aload           8
        //  1744: iconst_0       
        //  1745: putfield        O2/r.C:Z
        //  1748: aload           8
        //  1750: invokestatic    com/google/android/gms/internal/ads/i4.z:()Lcom/google/android/gms/internal/ads/i4;
        //  1753: putfield        O2/r.E:Ljava/lang/Object;
        //  1756: getstatic       com/google/android/gms/internal/ads/j4.zza:I
        //  1759: istore_1       
        //  1760: new             Lcom/google/android/gms/internal/ads/V4;
        //  1763: dup            
        //  1764: aload           7
        //  1766: getfield        com/google/android/gms/ads/internal/zzu.F:Landroid/content/Context;
        //  1769: aload           8
        //  1771: invokestatic    com/google/android/gms/internal/ads/U4.u:(Landroid/content/Context;LO2/r;)Lcom/google/android/gms/internal/ads/U4;
        //  1774: invokespecial   com/google/android/gms/internal/ads/V4.<init>:(Lcom/google/android/gms/internal/ads/T4;)V
        //  1777: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  62     78     86     111    Any
        //  88     100    100    111    Any
        //  136    151    154    1594   Any
        //  159    172    154    1594   Any
        //  227    243    303    1288   Ljava/lang/Exception;
        //  243    256    1172   1180   Any
        //  261    300    303    1288   Ljava/lang/Exception;
        //  308    321    303    1288   Ljava/lang/Exception;
        //  336    391    303    1288   Ljava/lang/Exception;
        //  394    410    303    1288   Ljava/lang/Exception;
        //  414    449    303    1288   Ljava/lang/Exception;
        //  460    467    303    1288   Ljava/lang/Exception;
        //  481    488    303    1288   Ljava/lang/Exception;
        //  502    509    303    1288   Ljava/lang/Exception;
        //  514    521    303    1288   Ljava/lang/Exception;
        //  542    597    303    1288   Ljava/lang/Exception;
        //  600    616    303    1288   Ljava/lang/Exception;
        //  620    664    303    1288   Ljava/lang/Exception;
        //  673    686    303    1288   Ljava/lang/Exception;
        //  701    708    303    1288   Ljava/lang/Exception;
        //  723    730    303    1288   Ljava/lang/Exception;
        //  745    752    303    1288   Ljava/lang/Exception;
        //  767    774    303    1288   Ljava/lang/Exception;
        //  789    796    303    1288   Ljava/lang/Exception;
        //  811    818    303    1288   Ljava/lang/Exception;
        //  833    840    303    1288   Ljava/lang/Exception;
        //  855    862    303    1288   Ljava/lang/Exception;
        //  877    884    303    1288   Ljava/lang/Exception;
        //  899    906    303    1288   Ljava/lang/Exception;
        //  921    928    303    1288   Ljava/lang/Exception;
        //  943    950    303    1288   Ljava/lang/Exception;
        //  965    972    303    1288   Ljava/lang/Exception;
        //  987    994    303    1288   Ljava/lang/Exception;
        //  999    1006   303    1288   Ljava/lang/Exception;
        //  1013   1029   303    1288   Ljava/lang/Exception;
        //  1029   1044   1047   1147   Any
        //  1067   1097   1047   1147   Any
        //  1103   1106   1047   1147   Any
        //  1114   1127   303    1288   Ljava/lang/Exception;
        //  1141   1144   1047   1147   Any
        //  1144   1147   303    1288   Ljava/lang/Exception;
        //  1160   1169   303    1288   Ljava/lang/Exception;
        //  1174   1177   1172   1180   Any
        //  1177   1180   303    1288   Ljava/lang/Exception;
        //  1297   1307   1310   1315   Any
        //  1315   1378   1310   1315   Any
        //  1412   1428   1431   1436   Any
        //  1436   1483   1431   1436   Any
        //  1488   1506   1431   1436   Any
        //  1506   1562   1431   1436   Any
        //  1588   1591   154    1594   Any
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

package K2;

import java.util.List;
import h2.A;

public final class k
{
    public final String a;
    public long b;
    public final h c;
    
    public k(final h c, final String a) {
        this.c = c;
        this.b = -1L;
        A.e(a);
        this.a = a;
    }
    
    public final List a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        K2/k.c:LK2/h;
        //     4: astore          14
        //     6: new             Ljava/util/ArrayList;
        //     9: dup            
        //    10: invokespecial   java/util/ArrayList.<init>:()V
        //    13: astore          12
        //    15: aload_0        
        //    16: getfield        K2/k.b:J
        //    19: lstore_2       
        //    20: aload_0        
        //    21: getfield        K2/k.a:Ljava/lang/String;
        //    24: astore          13
        //    26: aconst_null    
        //    27: astore          9
        //    29: aconst_null    
        //    30: astore          8
        //    32: aload           14
        //    34: invokevirtual   K2/h.D:()Landroid/database/sqlite/SQLiteDatabase;
        //    37: ldc             "raw_events"
        //    39: bipush          6
        //    41: anewarray       Ljava/lang/String;
        //    44: dup            
        //    45: iconst_0       
        //    46: ldc             "rowid"
        //    48: aastore        
        //    49: dup            
        //    50: iconst_1       
        //    51: ldc             "name"
        //    53: aastore        
        //    54: dup            
        //    55: iconst_2       
        //    56: ldc             "timestamp"
        //    58: aastore        
        //    59: dup            
        //    60: iconst_3       
        //    61: ldc             "metadata_fingerprint"
        //    63: aastore        
        //    64: dup            
        //    65: iconst_4       
        //    66: ldc             "data"
        //    68: aastore        
        //    69: dup            
        //    70: iconst_5       
        //    71: ldc             "realtime"
        //    73: aastore        
        //    74: ldc             "app_id = ? and rowid > ?"
        //    76: iconst_2       
        //    77: anewarray       Ljava/lang/String;
        //    80: dup            
        //    81: iconst_0       
        //    82: aload           13
        //    84: aastore        
        //    85: dup            
        //    86: iconst_1       
        //    87: lload_2        
        //    88: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    91: aastore        
        //    92: aconst_null    
        //    93: aconst_null    
        //    94: ldc             "rowid"
        //    96: ldc             "1000"
        //    98: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   101: astore          10
        //   103: aload           10
        //   105: astore          8
        //   107: aload           10
        //   109: astore          9
        //   111: aload           10
        //   113: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   118: ifne            154
        //   121: aload           10
        //   123: astore          8
        //   125: aload           10
        //   127: astore          9
        //   129: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   132: astore          11
        //   134: aload           10
        //   136: invokeinterface android/database/Cursor.close:()V
        //   141: aload           11
        //   143: areturn        
        //   144: astore          9
        //   146: goto            555
        //   149: astore          10
        //   151: goto            516
        //   154: iconst_0       
        //   155: istore_1       
        //   156: aload           10
        //   158: astore          8
        //   160: aload           10
        //   162: astore          9
        //   164: aload           10
        //   166: iconst_0       
        //   167: invokeinterface android/database/Cursor.getLong:(I)J
        //   172: lstore_2       
        //   173: aload           10
        //   175: astore          8
        //   177: aload           10
        //   179: astore          9
        //   181: aload           10
        //   183: iconst_3       
        //   184: invokeinterface android/database/Cursor.getLong:(I)J
        //   189: lstore          4
        //   191: aload           10
        //   193: astore          8
        //   195: aload           10
        //   197: astore          9
        //   199: aload           10
        //   201: iconst_5       
        //   202: invokeinterface android/database/Cursor.getLong:(I)J
        //   207: lconst_1       
        //   208: lcmp           
        //   209: ifne            214
        //   212: iconst_1       
        //   213: istore_1       
        //   214: aload           10
        //   216: astore          8
        //   218: aload           10
        //   220: astore          9
        //   222: aload           10
        //   224: iconst_4       
        //   225: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   230: astore          11
        //   232: aload           10
        //   234: astore          8
        //   236: aload           10
        //   238: astore          9
        //   240: lload_2        
        //   241: aload_0        
        //   242: getfield        K2/k.b:J
        //   245: lcmp           
        //   246: ifle            262
        //   249: aload           10
        //   251: astore          8
        //   253: aload           10
        //   255: astore          9
        //   257: aload_0        
        //   258: lload_2        
        //   259: putfield        K2/k.b:J
        //   262: aload           10
        //   264: astore          8
        //   266: aload           10
        //   268: astore          9
        //   270: invokestatic    com/google/android/gms/internal/measurement/f1.B:()Lcom/google/android/gms/internal/measurement/e1;
        //   273: aload           11
        //   275: invokestatic    K2/T.L:(Lcom/google/android/gms/internal/measurement/f2;[B)Lcom/google/android/gms/internal/measurement/f2;
        //   278: checkcast       Lcom/google/android/gms/internal/measurement/e1;
        //   281: astore          15
        //   283: aload           10
        //   285: astore          8
        //   287: aload           10
        //   289: astore          9
        //   291: aload           10
        //   293: iconst_1       
        //   294: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   299: astore          11
        //   301: aload           11
        //   303: ifnull          309
        //   306: goto            313
        //   309: ldc             ""
        //   311: astore          11
        //   313: aload           10
        //   315: astore          8
        //   317: aload           10
        //   319: astore          9
        //   321: aload           15
        //   323: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //   326: aload           10
        //   328: astore          8
        //   330: aload           10
        //   332: astore          9
        //   334: aload           15
        //   336: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //   339: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //   342: aload           11
        //   344: invokestatic    com/google/android/gms/internal/measurement/f1.w:(Lcom/google/android/gms/internal/measurement/f1;Ljava/lang/String;)V
        //   347: aload           10
        //   349: astore          8
        //   351: aload           10
        //   353: astore          9
        //   355: aload           10
        //   357: iconst_2       
        //   358: invokeinterface android/database/Cursor.getLong:(I)J
        //   363: lstore          6
        //   365: aload           10
        //   367: astore          8
        //   369: aload           10
        //   371: astore          9
        //   373: aload           15
        //   375: invokevirtual   com/google/android/gms/internal/measurement/f2.f:()V
        //   378: aload           10
        //   380: astore          8
        //   382: aload           10
        //   384: astore          9
        //   386: lload           6
        //   388: aload           15
        //   390: getfield        com/google/android/gms/internal/measurement/f2.D:Lcom/google/android/gms/internal/measurement/g2;
        //   393: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //   396: invokestatic    com/google/android/gms/internal/measurement/f1.y:(JLcom/google/android/gms/internal/measurement/f1;)V
        //   399: aload           10
        //   401: astore          8
        //   403: aload           10
        //   405: astore          9
        //   407: new             LK2/i;
        //   410: astore          11
        //   412: aload           10
        //   414: astore          8
        //   416: aload           10
        //   418: astore          9
        //   420: aload           11
        //   422: lload_2        
        //   423: lload           4
        //   425: iload_1        
        //   426: aload           15
        //   428: invokevirtual   com/google/android/gms/internal/measurement/f2.d:()Lcom/google/android/gms/internal/measurement/g2;
        //   431: checkcast       Lcom/google/android/gms/internal/measurement/f1;
        //   434: invokespecial   K2/i.<init>:(JJZLcom/google/android/gms/internal/measurement/f1;)V
        //   437: aload           10
        //   439: astore          8
        //   441: aload           10
        //   443: astore          9
        //   445: aload           12
        //   447: aload           11
        //   449: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   452: pop            
        //   453: goto            486
        //   456: astore          11
        //   458: aload           10
        //   460: astore          8
        //   462: aload           10
        //   464: astore          9
        //   466: aload           14
        //   468: invokevirtual   C/u.j:()LK2/P;
        //   471: getfield        K2/P.H:LK2/S;
        //   474: aload           13
        //   476: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   479: aload           11
        //   481: ldc             "Data loss. Failed to merge raw event. appId"
        //   483: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   486: aload           10
        //   488: astore          8
        //   490: aload           10
        //   492: astore          9
        //   494: aload           10
        //   496: invokeinterface android/database/Cursor.moveToNext:()Z
        //   501: istore_1       
        //   502: iload_1        
        //   503: ifne            154
        //   506: aload           10
        //   508: invokeinterface android/database/Cursor.close:()V
        //   513: goto            552
        //   516: aload           9
        //   518: astore          8
        //   520: aload           14
        //   522: invokevirtual   C/u.j:()LK2/P;
        //   525: getfield        K2/P.H:LK2/S;
        //   528: aload           13
        //   530: invokestatic    K2/P.z:(Ljava/lang/String;)LK2/Q;
        //   533: aload           10
        //   535: ldc             "Data loss. Error querying raw events batch. appId"
        //   537: invokevirtual   K2/S.e:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
        //   540: aload           9
        //   542: ifnull          552
        //   545: aload           9
        //   547: invokeinterface android/database/Cursor.close:()V
        //   552: aload           12
        //   554: areturn        
        //   555: aload           8
        //   557: ifnull          567
        //   560: aload           8
        //   562: invokeinterface android/database/Cursor.close:()V
        //   567: aload           9
        //   569: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  32     103    149    552    Landroid/database/sqlite/SQLiteException;
        //  32     103    144    570    Any
        //  111    121    149    552    Landroid/database/sqlite/SQLiteException;
        //  111    121    144    570    Any
        //  129    134    149    552    Landroid/database/sqlite/SQLiteException;
        //  129    134    144    570    Any
        //  164    173    149    552    Landroid/database/sqlite/SQLiteException;
        //  164    173    144    570    Any
        //  181    191    149    552    Landroid/database/sqlite/SQLiteException;
        //  181    191    144    570    Any
        //  199    212    149    552    Landroid/database/sqlite/SQLiteException;
        //  199    212    144    570    Any
        //  222    232    149    552    Landroid/database/sqlite/SQLiteException;
        //  222    232    144    570    Any
        //  240    249    149    552    Landroid/database/sqlite/SQLiteException;
        //  240    249    144    570    Any
        //  257    262    149    552    Landroid/database/sqlite/SQLiteException;
        //  257    262    144    570    Any
        //  270    283    456    486    Ljava/io/IOException;
        //  270    283    149    552    Landroid/database/sqlite/SQLiteException;
        //  270    283    144    570    Any
        //  291    301    149    552    Landroid/database/sqlite/SQLiteException;
        //  291    301    144    570    Any
        //  321    326    149    552    Landroid/database/sqlite/SQLiteException;
        //  321    326    144    570    Any
        //  334    347    149    552    Landroid/database/sqlite/SQLiteException;
        //  334    347    144    570    Any
        //  355    365    149    552    Landroid/database/sqlite/SQLiteException;
        //  355    365    144    570    Any
        //  373    378    149    552    Landroid/database/sqlite/SQLiteException;
        //  373    378    144    570    Any
        //  386    399    149    552    Landroid/database/sqlite/SQLiteException;
        //  386    399    144    570    Any
        //  407    412    149    552    Landroid/database/sqlite/SQLiteException;
        //  407    412    144    570    Any
        //  420    437    149    552    Landroid/database/sqlite/SQLiteException;
        //  420    437    144    570    Any
        //  445    453    149    552    Landroid/database/sqlite/SQLiteException;
        //  445    453    144    570    Any
        //  466    486    149    552    Landroid/database/sqlite/SQLiteException;
        //  466    486    144    570    Any
        //  494    502    149    552    Landroid/database/sqlite/SQLiteException;
        //  494    502    144    570    Any
        //  520    540    144    570    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 273 out of bounds for length 273
        //     at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //     at java.util.Objects.checkIndex(Objects.java:385)
        //     at java.util.ArrayList.get(ArrayList.java:434)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at q5.g.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:714)
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
}

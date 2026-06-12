package z0;

import android.database.sqlite.SQLiteDatabase;
import f2.d;
import android.database.DatabaseErrorHandler;

public final class c implements DatabaseErrorHandler
{
    public final d a;
    public final b[] b;
    
    public c(final d a, final b[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onCorruption(final SQLiteDatabase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        z0/c.b:[Lz0/b;
        //     4: aload_1        
        //     5: invokestatic    z0/d.a:([Lz0/b;Landroid/database/sqlite/SQLiteDatabase;)Lz0/b;
        //     8: astore          5
        //    10: aload_0        
        //    11: getfield        z0/c.a:Lf2/d;
        //    14: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    17: pop            
        //    18: new             Ljava/lang/StringBuilder;
        //    21: dup            
        //    22: ldc             "Corruption reported by sqlite on database: "
        //    24: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    27: astore_1       
        //    28: aload_1        
        //    29: aload           5
        //    31: getfield        z0/b.D:Landroid/database/sqlite/SQLiteClosable;
        //    34: checkcast       Landroid/database/sqlite/SQLiteDatabase;
        //    37: invokevirtual   android/database/sqlite/SQLiteDatabase.getPath:()Ljava/lang/String;
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: pop            
        //    44: ldc             "SupportSQLite"
        //    46: aload_1        
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    53: pop            
        //    54: aload           5
        //    56: getfield        z0/b.D:Landroid/database/sqlite/SQLiteClosable;
        //    59: checkcast       Landroid/database/sqlite/SQLiteDatabase;
        //    62: astore          4
        //    64: aload           4
        //    66: invokevirtual   android/database/sqlite/SQLiteDatabase.isOpen:()Z
        //    69: ifne            83
        //    72: aload           4
        //    74: invokevirtual   android/database/sqlite/SQLiteDatabase.getPath:()Ljava/lang/String;
        //    77: invokestatic    f2/d.f:(Ljava/lang/String;)V
        //    80: goto            212
        //    83: aconst_null    
        //    84: astore_1       
        //    85: aconst_null    
        //    86: astore_2       
        //    87: aload           4
        //    89: invokevirtual   android/database/sqlite/SQLiteDatabase.getAttachedDbs:()Ljava/util/List;
        //    92: astore_3       
        //    93: aload_3        
        //    94: astore_1       
        //    95: goto            102
        //    98: astore_1       
        //    99: goto            112
        //   102: aload_1        
        //   103: astore_2       
        //   104: aload           5
        //   106: invokevirtual   z0/b.close:()V
        //   109: goto            163
        //   112: aload_2        
        //   113: ifnull          153
        //   116: aload_2        
        //   117: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   122: astore_2       
        //   123: aload_2        
        //   124: invokeinterface java/util/Iterator.hasNext:()Z
        //   129: ifeq            161
        //   132: aload_2        
        //   133: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   138: checkcast       Landroid/util/Pair;
        //   141: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   144: checkcast       Ljava/lang/String;
        //   147: invokestatic    f2/d.f:(Ljava/lang/String;)V
        //   150: goto            123
        //   153: aload           4
        //   155: invokevirtual   android/database/sqlite/SQLiteDatabase.getPath:()Ljava/lang/String;
        //   158: invokestatic    f2/d.f:(Ljava/lang/String;)V
        //   161: aload_1        
        //   162: athrow         
        //   163: aload_1        
        //   164: ifnull          204
        //   167: aload_1        
        //   168: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   173: astore_1       
        //   174: aload_1        
        //   175: invokeinterface java/util/Iterator.hasNext:()Z
        //   180: ifeq            212
        //   183: aload_1        
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: checkcast       Landroid/util/Pair;
        //   192: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   195: checkcast       Ljava/lang/String;
        //   198: invokestatic    f2/d.f:(Ljava/lang/String;)V
        //   201: goto            174
        //   204: aload           4
        //   206: invokevirtual   android/database/sqlite/SQLiteDatabase.getPath:()Ljava/lang/String;
        //   209: invokestatic    f2/d.f:(Ljava/lang/String;)V
        //   212: return         
        //   213: astore_2       
        //   214: goto            102
        //   217: astore_2       
        //   218: goto            163
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  87     93     213    217    Landroid/database/sqlite/SQLiteException;
        //  87     93     98     163    Any
        //  104    109    217    221    Ljava/io/IOException;
        //  104    109    98     163    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0112:
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

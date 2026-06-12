package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class j0
{
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //     5: astore_3       
        //     6: ldc             Landroid/graphics/drawable/Drawable;.class
        //     8: ldc             "getOpticalInsets"
        //    10: aconst_null    
        //    11: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    14: astore_1       
        //    15: aload_3        
        //    16: ldc             "left"
        //    18: invokevirtual   java/lang/Class.getField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    21: astore_2       
        //    22: aload_3        
        //    23: ldc             "top"
        //    25: invokevirtual   java/lang/Class.getField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    28: astore          4
        //    30: aload_3        
        //    31: ldc             "right"
        //    33: invokevirtual   java/lang/Class.getField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    36: astore          5
        //    38: aload_3        
        //    39: ldc             "bottom"
        //    41: invokevirtual   java/lang/Class.getField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    44: astore_3       
        //    45: iconst_1       
        //    46: istore_0       
        //    47: aload_1        
        //    48: astore          6
        //    50: aload           5
        //    52: astore_1       
        //    53: goto            138
        //    56: astore_3       
        //    57: aconst_null    
        //    58: astore          5
        //    60: aload_1        
        //    61: astore_3       
        //    62: aload           5
        //    64: astore_1       
        //    65: goto            127
        //    68: astore_3       
        //    69: aconst_null    
        //    70: astore          4
        //    72: aconst_null    
        //    73: astore          5
        //    75: aload_1        
        //    76: astore_3       
        //    77: aload           5
        //    79: astore_1       
        //    80: goto            127
        //    83: astore_3       
        //    84: goto            69
        //    87: astore_3       
        //    88: goto            69
        //    91: astore_2       
        //    92: aconst_null    
        //    93: astore_2       
        //    94: goto            69
        //    97: astore_2       
        //    98: aconst_null    
        //    99: astore_2       
        //   100: goto            69
        //   103: astore_2       
        //   104: aconst_null    
        //   105: astore_2       
        //   106: goto            69
        //   109: astore_1       
        //   110: aconst_null    
        //   111: astore_1       
        //   112: goto            92
        //   115: astore_1       
        //   116: aconst_null    
        //   117: astore_1       
        //   118: goto            98
        //   121: astore_1       
        //   122: aconst_null    
        //   123: astore_1       
        //   124: goto            104
        //   127: aconst_null    
        //   128: astore          5
        //   130: iconst_0       
        //   131: istore_0       
        //   132: aload_3        
        //   133: astore          6
        //   135: aload           5
        //   137: astore_3       
        //   138: iload_0        
        //   139: ifeq            171
        //   142: aload           6
        //   144: putstatic       o/j0.b:Ljava/lang/reflect/Method;
        //   147: aload_2        
        //   148: putstatic       o/j0.c:Ljava/lang/reflect/Field;
        //   151: aload           4
        //   153: putstatic       o/j0.d:Ljava/lang/reflect/Field;
        //   156: aload_1        
        //   157: putstatic       o/j0.e:Ljava/lang/reflect/Field;
        //   160: aload_3        
        //   161: putstatic       o/j0.f:Ljava/lang/reflect/Field;
        //   164: iconst_1       
        //   165: putstatic       o/j0.a:Z
        //   168: goto            195
        //   171: aconst_null    
        //   172: putstatic       o/j0.b:Ljava/lang/reflect/Method;
        //   175: aconst_null    
        //   176: putstatic       o/j0.c:Ljava/lang/reflect/Field;
        //   179: aconst_null    
        //   180: putstatic       o/j0.d:Ljava/lang/reflect/Field;
        //   183: aconst_null    
        //   184: putstatic       o/j0.e:Ljava/lang/reflect/Field;
        //   187: aconst_null    
        //   188: putstatic       o/j0.f:Ljava/lang/reflect/Field;
        //   191: iconst_0       
        //   192: putstatic       o/j0.a:Z
        //   195: return         
        //   196: astore_3       
        //   197: aload_1        
        //   198: astore_3       
        //   199: aload           5
        //   201: astore_1       
        //   202: goto            127
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      15     121    127    Ljava/lang/NoSuchMethodException;
        //  0      15     115    121    Ljava/lang/ClassNotFoundException;
        //  0      15     109    115    Ljava/lang/NoSuchFieldException;
        //  15     22     103    104    Ljava/lang/NoSuchMethodException;
        //  15     22     97     98     Ljava/lang/ClassNotFoundException;
        //  15     22     91     92     Ljava/lang/NoSuchFieldException;
        //  22     30     87     91     Ljava/lang/NoSuchMethodException;
        //  22     30     83     87     Ljava/lang/ClassNotFoundException;
        //  22     30     68     69     Ljava/lang/NoSuchFieldException;
        //  30     38     56     68     Ljava/lang/NoSuchMethodException;
        //  30     38     56     68     Ljava/lang/ClassNotFoundException;
        //  30     38     56     68     Ljava/lang/NoSuchFieldException;
        //  38     45     196    205    Ljava/lang/NoSuchMethodException;
        //  38     45     196    205    Ljava/lang/ClassNotFoundException;
        //  38     45     196    205    Ljava/lang/NoSuchFieldException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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

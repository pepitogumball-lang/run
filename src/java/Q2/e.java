package q2;

import java.lang.reflect.Method;

public abstract class e
{
    public static final Method a;
    public static final Method b;
    public static Boolean c;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: ldc             Landroid/os/WorkSource;.class
        //     6: ldc             "add"
        //     8: iconst_1       
        //     9: anewarray       Ljava/lang/Class;
        //    12: dup            
        //    13: iconst_0       
        //    14: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    17: aastore        
        //    18: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    21: astore_1       
        //    22: goto            28
        //    25: astore_1       
        //    26: aconst_null    
        //    27: astore_1       
        //    28: aload_1        
        //    29: putstatic       q2/e.a:Ljava/lang/reflect/Method;
        //    32: ldc             Landroid/os/WorkSource;.class
        //    34: ldc             "add"
        //    36: iconst_2       
        //    37: anewarray       Ljava/lang/Class;
        //    40: dup            
        //    41: iconst_0       
        //    42: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    45: aastore        
        //    46: dup            
        //    47: iconst_1       
        //    48: ldc             Ljava/lang/String;.class
        //    50: aastore        
        //    51: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    54: astore_1       
        //    55: goto            61
        //    58: astore_1       
        //    59: aconst_null    
        //    60: astore_1       
        //    61: aload_1        
        //    62: putstatic       q2/e.b:Ljava/lang/reflect/Method;
        //    65: ldc             Landroid/os/WorkSource;.class
        //    67: ldc             "size"
        //    69: aconst_null    
        //    70: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    73: pop            
        //    74: ldc             Landroid/os/WorkSource;.class
        //    76: ldc             "get"
        //    78: iconst_1       
        //    79: anewarray       Ljava/lang/Class;
        //    82: dup            
        //    83: iconst_0       
        //    84: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    87: aastore        
        //    88: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    91: pop            
        //    92: ldc             Landroid/os/WorkSource;.class
        //    94: ldc             "getName"
        //    96: iconst_1       
        //    97: anewarray       Ljava/lang/Class;
        //   100: dup            
        //   101: iconst_0       
        //   102: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   105: aastore        
        //   106: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   109: pop            
        //   110: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   113: bipush          28
        //   115: if_icmplt       123
        //   118: iconst_1       
        //   119: istore_0       
        //   120: goto            125
        //   123: iconst_0       
        //   124: istore_0       
        //   125: iload_0        
        //   126: ifeq            151
        //   129: ldc             Landroid/os/WorkSource;.class
        //   131: ldc             "createWorkChain"
        //   133: aconst_null    
        //   134: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   137: pop            
        //   138: goto            151
        //   141: astore_1       
        //   142: ldc             "WorkSourceUtil"
        //   144: ldc             "Missing WorkChain API createWorkChain"
        //   146: aload_1        
        //   147: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   150: pop            
        //   151: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   154: bipush          28
        //   156: if_icmplt       198
        //   159: ldc             "android.os.WorkSource$WorkChain"
        //   161: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   164: ldc             "addNode"
        //   166: iconst_2       
        //   167: anewarray       Ljava/lang/Class;
        //   170: dup            
        //   171: iconst_0       
        //   172: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   175: aastore        
        //   176: dup            
        //   177: iconst_1       
        //   178: ldc             Ljava/lang/String;.class
        //   180: aastore        
        //   181: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   184: pop            
        //   185: goto            198
        //   188: astore_1       
        //   189: ldc             "WorkSourceUtil"
        //   191: ldc             "Missing WorkChain class"
        //   193: aload_1        
        //   194: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   197: pop            
        //   198: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   201: bipush          28
        //   203: if_icmplt       218
        //   206: ldc             Landroid/os/WorkSource;.class
        //   208: ldc             "isEmpty"
        //   210: aconst_null    
        //   211: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   214: iconst_1       
        //   215: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   218: aconst_null    
        //   219: putstatic       q2/e.c:Ljava/lang/Boolean;
        //   222: return         
        //   223: astore_1       
        //   224: goto            74
        //   227: astore_1       
        //   228: goto            92
        //   231: astore_1       
        //   232: goto            110
        //   235: astore_1       
        //   236: goto            218
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      22     25     28     Ljava/lang/Exception;
        //  32     55     58     61     Ljava/lang/Exception;
        //  65     74     223    227    Ljava/lang/Exception;
        //  74     92     227    231    Ljava/lang/Exception;
        //  92     110    231    235    Ljava/lang/Exception;
        //  129    138    141    151    Ljava/lang/Exception;
        //  159    185    188    198    Ljava/lang/Exception;
        //  206    218    235    239    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 130 out of bounds for length 130
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
}

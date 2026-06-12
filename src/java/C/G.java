package C;

import android.os.Handler;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public abstract class g
{
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //     7: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    10: putstatic       C/g.g:Landroid/os/Handler;
        //    13: aconst_null    
        //    14: astore_2       
        //    15: ldc             "android.app.ActivityThread"
        //    17: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //    20: astore_1       
        //    21: goto            27
        //    24: astore_1       
        //    25: aconst_null    
        //    26: astore_1       
        //    27: aload_1        
        //    28: putstatic       C/g.a:Ljava/lang/Class;
        //    31: ldc             Landroid/app/Activity;.class
        //    33: ldc             "mMainThread"
        //    35: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    38: astore_1       
        //    39: aload_1        
        //    40: iconst_1       
        //    41: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    44: goto            50
        //    47: astore_1       
        //    48: aconst_null    
        //    49: astore_1       
        //    50: aload_1        
        //    51: putstatic       C/g.b:Ljava/lang/reflect/Field;
        //    54: ldc             Landroid/app/Activity;.class
        //    56: ldc             "mToken"
        //    58: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    61: astore_1       
        //    62: aload_1        
        //    63: iconst_1       
        //    64: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //    67: goto            73
        //    70: astore_1       
        //    71: aconst_null    
        //    72: astore_1       
        //    73: aload_1        
        //    74: putstatic       C/g.c:Ljava/lang/reflect/Field;
        //    77: getstatic       C/g.a:Ljava/lang/Class;
        //    80: astore_1       
        //    81: aload_1        
        //    82: ifnonnull       90
        //    85: aconst_null    
        //    86: astore_1       
        //    87: goto            122
        //    90: aload_1        
        //    91: ldc             "performStopActivity"
        //    93: iconst_3       
        //    94: anewarray       Ljava/lang/Class;
        //    97: dup            
        //    98: iconst_0       
        //    99: ldc             Landroid/os/IBinder;.class
        //   101: aastore        
        //   102: dup            
        //   103: iconst_1       
        //   104: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   107: aastore        
        //   108: dup            
        //   109: iconst_2       
        //   110: ldc             Ljava/lang/String;.class
        //   112: aastore        
        //   113: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   116: astore_1       
        //   117: aload_1        
        //   118: iconst_1       
        //   119: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   122: aload_1        
        //   123: putstatic       C/g.d:Ljava/lang/reflect/Method;
        //   126: getstatic       C/g.a:Ljava/lang/Class;
        //   129: astore_1       
        //   130: aload_1        
        //   131: ifnonnull       139
        //   134: aconst_null    
        //   135: astore_1       
        //   136: goto            166
        //   139: aload_1        
        //   140: ldc             "performStopActivity"
        //   142: iconst_2       
        //   143: anewarray       Ljava/lang/Class;
        //   146: dup            
        //   147: iconst_0       
        //   148: ldc             Landroid/os/IBinder;.class
        //   150: aastore        
        //   151: dup            
        //   152: iconst_1       
        //   153: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   156: aastore        
        //   157: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   160: astore_1       
        //   161: aload_1        
        //   162: iconst_1       
        //   163: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   166: aload_1        
        //   167: putstatic       C/g.e:Ljava/lang/reflect/Method;
        //   170: getstatic       C/g.a:Ljava/lang/Class;
        //   173: astore_3       
        //   174: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   177: istore_0       
        //   178: iload_0        
        //   179: bipush          26
        //   181: if_icmpeq       192
        //   184: aload_2        
        //   185: astore_1       
        //   186: iload_0        
        //   187: bipush          27
        //   189: if_icmpne       274
        //   192: aload_3        
        //   193: ifnonnull       201
        //   196: aload_2        
        //   197: astore_1       
        //   198: goto            274
        //   201: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   204: astore_1       
        //   205: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   208: astore          4
        //   210: aload_3        
        //   211: ldc             "requestRelaunchActivity"
        //   213: bipush          9
        //   215: anewarray       Ljava/lang/Class;
        //   218: dup            
        //   219: iconst_0       
        //   220: ldc             Landroid/os/IBinder;.class
        //   222: aastore        
        //   223: dup            
        //   224: iconst_1       
        //   225: ldc             Ljava/util/List;.class
        //   227: aastore        
        //   228: dup            
        //   229: iconst_2       
        //   230: ldc             Ljava/util/List;.class
        //   232: aastore        
        //   233: dup            
        //   234: iconst_3       
        //   235: aload_1        
        //   236: aastore        
        //   237: dup            
        //   238: iconst_4       
        //   239: aload           4
        //   241: aastore        
        //   242: dup            
        //   243: iconst_5       
        //   244: ldc             Landroid/content/res/Configuration;.class
        //   246: aastore        
        //   247: dup            
        //   248: bipush          6
        //   250: ldc             Landroid/content/res/Configuration;.class
        //   252: aastore        
        //   253: dup            
        //   254: bipush          7
        //   256: aload           4
        //   258: aastore        
        //   259: dup            
        //   260: bipush          8
        //   262: aload           4
        //   264: aastore        
        //   265: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   268: astore_1       
        //   269: aload_1        
        //   270: iconst_1       
        //   271: invokevirtual   java/lang/reflect/AccessibleObject.setAccessible:(Z)V
        //   274: aload_1        
        //   275: putstatic       C/g.f:Ljava/lang/reflect/Method;
        //   278: return         
        //   279: astore_1       
        //   280: goto            85
        //   283: astore_1       
        //   284: goto            134
        //   287: astore_1       
        //   288: aload_2        
        //   289: astore_1       
        //   290: goto            274
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  15     21     24     27     Any
        //  31     44     47     50     Any
        //  54     67     70     73     Any
        //  90     122    279    283    Any
        //  139    166    283    287    Any
        //  201    274    287    293    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 175 out of bounds for length 175
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

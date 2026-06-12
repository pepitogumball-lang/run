package r0;

import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.Context;
import c0.f;
import u.k;

public abstract class i
{
    public static final k a;
    public static final Object b;
    public static f c;
    
    static {
        a = (k)new Object();
        b = new Object();
        i.c = null;
    }
    
    public static long a(final Context context) {
        final PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build$VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
    
    public static f b() {
        i.a.k((Object)(i.c = new f(13)));
        return i.c;
    }
    
    public static void c(final Context p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifne            11
        //     4: getstatic       r0/i.c:Lc0/f;
        //     7: ifnull          11
        //    10: return         
        //    11: getstatic       r0/i.b:Ljava/lang/Object;
        //    14: astore          13
        //    16: aload           13
        //    18: dup            
        //    19: astore          16
        //    21: monitorenter   
        //    22: iload_1        
        //    23: ifne            40
        //    26: getstatic       r0/i.c:Lc0/f;
        //    29: ifnull          40
        //    32: aload           16
        //    34: monitorexit    
        //    35: return         
        //    36: astore_0       
        //    37: goto            415
        //    40: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    43: istore_2       
        //    44: iload_2        
        //    45: bipush          28
        //    47: if_icmplt       407
        //    50: iload_2        
        //    51: bipush          30
        //    53: if_icmpne       59
        //    56: goto            407
        //    59: new             Ljava/io/File;
        //    62: astore          15
        //    64: new             Ljava/io/File;
        //    67: astore          14
        //    69: aload           14
        //    71: ldc             "/data/misc/profiles/ref/"
        //    73: aload_0        
        //    74: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    77: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    80: aload           15
        //    82: aload           14
        //    84: ldc             "primary.prof"
        //    86: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    89: aload           15
        //    91: invokevirtual   java/io/File.length:()J
        //    94: lstore          7
        //    96: aload           15
        //    98: invokevirtual   java/io/File.exists:()Z
        //   101: istore          6
        //   103: iconst_0       
        //   104: istore_3       
        //   105: iload           6
        //   107: ifeq            122
        //   110: lload           7
        //   112: lconst_0       
        //   113: lcmp           
        //   114: ifle            122
        //   117: iconst_1       
        //   118: istore_2       
        //   119: goto            124
        //   122: iconst_0       
        //   123: istore_2       
        //   124: new             Ljava/io/File;
        //   127: astore          15
        //   129: new             Ljava/io/File;
        //   132: astore          14
        //   134: aload           14
        //   136: ldc             "/data/misc/profiles/cur/0/"
        //   138: aload_0        
        //   139: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   142: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   145: aload           15
        //   147: aload           14
        //   149: ldc             "primary.prof"
        //   151: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   154: aload           15
        //   156: invokevirtual   java/io/File.length:()J
        //   159: lstore          9
        //   161: aload           15
        //   163: invokevirtual   java/io/File.exists:()Z
        //   166: istore          6
        //   168: iload           6
        //   170: ifeq            186
        //   173: lload           9
        //   175: lconst_0       
        //   176: lcmp           
        //   177: ifle            186
        //   180: iconst_1       
        //   181: istore          4
        //   183: goto            189
        //   186: iconst_0       
        //   187: istore          4
        //   189: aload_0        
        //   190: invokestatic    r0/i.a:(Landroid/content/Context;)J
        //   193: lstore          11
        //   195: new             Ljava/io/File;
        //   198: astore          14
        //   200: aload           14
        //   202: aload_0        
        //   203: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //   206: ldc             "profileInstalled"
        //   208: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   211: aload           14
        //   213: invokevirtual   java/io/File.exists:()Z
        //   216: istore          6
        //   218: iload           6
        //   220: ifeq            241
        //   223: aload           14
        //   225: invokestatic    r0/h.a:(Ljava/io/File;)Lr0/h;
        //   228: astore_0       
        //   229: goto            243
        //   232: astore_0       
        //   233: invokestatic    r0/i.b:()Lc0/f;
        //   236: pop            
        //   237: aload           16
        //   239: monitorexit    
        //   240: return         
        //   241: aconst_null    
        //   242: astore_0       
        //   243: aload_0        
        //   244: ifnull          278
        //   247: aload_0        
        //   248: getfield        r0/h.c:J
        //   251: lload           11
        //   253: lcmp           
        //   254: ifne            278
        //   257: aload_0        
        //   258: getfield        r0/h.b:I
        //   261: istore          5
        //   263: iload           5
        //   265: iconst_2       
        //   266: if_icmpne       272
        //   269: goto            278
        //   272: iload           5
        //   274: istore_2       
        //   275: goto            296
        //   278: iload_2        
        //   279: ifeq            287
        //   282: iconst_1       
        //   283: istore_2       
        //   284: goto            296
        //   287: iload_3        
        //   288: istore_2       
        //   289: iload           4
        //   291: ifeq            296
        //   294: iconst_2       
        //   295: istore_2       
        //   296: iload_2        
        //   297: istore_3       
        //   298: iload_1        
        //   299: ifeq            318
        //   302: iload_2        
        //   303: istore_3       
        //   304: iload           4
        //   306: ifeq            318
        //   309: iload_2        
        //   310: istore_3       
        //   311: iload_2        
        //   312: iconst_1       
        //   313: if_icmpeq       318
        //   316: iconst_2       
        //   317: istore_3       
        //   318: aload_0        
        //   319: ifnull          350
        //   322: aload_0        
        //   323: getfield        r0/h.b:I
        //   326: iconst_2       
        //   327: if_icmpne       350
        //   330: iload_3        
        //   331: iconst_1       
        //   332: if_icmpne       350
        //   335: lload           7
        //   337: aload_0        
        //   338: getfield        r0/h.d:J
        //   341: lcmp           
        //   342: ifge            350
        //   345: iconst_3       
        //   346: istore_2       
        //   347: goto            352
        //   350: iload_3        
        //   351: istore_2       
        //   352: new             Lr0/h;
        //   355: astore          15
        //   357: aload           15
        //   359: iconst_1       
        //   360: iload_2        
        //   361: lload           11
        //   363: lload           9
        //   365: invokespecial   r0/h.<init>:(IIJJ)V
        //   368: aload_0        
        //   369: ifnull          383
        //   372: aload_0        
        //   373: aload           15
        //   375: invokevirtual   r0/h.equals:(Ljava/lang/Object;)Z
        //   378: istore_1       
        //   379: iload_1        
        //   380: ifne            390
        //   383: aload           15
        //   385: aload           14
        //   387: invokevirtual   r0/h.b:(Ljava/io/File;)V
        //   390: invokestatic    r0/i.b:()Lc0/f;
        //   393: pop            
        //   394: aload           16
        //   396: monitorexit    
        //   397: return         
        //   398: astore_0       
        //   399: invokestatic    r0/i.b:()Lc0/f;
        //   402: pop            
        //   403: aload           16
        //   405: monitorexit    
        //   406: return         
        //   407: invokestatic    r0/i.b:()Lc0/f;
        //   410: pop            
        //   411: aload           16
        //   413: monitorexit    
        //   414: return         
        //   415: aload           16
        //   417: monitorexit    
        //   418: aload_0        
        //   419: athrow         
        //   420: astore_0       
        //   421: goto            390
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  26     35     36     420    Any
        //  40     44     36     420    Any
        //  59     103    36     420    Any
        //  124    168    36     420    Any
        //  189    195    398    407    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  189    195    36     420    Any
        //  195    218    36     420    Any
        //  223    229    232    241    Ljava/io/IOException;
        //  223    229    36     420    Any
        //  233    240    36     420    Any
        //  247    263    36     420    Any
        //  322    330    36     420    Any
        //  335    345    36     420    Any
        //  352    368    36     420    Any
        //  372    379    36     420    Any
        //  383    390    420    424    Ljava/io/IOException;
        //  383    390    36     420    Any
        //  390    397    36     420    Any
        //  399    406    36     420    Any
        //  407    414    36     420    Any
        //  415    418    36     420    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0383:
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

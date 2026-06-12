package L0;

import m5.a;
import com.google.android.gms.internal.auth.h;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import b1.f;

public final class e
{
    public final ClassLoader a;
    public final f b;
    public final C2.f c;
    
    public e(final ClassLoader a, final f b) {
        this.a = a;
        this.b = b;
        this.c = new C2.f((Object)a, 12);
    }
    
    public final WindowLayoutComponent a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        L0/e.c:LC2/f;
        //     4: astore          4
        //     6: aload           4
        //     8: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    11: pop            
        //    12: iconst_0       
        //    13: istore_3       
        //    14: ldc             "loader.loadClass(WindowE\u2026XTENSIONS_PROVIDER_CLASS)"
        //    16: aload           4
        //    18: getfield        C2/f.D:Ljava/lang/Object;
        //    21: checkcast       Ljava/lang/ClassLoader;
        //    24: ldc             "androidx.window.extensions.WindowExtensionsProvider"
        //    26: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //    29: invokestatic    n5/h.d:(Ljava/lang/String;Ljava/lang/Object;)V
        //    32: iload_3        
        //    33: istore_2       
        //    34: ldc             "WindowExtensionsProvider#getWindowExtensions is not valid"
        //    36: new             LH0/a;
        //    39: dup            
        //    40: aload           4
        //    42: iconst_0       
        //    43: invokespecial   H0/a.<init>:(Ljava/lang/Object;I)V
        //    46: invokestatic    com/google/android/gms/internal/auth/h.B:(Ljava/lang/String;Lm5/a;)Z
        //    49: ifeq            185
        //    52: iload_3        
        //    53: istore_2       
        //    54: ldc             "WindowExtensions#getWindowLayoutComponent is not valid"
        //    56: new             LL0/d;
        //    59: dup            
        //    60: aload_0        
        //    61: iconst_3       
        //    62: invokespecial   L0/d.<init>:(LL0/e;I)V
        //    65: invokestatic    com/google/android/gms/internal/auth/h.B:(Ljava/lang/String;Lm5/a;)Z
        //    68: ifeq            185
        //    71: iload_3        
        //    72: istore_2       
        //    73: ldc             "FoldingFeature class is not valid"
        //    75: new             LL0/d;
        //    78: dup            
        //    79: aload_0        
        //    80: iconst_0       
        //    81: invokespecial   L0/d.<init>:(LL0/e;I)V
        //    84: invokestatic    com/google/android/gms/internal/auth/h.B:(Ljava/lang/String;Lm5/a;)Z
        //    87: ifeq            185
        //    90: invokestatic    I0/e.a:()I
        //    93: istore_1       
        //    94: iload_1        
        //    95: iconst_1       
        //    96: if_icmpne       107
        //    99: aload_0        
        //   100: invokevirtual   L0/e.b:()Z
        //   103: istore_2       
        //   104: goto            185
        //   107: iload_3        
        //   108: istore_2       
        //   109: iconst_2       
        //   110: iload_1        
        //   111: if_icmpgt       185
        //   114: iload_3        
        //   115: istore_2       
        //   116: iload_1        
        //   117: ldc             2147483647
        //   119: if_icmpgt       185
        //   122: iload_3        
        //   123: istore_2       
        //   124: aload_0        
        //   125: invokevirtual   L0/e.b:()Z
        //   128: ifeq            185
        //   131: new             Ljava/lang/StringBuilder;
        //   134: dup            
        //   135: ldc             "WindowLayoutComponent#addWindowLayoutInfoListener("
        //   137: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   140: astore          4
        //   142: aload           4
        //   144: ldc             Landroid/content/Context;.class
        //   146: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload           4
        //   155: ldc             ", androidx.window.extensions.core.util.function.Consumer) is not valid"
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: pop            
        //   161: iload_3        
        //   162: istore_2       
        //   163: aload           4
        //   165: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   168: new             LL0/d;
        //   171: dup            
        //   172: aload_0        
        //   173: iconst_2       
        //   174: invokespecial   L0/d.<init>:(LL0/e;I)V
        //   177: invokestatic    com/google/android/gms/internal/auth/h.B:(Ljava/lang/String;Lm5/a;)Z
        //   180: ifeq            185
        //   183: iconst_1       
        //   184: istore_2       
        //   185: aconst_null    
        //   186: astore          5
        //   188: aload           5
        //   190: astore          4
        //   192: iload_2        
        //   193: ifeq            206
        //   196: invokestatic    androidx/window/extensions/WindowExtensionsProvider.getWindowExtensions:()Landroidx/window/extensions/WindowExtensions;
        //   199: invokeinterface androidx/window/extensions/WindowExtensions.getWindowLayoutComponent:()Landroidx/window/extensions/layout/WindowLayoutComponent;
        //   204: astore          4
        //   206: aload           4
        //   208: areturn        
        //   209: astore          4
        //   211: iload_3        
        //   212: istore_2       
        //   213: goto            185
        //   216: astore          4
        //   218: aload           5
        //   220: astore          4
        //   222: goto            206
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  14     32     209    216    Ljava/lang/ClassNotFoundException;
        //  14     32     209    216    Ljava/lang/NoClassDefFoundError;
        //  196    206    216    225    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0206:
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
    
    public final boolean b() {
        final StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Activity.class.getName());
        sb.append(", java.util.function.Consumer) is not valid");
        return h.B(sb.toString(), (a)new d(this, 1));
    }
}

package H;

import java.io.File;
import n3.u0;
import android.content.res.Resources;
import G.f;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import com.google.android.gms.internal.auth.m;

public class g extends m
{
    public static Class f;
    public static Constructor g;
    public static Method h;
    public static Method i;
    public static boolean j;
    
    public static boolean G(final Object ex, final String s, final int n, final boolean b) {
        H();
        try {
            return (boolean)H.g.h.invoke((Object)ex, new Object[] { s, n, b });
        }
        catch (final InvocationTargetException ex) {}
        catch (final IllegalAccessException ex2) {}
        throw new RuntimeException((Throwable)ex);
    }
    
    public static void H() {
        if (H.g.j) {
            return;
        }
        H.g.j = true;
        Constructor g = null;
        Object forName = null;
        Method method = null;
        Object method2 = null;
        Label_0108: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                final Constructor constructor = ((Class)forName).getConstructor((Class[])null);
                method = ((Class)forName).getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class)forName, 1).getClass());
                g = constructor;
                break Label_0108;
            }
            catch (final NoSuchMethodException method2) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi21Impl", ((Throwable)method2).getClass().getName(), (Throwable)method2);
            method2 = null;
            forName = (method = null);
        }
        H.g.g = g;
        H.g.f = (Class)forName;
        H.g.h = method;
        H.g.i = (Method)method2;
    }
    
    public Typeface h(Context instance, f n, final Resources resources, int i) {
        H();
        try {
            final Object instance2 = H.g.g.newInstance((Object[])null);
            final G.g[] a = n.a;
            final int length = a.length;
            i = 0;
            while (i < length) {
                final G.g g = a[i];
                n = (f)u0.n((Context)instance);
                if (n == null) {
                    return null;
                }
                try {
                    if (!u0.h((File)n, resources, g.f)) {
                        return null;
                    }
                    if (!G(instance2, ((File)n).getPath(), g.b, g.c)) {
                        return null;
                    }
                    ((File)n).delete();
                    ++i;
                    continue;
                }
                catch (final RuntimeException instance) {
                    return null;
                }
                finally {
                    ((File)n).delete();
                }
                break;
            }
            H();
            try {
                instance = (RuntimeException)Array.newInstance(H.g.f, 1);
                Array.set((Object)instance, 0, instance2);
                instance = (RuntimeException)H.g.i.invoke((Object)null, new Object[] { instance });
                return (Typeface)instance;
            }
            catch (final InvocationTargetException instance) {}
            catch (final IllegalAccessException ex) {}
            throw new RuntimeException((Throwable)instance);
        }
        catch (final InvocationTargetException instance) {}
        catch (final InstantiationException instance) {}
        catch (final IllegalAccessException ex2) {}
        throw new RuntimeException((Throwable)instance);
    }
    
    public Typeface i(final Context p0, final L.g[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: iconst_1       
        //     3: if_icmpge       8
        //     6: aconst_null    
        //     7: areturn        
        //     8: aload_0        
        //     9: aload_2        
        //    10: iload_3        
        //    11: invokevirtual   com/google/android/gms/internal/auth/m.l:([LL/g;I)LL/g;
        //    14: astore_2       
        //    15: aload_1        
        //    16: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    19: astore          4
        //    21: aload           4
        //    23: aload_2        
        //    24: getfield        L/g.a:Landroid/net/Uri;
        //    27: ldc             "r"
        //    29: aconst_null    
        //    30: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    33: astore          4
        //    35: aload           4
        //    37: ifnonnull       52
        //    40: aload           4
        //    42: ifnull          50
        //    45: aload           4
        //    47: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    50: aconst_null    
        //    51: areturn        
        //    52: new             Ljava/lang/StringBuilder;
        //    55: astore_2       
        //    56: aload_2        
        //    57: ldc             "/proc/self/fd/"
        //    59: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    62: aload_2        
        //    63: aload           4
        //    65: invokevirtual   android/os/ParcelFileDescriptor.getFd:()I
        //    68: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    71: pop            
        //    72: aload_2        
        //    73: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    76: invokestatic    android/system/Os.readlink:(Ljava/lang/String;)Ljava/lang/String;
        //    79: astore          5
        //    81: aload           5
        //    83: invokestatic    android/system/Os.stat:(Ljava/lang/String;)Landroid/system/StructStat;
        //    86: getfield        android/system/StructStat.st_mode:I
        //    89: invokestatic    android/system/OsConstants.S_ISREG:(I)Z
        //    92: ifeq            108
        //    95: new             Ljava/io/File;
        //    98: astore_2       
        //    99: aload_2        
        //   100: aload           5
        //   102: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   105: goto            110
        //   108: aconst_null    
        //   109: astore_2       
        //   110: aload_2        
        //   111: ifnull          140
        //   114: aload_2        
        //   115: invokevirtual   java/io/File.canRead:()Z
        //   118: ifne            124
        //   121: goto            140
        //   124: aload_2        
        //   125: invokestatic    android/graphics/Typeface.createFromFile:(Ljava/io/File;)Landroid/graphics/Typeface;
        //   128: astore_1       
        //   129: aload           4
        //   131: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   134: aload_1        
        //   135: areturn        
        //   136: astore_1       
        //   137: goto            187
        //   140: new             Ljava/io/FileInputStream;
        //   143: astore_2       
        //   144: aload_2        
        //   145: aload           4
        //   147: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //   150: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   153: aload_0        
        //   154: aload_1        
        //   155: aload_2        
        //   156: invokevirtual   com/google/android/gms/internal/auth/m.j:(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
        //   159: astore_1       
        //   160: aload_2        
        //   161: invokevirtual   java/io/FileInputStream.close:()V
        //   164: aload           4
        //   166: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   169: aload_1        
        //   170: areturn        
        //   171: astore_1       
        //   172: aload_2        
        //   173: invokevirtual   java/io/FileInputStream.close:()V
        //   176: goto            185
        //   179: astore_2       
        //   180: aload_1        
        //   181: aload_2        
        //   182: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   185: aload_1        
        //   186: athrow         
        //   187: aload           4
        //   189: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   192: goto            201
        //   195: astore_2       
        //   196: aload_1        
        //   197: aload_2        
        //   198: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   201: aload_1        
        //   202: athrow         
        //   203: astore_1       
        //   204: aconst_null    
        //   205: areturn        
        //   206: astore_2       
        //   207: goto            108
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  21     35     203    206    Ljava/io/IOException;
        //  45     50     203    206    Ljava/io/IOException;
        //  52     105    206    210    Landroid/system/ErrnoException;
        //  52     105    136    203    Any
        //  114    121    136    203    Any
        //  124    129    136    203    Any
        //  129    134    203    206    Ljava/io/IOException;
        //  140    153    136    203    Any
        //  153    160    171    187    Any
        //  160    164    136    203    Any
        //  164    169    203    206    Ljava/io/IOException;
        //  172    176    179    185    Any
        //  180    185    136    203    Any
        //  185    187    136    203    Any
        //  187    192    195    201    Any
        //  196    201    203    206    Ljava/io/IOException;
        //  201    203    203    206    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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

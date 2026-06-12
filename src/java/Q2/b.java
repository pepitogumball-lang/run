package q2;

import java.util.Iterator;
import java.util.HashMap;
import android.app.AppOpsManager;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import e2.i;
import e2.j;
import android.os.Build$VERSION;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;
import android.util.Log;
import h2.A;
import android.content.Context;

public abstract class b
{
    public static final char[] a;
    public static final char[] b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;
    public static String i;
    public static int j;
    public static Boolean k;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        b = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    public static void a(final Context context, final Throwable t) {
        try {
            A.h((Object)context);
        }
        catch (final Exception ex) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", (Throwable)ex);
        }
    }
    
    public static String b(final byte[] array) {
        final int length = array.length;
        final char[] array2 = new char[length + length];
        int i = 0;
        int n = 0;
        while (i < array.length) {
            final byte b = array[i];
            final char[] b2 = q2.b.b;
            array2[n] = b2[(b & 0xFF) >>> 4];
            array2[n + 1] = b2[b & 0xF];
            n += 2;
            ++i;
        }
        return new String(array2);
    }
    
    public static String c(final byte[] array) {
        final int length = array.length;
        final StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; ++i) {
            final char[] a = q2.b.a;
            sb.append(a[(array[i] & 0xF0) >>> 4]);
            sb.append(a[array[i] & 0xF]);
        }
        return sb.toString();
    }
    
    public static void d(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static long e(final InputStream inputStream, final OutputStream outputStream, final boolean b) {
        final byte[] array = new byte[1024];
        long n = 0L;
        Label_0049: {
            try {
                while (true) {
                    final int read = inputStream.read(array, 0, 1024);
                    if (read == -1) {
                        break Label_0049;
                    }
                    n += read;
                    outputStream.write(array, 0, read);
                }
            }
            finally {
                if (b) {
                    d((Closeable)inputStream);
                    d((Closeable)outputStream);
                }
                Label_0061: {
                    return n;
                }
                iftrue(Label_0061:)(!b);
                d((Closeable)inputStream);
                d((Closeable)outputStream);
                return n;
            }
        }
    }
    
    public static String f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifnonnull       198
        //     6: getstatic       android/os/Build$VERSION.SDK_INT:I
        //     9: bipush          28
        //    11: if_icmplt       23
        //    14: invokestatic    O/n0.l:()Ljava/lang/String;
        //    17: putstatic       q2/b.i:Ljava/lang/String;
        //    20: goto            198
        //    23: getstatic       q2/b.j:I
        //    26: istore_1       
        //    27: iload_1        
        //    28: istore_0       
        //    29: iload_1        
        //    30: ifne            41
        //    33: invokestatic    android/os/Process.myPid:()I
        //    36: istore_0       
        //    37: iload_0        
        //    38: putstatic       q2/b.j:I
        //    41: aconst_null    
        //    42: astore          4
        //    44: aconst_null    
        //    45: astore_3       
        //    46: aconst_null    
        //    47: astore_2       
        //    48: iload_0        
        //    49: ifgt            57
        //    52: aload_3        
        //    53: astore_2       
        //    54: goto            194
        //    57: iload_0        
        //    58: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    61: invokevirtual   java/lang/String.length:()I
        //    64: istore_1       
        //    65: new             Ljava/lang/StringBuilder;
        //    68: astore_3       
        //    69: aload_3        
        //    70: iload_1        
        //    71: bipush          14
        //    73: iadd           
        //    74: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    77: aload_3        
        //    78: ldc             "/proc/"
        //    80: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    83: pop            
        //    84: aload_3        
        //    85: iload_0        
        //    86: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    89: pop            
        //    90: aload_3        
        //    91: ldc             "/cmdline"
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: pop            
        //    97: aload_3        
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: astore          6
        //   103: invokestatic    android/os/StrictMode.allowThreadDiskReads:()Landroid/os/StrictMode$ThreadPolicy;
        //   106: astore          5
        //   108: new             Ljava/io/BufferedReader;
        //   111: astore_3       
        //   112: new             Ljava/io/FileReader;
        //   115: astore          7
        //   117: aload           7
        //   119: aload           6
        //   121: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //   124: aload_3        
        //   125: aload           7
        //   127: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   130: aload           5
        //   132: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   135: aload_3        
        //   136: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   139: astore          4
        //   141: aload           4
        //   143: invokestatic    h2/A.h:(Ljava/lang/Object;)V
        //   146: aload           4
        //   148: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   151: astore          4
        //   153: aload           4
        //   155: astore_2       
        //   156: aload_3        
        //   157: invokestatic    q2/b.d:(Ljava/io/Closeable;)V
        //   160: goto            194
        //   163: astore_2       
        //   164: goto            182
        //   167: astore_2       
        //   168: aload           4
        //   170: astore_3       
        //   171: goto            182
        //   174: astore_3       
        //   175: aload           5
        //   177: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   180: aload_3        
        //   181: athrow         
        //   182: aload_3        
        //   183: invokestatic    q2/b.d:(Ljava/io/Closeable;)V
        //   186: aload_2        
        //   187: athrow         
        //   188: astore_3       
        //   189: aconst_null    
        //   190: astore_3       
        //   191: goto            156
        //   194: aload_2        
        //   195: putstatic       q2/b.i:Ljava/lang/String;
        //   198: getstatic       q2/b.i:Ljava/lang/String;
        //   201: areturn        
        //   202: astore          4
        //   204: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  57     108    188    194    Ljava/io/IOException;
        //  57     108    167    174    Any
        //  108    130    174    182    Any
        //  130    135    188    194    Ljava/io/IOException;
        //  130    135    167    174    Any
        //  135    153    202    207    Ljava/io/IOException;
        //  135    153    163    167    Any
        //  175    182    188    194    Ljava/io/IOException;
        //  175    182    167    174    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0156:
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
    
    public static byte[] g(final Context context, final String s) {
        final PackageInfo c = s2.b.a(context).c(64, s);
        final Signature[] signatures = c.signatures;
        Label_0074: {
            if (signatures == null || signatures.length != 1) {
                break Label_0074;
            }
            int n = 0;
        Label_0045_Outer:
            while (true) {
                Label_0051: {
                    if (n >= 2) {
                        break Label_0051;
                    }
                    while (true) {
                        try {
                            MessageDigest instance;
                            if ((instance = MessageDigest.getInstance("SHA1")) == null) {
                                ++n;
                                continue Label_0045_Outer;
                            }
                            while (true) {
                                if (instance == null) {
                                    return null;
                                }
                                return instance.digest(c.signatures[0].toByteArray());
                                instance = null;
                                continue;
                            }
                        }
                        catch (final NoSuchAlgorithmException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public static boolean h() {
        return Build$VERSION.SDK_INT >= 26;
    }
    
    public static boolean i() {
        return Build$VERSION.SDK_INT >= 30;
    }
    
    public static boolean j(final Context context, final int n) {
        final boolean n2 = n(n, context, "com.google.android.gms");
        final boolean b = false;
        if (n2) {
            final PackageManager packageManager = context.getPackageManager();
            try {
                final PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
                final j a = e2.j.a(context);
                a.getClass();
                boolean b2;
                if (packageInfo == null) {
                    b2 = b;
                }
                else {
                    if (!e2.j.c(packageInfo, false)) {
                        b2 = b;
                        if (!e2.j.c(packageInfo, true)) {
                            return b2;
                        }
                        if (!e2.i.b(a.C)) {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            b2 = b;
                            return b2;
                        }
                    }
                    b2 = true;
                }
                return b2;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }
    
    public static boolean k(final Context context) {
        if (q2.b.e == null) {
            final PackageManager packageManager = context.getPackageManager();
            final boolean hasSystemFeature = packageManager.hasSystemFeature("com.google.android.feature.services_updater");
            boolean b = false;
            if (hasSystemFeature) {
                b = b;
                if (packageManager.hasSystemFeature("cn.google.services")) {
                    b = true;
                }
            }
            q2.b.e = b;
        }
        return q2.b.e;
    }
    
    public static boolean l(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (q2.b.c == null) {
            q2.b.c = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        q2.b.c.booleanValue();
        return p(context) && (!h() || i());
    }
    
    public static byte[] m(final String s) {
        final int length = s.length();
        if (length % 2 == 0) {
            final byte[] array = new byte[length / 2];
            int n2;
            for (int i = 0; i < length; i = n2) {
                final int n = i / 2;
                n2 = i + 2;
                array[n] = (byte)Integer.parseInt(s.substring(i, n2), 16);
            }
            return array;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
    
    public static boolean n(final int n, final Context context, final String s) {
        final R4.b a = s2.b.a(context);
        a.getClass();
        boolean b;
        try {
            final AppOpsManager appOpsManager = (AppOpsManager)a.C.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(n, s);
            b = true;
        }
        catch (final SecurityException ex) {
            b = false;
        }
        return b;
    }
    
    public static void o(final StringBuilder sb, final HashMap hashMap) {
        sb.append("{");
        final Iterator iterator = hashMap.keySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (n == 0) {
                sb.append(",");
            }
            final String s2 = (String)hashMap.get((Object)s);
            sb.append("\"");
            sb.append(s);
            sb.append("\":");
            if (s2 == null) {
                sb.append("null");
            }
            else {
                sb.append("\"");
                sb.append(s2);
                sb.append("\"");
            }
            n = 0;
        }
        sb.append("}");
    }
    
    public static boolean p(final Context context) {
        if (q2.b.d == null) {
            q2.b.d = context.getPackageManager().hasSystemFeature("cn.google");
        }
        return q2.b.d;
    }
}

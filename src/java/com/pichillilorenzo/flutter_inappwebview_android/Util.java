package com.pichillilorenzo.flutter_inappwebview_android;

import java.security.PrivateKey;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.Objects;
import java.util.Iterator;
import javax.net.ssl.SSLHandshakeException;
import java.util.Map$Entry;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import android.util.Log;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import F4.o;
import android.os.Handler;
import android.os.Looper;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import java.security.cert.CertificateException;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import android.net.http.SslCertificate;
import java.io.IOException;
import android.graphics.Rect;
import android.graphics.Insets;
import android.view.WindowMetrics;
import android.util.DisplayMetrics;
import io.flutter.plugin.platform.p;
import com.google.android.gms.internal.ads.po;
import K2.G0;
import android.os.Build$VERSION;
import android.view.WindowManager;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import X.a;
import java.io.InputStream;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.content.Context;
import java.util.Collection;
import org.json.JSONArray;
import java.util.List;
import org.json.JSONObject;
import java.util.Map;

public class Util
{
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";
    
    private Util() {
    }
    
    public static String JSONStringify(final Object o) {
        if (o == null) {
            return "null";
        }
        if (o instanceof Map) {
            return new JSONObject((Map)o).toString();
        }
        if (o instanceof List) {
            return new JSONArray((Collection)o).toString();
        }
        if (o instanceof String) {
            return JSONObject.quote((String)o);
        }
        return JSONObject.wrap(o).toString();
    }
    
    public static Drawable drawableFromBytes(final Context context, final byte[] array) {
        return (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(array, 0, array.length));
    }
    
    public static InputStream getFileAsset(final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String u) {
        u = ((a)inAppWebViewFlutterPlugin.flutterAssets).u(u);
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(u);
    }
    
    public static Size2D getFullscreenSize(final Context context) {
        final Size2D size2D = new Size2D(-1.0, -1.0);
        final WindowManager windowManager = (WindowManager)context.getSystemService("window");
        if (windowManager != null) {
            if (Build$VERSION.SDK_INT >= 30) {
                final WindowMetrics r = G0.r(windowManager);
                final Insets g = po.g(G0.g(r), G0.q() | G0.B());
                final int m = p.m(g);
                final int a = p.a(g);
                final int k = p.k(g);
                final int o = p.o(g);
                final Rect e = G0.e(r);
                size2D.setWidth(e.width() - (a + m));
                size2D.setHeight(e.height() - (o + k));
            }
            else {
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth(displayMetrics.widthPixels);
                size2D.setHeight(displayMetrics.heightPixels);
            }
        }
        return size2D;
    }
    
    public static <T> T getOrDefault(final Map<String, Object> map, final String s, T value) {
        if (map.containsKey((Object)s)) {
            value = (T)map.get((Object)s);
        }
        return value;
    }
    
    public static float getPixelDensity(final Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
    
    public static String getUrlAsset(final InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, final String s) {
        final String u = ((a)inAppWebViewFlutterPlugin.flutterAssets).u(s);
        try {
            final InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, s);
            if (fileAsset != null) {
                fileAsset.close();
            }
        }
        catch (final IOException ex) {}
        final Throwable t;
        if (t == null) {
            return m0.a.f("file:///android_asset/", u);
        }
    }
    
    public static X509Certificate getX509CertFromSslCertHack(final SslCertificate sslCertificate) {
        final byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        Label_0045: {
            if (byteArray == null) {
                break Label_0045;
            }
            try {
                return (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate((InputStream)new ByteArrayInputStream(byteArray));
                x509Certificate = null;
                return x509Certificate;
            }
            catch (final CertificateException ex) {
                return null;
            }
        }
    }
    
    public static <T> T invokeMethodAndWaitResult(final F4.p p4, final String s, final Object o, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) {
        new Handler(Looper.getMainLooper()).post((Runnable)new Runnable(p4, s, o, syncBaseCallbackResultImpl) {
            final Object val$arguments;
            final SyncBaseCallbackResultImpl val$callback;
            final F4.p val$channel;
            final String val$method;
            
            public void run() {
                this.val$channel.a(this.val$method, this.val$arguments, (o)this.val$callback);
            }
        });
        syncBaseCallbackResultImpl.latch.await();
        return syncBaseCallbackResultImpl.result;
    }
    
    public static <O> Object invokeMethodIfExists(final O o, final String s, final Object... array) {
        for (final Method method : o.getClass().getMethods()) {
            if (method.getName().equals((Object)s)) {
                try {
                    return method.invoke((Object)o, array);
                }
                catch (final IllegalAccessException | InvocationTargetException ex) {
                    return null;
                }
            }
        }
        return null;
    }
    
    public static boolean isClass(final String className) {
        try {
            Class.forName(className);
            return true;
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean isIPv6(final String s) {
        try {
            InetAddress.getByName(s);
            return true;
        }
        catch (final UnknownHostException ex) {
            return false;
        }
    }
    
    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(final InAppWebViewFlutterPlugin p0, final String p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          9
        //     3: aconst_null    
        //     4: astore          8
        //     6: aload_0        
        //     7: aload_1        
        //     8: invokestatic    com/pichillilorenzo/flutter_inappwebview_android/Util.getFileAsset:(Lcom/pichillilorenzo/flutter_inappwebview_android/InAppWebViewFlutterPlugin;Ljava/lang/String;)Ljava/io/InputStream;
        //    11: astore_0       
        //    12: goto            18
        //    15: astore_0       
        //    16: aconst_null    
        //    17: astore_0       
        //    18: aload_0        
        //    19: astore          4
        //    21: aload_0        
        //    22: ifnonnull       67
        //    25: aload_0        
        //    26: astore          7
        //    28: aload           8
        //    30: astore          5
        //    32: aload_0        
        //    33: astore          6
        //    35: new             Ljava/io/FileInputStream;
        //    38: astore          4
        //    40: aload_0        
        //    41: astore          7
        //    43: aload           8
        //    45: astore          5
        //    47: aload_0        
        //    48: astore          6
        //    50: aload           4
        //    52: aload_1        
        //    53: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //    56: goto            67
        //    59: astore_0       
        //    60: goto            358
        //    63: astore_0       
        //    64: goto            308
        //    67: aload           4
        //    69: astore          7
        //    71: aload           8
        //    73: astore          5
        //    75: aload           4
        //    77: astore          6
        //    79: aload_3        
        //    80: invokestatic    java/security/KeyStore.getInstance:(Ljava/lang/String;)Ljava/security/KeyStore;
        //    83: astore_1       
        //    84: aload_2        
        //    85: ifnull          93
        //    88: aload_2        
        //    89: astore_0       
        //    90: goto            97
        //    93: ldc_w           ""
        //    96: astore_0       
        //    97: aload           4
        //    99: astore          7
        //   101: aload           8
        //   103: astore          5
        //   105: aload           4
        //   107: astore          6
        //   109: aload_1        
        //   110: aload           4
        //   112: aload_0        
        //   113: invokevirtual   java/lang/String.toCharArray:()[C
        //   116: invokevirtual   java/security/KeyStore.load:(Ljava/io/InputStream;[C)V
        //   119: aload           4
        //   121: astore          7
        //   123: aload           8
        //   125: astore          5
        //   127: aload           4
        //   129: astore          6
        //   131: aload_1        
        //   132: invokevirtual   java/security/KeyStore.aliases:()Ljava/util/Enumeration;
        //   135: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   140: checkcast       Ljava/lang/String;
        //   143: astore_3       
        //   144: aload_2        
        //   145: ifnull          151
        //   148: goto            155
        //   151: ldc_w           ""
        //   154: astore_2       
        //   155: aload           4
        //   157: astore          7
        //   159: aload           8
        //   161: astore          5
        //   163: aload           4
        //   165: astore          6
        //   167: aload_1        
        //   168: aload_3        
        //   169: aload_2        
        //   170: invokevirtual   java/lang/String.toCharArray:()[C
        //   173: invokevirtual   java/security/KeyStore.getKey:(Ljava/lang/String;[C)Ljava/security/Key;
        //   176: astore_2       
        //   177: aload           4
        //   179: astore          7
        //   181: aload           8
        //   183: astore          5
        //   185: aload           4
        //   187: astore          6
        //   189: aload           9
        //   191: astore_0       
        //   192: aload_2        
        //   193: instanceof      Ljava/security/PrivateKey;
        //   196: ifeq            278
        //   199: aload           4
        //   201: astore          7
        //   203: aload           8
        //   205: astore          5
        //   207: aload           4
        //   209: astore          6
        //   211: aload_2        
        //   212: checkcast       Ljava/security/PrivateKey;
        //   215: astore_2       
        //   216: aload           4
        //   218: astore          7
        //   220: aload           8
        //   222: astore          5
        //   224: aload           4
        //   226: astore          6
        //   228: aload_1        
        //   229: aload_3        
        //   230: invokevirtual   java/security/KeyStore.getCertificate:(Ljava/lang/String;)Ljava/security/cert/Certificate;
        //   233: checkcast       Ljava/security/cert/X509Certificate;
        //   236: astore_1       
        //   237: aload           4
        //   239: astore          7
        //   241: aload           8
        //   243: astore          5
        //   245: aload           4
        //   247: astore          6
        //   249: new             Lcom/pichillilorenzo/flutter_inappwebview_android/Util$PrivateKeyAndCertificates;
        //   252: astore_0       
        //   253: aload           4
        //   255: astore          7
        //   257: aload           8
        //   259: astore          5
        //   261: aload           4
        //   263: astore          6
        //   265: aload_0        
        //   266: aload_2        
        //   267: iconst_1       
        //   268: anewarray       Ljava/security/cert/X509Certificate;
        //   271: dup            
        //   272: iconst_0       
        //   273: aload_1        
        //   274: aastore        
        //   275: invokespecial   com/pichillilorenzo/flutter_inappwebview_android/Util$PrivateKeyAndCertificates.<init>:(Ljava/security/PrivateKey;[Ljava/security/cert/X509Certificate;)V
        //   278: aload           4
        //   280: astore          7
        //   282: aload_0        
        //   283: astore          5
        //   285: aload           4
        //   287: astore          6
        //   289: aload           4
        //   291: invokevirtual   java/io/InputStream.close:()V
        //   294: aload_0        
        //   295: astore_1       
        //   296: aload           4
        //   298: invokevirtual   java/io/InputStream.close:()V
        //   301: goto            356
        //   304: astore_0       
        //   305: goto            344
        //   308: aload           6
        //   310: astore          7
        //   312: ldc             "Util"
        //   314: ldc_w           ""
        //   317: aload_0        
        //   318: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   321: pop            
        //   322: aload           5
        //   324: astore_0       
        //   325: aload           6
        //   327: ifnull          356
        //   330: aload           5
        //   332: astore_1       
        //   333: aload           6
        //   335: invokevirtual   java/io/InputStream.close:()V
        //   338: aload           5
        //   340: astore_0       
        //   341: goto            356
        //   344: ldc             "Util"
        //   346: ldc_w           ""
        //   349: aload_0        
        //   350: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   353: pop            
        //   354: aload_1        
        //   355: astore_0       
        //   356: aload_0        
        //   357: areturn        
        //   358: aload           7
        //   360: ifnull          382
        //   363: aload           7
        //   365: invokevirtual   java/io/InputStream.close:()V
        //   368: goto            382
        //   371: astore_1       
        //   372: ldc             "Util"
        //   374: ldc_w           ""
        //   377: aload_1        
        //   378: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   381: pop            
        //   382: aload_0        
        //   383: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      12     15     18     Ljava/io/IOException;
        //  35     40     63     344    Ljava/lang/Exception;
        //  35     40     59     384    Any
        //  50     56     63     344    Ljava/lang/Exception;
        //  50     56     59     384    Any
        //  79     84     63     344    Ljava/lang/Exception;
        //  79     84     59     384    Any
        //  109    119    63     344    Ljava/lang/Exception;
        //  109    119    59     384    Any
        //  131    144    63     344    Ljava/lang/Exception;
        //  131    144    59     384    Any
        //  167    177    63     344    Ljava/lang/Exception;
        //  167    177    59     384    Any
        //  192    199    63     344    Ljava/lang/Exception;
        //  192    199    59     384    Any
        //  211    216    63     344    Ljava/lang/Exception;
        //  211    216    59     384    Any
        //  228    237    63     344    Ljava/lang/Exception;
        //  228    237    59     384    Any
        //  249    253    63     344    Ljava/lang/Exception;
        //  249    253    59     384    Any
        //  265    278    63     344    Ljava/lang/Exception;
        //  265    278    59     384    Any
        //  289    294    63     344    Ljava/lang/Exception;
        //  289    294    59     384    Any
        //  296    301    304    308    Ljava/io/IOException;
        //  312    322    59     384    Any
        //  333    338    304    308    Ljava/io/IOException;
        //  363    368    371    382    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 202 out of bounds for length 202
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
    
    public static void log(final String s, final String s2) {
        int min;
        for (int length = s2.length(), i = 0; i < length; i = min + 1) {
            int index = s2.indexOf(10, i);
            if (index == -1) {
                index = length;
            }
            while (true) {
                min = Math.min(index, i + 4000);
                Log.d(s, s2.substring(i, min));
                if (min >= index) {
                    break;
                }
                i = min;
            }
        }
    }
    
    public static HttpURLConnection makeHttpRequest(final String s, final String requestMethod, final Map<String, String> map) {
        HttpURLConnection httpURLConnection2 = null;
        Label_0142: {
            try {
                final HttpURLConnection httpURLConnection = (HttpURLConnection)FirebasePerfUrlConnection.instrument((Object)new URL(s).openConnection());
                try {
                    httpURLConnection.setRequestMethod(requestMethod);
                    if (map != null) {
                        for (final Map$Entry map$Entry : map.entrySet()) {
                            ((URLConnection)httpURLConnection).setRequestProperty((String)map$Entry.getKey(), (String)map$Entry.getValue());
                        }
                    }
                }
                catch (final Exception ex) {
                    httpURLConnection2 = httpURLConnection;
                    break Label_0142;
                }
                ((URLConnection)httpURLConnection).setConnectTimeout(15000);
                ((URLConnection)httpURLConnection).setReadTimeout(15000);
                ((URLConnection)httpURLConnection).setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(true);
                if ("GET".equalsIgnoreCase(requestMethod)) {
                    ((URLConnection)httpURLConnection).setDoOutput(false);
                }
                ((URLConnection)httpURLConnection).connect();
                return httpURLConnection;
            }
            catch (final Exception ex) {
                httpURLConnection2 = null;
            }
        }
        final Exception ex;
        if (!(ex instanceof SSLHandshakeException)) {
            Log.e("Util", "", (Throwable)ex);
        }
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
        }
        return null;
    }
    
    public static String normalizeIPv6(final String s) {
        if (isIPv6(s)) {
            return InetAddress.getByName(s).getCanonicalHostName();
        }
        throw new Exception(m0.a.f("Invalid address: ", s));
    }
    
    public static boolean objEquals(final Object o, final Object o2) {
        return Objects.equals(o, o2);
    }
    
    public static byte[] readAllBytes(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_0        
        //     3: ifnonnull       8
        //     6: aconst_null    
        //     7: areturn        
        //     8: sipush          4096
        //    11: newarray        B
        //    13: astore_3       
        //    14: new             Ljava/io/ByteArrayOutputStream;
        //    17: dup            
        //    18: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    21: astore          4
        //    23: aload_0        
        //    24: aload_3        
        //    25: iconst_0       
        //    26: sipush          4096
        //    29: invokevirtual   java/io/InputStream.read:([BII)I
        //    32: istore_1       
        //    33: iload_1        
        //    34: iconst_m1      
        //    35: if_icmpeq       57
        //    38: aload           4
        //    40: aload_3        
        //    41: iconst_0       
        //    42: iload_1        
        //    43: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //    46: goto            23
        //    49: astore_2       
        //    50: goto            77
        //    53: astore_3       
        //    54: goto            88
        //    57: aload           4
        //    59: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //    62: astore_3       
        //    63: aload_0        
        //    64: invokevirtual   java/io/InputStream.close:()V
        //    67: aload           4
        //    69: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    72: aload_3        
        //    73: astore_0       
        //    74: goto            119
        //    77: aload_0        
        //    78: invokevirtual   java/io/InputStream.close:()V
        //    81: aload           4
        //    83: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //    86: aload_2        
        //    87: athrow         
        //    88: aload_0        
        //    89: invokevirtual   java/io/InputStream.close:()V
        //    92: goto            101
        //    95: astore_0       
        //    96: aload_3        
        //    97: aload_0        
        //    98: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   101: aload           4
        //   103: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   106: aload_2        
        //   107: astore_0       
        //   108: goto            119
        //   111: astore_0       
        //   112: aload_3        
        //   113: aload_0        
        //   114: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   117: aload_2        
        //   118: astore_0       
        //   119: aload_0        
        //   120: areturn        
        //   121: astore_0       
        //   122: goto            67
        //   125: astore_0       
        //   126: aload_3        
        //   127: astore_0       
        //   128: goto            119
        //   131: astore_0       
        //   132: goto            81
        //   135: astore_0       
        //   136: goto            86
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     33     53     119    Ljava/io/IOException;
        //  23     33     49     139    Any
        //  38     46     53     119    Ljava/io/IOException;
        //  38     46     49     139    Any
        //  57     63     53     119    Ljava/io/IOException;
        //  57     63     49     139    Any
        //  63     67     121    125    Ljava/io/IOException;
        //  67     72     125    131    Ljava/io/IOException;
        //  77     81     131    135    Ljava/io/IOException;
        //  81     86     135    139    Ljava/io/IOException;
        //  88     92     95     101    Ljava/io/IOException;
        //  101    106    111    119    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 78 out of bounds for length 78
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
    
    public static String replaceAll(final String s, final String s2, final String s3) {
        return TextUtils.join((CharSequence)s3, (Object[])s.split(Pattern.quote(s2)));
    }
    
    public static class PrivateKeyAndCertificates
    {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;
        
        public PrivateKeyAndCertificates(final PrivateKey privateKey, final X509Certificate[] certificates) {
            this.privateKey = privateKey;
            this.certificates = certificates;
        }
    }
}

package z4;

import android.os.BaseBundle;
import java.util.concurrent.Callable;
import w4.j;
import K2.U;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.os.Bundle;
import android.os.Trace;
import android.os.Build$VERSION;
import android.os.SystemClock;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import java.util.ArrayList;
import a5.a;
import android.os.Looper;
import java.io.IOException;
import android.util.Log;
import v.e;
import java.io.File;
import android.content.Context;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import io.flutter.embedding.engine.FlutterJNI;
import L3.t;
import c0.f;

public final class d
{
    public boolean a;
    public f b;
    public long c;
    public t d;
    public FlutterJNI e;
    public ExecutorService f;
    public Future g;
    
    public static String b(final Context context, String s) {
        if (s.startsWith("--aot-shared-library-name=")) {
            s = (String)new File(s.substring(26));
            try {
                final String canonicalPath = ((File)s).getCanonicalPath();
                final StringBuilder b = e.b(context.getApplicationContext().getFilesDir().getCanonicalPath());
                b.append(File.separator);
                final boolean startsWith = canonicalPath.startsWith(b.toString());
                final boolean endsWith = canonicalPath.endsWith(".so");
                if (startsWith && endsWith) {
                    return "--aot-shared-library-name=".concat(canonicalPath);
                }
                final StringBuilder sb = new StringBuilder("External path ");
                sb.append(canonicalPath);
                sb.append(" rejected; not overriding aot-shared-library-name.");
                Log.e("FlutterLoader", sb.toString());
                return null;
            }
            catch (final IOException ex) {
                final StringBuilder sb2 = new StringBuilder("External path ");
                sb2.append(((File)s).getPath());
                sb2.append(" is not a valid path. Please ensure this shared AOT library exists.");
                Log.e("FlutterLoader", sb2.toString());
                return null;
            }
        }
        throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
    }
    
    public final void a(final Context context, final String[] array) {
        if (this.a) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.b != null) {
                try {
                    a5.a.b("FlutterLoader#ensureInitializationComplete");
                Label_0231_Outer:
                    while (true) {
                        c c;
                        ArrayList list;
                        StringBuilder sb;
                        int length;
                        int n;
                        String b;
                        String s;
                        StringBuilder sb2;
                        String s2;
                        Bundle metaData;
                        ActivityManager activityManager;
                        ActivityManager$MemoryInfo activityManager$MemoryInfo;
                        int n2;
                        StringBuilder sb3;
                        StringBuilder sb4;
                        StringBuilder sb5;
                        Object d;
                        StringBuilder sb6;
                        StringBuilder sb7;
                        String string;
                        int int1;
                        StringBuilder sb8;
                        DisplayMetrics displayMetrics;
                        int widthPixels;
                        int heightPixels;
                        StringBuilder sb9;
                        StringBuilder sb10;
                        final Throwable t;
                        Block_27_Outer:Label_0763_Outer:Label_1033_Outer:
                        while (true) {
                            try {
                                c = (c)this.g.get();
                                list = new ArrayList();
                                list.add((Object)"--icu-symbol-prefix=_binary_icudtl_dat");
                                sb = new StringBuilder("--icu-native-lib-path=");
                                sb.append((String)this.d.e);
                                sb.append(File.separator);
                                sb.append("libflutter.so");
                                list.add((Object)sb.toString());
                                if (array == null) {
                                    break Label_0231_Outer;
                                }
                                length = array.length;
                                n = 0;
                                if (n >= length) {
                                    break Label_0231_Outer;
                                }
                                s = (b = array[n]);
                                if (!s.startsWith("--aot-shared-library-name=")) {
                                    break Block_27_Outer;
                                }
                                b = b(context, s);
                                if (b != null) {
                                    break Block_27_Outer;
                                }
                                sb2 = new StringBuilder();
                                sb2.append("Skipping unsafe AOT shared library name flag: ");
                                sb2.append(s);
                                sb2.append(". Please ensure that the library is vetted and placed in your application's internal storage.");
                                Log.w("FlutterLoader", sb2.toString());
                                break Label_0231;
                            }
                            finally {
                                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
                                Block_20: {
                                    Block_24_Outer:Label_0672_Outer:Label_0692_Outer:
                                    while (true) {
                                        while (true) {
                                            Block_17: {
                                                while (true) {
                                                Label_0672:
                                                    while (true) {
                                                    Label_0465:
                                                        while (true) {
                                                            Block_12: {
                                                            Label_0889_Outer:
                                                                while (true) {
                                                                    Label_0835: {
                                                                        while (true) {
                                                                            Block_19_Outer:Label_0783_Outer:
                                                                            while (true) {
                                                                                while (true) {
                                                                                    Block_22: {
                                                                                        while (true) {
                                                                                            Label_0712: {
                                                                                                while (true) {
                                                                                                    s2 = "true";
                                                                                                    break Label_0889_Outer;
                                                                                                    iftrue(Label_0783:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false));
                                                                                                    break Block_22;
                                                                                                Block_16:
                                                                                                    while (true) {
                                                                                                        activityManager = (ActivityManager)context.getSystemService("activity");
                                                                                                        activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
                                                                                                        activityManager.getMemoryInfo(activityManager$MemoryInfo);
                                                                                                        n2 = (int)(activityManager$MemoryInfo.totalMem / 1000000.0 / 2.0);
                                                                                                        while (true) {
                                                                                                            Label_0854: {
                                                                                                                while (true) {
                                                                                                                    Label_0517: {
                                                                                                                        break Label_0517;
                                                                                                                        while (true) {
                                                                                                                            list.add((Object)"--enable-opengl-gpu-tracing");
                                                                                                                            break Label_0712;
                                                                                                                            s2 = "false";
                                                                                                                            break Label_0889_Outer;
                                                                                                                            sb3 = new StringBuilder();
                                                                                                                            sb3.append("--aot-shared-library-name=");
                                                                                                                            sb3.append((String)this.d.b);
                                                                                                                            list.add((Object)sb3.toString());
                                                                                                                            sb4 = new StringBuilder();
                                                                                                                            sb4.append("--aot-shared-library-name=");
                                                                                                                            sb4.append((String)this.d.e);
                                                                                                                            sb4.append(File.separator);
                                                                                                                            sb4.append((String)this.d.b);
                                                                                                                            list.add((Object)sb4.toString());
                                                                                                                            sb5 = new StringBuilder();
                                                                                                                            sb5.append("--cache-dir-path=");
                                                                                                                            sb5.append(c.b);
                                                                                                                            list.add((Object)sb5.toString());
                                                                                                                            d = this.d.d;
                                                                                                                            sb6 = new StringBuilder();
                                                                                                                            sb6.append("--domain-network-policy=");
                                                                                                                            sb6.append((String)this.d.d);
                                                                                                                            list.add((Object)sb6.toString());
                                                                                                                            this.b.getClass();
                                                                                                                            metaData = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                                                                                                                            iftrue(Label_0463:)(metaData == null);
                                                                                                                            break Block_12;
                                                                                                                            sb7 = new StringBuilder();
                                                                                                                            sb7.append("--impeller-backend=");
                                                                                                                            sb7.append(string);
                                                                                                                            list.add((Object)sb7.toString());
                                                                                                                            break Label_0835;
                                                                                                                            list.add((Object)"--impeller-lazy-shader-mode");
                                                                                                                            break Label_0854;
                                                                                                                            iftrue(Label_0692:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false));
                                                                                                                            break Block_17;
                                                                                                                            Label_0463: {
                                                                                                                                int1 = 0;
                                                                                                                            }
                                                                                                                            break Label_0465;
                                                                                                                            iftrue(Label_0663:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.EnableImpeller"));
                                                                                                                            break Block_16;
                                                                                                                            iftrue(Label_0712:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false));
                                                                                                                            continue Label_1033_Outer;
                                                                                                                        }
                                                                                                                        iftrue(Label_0876:)(((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false));
                                                                                                                        break Block_20;
                                                                                                                    }
                                                                                                                    sb8 = new StringBuilder();
                                                                                                                    sb8.append("--old-gen-heap-size=");
                                                                                                                    sb8.append(n2);
                                                                                                                    list.add((Object)sb8.toString());
                                                                                                                    displayMetrics = context.getResources().getDisplayMetrics();
                                                                                                                    widthPixels = displayMetrics.widthPixels;
                                                                                                                    heightPixels = displayMetrics.heightPixels;
                                                                                                                    sb9 = new StringBuilder();
                                                                                                                    sb9.append("--resource-cache-max-bytes-threshold=");
                                                                                                                    sb9.append(widthPixels * heightPixels * 48);
                                                                                                                    list.add((Object)sb9.toString());
                                                                                                                    list.add((Object)"--prefetched-default-font-manager");
                                                                                                                    iftrue(Label_0889:)(metaData == null);
                                                                                                                    break Label_0672;
                                                                                                                    list.add((Object)"--enable-vulkan-gpu-tracing");
                                                                                                                    continue Block_19_Outer;
                                                                                                                }
                                                                                                            }
                                                                                                            iftrue(Label_0889:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines"));
                                                                                                            break Block_19_Outer;
                                                                                                            string = ((BaseBundle)metaData).getString("io.flutter.embedding.android.ImpellerBackend");
                                                                                                            iftrue(Label_0835:)(string == null);
                                                                                                            continue Block_24_Outer;
                                                                                                        }
                                                                                                        n2 = int1;
                                                                                                        iftrue(Label_0517:)(int1 != 0);
                                                                                                        continue Label_1033_Outer;
                                                                                                    }
                                                                                                    list.add((Object)"--enable-impeller=true");
                                                                                                    continue Label_0672;
                                                                                                    iftrue(Label_1033:)(metaData != null && !((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.LeakVM", true));
                                                                                                    continue Label_0763_Outer;
                                                                                                }
                                                                                                Label_0876: {
                                                                                                    throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                                                                                                }
                                                                                            }
                                                                                            iftrue(Label_0732:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false));
                                                                                            continue Label_0783_Outer;
                                                                                        }
                                                                                    }
                                                                                    list.add((Object)"--enable-surface-control");
                                                                                    continue Label_0889_Outer;
                                                                                }
                                                                                list.add((Object)"--enable-flutter-gpu");
                                                                                continue Label_1033_Outer;
                                                                            }
                                                                            list.add((Object)"--impeller-antialias-lines");
                                                                            continue;
                                                                        }
                                                                    }
                                                                    iftrue(Label_0854:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization"));
                                                                    continue Label_0672_Outer;
                                                                }
                                                                sb10 = new StringBuilder();
                                                                sb10.append("--leak-vm=");
                                                                sb10.append(s2);
                                                                list.add((Object)sb10.toString());
                                                                this.e.init(context, (String[])list.toArray((Object[])new String[0]), (String)null, c.a, c.b, SystemClock.uptimeMillis() - this.c, Build$VERSION.SDK_INT);
                                                                this.a = true;
                                                                Trace.endSection();
                                                                return;
                                                                ++n;
                                                                continue Label_0231_Outer;
                                                            }
                                                            int1 = ((BaseBundle)metaData).getInt("io.flutter.embedding.android.OldGenHeapSize");
                                                            continue Label_0465;
                                                        }
                                                        Label_0663: {
                                                            list.add((Object)"--enable-impeller=false");
                                                        }
                                                        continue Label_0672;
                                                    }
                                                    iftrue(Label_0672:)(!((BaseBundle)metaData).containsKey("io.flutter.embedding.android.EnableImpeller"));
                                                    continue Label_0692_Outer;
                                                }
                                            }
                                            list.add((Object)"--enable-vulkan-validation");
                                            continue;
                                        }
                                        try {
                                            Trace.endSection();
                                        }
                                        finally {
                                            ((Throwable)(Object)array).addSuppressed(t);
                                        }
                                        continue Label_0672_Outer;
                                    }
                                    list.add((Object)b);
                                    continue Block_27_Outer;
                                }
                                iftrue(Label_0763:)(!((BaseBundle)metaData).getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false));
                            }
                            break;
                        }
                        break;
                    }
                }
                catch (final Exception ex) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", (Throwable)ex);
                    throw new RuntimeException((Throwable)ex);
                }
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }
    
    public final void c(Context applicationContext) {
        final f b = new f(25);
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        a5.a.b("FlutterLoader#startInitialization");
        try {
            applicationContext = ((Context)applicationContext).getApplicationContext();
            this.b = b;
            this.c = SystemClock.uptimeMillis();
            this.d = z4.a.a((Context)applicationContext);
            final U a = U.a((DisplayManager)((Context)applicationContext).getSystemService("display"), this.e);
            ((FlutterJNI)a.c).setAsyncWaitForVsyncDelegate((j)a.e);
            this.g = this.f.submit((Callable)new E1.f((Object)this, 10, applicationContext));
            Trace.endSection();
            return;
        }
        finally {
            try {
                Trace.endSection();
            }
            finally {
                final Throwable t;
                ((Throwable)applicationContext).addSuppressed(t);
            }
        }
        throw new IllegalStateException("startInitialization must be called on the main thread");
    }
}

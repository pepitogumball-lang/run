package c0;

import com.google.android.gms.internal.play_billing.S0;
import android.os.Bundle;
import java.util.Iterator;
import L3.g;
import java.util.ArrayList;
import java.util.List;
import com.google.firebase.components.ComponentRegistrar;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import com.google.android.gms.internal.ads.n1;
import org.json.JSONObject;
import android.util.Log;
import java.io.Serializable;
import com.google.android.gms.internal.play_billing.m2;
import n.l;
import android.content.pm.ApplicationInfo;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.File;
import f2.d;
import Y0.h;
import android.content.Context;
import java.io.IOException;
import java.io.Closeable;
import c2.k;
import t.j;
import r0.b;
import n.x;
import m3.c;
import i3.a;
import h2.m;
import k1.e;

public final class f implements e, m, a, k0.a, c, x, b, p1.b, s3.b, t3.a, u2.c, w1.a
{
    public static f D;
    public final int C;
    
    public f() {
        this.C = 18;
        new j();
        new t.e();
    }
    
    public f(final k k) {
        this.C = 16;
    }
    
    public static void n(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static d o(final Context context, final String[] array, final String s, final h h) {
        final String[] s2 = s(context);
        final int length = s2.length;
        int n = 0;
        ZipFile d = null;
        ZipEntry entry = null;
    Label_0234_Outer:
        while (true) {
            final ZipFile zipFile = null;
            Label_0240: {
                if (n >= length) {
                    break Label_0240;
                }
                final String s3 = s2[n];
                int n2 = 0;
                while (true) {
                    d = zipFile;
                    if (n2 < 5) {
                        try {
                            d = new ZipFile(new File(s3), 1);
                        }
                        catch (final IOException ex) {
                            ++n2;
                            continue Label_0234_Outer;
                        }
                        break;
                    }
                    break;
                }
                while (true) {
                    if (d == null) {
                        break Label_0234;
                    }
                    for (int i = 0; i < 5; ++i) {
                        for (final String s4 : array) {
                            final StringBuilder sb = new StringBuilder("lib");
                            final char separatorChar = File.separatorChar;
                            sb.append(separatorChar);
                            sb.append(s4);
                            sb.append(separatorChar);
                            sb.append(s);
                            final String string = sb.toString();
                            h.p("Looking for %s in APK %s...", string, s3);
                            entry = d.getEntry(string);
                            if (entry != null) {
                                break Label_0234_Outer;
                            }
                        }
                    }
                    try {
                        d.close();
                        ++n;
                        continue Label_0234_Outer;
                        return null;
                    }
                    catch (final IOException ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
        final d d2 = new d(4);
        d2.D = d;
        d2.E = entry;
        return d2;
    }
    
    public static String[] p(final Context p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "lib"
        //     6: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //     9: astore          5
        //    11: getstatic       java/io/File.separatorChar:C
        //    14: istore_2       
        //    15: aload           5
        //    17: iload_2        
        //    18: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    21: pop            
        //    22: aload           5
        //    24: ldc             "([^\\"
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: pop            
        //    30: aload           5
        //    32: iload_2        
        //    33: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    36: pop            
        //    37: aload           5
        //    39: ldc             "]*)"
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: pop            
        //    45: aload           5
        //    47: iload_2        
        //    48: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: aload           5
        //    54: aload_1        
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: pop            
        //    59: aload           5
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //    67: astore          5
        //    69: new             Ljava/util/HashSet;
        //    72: dup            
        //    73: invokespecial   java/util/HashSet.<init>:()V
        //    76: astore_1       
        //    77: aload_0        
        //    78: invokestatic    c0/f.s:(Landroid/content/Context;)[Ljava/lang/String;
        //    81: astore_0       
        //    82: aload_0        
        //    83: arraylength    
        //    84: istore          4
        //    86: iconst_0       
        //    87: istore_3       
        //    88: iload_3        
        //    89: iload           4
        //    91: if_icmpge       189
        //    94: aload_0        
        //    95: iload_3        
        //    96: aaload         
        //    97: astore          8
        //    99: new             Ljava/util/zip/ZipFile;
        //   102: astore          7
        //   104: new             Ljava/io/File;
        //   107: astore          6
        //   109: aload           6
        //   111: aload           8
        //   113: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   116: aload           7
        //   118: aload           6
        //   120: iconst_1       
        //   121: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;I)V
        //   124: aload           7
        //   126: invokevirtual   java/util/zip/ZipFile.entries:()Ljava/util/Enumeration;
        //   129: astore          7
        //   131: aload           7
        //   133: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //   138: ifeq            183
        //   141: aload           5
        //   143: aload           7
        //   145: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //   150: checkcast       Ljava/util/zip/ZipEntry;
        //   153: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   156: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   159: astore          6
        //   161: aload           6
        //   163: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   166: ifeq            131
        //   169: aload_1        
        //   170: aload           6
        //   172: iconst_1       
        //   173: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   176: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   179: pop            
        //   180: goto            131
        //   183: iinc            3, 1
        //   186: goto            88
        //   189: aload_1        
        //   190: aload_1        
        //   191: invokevirtual   java/util/HashSet.size:()I
        //   194: anewarray       Ljava/lang/String;
        //   197: invokevirtual   java/util/HashSet.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   200: checkcast       [Ljava/lang/String;
        //   203: areturn        
        //   204: astore          6
        //   206: goto            183
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  99     124    204    209    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'g5.m0 g5.d2.L()' on a null object reference
        //     at e5.d0.e(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:26)
        //     at e5.c0.s(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:1643)
        //     at q5.g.o(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2651)
        //     at q5.g.b(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:2099)
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
    
    public static String[] s(final Context context) {
        final ApplicationInfo applicationInfo = context.getApplicationInfo();
        final String[] splitSourceDirs = applicationInfo.splitSourceDirs;
        if (splitSourceDirs != null && splitSourceDirs.length != 0) {
            final String[] array = new String[splitSourceDirs.length + 1];
            array[0] = applicationInfo.sourceDir;
            System.arraycopy((Object)splitSourceDirs, 0, (Object)array, 1, splitSourceDirs.length);
            return array;
        }
        return new String[] { applicationInfo.sourceDir };
    }
    
    public void a(final l l, final boolean b) {
    }
    
    public Object apply(final Object o) {
        return ((S0)o).b();
    }
    
    public void b() {
    }
    
    public void c(final int n, final Serializable s) {
        String s2 = null;
        switch (n) {
            default: {
                s2 = "";
                break;
            }
            case 11: {
                s2 = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            }
            case 10: {
                s2 = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            }
            case 8: {
                s2 = "RESULT_PARSE_EXCEPTION";
                break;
            }
            case 7: {
                s2 = "RESULT_IO_EXCEPTION";
                break;
            }
            case 6: {
                s2 = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            }
            case 5: {
                s2 = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            }
            case 4: {
                s2 = "RESULT_NOT_WRITABLE";
                break;
            }
            case 3: {
                s2 = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            }
            case 2: {
                s2 = "RESULT_ALREADY_INSTALLED";
                break;
            }
            case 1: {
                s2 = "RESULT_INSTALL_SUCCESS";
                break;
            }
        }
        if (n != 6 && n != 7 && n != 8) {
            Log.d("ProfileInstaller", s2);
        }
        else {
            Log.e("ProfileInstaller", s2, (Throwable)s);
        }
    }
    
    public String d() {
        return null;
    }
    
    public void e(final String s, final long n) {
    }
    
    public s3.a g(final f f, final JSONObject jsonObject) {
        jsonObject.optInt("settings_version", 0);
        final int optInt = jsonObject.optInt("cache_duration", 3600);
        final double optDouble = jsonObject.optDouble("on_demand_upload_rate_per_minute", 10.0);
        final double optDouble2 = jsonObject.optDouble("on_demand_backoff_base", 1.2);
        final int optInt2 = jsonObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        R0.m m;
        if (jsonObject.has("session")) {
            m = new R0.m(jsonObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 10);
        }
        else {
            m = new R0.m(new JSONObject().optInt("max_custom_exception_events", 8), 10);
        }
        final JSONObject jsonObject2 = jsonObject.getJSONObject("features");
        final n1 n1 = new n1(jsonObject2.optBoolean("collect_reports", true), jsonObject2.optBoolean("collect_anrs", false), jsonObject2.optBoolean("collect_build_ids", false));
        final long n2 = optInt;
        long optLong;
        if (jsonObject.has("expires_at")) {
            optLong = jsonObject.optLong("expires_at");
        }
        else {
            optLong = n2 * 1000L + System.currentTimeMillis();
        }
        return new s3.a(optLong, m, n1, optDouble, optDouble2, optInt2);
    }
    
    public Object get() {
        final f f = new f(22);
        final HashMap hashMap = new HashMap();
        final k1.d c = k1.d.C;
        final Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put((Object)c, (Object)new t1.b(30000L, 86400000L, emptySet));
        final k1.d e = k1.d.E;
        final Set emptySet2 = Collections.emptySet();
        if (emptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put((Object)e, (Object)new t1.b(1000L, 86400000L, emptySet2));
        final k1.d d = k1.d.D;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        final Set unmodifiableSet = Collections.unmodifiableSet((Set)new HashSet((Collection)Arrays.asList((Object[])new t1.d[] { t1.d.D })));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put((Object)d, (Object)new t1.b(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= k1.d.values().length) {
            new HashMap();
            return new t1.a((w1.a)f, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
    
    public boolean h(final l l) {
        return false;
    }
    
    public long i() {
        return System.currentTimeMillis();
    }
    
    public CharSequence j(final Preference preference) {
        final ListPreference listPreference = (ListPreference)preference;
        listPreference.getClass();
        Object string = null;
        if (TextUtils.isEmpty((CharSequence)null)) {
            string = ((Preference)listPreference).C.getString(2131689549);
        }
        return (CharSequence)string;
    }
    
    public com.google.android.gms.internal.ads.b k(final Context context, final String s, final u2.b b) {
        switch (this.C) {
            default: {
                final com.google.android.gms.internal.ads.b b2 = new com.google.android.gms.internal.ads.b();
                final int f = b.f(context, s);
                b2.a = f;
                int c = 1;
                int n = 0;
                int n2;
                if (f != 0) {
                    n2 = b.a(context, s, false);
                    b2.b = n2;
                }
                else {
                    n2 = b.a(context, s, true);
                    b2.b = n2;
                }
                final int a = b2.a;
                Label_0137: {
                    if (a == 0) {
                        if (n2 == 0) {
                            c = 0;
                            break Label_0137;
                        }
                    }
                    else {
                        n = a;
                    }
                    if (n >= n2) {
                        c = -1;
                    }
                }
                b2.c = c;
                return b2;
            }
            case 20: {
                final com.google.android.gms.internal.ads.b b3 = new com.google.android.gms.internal.ads.b();
                final int a2 = b.a(context, s, true);
                b3.b = a2;
                if (a2 != 0) {
                    b3.c = 1;
                }
                else if ((b3.a = b.f(context, s)) != 0) {
                    b3.c = -1;
                }
                return b3;
            }
        }
    }
    
    public StackTraceElement[] l(final StackTraceElement[] array) {
        final HashMap hashMap = new HashMap();
        final StackTraceElement[] array2 = new StackTraceElement[array.length];
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < array.length) {
            final StackTraceElement stackTraceElement = array[i];
            final Integer n3 = (Integer)hashMap.get((Object)stackTraceElement);
            int n9 = 0;
            Label_0197: {
                Label_0181: {
                    if (n3 != null) {
                        final int intValue = n3;
                        final int n4 = i - intValue;
                        if (i + n4 <= array.length) {
                            for (int j = 0; j < n4; ++j) {
                                if (!array[intValue + j].equals((Object)array[i + j])) {
                                    break Label_0181;
                                }
                            }
                            final int n5 = i - n3;
                            int n6 = n2;
                            int n7;
                            if ((n7 = n) < 10) {
                                System.arraycopy((Object)array, i, (Object)array2, n2, n5);
                                n6 = n2 + n5;
                                n7 = n + 1;
                            }
                            final int n8 = n5 - 1 + i;
                            n2 = n6;
                            n = n7;
                            n9 = n8;
                            break Label_0197;
                        }
                    }
                }
                array2[n2] = array[i];
                ++n2;
                n = 1;
                n9 = i;
            }
            hashMap.put((Object)stackTraceElement, (Object)i);
            i = n9 + 1;
        }
        final StackTraceElement[] array3 = new StackTraceElement[n2];
        System.arraycopy((Object)array2, 0, (Object)array3, 0, n2);
        if (n2 < array.length) {
            return array3;
        }
        return array;
    }
    
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
    
    public List q(final ComponentRegistrar componentRegistrar) {
        final ArrayList list = new ArrayList();
        for (final e3.a a : componentRegistrar.getComponents()) {
            final String a2 = a.a;
            e3.a a3 = a;
            if (a2 != null) {
                a3 = new e3.a(a2, a.b, a.c, a.d, a.e, (e3.c)new g((Object)a2, 12, (Object)a), a.g);
            }
            list.add((Object)a3);
        }
        return (List)list;
    }
    
    public void r(final Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable)null);
        }
    }
}

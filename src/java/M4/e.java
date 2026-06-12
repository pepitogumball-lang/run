package M4;

import java.util.concurrent.Executor;
import android.os.BaseBundle;
import O2.t;
import android.os.Handler;
import android.os.Looper;
import F4.o;
import F4.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import L3.h;
import O2.j;
import O2.i;
import java.util.Objects;
import java.util.Map;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.Context;
import g3.b;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import X2.f;
import F4.p;
import F4.n;
import B4.c;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class e implements FlutterFirebasePlugin, c, n
{
    public p C;
    
    public static boolean a(final e e, final f f) {
        e.getClass();
        f.a();
        final Context a = f.a;
        final SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.crashlytics", 0);
        boolean b;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            b = sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        else {
            f.a();
            Boolean b2 = null;
            Label_0123: {
                try {
                    final PackageManager packageManager = a.getPackageManager();
                    if (packageManager != null) {
                        final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                        if (applicationInfo != null) {
                            final Bundle metaData = applicationInfo.metaData;
                            if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_crashlytics_collection_enabled")) {
                                b2 = ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_crashlytics_collection_enabled");
                                break Label_0123;
                            }
                        }
                    }
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", (Throwable)ex);
                }
                b2 = Boolean.TRUE;
            }
            g3.b.a().b(b2);
            b = b2;
        }
        return b;
    }
    
    public static StackTraceElement b(final Map map) {
        try {
            final String s = (String)map.get((Object)"file");
            final String s2 = (String)map.get((Object)"line");
            final String s3 = (String)map.get((Object)"class");
            final String s4 = (String)map.get((Object)"method");
            String s5 = s3;
            if (s3 == null) {
                s5 = "";
            }
            Objects.requireNonNull((Object)s2);
            return new StackTraceElement(s5, s4, s, Integer.parseInt(s2));
        }
        catch (final Exception ex) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }
    
    public final i didReinitializeFirebaseCore() {
        final j j = new j();
        ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.c(j, 2));
        return j.a;
    }
    
    public final i getPluginConstantsForFirebaseApp(final f f) {
        final j j = new j();
        ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new h(this, j, f));
        return j.a;
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        (this.C = new p(b.c, "plugins.flutter.io/firebase_crashlytics")).b((n)this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", (FlutterFirebasePlugin)this);
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        final p c = this.C;
        if (c != null) {
            c.b((n)null);
            this.C = null;
        }
    }
    
    public final void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        final Object b = m.b;
        int n = -1;
        switch (a.hashCode()) {
            case 1219454365: {
                if (!a.equals((Object)"Crashlytics#crash")) {
                    break;
                }
                n = 9;
                break;
            }
            case 679831756: {
                if (!a.equals((Object)"Crashlytics#setUserIdentifier")) {
                    break;
                }
                n = 8;
                break;
            }
            case 213629529: {
                if (!a.equals((Object)"Crashlytics#deleteUnsentReports")) {
                    break;
                }
                n = 7;
                break;
            }
            case 108415030: {
                if (!a.equals((Object)"Crashlytics#setCustomKey")) {
                    break;
                }
                n = 6;
                break;
            }
            case 28093114: {
                if (!a.equals((Object)"Crashlytics#log")) {
                    break;
                }
                n = 5;
                break;
            }
            case -108157790: {
                if (!a.equals((Object)"Crashlytics#setCrashlyticsCollectionEnabled")) {
                    break;
                }
                n = 4;
                break;
            }
            case -424770276: {
                if (!a.equals((Object)"Crashlytics#sendUnsentReports")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1025128541: {
                if (!a.equals((Object)"Crashlytics#checkForUnsentReports")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1437158995: {
                if (!a.equals((Object)"Crashlytics#recordError")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2094964816: {
                if (!a.equals((Object)"Crashlytics#didCrashOnPreviousExecution")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        t t = null;
        switch (n) {
            default: {
                ((E4.j)o).notImplemented();
                return;
            }
            case 9: {
                new Handler(Looper.myLooper()).postDelayed((Runnable)new M4.b(0), 50L);
                return;
            }
            case 8: {
                final Map map = (Map)b;
                final j j = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(map, j, 2));
                t = j.a;
                break;
            }
            case 7: {
                final j i = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.c(i, 3));
                t = i.a;
                break;
            }
            case 6: {
                final Map map2 = (Map)b;
                final j k = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(map2, k, 0));
                t = k.a;
                break;
            }
            case 5: {
                final Map map3 = (Map)b;
                final j l = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(map3, l, 1));
                t = l.a;
                break;
            }
            case 4: {
                final Map map4 = (Map)b;
                final j j2 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new M4.c(this, map4, j2, 1));
                t = j2.a;
                break;
            }
            case 3: {
                final j j3 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.c(j3, 4));
                t = j3.a;
                break;
            }
            case 2: {
                final j j4 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new d(this, j4, 0));
                t = j4.a;
                break;
            }
            case 1: {
                final Map map5 = (Map)b;
                final j j5 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new M4.c(this, map5, j5, 0));
                t = j5.a;
                break;
            }
            case 0: {
                final j j6 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new d(this, j6, 1));
                t = j6.a;
                break;
            }
        }
        t.k((O2.d)new E4.h((E4.j)o, 2));
    }
}

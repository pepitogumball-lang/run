package K4;

import java.util.concurrent.Executor;
import android.os.BaseBundle;
import O2.t;
import E4.h;
import F4.o;
import F4.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import B4.b;
import X2.f;
import O2.j;
import O2.i;
import java.util.Iterator;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map$Entry;
import android.os.Bundle;
import java.util.Map;
import F4.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import B4.c;
import F4.n;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;

public class d implements FlutterFirebasePlugin, n, c
{
    public FirebaseAnalytics C;
    public p D;
    
    public static Bundle a(final Map map) {
        if (map == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        for (final Map$Entry map$Entry : map.entrySet()) {
            final Object value = map$Entry.getValue();
            final String s = (String)map$Entry.getKey();
            if (value instanceof String) {
                ((BaseBundle)bundle).putString(s, (String)value);
            }
            else if (value instanceof Integer) {
                ((BaseBundle)bundle).putLong(s, (long)(int)value);
            }
            else if (value instanceof Long) {
                ((BaseBundle)bundle).putLong(s, (long)value);
            }
            else if (value instanceof Double) {
                ((BaseBundle)bundle).putDouble(s, (double)value);
            }
            else if (value instanceof Boolean) {
                ((BaseBundle)bundle).putBoolean(s, (boolean)value);
            }
            else if (value == null) {
                ((BaseBundle)bundle).putString(s, (String)null);
            }
            else if (value instanceof Iterable) {
                final ArrayList list = new ArrayList();
                for (final Object next : (Iterable)value) {
                    if (!(next instanceof Map)) {
                        final StringBuilder sb = new StringBuilder("Unsupported value type: ");
                        sb.append(((Map)next).getClass().getCanonicalName());
                        sb.append(" in list at key ");
                        sb.append(s);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    list.add((Object)a((Map)next));
                }
                bundle.putParcelableArrayList(s, list);
            }
            else {
                if (!(value instanceof Map)) {
                    final StringBuilder sb2 = new StringBuilder("Unsupported value type: ");
                    sb2.append(((Map)value).getClass().getCanonicalName());
                    throw new IllegalArgumentException(sb2.toString());
                }
                bundle.putParcelable(s, (Parcelable)a((Map)value));
            }
        }
        return bundle;
    }
    
    @Override
    public final i didReinitializeFirebaseCore() {
        final j j = new j();
        ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.c(j, 0));
        return (i)j.a;
    }
    
    @Override
    public final i getPluginConstantsForFirebaseApp(final f f) {
        final j j = new j();
        ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(this, j, 0));
        return (i)j.a;
    }
    
    public final void onAttachedToEngine(final b b) {
        final F4.f c = b.c;
        this.C = FirebaseAnalytics.getInstance(b.a);
        (this.D = new p(c, "plugins.flutter.io/firebase_analytics")).b((n)this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", (FlutterFirebasePlugin)this);
    }
    
    public final void onDetachedFromEngine(final b b) {
        final p d = this.D;
        if (d != null) {
            d.b(null);
            this.D = null;
        }
    }
    
    public final void onMethodCall(final m m, final o o) {
        final String a = m.a;
        a.getClass();
        final Object b = m.b;
        int n = -1;
        switch (a.hashCode()) {
            case 1992044651: {
                if (!a.equals((Object)"Analytics#setUserId")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1751063748: {
                if (!a.equals((Object)"Analytics#setSessionTimeoutDuration")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1083589925: {
                if (!a.equals((Object)"Analytics#setUserProperty")) {
                    break;
                }
                n = 7;
                break;
            }
            case 179244440: {
                if (!a.equals((Object)"Analytics#getSessionId")) {
                    break;
                }
                n = 6;
                break;
            }
            case -45011405: {
                if (!a.equals((Object)"Analytics#logEvent")) {
                    break;
                }
                n = 5;
                break;
            }
            case -99047480: {
                if (!a.equals((Object)"Analytics#setDefaultEventParameters")) {
                    break;
                }
                n = 4;
                break;
            }
            case -273201790: {
                if (!a.equals((Object)"Analytics#setAnalyticsCollectionEnabled")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1572470123: {
                if (!a.equals((Object)"Analytics#setConsent")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1931910274: {
                if (!a.equals((Object)"Analytics#resetAnalyticsData")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2090892968: {
                if (!a.equals((Object)"Analytics#getAppInstanceId")) {
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
                final Map map = (Map)b;
                final j j = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map, j, 1));
                t = j.a;
                break;
            }
            case 8: {
                final Map map2 = (Map)b;
                final j i = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map2, i, 5));
                t = i.a;
                break;
            }
            case 7: {
                final Map map3 = (Map)b;
                final j k = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map3, k, 3));
                t = k.a;
                break;
            }
            case 6: {
                final j l = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(this, l, 1));
                t = l.a;
                break;
            }
            case 5: {
                final Map map4 = (Map)b;
                final j j2 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map4, j2, 4));
                t = j2.a;
                break;
            }
            case 4: {
                final Map map5 = (Map)b;
                final j j3 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map5, j3, 2));
                t = j3.a;
                break;
            }
            case 3: {
                final Map map6 = (Map)b;
                final j j4 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map6, j4, 6));
                t = j4.a;
                break;
            }
            case 2: {
                final Map map7 = (Map)b;
                final j j5 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new K4.b(this, map7, j5, 0));
                t = j5.a;
                break;
            }
            case 1: {
                final j j6 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(this, j6, 3));
                t = j6.a;
                break;
            }
            case 0: {
                final j j7 = new j();
                ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new a(this, j7, 2));
                t = j7.a;
                break;
            }
        }
        t.k((O2.d)new h((E4.j)o, 1));
    }
}

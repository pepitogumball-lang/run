package io.flutter.plugins.firebase.core;

import java.util.concurrent.Executor;
import java.util.HashMap;
import java.util.Iterator;
import n3.u0;
import java.util.Map$Entry;
import L4.e;
import K4.c;
import O2.i;
import X2.f;
import O2.j;
import java.util.WeakHashMap;
import java.util.Map;
import androidx.annotation.Keep;

@Keep
public class FlutterFirebasePluginRegistry
{
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins;
    
    static {
        registeredPlugins = (Map)new WeakHashMap();
    }
    
    public static i didReinitializeFirebaseCore() {
        final j j = new j();
        ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new c(j, 1));
        return (i)j.a;
    }
    
    public static i getPluginConstantsForFirebaseApp(final f f) {
        final j j = new j();
        ((Executor)FlutterFirebasePlugin.cachedThreadPool).execute((Runnable)new e(f, j, 0));
        return (i)j.a;
    }
    
    public static void registerPlugin(final String s, final FlutterFirebasePlugin flutterFirebasePlugin) {
        FlutterFirebasePluginRegistry.registeredPlugins.put((Object)s, (Object)flutterFirebasePlugin);
    }
}

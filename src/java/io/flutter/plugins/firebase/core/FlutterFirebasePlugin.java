package io.flutter.plugins.firebase.core;

import X2.f;
import O2.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import androidx.annotation.Keep;

@Keep
public interface FlutterFirebasePlugin
{
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    
    i didReinitializeFirebaseCore();
    
    i getPluginConstantsForFirebaseApp(final f p0);
}

package io.flutter.plugins.firebase.messaging;

import a4.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collections;
import java.util.LinkedList;
import w2.e;
import java.util.List;

public class FlutterFirebaseMessagingBackgroundService extends a
{
    public static final List J;
    public static e K;
    
    static {
        J = Collections.synchronizedList((List)new LinkedList());
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        if (FlutterFirebaseMessagingBackgroundService.K == null) {
            FlutterFirebaseMessagingBackgroundService.K = new e(8);
        }
        final e k = FlutterFirebaseMessagingBackgroundService.K;
        if (!((AtomicBoolean)k.D).get()) {
            final long long1 = s2.a.c.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
            if (long1 != 0L) {
                k.O(long1, (c)null);
            }
        }
    }
}

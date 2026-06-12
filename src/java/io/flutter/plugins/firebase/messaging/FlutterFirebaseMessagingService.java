package io.flutter.plugins.firebase.messaging;

import androidx.lifecycle.B;
import O4.g;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FlutterFirebaseMessagingService extends FirebaseMessagingService
{
    public final void c(final String s) {
        if (g.m == null) {
            g.m = (g)new B();
        }
        ((B)g.m).h((Object)s);
    }
}

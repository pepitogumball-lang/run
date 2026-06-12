package L4;

import F4.b;
import Y0.h;
import F4.f;

public interface i
{
    default void b(final f f, final d d) {
        final h h = new h((Object)f, (Object)"dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", new Object(), (Object)null);
        if (d != null) {
            h.u((b)new L4.f(d, 0));
        }
        else {
            h.u((b)null);
        }
        final h h2 = new h((Object)f, (Object)"dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", new Object(), (Object)null);
        if (d != null) {
            h2.u((b)new L4.f(d, 1));
        }
        else {
            h2.u((b)null);
        }
        final h h3 = new h((Object)f, (Object)"dev.flutter.pigeon.FirebaseAppHostApi.delete", new Object(), (Object)null);
        if (d != null) {
            h3.u((b)new L4.f(d, 2));
        }
        else {
            h3.u((b)null);
        }
    }
}

package L4;

import F4.b;
import Y0.h;
import F4.f;

public interface j
{
    default void a(final f f, final d d) {
        final k d2 = k.d;
        final h h = new h((Object)f, (Object)"dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", (Object)d2, (Object)null);
        if (d != null) {
            h.u((b)new L4.f(d, 3));
        }
        else {
            h.u((b)null);
        }
        final h h2 = new h((Object)f, (Object)"dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", (Object)d2, (Object)null);
        if (d != null) {
            h2.u((b)new L4.f(d, 4));
        }
        else {
            h2.u((b)null);
        }
        final h h3 = new h((Object)f, (Object)"dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", (Object)d2, (Object)null);
        if (d != null) {
            h3.u((b)new L4.f(d, 5));
        }
        else {
            h3.u((b)null);
        }
    }
}

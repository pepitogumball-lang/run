package v4;

import b1.f;
import android.window.BackEvent;
import android.util.Log;
import F4.o;
import F4.p;
import io.flutter.embedding.android.FlutterActivity;
import android.window.OnBackAnimationCallback;

public final class c implements OnBackAnimationCallback
{
    public final FlutterActivity a;
    
    public c(final FlutterActivity a) {
        this.a = a;
    }
    
    public final void onBackCancelled() {
        final FlutterActivity a = this.a;
        if (a.j("cancelBackGesture")) {
            final e d = a.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                ((p)b.j.D).a("cancelBackGesture", (Object)null, (o)null);
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onBackInvoked() {
        final FlutterActivity a = this.a;
        if (a.j("commitBackGesture")) {
            final e d = a.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                ((p)b.j.D).a("commitBackGesture", (Object)null, (o)null);
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onBackProgressed(final BackEvent backEvent) {
        final FlutterActivity a = this.a;
        if (a.j("updateBackGestureProgress")) {
            final e d = a.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                final f j = b.j;
                j.getClass();
                ((p)j.D).a("updateBackGestureProgress", (Object)f.h(backEvent), (o)null);
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }
    
    public final void onBackStarted(final BackEvent backEvent) {
        final FlutterActivity a = this.a;
        if (a.j("startBackGesture")) {
            final e d = a.D;
            d.c();
            final w4.c b = d.b;
            if (b != null) {
                final f j = b.j;
                j.getClass();
                ((p)j.D).a("startBackGesture", (Object)f.h(backEvent), (o)null);
            }
            else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}

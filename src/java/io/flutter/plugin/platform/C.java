package io.flutter.plugin.platform;

import io.flutter.view.g;
import android.view.MotionEvent;
import v4.f;

public final class c extends f
{
    public a I;
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final a i = this.I;
        if (i != null) {
            final g a = i.a;
            if (a != null && a.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}

package io.flutter.plugin.platform;

import io.flutter.view.g;
import android.view.accessibility.AccessibilityEvent;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

public final class t extends FrameLayout
{
    public final a C;
    public final View D;
    
    public t(final Context context, final a c, final View d) {
        super(context);
        this.C = c;
        this.D = d;
    }
    
    public final boolean requestSendAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        final g a = this.C.a;
        return a != null && a.a(this.D, view, accessibilityEvent);
    }
}

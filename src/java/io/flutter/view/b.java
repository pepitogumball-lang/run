package io.flutter.view;

import android.view.View;
import V4.G;
import c2.k;
import v4.l;
import w4.i;
import io.flutter.embedding.engine.FlutterJNI;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

public final class b implements AccessibilityManager$AccessibilityStateChangeListener
{
    public final g a;
    
    public b(final g a) {
        this.a = a;
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        final g a = this.a;
        if (a.u) {
            return;
        }
        final boolean b2 = false;
        final k b3 = a.b;
        if (b) {
            final a v = a.v;
            b3.F = v;
            ((FlutterJNI)b3.E).setAccessibilityDelegate(v);
            ((FlutterJNI)b3.E).setSemanticsEnabled(true);
        }
        else {
            a.j(false);
            b3.F = null;
            ((FlutterJNI)b3.E).setAccessibilityDelegate(null);
            ((FlutterJNI)b3.E).setSemanticsEnabled(false);
        }
        final G s = a.s;
        if (s != null) {
            final boolean touchExplorationEnabled = a.c.isTouchExplorationEnabled();
            final l l = (l)s.D;
            if (!l.J.b.a.getIsSoftwareRenderingEnabled()) {
                boolean willNotDraw = b2;
                if (!b) {
                    willNotDraw = b2;
                    if (!touchExplorationEnabled) {
                        willNotDraw = true;
                    }
                }
                ((View)l).setWillNotDraw(willNotDraw);
            }
            else {
                ((View)l).setWillNotDraw(false);
            }
        }
    }
}

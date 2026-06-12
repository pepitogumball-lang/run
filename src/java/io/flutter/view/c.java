package io.flutter.view;

import android.view.View;
import V4.G;
import v4.l;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;

public final class c implements AccessibilityManager$TouchExplorationStateChangeListener
{
    public final AccessibilityManager a;
    public final g b;
    
    public c(final g b, final AccessibilityManager a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onTouchExplorationStateChanged(final boolean b) {
        final g b2 = this.b;
        if (b2.u) {
            return;
        }
        final boolean b3 = false;
        if (!b) {
            b2.j(false);
            final f p = b2.p;
            if (p != null) {
                b2.h(p.b, 256);
                b2.p = null;
            }
        }
        final G s = b2.s;
        if (s != null) {
            final boolean enabled = this.a.isEnabled();
            final l l = (l)s.D;
            if (!l.J.b.a.getIsSoftwareRenderingEnabled()) {
                boolean willNotDraw = b3;
                if (!enabled) {
                    willNotDraw = b3;
                    if (!b) {
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

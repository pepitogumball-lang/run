package j;

import java.util.WeakHashMap;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import h1.m;
import android.view.View;
import O.H;
import O.V;
import m.b;
import com.google.android.gms.internal.auth.h;

public final class J extends h
{
    public final int d;
    public final L e;
    
    public final void a() {
        final L e = this.e;
        switch (this.d) {
            default: {
                e.t = null;
                ((View)e.d).requestLayout();
                return;
            }
            case 0: {
                if (e.o) {
                    final View g = e.g;
                    if (g != null) {
                        g.setTranslationY(0.0f);
                        ((View)e.d).setTranslationY(0.0f);
                    }
                }
                e.d.setVisibility(8);
                e.d.setTransitioning(false);
                e.t = null;
                final m k = e.k;
                if (k != null) {
                    k.d(e.j);
                    e.j = null;
                    e.k = null;
                }
                final ActionBarOverlayLayout c = e.c;
                if (c != null) {
                    final WeakHashMap a = V.a;
                    H.c((View)c);
                }
            }
        }
    }
}

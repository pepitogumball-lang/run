package N0;

import O.k0;
import android.view.Display;
import android.view.View;
import O.t0;
import K2.G0;
import O.h0;
import O.i0;
import O.j0;
import android.graphics.Point;
import android.view.WindowManager;
import android.inputmethodservice.InputMethodService;
import android.app.Activity;
import android.content.ContextWrapper;
import L0.o;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import L0.l;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.graphics.Rect;
import n5.h;
import L0.b;
import L0.c;
import androidx.window.extensions.layout.FoldingFeature;
import L0.m;

public abstract class e
{
    public static c a(final m m, final FoldingFeature foldingFeature) {
        final int type = foldingFeature.getType();
        final c c = null;
        b b;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            b = L0.b.J;
        }
        else {
            b = L0.b.I;
        }
        final int state = foldingFeature.getState();
        b b2;
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            b2 = L0.b.H;
        }
        else {
            b2 = L0.b.G;
        }
        final Rect bounds = foldingFeature.getBounds();
        h.d("oemFeature.bounds", (Object)bounds);
        final I0.b b3 = new I0.b(bounds);
        final Rect c2 = m.a.c();
        c c3;
        if (b3.a() == 0 && b3.b() == 0) {
            c3 = c;
        }
        else if (b3.b() != c2.width() && b3.a() != c2.height()) {
            c3 = c;
        }
        else if (b3.b() < c2.width() && b3.a() < c2.height()) {
            c3 = c;
        }
        else if (b3.b() == c2.width() && b3.a() == c2.height()) {
            c3 = c;
        }
        else {
            final Rect bounds2 = foldingFeature.getBounds();
            h.d("oemFeature.bounds", (Object)bounds2);
            c3 = new c(new I0.b(bounds2), b, b2);
        }
        return c3;
    }
    
    public static l b(final m m, final WindowLayoutInfo windowLayoutInfo) {
        h.e("info", (Object)windowLayoutInfo);
        final List displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d("info.displayFeatures", (Object)displayFeatures);
        final Iterable iterable = (Iterable)displayFeatures;
        final ArrayList list = new ArrayList();
        for (final DisplayFeature displayFeature : iterable) {
            c a;
            if (displayFeature instanceof FoldingFeature) {
                h.d("feature", (Object)displayFeature);
                a = a(m, (FoldingFeature)displayFeature);
            }
            else {
                a = null;
            }
            if (a != null) {
                list.add((Object)a);
            }
        }
        return new l((List)list);
    }
    
    public static l c(final Context context, final WindowLayoutInfo windowLayoutInfo) {
        h.e("info", (Object)windowLayoutInfo);
        final int sdk_INT = Build$VERSION.SDK_INT;
        l l;
        if (sdk_INT >= 30) {
            final int b = o.b;
            m a = null;
            Label_0289: {
                if (sdk_INT < 30) {
                    Context baseContext = context;
                    while (baseContext instanceof ContextWrapper) {
                        final boolean b2 = baseContext instanceof Activity;
                        if (!b2) {
                            if (!(baseContext instanceof InputMethodService)) {
                                final ContextWrapper contextWrapper = (ContextWrapper)baseContext;
                                if (contextWrapper.getBaseContext() != null) {
                                    baseContext = contextWrapper.getBaseContext();
                                    h.d("iterator.baseContext", (Object)baseContext);
                                    continue;
                                }
                            }
                        }
                        if (b2) {
                            a = o.a((Activity)context);
                            break Label_0289;
                        }
                        if (baseContext instanceof InputMethodService) {
                            final Object systemService = context.getSystemService("window");
                            h.c("null cannot be cast to non-null type android.view.WindowManager", systemService);
                            final Display defaultDisplay = ((WindowManager)systemService).getDefaultDisplay();
                            h.d("wm.defaultDisplay", (Object)defaultDisplay);
                            final Point point = new Point();
                            defaultDisplay.getRealSize(point);
                            final Rect rect = new Rect(0, 0, point.x, point.y);
                            final int sdk_INT2 = Build$VERSION.SDK_INT;
                            k0 k0;
                            if (sdk_INT2 >= 30) {
                                k0 = new j0();
                            }
                            else if (sdk_INT2 >= 29) {
                                k0 = new i0();
                            }
                            else {
                                k0 = new h0();
                            }
                            final t0 b3 = k0.b();
                            h.d("Builder().build()", (Object)b3);
                            a = new m(rect, b3);
                            break Label_0289;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append((Object)context);
                        sb.append(" is not a UiContext");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    final StringBuilder sb2 = new StringBuilder("Context ");
                    sb2.append((Object)context);
                    sb2.append(" is not a UiContext");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final WindowManager windowManager = (WindowManager)context.getSystemService((Class)WindowManager.class);
                final t0 c = t0.c(G0.g(G0.r(windowManager)), null);
                final Rect e = G0.e(G0.r(windowManager));
                h.d("wm.currentWindowMetrics.bounds", (Object)e);
                a = new m(e, c);
            }
            l = b(a, windowLayoutInfo);
        }
        else {
            if (sdk_INT < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            final int b4 = o.b;
            l = b(o.a((Activity)context), windowLayoutInfo);
        }
        return l;
    }
}

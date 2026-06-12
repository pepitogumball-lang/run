package O0;

import android.graphics.Rect;
import L0.c;
import java.util.Iterator;
import java.util.ArrayList;
import L0.l;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.List;
import androidx.window.sidecar.SidecarDisplayFeature;
import n5.h;
import androidx.window.sidecar.SidecarDeviceState;
import com.google.android.gms.internal.measurement.L;

public final class f
{
    public final int a;
    
    public f() {
        L.p(3, "verificationMode");
        this.a = 3;
    }
    
    public static boolean a(final SidecarDeviceState sidecarDeviceState, final SidecarDeviceState sidecarDeviceState2) {
        final boolean a = h.a((Object)sidecarDeviceState, (Object)sidecarDeviceState2);
        boolean b = true;
        if (a) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        if (sidecarDeviceState2 == null) {
            return false;
        }
        if (O0.a.b(sidecarDeviceState) != O0.a.b(sidecarDeviceState2)) {
            b = false;
        }
        return b;
    }
    
    public static boolean b(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDisplayFeature sidecarDisplayFeature2) {
        return h.a((Object)sidecarDisplayFeature, (Object)sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && h.a((Object)sidecarDisplayFeature.getRect(), (Object)sidecarDisplayFeature2.getRect()));
    }
    
    public static boolean c(final List list, final List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (!b((SidecarDisplayFeature)list.get(i), (SidecarDisplayFeature)list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean d(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        return h.a((Object)sidecarWindowLayoutInfo, (Object)sidecarWindowLayoutInfo2) || (sidecarWindowLayoutInfo != null && sidecarWindowLayoutInfo2 != null && c(a.c(sidecarWindowLayoutInfo), a.c(sidecarWindowLayoutInfo2)));
    }
    
    public final l e(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarDeviceState sidecarDeviceState) {
        h.e("state", (Object)sidecarDeviceState);
        if (sidecarWindowLayoutInfo == null) {
            return new l((List)d5.l.C);
        }
        final SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        O0.a.d(sidecarDeviceState2, O0.a.b(sidecarDeviceState));
        return new l((List)this.f(O0.a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }
    
    public final ArrayList f(final List list, final SidecarDeviceState sidecarDeviceState) {
        final Iterable iterable = (Iterable)list;
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            final c g = this.g((SidecarDisplayFeature)iterator.next(), sidecarDeviceState);
            if (g != null) {
                list2.add((Object)g);
            }
        }
        return list2;
    }
    
    public final c g(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDeviceState sidecarDeviceState) {
        h.e("feature", (Object)sidecarDisplayFeature);
        final SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature)I0.a.a(this.a, (Object)sidecarDisplayFeature).d("Type must be either TYPE_FOLD or TYPE_HINGE", (m5.l)b.D).d("Feature bounds must not be 0", (m5.l)O0.c.D).d("TYPE_FOLD must have 0 area", (m5.l)d.D).d("Feature be pinned to either left or top", (m5.l)e.D).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        final int type = sidecarDisplayFeature2.getType();
        L0.b b;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            b = L0.b.J;
        }
        else {
            b = L0.b.I;
        }
        final int b2 = O0.a.b(sidecarDeviceState);
        if (b2 != 0 && b2 != 1) {
            L0.b b3;
            if (b2 != 2) {
                b3 = L0.b.G;
                if (b2 != 3) {
                    if (b2 == 4) {
                        return null;
                    }
                    b3 = b3;
                }
            }
            else {
                b3 = L0.b.H;
            }
            final Rect rect = sidecarDisplayFeature.getRect();
            h.d("feature.rect", (Object)rect);
            return new c(new I0.b(rect), b, b3);
        }
        return null;
    }
}

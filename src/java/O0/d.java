package O0;

import n5.h;
import androidx.window.sidecar.SidecarDisplayFeature;
import m5.l;
import n5.i;

public final class d extends i implements l
{
    public static final d D;
    
    static {
        D = (d)new i(1);
    }
    
    public final Boolean a(final SidecarDisplayFeature sidecarDisplayFeature) {
        h.e("$this$require", (Object)sidecarDisplayFeature);
        final int type = sidecarDisplayFeature.getType();
        boolean b2;
        final boolean b = b2 = true;
        if (type == 1) {
            b2 = b;
            if (sidecarDisplayFeature.getRect().width() != 0) {
                b2 = (sidecarDisplayFeature.getRect().height() == 0 && b);
            }
        }
        return b2;
    }
}

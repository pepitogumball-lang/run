package O0;

import n5.h;
import androidx.window.sidecar.SidecarDisplayFeature;
import m5.l;
import n5.i;

public final class c extends i implements l
{
    public static final c D;
    
    static {
        D = (c)new i(1);
    }
    
    public final Boolean a(final SidecarDisplayFeature sidecarDisplayFeature) {
        h.e("$this$require", (Object)sidecarDisplayFeature);
        return sidecarDisplayFeature.getRect().width() != 0 || sidecarDisplayFeature.getRect().height() != 0;
    }
}

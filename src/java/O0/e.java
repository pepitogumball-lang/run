package O0;

import n5.h;
import androidx.window.sidecar.SidecarDisplayFeature;
import m5.l;
import n5.i;

public final class e extends i implements l
{
    public static final e D;
    
    static {
        D = (e)new i(1);
    }
    
    public final Boolean a(final SidecarDisplayFeature sidecarDisplayFeature) {
        h.e("$this$require", (Object)sidecarDisplayFeature);
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }
}

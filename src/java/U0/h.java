package u0;

import java.util.HashMap;
import android.os.IInterface;
import androidx.room.MultiInstanceInvalidationService;
import android.os.RemoteCallbackList;

public final class h extends RemoteCallbackList
{
    public final MultiInstanceInvalidationService a;
    
    public h(final MultiInstanceInvalidationService a) {
        this.a = a;
    }
    
    public final void onCallbackDied(final IInterface interface1, final Object o) {
        final b b = (b)interface1;
        final HashMap d = this.a.D;
        final Integer n = (Integer)o;
        n.intValue();
        d.remove((Object)n);
    }
}

package b1;

import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import R0.m;
import java.util.WeakHashMap;

public abstract class k
{
    public static final String a;
    public static final WeakHashMap b;
    
    static {
        a = m.h("WakeLocks");
        b = new WeakHashMap();
    }
    
    public static PowerManager$WakeLock a(final Context context, String concat) {
        final PowerManager powerManager = (PowerManager)context.getApplicationContext().getSystemService("power");
        concat = "WorkManager: ".concat(concat);
        final PowerManager$WakeLock wakeLock = powerManager.newWakeLock(1, concat);
        final WeakHashMap b = k.b;
        synchronized (b) {
            b.put((Object)wakeLock, (Object)concat);
            return wakeLock;
        }
    }
}

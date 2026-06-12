package L3;

import android.content.res.Resources$NotFoundException;
import android.util.Log;
import C3.i;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class e
{
    public static final AtomicInteger a;
    
    static {
        a = new AtomicInteger((int)SystemClock.elapsedRealtime());
    }
    
    public static boolean a(final Resources resources, final int n) {
        if (Build$VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (i.x(resources.getDrawable(n, (Resources$Theme)null))) {
                final StringBuilder sb = new StringBuilder("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(n);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        }
        catch (final Resources$NotFoundException ex) {
            final StringBuilder sb2 = new StringBuilder("Couldn't find resource ");
            sb2.append(n);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}

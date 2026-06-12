package d2;

import android.util.Log;
import java.util.Objects;

public final class f extends ClassLoader
{
    public final Class loadClass(final String s, final boolean b) {
        if (Objects.equals((Object)s, (Object)"com.google.android.gms.iid.MessengerCompat")) {
            if (Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return g.class;
        }
        return super.loadClass(s, b);
    }
}

package k3;

import java.io.IOException;
import android.util.Log;
import q3.c;
import L.a;

public final class i
{
    public static final h d;
    public static final a e;
    public final c a;
    public String b;
    public String c;
    
    static {
        d = new h(0);
        e = new a(1);
    }
    
    public i(final c a) {
        this.b = null;
        this.c = null;
        this.a = a;
    }
    
    public static void a(final c c, final String s, final String s2) {
        if (s != null && s2 != null) {
            try {
                c.e(s, "aqs.".concat(s2)).createNewFile();
            }
            catch (final IOException ex) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", (Throwable)ex);
            }
        }
    }
}

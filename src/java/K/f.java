package K;

import android.os.Handler;
import android.os.Looper;

public abstract class f
{
    public static Handler a(final Looper looper) {
        return Handler.createAsync(looper);
    }
    
    public static Handler b(final Looper looper) {
        return Handler.createAsync(looper);
    }
}

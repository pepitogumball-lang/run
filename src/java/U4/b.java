package U4;

import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class b implements Executor
{
    public static final Handler C;
    
    static {
        C = new Handler(Looper.getMainLooper());
    }
    
    public final void execute(final Runnable runnable) {
        b.C.post(runnable);
    }
}

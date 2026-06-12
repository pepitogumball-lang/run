package E;

import java.util.concurrent.Executor;
import android.content.Context;

public abstract class e
{
    public static Executor a(final Context context) {
        return context.getMainExecutor();
    }
}

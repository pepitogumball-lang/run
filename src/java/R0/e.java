package r0;

import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

public abstract class e
{
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback((Choreographer$FrameCallback)new d(runnable));
    }
}

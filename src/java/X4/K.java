package x4;

import O.n0;
import android.os.Build$VERSION;
import android.os.Looper;
import android.os.Handler;

public final class k implements d
{
    public final Handler a;
    
    public k() {
        final Looper mainLooper = Looper.getMainLooper();
        Handler g;
        if (Build$VERSION.SDK_INT >= 28) {
            g = n0.g(mainLooper);
        }
        else {
            g = new Handler(mainLooper);
        }
        this.a = g;
    }
    
    @Override
    public final void a(final b b) {
        this.a.post((Runnable)b);
    }
}

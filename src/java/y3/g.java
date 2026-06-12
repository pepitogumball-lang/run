package Y3;

import android.os.Looper;
import android.view.View;
import S3.a;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class g implements ViewTreeObserver$OnPreDrawListener
{
    public final Handler C;
    public final AtomicReference D;
    public final a E;
    public final a F;
    
    public g(final View view, final a e, final a f) {
        this.C = new Handler(Looper.getMainLooper());
        this.D = new AtomicReference((Object)view);
        this.E = e;
        this.F = f;
    }
    
    public final boolean onPreDraw() {
        final View view = (View)this.D.getAndSet((Object)null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        final Handler c = this.C;
        c.post((Runnable)this.E);
        c.postAtFrontOfQueue((Runnable)this.F);
        return true;
    }
}

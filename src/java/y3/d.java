package Y3;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Looper;
import android.view.View;
import S3.a;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.view.ViewTreeObserver$OnDrawListener;

public final class d implements ViewTreeObserver$OnDrawListener
{
    public final Handler C;
    public final AtomicReference D;
    public final a E;
    
    public d(final View view, final a e) {
        this.C = new Handler(Looper.getMainLooper());
        this.D = new AtomicReference((Object)view);
        this.E = e;
    }
    
    public final void onDraw() {
        final View view = (View)this.D.getAndSet((Object)null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new b(this, view));
        this.C.postAtFrontOfQueue((Runnable)this.E);
    }
}

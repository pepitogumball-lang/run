package v4;

import android.view.View;
import io.flutter.embedding.engine.renderer.k;
import android.view.SurfaceHolder;
import android.os.Build$VERSION;
import io.flutter.embedding.engine.renderer.a;
import io.flutter.embedding.engine.renderer.j;
import android.view.SurfaceHolder$Callback2;

public final class x implements SurfaceHolder$Callback2
{
    public final h C;
    public j D;
    public final g E;
    public final a F;
    public final w G;
    
    public x(final g e, final h c, final j d) {
        this.F = new a((Object)this, 3);
        final boolean b = Build$VERSION.SDK_INT < 26;
        w g;
        if (b) {
            g = new w(this, 1);
        }
        else {
            g = new w(this, 0);
        }
        this.G = g;
        this.E = e;
        this.D = d;
        this.C = c;
        if (b) {
            ((View)c).setAlpha(0.0f);
        }
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        final g e = this.E;
        if (e != null) {
            e.surfaceChanged(surfaceHolder, n, n2, n3);
        }
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final g e = this.E;
        if (e != null) {
            e.surfaceCreated(surfaceHolder);
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        final g e = this.E;
        if (e != null) {
            e.surfaceDestroyed(surfaceHolder);
        }
    }
    
    public final void surfaceRedrawNeeded(final SurfaceHolder surfaceHolder) {
    }
    
    public final void surfaceRedrawNeededAsync(final SurfaceHolder surfaceHolder, final Runnable runnable) {
        final j d = this.D;
        if (d == null) {
            return;
        }
        d.a((k)new v(this, runnable));
    }
}

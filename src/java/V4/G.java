package v4;

import io.flutter.embedding.engine.renderer.j;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;

public final class g implements SurfaceHolder$Callback
{
    public final h C;
    
    public g(final h c) {
        this.C = c;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        final h c = this.C;
        final j e = c.E;
        if (e != null && !c.D) {
            if (e == null) {
                throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
            }
            e.a.onSurfaceChanged(n2, n3);
        }
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final h c = this.C;
        boolean b = true;
        c.C = true;
        if (c.E == null || c.D) {
            b = false;
        }
        if (b) {
            c.e();
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        final h c = this.C;
        final boolean b = false;
        c.C = false;
        final j e = c.E;
        int n = b ? 1 : 0;
        if (e != null) {
            n = (b ? 1 : 0);
            if (!c.D) {
                n = 1;
            }
        }
        if (n != 0) {
            if (e == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            e.j();
        }
    }
}

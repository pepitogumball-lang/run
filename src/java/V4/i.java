package v4;

import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.view.TextureView$SurfaceTextureListener;

public final class i implements TextureView$SurfaceTextureListener
{
    public final j C;
    
    public i(final j c) {
        this.C = c;
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, int n, final int n2) {
        final j c = this.C;
        n = 1;
        c.C = true;
        if (c.E == null || c.D) {
            n = 0;
        }
        if (n != 0) {
            c.e();
        }
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        final j c = this.C;
        final boolean b = false;
        c.C = false;
        final io.flutter.embedding.engine.renderer.j e = c.E;
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
            final Surface f = c.F;
            if (f != null) {
                f.release();
                c.F = null;
            }
        }
        final Surface f2 = c.F;
        if (f2 != null) {
            f2.release();
            c.F = null;
        }
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        final j c = this.C;
        final io.flutter.embedding.engine.renderer.j e = c.E;
        if (e != null && !c.D) {
            if (e == null) {
                throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
            }
            e.a.onSurfaceChanged(n, n2);
        }
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
}

package v4;

import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import android.util.Log;
import android.view.Surface;
import io.flutter.embedding.engine.renderer.l;
import android.view.TextureView;

public final class j extends TextureView implements l
{
    public boolean C;
    public boolean D;
    public io.flutter.embedding.engine.renderer.j E;
    public Surface F;
    
    public final void a() {
        if (this.E != null) {
            if (((View)this).getWindowToken() != null) {
                final io.flutter.embedding.engine.renderer.j e = this.E;
                if (e == null) {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
                e.j();
                final Surface f = this.F;
                if (f != null) {
                    f.release();
                    this.F = null;
                }
            }
            this.E = null;
        }
        else {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
        }
    }
    
    public final void b() {
        if (this.E == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.C) {
            this.e();
        }
        this.D = false;
    }
    
    public final void c(final io.flutter.embedding.engine.renderer.j e) {
        final io.flutter.embedding.engine.renderer.j e2 = this.E;
        if (e2 != null) {
            e2.j();
        }
        this.E = e;
        this.b();
    }
    
    public final void d() {
        if (this.E == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.D = true;
    }
    
    public final void e() {
        if (this.E != null && this.getSurfaceTexture() != null) {
            final Surface f = this.F;
            if (f != null) {
                f.release();
                this.F = null;
            }
            final Surface surface = new Surface(this.getSurfaceTexture());
            this.F = surface;
            final io.flutter.embedding.engine.renderer.j e = this.E;
            final boolean d = this.D;
            if (!d) {
                e.j();
            }
            e.c = surface;
            final FlutterJNI a = e.a;
            if (d) {
                a.onSurfaceWindowChanged(surface);
            }
            else {
                a.onSurfaceCreated(surface);
            }
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }
    
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.E;
    }
    
    public void setRenderSurface(final Surface f) {
        this.F = f;
    }
}

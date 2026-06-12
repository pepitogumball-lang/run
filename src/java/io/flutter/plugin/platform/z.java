package io.flutter.plugin.platform;

import android.view.Surface;
import android.graphics.SurfaceTexture;
import io.flutter.embedding.engine.renderer.h;

public final class z implements i
{
    public final h a;
    public SurfaceTexture b;
    public Surface c;
    public int d;
    public int e;
    public boolean f;
    
    public z(final h a) {
        this.d = 0;
        this.e = 0;
        this.f = false;
        final y d = new y(this);
        this.a = a;
        this.b = a.b.surfaceTexture();
        a.d = d;
    }
    
    public final void a(final int d, final int e) {
        this.d = d;
        this.e = e;
        final SurfaceTexture b = this.b;
        if (b != null) {
            b.setDefaultBufferSize(d, e);
        }
    }
    
    public final long b() {
        return this.a.a;
    }
    
    public final int getHeight() {
        return this.e;
    }
    
    public final Surface getSurface() {
        final Surface c = this.c;
        if (c == null || this.f) {
            if (c != null) {
                c.release();
                this.c = null;
            }
            this.c = new Surface(this.b);
            this.f = false;
        }
        final SurfaceTexture b = this.b;
        if (b != null && !io.flutter.plugin.editing.i.u(b)) {
            return this.c;
        }
        return null;
    }
    
    public final int getWidth() {
        return this.d;
    }
    
    public final void release() {
        this.b = null;
        final Surface c = this.c;
        if (c != null) {
            c.release();
            this.c = null;
        }
    }
}

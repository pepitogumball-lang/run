package io.flutter.embedding.engine.renderer;

import io.flutter.view.m;
import K2.y;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import android.os.Handler;
import android.graphics.SurfaceTexture;
import io.flutter.view.n;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;

public final class h implements TextureRegistry$SurfaceTextureEntry, n
{
    public final long a;
    public final SurfaceTextureWrapper b;
    public boolean c;
    public n d;
    public final j e;
    
    public h(final j e, final long a, final SurfaceTexture surfaceTexture) {
        this.e = e;
        this.a = a;
        final SurfaceTextureWrapper b = new SurfaceTextureWrapper(surfaceTexture, (Runnable)new c(this, 1));
        this.b = b;
        b.surfaceTexture().setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)new g(this), new Handler());
    }
    
    public final void finalize() {
        try {
            if (this.c) {
                return;
            }
            final j e = this.e;
            e.e.post((Runnable)new y(this.a, e.a));
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public final long id() {
        return this.a;
    }
    
    @Override
    public final void onTrimMemory(final int n) {
        final n d = this.d;
        if (d != null) {
            d.onTrimMemory(n);
        }
    }
    
    @Override
    public final void release() {
        if (this.c) {
            return;
        }
        this.b.release();
        final j e = this.e;
        e.a.unregisterTexture(this.a);
        e.h(this);
        this.c = true;
    }
    
    @Override
    public final void setOnFrameConsumedListener(final m m) {
    }
    
    @Override
    public final void setOnTrimMemoryListener(final n d) {
        this.d = d;
    }
    
    @Override
    public final SurfaceTexture surfaceTexture() {
        return this.b.surfaceTexture();
    }
}

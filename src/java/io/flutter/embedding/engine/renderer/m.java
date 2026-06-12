package io.flutter.embedding.engine.renderer;

import io.flutter.view.o;
import android.graphics.SurfaceTexture;
import K2.y;
import io.flutter.embedding.engine.FlutterJNI;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;

public final class m implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer
{
    public final long a;
    public int b;
    public int c;
    public boolean d;
    public Surface e;
    public final h f;
    public final Handler g;
    public final FlutterJNI h;
    
    public m(final long a, final Handler g, final FlutterJNI h, final h f) {
        this.a = a;
        this.g = g;
        this.h = h;
        this.f = f;
    }
    
    public final void finalize() {
        try {
            if (this.d) {
                return;
            }
            this.release();
            this.g.post((Runnable)new y(this.a, this.h));
        }
        finally {
            super.finalize();
        }
    }
    
    @Override
    public final Surface getForcedNewSurface() {
        this.e = null;
        return this.getSurface();
    }
    
    @Override
    public final int getHeight() {
        return this.c;
    }
    
    @Override
    public final Surface getSurface() {
        final Surface e = this.e;
        if (e == null || !e.isValid()) {
            this.e = new Surface(this.f.b.surfaceTexture());
        }
        return this.e;
    }
    
    @Override
    public final SurfaceTexture getSurfaceTexture() {
        return this.f.b.surfaceTexture();
    }
    
    @Override
    public final int getWidth() {
        return this.b;
    }
    
    @Override
    public final boolean handlesCropAndRotation() {
        return true;
    }
    
    @Override
    public final long id() {
        return this.a;
    }
    
    @Override
    public final void release() {
        this.f.release();
        this.e.release();
        this.e = null;
        this.d = true;
    }
    
    @Override
    public final void scheduleFrame() {
        this.h.markTextureFrameAvailable(this.a);
    }
    
    @Override
    public final void setCallback(final o o) {
    }
    
    @Override
    public final void setSize(final int b, final int c) {
        this.b = b;
        this.c = c;
        this.f.b.surfaceTexture().setDefaultBufferSize(b, c);
    }
}

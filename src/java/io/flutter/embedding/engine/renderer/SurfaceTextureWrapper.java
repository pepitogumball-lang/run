package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
public class SurfaceTextureWrapper
{
    private boolean attached;
    private boolean newFrameAvailable;
    private Runnable onFrameConsumed;
    private boolean released;
    private SurfaceTexture surfaceTexture;
    
    public SurfaceTextureWrapper(final SurfaceTexture surfaceTexture) {
        this(surfaceTexture, null);
    }
    
    public SurfaceTextureWrapper(final SurfaceTexture surfaceTexture, final Runnable onFrameConsumed) {
        this.newFrameAvailable = false;
        this.surfaceTexture = surfaceTexture;
        this.released = false;
        this.onFrameConsumed = onFrameConsumed;
    }
    
    public void attachToGLContext(final int n) {
        monitorenter(this);
        Label_0018: {
            try {
                if (this.released) {
                    monitorexit(this);
                    return;
                }
                break Label_0018;
            }
            finally {
                monitorexit(this);
            Label_0032:
                while (true) {
                    this.surfaceTexture.detachFromGLContext();
                    break Label_0032;
                    iftrue(Label_0032:)(!this.attached);
                    continue;
                }
                this.surfaceTexture.attachToGLContext(n);
                this.attached = true;
                monitorexit(this);
            }
        }
    }
    
    public void detachFromGLContext() {
        monitorenter(this);
        Label_0037: {
            try {
                if (this.attached && !this.released) {
                    this.surfaceTexture.detachFromGLContext();
                    this.attached = false;
                }
                break Label_0037;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public void getTransformMatrix(final float[] array) {
        this.surfaceTexture.getTransformMatrix(array);
    }
    
    public void markDirty() {
        synchronized (this) {
            this.newFrameAvailable = true;
        }
    }
    
    public void release() {
        monitorenter(this);
        Label_0035: {
            try {
                if (!this.released) {
                    this.surfaceTexture.release();
                    this.released = true;
                    this.attached = false;
                }
                break Label_0035;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
    
    public boolean shouldUpdate() {
        synchronized (this) {
            return this.newFrameAvailable;
        }
    }
    
    public SurfaceTexture surfaceTexture() {
        return this.surfaceTexture;
    }
    
    public void updateTexImage() {
        monitorenter(this);
        Label_0045: {
            try {
                this.newFrameAvailable = false;
                if (this.released) {
                    break Label_0045;
                }
                this.surfaceTexture.updateTexImage();
                final Runnable onFrameConsumed = this.onFrameConsumed;
                if (onFrameConsumed != null) {
                    onFrameConsumed.run();
                }
                break Label_0045;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
}

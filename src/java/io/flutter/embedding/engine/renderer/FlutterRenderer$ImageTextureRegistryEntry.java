package io.flutter.embedding.engine.renderer;

import android.util.Log;
import K2.y;
import java.io.IOException;
import G0.g;
import android.os.Build$VERSION;
import android.media.Image;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

@Keep
final class FlutterRenderer$ImageTextureRegistryEntry implements TextureRegistry$ImageTextureEntry, TextureRegistry$ImageConsumer
{
    private static final String TAG = "ImageTextureRegistryEntry";
    private final long id;
    private boolean ignoringFence;
    private Image image;
    private boolean released;
    final j this$0;
    
    public FlutterRenderer$ImageTextureRegistryEntry(final j this$0, final long id) {
        this.this$0 = this$0;
        this.ignoringFence = false;
        this.id = id;
    }
    
    private void maybeWaitOnFence(final Image image) {
        if (image == null) {
            return;
        }
        if (this.ignoringFence) {
            return;
        }
        if (Build$VERSION.SDK_INT >= 33) {
            this.waitOnFence(image);
            return;
        }
        this.ignoringFence = true;
    }
    
    private void waitOnFence(final Image image) {
        try {
            g.t(g.f(image));
        }
        catch (final IOException ex) {}
    }
    
    @Override
    public Image acquireLatestImage() {
        synchronized (this) {
            final Image image = this.image;
            this.image = null;
            monitorexit(this);
            this.maybeWaitOnFence(image);
            return image;
        }
    }
    
    public void finalize() {
        Label_0084: {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                final Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
            }
            finally {
                break Label_0084;
            }
            this.released = true;
            final j this$0 = this.this$0;
            this$0.e.post((Runnable)new y(this.id, this$0.a));
            super.finalize();
            return;
        }
        super.finalize();
    }
    
    @Override
    public long id() {
        return this.id;
    }
    
    @Override
    public void pushImage(final Image image) {
        if (this.released) {
            return;
        }
        synchronized (this) {
            final Image image2 = this.image;
            this.image = image;
            monitorexit(this);
            if (image2 != null) {
                Log.e("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                this.this$0.a.scheduleFrame();
            }
        }
    }
    
    @Override
    public void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        final Image image = this.image;
        if (image != null) {
            image.close();
            this.image = null;
        }
        this.this$0.a.unregisterTexture(this.id);
    }
}

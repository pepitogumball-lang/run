package io.flutter.plugin.platform;

import android.media.Image;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import android.util.Log;
import android.media.ImageReader;
import com.google.android.gms.internal.ads.em;
import android.media.ImageReader$OnImageAvailableListener;

public final class b implements ImageReader$OnImageAvailableListener
{
    public final em a;
    
    public b(final em a) {
        this.a = a;
    }
    
    public final void onImageAvailable(final ImageReader imageReader) {
        Image acquireLatestImage;
        try {
            acquireLatestImage = imageReader.acquireLatestImage();
        }
        catch (final IllegalStateException ex) {
            final StringBuilder sb = new StringBuilder("onImageAvailable acquireLatestImage failed: ");
            sb.append((Object)ex);
            Log.e("ImageReaderPlatformViewRenderTarget", sb.toString());
            acquireLatestImage = null;
        }
        if (acquireLatestImage == null) {
            return;
        }
        ((TextureRegistry$ImageTextureEntry)this.a.c).pushImage(acquireLatestImage);
    }
}

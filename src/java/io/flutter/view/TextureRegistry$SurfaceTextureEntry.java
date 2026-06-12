package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
public interface TextureRegistry$SurfaceTextureEntry
{
    default void setOnFrameConsumedListener(final m m) {
    }
    
    default void setOnTrimMemoryListener(final n n) {
    }
    
    SurfaceTexture surfaceTexture();
}

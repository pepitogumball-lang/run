package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public interface TextureRegistry$SurfaceProducer
{
    Surface getForcedNewSurface();
    
    int getHeight();
    
    Surface getSurface();
    
    int getWidth();
    
    boolean handlesCropAndRotation();
    
    void scheduleFrame();
    
    void setCallback(final o p0);
    
    void setSize(final int p0, final int p1);
}

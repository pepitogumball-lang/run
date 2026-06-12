package io.flutter.plugin.platform;

import android.view.Surface;

public interface i
{
    void a(final int p0, final int p1);
    
    long b();
    
    int getHeight();
    
    Surface getSurface();
    
    int getWidth();
    
    void release();
    
    default void scheduleFrame() {
    }
}

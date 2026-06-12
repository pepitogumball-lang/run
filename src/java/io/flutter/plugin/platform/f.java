package io.flutter.plugin.platform;

import android.view.View;

public interface f
{
    void dispose();
    
    View getView();
    
    default void onFlutterViewAttached(final View view) {
    }
    
    default void onFlutterViewDetached() {
    }
    
    default void onInputConnectionLocked() {
    }
    
    default void onInputConnectionUnlocked() {
    }
}

package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.lifecycle.o;
import androidx.annotation.Keep;

@Keep
public class HiddenLifecycleReference
{
    private final o lifecycle;
    
    public HiddenLifecycleReference(final o lifecycle) {
        this.lifecycle = lifecycle;
    }
    
    public o getLifecycle() {
        return this.lifecycle;
    }
}

package io.flutter.embedding.engine.renderer;

import android.media.ImageReader$OnImageAvailableListener;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import android.media.ImageReader;

public final class f
{
    public final ImageReader a;
    public final ArrayDeque b;
    public boolean c;
    public final FlutterRenderer$ImageReaderSurfaceProducer d;
    
    public f(final FlutterRenderer$ImageReaderSurfaceProducer d, final ImageReader a) {
        this.d = d;
        this.b = new ArrayDeque();
        this.c = false;
        (this.a = a).setOnImageAvailableListener((ImageReader$OnImageAvailableListener)new e(this), new Handler(Looper.getMainLooper()));
    }
}

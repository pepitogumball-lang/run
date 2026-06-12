package io.flutter.view;

import io.flutter.embedding.engine.FlutterJNI;
import K2.U;
import android.view.Choreographer$FrameCallback;

public final class p implements Choreographer$FrameCallback
{
    public long C;
    public final U D;
    
    public p(final U d, final long c) {
        this.D = d;
        this.C = c;
    }
    
    public final void doFrame(long n) {
        n = System.nanoTime() - n;
        if (n < 0L) {
            n = 0L;
        }
        final U d = this.D;
        ((FlutterJNI)d.c).onVsync(n, d.b, this.C);
        d.d = this;
    }
}

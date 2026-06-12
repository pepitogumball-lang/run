package K2;

import io.flutter.embedding.engine.FlutterJNI;

public final class y implements Runnable
{
    public final int C;
    public final long D;
    public final Object E;
    
    public y(final long d, final FlutterJNI e) {
        this.C = 2;
        this.D = d;
        this.E = e;
    }
    
    public final void run() {
        switch (this.C) {
            default: {
                final FlutterJNI flutterJNI = (FlutterJNI)this.E;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(this.D);
                }
                return;
            }
            case 1: {
                final X0 x0 = (X0)this.E;
                ((n0)x0.C).m().z(this.D);
                x0.G = null;
                return;
            }
            case 0: {
                ((p)this.E).D(this.D);
            }
        }
    }
}

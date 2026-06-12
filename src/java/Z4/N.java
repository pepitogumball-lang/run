package Z4;

import io.flutter.embedding.engine.FlutterJNI;
import K2.U;
import java.util.Iterator;
import java.util.ArrayList;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager$DisplayListener;

public final class n implements DisplayManager$DisplayListener
{
    public final int a;
    public final DisplayManager b;
    public final Object c;
    
    private final void a(final int n) {
    }
    
    private final void b(final int n) {
    }
    
    public final void onDisplayAdded(final int n) {
        switch (this.a) {
            default: {
                return;
            }
            case 0: {
                final Iterator iterator = ((ArrayList)this.c).iterator();
                while (iterator.hasNext()) {
                    ((DisplayManager$DisplayListener)iterator.next()).onDisplayAdded(n);
                }
            }
        }
    }
    
    public final void onDisplayChanged(final int n) {
        switch (this.a) {
            default: {
                if (n == 0) {
                    final float refreshRate = this.b.getDisplay(0).getRefreshRate();
                    final long b = (long)(1.0E9 / refreshRate);
                    final U u = (U)this.c;
                    u.b = b;
                    ((FlutterJNI)u.c).setRefreshRateFPS(refreshRate);
                }
                return;
            }
            case 0: {
                if (this.b.getDisplay(n) != null) {
                    final Iterator iterator = ((ArrayList)this.c).iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager$DisplayListener)iterator.next()).onDisplayChanged(n);
                    }
                }
            }
        }
    }
    
    public final void onDisplayRemoved(final int n) {
        switch (this.a) {
            default: {
                return;
            }
            case 0: {
                final Iterator iterator = ((ArrayList)this.c).iterator();
                while (iterator.hasNext()) {
                    ((DisplayManager$DisplayListener)iterator.next()).onDisplayRemoved(n);
                }
            }
        }
    }
}

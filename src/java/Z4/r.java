package Z4;

import java.util.Iterator;
import java.util.ArrayList;
import android.os.Handler;
import android.hardware.display.DisplayManager$DisplayListener;
import java.util.Collection;
import J5.b;
import android.content.Context;
import android.hardware.display.DisplayManager;
import n5.h;
import F1.n;

public final class r
{
    public final n a;
    
    public r(final n a, final int n) {
        switch (n) {
            default: {
                h.e("pigeonRegistrar", (Object)a);
                this.a = a;
                return;
            }
            case 4: {
                h.e("pigeonRegistrar", (Object)a);
                this.a = a;
                return;
            }
            case 3: {
                h.e("pigeonRegistrar", (Object)a);
                this.a = a;
                return;
            }
            case 2: {
                h.e("pigeonRegistrar", (Object)a);
                this.a = a;
                return;
            }
            case 1: {
                h.e("pigeonRegistrar", (Object)a);
                this.a = a;
            }
        }
    }
    
    public b0 a() {
        final DisplayManager displayManager = (DisplayManager)((Context)this.a.G).getSystemService("display");
        final ArrayList x = b.X(displayManager);
        final b0 b0 = new b0(this);
        final ArrayList x2 = b.X(displayManager);
        x2.removeAll((Collection)x);
        if (!x2.isEmpty()) {
            final Iterator iterator = x2.iterator();
            while (iterator.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager$DisplayListener)iterator.next());
                displayManager.registerDisplayListener((DisplayManager$DisplayListener)new Z4.n(x2, displayManager, 0), (Handler)null);
            }
        }
        return b0;
    }
}

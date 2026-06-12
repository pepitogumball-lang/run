package j;

import java.util.WeakHashMap;
import android.view.ViewGroup;
import O.d0;
import O.e0;
import O.V;
import android.view.View;

public final class p implements Runnable
{
    public final int C;
    public final y D;
    
    public final void run() {
        boolean b = true;
        final y d = this.D;
        switch (this.C) {
            default: {
                d.Y.showAtLocation((View)d.X, 55, 0, 0);
                final d0 a0 = d.a0;
                if (a0 != null) {
                    a0.b();
                }
                Label_0091: {
                    if (d.b0) {
                        final ViewGroup c0 = d.c0;
                        if (c0 != null) {
                            final WeakHashMap a2 = V.a;
                            if (((View)c0).isLaidOut()) {
                                break Label_0091;
                            }
                        }
                    }
                    b = false;
                }
                if (b) {
                    ((View)d.X).setAlpha(0.0f);
                    final d0 a3 = V.a((View)d.X);
                    a3.a(1.0f);
                    (d.a0 = a3).d((e0)new r(this, 0));
                }
                else {
                    ((View)d.X).setAlpha(1.0f);
                    d.X.setVisibility(0);
                }
                return;
            }
            case 0: {
                if ((0x1 & d.B0) != 0x0) {
                    d.w(0);
                }
                if ((d.B0 & 0x1000) != 0x0) {
                    d.w(108);
                }
                d.A0 = false;
                d.B0 = 0;
            }
        }
    }
}

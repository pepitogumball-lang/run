package j;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.widget.PopupWindow;
import O.e0;
import O.H;
import O.V;
import android.view.View;
import h1.m;
import com.google.android.gms.internal.auth.h;

public final class r extends h
{
    public final int d;
    public final Object e;
    
    public final void a() {
        final Object e = this.e;
        switch (this.d) {
            default: {
                final m m = (m)e;
                ((y)m.E).X.setVisibility(8);
                final y y = (y)m.E;
                final PopupWindow y2 = y.Y;
                if (y2 != null) {
                    y2.dismiss();
                }
                else if (((View)y.X).getParent() instanceof View) {
                    final View view = (View)((View)y.X).getParent();
                    final WeakHashMap a = V.a;
                    H.c(view);
                }
                y.X.e();
                y.a0.d((e0)null);
                y.a0 = null;
                final ViewGroup c0 = y.c0;
                final WeakHashMap a2 = V.a;
                H.c((View)c0);
                return;
            }
            case 1: {
                final y y3 = (y)e;
                ((View)y3.X).setAlpha(1.0f);
                y3.a0.d((e0)null);
                y3.a0 = null;
                return;
            }
            case 0: {
                final p p = (p)e;
                ((View)p.D.X).setAlpha(1.0f);
                final y d = p.D;
                d.a0.d((e0)null);
                d.a0 = null;
            }
        }
    }
    
    public void c() {
        final Object e = this.e;
        switch (this.d) {
            default: {
                return;
            }
            case 1: {
                final y y = (y)e;
                y.X.setVisibility(0);
                if (((View)y.X).getParent() instanceof View) {
                    final View view = (View)((View)y.X).getParent();
                    final WeakHashMap a = V.a;
                    H.c(view);
                }
                return;
            }
            case 0: {
                ((p)e).D.X.setVisibility(0);
            }
        }
    }
}

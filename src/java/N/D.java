package n;

import o.C0;
import java.util.Iterator;
import java.util.ArrayList;
import o.I0;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import o.E;
import android.view.View;
import o.F;
import o.O;
import O.V;
import o.L;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class d implements ViewTreeObserver$OnGlobalLayoutListener
{
    public final int C;
    public final Object D;
    
    public final void onGlobalLayout() {
        final Object d = this.D;
        switch (this.C) {
            default: {
                final L l = (L)d;
                final O h0 = l.h0;
                l.getClass();
                final WeakHashMap a = V.a;
                if (((View)h0).isAttachedToWindow() && ((View)h0).getGlobalVisibleRect(l.f0)) {
                    l.s();
                    ((C0)l).c();
                }
                else {
                    ((C0)l).dismiss();
                }
                return;
            }
            case 2: {
                final O o = (O)d;
                if (!o.getInternalPopup().b()) {
                    o.H.l(F.b((View)o), F.a((View)o));
                }
                final ViewTreeObserver viewTreeObserver = ((View)o).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    E.a(viewTreeObserver, (ViewTreeObserver$OnGlobalLayoutListener)this);
                }
                return;
            }
            case 1: {
                final D d2 = (D)d;
                if (d2.b()) {
                    final I0 j = d2.J;
                    if (!((C0)j).Z) {
                        final View o2 = d2.O;
                        if (o2 != null && o2.isShown()) {
                            ((C0)j).c();
                        }
                        else {
                            d2.dismiss();
                        }
                    }
                }
                return;
            }
            case 0: {
                final f f = (f)d;
                if (f.b()) {
                    final ArrayList i = f.J;
                    if (i.size() > 0 && !((C0)((e)i.get(0)).a).Z) {
                        final View q = f.Q;
                        if (q != null && q.isShown()) {
                            final Iterator iterator = i.iterator();
                            while (iterator.hasNext()) {
                                ((C0)((e)iterator.next()).a).c();
                            }
                        }
                        else {
                            f.dismiss();
                        }
                    }
                }
            }
        }
    }
}

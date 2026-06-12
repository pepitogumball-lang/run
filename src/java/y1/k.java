package y1;

import java.util.concurrent.Executor;
import F1.i0;
import com.google.android.gms.ads.internal.client.zzfp;
import F1.w0;
import z1.d;
import F1.a;
import android.util.DisplayMetrics;
import J1.e;
import F1.p;
import android.view.View;
import F1.n0;
import F1.P0;
import h2.A;
import F1.D;
import android.os.RemoteException;
import J1.j;
import J1.c;
import F1.q;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.internal.ads.D7;
import android.content.Context;
import F1.x0;
import android.view.ViewGroup;

public abstract class k extends ViewGroup
{
    public final x0 C;
    
    public k(final Context context) {
        super(context);
        this.C = new x0(this);
    }
    
    public final void a() {
        D7.a(((View)this).getContext());
        if ((boolean)d8.e.p() && (boolean)q.d.c.a(D7.Pa)) {
            ((Executor)c.b).execute((Runnable)new u(this, 1));
            return;
        }
        final x0 c = this.C;
        c.getClass();
        try {
            final D i = c.i;
            if (i != null) {
                i.A();
            }
        }
        catch (final RemoteException ex) {
            j.k("#007 Could not call remote method.", (Exception)ex);
        }
    }
    
    public final void b(final g g) {
        A.d("#008 Must be called on the main UI thread.");
        D7.a(((View)this).getContext());
        if ((boolean)d8.f.p() && (boolean)q.d.c.a(D7.Sa)) {
            ((Executor)c.b).execute((Runnable)new j0.c(5, (Object)this, (Object)g, false));
            return;
        }
        this.C.b(g.a);
    }
    
    public y1.c getAdListener() {
        return this.C.f;
    }
    
    public h getAdSize() {
        final x0 c = this.C;
        c.getClass();
        try {
            final D i = c.i;
            if (i != null) {
                final P0 f = i.f();
                if (f != null) {
                    return new h(f.G, f.C, f.D);
                }
            }
        }
        catch (final RemoteException ex) {
            j.k("#007 Could not call remote method.", (Exception)ex);
        }
        final h[] g = c.g;
        h h;
        if (g != null) {
            h = g[0];
        }
        else {
            h = null;
        }
        return h;
    }
    
    public String getAdUnitId() {
        final x0 c = this.C;
        if (c.k == null) {
            final D i = c.i;
            if (i != null) {
                try {
                    c.k = i.u();
                }
                catch (final RemoteException ex) {
                    j.k("#007 Could not call remote method.", (Exception)ex);
                }
            }
        }
        return c.k;
    }
    
    public n getOnPaidEventListener() {
        return this.C.n;
    }
    
    public y1.q getResponseInfo() {
        final x0 c = this.C;
        c.getClass();
        y1.q q = null;
        n0 k = null;
        Label_0049: {
            while (true) {
                Label_0040: {
                    try {
                        final D i = c.i;
                        if (i != null) {
                            k = i.k();
                            break Label_0049;
                        }
                    }
                    catch (final RemoteException ex) {
                        break Label_0040;
                    }
                    k = null;
                    break Label_0049;
                }
                final RemoteException ex;
                j.k("#007 Could not call remote method.", (Exception)ex);
                continue;
            }
        }
        if (k != null) {
            q = new y1.q(k);
        }
        return q;
    }
    
    public final void onLayout(final boolean b, int n, int n2, final int n3, final int n4) {
        final View child = this.getChildAt(0);
        if (child != null && child.getVisibility() != 8) {
            final int measuredWidth = child.getMeasuredWidth();
            final int measuredHeight = child.getMeasuredHeight();
            n = (n3 - n - measuredWidth) / 2;
            n2 = (n4 - n2 - measuredHeight) / 2;
            child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        int n3 = 0;
        final View child = this.getChildAt(0);
        int n4;
        if (child != null && child.getVisibility() != 8) {
            this.measureChild(child, n, n2);
            n3 = child.getMeasuredWidth();
            n4 = child.getMeasuredHeight();
        }
        else {
            h adSize;
            try {
                adSize = this.getAdSize();
            }
            catch (final NullPointerException ex) {
                j.g("Unable to retrieve ad size.", (Throwable)ex);
                adSize = null;
            }
            if (adSize != null) {
                final Context context = ((View)this).getContext();
                final int a = adSize.a;
                if (a != -3) {
                    if (a != -1) {
                        final e a2 = p.f.a;
                        n3 = e.o(context, a);
                    }
                    else {
                        n3 = context.getResources().getDisplayMetrics().widthPixels;
                    }
                }
                else {
                    n3 = -1;
                }
                final int b = adSize.b;
                if (b != -4 && b != -3) {
                    if (b != -2) {
                        final e a3 = p.f.a;
                        n4 = e.o(context, b);
                    }
                    else {
                        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        final float n5 = (float)displayMetrics.heightPixels;
                        final float density = displayMetrics.density;
                        final int n6 = (int)(n5 / density);
                        int n7;
                        if (n6 <= 400) {
                            n7 = 32;
                        }
                        else if (n6 <= 720) {
                            n7 = 50;
                        }
                        else {
                            n7 = 90;
                        }
                        n4 = (int)(n7 * density);
                    }
                }
                else {
                    n4 = -1;
                }
            }
            else {
                n4 = 0;
            }
        }
        ((View)this).setMeasuredDimension(View.resolveSize(Math.max(n3, ((View)this).getSuggestedMinimumWidth()), n), View.resolveSize(Math.max(n4, ((View)this).getSuggestedMinimumHeight()), n2));
    }
    
    public void setAdListener(final y1.c c) {
        final x0 c2 = this.C;
        c2.f = c;
        final w0 d = c2.d;
        final Object c3 = d.C;
        synchronized (c3) {
            d.D = c;
            monitorexit(c3);
            if (c == null) {
                this.C.c((a)null);
                return;
            }
            if (c instanceof a) {
                this.C.c((a)c);
            }
            if (c instanceof d) {
                this.C.e((d)c);
            }
        }
    }
    
    public void setAdSize(final h h) {
        final x0 c = this.C;
        if (c.g == null) {
            c.d(new h[] { h });
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }
    
    public void setAdUnitId(final String k) {
        final x0 c = this.C;
        if (c.k == null) {
            c.k = k;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
    
    public void setOnPaidEventListener(final n n) {
        final x0 c = this.C;
        c.getClass();
        try {
            c.n = n;
            final D i = c.i;
            if (i != null) {
                i.y1((i0)new zzfp(n));
            }
        }
        catch (final RemoteException ex) {
            j.k("#007 Could not call remote method.", (Exception)ex);
        }
    }
}

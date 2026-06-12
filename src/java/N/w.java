package n;

import java.util.WeakHashMap;
import android.graphics.Rect;
import android.view.Gravity;
import O.V;
import android.view.Display;
import android.widget.PopupWindow$OnDismissListener;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.View;
import android.content.Context;

public class w
{
    public final Context a;
    public final l b;
    public final boolean c;
    public final int d;
    public View e;
    public int f;
    public boolean g;
    public x h;
    public t i;
    public u j;
    public final u k;
    
    public w(final int d, final Context a, final View e, final l b, final boolean c) {
        this.f = 8388611;
        this.k = new u(this);
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
    }
    
    public final t a() {
        if (this.i == null) {
            final Context a = this.a;
            final Display defaultDisplay = ((WindowManager)a.getSystemService("window")).getDefaultDisplay();
            final Point point = new Point();
            v.a(defaultDisplay, point);
            t i;
            if (Math.min(point.x, point.y) >= a.getResources().getDimensionPixelSize(2131099670)) {
                i = new f(a, this.e, this.d, this.c);
            }
            else {
                i = new D(this.d, this.a, this.e, this.b, this.c);
            }
            i.l(this.b);
            i.r((PopupWindow$OnDismissListener)this.k);
            i.n(this.e);
            i.j(this.h);
            i.o(this.g);
            i.p(this.f);
            this.i = i;
        }
        return this.i;
    }
    
    public final boolean b() {
        final t i = this.i;
        return i != null && i.b();
    }
    
    public void c() {
        this.i = null;
        final u j = this.j;
        if (j != null) {
            j.onDismiss();
        }
    }
    
    public final void d(int n, final int n2, final boolean b, final boolean b2) {
        final t a = this.a();
        a.s(b2);
        if (b) {
            final int f = this.f;
            final View e = this.e;
            final WeakHashMap a2 = V.a;
            int n3 = n;
            if ((Gravity.getAbsoluteGravity(f, e.getLayoutDirection()) & 0x7) == 0x5) {
                n3 = n - this.e.getWidth();
            }
            a.q(n3);
            a.t(n2);
            n = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            a.C = new Rect(n3 - n, n2 - n, n3 + n, n2 + n);
        }
        a.c();
    }
}

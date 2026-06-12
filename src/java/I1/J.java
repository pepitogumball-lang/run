package I1;

import android.app.Dialog;
import android.os.Handler;
import x.a;
import android.content.DialogInterface$OnCancelListener;
import java.util.concurrent.atomic.AtomicInteger;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.text.TextUtils;
import android.view.WindowManager$BadTokenException;
import android.app.Activity;
import com.google.android.gms.internal.ads.D7;
import F1.q;
import android.view.MotionEvent;
import java.util.ArrayList;
import E1.o;
import android.view.ViewConfiguration;
import A2.b;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.cl;
import android.content.Context;

public final class j
{
    public final Context a;
    public final cl b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public final int h;
    public PointF i;
    public PointF j;
    public final b k;
    public final I1.b l;
    
    public j(final Context a) {
        this.g = 0;
        this.l = new I1.b(this, 1);
        this.a = a;
        this.h = ViewConfiguration.get(a).getScaledTouchSlop();
        final o b = o.B;
        b.s.d();
        this.k = (b)b.s.d;
        this.b = b.n.g;
    }
    
    public static final int e(final ArrayList list, final String s, final boolean b) {
        if (!b) {
            return -1;
        }
        list.add((Object)s);
        return list.size() - 1;
    }
    
    public final void a(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final int historySize = motionEvent.getHistorySize();
        final int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        final int g = this.g;
        if (g != -1) {
            final I1.b l = this.l;
            final b k = this.k;
            if (g == 0) {
                if (actionMasked == 5) {
                    this.g = 5;
                    this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    ((Handler)k).postDelayed((Runnable)l, (long)q.d.c.a(D7.F4));
                }
            }
            else if (g == 5) {
                if (pointerCount == 2) {
                    if (actionMasked != 2) {
                        return;
                    }
                    int i = 0;
                    boolean b = false;
                    while (i < historySize) {
                        b |= (this.d(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i)) ^ true);
                        ++i;
                    }
                    if (this.d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !b) {
                        return;
                    }
                }
                this.g = -1;
                ((Handler)k).removeCallbacks((Runnable)l);
            }
        }
    }
    
    public final void b() {
        final Context a = this.a;
        Label_0266: {
            try {
                if (!(a instanceof Activity)) {
                    J1.j.h("Can not create dialog without Activity Context");
                    return;
                }
            }
            catch (final WindowManager$BadTokenException ex) {
                break Label_0266;
            }
            final o b = o.B;
            final m n = b.n;
            final Object a2 = n.a;
            synchronized (a2) {
                final String c = n.c;
                monitorexit(a2);
                final boolean empty = TextUtils.isEmpty((CharSequence)c);
                String s = "Creative preview (enabled)";
                if (empty) {
                    s = "Creative preview";
                }
                final boolean h = b.n.h();
                String s2 = "Troubleshooting (enabled)";
                if (!h) {
                    s2 = "Troubleshooting";
                }
                final ArrayList list = new ArrayList();
                final int e = e(list, "Ad information", true);
                final int e2 = e(list, s, true);
                final int e3 = e(list, s2, true);
                final boolean booleanValue = (boolean)q.d.c.a(D7.V8);
                final int e4 = e(list, "Open ad inspector", booleanValue);
                final int e5 = e(list, "Ad inspector settings", booleanValue);
                final AlertDialog$Builder j = M.j(a);
                j.setTitle((CharSequence)"Select a debug mode").setItems((CharSequence[])list.toArray((Object[])new String[0]), (DialogInterface$OnClickListener)new f(this, e, e2, e3, e4, e5));
                ((Dialog)j.create()).show();
                return;
            }
        }
        final WindowManager$BadTokenException ex;
        H.n("", (Throwable)ex);
    }
    
    public final void c(final Context context) {
        final ArrayList list = new ArrayList();
        int e = e(list, "None", true);
        final int e2 = e(list, "Shake", true);
        final int e3 = e(list, "Flick", true);
        final int ordinal = ((Enum)this.b.r).ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                e = e3;
            }
        }
        else {
            e = e2;
        }
        final M c = o.B.c;
        final AlertDialog$Builder j = M.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(e);
        j.setTitle((CharSequence)"Setup gesture");
        j.setSingleChoiceItems((CharSequence[])list.toArray((Object[])new String[0]), e, (DialogInterface$OnClickListener)new g(atomicInteger, 0));
        j.setNegativeButton((CharSequence)"Dismiss", (DialogInterface$OnClickListener)new g(this, 1));
        j.setPositiveButton((CharSequence)"Save", (DialogInterface$OnClickListener)new h(this, atomicInteger, e, e2, e3));
        j.setOnCancelListener((DialogInterface$OnCancelListener)new i(this, 0));
        ((Dialog)j.create()).show();
    }
    
    public final boolean d(float abs, final float n, final float n2, final float n3) {
        abs = Math.abs(this.i.x - abs);
        final int h = this.h;
        return abs < h && Math.abs(this.i.y - n) < h && Math.abs(this.j.x - n2) < h && Math.abs(this.j.y - n3) < h;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return x.a.b(sb, this.d, "}");
    }
}

package o;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.view.View;
import android.view.TouchDelegate;

public final class W0 extends TouchDelegate
{
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;
    
    public W0(final Rect rect, final Rect rect2, final View a) {
        super(rect, a);
        final int scaledTouchSlop = ViewConfiguration.get(a.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        final Rect b = new Rect();
        this.b = b;
        final Rect d = new Rect();
        this.d = d;
        final Rect c = new Rect();
        this.c = c;
        b.set(rect);
        d.set(rect);
        final int n = -scaledTouchSlop;
        d.inset(n, n);
        c.set(rect2);
        this.a = a;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int n = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        final int action = motionEvent.getAction();
        final boolean b = false;
        int f = 1;
        boolean b2 = false;
        Label_0131: {
            Label_0126: {
                if (action != 0) {
                    if (action != 1 && action != 2) {
                        if (action != 3) {
                            break Label_0126;
                        }
                        f = (this.f ? 1 : 0);
                        this.f = false;
                    }
                    else {
                        final boolean f2 = this.f;
                        if ((f = (f2 ? 1 : 0)) != 0) {
                            f = (f2 ? 1 : 0);
                            if (!this.d.contains(n, n2)) {
                                f = (f2 ? 1 : 0);
                                b2 = false;
                                break Label_0131;
                            }
                        }
                    }
                    b2 = true;
                    break Label_0131;
                }
                if (this.b.contains(n, n2)) {
                    this.f = true;
                    b2 = true;
                    break Label_0131;
                }
            }
            b2 = true;
            f = 0;
        }
        boolean dispatchTouchEvent = b;
        if (f != 0) {
            final Rect c = this.c;
            final View a = this.a;
            if (b2 && !c.contains(n, n2)) {
                motionEvent.setLocation((float)(a.getWidth() / 2), (float)(a.getHeight() / 2));
            }
            else {
                motionEvent.setLocation((float)(n - c.left), (float)(n2 - c.top));
            }
            dispatchTouchEvent = a.dispatchTouchEvent(motionEvent);
        }
        return dispatchTouchEvent;
    }
}

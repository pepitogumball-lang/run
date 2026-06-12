package k4;

import android.graphics.Rect;
import w2.e;
import o.q1;
import io.flutter.embedding.android.FlutterActivity;
import C4.b;
import android.view.View;
import F4.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import F4.h;
import B4.c;

public class a implements c, C4.a, h, ViewTreeObserver$OnGlobalLayoutListener
{
    public g C;
    public View D;
    public boolean E;
    
    public final void i(final Object o) {
        this.C = null;
    }
    
    public final void m(final Object o, final g c) {
        this.C = c;
    }
    
    public final void onAttachedToActivity(final b b) {
        final View viewById = ((FlutterActivity)((q1)b).C).findViewById(16908290);
        this.D = viewById;
        viewById.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    public final void onAttachedToEngine(final B4.b b) {
        new e(b.c, "flutter_keyboard_visibility").L((h)this);
    }
    
    public final void onDetachedFromActivity() {
        final View d = this.D;
        if (d != null) {
            d.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            this.D = null;
        }
    }
    
    public final void onDetachedFromActivityForConfigChanges() {
        final View d = this.D;
        if (d != null) {
            d.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            this.D = null;
        }
    }
    
    public final void onDetachedFromEngine(final B4.b b) {
        final View d = this.D;
        if (d != null) {
            d.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            this.D = null;
        }
    }
    
    public final void onGlobalLayout() {
        if (this.D != null) {
            final Rect rect = new Rect();
            this.D.getWindowVisibleDisplayFrame(rect);
            int e;
            if (rect.height() / (double)this.D.getRootView().getHeight() < 0.85) {
                e = 1;
            }
            else {
                e = 0;
            }
            if (e != (this.E ? 1 : 0)) {
                this.E = (e != 0);
                final g c = this.C;
                if (c != null) {
                    c.a((Object)e);
                }
            }
        }
    }
    
    public final void onReattachedToActivityForConfigChanges(final b b) {
        final View viewById = ((FlutterActivity)((q1)b).C).findViewById(16908290);
        this.D = viewById;
        viewById.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}

package j;

import android.view.View;
import s2.a;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import m.e;
import androidx.appcompat.widget.ContentFrameLayout;

public final class w extends ContentFrameLayout
{
    public final y K;
    
    public w(final y k, final e e) {
        this.K = k;
        super((Context)e, (AttributeSet)null);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.K.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (n < -5 || n2 < -5 || n > ((View)this).getWidth() + 5 || n2 > ((View)this).getHeight() + 5) {
                final y k = this.K;
                k.t(k.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public final void setBackgroundResource(final int n) {
        ((View)this).setBackgroundDrawable(a.f(((View)this).getContext(), n));
    }
}

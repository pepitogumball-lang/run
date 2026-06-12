package io.flutter.plugin.platform;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View$OnFocusChangeListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.graphics.Rect;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import android.view.Surface;
import android.graphics.PorterDuff$Mode;
import android.util.Log;
import android.graphics.Canvas;
import android.content.Context;
import android.app.Activity;
import v4.a;
import android.widget.FrameLayout;

public final class j extends FrameLayout
{
    public int C;
    public int D;
    public int E;
    public int F;
    public a G;
    public i H;
    public A4.a I;
    
    public j(final Activity activity) {
        super((Context)activity);
        ((View)this).setWillNotDraw(false);
    }
    
    public final void draw(final Canvas canvas) {
        final i h = this.H;
        if (h == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        final Surface surface = h.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        final Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        if (lockHardwareCanvas == null) {
            ((View)this).invalidate();
            return;
        }
        try {
            lockHardwareCanvas.drawColor(0, PorterDuff$Mode.CLEAR);
            super.draw(lockHardwareCanvas);
        }
        finally {
            this.H.scheduleFrame();
            surface.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }
    
    public ViewTreeObserver$OnGlobalFocusChangeListener getActiveFocusListener() {
        return (ViewTreeObserver$OnGlobalFocusChangeListener)this.I;
    }
    
    public int getRenderTargetHeight() {
        final i h = this.H;
        if (h != null) {
            return h.getHeight();
        }
        return 0;
    }
    
    public int getRenderTargetWidth() {
        final i h = this.H;
        if (h != null) {
            return h.getWidth();
        }
        return 0;
    }
    
    public final ViewParent invalidateChildInParent(final int[] array, final Rect rect) {
        ((View)this).invalidate();
        return super.invalidateChildInParent(array, rect);
    }
    
    public final void onDescendantInvalidated(final View view, final View view2) {
        super.onDescendantInvalidated(view, view2);
        ((View)this).invalidate();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.G == null) {
            return super.onTouchEvent(motionEvent);
        }
        final Matrix matrix = new Matrix();
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                matrix.postTranslate((float)this.E, (float)this.F);
            }
            else {
                matrix.postTranslate((float)this.C, (float)this.D);
                this.C = this.E;
                this.D = this.F;
            }
        }
        else {
            final int e = this.E;
            this.C = e;
            final int f = this.F;
            this.D = f;
            matrix.postTranslate((float)e, (float)f);
        }
        this.G.d(motionEvent, matrix);
        return true;
    }
    
    public final boolean requestSendAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        final View child = ((ViewGroup)this).getChildAt(0);
        return (child == null || child.getImportantForAccessibility() != 4) && super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void setLayoutParams(final FrameLayout$LayoutParams layoutParams) {
        ((View)this).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.E = layoutParams.leftMargin;
        this.F = layoutParams.topMargin;
    }
    
    public void setOnDescendantFocusChangeListener(final View$OnFocusChangeListener view$OnFocusChangeListener) {
        final ViewTreeObserver viewTreeObserver = ((View)this).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final A4.a i = this.I;
            if (i != null) {
                this.I = null;
                viewTreeObserver.removeOnGlobalFocusChangeListener((ViewTreeObserver$OnGlobalFocusChangeListener)i);
            }
        }
        final ViewTreeObserver viewTreeObserver2 = ((View)this).getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.I == null) {
            viewTreeObserver2.addOnGlobalFocusChangeListener((ViewTreeObserver$OnGlobalFocusChangeListener)(this.I = new A4.a(this, view$OnFocusChangeListener)));
        }
    }
    
    public void setTouchProcessor(final a g) {
        this.G = g;
    }
}

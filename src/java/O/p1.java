package o;

import android.view.ViewManager;
import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.ViewParent;
import java.util.WeakHashMap;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import O.V;
import android.util.Log;
import android.content.Context;
import android.view.WindowManager;
import java.lang.reflect.Method;
import O.X;
import android.os.Build$VERSION;
import O.Z;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;

public final class p1 implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener
{
    public static p1 M;
    public static p1 N;
    public final View C;
    public final CharSequence D;
    public final int E;
    public final o1 F;
    public final o1 G;
    public int H;
    public int I;
    public q1 J;
    public boolean K;
    public boolean L;
    
    public p1(final View c, final CharSequence d) {
        this.F = new o1(this, 0);
        this.G = new o1(this, 1);
        this.C = c;
        this.D = d;
        final ViewConfiguration value = ViewConfiguration.get(c.getContext());
        final Method a = Z.a;
        int a2;
        if (Build$VERSION.SDK_INT >= 28) {
            a2 = X.a(value);
        }
        else {
            a2 = value.getScaledTouchSlop() / 2;
        }
        this.E = a2;
        this.L = true;
        c.setOnLongClickListener((View$OnLongClickListener)this);
        c.setOnHoverListener((View$OnHoverListener)this);
    }
    
    public static void b(final p1 m) {
        final p1 i = p1.M;
        if (i != null) {
            i.C.removeCallbacks((Runnable)i.F);
        }
        if ((p1.M = m) != null) {
            m.C.postDelayed((Runnable)m.F, (long)ViewConfiguration.getLongPressTimeout());
        }
    }
    
    public final void a() {
        final p1 n = p1.N;
        final View c = this.C;
        if (n == this) {
            p1.N = null;
            final q1 j = this.J;
            if (j != null) {
                final View view = (View)j.D;
                if (view.getParent() != null) {
                    ((ViewManager)((Context)j.C).getSystemService("window")).removeView(view);
                }
                this.J = null;
                this.L = true;
                c.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (p1.M == this) {
            b(null);
        }
        c.removeCallbacks((Runnable)this.G);
    }
    
    public final void c(final boolean k) {
        final WeakHashMap a = V.a;
        final View c = this.C;
        if (!c.isAttachedToWindow()) {
            return;
        }
        b(null);
        final p1 n = p1.N;
        if (n != null) {
            n.a();
        }
        p1.N = this;
        this.K = k;
        final q1 j = new q1(c.getContext());
        this.J = j;
        int h = this.H;
        final int i = this.I;
        final boolean l = this.K;
        final View view = (View)j.D;
        final ViewParent parent = view.getParent();
        final Context context = (Context)j.C;
        if (parent != null && view.getParent() != null) {
            ((ViewManager)context.getSystemService("window")).removeView(view);
        }
        ((TextView)j.E).setText(this.D);
        final WindowManager$LayoutParams windowManager$LayoutParams = (WindowManager$LayoutParams)j.F;
        windowManager$LayoutParams.token = c.getApplicationWindowToken();
        final int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131099797);
        if (c.getWidth() < dimensionPixelOffset) {
            h = c.getWidth() / 2;
        }
        int height;
        int n2;
        if (c.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131099796);
            height = i + dimensionPixelOffset2;
            n2 = i - dimensionPixelOffset2;
        }
        else {
            height = c.getHeight();
            n2 = 0;
        }
        windowManager$LayoutParams.gravity = 49;
        final Resources resources = context.getResources();
        int n3;
        if (l) {
            n3 = 2131099800;
        }
        else {
            n3 = 2131099799;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n3);
        final View rootView = c.getRootView();
        final ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
        View decorView;
        if (layoutParams instanceof WindowManager$LayoutParams && ((WindowManager$LayoutParams)layoutParams).type == 2) {
            decorView = rootView;
        }
        else {
            Context context2 = c.getContext();
            while (true) {
                decorView = rootView;
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                if (context2 instanceof Activity) {
                    decorView = ((Activity)context2).getWindow().getDecorView();
                    break;
                }
                context2 = ((ContextWrapper)context2).getBaseContext();
            }
        }
        if (decorView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        }
        else {
            final Rect rect = (Rect)j.G;
            decorView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                final Resources resources2 = context.getResources();
                final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize;
                if (identifier != 0) {
                    dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
                }
                else {
                    dimensionPixelSize = 0;
                }
                final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            final int[] array = (int[])j.I;
            decorView.getLocationOnScreen(array);
            final int[] array2 = (int[])j.H;
            c.getLocationOnScreen(array2);
            final int n4 = array2[0] - array[0];
            array2[0] = n4;
            array2[1] -= array[1];
            windowManager$LayoutParams.x = n4 + h - decorView.getWidth() / 2;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(measureSpec, measureSpec);
            final int measuredHeight = view.getMeasuredHeight();
            final int n5 = array2[1];
            final int n6 = n2 + n5 - dimensionPixelOffset3 - measuredHeight;
            final int n7 = n5 + height + dimensionPixelOffset3;
            if (l) {
                if (n6 >= 0) {
                    windowManager$LayoutParams.y = n6;
                }
                else {
                    windowManager$LayoutParams.y = n7;
                }
            }
            else if (measuredHeight + n7 <= rect.height()) {
                windowManager$LayoutParams.y = n7;
            }
            else {
                windowManager$LayoutParams.y = n6;
            }
        }
        ((ViewManager)context.getSystemService("window")).addView(view, (ViewGroup$LayoutParams)windowManager$LayoutParams);
        c.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n8;
        if (this.K) {
            n8 = 2500L;
        }
        else {
            long n9;
            long n10;
            if ((c.getWindowSystemUiVisibility() & 0x1) == 0x1) {
                n9 = ViewConfiguration.getLongPressTimeout();
                n10 = 3000L;
            }
            else {
                n9 = ViewConfiguration.getLongPressTimeout();
                n10 = 15000L;
            }
            n8 = n10 - n9;
        }
        final o1 g = this.G;
        c.removeCallbacks((Runnable)g);
        c.postDelayed((Runnable)g, n8);
    }
    
    public final boolean onHover(View c, final MotionEvent motionEvent) {
        if (this.J != null && this.K) {
            return false;
        }
        c = this.C;
        final AccessibilityManager accessibilityManager = (AccessibilityManager)c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.L = true;
                this.a();
            }
        }
        else if (c.isEnabled() && this.J == null) {
            final int h = (int)motionEvent.getX();
            final int i = (int)motionEvent.getY();
            if (!this.L) {
                final int abs = Math.abs(h - this.H);
                final int e = this.E;
                if (abs <= e && Math.abs(i - this.I) <= e) {
                    return false;
                }
            }
            this.H = h;
            this.I = i;
            this.L = false;
            b(this);
        }
        return false;
    }
    
    public final boolean onLongClick(final View view) {
        this.H = view.getWidth() / 2;
        this.I = view.getHeight() / 2;
        this.c(true);
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.a();
    }
}

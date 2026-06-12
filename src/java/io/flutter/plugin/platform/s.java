package io.flutter.plugin.platform;

import android.view.View$MeasureSpec;
import android.view.View;
import android.view.Gravity;
import android.view.WindowManager$LayoutParams;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;

public final class s extends ViewGroup
{
    public final Rect C;
    public final Rect D;
    
    public s(final Context context) {
        super(context);
        this.C = new Rect();
        this.D = new Rect();
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final WindowManager$LayoutParams windowManager$LayoutParams = (WindowManager$LayoutParams)child.getLayoutParams();
            this.C.set(n, n2, n3, n4);
            Gravity.apply(windowManager$LayoutParams.gravity, child.getMeasuredWidth(), child.getMeasuredHeight(), this.C, windowManager$LayoutParams.x, windowManager$LayoutParams.y, this.D);
            final Rect d = this.D;
            child.layout(d.left, d.top, d.right, d.bottom);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            this.getChildAt(i).measure(View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), Integer.MIN_VALUE));
        }
        super.onMeasure(n, n2);
    }
}

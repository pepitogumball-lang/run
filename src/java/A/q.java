package A;

import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.content.Context;
import android.view.View;

public final class q extends View
{
    public boolean C;
    
    public q(final Context context) {
        super(context);
        this.C = true;
        super.setVisibility(8);
    }
    
    public final void draw(final Canvas canvas) {
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setFilterRedundantCalls(final boolean c) {
        this.C = c;
    }
    
    public void setGuidelineBegin(final int a) {
        final e layoutParams = (e)this.getLayoutParams();
        if (this.C && layoutParams.a == a) {
            return;
        }
        layoutParams.a = a;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelineEnd(final int b) {
        final e layoutParams = (e)this.getLayoutParams();
        if (this.C && layoutParams.b == b) {
            return;
        }
        layoutParams.b = b;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelinePercent(final float c) {
        final e layoutParams = (e)this.getLayoutParams();
        if (this.C && layoutParams.c == c) {
            return;
        }
        layoutParams.c = c;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setVisibility(final int n) {
    }
}

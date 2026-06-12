package t0;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;

public class s extends ViewGroup$MarginLayoutParams
{
    public final Rect a;
    public boolean b;
    
    public s(final int n, final int n2) {
        super(n, n2);
        this.a = new Rect();
        this.b = true;
    }
    
    public s(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new Rect();
        this.b = true;
    }
    
    public s(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = new Rect();
        this.b = true;
    }
    
    public s(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
        this.a = new Rect();
        this.b = true;
    }
    
    public s(final s s) {
        super((ViewGroup$LayoutParams)s);
        this.a = new Rect();
        this.b = true;
    }
}

package o;

import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class i1 extends ViewGroup$MarginLayoutParams
{
    public int a;
    public int b;
    
    public i1(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.a = 0;
    }
    
    public i1(final i1 i1) {
        super((ViewGroup$MarginLayoutParams)i1);
        this.a = 0;
        this.a = i1.a;
    }
}

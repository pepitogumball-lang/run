package o;

import android.graphics.Bitmap;
import android.widget.AbsSeekBar;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RatingBar;

public final class z extends RatingBar
{
    public final x C;
    
    public z(final Context context, final AttributeSet set) {
        super(context, set, 2130903525);
        b1.a(((View)this).getContext(), (View)this);
        (this.C = new x((AbsSeekBar)this)).b(set, 2130903525);
    }
    
    public final void onMeasure(final int n, final int n2) {
        monitorenter(this);
        Label_0055: {
            try {
                super.onMeasure(n, n2);
                final Bitmap bitmap = (Bitmap)this.C.c;
                if (bitmap != null) {
                    ((View)this).setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * this.getNumStars(), n, 0), ((View)this).getMeasuredHeight());
                }
                break Label_0055;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
            }
        }
    }
}

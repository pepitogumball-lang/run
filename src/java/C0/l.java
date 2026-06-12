package c0;

import android.graphics.Rect;
import a0.i;
import android.view.View;
import android.text.method.TransformationMethod;

public final class l implements TransformationMethod
{
    public final TransformationMethod a;
    
    public l(final TransformationMethod a) {
        this.a = a;
    }
    
    public final CharSequence getTransformation(CharSequence e, final View view) {
        if (view.isInEditMode()) {
            return e;
        }
        final TransformationMethod a = this.a;
        CharSequence transformation = e;
        if (a != null) {
            transformation = a.getTransformation(e, view);
        }
        if ((e = transformation) != null) {
            if (i.a().b() != 1) {
                e = transformation;
            }
            else {
                final i a2 = i.a();
                a2.getClass();
                e = a2.e(transformation, 0, transformation.length());
            }
        }
        return e;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
        final TransformationMethod a = this.a;
        if (a != null) {
            a.onFocusChanged(view, charSequence, b, n, rect);
        }
    }
}

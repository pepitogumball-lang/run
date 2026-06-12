package l;

import android.graphics.Rect;
import android.view.View;
import java.util.Locale;
import android.text.method.TransformationMethod;

public final class a implements TransformationMethod
{
    public Locale a;
    
    public final CharSequence getTransformation(final CharSequence charSequence, final View view) {
        Object upperCase;
        if (charSequence != null) {
            upperCase = charSequence.toString().toUpperCase(this.a);
        }
        else {
            upperCase = null;
        }
        return (CharSequence)upperCase;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
    }
}

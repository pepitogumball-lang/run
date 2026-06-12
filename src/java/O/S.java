package o;

import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import I5.d;
import android.text.InputFilter;
import X.a;
import android.widget.TextView;

public final class s
{
    public final TextView a;
    public final a b;
    
    public s(final TextView a) {
        this.a = a;
        this.b = new a(a);
    }
    
    public final InputFilter[] a(final InputFilter[] array) {
        return ((d)this.b.D).h(array);
    }
    
    public final void b(final AttributeSet set, final int n) {
        final TypedArray obtainStyledAttributes = ((View)this.a).getContext().obtainStyledAttributes(set, i.a.i, n, 0);
        Label_0061: {
            boolean boolean1;
            try {
                final boolean hasValue = obtainStyledAttributes.hasValue(14);
                boolean1 = true;
                if (hasValue) {
                    boolean1 = obtainStyledAttributes.getBoolean(14, true);
                }
            }
            finally {
                break Label_0061;
            }
            obtainStyledAttributes.recycle();
            this.d(boolean1);
            return;
        }
        obtainStyledAttributes.recycle();
    }
    
    public final void c(final boolean b) {
        ((d)this.b.D).m(b);
    }
    
    public final void d(final boolean b) {
        ((d)this.b.D).n(b);
    }
}

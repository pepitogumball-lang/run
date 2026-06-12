package c0;

import android.view.View;
import a0.g;
import a0.i;
import android.text.Spanned;
import android.widget.TextView;
import android.text.InputFilter;

public final class e implements InputFilter
{
    public final TextView a;
    public d b;
    
    public e(final TextView a) {
        this.a = a;
    }
    
    public final CharSequence filter(CharSequence subSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        final TextView a = this.a;
        if (((View)a).isInEditMode()) {
            return subSequence;
        }
        final int b = i.a().b();
        if (b != 0) {
            if (b == 1) {
                CharSequence e;
                if (n4 == 0 && n3 == 0 && ((CharSequence)spanned).length() == 0 && subSequence == a.getText()) {
                    e = subSequence;
                }
                else if ((e = subSequence) != null) {
                    if (n != 0 || n2 != subSequence.length()) {
                        subSequence = subSequence.subSequence(n, n2);
                    }
                    e = i.a().e(subSequence, 0, subSequence.length());
                }
                return e;
            }
            if (b != 3) {
                return subSequence;
            }
        }
        final i a2 = i.a();
        if (this.b == null) {
            this.b = new d(a, this);
        }
        a2.f(this.b);
        return subSequence;
    }
}

package c0;

import android.text.method.TransformationMethod;
import android.text.InputFilter;
import android.widget.TextView;
import I5.d;

public final class i extends d
{
    public final h c;
    
    public i(final TextView textView) {
        this.c = new h(textView);
    }
    
    public final InputFilter[] h(final InputFilter[] array) {
        if (a0.i.j == null) {
            return array;
        }
        return this.c.h(array);
    }
    
    public final boolean i() {
        return this.c.e;
    }
    
    public final void m(final boolean b) {
        if (a0.i.j == null) {
            return;
        }
        this.c.m(b);
    }
    
    public final void n(final boolean e) {
        final boolean b = a0.i.j != null;
        final h c = this.c;
        if (!b) {
            c.e = e;
        }
        else {
            c.n(e);
        }
    }
    
    public final TransformationMethod u(final TransformationMethod transformationMethod) {
        if (a0.i.j == null) {
            return transformationMethod;
        }
        return this.c.u(transformationMethod);
    }
}

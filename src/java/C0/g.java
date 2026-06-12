package c0;

import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import com.google.android.gms.internal.measurement.K1;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import android.text.method.KeyListener;

public final class g implements KeyListener
{
    public final KeyListener a;
    public final f b;
    
    public g(final KeyListener a) {
        final f b = new f(0);
        this.a = a;
        this.b = b;
    }
    
    public final void clearMetaKeyState(final View view, final Editable editable, final int n) {
        this.a.clearMetaKeyState(view, editable, n);
    }
    
    public final int getInputType() {
        return this.a.getInputType();
    }
    
    public final boolean onKeyDown(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        this.b.getClass();
        final boolean b = false;
        boolean g;
        if (n != 67) {
            g = (n == 112 && K1.g(editable, keyEvent, true));
        }
        else {
            g = K1.g(editable, keyEvent, false);
        }
        boolean b2;
        if (g) {
            MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!b2) {
            final boolean b3 = b;
            if (!this.a.onKeyDown(view, editable, n, keyEvent)) {
                return b3;
            }
        }
        return true;
    }
    
    public final boolean onKeyOther(final View view, final Editable editable, final KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }
    
    public final boolean onKeyUp(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, n, keyEvent);
    }
}

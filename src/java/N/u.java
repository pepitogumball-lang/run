package n;

import android.widget.PopupWindow$OnDismissListener;

public final class u implements PopupWindow$OnDismissListener
{
    public final w C;
    
    public u(final w c) {
        this.C = c;
    }
    
    public final void onDismiss() {
        this.C.c();
    }
}

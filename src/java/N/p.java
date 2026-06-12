package n;

import android.view.ViewGroup;
import android.view.View;
import android.view.CollapsibleActionView;
import m.c;
import android.widget.FrameLayout;

public final class p extends FrameLayout implements c
{
    public final CollapsibleActionView C;
    
    public p(final View view) {
        super(view.getContext());
        this.C = (CollapsibleActionView)view;
        ((ViewGroup)this).addView(view);
    }
    
    public final void a() {
        this.C.onActionViewExpanded();
    }
    
    public final void d() {
        this.C.onActionViewCollapsed();
    }
}

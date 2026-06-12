package n;

import android.view.MenuItem;
import android.view.View;
import X.a;
import android.view.ActionProvider;
import android.view.ActionProvider$VisibilityListener;

public final class o implements ActionProvider$VisibilityListener
{
    public final ActionProvider a;
    public final s b;
    public a c;
    
    public o(final s b, final ActionProvider a) {
        this.b = b;
        this.a = a;
    }
    
    public final View a(final n n) {
        return this.a.onCreateActionView((MenuItem)n);
    }
    
    public final void onActionProviderVisibilityChanged(final boolean b) {
        final a c = this.c;
        if (c != null) {
            final l n = ((n)c.D).n;
            n.p(n.h = true);
        }
    }
}

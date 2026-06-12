package n;

import android.view.MenuItem;
import android.view.MenuItem$OnActionExpandListener;

public final class q implements MenuItem$OnActionExpandListener
{
    public final MenuItem$OnActionExpandListener a;
    public final s b;
    
    public q(final s b, final MenuItem$OnActionExpandListener a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean onMenuItemActionCollapse(MenuItem f) {
        f = this.b.f(f);
        return this.a.onMenuItemActionCollapse(f);
    }
    
    public final boolean onMenuItemActionExpand(MenuItem f) {
        f = this.b.f(f);
        return this.a.onMenuItemActionExpand(f);
    }
}

package n;

import android.view.MenuItem;
import android.view.MenuItem$OnMenuItemClickListener;

public final class r implements MenuItem$OnMenuItemClickListener
{
    public final MenuItem$OnMenuItemClickListener a;
    public final s b;
    
    public r(final s b, final MenuItem$OnMenuItemClickListener a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean onMenuItemClick(MenuItem f) {
        f = this.b.f(f);
        return this.a.onMenuItemClick(f);
    }
}

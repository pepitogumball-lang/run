package m;

import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;

public final class h implements MenuItem$OnMenuItemClickListener
{
    public static final Class[] c;
    public Object a;
    public Method b;
    
    static {
        c = new Class[] { MenuItem.class };
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        final Method b = this.b;
        Object a;
        try {
            final Class returnType = b.getReturnType();
            final Class type = Boolean.TYPE;
            a = this.a;
            if (returnType == type) {
                return (boolean)b.invoke(a, new Object[] { menuItem });
            }
        }
        catch (final Exception ex) {
            throw new RuntimeException((Throwable)ex);
        }
        b.invoke(a, new Object[] { menuItem });
        return true;
    }
}

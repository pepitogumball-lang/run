package G;

import android.content.res.Resources$Theme;
import android.content.res.Configuration;
import android.content.res.ColorStateList;

public final class j
{
    public final ColorStateList a;
    public final Configuration b;
    public final int c;
    
    public j(final ColorStateList a, final Configuration b, final Resources$Theme resources$Theme) {
        this.a = a;
        this.b = b;
        int hashCode;
        if (resources$Theme == null) {
            hashCode = 0;
        }
        else {
            hashCode = resources$Theme.hashCode();
        }
        this.c = hashCode;
    }
}

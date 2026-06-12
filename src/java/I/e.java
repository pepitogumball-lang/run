package I;

import android.net.Uri;
import android.graphics.drawable.Icon;

public abstract class e
{
    public static int a(final Object o) {
        return ((Icon)o).getResId();
    }
    
    public static String b(final Object o) {
        return ((Icon)o).getResPackage();
    }
    
    public static int c(final Object o) {
        return ((Icon)o).getType();
    }
    
    public static Uri d(final Object o) {
        return ((Icon)o).getUri();
    }
}

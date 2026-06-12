package I;

import android.graphics.drawable.Drawable;

public abstract class b
{
    public static int a(final Drawable drawable) {
        return drawable.getLayoutDirection();
    }
    
    public static boolean b(final Drawable drawable, final int layoutDirection) {
        return drawable.setLayoutDirection(layoutDirection);
    }
}

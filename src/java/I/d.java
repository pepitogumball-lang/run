package I;

import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

public abstract class d
{
    public static Drawable a(final Drawable drawable, final Drawable drawable2) {
        return (Drawable)new AdaptiveIconDrawable(drawable, drawable2);
    }
    
    public static Icon b(final Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}

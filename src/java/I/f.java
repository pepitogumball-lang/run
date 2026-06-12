package I;

import android.graphics.drawable.Icon;
import android.net.Uri;

public abstract class f
{
    public static Icon a(final Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }
}

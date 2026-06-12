package C;

import android.media.AudioAttributes;
import android.net.Uri;
import android.app.Notification;
import android.app.Notification$Builder;

public abstract class w
{
    public static Notification$Builder a(final Notification$Builder notification$Builder, final String s) {
        return notification$Builder.addPerson(s);
    }
    
    public static Notification$Builder b(final Notification$Builder notification$Builder, final String category) {
        return notification$Builder.setCategory(category);
    }
    
    public static Notification$Builder c(final Notification$Builder notification$Builder, final int color) {
        return notification$Builder.setColor(color);
    }
    
    public static Notification$Builder d(final Notification$Builder notification$Builder, final Notification publicVersion) {
        return notification$Builder.setPublicVersion(publicVersion);
    }
    
    public static Notification$Builder e(final Notification$Builder notification$Builder, final Uri uri, final Object o) {
        return notification$Builder.setSound(uri, (AudioAttributes)o);
    }
    
    public static Notification$Builder f(final Notification$Builder notification$Builder, final int visibility) {
        return notification$Builder.setVisibility(visibility);
    }
}

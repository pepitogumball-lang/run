package C;

import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

public abstract class x
{
    public static Notification$Action$Builder a(final Icon icon, final CharSequence charSequence, final PendingIntent pendingIntent) {
        return new Notification$Action$Builder(icon, charSequence, pendingIntent);
    }
    
    public static Notification$Builder b(final Notification$Builder notification$Builder, final Icon largeIcon) {
        return notification$Builder.setLargeIcon(largeIcon);
    }
    
    public static Notification$Builder c(final Notification$Builder notification$Builder, final Object o) {
        return notification$Builder.setSmallIcon((Icon)o);
    }
}

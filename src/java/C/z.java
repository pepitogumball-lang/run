package C;

import android.app.Notification$Builder;
import android.content.Context;

public abstract class z
{
    public static Notification$Builder a(final Context context, final String s) {
        return new Notification$Builder(context, s);
    }
    
    public static Notification$Builder b(final Notification$Builder notification$Builder, final int badgeIconType) {
        return notification$Builder.setBadgeIconType(badgeIconType);
    }
    
    public static Notification$Builder c(final Notification$Builder notification$Builder, final boolean colorized) {
        return notification$Builder.setColorized(colorized);
    }
    
    public static Notification$Builder d(final Notification$Builder notification$Builder, final int groupAlertBehavior) {
        return notification$Builder.setGroupAlertBehavior(groupAlertBehavior);
    }
    
    public static Notification$Builder e(final Notification$Builder notification$Builder, final CharSequence settingsText) {
        return notification$Builder.setSettingsText(settingsText);
    }
    
    public static Notification$Builder f(final Notification$Builder notification$Builder, final String shortcutId) {
        return notification$Builder.setShortcutId(shortcutId);
    }
    
    public static Notification$Builder g(final Notification$Builder notification$Builder, final long timeoutAfter) {
        return notification$Builder.setTimeoutAfter(timeoutAfter);
    }
}

package C;

import android.widget.RemoteViews;
import android.app.Notification$Builder;
import android.app.Notification$Action$Builder;

public abstract class y
{
    public static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final boolean allowGeneratedReplies) {
        return notification$Action$Builder.setAllowGeneratedReplies(allowGeneratedReplies);
    }
    
    public static Notification$Builder b(final Notification$Builder notification$Builder, final RemoteViews customBigContentView) {
        return notification$Builder.setCustomBigContentView(customBigContentView);
    }
    
    public static Notification$Builder c(final Notification$Builder notification$Builder, final RemoteViews customContentView) {
        return notification$Builder.setCustomContentView(customContentView);
    }
    
    public static Notification$Builder d(final Notification$Builder notification$Builder, final RemoteViews customHeadsUpContentView) {
        return notification$Builder.setCustomHeadsUpContentView(customHeadsUpContentView);
    }
    
    public static Notification$Builder e(final Notification$Builder notification$Builder, final CharSequence[] remoteInputHistory) {
        return notification$Builder.setRemoteInputHistory(remoteInputHistory);
    }
}

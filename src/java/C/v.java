package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import android.app.Notification$Action$Builder;
import android.app.Notification$Action;
import android.app.Notification$Builder;

public abstract class v
{
    public static Notification$Builder a(final Notification$Builder notification$Builder, final Notification$Action notification$Action) {
        return notification$Builder.addAction(notification$Action);
    }
    
    public static Notification$Action$Builder b(final Notification$Action$Builder notification$Action$Builder, final Bundle bundle) {
        return notification$Action$Builder.addExtras(bundle);
    }
    
    public static Notification$Action$Builder c(final Notification$Action$Builder notification$Action$Builder, final RemoteInput remoteInput) {
        return notification$Action$Builder.addRemoteInput(remoteInput);
    }
    
    public static Notification$Action d(final Notification$Action$Builder notification$Action$Builder) {
        return notification$Action$Builder.build();
    }
    
    public static Notification$Action$Builder e(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
        return new Notification$Action$Builder(n, charSequence, pendingIntent);
    }
    
    public static String f(final Notification notification) {
        return notification.getGroup();
    }
    
    public static Notification$Builder g(final Notification$Builder notification$Builder, final String group) {
        return notification$Builder.setGroup(group);
    }
    
    public static Notification$Builder h(final Notification$Builder notification$Builder, final boolean groupSummary) {
        return notification$Builder.setGroupSummary(groupSummary);
    }
    
    public static Notification$Builder i(final Notification$Builder notification$Builder, final boolean localOnly) {
        return notification$Builder.setLocalOnly(localOnly);
    }
    
    public static Notification$Builder j(final Notification$Builder notification$Builder, final String sortKey) {
        return notification$Builder.setSortKey(sortKey);
    }
}

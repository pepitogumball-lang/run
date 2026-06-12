package r;

import android.net.Uri;
import android.os.Bundle;

public abstract class a
{
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET = 1;
    public static final int ACTIVITY_LAYOUT_STATE_BOTTOM_SHEET_MAXIMIZED = 2;
    public static final int ACTIVITY_LAYOUT_STATE_FULL_SCREEN = 5;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET = 3;
    public static final int ACTIVITY_LAYOUT_STATE_SIDE_SHEET_MAXIMIZED = 4;
    public static final int ACTIVITY_LAYOUT_STATE_UNKNOWN = 0;
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;
    
    public void extraCallback(final String s, final Bundle bundle) {
    }
    
    public Bundle extraCallbackWithResult(final String s, final Bundle bundle) {
        return null;
    }
    
    public void onActivityLayout(final int n, final int n2, final int n3, final int n4, final int n5, final Bundle bundle) {
    }
    
    public void onActivityResized(final int n, final int n2, final Bundle bundle) {
    }
    
    public void onMessageChannelReady(final Bundle bundle) {
    }
    
    public void onMinimized(final Bundle bundle) {
    }
    
    public abstract void onNavigationEvent(final int p0, final Bundle p1);
    
    public void onPostMessage(final String s, final Bundle bundle) {
    }
    
    public void onRelationshipValidationResult(final int n, final Uri uri, final boolean b, final Bundle bundle) {
    }
    
    public void onUnminimized(final Bundle bundle) {
    }
    
    public void onWarmupCompleted(final Bundle bundle) {
    }
}

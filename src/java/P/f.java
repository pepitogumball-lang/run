package P;

import android.view.View;
import java.time.Duration;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;

public abstract class f
{
    public static AccessibilityNodeInfo$AccessibilityAction a() {
        return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }
    
    public static void b(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }
    
    public static CharSequence c(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }
    
    public static long d(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }
    
    public static boolean e(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }
    
    public static boolean f(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
    
    public static void g(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean accessibilityDataSensitive) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(accessibilityDataSensitive);
    }
    
    public static void h(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect boundsInWindow) {
        accessibilityNodeInfo.setBoundsInWindow(boundsInWindow);
    }
    
    public static void i(final AccessibilityNodeInfo accessibilityNodeInfo, final CharSequence containerTitle) {
        accessibilityNodeInfo.setContainerTitle(containerTitle);
    }
    
    public static void j(final AccessibilityNodeInfo accessibilityNodeInfo, final long n) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(n));
    }
    
    public static void k(final AccessibilityNodeInfo accessibilityNodeInfo, final View view, final boolean b) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, b);
    }
    
    public static void l(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean requestInitialAccessibilityFocus) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(requestInitialAccessibilityFocus);
    }
}

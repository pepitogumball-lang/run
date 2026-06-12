package P;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;

public abstract class d
{
    public static Object a(final int n, final float n2, final float n3, final float n4) {
        return new AccessibilityNodeInfo$RangeInfo(n, n2, n3, n4);
    }
    
    public static CharSequence b(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }
    
    public static void c(final AccessibilityNodeInfo accessibilityNodeInfo, final CharSequence stateDescription) {
        accessibilityNodeInfo.setStateDescription(stateDescription);
    }
}

package P;

import android.view.accessibility.AccessibilityNodeInfo$ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo$Builder;

public abstract class e
{
    public static g a(final boolean heading, final int columnIndex, final int rowIndex, final int columnSpan, final int rowSpan, final boolean selected, final String rowTitle, final String columnTitle) {
        new AccessibilityNodeInfo$CollectionItemInfo$Builder().setHeading(heading).setColumnIndex(columnIndex).setRowIndex(rowIndex).setColumnSpan(columnSpan).setRowSpan(rowSpan).setSelected(selected).setRowTitle(rowTitle).setColumnTitle(columnTitle).build();
        return (g)new Object();
    }
    
    public static h b(AccessibilityNodeInfo child, final int n, final int n2) {
        child = child.getChild(n, n2);
        h h;
        if (child != null) {
            h = new h(child, 0);
        }
        else {
            h = null;
        }
        return h;
    }
    
    public static String c(final Object o) {
        return ((AccessibilityNodeInfo$CollectionItemInfo)o).getColumnTitle();
    }
    
    public static String d(final Object o) {
        return ((AccessibilityNodeInfo$CollectionItemInfo)o).getRowTitle();
    }
    
    public static AccessibilityNodeInfo$ExtraRenderingInfo e(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }
    
    public static h f(AccessibilityNodeInfo parent, final int n) {
        parent = parent.getParent(n);
        h h;
        if (parent != null) {
            h = new h(parent, 0);
        }
        else {
            h = null;
        }
        return h;
    }
    
    public static String g(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }
    
    public static boolean h(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
    
    public static void i(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean textSelectable) {
        accessibilityNodeInfo.setTextSelectable(textSelectable);
    }
    
    public static void j(final AccessibilityNodeInfo accessibilityNodeInfo, final String uniqueId) {
        accessibilityNodeInfo.setUniqueId(uniqueId);
    }
}

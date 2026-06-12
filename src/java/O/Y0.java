package o;

import android.view.View;
import android.widget.PopupWindow;

public abstract class y0
{
    public static int a(final PopupWindow popupWindow, final View view, final int n, final boolean b) {
        return popupWindow.getMaxAvailableHeight(view, n, b);
    }
}

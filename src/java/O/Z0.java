package o;

import android.graphics.Rect;
import android.widget.PopupWindow;

public abstract class z0
{
    public static void a(final PopupWindow popupWindow, final Rect epicenterBounds) {
        popupWindow.setEpicenterBounds(epicenterBounds);
    }
    
    public static void b(final PopupWindow popupWindow, final boolean isClippedToScreen) {
        popupWindow.setIsClippedToScreen(isClippedToScreen);
    }
}

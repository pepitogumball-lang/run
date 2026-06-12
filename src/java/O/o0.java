package o;

import android.widget.AbsListView;

public abstract class o0
{
    public static boolean a(final AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }
    
    public static void b(final AbsListView absListView, final boolean selectedChildViewEnabled) {
        absListView.setSelectedChildViewEnabled(selectedChildViewEnabled);
    }
}

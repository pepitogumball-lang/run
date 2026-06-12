package m;

import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.SearchEvent;
import android.view.Window$Callback;

public abstract class m
{
    public static boolean a(final Window$Callback window$Callback, final SearchEvent searchEvent) {
        return window$Callback.onSearchRequested(searchEvent);
    }
    
    public static ActionMode b(final Window$Callback window$Callback, final ActionMode$Callback actionMode$Callback, final int n) {
        return window$Callback.onWindowStartingActionMode(actionMode$Callback, n);
    }
}

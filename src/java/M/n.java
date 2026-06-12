package m;

import android.view.Menu;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import android.view.Window$Callback;

public abstract class n
{
    public static void a(final Window$Callback window$Callback, final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        window$Callback.onProvideKeyboardShortcuts((List)list, menu, n);
    }
}

package E;

import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.content.Context;

public abstract class f
{
    public static Context a(final Context context, final String s) {
        return context.createAttributionContext(s);
    }
    
    public static String b(final Context context) {
        return context.getAttributionTag();
    }
    
    public static Display c(final Context context) {
        try {
            return context.getDisplay();
        }
        catch (final UnsupportedOperationException ex) {
            final StringBuilder sb = new StringBuilder("The context:");
            sb.append((Object)context);
            sb.append(" is not associated with any display. Return a fallback display instead.");
            Log.w("ContextCompat", sb.toString());
            return ((DisplayManager)context.getSystemService((Class)DisplayManager.class)).getDisplay(0);
        }
    }
}

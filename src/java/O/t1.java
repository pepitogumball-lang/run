package o;

import java.lang.reflect.AccessibleObject;
import java.util.WeakHashMap;
import O.V;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public abstract class t1
{
    public static final Method a;
    public static final boolean b;
    
    static {
        b = (Build$VERSION.SDK_INT >= 27);
        try {
            final Method method = a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (!((AccessibleObject)method).isAccessible()) {
                ((AccessibleObject)method).setAccessible(true);
            }
        }
        catch (final NoSuchMethodException ex) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
    
    public static boolean a(final View view) {
        final WeakHashMap a = V.a;
        final int layoutDirection = view.getLayoutDirection();
        boolean b = true;
        if (layoutDirection != 1) {
            b = false;
        }
        return b;
    }
}

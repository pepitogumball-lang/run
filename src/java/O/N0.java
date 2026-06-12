package o;

import java.lang.reflect.AccessibleObject;
import android.widget.AdapterView;
import android.view.View;
import android.widget.AbsListView;
import java.lang.reflect.Method;

public abstract class n0
{
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final boolean d;
    
    static {
        try {
            final Class type = Integer.TYPE;
            final Class type2 = Boolean.TYPE;
            final Class type3 = Float.TYPE;
            ((AccessibleObject)(a = AbsListView.class.getDeclaredMethod("positionSelector", type, View.class, type2, type3, type3))).setAccessible(true);
            ((AccessibleObject)(b = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", type))).setAccessible(true);
            ((AccessibleObject)(c = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", type))).setAccessible(true);
            d = true;
        }
        catch (final NoSuchMethodException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
}

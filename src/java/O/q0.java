package o;

import java.lang.reflect.AccessibleObject;
import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class q0
{
    public static final Field a;
    
    static {
        Field declaredField = null;
        try {
            final Field field = declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            ((AccessibleObject)field).setAccessible(true);
            declaredField = field;
        }
        catch (final NoSuchFieldException ex) {
            ((Throwable)ex).printStackTrace();
        }
        a = declaredField;
    }
}

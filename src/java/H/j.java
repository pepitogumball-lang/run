package H;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;

public final class j extends i
{
    @Override
    public final Typeface K(Object ex) {
        try {
            final Object instance = Array.newInstance(super.k, 1);
            Array.set(instance, 0, (Object)ex);
            ex = (InvocationTargetException)super.q.invoke((Object)null, new Object[] { instance, "sans-serif", -1, -1 });
            return (Typeface)ex;
        }
        catch (final InvocationTargetException ex) {}
        catch (final IllegalAccessException ex2) {}
        throw new RuntimeException((Throwable)ex);
    }
    
    @Override
    public final Method P(Class class1) {
        class1 = Array.newInstance((Class)class1, 1).getClass();
        final Class type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, String.class, type, type);
        ((AccessibleObject)declaredMethod).setAccessible(true);
        return declaredMethod;
    }
}

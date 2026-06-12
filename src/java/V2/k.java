package V2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import sun.misc.Unsafe;
import java.security.PrivilegedExceptionAction;

public final class k implements PrivilegedExceptionAction
{
    public static Unsafe a() {
        for (final Field field : Unsafe.class.getDeclaredFields()) {
            ((AccessibleObject)field).setAccessible(true);
            final Object value = field.get((Object)null);
            if (Unsafe.class.isInstance(value)) {
                return Unsafe.class.cast(value);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}

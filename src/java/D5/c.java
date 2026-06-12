package d5;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import n5.h;
import a.a;

public abstract class c extends a
{
    public static final void F(final int n, final int n2, final int n3, final Object[] array, final Object[] array2) {
        h.e("<this>", (Object)array);
        h.e("destination", (Object)array2);
        System.arraycopy((Object)array, n2, (Object)array2, n, n3 - n2);
    }
    
    public static Object G(final Object[] array) {
        h.e("<this>", (Object)array);
        if (array.length != 0) {
            return array[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
    
    public static List H(final Object[] array) {
        final int length = array.length;
        Object o;
        if (length != 0) {
            if (length != 1) {
                o = new ArrayList((Collection)new d5.a(array, false));
            }
            else {
                o = com.google.android.gms.internal.auth.h.t(array[0]);
            }
        }
        else {
            o = l.C;
        }
        return (List)o;
    }
}

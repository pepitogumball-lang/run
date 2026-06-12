package d5;

import java.util.Arrays;
import java.util.List;
import com.google.android.gms.internal.auth.h;

public abstract class e extends h
{
    public static List D(final Object... array) {
        n5.h.e("elements", (Object)array);
        Object o;
        if (array.length > 0) {
            o = Arrays.asList(array);
            n5.h.d("asList(...)", o);
        }
        else {
            o = l.C;
        }
        return (List)o;
    }
}

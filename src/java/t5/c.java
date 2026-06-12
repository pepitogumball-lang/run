package t5;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.android.gms.internal.auth.h;
import d5.l;
import java.util.List;

public abstract class c extends d
{
    public static List D(final b b) {
        final Iterator iterator = b.iterator();
        if (!iterator.hasNext()) {
            return (List)l.C;
        }
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return h.t(next);
        }
        final ArrayList list = new ArrayList();
        list.add(next);
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return (List)list;
    }
}

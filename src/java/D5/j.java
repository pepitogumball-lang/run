package d5;

import java.util.Iterator;
import java.util.Collection;
import n5.h;
import java.util.ArrayList;

public abstract class j extends i
{
    public static void F(final ArrayList list, final Iterable iterable) {
        n5.h.e("elements", (Object)iterable);
        if (iterable instanceof Collection) {
            list.addAll((Collection)iterable);
            return;
        }
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
    }
}

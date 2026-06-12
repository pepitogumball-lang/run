package d5;

import java.util.Collection;

public abstract class f extends e
{
    public static int E(final Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection)iterable).size();
        }
        else {
            size = 10;
        }
        return size;
    }
}

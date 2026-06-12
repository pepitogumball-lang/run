package c5;

import java.io.Serializable;

public abstract class e implements Serializable
{
    public static final Throwable a(final Object o) {
        Throwable c;
        if (o instanceof d) {
            c = ((d)o).C;
        }
        else {
            c = null;
        }
        return c;
    }
}

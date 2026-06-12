package B5;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import t5.c;
import t5.a;
import t5.e;
import n5.h;
import java.util.Arrays;
import x5.b;
import java.util.Collection;

public abstract class f
{
    public static final Collection a;
    
    static {
        try {
            final Iterator iterator = Arrays.asList((Object[])new b[] { new b() }).iterator();
            h.e("<this>", (Object)iterator);
            a = (Collection)c.D((t5.b)new a(new e(iterator)));
        }
        finally {
            final Throwable t;
            throw new ServiceConfigurationError(t.getMessage(), t);
        }
    }
}

package B5;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import x5.d;
import android.os.Looper;
import t5.b;
import t5.e;
import n5.h;
import java.util.Arrays;
import x5.a;
import x5.c;

public abstract class o
{
    public static final c a;
    
    static {
        final int a2 = x.a;
        final a a3 = null;
        String property;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        }
        catch (final SecurityException ex) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            final Iterator iterator = Arrays.asList((Object[])new a[] { (a)new Object() }).iterator();
            h.e("<this>", (Object)iterator);
            final Iterator iterator2 = ((Iterable)t5.c.D((b)new t5.a(new e(iterator)))).iterator();
            Object next;
            if (!iterator2.hasNext()) {
                next = a3;
            }
            else {
                next = iterator2.next();
                if (iterator2.hasNext()) {
                    int a4 = ((a)next).a();
                    a a5 = (a)next;
                    do {
                        final Object next2 = iterator2.next();
                        final int a6 = ((a)next2).a();
                        next = a5;
                        int n;
                        if ((n = a4) < a6) {
                            next = next2;
                            n = a6;
                        }
                        a5 = (a)next;
                        a4 = n;
                    } while (iterator2.hasNext());
                }
            }
            final a a7 = (a)next;
            if (a7 != null) {
                try {
                    a7.getClass();
                    final Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        a = new c(d.a(mainLooper));
                        return;
                    }
                    throw new IllegalStateException("The main looper is not available");
                }
                finally {
                    a7.getClass();
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        finally {
            final Throwable t;
            throw new ServiceConfigurationError(t.getMessage(), t);
        }
    }
}

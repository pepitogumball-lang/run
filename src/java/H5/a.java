package h5;

import n5.h;
import java.lang.reflect.Method;

public abstract class a
{
    public static final Method a;
    
    static {
        final Method[] methods = Throwable.class.getMethods();
        h.b((Object)methods);
        final int length = methods.length;
        final int n = 0;
        int n2 = 0;
        Method a2;
        while (true) {
            a2 = null;
            final Object o = null;
            if (n2 >= length) {
                break;
            }
            final Method method = methods[n2];
            if (h.a((Object)method.getName(), (Object)"addSuppressed")) {
                final Class[] parameterTypes = method.getParameterTypes();
                h.d("getParameterTypes(...)", (Object)parameterTypes);
                Object o2 = o;
                if (parameterTypes.length == 1) {
                    o2 = parameterTypes[0];
                }
                if (h.a(o2, (Object)Throwable.class)) {
                    a2 = method;
                    break;
                }
            }
            ++n2;
        }
        a = a2;
        for (int length2 = methods.length, n3 = n; n3 < length2 && !h.a((Object)methods[n3].getName(), (Object)"getSuppressed"); ++n3) {}
    }
}

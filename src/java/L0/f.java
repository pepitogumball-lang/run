package L0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import N0.c;
import N0.d;
import m5.a;
import n5.i;

public final class f extends i implements a
{
    public static final f D;
    
    static {
        D = (f)new i(0);
    }
    
    public final Object b() {
        final Object o = null;
        Object o3 = null;
        try {
            final ClassLoader classLoader = h.class.getClassLoader();
            e e;
            if (classLoader != null) {
                e = new e(classLoader, new b1.f((Object)classLoader, 15));
            }
            else {
                e = null;
            }
            if (e != null) {
                final WindowLayoutComponent a = e.a();
                if (a != null) {
                    n5.h.d("loader", (Object)classLoader);
                    final b1.f f = new b1.f((Object)classLoader, 15);
                    final int a2 = I0.e.a();
                    if (a2 >= 2) {
                        final d d = new d(a);
                    }
                    else if (a2 == 1) {
                        final c c = new c(a, f);
                    }
                    else {
                        final Object o2 = new Object();
                    }
                }
            }
        }
        finally {
            final g a3 = g.a;
            o3 = o;
        }
        return o3;
    }
}

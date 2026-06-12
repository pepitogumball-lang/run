package n5;

import com.google.android.gms.internal.measurement.L;
import m5.q;
import m5.p;
import m5.l;
import c5.a;

public abstract class r
{
    public static void a(final int n, final Object o) {
        if (o != null && !b(n, o)) {
            final StringBuilder sb = new StringBuilder("kotlin.jvm.functions.Function");
            sb.append(n);
            c(sb.toString(), o);
            throw null;
        }
    }
    
    public static boolean b(final int n, final Object o) {
        final boolean b = o instanceof a;
        boolean b2 = false;
        if (b) {
            int c;
            if (o instanceof f) {
                c = ((f)o).c();
            }
            else if (o instanceof m5.a) {
                c = 0;
            }
            else if (o instanceof l) {
                c = 1;
            }
            else if (o instanceof p) {
                c = 2;
            }
            else if (o instanceof q) {
                c = 3;
            }
            else {
                c = -1;
            }
            b2 = b2;
            if (c == n) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static void c(final String s, final Object o) {
        String name;
        if (o == null) {
            name = "null";
        }
        else {
            name = o.getClass().getName();
        }
        final ClassCastException ex = new ClassCastException(L.j(name, " cannot be cast to ", s));
        h.f((RuntimeException)ex, r.class.getName());
        throw ex;
    }
}

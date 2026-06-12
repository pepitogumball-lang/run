package x1;

import com.google.android.gms.internal.measurement.L;
import java.util.Iterator;
import k1.d;
import java.util.HashMap;
import android.util.SparseArray;

public abstract class a
{
    public static final SparseArray a;
    public static final HashMap b;
    
    static {
        a = new SparseArray();
        final HashMap b2 = new HashMap();
        (b = b2).put((Object)d.C, (Object)0);
        b2.put((Object)d.D, (Object)1);
        b2.put((Object)d.E, (Object)2);
        for (final d d : b2.keySet()) {
            x1.a.a.append((int)x1.a.b.get((Object)d), (Object)d);
        }
    }
    
    public static int a(final d d) {
        final Integer n = (Integer)x1.a.b.get((Object)d);
        if (n != null) {
            return n;
        }
        final StringBuilder sb = new StringBuilder("PriorityMapping is missing known Priority value ");
        sb.append((Object)d);
        throw new IllegalStateException(sb.toString());
    }
    
    public static d b(final int n) {
        final d d = (d)x1.a.a.get(n);
        if (d != null) {
            return d;
        }
        throw new IllegalArgumentException(L.h(n, "Unknown Priority for value "));
    }
}

package S0;

import u0.l;
import java.util.Iterator;
import java.util.ArrayList;
import C2.z;
import a1.i;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import R0.b;
import R0.m;

public abstract class d
{
    public static final String a;
    
    static {
        a = m.h("Schedulers");
    }
    
    public static void a(final b b, final WorkDatabase workDatabase, final List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        final z n = workDatabase.n();
        ((l)workDatabase).c();
        Label_0249: {
            ArrayList c;
            try {
                c = n.c(b.h);
                n.a();
                if (c.size() > 0) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    final Iterator iterator = c.iterator();
                    while (iterator.hasNext()) {
                        n.m(((i)iterator.next()).a, currentTimeMillis);
                    }
                }
            }
            finally {
                break Label_0249;
            }
            ((l)workDatabase).h();
            ((l)workDatabase).f();
            if (c.size() > 0) {
                final i[] array = (i[])c.toArray((Object[])new i[c.size()]);
                for (final c c2 : list) {
                    if (c2.f()) {
                        c2.d(array);
                    }
                }
            }
            final ArrayList list2;
            if (list2.size() > 0) {
                final i[] array2 = (i[])list2.toArray((Object[])new i[list2.size()]);
                for (final c c3 : list) {
                    if (!c3.f()) {
                        c3.d(array2);
                    }
                }
            }
            return;
        }
        ((l)workDatabase).f();
    }
}

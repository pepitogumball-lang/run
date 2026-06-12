package b4;

import w2.e;
import java.util.Iterator;
import java.util.Random;
import c4.o;
import java.util.concurrent.atomic.AtomicReference;
import g2.b;

public final class l implements b
{
    public static final AtomicReference a;
    
    static {
        a = new AtomicReference();
    }
    
    @Override
    public final void a(final boolean e) {
        final Random j = m.j;
        final Class<m> clazz;
        monitorenter(clazz = m.class);
        Label_0090: {
            try {
                final Iterator iterator = m.k.values().iterator();
                while (iterator.hasNext()) {
                    final e i = ((d)iterator.next()).j;
                    final e e2;
                    monitorenter(e2 = i);
                    Label_0075: {
                        try {
                            if (!(((o)i.F).e = e)) {
                                i.u();
                            }
                            break Label_0075;
                        }
                        finally {
                            monitorexit(e2);
                            monitorexit(e2);
                        }
                    }
                }
                break Label_0090;
            }
            finally {
                monitorexit(clazz);
                monitorexit(clazz);
            }
        }
    }
}

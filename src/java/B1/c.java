package b1;

import java.util.AbstractCollection;
import R0.o;
import R0.r;
import java.util.Iterator;
import C2.z;
import androidx.work.impl.WorkDatabase;
import S0.l;
import S0.b;
import R0.m;
import java.util.Collection;
import java.util.LinkedList;
import S0.k;
import com.google.android.gms.internal.measurement.K1;

public abstract class c implements Runnable
{
    public final K1 C;
    
    public c() {
        this.C = new K1(17);
    }
    
    public static void a(final k k, final String s) {
        final WorkDatabase f = k.f;
        final z n = f.n();
        final com.google.android.gms.internal.auth.l i = f.i();
        final LinkedList list = new LinkedList();
        list.add((Object)s);
        while (!((AbstractCollection)list).isEmpty()) {
            final String s2 = (String)list.remove();
            final int g = n.g(s2);
            if (g != 3 && g != 4) {
                n.q(6, new String[] { s2 });
            }
            list.addAll((Collection)i.n(s2));
        }
        final b j = k.i;
        final Object m;
        monitorenter(m = j.M);
        Label_0228: {
            try {
                final m e = R0.m.e();
                final String n2 = b.N;
                final StringBuilder sb = new StringBuilder("Processor cancelling ");
                sb.append(s);
                final String string = sb.toString();
                boolean b = false;
                e.c(n2, string, new Throwable[0]);
                j.K.add((Object)s);
                final l l = (l)j.H.remove((Object)s);
                if (l != null) {
                    b = true;
                }
                l l2;
                if ((l2 = l) == null) {
                    l2 = (l)j.I.remove((Object)s);
                }
                break Label_0228;
            }
            finally {
                monitorexit(m);
            Label_0256:
                while (true) {
                    Iterator iterator = null;
                Block_10:
                    while (true) {
                        monitorexit(m);
                        iterator = k.h.iterator();
                        break Label_0256;
                        final l l2;
                        b.c(s, l2);
                        final boolean b;
                        iftrue(Label_0243:)(!b);
                        Block_9: {
                            break Block_9;
                            iftrue(Label_0283:)(!iterator.hasNext());
                            break Block_10;
                        }
                        j.h();
                        continue;
                    }
                    ((S0.c)iterator.next()).b(s);
                    continue Label_0256;
                }
                Label_0283:;
            }
        }
    }
    
    public abstract void b();
    
    public final void run() {
        final K1 c = this.C;
        try {
            this.b();
            c.B((com.google.android.gms.internal.auth.m)r.d);
        }
        finally {
            final Throwable t;
            c.B((com.google.android.gms.internal.auth.m)new o(t));
        }
    }
}

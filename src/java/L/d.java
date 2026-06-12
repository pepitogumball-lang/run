package L;

import t.j;
import com.google.android.gms.internal.auth.l;
import java.util.ArrayList;
import N.a;

public final class d implements a
{
    public final int a;
    public final Object b;
    
    @Override
    public final void accept(Object c) {
        switch (this.a) {
            default: {
                final e e = (e)c;
                c = f.c;
                final Object o;
                monitorenter(o = c);
                Label_0075: {
                    try {
                        final j d = f.d;
                        final ArrayList list = (ArrayList)d.getOrDefault((Object)this.b, (Object)null);
                        if (list == null) {
                            monitorexit(o);
                            return;
                        }
                        break Label_0075;
                    }
                    finally {
                        monitorexit(o);
                        while (true) {
                            final ArrayList list;
                            int n = 0;
                            iftrue(Label_0123:)(n >= list.size());
                            Block_6: {
                                break Block_6;
                                final j d;
                                d.remove((Object)this.b);
                                monitorexit(o);
                                n = 0;
                                continue;
                                Label_0123: {
                                    return;
                                }
                            }
                            ((a)list.get(n)).accept(e);
                            ++n;
                            continue;
                        }
                    }
                }
            }
            case 0: {
                e e2;
                if ((e2 = (e)c) == null) {
                    e2 = new e(-3);
                }
                ((l)this.b).q(e2);
            }
        }
    }
}

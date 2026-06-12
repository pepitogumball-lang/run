package b1;

import u0.l;
import java.util.Iterator;
import androidx.work.impl.WorkDatabase;
import S0.d;
import S0.k;

public final class b extends c
{
    public final int D;
    public final k E;
    
    @Override
    public final void b() {
        switch (this.D) {
            default: {
                final k e = this.E;
                final WorkDatabase f = e.f;
                ((l)f).c();
                Label_0087: {
                    try {
                        final Iterator iterator = f.n().h().iterator();
                        while (iterator.hasNext()) {
                            c.a(e, (String)iterator.next());
                        }
                    }
                    finally {
                        break Label_0087;
                    }
                    ((l)f).h();
                    ((l)f).f();
                    return;
                }
                ((l)f).f();
                break;
            }
            case 0: {
                final k e2 = this.E;
                final WorkDatabase f2 = e2.f;
                ((l)f2).c();
                Label_0171: {
                    try {
                        final Iterator iterator2 = f2.n().i().iterator();
                        while (iterator2.hasNext()) {
                            c.a(e2, (String)iterator2.next());
                        }
                    }
                    finally {
                        break Label_0171;
                    }
                    ((l)f2).h();
                    ((l)f2).f();
                    d.a(e2.e, e2.f, e2.h);
                    return;
                }
                ((l)f2).f();
                break;
            }
        }
    }
}

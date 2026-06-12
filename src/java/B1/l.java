package b1;

import java.util.UUID;
import android.content.Context;
import androidx.work.ListenableWorker;
import a1.i;
import V2.q;
import C2.f0;
import R0.g;
import c1.j;

public final class l implements Runnable
{
    public final int C;
    public final j D;
    public final m E;
    
    public final void run() {
        switch (this.C) {
            default: {
                final m e = this.E;
                Label_0242: {
                    try {
                        final g g = (g)this.D.get();
                        if (g != null) {
                            final R0.m e2 = R0.m.e();
                            final String i = m.I;
                            final i e3 = e.E;
                            final ListenableWorker f = e.F;
                            final String c = e3.c;
                            final StringBuilder sb = new StringBuilder("Updating notification for ");
                            sb.append(c);
                            e2.c(i, sb.toString(), new Throwable[0]);
                            f.setRunInForeground(true);
                            final j c2 = e.C;
                            final n g2 = e.G;
                            final Context d = e.D;
                            final UUID id = f.getId();
                            g2.getClass();
                            final Object o = new Object();
                            g2.a.m((Runnable)new f0((Object)g2, o, (Object)id, (Object)g, (Object)d, 3, false));
                            c2.m((q)o);
                            return;
                        }
                    }
                    finally {
                        break Label_0242;
                    }
                    final String c3 = e.E.c;
                    final StringBuilder sb2 = new StringBuilder("Worker was marked important (");
                    sb2.append(c3);
                    sb2.append(") but did not provide ForegroundInfo");
                    throw new IllegalStateException(sb2.toString());
                }
                final Throwable t;
                e.C.l(t);
                return;
            }
            case 0: {
                this.D.m(this.E.F.getForegroundInfoAsync());
            }
        }
    }
}

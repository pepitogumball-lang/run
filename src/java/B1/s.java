package b1;

import java.util.concurrent.TimeUnit;
import U0.e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import R0.m;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

public final class s
{
    public static final String e;
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;
    
    static {
        e = m.h("WorkTimer");
    }
    
    public s() {
        final p p = new p(0);
        p.b = 0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor((ThreadFactory)p);
    }
    
    public final void a(final String s, final e e) {
        final Object d = this.d;
        synchronized (d) {
            final m e2 = m.e();
            final String e3 = s.e;
            final StringBuilder sb = new StringBuilder("Starting timer for ");
            sb.append(s);
            e2.c(e3, sb.toString(), new Throwable[0]);
            this.b(s);
            final r r = new r(this, s);
            this.b.put((Object)s, (Object)r);
            this.c.put((Object)s, (Object)e);
            this.a.schedule((Runnable)r, 600000L, TimeUnit.MILLISECONDS);
        }
    }
    
    public final void b(final String s) {
        final Object d;
        monitorenter(d = this.d);
        Label_0083: {
            try {
                if (this.b.remove((Object)s) != null) {
                    final m e = m.e();
                    final String e2 = s.e;
                    final StringBuilder sb = new StringBuilder("Stopping timer for ");
                    sb.append(s);
                    e.c(e2, sb.toString(), new Throwable[0]);
                    this.c.remove((Object)s);
                }
                break Label_0083;
            }
            finally {
                monitorexit(d);
                monitorexit(d);
            }
        }
    }
}

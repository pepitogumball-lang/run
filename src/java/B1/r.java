package b1;

import R0.m;
import U0.e;

public final class r implements Runnable
{
    public final s C;
    public final String D;
    
    public r(final s c, final String d) {
        this.C = c;
        this.D = d;
    }
    
    public final void run() {
        final Object d;
        monitorenter(d = this.C.d);
        Label_0170: {
            try {
                if (this.C.b.remove((Object)this.D) == null) {
                    break Label_0170;
                }
                final q q = (q)this.C.c.remove((Object)this.D);
                if (q != null) {
                    final String d2 = this.D;
                    final e e = (e)q;
                    final m e2 = m.e();
                    final StringBuilder sb = new StringBuilder("Exceeded time limits on execution for ");
                    sb.append(d2);
                    e2.c(U0.e.L, sb.toString(), new Throwable[0]);
                    e.f();
                }
                break Label_0170;
            }
            finally {
                monitorexit(d);
                final m e3 = m.e();
                final String d3 = this.D;
                final StringBuilder sb2 = new StringBuilder("Timer with ");
                sb2.append(d3);
                sb2.append(" is already marked as complete.");
                e3.c("WrkTimerRunnable", sb2.toString(), new Throwable[0]);
                monitorexit(d);
            }
        }
    }
}

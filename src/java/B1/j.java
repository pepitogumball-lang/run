package b1;

import u0.l;
import java.util.HashMap;
import C2.z;
import S0.b;
import androidx.work.impl.WorkDatabase;
import R0.m;
import S0.k;

public final class j implements Runnable
{
    public static final String F;
    public final k C;
    public final String D;
    public final boolean E;
    
    static {
        F = m.h("StopWorkRunnable");
    }
    
    public j(final k c, final String d, final boolean e) {
        this.C = c;
        this.D = d;
        this.E = e;
    }
    
    public final void run() {
        final k c = this.C;
        final WorkDatabase f = c.f;
        final b i = c.i;
        final z n = f.n();
        ((l)f).c();
        Object o = null;
        Label_0086: {
            String d;
            Object o2;
            try {
                d = this.D;
                o = i.M;
                monitorenter(o2 = o);
                final b b = i;
                final HashMap hashMap = b.H;
                final String s = d;
                final boolean b2 = hashMap.containsKey((Object)s);
                final Object o3 = o2;
                monitorexit(o3);
                final j j = this;
                final boolean b3 = j.E;
                if (b3) {
                    final j k = this;
                    final k l = k.C;
                    final b b4 = l.i;
                    final j m = this;
                    final String s2 = m.D;
                    final boolean b5 = b4.i(s2);
                    break Label_0086;
                }
                break Label_0086;
            }
            finally {
                final Object o4;
                o = o4;
                break Label_0086;
            }
            try {
                final b b = i;
                final HashMap hashMap = b.H;
                final String s = d;
                final boolean b2 = hashMap.containsKey((Object)s);
                final Object o3 = o2;
                monitorexit(o3);
                final j j = this;
                final boolean b3 = j.E;
                boolean b5;
                if (b3) {
                    final j k = this;
                    final k l = k.C;
                    final b b4 = l.i;
                    final j m = this;
                    final String s2 = m.D;
                    b5 = b4.i(s2);
                }
                else {
                    if (!b2 && n.g(this.D) == 2) {
                        n.q(1, new String[] { this.D });
                    }
                    b5 = this.C.i.j(this.D);
                }
                o = m.e();
                final String f2 = b1.j.F;
                final String d2 = this.D;
                final StringBuilder sb = new StringBuilder("StopWorkRunnable for ");
                sb.append(d2);
                sb.append("; Processor.stopWork = ");
                sb.append(b5);
                ((m)o).c(f2, sb.toString(), new Throwable[0]);
                ((l)f).h();
                ((l)f).f();
                return;
            }
            finally {
                monitorexit(o2);
            }
        }
        ((l)f).f();
        throw o;
    }
}

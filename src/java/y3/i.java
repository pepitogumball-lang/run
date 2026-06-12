package Y3;

import S3.d;
import com.google.firebase.perf.metrics.Trace;
import R3.a;

public abstract class i
{
    public static final a a;
    
    static {
        a = R3.a.d();
    }
    
    public static void a(final Trace trace, final d d) {
        final int a = d.a;
        if (a > 0) {
            trace.putMetric("_fr_tot", (long)a);
        }
        final int b = d.b;
        if (b > 0) {
            trace.putMetric("_fr_slo", (long)b);
        }
        final int c = d.c;
        if (c > 0) {
            trace.putMetric("_fr_fzn", (long)c);
        }
        final StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(trace.F);
        sb.append(" _fr_tot:");
        sb.append(d.a);
        sb.append(" _fr_slo:");
        sb.append(b);
        sb.append(" _fr_fzn:");
        sb.append(c);
        i.a.a(sb.toString());
    }
}

package O2;

import java.util.concurrent.ExecutionException;

public final class m implements f, e, c
{
    public final Object C;
    public final int D;
    public final t E;
    public int F;
    public int G;
    public int H;
    public Exception I;
    public boolean J;
    
    public m(final int d, final t e) {
        this.C = new Object();
        this.D = d;
        this.E = e;
    }
    
    public final void a() {
        final int f = this.F;
        final int g = this.G;
        final int h = this.H;
        final int d = this.D;
        if (f + g + h == d) {
            final Exception i = this.I;
            final t e = this.E;
            if (i != null) {
                final int g2 = this.G;
                final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + (String.valueOf(g2).length() + 8) + 24);
                sb.append(g2);
                sb.append(" out of ");
                sb.append(d);
                sb.append(" underlying tasks failed");
                e.q((Exception)new ExecutionException(sb.toString(), (Throwable)this.I));
                return;
            }
            if (this.J) {
                e.r();
                return;
            }
            e.o(null);
        }
    }
    
    public final void b() {
        final Object c = this.C;
        synchronized (c) {
            ++this.H;
            this.J = true;
            this.a();
        }
    }
    
    public final void e(final Object o) {
        final Object c = this.C;
        synchronized (c) {
            ++this.F;
            this.a();
        }
    }
    
    public final void f(final Exception i) {
        final Object c = this.C;
        synchronized (c) {
            ++this.G;
            this.I = i;
            this.a();
        }
    }
}

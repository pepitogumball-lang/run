package O2;

import V2.o;
import java.util.concurrent.Executor;

public final class n implements q, f, e, c
{
    public final int C;
    public final Executor D;
    public final a E;
    public final t F;
    
    @Override
    public final void a(final i i) {
        switch (this.C) {
            default: {
                this.D.execute((Runnable)new o(this, i, (byte)0));
                return;
            }
            case 0: {
                this.D.execute((Runnable)new o(this, i));
            }
        }
    }
    
    public void b() {
        this.F.r();
    }
    
    public void e(final Object o) {
        this.F.o(o);
    }
    
    public void f(final Exception ex) {
        this.F.q(ex);
    }
}

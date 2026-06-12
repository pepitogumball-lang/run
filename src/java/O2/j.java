package O2;

import h2.A;
import java.util.concurrent.Executor;
import C2.f;

public final class j
{
    public final t a;
    
    public j() {
        this.a = new t();
    }
    
    public j(final f f) {
        this.a = new t();
        final b1.f f2 = new b1.f(this);
        f.getClass();
        ((t)f.D).d((Executor)k.a, (O2.f)new b1.f(f, f2));
    }
    
    public final void a(final Exception ex) {
        this.a.q(ex);
    }
    
    public final void b(final Object o) {
        this.a.o(o);
    }
    
    public final boolean c(final Exception f) {
        final t a = this.a;
        a.getClass();
        A.i("Exception must not be null", (Object)f);
        final Object a2;
        monitorenter(a2 = a.a);
        Label_0049: {
            try {
                if (a.c) {
                    monitorexit(a2);
                    return false;
                }
                break Label_0049;
            }
            finally {
                monitorexit(a2);
                a.c = true;
                a.f = f;
                monitorexit(a2);
                a.b.d(a);
                return true;
            }
        }
    }
    
    public final void d(final Object o) {
        this.a.p(o);
    }
}

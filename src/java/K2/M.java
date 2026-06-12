package K2;

import android.os.Handler;
import h2.A;
import V2.o;
import A2.b;

public abstract class m
{
    public static volatile b d;
    public final w0 a;
    public final o b;
    public volatile long c;
    
    public m(final w0 a) {
        A.h((Object)a);
        this.a = a;
        this.b = new o(11, (Object)this, (Object)a, false);
    }
    
    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks((Runnable)this.b);
    }
    
    public final void b(final long n) {
        this.a();
        if (n >= 0L) {
            this.a.d().getClass();
            this.c = System.currentTimeMillis();
            if (!this.d().postDelayed((Runnable)this.b, n)) {
                this.a.j().H.g("Failed to schedule delayed post. time", n);
            }
        }
    }
    
    public abstract void c();
    
    public final Handler d() {
        if (m.d != null) {
            return (Handler)m.d;
        }
        final Class<m> clazz;
        monitorenter(clazz = m.class);
        Label_0053: {
            try {
                if (m.d == null) {
                    m.d = new b(this.a.a().getMainLooper(), 4);
                }
                break Label_0053;
            }
            finally {
                monitorexit(clazz);
                final b d = m.d;
                monitorexit(clazz);
                return (Handler)d;
            }
        }
    }
}

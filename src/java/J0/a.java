package j0;

import android.os.Looper;
import E1.m;
import c2.d;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;

public final class a implements Runnable
{
    public static Handler H;
    public final b C;
    public volatile int D;
    public final AtomicBoolean E;
    public final AtomicBoolean F;
    public final d G;
    
    public a(final d g) {
        this.G = g;
        this.D = 1;
        this.E = new AtomicBoolean();
        this.F = new AtomicBoolean();
        this.C = new b(this, new m((Object)this, 6));
    }
    
    public final void a(final Object o) {
        final Class<a> clazz;
        monitorenter(clazz = a.class);
        Label_0033: {
            try {
                if (a.H == null) {
                    a.H = new Handler(Looper.getMainLooper());
                }
                break Label_0033;
            }
            finally {
                monitorexit(clazz);
                final Handler h = a.H;
                monitorexit(clazz);
                h.post((Runnable)new c(this, 0, o));
            }
        }
    }
    
    public final void run() {
        this.G.b();
    }
}

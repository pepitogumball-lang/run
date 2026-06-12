package K2;

import java.util.Queue;
import android.os.Process;
import com.google.android.gms.internal.measurement.L;
import h2.A;
import java.util.concurrent.BlockingQueue;
import java.util.AbstractQueue;

public final class o0 extends Thread
{
    public final Object C;
    public final AbstractQueue D;
    public boolean E;
    public final k0 F;
    
    public o0(final k0 f, final String name, final BlockingQueue blockingQueue) {
        this.F = f;
        this.E = false;
        A.h((Object)blockingQueue);
        this.C = new Object();
        this.D = (AbstractQueue)blockingQueue;
        this.setName(name);
    }
    
    public final void a(final InterruptedException ex) {
        this.F.j().K.g(L.i(this.getName(), " was interrupted"), ex);
    }
    
    public final void b() {
        final Object k;
        monitorenter(k = this.F.K);
        Label_0100: {
            try {
                if (!this.E) {
                    this.F.L.release();
                    this.F.K.notifyAll();
                    final k0 f = this.F;
                    if (this == f.E) {
                        f.E = null;
                    }
                    else if (this == f.F) {
                        f.F = null;
                    }
                    else {
                        f.j().H.f("Current scheduler thread is neither worker nor network");
                    }
                    this.E = true;
                }
                break Label_0100;
            }
            finally {
                monitorexit(k);
                monitorexit(k);
            }
        }
    }
    
    public final void run() {
        int i = 0;
        while (i == 0) {
            try {
                this.F.L.acquire();
                i = 1;
            }
            catch (final InterruptedException ex) {
                this.a(ex);
            }
        }
    Label_0140_Outer:
        while (true) {
        Label_0140:
            while (true) {
                while (true) {
                    try {
                        final int threadPriority = Process.getThreadPriority(Process.myTid());
                        while (true) {
                            final l0 l0 = (l0)((Queue)this.D).poll();
                            if (l0 == null) {
                                break;
                            }
                            int threadPriority2;
                            if (l0.D) {
                                threadPriority2 = threadPriority;
                            }
                            else {
                                threadPriority2 = 10;
                            }
                            Process.setThreadPriority(threadPriority2);
                            l0.run();
                        }
                    }
                    finally {
                        break;
                    }
                    final Object c;
                    monitorenter(c = this.C);
                    try {
                        if (((Queue)this.D).peek() == null) {
                            this.F.getClass();
                            final o0 o0 = this;
                            final Object o2 = o0.C;
                            final long n = 30000L;
                            o2.wait(n);
                        }
                        break Label_0140;
                    }
                    finally {
                        monitorexit(c);
                        monitorexit(c);
                        final Object k;
                        monitorenter(k = this.F.K);
                        Label_0185: {
                            try {
                                if (((Queue)this.D).peek() == null) {
                                    this.b();
                                    monitorexit(k);
                                    this.b();
                                    return;
                                }
                                break Label_0185;
                            }
                            finally {
                                monitorexit(k);
                                monitorexit(k);
                                continue Label_0140_Outer;
                            }
                        }
                    }
                    break;
                }
                try {
                    final o0 o0 = this;
                    final Object o2 = o0.C;
                    final long n = 30000L;
                    o2.wait(n);
                    continue Label_0140;
                }
                catch (final InterruptedException ex2) {}
                break;
            }
            break;
        }
        this.b();
    }
}

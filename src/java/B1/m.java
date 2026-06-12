package b1;

import c1.h;
import java.util.concurrent.Executor;
import K2.N0;
import K.b;
import c2.k;
import androidx.work.ListenableWorker;
import a1.i;
import android.content.Context;
import c1.j;

public final class m implements Runnable
{
    public static final String I;
    public final j C;
    public final Context D;
    public final i E;
    public final ListenableWorker F;
    public final n G;
    public final k H;
    
    static {
        I = R0.m.h("WorkForegroundRunnable");
    }
    
    public m(final Context d, final i e, final ListenableWorker f, final n g, final k h) {
        this.C = (j)new Object();
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
    }
    
    public final void run() {
        if (this.E.q && !b.b()) {
            final Object o = new Object();
            final k h = this.H;
            ((N0)h.F).execute((Runnable)new l(this, (j)o, 0));
            ((h)o).a((Runnable)new l(this, (j)o, 1), (Executor)h.F);
            return;
        }
        this.C.k(null);
    }
}

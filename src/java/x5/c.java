package x5;

import D5.d;
import com.google.android.gms.internal.measurement.L;
import B5.o;
import android.os.Looper;
import w5.C;
import e5.h;
import w5.t;
import w5.Q;
import java.util.concurrent.CancellationException;
import e5.i;
import android.os.Handler;
import w5.z;
import w5.s;

public final class c extends s implements z
{
    public final Handler E;
    public final String F;
    public final boolean G;
    public final c H;
    private volatile c _immediate;
    
    public c(final Handler handler) {
        this(handler, null, false);
    }
    
    public c(final Handler e, final String f, final boolean g) {
        this.E = e;
        this.F = f;
        this.G = g;
        c immediate;
        if (g) {
            immediate = this;
        }
        else {
            immediate = null;
        }
        this._immediate = immediate;
        c immediate2;
        if ((immediate2 = this._immediate) == null) {
            immediate2 = new c(e, f, true);
            this._immediate = immediate2;
        }
        this.H = immediate2;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof c && ((c)o).E == this.E;
    }
    
    public final void g(final i i, final Runnable runnable) {
        if (!this.E.post(runnable)) {
            final StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
            sb.append((Object)this);
            sb.append("' was closed");
            final CancellationException ex = new CancellationException(sb.toString());
            final Q q = (Q)i.i((h)t.D);
            if (q != null) {
                q.b(ex);
            }
            C.b.g(i, runnable);
        }
    }
    
    public final boolean h() {
        return !this.G || !n5.h.a((Object)Looper.myLooper(), (Object)this.E.getLooper());
    }
    
    public final int hashCode() {
        return System.identityHashCode((Object)this.E);
    }
    
    public final String toString() {
        final d a = C.a;
        final c a2 = o.a;
        String s;
        if (this == a2) {
            s = "Dispatchers.Main";
        }
        else {
            c h;
            try {
                h = a2.H;
            }
            catch (final UnsupportedOperationException ex) {
                h = null;
            }
            if (this == h) {
                s = "Dispatchers.Main.immediate";
            }
            else {
                s = null;
            }
        }
        String i = s;
        if (s == null) {
            String s2;
            if ((s2 = this.F) == null) {
                s2 = this.E.toString();
            }
            i = s2;
            if (this.G) {
                i = L.i(s2, ".immediate");
            }
        }
        return i;
    }
}

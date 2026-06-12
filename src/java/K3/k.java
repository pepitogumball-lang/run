package k3;

import q3.c;
import O2.t;
import O2.h;
import java.util.concurrent.Executor;
import f2.d;
import java.util.concurrent.atomic.AtomicReference;
import O2.j;
import java.io.IOException;
import java.io.File;
import n3.u0;
import android.util.Log;
import C2.z;
import java.util.concurrent.Callable;

public final class k implements Callable
{
    public final long a;
    public final Throwable b;
    public final Thread c;
    public final z d;
    public final boolean e;
    public final m f;
    
    public k(final m f, final long a, final Throwable b, final Thread c, final z d, final boolean e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final Object call() {
        final long a = this.a;
        final long n = a / 1000L;
        final m f = this.f;
        final String e = f.e();
        t t;
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", (Throwable)null);
            t = u0.m((Object)null);
        }
        else {
            f.c.e();
            final c m = f.m;
            m.getClass();
            final String concat = "Persisting fatal event for session ".concat(e);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, (Throwable)null);
            }
            m.g(this.b, this.c, e, "crash", n, true);
            try {
                final c g = f.g;
                final StringBuilder sb = new StringBuilder(".ae");
                sb.append(a);
                final String string = sb.toString();
                g.getClass();
                if (!new File((File)g.F, string).createNewFile()) {
                    throw new IOException("Create new file failed.");
                }
            }
            catch (final IOException ex) {
                Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", (Throwable)ex);
            }
            final z d = this.d;
            f.b(false, d, false);
            f.c(new e().a, this.e);
            if (!f.b.f()) {
                t = u0.m((Object)null);
            }
            else {
                t = ((j)((AtomicReference)d.i).get()).a.n((Executor)f.e.a, (h)new d((Object)this, 6, (Object)e));
            }
        }
        return t;
    }
}

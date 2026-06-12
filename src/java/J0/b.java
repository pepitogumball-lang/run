package j0;

import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Callable;
import E1.m;
import java.util.concurrent.FutureTask;

public final class b extends FutureTask
{
    public final a C;
    
    public b(final a c, final m m) {
        this.C = c;
        super((Callable)m);
    }
    
    public final void done() {
        final a c = this.C;
        try {
            final Object value = this.get();
            if (!c.F.get()) {
                c.a(value);
            }
        }
        catch (final CancellationException ex) {
            if (!c.F.get()) {
                c.a(null);
            }
        }
        catch (final ExecutionException ex2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", ((Throwable)ex2).getCause());
        }
        catch (final InterruptedException ex3) {
            Log.w("AsyncTask", (Throwable)ex3);
        }
        finally {
            final Throwable t;
            throw new RuntimeException("An error occurred while executing doInBackground()", t);
        }
    }
}

package k3;

import java.util.Locale;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

public final class x extends c
{
    public final ExecutorService C;
    public final TimeUnit D;
    
    public x(final ExecutorService c, final TimeUnit d) {
        this.C = c;
        this.D = d;
    }
    
    @Override
    public final void a() {
        final ExecutorService c = this.C;
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", (Throwable)null);
            }
            c.shutdown();
            if (!c.awaitTermination(2L, this.D)) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", (Throwable)null);
                }
                c.shutdownNow();
            }
        }
        catch (final InterruptedException ex) {
            final Locale us = Locale.US;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", (Throwable)null);
            }
            c.shutdownNow();
        }
    }
}

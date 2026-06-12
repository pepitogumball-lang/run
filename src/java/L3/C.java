package l3;

import android.util.Log;
import u5.i;
import n3.u0;
import n5.h;
import java.util.concurrent.ExecutorService;

public final class c
{
    public final b a;
    public final b b;
    public final b c;
    
    public c(final ExecutorService executorService, final ExecutorService executorService2) {
        h.e("backgroundExecutorService", (Object)executorService);
        h.e("blockingExecutorService", (Object)executorService2);
        this.a = new b(executorService);
        this.b = new b(executorService);
        u0.m((Object)null);
        this.c = new b(executorService2);
    }
    
    public static final void a() {
        final String name = Thread.currentThread().getName();
        h.d("threadName", (Object)name);
        if (!i.Q(name, "Firebase Background Thread #")) {
            final StringBuilder sb = new StringBuilder("Must be called on a background thread, was called on ");
            sb.append(Thread.currentThread().getName());
            sb.append('.');
            final String string = sb.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, (Throwable)null);
            }
        }
    }
    
    public static final void b() {
        final String name = Thread.currentThread().getName();
        h.d("threadName", (Object)name);
        if (!i.Q(name, "Firebase Blocking Thread #")) {
            final StringBuilder sb = new StringBuilder("Must be called on a blocking thread, was called on ");
            sb.append(Thread.currentThread().getName());
            sb.append('.');
            final String string = sb.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, (Throwable)null);
            }
        }
    }
}

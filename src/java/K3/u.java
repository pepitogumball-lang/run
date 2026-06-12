package k3;

import h3.c;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import h3.a;
import C2.z;
import V4.G;

public final class u implements Thread$UncaughtExceptionHandler
{
    public final G a;
    public final z b;
    public final Thread$UncaughtExceptionHandler c;
    public final a d;
    public final AtomicBoolean e;
    
    public u(final G a, final z b, final Thread$UncaughtExceptionHandler c, final a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = new AtomicBoolean(false);
        this.d = d;
    }
    
    public final boolean a(final Thread thread, final Throwable t) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", (Throwable)null);
            return false;
        }
        if (t == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", (Throwable)null);
            return false;
        }
        if (this.d.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", (Throwable)null);
            }
            return false;
        }
        return true;
    }
    
    public final void uncaughtException(final Thread thread, final Throwable t) {
        final Thread$UncaughtExceptionHandler c = this.c;
        final AtomicBoolean e = this.e;
        e.set(true);
        try {
            final Throwable t2;
            c a = null;
            Label_0141_Outer:Block_11_Outer:Label_0137_Outer:
            while (true) {
                Label_0066: {
                    try {
                        if (this.a(thread, t)) {
                            ((m)this.a.D).g(this.b, thread, t, false);
                            break Label_0084;
                        }
                        break Label_0066;
                    }
                    finally {
                        if (c != null) {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable)null);
                            }
                            c.uncaughtException(thread, t);
                        }
                        else {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", (Throwable)null);
                            }
                            System.exit(1);
                        }
                        e.set(false);
                        Label_0107: {
                            Block_9: {
                            Block_7:
                                while (true) {
                                Label_0137:
                                    while (true) {
                                    Block_8_Outer:
                                        while (true) {
                                            while (true) {
                                            Label_0174:
                                                while (true) {
                                                    e.set(false);
                                                    return;
                                                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", t2);
                                                    break Label_0174;
                                                    iftrue(Label_0107:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                                    break Block_9;
                                                    System.exit(1);
                                                    continue Block_11_Outer;
                                                }
                                                iftrue(Label_0189:)(c == null);
                                                break Label_0137;
                                                Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", (Throwable)null);
                                                continue Label_0137;
                                                iftrue(Label_0119:)(c == null);
                                                continue Label_0137_Outer;
                                            }
                                            a = h3.c.a;
                                            iftrue(Label_0174:)(!a.b(6));
                                            continue Block_8_Outer;
                                        }
                                        iftrue(Label_0084:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                        break Block_7;
                                        Label_0189: {
                                            a.c("Completed exception processing, but no default exception handler.");
                                        }
                                        continue Label_0137;
                                    }
                                    a.c("Completed exception processing. Invoking default exception handler.");
                                    break Label_0107;
                                    Label_0119: {
                                        iftrue(Label_0137:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                                    }
                                    continue;
                                }
                                Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", (Throwable)null);
                                continue Label_0141_Outer;
                            }
                            Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (Throwable)null);
                        }
                        c.uncaughtException(thread, t);
                    }
                }
                break;
            }
        }
        catch (final Exception ex) {}
    }
}

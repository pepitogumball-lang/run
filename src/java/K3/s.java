package k3;

import java.io.File;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import android.util.Log;
import X2.f;
import X4.C;
import g3.a;
import q3.c;
import f2.d;
import h1.m;
import android.content.Context;

public final class s
{
    public final Context a;
    public final v b;
    public final m c;
    public final long d;
    public d e;
    public d f;
    public boolean g;
    public k3.m h;
    public final z i;
    public final c j;
    public final a k;
    public final a l;
    public final j m;
    public final h3.a n;
    public final C o;
    public final l3.c p;
    
    public s(final f f, final z i, final h3.a n, final v b, final a k, final a l, final c j, final j m, final C o, final l3.c p10) {
        this.b = b;
        f.a();
        this.a = f.a;
        this.i = i;
        this.n = n;
        this.k = k;
        this.l = l;
        this.j = j;
        this.m = m;
        this.o = o;
        this.p = p10;
        this.d = System.currentTimeMillis();
        this.c = new m(8);
    }
    
    public final void a(final C2.z z) {
        l3.c.a();
        l3.c.a();
        this.e.e();
        Label_0031: {
            if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                break Label_0031;
            }
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", (Throwable)null);
            Label_0103: {
                try {
                    try {
                        this.k.e(new r(this));
                        this.h.h();
                        if (!z.f().b.a) {
                            break Label_0103;
                        }
                        if (!this.h.d(z)) {
                            Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", (Throwable)null);
                        }
                        break Label_0103;
                    }
                    finally {}
                }
                catch (final Exception ex) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", (Throwable)ex);
                    while (true) {
                        this.c();
                        return;
                        iftrue(Label_0153:)(!Log.isLoggable("FirebaseCrashlytics", 3));
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", (Throwable)null);
                        throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                        final C2.z z2;
                        this.h.j(((O2.j)((AtomicReference)z2.i).get()).a);
                        continue;
                    }
                    Label_0153: {
                        throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                    }
                }
            }
        }
        return;
        this.c();
    }
    
    public final void b(final C2.z z) {
        final Future submit = this.p.a.C.submit((Runnable)new n(this, z, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", (Throwable)null);
        }
        Label_0096: {
            Label_0084: {
                try {
                    submit.get(3L, TimeUnit.SECONDS);
                    return;
                }
                catch (final TimeoutException ex) {}
                catch (final ExecutionException ex2) {
                    break Label_0084;
                }
                catch (final InterruptedException ex3) {
                    break Label_0096;
                }
                final TimeoutException ex;
                Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", (Throwable)ex);
                return;
            }
            final ExecutionException ex2;
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", (Throwable)ex2);
            return;
        }
        final InterruptedException ex3;
        Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", (Throwable)ex3);
        Thread.currentThread().interrupt();
    }
    
    public final void c() {
        l3.c.a();
        try {
            final d e = this.e;
            final String s = (String)e.E;
            final c c = (c)e.D;
            c.getClass();
            if (!new File((File)c.F, s).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", (Throwable)null);
            }
        }
        catch (final Exception ex) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", (Throwable)ex);
        }
    }
}

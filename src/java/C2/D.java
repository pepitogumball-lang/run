package c2;

import java.util.concurrent.FutureTask;
import android.content.Context;
import java.util.Iterator;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import v.e;
import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;
import j0.a;
import java.util.concurrent.Executor;
import i0.b;

public final class d
{
    public b a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Executor f;
    public volatile a g;
    public volatile a h;
    public final Semaphore i;
    public final Set j;
    
    public d(final SignInHubActivity signInHubActivity, final Set j) {
        this.b = false;
        this.c = false;
        this.d = true;
        this.e = false;
        ((Context)signInHubActivity).getApplicationContext();
        this.i = new Semaphore(0);
        this.j = j;
    }
    
    public final void a() {
        if (this.g != null) {
            final boolean b = this.b;
            if (!b) {
                if (b) {
                    this.c();
                }
                else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.g.getClass();
                this.g = null;
            }
            else {
                this.g.getClass();
                final a g = this.g;
                g.E.set(true);
                if (((FutureTask)g.C).cancel(false)) {
                    this.h = this.g;
                }
                this.g = null;
            }
        }
    }
    
    public final void b() {
        if (this.h == null && this.g != null) {
            this.g.getClass();
            if (this.f == null) {
                this.f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            final a g = this.g;
            final Executor f = this.f;
            if (g.D != 1) {
                final int d = v.e.d(g.D);
                if (d == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                if (d != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            else {
                g.D = 2;
                f.execute((Runnable)g.C);
            }
        }
    }
    
    public final void c() {
        this.a();
        this.g = new a(this);
        this.b();
    }
    
    public final void d() {
        final Iterator iterator = this.j.iterator();
        if (!iterator.hasNext()) {
            try {
                this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            }
            catch (final InterruptedException ex) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", (Throwable)ex);
                Thread.currentThread().interrupt();
            }
            return;
        }
        iterator.next().getClass();
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        final Class<? extends d> class1 = this.getClass();
        sb.append(class1.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)class1)));
        sb.append(" id=0}");
        return sb.toString();
    }
}

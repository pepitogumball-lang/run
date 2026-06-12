package u0;

import android.database.Cursor;
import y0.c;
import k3.v;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import z0.b;

public abstract class l
{
    public volatile b a;
    public Executor b;
    public y0.b c;
    public final f d;
    public boolean e;
    public boolean f;
    public ArrayList g;
    public final ReentrantReadWriteLock h;
    public final ThreadLocal i;
    
    public l() {
        this.h = new ReentrantReadWriteLock();
        this.i = new ThreadLocal();
        new ConcurrentHashMap();
        this.d = this.d();
    }
    
    public final void a() {
        if (this.e) {
            return;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
    
    public final void b() {
        if (!((SQLiteDatabase)this.c.e().D).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
    
    public final void c() {
        this.a();
        final b e = this.c.e();
        this.d.c(e);
        e.a();
    }
    
    public abstract f d();
    
    public abstract y0.b e(final v p0);
    
    public final void f() {
        this.c.e().g();
        if (!((SQLiteDatabase)this.c.e().D).inTransaction()) {
            final f d = this.d;
            if (d.d.compareAndSet(false, true)) {
                ((l)d.c).b.execute((Runnable)d.i);
            }
        }
    }
    
    public final Cursor g(final c c) {
        this.a();
        this.b();
        return this.c.e().j(c);
    }
    
    public final void h() {
        this.c.e().k();
    }
}

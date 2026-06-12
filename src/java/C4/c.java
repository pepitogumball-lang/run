package c4;

import O2.h;
import L3.g;
import L3.j;
import android.util.Log;
import java.util.concurrent.Callable;
import n3.u0;
import G0.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import O2.e;
import O2.f;
import O2.l;
import java.util.concurrent.TimeUnit;
import O2.i;
import O2.t;
import java.util.concurrent.Executor;
import p.a;
import java.util.HashMap;

public final class c
{
    public static final HashMap d;
    public static final a e;
    public final Executor a;
    public final p b;
    public t c;
    
    static {
        d = new HashMap();
        e = new a(1);
    }
    
    public c(final Executor a, final p b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public static Object a(final i i, final TimeUnit timeUnit) {
        final l l = new l(1);
        final a e = c.e;
        i.d((Executor)e, (f)l);
        i.c((Executor)e, (e)l);
        i.a((Executor)e, (O2.c)l);
        if (!l.D.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (i.j()) {
            return i.g();
        }
        throw new ExecutionException((Throwable)i.f());
    }
    
    public final i b() {
        monitorenter(this);
        Label_0038: {
            try {
                final t c = this.c;
                if (c != null && (!c.i() || this.c.j())) {
                    break Label_0038;
                }
                break Label_0038;
            }
            finally {
                monitorexit(this);
                this.c = u0.f(this.a, (Callable)new k((Object)this.b, 4));
                final t c2 = this.c;
                monitorexit(this);
                return (i)c2;
            }
        }
    }
    
    public final c4.e c() {
        monitorenter(this);
        Label_0040: {
            try {
                Object c = this.c;
                if (c != null && ((t)c).j()) {
                    c = this.c.g();
                    monitorexit(this);
                    return (c4.e)c;
                }
                break Label_0040;
            }
            finally {
                monitorexit(this);
                Object c = null;
                return (c4.e)c;
                while (true) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", (Throwable)c);
                    c = null;
                    return (c4.e)c;
                    monitorexit(this);
                    try {
                        c = a(this.b(), TimeUnit.SECONDS);
                        return (c4.e)c;
                    }
                    catch (final TimeoutException c) {}
                    catch (final ExecutionException c) {}
                    catch (final InterruptedException ex) {}
                    continue;
                }
            }
        }
    }
    
    public final t d(final c4.e e) {
        final j j = new j((Object)this, 2, (Object)e);
        final Executor a = this.a;
        return u0.f(a, (Callable)j).n(a, (h)new g((Object)this, 7, (Object)e));
    }
}
